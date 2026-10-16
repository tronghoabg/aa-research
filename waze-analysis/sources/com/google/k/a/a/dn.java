package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class dn extends com.google.v.dq<dn, dj> implements com.google.v.fj {
    private static final dn DEFAULT_INSTANCE;
    public static final int FIELD_PROVENANCE_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<dn> PARSER;
    private byte memoizedIsInitialized = 2;
    private com.google.v.eo<dl> fieldProvenance_ = emptyProtobufList();

    static {
        dn dnVar = new dn();
        DEFAULT_INSTANCE = dnVar;
        com.google.v.du.registerDefaultInstance(dn.class, dnVar);
    }

    private dn() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFieldProvenance(Iterable<? extends dl> iterable) {
        ensureFieldProvenanceIsMutable();
        com.google.v.c.addAll(iterable, this.fieldProvenance_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFieldProvenance(int i2, dl dlVar) {
        Objects.requireNonNull(dlVar);
        ensureFieldProvenanceIsMutable();
        this.fieldProvenance_.add(i2, dlVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFieldProvenance() {
        this.fieldProvenance_ = emptyProtobufList();
    }

    private void ensureFieldProvenanceIsMutable() {
        com.google.v.eo<dl> eoVar = this.fieldProvenance_;
        if (eoVar.c()) {
            return;
        }
        this.fieldProvenance_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static dn getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static dj newBuilder() {
        return (dj) DEFAULT_INSTANCE.createBuilder();
    }

    public static dn parseDelimitedFrom(InputStream inputStream) {
        return (dn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dn parseFrom(com.google.v.v vVar) {
        return (dn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<dn> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFieldProvenance(int i2) {
        ensureFieldProvenanceIsMutable();
        this.fieldProvenance_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFieldProvenance(int i2, dl dlVar) {
        Objects.requireNonNull(dlVar);
        ensureFieldProvenanceIsMutable();
        this.fieldProvenance_.set(i2, dlVar);
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"fieldProvenance_", dl.class});
            case 3:
                return new dn();
            case 4:
                return new dj(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<dn> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (dn.class) {
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

    public dl getFieldProvenance(int i2) {
        return this.fieldProvenance_.get(i2);
    }

    public int getFieldProvenanceCount() {
        return this.fieldProvenance_.size();
    }

    public List<dl> getFieldProvenanceList() {
        return this.fieldProvenance_;
    }

    public dm getFieldProvenanceOrBuilder(int i2) {
        return this.fieldProvenance_.get(i2);
    }

    public List<? extends dm> getFieldProvenanceOrBuilderList() {
        return this.fieldProvenance_;
    }

    public static dj newBuilder(dn dnVar) {
        return (dj) DEFAULT_INSTANCE.createBuilder(dnVar);
    }

    public static dn parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dn parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (dn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static dn parseFrom(com.google.v.z zVar) {
        return (dn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static dn parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (dn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFieldProvenance(dl dlVar) {
        Objects.requireNonNull(dlVar);
        ensureFieldProvenanceIsMutable();
        this.fieldProvenance_.add(dlVar);
    }

    public static dn parseFrom(InputStream inputStream) {
        return (dn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dn parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dn parseFrom(ByteBuffer byteBuffer) {
        return (dn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static dn parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (dn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static dn parseFrom(byte[] bArr) {
        return (dn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static dn parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (dn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
