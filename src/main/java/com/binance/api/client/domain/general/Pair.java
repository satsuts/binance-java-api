package com.binance.api.client.domain.general;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Pair {
    @JsonProperty("id")
    private String id;

    @JsonProperty("base")
    private String base;

    @JsonProperty("quote")
    private String quote;

    @JsonProperty("isMarginTrade")
    private boolean isMarginTrade;

    @JsonProperty("isBuyAllowed")
    private boolean isBuyAllowed;

    @JsonProperty("isSellAllowed")
    private boolean isSellAllowed;

    public String getId() {
        return id;
    }

    public String getBase() {
        return base;
    }

    public String getQuote() {
        return quote;
    }

    public boolean getIsMarginTrade() {
        return isMarginTrade;
    }

    public boolean getIsBuyAllowed() {
        return isBuyAllowed;
    }

    public boolean getIsSellAllowed() {
        return isSellAllowed;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
                .append("id", id)
                .append("base", base)
                .append("quote", quote)
                .append("isMarginTrade", isMarginTrade)
                .append("isBuyAllowed", isBuyAllowed)
                .append("isSellAllowed", isSellAllowed)
                .toString();
    }
}
