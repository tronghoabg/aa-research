package com.google.k.a.a.b;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cl extends com.google.v.du<cl, cj> implements cm {
    private static final cl DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<cl> PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private int type_ = 17;
    private com.google.v.eo<dv> text_ = emptyProtobufList();

    static {
        cl clVar = new cl();
        DEFAULT_INSTANCE = clVar;
        com.google.v.du.registerDefaultInstance(cl.class, clVar);
    }

    private cl() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllText(Iterable<? extends dv> iterable) {
        ensureTextIsMutable();
        com.google.v.c.addAll(iterable, this.text_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addText(int i2, dv dvVar) {
        Objects.requireNonNull(dvVar);
        ensureTextIsMutable();
        this.text_.add(i2, dvVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearText() {
        this.text_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -2;
        this.type_ = 17;
    }

    private void ensureTextIsMutable() {
        com.google.v.eo<dv> eoVar = this.text_;
        if (eoVar.c()) {
            return;
        }
        this.text_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static cl getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static cj newBuilder() {
        return (cj) DEFAULT_INSTANCE.createBuilder();
    }

    public static cl parseDelimitedFrom(InputStream inputStream) {
        return (cl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cl parseFrom(com.google.v.v vVar) {
        return (cl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<cl> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeText(int i2) {
        ensureTextIsMutable();
        this.text_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setText(int i2, dv dvVar) {
        Objects.requireNonNull(dvVar);
        ensureTextIsMutable();
        this.text_.set(i2, dvVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(ck ckVar) {
        this.type_ = ckVar.getNumber();
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"bitField0_", "type_", c.p, "text_", dv.class});
        }
        if (iOrdinal == 3) {
            return new cl();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new cj(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<cl> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (cl.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public dv getText(int i2) {
        return this.text_.get(i2);
    }

    public int getTextCount() {
        return this.text_.size();
    }

    public List<dv> getTextList() {
        return this.text_;
    }

    public dw getTextOrBuilder(int i2) {
        return this.text_.get(i2);
    }

    public List<? extends dw> getTextOrBuilderList() {
        return this.text_;
    }

    public ck getType() {
        ck ckVarA = ck.a(this.type_);
        return ckVarA == null ? ck.f11210a : ckVarA;
    }

    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static cj newBuilder(cl clVar) {
        return (cj) DEFAULT_INSTANCE.createBuilder(clVar);
    }

    public static cl parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cl parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (cl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cl parseFrom(com.google.v.z zVar) {
        return (cl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cl parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (cl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addText(dv dvVar) {
        Objects.requireNonNull(dvVar);
        ensureTextIsMutable();
        this.text_.add(dvVar);
    }

    public static cl parseFrom(InputStream inputStream) {
        return (cl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cl parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cl parseFrom(ByteBuffer byteBuffer) {
        return (cl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cl parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (cl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cl parseFrom(byte[] bArr) {
        return (cl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cl parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (cl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
