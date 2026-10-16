package com.waze.jni.protos.location;

import com.waze.jni.protos.location.Vector3;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class Vector3Kt {
    public static final Vector3Kt INSTANCE = new Vector3Kt();

    private Vector3Kt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Vector3.Builder _builder;

        private Dsl(Vector3.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ Vector3 _build() {
            Vector3 vector3Build = this._builder.build();
            x.e(vector3Build, "build(...)");
            return vector3Build;
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

        public final float getX() {
            return this._builder.getX();
        }

        public final float getY() {
            return this._builder.getY();
        }

        public final float getZ() {
            return this._builder.getZ();
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

            public final /* synthetic */ Dsl _create(Vector3.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(Vector3.Builder builder, o oVar) {
            this(builder);
        }
    }
}
