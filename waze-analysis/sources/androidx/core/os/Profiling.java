package androidx.core.os;

import android.content.Context;
import android.os.ProfilingManager;
import android.os.ProfilingResult;
import androidx.core.os.Profiling;
import com.a.a.a.a$$ExternalSyntheticApiModelOutline3;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.b.x;
import j$.util.function.Consumer$CC;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import kotlinx.coroutines.a.ad;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class Profiling {
    private static final String KEY_BUFFER_FILL_POLICY = "KEY_BUFFER_FILL_POLICY";
    private static final String KEY_DURATION_MS = "KEY_DURATION_MS";
    private static final String KEY_FREQUENCY_HZ = "KEY_FREQUENCY_HZ";
    private static final String KEY_SAMPLING_INTERVAL_BYTES = "KEY_SAMPLING_INTERVAL_BYTES";
    private static final String KEY_SIZE_KB = "KEY_SIZE_KB";
    private static final String KEY_TRACK_JAVA_ALLOCATIONS = "KEY_TRACK_JAVA_ALLOCATIONS";
    private static final int VALUE_BUFFER_FILL_POLICY_DISCARD = 1;
    private static final int VALUE_BUFFER_FILL_POLICY_RING_BUFFER = 2;

    /* compiled from: WazeSource */
    /* renamed from: androidx.core.os.Profiling$registerForAllProfilingResults$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<ad<? super ProfilingResult>, e<? super ab>, Object> {
        final /* synthetic */ Context $context;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Context context, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.$context = context;
        }

        static final void invokeSuspend$lambda$0(ad adVar, ProfilingResult profilingResult) {
            x.c(profilingResult);
            adVar.i(profilingResult);
        }

        static final ab invokeSuspend$lambda$2(ProfilingManager profilingManager, Consumer consumer) {
            profilingManager.unregisterForAllProfilingResults(consumer);
            return ab.f48028a;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$context, eVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // h.g.a.p
        public final Object invoke(ad<? super ProfilingResult> adVar, e<? super ab> eVar) {
            return ((AnonymousClass1) create(adVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                final ad adVar = (ad) this.L$0;
                final Consumer consumer = new Consumer() { // from class: androidx.core.os.Profiling$registerForAllProfilingResults$1$$ExternalSyntheticLambda0
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void u(Object obj2) {
                        Profiling.AnonymousClass1.invokeSuspend$lambda$0(adVar, a$$ExternalSyntheticApiModelOutline3.m13504m(obj2));
                    }

                    public /* synthetic */ Consumer andThen(Consumer consumer2) {
                        return Consumer$CC.$default$andThen(this, consumer2);
                    }
                };
                final ProfilingManager profilingManagerM = a$$ExternalSyntheticApiModelOutline3.m(this.$context.getSystemService(a$$ExternalSyntheticApiModelOutline3.m13505m()));
                profilingManagerM.registerForAllProfilingResults(new Executor() { // from class: androidx.core.os.Profiling$registerForAllProfilingResults$1$$ExternalSyntheticLambda1
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        runnable.run();
                    }
                }, consumer);
                this.label = 1;
                if (kotlinx.coroutines.a.ab.a(adVar, new h.g.a.a() { // from class: androidx.core.os.Profiling$registerForAllProfilingResults$1$$ExternalSyntheticLambda2
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return Profiling.AnonymousClass1.invokeSuspend$lambda$2(profilingManagerM, consumer);
                    }
                }, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            return ab.f48028a;
        }
    }

    public static final void registerForAllProfilingResults(Context context, Executor executor, Consumer<ProfilingResult> consumer) {
        x.f(context, "context");
        x.f(executor, "executor");
        x.f(consumer, "listener");
        a$$ExternalSyntheticApiModelOutline3.m(context.getSystemService(a$$ExternalSyntheticApiModelOutline3.m13505m())).registerForAllProfilingResults(executor, consumer);
    }

    public static final void requestProfiling(Context context, ProfilingRequest profilingRequest, Executor executor, Consumer<ProfilingResult> consumer) {
        x.f(context, "context");
        x.f(profilingRequest, "profilingRequest");
        a$$ExternalSyntheticApiModelOutline3.m(context.getSystemService(a$$ExternalSyntheticApiModelOutline3.m13505m())).requestProfiling(profilingRequest.getProfilingType(), profilingRequest.getParams(), profilingRequest.getTag(), profilingRequest.getCancellationSignal(), executor, consumer);
    }

    public static final void unregisterForAllProfilingResults(Context context, Consumer<ProfilingResult> consumer) {
        x.f(context, "context");
        x.f(consumer, "listener");
        a$$ExternalSyntheticApiModelOutline3.m(context.getSystemService(a$$ExternalSyntheticApiModelOutline3.m13505m())).unregisterForAllProfilingResults(consumer);
    }

    public static final k<ProfilingResult> registerForAllProfilingResults(Context context) {
        x.f(context, "context");
        return ai.n(new AnonymousClass1(context, null));
    }
}
