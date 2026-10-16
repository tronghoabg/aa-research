package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import q7.BinderC3877b;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public final class zzdqu extends zzbmt implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzdry {
    private final WeakReference zza;
    private final Map zzb = new HashMap();
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();
    private zzdpw zze;
    private zzbez zzf;

    public zzdqu(View view, HashMap map, HashMap map2) {
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        C6.n nVar = C6.n.f1857D;
        zzcgl zzcglVar = nVar.f1860C;
        zzcgl.zza(view, this);
        zzcgl zzcglVar2 = nVar.f1860C;
        zzcgl.zzb(view, this);
        this.zza = new WeakReference(view);
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            View view2 = (View) entry.getValue();
            if (view2 != null) {
                this.zzb.put(str, new WeakReference(view2));
                if (!"1098".equals(str) && !"3011".equals(str)) {
                    view2.setOnTouchListener(this);
                    view2.setClickable(true);
                    view2.setOnClickListener(this);
                }
            }
        }
        this.zzd.putAll(this.zzb);
        for (Map.Entry entry2 : map2.entrySet()) {
            View view3 = (View) entry2.getValue();
            if (view3 != null) {
                this.zzc.put((String) entry2.getKey(), new WeakReference(view3));
                view3.setOnTouchListener(this);
                view3.setClickable(false);
            }
        }
        this.zzd.putAll(this.zzc);
        this.zzf = new zzbez(view.getContext(), view);
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        zzdpw zzdpwVar = this.zze;
        if (zzdpwVar != null) {
            zzdpwVar.zzi(view, zzdF(), zzi(), zzj(), true);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        zzdpw zzdpwVar = this.zze;
        if (zzdpwVar != null) {
            zzdpwVar.zzu(zzdF(), zzi(), zzj(), zzdpw.zzI(zzdF()));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        zzdpw zzdpwVar = this.zze;
        if (zzdpwVar != null) {
            zzdpwVar.zzu(zzdF(), zzi(), zzj(), zzdpw.zzI(zzdF()));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        zzdpw zzdpwVar = this.zze;
        if (zzdpwVar != null) {
            zzdpwVar.zzk(view, motionEvent, zzdF());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbmu
    public final synchronized void zzb(InterfaceC3876a interfaceC3876a) {
        Object objS = BinderC3877b.S(interfaceC3876a);
        if (!(objS instanceof zzdpw)) {
            int i5 = G6.L.f4523b;
            H6.l.f("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        zzdpw zzdpwVar = this.zze;
        if (zzdpwVar != null) {
            zzdpwVar.zzh(this);
        }
        zzdpw zzdpwVar2 = (zzdpw) objS;
        if (!zzdpwVar2.zzJ()) {
            int i10 = G6.L.f4523b;
            H6.l.c("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
        } else {
            this.zze = zzdpwVar2;
            zzdpwVar2.zzg(this);
            this.zze.zzN(zzdF());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmu
    public final synchronized void zzc() {
        zzdpw zzdpwVar = this.zze;
        if (zzdpwVar != null) {
            zzdpwVar.zzh(this);
            this.zze = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmu
    public final synchronized void zzd(InterfaceC3876a interfaceC3876a) {
        try {
            if (this.zze != null) {
                Object objS = BinderC3877b.S(interfaceC3876a);
                if (!(objS instanceof View)) {
                    int i5 = G6.L.f4523b;
                    H6.l.f("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
                }
                this.zze.zzx((View) objS);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdry
    public final FrameLayout zzdA() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdry
    public final View zzdF() {
        return (View) this.zza.get();
    }

    @Override // com.google.android.gms.internal.ads.zzdry
    public final zzbez zzg() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzdry
    public final synchronized void zzh(String str, View view, boolean z2) {
        this.zzd.put(str, new WeakReference(view));
        if (!"1098".equals(str) && !"3011".equals(str)) {
            this.zzb.put(str, new WeakReference(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdry
    public final synchronized Map zzi() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzdry
    public final synchronized Map zzj() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdry
    public final synchronized Map zzk() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdry
    public final synchronized View zzl(String str) {
        WeakReference weakReference = (WeakReference) this.zzd.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.google.android.gms.internal.ads.zzdry
    public final synchronized String zzm() {
        return "1007";
    }

    @Override // com.google.android.gms.internal.ads.zzdry
    public final synchronized InterfaceC3876a zzn() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdry
    public final synchronized JSONObject zzo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdry
    public final synchronized JSONObject zzp() {
        zzdpw zzdpwVar = this.zze;
        if (zzdpwVar == null) {
            return null;
        }
        return zzdpwVar.zzw(zzdF(), zzi(), zzj());
    }
}
