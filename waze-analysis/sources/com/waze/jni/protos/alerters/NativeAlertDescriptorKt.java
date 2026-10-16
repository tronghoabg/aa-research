package com.waze.jni.protos.alerters;

import com.waze.jni.protos.InsightPriority;
import com.waze.jni.protos.alerters.NativeAlertDescriptor;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NativeAlertDescriptorKt {
    public static final NativeAlertDescriptorKt INSTANCE = new NativeAlertDescriptorKt();

    private NativeAlertDescriptorKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final NativeAlertDescriptor.Builder _builder;

        private Dsl(NativeAlertDescriptor.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ NativeAlertDescriptor _build() {
            NativeAlertDescriptor nativeAlertDescriptorBuild = this._builder.build();
            x.e(nativeAlertDescriptorBuild, "build(...)");
            return nativeAlertDescriptorBuild;
        }

        public final void clearAbortImmediatelyOnRemoval() {
            this._builder.clearAbortImmediatelyOnRemoval();
        }

        public final void clearAlertId() {
            this._builder.clearAlertId();
        }

        public final void clearInfo() {
            this._builder.clearInfo();
        }

        public final void clearInsightPriority() {
            this._builder.clearInsightPriority();
        }

        public final void clearTriggerDistanceMeters() {
            this._builder.clearTriggerDistanceMeters();
        }

        public final void clearZoneAlertData() {
            this._builder.clearZoneAlertData();
        }

        public final boolean getAbortImmediatelyOnRemoval() {
            return this._builder.getAbortImmediatelyOnRemoval();
        }

        public final AlerterId getAlertId() {
            AlerterId alertId = this._builder.getAlertId();
            x.e(alertId, "getAlertId(...)");
            return alertId;
        }

        public final AlerterId getAlertIdOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return NativeAlertDescriptorKtKt.getAlertIdOrNull(dsl._builder);
        }

        public final AlerterInfo getInfo() {
            AlerterInfo info = this._builder.getInfo();
            x.e(info, "getInfo(...)");
            return info;
        }

        public final AlerterInfo getInfoOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return NativeAlertDescriptorKtKt.getInfoOrNull(dsl._builder);
        }

        public final InsightPriority getInsightPriority() {
            InsightPriority insightPriority = this._builder.getInsightPriority();
            x.e(insightPriority, "getInsightPriority(...)");
            return insightPriority;
        }

        public final InsightPriority getInsightPriorityOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return NativeAlertDescriptorKtKt.getInsightPriorityOrNull(dsl._builder);
        }

        public final int getTriggerDistanceMeters() {
            return this._builder.getTriggerDistanceMeters();
        }

        public final ZoneAlertData getZoneAlertData() {
            ZoneAlertData zoneAlertData = this._builder.getZoneAlertData();
            x.e(zoneAlertData, "getZoneAlertData(...)");
            return zoneAlertData;
        }

        public final ZoneAlertData getZoneAlertDataOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return NativeAlertDescriptorKtKt.getZoneAlertDataOrNull(dsl._builder);
        }

        public final boolean hasAlertId() {
            return this._builder.hasAlertId();
        }

        public final boolean hasInfo() {
            return this._builder.hasInfo();
        }

        public final boolean hasInsightPriority() {
            return this._builder.hasInsightPriority();
        }

        public final boolean hasZoneAlertData() {
            return this._builder.hasZoneAlertData();
        }

        public final void setAbortImmediatelyOnRemoval(boolean z) {
            this._builder.setAbortImmediatelyOnRemoval(z);
        }

        public final void setAlertId(AlerterId alerterId) {
            x.f(alerterId, "value");
            this._builder.setAlertId(alerterId);
        }

        public final void setInfo(AlerterInfo alerterInfo) {
            x.f(alerterInfo, "value");
            this._builder.setInfo(alerterInfo);
        }

        public final void setInsightPriority(InsightPriority insightPriority) {
            x.f(insightPriority, "value");
            this._builder.setInsightPriority(insightPriority);
        }

        public final void setTriggerDistanceMeters(int i2) {
            this._builder.setTriggerDistanceMeters(i2);
        }

        public final void setZoneAlertData(ZoneAlertData zoneAlertData) {
            x.f(zoneAlertData, "value");
            this._builder.setZoneAlertData(zoneAlertData);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(NativeAlertDescriptor.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(NativeAlertDescriptor.Builder builder, o oVar) {
            this(builder);
        }
    }
}
