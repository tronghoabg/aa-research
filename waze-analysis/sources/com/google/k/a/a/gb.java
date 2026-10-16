package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class gb extends com.google.v.du<gb, fx> implements com.google.v.fj {
    public static final int COMPONENT_FIELD_NUMBER = 1;
    private static final gb DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<gb> PARSER;
    private byte memoizedIsInitialized = 2;
    private com.google.v.eo<fz> component_ = emptyProtobufList();

    static {
        gb gbVar = new gb();
        DEFAULT_INSTANCE = gbVar;
        com.google.v.du.registerDefaultInstance(gb.class, gbVar);
    }

    private gb() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllComponent(Iterable<? extends fz> iterable) {
        ensureComponentIsMutable();
        com.google.v.c.addAll(iterable, this.component_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addComponent(int i2, fz fzVar) {
        Objects.requireNonNull(fzVar);
        ensureComponentIsMutable();
        this.component_.add(i2, fzVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearComponent() {
        this.component_ = emptyProtobufList();
    }

    private void ensureComponentIsMutable() {
        com.google.v.eo<fz> eoVar = this.component_;
        if (eoVar.c()) {
            return;
        }
        this.component_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static gb getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static fx newBuilder() {
        return (fx) DEFAULT_INSTANCE.createBuilder();
    }

    public static gb parseDelimitedFrom(InputStream inputStream) {
        return (gb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gb parseFrom(com.google.v.v vVar) {
        return (gb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<gb> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeComponent(int i2) {
        ensureComponentIsMutable();
        this.component_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setComponent(int i2, fz fzVar) {
        Objects.requireNonNull(fzVar);
        ensureComponentIsMutable();
        this.component_.set(i2, fzVar);
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"component_", fz.class});
            case 3:
                return new gb();
            case 4:
                return new fx(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<gb> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (gb.class) {
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

    public fz getComponent(int i2) {
        return this.component_.get(i2);
    }

    public int getComponentCount() {
        return this.component_.size();
    }

    public List<fz> getComponentList() {
        return this.component_;
    }

    public ga getComponentOrBuilder(int i2) {
        return this.component_.get(i2);
    }

    public List<? extends ga> getComponentOrBuilderList() {
        return this.component_;
    }

    public static fx newBuilder(gb gbVar) {
        return (fx) DEFAULT_INSTANCE.createBuilder(gbVar);
    }

    public static gb parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gb parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (gb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static gb parseFrom(com.google.v.z zVar) {
        return (gb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static gb parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (gb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addComponent(fz fzVar) {
        Objects.requireNonNull(fzVar);
        ensureComponentIsMutable();
        this.component_.add(fzVar);
    }

    public static gb parseFrom(InputStream inputStream) {
        return (gb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gb parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gb parseFrom(ByteBuffer byteBuffer) {
        return (gb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static gb parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (gb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static gb parseFrom(byte[] bArr) {
        return (gb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static gb parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (gb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
