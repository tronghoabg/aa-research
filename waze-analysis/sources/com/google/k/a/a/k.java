package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class k extends com.google.v.du<k, j> implements com.google.v.fj {
    public static final int DATA_FIELD_NUMBER = 1;
    private static final k DEFAULT_INSTANCE;
    public static final int METADATA_FIELD_NUMBER = 500;
    private static volatile com.google.v.fo<k> PARSER;
    private int bitField0_;
    private com.google.x.a.a.a.e data_;
    private byte memoizedIsInitialized = 2;
    private com.google.k.a.a.b.ce metadata_;

    static {
        k kVar = new k();
        DEFAULT_INSTANCE = kVar;
        com.google.v.du.registerDefaultInstance(k.class, kVar);
    }

    private k() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearData() {
        this.data_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetadata() {
        this.metadata_ = null;
        this.bitField0_ &= -3;
    }

    public static k getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeData(com.google.x.a.a.a.e eVar) {
        Objects.requireNonNull(eVar);
        com.google.x.a.a.a.e eVar2 = this.data_;
        if (eVar2 != null && eVar2 != com.google.x.a.a.a.e.getDefaultInstance()) {
            com.google.x.a.a.a.a aVarNewBuilder = com.google.x.a.a.a.e.newBuilder(eVar2);
            aVarNewBuilder.mergeFrom((com.google.x.a.a.a.a) eVar);
            eVar = aVarNewBuilder.buildPartial();
        }
        this.data_ = eVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMetadata(com.google.k.a.a.b.ce ceVar) {
        Objects.requireNonNull(ceVar);
        com.google.k.a.a.b.ce ceVar2 = this.metadata_;
        if (ceVar2 != null && ceVar2 != com.google.k.a.a.b.ce.getDefaultInstance()) {
            com.google.k.a.a.b.cd cdVarNewBuilder = com.google.k.a.a.b.ce.newBuilder(ceVar2);
            cdVarNewBuilder.mergeFrom((com.google.k.a.a.b.cd) ceVar);
            ceVar = cdVarNewBuilder.buildPartial();
        }
        this.metadata_ = ceVar;
        this.bitField0_ |= 2;
    }

    public static j newBuilder() {
        return (j) DEFAULT_INSTANCE.createBuilder();
    }

    public static k parseDelimitedFrom(InputStream inputStream) {
        return (k) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static k parseFrom(com.google.v.v vVar) {
        return (k) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<k> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setData(com.google.x.a.a.a.e eVar) {
        Objects.requireNonNull(eVar);
        this.data_ = eVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadata(com.google.k.a.a.b.ce ceVar) {
        Objects.requireNonNull(ceVar);
        this.metadata_ = ceVar;
        this.bitField0_ |= 2;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001Ǵ\u0002\u0000\u0000\u0001\u0001ᐉ\u0000Ǵဉ\u0001", new Object[]{"bitField0_", "data_", "metadata_"});
            case 3:
                return new k();
            case 4:
                return new j(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<k> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (k.class) {
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

    public com.google.x.a.a.a.e getData() {
        com.google.x.a.a.a.e eVar = this.data_;
        return eVar == null ? com.google.x.a.a.a.e.getDefaultInstance() : eVar;
    }

    public com.google.k.a.a.b.ce getMetadata() {
        com.google.k.a.a.b.ce ceVar = this.metadata_;
        return ceVar == null ? com.google.k.a.a.b.ce.getDefaultInstance() : ceVar;
    }

    public boolean hasData() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasMetadata() {
        return (this.bitField0_ & 2) != 0;
    }

    public static j newBuilder(k kVar) {
        return (j) DEFAULT_INSTANCE.createBuilder(kVar);
    }

    public static k parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (k) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static k parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (k) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static k parseFrom(com.google.v.z zVar) {
        return (k) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static k parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (k) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static k parseFrom(InputStream inputStream) {
        return (k) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static k parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (k) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static k parseFrom(ByteBuffer byteBuffer) {
        return (k) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static k parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (k) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static k parseFrom(byte[] bArr) {
        return (k) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static k parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (k) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
