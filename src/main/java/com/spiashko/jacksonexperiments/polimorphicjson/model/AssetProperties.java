package com.spiashko.jacksonexperiments.polimorphicjson.model;

public interface AssetProperties {
    String getSource();
    AssetProperties setSource(String source);
    String getProxy();
    AssetProperties setProxy(String proxy);
}