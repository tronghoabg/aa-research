package androidx.work;

import A6.h;
import A7.RunnableC0278p;
import B.F;
import C8.g;
import Ef.A;
import Ef.C0502n;
import Ef.C0505o0;
import Ef.H;
import Ef.InterfaceC0515v;
import Ef.S;
import Ef.z0;
import J3.e;
import J3.f;
import J3.i;
import J3.l;
import J3.q;
import T3.m;
import U3.a;
import U3.j;
import android.content.Context;
import b7.k;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import ef.C2515C;
import ef.InterfaceC2519c;
import java.util.concurrent.ExecutionException;
import jf.InterfaceC3103c;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p8.p;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\b¢\u0006\u0004\b\u0017\u0010\u000bJ\r\u0010\u0018\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\u001f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010%\u001a\u00020$8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b)\u0010\u0019\u001a\u0004\b'\u0010(\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"Landroidx/work/CoroutineWorker;", "LJ3/q;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lp8/p;", "LJ3/p;", "startWork", "()Lp8/p;", "LJ3/j;", "getForegroundInfo", "(Ljf/c;)Ljava/lang/Object;", "LJ3/h;", JsonStorageKeyNames.DATA_KEY, "Lef/C;", "setProgress", "(LJ3/h;Ljf/c;)Ljava/lang/Object;", "foregroundInfo", "setForeground", "(LJ3/j;Ljf/c;)Ljava/lang/Object;", "getForegroundInfoAsync", "onStopped", "()V", "LEf/v;", "job", "LEf/v;", "getJob$work_runtime_ktx_release", "()LEf/v;", "LU3/j;", "future", "LU3/j;", "getFuture$work_runtime_ktx_release", "()LU3/j;", "LEf/A;", "coroutineContext", "LEf/A;", "getCoroutineContext", "()LEf/A;", "getCoroutineContext$annotations", "work-runtime-ktx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public abstract class CoroutineWorker extends q {

    @NotNull
    private final A coroutineContext;

    @NotNull
    private final j future;

    @NotNull
    private final InterfaceC0515v job;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(@NotNull Context appContext, @NotNull WorkerParameters params) {
        super(appContext, params);
        AbstractC3340k.e(appContext, "appContext");
        AbstractC3340k.e(params, "params");
        this.job = H.d();
        j jVar = new j();
        this.future = jVar;
        jVar.addListener(new g(this, 6), (m) ((k) getTaskExecutor()).f19396b);
        this.coroutineContext = S.f3698a;
    }

    public static void a(CoroutineWorker coroutineWorker) {
        if (coroutineWorker.future.f12264a instanceof a) {
            ((z0) coroutineWorker.job).cancel(null);
        }
    }

    @InterfaceC2519c
    public static /* synthetic */ void getCoroutineContext$annotations() {
    }

    public static /* synthetic */ Object getForegroundInfo$suspendImpl(CoroutineWorker coroutineWorker, InterfaceC3103c<? super J3.j> interfaceC3103c) {
        throw new IllegalStateException("Not implemented");
    }

    public abstract Object doWork(InterfaceC3103c interfaceC3103c);

    @NotNull
    public A getCoroutineContext() {
        return this.coroutineContext;
    }

    @Nullable
    public Object getForegroundInfo(@NotNull InterfaceC3103c<? super J3.j> interfaceC3103c) {
        return getForegroundInfo$suspendImpl(this, interfaceC3103c);
    }

    @Override // J3.q
    @NotNull
    public final p getForegroundInfoAsync() {
        C0505o0 c0505o0D = H.d();
        Kd.a aVarC = H.c(getCoroutineContext().plus(c0505o0D));
        l lVar = new l(c0505o0D);
        H.D(aVarC, null, new e(lVar, this, null), 3);
        return lVar;
    }

    @NotNull
    /* renamed from: getFuture$work_runtime_ktx_release, reason: from getter */
    public final j getFuture() {
        return this.future;
    }

    @NotNull
    /* renamed from: getJob$work_runtime_ktx_release, reason: from getter */
    public final InterfaceC0515v getJob() {
        return this.job;
    }

    @Override // J3.q
    public final void onStopped() {
        super.onStopped();
        this.future.cancel(false);
    }

    @Nullable
    public final Object setForeground(@NotNull J3.j jVar, @NotNull InterfaceC3103c<? super C2515C> interfaceC3103c) throws Throwable {
        p foregroundAsync = setForegroundAsync(jVar);
        AbstractC3340k.d(foregroundAsync, "setForegroundAsync(foregroundInfo)");
        if (foregroundAsync.isDone()) {
            try {
                foregroundAsync.get();
            } catch (ExecutionException e7) {
                Throwable cause = e7.getCause();
                if (cause == null) {
                    throw e7;
                }
                throw cause;
            }
        } else {
            C0502n c0502n = new C0502n(1, h.A(interfaceC3103c));
            c0502n.t();
            foregroundAsync.addListener(new RunnableC0278p(c0502n, false, foregroundAsync, 19), i.f5573a);
            c0502n.v(new F(foregroundAsync, 3));
            Object objS = c0502n.s();
            if (objS == kf.a.f39711a) {
                return objS;
            }
        }
        return C2515C.f34653a;
    }

    @Nullable
    public final Object setProgress(@NotNull J3.h hVar, @NotNull InterfaceC3103c<? super C2515C> interfaceC3103c) throws Throwable {
        p progressAsync = setProgressAsync(hVar);
        AbstractC3340k.d(progressAsync, "setProgressAsync(data)");
        if (progressAsync.isDone()) {
            try {
                progressAsync.get();
            } catch (ExecutionException e7) {
                Throwable cause = e7.getCause();
                if (cause == null) {
                    throw e7;
                }
                throw cause;
            }
        } else {
            C0502n c0502n = new C0502n(1, h.A(interfaceC3103c));
            c0502n.t();
            progressAsync.addListener(new RunnableC0278p(c0502n, false, progressAsync, 19), i.f5573a);
            c0502n.v(new F(progressAsync, 3));
            Object objS = c0502n.s();
            if (objS == kf.a.f39711a) {
                return objS;
            }
        }
        return C2515C.f34653a;
    }

    @Override // J3.q
    @NotNull
    public final p startWork() {
        H.D(H.c(getCoroutineContext().plus(this.job)), null, new f(this, null), 3);
        return this.future;
    }
}
