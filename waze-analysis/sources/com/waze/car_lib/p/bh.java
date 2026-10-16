package com.waze.car_lib.p;

import android.net.Uri;
import com.waze.gas.GasNativeManager;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bh {

    /* renamed from: a, reason: collision with root package name */
    private final Uri f20623a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20624b;

    /* renamed from: c, reason: collision with root package name */
    private final String f20625c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f20626d;

    /* renamed from: e, reason: collision with root package name */
    private final String f20627e;

    /* renamed from: f, reason: collision with root package name */
    private final String f20628f;

    public /* synthetic */ bh(Uri uri, String str, String str2) {
        h.g.b.x.f(uri, "qrUri");
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        this.f20623a = uri;
        this.f20624b = str;
        this.f20625c = str2;
        this.f20626d = true;
        this.f20627e = null;
        this.f20628f = null;
    }

    public final Uri a() {
        return this.f20623a;
    }

    public final String b() {
        return this.f20625c;
    }

    public final String c() {
        return this.f20624b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bh)) {
            return false;
        }
        bh bhVar = (bh) obj;
        if (!h.g.b.x.n(this.f20623a, bhVar.f20623a) || !h.g.b.x.n(this.f20624b, bhVar.f20624b) || !h.g.b.x.n(this.f20625c, bhVar.f20625c)) {
            return false;
        }
        boolean z = bhVar.f20626d;
        String str = bhVar.f20627e;
        if (!h.g.b.x.n(null, null)) {
            return false;
        }
        String str2 = bhVar.f20628f;
        return h.g.b.x.n(null, null);
    }

    public final int hashCode() {
        int iHashCode = (this.f20623a.hashCode() * 31) + this.f20624b.hashCode();
        String str = this.f20625c;
        return ((((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + DisplayStrings.DS_SEARCH_RESULTS_NO_RESULTS) * 961;
    }

    public final String toString() {
        return "UIState(qrUri=" + this.f20623a + ", title=" + this.f20624b + ", text=" + this.f20625c + ", shouldShowBackButton=true, firstActionTitle=null, secondActionTitle=null)";
    }
}
