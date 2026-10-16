package com.applovin.mediation.nativeAds.adPlacer;

import Va.M6;
import com.applovin.impl.sdk.o;
import java.util.Set;
import java.util.TreeSet;

/* loaded from: classes.dex */
public class MaxAdPlacerSettings {
    public static final int MIN_REPEATING_INTERVAL = 2;

    /* renamed from: a, reason: collision with root package name */
    private final String f24133a;

    /* renamed from: b, reason: collision with root package name */
    private String f24134b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f24135c = new TreeSet();

    /* renamed from: d, reason: collision with root package name */
    private int f24136d = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f24137e = 256;

    /* renamed from: f, reason: collision with root package name */
    private int f24138f = 4;

    public MaxAdPlacerSettings(String str) {
        this.f24133a = str;
    }

    public void addFixedPosition(int i5) {
        this.f24135c.add(Integer.valueOf(i5));
    }

    public String getAdUnitId() {
        return this.f24133a;
    }

    public Set<Integer> getFixedPositions() {
        return this.f24135c;
    }

    public int getMaxAdCount() {
        return this.f24137e;
    }

    public int getMaxPreloadedAdCount() {
        return this.f24138f;
    }

    public String getPlacement() {
        return this.f24134b;
    }

    public int getRepeatingInterval() {
        return this.f24136d;
    }

    public boolean hasValidPositioning() {
        return !this.f24135c.isEmpty() || isRepeatingEnabled();
    }

    public boolean isRepeatingEnabled() {
        return this.f24136d >= 2;
    }

    public void resetFixedPositions() {
        this.f24135c.clear();
    }

    public void setMaxAdCount(int i5) {
        this.f24137e = i5;
    }

    public void setMaxPreloadedAdCount(int i5) {
        this.f24138f = i5;
    }

    public void setPlacement(String str) {
        this.f24134b = str;
    }

    public void setRepeatingInterval(int i5) {
        if (i5 >= 2) {
            this.f24136d = i5;
            o.g("MaxAdPlacerSettings", "Repeating interval set to " + i5);
            return;
        }
        this.f24136d = 0;
        o.j("MaxAdPlacerSettings", "Repeating interval has been disabled, since it has been set to " + i5 + ", which is less than minimum value of 2");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MaxAdPlacerSettings{adUnitId='");
        sb2.append(this.f24133a);
        sb2.append("', fixedPositions=");
        sb2.append(this.f24135c);
        sb2.append(", repeatingInterval=");
        sb2.append(this.f24136d);
        sb2.append(", maxAdCount=");
        sb2.append(this.f24137e);
        sb2.append(", maxPreloadedAdCount=");
        return M6.r(sb2, this.f24138f, '}');
    }
}
