package com.google.k.a.a.b;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class fy extends com.google.v.du<fy, fx> implements com.google.v.fj {
    private static final fy DEFAULT_INSTANCE;
    public static final int HI_FIELD_NUMBER = 2;
    public static final int LO_FIELD_NUMBER = 1;
    public static final int MESSAGE_SET_EXTENSION_FIELD_NUMBER = 26764887;
    private static volatile com.google.v.fo<fy> PARSER;
    public static final com.google.v.ds<com.google.w.n.a.b, fy> messageSetExtension;
    private int bitField0_;
    private es hi_;
    private es lo_;
    private byte memoizedIsInitialized = 2;

    static {
        fy fyVar = new fy();
        DEFAULT_INSTANCE = fyVar;
        com.google.v.du.registerDefaultInstance(fy.class, fyVar);
        messageSetExtension = com.google.v.du.newSingularGeneratedExtension(com.google.w.n.a.b.getDefaultInstance(), getDefaultInstance(), getDefaultInstance(), null, MESSAGE_SET_EXTENSION_FIELD_NUMBER, com.google.v.gm.MESSAGE, fy.class);
    }

    private fy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHi() {
        this.hi_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLo() {
        this.lo_ = null;
        this.bitField0_ &= -2;
    }

    public static fy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHi(es esVar) {
        Objects.requireNonNull(esVar);
        es esVar2 = this.hi_;
        if (esVar2 != null && esVar2 != es.getDefaultInstance()) {
            er erVarNewBuilder = es.newBuilder(esVar2);
            erVarNewBuilder.mergeFrom((er) esVar);
            esVar = erVarNewBuilder.buildPartial();
        }
        this.hi_ = esVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLo(es esVar) {
        Objects.requireNonNull(esVar);
        es esVar2 = this.lo_;
        if (esVar2 != null && esVar2 != es.getDefaultInstance()) {
            er erVarNewBuilder = es.newBuilder(esVar2);
            erVarNewBuilder.mergeFrom((er) esVar);
            esVar = erVarNewBuilder.buildPartial();
        }
        this.lo_ = esVar;
        this.bitField0_ |= 1;
    }

    public static fx newBuilder() {
        return (fx) DEFAULT_INSTANCE.createBuilder();
    }

    public static fy parseDelimitedFrom(InputStream inputStream) {
        return (fy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fy parseFrom(com.google.v.v vVar) {
        return (fy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<fy> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHi(es esVar) {
        Objects.requireNonNull(esVar);
        this.hi_ = esVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLo(es esVar) {
        Objects.requireNonNull(esVar);
        this.lo_ = esVar;
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        byte[] bArr = null;
        switch (dtVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔉ\u0000\u0002ᔉ\u0001", new Object[]{"bitField0_", "lo_", "hi_"});
            case 3:
                return new fy();
            case 4:
                return new fx(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<fy> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (fy.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            default:
                throw null;
        }
    }

    public es getHi() {
        es esVar = this.hi_;
        return esVar == null ? es.getDefaultInstance() : esVar;
    }

    public es getLo() {
        es esVar = this.lo_;
        return esVar == null ? es.getDefaultInstance() : esVar;
    }

    public boolean hasHi() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasLo() {
        return (this.bitField0_ & 1) != 0;
    }

    public static fx newBuilder(fy fyVar) {
        return (fx) DEFAULT_INSTANCE.createBuilder(fyVar);
    }

    public static fy parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fy parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (fy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static fy parseFrom(com.google.v.z zVar) {
        return (fy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static fy parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (fy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static fy parseFrom(InputStream inputStream) {
        return (fy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fy parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fy parseFrom(ByteBuffer byteBuffer) {
        return (fy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static fy parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (fy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static fy parseFrom(byte[] bArr) {
        return (fy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static fy parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (fy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
