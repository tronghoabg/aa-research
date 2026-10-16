package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class gg extends com.google.v.du<gg, gf> implements com.google.v.fj {
    private static final gg DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<gg> PARSER = null;
    public static final int TEMPORARY_CLOSURE_FIELD_NUMBER = 1;
    private com.google.v.eo<mc> temporaryClosure_ = emptyProtobufList();

    static {
        gg ggVar = new gg();
        DEFAULT_INSTANCE = ggVar;
        com.google.v.du.registerDefaultInstance(gg.class, ggVar);
    }

    private gg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTemporaryClosure(Iterable<? extends mc> iterable) {
        ensureTemporaryClosureIsMutable();
        com.google.v.c.addAll(iterable, this.temporaryClosure_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTemporaryClosure(int i2, mc mcVar) {
        Objects.requireNonNull(mcVar);
        ensureTemporaryClosureIsMutable();
        this.temporaryClosure_.add(i2, mcVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTemporaryClosure() {
        this.temporaryClosure_ = emptyProtobufList();
    }

    private void ensureTemporaryClosureIsMutable() {
        com.google.v.eo<mc> eoVar = this.temporaryClosure_;
        if (eoVar.c()) {
            return;
        }
        this.temporaryClosure_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static gg getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static gf newBuilder() {
        return (gf) DEFAULT_INSTANCE.createBuilder();
    }

    public static gg parseDelimitedFrom(InputStream inputStream) {
        return (gg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gg parseFrom(com.google.v.v vVar) {
        return (gg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<gg> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTemporaryClosure(int i2) {
        ensureTemporaryClosureIsMutable();
        this.temporaryClosure_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTemporaryClosure(int i2, mc mcVar) {
        Objects.requireNonNull(mcVar);
        ensureTemporaryClosureIsMutable();
        this.temporaryClosure_.set(i2, mcVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"temporaryClosure_", mc.class});
        }
        if (iOrdinal == 3) {
            return new gg();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new gf(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<gg> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (gg.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public mc getTemporaryClosure(int i2) {
        return this.temporaryClosure_.get(i2);
    }

    public int getTemporaryClosureCount() {
        return this.temporaryClosure_.size();
    }

    public List<mc> getTemporaryClosureList() {
        return this.temporaryClosure_;
    }

    public md getTemporaryClosureOrBuilder(int i2) {
        return this.temporaryClosure_.get(i2);
    }

    public List<? extends md> getTemporaryClosureOrBuilderList() {
        return this.temporaryClosure_;
    }

    public static gf newBuilder(gg ggVar) {
        return (gf) DEFAULT_INSTANCE.createBuilder(ggVar);
    }

    public static gg parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gg parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (gg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static gg parseFrom(com.google.v.z zVar) {
        return (gg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static gg parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (gg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTemporaryClosure(mc mcVar) {
        Objects.requireNonNull(mcVar);
        ensureTemporaryClosureIsMutable();
        this.temporaryClosure_.add(mcVar);
    }

    public static gg parseFrom(InputStream inputStream) {
        return (gg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gg parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gg parseFrom(ByteBuffer byteBuffer) {
        return (gg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static gg parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (gg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static gg parseFrom(byte[] bArr) {
        return (gg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static gg parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (gg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
