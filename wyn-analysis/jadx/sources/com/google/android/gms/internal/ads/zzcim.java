package com.google.android.gms.internal.ads;

import D6.C0395s;
import G6.U;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import ka.AbstractC3256n;
import org.apache.tika.metadata.TikaCoreProperties;

/* loaded from: classes3.dex */
public final class zzcim extends zzcha implements TextureView.SurfaceTextureListener, zzchk {
    private final zzchu zzc;
    private final zzchv zzd;
    private final zzcht zze;
    private final zzdzt zzf;
    private zzcgz zzg;
    private Surface zzh;
    private zzchl zzi;
    private String zzj;
    private String[] zzk;
    private boolean zzl;
    private int zzm;
    private zzchs zzn;
    private final boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private int zzr;
    private int zzs;
    private float zzt;

    public zzcim(Context context, zzchv zzchvVar, zzchu zzchuVar, boolean z2, boolean z10, zzcht zzchtVar, zzdzt zzdztVar) {
        super(context);
        this.zzm = 1;
        this.zzc = zzchuVar;
        this.zzd = zzchvVar;
        this.zzo = z2;
        this.zze = zzchtVar;
        zzchvVar.zza(this);
        this.zzf = zzdztVar;
    }

    private final boolean zzT() {
        zzchl zzchlVar = this.zzi;
        return (zzchlVar == null || !zzchlVar.zzB() || this.zzl) ? false : true;
    }

    private final boolean zzU() {
        return zzT() && this.zzm != 1;
    }

    private final void zzV(boolean z2, Integer num) {
        zzchl zzchlVar = this.zzi;
        if (zzchlVar != null && !z2) {
            zzchlVar.zzn(num);
            return;
        }
        if (this.zzj == null || this.zzh == null) {
            return;
        }
        if (z2) {
            if (!zzT()) {
                int i5 = G6.L.f4523b;
                H6.l.f("No valid ExoPlayerAdapter exists when switch source.");
                return;
            } else {
                zzchlVar.zzw();
                zzW();
            }
        }
        if (this.zzj.startsWith("cache:")) {
            zzcjh zzcjhVarZzr = this.zzc.zzr(this.zzj);
            if (zzcjhVarZzr instanceof zzcjq) {
                zzchl zzchlVarZza = ((zzcjq) zzcjhVarZzr).zza();
                this.zzi = zzchlVarZza;
                zzchlVarZza.zzn(num);
                if (!this.zzi.zzB()) {
                    int i10 = G6.L.f4523b;
                    H6.l.f("Precached video player has been released.");
                    return;
                }
            } else {
                if (!(zzcjhVarZzr instanceof zzcjn)) {
                    String strValueOf = String.valueOf(this.zzj);
                    int i11 = G6.L.f4523b;
                    H6.l.f("Stream cache miss: ".concat(strValueOf));
                    return;
                }
                zzcjn zzcjnVar = (zzcjn) zzcjhVarZzr;
                String strZzF = zzF();
                ByteBuffer byteBufferZzu = zzcjnVar.zzu();
                boolean zZzt = zzcjnVar.zzt();
                String strZzs = zzcjnVar.zzs();
                if (strZzs == null) {
                    int i12 = G6.L.f4523b;
                    H6.l.f("Stream cache URL is null.");
                    return;
                } else {
                    zzchl zzchlVarZzE = zzE(num);
                    this.zzi = zzchlVarZzE;
                    zzchlVarZzE.zzr(new Uri[]{Uri.parse(strZzs)}, strZzF, byteBufferZzu, zZzt);
                }
            }
        } else {
            this.zzi = zzE(num);
            String strZzF2 = zzF();
            Uri[] uriArr = new Uri[this.zzk.length];
            int i13 = 0;
            while (true) {
                String[] strArr = this.zzk;
                if (i13 >= strArr.length) {
                    break;
                }
                uriArr[i13] = Uri.parse(strArr[i13]);
                i13++;
            }
            this.zzi.zzq(uriArr, strZzF2);
        }
        this.zzi.zzs(this);
        zzX(this.zzh, false);
        if (this.zzi.zzB()) {
            int iZzC = this.zzi.zzC();
            this.zzm = iZzC;
            if (iZzC == 3) {
                zzY();
            }
        }
    }

