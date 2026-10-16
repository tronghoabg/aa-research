package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bne extends com.google.v.du<bne, bnd> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 3;
    private static final bne DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bne> PARSER = null;
    public static final int UGC_INFO_FIELD_NUMBER = 1;
    public static final int UGC_TYPE_INFO_FIELD_NUMBER = 2;
    private int action_;
    private int bitField0_;
    private bnb ugcInfo_;
    private boc ugcTypeInfo_;

    static {
        bne bneVar = new bne();
        DEFAULT_INSTANCE = bneVar;
        com.google.v.du.registerDefaultInstance(bne.class, bneVar);
    }

    private bne() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUgcInfo() {
        this.ugcInfo_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUgcTypeInfo() {
        this.ugcTypeInfo_ = null;
        this.bitField0_ &= -3;
    }

    public static bne getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUgcInfo(bnb bnbVar) {
        Objects.requireNonNull(bnbVar);
        bnb bnbVar2 = this.ugcInfo_;
        if (bnbVar2 != null && bnbVar2 != bnb.getDefaultInstance()) {
            bna bnaVarNewBuilder = bnb.newBuilder(bnbVar2);
            bnaVarNewBuilder.mergeFrom((bna) bnbVar);
            bnbVar = bnaVarNewBuilder.buildPartial();
        }
        this.ugcInfo_ = bnbVar;
        this.bitField0_ |= 1;
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
        this.bitField0_ |= 2;
    }

    public static bnd newBuilder() {
        return (bnd) DEFAULT_INSTANCE.createBuilder();
    }

    public static bne parseDelimitedFrom(InputStream inputStream) {
        return (bne) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bne parseFrom(com.google.v.v vVar) {
        return (bne) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bne> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(bnc bncVar) {
        this.action_ = bncVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUgcInfo(bnb bnbVar) {
        Objects.requireNonNull(bnbVar);
        this.ugcInfo_ = bnbVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUgcTypeInfo(boc bocVar) {
        Objects.requireNonNull(bocVar);
        this.ugcTypeInfo_ = bocVar;
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\f", new Object[]{"bitField0_", "ugcInfo_", "ugcTypeInfo_", "action_"});
        }
        if (iOrdinal == 3) {
            return new bne();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bnd(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bne> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bne.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bnc getAction() {
        int i2 = this.action_;
        bnc bncVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : bnc.CLICK_MORE : bnc.TIMER_EXPIRED : bnc.EXPAND : bnc.ACTION_UNSPECIFIED;
        return bncVar == null ? bnc.UNRECOGNIZED : bncVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public bnb getUgcInfo() {
        bnb bnbVar = this.ugcInfo_;
        return bnbVar == null ? bnb.getDefaultInstance() : bnbVar;
    }

    public boc getUgcTypeInfo() {
        boc bocVar = this.ugcTypeInfo_;
        return bocVar == null ? boc.getDefaultInstance() : bocVar;
    }

    public boolean hasUgcInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasUgcTypeInfo() {
        return (this.bitField0_ & 2) != 0;
    }

    public static bnd newBuilder(bne bneVar) {
        return (bnd) DEFAULT_INSTANCE.createBuilder(bneVar);
    }

    public static bne parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bne) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bne parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bne) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bne parseFrom(com.google.v.z zVar) {
        return (bne) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bne parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bne) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bne parseFrom(InputStream inputStream) {
        return (bne) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bne parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bne) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bne parseFrom(ByteBuffer byteBuffer) {
        return (bne) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bne parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bne) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bne parseFrom(byte[] bArr) {
        return (bne) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bne parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bne) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
