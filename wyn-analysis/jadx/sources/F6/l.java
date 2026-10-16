package F6;

import A7.V;
import D6.C0395s;
import D6.InterfaceC0358a;
import G6.L;
import G6.M;
import G6.U;
import a.AbstractC1304a;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.Toolbar;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.zzbio;
import com.google.android.gms.internal.ads.zzbiv;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbyn;
import com.google.android.gms.internal.ads.zzbzh;
import com.google.android.gms.internal.ads.zzclb;
import com.google.android.gms.internal.ads.zzddm;
import com.google.android.gms.internal.ads.zzdlg;
import com.google.android.gms.internal.ads.zzdzs;
import com.google.android.gms.internal.ads.zzdzt;
import com.google.android.gms.internal.ads.zzela;
import com.google.android.gms.internal.ads.zzelb;
import com.google.android.gms.internal.ads.zzelt;
import com.google.android.gms.internal.ads.zzelv;
import com.google.android.gms.internal.ads.zzgui;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Collections;
import org.json.JSONException;
import q7.BinderC3877b;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public abstract class l extends zzbzh {

    /* renamed from: x, reason: collision with root package name */
    public static final int f3970x = Color.argb(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final Activity f3971a;

    /* renamed from: b, reason: collision with root package name */
    public AdOverlayInfoParcel f3972b;

    /* renamed from: c, reason: collision with root package name */
    public zzclb f3973c;

    /* renamed from: d, reason: collision with root package name */
    public Q1.n f3974d;

    /* renamed from: e, reason: collision with root package name */
    public q f3975e;

    /* renamed from: g, reason: collision with root package name */
    public FrameLayout f3977g;

    /* renamed from: h, reason: collision with root package name */
    public WebChromeClient.CustomViewCallback f3978h;
    public i k;

    /* renamed from: p, reason: collision with root package name */
    public V f3985p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3986q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3987r;

    /* renamed from: v, reason: collision with root package name */
    public Toolbar f3991v;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3976f = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3979i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3980j = false;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3981l = false;

    /* renamed from: w, reason: collision with root package name */
    public int f3992w = 1;

    /* renamed from: m, reason: collision with root package name */
    public int f3982m = 0;

    /* renamed from: n, reason: collision with root package name */
    public final Object f3983n = new Object();

    /* renamed from: o, reason: collision with root package name */
    public final f f3984o = new f(this);

    /* renamed from: s, reason: collision with root package name */
    public boolean f3988s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3989t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3990u = true;

    public l(Activity activity) {
        this.f3971a = activity;
    }

    public static final void V(View view, zzelv zzelvVar) {
        if (zzelvVar == null || view == null) {
            return;
        }
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzgs)).booleanValue() && zzelvVar.zzb()) {
            return;
        }
        C6.n.f1857D.f1884y.zzh(zzelvVar.zza(), view);
    }

    public final void R() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        o oVar;
        if (!this.f3971a.isFinishing() || this.f3988s) {
            return;
        }
        this.f3988s = true;
        zzclb zzclbVar = this.f3973c;
        if (zzclbVar != null) {
            zzclbVar.zzH(this.f3992w - 1);
            synchronized (this.f3983n) {
                try {
                    if (!this.f3986q && this.f3973c.zzaa()) {
                        zzbio zzbioVar = zzbix.zzgg;
                        C0395s c0395s = C0395s.f2489e;
                        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue() && !this.f3989t && (adOverlayInfoParcel = this.f3972b) != null && (oVar = adOverlayInfoParcel.f26310c) != null) {
                            oVar.zzdT();
                        }
                        V v2 = new V(this, 11);
                        this.f3985p = v2;
                        U.f4562l.postDelayed(v2, ((Long) c0395s.f2492c.zzd(zzbix.zzbO)).longValue());
                        return;
                    }
                } finally {
                }
            }
        }
        S();
    }

    public final void S() {
        zzclb zzclbVar;
        o oVar;
        if (this.f3989t) {
            return;
        }
        this.f3989t = true;
        zzclb zzclbVar2 = this.f3973c;
        if (zzclbVar2 != null) {
            this.k.removeView(zzclbVar2.zzE());
            Q1.n nVar = this.f3974d;
            if (nVar != null) {
                this.f3973c.zzai((Context) nVar.f9698d);
                this.f3973c.zzag(false);
                if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzor)).booleanValue() && this.f3973c.getParent() != null) {
                    ((ViewGroup) this.f3973c.getParent()).removeView(this.f3973c.zzE());
                }
                ViewGroup viewGroup = (ViewGroup) this.f3974d.f9697c;
                View viewZzE = this.f3973c.zzE();
                Q1.n nVar2 = this.f3974d;
                viewGroup.addView(viewZzE, nVar2.f9695a, (ViewGroup.LayoutParams) nVar2.f9696b);
                this.f3974d = null;
            } else {
                Activity activity = this.f3971a;
                if (activity.getApplicationContext() != null) {
                    this.f3973c.zzai(activity.getApplicationContext());
                }
            }
            this.f3973c = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f3972b;
        if (adOverlayInfoParcel != null && (oVar = adOverlayInfoParcel.f26310c) != null) {
            oVar.zzdU(this.f3992w);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f3972b;
        if (adOverlayInfoParcel2 == null || (zzclbVar = adOverlayInfoParcel2.f26311d) == null) {
            return;
        }
        V(this.f3972b.f26311d.zzE(), zzclbVar.zzU());
    }

    public final void T() {
        synchronized (this.f3983n) {
            try {
                this.f3986q = true;
                V v2 = this.f3985p;
                if (v2 != null) {
                    M m10 = U.f4562l;
                    m10.removeCallbacks(v2);
                    m10.post(this.f3985p);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void U(View view) {
        zzelv zzelvVarZzU;
        zzelt zzeltVarZzV;
        zzclb zzclbVar = this.f3973c;
        if (zzclbVar == null) {
            return;
        }
        zzbio zzbioVar = zzbix.zzgt;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue() && (zzeltVarZzV = zzclbVar.zzV()) != null) {
            zzeltVarZzV.zzf(view);
        } else if (((Boolean) c0395s.f2492c.zzd(zzbix.zzgs)).booleanValue() && (zzelvVarZzU = zzclbVar.zzU()) != null && zzelvVarZzU.zzb()) {
            C6.n.f1857D.f1884y.zzg(zzelvVarZzU.zza(), view);
        }
    }

    public final void W(boolean z2, boolean z10) throws JSONException {
        AdOverlayInfoParcel adOverlayInfoParcel;
        C6.g gVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        C6.g gVar2;
        zzbio zzbioVar = zzbix.zzbP;
        C0395s c0395s = C0395s.f2489e;
        boolean z11 = true;
        boolean z12 = ((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue() && (adOverlayInfoParcel2 = this.f3972b) != null && (gVar2 = adOverlayInfoParcel2.f26321o) != null && gVar2.f1838h;
        boolean z13 = ((Boolean) c0395s.f2492c.zzd(zzbix.zzbQ)).booleanValue() && (adOverlayInfoParcel = this.f3972b) != null && (gVar = adOverlayInfoParcel.f26321o) != null && gVar.f1839i;
        if (z2 && z10 && z12 && !z13) {
            new zzbyn(this.f3973c, "useCustomClose").zzg("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        q qVar = this.f3975e;
        if (qVar != null) {
            if (!z13 && (!z10 || z12)) {
                z11 = false;
            }
            ImageButton imageButton = qVar.f4008a;
            if (!z11) {
                imageButton.setVisibility(0);
                return;
            }
            imageButton.setVisibility(8);
            if (((Long) c0395s.f2492c.zzd(zzbix.zzbT)).longValue() > 0) {
                imageButton.animate().cancel();
                imageButton.clearAnimation();
            }
        }
    }

    public final void X(int i5, boolean z2) {
        if (!z2) {
            this.k.setBackgroundColor(-16777216);
            return;
        }
        this.k.setBackgroundColor(0);
        this.f3982m = i5;
        Window window = this.f3971a.getWindow();
        if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzbz)).booleanValue() || Build.VERSION.SDK_INT < 31 || window == null) {
            return;
        }
        window.setBackgroundBlurRadius(i5);
    }

    public final void Y(int i5) {
        Activity activity = this.f3971a;
        int i10 = activity.getApplicationInfo().targetSdkVersion;
        zzbio zzbioVar = zzbix.zzhb;
        C0395s c0395s = C0395s.f2489e;
        if (i10 >= ((Integer) c0395s.f2492c.zzd(zzbioVar)).intValue()) {
            if (activity.getApplicationInfo().targetSdkVersion <= ((Integer) c0395s.f2492c.zzd(zzbix.zzhc)).intValue()) {
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= ((Integer) c0395s.f2492c.zzd(zzbix.zzhd)).intValue()) {
                    if (i11 <= ((Integer) c0395s.f2492c.zzd(zzbix.zzhe)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            activity.setRequestedOrientation(i5);
        } catch (Throwable th) {
            C6.n.f1857D.f1868h.zzi(th, "AdOverlay.setRequestedOrientation");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzH(int i5, String[] strArr, int[] iArr) {
        if (i5 == 12345) {
            zzela zzelaVarZze = zzelb.zze();
            zzelaVarZze.zza(this.f3971a);
            zzelaVarZze.zzb(this.f3972b.k == 5 ? this : null);
            try {
                this.f3972b.f26328v.zzi(strArr, iArr, new BinderC3877b(zzelaVarZze.zze()));
            } catch (RemoteException unused) {
            }
        }
    }

    public final void zzb() {
        this.f3992w = 3;
        Activity activity = this.f3971a;
        activity.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f3972b;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.k != 5) {
            return;
        }
        activity.overridePendingTransition(0, 0);
        zzclb zzclbVar = this.f3973c;
        if (zzclbVar != null) {
            zzclbVar.zzae(null);
        }
    }

    public final void zzc() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.f3972b;
        if (adOverlayInfoParcel != null && this.f3976f) {
            Y(adOverlayInfoParcel.f26317j);
        }
        if (this.f3977g != null) {
            this.f3971a.setContentView(this.k);
            this.f3987r = true;
            this.f3977g.removeAllViews();
            this.f3977g = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.f3978h;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.f3978h = null;
        }
        this.f3976f = false;
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zze() {
        this.f3992w = 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzf() {
        o oVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f3972b;
        if (adOverlayInfoParcel == null || (oVar = adOverlayInfoParcel.f26310c) == null) {
            return;
        }
        oVar.zzdv();
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final boolean zzg() {
        this.f3992w = 1;
        if (this.f3973c == null) {
            return true;
        }
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzkv)).booleanValue() && this.f3973c.canGoBack()) {
            this.f3973c.goBack();
            return false;
        }
        boolean zZzZ = this.f3973c.zzZ();
        if (!zZzZ) {
            this.f3973c.zze("onbackblocked", Collections.EMPTY_MAP);
        }
        return zZzZ;
    }

    public void zzh(Bundle bundle) throws JSONException, h {
        o oVar;
        boolean z2 = this.f3987r;
        Activity activity = this.f3971a;
        if (!z2) {
            activity.requestWindowFeature(1);
        }
        this.f3979i = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            AdOverlayInfoParcel adOverlayInfoParcelV = AdOverlayInfoParcel.V(activity.getIntent());
            this.f3972b = adOverlayInfoParcelV;
            if (adOverlayInfoParcelV == null) {
                throw new h("Could not get info for ad overlay.");
            }
            if (adOverlayInfoParcelV.f26329w) {
                if (Build.VERSION.SDK_INT >= 28) {
                    activity.setShowWhenLocked(true);
                } else {
                    activity.getWindow().addFlags(524288);
                }
            }
            if (this.f3972b.f26319m.f4929c > 7500000) {
                this.f3992w = 4;
            }
            if (activity.getIntent() != null) {
                this.f3990u = activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.f3972b;
            C6.g gVar = adOverlayInfoParcel.f26321o;
            int i5 = adOverlayInfoParcel.k;
            if (gVar != null) {
                boolean z10 = gVar.f1831a;
                this.f3980j = z10;
                this.f3982m = (int) gVar.f1835e;
                if (z10) {
                    if (i5 != 5 && gVar.f1836f != -1) {
                        new j(this).zzb();
                    }
                }
            } else if (i5 == 5) {
                this.f3980j = true;
                if (i5 != 5) {
                    new j(this).zzb();
                }
            } else {
                this.f3980j = false;
            }
            if (bundle == null) {
                if (this.f3990u) {
                    zzddm zzddmVar = this.f3972b.f26326t;
                    if (zzddmVar != null) {
                        zzddmVar.zza();
                    }
                    o oVar2 = this.f3972b.f26310c;
                    if (oVar2 != null) {
                        oVar2.zzh();
                    }
                }
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.f3972b;
                if (adOverlayInfoParcel2.k != 1) {
                    InterfaceC0358a interfaceC0358a = adOverlayInfoParcel2.f26309b;
                    if (interfaceC0358a != null) {
                        interfaceC0358a.onAdClicked();
                    }
                    zzdlg zzdlgVar = this.f3972b.f26327u;
                    if (zzdlgVar != null) {
                        zzdlgVar.zzdu();
                    }
                }
            }
            AdOverlayInfoParcel adOverlayInfoParcel3 = this.f3972b;
            if (adOverlayInfoParcel3 != null && (oVar = adOverlayInfoParcel3.f26310c) != null) {
                oVar.zzdo();
            }
            AdOverlayInfoParcel adOverlayInfoParcel4 = this.f3972b;
            i iVar = new i(activity, adOverlayInfoParcel4.f26320n, adOverlayInfoParcel4.f26319m.f4927a, adOverlayInfoParcel4.f26325s);
            this.k = iVar;
            iVar.setId(1000);
            C6.n.f1857D.f1866f.e(activity);
            AdOverlayInfoParcel adOverlayInfoParcel5 = this.f3972b;
            int i10 = adOverlayInfoParcel5.k;
            if (i10 == 1) {
                zzy(false);
                return;
            }
            if (i10 == 2) {
                this.f3974d = new Q1.n(adOverlayInfoParcel5.f26311d);
                zzy(false);
            } else if (i10 == 3) {
                zzy(true);
            } else {
                if (i10 != 5) {
                    throw new h("Could not determine ad overlay type.");
                }
                zzy(false);
            }
        } catch (h e7) {
            String message = e7.getMessage();
            int i11 = L.f4523b;
            H6.l.f(message);
            this.f3992w = 4;
            activity.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzi() {
        o oVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f3972b;
        if (adOverlayInfoParcel == null || (oVar = adOverlayInfoParcel.f26310c) == null) {
            return;
        }
        oVar.zzdq();
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzj() {
        o oVar;
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzgh)).booleanValue()) {
            zzclb zzclbVar = this.f3973c;
            if (zzclbVar == null || zzclbVar.zzX()) {
                int i5 = L.f4523b;
                H6.l.f("The webview does not exist. Ignoring action.");
            } else {
                this.f3973c.onResume();
            }
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f3972b;
        if (adOverlayInfoParcel == null || (oVar = adOverlayInfoParcel.f26310c) == null) {
            return;
        }
        oVar.zzdp();
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzk() {
        int i5;
        C6.g gVar;
        o oVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f3972b;
        if (adOverlayInfoParcel != null && (oVar = adOverlayInfoParcel.f26310c) != null) {
            oVar.zzdx();
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f3972b;
        boolean z2 = (adOverlayInfoParcel2 == null || (gVar = adOverlayInfoParcel2.f26321o) == null || !gVar.f1837g) ? false : true;
        Window window = this.f3971a.getWindow();
        zzbio zzbioVar = zzbix.zzbV;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
            window.getDecorView().setSystemUiVisibility(true != z2 ? 5380 : 5894);
        } else {
            window.addFlags(Segment.SHARE_MINIMUM);
            window.clearFlags(2048);
            if (z2) {
                window.getDecorView().setSystemUiVisibility(4098);
            }
        }
        zzbio zzbioVar2 = zzbix.zzpe;
        zzbiv zzbivVar = c0395s.f2492c;
        if (((Boolean) zzbivVar.zzd(zzbioVar2)).booleanValue() && (i5 = Build.VERSION.SDK_INT) <= 34 && i5 >= 28) {
            window.getAttributes().layoutInDisplayCutoutMode = 1;
            AbstractC1304a.I(window, false);
        }
        if (((Boolean) zzbivVar.zzd(zzbix.zzgh)).booleanValue()) {
            return;
        }
        zzclb zzclbVar = this.f3973c;
        if (zzclbVar != null && !zzclbVar.zzX()) {
            this.f3973c.onResume();
        } else {
            int i10 = L.f4523b;
            H6.l.f("The webview does not exist. Ignoring action.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzl() {
        o oVar;
        zzc();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f3972b;
        if (adOverlayInfoParcel != null && (oVar = adOverlayInfoParcel.f26310c) != null) {
            oVar.zzdw();
        }
        if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzgh)).booleanValue() && this.f3973c != null && (!this.f3971a.isFinishing() || this.f3974d == null)) {
            this.f3973c.onPause();
        }
        R();
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzm(int i5, int i10, Intent intent) {
        zzdzt zzdztVarZzI;
        AdOverlayInfoParcel adOverlayInfoParcel;
        if (i5 == 236) {
            zzbio zzbioVar = zzbix.zzoP;
            C0395s c0395s = C0395s.f2489e;
            if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 66);
                sb2.append("Callback from intent launch with requestCode: 236 and resultCode: ");
                sb2.append(i10);
                L.k(sb2.toString());
                zzclb zzclbVar = this.f3973c;
                if (zzclbVar == null || zzclbVar.zzP() == null || (zzdztVarZzI = zzclbVar.zzP().zzI()) == null || (adOverlayInfoParcel = this.f3972b) == null || !((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
                    return;
                }
                zzdzs zzdzsVarZza = zzdztVarZzI.zza();
                zzdzsVarZza.zzc(HandleInvocationsFromAdViewer.KEY_ACTION, "hilca");
                zzdzsVarZza.zzc("gqi", zzgui.zza(adOverlayInfoParcel.f26323q));
                StringBuilder sb3 = new StringBuilder(String.valueOf(i10).length());
                sb3.append(i10);
                zzdzsVarZza.zzc("hilr", sb3.toString());
                if (i10 == -1 && intent != null) {
                    String stringExtra = intent.getStringExtra("callerPackage");
                    String stringExtra2 = intent.getStringExtra("loadingStage");
                    if (stringExtra != null) {
                        zzdzsVarZza.zzc("hilcp", stringExtra);
                    }
                    if (stringExtra2 != null) {
                        zzdzsVarZza.zzc("hills", stringExtra2);
                    }
                }
                zzdzsVarZza.zzf();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzo(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f3979i);
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzp() {
        o oVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f3972b;
        if (adOverlayInfoParcel != null && (oVar = adOverlayInfoParcel.f26310c) != null) {
            oVar.zzdy();
        }
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzgh)).booleanValue() && this.f3973c != null && (!this.f3971a.isFinishing() || this.f3974d == null)) {
            this.f3973c.onPause();
        }
        R();
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzq() {
        o oVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f3972b;
        if (adOverlayInfoParcel != null && (oVar = adOverlayInfoParcel.f26310c) != null) {
            oVar.zzdz();
        }
        zzclb zzclbVar = this.f3973c;
        if (zzclbVar != null) {
            try {
                this.k.removeView(zzclbVar.zzE());
            } catch (NullPointerException unused) {
            }
        }
        R();
    }

    public final void zzr(boolean z2) throws JSONException {
        if (this.f3972b.f26329w) {
            return;
        }
        zzbio zzbioVar = zzbix.zzgj;
        C0395s c0395s = C0395s.f2489e;
        int iIntValue = ((Integer) c0395s.f2492c.zzd(zzbioVar)).intValue();
        boolean z10 = ((Boolean) c0395s.f2492c.zzd(zzbix.zzbR)).booleanValue() || z2;
        p pVar = new p();
        pVar.f4004a = 0;
        pVar.f4005b = 0;
        pVar.f4006c = 0;
        pVar.f4007d = 50;
        pVar.f4004a = true != z10 ? 0 : iIntValue;
        pVar.f4005b = true != z10 ? iIntValue : 0;
        pVar.f4006c = iIntValue;
        this.f3975e = new q(this.f3971a, pVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z10 ? 9 : 11);
        W(z2, this.f3972b.f26314g);
        this.k.addView(this.f3975e, layoutParams);
        U(this.f3975e);
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzs() {
        this.f3987r = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzy(boolean r48) throws org.json.JSONException, F6.h {
        /*
            Method dump skipped, instructions count: 878
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: F6.l.zzy(boolean):void");
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzn(InterfaceC3876a interfaceC3876a) {
    }
}
