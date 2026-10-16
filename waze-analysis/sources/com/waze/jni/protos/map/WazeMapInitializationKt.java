package com.waze.jni.protos.map;

import com.waze.jni.protos.map.WazeMapInitialization;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class WazeMapInitializationKt {
    public static final WazeMapInitializationKt INSTANCE = new WazeMapInitializationKt();

    private WazeMapInitializationKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final WazeMapInitialization.Builder _builder;

        private Dsl(WazeMapInitialization.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ WazeMapInitialization _build() {
            WazeMapInitialization wazeMapInitializationBuild = this._builder.build();
            x.e(wazeMapInitializationBuild, "build(...)");
            return wazeMapInitializationBuild;
        }

        public final void clearMapUsageType() {
            this._builder.clearMapUsageType();
        }

        public final WazeMapInitialization.MapUsageType getMapUsageType() {
            WazeMapInitialization.MapUsageType mapUsageType = this._builder.getMapUsageType();
            x.e(mapUsageType, "getMapUsageType(...)");
            return mapUsageType;
        }

        public final int getMapUsageTypeValue() {
            return this._builder.getMapUsageTypeValue();
        }

        public final void setMapUsageType(WazeMapInitialization.MapUsageType mapUsageType) {
            x.f(mapUsageType, "value");
            this._builder.setMapUsageType(mapUsageType);
        }

        public final void setMapUsageTypeValue(int i2) {
            this._builder.setMapUsageTypeValue(i2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(WazeMapInitialization.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(WazeMapInitialization.Builder builder, o oVar) {
            this(builder);
        }
    }
}
