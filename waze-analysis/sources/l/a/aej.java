package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aej extends com.google.v.du<aej, aeg> implements com.google.v.fj {
    public static final int ABOVE_SPEED_LIMIT_FIELD_NUMBER = 5;
    private static final aej DEFAULT_INSTANCE;
    public static final int INSIGHT_MESSAGE_ID_FIELD_NUMBER = 2;
    public static final int INSIGHT_MESSAGE_TYPE_FIELD_NUMBER = 1;
    public static final int IS_TIMEOUT_MESSAGE_FIELD_NUMBER = 4;
    public static final int NON_LOCATION_BASED_MESSAGE_INFO_FIELD_NUMBER = 8;
    private static volatile com.google.v.fo<aej> PARSER = null;
    public static final int PERMANENT_LOCATION_BASED_INSIGHT_INFO_FIELD_NUMBER = 7;
    public static final int PRIMARY_FIELD_NUMBER = 3;
    public static final int REAL_TIME_LOCATION_BASED_INSIGHT_INFO_FIELD_NUMBER = 6;
    private boolean aboveSpeedLimit_;
    private int bitField0_;
    private Object insightInfo_;
    private int insightMessageType_;
    private boolean isTimeoutMessage_;
    private boolean primary_;
    private int insightInfoCase_ = 0;
    private String insightMessageId_ = "";

    static {
        aej aejVar = new aej();
        DEFAULT_INSTANCE = aejVar;
        com.google.v.du.registerDefaultInstance(aej.class, aejVar);
    }

    private aej() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAboveSpeedLimit() {
        this.bitField0_ &= -9;
        this.aboveSpeedLimit_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInsightInfo() {
        this.insightInfoCase_ = 0;
        this.insightInfo_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInsightMessageId() {
        this.bitField0_ &= -2;
        this.insightMessageId_ = getDefaultInstance().getInsightMessageId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInsightMessageType() {
        this.insightMessageType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsTimeoutMessage() {
        this.bitField0_ &= -5;
        this.isTimeoutMessage_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNonLocationBasedMessageInfo() {
        if (this.insightInfoCase_ == 8) {
            this.insightInfoCase_ = 0;
            this.insightInfo_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPermanentLocationBasedInsightInfo() {
        if (this.insightInfoCase_ == 7) {
            this.insightInfoCase_ = 0;
            this.insightInfo_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrimary() {
        this.bitField0_ &= -3;
        this.primary_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRealTimeLocationBasedInsightInfo() {
        if (this.insightInfoCase_ == 6) {
            this.insightInfoCase_ = 0;
            this.insightInfo_ = null;
        }
    }

    public static aej getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNonLocationBasedMessageInfo(anw anwVar) {
        Objects.requireNonNull(anwVar);
        if (this.insightInfoCase_ == 8 && this.insightInfo_ != anw.getDefaultInstance()) {
            ant antVarNewBuilder = anw.newBuilder((anw) this.insightInfo_);
            antVarNewBuilder.mergeFrom((ant) anwVar);
            anwVar = antVarNewBuilder.buildPartial();
        }
        this.insightInfo_ = anwVar;
        this.insightInfoCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePermanentLocationBasedInsightInfo(aqd aqdVar) {
        Objects.requireNonNull(aqdVar);
        if (this.insightInfoCase_ == 7 && this.insightInfo_ != aqd.getDefaultInstance()) {
            aqa aqaVarNewBuilder = aqd.newBuilder((aqd) this.insightInfo_);
            aqaVarNewBuilder.mergeFrom((aqa) aqdVar);
            aqdVar = aqaVarNewBuilder.buildPartial();
        }
        this.insightInfo_ = aqdVar;
        this.insightInfoCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRealTimeLocationBasedInsightInfo(att attVar) {
        Objects.requireNonNull(attVar);
        if (this.insightInfoCase_ == 6 && this.insightInfo_ != att.getDefaultInstance()) {
            atq atqVarNewBuilder = att.newBuilder((att) this.insightInfo_);
            atqVarNewBuilder.mergeFrom((atq) attVar);
            attVar = atqVarNewBuilder.buildPartial();
        }
        this.insightInfo_ = attVar;
        this.insightInfoCase_ = 6;
    }

    public static aeg newBuilder() {
        return (aeg) DEFAULT_INSTANCE.createBuilder();
    }

    public static aej parseDelimitedFrom(InputStream inputStream) {
        return (aej) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aej parseFrom(com.google.v.v vVar) {
        return (aej) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aej> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAboveSpeedLimit(boolean z) {
        this.bitField0_ |= 8;
        this.aboveSpeedLimit_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInsightMessageId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.insightMessageId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInsightMessageIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.insightMessageId_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInsightMessageType(aei aeiVar) {
        this.insightMessageType_ = aeiVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInsightMessageTypeValue(int i2) {
        this.insightMessageType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsTimeoutMessage(boolean z) {
        this.bitField0_ |= 4;
        this.isTimeoutMessage_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNonLocationBasedMessageInfo(anw anwVar) {
        Objects.requireNonNull(anwVar);
        this.insightInfo_ = anwVar;
        this.insightInfoCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPermanentLocationBasedInsightInfo(aqd aqdVar) {
        Objects.requireNonNull(aqdVar);
        this.insightInfo_ = aqdVar;
        this.insightInfoCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrimary(boolean z) {
        this.bitField0_ |= 2;
        this.primary_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRealTimeLocationBasedInsightInfo(att attVar) {
        Objects.requireNonNull(attVar);
        this.insightInfo_ = attVar;
        this.insightInfoCase_ = 6;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001\f\u0002ለ\u0000\u0003ဇ\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006<\u0000\u0007<\u0000\b<\u0000", new Object[]{"insightInfo_", "insightInfoCase_", "bitField0_", "insightMessageType_", "insightMessageId_", "primary_", "isTimeoutMessage_", "aboveSpeedLimit_", att.class, aqd.class, anw.class});
        }
        if (iOrdinal == 3) {
            return new aej();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aeg(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aej> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aej.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getAboveSpeedLimit() {
        return this.aboveSpeedLimit_;
    }

    public aeh getInsightInfoCase() {
        int i2 = this.insightInfoCase_;
        if (i2 == 0) {
            return aeh.f52349d;
        }
        if (i2 == 6) {
            return aeh.f52346a;
        }
        if (i2 == 7) {
            return aeh.f52347b;
        }
        if (i2 != 8) {
            return null;
        }
        return aeh.f52348c;
    }

    public String getInsightMessageId() {
        return this.insightMessageId_;
    }

    public com.google.v.v getInsightMessageIdBytes() {
        return com.google.v.v.s(this.insightMessageId_);
    }

    public aei getInsightMessageType() {
        int i2 = this.insightMessageType_;
        aei aeiVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : aei.NON_LOCATION_BASED_MESSAGE : aei.PERMANENT_LOCATION_BASED_INSIGHT : aei.REAL_TIME_LOCATION_BASED_INSIGHT : aei.INSIGHT_MESSAGE_TYPE_UNSPECIFIED;
        return aeiVar == null ? aei.UNRECOGNIZED : aeiVar;
    }

    public int getInsightMessageTypeValue() {
        return this.insightMessageType_;
    }

    public boolean getIsTimeoutMessage() {
        return this.isTimeoutMessage_;
    }

    public anw getNonLocationBasedMessageInfo() {
        return this.insightInfoCase_ == 8 ? (anw) this.insightInfo_ : anw.getDefaultInstance();
    }

    public aqd getPermanentLocationBasedInsightInfo() {
        return this.insightInfoCase_ == 7 ? (aqd) this.insightInfo_ : aqd.getDefaultInstance();
    }

    public boolean getPrimary() {
        return this.primary_;
    }

    public att getRealTimeLocationBasedInsightInfo() {
        return this.insightInfoCase_ == 6 ? (att) this.insightInfo_ : att.getDefaultInstance();
    }

    public boolean hasAboveSpeedLimit() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasInsightMessageId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasIsTimeoutMessage() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasNonLocationBasedMessageInfo() {
        return this.insightInfoCase_ == 8;
    }

    public boolean hasPermanentLocationBasedInsightInfo() {
        return this.insightInfoCase_ == 7;
    }

    public boolean hasPrimary() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasRealTimeLocationBasedInsightInfo() {
        return this.insightInfoCase_ == 6;
    }

    public static aeg newBuilder(aej aejVar) {
        return (aeg) DEFAULT_INSTANCE.createBuilder(aejVar);
    }

    public static aej parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aej) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aej parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aej) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aej parseFrom(com.google.v.z zVar) {
        return (aej) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aej parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aej) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aej parseFrom(InputStream inputStream) {
        return (aej) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aej parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aej) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aej parseFrom(ByteBuffer byteBuffer) {
        return (aej) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aej parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aej) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aej parseFrom(byte[] bArr) {
        return (aej) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aej parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aej) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
