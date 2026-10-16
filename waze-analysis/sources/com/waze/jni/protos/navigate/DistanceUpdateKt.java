package com.waze.jni.protos.navigate;

import com.waze.jni.protos.DistanceUnitOuterClass;
import com.waze.jni.protos.navigate.DistanceUpdate;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class DistanceUpdateKt {
    public static final DistanceUpdateKt INSTANCE = new DistanceUpdateKt();

    private DistanceUpdateKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final DistanceUpdate.Builder _builder;

        private Dsl(DistanceUpdate.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ DistanceUpdate _build() {
            DistanceUpdate distanceUpdateBuild = this._builder.build();
            x.e(distanceUpdateBuild, "build(...)");
            return distanceUpdateBuild;
        }

        public final void clearRawMeters() {
            this._builder.clearRawMeters();
        }

        public final void clearUnit() {
            this._builder.clearUnit();
        }

        public final void clearUnitString() {
            this._builder.clearUnitString();
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final void clearValueString() {
            this._builder.clearValueString();
        }

        public final int getRawMeters() {
            return this._builder.getRawMeters();
        }

        public final DistanceUnitOuterClass.DistanceUnit getUnit() {
            DistanceUnitOuterClass.DistanceUnit unit = this._builder.getUnit();
            x.e(unit, "getUnit(...)");
            return unit;
        }

        public final String getUnitString() {
            String unitString = this._builder.getUnitString();
            x.e(unitString, "getUnitString(...)");
            return unitString;
        }

        public final int getUnitValue() {
            return this._builder.getUnitValue();
        }

        public final double getValue() {
            return this._builder.getValue();
        }

        public final String getValueString() {
            String valueString = this._builder.getValueString();
            x.e(valueString, "getValueString(...)");
            return valueString;
        }

        public final void setRawMeters(int i2) {
            this._builder.setRawMeters(i2);
        }

        public final void setUnit(DistanceUnitOuterClass.DistanceUnit distanceUnit) {
            x.f(distanceUnit, "value");
            this._builder.setUnit(distanceUnit);
        }

        public final void setUnitString(String str) {
            x.f(str, "value");
            this._builder.setUnitString(str);
        }

        public final void setUnitValue(int i2) {
            this._builder.setUnitValue(i2);
        }

        public final void setValue(double d2) {
            this._builder.setValue(d2);
        }

        public final void setValueString(String str) {
            x.f(str, "value");
            this._builder.setValueString(str);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(DistanceUpdate.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(DistanceUpdate.Builder builder, o oVar) {
            this(builder);
        }
    }
}
