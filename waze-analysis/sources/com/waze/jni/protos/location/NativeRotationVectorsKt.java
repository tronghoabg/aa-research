package com.waze.jni.protos.location;

import com.waze.jni.protos.location.NativeRotationVectors;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NativeRotationVectorsKt {
    public static final NativeRotationVectorsKt INSTANCE = new NativeRotationVectorsKt();

    private NativeRotationVectorsKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final NativeRotationVectors.Builder _builder;

        private Dsl(NativeRotationVectors.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ NativeRotationVectors _build() {
            NativeRotationVectors nativeRotationVectorsBuild = this._builder.build();
            x.e(nativeRotationVectorsBuild, "build(...)");
            return nativeRotationVectorsBuild;
        }

        public final void clearDeltaTns() {
            this._builder.clearDeltaTns();
        }

        public final void clearGravity() {
            this._builder.clearGravity();
        }

        public final void clearMagneticField() {
            this._builder.clearMagneticField();
        }

        public final void clearMaxAcceleration() {
            this._builder.clearMaxAcceleration();
        }

        public final void clearMaxRateOfTurn() {
            this._builder.clearMaxRateOfTurn();
        }

        public final void clearRotation() {
            this._builder.clearRotation();
        }

        public final void clearTimestampMs() {
            this._builder.clearTimestampMs();
        }

        public final long getDeltaTns() {
            return this._builder.getDeltaTns();
        }

        public final Vector3 getGravity() {
            Vector3 gravity = this._builder.getGravity();
            x.e(gravity, "getGravity(...)");
            return gravity;
        }

        public final Vector3 getGravityOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return NativeRotationVectorsKtKt.getGravityOrNull(dsl._builder);
        }

        public final Vector3 getMagneticField() {
            Vector3 magneticField = this._builder.getMagneticField();
            x.e(magneticField, "getMagneticField(...)");
            return magneticField;
        }

        public final Vector3 getMagneticFieldOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return NativeRotationVectorsKtKt.getMagneticFieldOrNull(dsl._builder);
        }

        public final float getMaxAcceleration() {
            return this._builder.getMaxAcceleration();
        }

        public final float getMaxRateOfTurn() {
            return this._builder.getMaxRateOfTurn();
        }

        public final Quaternion getRotation() {
            Quaternion rotation = this._builder.getRotation();
            x.e(rotation, "getRotation(...)");
            return rotation;
        }

        public final Quaternion getRotationOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return NativeRotationVectorsKtKt.getRotationOrNull(dsl._builder);
        }

        public final long getTimestampMs() {
            return this._builder.getTimestampMs();
        }

        public final boolean hasDeltaTns() {
            return this._builder.hasDeltaTns();
        }

        public final boolean hasGravity() {
            return this._builder.hasGravity();
        }

        public final boolean hasMagneticField() {
            return this._builder.hasMagneticField();
        }

        public final boolean hasMaxAcceleration() {
            return this._builder.hasMaxAcceleration();
        }

        public final boolean hasMaxRateOfTurn() {
            return this._builder.hasMaxRateOfTurn();
        }

        public final boolean hasRotation() {
            return this._builder.hasRotation();
        }

        public final boolean hasTimestampMs() {
            return this._builder.hasTimestampMs();
        }

        public final void setDeltaTns(long j2) {
            this._builder.setDeltaTns(j2);
        }

        public final void setGravity(Vector3 vector3) {
            x.f(vector3, "value");
            this._builder.setGravity(vector3);
        }

        public final void setMagneticField(Vector3 vector3) {
            x.f(vector3, "value");
            this._builder.setMagneticField(vector3);
        }

        public final void setMaxAcceleration(float f2) {
            this._builder.setMaxAcceleration(f2);
        }

        public final void setMaxRateOfTurn(float f2) {
            this._builder.setMaxRateOfTurn(f2);
        }

        public final void setRotation(Quaternion quaternion) {
            x.f(quaternion, "value");
            this._builder.setRotation(quaternion);
        }

        public final void setTimestampMs(long j2) {
            this._builder.setTimestampMs(j2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(NativeRotationVectors.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(NativeRotationVectors.Builder builder, o oVar) {
            this(builder);
        }
    }
}
