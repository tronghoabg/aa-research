package com.bytedance.sdk.openadsdk;

/* loaded from: classes3.dex */
public class TTImage {
    private double moa;

    /* renamed from: oa, reason: collision with root package name */
    private final int f25136oa;
    private final int uef;
    private final String yo;

    public TTImage(int i5, int i10, String str, double d3) {
        this.uef = i5;
        this.f25136oa = i10;
        this.yo = str;
        this.moa = d3;
    }

    public double getDuration() {
        return this.moa;
    }

    public int getHeight() {
        return this.uef;
    }

    public String getImageUrl() {
        return this.yo;
    }

    public int getWidth() {
        return this.f25136oa;
    }

    public boolean isValid() {
        String str;
        return this.uef > 0 && this.f25136oa > 0 && (str = this.yo) != null && str.length() > 0;
    }

    public TTImage(int i5, int i10, String str) {
        this(i5, i10, str, 0.0d);
    }
}
