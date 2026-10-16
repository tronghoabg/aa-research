package com.google.android.gms.internal.ads;

import D6.C0395s;
import N6.C0777b;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdRequest$Builder;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p7.AbstractC3772b;
import u.AbstractC4159a;
import x6.C4476g;
import x6.EnumC4471b;

/* loaded from: classes3.dex */
public final class zzbkc {
    private final ScheduledExecutorService zza;
    private final N6.x zzb;
    private final C0777b zzc;
    private final zzdzy zzd;
    private Runnable zze;
    private zzbjz zzf;
    private u.n zzg;
    private String zzh;
    private long zzi = 0;
    private long zzj;
    private JSONArray zzk;
    private Context zzl;

    public zzbkc(ScheduledExecutorService scheduledExecutorService, N6.x xVar, C0777b c0777b, zzdzy zzdzyVar) {
        this.zza = scheduledExecutorService;
        this.zzb = xVar;
        this.zzc = c0777b;
        this.zzd = zzdzyVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
    
        if (((java.lang.Boolean) D6.C0395s.f2489e.f2492c.zzd(com.google.android.gms.internal.ads.zzbix.zzlx)).booleanValue() != false) goto L23;
     */
    /* renamed from: zzj, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzh() {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzbjz r0 = r6.zzf
            if (r0 != 0) goto Lc
            int r0 = G6.L.f4523b
            java.lang.String r0 = "PACT callback is not present, please initialize the PawCustomTabsImpl."
            H6.l.c(r0)
            return
        Lc:
            java.lang.Boolean r0 = r0.zza()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L17
            return
        L17:
            java.lang.String r0 = r6.zzh
            if (r0 == 0) goto L98
            u.n r0 = r6.zzg
            if (r0 == 0) goto L98
            java.util.concurrent.ScheduledExecutorService r0 = r6.zza
            if (r0 == 0) goto L98
            long r1 = r6.zzi
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L2c
            goto L3e
        L2c:
            C6.n r1 = C6.n.f1857D
            n7.b r1 = r1.k
            r1.getClass()
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r3 = r6.zzi
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L3e
            goto L50
        L3e:
            com.google.android.gms.internal.ads.zzbio r1 = com.google.android.gms.internal.ads.zzbix.zzlx
            D6.s r2 = D6.C0395s.f2489e
            com.google.android.gms.internal.ads.zzbiv r2 = r2.f2492c
            java.lang.Object r1 = r2.zzd(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L98
        L50:
            u.n r1 = r6.zzg
            java.lang.String r2 = r6.zzh
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r1.getClass()
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            android.os.Bundle r4 = new android.os.Bundle     // Catch: android.os.RemoteException -> L80
            r4.<init>()     // Catch: android.os.RemoteException -> L80
            boolean r5 = r4.isEmpty()     // Catch: android.os.RemoteException -> L80
            if (r5 == 0) goto L6c
            r4 = 0
        L6c:
            u.f r5 = r1.f46076c
            b.d r1 = r1.f46075b
            if (r4 == 0) goto L7b
            r3.putAll(r4)     // Catch: android.os.RemoteException -> L80
            b.b r1 = (b.C1489b) r1     // Catch: android.os.RemoteException -> L80
            r1.V(r5, r2, r3)     // Catch: android.os.RemoteException -> L80
            goto L80
        L7b:
            b.b r1 = (b.C1489b) r1     // Catch: android.os.RemoteException -> L80
            r1.U(r5, r2)     // Catch: android.os.RemoteException -> L80
        L80:
            java.lang.Runnable r1 = r6.zze
            com.google.android.gms.internal.ads.zzbio r2 = com.google.android.gms.internal.ads.zzbix.zzly
            D6.s r3 = D6.C0395s.f2489e
            com.google.android.gms.internal.ads.zzbiv r3 = r3.f2492c
            java.lang.Object r2 = r3.zzd(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r1, r2, r4)
            return
        L98:
            java.lang.String r0 = "PACT max retry connection duration timed out"
            G6.L.k(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbkc.zzh():void");
    }

    private final void zzk(JSONObject jSONObject) throws JSONException {
        try {
            if (this.zzk == null) {
                this.zzk = new JSONArray((String) C0395s.f2489e.f2492c.zzd(zzbix.zzlA));
            }
            jSONObject.put("eids", this.zzk);
        } catch (JSONException e7) {
            int i5 = G6.L.f4523b;
            H6.l.d("Error fetching the PACT active eids JSON: ", e7);
        }
    }

    public final void zza(Context context, u.g gVar, String str, AbstractC4159a abstractC4159a) {
        if (context == null) {
            throw new IllegalArgumentException("App Context parameter is null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Origin parameter is empty or null");
        }
        if (gVar == null) {
            throw new IllegalArgumentException("CustomTabsClient parameter is null");
        }
        this.zzl = context;
        this.zzh = str;
        zzdzy zzdzyVar = this.zzd;
        zzbjz zzbjzVar = new zzbjz(this, abstractC4159a, zzdzyVar);
        this.zzf = zzbjzVar;
        u.n nVarC = gVar.c(zzbjzVar);
        this.zzg = nVarC;
        if (nVarC == null) {
            int i5 = G6.L.f4523b;
            H6.l.c("CustomTabsClient failed to create new session.");
        }
        AbstractC3772b.a0(zzdzyVar, "pact_action", new Pair("pe", "pact_init"));
    }

    public final u.n zzb() {
        return this.zzg;
    }

    public final void zzc() {
        C6.n.f1857D.k.getClass();
        this.zzi = SystemClock.elapsedRealtime() + ((Integer) C0395s.f2489e.f2492c.zzd(zzbix.zzlw)).intValue();
        if (this.zze == null) {
            this.zze = new Runnable() { // from class: com.google.android.gms.internal.ads.zzbkb
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzh();
                }
            };
        }
        zzh();
    }

    public final void zzd(String str) {
        try {
            u.n nVar = this.zzg;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gsppack", true);
            jSONObject.put("fpt", new Date(this.zzj).toString());
            zzk(jSONObject);
            if (((Boolean) zzblc.zzc.zze()).booleanValue()) {
                jSONObject.put("as", this.zzc.b());
            }
            nVar.a(jSONObject.toString());
            zzbka zzbkaVar = new zzbka(this, str);
            if (((Boolean) zzblc.zze.zze()).booleanValue()) {
                this.zzb.a(this.zzg, zzbkaVar);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            Q6.a.a(this.zzl, EnumC4471b.BANNER, new C4476g((AdRequest$Builder) new AdRequest$Builder(14).x(AdMobAdapter.class, bundle)), zzbkaVar);
        } catch (JSONException e7) {
            int i5 = G6.L.f4523b;
            H6.l.d("Error creating JSON: ", e7);
        }
    }

    public final JSONObject zze(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("error", str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) zzblc.zze.zze()).booleanValue() ? ((Long) zzblc.zzh.zze()).longValue() : 0L);
        zzk(jSONObject);
        if (((Boolean) zzblc.zzc.zze()).booleanValue()) {
            jSONObject.put("as", this.zzc.b());
        }
        return jSONObject;
    }

    public final JSONObject zzf(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("signal", str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) zzblc.zze.zze()).booleanValue() ? ((Long) zzblc.zzh.zze()).longValue() : 0L);
        zzk(jSONObject);
        if (((Boolean) zzblc.zzc.zze()).booleanValue()) {
            jSONObject.put("as", this.zzc.b());
        }
        return jSONObject;
    }

    public final void zzg(long j8) {
        this.zzj = j8;
    }

    public final /* synthetic */ u.n zzi() {
        return this.zzg;
    }
}
