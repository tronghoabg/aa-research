package com.waze.jni.protos.asks;

import com.waze.jni.protos.asks.WazeAsksTrigger;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class WazeAsksTriggerKt {
    public static final WazeAsksTriggerKt INSTANCE = new WazeAsksTriggerKt();

    private WazeAsksTriggerKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final WazeAsksTrigger.Builder _builder;

        private Dsl(WazeAsksTrigger.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ WazeAsksTrigger _build() {
            WazeAsksTrigger wazeAsksTriggerBuild = this._builder.build();
            x.e(wazeAsksTriggerBuild, "build(...)");
            return wazeAsksTriggerBuild;
        }

        public final void clearInsightId() {
            this._builder.clearInsightId();
        }

        public final void clearStatsAlertId() {
            this._builder.clearStatsAlertId();
        }

        public final void clearType() {
            this._builder.clearType();
        }

        public final String getInsightId() {
            String insightId = this._builder.getInsightId();
            x.e(insightId, "getInsightId(...)");
            return insightId;
        }

        public final int getStatsAlertId() {
            return this._builder.getStatsAlertId();
        }

        public final WazeAsksTrigger.TriggerType getType() {
            WazeAsksTrigger.TriggerType type = this._builder.getType();
            x.e(type, "getType(...)");
            return type;
        }

        public final int getTypeValue() {
            return this._builder.getTypeValue();
        }

        public final void setInsightId(String str) {
            x.f(str, "value");
            this._builder.setInsightId(str);
        }

        public final void setStatsAlertId(int i2) {
            this._builder.setStatsAlertId(i2);
        }

        public final void setType(WazeAsksTrigger.TriggerType triggerType) {
            x.f(triggerType, "value");
            this._builder.setType(triggerType);
        }

        public final void setTypeValue(int i2) {
            this._builder.setTypeValue(i2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(WazeAsksTrigger.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(WazeAsksTrigger.Builder builder, o oVar) {
            this(builder);
        }
    }
}
