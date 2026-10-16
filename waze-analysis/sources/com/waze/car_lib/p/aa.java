package com.waze.car_lib.p;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.gas.GasNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class aa {

    /* renamed from: a, reason: collision with root package name */
    private final String f20526a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20527b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f20528c;

    /* renamed from: d, reason: collision with root package name */
    private final Boolean f20529d;

    public /* synthetic */ aa(String str, String str2, Integer num, Boolean bool, int i2) {
        h.g.b.x.f(str, TtmlNode.ATTR_ID);
        h.g.b.x.f(str2, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        this.f20526a = str;
        this.f20527b = str2;
        this.f20528c = (i2 & 4) != 0 ? null : num;
        this.f20529d = (i2 & 8) != 0 ? null : bool;
    }

    public final Boolean a() {
        return this.f20529d;
    }

    public final Integer b() {
        return this.f20528c;
    }

    public final String c() {
        return this.f20526a;
    }

    public final String d() {
        return this.f20527b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa)) {
            return false;
        }
        aa aaVar = (aa) obj;
        return h.g.b.x.n(this.f20526a, aaVar.f20526a) && h.g.b.x.n(this.f20527b, aaVar.f20527b) && h.g.b.x.n(this.f20528c, aaVar.f20528c) && h.g.b.x.n(this.f20529d, aaVar.f20529d);
    }

    public final int hashCode() {
        int iHashCode = (this.f20526a.hashCode() * 31) + this.f20527b.hashCode();
        Integer num = this.f20528c;
        int iHashCode2 = ((iHashCode * 31) + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.f20529d;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "MapSelectableItem(id=" + this.f20526a + ", title=" + this.f20527b + ", iconResId=" + this.f20528c + ", isBrowsable=" + this.f20529d + ")";
    }
}
