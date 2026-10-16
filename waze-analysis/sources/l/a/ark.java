package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ark extends com.google.v.du<ark, arj> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 2;
    private static final ark DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ark> PARSER = null;
    public static final int PRODUCT_TAKEOVER_INFO_FIELD_NUMBER = 1;
    private int action_;
    private int bitField0_;
    private ars productTakeoverInfo_;

    static {
        ark arkVar = new ark();
        DEFAULT_INSTANCE = arkVar;
        com.google.v.du.registerDefaultInstance(ark.class, arkVar);
    }

    private ark() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProductTakeoverInfo() {
        this.productTakeoverInfo_ = null;
        this.bitField0_ &= -2;
    }

    public static ark getDefaultInstance() {
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

    public static arj newBuilder() {
        return (arj) DEFAULT_INSTANCE.createBuilder();
    }

    public static ark parseDelimitedFrom(InputStream inputStream) {
        return (ark) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ark parseFrom(com.google.v.v vVar) {
        return (ark) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ark> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(ari ariVar) {
        this.action_ = ariVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProductTakeoverInfo(ars arsVar) {
        Objects.requireNonNull(arsVar);
        this.productTakeoverInfo_ = arsVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f", new Object[]{"bitField0_", "productTakeoverInfo_", "action_"});
        }
        if (iOrdinal == 3) {
            return new ark();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new arj(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ark> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ark.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ari getAction() {
        int i2 = this.action_;
        ari ariVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? null : ari.NOT_THERE : ari.LIKE : ari.COMMENT : ari.BACKGROUND_TAPPED : ari.ACTION_UNSPECIFIED;
        return ariVar == null ? ari.UNRECOGNIZED : ariVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public ars getProductTakeoverInfo() {
        ars arsVar = this.productTakeoverInfo_;
        return arsVar == null ? ars.getDefaultInstance() : arsVar;
    }

    public boolean hasProductTakeoverInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public static arj newBuilder(ark arkVar) {
        return (arj) DEFAULT_INSTANCE.createBuilder(arkVar);
    }

    public static ark parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ark) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ark parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ark) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ark parseFrom(com.google.v.z zVar) {
        return (ark) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ark parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ark) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ark parseFrom(InputStream inputStream) {
        return (ark) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ark parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ark) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ark parseFrom(ByteBuffer byteBuffer) {
        return (ark) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ark parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ark) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ark parseFrom(byte[] bArr) {
        return (ark) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ark parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ark) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
