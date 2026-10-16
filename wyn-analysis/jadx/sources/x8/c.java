package X8;

import A7.C0237b0;
import S8.f;
import T8.g;
import android.util.Log;
import com.google.android.gms.ads.nativead.l;
import com.moloco.sdk.acm.h;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.service_locator.j;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.e;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.o;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;
import kotlin.jvm.internal.AbstractC3340k;
import md.EnumC3545m;
import me.C3558a;
import nd.C3616b;
import v9.n;
import w9.C4386e;
import w9.EnumC4385d;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public Object f16184a;

    /* renamed from: b, reason: collision with root package name */
    public Object f16185b;

    /* renamed from: c, reason: collision with root package name */
    public Object f16186c;

    /* renamed from: d, reason: collision with root package name */
    public Object f16187d;

    /* renamed from: e, reason: collision with root package name */
    public Object f16188e;

    /* renamed from: f, reason: collision with root package name */
    public Object f16189f;

    /* renamed from: g, reason: collision with root package name */
    public Object f16190g;

    public c(o installer, String str, l lVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.c cVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.b bVar, com.moloco.sdk.acm.recorder.c cVar2) {
        AbstractC3340k.e(installer, "installer");
        this.f16185b = installer;
        this.f16184a = str;
        this.f16186c = lVar;
        this.f16187d = cVar;
        this.f16188e = bVar;
        this.f16189f = cVar2;
        this.f16190g = new AtomicBoolean(false);
    }

    public static synchronized void f(File file) {
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return;
                }
                String str = "Unexpected non-directory file: " + file + "; deleting file and creating new directory.";
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str, null);
                }
                file.delete();
            }
            if (!file.mkdirs()) {
                Log.e("FirebaseCrashlytics", "Could not create Crashlytics-specific directory: " + file, null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static boolean g(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                g(file2);
            }
        }
        return file.delete();
    }

    public static List h(Object[] objArr) {
        return objArr == null ? Collections.EMPTY_LIST : Arrays.asList(objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G0 r21, java.lang.String r22, tf.l r23) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X8.c.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G0, java.lang.String, tf.l):void");
    }

    public void b(String str, G0 g02) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.b bVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.b) this.f16188e;
        if (bVar == null || !bVar.f30880a) {
            return;
        }
        com.moloco.sdk.acm.recorder.c cVar = (com.moloco.sdk.acm.recorder.c) this.f16189f;
        if (cVar != null) {
            com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
            h hVar = new h("store_launch_started");
            com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.f28496a;
            hVar.a("step", "auto_inline");
            cVar.a(hVar);
        }
        String str2 = bVar.f30883d;
        if (str2 != null) {
            str = str2;
        }
        a(g02, str, new e(this, 0));
        String str3 = bVar.f30882c;
        if (str3 != null) {
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            MolocoLogger.info$default(molocoLogger, "InlineInstallLauncher", "auto_halfsheet_shown success", null, false, 12, null);
            j.b().a(str3);
            MolocoLogger.info$default(molocoLogger, "InlineInstallLauncher", "auto_inline_success fire this event once: ".concat(str3), null, false, 12, null);
            if (cVar != null) {
                com.moloco.sdk.internal.client_metrics_data.a[] aVarArr2 = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
                h hVar2 = new h("store_launch_complete");
                com.moloco.sdk.internal.client_metrics_data.b[] bVarArr2 = com.moloco.sdk.internal.client_metrics_data.b.f28496a;
                hVar2.a("result", "auto_halfsheet_shown");
                cVar.a(hVar2);
            }
        }
    }

    public void c(String str) {
        File file = new File((File) this.f16185b, str);
        if (file.exists() && g(file)) {
            String str2 = "Deleted previous Crashlytics file system: " + file.getPath();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
        }
    }

    public File d(String str, String str2) {
        File file = new File((File) this.f16187d, str);
        file.mkdirs();
        return new File(file, str2);
    }

    public void e(C3616b c3616b) {
        EnumC3545m enumC3545mK = c3616b.f41013a.k();
        Ba.c.p("GrpcCallProvider", "Current gRPC connectivity state: " + enumC3545mK, 1, new Object[0]);
        if (((C3558a) this.f16187d) != null) {
            Ba.c.p("GrpcCallProvider", "Clearing the connectivityAttemptTimer", 1, new Object[0]);
            ((C3558a) this.f16187d).n();
            this.f16187d = null;
        }
        if (enumC3545mK == EnumC3545m.f40692a) {
            Ba.c.p("GrpcCallProvider", "Setting the connectivityAttemptTimer", 1, new Object[0]);
            this.f16187d = ((C4386e) this.f16185b).b(EnumC4385d.f47425i, 15000L, new n(this, c3616b, 1));
        }
        c3616b.l(enumC3545mK, new n(this, c3616b, 2));
    }

    public c(String str, c cVar, f fVar) {
        this.f16187d = new C0237b0(this, false);
        this.f16188e = new C0237b0(this, true);
        this.f16189f = new I9.a(1);
        this.f16190g = new AtomicMarkableReference(null, false);
        this.f16184a = str;
        this.f16185b = new g(cVar);
        this.f16186c = fVar;
    }
}
