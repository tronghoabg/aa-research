package com.waze.jni.protos.alerters;

import com.waze.jni.protos.alerters.ZoneAlertData;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ZoneAlertDataKt {
    public static final ZoneAlertDataKt INSTANCE = new ZoneAlertDataKt();

    private ZoneAlertDataKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final ZoneAlertData.Builder _builder;

        private Dsl(ZoneAlertData.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ ZoneAlertData _build() {
            ZoneAlertData zoneAlertDataBuild = this._builder.build();
            x.e(zoneAlertDataBuild, "build(...)");
            return zoneAlertDataBuild;
        }

        public final void clearState() {
            this._builder.clearState();
        }

        public final void clearZonePercent() {
            this._builder.clearZonePercent();
        }

        public final ZoneAlertData.State getState() {
            ZoneAlertData.State state = this._builder.getState();
            x.e(state, "getState(...)");
            return state;
        }

        public final int getStateValue() {
            return this._builder.getStateValue();
        }

        public final int getZonePercent() {
            return this._builder.getZonePercent();
        }

        public final void setState(ZoneAlertData.State state) {
            x.f(state, "value");
            this._builder.setState(state);
        }

        public final void setStateValue(int i2) {
            this._builder.setStateValue(i2);
        }

        public final void setZonePercent(int i2) {
            this._builder.setZonePercent(i2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(ZoneAlertData.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(ZoneAlertData.Builder builder, o oVar) {
            this(builder);
        }
    }
}
