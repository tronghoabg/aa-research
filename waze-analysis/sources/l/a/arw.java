package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class arw extends com.google.v.du<arw, arv> implements com.google.v.fj {
    private static final arw DEFAULT_INSTANCE;
    public static final int ELIGIBLE_STOP_COUNT_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<arw> PARSER = null;
    public static final int PLACEMENT_IN_STOP_FIELD_NUMBER = 2;
    public static final int PRODUCT_TAKEOVER_INFO_FIELD_NUMBER = 1;
    private int bitField0_;
    private long eligibleStopCount_;
    private long placementInStop_;
    private ars productTakeoverInfo_;

    static {
        arw arwVar = new arw();
        DEFAULT_INSTANCE = arwVar;
        com.google.v.du.registerDefaultInstance(arw.class, arwVar);
    }

    private arw() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEligibleStopCount() {
        this.bitField0_ &= -5;
        this.eligibleStopCount_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlacementInStop() {
        this.bitField0_ &= -3;
        this.placementInStop_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProductTakeoverInfo() {
        this.productTakeoverInfo_ = null;
        this.bitField0_ &= -2;
    }

    public static arw getDefaultInstance() {
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

    public static arv newBuilder() {
        return (arv) DEFAULT_INSTANCE.createBuilder();
    }

    public static arw parseDelimitedFrom(InputStream inputStream) {
        return (arw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static arw parseFrom(com.google.v.v vVar) {
        return (arw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<arw> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEligibleStopCount(long j2) {
        this.bitField0_ |= 4;
        this.eligibleStopCount_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlacementInStop(long j2) {
        this.bitField0_ |= 2;
        this.placementInStop_ = j2;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"bitField0_", "productTakeoverInfo_", "placementInStop_", "eligibleStopCount_"});
        }
        if (iOrdinal == 3) {
            return new arw();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new arv(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<arw> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (arw.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getEligibleStopCount() {
        return this.eligibleStopCount_;
    }

    public long getPlacementInStop() {
        return this.placementInStop_;
    }

    public ars getProductTakeoverInfo() {
        ars arsVar = this.productTakeoverInfo_;
        return arsVar == null ? ars.getDefaultInstance() : arsVar;
    }

    public boolean hasEligibleStopCount() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasPlacementInStop() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasProductTakeoverInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public static arv newBuilder(arw arwVar) {
        return (arv) DEFAULT_INSTANCE.createBuilder(arwVar);
    }

    public static arw parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (arw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static arw parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (arw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static arw parseFrom(com.google.v.z zVar) {
        return (arw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static arw parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (arw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static arw parseFrom(InputStream inputStream) {
        return (arw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static arw parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (arw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static arw parseFrom(ByteBuffer byteBuffer) {
        return (arw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static arw parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (arw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static arw parseFrom(byte[] bArr) {
        return (arw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static arw parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (arw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
