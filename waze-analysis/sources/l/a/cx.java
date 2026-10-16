package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class cx extends com.google.v.du<cx, cw> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 2;
    public static final int ALERTER_INFO_FIELD_NUMBER = 1;
    private static final cx DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<cx> PARSER;
    private int action_;
    private ck alerterInfo_;
    private int bitField0_;

    static {
        cx cxVar = new cx();
        DEFAULT_INSTANCE = cxVar;
        com.google.v.du.registerDefaultInstance(cx.class, cxVar);
    }

    private cx() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlerterInfo() {
        this.alerterInfo_ = null;
        this.bitField0_ &= -2;
    }

    public static cx getDefaultInstance() {
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

    public static cw newBuilder() {
        return (cw) DEFAULT_INSTANCE.createBuilder();
    }

    public static cx parseDelimitedFrom(InputStream inputStream) {
        return (cx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cx parseFrom(com.google.v.v vVar) {
        return (cx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<cx> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(cv cvVar) {
        this.action_ = cvVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlerterInfo(ck ckVar) {
        Objects.requireNonNull(ckVar);
        this.alerterInfo_ = ckVar;
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f", new Object[]{"bitField0_", "alerterInfo_", "action_"});
        }
        if (iOrdinal == 3) {
            return new cx();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new cw(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<cx> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (cx.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public cv getAction() {
        int i2 = this.action_;
        cv cvVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : cv.OPEN_SETTINGS : cv.DENIAL : cv.COLLAPSE : cv.ACTION_UNSPECIFIED;
        return cvVar == null ? cv.UNRECOGNIZED : cvVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public ck getAlerterInfo() {
        ck ckVar = this.alerterInfo_;
        return ckVar == null ? ck.getDefaultInstance() : ckVar;
    }

    public boolean hasAlerterInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public static cw newBuilder(cx cxVar) {
        return (cw) DEFAULT_INSTANCE.createBuilder(cxVar);
    }

    public static cx parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cx parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (cx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cx parseFrom(com.google.v.z zVar) {
        return (cx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cx parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (cx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static cx parseFrom(InputStream inputStream) {
        return (cx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cx parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cx parseFrom(ByteBuffer byteBuffer) {
        return (cx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cx parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (cx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cx parseFrom(byte[] bArr) {
        return (cx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cx parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (cx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
