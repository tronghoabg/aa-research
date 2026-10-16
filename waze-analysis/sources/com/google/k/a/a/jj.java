package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class jj extends com.google.v.du<jj, ji> implements jk {
    private static final jj DEFAULT_INSTANCE;
    public static final int DISPLAYABLE_AS_ALTERNATIVE_NAME_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<jj> PARSER = null;
    public static final int REGION_CODE_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean displayableAsAlternativeName_;
    private com.google.k.a.a.b.eh name_;
    private byte memoizedIsInitialized = 2;
    private String regionCode_ = "";

    static {
        jj jjVar = new jj();
        DEFAULT_INSTANCE = jjVar;
        com.google.v.du.registerDefaultInstance(jj.class, jjVar);
    }

    private jj() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisplayableAsAlternativeName() {
        this.bitField0_ &= -5;
        this.displayableAsAlternativeName_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegionCode() {
        this.bitField0_ &= -2;
        this.regionCode_ = getDefaultInstance().getRegionCode();
    }

    public static jj getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeName(com.google.k.a.a.b.eh ehVar) {
        Objects.requireNonNull(ehVar);
        com.google.k.a.a.b.eh ehVar2 = this.name_;
        if (ehVar2 != null && ehVar2 != com.google.k.a.a.b.eh.getDefaultInstance()) {
            com.google.k.a.a.b.ef efVarNewBuilder = com.google.k.a.a.b.eh.newBuilder(ehVar2);
            efVarNewBuilder.mergeFrom((com.google.k.a.a.b.ef) ehVar);
            ehVar = efVarNewBuilder.buildPartial();
        }
        this.name_ = ehVar;
        this.bitField0_ |= 2;
    }

    public static ji newBuilder() {
        return (ji) DEFAULT_INSTANCE.createBuilder();
    }

    public static jj parseDelimitedFrom(InputStream inputStream) {
        return (jj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static jj parseFrom(com.google.v.v vVar) {
        return (jj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<jj> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayableAsAlternativeName(boolean z) {
        this.bitField0_ |= 4;
        this.displayableAsAlternativeName_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(com.google.k.a.a.b.eh ehVar) {
        Objects.requireNonNull(ehVar);
        this.name_ = ehVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegionCode(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.regionCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegionCodeBytes(com.google.v.v vVar) {
        this.regionCode_ = vVar.u();
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဇ\u0002", new Object[]{"bitField0_", "regionCode_", "name_", "displayableAsAlternativeName_"});
            case 3:
                return new jj();
            case 4:
                return new ji(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<jj> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (jj.class) {
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

    public boolean getDisplayableAsAlternativeName() {
        return this.displayableAsAlternativeName_;
    }

    public com.google.k.a.a.b.eh getName() {
        com.google.k.a.a.b.eh ehVar = this.name_;
        return ehVar == null ? com.google.k.a.a.b.eh.getDefaultInstance() : ehVar;
    }

    public String getRegionCode() {
        return this.regionCode_;
    }

    public com.google.v.v getRegionCodeBytes() {
        return com.google.v.v.s(this.regionCode_);
    }

    public boolean hasDisplayableAsAlternativeName() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasName() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasRegionCode() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ji newBuilder(jj jjVar) {
        return (ji) DEFAULT_INSTANCE.createBuilder(jjVar);
    }

    public static jj parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (jj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static jj parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (jj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static jj parseFrom(com.google.v.z zVar) {
        return (jj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static jj parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (jj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static jj parseFrom(InputStream inputStream) {
        return (jj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static jj parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (jj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static jj parseFrom(ByteBuffer byteBuffer) {
        return (jj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static jj parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (jj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static jj parseFrom(byte[] bArr) {
        return (jj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static jj parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (jj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
