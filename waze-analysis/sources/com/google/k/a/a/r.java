package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class r extends com.google.v.du<r, l> implements com.google.v.fj {
    private static final r DEFAULT_INSTANCE;
    public static final int MATERIALS_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<r> PARSER;
    private com.google.v.eo<p> materials_ = emptyProtobufList();

    static {
        r rVar = new r();
        DEFAULT_INSTANCE = rVar;
        com.google.v.du.registerDefaultInstance(r.class, rVar);
    }

    private r() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMaterials(Iterable<? extends p> iterable) {
        ensureMaterialsIsMutable();
        com.google.v.c.addAll(iterable, this.materials_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMaterials(int i2, p pVar) {
        Objects.requireNonNull(pVar);
        ensureMaterialsIsMutable();
        this.materials_.add(i2, pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaterials() {
        this.materials_ = emptyProtobufList();
    }

    private void ensureMaterialsIsMutable() {
        com.google.v.eo<p> eoVar = this.materials_;
        if (eoVar.c()) {
            return;
        }
        this.materials_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static r getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static l newBuilder() {
        return (l) DEFAULT_INSTANCE.createBuilder();
    }

    public static r parseDelimitedFrom(InputStream inputStream) {
        return (r) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static r parseFrom(com.google.v.v vVar) {
        return (r) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<r> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMaterials(int i2) {
        ensureMaterialsIsMutable();
        this.materials_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaterials(int i2, p pVar) {
        Objects.requireNonNull(pVar);
        ensureMaterialsIsMutable();
        this.materials_.set(i2, pVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"materials_", p.class});
        }
        if (iOrdinal == 3) {
            return new r();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new l(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<r> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (r.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public p getMaterials(int i2) {
        return this.materials_.get(i2);
    }

    public int getMaterialsCount() {
        return this.materials_.size();
    }

    public List<p> getMaterialsList() {
        return this.materials_;
    }

    public q getMaterialsOrBuilder(int i2) {
        return this.materials_.get(i2);
    }

    public List<? extends q> getMaterialsOrBuilderList() {
        return this.materials_;
    }

    public static l newBuilder(r rVar) {
        return (l) DEFAULT_INSTANCE.createBuilder(rVar);
    }

    public static r parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (r) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static r parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (r) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static r parseFrom(com.google.v.z zVar) {
        return (r) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static r parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (r) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMaterials(p pVar) {
        Objects.requireNonNull(pVar);
        ensureMaterialsIsMutable();
        this.materials_.add(pVar);
    }

    public static r parseFrom(InputStream inputStream) {
        return (r) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static r parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (r) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static r parseFrom(ByteBuffer byteBuffer) {
        return (r) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (r) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static r parseFrom(byte[] bArr) {
        return (r) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static r parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (r) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
