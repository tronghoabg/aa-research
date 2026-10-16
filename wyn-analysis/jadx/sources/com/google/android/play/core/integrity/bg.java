package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes4.dex */
final class bg extends bm {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f27192a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f27193b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f27194c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f27195d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ bn f27196e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg(bn bnVar, TaskCompletionSource taskCompletionSource, int i5, String str, long j8, long j10, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.f27196e = bnVar;
        this.f27192a = str;
        this.f27193b = j8;
        this.f27194c = j10;
        this.f27195d = taskCompletionSource2;
    }

    @Override // i8.z
    public final void b() {
        if (bn.k(this.f27196e)) {
            a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.f27196e;
            i8.o oVar = (i8.o) bnVar.f27211a.f36904n;
            Bundle bundleA = bn.a(bnVar, this.f27192a, this.f27193b, this.f27194c, 0);
            bk bkVar = new bk(this.f27196e, this.f27195d, this.f27193b);
            i8.m mVar = (i8.m) oVar;
            mVar.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(mVar.f36886b);
            int i5 = i8.k.f36909a;
            parcelObtain.writeInt(1);
            bundleA.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(bkVar);
            mVar.R(3, parcelObtain);
        } catch (RemoteException e7) {
            this.f27196e.f27212b.a(e7, "requestExpressIntegrityToken(%s, %s)", this.f27192a, Long.valueOf(this.f27193b));
            this.f27195d.trySetException(new StandardIntegrityException(-100, e7));
        }
    }
}
