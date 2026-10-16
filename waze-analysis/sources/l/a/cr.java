package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class cr extends com.google.v.du<cr, cp> implements com.google.v.fj {
    public static final int ALERTER_INFO_FIELD_NUMBER = 1;
    private static final cr DEFAULT_INSTANCE;
    public static final int EXISTING_ALERTER_INFO_FIELD_NUMBER = 5;
    public static final int EXISTING_ALERT_ID_FIELD_NUMBER = 2;
    public static final int JAM_LEVEL_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<cr> PARSER = null;
    public static final int REASON_FIELD_NUMBER = 4;
    private ck alerterInfo_;
    private int bitField0_;
    private long existingAlertId_;
    private ck existingAlerterInfo_;
    private long jamLevel_;
    private int reason_;

    static {
        cr crVar = new cr();
        DEFAULT_INSTANCE = crVar;
        com.google.v.du.registerDefaultInstance(cr.class, crVar);
    }

    private cr() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlerterInfo() {
        this.alerterInfo_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExistingAlertId() {
        this.bitField0_ &= -3;
        this.existingAlertId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExistingAlerterInfo() {
        this.existingAlerterInfo_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJamLevel() {
        this.bitField0_ &= -5;
        this.jamLevel_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReason() {
        this.reason_ = 0;
    }

    public static cr getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAlerterInfo(ck ckVar) {
        Objects.requireNonNull(ckVar);
        ck ckVar2 = this.alerterInfo_;
        if (ckVar2 != null && ckVar2 != ck.getDefaultInstance()) {
            cj cjVarNewBuilder = ck.newBuilder(ckVar2);
            cjVarNewBuilder.mergeFrom((cj) ckVar);
            ckVar = cjVarNewBuilder.buildPartial();
        }
        this.alerterInfo_ = ckVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeExistingAlerterInfo(ck ckVar) {
        Objects.requireNonNull(ckVar);
        ck ckVar2 = this.existingAlerterInfo_;
        if (ckVar2 != null && ckVar2 != ck.getDefaultInstance()) {
            cj cjVarNewBuilder = ck.newBuilder(ckVar2);
            cjVarNewBuilder.mergeFrom((cj) ckVar);
            ckVar = cjVarNewBuilder.buildPartial();
        }
        this.existingAlerterInfo_ = ckVar;
        this.bitField0_ |= 8;
    }

    public static cp newBuilder() {
        return (cp) DEFAULT_INSTANCE.createBuilder();
    }

    public static cr parseDelimitedFrom(InputStream inputStream) {
        return (cr) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cr parseFrom(com.google.v.v vVar) {
        return (cr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<cr> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlerterInfo(ck ckVar) {
        Objects.requireNonNull(ckVar);
        this.alerterInfo_ = ckVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExistingAlertId(long j2) {
        this.bitField0_ |= 2;
        this.existingAlertId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExistingAlerterInfo(ck ckVar) {
        Objects.requireNonNull(ckVar);
        this.existingAlerterInfo_ = ckVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJamLevel(long j2) {
        this.bitField0_ |= 4;
        this.jamLevel_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReason(cq cqVar) {
        this.reason_ = cqVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReasonValue(int i2) {
        this.reason_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004\f\u0005ဉ\u0003", new Object[]{"bitField0_", "alerterInfo_", "existingAlertId_", "jamLevel_", "reason_", "existingAlerterInfo_"});
        }
        if (iOrdinal == 3) {
            return new cr();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new cp(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<cr> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (cr.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ck getAlerterInfo() {
        ck ckVar = this.alerterInfo_;
        return ckVar == null ? ck.getDefaultInstance() : ckVar;
    }

    @Deprecated
    public long getExistingAlertId() {
        return this.existingAlertId_;
    }

    public ck getExistingAlerterInfo() {
        ck ckVar = this.existingAlerterInfo_;
        return ckVar == null ? ck.getDefaultInstance() : ckVar;
    }

    public long getJamLevel() {
        return this.jamLevel_;
    }

    public cq getReason() {
        int i2 = this.reason_;
        cq cqVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : cq.BELOW_SPEED_LIMIT : cq.JAM : cq.COLLISION : cq.REASON_UNSPECIFIED;
        return cqVar == null ? cq.UNRECOGNIZED : cqVar;
    }

    public int getReasonValue() {
        return this.reason_;
    }

    public boolean hasAlerterInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    @Deprecated
    public boolean hasExistingAlertId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasExistingAlerterInfo() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasJamLevel() {
        return (this.bitField0_ & 4) != 0;
    }

    public static cp newBuilder(cr crVar) {
        return (cp) DEFAULT_INSTANCE.createBuilder(crVar);
    }

    public static cr parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cr) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cr parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (cr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cr parseFrom(com.google.v.z zVar) {
        return (cr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cr parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (cr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static cr parseFrom(InputStream inputStream) {
        return (cr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cr parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cr parseFrom(ByteBuffer byteBuffer) {
        return (cr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cr parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (cr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cr parseFrom(byte[] bArr) {
        return (cr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cr parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (cr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
