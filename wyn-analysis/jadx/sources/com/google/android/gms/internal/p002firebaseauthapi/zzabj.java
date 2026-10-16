package com.google.android.gms.internal.p002firebaseauthapi;

import J8.AbstractC0629d;
import J8.AbstractC0640o;
import J8.B;
import J8.C0627b;
import J8.C0630e;
import J8.C0641p;
import J8.F;
import J8.u;
import J8.x;
import J8.y;
import J8.z;
import K8.C0693e;
import K8.C0695g;
import K8.C0698j;
import K8.C0699k;
import K8.E;
import K8.InterfaceC0701m;
import K8.InterfaceC0702n;
import K8.J;
import K8.S;
import K8.T;
import K8.U;
import android.app.Activity;
import android.net.Uri;
import android.support.v4.media.session.b;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import s8.g;

/* loaded from: classes.dex */
public final class zzabj extends zzaei {
    public zzabj(g gVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = new zzadh(gVar, scheduledExecutorService);
        this.zzb = executor;
    }

    public final Task<Void> zza(g gVar, String str, String str2) {
        return zza((zzabi) new zzabi(str, str2).zza(gVar));
    }

    public final Task<S> zzb(g gVar, String str, String str2) {
        return zza((zzabl) new zzabl(str, str2).zza(gVar));
    }

    public final Task<C0699k> zzc(g gVar, String str, String str2) {
        return zza((zzabp) new zzabp(str, str2).zza(gVar));
    }

    public final Task<Void> zzd(g gVar, AbstractC0640o abstractC0640o, String str, E e7) {
        return zza((zzacz) new zzacz(str).zza(gVar).zza(abstractC0640o).zza((zzady<Void, J>) e7).zza((InterfaceC0702n) e7));
    }

    public final Task<Void> zza(g gVar, String str, String str2, String str3) {
        return zza((zzabk) new zzabk(str, str2, str3).zza(gVar));
    }

    public final Task<Void> zzb(g gVar, String str, C0627b c0627b, String str2, String str3) {
        c0627b.f5792i = 6;
        return zza((zzaci) new zzaci(str, c0627b, str2, str3, "sendSignInLinkToEmail").zza(gVar));
    }

    public final Task<T> zzc(g gVar, AbstractC0640o abstractC0640o, AbstractC0629d abstractC0629d, String str, E e7) {
        return zza((zzaby) new zzaby(abstractC0629d, str).zza(gVar).zza(abstractC0640o).zza((zzady<T, J>) e7).zza((InterfaceC0702n) e7));
    }

    public final Task<T> zza(g gVar, String str, String str2, String str3, String str4, J j8) {
        return zza((zzabn) new zzabn(str, str2, str3, str4).zza(gVar).zza((zzady<T, J>) j8));
    }

    public final Task<String> zzd(g gVar, String str, String str2) {
        return zza((zzadd) new zzadd(str, str2).zza(gVar));
    }

    public final Task<Void> zzb(g gVar, AbstractC0640o abstractC0640o, AbstractC0629d abstractC0629d, String str, E e7) {
        return zza((zzabz) new zzabz(abstractC0629d, str).zza(gVar).zza(abstractC0640o).zza((zzady<Void, J>) e7).zza((InterfaceC0702n) e7));
    }

    public final Task<Void> zzc(g gVar, AbstractC0640o abstractC0640o, String str, E e7) {
        return zza((zzacw) new zzacw(str).zza(gVar).zza(abstractC0640o).zza((zzady<Void, J>) e7).zza((InterfaceC0702n) e7));
    }

    public final Task<Void> zza(AbstractC0640o abstractC0640o, InterfaceC0701m interfaceC0701m) {
        return zza((zzabm) new zzabm().zza(abstractC0640o).zza((zzady<Void, InterfaceC0701m>) interfaceC0701m).zza((InterfaceC0702n) interfaceC0701m));
    }

    public final Task<T> zzb(g gVar, AbstractC0640o abstractC0640o, C0630e c0630e, String str, E e7) {
        return zza((zzaca) new zzaca(c0630e, str).zza(gVar).zza(abstractC0640o).zza((zzady<T, J>) e7).zza((InterfaceC0702n) e7));
    }

