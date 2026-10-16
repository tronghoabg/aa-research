package com.google.android.gms.ads;

import H6.f;
import H6.l;
import N0.a;
import android.content.Context;
import com.vungle.ads.internal.protos.Sdk;
import ka.AbstractC3256n;

/* loaded from: classes3.dex */
public final class AdSize {

    /* renamed from: i, reason: collision with root package name */
    public static final AdSize f26288i = new AdSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50, "320x50_mb");

    /* renamed from: j, reason: collision with root package name */
    public static final AdSize f26289j;
    public static final AdSize k;

    /* renamed from: l, reason: collision with root package name */
    public static final AdSize f26290l;

    /* renamed from: m, reason: collision with root package name */
    public static final AdSize f26291m;

    /* renamed from: n, reason: collision with root package name */
    public static final AdSize f26292n;

    /* renamed from: a, reason: collision with root package name */
    public final int f26293a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26294b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26295c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f26296d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f26297e;

    /* renamed from: f, reason: collision with root package name */
    public int f26298f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f26299g;

    /* renamed from: h, reason: collision with root package name */
    public int f26300h;

    static {
        new AdSize(468, 60, "468x60_as");
        new AdSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 100, "320x100_as");
        f26289j = new AdSize(728, 90, "728x90_as");
        k = new AdSize(300, 250, "300x250_as");
        new AdSize(160, 600, "160x600_as");
        f26290l = new AdSize(-1, -2, "smart_banner");
        f26291m = new AdSize(-3, -4, "fluid");
        f26292n = new AdSize(0, 0, "invalid");
        new AdSize(50, 50, "50x50_mb");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AdSize(int i5, int i10) {
        String strValueOf = i5 == -1 ? "FULL" : String.valueOf(i5);
        String strValueOf2 = i10 == -2 ? "AUTO" : String.valueOf(i10);
        this(i5, i10, AbstractC3256n.h(new StringBuilder(String.valueOf(strValueOf2).length() + String.valueOf(strValueOf).length() + 1 + 3), strValueOf, "x", strValueOf2, "_as"));
    }

    public static AdSize a(Context context, int i5) {
        AdSize adSizeK = f.k(context, i5, 0);
        adSizeK.f26296d = true;
        return adSizeK;
    }

    public static AdSize b(Context context, int i5) {
        int iP = f.p(context, 0);
        if (iP == -1) {
            return f26292n;
        }
        AdSize adSize = new AdSize(i5, 0);
        adSize.f26298f = iP;
        adSize.f26297e = true;
        return adSize;
    }

    public static int c() {
        throw null;
    }

    public static AdSize d(int i5, int i10) {
        AdSize adSize = new AdSize(i5, 0);
        adSize.f26298f = i10;
        adSize.f26297e = true;
        if (i10 < 32) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 118);
            sb2.append("The maximum height set for the inline adaptive ad size was ");
            sb2.append(i10);
            sb2.append(" dp, which is below the minimum recommended value of 32 dp.");
            l.f(sb2.toString());
        }
        return adSize;
    }

    public static int e() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdSize)) {
            return false;
        }
        AdSize adSize = (AdSize) obj;
        return this.f26293a == adSize.f26293a && this.f26294b == adSize.f26294b && this.f26295c.equals(adSize.f26295c);
    }

    public final int hashCode() {
        return this.f26295c.hashCode();
    }

    public final String toString() {
        return this.f26295c;
    }

    public AdSize(int i5, int i10, String str) {
        if (i5 < 0 && i5 != -1 && i5 != -3) {
            throw new IllegalArgumentException(a.d(i5, "Invalid width for AdSize: ", new StringBuilder(String.valueOf(i5).length() + 26)));
        }
        if (i10 < 0 && i10 != -2 && i10 != -4) {
            throw new IllegalArgumentException(a.d(i10, "Invalid height for AdSize: ", new StringBuilder(String.valueOf(i10).length() + 27)));
        }
        this.f26293a = i5;
        this.f26294b = i10;
        this.f26295c = str;
    }
}
