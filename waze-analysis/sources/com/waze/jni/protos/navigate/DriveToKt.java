package com.waze.jni.protos.navigate;

import com.waze.jni.protos.navigate.DriveTo;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class DriveToKt {
    public static final DriveToKt INSTANCE = new DriveToKt();

    private DriveToKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final DriveTo.Builder _builder;

        private Dsl(DriveTo.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ DriveTo _build() {
            DriveTo driveToBuild = this._builder.build();
            x.e(driveToBuild, "build(...)");
            return driveToBuild;
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(DriveTo.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(DriveTo.Builder builder, o oVar) {
            this(builder);
        }
    }
}
