package com.google.k.a.a.b;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class kj extends com.google.v.du<kj, ki> implements com.google.v.fj {
    public static final int COMPONENT_FIELD_NUMBER = 1;
    private static final kj DEFAULT_INSTANCE;
    public static final int MESSAGE_SET_EXTENSION_FIELD_NUMBER = 15256124;
    private static volatile com.google.v.fo<kj> PARSER;
    public static final com.google.v.ds<com.google.w.n.a.b, kj> messageSetExtension;
    private com.google.v.eo<jv> component_ = emptyProtobufList();

    static {
        kj kjVar = new kj();
        DEFAULT_INSTANCE = kjVar;
        com.google.v.du.registerDefaultInstance(kj.class, kjVar);
        messageSetExtension = com.google.v.du.newSingularGeneratedExtension(com.google.w.n.a.b.getDefaultInstance(), getDefaultInstance(), getDefaultInstance(), null, MESSAGE_SET_EXTENSION_FIELD_NUMBER, com.google.v.gm.MESSAGE, kj.class);
    }

    private kj() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllComponent(Iterable<? extends jv> iterable) {
        ensureComponentIsMutable();
        com.google.v.c.addAll(iterable, this.component_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addComponent(int i2, jv jvVar) {
        Objects.requireNonNull(jvVar);
        ensureComponentIsMutable();
        this.component_.add(i2, jvVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearComponent() {
        this.component_ = emptyProtobufList();
    }

    private void ensureComponentIsMutable() {
        com.google.v.eo<jv> eoVar = this.component_;
        if (eoVar.c()) {
            return;
        }
        this.component_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static kj getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ki newBuilder() {
        return (ki) DEFAULT_INSTANCE.createBuilder();
    }

    public static kj parseDelimitedFrom(InputStream inputStream) {
        return (kj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static kj parseFrom(com.google.v.v vVar) {
        return (kj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<kj> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeComponent(int i2) {
        ensureComponentIsMutable();
        this.component_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setComponent(int i2, jv jvVar) {
        Objects.requireNonNull(jvVar);
        ensureComponentIsMutable();
        this.component_.set(i2, jvVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"component_", jv.class});
        }
        if (iOrdinal == 3) {
            return new kj();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ki(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<kj> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (kj.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public jv getComponent(int i2) {
        return this.component_.get(i2);
    }

    public int getComponentCount() {
        return this.component_.size();
    }

    public List<jv> getComponentList() {
        return this.component_;
    }

    public jw getComponentOrBuilder(int i2) {
        return this.component_.get(i2);
    }

    public List<? extends jw> getComponentOrBuilderList() {
        return this.component_;
    }

    public static ki newBuilder(kj kjVar) {
        return (ki) DEFAULT_INSTANCE.createBuilder(kjVar);
    }

    public static kj parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (kj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static kj parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (kj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static kj parseFrom(com.google.v.z zVar) {
        return (kj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static kj parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (kj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addComponent(jv jvVar) {
        Objects.requireNonNull(jvVar);
        ensureComponentIsMutable();
        this.component_.add(jvVar);
    }

    public static kj parseFrom(InputStream inputStream) {
        return (kj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static kj parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (kj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static kj parseFrom(ByteBuffer byteBuffer) {
        return (kj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static kj parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (kj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static kj parseFrom(byte[] bArr) {
        return (kj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static kj parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (kj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
