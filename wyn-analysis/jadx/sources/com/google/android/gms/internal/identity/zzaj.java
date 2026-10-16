package com.google.android.gms.internal.identity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.A;
import com.google.android.gms.common.api.internal.BinderC1709x;
import com.google.android.gms.common.api.internal.InterfaceC1708w;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import d7.d;
import x7.C4491c;
import x7.t;
import x7.y;
import x7.z;

/* loaded from: classes.dex */
public final class zzaj extends l {
    static final h zza;
    public static final i zzb;

    static {
        h hVar = new h();
        zza = hVar;
        zzb = new i("ActivityRecognition.API", new zzag(), hVar);
    }

    public zzaj(Activity activity) {
        super(activity, activity, zzb, e.f26433X8, k.f26561c);
    }

    public final Task<Void> removeActivityTransitionUpdates(final PendingIntent pendingIntent) {
        N7.e eVarA = A.a();
        eVarA.f8590d = new InterfaceC1708w() { // from class: com.google.android.gms.internal.location.zzam
            @Override // com.google.android.gms.common.api.internal.InterfaceC1708w
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                i iVar = zzaj.zzb;
                ((zzv) ((zzg) obj).getService()).zzk(pendingIntent, new BinderC1709x(new zzai((TaskCompletionSource) obj2)));
            }
        };
        eVarA.f8589c = 2406;
        return doWrite(eVarA.e());
    }

    public final Task<Void> removeActivityUpdates(final PendingIntent pendingIntent) {
        N7.e eVarA = A.a();
        eVarA.f8590d = new InterfaceC1708w() { // from class: com.google.android.gms.internal.location.zzak
            @Override // com.google.android.gms.common.api.internal.InterfaceC1708w
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                i iVar = zzaj.zzb;
                ((zzg) obj).zzp(pendingIntent);
                ((TaskCompletionSource) obj2).setResult(null);
            }
        };
        eVarA.f8589c = 2402;
        return doWrite(eVarA.e());
    }

    public final Task<Void> removeSleepSegmentUpdates(final PendingIntent pendingIntent) {
        N7.e eVarA = A.a();
        eVarA.f8590d = new InterfaceC1708w() { // from class: com.google.android.gms.internal.location.zzan
            @Override // com.google.android.gms.common.api.internal.InterfaceC1708w
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                i iVar = zzaj.zzb;
                zzai zzaiVar = new zzai((TaskCompletionSource) obj2);
                PendingIntent pendingIntent2 = pendingIntent;
                AbstractC1732v.j(pendingIntent2, "PendingIntent must be specified.");
                ((zzv) ((zzg) obj).getService()).zzn(pendingIntent2, new BinderC1709x(zzaiVar));
            }
        };
        eVarA.f8589c = 2411;
        return doWrite(eVarA.e());
    }

    public final Task<Void> requestActivityTransitionUpdates(final C4491c c4491c, final PendingIntent pendingIntent) {
        c4491c.f47768d = getContextAttributionTag();
        N7.e eVarA = A.a();
        eVarA.f8590d = new InterfaceC1708w() { // from class: com.google.android.gms.internal.location.zzal
            @Override // com.google.android.gms.common.api.internal.InterfaceC1708w
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                i iVar = zzaj.zzb;
                zzai zzaiVar = new zzai((TaskCompletionSource) obj2);
                C4491c c4491c2 = c4491c;
                AbstractC1732v.j(c4491c2, "activityTransitionRequest must be specified.");
                PendingIntent pendingIntent2 = pendingIntent;
                AbstractC1732v.j(pendingIntent2, "PendingIntent must be specified.");
                ((zzv) ((zzg) obj).getService()).zzj(c4491c2, pendingIntent2, new BinderC1709x(zzaiVar));
            }
        };
        eVarA.f8589c = 2405;
        return doWrite(eVarA.e());
    }

    public final Task<Void> requestActivityUpdates(long j8, final PendingIntent pendingIntent) {
        AbstractC1732v.a("intervalMillis can't be negative.", j8 >= 0);
        AbstractC1732v.k("Must set intervalMillis.", j8 != Long.MIN_VALUE);
        final y yVar = new y(j8, true, null, null, null, false, null, 0L, null);
        yVar.f47839i = getContextAttributionTag();
        N7.e eVarA = A.a();
        eVarA.f8590d = new InterfaceC1708w() { // from class: com.google.android.gms.internal.location.zzap
            @Override // com.google.android.gms.common.api.internal.InterfaceC1708w
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                i iVar = zzaj.zzb;
                zzai zzaiVar = new zzai((TaskCompletionSource) obj2);
                y yVar2 = yVar;
                AbstractC1732v.j(yVar2, "ActivityRecognitionRequest can't be null.");
                PendingIntent pendingIntent2 = pendingIntent;
                AbstractC1732v.j(pendingIntent2, "PendingIntent must be specified.");
                ((zzv) ((zzg) obj).getService()).zzi(yVar2, pendingIntent2, new BinderC1709x(zzaiVar));
            }
        };
        eVarA.f8589c = 2401;
        return doWrite(eVarA.e());
    }

    public final Task<Void> requestSleepSegmentUpdates(final PendingIntent pendingIntent, final t tVar) {
        AbstractC1732v.j(pendingIntent, "PendingIntent must be specified.");
        N7.e eVarA = A.a();
        eVarA.f8590d = new InterfaceC1708w() { // from class: com.google.android.gms.internal.location.zzao
            @Override // com.google.android.gms.common.api.internal.InterfaceC1708w
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                ((zzv) ((zzg) obj).getService()).zzm(pendingIntent, tVar, new zzah(this.zza, (TaskCompletionSource) obj2));
            }
        };
        eVarA.f8591e = new d[]{z.f47840a};
        eVarA.f8589c = 2410;
        return doRead(eVarA.e());
    }

    public zzaj(Context context) {
        super(context, null, zzb, e.f26433X8, k.f26561c);
    }
}
