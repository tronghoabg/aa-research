package m5;

import Bf.g;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.StatFs;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kd.V;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import qc.C3884a;
import qc.InterfaceC3885b;
import uc.C4278o;
import uc.C4281r;
import uc.InterfaceC4279p;
import uc.InterfaceC4280q;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u000eH\u0016J&\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002J\b\u0010\u001c\u001a\u00020\u001bH\u0002J\u0010\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u0018H\u0002J\b\u0010\u001f\u001a\u00020\u001bH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/example/disk_space_2/DiskSpace_2Plugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "<init>", "()V", "channel", "Lio/flutter/plugin/common/MethodChannel;", "executor", "Ljava/util/concurrent/ExecutorService;", "mainHandler", "Landroid/os/Handler;", "onAttachedToEngine", "", "flutterPluginBinding", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "onMethodCall", "call", "Lio/flutter/plugin/common/MethodCall;", "result", "Lio/flutter/plugin/common/MethodChannel$Result;", "onDetachedFromEngine", "binding", "executeAsync", "errorMessage", "", "operation", "Lkotlin/Function0;", "", "getFreeDiskSpace", "getFreeDiskSpaceForPath", "path", "getTotalDiskSpace", "disk_space_2_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements InterfaceC3885b, InterfaceC4279p {

    /* renamed from: a, reason: collision with root package name */
    public C4281r f40366a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f40367b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f40368c;

    public c() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        AbstractC3340k.d(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        this.f40367b = executorServiceNewSingleThreadExecutor;
        this.f40368c = new Handler(Looper.getMainLooper());
    }

    @Override // qc.InterfaceC3885b
    public final void onAttachedToEngine(C3884a flutterPluginBinding) {
        AbstractC3340k.e(flutterPluginBinding, "flutterPluginBinding");
        C4281r c4281r = new C4281r(flutterPluginBinding.f44188c, "disk_space_2");
        this.f40366a = c4281r;
        c4281r.b(this);
    }

    @Override // qc.InterfaceC3885b
    public final void onDetachedFromEngine(C3884a binding) {
        AbstractC3340k.e(binding, "binding");
        this.f40367b.shutdown();
        C4281r c4281r = this.f40366a;
        if (c4281r != null) {
            c4281r.b(null);
        } else {
            AbstractC3340k.m("channel");
            throw null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // uc.InterfaceC4279p
    public final void onMethodCall(C4278o call, InterfaceC4280q interfaceC4280q) {
        AbstractC3340k.e(call, "call");
        String str = call.f46759a;
        if (str != null) {
            int iHashCode = str.hashCode();
            ExecutorService executorService = this.f40367b;
            switch (iHashCode) {
                case -1687221785:
                    if (str.equals("getFreeDiskSpaceForPath")) {
                        String str2 = (String) call.a("path");
                        if (str2 != null) {
                            executorService.execute(new V(new g(12, this, str2), this, (tc.g) interfaceC4280q, "Failed to get free disk space for path", 1));
                            return;
                        } else {
                            ((tc.g) interfaceC4280q).b("INVALID_ARGUMENT", "Path is required", null);
                            return;
                        }
                    }
                    break;
                case -835310425:
                    if (str.equals("getFreeDiskSpace")) {
                        final int i5 = 0;
                        executorService.execute(new V(new tf.a(this) { // from class: m5.a

                            /* renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ c f40363b;

                            {
                                this.f40363b = this;
                            }

                            @Override // tf.a
                            public final Object invoke() {
                                switch (i5) {
                                    case 0:
                                        this.f40363b.getClass();
                                        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                                        return Double.valueOf((statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong()) / 1048576.0f);
                                    default:
                                        this.f40363b.getClass();
                                        StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getPath());
                                        return Double.valueOf((statFs2.getBlockCountLong() * statFs2.getBlockSizeLong()) / 1048576.0f);
                                }
                            }
                        }, this, (tc.g) interfaceC4280q, "Failed to get free disk space", 1));
                        return;
                    }
                    break;
                case 609971067:
                    if (str.equals("getTotalDiskSpace")) {
                        final int i10 = 1;
                        executorService.execute(new V(new tf.a(this) { // from class: m5.a

                            /* renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ c f40363b;

                            {
                                this.f40363b = this;
                            }

                            @Override // tf.a
                            public final Object invoke() {
                                switch (i10) {
                                    case 0:
                                        this.f40363b.getClass();
                                        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                                        return Double.valueOf((statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong()) / 1048576.0f);
                                    default:
                                        this.f40363b.getClass();
                                        StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getPath());
                                        return Double.valueOf((statFs2.getBlockCountLong() * statFs2.getBlockSizeLong()) / 1048576.0f);
                                }
                            }
                        }, this, (tc.g) interfaceC4280q, "Failed to get total disk space", 1));
                        return;
                    }
                    break;
                case 1385449135:
                    if (str.equals("getPlatformVersion")) {
                        ((tc.g) interfaceC4280q).a("Android " + Build.VERSION.RELEASE);
                        return;
                    }
                    break;
            }
        }
        ((tc.g) interfaceC4280q).c();
    }
}
