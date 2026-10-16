package com.google.android.gms.internal.ads;

import D6.C0372g;
import D6.C0388o;
import D6.C0392q;
import D6.C0395s;
import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC1732v;

/* loaded from: classes3.dex */
public final class zzbre {
    private final Context zza;
    private final B6.b zzb;
    private zzbra zzc;

    public zzbre(Context context, B6.b bVar) {
        AbstractC1732v.i(context);
        AbstractC1732v.i(bVar);
        this.zza = context;
        this.zzb = bVar;
        zzbix.zza(context);
    }

    public static final boolean zzc(String str) {
        zzbio zzbioVar = zzbix.zzlB;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
            AbstractC1732v.i(str);
            if (str.length() > ((Integer) c0395s.f2492c.zzd(zzbix.zzlD)).intValue()) {
                H6.l.a("H5 GMSG exceeds max length");
                return false;
            }
            Uri uri = Uri.parse(str);
            if ("gmsg".equals(uri.getScheme()) && "mobileads.google.com".equals(uri.getHost()) && "/h5ads".equals(uri.getPath())) {
                return true;
            }
        }
        return false;
    }

    private final void zzd() {
        if (this.zzc != null) {
            return;
        }
        Context context = this.zza;
        C0388o c0388o = C0392q.f2477g.f2479b;
        zzbvf zzbvfVar = new zzbvf();
        B6.b bVar = this.zzb;
        c0388o.getClass();
        this.zzc = (zzbra) new C0372g(c0388o, context, zzbvfVar, bVar).d(context, false);
    }

    public final boolean zza(String str) {
        if (!zzc(str)) {
            return false;
        }
        zzd();
        zzbra zzbraVar = this.zzc;
        if (zzbraVar == null) {
            return false;
        }
        try {
            zzbraVar.zze(str);
            return true;
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
            return true;
        }
    }

    public final void zzb() {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzlB)).booleanValue()) {
            zzd();
            zzbra zzbraVar = this.zzc;
            if (zzbraVar != null) {
                try {
                    zzbraVar.zzf();
                } catch (RemoteException e7) {
                    H6.l.i("#007 Could not call remote method.", e7);
                }
            }
        }
    }
}