    private final void zzW() {
        if (this.zzi != null) {
            zzX(null, true);
            zzchl zzchlVar = this.zzi;
            if (zzchlVar != null) {
                zzchlVar.zzs(null);
                this.zzi.zzt();
                this.zzi = null;
            }
            this.zzm = 1;
            this.zzl = false;
            this.zzp = false;
            this.zzq = false;
        }
    }

    private final void zzX(Surface surface, boolean z2) {
        zzchl zzchlVar = this.zzi;
        if (zzchlVar == null) {
            int i5 = G6.L.f4523b;
            H6.l.f("Trying to set surface before player is initialized.");
            return;
        }
        try {
            zzchlVar.zzu(surface, z2);
        } catch (IOException e7) {
            int i10 = G6.L.f4523b;
            H6.l.g("", e7);
        }
    }

    private final void zzY() {
        if (this.zzp) {
            return;
        }
        this.zzp = true;
        U.f4562l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchz
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzH();
            }
        });
        zzq();
        this.zzd.zzb();
        if (this.zzq) {
            zze();
        }
    }

    private static String zzZ(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb2 = new StringBuilder(str.length() + 1 + length + 1 + String.valueOf(message).length());
        AbstractC3256n.p(sb2, str, "/", canonicalName, TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
        sb2.append(message);
        return sb2.toString();
    }

    private final void zzaa() {
        zzab(this.zzr, this.zzs);
    }

    private final void zzab(int i5, int i10) {
        float f10 = i10 > 0 ? i5 / i10 : 1.0f;
        if (this.zzt != f10) {
            this.zzt = f10;
            requestLayout();
        }
    }

    private final void zzac() {
        zzchl zzchlVar = this.zzi;
        if (zzchlVar != null) {
            zzchlVar.zzM(true);
        }
    }

    private final void zzad() {
        zzchl zzchlVar = this.zzi;
        if (zzchlVar != null) {
            zzchlVar.zzM(false);
        }
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setSurfaceTextureListener(this);
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i10) {
        super.onMeasure(i5, i10);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f10 = this.zzt;
        if (f10 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && this.zzn == null) {
            float f11 = measuredWidth;
            float f12 = f11 / measuredHeight;
            if (f10 > f12) {
                measuredHeight = (int) (f11 / f10);
            }
            if (f10 < f12) {
                measuredWidth = (int) (measuredHeight * f10);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        zzchs zzchsVar = this.zzn;
        if (zzchsVar != null) {
            zzchsVar.zzc(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i5, int i10) {
        zzdzt zzdztVar;
        if (this.zzo) {
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzoW)).booleanValue() && (zzdztVar = this.zzf) != null) {
                zzdzs zzdzsVarZza = zzdztVar.zza();
                zzdzsVarZza.zzc(HandleInvocationsFromAdViewer.KEY_ACTION, "svp_aepv");
                zzdzsVarZza.zzd();
            }
            zzchs zzchsVar = new zzchs(getContext());
            this.zzn = zzchsVar;
            zzchsVar.zzb(surfaceTexture, i5, i10);
            zzchs zzchsVar2 = this.zzn;
            zzchsVar2.start();
            SurfaceTexture surfaceTextureZze = zzchsVar2.zze();
            if (surfaceTextureZze != null) {
                surfaceTexture = surfaceTextureZze;
            } else {
                this.zzn.zzd();
                this.zzn = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.zzh = surface;
        if (this.zzi == null) {
            zzV(false, null);
        } else {
            zzX(surface, true);
            if (!this.zze.zza) {
                zzac();
            }
        }
        if (this.zzr == 0 || this.zzs == 0) {
            zzab(i5, i10);
        } else {
            zzaa();
        }
        U.f4562l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcig
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzM();
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzf();
        zzchs zzchsVar = this.zzn;
        if (zzchsVar != null) {
            zzchsVar.zzd();
            this.zzn = null;
        }
        if (this.zzi != null) {
            zzad();
            Surface surface = this.zzh;
            if (surface != null) {
                surface.release();
            }
            this.zzh = null;
            zzX(null, true);
        }
        U.f4562l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcii
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzO();
            }
        });
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i5, final int i10) {
        zzchs zzchsVar = this.zzn;
        if (zzchsVar != null) {
            zzchsVar.zzc(i5, i10);
        }
        U.f4562l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcih
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzN(i5, i10);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zzd.zzd(this);
        this.zza.zzb(surfaceTexture, this.zzg);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(final int i5) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i5).length() + 46);
        sb2.append("AdExoPlayerView3 window visibility changed to ");
        sb2.append(i5);
        G6.L.k(sb2.toString());
        U.f4562l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcij
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzP(i5);
            }
        });
        super.onWindowVisibilityChanged(i5);
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final void zzA(int i5) {
        zzchl zzchlVar = this.zzi;
        if (zzchlVar != null) {
            zzchlVar.zzy(i5);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final void zzB(int i5) {
        zzchl zzchlVar = this.zzi;
        if (zzchlVar != null) {
            zzchlVar.zzz(i5);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final void zzC(int i5) {
        zzchl zzchlVar = this.zzi;
        if (zzchlVar != null) {
            zzchlVar.zzA(i5);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    public final void zzD() {
        U.f4562l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcib
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzS();
            }
        });
    }

    public final zzchl zzE(Integer num) {
        zzcht zzchtVar = this.zze;
        zzchu zzchuVar = this.zzc;
        zzckj zzckjVar = new zzckj(zzchuVar.getContext(), zzchtVar, zzchuVar, num);
        int i5 = G6.L.f4523b;
        H6.l.e("ExoPlayerAdapter initialized.");
        return zzckjVar;
    }

    public final String zzF() {
        zzchu zzchuVar = this.zzc;
        return C6.n.f1857D.f1863c.E(zzchuVar.getContext(), zzchuVar.zzs().f4927a);
    }

    public final /* synthetic */ void zzG() {
        float fZzc = this.zzb.zzc();
        zzchl zzchlVar = this.zzi;
        if (zzchlVar == null) {
            int i5 = G6.L.f4523b;
            H6.l.f("Trying to set volume before player is initialized.");
            return;
        }
        try {
            zzchlVar.zzv(fZzc, false);
        } catch (IOException e7) {
            int i10 = G6.L.f4523b;
            H6.l.g("", e7);
        }
    }

    public final /* synthetic */ void zzH() {
        zzcgz zzcgzVar = this.zzg;
        if (zzcgzVar != null) {
            zzcgzVar.zzb();
        }
    }

    public final /* synthetic */ void zzI() {
        zzcgz zzcgzVar = this.zzg;
        if (zzcgzVar != null) {
            zzcgzVar.zze();
        }
    }

    public final /* synthetic */ void zzJ(String str) {
        zzcgz zzcgzVar = this.zzg;
        if (zzcgzVar != null) {
            zzcgzVar.zzf("ExoPlayerAdapter error", str);
        }
    }

    public final /* synthetic */ void zzK() {
        zzcgz zzcgzVar = this.zzg;
        if (zzcgzVar != null) {
            zzcgzVar.zzc();
        }
    }

    public final /* synthetic */ void zzL() {
        zzcgz zzcgzVar = this.zzg;
        if (zzcgzVar != null) {
            zzcgzVar.zzd();
        }
    }

    public final /* synthetic */ void zzM() {
        zzcgz zzcgzVar = this.zzg;
        if (zzcgzVar != null) {
            zzcgzVar.zza();
        }
    }

    public final /* synthetic */ void zzN(int i5, int i10) {
        zzcgz zzcgzVar = this.zzg;
        if (zzcgzVar != null) {
            zzcgzVar.zzj(i5, i10);
        }
    }

    public final /* synthetic */ void zzO() {
        zzcgz zzcgzVar = this.zzg;
        if (zzcgzVar != null) {
            zzcgzVar.zzh();
        }
    }

    public final /* synthetic */ void zzP(int i5) {
        zzcgz zzcgzVar = this.zzg;
        if (zzcgzVar != null) {
            zzcgzVar.onWindowVisibilityChanged(i5);
        }
    }

    public final /* synthetic */ void zzQ(boolean z2, long j8) {
        this.zzc.zzu(z2, j8);
    }

    public final /* synthetic */ void zzR(String str) {
        zzcgz zzcgzVar = this.zzg;
        if (zzcgzVar != null) {
            zzcgzVar.zzg("ExoPlayerAdapter exception", str);
        }
    }

    public final /* synthetic */ void zzS() {
        zzcgz zzcgzVar = this.zzg;
        if (zzcgzVar != null) {
            zzcgzVar.zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final String zza() {
        return "ExoPlayer/2".concat(true != this.zzo ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final void zzb(zzcgz zzcgzVar) {
        this.zzg = zzcgzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final void zzc(String str) {
        if (str != null) {
            zzx(str, null, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final void zzd() {
        if (zzT()) {
            this.zzi.zzw();
            zzW();
        }
        zzchv zzchvVar = this.zzd;
        zzchvVar.zzf();
        this.zzb.zze();
        zzchvVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final void zze() {
        if (!zzU()) {
            this.zzq = true;
            return;
        }
        if (this.zze.zza) {
            zzac();
        }
        this.zzi.zzE(true);
        this.zzd.zze();
        this.zzb.zzd();
        this.zza.zza();
        U.f4562l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcie
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzK();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final void zzf() {
        if (zzU()) {
            if (this.zze.zza) {
                zzad();
            }
            this.zzi.zzE(false);
            this.zzd.zzf();
            this.zzb.zze();
            U.f4562l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcif
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzL();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final int zzg() {
        if (zzU()) {
            return (int) this.zzi.zzH();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final int zzh() {
        if (zzU()) {
            return (int) this.zzi.zzD();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final void zzi(int i5) {
        if (zzU()) {
            this.zzi.zzx(i5);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final void zzj(float f10, float f11) {
        zzchs zzchsVar = this.zzn;
        if (zzchsVar != null) {
            zzchsVar.zzf(f10, f11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final int zzk() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final int zzl() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final long zzm() {
        zzchl zzchlVar = this.zzi;
        if (zzchlVar != null) {
            return zzchlVar.zzI();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final long zzn() {
        zzchl zzchlVar = this.zzi;
        if (zzchlVar != null) {
            return zzchlVar.zzJ();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final long zzo() {
        zzchl zzchlVar = this.zzi;
        if (zzchlVar != null) {
            return zzchlVar.zzK();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final int zzp() {
        zzchl zzchlVar = this.zzi;
        if (zzchlVar != null) {
            return zzchlVar.zzL();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcha, com.google.android.gms.internal.ads.zzchx
    public final void zzq() {
        U.f4562l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcil
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzG();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    public final void zzr(final boolean z2, final long j8) {
        if (this.zzc != null) {
            zzcfy.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcik
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzQ(z2, j8);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    public final void zzs(int i5) {
        if (this.zzm != i5) {
            this.zzm = i5;
            if (i5 == 3) {
                zzY();
                return;
            }
            if (i5 != 4) {
                return;
            }
            if (this.zze.zza) {
                zzad();
            }
            this.zzd.zzf();
            this.zzb.zze();
            U.f4562l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcic
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzI();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    public final void zzt(int i5, int i10) {
        this.zzr = i5;
        this.zzs = i10;
        zzaa();
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    public final void zzu(String str, Exception exc) {
        final String strZzZ = zzZ(str, exc);
        String strConcat = "ExoPlayerAdapter error: ".concat(strZzZ);
        int i5 = G6.L.f4523b;
        H6.l.f(strConcat);
        this.zzl = true;
        if (this.zze.zza) {
            zzad();
        }
        U.f4562l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcid
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzJ(strZzZ);
            }
        });
        C6.n.f1857D.f1868h.zzi(exc, "AdExoPlayerView.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    public final void zzv(String str, Exception exc) {
        final String strZzZ = zzZ("onLoadException", exc);
        String strConcat = "ExoPlayerAdapter exception: ".concat(strZzZ);
        int i5 = G6.L.f4523b;
        H6.l.f(strConcat);
        C6.n.f1857D.f1868h.zzi(exc, "AdExoPlayerView.onException");
        U.f4562l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcia
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzR(strZzZ);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final Integer zzw() {
        zzchl zzchlVar = this.zzi;
        if (zzchlVar != null) {
            return zzchlVar.zzj();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final void zzx(String str, String[] strArr, Integer num) {
        if (str == null) {
            return;
        }
        if (strArr == null) {
            this.zzk = new String[]{str};
        } else {
            this.zzk = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.zzj;
        boolean z2 = false;
        if (this.zze.zzk && str2 != null && !str.equals(str2) && this.zzm == 4) {
            z2 = true;
        }
        this.zzj = str;
        zzV(z2, num);
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final void zzy(int i5) {
        zzchl zzchlVar = this.zzi;
        if (zzchlVar != null) {
            zzchlVar.zzF(i5);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final void zzz(int i5) {
        zzchl zzchlVar = this.zzi;
        if (zzchlVar != null) {
            zzchlVar.zzG(i5);
        }
    }
}
