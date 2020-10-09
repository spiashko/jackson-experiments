package com.spiashko.jacksonexperiments.polimorphicjson.model.asset;

public interface AssetProperties {
    String getSource();
    AssetProperties setSource(String source);
    String getProxy();
    AssetProperties setProxy(String proxy);
}