package com.google.firebase.crashlytics.a.c;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import androidx.car.app.CarContext;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.firebase.crashlytics.a.e.be;
import com.google.firebase.crashlytics.a.e.cv;
import com.google.firebase.crashlytics.a.e.cw;
import com.google.firebase.crashlytics.a.e.cx;
import com.google.firebase.crashlytics.a.e.cy;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPOutputStream;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class aa {

    /* renamed from: a, reason: collision with root package name */
    static final FilenameFilter f9073a = new o(0);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f9074f = 0;

    /* renamed from: b, reason: collision with root package name */
    final com.google.android.gms.o.w f9075b = new com.google.android.gms.o.w();

    /* renamed from: c, reason: collision with root package name */
    final com.google.android.gms.o.w f9076c = new com.google.android.gms.o.w();

    /* renamed from: d, reason: collision with root package name */
    final com.google.android.gms.o.w f9077d = new com.google.android.gms.o.w();

    /* renamed from: e, reason: collision with root package name */
    final AtomicBoolean f9078e = new AtomicBoolean(false);

    /* renamed from: g, reason: collision with root package name */
    private final Context f9079g;

    /* renamed from: h, reason: collision with root package name */
    private final aj f9080h;

    /* renamed from: i, reason: collision with root package name */
    private final af f9081i;

    /* renamed from: j, reason: collision with root package name */
    private final com.google.firebase.crashlytics.a.d.t f9082j;

    /* renamed from: k, reason: collision with root package name */
    private final n f9083k;

    /* renamed from: l, reason: collision with root package name */
    private final aq f9084l;
    private final com.google.firebase.crashlytics.a.f.c m;
    private final a n;
    private final com.google.firebase.crashlytics.a.d.f o;
    private final com.google.firebase.crashlytics.a.a p;
    private final com.google.firebase.crashlytics.a.a.a q;
    private final j r;
    private final av s;
    private ai t;

    aa(Context context, n nVar, aq aqVar, aj ajVar, com.google.firebase.crashlytics.a.f.c cVar, af afVar, a aVar, com.google.firebase.crashlytics.a.d.t tVar, com.google.firebase.crashlytics.a.d.f fVar, av avVar, com.google.firebase.crashlytics.a.a aVar2, com.google.firebase.crashlytics.a.a.a aVar3, j jVar) {
        this.f9079g = context;
        this.f9083k = nVar;
        this.f9084l = aqVar;
        this.f9080h = ajVar;
        this.m = cVar;
        this.f9081i = afVar;
        this.n = aVar;
        this.f9082j = tVar;
        this.o = fVar;
        this.p = aVar2;
        this.q = aVar3;
        this.r = jVar;
        this.s = avVar;
    }

    private static long A() {
        return B(System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long B(long j2) {
        return j2 / 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String C() {
        SortedSet sortedSetA = this.s.a();
        if (sortedSetA.isEmpty()) {
            return null;
        }
        return (String) sortedSetA.first();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(long j2) throws IOException {
        try {
            if (this.m.a(".ae" + j2).createNewFile()) {
            } else {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e2) {
            com.google.firebase.crashlytics.a.i.a().i("Could not create app exception marker file.", e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v16, types: [com.google.firebase.crashlytics.a.c.ao] */
    /* JADX WARN: Type inference failed for: r19v0, types: [boolean] */
    private final void E(boolean z, com.google.firebase.crashlytics.a.h.f fVar) throws Throwable {
        String str;
        InputStream inputStream;
        InputStream inputStreamB;
        GZIPOutputStream gZIPOutputStream;
        av avVar = this.s;
        ArrayList arrayList = new ArrayList(avVar.a());
        if (arrayList.size() <= z) {
            com.google.firebase.crashlytics.a.i.a().g("No open sessions to be closed.");
            return;
        }
        String str2 = (String) arrayList.get(z == true ? 1 : 0);
        if (!fVar.c().f9741b.f9737b) {
            com.google.firebase.crashlytics.a.i.a().g("ANR feature disabled.");
        } else if (Build.VERSION.SDK_INT >= 30) {
            List historicalProcessExitReasons = ((ActivityManager) this.f9079g.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
            if (historicalProcessExitReasons.size() != 0) {
                com.google.firebase.crashlytics.a.f.c cVar = this.m;
                avVar.g(str2, historicalProcessExitReasons, new com.google.firebase.crashlytics.a.d.f(cVar, str2), com.google.firebase.crashlytics.a.d.t.c(str2, cVar, this.f9083k));
            } else {
                com.google.firebase.crashlytics.a.i.a().g("No ApplicationExitInfo available. Session: ".concat(String.valueOf(str2)));
            }
        } else {
            com.google.firebase.crashlytics.a.i.a().g("ANR feature enabled, but device is API " + Build.VERSION.SDK_INT);
        }
        com.google.firebase.crashlytics.a.a aVar = this.p;
        if (aVar.hasCrashDataForSession(str2)) {
            com.google.firebase.crashlytics.a.i.a().g("Finalizing native report for session ".concat(String.valueOf(str2)));
            com.google.firebase.crashlytics.a.j sessionFileProvider = aVar.getSessionFileProvider(str2);
            File fileE = sessionFileProvider.e();
            be beVarA = sessionFileProvider.a();
            if (fileE == null || !fileE.exists()) {
                com.google.firebase.crashlytics.a.i.a().h("No minidump data found for session ".concat(String.valueOf(str2)));
            }
            if (beVarA == null) {
                com.google.firebase.crashlytics.a.i.a().f("No Tombstones data found for session ".concat(String.valueOf(str2)));
            }
            if ((fileE == null || !fileE.exists()) && beVarA == null) {
                com.google.firebase.crashlytics.a.i.a().h("No native core present");
            } else {
                long jLastModified = fileE.lastModified();
                com.google.firebase.crashlytics.a.f.c cVar2 = this.m;
                com.google.firebase.crashlytics.a.d.f fVar2 = new com.google.firebase.crashlytics.a.d.f(cVar2, str2);
                File fileC = cVar2.c(str2);
                if (fileC.isDirectory()) {
                    D(jLastModified);
                    byte[] bArrE = fVar2.e();
                    File fileF = cVar2.f(str2, "user-data");
                    File fileF2 = cVar2.f(str2, "keys");
                    File fileF3 = cVar2.f(str2, "rollouts-state");
                    ArrayList<au> arrayList2 = new ArrayList();
                    int i2 = 0;
                    arrayList2.add(new d("logs_file", "logs", bArrE));
                    arrayList2.add(new ao("crash_meta_file", TtmlNode.TAG_METADATA, sessionFileProvider.d()));
                    arrayList2.add(new ao("session_meta_file", "session", sessionFileProvider.g()));
                    arrayList2.add(new ao("app_meta_file", CarContext.APP_SERVICE, sessionFileProvider.b()));
                    arrayList2.add(new ao("device_meta_file", "device", sessionFileProvider.c()));
                    arrayList2.add(new ao("os_meta_file", "os", sessionFileProvider.f()));
                    File fileE2 = sessionFileProvider.e();
                    arrayList2.add((fileE2 == null || !fileE2.exists()) ? new d("minidump_file", "minidump", new byte[]{0}) : new ao("minidump_file", "minidump", fileE2));
                    arrayList2.add(new ao("user_meta_file", "user", fileF));
                    arrayList2.add(new ao("keys_file", "keys", fileF2));
                    arrayList2.add(new ao("rollouts_file", "rollouts", fileF3));
                    for (au auVar : arrayList2) {
                        try {
                            inputStreamB = auVar.b();
                        } catch (IOException unused) {
                            inputStreamB = null;
                        } catch (Throwable th) {
                            th = th;
                            inputStream = null;
                        }
                        if (inputStreamB == null) {
                            int i3 = g.f9183a;
                        } else {
                            try {
                                File file = new File(fileC, auVar.c());
                                byte[] bArr = new byte[8192];
                                try {
                                    gZIPOutputStream = new GZIPOutputStream(new FileOutputStream(file));
                                    while (true) {
                                        try {
                                            int i4 = inputStreamB.read(bArr);
                                            if (i4 <= 0) {
                                                break;
                                            }
                                            gZIPOutputStream.write(bArr, i2, i4);
                                            i2 = 0;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            int i5 = g.f9183a;
                                            com.waze.c.c.e.f(gZIPOutputStream);
                                            throw th;
                                        }
                                    }
                                    gZIPOutputStream.finish();
                                    int i6 = g.f9183a;
                                    com.waze.c.c.e.f(gZIPOutputStream);
                                    com.waze.c.c.e.f(inputStreamB);
                                } catch (Throwable th3) {
                                    th = th3;
                                    gZIPOutputStream = null;
                                }
                            } catch (IOException unused2) {
                                int i7 = g.f9183a;
                                com.waze.c.c.e.f(inputStreamB);
                                i2 = 0;
                            } catch (Throwable th4) {
                                th = th4;
                                inputStream = inputStreamB;
                                int i8 = g.f9183a;
                                com.waze.c.c.e.f(inputStream);
                                throw th;
                            }
                            i2 = 0;
                        }
                    }
                    com.google.firebase.crashlytics.a.i.a().b("CrashlyticsController#finalizePreviousNativeSession");
                    avVar.b(str2, arrayList2, beVarA);
                    fVar2.b();
                } else {
                    com.google.firebase.crashlytics.a.i.a().h("Couldn't create directory to store native session files, aborting.");
                }
            }
        }
        if (z != 0) {
            str = (String) arrayList.get(0);
        } else {
            this.r.c(null);
            str = null;
        }
        avVar.c(A(), str);
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.o.t b(aa aaVar) throws NumberFormatException, ClassNotFoundException {
        com.google.android.gms.o.t tVarA;
        ArrayList arrayList = new ArrayList();
        for (File file : aaVar.l()) {
            try {
                long j2 = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    com.google.firebase.crashlytics.a.i.a().h("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
                    tVarA = com.google.android.gms.o.ag.c(null);
                } catch (ClassNotFoundException unused) {
                    com.google.firebase.crashlytics.a.i.a().b("Logging app exception event to Firebase Analytics");
                    tVarA = com.google.android.gms.o.ag.a(new ScheduledThreadPoolExecutor(1), new z(aaVar, j2));
                }
                arrayList.add(tVarA);
            } catch (NumberFormatException unused2) {
                com.google.firebase.crashlytics.a.i.a().h("Could not parse app exception timestamp from file ".concat(String.valueOf(file.getName())));
            }
            file.delete();
        }
        return com.google.android.gms.o.ag.d(arrayList);
    }

    static /* bridge */ /* synthetic */ void m(aa aaVar, String str, Boolean bool) throws IOException {
        String strValueOf = String.valueOf(str);
        long jA = A();
        com.google.firebase.crashlytics.a.i.a().b("Opening a new session with ID ".concat(strValueOf));
        String str2 = String.format(Locale.US, "Crashlytics Android SDK/%s", "19.0.4_1p");
        aq aqVar = aaVar.f9084l;
        String strD = aqVar.d();
        String strB = aqVar.b().b();
        a aVar = aaVar.n;
        cv cvVarA = cv.a(strD, aVar.f9070f, aVar.f9071g, strB, an.b(aVar.f9068d), aVar.f9072h);
        cx cxVarA = cx.a(Build.VERSION.RELEASE, Build.VERSION.CODENAME, g.m());
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        aaVar.p.prepareNativeSession(str, str2, jA, cy.a(cvVarA, cxVarA, cw.a(f.a().ordinal(), Build.MODEL, Runtime.getRuntime().availableProcessors(), g.c(aaVar.f9079g), statFs.getBlockCount() * statFs.getBlockSize(), g.l(), g.a(), Build.MANUFACTURER, Build.PRODUCT)));
        bool.booleanValue();
        aaVar.o.c(str);
        aaVar.r.c(str);
        aaVar.s.d(str, jA);
    }

    final com.google.android.gms.o.t c(com.google.android.gms.o.t tVar) {
        com.google.android.gms.o.t tVarA;
        if (!this.s.i()) {
            com.google.firebase.crashlytics.a.i.a().g("No crash reports are available to be sent.");
            this.f9075b.e(false);
            return com.google.android.gms.o.ag.c(null);
        }
        com.google.firebase.crashlytics.a.i.a().g("Crash reports are available to be sent.");
        aj ajVar = this.f9080h;
        if (ajVar.e()) {
            com.google.firebase.crashlytics.a.i.a().b("Automatic data collection is enabled. Allowing upload.");
            this.f9075b.e(false);
            tVarA = com.google.android.gms.o.ag.c(true);
        } else {
            com.google.firebase.crashlytics.a.i.a().b("Automatic data collection is disabled.");
            com.google.firebase.crashlytics.a.i.a().g("Notifying that unsent reports are available.");
            this.f9075b.e(true);
            com.google.android.gms.o.t tVarD = ajVar.a().d(new s(this));
            com.google.firebase.crashlytics.a.i.a().b("Waiting for send/deleteUnsentReports to be called.");
            com.google.android.gms.o.t tVarA2 = this.f9076c.a();
            int i2 = ay.f9162a;
            com.google.android.gms.o.w wVar = new com.google.android.gms.o.w();
            aw awVar = new aw(wVar, 1);
            tVarD.a(awVar);
            tVarA2.a(awVar);
            tVarA = wVar.a();
        }
        return tVarA.d(new v(this, tVar));
    }

    final List l() {
        return this.m.h(f9073a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[Catch: IOException -> 0x0077, TryCatch #0 {IOException -> 0x0077, blocks: (B:2:0x0000, B:4:0x000d, B:17:0x0053, B:23:0x006b, B:20:0x005a, B:22:0x0062, B:24:0x0075, B:11:0x002b, B:12:0x003d, B:14:0x0045, B:15:0x0049, B:6:0x0018, B:8:0x001e), top: B:29:0x0000, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void o() throws java.io.IOException {
        /*
            r6 = this;
            java.lang.String r0 = "META-INF/version-control-info.textproto"
            java.lang.Class r1 = r6.getClass()     // Catch: java.io.IOException -> L77
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.io.IOException -> L77
            r2 = 0
            if (r1 != 0) goto L18
            com.google.firebase.crashlytics.a.i r0 = com.google.firebase.crashlytics.a.i.a()     // Catch: java.io.IOException -> L77
            java.lang.String r1 = "Couldn't get Class Loader"
            r0.h(r1)     // Catch: java.io.IOException -> L77
        L16:
            r0 = r2
            goto L28
        L18:
            java.io.InputStream r0 = r1.getResourceAsStream(r0)     // Catch: java.io.IOException -> L77
            if (r0 != 0) goto L28
            com.google.firebase.crashlytics.a.i r0 = com.google.firebase.crashlytics.a.i.a()     // Catch: java.io.IOException -> L77
            java.lang.String r1 = "No version control information found"
            r0.f(r1)     // Catch: java.io.IOException -> L77
            goto L16
        L28:
            if (r0 != 0) goto L2b
            goto L51
        L2b:
            com.google.firebase.crashlytics.a.i r1 = com.google.firebase.crashlytics.a.i.a()     // Catch: java.io.IOException -> L77
            java.lang.String r2 = "Read version control info"
            r1.b(r2)     // Catch: java.io.IOException -> L77
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.io.IOException -> L77
            r1.<init>()     // Catch: java.io.IOException -> L77
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r2]     // Catch: java.io.IOException -> L77
        L3d:
            int r3 = r0.read(r2)     // Catch: java.io.IOException -> L77
            r4 = -1
            r5 = 0
            if (r3 == r4) goto L49
            r1.write(r2, r5, r3)     // Catch: java.io.IOException -> L77
            goto L3d
        L49:
            byte[] r0 = r1.toByteArray()     // Catch: java.io.IOException -> L77
            java.lang.String r2 = android.util.Base64.encodeToString(r0, r5)     // Catch: java.io.IOException -> L77
        L51:
            if (r2 == 0) goto L76
            com.google.firebase.crashlytics.a.d.t r0 = r6.f9082j     // Catch: java.lang.IllegalArgumentException -> L59 java.io.IOException -> L77
            r0.n(r2)     // Catch: java.lang.IllegalArgumentException -> L59 java.io.IOException -> L77
            goto L6b
        L59:
            r0 = move-exception
            android.content.Context r6 = r6.f9079g     // Catch: java.io.IOException -> L77
            boolean r6 = com.google.firebase.crashlytics.a.c.g.k(r6)     // Catch: java.io.IOException -> L77
            if (r6 != 0) goto L75
            com.google.firebase.crashlytics.a.i r6 = com.google.firebase.crashlytics.a.i.a()     // Catch: java.io.IOException -> L77
            java.lang.String r0 = "Attempting to set custom attribute with null key, ignoring."
            r6.d(r0)     // Catch: java.io.IOException -> L77
        L6b:
            com.google.firebase.crashlytics.a.i r6 = com.google.firebase.crashlytics.a.i.a()     // Catch: java.io.IOException -> L77
            java.lang.String r0 = "Saved version control info"
            r6.f(r0)     // Catch: java.io.IOException -> L77
            goto L76
        L75:
            throw r0     // Catch: java.io.IOException -> L77
        L76:
            return
        L77:
            r6 = move-exception
            com.google.firebase.crashlytics.a.i r0 = com.google.firebase.crashlytics.a.i.a()
            java.lang.String r1 = "Unable to save version control info"
            r0.i(r1, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.a.c.aa.o():void");
    }

    final void p(String str, String str2) {
        try {
            this.f9082j.l(str, str2);
        } catch (IllegalArgumentException e2) {
            if (g.k(this.f9079g)) {
                throw e2;
            }
            com.google.firebase.crashlytics.a.i.a().d("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    final void q(String str) {
        this.f9082j.i(str);
    }

    final void r(Thread thread, Throwable th) {
        x xVar = new x(this, System.currentTimeMillis(), th, thread);
        n nVar = this.f9083k;
        nVar.a(new ad(nVar, xVar, 1));
    }

    final void s(long j2, String str) {
        this.f9083k.a(new w(this, j2, str));
    }

    final boolean t() {
        af afVar = this.f9081i;
        if (!afVar.a()) {
            String strC = C();
            return strC != null && this.p.hasCrashDataForSession(strC);
        }
        com.google.firebase.crashlytics.a.i.a().g("Found previous crash marker.");
        afVar.b();
        return Boolean.TRUE.booleanValue();
    }

    final boolean u() {
        ai aiVar = this.t;
        return aiVar != null && aiVar.a();
    }

    final void v(com.google.firebase.crashlytics.a.h.f fVar) throws Throwable {
        E(false, fVar);
    }

    final void w(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, com.google.firebase.crashlytics.a.h.f fVar) {
        this.f9083k.a(new y(this, str));
        ai aiVar = new ai(new p(this), fVar, uncaughtExceptionHandler, this.p);
        this.t = aiVar;
        Thread.setDefaultUncaughtExceptionHandler(aiVar);
    }

    final boolean x(com.google.firebase.crashlytics.a.h.f fVar) throws Throwable {
        this.f9083k.e();
        if (u()) {
            com.google.firebase.crashlytics.a.i.a().h("Skipping session finalization because a crash has already occurred.");
            return Boolean.FALSE.booleanValue();
        }
        com.google.firebase.crashlytics.a.i.a().g("Finalizing previously open sessions.");
        try {
            E(true, fVar);
            com.google.firebase.crashlytics.a.i.a().g("Closed all previously open sessions.");
            return true;
        } catch (Exception e2) {
            com.google.firebase.crashlytics.a.i.a().e("Unable to finalize previously open sessions.", e2);
            return false;
        }
    }

    final synchronized void y(com.google.firebase.crashlytics.a.h.f fVar, Thread thread, Throwable th) throws Throwable {
        aa aaVar;
        try {
            try {
                com.google.firebase.crashlytics.a.i.a().b("Handling uncaught exception \"" + th.toString() + "\" from thread " + thread.getName());
                aaVar = this;
                try {
                    ay.a(aaVar.f9083k.b(new r(aaVar, System.currentTimeMillis(), th, thread, fVar)));
                } catch (TimeoutException unused) {
                    com.google.firebase.crashlytics.a.i.a().d("Cannot send reports. Timed out while fetching settings.");
                } catch (Exception e2) {
                    com.google.firebase.crashlytics.a.i.a().e("Error handling uncaught exception", e2);
                }
            } catch (Throwable th2) {
                th = th2;
                aaVar = this;
                Throwable th3 = th;
                throw th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    final void z() {
        this.f9082j.m();
    }
}
