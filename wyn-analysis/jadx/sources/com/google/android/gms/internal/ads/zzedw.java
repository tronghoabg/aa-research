package com.google.android.gms.internal.ads;

import D6.C0;
import D6.C0395s;
import D6.H0;
import G6.U;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.ads.nativead.NativeAd;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import q7.BinderC3877b;
import q7.InterfaceC3876a;
import x6.C4477h;
import x6.C4481l;
import z6.AbstractC4619b;

/* loaded from: classes3.dex */
public final class zzedw extends C0 {
    final Map zza;
    private final Context zzb;
    private final WeakReference zzc;
    private final zzedk zzd;
    private final zzhcp zze;
    private zzecz zzf;

    public zzedw(Context context, WeakReference weakReference, zzedk zzedkVar, zzedy zzedyVar, zzhcp zzhcpVar) {
        super("com.google.android.gms.ads.internal.client.IOutOfContextTester");
        this.zza = new HashMap();
        this.zzb = context;
        this.zzc = weakReference;
        this.zzd = zzedkVar;
        this.zze = zzhcpVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzj, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzg(String str) {
        try {
            zzhcf.zzr(this.zzf.zzn(str), new zzedr(this), this.zze);
        } catch (NullPointerException e7) {
            C6.n.f1857D.f1868h.zzh(e7, "OutOfContextTester.setAdAsOutOfContext");
            this.zzd.zzn();
        }
    }

    private final synchronized void zzk(String str) {
        try {
            zzhcf.zzr(this.zzf.zzn(str), new zzeds(this), this.zze);
        } catch (NullPointerException e7) {
            C6.n.f1857D.f1868h.zzh(e7, "OutOfContextTester.setAdAsShown");
            this.zzd.zzn();
        }
    }

    private final Context zzl() {
        Context context = (Context) this.zzc.get();
        return context == null ? this.zzb : context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzm(Object obj) {
        x6.t responseInfo;
        H0 h02;
        if (obj instanceof C4481l) {
            responseInfo = ((C4481l) obj).f47740e;
        } else if (obj instanceof AbstractC4619b) {
            responseInfo = ((AbstractC4619b) obj).getResponseInfo();
        } else if (obj instanceof I6.a) {
            responseInfo = ((I6.a) obj).getResponseInfo();
        } else if (obj instanceof R6.c) {
            responseInfo = ((R6.c) obj).getResponseInfo();
        } else if (obj instanceof S6.a) {
            responseInfo = ((S6.a) obj).getResponseInfo();
        } else if (obj instanceof C4477h) {
            responseInfo = ((C4477h) obj).getResponseInfo();
        } else {
            if (!(obj instanceof NativeAd)) {
                return "";
            }
            responseInfo = ((NativeAd) obj).getResponseInfo();
        }
        if (responseInfo == null || (h02 = responseInfo.f47747a) == null) {
            return "";
        }
        try {
            return h02.zzj();
        } catch (RemoteException unused) {
            return "";
        }
    }

    public final void zzb(zzecz zzeczVar) {
        this.zzf = zzeczVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void zzc(com.google.android.gms.internal.ads.zzedx r8) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzedw.zzc(com.google.android.gms.internal.ads.zzedx):void");
    }

    public final synchronized void zzd(String str) {
        Map map;
        Object obj;
        try {
            Activity activityZzo = this.zzd.zzo();
            if (activityZzo != null && (obj = (map = this.zza).get(str)) != null) {
                zzbio zzbioVar = zzbix.zzkU;
                C0395s c0395s = C0395s.f2489e;
                if (!((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue() || (obj instanceof AbstractC4619b) || (obj instanceof I6.a) || (obj instanceof R6.c) || (obj instanceof S6.a)) {
                    map.remove(str);
                }
                zzk(zzm(obj));
                if (obj instanceof AbstractC4619b) {
                    ((AbstractC4619b) obj).show(activityZzo);
                    return;
                }
                if (obj instanceof I6.a) {
                    ((I6.a) obj).show(activityZzo);
                    return;
                }
                if (obj instanceof R6.c) {
                    ((R6.c) obj).show(activityZzo, zzedv.zza);
                    return;
                }
                if (obj instanceof S6.a) {
                    ((S6.a) obj).show(activityZzo, zzedt.zza);
                    return;
                }
                if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue() && ((obj instanceof C4477h) || (obj instanceof NativeAd))) {
                    Intent intent = new Intent();
                    Context contextZzl = zzl();
                    intent.setClassName(contextZzl, "com.google.android.gms.ads.OutOfContextTestingActivity");
                    intent.putExtra("adUnit", str);
                    U u10 = C6.n.f1857D.f1863c;
                    U.s(contextZzl, intent);
                }
            }
        } finally {
        }
    }

    @Override // D6.D0
    public final void zze(String str, InterfaceC3876a interfaceC3876a, InterfaceC3876a interfaceC3876a2) {
        Context context = (Context) BinderC3877b.S(interfaceC3876a);
        ViewGroup viewGroup = (ViewGroup) BinderC3877b.S(interfaceC3876a2);
        if (context == null || viewGroup == null) {
            return;
        }
        Map map = this.zza;
        Object obj = map.get(str);
        if (obj != null) {
            map.remove(str);
        }
        if (obj instanceof C4477h) {
            zzedy.zza(context, viewGroup, (C4477h) obj);
        } else if (obj instanceof NativeAd) {
            zzedy.zzb(context, viewGroup, (NativeAd) obj);
        }
    }

    public final synchronized void zzf(String str, Object obj) {
        this.zza.put(str, obj);
        zzg(zzm(obj));
    }

    public final /* synthetic */ zzedk zzi() {
        return this.zzd;
    }
}
