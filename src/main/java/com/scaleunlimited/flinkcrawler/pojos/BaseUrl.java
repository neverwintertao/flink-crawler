package com.scaleunlimited.flinkcrawler.pojos;

import java.io.Serializable;
import java.net.MalformedURLException;

@SuppressWarnings("serial")
public abstract class BaseUrl implements Serializable {

    private String _url;

    public BaseUrl() {
    }

    public BaseUrl(BaseUrl base) {
        this(base.getUrl());
    }

    protected BaseUrl(String urlAsString) {
        _url = urlAsString;
    }

    public void setUrl(String url) throws MalformedURLException {
        _url = url;
    }

    public String getUrl() {
        return _url;
    }

    public void clear() {
        _url = null;
    }

    @Override
    public String toString() {
        return _url;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_url == null) ? 0 : _url.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BaseUrl other = (BaseUrl) obj;
        if (_url == null) {
            if (other._url != null)
                return false;
        } else if (!_url.equals(other._url))
            return false;
        return true;
    }

    public void setFrom(BaseUrl url) {
        _url = url._url;
    }
}
