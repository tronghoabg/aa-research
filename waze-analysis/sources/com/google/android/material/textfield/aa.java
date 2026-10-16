package com.google.android.material.textfield;

import android.support.v7.widget.gc;
import android.util.SparseArray;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class aa {

    /* renamed from: a, reason: collision with root package name */
    private final SparseArray f6809a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    private final ab f6810b;

    /* renamed from: c, reason: collision with root package name */
    private final int f6811c;

    /* renamed from: d, reason: collision with root package name */
    private final int f6812d;

    aa(ab abVar, gc gcVar) {
        this.f6810b = abVar;
        int[] iArr = al.f6863a;
        this.f6811c = gcVar.f(28, 0);
        this.f6812d = gcVar.f(53, 0);
    }

    final ac b(int i2) {
        SparseArray sparseArray = this.f6809a;
        ac iVar = (ac) sparseArray.get(i2);
        if (iVar == null) {
            if (i2 == -1) {
                iVar = new i(this.f6810b);
            } else if (i2 == 0) {
                iVar = new ac(this.f6810b);
            } else if (i2 == 1) {
                iVar = new ak(this.f6810b, this.f6812d);
            } else if (i2 == 2) {
                iVar = new h(this.f6810b);
            } else {
                if (i2 != 3) {
                    throw new IllegalArgumentException("Invalid end icon mode: " + i2);
                }
                iVar = new u(this.f6810b);
            }
            sparseArray.append(i2, iVar);
        }
        return iVar;
    }
}
