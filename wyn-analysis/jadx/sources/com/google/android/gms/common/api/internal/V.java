package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
public final class V extends A {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f26495d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final Object f26496e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(N7.e eVar, d7.d[] dVarArr, boolean z2, int i5) {
        super(dVarArr, z2, i5);
        this.f26496e = eVar;
    }

    @Override // com.google.android.gms.common.api.internal.A
    public final void b(com.google.android.gms.common.api.b bVar, TaskCompletionSource taskCompletionSource) {
        switch (this.f26495d) {
            case 0:
                ((InterfaceC1708w) ((N7.e) this.f26496e).f8590d).accept(bVar, taskCompletionSource);
                break;
            default:
                f9.c cVar = (f9.c) bVar;
                f9.e eVar = new f9.e(taskCompletionSource);
                Bundle bundle = (Bundle) this.f26496e;
                cVar.getClass();
                try {
                    ((f9.j) ((f9.l) cVar.getService())).R(eVar, bundle);
                    break;
                } catch (RemoteException unused) {
                    return;
                }
        }
    }

    public V(Bundle bundle) {
        super(null, false, 13202);
        this.f26496e = bundle;
    }
}
