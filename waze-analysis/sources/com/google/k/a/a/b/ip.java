package com.google.k.a.a.b;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ip extends com.google.v.du<ip, io> implements com.google.v.fj {
    private static final ip DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ip> PARSER = null;
    public static final int SUBPATH_FIELD_NUMBER = 1;
    private byte memoizedIsInitialized = 2;
    private com.google.v.eo<bw> subpath_ = emptyProtobufList();

    static {
        ip ipVar = new ip();
        DEFAULT_INSTANCE = ipVar;
        com.google.v.du.registerDefaultInstance(ip.class, ipVar);
    }

    private ip() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSubpath(Iterable<? extends bw> iterable) {
        ensureSubpathIsMutable();
        com.google.v.c.addAll(iterable, this.subpath_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSubpath(int i2, bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureSubpathIsMutable();
        this.subpath_.add(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubpath() {
        this.subpath_ = emptyProtobufList();
    }

    private void ensureSubpathIsMutable() {
        com.google.v.eo<bw> eoVar = this.subpath_;
        if (eoVar.c()) {
            return;
        }
        this.subpath_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static ip getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io newBuilder() {
        return (io) DEFAULT_INSTANCE.createBuilder();
    }

    public static ip parseDelimitedFrom(InputStream inputStream) {
        return (ip) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ip parseFrom(com.google.v.v vVar) {
        return (ip) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ip> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSubpath(int i2) {
        ensureSubpathIsMutable();
        this.subpath_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubpath(int i2, bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureSubpathIsMutable();
        this.subpath_.set(i2, bwVar);
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"subpath_", bw.class});
            case 3:
                return new ip();
            case 4:
                return new io(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<ip> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (ip.class) {
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

    public bw getSubpath(int i2) {
        return this.subpath_.get(i2);
    }

    public int getSubpathCount() {
        return this.subpath_.size();
    }

    public List<bw> getSubpathList() {
        return this.subpath_;
    }

    public bx getSubpathOrBuilder(int i2) {
        return this.subpath_.get(i2);
    }

    public List<? extends bx> getSubpathOrBuilderList() {
        return this.subpath_;
    }

    public static io newBuilder(ip ipVar) {
        return (io) DEFAULT_INSTANCE.createBuilder(ipVar);
    }

    public static ip parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ip) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ip parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ip) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ip parseFrom(com.google.v.z zVar) {
        return (ip) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ip parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ip) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSubpath(bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureSubpathIsMutable();
        this.subpath_.add(bwVar);
    }

    public static ip parseFrom(InputStream inputStream) {
        return (ip) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ip parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ip) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ip parseFrom(ByteBuffer byteBuffer) {
        return (ip) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ip parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ip) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ip parseFrom(byte[] bArr) {
        return (ip) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ip parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ip) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
