package com.waze.jni.protos.location;

import com.waze.jni.protos.location.Quaternion;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class QuaternionKt {
    public static final QuaternionKt INSTANCE = new QuaternionKt();

    private QuaternionKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Quaternion.Builder _builder;

        private Dsl(Quaternion.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ Quaternion _build() {
            Quaternion quaternionBuild = this._builder.build();
            x.e(quaternionBuild, "build(...)");
            return quaternionBuild;
        }

        public final void clearW() {
            this._builder.clearW();
        }

        public final void clearX() {
            this._builder.clearX();
        }

        public final void clearY() {
            this._builder.clearY();
        }

        public final void clearZ() {
            this._builder.clearZ();
        }

        public final float getW() {
            return this._builder.getW();
        }

        public final float getX() {
            return this._builder.getX();
        }

        public final float getY() {
            return this._builder.getY();
        }

        public final float getZ() {
            return this._builder.getZ();
        }

        public final boolean hasW() {
            return this._builder.hasW();
        }

        public final boolean hasX() {
            return this._builder.hasX();
        }

        public final boolean hasY() {
            return this._builder.hasY();
        }

        public final boolean hasZ() {
            return this._builder.hasZ();
        }

        public final void setW(float f2) {
            this._builder.setW(f2);
        }

        public final void setX(float f2) {
            this._builder.setX(f2);
        }

        public final void setY(float f2) {
            this._builder.setY(f2);
        }

        public final void setZ(float f2) {
            this._builder.setZ(f2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(Quaternion.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(Quaternion.Builder builder, o oVar) {
            this(builder);
        }
    }
}
