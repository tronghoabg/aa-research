package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bnt extends com.google.v.du<bnt, bns> implements com.google.v.fj {
    private static final bnt DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bnt> PARSER = null;
    public static final int UGC_TYPE_INFO_FIELD_NUMBER = 1;
    private int bitField0_;
    private boc ugcTypeInfo_;

    static {
        bnt bntVar = new bnt();
        DEFAULT_INSTANCE = bntVar;
        com.google.v.du.registerDefaultInstance(bnt.class, bntVar);
    }

    private bnt() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUgcTypeInfo() {
        this.ugcTypeInfo_ = null;
        this.bitField0_ &= -2;
    }

    public static bnt getDefaultInstance() {
        return DEFAULT_INSTANCE;
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

    public static bns newBuilder() {
        return (bns) DEFAULT_INSTANCE.createBuilder();
    }

    public static bnt parseDelimitedFrom(InputStream inputStream) {
        return (bnt) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bnt parseFrom(com.google.v.v vVar) {
        return (bnt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bnt> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "ugcTypeInfo_"});
        }
        if (iOrdinal == 3) {
            return new bnt();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bns(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bnt> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bnt.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boc getUgcTypeInfo() {
        boc bocVar = this.ugcTypeInfo_;
        return bocVar == null ? boc.getDefaultInstance() : bocVar;
    }

    public boolean hasUgcTypeInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bns newBuilder(bnt bntVar) {
        return (bns) DEFAULT_INSTANCE.createBuilder(bntVar);
    }

    public static bnt parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bnt) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bnt parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bnt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bnt parseFrom(com.google.v.z zVar) {
        return (bnt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bnt parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bnt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bnt parseFrom(InputStream inputStream) {
        return (bnt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bnt parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bnt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bnt parseFrom(ByteBuffer byteBuffer) {
        return (bnt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bnt parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bnt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bnt parseFrom(byte[] bArr) {
        return (bnt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bnt parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bnt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
