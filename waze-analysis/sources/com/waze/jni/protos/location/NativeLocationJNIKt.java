package com.waze.jni.protos.location;

import com.waze.jni.protos.Position;
import com.waze.jni.protos.location.NativeLocationJNI;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NativeLocationJNIKt {
    public static final NativeLocationJNIKt INSTANCE = new NativeLocationJNIKt();

    private NativeLocationJNIKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final NativeLocationJNI.Builder _builder;

        private Dsl(NativeLocationJNI.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ NativeLocationJNI _build() {
            NativeLocationJNI nativeLocationJNIBuild = this._builder.build();
            x.e(nativeLocationJNIBuild, "build(...)");
            return nativeLocationJNIBuild;
        }

        public final void clearAccelerometer() {
            this._builder.clearAccelerometer();
        }

        public final void clearAccuracyMeters() {
            this._builder.clearAccuracyMeters();
        }

        public final void clearAltitude() {
            this._builder.clearAltitude();
        }

        public final void clearCompass() {
            this._builder.clearCompass();
        }

        public final void clearDecayStaleAccuracy() {
            this._builder.clearDecayStaleAccuracy();
        }

        public final void clearGeneratedBySoftware() {
            this._builder.clearGeneratedBySoftware();
        }

        public final void clearGpsTimeMs() {
            this._builder.clearGpsTimeMs();
        }

        public final void clearGyroscope() {
            this._builder.clearGyroscope();
        }

        public final void clearPosition() {
            this._builder.clearPosition();
        }

        public final void clearProvider() {
            this._builder.clearProvider();
        }

        public final void clearSourceType() {
            this._builder.clearSourceType();
        }

        public final void clearSpeedAccuracyMmSec() {
            this._builder.clearSpeedAccuracyMmSec();
        }

        public final void clearSpeedMmSec() {
            this._builder.clearSpeedMmSec();
        }

        public final void clearSteeringAccuracyDegrees() {
            this._builder.clearSteeringAccuracyDegrees();
        }

        public final void clearSteeringDegrees() {
            this._builder.clearSteeringDegrees();
        }

        public final Vector3 getAccelerometer() {
            Vector3 accelerometer = this._builder.getAccelerometer();
            x.e(accelerometer, "getAccelerometer(...)");
            return accelerometer;
        }

        public final Vector3 getAccelerometerOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return NativeLocationJNIKtKt.getAccelerometerOrNull(dsl._builder);
        }

        public final double getAccuracyMeters() {
            return this._builder.getAccuracyMeters();
        }

        public final int getAltitude() {
            return this._builder.getAltitude();
        }

        public final Vector3 getCompass() {
            Vector3 compass = this._builder.getCompass();
            x.e(compass, "getCompass(...)");
            return compass;
        }

        public final Vector3 getCompassOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return NativeLocationJNIKtKt.getCompassOrNull(dsl._builder);
        }

        public final boolean getDecayStaleAccuracy() {
            return this._builder.getDecayStaleAccuracy();
        }

        public final boolean getGeneratedBySoftware() {
            return this._builder.getGeneratedBySoftware();
        }

        public final long getGpsTimeMs() {
            return this._builder.getGpsTimeMs();
        }

        public final Vector3 getGyroscope() {
            Vector3 gyroscope = this._builder.getGyroscope();
            x.e(gyroscope, "getGyroscope(...)");
            return gyroscope;
        }

        public final Vector3 getGyroscopeOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return NativeLocationJNIKtKt.getGyroscopeOrNull(dsl._builder);
        }

        public final Position.IntPosition getPosition() {
            Position.IntPosition position = this._builder.getPosition();
            x.e(position, "getPosition(...)");
            return position;
        }

        public final Position.IntPosition getPositionOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return NativeLocationJNIKtKt.getPositionOrNull(dsl._builder);
        }

        public final NativeLocationJNI.Provider getProvider() {
            NativeLocationJNI.Provider provider = this._builder.getProvider();
            x.e(provider, "getProvider(...)");
            return provider;
        }

        public final int getProviderValue() {
            return this._builder.getProviderValue();
        }

        public final NativeLocationJNI.SourceType getSourceType() {
            NativeLocationJNI.SourceType sourceType = this._builder.getSourceType();
            x.e(sourceType, "getSourceType(...)");
            return sourceType;
        }

        public final int getSourceTypeValue() {
            return this._builder.getSourceTypeValue();
        }

        public final int getSpeedAccuracyMmSec() {
            return this._builder.getSpeedAccuracyMmSec();
        }

        public final int getSpeedMmSec() {
            return this._builder.getSpeedMmSec();
        }

        public final int getSteeringAccuracyDegrees() {
            return this._builder.getSteeringAccuracyDegrees();
        }

        public final int getSteeringDegrees() {
            return this._builder.getSteeringDegrees();
        }

        public final boolean hasAccelerometer() {
            return this._builder.hasAccelerometer();
        }

        public final boolean hasAccuracyMeters() {
            return this._builder.hasAccuracyMeters();
        }

        public final boolean hasAltitude() {
            return this._builder.hasAltitude();
        }

        public final boolean hasCompass() {
            return this._builder.hasCompass();
        }

        public final boolean hasDecayStaleAccuracy() {
            return this._builder.hasDecayStaleAccuracy();
        }

        public final boolean hasGeneratedBySoftware() {
            return this._builder.hasGeneratedBySoftware();
        }

        public final boolean hasGpsTimeMs() {
            return this._builder.hasGpsTimeMs();
        }

        public final boolean hasGyroscope() {
            return this._builder.hasGyroscope();
        }

        public final boolean hasPosition() {
            return this._builder.hasPosition();
        }

        public final boolean hasProvider() {
            return this._builder.hasProvider();
        }

        public final boolean hasSourceType() {
            return this._builder.hasSourceType();
        }

        public final boolean hasSpeedAccuracyMmSec() {
            return this._builder.hasSpeedAccuracyMmSec();
        }

        public final boolean hasSpeedMmSec() {
            return this._builder.hasSpeedMmSec();
        }

        public final boolean hasSteeringAccuracyDegrees() {
            return this._builder.hasSteeringAccuracyDegrees();
        }

        public final boolean hasSteeringDegrees() {
            return this._builder.hasSteeringDegrees();
        }

        public final void setAccelerometer(Vector3 vector3) {
            x.f(vector3, "value");
            this._builder.setAccelerometer(vector3);
        }

        public final void setAccuracyMeters(double d2) {
            this._builder.setAccuracyMeters(d2);
        }

        public final void setAltitude(int i2) {
            this._builder.setAltitude(i2);
        }

        public final void setCompass(Vector3 vector3) {
            x.f(vector3, "value");
            this._builder.setCompass(vector3);
        }

        public final void setDecayStaleAccuracy(boolean z) {
            this._builder.setDecayStaleAccuracy(z);
        }

        public final void setGeneratedBySoftware(boolean z) {
            this._builder.setGeneratedBySoftware(z);
        }

        public final void setGpsTimeMs(long j2) {
            this._builder.setGpsTimeMs(j2);
        }

        public final void setGyroscope(Vector3 vector3) {
            x.f(vector3, "value");
            this._builder.setGyroscope(vector3);
        }

        public final void setPosition(Position.IntPosition intPosition) {
            x.f(intPosition, "value");
            this._builder.setPosition(intPosition);
        }

        public final void setProvider(NativeLocationJNI.Provider provider) {
            x.f(provider, "value");
            this._builder.setProvider(provider);
        }

        public final void setProviderValue(int i2) {
            this._builder.setProviderValue(i2);
        }

        public final void setSourceType(NativeLocationJNI.SourceType sourceType) {
            x.f(sourceType, "value");
            this._builder.setSourceType(sourceType);
        }

        public final void setSourceTypeValue(int i2) {
            this._builder.setSourceTypeValue(i2);
        }

        public final void setSpeedAccuracyMmSec(int i2) {
            this._builder.setSpeedAccuracyMmSec(i2);
        }

        public final void setSpeedMmSec(int i2) {
            this._builder.setSpeedMmSec(i2);
        }

        public final void setSteeringAccuracyDegrees(int i2) {
            this._builder.setSteeringAccuracyDegrees(i2);
        }

        public final void setSteeringDegrees(int i2) {
            this._builder.setSteeringDegrees(i2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(NativeLocationJNI.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(NativeLocationJNI.Builder builder, o oVar) {
            this(builder);
        }
    }
}
