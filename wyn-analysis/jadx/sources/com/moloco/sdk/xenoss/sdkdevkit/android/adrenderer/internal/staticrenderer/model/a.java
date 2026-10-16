package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model;

import Va.M6;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f30560a;

    /* renamed from: b, reason: collision with root package name */
    public final int f30561b;

    /* renamed from: c, reason: collision with root package name */
    public final int f30562c;

    /* renamed from: d, reason: collision with root package name */
    public final int f30563d;

    /* renamed from: e, reason: collision with root package name */
    public final int f30564e;

    /* renamed from: f, reason: collision with root package name */
    public final int f30565f;

    public a(int i5, int i10, int i11, int i12, int i13, int i14) {
        this.f30560a = i5;
        this.f30561b = i10;
        this.f30562c = i11;
        this.f30563d = i12;
        this.f30564e = i13;
        this.f30565f = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f30560a == aVar.f30560a && this.f30561b == aVar.f30561b && this.f30562c == aVar.f30562c && this.f30563d == aVar.f30563d && this.f30564e == aVar.f30564e && this.f30565f == aVar.f30565f;
    }

    public final int hashCode() {
        return (((((((((this.f30560a * 31) + this.f30561b) * 31) + this.f30562c) * 31) + this.f30563d) * 31) + this.f30564e) * 31) + this.f30565f;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdTouch(viewPositionX=");
        sb2.append(this.f30560a);
        sb2.append(", viewPositionY=");
        sb2.append(this.f30561b);
        sb2.append(", viewSizeHeight=");
        sb2.append(this.f30562c);
        sb2.append(", viewSizeWidth=");
        sb2.append(this.f30563d);
        sb2.append(", touchX=");
        sb2.append(this.f30564e);
        sb2.append(", touchY=");
        return M6.r(sb2, this.f30565f, ')');
    }
}
