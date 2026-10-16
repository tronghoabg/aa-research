package com.google.d.d;

import java.io.Serializable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ez implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    final Object[] f7599a;

    /* renamed from: b, reason: collision with root package name */
    final int[] f7600b;

    ez(em emVar) {
        cf cfVar = (cf) emVar;
        int size = cfVar.c().size();
        this.f7599a = new Object[size];
        this.f7600b = new int[size];
        int i2 = 0;
        for (el elVar : cfVar.c()) {
            this.f7599a[i2] = elVar.b();
            this.f7600b[i2] = elVar.a();
            i2++;
        }
    }

    Object readResolve() {
        Object[] objArr = this.f7599a;
        cc ccVar = new cc(objArr.length);
        for (int i2 = 0; i2 < objArr.length; i2++) {
            ccVar.f(objArr[i2], this.f7600b[i2]);
        }
        return ccVar.a();
    }
}
