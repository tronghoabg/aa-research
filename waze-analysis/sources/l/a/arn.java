package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class arn extends com.google.v.du<arn, arl> implements com.google.v.fj {
    private static final arn DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<arn> PARSER = null;
    public static final int PRODUCT_TAKEOVER_INFO_FIELD_NUMBER = 1;
    public static final int REASON_FIELD_NUMBER = 2;
    private int bitField0_;
    private ars productTakeoverInfo_;
    private int reason_;

    static {
        arn arnVar = new arn();
        DEFAULT_INSTANCE = arnVar;
        com.google.v.du.registerDefaultInstance(arn.class, arnVar);
    }

    private arn() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProductTakeoverInfo() {
        this.productTakeoverInfo_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReason() {
        this.reason_ = 0;
    }

    public static arn getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeProductTakeoverInfo(ars arsVar) {
        Objects.requireNonNull(arsVar);
        ars arsVar2 = this.productTakeoverInfo_;
        if (arsVar2 != null && arsVar2 != ars.getDefaultInstance()) {
            arq arqVarNewBuilder = ars.newBuilder(arsVar2);
            arqVarNewBuilder.mergeFrom((arq) arsVar);
            arsVar = arqVarNewBuilder.buildPartial();
        }
        this.productTakeoverInfo_ = arsVar;
        this.bitField0_ |= 1;
    }

    public static arl newBuilder() {
        return (arl) DEFAULT_INSTANCE.createBuilder();
    }

    public static arn parseDelimitedFrom(InputStream inputStream) {
        return (arn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static arn parseFrom(com.google.v.v vVar) {
        return (arn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<arn> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProductTakeoverInfo(ars arsVar) {
        Objects.requireNonNull(arsVar);
        this.productTakeoverInfo_ = arsVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReason(arm armVar) {
        this.reason_ = armVar.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f", new Object[]{"bitField0_", "productTakeoverInfo_", "reason_"});
        }
        if (iOrdinal == 3) {
            return new arn();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new arl(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<arn> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (arn.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ars getProductTakeoverInfo() {
        ars arsVar = this.productTakeoverInfo_;
        return arsVar == null ? ars.getDefaultInstance() : arsVar;
    }

    public arm getReason() {
        int i2 = this.reason_;
        arm armVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? null : arm.USER_STARTED_DRIVING : arm.TIMEOUT : arm.CLOSED_BY_USER : arm.PTO_ACTION_CLICKED : arm.REASON_UNSPECIFIED;
        return armVar == null ? arm.UNRECOGNIZED : armVar;
    }

    public int getReasonValue() {
        return this.reason_;
    }

    public boolean hasProductTakeoverInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public static arl newBuilder(arn arnVar) {
        return (arl) DEFAULT_INSTANCE.createBuilder(arnVar);
    }

    public static arn parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (arn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static arn parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (arn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static arn parseFrom(com.google.v.z zVar) {
        return (arn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static arn parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (arn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static arn parseFrom(InputStream inputStream) {
        return (arn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static arn parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (arn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static arn parseFrom(ByteBuffer byteBuffer) {
        return (arn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static arn parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (arn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static arn parseFrom(byte[] bArr) {
        return (arn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static arn parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (arn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
