package com.google.android.material.datepicker;

import android.support.v7.widget.fb;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class r extends av {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f6486a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ z f6487b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(z zVar, int i2, int i3) {
        super(i2);
        this.f6486a = i3;
        Objects.requireNonNull(zVar);
        this.f6487b = zVar;
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    protected final void U(fb fbVar, int[] iArr) {
        int i2 = this.f6486a;
        z zVar = this.f6487b;
        if (i2 == 0) {
            iArr[0] = zVar.f6503h.getWidth();
            iArr[1] = zVar.f6503h.getWidth();
        } else {
            iArr[0] = zVar.f6503h.getHeight();
            iArr[1] = zVar.f6503h.getHeight();
        }
    }
}
