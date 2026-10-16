package com.google.k.a.a.b;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class fv extends com.google.v.du<fv, ft> implements fw {
    public static final int CONFLATION_METHOD_FIELD_NUMBER = 4;
    private static final fv DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int KEY_FIELD_NUMBER = 1;
    public static final int LABEL_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<fv> PARSER;
    private int bitField0_;
    private int conflationMethod_;
    private byte memoizedIsInitialized = 2;
    private String key_ = "";
    private String label_ = "";
    private String description_ = "";

    static {
        fv fvVar = new fv();
        DEFAULT_INSTANCE = fvVar;
        com.google.v.du.registerDefaultInstance(fv.class, fvVar);
    }

    private fv() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConflationMethod() {
        this.bitField0_ &= -9;
        this.conflationMethod_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.bitField0_ &= -5;
        this.description_ = getDefaultInstance().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKey() {
        this.bitField0_ &= -2;
        this.key_ = getDefaultInstance().getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLabel() {
        this.bitField0_ &= -3;
        this.label_ = getDefaultInstance().getLabel();
    }

    public static fv getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ft newBuilder() {
        return (ft) DEFAULT_INSTANCE.createBuilder();
    }

    public static fv parseDelimitedFrom(InputStream inputStream) {
        return (fv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fv parseFrom(com.google.v.v vVar) {
        return (fv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<fv> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConflationMethod(fu fuVar) {
        this.conflationMethod_ = fuVar.getNumber();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescription(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.description_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescriptionBytes(com.google.v.v vVar) {
        this.description_ = vVar.u();
        this.bitField0_ |= 4;
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
    public void setLabel(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.label_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLabelBytes(com.google.v.v vVar) {
        this.label_ = vVar.u();
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001ᔈ\u0000\u0002ᔈ\u0001\u0003ᔈ\u0002\u0004᠌\u0003", new Object[]{"bitField0_", "key_", "label_", "description_", "conflationMethod_", dq.f11276h});
            case 3:
                return new fv();
            case 4:
                return new ft(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<fv> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (fv.class) {
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

    public fu getConflationMethod() {
        fu fuVarA = fu.a(this.conflationMethod_);
        return fuVarA == null ? fu.CONFLATION_PICK_FIRST_VALUE : fuVarA;
    }

    public String getDescription() {
        return this.description_;
    }

    public com.google.v.v getDescriptionBytes() {
        return com.google.v.v.s(this.description_);
    }

    public String getKey() {
        return this.key_;
    }

    public com.google.v.v getKeyBytes() {
        return com.google.v.v.s(this.key_);
    }

    public String getLabel() {
        return this.label_;
    }

    public com.google.v.v getLabelBytes() {
        return com.google.v.v.s(this.label_);
    }

    public boolean hasConflationMethod() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasDescription() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasKey() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasLabel() {
        return (this.bitField0_ & 2) != 0;
    }

    public static ft newBuilder(fv fvVar) {
        return (ft) DEFAULT_INSTANCE.createBuilder(fvVar);
    }

    public static fv parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fv parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (fv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static fv parseFrom(com.google.v.z zVar) {
        return (fv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static fv parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (fv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static fv parseFrom(InputStream inputStream) {
        return (fv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fv parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fv parseFrom(ByteBuffer byteBuffer) {
        return (fv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static fv parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (fv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static fv parseFrom(byte[] bArr) {
        return (fv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static fv parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (fv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
