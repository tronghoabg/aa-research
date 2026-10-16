package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes4.dex */
final class ag extends i8.z {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f27139a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f27140b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f27141c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f27142d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ aj f27143e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(aj ajVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i5) {
        super(taskCompletionSource);
        this.f27143e = ajVar;
        this.f27139a = bundle;
        this.f27140b = activity;
        this.f27141c = taskCompletionSource2;
        this.f27142d = i5;
    }

    @Override // i8.z
    public final void b() {
        try {
            aj ajVar = this.f27143e;
            i8.t tVar = (i8.t) ajVar.f27148a.f36904n;
            Bundle bundle = this.f27139a;
            as asVarA = ajVar.f27151d.a(this.f27140b, this.f27141c, ajVar.f27148a);
            i8.r rVar = (i8.r) tVar;
            rVar.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(rVar.f36886b);
            int i5 = i8.k.f36909a;
            parcelObtain.writeInt(1);
            bundle.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(asVarA);
            rVar.R(3, parcelObtain);
        } catch (RemoteException e7) {
            this.f27143e.f27149b.a(e7, "requestAndShowDialog(%s)", Integer.valueOf(this.f27142d));
            this.f27141c.trySetException(new IntegrityServiceException(-100, e7));
        }
    }
}
