package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class no extends com.google.v.du<no, nn> implements com.google.v.fj {
    public static final int ALTERNATIVE_ROUTE_UUID_FIELD_NUMBER = 1;
    private static final no DEFAULT_INSTANCE;
    public static final int INFO_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<no> PARSER = null;
    public static final int ROUTESEGMENTINDEX_FIELD_NUMBER = 2;
    private String alternativeRouteUuid_ = "";
    private int bitField0_;
    private qz info_;
    private int routeSegmentIndex_;

    static {
        no noVar = new no();
        DEFAULT_INSTANCE = noVar;
        com.google.v.du.registerDefaultInstance(no.class, noVar);
    }

    private no() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlternativeRouteUuid() {
        this.bitField0_ &= -2;
        this.alternativeRouteUuid_ = getDefaultInstance().getAlternativeRouteUuid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInfo() {
        this.info_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteSegmentIndex() {
        this.bitField0_ &= -3;
        this.routeSegmentIndex_ = 0;
    }

    public static no getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInfo(qz qzVar) {
        Objects.requireNonNull(qzVar);
        qz qzVar2 = this.info_;
        if (qzVar2 != null && qzVar2 != qz.getDefaultInstance()) {
            qy qyVarNewBuilder = qz.newBuilder(qzVar2);
            qyVarNewBuilder.mergeFrom((qy) qzVar);
            qzVar = qyVarNewBuilder.buildPartial();
        }
        this.info_ = qzVar;
        this.bitField0_ |= 4;
    }

    public static nn newBuilder() {
        return (nn) DEFAULT_INSTANCE.createBuilder();
    }

    public static no parseDelimitedFrom(InputStream inputStream) {
        return (no) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static no parseFrom(com.google.v.v vVar) {
        return (no) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<no> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlternativeRouteUuid(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.alternativeRouteUuid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlternativeRouteUuidBytes(com.google.v.v vVar) {
        this.alternativeRouteUuid_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInfo(qz qzVar) {
        Objects.requireNonNull(qzVar);
        this.info_ = qzVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteSegmentIndex(int i2) {
        this.bitField0_ |= 2;
        this.routeSegmentIndex_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "alternativeRouteUuid_", "routeSegmentIndex_", "info_"});
        }
        if (iOrdinal == 3) {
            return new no();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new nn(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<no> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (no.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getAlternativeRouteUuid() {
        return this.alternativeRouteUuid_;
    }

    public com.google.v.v getAlternativeRouteUuidBytes() {
        return com.google.v.v.s(this.alternativeRouteUuid_);
    }

    public qz getInfo() {
        qz qzVar = this.info_;
        return qzVar == null ? qz.getDefaultInstance() : qzVar;
    }

    public int getRouteSegmentIndex() {
        return this.routeSegmentIndex_;
    }

    public boolean hasAlternativeRouteUuid() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasInfo() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasRouteSegmentIndex() {
        return (this.bitField0_ & 2) != 0;
    }

    public static nn newBuilder(no noVar) {
        return (nn) DEFAULT_INSTANCE.createBuilder(noVar);
    }

    public static no parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (no) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static no parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (no) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static no parseFrom(com.google.v.z zVar) {
        return (no) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static no parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (no) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static no parseFrom(InputStream inputStream) {
        return (no) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static no parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (no) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static no parseFrom(ByteBuffer byteBuffer) {
        return (no) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static no parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (no) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static no parseFrom(byte[] bArr) {
        return (no) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static no parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (no) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
