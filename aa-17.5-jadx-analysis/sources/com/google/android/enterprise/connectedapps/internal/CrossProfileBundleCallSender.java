package com.google.android.enterprise.connectedapps.internal;

import android.os.Bundle;
import android.os.RemoteException;
import defpackage.qdc;
import defpackage.qdf;
import defpackage.qdl;
import defpackage.qdo;

/* loaded from: classes2.dex */
public final class CrossProfileBundleCallSender extends qdo {
    private final qdf a;
    private final int b;
    private final qdc c;

    public CrossProfileBundleCallSender(qdf qdfVar, int i, qdc qdcVar) {
        this.a = qdfVar;
        this.b = i;
        this.c = qdcVar;
    }

    @Override // defpackage.qdo
    public final void a(long j, int i, int i2, byte[] bArr) throws RemoteException {
        this.a.e(j, i, i2, bArr);
    }

    @Override // defpackage.qdo
    public final byte[] b(long j, int i, byte[] bArr) throws RemoteException {
        qdc qdcVar = this.c;
        return this.a.f(j, i, -4319067186032159575L, this.b, bArr, qdcVar);
    }

    @Override // defpackage.qdo
    public final byte[] c(long j, int i) throws RemoteException {
        return this.a.g(j, i);
    }

    @Override // defpackage.qdo
    public final Bundle d(long j) throws RemoteException {
        return this.a.h(j);
    }

    @Override // defpackage.qdo
    public final void e(long j, Bundle bundle) throws RemoteException {
        this.a.i(j, bundle);
    }

    @Override // defpackage.qdo
    public /* bridge */ /* synthetic */ Bundle makeBundleCall(Bundle bundle) throws qdl {
        return super.makeBundleCall(bundle);
    }
}