    public final Task<Void> zza(g gVar, y yVar, AbstractC0640o abstractC0640o, String str, J j8) {
        zzaer.zza();
        zzabo zzaboVar = new zzabo(yVar, ((C0693e) abstractC0640o).f6627a.zzf(), str, null);
        zzaboVar.zza(gVar).zza((zzady<Void, J>) j8);
        return zza(zzaboVar);
    }

    public final Task<T> zzb(g gVar, AbstractC0640o abstractC0640o, String str, String str2, String str3, String str4, E e7) {
        return zza((zzacc) new zzacc(str, str2, str3, str4).zza(gVar).zza(abstractC0640o).zza((zzady<T, J>) e7).zza((InterfaceC0702n) e7));
    }

    public final Task<Void> zza(g gVar, B b5, AbstractC0640o abstractC0640o, String str, String str2, J j8) {
        zzabo zzaboVar = new zzabo(b5, ((C0693e) abstractC0640o).f6627a.zzf(), str, str2);
        zzaboVar.zza(gVar).zza((zzady<Void, J>) j8);
        return zza(zzaboVar);
    }

    public final Task<T> zzb(g gVar, AbstractC0640o abstractC0640o, u uVar, String str, E e7) {
        zzaer.zza();
        return zza((zzace) new zzace(uVar, str).zza(gVar).zza(abstractC0640o).zza((zzady<T, J>) e7).zza((InterfaceC0702n) e7));
    }

    public final Task<T> zza(g gVar, AbstractC0640o abstractC0640o, y yVar, String str, J j8) {
        zzaer.zza();
        zzabr zzabrVar = new zzabr(yVar, str, null);
        zzabrVar.zza(gVar).zza((zzady<T, J>) j8);
        if (abstractC0640o != null) {
            zzabrVar.zza(abstractC0640o);
        }
        return zza(zzabrVar);
    }

    public final Task<T> zzb(g gVar, String str, String str2, String str3, String str4, J j8) {
        return zza((zzacp) new zzacp(str, str2, str3, str4).zza(gVar).zza((zzady<T, J>) j8));
    }

    public final Task<T> zza(g gVar, AbstractC0640o abstractC0640o, B b5, String str, String str2, J j8) {
        zzabr zzabrVar = new zzabr(b5, str, str2);
        zzabrVar.zza(gVar).zza((zzady<T, J>) j8);
        if (abstractC0640o != null) {
            zzabrVar.zza(abstractC0640o);
        }
        return zza(zzabrVar);
    }

    public final Task<T> zzb(g gVar, AbstractC0640o abstractC0640o, String str, E e7) {
        AbstractC1732v.i(gVar);
        AbstractC1732v.f(str);
        AbstractC1732v.i(abstractC0640o);
        AbstractC1732v.i(e7);
        ArrayList arrayList = ((C0693e) abstractC0640o).f6632f;
        if ((arrayList != null && !arrayList.contains(str)) || abstractC0640o.W()) {
            return Tasks.forException(zzadg.zza(new Status(17016, str, null, null)));
        }
        str.getClass();
        if (!str.equals("password")) {
            return zza((zzacx) new zzacx(str).zza(gVar).zza(abstractC0640o).zza((zzady<T, J>) e7).zza((InterfaceC0702n) e7));
        }
        return zza((zzacu) new zzacu().zza(gVar).zza(abstractC0640o).zza((zzady<T, J>) e7).zza((InterfaceC0702n) e7));
    }

    public final Task<C0641p> zza(g gVar, AbstractC0640o abstractC0640o, String str, E e7) {
        return zza((zzabq) new zzabq(str).zza(gVar).zza(abstractC0640o).zza((zzady<C0641p, J>) e7).zza((InterfaceC0702n) e7));
    }

    public final Task<Void> zza(String str, String str2, C0627b c0627b) {
        c0627b.f5792i = 7;
        return zza(new zzada(str, str2, c0627b));
    }

    public final Task<Void> zza(g gVar, String str, C0627b c0627b, String str2, String str3) {
        c0627b.f5792i = 1;
        return zza((zzaci) new zzaci(str, c0627b, str2, str3, "sendPasswordResetEmail").zza(gVar));
    }

    public final Task<zzagh> zza() {
        return zza(new zzabt());
    }

    public final Task<zzagm> zza(String str, String str2) {
        return zza(new zzabs(str, str2));
    }

