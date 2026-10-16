package com.google.android.gms.internal.identity;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.InterfaceC1692f;
import com.google.android.gms.common.api.internal.J;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.r;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.List;
import x7.InterfaceC4497i;

/* loaded from: classes.dex */
public final class zzcr {
    public static /* synthetic */ TaskCompletionSource zza(final InterfaceC1692f interfaceC1692f) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.gms.internal.location.zzcs
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final /* synthetic */ void onComplete(Task task) {
                InterfaceC1692f interfaceC1692f2 = interfaceC1692f;
                if (task.isSuccessful()) {
                    interfaceC1692f2.setResult(Status.f26424e);
                    return;
                }
                if (task.isCanceled()) {
                    interfaceC1692f2.setFailedResult(Status.f26428i);
                    return;
                }
                Exception exception = task.getException();
                if (exception instanceof j) {
                    interfaceC1692f2.setFailedResult(((j) exception).getStatus());
                } else {
                    interfaceC1692f2.setFailedResult(Status.f26426g);
                }
            }
        });
        return taskCompletionSource;
    }

    @Deprecated
    public final r addGeofences(o oVar, List<InterfaceC4497i> list, PendingIntent pendingIntent) {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC4497i interfaceC4497i : list) {
            AbstractC1732v.a("Geofence must be created using Geofence.Builder.", interfaceC4497i instanceof zzek);
            arrayList.add((zzek) interfaceC4497i);
        }
        AbstractC1732v.a("No geofence has been added to this request.", !arrayList.isEmpty());
        return ((J) oVar).f26468b.doWrite((l) new zzcn(this, oVar, new x7.j(5, null, new ArrayList(arrayList)), pendingIntent));
    }

    public final r removeGeofences(o oVar, PendingIntent pendingIntent) {
        return ((J) oVar).f26468b.doWrite((l) new zzco(this, oVar, pendingIntent));
    }

    public final r removeGeofences(o oVar, List<String> list) {
        return ((J) oVar).f26468b.doWrite((l) new zzcp(this, oVar, list));
    }

    public final r addGeofences(o oVar, x7.j jVar, PendingIntent pendingIntent) {
        return ((J) oVar).f26468b.doWrite((l) new zzcn(this, oVar, jVar, pendingIntent));
    }
}
