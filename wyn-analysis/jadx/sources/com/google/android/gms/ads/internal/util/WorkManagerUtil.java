package com.google.android.gms.ads.internal.util;

import A7.C0237b0;
import E6.a;
import G6.A;
import H6.l;
import J3.b;
import J3.d;
import J3.h;
import K3.q;
import S3.p;
import T3.c;
import android.content.Context;
import android.os.Build;
import android.os.Parcel;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.internal.ads.zzbem;
import com.google.android.gms.internal.ads.zzben;
import ff.o;
import ff.x;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import q7.BinderC3877b;
import q7.InterfaceC3876a;
import x9.C4504d;

/* loaded from: classes3.dex */
public class WorkManagerUtil extends zzbem implements A {
    @UsedByReflection("This class must be instantiated reflectively so that the default class loader can be used.")
    public WorkManagerUtil() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    public static void R(Context context) {
        try {
            q.d(context.getApplicationContext(), new b(new C4504d(19)));
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i10) {
        if (i5 == 1) {
            InterfaceC3876a interfaceC3876aR = BinderC3877b.R(parcel.readStrongBinder());
            String string = parcel.readString();
            String string2 = parcel.readString();
            zzben.zzh(parcel);
            boolean zZze = zze(interfaceC3876aR, string, string2);
            parcel2.writeNoException();
            parcel2.writeInt(zZze ? 1 : 0);
        } else if (i5 == 2) {
            InterfaceC3876a interfaceC3876aR2 = BinderC3877b.R(parcel.readStrongBinder());
            zzben.zzh(parcel);
            zzf(interfaceC3876aR2);
            parcel2.writeNoException();
        } else {
            if (i5 != 3) {
                return false;
            }
            InterfaceC3876a interfaceC3876aR3 = BinderC3877b.R(parcel.readStrongBinder());
            a aVar = (a) zzben.zzb(parcel, a.CREATOR);
            zzben.zzh(parcel);
            boolean zZzg = zzg(interfaceC3876aR3, aVar);
            parcel2.writeNoException();
            parcel2.writeInt(zZzg ? 1 : 0);
        }
        return true;
    }

    @Override // G6.A
    public final boolean zze(InterfaceC3876a interfaceC3876a, String str, String str2) {
        return zzg(interfaceC3876a, new a(str, str2, ""));
    }

    @Override // G6.A
    public final void zzf(InterfaceC3876a interfaceC3876a) {
        Context context = (Context) BinderC3877b.S(interfaceC3876a);
        R(context);
        try {
            q qVarC = q.c(context);
            qVarC.f6504d.v(new c(qVarC, 0));
            d dVar = new d(2, false, false, false, false, -1L, -1L, Build.VERSION.SDK_INT >= 24 ? o.X0(new LinkedHashSet()) : x.f35434a);
            C0237b0 c0237b0 = new C0237b0(OfflinePingSender.class);
            ((p) c0237b0.f814d).f10986j = dVar;
            ((Set) c0237b0.f815e).add("offline_ping_sender_work");
            qVarC.a(c0237b0.i());
        } catch (IllegalStateException e7) {
            l.g("Failed to instantiate WorkManager.", e7);
        }
    }

    @Override // G6.A
    public final boolean zzg(InterfaceC3876a interfaceC3876a, a aVar) throws Throwable {
        Context context = (Context) BinderC3877b.S(interfaceC3876a);
        R(context);
        d dVar = new d(2, false, false, false, false, -1L, -1L, Build.VERSION.SDK_INT >= 24 ? o.X0(new LinkedHashSet()) : x.f35434a);
        HashMap map = new HashMap();
        map.put("uri", aVar.f3586a);
        map.put("gws_query_id", aVar.f3587b);
        map.put("image_url", aVar.f3588c);
        h hVar = new h(map);
        h.c(hVar);
        C0237b0 c0237b0 = new C0237b0(OfflineNotificationPoster.class);
        p pVar = (p) c0237b0.f814d;
        pVar.f10986j = dVar;
        pVar.f10981e = hVar;
        ((Set) c0237b0.f815e).add("offline_notification_work");
        try {
            q.c(context).a(c0237b0.i());
            return true;
        } catch (IllegalStateException e7) {
            l.g("Failed to instantiate WorkManager.", e7);
            return false;
        }
    }
}
