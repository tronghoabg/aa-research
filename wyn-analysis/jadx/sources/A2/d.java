package A2;

import A7.RunnableC0278p;
import D6.C0395s;
import G6.L;
import G6.O;
import J5.l;
import J5.m;
import J5.t;
import J5.w;
import Q1.k;
import Q1.x;
import X1.g;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.ads.u;
import com.google.android.gms.internal.ads.zzbio;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbuf;
import com.google.android.gms.internal.ads.zzbuj;
import com.google.android.gms.internal.ads.zzbum;
import com.google.android.gms.internal.ads.zzbup;
import com.google.android.gms.internal.ads.zzcff;
import com.google.android.gms.internal.ads.zzcfy;
import com.google.android.gms.internal.ads.zzcgb;
import com.google.android.gms.internal.ads.zzdzs;
import com.google.android.gms.internal.ads.zzdzt;
import com.google.android.gms.internal.ads.zzfqg;
import com.google.android.gms.internal.ads.zzfqt;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhcf;
import com.google.android.gms.internal.ads.zzhcp;
import com.google.android.gms.tasks.OnFailureListener;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import f6.C2584N;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Iterator;
import n7.C3597b;
import org.json.JSONException;
import org.json.JSONObject;
import p7.C3773c;
import p8.p;
import s2.C;
import s2.h;
import s2.j;
import s2.n;
import s2.o;
import u6.AbstractC4256a;
import v9.AbstractC4335b;

