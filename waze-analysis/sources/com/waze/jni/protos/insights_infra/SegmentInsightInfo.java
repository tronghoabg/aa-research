package com.waze.jni.protos.insights_infra;

import com.google.v.c;
import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eg;
import com.google.v.eh;
import com.google.v.ei;
import com.google.v.eo;
import com.google.v.ep;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import com.waze.jni.protos.InsightPriority;
import com.waze.jni.protos.alerters.AlerterType;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class SegmentInsightInfo extends du<SegmentInsightInfo, Builder> implements SegmentInsightInfoOrBuilder {
    private static final SegmentInsightInfo DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 4;
    private static volatile fo<SegmentInsightInfo> PARSER = null;
    public static final int POSITION_RELATIVE_TO_SEGMENT_FIELD_NUMBER = 1;
    public static final int PRIORITY_FIELD_NUMBER = 5;
    public static final int REMAINING_DISTANCE_METERS_FIELD_NUMBER = 3;
    public static final int REMAINING_DURATION_SECONDS_FIELD_NUMBER = 2;
    public static final int SOURCE_ALERT_INFOS_FIELD_NUMBER = 6;
    private int bitField0_;
    private Id id_;
    private int positionRelativeToSegment_;
    private InsightPriority priority_;
    private int remainingDistanceMeters_;
    private int remainingDurationSeconds_;
    private eo<AlertInfo> sourceAlertInfos_ = emptyProtobufList();

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.insights_infra.SegmentInsightInfo$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[dt.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[dt.f12882d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12883e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12881c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12884f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12885g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12879a.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12880b.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: WazeSource */
    public interface AlertInfoOrBuilder extends fj {
        AlerterType getAlerterType();

        int getAlerterTypeValue();

        boolean getFamiliar();

        long getId();

        int getSubtype();

        String getUuid();

        v getUuidBytes();
    }

    /* compiled from: WazeSource */
    public interface IdOrBuilder extends fj {
        String getSegmentId();

        v getSegmentIdBytes();

        Type getSegmentType();

        int getSegmentTypeValue();
    }

    /* compiled from: WazeSource */
    public enum PositionRelativeToSegment implements eg {
        APPROACHING(0),
        WITHIN(1),
        UNRECOGNIZED(-1);

        public static final int APPROACHING_VALUE = 0;
        public static final int WITHIN_VALUE = 1;
        private static final eh<PositionRelativeToSegment> internalValueMap = new eh<PositionRelativeToSegment>() { // from class: com.waze.jni.protos.insights_infra.SegmentInsightInfo.PositionRelativeToSegment.1
            @Override // com.google.v.eh
            public PositionRelativeToSegment findValueByNumber(int i2) {
                return PositionRelativeToSegment.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class PositionRelativeToSegmentVerifier implements ei {
            static final ei INSTANCE = new PositionRelativeToSegmentVerifier();

            private PositionRelativeToSegmentVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return PositionRelativeToSegment.forNumber(i2) != null;
            }
        }

        PositionRelativeToSegment(int i2) {
            this.value = i2;
        }

        public static PositionRelativeToSegment forNumber(int i2) {
            if (i2 == 0) {
                return APPROACHING;
            }
            if (i2 != 1) {
                return null;
            }
            return WITHIN;
        }

        public static eh<PositionRelativeToSegment> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return PositionRelativeToSegmentVerifier.INSTANCE;
        }

        @Override // com.google.v.eg
        public final int getNumber() {
            return this == UNRECOGNIZED ? ep.b() : this.value;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return Integer.toString(this.value);
        }
    }

    /* compiled from: WazeSource */
    public enum Type implements eg {
        TRAFFIC(0),
        SPEED_BUMP(1),
        DANGEROUS_CURVE(2),
        HOV_LANE(3),
        CARPOOL_LANE(4),
        BUS_LANE(5),
        ENFORCEMENT_ZONE(6),
        AVERAGE_SPEED_CAMERA(7),
        SCHOOL_ZONE(8),
        UNRECOGNIZED(-1);

        public static final int AVERAGE_SPEED_CAMERA_VALUE = 7;
        public static final int BUS_LANE_VALUE = 5;
        public static final int CARPOOL_LANE_VALUE = 4;
        public static final int DANGEROUS_CURVE_VALUE = 2;
        public static final int ENFORCEMENT_ZONE_VALUE = 6;
        public static final int HOV_LANE_VALUE = 3;
        public static final int SCHOOL_ZONE_VALUE = 8;
        public static final int SPEED_BUMP_VALUE = 1;
        public static final int TRAFFIC_VALUE = 0;
        private static final eh<Type> internalValueMap = new eh<Type>() { // from class: com.waze.jni.protos.insights_infra.SegmentInsightInfo.Type.1
            @Override // com.google.v.eh
            public Type findValueByNumber(int i2) {
                return Type.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class TypeVerifier implements ei {
            static final ei INSTANCE = new TypeVerifier();

            private TypeVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return Type.forNumber(i2) != null;
            }
        }

        Type(int i2) {
            this.value = i2;
        }

        public static Type forNumber(int i2) {
            switch (i2) {
                case 0:
                    return TRAFFIC;
                case 1:
                    return SPEED_BUMP;
                case 2:
                    return DANGEROUS_CURVE;
                case 3:
                    return HOV_LANE;
                case 4:
                    return CARPOOL_LANE;
                case 5:
                    return BUS_LANE;
                case 6:
                    return ENFORCEMENT_ZONE;
                case 7:
                    return AVERAGE_SPEED_CAMERA;
                case 8:
                    return SCHOOL_ZONE;
                default:
                    return null;
            }
        }

        public static eh<Type> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return TypeVerifier.INSTANCE;
        }

        @Override // com.google.v.eg
        public final int getNumber() {
            return this == UNRECOGNIZED ? ep.b() : this.value;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return Integer.toString(this.value);
        }
    }

    static {
        SegmentInsightInfo segmentInsightInfo = new SegmentInsightInfo();
        DEFAULT_INSTANCE = segmentInsightInfo;
        du.registerDefaultInstance(SegmentInsightInfo.class, segmentInsightInfo);
    }

    private SegmentInsightInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSourceAlertInfos(Iterable<? extends AlertInfo> iterable) {
        ensureSourceAlertInfosIsMutable();
        c.addAll(iterable, this.sourceAlertInfos_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSourceAlertInfos(int i2, AlertInfo alertInfo) {
        Objects.requireNonNull(alertInfo);
        ensureSourceAlertInfosIsMutable();
        this.sourceAlertInfos_.add(i2, alertInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPositionRelativeToSegment() {
        this.positionRelativeToSegment_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPriority() {
        this.priority_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRemainingDistanceMeters() {
        this.remainingDistanceMeters_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRemainingDurationSeconds() {
        this.bitField0_ &= -2;
        this.remainingDurationSeconds_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSourceAlertInfos() {
        this.sourceAlertInfos_ = emptyProtobufList();
    }

    private void ensureSourceAlertInfosIsMutable() {
        eo<AlertInfo> eoVar = this.sourceAlertInfos_;
        if (eoVar.c()) {
            return;
        }
        this.sourceAlertInfos_ = du.mutableCopy(eoVar);
    }

    public static SegmentInsightInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeId(Id id) {
        Objects.requireNonNull(id);
        Id id2 = this.id_;
        if (id2 != null && id2 != Id.getDefaultInstance()) {
            Id.Builder builderNewBuilder = Id.newBuilder(id2);
            builderNewBuilder.mergeFrom((Id.Builder) id);
            id = builderNewBuilder.buildPartial();
        }
        this.id_ = id;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePriority(InsightPriority insightPriority) {
        Objects.requireNonNull(insightPriority);
        InsightPriority insightPriority2 = this.priority_;
        if (insightPriority2 != null && insightPriority2 != InsightPriority.getDefaultInstance()) {
            InsightPriority.Builder builderNewBuilder = InsightPriority.newBuilder(insightPriority2);
            builderNewBuilder.mergeFrom((InsightPriority.Builder) insightPriority);
            insightPriority = builderNewBuilder.buildPartial();
        }
        this.priority_ = insightPriority;
        this.bitField0_ |= 4;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static SegmentInsightInfo parseDelimitedFrom(InputStream inputStream) {
        return (SegmentInsightInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SegmentInsightInfo parseFrom(v vVar) {
        return (SegmentInsightInfo) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<SegmentInsightInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSourceAlertInfos(int i2) {
        ensureSourceAlertInfosIsMutable();
        this.sourceAlertInfos_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(Id id) {
        Objects.requireNonNull(id);
        this.id_ = id;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPositionRelativeToSegment(PositionRelativeToSegment positionRelativeToSegment) {
        this.positionRelativeToSegment_ = positionRelativeToSegment.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPositionRelativeToSegmentValue(int i2) {
        this.positionRelativeToSegment_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriority(InsightPriority insightPriority) {
        Objects.requireNonNull(insightPriority);
        this.priority_ = insightPriority;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRemainingDistanceMeters(int i2) {
        this.remainingDistanceMeters_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRemainingDurationSeconds(int i2) {
        this.bitField0_ |= 1;
        this.remainingDurationSeconds_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceAlertInfos(int i2, AlertInfo alertInfo) {
        Objects.requireNonNull(alertInfo);
        ensureSourceAlertInfosIsMutable();
        this.sourceAlertInfos_.set(i2, alertInfo);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\f\u0002င\u0000\u0003\u0004\u0004ဉ\u0001\u0005ဉ\u0002\u0006\u001b", new Object[]{"bitField0_", "positionRelativeToSegment_", "remainingDurationSeconds_", "remainingDistanceMeters_", "id_", "priority_", "sourceAlertInfos_", AlertInfo.class});
        }
        if (iOrdinal == 3) {
            return new SegmentInsightInfo();
        }
        if (iOrdinal == 4) {
            return new Builder();
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<SegmentInsightInfo> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (SegmentInsightInfo.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.insights_infra.SegmentInsightInfoOrBuilder
    public Id getId() {
        Id id = this.id_;
        return id == null ? Id.getDefaultInstance() : id;
    }

    @Override // com.waze.jni.protos.insights_infra.SegmentInsightInfoOrBuilder
    public PositionRelativeToSegment getPositionRelativeToSegment() {
        PositionRelativeToSegment positionRelativeToSegmentForNumber = PositionRelativeToSegment.forNumber(this.positionRelativeToSegment_);
        return positionRelativeToSegmentForNumber == null ? PositionRelativeToSegment.UNRECOGNIZED : positionRelativeToSegmentForNumber;
    }

    @Override // com.waze.jni.protos.insights_infra.SegmentInsightInfoOrBuilder
    public int getPositionRelativeToSegmentValue() {
        return this.positionRelativeToSegment_;
    }

    @Override // com.waze.jni.protos.insights_infra.SegmentInsightInfoOrBuilder
    public InsightPriority getPriority() {
        InsightPriority insightPriority = this.priority_;
        return insightPriority == null ? InsightPriority.getDefaultInstance() : insightPriority;
    }

    @Override // com.waze.jni.protos.insights_infra.SegmentInsightInfoOrBuilder
    public int getRemainingDistanceMeters() {
        return this.remainingDistanceMeters_;
    }

    @Override // com.waze.jni.protos.insights_infra.SegmentInsightInfoOrBuilder
    public int getRemainingDurationSeconds() {
        return this.remainingDurationSeconds_;
    }

    @Override // com.waze.jni.protos.insights_infra.SegmentInsightInfoOrBuilder
    public AlertInfo getSourceAlertInfos(int i2) {
        return this.sourceAlertInfos_.get(i2);
    }

    @Override // com.waze.jni.protos.insights_infra.SegmentInsightInfoOrBuilder
    public int getSourceAlertInfosCount() {
        return this.sourceAlertInfos_.size();
    }

    @Override // com.waze.jni.protos.insights_infra.SegmentInsightInfoOrBuilder
    public List<AlertInfo> getSourceAlertInfosList() {
        return this.sourceAlertInfos_;
    }

    public AlertInfoOrBuilder getSourceAlertInfosOrBuilder(int i2) {
        return this.sourceAlertInfos_.get(i2);
    }

    public List<? extends AlertInfoOrBuilder> getSourceAlertInfosOrBuilderList() {
        return this.sourceAlertInfos_;
    }

    @Override // com.waze.jni.protos.insights_infra.SegmentInsightInfoOrBuilder
    public boolean hasId() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.waze.jni.protos.insights_infra.SegmentInsightInfoOrBuilder
    public boolean hasPriority() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.waze.jni.protos.insights_infra.SegmentInsightInfoOrBuilder
    public boolean hasRemainingDurationSeconds() {
        return (this.bitField0_ & 1) != 0;
    }

    /* compiled from: WazeSource */
    public final class AlertInfo extends du<AlertInfo, Builder> implements AlertInfoOrBuilder {
        public static final int ALERTER_TYPE_FIELD_NUMBER = 1;
        private static final AlertInfo DEFAULT_INSTANCE;
        public static final int FAMILIAR_FIELD_NUMBER = 4;
        public static final int ID_FIELD_NUMBER = 3;
        private static volatile fo<AlertInfo> PARSER = null;
        public static final int SUBTYPE_FIELD_NUMBER = 2;
        public static final int UUID_FIELD_NUMBER = 5;
        private int alerterType_;
        private boolean familiar_;
        private long id_;
        private int subtype_;
        private String uuid_ = "";

        /* compiled from: WazeSource */
        public final class Builder extends dm<AlertInfo, Builder> implements AlertInfoOrBuilder {
            private Builder() {
                super(AlertInfo.DEFAULT_INSTANCE);
            }

            public Builder clearAlerterType() {
                copyOnWrite();
                ((AlertInfo) this.instance).clearAlerterType();
                return this;
            }

            public Builder clearFamiliar() {
                copyOnWrite();
                ((AlertInfo) this.instance).clearFamiliar();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((AlertInfo) this.instance).clearId();
                return this;
            }

            public Builder clearSubtype() {
                copyOnWrite();
                ((AlertInfo) this.instance).clearSubtype();
                return this;
            }

            public Builder clearUuid() {
                copyOnWrite();
                ((AlertInfo) this.instance).clearUuid();
                return this;
            }

            @Override // com.waze.jni.protos.insights_infra.SegmentInsightInfo.AlertInfoOrBuilder
            public AlerterType getAlerterType() {
                return ((AlertInfo) this.instance).getAlerterType();
            }

            @Override // com.waze.jni.protos.insights_infra.SegmentInsightInfo.AlertInfoOrBuilder
            public int getAlerterTypeValue() {
                return ((AlertInfo) this.instance).getAlerterTypeValue();
            }

            @Override // com.waze.jni.protos.insights_infra.SegmentInsightInfo.AlertInfoOrBuilder
            public boolean getFamiliar() {
                return ((AlertInfo) this.instance).getFamiliar();
            }

            @Override // com.waze.jni.protos.insights_infra.SegmentInsightInfo.AlertInfoOrBuilder
            public long getId() {
                return ((AlertInfo) this.instance).getId();
            }

            @Override // com.waze.jni.protos.insights_infra.SegmentInsightInfo.AlertInfoOrBuilder
            public int getSubtype() {
                return ((AlertInfo) this.instance).getSubtype();
            }

            @Override // com.waze.jni.protos.insights_infra.SegmentInsightInfo.AlertInfoOrBuilder
            public String getUuid() {
                return ((AlertInfo) this.instance).getUuid();
            }

            @Override // com.waze.jni.protos.insights_infra.SegmentInsightInfo.AlertInfoOrBuilder
            public v getUuidBytes() {
                return ((AlertInfo) this.instance).getUuidBytes();
            }

            public Builder setAlerterType(AlerterType alerterType) {
                copyOnWrite();
                ((AlertInfo) this.instance).setAlerterType(alerterType);
                return this;
            }

            public Builder setAlerterTypeValue(int i2) {
                copyOnWrite();
                ((AlertInfo) this.instance).setAlerterTypeValue(i2);
                return this;
            }

            public Builder setFamiliar(boolean z) {
                copyOnWrite();
                ((AlertInfo) this.instance).setFamiliar(z);
                return this;
            }

            public Builder setId(long j2) {
                copyOnWrite();
                ((AlertInfo) this.instance).setId(j2);
                return this;
            }

            public Builder setSubtype(int i2) {
                copyOnWrite();
                ((AlertInfo) this.instance).setSubtype(i2);
                return this;
            }

            public Builder setUuid(String str) {
                copyOnWrite();
                ((AlertInfo) this.instance).setUuid(str);
                return this;
            }

            public Builder setUuidBytes(v vVar) {
                copyOnWrite();
                ((AlertInfo) this.instance).setUuidBytes(vVar);
                return this;
            }
        }

        static {
            AlertInfo alertInfo = new AlertInfo();
            DEFAULT_INSTANCE = alertInfo;
            du.registerDefaultInstance(AlertInfo.class, alertInfo);
        }

        private AlertInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlerterType() {
            this.alerterType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFamiliar() {
            this.familiar_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSubtype() {
            this.subtype_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUuid() {
            this.uuid_ = getDefaultInstance().getUuid();
        }

        public static AlertInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static AlertInfo parseDelimitedFrom(InputStream inputStream) {
            return (AlertInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AlertInfo parseFrom(v vVar) {
            return (AlertInfo) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<AlertInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlerterType(AlerterType alerterType) {
            this.alerterType_ = alerterType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlerterTypeValue(int i2) {
            this.alerterType_ = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFamiliar(boolean z) {
            this.familiar_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(long j2) {
            this.id_ = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSubtype(int i2) {
            this.subtype_ = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUuid(String str) {
            Objects.requireNonNull(str);
            this.uuid_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUuidBytes(v vVar) {
            checkByteStringIsUtf8(vVar);
            this.uuid_ = vVar.u();
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002\u0004\u0003\u0002\u0004\u0007\u0005Ȉ", new Object[]{"alerterType_", "subtype_", "id_", "familiar_", "uuid_"});
            }
            if (iOrdinal == 3) {
                return new AlertInfo();
            }
            if (iOrdinal == 4) {
                return new Builder();
            }
            if (iOrdinal == 5) {
                return DEFAULT_INSTANCE;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            fo<AlertInfo> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (AlertInfo.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        @Override // com.waze.jni.protos.insights_infra.SegmentInsightInfo.AlertInfoOrBuilder
        public AlerterType getAlerterType() {
            AlerterType alerterTypeForNumber = AlerterType.forNumber(this.alerterType_);
            return alerterTypeForNumber == null ? AlerterType.UNRECOGNIZED : alerterTypeForNumber;
        }

        @Override // com.waze.jni.protos.insights_infra.SegmentInsightInfo.AlertInfoOrBuilder
        public int getAlerterTypeValue() {
            return this.alerterType_;
        }

        @Override // com.waze.jni.protos.insights_infra.SegmentInsightInfo.AlertInfoOrBuilder
        public boolean getFamiliar() {
            return this.familiar_;
        }

        @Override // com.waze.jni.protos.insights_infra.SegmentInsightInfo.AlertInfoOrBuilder
        public long getId() {
            return this.id_;
        }

        @Override // com.waze.jni.protos.insights_infra.SegmentInsightInfo.AlertInfoOrBuilder
        public int getSubtype() {
            return this.subtype_;
        }

        @Override // com.waze.jni.protos.insights_infra.SegmentInsightInfo.AlertInfoOrBuilder
        public String getUuid() {
            return this.uuid_;
        }

        @Override // com.waze.jni.protos.insights_infra.SegmentInsightInfo.AlertInfoOrBuilder
        public v getUuidBytes() {
            return v.s(this.uuid_);
        }

        public static Builder newBuilder(AlertInfo alertInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(alertInfo);
        }

        public static AlertInfo parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (AlertInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static AlertInfo parseFrom(v vVar, de deVar) {
            return (AlertInfo) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static AlertInfo parseFrom(z zVar) {
            return (AlertInfo) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static AlertInfo parseFrom(z zVar, de deVar) {
            return (AlertInfo) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static AlertInfo parseFrom(InputStream inputStream) {
            return (AlertInfo) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AlertInfo parseFrom(InputStream inputStream, de deVar) {
            return (AlertInfo) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static AlertInfo parseFrom(ByteBuffer byteBuffer) {
            return (AlertInfo) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static AlertInfo parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (AlertInfo) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static AlertInfo parseFrom(byte[] bArr) {
            return (AlertInfo) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AlertInfo parseFrom(byte[] bArr, de deVar) {
            return (AlertInfo) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    /* compiled from: WazeSource */
    public final class Id extends du<Id, Builder> implements IdOrBuilder {
        private static final Id DEFAULT_INSTANCE;
        private static volatile fo<Id> PARSER = null;
        public static final int SEGMENT_ID_FIELD_NUMBER = 1;
        public static final int SEGMENT_TYPE_FIELD_NUMBER = 2;
        private String segmentId_ = "";
        private int segmentType_;

        /* compiled from: WazeSource */
        public final class Builder extends dm<Id, Builder> implements IdOrBuilder {
            private Builder() {
                super(Id.DEFAULT_INSTANCE);
            }

            public Builder clearSegmentId() {
                copyOnWrite();
                ((Id) this.instance).clearSegmentId();
                return this;
            }

            public Builder clearSegmentType() {
                copyOnWrite();
                ((Id) this.instance).clearSegmentType();
                return this;
            }

            @Override // com.waze.jni.protos.insights_infra.SegmentInsightInfo.IdOrBuilder
            public String getSegmentId() {
                return ((Id) this.instance).getSegmentId();
            }

            @Override // com.waze.jni.protos.insights_infra.SegmentInsightInfo.IdOrBuilder
            public v getSegmentIdBytes() {
                return ((Id) this.instance).getSegmentIdBytes();
            }

            @Override // com.waze.jni.protos.insights_infra.SegmentInsightInfo.IdOrBuilder
            public Type getSegmentType() {
                return ((Id) this.instance).getSegmentType();
            }

            @Override // com.waze.jni.protos.insights_infra.SegmentInsightInfo.IdOrBuilder
            public int getSegmentTypeValue() {
                return ((Id) this.instance).getSegmentTypeValue();
            }

            public Builder setSegmentId(String str) {
                copyOnWrite();
                ((Id) this.instance).setSegmentId(str);
                return this;
            }

            public Builder setSegmentIdBytes(v vVar) {
                copyOnWrite();
                ((Id) this.instance).setSegmentIdBytes(vVar);
                return this;
            }

            public Builder setSegmentType(Type type) {
                copyOnWrite();
                ((Id) this.instance).setSegmentType(type);
                return this;
            }

            public Builder setSegmentTypeValue(int i2) {
                copyOnWrite();
                ((Id) this.instance).setSegmentTypeValue(i2);
                return this;
            }
        }

        static {
            Id id = new Id();
            DEFAULT_INSTANCE = id;
            du.registerDefaultInstance(Id.class, id);
        }

        private Id() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSegmentId() {
            this.segmentId_ = getDefaultInstance().getSegmentId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSegmentType() {
            this.segmentType_ = 0;
        }

        public static Id getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Id parseDelimitedFrom(InputStream inputStream) {
            return (Id) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Id parseFrom(v vVar) {
            return (Id) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<Id> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSegmentId(String str) {
            Objects.requireNonNull(str);
            this.segmentId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSegmentIdBytes(v vVar) {
            checkByteStringIsUtf8(vVar);
            this.segmentId_ = vVar.u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSegmentType(Type type) {
            this.segmentType_ = type.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSegmentTypeValue(int i2) {
            this.segmentType_ = i2;
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"segmentId_", "segmentType_"});
            }
            if (iOrdinal == 3) {
                return new Id();
            }
            if (iOrdinal == 4) {
                return new Builder();
            }
            if (iOrdinal == 5) {
                return DEFAULT_INSTANCE;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            fo<Id> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (Id.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        @Override // com.waze.jni.protos.insights_infra.SegmentInsightInfo.IdOrBuilder
        public String getSegmentId() {
            return this.segmentId_;
        }

        @Override // com.waze.jni.protos.insights_infra.SegmentInsightInfo.IdOrBuilder
        public v getSegmentIdBytes() {
            return v.s(this.segmentId_);
        }

        @Override // com.waze.jni.protos.insights_infra.SegmentInsightInfo.IdOrBuilder
        public Type getSegmentType() {
            Type typeForNumber = Type.forNumber(this.segmentType_);
            return typeForNumber == null ? Type.UNRECOGNIZED : typeForNumber;
        }

        @Override // com.waze.jni.protos.insights_infra.SegmentInsightInfo.IdOrBuilder
        public int getSegmentTypeValue() {
            return this.segmentType_;
        }

        public static Builder newBuilder(Id id) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(id);
        }

        public static Id parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (Id) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static Id parseFrom(v vVar, de deVar) {
            return (Id) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static Id parseFrom(z zVar) {
            return (Id) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static Id parseFrom(z zVar, de deVar) {
            return (Id) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static Id parseFrom(InputStream inputStream) {
            return (Id) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Id parseFrom(InputStream inputStream, de deVar) {
            return (Id) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static Id parseFrom(ByteBuffer byteBuffer) {
            return (Id) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Id parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (Id) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static Id parseFrom(byte[] bArr) {
            return (Id) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Id parseFrom(byte[] bArr, de deVar) {
            return (Id) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    public static Builder newBuilder(SegmentInsightInfo segmentInsightInfo) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(segmentInsightInfo);
    }

    public static SegmentInsightInfo parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (SegmentInsightInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static SegmentInsightInfo parseFrom(v vVar, de deVar) {
        return (SegmentInsightInfo) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static SegmentInsightInfo parseFrom(z zVar) {
        return (SegmentInsightInfo) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static SegmentInsightInfo parseFrom(z zVar, de deVar) {
        return (SegmentInsightInfo) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSourceAlertInfos(AlertInfo alertInfo) {
        Objects.requireNonNull(alertInfo);
        ensureSourceAlertInfosIsMutable();
        this.sourceAlertInfos_.add(alertInfo);
    }

    public static SegmentInsightInfo parseFrom(InputStream inputStream) {
        return (SegmentInsightInfo) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SegmentInsightInfo parseFrom(InputStream inputStream, de deVar) {
        return (SegmentInsightInfo) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static SegmentInsightInfo parseFrom(ByteBuffer byteBuffer) {
        return (SegmentInsightInfo) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static SegmentInsightInfo parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (SegmentInsightInfo) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<SegmentInsightInfo, Builder> implements SegmentInsightInfoOrBuilder {
        private Builder() {
            super(SegmentInsightInfo.DEFAULT_INSTANCE);
        }

        public Builder addAllSourceAlertInfos(Iterable<? extends AlertInfo> iterable) {
            copyOnWrite();
            ((SegmentInsightInfo) this.instance).addAllSourceAlertInfos(iterable);
            return this;
        }

        public Builder addSourceAlertInfos(int i2, AlertInfo.Builder builder) {
            copyOnWrite();
            ((SegmentInsightInfo) this.instance).addSourceAlertInfos(i2, builder.build());
            return this;
        }

        public Builder clearId() {
            copyOnWrite();
            ((SegmentInsightInfo) this.instance).clearId();
            return this;
        }

        public Builder clearPositionRelativeToSegment() {
            copyOnWrite();
            ((SegmentInsightInfo) this.instance).clearPositionRelativeToSegment();
            return this;
        }

        public Builder clearPriority() {
            copyOnWrite();
            ((SegmentInsightInfo) this.instance).clearPriority();
            return this;
        }

        public Builder clearRemainingDistanceMeters() {
            copyOnWrite();
            ((SegmentInsightInfo) this.instance).clearRemainingDistanceMeters();
            return this;
        }

        public Builder clearRemainingDurationSeconds() {
            copyOnWrite();
            ((SegmentInsightInfo) this.instance).clearRemainingDurationSeconds();
            return this;
        }

        public Builder clearSourceAlertInfos() {
            copyOnWrite();
            ((SegmentInsightInfo) this.instance).clearSourceAlertInfos();
            return this;
        }

        @Override // com.waze.jni.protos.insights_infra.SegmentInsightInfoOrBuilder
        public Id getId() {
            return ((SegmentInsightInfo) this.instance).getId();
        }

        @Override // com.waze.jni.protos.insights_infra.SegmentInsightInfoOrBuilder
        public PositionRelativeToSegment getPositionRelativeToSegment() {
            return ((SegmentInsightInfo) this.instance).getPositionRelativeToSegment();
        }

        @Override // com.waze.jni.protos.insights_infra.SegmentInsightInfoOrBuilder
        public int getPositionRelativeToSegmentValue() {
            return ((SegmentInsightInfo) this.instance).getPositionRelativeToSegmentValue();
        }

        @Override // com.waze.jni.protos.insights_infra.SegmentInsightInfoOrBuilder
        public InsightPriority getPriority() {
            return ((SegmentInsightInfo) this.instance).getPriority();
        }

        @Override // com.waze.jni.protos.insights_infra.SegmentInsightInfoOrBuilder
        public int getRemainingDistanceMeters() {
            return ((SegmentInsightInfo) this.instance).getRemainingDistanceMeters();
        }

        @Override // com.waze.jni.protos.insights_infra.SegmentInsightInfoOrBuilder
        public int getRemainingDurationSeconds() {
            return ((SegmentInsightInfo) this.instance).getRemainingDurationSeconds();
        }

        @Override // com.waze.jni.protos.insights_infra.SegmentInsightInfoOrBuilder
        public AlertInfo getSourceAlertInfos(int i2) {
            return ((SegmentInsightInfo) this.instance).getSourceAlertInfos(i2);
        }

        @Override // com.waze.jni.protos.insights_infra.SegmentInsightInfoOrBuilder
        public int getSourceAlertInfosCount() {
            return ((SegmentInsightInfo) this.instance).getSourceAlertInfosCount();
        }

        @Override // com.waze.jni.protos.insights_infra.SegmentInsightInfoOrBuilder
        public List<AlertInfo> getSourceAlertInfosList() {
            return DesugarCollections.unmodifiableList(((SegmentInsightInfo) this.instance).getSourceAlertInfosList());
        }

        @Override // com.waze.jni.protos.insights_infra.SegmentInsightInfoOrBuilder
        public boolean hasId() {
            return ((SegmentInsightInfo) this.instance).hasId();
        }

        @Override // com.waze.jni.protos.insights_infra.SegmentInsightInfoOrBuilder
        public boolean hasPriority() {
            return ((SegmentInsightInfo) this.instance).hasPriority();
        }

        @Override // com.waze.jni.protos.insights_infra.SegmentInsightInfoOrBuilder
        public boolean hasRemainingDurationSeconds() {
            return ((SegmentInsightInfo) this.instance).hasRemainingDurationSeconds();
        }

        public Builder mergeId(Id id) {
            copyOnWrite();
            ((SegmentInsightInfo) this.instance).mergeId(id);
            return this;
        }

        public Builder mergePriority(InsightPriority insightPriority) {
            copyOnWrite();
            ((SegmentInsightInfo) this.instance).mergePriority(insightPriority);
            return this;
        }

        public Builder removeSourceAlertInfos(int i2) {
            copyOnWrite();
            ((SegmentInsightInfo) this.instance).removeSourceAlertInfos(i2);
            return this;
        }

        public Builder setId(Id.Builder builder) {
            copyOnWrite();
            ((SegmentInsightInfo) this.instance).setId(builder.build());
            return this;
        }

        public Builder setPositionRelativeToSegment(PositionRelativeToSegment positionRelativeToSegment) {
            copyOnWrite();
            ((SegmentInsightInfo) this.instance).setPositionRelativeToSegment(positionRelativeToSegment);
            return this;
        }

        public Builder setPositionRelativeToSegmentValue(int i2) {
            copyOnWrite();
            ((SegmentInsightInfo) this.instance).setPositionRelativeToSegmentValue(i2);
            return this;
        }

        public Builder setPriority(InsightPriority.Builder builder) {
            copyOnWrite();
            ((SegmentInsightInfo) this.instance).setPriority(builder.build());
            return this;
        }

        public Builder setRemainingDistanceMeters(int i2) {
            copyOnWrite();
            ((SegmentInsightInfo) this.instance).setRemainingDistanceMeters(i2);
            return this;
        }

        public Builder setRemainingDurationSeconds(int i2) {
            copyOnWrite();
            ((SegmentInsightInfo) this.instance).setRemainingDurationSeconds(i2);
            return this;
        }

        public Builder setSourceAlertInfos(int i2, AlertInfo.Builder builder) {
            copyOnWrite();
            ((SegmentInsightInfo) this.instance).setSourceAlertInfos(i2, builder.build());
            return this;
        }

        public Builder addSourceAlertInfos(int i2, AlertInfo alertInfo) {
            copyOnWrite();
            ((SegmentInsightInfo) this.instance).addSourceAlertInfos(i2, alertInfo);
            return this;
        }

        public Builder setId(Id id) {
            copyOnWrite();
            ((SegmentInsightInfo) this.instance).setId(id);
            return this;
        }

        public Builder setPriority(InsightPriority insightPriority) {
            copyOnWrite();
            ((SegmentInsightInfo) this.instance).setPriority(insightPriority);
            return this;
        }

        public Builder setSourceAlertInfos(int i2, AlertInfo alertInfo) {
            copyOnWrite();
            ((SegmentInsightInfo) this.instance).setSourceAlertInfos(i2, alertInfo);
            return this;
        }

        public Builder addSourceAlertInfos(AlertInfo.Builder builder) {
            copyOnWrite();
            ((SegmentInsightInfo) this.instance).addSourceAlertInfos(builder.build());
            return this;
        }

        public Builder addSourceAlertInfos(AlertInfo alertInfo) {
            copyOnWrite();
            ((SegmentInsightInfo) this.instance).addSourceAlertInfos(alertInfo);
            return this;
        }
    }

    public static SegmentInsightInfo parseFrom(byte[] bArr) {
        return (SegmentInsightInfo) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SegmentInsightInfo parseFrom(byte[] bArr, de deVar) {
        return (SegmentInsightInfo) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
