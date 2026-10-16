package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class db extends com.google.v.du<db, da> implements dc {
    private static final db DEFAULT_INSTANCE;
    public static final int FEATURE_ID_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<db> PARSER;
    private int bitField0_;
    private com.google.k.a.a.b.bw featureId_;
    private byte memoizedIsInitialized = 2;

    static {
        db dbVar = new db();
        DEFAULT_INSTANCE = dbVar;
        com.google.v.du.registerDefaultInstance(db.class, dbVar);
    }

    private db() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeatureId() {
        this.featureId_ = null;
        this.bitField0_ &= -2;
    }

    public static db getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFeatureId(com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        com.google.k.a.a.b.bw bwVar2 = this.featureId_;
        if (bwVar2 != null && bwVar2 != com.google.k.a.a.b.bw.getDefaultInstance()) {
            com.google.k.a.a.b.bv bvVarNewBuilder = com.google.k.a.a.b.bw.newBuilder(bwVar2);
            bvVarNewBuilder.mergeFrom((com.google.k.a.a.b.bv) bwVar);
            bwVar = bvVarNewBuilder.buildPartial();
        }
        this.featureId_ = bwVar;
        this.bitField0_ |= 1;
    }

    public static da newBuilder() {
        return (da) DEFAULT_INSTANCE.createBuilder();
    }

    public static db parseDelimitedFrom(InputStream inputStream) {
        return (db) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static db parseFrom(com.google.v.v vVar) {
        return (db) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<db> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeatureId(com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        this.featureId_ = bwVar;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"bitField0_", "featureId_"});
            case 3:
                return new db();
            case 4:
                return new da(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<db> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (db.class) {
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

    public com.google.k.a.a.b.bw getFeatureId() {
        com.google.k.a.a.b.bw bwVar = this.featureId_;
        return bwVar == null ? com.google.k.a.a.b.bw.getDefaultInstance() : bwVar;
    }

    public boolean hasFeatureId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static da newBuilder(db dbVar) {
        return (da) DEFAULT_INSTANCE.createBuilder(dbVar);
    }

    public static db parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (db) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static db parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (db) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static db parseFrom(com.google.v.z zVar) {
        return (db) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static db parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (db) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static db parseFrom(InputStream inputStream) {
        return (db) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static db parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (db) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static db parseFrom(ByteBuffer byteBuffer) {
        return (db) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static db parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (db) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static db parseFrom(byte[] bArr) {
        return (db) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static db parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (db) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
