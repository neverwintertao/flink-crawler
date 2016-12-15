package com.scaleunlimited.flinkcrawler.pojos;

import java.net.MalformedURLException;
import java.net.URL;

import crawlercommons.url.PaidLevelDomain;


@SuppressWarnings("serial")
public class ExtractedUrl extends BaseUrl {

    private String _pld;
    private String _anchorText;
    private String _relAttributes;
    // TODO does an outlink get an estimated score to begin with ?

    public ExtractedUrl(String url, String anchorText, String relAttributes) throws MalformedURLException {
    	super(url);
    	
        _anchorText = anchorText;
        _relAttributes = relAttributes;
        
		_pld = PaidLevelDomain.getPLD(new URL(url));
    }
    
	@Override
	public String getPartitionKey() {
		return _pld;
	}

    public String getAnchorText() {
        return _anchorText;
    }

    public void setAnchorText(String anchorText) {
        _anchorText = anchorText;
    }

    public String getRelAttributes() {
        return _relAttributes;
    }

    public void setRelAttributes(String relAttributes) {
        _relAttributes = relAttributes;
    }

    @Override
    public String toString() {
        // TODO add more fields
        return _url;
    }
}
