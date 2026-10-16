package com.waze.map;

import androidx.core.app.NotificationCompat;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.waze.navigate.AddressItem;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bj extends bl {

    /* renamed from: a, reason: collision with root package name */
    public final String f28401a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28402b;

    /* renamed from: c, reason: collision with root package name */
    public final String f28403c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f28404d;

    /* renamed from: e, reason: collision with root package name */
    public final com.waze.shared_infra.h.c f28405e;

    /* renamed from: f, reason: collision with root package name */
    public final String f28406f;

    /* renamed from: g, reason: collision with root package name */
    public final String f28407g;

    /* renamed from: h, reason: collision with root package name */
    public final AddressItem f28408h;

    /* renamed from: i, reason: collision with root package name */
    public final AddressItem f28409i;

    /* renamed from: j, reason: collision with root package name */
    public final int f28410j;

    /* renamed from: k, reason: collision with root package name */
    public final int f28411k;

    /* renamed from: l, reason: collision with root package name */
    public final bi f28412l;
    private final gu m;

    public bj(String str, String str2, String str3, boolean z, gu guVar, com.waze.shared_infra.h.c cVar, String str4, String str5, AddressItem addressItem, AddressItem addressItem2, int i2, int i3, bi biVar) {
        h.g.b.x.f(str2, NotificationCompat.CATEGORY_MESSAGE);
        h.g.b.x.f(guVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        h.g.b.x.f(cVar, "coordinate");
        h.g.b.x.f(addressItem, "addressItem");
        h.g.b.x.f(biVar, "style");
        this.f28401a = str;
        this.f28402b = str2;
        this.f28403c = str3;
        this.f28404d = z;
        this.m = guVar;
        this.f28405e = cVar;
        this.f28406f = str4;
        this.f28407g = str5;
        this.f28408h = addressItem;
        this.f28409i = addressItem2;
        this.f28410j = i2;
        this.f28411k = i3;
        this.f28412l = biVar;
    }

    @Override // com.waze.map.bl
    public final gu a() {
        return this.m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bj)) {
            return false;
        }
        bj bjVar = (bj) obj;
        return h.g.b.x.n(this.f28401a, bjVar.f28401a) && h.g.b.x.n(this.f28402b, bjVar.f28402b) && h.g.b.x.n(this.f28403c, bjVar.f28403c) && this.f28404d == bjVar.f28404d && this.m == bjVar.m && h.g.b.x.n(this.f28405e, bjVar.f28405e) && h.g.b.x.n(this.f28406f, bjVar.f28406f) && h.g.b.x.n(this.f28407g, bjVar.f28407g) && h.g.b.x.n(this.f28408h, bjVar.f28408h) && h.g.b.x.n(this.f28409i, bjVar.f28409i) && this.f28410j == bjVar.f28410j && this.f28411k == bjVar.f28411k && this.f28412l == bjVar.f28412l;
    }

    public final int hashCode() {
        String str = this.f28401a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) * 31) + this.f28402b.hashCode();
        String str2 = this.f28403c;
        int iHashCode2 = ((((((((iHashCode * 31) + (str2 == null ? 0 : str2.hashCode())) * 31) + a.a.a(this.f28404d)) * 31) + this.m.hashCode()) * 31) + this.f28405e.hashCode()) * 31;
        String str3 = this.f28406f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f28407g;
        int iHashCode4 = (((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.f28408h.hashCode()) * 31;
        AddressItem addressItem = this.f28409i;
        return ((((((iHashCode4 + (addressItem != null ? addressItem.hashCode() : 0)) * 31) + this.f28410j) * 31) + this.f28411k) * 31) + this.f28412l.hashCode();
    }

    public final String toString() {
        return "Details(title=" + this.f28401a + ", msg=" + this.f28402b + ", info=" + this.f28403c + ", loader=" + this.f28404d + ", type=" + this.m + ", coordinate=" + this.f28405e + ", poiInfoUrl=" + this.f28406f + ", previewIcon=" + this.f28407g + ", addressItem=" + this.f28408h + ", addressItemOriginal=" + this.f28409i + ", walkingDistanceMeters=" + this.f28410j + ", timeoutSeconds=" + this.f28411k + ", style=" + this.f28412l + ")";
    }
}
