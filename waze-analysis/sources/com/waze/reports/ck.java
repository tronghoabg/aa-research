package com.waze.reports;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ck implements com.waze.sharedui.g.q {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f33779a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ cm f33780b;

    ck(cm cmVar, int i2) {
        this.f33779a = i2;
        Objects.requireNonNull(cmVar);
        this.f33780b = cmVar;
    }

    @Override // com.waze.sharedui.g.q
    public final void a(com.waze.sharedui.g.s sVar) {
        cm cmVar = this.f33780b;
        cmVar.f33782b.dismiss();
        cmVar.f33782b = null;
        cmVar.f33789i.b(this.f33779a, sVar.f39006a);
    }
}
