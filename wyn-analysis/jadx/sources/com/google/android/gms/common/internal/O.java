package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

/* loaded from: classes3.dex */
public final class O extends zzb {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC1717f f26607a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26608b;

    public O(AbstractC1717f abstractC1717f, int i5) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.f26607a = abstractC1717f;
        this.f26608b = i5;
    }

    @Override // com.google.android.gms.internal.common.zzb
    public final boolean zza(int i5, Parcel parcel, Parcel parcel2, int i10) {
        int i11 = this.f26608b;
        if (i5 == 1) {
            int i12 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) zzc.zzb(parcel, Bundle.CREATOR);
            zzc.zzf(parcel);
            AbstractC1732v.j(this.f26607a, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f26607a.onPostInitHandler(i12, strongBinder, bundle, i11);
            this.f26607a = null;
        } else if (i5 == 2) {
            parcel.readInt();
            zzc.zzf(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i5 != 3) {
                return false;
            }
            int i13 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            T t10 = (T) zzc.zzb(parcel, T.CREATOR);
            zzc.zzf(parcel);
            AbstractC1717f abstractC1717f = this.f26607a;
            AbstractC1732v.j(abstractC1717f, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            AbstractC1732v.i(t10);
            abstractC1717f.zzc(t10);
            Bundle bundle2 = t10.f26614a;
            AbstractC1732v.j(this.f26607a, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f26607a.onPostInitHandler(i13, strongBinder2, bundle2, i11);
            this.f26607a = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
