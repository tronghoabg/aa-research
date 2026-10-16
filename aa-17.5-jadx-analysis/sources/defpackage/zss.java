package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Message;
import android.os.StrictMode;
import android.os.SystemClock;
import android.util.Base64;
import android.util.Log;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zss implements zst, zsk {
    public static final String a = "zss";
    private static final long f;
    private static final long g;
    private static final long h;
    private boolean B;
    private int C;
    private final zhe D;
    private final kex E;
    public final zsq b;
    public final CopyOnWriteArrayList d;
    public final SharedPreferences e;
    private final Random i;
    private final String j;
    private final String k;
    private final xyc l;
    private final zsl m;
    private final hqw n;
    private final ThreadFactory o;
    private final zrc p;
    private final Context q;
    private acbv r;
    private final ArrayList s;
    private boolean t;
    private boolean u;
    private ArrayList v;
    private boolean w;
    private boolean x;
    private long y;
    public Long c = null;
    private long z = Long.MIN_VALUE;
    private volatile int A = 0;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f = 15000L;
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        g = 2000L;
        TimeUnit timeUnit3 = TimeUnit.SECONDS;
        h = 30000L;
    }

    public zss(Context context, String str, String str2, xyc xycVar, acbv acbvVar, SharedPreferences sharedPreferences, hqw hqwVar, zsl zslVar, zrc zrcVar, Random random, ThreadFactory threadFactory, zhe zheVar, kex kexVar) {
        this.q = context != null ? context.getApplicationContext() : null;
        this.j = str;
        zkt.n(str2, "platformID");
        this.k = str2;
        zkt.n(xycVar, "distributionChannelSupplier");
        this.l = xycVar;
        zkt.n(acbvVar, "ClientPropertiesRequestProto");
        this.r = acbvVar;
        zkt.n(sharedPreferences, "SharedPreferences");
        this.e = sharedPreferences;
        zkt.n(hqwVar, "RequestQueue");
        this.n = hqwVar;
        this.m = zslVar;
        this.p = zrcVar;
        this.i = random;
        this.o = threadFactory;
        this.D = zheVar;
        this.E = kexVar;
        synchronized (this) {
            this.d = new CopyOnWriteArrayList();
            this.s = new ArrayList();
            this.v = new ArrayList();
            this.w = false;
            this.t = false;
            this.u = true;
            this.y = 0L;
            this.x = false;
            this.B = false;
            this.C = -1;
            this.b = new zsq(this);
        }
    }

    private final synchronized void B() {
        this.z = Long.MIN_VALUE;
        this.x = false;
        this.y = 0L;
        this.C = -1;
    }

    private static void C(String str, zbi zbiVar) {
        String str2 = a;
        if (zrn.e(str2, 3)) {
            Log.d(str2, str.concat(String.valueOf(Base64.encodeToString(zbiVar.h(), 2))));
        }
    }

    private static void D(SharedPreferences sharedPreferences, String str, String str2) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString(str, str2);
        StrictMode.ThreadPolicy threadPolicyB = zrr.a.b();
        try {
            editorEdit.commit();
        } finally {
            zrr.a.d(threadPolicyB);
        }
    }

    public final void A() {
        boolean z;
        synchronized (this) {
            if (this.x) {
                z = false;
            } else {
                String str = a;
                if (zrn.e(str, 6)) {
                    Log.e(str, "In Error Mode");
                }
                z = true;
                this.x = true;
                this.z = Long.MIN_VALUE;
            }
        }
        if (z) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
            }
        }
    }

    @Override // defpackage.zsk
    public final void a(zsl zslVar) throws Throwable {
        String strA = zslVar.a();
        synchronized (this) {
            abnp abnpVarK = this.r.K();
            if (strA != null) {
                abnpVarK.t();
                acbv acbvVar = (acbv) abnpVarK.b;
                acbvVar.c |= 32;
                acbvVar.x = strA;
            } else {
                abnpVarK.t();
                acbv acbvVar2 = (acbv) abnpVarK.b;
                acbvVar2.c &= -33;
                acbvVar2.x = acbv.a.x;
            }
            this.r = (acbv) abnpVarK.q();
        }
        g();
    }

    public final synchronized long b() {
        Long l = this.c;
        if (l != null) {
            return l.longValue();
        }
        long j = this.e.getLong("SessionID", 0L);
        if (j == 0) {
            String str = a;
            if (zrn.e(str, 4)) {
                Log.i(str, "No GMM Server cookie cached. Initiating new request.");
            }
            i(new zsz(this));
        } else {
            String str2 = a;
            if (zrn.e(str2, 4)) {
                Log.i(str2, "GMM Server cookie (cached): ".concat(String.valueOf(Long.toHexString(j))));
            }
        }
        Long lValueOf = Long.valueOf(j);
        this.c = lValueOf;
        return lValueOf.longValue();
    }

    public final synchronized long c() {
        long jNextLong;
        int i = this.C;
        jNextLong = this.y;
        if (i == 4) {
            jNextLong = jNextLong + 800 + (this.i.nextLong() % this.y);
        }
        return jNextLong;
    }

    public final synchronized acbv d() {
        return this.r;
    }

    public final synchronized String e() {
        acbv acbvVar = this.r;
        if ((acbvVar.c & 64) == 0) {
            return null;
        }
        return acbvVar.y;
    }

    public final synchronized String f() {
        acbv acbvVar = this.r;
        if ((acbvVar.b & 1024) == 0) {
            return null;
        }
        return acbvVar.i;
    }

    public final void g() throws Throwable {
        if (!v()) {
            return;
        }
        synchronized (this) {
            try {
                try {
                    zsv zsvVar = null;
                    if (!this.v.isEmpty() && this.w) {
                        ArrayList arrayList = this.v;
                        this.v = new ArrayList();
                        this.w = false;
                        String strA = this.m.a();
                        if (strA != null) {
                            synchronized (this) {
                                try {
                                    acbv acbvVar = this.r;
                                    if (!a.C((acbvVar.c & 32) != 0 ? acbvVar.x : null, strA)) {
                                        abnp abnpVarK = this.r.K();
                                        abnpVarK.t();
                                        acbv acbvVar2 = (acbv) abnpVarK.b;
                                        acbvVar2.c |= 32;
                                        acbvVar2.x = strA;
                                        this.r = (acbv) abnpVarK.q();
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    while (true) {
                                        try {
                                            throw th;
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                    }
                                }
                            }
                        }
                        zsvVar = new zsv(this.q, this, arrayList, zkt.n, this.m, this.n, this.j, this.k, this.l, this.o);
                    }
                    if (zsvVar != null) {
                        zsvVar.b.l();
                        Thread threadNewThread = zsvVar.e.newThread(zsvVar);
                        zkt.m(threadNewThread);
                        threadNewThread.start();
                    }
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public final void h() {
        if (w()) {
            g();
        }
    }

    @Override // defpackage.zst
    public final void i(zsr zsrVar) throws Throwable {
        zsrVar.d();
        String str = a;
        if (zrn.e(str, 3)) {
            Log.d(str, "Add Data Request: " + zsrVar.h());
        }
        synchronized (this) {
            if (zsrVar.e()) {
                this.w = true;
            }
            this.v.add(zsrVar);
        }
        if (zsrVar.e()) {
            g();
        }
    }

    public final synchronized void j() {
        this.A--;
    }

    public final synchronized void k(int i, Throwable th) {
        boolean z;
        String str = a;
        if (zrn.e(str, 6)) {
            Log.e(str, a.bp(i, "Error #"), th);
        }
        synchronized (this) {
            this.C = i;
            z = false;
            if (i == 4) {
                long j = this.y;
                if (j == 0 || this.x) {
                    B();
                    this.C = 4;
                    this.y = 200L;
                } else if (j < h) {
                    this.y = j + j;
                }
            } else if (this.x) {
                long j2 = this.y;
                long j3 = g;
                if (j2 >= j3) {
                    j3 = (j2 * 5) / 4;
                }
                this.y = j3;
                long j4 = h;
                if (j3 > j4) {
                    this.y = j4;
                }
            } else {
                this.y = 200L;
                long j5 = this.z;
                if (j5 == Long.MIN_VALUE) {
                    this.z = SystemClock.elapsedRealtime();
                } else if (j5 + f < SystemClock.elapsedRealtime()) {
                    z = true;
                }
            }
        }
        if (z) {
            A();
        }
    }

    public final synchronized void l() {
        this.A++;
    }

    public final synchronized void m() {
        zhe zheVar = this.D;
        if (zheVar == null) {
            String str = a;
            if (zrn.e(str, 3)) {
                Log.d(str, "ServerVersionMetadataManager is null, flag is disabled.");
            }
        } else {
            String str2 = a;
            if (zrn.e(str2, 3)) {
                Log.d(str2, "Using Non-null serverVersionMetadataManager to load previous metadata.");
            }
            String string = this.e.getString("ServerVersionMetadata", null);
            if (string != null) {
                byte[] bArrDecode = Base64.decode(string, 0);
                try {
                    zbi zbiVar = (zbi) abnv.B(zbi.a, bArrDecode, abnj.a());
                    zheVar.a = zbiVar;
                    C("Previous session server version metadata loaded: ", zbiVar);
                } catch (abon e) {
                    String str3 = a;
                    if (zrn.e(str3, 3)) {
                        Log.d(str3, "Could not load previous server version metadata. Skipping. ".concat(String.valueOf(e.getMessage())));
                    }
                }
            }
        }
    }

    public final synchronized void n() {
        String str = null;
        String string = (this.r.b & 1) != 0 ? null : this.e.getString("Cohort", null);
        String string2 = (this.r.b & 4) != 0 ? null : this.e.getString("LegalCountry", null);
        if ((this.r.b & 4096) == 0) {
            try {
                str = (String) ((zeu) this.E.g()).s();
            } catch (InterruptedException | ExecutionException e) {
                String str2 = a;
                if (zrn.e(str2, 6)) {
                    Log.e(str2, "Failed to get zb cookie: ".concat(String.valueOf(e.getMessage())));
                }
            }
        }
        if (string == null && string2 == null && str == null) {
            return;
        }
        abnp abnpVarK = this.r.K();
        if (string != null) {
            abnpVarK.t();
            acbv acbvVar = (acbv) abnpVarK.b;
            acbvVar.b |= 1;
            acbvVar.e = string;
        }
        if (string2 != null) {
            abnpVarK.t();
            acbv acbvVar2 = (acbv) abnpVarK.b;
            acbvVar2.b |= 4;
            acbvVar2.f = string2;
        }
        if (!woy.am(str)) {
            String str3 = a;
            if (zrn.e(str3, 4)) {
                Log.i(str3, String.format("Setting ZwiebackNidCookie: %s", str));
            }
            abnpVarK.t();
            acbv acbvVar3 = (acbv) abnpVarK.b;
            str.getClass();
            acbvVar3.b |= 4096;
            acbvVar3.k = str;
        }
        this.r = (acbv) abnpVarK.q();
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, zgp] */
    public final synchronized void o(acbw acbwVar) {
        zkt.n(acbwVar, "ClientPropertiesResponseProto");
        zhe zheVar = this.D;
        int i = 3;
        if (zheVar == null) {
            String str = a;
            if (zrn.e(str, 3)) {
                Log.d(str, "ServerVersionMetadataManager is null, flag is disabled.");
            }
        } else if ((acbwVar.b & 128) != 0) {
            zbi zbiVar = acbwVar.j;
            if (zbiVar == null) {
                zbiVar = zbi.a;
            }
            zheVar.g(zbiVar);
            D(this.e, "ServerVersionMetadata", Base64.encodeToString(((abmd) zheVar.b).h(), 0));
            C("Persisting server version metadata: ", (zbi) zheVar.b);
            zbi zbiVar2 = acbwVar.j;
            if (zbiVar2 == null) {
                zbiVar2 = zbi.a;
            }
            C("Response server version metadata: ", zbiVar2);
        } else {
            String str2 = a;
            if (zrn.e(str2, 3)) {
                Log.d(str2, "Response does not contain Server version metadata.");
            }
        }
        int i2 = acbwVar.b;
        String str3 = (i2 & 1) != 0 ? acbwVar.c : null;
        String str4 = (i2 & 2) != 0 ? acbwVar.d : null;
        String str5 = (i2 & 8) != 0 ? acbwVar.e : null;
        if (str3 == null && str4 == null && str5 == null) {
            return;
        }
        abnp abnpVarK = this.r.K();
        if (str3 != null) {
            abnpVarK.t();
            acbv acbvVar = (acbv) abnpVarK.b;
            acbvVar.b |= 1;
            acbvVar.e = str3;
            D(this.e, "Cohort", str3);
        }
        if (str4 != null) {
            abnpVarK.t();
            acbv acbvVar2 = (acbv) abnpVarK.b;
            acbvVar2.b |= 4;
            acbvVar2.f = str4;
            D(this.e, "LegalCountry", str4);
        }
        if (str5 != null) {
            String str6 = a;
            if (zrn.e(str6, 4)) {
                Log.i(str6, String.format("Updating ZwiebackNidCookie from response: %s", str5));
            }
            abnpVarK.t();
            acbv acbvVar3 = (acbv) abnpVarK.b;
            acbvVar3.b |= 4096;
            acbvVar3.k = str5;
            kex kexVar = this.E;
            zfb.f(kexVar.a, new rgf(new fzr(str5, Instant.now().toEpochMilli(), i), 7), kexVar.c);
        }
        this.r = (acbv) abnpVarK.q();
    }

    public final synchronized void p() {
        ArrayList arrayList = this.s;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((zvz) arrayList.get(i)).a();
        }
    }

    public final synchronized void q() {
        ArrayList arrayList = this.s;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((zvz) arrayList.get(i)).b();
        }
    }

    public final void r(zsr zsrVar) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            Message.obtain((Handler) ((aacq) it.next()).a, 0, zsrVar).sendToTarget();
        }
    }

    public final synchronized void s() {
        this.B = true;
        B();
    }

    @Override // defpackage.zst
    public final void t() {
        synchronized (this) {
            this.t = true;
        }
        h();
    }

    @Override // defpackage.zst
    public final synchronized void u() {
        this.t = false;
    }

    public final synchronized boolean v() {
        boolean z = false;
        if (x() && this.A < 10) {
            if (this.B) {
                z = true;
            } else if (this.A == 0) {
                return true;
            }
        }
        return z;
    }

    public final synchronized boolean w() {
        return this.w;
    }

    public final synchronized boolean x() {
        return this.t;
    }

    public final synchronized boolean y() {
        return this.u;
    }

    @Override // defpackage.zst
    public final synchronized void z(zvz zvzVar) {
        ArrayList arrayList = this.s;
        if (arrayList.contains(zvzVar)) {
            return;
        }
        arrayList.add(zvzVar);
    }
}
