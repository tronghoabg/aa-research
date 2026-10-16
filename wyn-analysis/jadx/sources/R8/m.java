package R8;

import A7.C0237b0;
import D6.C0388o;
import G6.S;
import U8.B;
import U8.C;
import U8.C0875j0;
import U8.C0881m0;
import U8.C0883n0;
import U8.C0885o0;
import U8.C0887p0;
import U8.J;
import U8.K;
import U8.L;
import U8.N;
import U8.P0;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import c8.C1581e;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;

/* loaded from: classes4.dex */
public final class m {

    /* renamed from: t, reason: collision with root package name */
    public static final h f10476t = new h(1);

    /* renamed from: a, reason: collision with root package name */
    public final Context f10477a;

    /* renamed from: b, reason: collision with root package name */
    public final R0.e f10478b;

    /* renamed from: c, reason: collision with root package name */
    public final S3.e f10479c;

    /* renamed from: d, reason: collision with root package name */
    public final X8.c f10480d;

    /* renamed from: e, reason: collision with root package name */
    public final S8.f f10481e;

    /* renamed from: f, reason: collision with root package name */
    public final z f10482f;

    /* renamed from: g, reason: collision with root package name */
    public final X8.c f10483g;

    /* renamed from: h, reason: collision with root package name */
    public final C0805a f10484h;

    /* renamed from: i, reason: collision with root package name */
    public final T8.e f10485i;

    /* renamed from: j, reason: collision with root package name */
    public final O8.a f10486j;
    public final N8.a k;

    /* renamed from: l, reason: collision with root package name */
    public final j f10487l;

    /* renamed from: m, reason: collision with root package name */
    public final C0388o f10488m;

    /* renamed from: n, reason: collision with root package name */
    public u f10489n;

    /* renamed from: o, reason: collision with root package name */
    public K3.r f10490o = null;

    /* renamed from: p, reason: collision with root package name */
    public final TaskCompletionSource f10491p = new TaskCompletionSource();

    /* renamed from: q, reason: collision with root package name */
    public final TaskCompletionSource f10492q = new TaskCompletionSource();

    /* renamed from: r, reason: collision with root package name */
    public final TaskCompletionSource f10493r = new TaskCompletionSource();

    /* renamed from: s, reason: collision with root package name */
    public final AtomicBoolean f10494s = new AtomicBoolean(false);

    public m(Context context, z zVar, R0.e eVar, X8.c cVar, S3.e eVar2, C0805a c0805a, X8.c cVar2, T8.e eVar3, C0388o c0388o, O8.a aVar, N8.a aVar2, j jVar, S8.f fVar) {
        this.f10477a = context;
        this.f10482f = zVar;
        this.f10478b = eVar;
        this.f10483g = cVar;
        this.f10479c = eVar2;
        this.f10484h = c0805a;
        this.f10480d = cVar2;
        this.f10485i = eVar3;
        this.f10486j = aVar;
        this.k = aVar2;
        this.f10487l = jVar;
        this.f10488m = c0388o;
        this.f10481e = fVar;
    }

