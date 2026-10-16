package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cr extends com.google.v.du<cr, cq> implements com.google.v.fj {
    private static final cr DEFAULT_INSTANCE;
    public static final int DISPLAY_LOCATION_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<cr> PARSER;
    private int bitField0_;
    private com.google.k.a.a.b.es displayLocation_;
    private byte memoizedIsInitialized = 2;

    static {
        cr crVar = new cr();
        DEFAULT_INSTANCE = crVar;
        com.google.v.du.registerDefaultInstance(cr.class, crVar);
    }

    private cr() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisplayLocation() {
        this.displayLocation_ = null;
        this.bitField0_ &= -2;
    }

    public static cr getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDisplayLocation(com.google.k.a.a.b.es esVar) {
        Objects.requireNonNull(esVar);
        com.google.k.a.a.b.es esVar2 = this.displayLocation_;
        if (esVar2 != null && esVar2 != com.google.k.a.a.b.es.getDefaultInstance()) {
            com.google.k.a.a.b.er erVarNewBuilder = com.google.k.a.a.b.es.newBuilder(esVar2);
            erVarNewBuilder.mergeFrom((com.google.k.a.a.b.er) esVar);
            esVar = erVarNewBuilder.buildPartial();
        }
        this.displayLocation_ = esVar;
        this.bitField0_ |= 1;
    }

    public static cq newBuilder() {
        return (cq) DEFAULT_INSTANCE.createBuilder();
    }

    public static cr parseDelimitedFrom(InputStream inputStream) {
        return (cr) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cr parseFrom(com.google.v.v vVar) {
        return (cr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<cr> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayLocation(com.google.k.a.a.b.es esVar) {
        Objects.requireNonNull(esVar);
        this.displayLocation_ = esVar;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"bitField0_", "displayLocation_"});
            case 3:
                return new cr();
            case 4:
                return new cq(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<cr> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (cr.class) {
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

    public com.google.k.a.a.b.es getDisplayLocation() {
        com.google.k.a.a.b.es esVar = this.displayLocation_;
        return esVar == null ? com.google.k.a.a.b.es.getDefaultInstance() : esVar;
    }

    public boolean hasDisplayLocation() {
        return (this.bitField0_ & 1) != 0;
    }

    public static cq newBuilder(cr crVar) {
        return (cq) DEFAULT_INSTANCE.createBuilder(crVar);
    }

    public static cr parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cr) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cr parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (cr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cr parseFrom(com.google.v.z zVar) {
        return (cr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cr parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (cr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static cr parseFrom(InputStream inputStream) {
        return (cr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cr parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cr parseFrom(ByteBuffer byteBuffer) {
        return (cr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cr parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (cr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cr parseFrom(byte[] bArr) {
        return (cr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cr parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (cr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
