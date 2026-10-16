package com.waze.car_lib.p;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.gas.GasNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ab {

    /* renamed from: a, reason: collision with root package name */
    private final String f20530a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20531b;

    /* renamed from: c, reason: collision with root package name */
    private final int f20532c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f20533d;

    public ab(String str, String str2, int i2, boolean z) {
        h.g.b.x.f(str, TtmlNode.ATTR_ID);
        h.g.b.x.f(str2, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        this.f20530a = str;
        this.f20531b = str2;
        this.f20532c = i2;
        this.f20533d = z;
    }

    public final int a() {
        return this.f20532c;
    }

    public final String b() {
        return this.f20530a;
    }

    public final String c() {
        return this.f20531b;
    }

    public final boolean d() {
        return this.f20533d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab)) {
            return false;
        }
        ab abVar = (ab) obj;
        return h.g.b.x.n(this.f20530a, abVar.f20530a) && h.g.b.x.n(this.f20531b, abVar.f20531b) && this.f20532c == abVar.f20532c && this.f20533d == abVar.f20533d;
    }

    public final int hashCode() {
        return (((((this.f20530a.hashCode() * 31) + this.f20531b.hashCode()) * 31) + this.f20532c) * 31) + a.a.a(this.f20533d);
    }

    public final String toString() {
        return "MapToggleItem(id=" + this.f20530a + ", title=" + this.f20531b + ", iconResId=" + this.f20532c + ", isChecked=" + this.f20533d + ")";
    }
}
