package com.google.k.a.a.b;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class gn extends com.google.v.du<gn, gm> implements com.google.v.fj {
    public static final int COMPONENT_FIELD_NUMBER = 1;
    private static final gn DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<gn> PARSER;
    private byte memoizedIsInitialized = 2;
    private com.google.v.eo<gq> component_ = emptyProtobufList();

    static {
        gn gnVar = new gn();
        DEFAULT_INSTANCE = gnVar;
        com.google.v.du.registerDefaultInstance(gn.class, gnVar);
    }

    private gn() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllComponent(Iterable<? extends gq> iterable) {
        ensureComponentIsMutable();
        com.google.v.c.addAll(iterable, this.component_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addComponent(int i2, gq gqVar) {
        Objects.requireNonNull(gqVar);
        ensureComponentIsMutable();
        this.component_.add(i2, gqVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearComponent() {
        this.component_ = emptyProtobufList();
    }

    private void ensureComponentIsMutable() {
        com.google.v.eo<gq> eoVar = this.component_;
        if (eoVar.c()) {
            return;
        }
        this.component_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static gn getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static gm newBuilder() {
        return (gm) DEFAULT_INSTANCE.createBuilder();
    }

    public static gn parseDelimitedFrom(InputStream inputStream) {
        return (gn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gn parseFrom(com.google.v.v vVar) {
        return (gn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<gn> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeComponent(int i2) {
        ensureComponentIsMutable();
        this.component_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setComponent(int i2, gq gqVar) {
        Objects.requireNonNull(gqVar);
        ensureComponentIsMutable();
        this.component_.set(i2, gqVar);
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"component_", gq.class});
            case 3:
                return new gn();
            case 4:
                return new gm(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<gn> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (gn.class) {
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

    public gq getComponent(int i2) {
        return this.component_.get(i2);
    }

    public int getComponentCount() {
        return this.component_.size();
    }

    public List<gq> getComponentList() {
        return this.component_;
    }

    public gr getComponentOrBuilder(int i2) {
        return this.component_.get(i2);
    }

    public List<? extends gr> getComponentOrBuilderList() {
        return this.component_;
    }

    public static gm newBuilder(gn gnVar) {
        return (gm) DEFAULT_INSTANCE.createBuilder(gnVar);
    }

    public static gn parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gn parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (gn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static gn parseFrom(com.google.v.z zVar) {
        return (gn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static gn parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (gn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addComponent(gq gqVar) {
        Objects.requireNonNull(gqVar);
        ensureComponentIsMutable();
        this.component_.add(gqVar);
    }

    public static gn parseFrom(InputStream inputStream) {
        return (gn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gn parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gn parseFrom(ByteBuffer byteBuffer) {
        return (gn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static gn parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (gn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static gn parseFrom(byte[] bArr) {
        return (gn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static gn parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (gn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
