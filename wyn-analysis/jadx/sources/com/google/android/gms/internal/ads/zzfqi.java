package com.google.android.gms.internal.ads;

import D6.C0395s;
import D6.K0;
import G6.V;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.os.SystemClock;
import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class zzfqi implements zzfqg {
    private final Context zza;
    private final int zzp;
    private long zzb = 0;
    private long zzc = -1;
    private boolean zzd = false;
    private int zzq = 2;
    private int zzr = 2;
    private int zze = 0;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private zzfqv zzj = zzfqv.SCAR_REQUEST_TYPE_UNSPECIFIED;
    private String zzk = "";
    private String zzl = "";
    private String zzm = "";
    private boolean zzn = false;
    private boolean zzo = false;

    public zzfqi(Context context, int i5) {
        this.zza = context;
        this.zzp = i5;
    }

    public final /* synthetic */ long zzA() {
        return this.zzb;
    }

    public final /* synthetic */ long zzB() {
        return this.zzc;
    }

    public final /* synthetic */ boolean zzC() {
        return this.zzd;
    }

    public final /* synthetic */ int zzD() {
        return this.zze;
    }

    public final /* synthetic */ String zzE() {
        return this.zzf;
    }

    public final /* synthetic */ String zzF() {
        return this.zzg;
    }

    public final /* synthetic */ String zzG() {
        return this.zzh;
    }

    public final /* synthetic */ String zzH() {
        return this.zzi;
    }

    public final /* synthetic */ zzfqv zzI() {
        return this.zzj;
    }

    public final /* synthetic */ String zzJ() {
        return this.zzk;
    }

    public final /* synthetic */ String zzK() {
        return this.zzl;
    }

    public final /* synthetic */ String zzL() {
        return this.zzm;
    }

    public final synchronized zzfqi zzM(int i5) {
        this.zzq = i5;
        return this;
    }

    public final /* synthetic */ int zzN() {
        return this.zzp;
    }

    public final /* synthetic */ int zzO() {
        return this.zzq;
    }

    public final /* synthetic */ int zzP() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzfqg
    public final /* bridge */ /* synthetic */ zzfqg zza() {
        zzq();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqg
    public final synchronized boolean zzb() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzfqg
    public final /* bridge */ /* synthetic */ zzfqg zzc() {
        zzr();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqg
    public final /* bridge */ /* synthetic */ zzfqg zzd(boolean z2) {
        zzs(z2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqg
    public final /* bridge */ /* synthetic */ zzfqg zze(String str) {
        zzt(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqg
    public final /* bridge */ /* synthetic */ zzfqg zzf(zzfqv zzfqvVar) {
        zzu(zzfqvVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqg
    public final /* bridge */ /* synthetic */ zzfqg zzg(zzfkx zzfkxVar) {
        zzv(zzfkxVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqg
    public final /* bridge */ /* synthetic */ zzfqg zzh(K0 k02) {
        zzw(k02);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqg
    public final /* bridge */ /* synthetic */ zzfqg zzi(String str) {
        zzx(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqg
    public final /* bridge */ /* synthetic */ zzfqg zzj(Throwable th) {
        zzy(th);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqg
    public final /* bridge */ /* synthetic */ zzfqg zzk(String str) {
        zzz(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqg
    public final boolean zzl() {
        return !TextUtils.isEmpty(this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzfqg
    public final synchronized zzfqj zzm() {
        try {
            if (this.zzn) {
                return null;
            }
            this.zzn = true;
            if (!this.zzo) {
                zzq();
            }
            if (this.zzc < 0) {
                zzr();
            }
            return new zzfqj(this, null);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfqg
    public final /* bridge */ /* synthetic */ zzfqg zzp(int i5) {
        zzM(i5);
        return this;
    }

    public final synchronized zzfqi zzq() {
        Configuration configuration;
        C6.n nVar = C6.n.f1857D;
        V v2 = nVar.f1866f;
        Context context = this.zza;
        this.zze = v2.g(context);
        Resources resources = context.getResources();
        int i5 = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i5 = configuration.orientation == 2 ? 4 : 3;
        }
        this.zzr = i5;
        nVar.k.getClass();
        this.zzb = SystemClock.elapsedRealtime();
        this.zzo = true;
        return this;
    }

    public final synchronized zzfqi zzr() {
        C6.n.f1857D.k.getClass();
        this.zzc = SystemClock.elapsedRealtime();
        return this;
    }

    public final synchronized zzfqi zzs(boolean z2) {
        this.zzd = z2;
        return this;
    }

    public final synchronized zzfqi zzt(String str) {
        this.zzi = str;
        return this;
    }

    public final synchronized zzfqi zzu(zzfqv zzfqvVar) {
        this.zzj = zzfqvVar;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        r2.zzg = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized com.google.android.gms.internal.ads.zzfqi zzv(com.google.android.gms.internal.ads.zzfkx r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzfkq r0 = r3.zzb     // Catch: java.lang.Throwable -> Le
            java.lang.String r0 = r0.zzb     // Catch: java.lang.Throwable -> Le
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Le
            if (r1 != 0) goto L10
            r2.zzf = r0     // Catch: java.lang.Throwable -> Le
            goto L10
        Le:
            r3 = move-exception
            goto L2e
        L10:
            java.util.List r3 = r3.zza     // Catch: java.lang.Throwable -> Le
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> Le
        L16:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> Le
            com.google.android.gms.internal.ads.zzfkn r0 = (com.google.android.gms.internal.ads.zzfkn) r0     // Catch: java.lang.Throwable -> Le
            java.lang.String r0 = r0.zzab     // Catch: java.lang.Throwable -> Le
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Le
            if (r1 != 0) goto L16
            r2.zzg = r0     // Catch: java.lang.Throwable -> Le
        L2c:
            monitor-exit(r2)
            return r2
        L2e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Le
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfqi.zzv(com.google.android.gms.internal.ads.zzfkx):com.google.android.gms.internal.ads.zzfqi");
    }

    public final synchronized zzfqi zzw(K0 k02) {
        try {
            IBinder iBinder = k02.f2342e;
            if (iBinder != null) {
                zzdcs zzdcsVar = (zzdcs) iBinder;
                String strZzk = zzdcsVar.zzk();
                if (!TextUtils.isEmpty(strZzk)) {
                    this.zzf = strZzk;
                }
                String strZzf = zzdcsVar.zzf();
                if (!TextUtils.isEmpty(strZzf)) {
                    this.zzg = strZzf;
                }
            }
        } finally {
        }
        return this;
    }

    public final synchronized zzfqi zzx(String str) {
        this.zzh = str;
        return this;
    }

    public final synchronized zzfqi zzy(Throwable th) {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzkj)).booleanValue()) {
            this.zzl = zzcaf.zzf(th);
            this.zzk = (String) zzgug.zza(zzgtf.zzd('\n')).zzf(zzcaf.zze(th)).iterator().next();
        }
        return this;
    }

    public final synchronized zzfqi zzz(String str) {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzkj)).booleanValue()) {
            this.zzm = str;
        }
        return this;
    }
}
