package com.google.android.gms.internal.ads;

import D6.C0395s;
import G6.U;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zzckj extends zzchl implements zzip, zznr {
    public static final /* synthetic */ int zza = 0;
    private final Context zzb;
    private final zzcjt zzc;
    private final zzaaz zzd;
    private final zzcht zze;
    private final WeakReference zzf;
    private final zzyu zzg;
    private zzjx zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private zzchk zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private final String zzo;
    private final int zzp;
    private Integer zzr;
    private final ArrayList zzs;
    private volatile zzcjw zzt;
    private final Object zzq = new Object();
    private final Set zzu = new HashSet();

    /* JADX WARN: Removed duplicated region for block: B:22:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzckj(android.content.Context r4, com.google.android.gms.internal.ads.zzcht r5, com.google.android.gms.internal.ads.zzchu r6, java.lang.Integer r7) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzckj.<init>(android.content.Context, com.google.android.gms.internal.ads.zzcht, com.google.android.gms.internal.ads.zzchu, java.lang.Integer):void");
    }

    private final boolean zzY() {
        return this.zzt != null && this.zzt.zzl();
    }

    public final void finalize() {
        zzchl.zzf().decrementAndGet();
        if (G6.L.m()) {
            G6.L.k("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void zzA(int i5) throws SocketException {
        Iterator it = this.zzu.iterator();
        while (it.hasNext()) {
            zzcjs zzcjsVar = (zzcjs) ((WeakReference) it.next()).get();
            if (zzcjsVar != null) {
                zzcjsVar.zzk(i5);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final boolean zzB() {
        return this.zzh != null;
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final int zzC() {
        return this.zzh.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final long zzD() {
        return this.zzh.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void zzE(boolean z2) {
        this.zzh.zzj(z2);
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void zzF(int i5) {
        this.zzc.zzk(i5);
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void zzG(int i5) {
        this.zzc.zzl(i5);
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final long zzH() {
        return this.zzh.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final long zzI() {
        if (zzY()) {
            return 0L;
        }
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final long zzJ() {
        if (zzY() && this.zzt.zzm()) {
            return Math.min(this.zzl, this.zzt.zzo());
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final long zzK() {
        if (zzY()) {
            return this.zzt.zzp();
        }
        synchronized (this.zzq) {
            while (true) {
                ArrayList arrayList = this.zzs;
                if (!arrayList.isEmpty()) {
                    long j8 = this.zzn;
                    Map mapZzj = ((zzik) arrayList.remove(0)).zzj();
                    long j10 = 0;
                    if (mapZzj != null) {
                        Iterator it = mapZzj.entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Map.Entry entry = (Map.Entry) it.next();
                            if (entry != null) {
                                try {
                                    if (entry.getKey() != null && zzgsz.zze("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                        j10 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                        break;
                                    }
                                } catch (NumberFormatException unused) {
                                    continue;
                                }
                            }
                        }
                    }
                    this.zzn = j8 + j10;
                }
            }
        }
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final int zzL() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void zzM(boolean z2) {
        if (this.zzh == null) {
            return;
        }
        int i5 = 0;
        while (true) {
            this.zzh.zzF();
            if (i5 >= 2) {
                return;
            }
            zzaaz zzaazVar = this.zzd;
            zzaam zzaamVarZzd = zzaazVar.zzc().zzd();
            zzaamVarZzd.zzy(i5, !z2);
            zzaazVar.zzf(zzaamVarZzd);
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final long zzN() {
        return this.zzh.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final long zzO() {
        return this.zzl;
    }

    public final zzxn zzR(Uri uri) {
        zzz zzzVar = new zzz();
        zzzVar.zzb(uri);
        zzak zzakVarZzc = zzzVar.zzc();
        zzyu zzyuVar = this.zzg;
        zzyuVar.zza(this.zze.zzf);
        return zzyuVar.zzb(zzakVarZzc);
    }

    public final /* synthetic */ zzhr zzS(String str, boolean z2) {
        zzckj zzckjVar = true != z2 ? null : this;
        zzcht zzchtVar = this.zze;
        return new zzckm(str, zzckjVar, zzchtVar.zzd, zzchtVar.zze, zzchtVar.zzm, zzchtVar.zzn);
    }

    public final /* synthetic */ zzhr zzT(String str, boolean z2) {
        zzhy zzhyVar = new zzhy();
        zzhyVar.zzb(str);
        zzhyVar.zzf(true != z2 ? null : this);
        zzcht zzchtVar = this.zze;
        zzhyVar.zzc(zzchtVar.zzd);
        zzhyVar.zzd(zzchtVar.zze);
        zzhyVar.zze(true);
        return zzhyVar.zza();
    }

    public final /* synthetic */ zzhr zzU(String str, boolean z2) {
        zzckj zzckjVar = true != z2 ? null : this;
        zzcht zzchtVar = this.zze;
        zzcjs zzcjsVar = new zzcjs(str, zzckjVar, zzchtVar.zzd, zzchtVar.zze, zzchtVar.zzh);
        this.zzu.add(new WeakReference(zzcjsVar));
        return zzcjsVar;
    }

    public final /* synthetic */ zzhr zzV(zzhq zzhqVar) {
        zzhr zzhrVarZza = zzhqVar.zza();
        zzcju zzcjuVar = new zzcju() { // from class: com.google.android.gms.internal.ads.zzckh
            @Override // com.google.android.gms.internal.ads.zzcju
            public final /* synthetic */ void zza(boolean z2, long j8) {
                this.zza.zzX(z2, j8);
            }
        };
        return new zzcjw(this.zzb, zzhrVarZza, this.zzo, this.zzp, this, zzcjuVar);
    }

    public final /* synthetic */ zznc[] zzW(Handler handler, zzaer zzaerVar, zzrx zzrxVar, zzzr zzzrVar, zzwl zzwlVar) {
        zzvy zzvyVar = zzvy.zzb;
        Context context = this.zzb;
        zzua zzuaVar = new zzua(context, new zzve(context, null, null), zzvyVar, false, handler, zzrxVar, new zztn(context).zza());
        zzade zzadeVar = new zzade(context);
        zzadeVar.zza(zzvyVar);
        zzadeVar.zzb(handler);
        zzadeVar.zzc(zzaerVar);
        return new zznc[]{zzuaVar, zzadeVar.zzd()};
    }

    public final /* synthetic */ void zzX(boolean z2, long j8) {
        zzchk zzchkVar = this.zzk;
        if (zzchkVar != null) {
            zzchkVar.zzr(z2, j8);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzip
    public final void zza(zzhr zzhrVar, zzhv zzhvVar, boolean z2) {
    }

    @Override // com.google.android.gms.internal.ads.zzip
    public final void zzb(zzhr zzhrVar, zzhv zzhvVar, boolean z2) {
        if (zzhrVar instanceof zzik) {
            synchronized (this.zzq) {
                this.zzs.add((zzik) zzhrVar);
            }
        } else if (zzhrVar instanceof zzcjw) {
            this.zzt = (zzcjw) zzhrVar;
            final zzchu zzchuVar = (zzchu) this.zzf.get();
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzcG)).booleanValue() && zzchuVar != null && this.zzt.zzk()) {
                final HashMap map = new HashMap();
                map.put("gcacheHit", String.valueOf(this.zzt.zzm()));
                map.put("gcacheDownloaded", String.valueOf(this.zzt.zzn()));
                U.f4562l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcki
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        int i5 = zzckj.zza;
                        zzchuVar.zze("onGcacheInfoEvent", map);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzip
    public final void zzc(zzhr zzhrVar, zzhv zzhvVar, boolean z2, int i5) {
        this.zzl += i5;
    }

    @Override // com.google.android.gms.internal.ads.zzip
    public final void zzd(zzhr zzhrVar, zzhv zzhvVar, boolean z2) {
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final /* synthetic */ void zzde(zznp zznpVar, zzba zzbaVar, zzba zzbaVar2, int i5) {
        J.a(this, zznpVar, zzbaVar, zzbaVar2, i5);
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final /* synthetic */ void zzdf(zznp zznpVar, zzxh zzxhVar) {
        J.b(this, zznpVar, zzxhVar);
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final /* synthetic */ void zzdg(zznp zznpVar, int i5, long j8, long j10) {
        J.c(this, zznpVar, i5, j8, j10);
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final /* synthetic */ void zzdh(zznp zznpVar, zzjd zzjdVar) {
        J.d(this, zznpVar, zzjdVar);
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final /* synthetic */ void zzdi(zzbb zzbbVar, zznq zznqVar) {
        J.e(this, zzbbVar, zznqVar);
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final void zze(zznp zznpVar, int i5) {
        zzchk zzchkVar = this.zzk;
        if (zzchkVar != null) {
            zzchkVar.zzs(i5);
        }
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final void zzg(zznp zznpVar, zzau zzauVar) {
        zzchk zzchkVar = this.zzk;
        if (zzchkVar != null) {
            zzchkVar.zzu("onPlayerError", zzauVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final void zzh(zznp zznpVar, zzxc zzxcVar, zzxh zzxhVar, IOException iOException, boolean z2) {
        zzchk zzchkVar = this.zzk;
        if (zzchkVar != null) {
            if (this.zze.zzj) {
                zzchkVar.zzv("onLoadException", iOException);
            } else {
                zzchkVar.zzu("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final Integer zzj() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final void zzk(zznp zznpVar, zzv zzvVar, zzje zzjeVar) {
        zzchu zzchuVar = (zzchu) this.zzf.get();
        if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzcG)).booleanValue() || zzchuVar == null) {
            return;
        }
        HashMap map = new HashMap();
        String str = zzvVar.zzo;
        if (str != null) {
            map.put("audioMime", str);
        }
        String str2 = zzvVar.zzp;
        if (str2 != null) {
            map.put("audioSampleMime", str2);
        }
        String str3 = zzvVar.zzk;
        if (str3 != null) {
            map.put("audioCodec", str3);
        }
        zzchuVar.zze("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final void zzl(zznp zznpVar, zzv zzvVar, zzje zzjeVar) {
        zzchu zzchuVar = (zzchu) this.zzf.get();
        if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzcG)).booleanValue() || zzchuVar == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("frameRate", String.valueOf(zzvVar.zzA));
        map.put("bitRate", String.valueOf(zzvVar.zzj));
        int i5 = zzvVar.zzw;
        int i10 = zzvVar.zzx;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i5).length() + 1 + String.valueOf(i10).length());
        sb2.append(i5);
        sb2.append("x");
        sb2.append(i10);
        map.put("resolution", sb2.toString());
        String str = zzvVar.zzo;
        if (str != null) {
            map.put("videoMime", str);
        }
        String str2 = zzvVar.zzp;
        if (str2 != null) {
            map.put("videoSampleMime", str2);
        }
        String str3 = zzvVar.zzk;
        if (str3 != null) {
            map.put("videoCodec", str3);
        }
        zzchuVar.zze("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final void zzm(zznp zznpVar, int i5, long j8) {
        this.zzm += i5;
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void zzn(Integer num) {
        this.zzr = num;
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final void zzo(zznp zznpVar, Object obj, long j8) {
        zzchk zzchkVar = this.zzk;
        if (zzchkVar != null) {
            zzchkVar.zzD();
        }
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final void zzp(zznp zznpVar, zzbv zzbvVar) {
        zzchk zzchkVar = this.zzk;
        if (zzchkVar != null) {
            zzchkVar.zzt(zzbvVar.zzb, zzbvVar.zzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void zzq(Uri[] uriArr, String str) {
        zzr(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void zzr(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z2) {
        zzxn zzycVar;
        if (this.zzh != null) {
            this.zzi = byteBuffer;
            this.zzj = z2;
            int length = uriArr.length;
            if (length == 1) {
                zzycVar = zzR(uriArr[0]);
            } else {
                zzxn[] zzxnVarArr = new zzxn[length];
                for (int i5 = 0; i5 < uriArr.length; i5++) {
                    zzxnVarArr[i5] = zzR(uriArr[i5]);
                }
                zzycVar = new zzyc(false, false, new zzww(), zzxnVarArr);
            }
            this.zzh.zzG(zzycVar);
            this.zzh.zzg();
            zzchl.zzi().incrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void zzs(zzchk zzchkVar) {
        this.zzk = zzchkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void zzt() {
        zzjx zzjxVar = this.zzh;
        if (zzjxVar != null) {
            zzjxVar.zzE(this);
            this.zzh.zzH();
            this.zzh = null;
            zzchl.zzi().decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void zzu(Surface surface, boolean z2) {
        zzjx zzjxVar = this.zzh;
        if (zzjxVar != null) {
            zzjxVar.zzC(surface);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void zzv(float f10, boolean z2) {
        zzjx zzjxVar = this.zzh;
        if (zzjxVar != null) {
            zzjxVar.zzB(f10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void zzw() {
        this.zzh.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void zzx(long j8) {
        this.zzh.zzb(j8);
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void zzy(int i5) {
        this.zzc.zzm(i5);
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void zzz(int i5) {
        this.zzc.zzn(i5);
    }
}
