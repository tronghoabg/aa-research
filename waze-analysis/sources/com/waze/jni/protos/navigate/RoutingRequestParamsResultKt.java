package com.waze.jni.protos.navigate;

import com.waze.jni.protos.navigate.DriveTo;
import com.waze.jni.protos.navigate.RoutingRequestParamsResult;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class RoutingRequestParamsResultKt {
    public static final RoutingRequestParamsResultKt INSTANCE = new RoutingRequestParamsResultKt();

    private RoutingRequestParamsResultKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final RoutingRequestParamsResult.Builder _builder;

        private Dsl(RoutingRequestParamsResult.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ RoutingRequestParamsResult _build() {
            RoutingRequestParamsResult routingRequestParamsResultBuild = this._builder.build();
            x.e(routingRequestParamsResultBuild, "build(...)");
            return routingRequestParamsResultBuild;
        }

        public final void clearDestinationDangerZoneType() {
            this._builder.clearDestinationDangerZoneType();
        }

        public final void clearOriginDangerZoneType() {
            this._builder.clearOriginDangerZoneType();
        }

        public final void clearTempAvoidFerries() {
            this._builder.clearTempAvoidFerries();
        }

        public final void clearTempAvoidPrimaries() {
            this._builder.clearTempAvoidPrimaries();
        }

        public final void clearTempAvoidTollRoads() {
            this._builder.clearTempAvoidTollRoads();
        }

        public final void clearTempAvoidTrails() {
            this._builder.clearTempAvoidTrails();
        }

        public final void clearTempVehicleType() {
            this._builder.clearTempVehicleType();
        }

        public final DriveTo.DangerZoneType getDestinationDangerZoneType() {
            DriveTo.DangerZoneType destinationDangerZoneType = this._builder.getDestinationDangerZoneType();
            x.e(destinationDangerZoneType, "getDestinationDangerZoneType(...)");
            return destinationDangerZoneType;
        }

        public final int getDestinationDangerZoneTypeValue() {
            return this._builder.getDestinationDangerZoneTypeValue();
        }

        public final DriveTo.DangerZoneType getOriginDangerZoneType() {
            DriveTo.DangerZoneType originDangerZoneType = this._builder.getOriginDangerZoneType();
            x.e(originDangerZoneType, "getOriginDangerZoneType(...)");
            return originDangerZoneType;
        }

        public final int getOriginDangerZoneTypeValue() {
            return this._builder.getOriginDangerZoneTypeValue();
        }

        public final boolean getTempAvoidFerries() {
            return this._builder.getTempAvoidFerries();
        }

        public final boolean getTempAvoidPrimaries() {
            return this._builder.getTempAvoidPrimaries();
        }

        public final boolean getTempAvoidTollRoads() {
            return this._builder.getTempAvoidTollRoads();
        }

        public final String getTempAvoidTrails() {
            String tempAvoidTrails = this._builder.getTempAvoidTrails();
            x.e(tempAvoidTrails, "getTempAvoidTrails(...)");
            return tempAvoidTrails;
        }

        public final String getTempVehicleType() {
            String tempVehicleType = this._builder.getTempVehicleType();
            x.e(tempVehicleType, "getTempVehicleType(...)");
            return tempVehicleType;
        }

        public final boolean hasDestinationDangerZoneType() {
            return this._builder.hasDestinationDangerZoneType();
        }

        public final boolean hasOriginDangerZoneType() {
            return this._builder.hasOriginDangerZoneType();
        }

        public final boolean hasTempAvoidFerries() {
            return this._builder.hasTempAvoidFerries();
        }

        public final boolean hasTempAvoidPrimaries() {
            return this._builder.hasTempAvoidPrimaries();
        }

        public final boolean hasTempAvoidTollRoads() {
            return this._builder.hasTempAvoidTollRoads();
        }

        public final boolean hasTempAvoidTrails() {
            return this._builder.hasTempAvoidTrails();
        }

        public final boolean hasTempVehicleType() {
            return this._builder.hasTempVehicleType();
        }

        public final void setDestinationDangerZoneType(DriveTo.DangerZoneType dangerZoneType) {
            x.f(dangerZoneType, "value");
            this._builder.setDestinationDangerZoneType(dangerZoneType);
        }

        public final void setDestinationDangerZoneTypeValue(int i2) {
            this._builder.setDestinationDangerZoneTypeValue(i2);
        }

        public final void setOriginDangerZoneType(DriveTo.DangerZoneType dangerZoneType) {
            x.f(dangerZoneType, "value");
            this._builder.setOriginDangerZoneType(dangerZoneType);
        }

        public final void setOriginDangerZoneTypeValue(int i2) {
            this._builder.setOriginDangerZoneTypeValue(i2);
        }

        public final void setTempAvoidFerries(boolean z) {
            this._builder.setTempAvoidFerries(z);
        }

        public final void setTempAvoidPrimaries(boolean z) {
            this._builder.setTempAvoidPrimaries(z);
        }

        public final void setTempAvoidTollRoads(boolean z) {
            this._builder.setTempAvoidTollRoads(z);
        }

        public final void setTempAvoidTrails(String str) {
            x.f(str, "value");
            this._builder.setTempAvoidTrails(str);
        }

        public final void setTempVehicleType(String str) {
            x.f(str, "value");
            this._builder.setTempVehicleType(str);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(RoutingRequestParamsResult.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(RoutingRequestParamsResult.Builder builder, o oVar) {
            this(builder);
        }
    }
}