    public static Task a(m mVar) {
        Task taskCall;
        mVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : X8.c.h(((File) mVar.f10483g.f16186c).listFiles(f10476t))) {
            try {
                long j8 = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    Log.w("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists", null);
                    taskCall = Tasks.forResult(null);
                } catch (ClassNotFoundException unused) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Logging app exception event to Firebase Analytics", null);
                    }
                    taskCall = Tasks.call(new ScheduledThreadPoolExecutor(1), new l(mVar, j8));
                }
                arrayList.add(taskCall);
            } catch (NumberFormatException unused2) {
                Log.w("FirebaseCrashlytics", "Could not parse app exception timestamp from file " + file.getName(), null);
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String f() throws java.io.IOException {
        /*
            java.lang.Class<R8.m> r0 = R8.m.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r1 = 0
            java.lang.String r2 = "FirebaseCrashlytics"
            if (r0 != 0) goto L12
            java.lang.String r0 = "Couldn't get Class Loader"
            android.util.Log.w(r2, r0, r1)
        L10:
            r0 = r1
            goto L20
        L12:
            java.lang.String r3 = "META-INF/version-control-info.textproto"
            java.io.InputStream r0 = r0.getResourceAsStream(r3)
            if (r0 != 0) goto L20
            java.lang.String r0 = "No version control information found"
            android.util.Log.i(r2, r0, r1)
            goto L10
        L20:
            if (r0 != 0) goto L23
            return r1
        L23:
            r3 = 3
            boolean r3 = android.util.Log.isLoggable(r2, r3)
            if (r3 == 0) goto L2f
            java.lang.String r3 = "Read version control info"
            android.util.Log.d(r2, r3, r1)
        L2f:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r2]
        L38:
            int r3 = r0.read(r2)
            r4 = -1
            r5 = 0
            if (r3 == r4) goto L44
            r1.write(r2, r5, r3)
            goto L38
        L44:
            byte[] r0 = r1.toByteArray()
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: R8.m.f():java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:130:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04e7 A[LOOP:2: B:155:0x04e7->B:160:0x0504, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x076a  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0191 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:329:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02d9  */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19, types: [int] */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r33v0, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(boolean r33, K3.r r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 1923
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R8.m.b(boolean, K3.r, boolean):void");
    }

    public final void c(String str, Boolean bool) {
        String str2;
        String str3;
        String str4;
        int i5;
        Integer num;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        String strF = v.f("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strF, null);
        }
        Locale locale = Locale.US;
        z zVar = this.f10482f;
        C0805a c0805a = this.f10484h;
        C0883n0 c0883n0 = new C0883n0(zVar.f10547c, (String) c0805a.f10440e, (String) c0805a.f10441f, zVar.c().f10447a, v.b(((String) c0805a.f10438c) != null ? 4 : 1), (S3.s) c0805a.f10443h);
        String str5 = Build.VERSION.RELEASE;
        String str6 = Build.VERSION.CODENAME;
        C0887p0 c0887p0 = new C0887p0(g.g());
        Context context = this.f10477a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        f fVar = f.f10456a;
        String str7 = Build.CPU_ABI;
        boolean zIsEmpty = TextUtils.isEmpty(str7);
        f fVar2 = f.f10456a;
        if (!zIsEmpty) {
            f fVar3 = (f) f.f10457b.get(str7.toLowerCase(locale));
            if (fVar3 != null) {
                fVar2 = fVar3;
            }
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
        }
        int iOrdinal = fVar2.ordinal();
        String str8 = Build.MODEL;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jA = g.a(context);
        boolean zF = g.f();
        int iC = g.c();
        String str9 = Build.MANUFACTURER;
        String str10 = Build.PRODUCT;
        this.f10486j.d(str, jCurrentTimeMillis, new C0881m0(c0883n0, c0887p0, new C0885o0(iOrdinal, iAvailableProcessors, jA, blockCount, zF, iC)));
        if (!bool.booleanValue() || str == null) {
            str2 = str6;
            str3 = str9;
            str4 = str10;
            i5 = 4;
        } else {
            X8.c cVar = this.f10480d;
            synchronized (((String) cVar.f16184a)) {
                cVar.f16184a = str;
                str4 = str10;
                str2 = str6;
                str3 = str9;
                i5 = 4;
                ((S8.f) cVar.f16186c).f11035b.b(new Cb.a(cVar, str, ((T8.d) ((AtomicMarkableReference) ((C0237b0) cVar.f16187d).f813c).getReference()).a(), ((I9.a) cVar.f16189f).b(), 5));
            }
        }
        T8.e eVar = this.f10485i;
        ((T8.c) eVar.f11792b).a();
        eVar.f11792b = T8.e.f11790c;
        if (str != null) {
            eVar.f11792b = new T8.l(((X8.c) eVar.f11791a).d(str, "userlog"));
        }
        this.f10487l.a(str);
        C0388o c0388o = this.f10488m;
        t tVar = (t) c0388o.f2462a;
        Charset charset = P0.f12460a;
        B b5 = new B();
        b5.f12354a = "19.3.0";
        C0805a c0805a2 = tVar.f10529c;
        String str11 = (String) c0805a2.f10436a;
        if (str11 == null) {
            throw new NullPointerException("Null gmpAppId");
        }
        b5.f12355b = str11;
        z zVar2 = tVar.f10528b;
        String str12 = zVar2.c().f10447a;
        if (str12 == null) {
            throw new NullPointerException("Null installationUuid");
        }
        b5.f12357d = str12;
        b5.f12358e = zVar2.c().f10448b;
        b5.f12359f = zVar2.c().f10449c;
        String str13 = (String) c0805a2.f10440e;
        if (str13 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        b5.f12361h = str13;
        String str14 = (String) c0805a2.f10441f;
        if (str14 == null) {
            throw new NullPointerException("Null displayVersion");
        }
        b5.f12362i = str14;
        b5.f12356c = i5;
        b5.f12365m = (byte) (b5.f12365m | 1);
        J j8 = new J();
        j8.f12410f = false;
        byte b10 = (byte) (j8.f12416m | 2);
        j8.f12408d = jCurrentTimeMillis;
        j8.f12416m = (byte) (b10 | 1);
        if (str == null) {
            throw new NullPointerException("Null identifier");
        }
        j8.f12406b = str;
        String str15 = t.f10526g;
        if (str15 == null) {
            throw new NullPointerException("Null generator");
        }
        j8.f12405a = str15;
        String str16 = zVar2.f10547c;
        if (str16 == null) {
            throw new NullPointerException("Null identifier");
        }
        String str17 = zVar2.c().f10447a;
        S3.s sVar = (S3.s) c0805a2.f10443h;
        if (((S) sVar.f11010c) == null) {
            sVar.f11010c = new S(sVar);
        }
        S s10 = (S) sVar.f11010c;
        String str18 = s10.f4560a;
        if (s10 == null) {
            sVar.f11010c = new S(sVar);
        }
        j8.f12411g = new L(str16, str13, str14, str17, str18, ((S) sVar.f11010c).f4561b);
        C0875j0 c0875j0 = new C0875j0();
        c0875j0.f12606a = 3;
        c0875j0.f12610e = (byte) (c0875j0.f12610e | 1);
        if (str5 == null) {
            throw new NullPointerException("Null version");
        }
        c0875j0.f12607b = str5;
        String str19 = str2;
        if (str19 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        c0875j0.f12608c = str19;
        c0875j0.f12609d = g.g();
        c0875j0.f12610e = (byte) (c0875j0.f12610e | 2);
        j8.f12413i = c0875j0.a();
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        int iIntValue = 7;
        if (!TextUtils.isEmpty(str7) && (num = (Integer) t.f10525f.get(str7.toLowerCase(locale))) != null) {
            iIntValue = num.intValue();
        }
        int iAvailableProcessors2 = Runtime.getRuntime().availableProcessors();
        long jA2 = g.a(tVar.f10527a);
        long blockCount2 = statFs2.getBlockCount() * statFs2.getBlockSize();
        boolean zF2 = g.f();
        int iC2 = g.c();
        N n10 = new N();
        n10.f12434a = iIntValue;
        byte b11 = (byte) (n10.f12443j | 1);
        n10.f12443j = b11;
        if (str8 == null) {
            throw new NullPointerException("Null model");
        }
        n10.f12435b = str8;
        n10.f12436c = iAvailableProcessors2;
        n10.f12437d = jA2;
        n10.f12438e = blockCount2;
        n10.f12439f = zF2;
        n10.f12440g = iC2;
        n10.f12443j = (byte) (((byte) (((byte) (((byte) (((byte) (b11 | 2)) | 4)) | 8)) | 16)) | 32);
        String str20 = str3;
        if (str20 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        n10.f12441h = str20;
        String str21 = str4;
        if (str21 == null) {
            throw new NullPointerException("Null modelClass");
        }
        n10.f12442i = str21;
        j8.f12414j = n10.a();
        j8.f12415l = 3;
        j8.f12416m = (byte) (j8.f12416m | 4);
        b5.f12363j = j8.a();
        C cA = b5.a();
        X8.c cVar2 = ((X8.a) c0388o.f2463b).f16180b;
        K k = cA.k;
        if (k == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                return;
            }
            return;
        }
        String str22 = k.f12418b;
        try {
            X8.a.f16176g.getClass();
            X8.a.f(cVar2.d(str22, "report"), V8.a.f13166a.j(cA));
            File fileD = cVar2.d(str22, "start-time");
            long j10 = k.f12420d;
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(fileD), X8.a.f16174e);
            try {
                outputStreamWriter.write("");
                fileD.setLastModified(j10 * 1000);
                outputStreamWriter.close();
            } finally {
            }
        } catch (IOException e7) {
            String strF2 = v.f("Could not persist report for session ", str22);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", strF2, e7);
            }
        }
    }

    public final boolean d(K3.r rVar) {
        S8.f.a();
        u uVar = this.f10489n;
        if (uVar != null && uVar.f10536e.get()) {
            Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", null);
            return false;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", null);
        }
        try {
            b(true, rVar, true);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Closed all previously open sessions.", null);
            }
            return true;
        } catch (Exception e7) {
            Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e7);
            return false;
        }
    }

    public final String e() {
        NavigableSet navigableSetC = ((X8.a) this.f10488m.f2463b).c();
        if (navigableSetC.isEmpty()) {
            return null;
        }
        return (String) navigableSetC.first();
    }

    public final synchronized void g(K3.r rVar, Thread thread, Throwable th, boolean z2) throws Throwable {
        Throwable th2;
        try {
            try {
                String str = "Handling uncaught exception \"" + th + "\" from thread " + thread.getName();
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    try {
                        Log.d("FirebaseCrashlytics", str, null);
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
                Task taskC = this.f10481e.f11034a.c(new k(this, System.currentTimeMillis(), th, thread, rVar, z2));
                if (!z2) {
                    try {
                        A.a(taskC);
                    } catch (TimeoutException unused) {
                        Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
                    } catch (Exception e7) {
                        Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e7);
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public final void h() {
        try {
            String strF = f();
            if (strF != null) {
                i("com.crashlytics.version-control-info", strF);
                Log.i("FirebaseCrashlytics", "Saved version control info", null);
            }
        } catch (IOException e7) {
            Log.w("FirebaseCrashlytics", "Unable to save version control info", e7);
        }
    }

    public final void i(String str, String str2) {
        try {
            ((C0237b0) this.f10480d.f16188e).s(str, str2);
        } catch (IllegalArgumentException e7) {
            Context context = this.f10477a;
            if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                throw e7;
            }
            Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
        }
    }

    public final void j(Task task) {
        Task task2;
        Task taskA;
        X8.c cVar = ((X8.a) this.f10488m.f2463b).f16180b;
        boolean zIsEmpty = X8.c.h(((File) cVar.f16188e).listFiles()).isEmpty();
        TaskCompletionSource taskCompletionSource = this.f10491p;
        if (zIsEmpty && X8.c.h(((File) cVar.f16189f).listFiles()).isEmpty() && X8.c.h(((File) cVar.f16190g).listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            return;
        }
        O8.c cVar2 = O8.c.f8921a;
        cVar2.f("Crash reports are available to be sent.");
        R0.e eVar = this.f10478b;
        if (eVar.f()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            taskA = Tasks.forResult(Boolean.TRUE);
        } else {
            cVar2.c("Automatic data collection is disabled.");
            cVar2.f("Notifying that unsent reports are available.");
            taskCompletionSource.trySetResult(Boolean.TRUE);
            synchronized (eVar.f10054f) {
                task2 = ((TaskCompletionSource) eVar.f10055g).getTask();
            }
            Task taskOnSuccessTask = task2.onSuccessTask(new C1581e(26));
            cVar2.c("Waiting for send/deleteUnsentReports to be called.");
            taskA = S8.a.a(taskOnSuccessTask, this.f10492q.getTask());
        }
        taskA.onSuccessTask(this.f10481e.f11034a, new S3.c(19, this, task));
    }
}