/* loaded from: classes.dex */
public final class d implements n, o, OnFailureListener, l, m, g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f270a;

    /* renamed from: b, reason: collision with root package name */
    public long f271b;

    /* renamed from: c, reason: collision with root package name */
    public Object f272c;

    public /* synthetic */ d(int i5) {
        this.f270a = i5;
    }

    public static final void R(zzdzt zzdztVar, String str, long j8) {
        if (zzdztVar != null) {
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzoq)).booleanValue()) {
                zzdzs zzdzsVarZza = zzdztVar.zza();
                zzdzsVarZza.zzc(HandleInvocationsFromAdViewer.KEY_ACTION, "lat_init");
                zzdzsVarZza.zzc(str, Long.toString(j8));
                zzdzsVarZza.zzd();
            }
        }
    }

    @Override // X1.g
    public boolean D() {
        return true;
    }

    @Override // X1.g
    public long E() {
        return 0L;
    }

    @Override // X1.g
    public long F(long j8, long j10) {
        return ((h) this.f272c).f44882a;
    }

    public void G(int i5) {
        if (i5 < 64) {
            this.f271b &= ~(1 << i5);
            return;
        }
        d dVar = (d) this.f272c;
        if (dVar != null) {
            dVar.G(i5 - 64);
        }
    }

    public int H(int i5) {
        d dVar = (d) this.f272c;
        if (dVar == null) {
            return i5 >= 64 ? Long.bitCount(this.f271b) : Long.bitCount(this.f271b & ((1 << i5) - 1));
        }
        if (i5 < 64) {
            return Long.bitCount(this.f271b & ((1 << i5) - 1));
        }
        return Long.bitCount(this.f271b) + dVar.H(i5 - 64);
    }

    public void I() {
        if (((d) this.f272c) == null) {
            this.f272c = new d();
        }
    }

    public boolean J(int i5) {
        if (i5 < 64) {
            return (this.f271b & (1 << i5)) != 0;
        }
        I();
        return ((d) this.f272c).J(i5 - 64);
    }

    public void K(int i5, boolean z2) {
        if (i5 >= 64) {
            I();
            ((d) this.f272c).K(i5 - 64, z2);
            return;
        }
        long j8 = this.f271b;
        boolean z10 = (Long.MIN_VALUE & j8) != 0;
        long j10 = (1 << i5) - 1;
        this.f271b = ((j8 & (~j10)) << 1) | (j8 & j10);
        if (z2) {
            O(i5);
        } else {
            G(i5);
        }
        if (z10 || ((d) this.f272c) != null) {
            I();
            ((d) this.f272c).K(0, z10);
        }
    }

    public boolean L(int i5) {
        if (i5 >= 64) {
            I();
            return ((d) this.f272c).L(i5 - 64);
        }
        long j8 = 1 << i5;
        long j10 = this.f271b;
        boolean z2 = (j10 & j8) != 0;
        long j11 = j10 & (~j8);
        this.f271b = j11;
        long j12 = j8 - 1;
        this.f271b = (j11 & j12) | Long.rotateRight((~j12) & j11, 1);
        d dVar = (d) this.f272c;
        if (dVar != null) {
            if (dVar.J(0)) {
                O(63);
            }
            ((d) this.f272c).L(0);
        }
        return z2;
    }

    public void M() {
        this.f271b = 0L;
        d dVar = (d) this.f272c;
        if (dVar != null) {
            dVar.M();
        }
    }

    public void N(Runnable runnable) {
        AbstractC4335b abstractC4335b = (AbstractC4335b) this.f272c;
        abstractC4335b.f47053f.d();
        if (abstractC4335b.f47056i == this.f271b) {
            runnable.run();
        } else {
            Ba.c.p(abstractC4335b.getClass().getSimpleName(), "stream callback skipped by CloseGuardedRunner.", 1, new Object[0]);
        }
    }

    public void O(int i5) {
        if (i5 < 64) {
            this.f271b |= 1 << i5;
        } else {
            I();
            ((d) this.f272c).O(i5 - 64);
        }
    }

    public void P(Exception exc) throws Exception {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.f272c) == null) {
            this.f272c = exc;
            this.f271b = 100 + jElapsedRealtime;
        }
        if (jElapsedRealtime >= this.f271b) {
            Exception exc2 = (Exception) this.f272c;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = (Exception) this.f272c;
            this.f272c = null;
            throw exc3;
        }
    }

    public void Q(Context context, H6.a aVar, boolean z2, zzcff zzcffVar, String str, String str2, Runnable runnable, final zzfqt zzfqtVar, final zzdzt zzdztVar, final Long l10, boolean z10) throws JSONException {
        PackageInfo packageInfoC;
        boolean z11 = false;
        C6.n nVar = C6.n.f1857D;
        nVar.k.getClass();
        if (SystemClock.elapsedRealtime() - this.f271b < 5000) {
            int i5 = L.f4523b;
            H6.l.f("Not retrying to fetch app settings");
            return;
        }
        C3597b c3597b = nVar.k;
        c3597b.getClass();
        this.f271b = SystemClock.elapsedRealtime();
        if (zzcffVar != null && !TextUtils.isEmpty(zzcffVar.zzd())) {
            long jZzb = zzcffVar.zzb();
            c3597b.getClass();
            if (System.currentTimeMillis() - jZzb <= ((Long) C0395s.f2489e.f2492c.zzd(zzbix.zzfj)).longValue() && zzcffVar.zzc()) {
                return;
            }
        }
        if (context == null) {
            int i10 = L.f4523b;
            H6.l.f("Context not provided to fetch application settings");
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            int i11 = L.f4523b;
            H6.l.f("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.f272c = applicationContext;
        final zzfqg zzfqgVarA = u.a(context, 4);
        zzfqgVarA.zza();
        zzbup zzbupVarZzb = nVar.f1877r.zzb((Context) this.f272c, aVar, zzfqtVar);
        zzbuj zzbujVar = zzbum.zza;
        zzbuf zzbufVarZza = zzbupVarZzb.zza("google.afma.config.fetchAppSettings", zzbujVar, zzbujVar);
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("app_id", str);
            } else if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("ad_unit_id", str2);
            }
            jSONObject.put("is_init", z2);
            jSONObject.put("pn", context.getPackageName());
            zzbio zzbioVar = zzbix.zza;
            C0395s c0395s = C0395s.f2489e;
            jSONObject.put("experiment_ids", TextUtils.join(",", c0395s.f2490a.zze()));
            jSONObject.put("js", aVar.f4927a);
            if (((Boolean) c0395s.f2492c.zzd(zzbix.zzlb)).booleanValue()) {
                jSONObject.put("inspector_enabled", z10);
            }
            try {
                ApplicationInfo applicationInfo = ((Context) this.f272c).getApplicationInfo();
                if (applicationInfo != null && (packageInfoC = C3773c.a(context).c(0, applicationInfo.packageName)) != null) {
                    jSONObject.put("version", packageInfoC.versionCode);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                L.k("Error fetching PackageInfo.");
            }
            p pVarZzb = zzbufVarZza.zzb(jSONObject);
            zzhbn zzhbnVar = new zzhbn() { // from class: C6.d
                @Override // com.google.android.gms.internal.ads.zzhbn
                public final p zza(Object obj) throws JSONException {
                    Long l11 = l10;
                    zzdzt zzdztVar2 = zzdztVar;
                    zzfqg zzfqgVar = zzfqgVarA;
                    zzfqt zzfqtVar2 = zzfqtVar;
                    JSONObject jSONObject2 = (JSONObject) obj;
                    boolean zOptBoolean = jSONObject2.optBoolean("isSuccessful", false);
                    if (zOptBoolean) {
                        String string = jSONObject2.getString("appSettingsJson");
                        n nVar2 = n.f1857D;
                        O o7 = (O) nVar2.f1868h.zzp();
                        o7.l();
                        synchronized (o7.f4531a) {
                            try {
                                nVar2.k.getClass();
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                if (string == null || string.equals(o7.f4543n.zzd())) {
                                    o7.f4543n.zza(jCurrentTimeMillis);
                                } else {
                                    o7.f4543n = new zzcff(string, jCurrentTimeMillis);
                                    SharedPreferences.Editor editor = o7.f4537g;
                                    if (editor != null) {
                                        editor.putString("app_settings_json", string);
                                        o7.f4537g.putLong("app_settings_last_update_ms", jCurrentTimeMillis);
                                        o7.f4537g.apply();
                                    }
                                    o7.m();
                                    Iterator it = o7.f4533c.iterator();
                                    while (it.hasNext()) {
                                        ((Runnable) it.next()).run();
                                    }
                                }
                            } finally {
                            }
                        }
                        if (l11 != null) {
                            n.f1857D.k.getClass();
                            A2.d.R(zzdztVar2, "cld_s", SystemClock.elapsedRealtime() - l11.longValue());
                        }
                    }
                    String strOptString = jSONObject2.optString("errorReason", "");
                    if (!TextUtils.isEmpty(strOptString)) {
                        zzfqgVar.zzk(strOptString);
                    }
                    zzfqgVar.zzd(zOptBoolean);
                    zzfqtVar2.zzb(zzfqgVar.zzm());
                    return zzhcf.zza(null);
                }
            };
            zzhcp zzhcpVar = zzcfy.zzh;
            p pVarZzj = zzhcf.zzj(pVarZzb, zzhbnVar, zzhcpVar);
            if (runnable != null) {
                pVarZzb.addListener(runnable, zzhcpVar);
            }
            if (l10 != null) {
                pVarZzb.addListener(new RunnableC0278p(zzdztVar, z11, l10, 14), zzhcpVar);
            }
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zziM)).booleanValue()) {
                zzcgb.zzb(pVarZzj, "ConfigLoader.maybeFetchNewAppSettings");
            } else {
                zzcgb.zza(pVarZzj, "ConfigLoader.maybeFetchNewAppSettings", zzhcpVar);
            }
        } catch (Exception e7) {
            int i12 = L.f4523b;
            H6.l.d("Error requesting application settings", e7);
            zzfqgVarA.zzj(e7);
            zzfqgVarA.zzd(false);
            zzfqtVar.zzb(zzfqgVarA.zzm());
        }
    }

    @Override // s2.n, J5.l
    public void a(int i5, int i10, byte[] bArr) {
        switch (this.f270a) {
            case 0:
                ((j) this.f272c).c(bArr, i5, i10, false);
                break;
            default:
                ((J5.h) this.f272c).c(bArr, i5, i10, false);
                break;
        }
    }

    @Override // X1.g
    public long b(long j8) {
        return ((h) this.f272c).f44886e[(int) j8] - this.f271b;
    }

    @Override // s2.n, J5.l
    public boolean c(byte[] bArr, int i5, int i10, boolean z2) {
        switch (this.f270a) {
            case 0:
                return ((j) this.f272c).c(bArr, i5, i10, z2);
            default:
                return ((J5.h) this.f272c).c(bArr, 0, i10, z2);
        }
    }

    @Override // s2.n, J5.l
    public void e() {
        switch (this.f270a) {
            case 0:
                ((j) this.f272c).f44900f = 0;
                break;
            default:
                ((J5.h) this.f272c).f5648f = 0;
                break;
        }
    }

    @Override // s2.n, J5.l
    public boolean f(byte[] bArr, int i5, int i10, boolean z2) {
        switch (this.f270a) {
            case 0:
                return ((j) this.f272c).f(bArr, 0, i10, z2);
            default:
                return ((J5.h) this.f272c).f(bArr, 0, i10, z2);
        }
    }

    @Override // s2.n, J5.l
    public long g() {
        switch (this.f270a) {
            case 0:
                return ((j) this.f272c).g() - this.f271b;
            default:
                return ((J5.h) this.f272c).g() - this.f271b;
        }
    }

    @Override // s2.n, J5.l
    public long getPosition() {
        switch (this.f270a) {
            case 0:
                return ((j) this.f272c).f44898d - this.f271b;
            default:
                return ((J5.h) this.f272c).f5646d - this.f271b;
        }
    }

    @Override // s2.n, J5.l
    public void h(int i5) throws EOFException, InterruptedIOException {
        switch (this.f270a) {
            case 0:
                ((j) this.f272c).b(i5, false);
                break;
            default:
                ((J5.h) this.f272c).b(i5, false);
                break;
        }
    }

    @Override // s2.n, J5.l
    public long i() {
        switch (this.f270a) {
            case 0:
                return ((j) this.f272c).f44897c - this.f271b;
            default:
                return ((J5.h) this.f272c).f5645c - this.f271b;
        }
    }

    @Override // s2.n, J5.l
    public void j(int i5) throws EOFException, InterruptedIOException {
        switch (this.f270a) {
            case 0:
                ((j) this.f272c).j(i5);
                break;
            default:
                ((J5.h) this.f272c).j(i5);
                break;
        }
    }

    @Override // s2.o, J5.m
    public void l() {
        switch (this.f270a) {
            case 1:
                ((o) this.f272c).l();
                break;
            default:
                ((C2584N) this.f272c).l();
                break;
        }
    }

    @Override // J5.m
    public w m(int i5, int i10) {
        return ((C2584N) this.f272c).m(i5, i10);
    }

    @Override // X1.g
    public long o(long j8, long j10) {
        return ((h) this.f272c).f44885d[(int) j8];
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        ((A7.L) this.f272c).f548c.set(this.f271b);
    }

    @Override // X1.g
    public long q(long j8, long j10) {
        return 0L;
    }

    @Override // X1.g
    public long r(long j8, long j10) {
        return -9223372036854775807L;
    }

    @Override // N1.InterfaceC0758g, t6.InterfaceC4141i
    public int read(byte[] bArr, int i5, int i10) {
        switch (this.f270a) {
            case 0:
                return ((j) this.f272c).read(bArr, i5, i10);
            default:
                return ((J5.h) this.f272c).read(bArr, i5, i10);
        }
    }

    @Override // s2.n, J5.l
    public void readFully(byte[] bArr, int i5, int i10) throws EOFException, InterruptedIOException {
        switch (this.f270a) {
            case 0:
                ((j) this.f272c).f(bArr, i5, i10, false);
                break;
            default:
                ((J5.h) this.f272c).f(bArr, i5, i10, false);
                break;
        }
    }

    @Override // s2.o
    public void s(s2.w wVar) {
        ((o) this.f272c).s(new e(this, wVar, wVar));
    }

    public String toString() {
        switch (this.f270a) {
            case 9:
                if (((d) this.f272c) == null) {
                    return Long.toBinaryString(this.f271b);
                }
                return ((d) this.f272c).toString() + "xx" + Long.toBinaryString(this.f271b);
            default:
                return super.toString();
        }
    }

    @Override // X1.g
    public Y1.j u(long j8) {
        return new Y1.j(null, ((h) this.f272c).f44884c[(int) j8], r1.f44883b[r7]);
    }

    @Override // X1.g
    public long v(long j8, long j10) {
        return x.e(((h) this.f272c).f44886e, j8 + this.f271b, true);
    }

    @Override // X1.g
    public long w(long j8) {
        return ((h) this.f272c).f44882a;
    }

    @Override // J5.m
    public void x(t tVar) {
        ((C2584N) this.f272c).x(new O5.c(this, tVar));
    }

    public /* synthetic */ d(long j8, Object obj, int i5) {
        this.f270a = i5;
        this.f271b = j8;
        this.f272c = obj;
    }

    @Override // s2.o
    /* renamed from: m, reason: collision with other method in class */
    public C mo0m(int i5, int i10) {
        return ((o) this.f272c).mo0m(i5, i10);
    }

    public /* synthetic */ d(Object obj, long j8, int i5) {
        this.f270a = i5;
        this.f272c = obj;
        this.f271b = j8;
    }

    public d(C3597b c3597b) {
        this.f270a = 3;
        AbstractC1732v.i(c3597b);
        this.f272c = c3597b;
    }

    public d(J5.h hVar, long j8) {
        this.f270a = 6;
        this.f272c = hVar;
        AbstractC4256a.e(hVar.f5646d >= j8);
        this.f271b = j8;
    }

    public d(j jVar, long j8) {
        this.f270a = 0;
        this.f272c = jVar;
        k.c(jVar.f44898d >= j8);
        this.f271b = j8;
    }

    public d() {
        this.f270a = 9;
        this.f271b = 0L;
    }
}
