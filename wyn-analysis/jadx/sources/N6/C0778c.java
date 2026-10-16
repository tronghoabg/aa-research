package N6;

import D6.C0395s;
import G6.L;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbzx;
import com.google.android.gms.internal.ads.zzfsm;
import com.google.android.gms.internal.ads.zzhcc;
import com.unity3d.services.UnityAdsConstants;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: N6.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0778c implements zzhcc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8463a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzbzx f8464b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f8465c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f8466d;

    public C0778c(j jVar, zzbzx zzbzxVar, boolean z2, int i5) {
        this.f8463a = i5;
        switch (i5) {
            case 1:
                this.f8464b = zzbzxVar;
                this.f8465c = z2;
                Objects.requireNonNull(jVar);
                this.f8466d = jVar;
                break;
            default:
                this.f8464b = zzbzxVar;
                this.f8465c = z2;
                Objects.requireNonNull(jVar);
                this.f8466d = jVar;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        zzbzx zzbzxVar = this.f8464b;
        switch (this.f8463a) {
            case 0:
                try {
                    String message = th.getMessage();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 16);
                    sb2.append("Internal error: ");
                    sb2.append(message);
                    zzbzxVar.zzf(sb2.toString());
                    break;
                } catch (RemoteException e7) {
                    int i5 = L.f4523b;
                    H6.l.d("", e7);
                    return;
                }
            default:
                try {
                    String message2 = th.getMessage();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(message2).length() + 16);
                    sb3.append("Internal error: ");
                    sb3.append(message2);
                    zzbzxVar.zzf(sb3.toString());
                    break;
                } catch (RemoteException e10) {
                    int i10 = L.f4523b;
                    H6.l.d("", e10);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzb(Object obj) {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z2 = this.f8465c;
        j jVar = this.f8466d;
        zzbzx zzbzxVar = this.f8464b;
        switch (this.f8463a) {
            case 0:
                List<Uri> list = (List) obj;
                try {
                    jVar.getClass();
                    Iterator it = list.iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        arrayList = jVar.f8511x;
                        arrayList2 = jVar.f8510w;
                        if (zHasNext) {
                            if (j.V((Uri) it.next(), arrayList2, arrayList)) {
                                jVar.f8506s.getAndIncrement();
                            }
                        }
                    }
                    zzbzxVar.zze(list);
                    if (jVar.f8501n || z2) {
                        for (Uri uri : list) {
                            boolean zV = j.V(uri, arrayList2, arrayList);
                            zzfsm zzfsmVar = jVar.f8499l;
                            if (zV) {
                                zzfsmVar.zzb(j.Y(uri, jVar.f8509v, UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION).toString(), null, null, null);
                            } else {
                                if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zziC)).booleanValue()) {
                                    zzfsmVar.zzb(uri.toString(), null, null, null);
                                }
                            }
                        }
                        break;
                    }
                } catch (RemoteException e7) {
                    int i5 = L.f4523b;
                    H6.l.d("", e7);
                    return;
                }
            default:
                ArrayList arrayList3 = (ArrayList) obj;
                try {
                    zzbzxVar.zze(arrayList3);
                    if (jVar.f8500m || z2) {
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            Uri uri2 = (Uri) it2.next();
                            boolean zV2 = j.V(uri2, jVar.f8512y, jVar.f8513z);
                            zzfsm zzfsmVar2 = jVar.f8499l;
                            if (zV2) {
                                zzfsmVar2.zzb(j.Y(uri2, jVar.f8509v, UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION).toString(), null, null, null);
                            } else {
                                if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zziC)).booleanValue()) {
                                    zzfsmVar2.zzb(uri2.toString(), null, null, null);
                                }
                            }
                        }
                        break;
                    }
                } catch (RemoteException e10) {
                    int i10 = L.f4523b;
                    H6.l.d("", e10);
                }
        }
    }
}
