package com.waze.jni.protos.navigate;

import com.waze.jni.protos.navigate.DangerZoneEod;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class DangerZoneEodKt {
    public static final DangerZoneEodKt INSTANCE = new DangerZoneEodKt();

    private DangerZoneEodKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final DangerZoneEod.Builder _builder;

        private Dsl(DangerZoneEod.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ DangerZoneEod _build() {
            DangerZoneEod dangerZoneEodBuild = this._builder.build();
            x.e(dangerZoneEodBuild, "build(...)");
            return dangerZoneEodBuild;
        }

        public final void clearEodToDestinationDistance() {
            this._builder.clearEodToDestinationDistance();
        }

        public final void clearShowDangerZoneEod() {
            this._builder.clearShowDangerZoneEod();
        }

        public final long getEodToDestinationDistance() {
            return this._builder.getEodToDestinationDistance();
        }

        public final boolean getShowDangerZoneEod() {
            return this._builder.getShowDangerZoneEod();
        }

        public final boolean hasEodToDestinationDistance() {
            return this._builder.hasEodToDestinationDistance();
        }

        public final void setEodToDestinationDistance(long j2) {
            this._builder.setEodToDestinationDistance(j2);
        }

        public final void setShowDangerZoneEod(boolean z) {
            this._builder.setShowDangerZoneEod(z);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(DangerZoneEod.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(DangerZoneEod.Builder builder, o oVar) {
            this(builder);
        }
    }
}
