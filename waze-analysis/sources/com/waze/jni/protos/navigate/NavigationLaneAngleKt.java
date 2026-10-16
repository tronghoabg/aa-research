package com.waze.jni.protos.navigate;

import com.waze.jni.protos.navigate.NavigationLaneAngle;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NavigationLaneAngleKt {
    public static final NavigationLaneAngleKt INSTANCE = new NavigationLaneAngleKt();

    private NavigationLaneAngleKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final NavigationLaneAngle.Builder _builder;

        private Dsl(NavigationLaneAngle.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ NavigationLaneAngle _build() {
            NavigationLaneAngle navigationLaneAngleBuild = this._builder.build();
            x.e(navigationLaneAngleBuild, "build(...)");
            return navigationLaneAngleBuild;
        }

        public final void clearAngle() {
            this._builder.clearAngle();
        }

        public final void clearIsSelected() {
            this._builder.clearIsSelected();
        }

        public final int getAngle() {
            return this._builder.getAngle();
        }

        public final boolean getIsSelected() {
            return this._builder.getIsSelected();
        }

        public final void setAngle(int i2) {
            this._builder.setAngle(i2);
        }

        public final void setIsSelected(boolean z) {
            this._builder.setIsSelected(z);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(NavigationLaneAngle.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(NavigationLaneAngle.Builder builder, o oVar) {
            this(builder);
        }
    }
}
