package oc;

import A7.CallableC0305y0;
import A7.S;
import M.y;
import a2.k;
import android.app.ActivityManager;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.util.DisplayMetrics;
import android.util.Log;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import ld.AbstractC3459a;

/* renamed from: oc.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3665d {

    /* renamed from: a, reason: collision with root package name */
    public long f41473a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f41474b;

    /* renamed from: c, reason: collision with root package name */
    public Object f41475c;

    /* renamed from: d, reason: collision with root package name */
    public Object f41476d;

    /* renamed from: e, reason: collision with root package name */
    public Object f41477e;

    /* renamed from: f, reason: collision with root package name */
    public Object f41478f;

    /* renamed from: g, reason: collision with root package name */
    public Future f41479g;

    public void a(Context context, String[] strArr) {
        Context context2;
        if (this.f41474b) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
        }
        if (((k) this.f41475c) == null) {
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
        try {
            AbstractC3459a.b("FlutterLoader#ensureInitializationComplete");
            try {
                C3664c c3664c = (C3664c) this.f41479g.get();
                ArrayList arrayList = new ArrayList();
                arrayList.add("--icu-symbol-prefix=_binary_icudtl_dat");
                StringBuilder sb2 = new StringBuilder("--icu-native-lib-path=");
                sb2.append((String) ((y) this.f41476d).f7230e);
                String str = File.separator;
                sb2.append(str);
                sb2.append("libflutter.so");
                arrayList.add(sb2.toString());
                if (strArr != null) {
                    Collections.addAll(arrayList, strArr);
                }
                arrayList.add("--aot-shared-library-name=".concat((String) ((y) this.f41476d).f7227b));
                arrayList.add("--aot-shared-library-name=" + ((String) ((y) this.f41476d).f7230e) + str + ((String) ((y) this.f41476d).f7227b));
                StringBuilder sb3 = new StringBuilder("--cache-dir-path=");
                sb3.append(c3664c.f41472b);
                arrayList.add(sb3.toString());
                arrayList.add("--domain-network-policy=".concat((String) ((y) this.f41476d).f7229d));
                ((k) this.f41475c).getClass();
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                int i5 = bundle != null ? bundle.getInt("io.flutter.embedding.android.OldGenHeapSize") : 0;
                if (i5 == 0) {
                    context2 = context;
                    ((ActivityManager) context2.getSystemService("activity")).getMemoryInfo(new ActivityManager.MemoryInfo());
                    i5 = (int) ((r10.totalMem / 1000000.0d) / 2.0d);
                } else {
                    context2 = context;
                }
                arrayList.add("--old-gen-heap-size=" + i5);
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                arrayList.add("--resource-cache-max-bytes-threshold=" + (displayMetrics.widthPixels * displayMetrics.heightPixels * 48));
                arrayList.add("--prefetched-default-font-manager");
                if (bundle != null) {
                    if (bundle.containsKey("io.flutter.embedding.android.EnableImpeller")) {
                        if (bundle.getBoolean("io.flutter.embedding.android.EnableImpeller")) {
                            arrayList.add("--enable-impeller=true");
                        } else {
                            arrayList.add("--enable-impeller=false");
                        }
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableVulkanValidation", false)) {
                        arrayList.add("--enable-vulkan-validation");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableOpenGLGPUTracing", false)) {
                        arrayList.add("--enable-opengl-gpu-tracing");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableVulkanGPUTracing", false)) {
                        arrayList.add("--enable-vulkan-gpu-tracing");
                    }
                    if (bundle.containsKey("io.flutter.embedding.android.DisableMergedPlatformUIThread") && bundle.getBoolean("io.flutter.embedding.android.DisableMergedPlatformUIThread")) {
                        arrayList.add("--no-enable-merged-platform-ui-thread");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableSurfaceControl", false)) {
                        arrayList.add("--enable-surface-control");
                    }
                    String string = bundle.getString("io.flutter.embedding.android.ImpellerBackend");
                    if (string != null) {
                        arrayList.add("--impeller-backend=".concat(string));
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.ImpellerLazyShaderInitialization")) {
                        arrayList.add("--impeller-lazy-shader-mode");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.ImpellerAntialiasLines")) {
                        arrayList.add("--impeller-antialias-lines");
                    }
                }
                arrayList.add("--leak-vm=".concat(bundle == null ? true : bundle.getBoolean("io.flutter.embedding.android.LeakVM", true) ? "true" : "false"));
                ((FlutterJNI) this.f41477e).init(context2, (String[]) arrayList.toArray(new String[0]), null, c3664c.f41471a, c3664c.f41472b, SystemClock.uptimeMillis() - this.f41473a, Build.VERSION.SDK_INT);
                this.f41474b = true;
                Trace.endSection();
            } finally {
            }
        } catch (Exception e7) {
            Log.e("FlutterLoader", "Flutter initialization failed.", e7);
            throw new RuntimeException(e7);
        }
    }

    public String b(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((String) ((y) this.f41476d).f7228c);
        return wg.b.c(sb2, File.separator, str);
    }

    public void c(Context context) {
        k kVar = new k();
        if (((k) this.f41475c) != null) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("startInitialization must be called on the main thread");
        }
        AbstractC3459a.b("FlutterLoader#startInitialization");
        try {
            Context applicationContext = context.getApplicationContext();
            this.f41475c = kVar;
            this.f41473a = SystemClock.uptimeMillis();
            this.f41476d = AbstractC3662a.a(applicationContext);
            S sA = S.a((DisplayManager) applicationContext.getSystemService("display"), (FlutterJNI) this.f41477e);
            ((FlutterJNI) sA.f691c).setAsyncWaitForVsyncDelegate((io.flutter.view.a) sA.f693e);
            this.f41479g = ((ExecutorService) this.f41478f).submit(new CallableC0305y0(9, this, applicationContext));
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