    public final Task<T> zza(g gVar, AbstractC0640o abstractC0640o, AbstractC0629d abstractC0629d, String str, E e7) {
        AbstractC1732v.i(gVar);
        AbstractC1732v.i(abstractC0629d);
        AbstractC1732v.i(abstractC0640o);
        AbstractC1732v.i(e7);
        ArrayList arrayList = ((C0693e) abstractC0640o).f6632f;
        if (arrayList != null && arrayList.contains(abstractC0629d.V())) {
            return Tasks.forException(zzadg.zza(new Status(17015, null, null, null)));
        }
        if (abstractC0629d instanceof C0630e) {
            C0630e c0630e = (C0630e) abstractC0629d;
            if (TextUtils.isEmpty(c0630e.f5800c)) {
                return zza((zzabv) new zzabv(c0630e, str).zza(gVar).zza(abstractC0640o).zza((zzady<T, J>) e7).zza((InterfaceC0702n) e7));
            }
            return zza((zzabw) new zzabw(c0630e).zza(gVar).zza(abstractC0640o).zza((zzady<T, J>) e7).zza((InterfaceC0702n) e7));
        }
        if (abstractC0629d instanceof u) {
            zzaer.zza();
            return zza((zzabx) new zzabx((u) abstractC0629d).zza(gVar).zza(abstractC0640o).zza((zzady<T, J>) e7).zza((InterfaceC0702n) e7));
        }
        return zza((zzabu) new zzabu(abstractC0629d).zza(gVar).zza(abstractC0640o).zza((zzady<T, J>) e7).zza((InterfaceC0702n) e7));
    }

    public final Task<Void> zza(g gVar, AbstractC0640o abstractC0640o, C0630e c0630e, String str, E e7) {
        return zza((zzacb) new zzacb(c0630e, str).zza(gVar).zza(abstractC0640o).zza((zzady<Void, J>) e7).zza((InterfaceC0702n) e7));
    }

    public final Task<Void> zza(g gVar, AbstractC0640o abstractC0640o, String str, String str2, String str3, String str4, E e7) {
        return zza((zzacd) new zzacd(str, str2, str3, str4).zza(gVar).zza(abstractC0640o).zza((zzady<Void, J>) e7).zza((InterfaceC0702n) e7));
    }

    public final Task<Void> zza(g gVar, AbstractC0640o abstractC0640o, u uVar, String str, E e7) {
        zzaer.zza();
        return zza((zzacf) new zzacf(uVar, str).zza(gVar).zza(abstractC0640o).zza((zzady<Void, J>) e7).zza((InterfaceC0702n) e7));
    }

    public final Task<Void> zza(g gVar, AbstractC0640o abstractC0640o, E e7) {
        return zza((zzach) new zzach().zza(gVar).zza(abstractC0640o).zza((zzady<Void, J>) e7).zza((InterfaceC0702n) e7));
    }

    public final Task<Void> zza(String str, String str2, String str3, String str4) {
        return zza(new zzacg(str, str2, str3, str4));
    }

    public final Task<Void> zza(g gVar, C0627b c0627b, String str) {
        return zza((zzacj) new zzacj(str, c0627b).zza(gVar));
    }

    public final Task<Void> zza(String str) {
        return zza(new zzacl(str));
    }

    public final Task<T> zza(g gVar, J j8, String str) {
        return zza((zzack) new zzack(str).zza(gVar).zza((zzady<T, J>) j8));
    }

    public final Task<T> zza(g gVar, AbstractC0629d abstractC0629d, String str, J j8) {
        return zza((zzacn) new zzacn(abstractC0629d, str).zza(gVar).zza((zzady<T, J>) j8));
    }

    public final Task<T> zza(g gVar, String str, String str2, J j8) {
        return zza((zzacm) new zzacm(str, str2).zza(gVar).zza((zzady<T, J>) j8));
    }

    public final Task<T> zza(g gVar, C0630e c0630e, String str, J j8) {
        return zza((zzaco) new zzaco(c0630e, str).zza(gVar).zza((zzady<T, J>) j8));
    }

    public final Task<T> zza(g gVar, u uVar, String str, J j8) {
        zzaer.zza();
        return zza((zzacr) new zzacr(uVar, str).zza(gVar).zza((zzady<T, J>) j8));
    }

    public final Task<Void> zza(C0698j c0698j, String str, String str2, long j8, boolean z2, boolean z10, String str3, String str4, String str5, boolean z11, x xVar, Executor executor, Activity activity) {
        zzacq zzacqVar = new zzacq(c0698j, str, str2, j8, z2, z10, str3, str4, str5, z11);
        zzacqVar.zza(xVar, activity, executor, str);
        return zza(zzacqVar);
    }

