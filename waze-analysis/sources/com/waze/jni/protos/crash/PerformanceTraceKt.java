package com.waze.jni.protos.crash;

import com.waze.jni.protos.crash.PerformanceTrace;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class PerformanceTraceKt {
    public static final PerformanceTraceKt INSTANCE = new PerformanceTraceKt();

    private PerformanceTraceKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final PerformanceTrace.Builder _builder;

        private Dsl(PerformanceTrace.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ PerformanceTrace _build() {
            PerformanceTrace performanceTraceBuild = this._builder.build();
            x.e(performanceTraceBuild, "build(...)");
            return performanceTraceBuild;
        }

        public final void clearEndTimeNs() {
            this._builder.clearEndTimeNs();
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final void clearStartTimeNs() {
            this._builder.clearStartTimeNs();
        }

        public final long getEndTimeNs() {
            return this._builder.getEndTimeNs();
        }

        public final String getName() {
            String name = this._builder.getName();
            x.e(name, "getName(...)");
            return name;
        }

        public final long getStartTimeNs() {
            return this._builder.getStartTimeNs();
        }

        public final boolean hasEndTimeNs() {
            return this._builder.hasEndTimeNs();
        }

        public final boolean hasName() {
            return this._builder.hasName();
        }

        public final boolean hasStartTimeNs() {
            return this._builder.hasStartTimeNs();
        }

        public final void setEndTimeNs(long j2) {
            this._builder.setEndTimeNs(j2);
        }

        public final void setName(String str) {
            x.f(str, "value");
            this._builder.setName(str);
        }

        public final void setStartTimeNs(long j2) {
            this._builder.setStartTimeNs(j2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(PerformanceTrace.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(PerformanceTrace.Builder builder, o oVar) {
            this(builder);
        }
    }
}
