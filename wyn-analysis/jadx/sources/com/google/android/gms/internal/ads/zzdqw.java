package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
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
public final class zzdqw extends zzbmo implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzdry {
    public static final zzgwt zza = zzgwt.zzl("2011", "1009", "3010");
    private final String zzb;
    private FrameLayout zzd;
    private FrameLayout zze;
    private final zzhcp zzf;
    private View zzg;
    private zzdpw zzi;
    private zzbez zzj;
    private zzbmi zzl;
    private boolean zzm;
    private GestureDetector zzo;
    private Map zzc = new HashMap();
    private InterfaceC3876a zzk = null;
    private boolean zzn = false;
    private final int zzh = 261710000;

    public zzdqw(FrameLayout frameLayout, FrameLayout frameLayout2, int i5) {
        String str;
        this.zzd = frameLayout;
        this.zze = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.zzb = str;
        C6.n nVar = C6.n.f1857D;
        zzcgl zzcglVar = nVar.f1860C;
        zzcgl.zza(frameLayout, this);
        zzcgl zzcglVar2 = nVar.f1860C;
        zzcgl.zzb(frameLayout, this);
        this.zzf = zzcfy.zzf;
        this.zzj = new zzbez(this.zzd.getContext(), this.zzd);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    private final synchronized void zzs() {
        if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zznj)).booleanValue() || this.zzi.zzG() == 0) {
            return;
        }
        this.zzo = new GestureDetector(this.zzd.getContext(), new zzdre(this.zzi, this));
    }

    private final synchronized void zzt() {
        this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdqv
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzr();
            }
        });
    }

    private final synchronized void zzu(String str) {
        DisplayMetrics displayMetrics;
        try {
            View frameLayout = new FrameLayout(this.zze.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            Context context = this.zze.getContext();
            frameLayout.setClickable(false);
            frameLayout.setFocusable(false);
            if (!TextUtils.isEmpty(str)) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                Resources resources = context.getResources();
                if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                    try {
                        byte[] bArrDecode = Base64.decode(str, 0);
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
                        bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                        bitmapDrawable.setTileModeXY(tileMode, tileMode);
                        frameLayout.setBackground(bitmapDrawable);
                    } catch (IllegalArgumentException e7) {
                        H6.l.g("Encountered invalid base64 watermark.", e7);
                    }
                }
            }
            this.zze.addView(frameLayout);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        zzdpw zzdpwVar = this.zzi;
        if (zzdpwVar == null || !zzdpwVar.zzH()) {
            return;
        }
        this.zzi.zzz();
        this.zzi.zzi(view, this.zzd, zzi(), zzj(), false);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        zzdpw zzdpwVar = this.zzi;
        if (zzdpwVar != null) {
            FrameLayout frameLayout = this.zzd;
            zzdpwVar.zzu(frameLayout, zzi(), zzj(), zzdpw.zzI(frameLayout));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        zzdpw zzdpwVar = this.zzi;
        if (zzdpwVar != null) {
            FrameLayout frameLayout = this.zzd;
            zzdpwVar.zzu(frameLayout, zzi(), zzj(), zzdpw.zzI(frameLayout));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        zzdpw zzdpwVar = this.zzi;
        if (zzdpwVar != null) {
            zzdpwVar.zzk(view, motionEvent, this.zzd);
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zznj)).booleanValue() && this.zzo != null && this.zzi.zzG() != 0) {
                this.zzo.onTouchEvent(motionEvent);
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final synchronized void zzb(String str, InterfaceC3876a interfaceC3876a) {
        zzh(str, (View) BinderC3877b.S(interfaceC3876a), true);
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final synchronized InterfaceC3876a zzc(String str) {
        return new BinderC3877b(zzl(str));
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final synchronized void zzd(InterfaceC3876a interfaceC3876a) {
        if (this.zzn) {
            return;
        }
        Object objS = BinderC3877b.S(interfaceC3876a);
        if (!(objS instanceof zzdpw)) {
            int i5 = G6.L.f4523b;
            H6.l.f("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        zzdpw zzdpwVar = this.zzi;
        if (zzdpwVar != null) {
            zzdpwVar.zzh(this);
        }
        zzt();
        zzdpw zzdpwVar2 = (zzdpw) objS;
        this.zzi = zzdpwVar2;
        zzdpwVar2.zzg(this);
        this.zzi.zzN(this.zzd);
        this.zzi.zzO(this.zze);
        if (this.zzm) {
            this.zzi.zzP().zzb(this.zzl);
        }
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzeV)).booleanValue() && !TextUtils.isEmpty(this.zzi.zzK())) {
            zzu(this.zzi.zzK());
        }
        zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzdry
    public final FrameLayout zzdA() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final synchronized void zzdB(InterfaceC3876a interfaceC3876a) {
        this.zzi.zzx((View) BinderC3877b.S(interfaceC3876a));
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final synchronized void zzdC(InterfaceC3876a interfaceC3876a) {
        if (this.zzn) {
            return;
        }
        this.zzk = interfaceC3876a;
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final void zzdD(InterfaceC3876a interfaceC3876a) {
        onTouch(this.zzd, (MotionEvent) BinderC3877b.S(interfaceC3876a));
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final synchronized void zzdE(zzbmi zzbmiVar) {
        if (!this.zzn) {
            this.zzm = true;
            this.zzl = zzbmiVar;
            zzdpw zzdpwVar = this.zzi;
            if (zzdpwVar != null) {
                zzdpwVar.zzP().zzb(zzbmiVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdry
    public final /* synthetic */ View zzdF() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final synchronized void zze() {
        try {
            if (this.zzn) {
                return;
            }
            zzdpw zzdpwVar = this.zzi;
            if (zzdpwVar != null) {
                zzdpwVar.zzh(this);
                this.zzi = null;
            }
            this.zzc.clear();
            this.zzd.removeAllViews();
            this.zze.removeAllViews();
            this.zzc = null;
            this.zzd = null;
            this.zze = null;
            this.zzg = null;
            this.zzj = null;
            this.zzn = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final synchronized void zzf(InterfaceC3876a interfaceC3876a, int i5) {
    }

    @Override // com.google.android.gms.internal.ads.zzdry
    public final zzbez zzg() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzdry
    public final synchronized void zzh(String str, View view, boolean z2) {
        if (!this.zzn) {
            if (view == null) {
                this.zzc.remove(str);
                return;
            }
            this.zzc.put(str, new WeakReference(view));
            if (!"1098".equals(str) && !"3011".equals(str)) {
                if (Fe.g.O(this.zzh)) {
                    view.setOnTouchListener(this);
                }
                view.setClickable(true);
                view.setOnClickListener(this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdry
    public final synchronized Map zzi() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdry
    public final synchronized Map zzj() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdry
    public final synchronized Map zzk() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdry
    public final synchronized View zzl(String str) {
        WeakReference weakReference;
        if (!this.zzn && (weakReference = (WeakReference) this.zzc.get(str)) != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdry
    public final synchronized String zzm() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdry
    public final InterfaceC3876a zzn() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzdry
    public final synchronized JSONObject zzo() {
        zzdpw zzdpwVar = this.zzi;
        if (zzdpwVar == null) {
            return null;
        }
        return zzdpwVar.zzv(this.zzd, zzi(), zzj());
    }

    @Override // com.google.android.gms.internal.ads.zzdry
    public final synchronized JSONObject zzp() {
        zzdpw zzdpwVar = this.zzi;
        if (zzdpwVar == null) {
            return null;
        }
        return zzdpwVar.zzw(this.zzd, zzi(), zzj());
    }

    public final FrameLayout zzq() {
        return this.zzd;
    }

    public final /* synthetic */ void zzr() {
        if (this.zzg == null) {
            View view = new View(this.zzd.getContext());
            this.zzg = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        }
        if (this.zzd != this.zzg.getParent()) {
            this.zzd.addView(this.zzg);
        }
    }
}
