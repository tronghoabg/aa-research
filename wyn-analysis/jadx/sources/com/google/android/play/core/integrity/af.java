package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes4.dex */
final class af extends i8.z {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ byte[] f27134a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Long f27135b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f27136c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ IntegrityTokenRequest f27137d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ aj f27138e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af(aj ajVar, TaskCompletionSource taskCompletionSource, byte[] bArr, Long l10, Parcelable parcelable, TaskCompletionSource taskCompletionSource2, IntegrityTokenRequest integrityTokenRequest) {
        super(taskCompletionSource);
        this.f27138e = ajVar;
        this.f27134a = bArr;
        this.f27135b = l10;
        this.f27136c = taskCompletionSource2;
        this.f27137d = integrityTokenRequest;
    }

    @Override // i8.z
    public final void a(Exception exc) {
        if (exc instanceof i8.e) {
            super.a(new IntegrityServiceException(-9, exc));
        } else {
            super.a(exc);
        }
    }

    @Override // i8.z
    public final void b() {
        try {
            aj ajVar = this.f27138e;
            i8.t tVar = (i8.t) ajVar.f27148a.f36904n;
            Bundle bundleA = aj.a(ajVar, this.f27134a, this.f27135b, null);
            ai aiVar = new ai(this.f27138e, this.f27136c);
            i8.r rVar = (i8.r) tVar;
            rVar.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(rVar.f36886b);
            int i5 = i8.k.f36909a;
            parcelObtain.writeInt(1);
            bundleA.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(aiVar);
            rVar.R(2, parcelObtain);
        } catch (RemoteException e7) {
            this.f27138e.f27149b.a(e7, "requestIntegrityToken(%s)", this.f27137d);
            this.f27136c.trySetException(new IntegrityServiceException(-100, e7));
        }
    }
}
