package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class arp extends com.google.v.du<arp, aro> implements com.google.v.fj {
    private static final arp DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<arp> PARSER = null;
    public static final int PRODUCT_TAKEOVER_INFO_FIELD_NUMBER = 1;
    public static final int SHOWN_DURATION_MS_FIELD_NUMBER = 2;
    private int bitField0_;
    private ars productTakeoverInfo_;
    private long shownDurationMs_;

    static {
        arp arpVar = new arp();
        DEFAULT_INSTANCE = arpVar;
        com.google.v.du.registerDefaultInstance(arp.class, arpVar);
    }

    private arp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProductTakeoverInfo() {
        this.productTakeoverInfo_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShownDurationMs() {
        this.bitField0_ &= -3;
        this.shownDurationMs_ = 0L;
    }

    public static arp getDefaultInstance() {
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

    public static aro newBuilder() {
        return (aro) DEFAULT_INSTANCE.createBuilder();
    }

    public static arp parseDelimitedFrom(InputStream inputStream) {
        return (arp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static arp parseFrom(com.google.v.v vVar) {
        return (arp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<arp> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProductTakeoverInfo(ars arsVar) {
        Objects.requireNonNull(arsVar);
        this.productTakeoverInfo_ = arsVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShownDurationMs(long j2) {
        this.bitField0_ |= 2;
        this.shownDurationMs_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"bitField0_", "productTakeoverInfo_", "shownDurationMs_"});
        }
        if (iOrdinal == 3) {
            return new arp();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aro(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<arp> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (arp.class) {
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

    public long getShownDurationMs() {
        return this.shownDurationMs_;
    }

    public boolean hasProductTakeoverInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasShownDurationMs() {
        return (this.bitField0_ & 2) != 0;
    }

    public static aro newBuilder(arp arpVar) {
        return (aro) DEFAULT_INSTANCE.createBuilder(arpVar);
    }

    public static arp parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (arp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static arp parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (arp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static arp parseFrom(com.google.v.z zVar) {
        return (arp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static arp parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (arp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static arp parseFrom(InputStream inputStream) {
        return (arp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static arp parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (arp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static arp parseFrom(ByteBuffer byteBuffer) {
        return (arp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static arp parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (arp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static arp parseFrom(byte[] bArr) {
        return (arp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static arp parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (arp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
