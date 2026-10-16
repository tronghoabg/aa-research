package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ho extends com.google.v.du<ho, hl> implements com.google.v.fj {
    public static final int CTA_TYPE_FIELD_NUMBER = 1;
    private static final ho DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ho> PARSER = null;
    public static final int URL_FIELD_NUMBER = 2;
    private int bitField0_;
    private int ctaType_;
    private Object payload_;
    private int payloadCase_ = 0;
    private byte memoizedIsInitialized = 2;

    static {
        ho hoVar = new ho();
        DEFAULT_INSTANCE = hoVar;
        com.google.v.du.registerDefaultInstance(ho.class, hoVar);
    }

    private ho() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCtaType() {
        this.bitField0_ &= -2;
        this.ctaType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPayload() {
        this.payloadCase_ = 0;
        this.payload_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrl() {
        if (this.payloadCase_ == 2) {
            this.payloadCase_ = 0;
            this.payload_ = null;
        }
    }

    public static ho getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUrl(com.google.k.a.a.b.kt ktVar) {
        Objects.requireNonNull(ktVar);
        if (this.payloadCase_ == 2 && this.payload_ != com.google.k.a.a.b.kt.getDefaultInstance()) {
            com.google.k.a.a.b.ks ksVarNewBuilder = com.google.k.a.a.b.kt.newBuilder((com.google.k.a.a.b.kt) this.payload_);
            ksVarNewBuilder.mergeFrom((com.google.k.a.a.b.ks) ktVar);
            ktVar = ksVarNewBuilder.buildPartial();
        }
        this.payload_ = ktVar;
        this.payloadCase_ = 2;
    }

    public static hl newBuilder() {
        return (hl) DEFAULT_INSTANCE.createBuilder();
    }

    public static ho parseDelimitedFrom(InputStream inputStream) {
        return (ho) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ho parseFrom(com.google.v.v vVar) {
        return (ho) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ho> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCtaType(hm hmVar) {
        this.ctaType_ = hmVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrl(com.google.k.a.a.b.kt ktVar) {
        Objects.requireNonNull(ktVar);
        this.payload_ = ktVar;
        this.payloadCase_ = 2;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001᠌\u0000\u0002м\u0000", new Object[]{"payload_", "payloadCase_", "bitField0_", "ctaType_", ha.f11889f, com.google.k.a.a.b.kt.class});
            case 3:
                return new ho();
            case 4:
                return new hl(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<ho> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (ho.class) {
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

    public hm getCtaType() {
        hm hmVarA = hm.a(this.ctaType_);
        return hmVarA == null ? hm.CTA_TYPE_UNSPECIFIED : hmVarA;
    }

    public hn getPayloadCase() {
        int i2 = this.payloadCase_;
        if (i2 == 0) {
            return hn.f11940b;
        }
        if (i2 != 2) {
            return null;
        }
        return hn.f11939a;
    }

    public com.google.k.a.a.b.kt getUrl() {
        return this.payloadCase_ == 2 ? (com.google.k.a.a.b.kt) this.payload_ : com.google.k.a.a.b.kt.getDefaultInstance();
    }

    public boolean hasCtaType() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasUrl() {
        return this.payloadCase_ == 2;
    }

    public static hl newBuilder(ho hoVar) {
        return (hl) DEFAULT_INSTANCE.createBuilder(hoVar);
    }

    public static ho parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ho) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ho parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ho) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ho parseFrom(com.google.v.z zVar) {
        return (ho) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ho parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ho) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ho parseFrom(InputStream inputStream) {
        return (ho) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ho parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ho) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ho parseFrom(ByteBuffer byteBuffer) {
        return (ho) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ho parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ho) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ho parseFrom(byte[] bArr) {
        return (ho) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ho parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ho) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
