package com.google.k.a.a.b;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class fr extends com.google.v.du<fr, fq> implements fs {
    private static final fr DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<fr> PARSER = null;
    public static final int VALUE_STRING_FIELD_NUMBER = 2;
    private int bitField0_;
    private byte memoizedIsInitialized = 2;
    private String key_ = "";
    private String valueString_ = "";

    static {
        fr frVar = new fr();
        DEFAULT_INSTANCE = frVar;
        com.google.v.du.registerDefaultInstance(fr.class, frVar);
    }

    private fr() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKey() {
        this.bitField0_ &= -2;
        this.key_ = getDefaultInstance().getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValueString() {
        this.bitField0_ &= -3;
        this.valueString_ = getDefaultInstance().getValueString();
    }

    public static fr getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static fq newBuilder() {
        return (fq) DEFAULT_INSTANCE.createBuilder();
    }

    public static fr parseDelimitedFrom(InputStream inputStream) {
        return (fr) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fr parseFrom(com.google.v.v vVar) {
        return (fr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<fr> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKey(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.key_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyBytes(com.google.v.v vVar) {
        this.key_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValueString(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.valueString_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValueStringBytes(com.google.v.v vVar) {
        this.valueString_ = vVar.u();
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "key_", "valueString_"});
            case 3:
                return new fr();
            case 4:
                return new fq(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<fr> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (fr.class) {
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

    public String getKey() {
        return this.key_;
    }

    public com.google.v.v getKeyBytes() {
        return com.google.v.v.s(this.key_);
    }

    public String getValueString() {
        return this.valueString_;
    }

    public com.google.v.v getValueStringBytes() {
        return com.google.v.v.s(this.valueString_);
    }

    public boolean hasKey() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasValueString() {
        return (this.bitField0_ & 2) != 0;
    }

    public static fq newBuilder(fr frVar) {
        return (fq) DEFAULT_INSTANCE.createBuilder(frVar);
    }

    public static fr parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fr) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fr parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (fr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static fr parseFrom(com.google.v.z zVar) {
        return (fr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static fr parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (fr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static fr parseFrom(InputStream inputStream) {
        return (fr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fr parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fr parseFrom(ByteBuffer byteBuffer) {
        return (fr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static fr parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (fr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static fr parseFrom(byte[] bArr) {
        return (fr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static fr parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (fr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
