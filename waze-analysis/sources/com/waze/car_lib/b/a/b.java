package com.waze.car_lib.b.a;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.gas.GasNativeManager;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f18933a;

    /* renamed from: b, reason: collision with root package name */
    private final String f18934b;

    /* renamed from: c, reason: collision with root package name */
    private final String f18935c;

    /* renamed from: d, reason: collision with root package name */
    private final int f18936d;

    public b(String str, String str2, String str3, int i2) {
        x.f(str, TtmlNode.ATTR_ID);
        x.f(str2, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        this.f18933a = str;
        this.f18934b = str2;
        this.f18935c = str3;
        this.f18936d = i2;
    }

    public final int a() {
        return this.f18936d;
    }

    public final String b() {
        return this.f18933a;
    }

    public final String c() {
        return this.f18935c;
    }

    public final String d() {
        return this.f18934b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return x.n(this.f18933a, bVar.f18933a) && x.n(this.f18934b, bVar.f18934b) && x.n(this.f18935c, bVar.f18935c) && this.f18936d == bVar.f18936d;
    }

    public final int hashCode() {
        int iHashCode = (this.f18933a.hashCode() * 31) + this.f18934b.hashCode();
        String str = this.f18935c;
        return (((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.f18936d;
    }

    public final String toString() {
        return "ReportUiItem(id=" + this.f18933a + ", title=" + this.f18934b + ", subtitle=" + this.f18935c + ", iconResId=" + this.f18936d + ")";
    }

    public /* synthetic */ b(String str, String str2, int i2) {
        this(str, str2, null, i2);
    }
}
