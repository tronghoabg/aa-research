package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes4.dex */
final class bf extends bm {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f27189a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f27190b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bn f27191c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf(bn bnVar, TaskCompletionSource taskCompletionSource, int i5, long j8, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.f27191c = bnVar;
        this.f27189a = j8;
        this.f27190b = taskCompletionSource2;
    }

    @Override // i8.z
    public final void b() {
        if (bn.k(this.f27191c)) {
            a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.f27191c;
            i8.o oVar = (i8.o) bnVar.f27211a.f36904n;
            Bundle bundleB = bn.b(bnVar, this.f27189a, 0);
            bl blVar = new bl(this.f27191c, this.f27190b);
            i8.m mVar = (i8.m) oVar;
            mVar.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(mVar.f36886b);
            int i5 = i8.k.f36909a;
            parcelObtain.writeInt(1);
            bundleB.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(blVar);
            mVar.R(2, parcelObtain);
        } catch (RemoteException e7) {
            this.f27191c.f27212b.a(e7, "warmUpIntegrityToken(%s)", Long.valueOf(this.f27189a));
            this.f27190b.trySetException(new StandardIntegrityException(-100, e7));
        }
    }
}
