package com.waze.jni.protos.map;

import com.waze.jni.protos.map.ScreenPoint;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ScreenPointKt {
    public static final ScreenPointKt INSTANCE = new ScreenPointKt();

    private ScreenPointKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final ScreenPoint.Builder _builder;

        private Dsl(ScreenPoint.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ ScreenPoint _build() {
            ScreenPoint screenPointBuild = this._builder.build();
            x.e(screenPointBuild, "build(...)");
            return screenPointBuild;
        }

        public final void clearX() {
            this._builder.clearX();
        }

        public final void clearY() {
            this._builder.clearY();
        }

        public final int getX() {
            return this._builder.getX();
        }

        public final int getY() {
            return this._builder.getY();
        }

        public final void setX(int i2) {
            this._builder.setX(i2);
        }

        public final void setY(int i2) {
            this._builder.setY(i2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(ScreenPoint.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(ScreenPoint.Builder builder, o oVar) {
            this(builder);
        }
    }
}
