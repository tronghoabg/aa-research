package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bnn extends com.google.v.du<bnn, bnl> implements com.google.v.fj {
    private static final bnn DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bnn> PARSER = null;
    public static final int SEGMENT_INFO_FIELD_NUMBER = 2;
    public static final int SEGMENT_SELECTION_METHOD_FIELD_NUMBER = 3;
    public static final int UGC_TYPE_INFO_FIELD_NUMBER = 1;
    private int bitField0_;
    private bad segmentInfo_;
    private int segmentSelectionMethod_;
    private boc ugcTypeInfo_;

    static {
        bnn bnnVar = new bnn();
        DEFAULT_INSTANCE = bnnVar;
        com.google.v.du.registerDefaultInstance(bnn.class, bnnVar);
    }

    private bnn() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSegmentInfo() {
        this.segmentInfo_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSegmentSelectionMethod() {
        this.segmentSelectionMethod_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUgcTypeInfo() {
        this.ugcTypeInfo_ = null;
        this.bitField0_ &= -2;
    }

    public static bnn getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSegmentInfo(bad badVar) {
        Objects.requireNonNull(badVar);
        bad badVar2 = this.segmentInfo_;
        if (badVar2 != null && badVar2 != bad.getDefaultInstance()) {
            bac bacVarNewBuilder = bad.newBuilder(badVar2);
            bacVarNewBuilder.mergeFrom((bac) badVar);
            badVar = bacVarNewBuilder.buildPartial();
        }
        this.segmentInfo_ = badVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUgcTypeInfo(boc bocVar) {
        Objects.requireNonNull(bocVar);
        boc bocVar2 = this.ugcTypeInfo_;
        if (bocVar2 != null && bocVar2 != boc.getDefaultInstance()) {
            bnx bnxVarNewBuilder = boc.newBuilder(bocVar2);
            bnxVarNewBuilder.mergeFrom((bnx) bocVar);
            bocVar = bnxVarNewBuilder.buildPartial();
        }
        this.ugcTypeInfo_ = bocVar;
        this.bitField0_ |= 1;
    }

    public static bnl newBuilder() {
        return (bnl) DEFAULT_INSTANCE.createBuilder();
    }

    public static bnn parseDelimitedFrom(InputStream inputStream) {
        return (bnn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bnn parseFrom(com.google.v.v vVar) {
        return (bnn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bnn> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegmentInfo(bad badVar) {
        Objects.requireNonNull(badVar);
        this.segmentInfo_ = badVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegmentSelectionMethod(bnm bnmVar) {
        this.segmentSelectionMethod_ = bnmVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegmentSelectionMethodValue(int i2) {
        this.segmentSelectionMethod_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUgcTypeInfo(boc bocVar) {
        Objects.requireNonNull(bocVar);
        this.ugcTypeInfo_ = bocVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\f", new Object[]{"bitField0_", "ugcTypeInfo_", "segmentInfo_", "segmentSelectionMethod_"});
        }
        if (iOrdinal == 3) {
            return new bnn();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bnl(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bnn> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bnn.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bad getSegmentInfo() {
        bad badVar = this.segmentInfo_;
        return badVar == null ? bad.getDefaultInstance() : badVar;
    }

    public bnm getSegmentSelectionMethod() {
        int i2 = this.segmentSelectionMethod_;
        bnm bnmVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : bnm.NEXT_SEGMENT_FALLBACK : bnm.DEVIATED_FROM_SEGMENT : bnm.NEXT_SEGMENT : bnm.SEGMENT_SELECTION_METHOD_UNSPECIFIED;
        return bnmVar == null ? bnm.UNRECOGNIZED : bnmVar;
    }

    public int getSegmentSelectionMethodValue() {
        return this.segmentSelectionMethod_;
    }

    public boc getUgcTypeInfo() {
        boc bocVar = this.ugcTypeInfo_;
        return bocVar == null ? boc.getDefaultInstance() : bocVar;
    }

    public boolean hasSegmentInfo() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasUgcTypeInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bnl newBuilder(bnn bnnVar) {
        return (bnl) DEFAULT_INSTANCE.createBuilder(bnnVar);
    }

    public static bnn parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bnn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bnn parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bnn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bnn parseFrom(com.google.v.z zVar) {
        return (bnn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bnn parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bnn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bnn parseFrom(InputStream inputStream) {
        return (bnn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bnn parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bnn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bnn parseFrom(ByteBuffer byteBuffer) {
        return (bnn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bnn parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bnn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bnn parseFrom(byte[] bArr) {
        return (bnn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bnn parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bnn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
