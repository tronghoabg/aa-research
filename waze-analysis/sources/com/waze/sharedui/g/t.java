package com.waze.sharedui.g;

import android.content.Context;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class t extends i implements b {

    /* renamed from: a, reason: collision with root package name */
    q f39012a;

    /* renamed from: b, reason: collision with root package name */
    private final s[] f39013b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f39014c;

    public t(Context context, String str, s[] sVarArr, q qVar) {
        super(context, str, f.GRID_SMALL, false);
        this.f39014c = false;
        super.k(this);
        this.f39012a = qVar;
        this.f39013b = sVarArr;
    }

    public void a(int i2) {
        q qVar;
        s[] sVarArr = this.f39013b;
        s sVar = sVarArr[i2];
        boolean z = sVar.f39011f;
        if (i2 >= sVarArr.length || (qVar = this.f39012a) == null) {
            return;
        }
        qVar.a(sVar);
        if (this.f39014c) {
            dismiss();
        }
    }

    @Override // com.waze.sharedui.g.b
    public final int b() {
        return this.f39013b.length;
    }

    @Override // com.waze.sharedui.g.b
    public final void c(int i2, e eVar) {
        s[] sVarArr = this.f39013b;
        s sVar = sVarArr[i2];
        eVar.d(sVar.f39007b, sVar.f39009d);
        eVar.b(sVarArr[i2].f39008c);
        s sVar2 = sVarArr[i2];
        boolean z = sVar2.f39011f;
        Integer num = sVar2.f39010e;
    }

    public final void q(q qVar) {
        this.f39012a = qVar;
    }

    public final void r() {
        this.f39014c = true;
    }

    public t(Context context, f fVar, String str, s[] sVarArr, q qVar, byte[] bArr) {
        super(context, str, fVar, true);
        this.f39014c = false;
        super.k(this);
        this.f39012a = qVar;
        this.f39013b = sVarArr;
    }

    public t(Context context, f fVar, String str, s[] sVarArr, q qVar) {
        super(context, str, fVar);
        this.f39014c = false;
        super.k(this);
        this.f39012a = qVar;
        this.f39013b = sVarArr;
    }
}
