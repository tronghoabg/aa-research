package com.waze.jni.protos.insights_infra;

import com.google.v.b.a;
import com.google.v.b.c;
import com.waze.jni.protos.InsightPriority;
import com.waze.jni.protos.alerters.AlerterType;
import com.waze.jni.protos.insights_infra.SegmentInsightInfo;
import h.ab;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class SegmentInsightInfoKt {
    public static final SegmentInsightInfoKt INSTANCE = new SegmentInsightInfoKt();

    private SegmentInsightInfoKt() {
    }

    /* renamed from: -initializealertInfo, reason: not valid java name */
    public final SegmentInsightInfo.AlertInfo m26262initializealertInfo(l<? super AlertInfoKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        AlertInfoKt.Dsl.Companion companion = AlertInfoKt.Dsl.Companion;
        SegmentInsightInfo.AlertInfo.Builder builderNewBuilder = SegmentInsightInfo.AlertInfo.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        AlertInfoKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializeid, reason: not valid java name */
    public final SegmentInsightInfo.Id m26263initializeid(l<? super IdKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        IdKt.Dsl.Companion companion = IdKt.Dsl.Companion;
        SegmentInsightInfo.Id.Builder builderNewBuilder = SegmentInsightInfo.Id.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        IdKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* compiled from: WazeSource */
    public final class AlertInfoKt {
        public static final AlertInfoKt INSTANCE = new AlertInfoKt();

        private AlertInfoKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final SegmentInsightInfo.AlertInfo.Builder _builder;

            private Dsl(SegmentInsightInfo.AlertInfo.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ SegmentInsightInfo.AlertInfo _build() {
                SegmentInsightInfo.AlertInfo alertInfoBuild = this._builder.build();
                x.e(alertInfoBuild, "build(...)");
                return alertInfoBuild;
            }

            public final void clearAlerterType() {
                this._builder.clearAlerterType();
            }

            public final void clearFamiliar() {
                this._builder.clearFamiliar();
            }

            public final void clearId() {
                this._builder.clearId();
            }

            public final void clearSubtype() {
                this._builder.clearSubtype();
            }

            public final void clearUuid() {
                this._builder.clearUuid();
            }

            public final AlerterType getAlerterType() {
                AlerterType alerterType = this._builder.getAlerterType();
                x.e(alerterType, "getAlerterType(...)");
                return alerterType;
            }

            public final int getAlerterTypeValue() {
                return this._builder.getAlerterTypeValue();
            }

            public final boolean getFamiliar() {
                return this._builder.getFamiliar();
            }

            public final long getId() {
                return this._builder.getId();
            }

            public final int getSubtype() {
                return this._builder.getSubtype();
            }

            public final String getUuid() {
                String uuid = this._builder.getUuid();
                x.e(uuid, "getUuid(...)");
                return uuid;
            }

            public final void setAlerterType(AlerterType alerterType) {
                x.f(alerterType, "value");
                this._builder.setAlerterType(alerterType);
            }

            public final void setAlerterTypeValue(int i2) {
                this._builder.setAlerterTypeValue(i2);
            }

            public final void setFamiliar(boolean z) {
                this._builder.setFamiliar(z);
            }

            public final void setId(long j2) {
                this._builder.setId(j2);
            }

            public final void setSubtype(int i2) {
                this._builder.setSubtype(i2);
            }

            public final void setUuid(String str) {
                x.f(str, "value");
                this._builder.setUuid(str);
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(SegmentInsightInfo.AlertInfo.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(SegmentInsightInfo.AlertInfo.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class IdKt {
        public static final IdKt INSTANCE = new IdKt();

        private IdKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final SegmentInsightInfo.Id.Builder _builder;

            private Dsl(SegmentInsightInfo.Id.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ SegmentInsightInfo.Id _build() {
                SegmentInsightInfo.Id idBuild = this._builder.build();
                x.e(idBuild, "build(...)");
                return idBuild;
            }

            public final void clearSegmentId() {
                this._builder.clearSegmentId();
            }

            public final void clearSegmentType() {
                this._builder.clearSegmentType();
            }

            public final String getSegmentId() {
                String segmentId = this._builder.getSegmentId();
                x.e(segmentId, "getSegmentId(...)");
                return segmentId;
            }

            public final SegmentInsightInfo.Type getSegmentType() {
                SegmentInsightInfo.Type segmentType = this._builder.getSegmentType();
                x.e(segmentType, "getSegmentType(...)");
                return segmentType;
            }

            public final int getSegmentTypeValue() {
                return this._builder.getSegmentTypeValue();
            }

            public final void setSegmentId(String str) {
                x.f(str, "value");
                this._builder.setSegmentId(str);
            }

            public final void setSegmentType(SegmentInsightInfo.Type type) {
                x.f(type, "value");
                this._builder.setSegmentType(type);
            }

            public final void setSegmentTypeValue(int i2) {
                this._builder.setSegmentTypeValue(i2);
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(SegmentInsightInfo.Id.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(SegmentInsightInfo.Id.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final SegmentInsightInfo.Builder _builder;

        /* compiled from: WazeSource */
        public final class SourceAlertInfosProxy extends c {
            private SourceAlertInfosProxy() {
            }
        }

        private Dsl(SegmentInsightInfo.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ SegmentInsightInfo _build() {
            SegmentInsightInfo segmentInsightInfoBuild = this._builder.build();
            x.e(segmentInsightInfoBuild, "build(...)");
            return segmentInsightInfoBuild;
        }

        public final /* synthetic */ void addAllSourceAlertInfos(a aVar, Iterable iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            this._builder.addAllSourceAlertInfos(iterable);
        }

        public final /* synthetic */ void addSourceAlertInfos(a aVar, SegmentInsightInfo.AlertInfo alertInfo) {
            x.f(aVar, "<this>");
            x.f(alertInfo, "value");
            this._builder.addSourceAlertInfos(alertInfo);
        }

        public final void clearId() {
            this._builder.clearId();
        }

        public final void clearPositionRelativeToSegment() {
            this._builder.clearPositionRelativeToSegment();
        }

        public final void clearPriority() {
            this._builder.clearPriority();
        }

        public final void clearRemainingDistanceMeters() {
            this._builder.clearRemainingDistanceMeters();
        }

        public final void clearRemainingDurationSeconds() {
            this._builder.clearRemainingDurationSeconds();
        }

        public final /* synthetic */ void clearSourceAlertInfos(a aVar) {
            x.f(aVar, "<this>");
            this._builder.clearSourceAlertInfos();
        }

        public final SegmentInsightInfo.Id getId() {
            SegmentInsightInfo.Id id = this._builder.getId();
            x.e(id, "getId(...)");
            return id;
        }

        public final SegmentInsightInfo.Id getIdOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return SegmentInsightInfoKtKt.getIdOrNull(dsl._builder);
        }

        public final SegmentInsightInfo.PositionRelativeToSegment getPositionRelativeToSegment() {
            SegmentInsightInfo.PositionRelativeToSegment positionRelativeToSegment = this._builder.getPositionRelativeToSegment();
            x.e(positionRelativeToSegment, "getPositionRelativeToSegment(...)");
            return positionRelativeToSegment;
        }

        public final int getPositionRelativeToSegmentValue() {
            return this._builder.getPositionRelativeToSegmentValue();
        }

        public final InsightPriority getPriority() {
            InsightPriority priority = this._builder.getPriority();
            x.e(priority, "getPriority(...)");
            return priority;
        }

        public final InsightPriority getPriorityOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return SegmentInsightInfoKtKt.getPriorityOrNull(dsl._builder);
        }

        public final int getRemainingDistanceMeters() {
            return this._builder.getRemainingDistanceMeters();
        }

        public final int getRemainingDurationSeconds() {
            return this._builder.getRemainingDurationSeconds();
        }

        public final /* synthetic */ a getSourceAlertInfos() {
            List<SegmentInsightInfo.AlertInfo> sourceAlertInfosList = this._builder.getSourceAlertInfosList();
            x.e(sourceAlertInfosList, "getSourceAlertInfosList(...)");
            return new a(sourceAlertInfosList);
        }

        public final boolean hasId() {
            return this._builder.hasId();
        }

        public final boolean hasPriority() {
            return this._builder.hasPriority();
        }

        public final boolean hasRemainingDurationSeconds() {
            return this._builder.hasRemainingDurationSeconds();
        }

        public final /* synthetic */ void plusAssignAllSourceAlertInfos(a<SegmentInsightInfo.AlertInfo, SourceAlertInfosProxy> aVar, Iterable<SegmentInsightInfo.AlertInfo> iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            addAllSourceAlertInfos(aVar, iterable);
        }

        public final /* synthetic */ void plusAssignSourceAlertInfos(a<SegmentInsightInfo.AlertInfo, SourceAlertInfosProxy> aVar, SegmentInsightInfo.AlertInfo alertInfo) {
            x.f(aVar, "<this>");
            x.f(alertInfo, "value");
            addSourceAlertInfos(aVar, alertInfo);
        }

        public final void setId(SegmentInsightInfo.Id id) {
            x.f(id, "value");
            this._builder.setId(id);
        }

        public final void setPositionRelativeToSegment(SegmentInsightInfo.PositionRelativeToSegment positionRelativeToSegment) {
            x.f(positionRelativeToSegment, "value");
            this._builder.setPositionRelativeToSegment(positionRelativeToSegment);
        }

        public final void setPositionRelativeToSegmentValue(int i2) {
            this._builder.setPositionRelativeToSegmentValue(i2);
        }

        public final void setPriority(InsightPriority insightPriority) {
            x.f(insightPriority, "value");
            this._builder.setPriority(insightPriority);
        }

        public final void setRemainingDistanceMeters(int i2) {
            this._builder.setRemainingDistanceMeters(i2);
        }

        public final void setRemainingDurationSeconds(int i2) {
            this._builder.setRemainingDurationSeconds(i2);
        }

        public final /* synthetic */ void setSourceAlertInfos(a aVar, int i2, SegmentInsightInfo.AlertInfo alertInfo) {
            x.f(aVar, "<this>");
            x.f(alertInfo, "value");
            this._builder.setSourceAlertInfos(i2, alertInfo);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(SegmentInsightInfo.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(SegmentInsightInfo.Builder builder, o oVar) {
            this(builder);
        }
    }
}
