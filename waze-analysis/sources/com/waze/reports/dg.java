package com.waze.reports;

import android.content.DialogInterface;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class dg implements com.waze.sharedui.g.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int[] f33835a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ DialogInterface.OnClickListener f33836b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.waze.sharedui.g.i f33837c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ di f33838d;

    dg(di diVar, int[] iArr, DialogInterface.OnClickListener onClickListener, com.waze.sharedui.g.i iVar) {
        this.f33835a = iArr;
        this.f33836b = onClickListener;
        this.f33837c = iVar;
        Objects.requireNonNull(diVar);
        this.f33838d = diVar;
    }

    @Override // com.waze.sharedui.g.b
    public final void a(int i2) {
        this.f33836b.onClick(this.f33837c, i2);
    }

    @Override // com.waze.sharedui.g.b
    public final int b() {
        int length = this.f33835a.length;
        return 6;
    }

    @Override // com.waze.sharedui.g.b
    public final void c(int i2, com.waze.sharedui.g.e eVar) {
        eVar.c(this.f33838d.f33841a.c(this.f33835a[i2], new Object[0]));
    }
}
