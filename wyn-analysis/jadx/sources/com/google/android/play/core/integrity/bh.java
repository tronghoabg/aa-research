package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes4.dex */
final class bh extends bm {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f27197a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f27198b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f27199c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f27200d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ bn f27201e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh(bn bnVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i5) {
        super(bnVar, taskCompletionSource);
        this.f27201e = bnVar;
        this.f27197a = bundle;
        this.f27198b = activity;
        this.f27199c = taskCompletionSource2;
        this.f27200d = i5;
    }

    @Override // i8.z
    public final void b() {
        if (bn.k(this.f27201e)) {
            a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.f27201e;
            i8.d dVar = bnVar.f27211a;
            i8.o oVar = (i8.o) dVar.f36904n;
            Bundle bundle = this.f27197a;
            as asVarA = bnVar.f27215e.a(this.f27198b, this.f27199c, dVar);
            i8.m mVar = (i8.m) oVar;
            mVar.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(mVar.f36886b);
            int i5 = i8.k.f36909a;
            parcelObtain.writeInt(1);
            bundle.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(asVarA);
            mVar.R(6, parcelObtain);
        } catch (RemoteException e7) {
            this.f27201e.f27212b.a(e7, "requestAndShowDialog(%s)", Integer.valueOf(this.f27200d));
            this.f27199c.trySetException(new StandardIntegrityException(-100, e7));
        }
    }
}
