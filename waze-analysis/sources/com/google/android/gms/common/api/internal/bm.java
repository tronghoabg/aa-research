package com.google.android.gms.common.api.internal;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class bm {

    /* renamed from: a, reason: collision with root package name */
    private bf f4807a;

    /* renamed from: d, reason: collision with root package name */
    private com.google.android.gms.common.f[] f4810d;

    /* renamed from: b, reason: collision with root package name */
    private boolean f4808b = false;

    /* renamed from: c, reason: collision with root package name */
    private boolean f4809c = false;

    /* renamed from: e, reason: collision with root package name */
    private int f4811e = 0;

    /* synthetic */ bm() {
    }

    public final bn b() {
        boolean z = true;
        av.d(this.f4807a != null, "execute parameter required");
        if (!this.f4809c) {
            com.google.android.gms.common.f[] fVarArr = this.f4810d;
            if (fVarArr != null) {
                for (com.google.android.gms.common.f fVar : fVarArr) {
                    if (!fVar.c()) {
                        z = false;
                        break;
                    }
                }
                this.f4808b = z;
            } else {
                z = false;
                this.f4808b = z;
            }
        }
        return new bn(this, this.f4810d, this.f4808b, this.f4811e);
    }

    public final void c(bf bfVar) {
        this.f4807a = bfVar;
    }

    public final void d() {
        this.f4809c = true;
        this.f4808b = false;
    }

    public final void e(com.google.android.gms.common.f... fVarArr) {
        this.f4810d = fVarArr;
    }

    public final void f(int i2) {
        this.f4811e = i2;
    }
}
