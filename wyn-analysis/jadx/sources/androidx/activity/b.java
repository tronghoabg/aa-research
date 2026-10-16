package androidx.activity;

import Va.M6;
import android.window.BackEvent;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final float f17697a;

    /* renamed from: b, reason: collision with root package name */
    public final float f17698b;

    /* renamed from: c, reason: collision with root package name */
    public final float f17699c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17700d;

    public b(BackEvent backEvent) {
        a aVar = a.f17696a;
        float fD = aVar.d(backEvent);
        float fE = aVar.e(backEvent);
        float fB = aVar.b(backEvent);
        int iC = aVar.c(backEvent);
        this.f17697a = fD;
        this.f17698b = fE;
        this.f17699c = fB;
        this.f17700d = iC;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BackEventCompat{touchX=");
        sb2.append(this.f17697a);
        sb2.append(", touchY=");
        sb2.append(this.f17698b);
        sb2.append(", progress=");
        sb2.append(this.f17699c);
        sb2.append(", swipeEdge=");
        return M6.r(sb2, this.f17700d, '}');
    }
}
