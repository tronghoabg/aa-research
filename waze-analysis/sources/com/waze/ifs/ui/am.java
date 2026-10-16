package com.waze.ifs.ui;

import android.support.v7.widget.ep;
import android.support.v7.widget.fa;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class am extends ep {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ fa f24515a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ at f24516b;

    am(at atVar, fa faVar) {
        this.f24515a = faVar;
        Objects.requireNonNull(atVar);
        this.f24516b = atVar;
    }

    @Override // android.support.v7.widget.ep
    public final boolean e(int i2, int i3) {
        at atVar = this.f24516b;
        int iM = atVar.f24533c.M() + ((atVar.f24533c.N() - atVar.f24533c.M()) / 2);
        int iMax = Math.max(Math.min(i2 / 5000, 2), -2);
        if (iM % atVar.b() == atVar.f24537g && iMax == 0) {
            iMax = Math.abs(i2) > 1000 ? i2 > 0 ? 1 : -1 : 0;
        }
        int iMax2 = Math.max(Math.min(iM + iMax, (atVar.b() * 10) - 1), 0);
        fa faVar = this.f24515a;
        faVar.h(iMax2);
        atVar.f24533c.bh(faVar);
        return true;
    }
}