    public final Task<zzahh> zza(C0698j c0698j, String str) {
        return zza(new zzact(c0698j, str));
    }

    public final Task<Void> zza(C0698j c0698j, z zVar, String str, long j8, boolean z2, boolean z10, String str2, String str3, String str4, boolean z11, x xVar, Executor executor, Activity activity) {
        String str5 = c0698j.f6653b;
        AbstractC1732v.f(str5);
        zzacs zzacsVar = new zzacs(zVar, str5, str, j8, z2, z10, str2, str3, str4, z11);
        zzacsVar.zza(xVar, activity, executor, zVar.f5833a);
        return zza(zzacsVar);
    }

    public final Task<Void> zza(g gVar, AbstractC0640o abstractC0640o, String str, String str2, E e7) {
        return zza((zzacv) new zzacv(((C0693e) abstractC0640o).f6627a.zzf(), str, str2).zza(gVar).zza(abstractC0640o).zza((zzady<Void, J>) e7).zza((InterfaceC0702n) e7));
    }

    public final Task<Void> zza(g gVar, AbstractC0640o abstractC0640o, u uVar, E e7) {
        zzaer.zza();
        return zza((zzacy) new zzacy(uVar).zza(gVar).zza(abstractC0640o).zza((zzady<Void, J>) e7).zza((InterfaceC0702n) e7));
    }

    public final Task<Void> zza(g gVar, AbstractC0640o abstractC0640o, F f10, E e7) {
        return zza((zzadb) new zzadb(f10).zza(gVar).zza(abstractC0640o).zza((zzady<Void, J>) e7).zza((InterfaceC0702n) e7));
    }

    public static C0693e zza(g gVar, zzage zzageVar) {
        AbstractC1732v.i(gVar);
        AbstractC1732v.i(zzageVar);
        ArrayList arrayList = new ArrayList();
        U u10 = new U();
        AbstractC1732v.f("firebase");
        String strZzi = zzageVar.zzi();
        AbstractC1732v.f(strZzi);
        u10.f6614a = strZzi;
        u10.f6615b = "firebase";
        u10.f6619f = zzageVar.zzh();
        u10.f6616c = zzageVar.zzg();
        Uri uriZzc = zzageVar.zzc();
        if (uriZzc != null) {
            u10.f6617d = uriZzc.toString();
            u10.f6618e = uriZzc;
        }
        u10.f6621h = zzageVar.zzm();
        u10.f6622i = null;
        u10.f6620g = zzageVar.zzj();
        arrayList.add(u10);
        List<zzagr> listZzl = zzageVar.zzl();
        if (listZzl != null && !listZzl.isEmpty()) {
            for (int i5 = 0; i5 < listZzl.size(); i5++) {
                zzagr zzagrVar = listZzl.get(i5);
                U u11 = new U();
                AbstractC1732v.i(zzagrVar);
                u11.f6614a = zzagrVar.zzd();
                String strZzf = zzagrVar.zzf();
                AbstractC1732v.f(strZzf);
                u11.f6615b = strZzf;
                u11.f6616c = zzagrVar.zzb();
                Uri uriZza = zzagrVar.zza();
                if (uriZza != null) {
                    u11.f6617d = uriZza.toString();
                    u11.f6618e = uriZza;
                }
                u11.f6619f = zzagrVar.zzc();
                u11.f6620g = zzagrVar.zze();
                u11.f6621h = false;
                u11.f6622i = zzagrVar.zzg();
                arrayList.add(u11);
            }
        }
        C0693e c0693e = new C0693e(gVar, arrayList);
        c0693e.f6635i = new C0695g(zzageVar.zzb(), zzageVar.zza());
        c0693e.f6636j = zzageVar.zzn();
        c0693e.k = zzageVar.zze();
        c0693e.Z(b.z0(zzageVar.zzk()));
        List listZzd = zzageVar.zzd();
        if (listZzd == null) {
            listZzd = new ArrayList();
        }
        c0693e.f6638m = listZzd;
        return c0693e;
    }

    public final void zza(g gVar, zzagz zzagzVar, x xVar, Activity activity, Executor executor) {
        zza((zzadc) new zzadc(zzagzVar).zza(gVar).zza(xVar, activity, executor, zzagzVar.zzd()));
    }
}
