package com.google.android.enterprise.connectedapps.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class CrossProfileBundleCallSender extends defpackage.qel {
    private final defpackage.qec a;
    private final int b;
    private final defpackage.qdz c;

    public CrossProfileBundleCallSender(defpackage.qec qecVar, int i, defpackage.qdz qdzVar) {
        this.a = qecVar;
        this.b = i;
        this.c = qdzVar;
    }

    @Override // defpackage.qel
    public final void a(long j, int i, int i2, byte[] bArr) throws android.os.RemoteException {
        this.a.e(j, i, i2, bArr);
    }

    @Override // defpackage.qel
    public final byte[] b(long j, int i, byte[] bArr) throws android.os.RemoteException {
        defpackage.qdz qdzVar = this.c;
        return this.a.f(j, i, -4319067186032159575L, this.b, bArr, qdzVar);
    }

    @Override // defpackage.qel
    public final byte[] c(long j, int i) throws android.os.RemoteException {
        return this.a.g(j, i);
    }

    @Override // defpackage.qel
    public final android.os.Bundle d(long j) throws android.os.RemoteException {
        return this.a.h(j);
    }

    @Override // defpackage.qel
    public final void e(long j, android.os.Bundle bundle) throws android.os.RemoteException {
        this.a.i(j, bundle);
    }

    @Override // defpackage.qel
    public /* bridge */ /* synthetic */ android.os.Bundle makeBundleCall(android.os.Bundle bundle) throws defpackage.qei {
        return super.makeBundleCall(bundle);
    }
}
