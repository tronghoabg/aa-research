package A7;

import D6.C0395s;
import N6.C0776a;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Trace;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.mlkit_vision_common.zzlx;
import com.moloco.sdk.acm.db.MetricsDb_Impl;
import ef.C2515C;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import kd.RunnableC3307c;
import kotlin.jvm.internal.AbstractC3340k;
import ld.AbstractC3459a;
import oc.C3664c;
import oc.C3665d;

/* renamed from: A7.y0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class CallableC0305y0 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1227a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1228b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1229c;

    public /* synthetic */ CallableC0305y0(int i5, Object obj, Object obj2) {
        this.f1227a = i5;
        this.f1229c = obj2;
        this.f1228b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        SharedPreferences sharedPreferences;
        String str;
        int i5 = 0;
        int i10 = 1;
        Object obj = this.f1228b;
        Object obj2 = this.f1229c;
        switch (this.f1227a) {
            case 0:
                BinderC0287s0 binderC0287s0 = (BinderC0287s0) obj;
                binderC0287s0.f1045a.Z();
                return new C0251g(binderC0287s0.f1045a.e(((N1) obj2).f619a));
            case 1:
                L1 l12 = ((BinderC0287s0) obj).f1045a;
                l12.Z();
                C0257i c0257i = l12.f569c;
                L1.m(c0257i);
                return c0257i.j1((String) obj2);
            case 2:
                N1 n12 = (N1) obj2;
                String str2 = n12.f619a;
                AbstractC1732v.i(str2);
                L1 l13 = (L1) obj;
                F0 f0E = l13.E(str2);
                E0 e02 = E0.ANALYTICS_STORAGE;
                if (f0E.i(e02) && F0.c(100, n12.f639v).i(e02)) {
                    return l13.c(n12).g();
                }
                l13.zzj().f612n.c("Analytics storage consent denied. Returning null app instance id");
                return null;
            case 3:
                Aa.a aVar = (Aa.a) obj;
                Ea.f fVar = (Ea.f) obj2;
                zzlx zzlxVarZze = zzlx.zze("detectorTaskWithResource#run");
                zzlxVarZze.zzb();
                try {
                    Ca.f fVarW = fVar.f1650b.w(aVar);
                    zzlxVarZze.close();
                    return fVarW;
                } catch (Throwable th) {
                    try {
                        zzlxVarZze.close();
                    } catch (Throwable th2) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        } catch (Exception unused) {
                        }
                    }
                    throw th;
                }
            case 4:
                return ((C6.f) obj2).b((Context) obj);
            case 5:
                Context context = (Context) obj2;
                Context context2 = (Context) obj;
                if (context != null) {
                    G6.L.k("Attempting to read user agent from Google Play Services.");
                    sharedPreferences = context.getSharedPreferences("admob_user_agent", 0);
                } else {
                    G6.L.k("Attempting to read user agent from local cache.");
                    sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                    i5 = 1;
                }
                String string = sharedPreferences.getString("user_agent", "");
                if (TextUtils.isEmpty(string)) {
                    G6.L.k("Reading user agent from WebSettings");
                    string = WebSettings.getDefaultUserAgent(context2);
                    if (i5 != 0) {
                        sharedPreferences.edit().putString("user_agent", string).apply();
                        G6.L.k("Persisting user agent.");
                    }
                }
                return string;
            case 6:
                G6.M m10 = G6.U.f4562l;
                WebSettings webSettings = (WebSettings) obj2;
                webSettings.setDatabasePath(((Context) obj).getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
                webSettings.setDatabaseEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setDisplayZoomControls(false);
                webSettings.setBuiltInZoomControls(true);
                webSettings.setSupportZoom(true);
                if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzbB)).booleanValue()) {
                    webSettings.setTextZoom(100);
                }
                webSettings.setAllowContentAccess(false);
                return Boolean.TRUE;
            case 7:
                return ((C0776a) obj2).getClickSignals((String) obj);
            case 8:
                StringBuilder sb2 = new StringBuilder("DELETE FROM events WHERE id IN (");
                ArrayList arrayList = (ArrayList) obj2;
                int size = arrayList.size();
                while (i5 < size) {
                    sb2.append("?");
                    if (i5 < size - 1) {
                        sb2.append(",");
                    }
                    i5++;
                }
                sb2.append(")");
                String sql = sb2.toString();
                MetricsDb_Impl metricsDb_Impl = ((com.moloco.sdk.acm.db.e) obj).f28362a;
                AbstractC3340k.e(sql, "sql");
                metricsDb_Impl.a();
                metricsDb_Impl.b();
                o3.g gVarA = metricsDb_Impl.g().I().A(sql);
                Iterator it = arrayList.iterator();
                int i11 = 1;
                while (it.hasNext()) {
                    gVarA.G(i11, ((Long) it.next()).longValue());
                    i11++;
                }
                metricsDb_Impl.c();
                try {
                    gVarA.g();
                    metricsDb_Impl.n();
                    metricsDb_Impl.j();
                    return C2515C.f34653a;
                } catch (Throwable th3) {
                    metricsDb_Impl.j();
                    throw th3;
                }
            default:
                Context context3 = (Context) obj2;
                C3665d c3665d = (C3665d) obj;
                AbstractC3459a.b("FlutterLoader initTask");
                try {
                    c3665d.getClass();
                    FlutterJNI flutterJNI = (FlutterJNI) c3665d.f41477e;
                    try {
                        flutterJNI.loadLibrary(context3);
                        flutterJNI.updateRefreshRate();
                        ((ExecutorService) c3665d.f41478f).execute(new RunnableC3307c(this, i10));
                        File filesDir = context3.getFilesDir();
                        if (filesDir == null) {
                            filesDir = new File(Fe.g.A(context3), "files");
                        }
                        String path = filesDir.getPath();
                        File codeCacheDir = context3.getCodeCacheDir();
                        if (codeCacheDir == null) {
                            codeCacheDir = context3.getCacheDir();
                        }
                        if (codeCacheDir == null) {
                            codeCacheDir = new File(Fe.g.A(context3), "cache");
                        }
                        String path2 = codeCacheDir.getPath();
                        File dir = context3.getDir("flutter", 0);
                        if (dir == null) {
                            dir = new File(Fe.g.A(context3), "app_flutter");
                        }
                        dir.getPath();
                        C3664c c3664c = new C3664c(path, path2);
                        Trace.endSection();
                        return c3664c;
                    } catch (UnsatisfiedLinkError e7) {
                        if (!e7.toString().contains("couldn't find \"libflutter.so\"") && !e7.toString().contains("dlopen failed: library \"libflutter.so\" not found")) {
                            throw e7;
                        }
                        String property = System.getProperty("os.arch");
                        File file = new File((String) ((M.y) c3665d.f41476d).f7230e);
                        String[] list = file.list();
                        StringBuilder sb3 = new StringBuilder("Could not load libflutter.so this is possibly because the application is running on an architecture that Flutter Android does not support (e.g. x86) see https://docs.flutter.dev/deployment/android#what-are-the-supported-target-architectures for more detail.\nApp is using cpu architecture: ");
                        sb3.append(property);
                        sb3.append(", and the native libraries directory (with path ");
                        sb3.append(file.getAbsolutePath());
                        sb3.append(") ");
                        if (file.exists()) {
                            str = "contains the following files: " + Arrays.toString(list);
                        } else {
                            str = "does not exist.";
                        }
                        sb3.append(str);
                        throw new UnsupportedOperationException(sb3.toString(), e7);
                    }
                } catch (Throwable th4) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
        }
    }

    public /* synthetic */ CallableC0305y0(Object obj, boolean z2, Object obj2, int i5) {
        this.f1227a = i5;
        this.f1229c = obj;
        this.f1228b = obj2;
    }
}
