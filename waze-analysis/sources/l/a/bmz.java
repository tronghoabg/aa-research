package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bmz extends com.google.v.du<bmz, bmy> implements com.google.v.fj {
    private static final bmz DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bmz> PARSER = null;
    public static final int UGC_TYPE_INFO_FIELD_NUMBER = 2;
    private int bitField0_;
    private boc ugcTypeInfo_;

    static {
        bmz bmzVar = new bmz();
        DEFAULT_INSTANCE = bmzVar;
        com.google.v.du.registerDefaultInstance(bmz.class, bmzVar);
    }

    private bmz() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUgcTypeInfo() {
        this.ugcTypeInfo_ = null;
        this.bitField0_ &= -2;
    }

    public static bmz getDefaultInstance() {
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

    public static bmy newBuilder() {
        return (bmy) DEFAULT_INSTANCE.createBuilder();
    }

    public static bmz parseDelimitedFrom(InputStream inputStream) {
        return (bmz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bmz parseFrom(com.google.v.v vVar) {
        return (bmz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bmz> parser() {
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"bitField0_", "ugcTypeInfo_"});
        }
        if (iOrdinal == 3) {
            return new bmz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bmy(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bmz> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bmz.class) {
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

    public static bmy newBuilder(bmz bmzVar) {
        return (bmy) DEFAULT_INSTANCE.createBuilder(bmzVar);
    }

    public static bmz parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bmz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bmz parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bmz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bmz parseFrom(com.google.v.z zVar) {
        return (bmz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bmz parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bmz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bmz parseFrom(InputStream inputStream) {
        return (bmz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bmz parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bmz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bmz parseFrom(ByteBuffer byteBuffer) {
        return (bmz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bmz parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bmz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bmz parseFrom(byte[] bArr) {
        return (bmz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bmz parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bmz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
