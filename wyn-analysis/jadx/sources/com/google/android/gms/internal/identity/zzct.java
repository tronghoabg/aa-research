package com.google.android.gms.internal.identity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.A;
import com.google.android.gms.common.api.internal.InterfaceC1708w;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;
import x7.j;

/* loaded from: classes.dex */
public final class zzct extends l {
    public static final /* synthetic */ int zza = 0;

    public zzct(Activity activity) {
        super(activity, activity, zzbi.zzb, e.f26433X8, k.f26561c);
    }

    public final Task<Void> addGeofences(final j jVar, final PendingIntent pendingIntent) {
        N7.e eVarA = A.a();
        eVarA.f8590d = new InterfaceC1708w() { // from class: com.google.android.gms.internal.location.zzcw
            @Override // com.google.android.gms.common.api.internal.InterfaceC1708w
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                ((zzdz) obj).zzE(jVar, pendingIntent, (TaskCompletionSource) obj2);
            }
        };
        eVarA.f8589c = 2424;
        return doWrite(eVarA.e());
    }

    public final Task<Void> removeGeofences(final PendingIntent pendingIntent) {
        N7.e eVarA = A.a();
        eVarA.f8590d = new InterfaceC1708w() { // from class: com.google.android.gms.internal.location.zzcu
            @Override // com.google.android.gms.common.api.internal.InterfaceC1708w
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                ((zzdz) obj).zzF(zzem.zzb(pendingIntent), (TaskCompletionSource) obj2);
            }
        };
        eVarA.f8589c = 2425;
        return doWrite(eVarA.e());
    }

    public zzct(Context context) {
        super(context, null, zzbi.zzb, e.f26433X8, k.f26561c);
    }

    public final Task<Void> removeGeofences(final List<String> list) {
        N7.e eVarA = A.a();
        eVarA.f8590d = new InterfaceC1708w() { // from class: com.google.android.gms.internal.location.zzcv
            @Override // com.google.android.gms.common.api.internal.InterfaceC1708w
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                ((zzdz) obj).zzF(zzem.zza(list), (TaskCompletionSource) obj2);
            }
        };
        eVarA.f8589c = 2425;
        return doWrite(eVarA.e());
    }
}
