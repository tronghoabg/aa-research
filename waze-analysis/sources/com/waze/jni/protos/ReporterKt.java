package com.waze.jni.protos;

import com.waze.jni.protos.Reporter;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ReporterKt {
    public static final ReporterKt INSTANCE = new ReporterKt();

    private ReporterKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Reporter.Builder _builder;

        private Dsl(Reporter.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ Reporter _build() {
            Reporter reporterBuild = this._builder.build();
            x.e(reporterBuild, "build(...)");
            return reporterBuild;
        }

        public final void clearMood() {
            this._builder.clearMood();
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final String getMood() {
            String mood = this._builder.getMood();
            x.e(mood, "getMood(...)");
            return mood;
        }

        public final String getName() {
            String name = this._builder.getName();
            x.e(name, "getName(...)");
            return name;
        }

        public final boolean hasMood() {
            return this._builder.hasMood();
        }

        public final boolean hasName() {
            return this._builder.hasName();
        }

        public final void setMood(String str) {
            x.f(str, "value");
            this._builder.setMood(str);
        }

        public final void setName(String str) {
            x.f(str, "value");
            this._builder.setName(str);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(Reporter.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(Reporter.Builder builder, o oVar) {
            this(builder);
        }
    }
}
