package com.waze.jni.protos;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class RtAlertsThumbsUpDataProto extends du<RtAlertsThumbsUpDataProto, Builder> implements RtAlertsThumbsUpDataProtoOrBuilder {
    public static final int ALERT_ID_FIELD_NUMBER = 1;
    private static final RtAlertsThumbsUpDataProto DEFAULT_INSTANCE;
    public static final int FROM_FIELD_NUMBER = 3;
    public static final int ICON_NAME_FIELD_NUMBER = 2;
    public static final int MOOD_FIELD_NUMBER = 6;
    public static final int ORIGINAL_ALERT_DESCRIPTION_FIELD_NUMBER = 4;
    private static volatile fo<RtAlertsThumbsUpDataProto> PARSER = null;
    public static final int REPORTED_ELAPSED_TIME_FIELD_NUMBER = 5;
    private int alertId_;
    private int bitField0_;
    private int reportedElapsedTime_;
    private String iconName_ = "";
    private String from_ = "";
    private String originalAlertDescription_ = "";
    private String mood_ = "";

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.RtAlertsThumbsUpDataProto$1, reason: invalid class name */
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
    public final class Builder extends dm<RtAlertsThumbsUpDataProto, Builder> implements RtAlertsThumbsUpDataProtoOrBuilder {
        private Builder() {
            super(RtAlertsThumbsUpDataProto.DEFAULT_INSTANCE);
        }

        public Builder clearAlertId() {
            copyOnWrite();
            ((RtAlertsThumbsUpDataProto) this.instance).clearAlertId();
            return this;
        }

        public Builder clearFrom() {
            copyOnWrite();
            ((RtAlertsThumbsUpDataProto) this.instance).clearFrom();
            return this;
        }

        public Builder clearIconName() {
            copyOnWrite();
            ((RtAlertsThumbsUpDataProto) this.instance).clearIconName();
            return this;
        }

        public Builder clearMood() {
            copyOnWrite();
            ((RtAlertsThumbsUpDataProto) this.instance).clearMood();
            return this;
        }

        public Builder clearOriginalAlertDescription() {
            copyOnWrite();
            ((RtAlertsThumbsUpDataProto) this.instance).clearOriginalAlertDescription();
            return this;
        }

        public Builder clearReportedElapsedTime() {
            copyOnWrite();
            ((RtAlertsThumbsUpDataProto) this.instance).clearReportedElapsedTime();
            return this;
        }

        @Override // com.waze.jni.protos.RtAlertsThumbsUpDataProtoOrBuilder
        public int getAlertId() {
            return ((RtAlertsThumbsUpDataProto) this.instance).getAlertId();
        }

        @Override // com.waze.jni.protos.RtAlertsThumbsUpDataProtoOrBuilder
        public String getFrom() {
            return ((RtAlertsThumbsUpDataProto) this.instance).getFrom();
        }

        @Override // com.waze.jni.protos.RtAlertsThumbsUpDataProtoOrBuilder
        public v getFromBytes() {
            return ((RtAlertsThumbsUpDataProto) this.instance).getFromBytes();
        }

        @Override // com.waze.jni.protos.RtAlertsThumbsUpDataProtoOrBuilder
        public String getIconName() {
            return ((RtAlertsThumbsUpDataProto) this.instance).getIconName();
        }

        @Override // com.waze.jni.protos.RtAlertsThumbsUpDataProtoOrBuilder
        public v getIconNameBytes() {
            return ((RtAlertsThumbsUpDataProto) this.instance).getIconNameBytes();
        }

        @Override // com.waze.jni.protos.RtAlertsThumbsUpDataProtoOrBuilder
        public String getMood() {
            return ((RtAlertsThumbsUpDataProto) this.instance).getMood();
        }

        @Override // com.waze.jni.protos.RtAlertsThumbsUpDataProtoOrBuilder
        public v getMoodBytes() {
            return ((RtAlertsThumbsUpDataProto) this.instance).getMoodBytes();
        }

        @Override // com.waze.jni.protos.RtAlertsThumbsUpDataProtoOrBuilder
        public String getOriginalAlertDescription() {
            return ((RtAlertsThumbsUpDataProto) this.instance).getOriginalAlertDescription();
        }

        @Override // com.waze.jni.protos.RtAlertsThumbsUpDataProtoOrBuilder
        public v getOriginalAlertDescriptionBytes() {
            return ((RtAlertsThumbsUpDataProto) this.instance).getOriginalAlertDescriptionBytes();
        }

        @Override // com.waze.jni.protos.RtAlertsThumbsUpDataProtoOrBuilder
        public int getReportedElapsedTime() {
            return ((RtAlertsThumbsUpDataProto) this.instance).getReportedElapsedTime();
        }

        @Override // com.waze.jni.protos.RtAlertsThumbsUpDataProtoOrBuilder
        public boolean hasAlertId() {
            return ((RtAlertsThumbsUpDataProto) this.instance).hasAlertId();
        }

        @Override // com.waze.jni.protos.RtAlertsThumbsUpDataProtoOrBuilder
        public boolean hasFrom() {
            return ((RtAlertsThumbsUpDataProto) this.instance).hasFrom();
        }

        @Override // com.waze.jni.protos.RtAlertsThumbsUpDataProtoOrBuilder
        public boolean hasIconName() {
            return ((RtAlertsThumbsUpDataProto) this.instance).hasIconName();
        }

        @Override // com.waze.jni.protos.RtAlertsThumbsUpDataProtoOrBuilder
        public boolean hasMood() {
            return ((RtAlertsThumbsUpDataProto) this.instance).hasMood();
        }

        @Override // com.waze.jni.protos.RtAlertsThumbsUpDataProtoOrBuilder
        public boolean hasOriginalAlertDescription() {
            return ((RtAlertsThumbsUpDataProto) this.instance).hasOriginalAlertDescription();
        }

        @Override // com.waze.jni.protos.RtAlertsThumbsUpDataProtoOrBuilder
        public boolean hasReportedElapsedTime() {
            return ((RtAlertsThumbsUpDataProto) this.instance).hasReportedElapsedTime();
        }

        public Builder setAlertId(int i2) {
            copyOnWrite();
            ((RtAlertsThumbsUpDataProto) this.instance).setAlertId(i2);
            return this;
        }

        public Builder setFrom(String str) {
            copyOnWrite();
            ((RtAlertsThumbsUpDataProto) this.instance).setFrom(str);
            return this;
        }

        public Builder setFromBytes(v vVar) {
            copyOnWrite();
            ((RtAlertsThumbsUpDataProto) this.instance).setFromBytes(vVar);
            return this;
        }

        public Builder setIconName(String str) {
            copyOnWrite();
            ((RtAlertsThumbsUpDataProto) this.instance).setIconName(str);
            return this;
        }

        public Builder setIconNameBytes(v vVar) {
            copyOnWrite();
            ((RtAlertsThumbsUpDataProto) this.instance).setIconNameBytes(vVar);
            return this;
        }

        public Builder setMood(String str) {
            copyOnWrite();
            ((RtAlertsThumbsUpDataProto) this.instance).setMood(str);
            return this;
        }

        public Builder setMoodBytes(v vVar) {
            copyOnWrite();
            ((RtAlertsThumbsUpDataProto) this.instance).setMoodBytes(vVar);
            return this;
        }

        public Builder setOriginalAlertDescription(String str) {
            copyOnWrite();
            ((RtAlertsThumbsUpDataProto) this.instance).setOriginalAlertDescription(str);
            return this;
        }

        public Builder setOriginalAlertDescriptionBytes(v vVar) {
            copyOnWrite();
            ((RtAlertsThumbsUpDataProto) this.instance).setOriginalAlertDescriptionBytes(vVar);
            return this;
        }

        public Builder setReportedElapsedTime(int i2) {
            copyOnWrite();
            ((RtAlertsThumbsUpDataProto) this.instance).setReportedElapsedTime(i2);
            return this;
        }
    }

    static {
        RtAlertsThumbsUpDataProto rtAlertsThumbsUpDataProto = new RtAlertsThumbsUpDataProto();
        DEFAULT_INSTANCE = rtAlertsThumbsUpDataProto;
        du.registerDefaultInstance(RtAlertsThumbsUpDataProto.class, rtAlertsThumbsUpDataProto);
    }

    private RtAlertsThumbsUpDataProto() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlertId() {
        this.bitField0_ &= -2;
        this.alertId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFrom() {
        this.bitField0_ &= -5;
        this.from_ = getDefaultInstance().getFrom();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIconName() {
        this.bitField0_ &= -3;
        this.iconName_ = getDefaultInstance().getIconName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMood() {
        this.bitField0_ &= -33;
        this.mood_ = getDefaultInstance().getMood();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOriginalAlertDescription() {
        this.bitField0_ &= -9;
        this.originalAlertDescription_ = getDefaultInstance().getOriginalAlertDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReportedElapsedTime() {
        this.bitField0_ &= -17;
        this.reportedElapsedTime_ = 0;
    }

    public static RtAlertsThumbsUpDataProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static RtAlertsThumbsUpDataProto parseDelimitedFrom(InputStream inputStream) {
        return (RtAlertsThumbsUpDataProto) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RtAlertsThumbsUpDataProto parseFrom(v vVar) {
        return (RtAlertsThumbsUpDataProto) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<RtAlertsThumbsUpDataProto> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertId(int i2) {
        this.bitField0_ |= 1;
        this.alertId_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFrom(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.from_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.from_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.iconName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconNameBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.iconName_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMood(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.mood_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMoodBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.mood_ = vVar.u();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOriginalAlertDescription(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.originalAlertDescription_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOriginalAlertDescriptionBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.originalAlertDescription_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportedElapsedTime(int i2) {
        this.bitField0_ |= 16;
        this.reportedElapsedTime_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005င\u0004\u0006ለ\u0005", new Object[]{"bitField0_", "alertId_", "iconName_", "from_", "originalAlertDescription_", "reportedElapsedTime_", "mood_"});
        }
        if (iOrdinal == 3) {
            return new RtAlertsThumbsUpDataProto();
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
        fo<RtAlertsThumbsUpDataProto> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (RtAlertsThumbsUpDataProto.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.RtAlertsThumbsUpDataProtoOrBuilder
    public int getAlertId() {
        return this.alertId_;
    }

    @Override // com.waze.jni.protos.RtAlertsThumbsUpDataProtoOrBuilder
    public String getFrom() {
        return this.from_;
    }

    @Override // com.waze.jni.protos.RtAlertsThumbsUpDataProtoOrBuilder
    public v getFromBytes() {
        return v.s(this.from_);
    }

    @Override // com.waze.jni.protos.RtAlertsThumbsUpDataProtoOrBuilder
    public String getIconName() {
        return this.iconName_;
    }

    @Override // com.waze.jni.protos.RtAlertsThumbsUpDataProtoOrBuilder
    public v getIconNameBytes() {
        return v.s(this.iconName_);
    }

    @Override // com.waze.jni.protos.RtAlertsThumbsUpDataProtoOrBuilder
    public String getMood() {
        return this.mood_;
    }

    @Override // com.waze.jni.protos.RtAlertsThumbsUpDataProtoOrBuilder
    public v getMoodBytes() {
        return v.s(this.mood_);
    }

    @Override // com.waze.jni.protos.RtAlertsThumbsUpDataProtoOrBuilder
    public String getOriginalAlertDescription() {
        return this.originalAlertDescription_;
    }

    @Override // com.waze.jni.protos.RtAlertsThumbsUpDataProtoOrBuilder
    public v getOriginalAlertDescriptionBytes() {
        return v.s(this.originalAlertDescription_);
    }

    @Override // com.waze.jni.protos.RtAlertsThumbsUpDataProtoOrBuilder
    public int getReportedElapsedTime() {
        return this.reportedElapsedTime_;
    }

    @Override // com.waze.jni.protos.RtAlertsThumbsUpDataProtoOrBuilder
    public boolean hasAlertId() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.waze.jni.protos.RtAlertsThumbsUpDataProtoOrBuilder
    public boolean hasFrom() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.waze.jni.protos.RtAlertsThumbsUpDataProtoOrBuilder
    public boolean hasIconName() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.waze.jni.protos.RtAlertsThumbsUpDataProtoOrBuilder
    public boolean hasMood() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.waze.jni.protos.RtAlertsThumbsUpDataProtoOrBuilder
    public boolean hasOriginalAlertDescription() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.waze.jni.protos.RtAlertsThumbsUpDataProtoOrBuilder
    public boolean hasReportedElapsedTime() {
        return (this.bitField0_ & 16) != 0;
    }

    public static Builder newBuilder(RtAlertsThumbsUpDataProto rtAlertsThumbsUpDataProto) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(rtAlertsThumbsUpDataProto);
    }

    public static RtAlertsThumbsUpDataProto parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (RtAlertsThumbsUpDataProto) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static RtAlertsThumbsUpDataProto parseFrom(v vVar, de deVar) {
        return (RtAlertsThumbsUpDataProto) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static RtAlertsThumbsUpDataProto parseFrom(z zVar) {
        return (RtAlertsThumbsUpDataProto) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static RtAlertsThumbsUpDataProto parseFrom(z zVar, de deVar) {
        return (RtAlertsThumbsUpDataProto) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static RtAlertsThumbsUpDataProto parseFrom(InputStream inputStream) {
        return (RtAlertsThumbsUpDataProto) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RtAlertsThumbsUpDataProto parseFrom(InputStream inputStream, de deVar) {
        return (RtAlertsThumbsUpDataProto) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static RtAlertsThumbsUpDataProto parseFrom(ByteBuffer byteBuffer) {
        return (RtAlertsThumbsUpDataProto) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static RtAlertsThumbsUpDataProto parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (RtAlertsThumbsUpDataProto) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static RtAlertsThumbsUpDataProto parseFrom(byte[] bArr) {
        return (RtAlertsThumbsUpDataProto) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RtAlertsThumbsUpDataProto parseFrom(byte[] bArr, de deVar) {
        return (RtAlertsThumbsUpDataProto) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
