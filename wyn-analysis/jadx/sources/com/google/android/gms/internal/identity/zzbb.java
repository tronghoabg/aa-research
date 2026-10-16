package com.google.android.gms.internal.identity;

import U8.v0;
import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.InterfaceC1692f;
import com.google.android.gms.common.api.internal.J;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.r;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import x7.m;

/* loaded from: classes.dex */
public final class zzbb {
    public static /* synthetic */ TaskCompletionSource zza(final InterfaceC1692f interfaceC1692f) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.gms.internal.location.zzbd
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

    public final r flushLocations(o oVar) {
        return ((J) oVar).f26468b.doWrite((l) new zzaq(this, oVar));
    }

    public final Location getLastLocation(o oVar) {
        AbstractC1732v.a("GoogleApiClient parameter is required.", oVar != null);
        i iVar = zzbi.zzb;
        oVar.getClass();
        throw new UnsupportedOperationException();
    }

    public final LocationAvailability getLocationAvailability(o oVar) {
        AbstractC1732v.a("GoogleApiClient parameter is required.", oVar != null);
        i iVar = zzbi.zzb;
        oVar.getClass();
        throw new UnsupportedOperationException();
    }

    public final r removeLocationUpdates(o oVar, PendingIntent pendingIntent) {
        return ((J) oVar).f26468b.doWrite((l) new zzav(this, oVar, pendingIntent));
    }

    public final r requestLocationUpdates(o oVar, LocationRequest locationRequest, PendingIntent pendingIntent) {
        return ((J) oVar).f26468b.doWrite((l) new zzat(this, oVar, pendingIntent, locationRequest));
    }

    public final r setMockLocation(o oVar, Location location) {
        return ((J) oVar).f26468b.doWrite((l) new zzay(this, oVar, location));
    }

    public final r setMockMode(o oVar, boolean z2) {
        return ((J) oVar).f26468b.doWrite((l) new zzax(this, oVar, z2));
    }

    public final r removeLocationUpdates(o oVar, x7.l lVar) {
        return ((J) oVar).f26468b.doWrite((l) new zzaw(this, oVar, lVar));
    }

    public final r requestLocationUpdates(o oVar, LocationRequest locationRequest, x7.l lVar, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            AbstractC1732v.j(looper, "invalid null looper");
        }
        return ((J) oVar).f26468b.doWrite((l) new zzas(this, oVar, v0.u(looper, lVar, x7.l.class.getSimpleName()), locationRequest));
    }

    public final r removeLocationUpdates(o oVar, m mVar) {
        return ((J) oVar).f26468b.doWrite((l) new zzau(this, oVar, mVar));
    }

    public final r requestLocationUpdates(o oVar, LocationRequest locationRequest, m mVar) {
        Looper looperMyLooper = Looper.myLooper();
        AbstractC1732v.j(looperMyLooper, "invalid null looper");
        return ((J) oVar).f26468b.doWrite((l) new zzar(this, oVar, v0.u(looperMyLooper, mVar, m.class.getSimpleName()), locationRequest));
    }

    public final r requestLocationUpdates(o oVar, LocationRequest locationRequest, m mVar, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            AbstractC1732v.j(looper, "invalid null looper");
        }
        return ((J) oVar).f26468b.doWrite((l) new zzar(this, oVar, v0.u(looper, mVar, m.class.getSimpleName()), locationRequest));
    }
}
