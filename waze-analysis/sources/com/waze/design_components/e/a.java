package com.waze.design_components.e;

import android.graphics.drawable.Drawable;
import com.waze.gas.GasNativeManager;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f23449a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23450b;

    /* renamed from: c, reason: collision with root package name */
    private final Drawable f23451c;

    /* renamed from: d, reason: collision with root package name */
    private final Drawable f23452d;

    /* renamed from: e, reason: collision with root package name */
    private final int f23453e;

    /* renamed from: f, reason: collision with root package name */
    private final Integer f23454f;

    /* renamed from: g, reason: collision with root package name */
    private final int f23455g;

    public a(String str, String str2, Drawable drawable, Drawable drawable2, int i2, Integer num, int i3) {
        x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        this.f23449a = str;
        this.f23450b = str2;
        this.f23451c = drawable;
        this.f23452d = drawable2;
        this.f23453e = i2;
        this.f23454f = num;
        this.f23455g = i3;
    }

    public final int a() {
        return this.f23455g;
    }

    public final int b() {
        return this.f23453e;
    }

    public final Drawable c() {
        return this.f23451c;
    }

    public final Drawable d() {
        return this.f23452d;
    }

    public final Integer e() {
        return this.f23454f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return x.n(this.f23449a, aVar.f23449a) && x.n(this.f23450b, aVar.f23450b) && x.n(this.f23451c, aVar.f23451c) && x.n(this.f23452d, aVar.f23452d) && this.f23453e == aVar.f23453e && x.n(this.f23454f, aVar.f23454f) && this.f23455g == aVar.f23455g;
    }

    public final String f() {
        return this.f23450b;
    }

    public final String g() {
        return this.f23449a;
    }

    public final int hashCode() {
        int iHashCode = this.f23449a.hashCode() * 31;
        String str = this.f23450b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Drawable drawable = this.f23451c;
        int iHashCode3 = (iHashCode2 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Drawable drawable2 = this.f23452d;
        int iHashCode4 = (((iHashCode3 + (drawable2 == null ? 0 : drawable2.hashCode())) * 31) + this.f23453e) * 31;
        Integer num = this.f23454f;
        return ((iHashCode4 + (num != null ? num.hashCode() : 0)) * 31) + this.f23455g;
    }

    public final String toString() {
        return "LabelData(title=" + this.f23449a + ", subTitle=" + this.f23450b + ", image=" + this.f23451c + ", secondaryImage=" + this.f23452d + ", titleColor=" + this.f23453e + ", subTitleColor=" + this.f23454f + ", backgroundColor=" + this.f23455g + ")";
    }
}
