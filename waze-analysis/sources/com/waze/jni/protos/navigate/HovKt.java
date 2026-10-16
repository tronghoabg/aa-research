package com.waze.jni.protos.navigate;

import com.waze.jni.protos.navigate.Hov;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class HovKt {
    public static final HovKt INSTANCE = new HovKt();

    private HovKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Hov.Builder _builder;

        private Dsl(Hov.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ Hov _build() {
            Hov hovBuild = this._builder.build();
            x.e(hovBuild, "build(...)");
            return hovBuild;
        }

        public final void clearHovLessVariantAltId() {
            this._builder.clearHovLessVariantAltId();
        }

        public final void clearMinPassengers() {
            this._builder.clearMinPassengers();
        }

        public final long getHovLessVariantAltId() {
            return this._builder.getHovLessVariantAltId();
        }

        public final int getMinPassengers() {
            return this._builder.getMinPassengers();
        }

        public final boolean hasHovLessVariantAltId() {
            return this._builder.hasHovLessVariantAltId();
        }

        public final void setHovLessVariantAltId(long j2) {
            this._builder.setHovLessVariantAltId(j2);
        }

        public final void setMinPassengers(int i2) {
            this._builder.setMinPassengers(i2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(Hov.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(Hov.Builder builder, o oVar) {
            this(builder);
        }
    }
}
