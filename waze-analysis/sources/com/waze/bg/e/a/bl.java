package com.waze.bg.e.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bl extends com.google.v.du<bl, bk> implements com.google.v.fj {
    private static final bl DEFAULT_INSTANCE;
    public static final int DETOUR_UPDATE_INSTRUCTIONS_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<bl> PARSER;
    private com.google.v.eo<bi> detourUpdateInstructions_ = emptyProtobufList();

    static {
        bl blVar = new bl();
        DEFAULT_INSTANCE = blVar;
        com.google.v.du.registerDefaultInstance(bl.class, blVar);
    }

    private bl() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDetourUpdateInstructions(Iterable<? extends bi> iterable) {
        ensureDetourUpdateInstructionsIsMutable();
        com.google.v.c.addAll(iterable, this.detourUpdateInstructions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDetourUpdateInstructions(int i2, bi biVar) {
        Objects.requireNonNull(biVar);
        ensureDetourUpdateInstructionsIsMutable();
        this.detourUpdateInstructions_.add(i2, biVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDetourUpdateInstructions() {
        this.detourUpdateInstructions_ = emptyProtobufList();
    }

    private void ensureDetourUpdateInstructionsIsMutable() {
        com.google.v.eo<bi> eoVar = this.detourUpdateInstructions_;
        if (eoVar.c()) {
            return;
        }
        this.detourUpdateInstructions_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static bl getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bk newBuilder() {
        return (bk) DEFAULT_INSTANCE.createBuilder();
    }

    public static bl parseDelimitedFrom(InputStream inputStream) {
        return (bl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bl parseFrom(com.google.v.v vVar) {
        return (bl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bl> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDetourUpdateInstructions(int i2) {
        ensureDetourUpdateInstructionsIsMutable();
        this.detourUpdateInstructions_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDetourUpdateInstructions(int i2, bi biVar) {
        Objects.requireNonNull(biVar);
        ensureDetourUpdateInstructionsIsMutable();
        this.detourUpdateInstructions_.set(i2, biVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"detourUpdateInstructions_", bi.class});
        }
        if (iOrdinal == 3) {
            return new bl();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bk(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bl> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bl.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bi getDetourUpdateInstructions(int i2) {
        return this.detourUpdateInstructions_.get(i2);
    }

    public int getDetourUpdateInstructionsCount() {
        return this.detourUpdateInstructions_.size();
    }

    public List<bi> getDetourUpdateInstructionsList() {
        return this.detourUpdateInstructions_;
    }

    public bj getDetourUpdateInstructionsOrBuilder(int i2) {
        return this.detourUpdateInstructions_.get(i2);
    }

    public List<? extends bj> getDetourUpdateInstructionsOrBuilderList() {
        return this.detourUpdateInstructions_;
    }

    public static bk newBuilder(bl blVar) {
        return (bk) DEFAULT_INSTANCE.createBuilder(blVar);
    }

    public static bl parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bl parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bl parseFrom(com.google.v.z zVar) {
        return (bl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bl parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDetourUpdateInstructions(bi biVar) {
        Objects.requireNonNull(biVar);
        ensureDetourUpdateInstructionsIsMutable();
        this.detourUpdateInstructions_.add(biVar);
    }

    public static bl parseFrom(InputStream inputStream) {
        return (bl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bl parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bl parseFrom(ByteBuffer byteBuffer) {
        return (bl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bl parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bl parseFrom(byte[] bArr) {
        return (bl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bl parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
