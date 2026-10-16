package com.waze.navigate;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class Product {
    public String currency;
    public String[] formats;
    public String[] labels;
    public int lastUpdated;
    public String name;
    public float[] prices;
    public String providerId;
    public String updatedBy;
    public String venueId;

    public Product(String str, String str2, String str3, String[] strArr, String[] strArr2, float[] fArr, int i2, String str4, String str5) {
        this.providerId = str;
        this.venueId = str2;
        this.name = str3;
        this.labels = strArr;
        this.formats = strArr2;
        this.prices = fArr;
        this.lastUpdated = i2;
        this.updatedBy = str4;
        this.currency = str5;
    }
}
