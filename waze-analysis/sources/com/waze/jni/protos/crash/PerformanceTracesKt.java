package com.waze.jni.protos.crash;

import com.google.v.b.a;
import com.google.v.b.c;
import com.waze.jni.protos.crash.PerformanceTraces;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class PerformanceTracesKt {
    public static final PerformanceTracesKt INSTANCE = new PerformanceTracesKt();

    private PerformanceTracesKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final PerformanceTraces.Builder _builder;

        /* compiled from: WazeSource */
        public final class TracesProxy extends c {
            private TracesProxy() {
            }
        }

        private Dsl(PerformanceTraces.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ PerformanceTraces _build() {
            PerformanceTraces performanceTracesBuild = this._builder.build();
            x.e(performanceTracesBuild, "build(...)");
            return performanceTracesBuild;
        }

        public final /* synthetic */ void addAllTraces(a aVar, Iterable iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            this._builder.addAllTraces(iterable);
        }

        public final /* synthetic */ void addTraces(a aVar, PerformanceTrace performanceTrace) {
            x.f(aVar, "<this>");
            x.f(performanceTrace, "value");
            this._builder.addTraces(performanceTrace);
        }

        public final void clearTimeNowNs() {
            this._builder.clearTimeNowNs();
        }

        public final /* synthetic */ void clearTraces(a aVar) {
            x.f(aVar, "<this>");
            this._builder.clearTraces();
        }

        public final long getTimeNowNs() {
            return this._builder.getTimeNowNs();
        }

        public final /* synthetic */ a getTraces() {
            List<PerformanceTrace> tracesList = this._builder.getTracesList();
            x.e(tracesList, "getTracesList(...)");
            return new a(tracesList);
        }

        public final boolean hasTimeNowNs() {
            return this._builder.hasTimeNowNs();
        }

        public final /* synthetic */ void plusAssignAllTraces(a<PerformanceTrace, TracesProxy> aVar, Iterable<PerformanceTrace> iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            addAllTraces(aVar, iterable);
        }

        public final /* synthetic */ void plusAssignTraces(a<PerformanceTrace, TracesProxy> aVar, PerformanceTrace performanceTrace) {
            x.f(aVar, "<this>");
            x.f(performanceTrace, "value");
            addTraces(aVar, performanceTrace);
        }

        public final void setTimeNowNs(long j2) {
            this._builder.setTimeNowNs(j2);
        }

        public final /* synthetic */ void setTraces(a aVar, int i2, PerformanceTrace performanceTrace) {
            x.f(aVar, "<this>");
            x.f(performanceTrace, "value");
            this._builder.setTraces(i2, performanceTrace);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(PerformanceTraces.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(PerformanceTraces.Builder builder, o oVar) {
            this(builder);
        }
    }
}
