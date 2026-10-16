package com.waze.car_lib.p;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.gas.GasNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private final String f20826a;

    /* renamed from: b, reason: collision with root package name */
    private final int f20827b;

    /* renamed from: c, reason: collision with root package name */
    private final String f20828c;

    /* renamed from: d, reason: collision with root package name */
    private final String f20829d;

    public t(String str, int i2, String str2, String str3) {
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(str2, TtmlNode.ATTR_ID);
        this.f20826a = str;
        this.f20827b = i2;
        this.f20828c = str2;
        this.f20829d = str3;
    }

    public final int a() {
        return this.f20827b;
    }

    public final String b() {
        return this.f20828c;
    }

    public final String c() {
        return this.f20829d;
    }

    public final String d() {
        return this.f20826a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return h.g.b.x.n(this.f20826a, tVar.f20826a) && this.f20827b == tVar.f20827b && h.g.b.x.n(this.f20828c, tVar.f20828c) && h.g.b.x.n(this.f20829d, tVar.f20829d);
    }

    public final int hashCode() {
        int iHashCode = (((this.f20826a.hashCode() * 31) + this.f20827b) * 31) + this.f20828c.hashCode();
        String str = this.f20829d;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ListItem(title=" + this.f20826a + ", iconResId=" + this.f20827b + ", id=" + this.f20828c + ", text=" + this.f20829d + ")";
    }

    public /* synthetic */ t(String str, int i2, String str2, int i3) {
        this(str, i2, (i3 & 4) != 0 ? "" : str2, (String) null);
    }
}
