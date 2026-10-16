package com.google.android.gms.internal.p002firebaseauthapi;

import J8.AbstractC0629d;
import J8.AbstractC0640o;
import J8.x;
import K8.InterfaceC0702n;
import android.app.Activity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC1699m;
import com.google.android.gms.common.api.internal.InterfaceC1700n;
import com.google.android.gms.common.internal.AbstractC1732v;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import s8.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class zzady<ResultT, CallbackT> implements zzaek<ResultT> {
    protected final int zza;
    protected g zzc;
    protected AbstractC0640o zzd;
    protected CallbackT zze;
    protected InterfaceC0702n zzf;
    protected zzadw<ResultT> zzg;
    protected Executor zzi;
    protected zzagl zzj;
    protected zzage zzk;
    protected zzafl zzl;
    protected zzagv zzm;
    protected AbstractC0629d zzn;
    protected String zzo;
    protected String zzp;
    protected zzzl zzq;
    protected zzagm zzr;
    protected zzagh zzs;
    protected zzahh zzt;
    private boolean zzu;
    protected final zzaea zzb = new zzaea(this);
    protected final List<x> zzh = new ArrayList();

    public static class zza extends AbstractC1699m {
        private final List<x> zza;

        private zza(InterfaceC1700n interfaceC1700n, List<x> list) {
            super(interfaceC1700n);
            this.mLifecycleFragment.g("PhoneAuthActivityStopCallback", this);
            this.zza = list;
        }

        public static void zza(Activity activity, List<x> list) {
            InterfaceC1700n fragment = AbstractC1699m.getFragment(activity);
            if (((zza) fragment.j(zza.class, "PhoneAuthActivityStopCallback")) == null) {
                new zza(fragment, list);
            }
        }

        @Override // com.google.android.gms.common.api.internal.AbstractC1699m
        public void onStop() {
            synchronized (this.zza) {
                this.zza.clear();
            }
        }
    }

    public zzady(int i5) {
        this.zza = i5;
    }

    public abstract void zzb();

    public final void zzb(ResultT resultt) {
        this.zzu = true;
        this.zzg.zza(resultt, null);
    }

    public final zzady<ResultT, CallbackT> zza(CallbackT callbackt) {
        AbstractC1732v.j(callbackt, "external callback cannot be null");
        this.zze = callbackt;
        return this;
    }

    public final zzady<ResultT, CallbackT> zza(InterfaceC0702n interfaceC0702n) {
        AbstractC1732v.j(interfaceC0702n, "external failure callback cannot be null");
        this.zzf = interfaceC0702n;
        return this;
    }

    public final zzady<ResultT, CallbackT> zza(g gVar) {
        AbstractC1732v.j(gVar, "firebaseApp cannot be null");
        this.zzc = gVar;
        return this;
    }

    public final zzady<ResultT, CallbackT> zza(AbstractC0640o abstractC0640o) {
        AbstractC1732v.j(abstractC0640o, "firebaseUser cannot be null");
        this.zzd = abstractC0640o;
        return this;
    }

    public final zzady<ResultT, CallbackT> zza(x xVar, Activity activity, Executor executor, String str) {
        x xVarZza = zzaer.zza(str, xVar, this);
        synchronized (this.zzh) {
            List<x> list = this.zzh;
            AbstractC1732v.i(xVarZza);
            list.add(xVarZza);
        }
        if (activity != null) {
            zza.zza(activity, this.zzh);
        }
        AbstractC1732v.i(executor);
        this.zzi = executor;
        return this;
    }

    public static /* synthetic */ void zza(zzady zzadyVar) {
        zzadyVar.zzb();
        AbstractC1732v.k("no success or failure set on method implementation", zzadyVar.zzu);
    }

    public static /* synthetic */ void zza(zzady zzadyVar, Status status) {
        InterfaceC0702n interfaceC0702n = zzadyVar.zzf;
        if (interfaceC0702n != null) {
            interfaceC0702n.zza(status);
        }
    }

    public final void zza(Status status) {
        this.zzu = true;
        this.zzg.zza(null, status);
    }
}
