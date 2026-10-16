package com.google.k.a.a.b;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ch extends com.google.v.du<ch, cg> implements ci {
    private static final ch DEFAULT_INSTANCE;
    public static final int INDEX_FIELD_NUMBER = 1;
    public static final int LEVEL_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<ch> PARSER;
    private int bitField0_;
    private int index_;
    private int level_;
    private byte memoizedIsInitialized = 2;

    static {
        ch chVar = new ch();
        DEFAULT_INSTANCE = chVar;
        com.google.v.du.registerDefaultInstance(ch.class, chVar);
    }

    private ch() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIndex() {
        this.bitField0_ &= -2;
        this.index_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLevel() {
        this.bitField0_ &= -3;
        this.level_ = 0;
    }

    public static ch getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static cg newBuilder() {
        return (cg) DEFAULT_INSTANCE.createBuilder();
    }

    public static ch parseDelimitedFrom(InputStream inputStream) {
        return (ch) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ch parseFrom(com.google.v.v vVar) {
        return (ch) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ch> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIndex(int i2) {
        this.bitField0_ |= 1;
        this.index_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLevel(int i2) {
        this.bitField0_ |= 2;
        this.level_ = i2;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔄ\u0001", new Object[]{"bitField0_", "index_", "level_"});
            case 3:
                return new ch();
            case 4:
                return new cg(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<ch> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (ch.class) {
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

    public int getIndex() {
        return this.index_;
    }

    public int getLevel() {
        return this.level_;
    }

    public boolean hasIndex() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasLevel() {
        return (this.bitField0_ & 2) != 0;
    }

    public static cg newBuilder(ch chVar) {
        return (cg) DEFAULT_INSTANCE.createBuilder(chVar);
    }

    public static ch parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ch) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ch parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ch) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ch parseFrom(com.google.v.z zVar) {
        return (ch) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ch parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ch) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ch parseFrom(InputStream inputStream) {
        return (ch) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ch parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ch) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ch parseFrom(ByteBuffer byteBuffer) {
        return (ch) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ch parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ch) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ch parseFrom(byte[] bArr) {
        return (ch) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ch parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ch) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
