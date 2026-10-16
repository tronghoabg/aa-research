package com.waze.jni.protos.map;

import com.waze.jni.protos.map.MapNorthLockChanged;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class MapNorthLockChangedKt {
    public static final MapNorthLockChangedKt INSTANCE = new MapNorthLockChangedKt();

    private MapNorthLockChangedKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final MapNorthLockChanged.Builder _builder;

        private Dsl(MapNorthLockChanged.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ MapNorthLockChanged _build() {
            MapNorthLockChanged mapNorthLockChangedBuild = this._builder.build();
            x.e(mapNorthLockChangedBuild, "build(...)");
            return mapNorthLockChangedBuild;
        }

        public final void clearNorthLock() {
            this._builder.clearNorthLock();
        }

        public final NorthLockBehavior getNorthLock() {
            NorthLockBehavior northLock = this._builder.getNorthLock();
            x.e(northLock, "getNorthLock(...)");
            return northLock;
        }

        public final int getNorthLockValue() {
            return this._builder.getNorthLockValue();
        }

        public final void setNorthLock(NorthLockBehavior northLockBehavior) {
            x.f(northLockBehavior, "value");
            this._builder.setNorthLock(northLockBehavior);
        }

        public final void setNorthLockValue(int i2) {
            this._builder.setNorthLockValue(i2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(MapNorthLockChanged.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(MapNorthLockChanged.Builder builder, o oVar) {
            this(builder);
        }
    }
}
