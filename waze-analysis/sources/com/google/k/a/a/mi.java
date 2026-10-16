package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class mi extends com.google.v.du<mi, mh> implements mj {
    private static final mi DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int METADATA_FIELD_NUMBER = 500;
    private static volatile com.google.v.fo<mi> PARSER;
    private int bitField0_;
    private String id_ = "";
    private com.google.k.a.a.b.ce metadata_;

    static {
        mi miVar = new mi();
        DEFAULT_INSTANCE = miVar;
        com.google.v.du.registerDefaultInstance(mi.class, miVar);
    }

    private mi() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.bitField0_ &= -2;
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetadata() {
        this.metadata_ = null;
        this.bitField0_ &= -3;
    }

    public static mi getDefaultInstance() {
        return DEFAULT_INSTANCE;
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

    public static mh newBuilder() {
        return (mh) DEFAULT_INSTANCE.createBuilder();
    }

    public static mi parseDelimitedFrom(InputStream inputStream) {
        return (mi) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static mi parseFrom(com.google.v.v vVar) {
        return (mi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<mi> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(com.google.v.v vVar) {
        this.id_ = vVar.u();
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
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001Ǵ\u0002\u0000\u0000\u0000\u0001ဈ\u0000Ǵဉ\u0001", new Object[]{"bitField0_", "id_", "metadata_"});
        }
        if (iOrdinal == 3) {
            return new mi();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new mh(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<mi> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (mi.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getId() {
        return this.id_;
    }

    public com.google.v.v getIdBytes() {
        return com.google.v.v.s(this.id_);
    }

    public com.google.k.a.a.b.ce getMetadata() {
        com.google.k.a.a.b.ce ceVar = this.metadata_;
        return ceVar == null ? com.google.k.a.a.b.ce.getDefaultInstance() : ceVar;
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasMetadata() {
        return (this.bitField0_ & 2) != 0;
    }

    public static mh newBuilder(mi miVar) {
        return (mh) DEFAULT_INSTANCE.createBuilder(miVar);
    }

    public static mi parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (mi) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static mi parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (mi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static mi parseFrom(com.google.v.z zVar) {
        return (mi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static mi parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (mi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static mi parseFrom(InputStream inputStream) {
        return (mi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static mi parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (mi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static mi parseFrom(ByteBuffer byteBuffer) {
        return (mi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static mi parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (mi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static mi parseFrom(byte[] bArr) {
        return (mi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static mi parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (mi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
