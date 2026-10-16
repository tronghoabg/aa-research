package com.waze.jni.protos.alerters;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import com.waze.jni.protos.InsightPriority;
import com.waze.jni.protos.alerters.AlerterId;
import com.waze.jni.protos.alerters.AlerterInfo;
import com.waze.jni.protos.alerters.ZoneAlertData;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NativeAlertDescriptor extends du<NativeAlertDescriptor, Builder> implements NativeAlertDescriptorOrBuilder {
    public static final int ABORT_IMMEDIATELY_ON_REMOVAL_FIELD_NUMBER = 6;
    public static final int ALERT_ID_FIELD_NUMBER = 1;
    private static final NativeAlertDescriptor DEFAULT_INSTANCE;
    public static final int INFO_FIELD_NUMBER = 3;
    public static final int INSIGHT_PRIORITY_FIELD_NUMBER = 2;
    private static volatile fo<NativeAlertDescriptor> PARSER = null;
    public static final int TRIGGER_DISTANCE_METERS_FIELD_NUMBER = 4;
    public static final int ZONE_ALERT_DATA_FIELD_NUMBER = 5;
    private boolean abortImmediatelyOnRemoval_;
    private AlerterId alertId_;
    private int bitField0_;
    private AlerterInfo info_;
    private InsightPriority insightPriority_;
    private int triggerDistanceMeters_;
    private ZoneAlertData zoneAlertData_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.alerters.NativeAlertDescriptor$1, reason: invalid class name */
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

    static {
        NativeAlertDescriptor nativeAlertDescriptor = new NativeAlertDescriptor();
        DEFAULT_INSTANCE = nativeAlertDescriptor;
        du.registerDefaultInstance(NativeAlertDescriptor.class, nativeAlertDescriptor);
    }

    private NativeAlertDescriptor() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAbortImmediatelyOnRemoval() {
        this.abortImmediatelyOnRemoval_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlertId() {
        this.alertId_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInfo() {
        this.info_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInsightPriority() {
        this.insightPriority_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTriggerDistanceMeters() {
        this.triggerDistanceMeters_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearZoneAlertData() {
        this.zoneAlertData_ = null;
        this.bitField0_ &= -9;
    }

    public static NativeAlertDescriptor getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAlertId(AlerterId alerterId) {
        Objects.requireNonNull(alerterId);
        AlerterId alerterId2 = this.alertId_;
        if (alerterId2 != null && alerterId2 != AlerterId.getDefaultInstance()) {
            AlerterId.Builder builderNewBuilder = AlerterId.newBuilder(alerterId2);
            builderNewBuilder.mergeFrom((AlerterId.Builder) alerterId);
            alerterId = builderNewBuilder.buildPartial();
        }
        this.alertId_ = alerterId;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInfo(AlerterInfo alerterInfo) {
        Objects.requireNonNull(alerterInfo);
        AlerterInfo alerterInfo2 = this.info_;
        if (alerterInfo2 != null && alerterInfo2 != AlerterInfo.getDefaultInstance()) {
            AlerterInfo.Builder builderNewBuilder = AlerterInfo.newBuilder(alerterInfo2);
            builderNewBuilder.mergeFrom((AlerterInfo.Builder) alerterInfo);
            alerterInfo = builderNewBuilder.buildPartial();
        }
        this.info_ = alerterInfo;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInsightPriority(InsightPriority insightPriority) {
        Objects.requireNonNull(insightPriority);
        InsightPriority insightPriority2 = this.insightPriority_;
        if (insightPriority2 != null && insightPriority2 != InsightPriority.getDefaultInstance()) {
            InsightPriority.Builder builderNewBuilder = InsightPriority.newBuilder(insightPriority2);
            builderNewBuilder.mergeFrom((InsightPriority.Builder) insightPriority);
            insightPriority = builderNewBuilder.buildPartial();
        }
        this.insightPriority_ = insightPriority;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeZoneAlertData(ZoneAlertData zoneAlertData) {
        Objects.requireNonNull(zoneAlertData);
        ZoneAlertData zoneAlertData2 = this.zoneAlertData_;
        if (zoneAlertData2 != null && zoneAlertData2 != ZoneAlertData.getDefaultInstance()) {
            ZoneAlertData.Builder builderNewBuilder = ZoneAlertData.newBuilder(zoneAlertData2);
            builderNewBuilder.mergeFrom((ZoneAlertData.Builder) zoneAlertData);
            zoneAlertData = builderNewBuilder.buildPartial();
        }
        this.zoneAlertData_ = zoneAlertData;
        this.bitField0_ |= 8;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static NativeAlertDescriptor parseDelimitedFrom(InputStream inputStream) {
        return (NativeAlertDescriptor) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NativeAlertDescriptor parseFrom(v vVar) {
        return (NativeAlertDescriptor) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<NativeAlertDescriptor> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAbortImmediatelyOnRemoval(boolean z) {
        this.abortImmediatelyOnRemoval_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertId(AlerterId alerterId) {
        Objects.requireNonNull(alerterId);
        this.alertId_ = alerterId;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInfo(AlerterInfo alerterInfo) {
        Objects.requireNonNull(alerterInfo);
        this.info_ = alerterInfo;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInsightPriority(InsightPriority insightPriority) {
        Objects.requireNonNull(insightPriority);
        this.insightPriority_ = insightPriority;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTriggerDistanceMeters(int i2) {
        this.triggerDistanceMeters_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setZoneAlertData(ZoneAlertData zoneAlertData) {
        Objects.requireNonNull(zoneAlertData);
        this.zoneAlertData_ = zoneAlertData;
        this.bitField0_ |= 8;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u0004\u0005ဉ\u0003\u0006\u0007", new Object[]{"bitField0_", "alertId_", "insightPriority_", "info_", "triggerDistanceMeters_", "zoneAlertData_", "abortImmediatelyOnRemoval_"});
        }
        if (iOrdinal == 3) {
            return new NativeAlertDescriptor();
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
        fo<NativeAlertDescriptor> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (NativeAlertDescriptor.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.alerters.NativeAlertDescriptorOrBuilder
    public boolean getAbortImmediatelyOnRemoval() {
        return this.abortImmediatelyOnRemoval_;
    }

    @Override // com.waze.jni.protos.alerters.NativeAlertDescriptorOrBuilder
    public AlerterId getAlertId() {
        AlerterId alerterId = this.alertId_;
        return alerterId == null ? AlerterId.getDefaultInstance() : alerterId;
    }

    @Override // com.waze.jni.protos.alerters.NativeAlertDescriptorOrBuilder
    public AlerterInfo getInfo() {
        AlerterInfo alerterInfo = this.info_;
        return alerterInfo == null ? AlerterInfo.getDefaultInstance() : alerterInfo;
    }

    @Override // com.waze.jni.protos.alerters.NativeAlertDescriptorOrBuilder
    public InsightPriority getInsightPriority() {
        InsightPriority insightPriority = this.insightPriority_;
        return insightPriority == null ? InsightPriority.getDefaultInstance() : insightPriority;
    }

    @Override // com.waze.jni.protos.alerters.NativeAlertDescriptorOrBuilder
    public int getTriggerDistanceMeters() {
        return this.triggerDistanceMeters_;
    }

    @Override // com.waze.jni.protos.alerters.NativeAlertDescriptorOrBuilder
    public ZoneAlertData getZoneAlertData() {
        ZoneAlertData zoneAlertData = this.zoneAlertData_;
        return zoneAlertData == null ? ZoneAlertData.getDefaultInstance() : zoneAlertData;
    }

    @Override // com.waze.jni.protos.alerters.NativeAlertDescriptorOrBuilder
    public boolean hasAlertId() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.waze.jni.protos.alerters.NativeAlertDescriptorOrBuilder
    public boolean hasInfo() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.waze.jni.protos.alerters.NativeAlertDescriptorOrBuilder
    public boolean hasInsightPriority() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.waze.jni.protos.alerters.NativeAlertDescriptorOrBuilder
    public boolean hasZoneAlertData() {
        return (this.bitField0_ & 8) != 0;
    }

    public static Builder newBuilder(NativeAlertDescriptor nativeAlertDescriptor) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(nativeAlertDescriptor);
    }

    public static NativeAlertDescriptor parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (NativeAlertDescriptor) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NativeAlertDescriptor parseFrom(v vVar, de deVar) {
        return (NativeAlertDescriptor) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static NativeAlertDescriptor parseFrom(z zVar) {
        return (NativeAlertDescriptor) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static NativeAlertDescriptor parseFrom(z zVar, de deVar) {
        return (NativeAlertDescriptor) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static NativeAlertDescriptor parseFrom(InputStream inputStream) {
        return (NativeAlertDescriptor) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NativeAlertDescriptor parseFrom(InputStream inputStream, de deVar) {
        return (NativeAlertDescriptor) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NativeAlertDescriptor parseFrom(ByteBuffer byteBuffer) {
        return (NativeAlertDescriptor) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static NativeAlertDescriptor parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (NativeAlertDescriptor) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<NativeAlertDescriptor, Builder> implements NativeAlertDescriptorOrBuilder {
        private Builder() {
            super(NativeAlertDescriptor.DEFAULT_INSTANCE);
        }

        public Builder clearAbortImmediatelyOnRemoval() {
            copyOnWrite();
            ((NativeAlertDescriptor) this.instance).clearAbortImmediatelyOnRemoval();
            return this;
        }

        public Builder clearAlertId() {
            copyOnWrite();
            ((NativeAlertDescriptor) this.instance).clearAlertId();
            return this;
        }

        public Builder clearInfo() {
            copyOnWrite();
            ((NativeAlertDescriptor) this.instance).clearInfo();
            return this;
        }

        public Builder clearInsightPriority() {
            copyOnWrite();
            ((NativeAlertDescriptor) this.instance).clearInsightPriority();
            return this;
        }

        public Builder clearTriggerDistanceMeters() {
            copyOnWrite();
            ((NativeAlertDescriptor) this.instance).clearTriggerDistanceMeters();
            return this;
        }

        public Builder clearZoneAlertData() {
            copyOnWrite();
            ((NativeAlertDescriptor) this.instance).clearZoneAlertData();
            return this;
        }

        @Override // com.waze.jni.protos.alerters.NativeAlertDescriptorOrBuilder
        public boolean getAbortImmediatelyOnRemoval() {
            return ((NativeAlertDescriptor) this.instance).getAbortImmediatelyOnRemoval();
        }

        @Override // com.waze.jni.protos.alerters.NativeAlertDescriptorOrBuilder
        public AlerterId getAlertId() {
            return ((NativeAlertDescriptor) this.instance).getAlertId();
        }

        @Override // com.waze.jni.protos.alerters.NativeAlertDescriptorOrBuilder
        public AlerterInfo getInfo() {
            return ((NativeAlertDescriptor) this.instance).getInfo();
        }

        @Override // com.waze.jni.protos.alerters.NativeAlertDescriptorOrBuilder
        public InsightPriority getInsightPriority() {
            return ((NativeAlertDescriptor) this.instance).getInsightPriority();
        }

        @Override // com.waze.jni.protos.alerters.NativeAlertDescriptorOrBuilder
        public int getTriggerDistanceMeters() {
            return ((NativeAlertDescriptor) this.instance).getTriggerDistanceMeters();
        }

        @Override // com.waze.jni.protos.alerters.NativeAlertDescriptorOrBuilder
        public ZoneAlertData getZoneAlertData() {
            return ((NativeAlertDescriptor) this.instance).getZoneAlertData();
        }

        @Override // com.waze.jni.protos.alerters.NativeAlertDescriptorOrBuilder
        public boolean hasAlertId() {
            return ((NativeAlertDescriptor) this.instance).hasAlertId();
        }

        @Override // com.waze.jni.protos.alerters.NativeAlertDescriptorOrBuilder
        public boolean hasInfo() {
            return ((NativeAlertDescriptor) this.instance).hasInfo();
        }

        @Override // com.waze.jni.protos.alerters.NativeAlertDescriptorOrBuilder
        public boolean hasInsightPriority() {
            return ((NativeAlertDescriptor) this.instance).hasInsightPriority();
        }

        @Override // com.waze.jni.protos.alerters.NativeAlertDescriptorOrBuilder
        public boolean hasZoneAlertData() {
            return ((NativeAlertDescriptor) this.instance).hasZoneAlertData();
        }

        public Builder mergeAlertId(AlerterId alerterId) {
            copyOnWrite();
            ((NativeAlertDescriptor) this.instance).mergeAlertId(alerterId);
            return this;
        }

        public Builder mergeInfo(AlerterInfo alerterInfo) {
            copyOnWrite();
            ((NativeAlertDescriptor) this.instance).mergeInfo(alerterInfo);
            return this;
        }

        public Builder mergeInsightPriority(InsightPriority insightPriority) {
            copyOnWrite();
            ((NativeAlertDescriptor) this.instance).mergeInsightPriority(insightPriority);
            return this;
        }

        public Builder mergeZoneAlertData(ZoneAlertData zoneAlertData) {
            copyOnWrite();
            ((NativeAlertDescriptor) this.instance).mergeZoneAlertData(zoneAlertData);
            return this;
        }

        public Builder setAbortImmediatelyOnRemoval(boolean z) {
            copyOnWrite();
            ((NativeAlertDescriptor) this.instance).setAbortImmediatelyOnRemoval(z);
            return this;
        }

        public Builder setAlertId(AlerterId.Builder builder) {
            copyOnWrite();
            ((NativeAlertDescriptor) this.instance).setAlertId(builder.build());
            return this;
        }

        public Builder setInfo(AlerterInfo.Builder builder) {
            copyOnWrite();
            ((NativeAlertDescriptor) this.instance).setInfo(builder.build());
            return this;
        }

        public Builder setInsightPriority(InsightPriority.Builder builder) {
            copyOnWrite();
            ((NativeAlertDescriptor) this.instance).setInsightPriority(builder.build());
            return this;
        }

        public Builder setTriggerDistanceMeters(int i2) {
            copyOnWrite();
            ((NativeAlertDescriptor) this.instance).setTriggerDistanceMeters(i2);
            return this;
        }

        public Builder setZoneAlertData(ZoneAlertData.Builder builder) {
            copyOnWrite();
            ((NativeAlertDescriptor) this.instance).setZoneAlertData(builder.build());
            return this;
        }

        public Builder setAlertId(AlerterId alerterId) {
            copyOnWrite();
            ((NativeAlertDescriptor) this.instance).setAlertId(alerterId);
            return this;
        }

        public Builder setInfo(AlerterInfo alerterInfo) {
            copyOnWrite();
            ((NativeAlertDescriptor) this.instance).setInfo(alerterInfo);
            return this;
        }

        public Builder setInsightPriority(InsightPriority insightPriority) {
            copyOnWrite();
            ((NativeAlertDescriptor) this.instance).setInsightPriority(insightPriority);
            return this;
        }

        public Builder setZoneAlertData(ZoneAlertData zoneAlertData) {
            copyOnWrite();
            ((NativeAlertDescriptor) this.instance).setZoneAlertData(zoneAlertData);
            return this;
        }
    }

    public static NativeAlertDescriptor parseFrom(byte[] bArr) {
        return (NativeAlertDescriptor) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NativeAlertDescriptor parseFrom(byte[] bArr, de deVar) {
        return (NativeAlertDescriptor) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
