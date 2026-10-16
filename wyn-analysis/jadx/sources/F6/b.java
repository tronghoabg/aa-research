package F6;

import A7.V;
import D6.C0395s;
import D6.InterfaceC0358a;
import G6.L;
import G6.U;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.zzbfr;
import com.google.android.gms.internal.ads.zzbio;
import com.google.android.gms.internal.ads.zzbiv;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbzh;
import com.google.android.gms.internal.ads.zzdlg;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public final class b extends zzbzh implements zzbfr {

    /* renamed from: a, reason: collision with root package name */
    public final AdOverlayInfoParcel f3944a;

    /* renamed from: b, reason: collision with root package name */
    public final Activity f3945b;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3949f;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3946c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3947d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3948e = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3950g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3951h = false;

    public b(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        e eVar;
        boolean z2 = false;
        this.f3944a = adOverlayInfoParcel;
        this.f3945b = activity;
        zzbio zzbioVar = zzbix.zzfQ;
        C0395s c0395s = C0395s.f2489e;
        boolean zBooleanValue = ((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue();
        zzbiv zzbivVar = c0395s.f2492c;
        if ((zBooleanValue || ((Boolean) zzbivVar.zzd(zzbix.zzfR)).booleanValue() || ((Boolean) zzbivVar.zzd(zzbix.zzfV)).booleanValue()) && (eVar = adOverlayInfoParcel.f26308a) != null && eVar.f3962j && Build.MANUFACTURER.matches((String) zzbivVar.zzd(zzbix.zzfT)) && Build.MODEL.matches((String) zzbivVar.zzd(zzbix.zzfU))) {
            z2 = true;
        }
        this.f3949f = z2;
    }

    public final synchronized void R() {
        try {
            if (!this.f3947d) {
                o oVar = this.f3944a.f26310c;
                if (oVar != null) {
                    oVar.zzdU(4);
                }
                this.f3947d = true;
                if (this.f3949f) {
                    if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzfV)).booleanValue()) {
                        C6.n.f1857D.f1867g.zzc(this);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfr
    public final void zza(boolean z2) {
        if (!z2) {
            this.f3951h = true;
        } else if (this.f3951h) {
            int i5 = L.f4523b;
            H6.l.a("Foregrounded: finishing activity from LauncherOverlay");
            this.f3945b.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzf() {
        o oVar = this.f3944a.f26310c;
        if (oVar != null) {
            oVar.zzdv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final boolean zzg() {
        return ((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzfR)).booleanValue() && this.f3949f && this.f3950g;
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzh(Bundle bundle) {
        o oVar;
        zzbio zzbioVar = zzbix.zzkt;
        C0395s c0395s = C0395s.f2489e;
        boolean zBooleanValue = ((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue();
        Activity activity = this.f3945b;
        if (zBooleanValue && !this.f3948e) {
            activity.requestWindowFeature(1);
        }
        boolean z2 = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z2 = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f3944a;
        if (adOverlayInfoParcel == null) {
            activity.finish();
            return;
        }
        if (z2) {
            activity.finish();
            return;
        }
        if (bundle == null) {
            InterfaceC0358a interfaceC0358a = adOverlayInfoParcel.f26309b;
            if (interfaceC0358a != null) {
                interfaceC0358a.onAdClicked();
            }
            zzdlg zzdlgVar = adOverlayInfoParcel.f26327u;
            if (zzdlgVar != null) {
                zzdlgVar.zzdu();
            }
            if (activity.getIntent() != null && activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (oVar = adOverlayInfoParcel.f26310c) != null) {
                oVar.zzh();
            }
        }
        if (this.f3949f) {
            if (((Boolean) c0395s.f2492c.zzd(zzbix.zzfV)).booleanValue()) {
                C6.n.f1857D.f1867g.zzb(this);
            }
        }
        ya.b bVar = C6.n.f1857D.f1861a;
        e eVar = adOverlayInfoParcel.f26308a;
        a aVar = eVar.f3961i;
        c cVar = adOverlayInfoParcel.f26316i;
        Activity activity2 = this.f3945b;
        if (ya.b.b(activity2, eVar, cVar, aVar, null, "")) {
            return;
        }
        activity2.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzk() {
        if (this.f3946c) {
            L.k("LauncherOverlay finishing activity");
            this.f3945b.finish();
            return;
        }
        this.f3946c = true;
        this.f3950g = true;
        o oVar = this.f3944a.f26310c;
        if (oVar != null) {
            oVar.zzdx();
        }
        if (this.f3949f) {
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzfQ)).booleanValue()) {
                U.f4562l.postDelayed(new V(this, 10), ((Integer) r1.f2492c.zzd(zzbix.zzfS)).intValue());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzl() {
        this.f3950g = false;
        o oVar = this.f3944a.f26310c;
        if (oVar != null) {
            oVar.zzdw();
        }
        if (this.f3945b.isFinishing()) {
            R();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzo(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f3946c);
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzp() {
        if (this.f3945b.isFinishing()) {
            R();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzq() {
        if (this.f3945b.isFinishing()) {
            R();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzs() {
        this.f3948e = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzi() {
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzj() {
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzn(InterfaceC3876a interfaceC3876a) {
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzH(int i5, String[] strArr, int[] iArr) {
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzm(int i5, int i10, Intent intent) {
    }
}
