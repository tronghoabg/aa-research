package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.RemoteException;
import b.C1489b;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzbjy {
    private u.n zza;
    private u.g zzb;
    private u.m zzc;
    private zzbjx zzd;

    public static boolean zza(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
                for (int i5 = 0; i5 < listQueryIntentActivities.size(); i5++) {
                    if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i5).activityInfo.name)) {
                        return resolveInfoResolveActivity.activityInfo.packageName.equals(zzinp.zza(context));
                    }
                }
            }
        }
        return false;
    }

    public final void zzb(Activity activity) {
        u.m mVar = this.zzc;
        if (mVar == null) {
            return;
        }
        activity.unbindService(mVar);
        this.zzb = null;
        this.zza = null;
        this.zzc = null;
    }

    public final u.n zzc() {
        u.g gVar = this.zzb;
        if (gVar == null) {
            this.zza = null;
        } else if (this.zza == null) {
            this.zza = gVar.c(null);
        }
        return this.zza;
    }

    public final void zzd(zzbjx zzbjxVar) {
        this.zzd = zzbjxVar;
    }

    public final void zze(Activity activity) {
        String strZza;
        if (this.zzb == null && (strZza = zzinp.zza(activity)) != null) {
            zzinq zzinqVar = new zzinq(this);
            this.zzc = zzinqVar;
            u.g.a(activity, strZza, zzinqVar);
        }
    }

    public final void zzf(u.g gVar) {
        this.zzb = gVar;
        gVar.getClass();
        try {
            ((C1489b) gVar.f46069a).X();
        } catch (RemoteException unused) {
        }
        zzbjx zzbjxVar = this.zzd;
        if (zzbjxVar != null) {
            zzbjxVar.zza();
        }
    }

    public final void zzg() {
        this.zzb = null;
        this.zza = null;
    }
}
