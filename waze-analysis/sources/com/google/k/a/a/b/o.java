package com.google.k.a.a.b;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class o extends com.google.v.du<o, n> implements p {
    private static final o DEFAULT_INSTANCE;
    public static final int LANGUAGE_FIELD_NUMBER = 2;
    public static final int LINE_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<o> PARSER;
    private int bitField0_;
    private com.google.v.eo<String> line_ = emptyProtobufList();
    private String language_ = "";

    static {
        o oVar = new o();
        DEFAULT_INSTANCE = oVar;
        com.google.v.du.registerDefaultInstance(o.class, oVar);
    }

    private o() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLine(Iterable<String> iterable) {
        ensureLineIsMutable();
        com.google.v.c.addAll(iterable, this.line_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLine(String str) {
        Objects.requireNonNull(str);
        ensureLineIsMutable();
        this.line_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLineBytes(com.google.v.v vVar) {
        ensureLineIsMutable();
        this.line_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLanguage() {
        this.bitField0_ &= -2;
        this.language_ = getDefaultInstance().getLanguage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLine() {
        this.line_ = emptyProtobufList();
    }

    private void ensureLineIsMutable() {
        com.google.v.eo<String> eoVar = this.line_;
        if (eoVar.c()) {
            return;
        }
        this.line_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static o getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static n newBuilder() {
        return (n) DEFAULT_INSTANCE.createBuilder();
    }

    public static o parseDelimitedFrom(InputStream inputStream) {
        return (o) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static o parseFrom(com.google.v.v vVar) {
        return (o) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<o> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguage(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.language_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguageBytes(com.google.v.v vVar) {
        this.language_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLine(int i2, String str) {
        Objects.requireNonNull(str);
        ensureLineIsMutable();
        this.line_.set(i2, str);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000", new Object[]{"bitField0_", "line_", "language_"});
        }
        if (iOrdinal == 3) {
            return new o();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new n(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<o> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (o.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getLanguage() {
        return this.language_;
    }

    public com.google.v.v getLanguageBytes() {
        return com.google.v.v.s(this.language_);
    }

    public String getLine(int i2) {
        return this.line_.get(i2);
    }

    public com.google.v.v getLineBytes(int i2) {
        return com.google.v.v.s(this.line_.get(i2));
    }

    public int getLineCount() {
        return this.line_.size();
    }

    public List<String> getLineList() {
        return this.line_;
    }

    public boolean hasLanguage() {
        return (this.bitField0_ & 1) != 0;
    }

    public static n newBuilder(o oVar) {
        return (n) DEFAULT_INSTANCE.createBuilder(oVar);
    }

    public static o parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (o) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static o parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (o) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static o parseFrom(com.google.v.z zVar) {
        return (o) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static o parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (o) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static o parseFrom(InputStream inputStream) {
        return (o) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static o parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (o) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static o parseFrom(ByteBuffer byteBuffer) {
        return (o) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static o parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (o) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static o parseFrom(byte[] bArr) {
        return (o) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static o parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (o) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
