package com.waze.navigate;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class NavigateTollPriceInformation {
    public String actionUrl;
    public String passBasedMissingPassName;
    public double passBasedPriceChangeToPrice;
    public String passBasedUserPassName;
    public int popupId;
    public int timeBasedPriceChangeAtSeconds;
    public double timeBasedPriceChangeToPrice;
    public String tollCurrencyCode;
    public double tollPrice;
    public String tollRoadName;

    public NavigateTollPriceInformation copy() {
        NavigateTollPriceInformation navigateTollPriceInformation = new NavigateTollPriceInformation();
        navigateTollPriceInformation.tollPrice = this.tollPrice;
        navigateTollPriceInformation.tollCurrencyCode = this.tollCurrencyCode;
        navigateTollPriceInformation.popupId = this.popupId;
        navigateTollPriceInformation.actionUrl = this.actionUrl;
        navigateTollPriceInformation.passBasedMissingPassName = this.passBasedMissingPassName;
        navigateTollPriceInformation.passBasedPriceChangeToPrice = this.passBasedPriceChangeToPrice;
        navigateTollPriceInformation.passBasedUserPassName = this.passBasedUserPassName;
        navigateTollPriceInformation.tollRoadName = this.tollRoadName;
        navigateTollPriceInformation.timeBasedPriceChangeToPrice = this.timeBasedPriceChangeToPrice;
        navigateTollPriceInformation.timeBasedPriceChangeAtSeconds = this.timeBasedPriceChangeAtSeconds;
        return navigateTollPriceInformation;
    }
}
