package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ge extends com.google.v.du<ge, gd> implements com.google.v.fj {
    private static final ge DEFAULT_INSTANCE;
    public static final int EXCEPTION_FIELD_NUMBER = 2;
    public static final int MESSAGE_SET_EXTENSION_FIELD_NUMBER = 98510069;
    private static volatile com.google.v.fo<ge> PARSER = null;
    public static final int REGULAR_HOURS_FIELD_NUMBER = 1;
    public static final com.google.v.ds<com.google.w.n.a.b, ge> messageSetExtension;
    private int bitField0_;
    private k regularHours_;
    private byte memoizedIsInitialized = 2;
    private com.google.v.eo<de> exception_ = emptyProtobufList();

    static {
        ge geVar = new ge();
        DEFAULT_INSTANCE = geVar;
        com.google.v.du.registerDefaultInstance(ge.class, geVar);
        messageSetExtension = com.google.v.du.newSingularGeneratedExtension(com.google.w.n.a.b.getDefaultInstance(), getDefaultInstance(), getDefaultInstance(), null, MESSAGE_SET_EXTENSION_FIELD_NUMBER, com.google.v.gm.MESSAGE, ge.class);
    }

    private ge() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllException(Iterable<? extends de> iterable) {
        ensureExceptionIsMutable();
        com.google.v.c.addAll(iterable, this.exception_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addException(int i2, de deVar) {
        Objects.requireNonNull(deVar);
        ensureExceptionIsMutable();
        this.exception_.add(i2, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearException() {
        this.exception_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegularHours() {
        this.regularHours_ = null;
        this.bitField0_ &= -2;
    }

    private void ensureExceptionIsMutable() {
        com.google.v.eo<de> eoVar = this.exception_;
        if (eoVar.c()) {
            return;
        }
        this.exception_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static ge getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRegularHours(k kVar) {
        Objects.requireNonNull(kVar);
        k kVar2 = this.regularHours_;
        if (kVar2 != null && kVar2 != k.getDefaultInstance()) {
            j jVarNewBuilder = k.newBuilder(kVar2);
            jVarNewBuilder.mergeFrom((j) kVar);
            kVar = jVarNewBuilder.buildPartial();
        }
        this.regularHours_ = kVar;
        this.bitField0_ |= 1;
    }

    public static gd newBuilder() {
        return (gd) DEFAULT_INSTANCE.createBuilder();
    }

    public static ge parseDelimitedFrom(InputStream inputStream) {
        return (ge) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ge parseFrom(com.google.v.v vVar) {
        return (ge) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ge> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeException(int i2) {
        ensureExceptionIsMutable();
        this.exception_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setException(int i2, de deVar) {
        Objects.requireNonNull(deVar);
        ensureExceptionIsMutable();
        this.exception_.set(i2, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegularHours(k kVar) {
        Objects.requireNonNull(kVar);
        this.regularHours_ = kVar;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001ᐉ\u0000\u0002Л", new Object[]{"bitField0_", "regularHours_", "exception_", de.class});
            case 3:
                return new ge();
            case 4:
                return new gd(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<ge> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (ge.class) {
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

    public de getException(int i2) {
        return this.exception_.get(i2);
    }

    public int getExceptionCount() {
        return this.exception_.size();
    }

    public List<de> getExceptionList() {
        return this.exception_;
    }

    public df getExceptionOrBuilder(int i2) {
        return this.exception_.get(i2);
    }

    public List<? extends df> getExceptionOrBuilderList() {
        return this.exception_;
    }

    public k getRegularHours() {
        k kVar = this.regularHours_;
        return kVar == null ? k.getDefaultInstance() : kVar;
    }

    public boolean hasRegularHours() {
        return (this.bitField0_ & 1) != 0;
    }

    public static gd newBuilder(ge geVar) {
        return (gd) DEFAULT_INSTANCE.createBuilder(geVar);
    }

    public static ge parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ge) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ge parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ge) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ge parseFrom(com.google.v.z zVar) {
        return (ge) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ge parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ge) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addException(de deVar) {
        Objects.requireNonNull(deVar);
        ensureExceptionIsMutable();
        this.exception_.add(deVar);
    }

    public static ge parseFrom(InputStream inputStream) {
        return (ge) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ge parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ge) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ge parseFrom(ByteBuffer byteBuffer) {
        return (ge) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ge parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ge) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ge parseFrom(byte[] bArr) {
        return (ge) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ge parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ge) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
