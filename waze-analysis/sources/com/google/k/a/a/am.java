package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class am extends com.google.v.du<am, al> implements an {
    private static final am DEFAULT_INSTANCE;
    public static final int LOOPS_FIELD_NUMBER = 1;
    public static final int MATERIAL_SPECS_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<am> PARSER = null;
    public static final int SEMANTICS_INDEX_FIELD_NUMBER = 2;
    private int bitField0_;
    private com.google.v.eo<aa> loops_ = emptyProtobufList();
    private com.google.v.eo<x> materialSpecs_ = emptyProtobufList();
    private int semanticsIndex_;

    static {
        am amVar = new am();
        DEFAULT_INSTANCE = amVar;
        com.google.v.du.registerDefaultInstance(am.class, amVar);
    }

    private am() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLoops(Iterable<? extends aa> iterable) {
        ensureLoopsIsMutable();
        com.google.v.c.addAll(iterable, this.loops_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMaterialSpecs(Iterable<? extends x> iterable) {
        ensureMaterialSpecsIsMutable();
        com.google.v.c.addAll(iterable, this.materialSpecs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLoops(int i2, aa aaVar) {
        Objects.requireNonNull(aaVar);
        ensureLoopsIsMutable();
        this.loops_.add(i2, aaVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMaterialSpecs(int i2, x xVar) {
        Objects.requireNonNull(xVar);
        ensureMaterialSpecsIsMutable();
        this.materialSpecs_.add(i2, xVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLoops() {
        this.loops_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaterialSpecs() {
        this.materialSpecs_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSemanticsIndex() {
        this.bitField0_ &= -2;
        this.semanticsIndex_ = 0;
    }

    private void ensureLoopsIsMutable() {
        com.google.v.eo<aa> eoVar = this.loops_;
        if (eoVar.c()) {
            return;
        }
        this.loops_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureMaterialSpecsIsMutable() {
        com.google.v.eo<x> eoVar = this.materialSpecs_;
        if (eoVar.c()) {
            return;
        }
        this.materialSpecs_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static am getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static al newBuilder() {
        return (al) DEFAULT_INSTANCE.createBuilder();
    }

    public static am parseDelimitedFrom(InputStream inputStream) {
        return (am) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static am parseFrom(com.google.v.v vVar) {
        return (am) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<am> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLoops(int i2) {
        ensureLoopsIsMutable();
        this.loops_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMaterialSpecs(int i2) {
        ensureMaterialSpecsIsMutable();
        this.materialSpecs_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLoops(int i2, aa aaVar) {
        Objects.requireNonNull(aaVar);
        ensureLoopsIsMutable();
        this.loops_.set(i2, aaVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaterialSpecs(int i2, x xVar) {
        Objects.requireNonNull(xVar);
        ensureMaterialSpecsIsMutable();
        this.materialSpecs_.set(i2, xVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSemanticsIndex(int i2) {
        this.bitField0_ |= 1;
        this.semanticsIndex_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002င\u0000\u0003\u001b", new Object[]{"bitField0_", "loops_", aa.class, "semanticsIndex_", "materialSpecs_", x.class});
        }
        if (iOrdinal == 3) {
            return new am();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new al(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<am> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (am.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public aa getLoops(int i2) {
        return this.loops_.get(i2);
    }

    public int getLoopsCount() {
        return this.loops_.size();
    }

    public List<aa> getLoopsList() {
        return this.loops_;
    }

    public ab getLoopsOrBuilder(int i2) {
        return this.loops_.get(i2);
    }

    public List<? extends ab> getLoopsOrBuilderList() {
        return this.loops_;
    }

    public x getMaterialSpecs(int i2) {
        return this.materialSpecs_.get(i2);
    }

    public int getMaterialSpecsCount() {
        return this.materialSpecs_.size();
    }

    public List<x> getMaterialSpecsList() {
        return this.materialSpecs_;
    }

    public y getMaterialSpecsOrBuilder(int i2) {
        return this.materialSpecs_.get(i2);
    }

    public List<? extends y> getMaterialSpecsOrBuilderList() {
        return this.materialSpecs_;
    }

    public int getSemanticsIndex() {
        return this.semanticsIndex_;
    }

    public boolean hasSemanticsIndex() {
        return (this.bitField0_ & 1) != 0;
    }

    public static al newBuilder(am amVar) {
        return (al) DEFAULT_INSTANCE.createBuilder(amVar);
    }

    public static am parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (am) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static am parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (am) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static am parseFrom(com.google.v.z zVar) {
        return (am) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static am parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (am) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLoops(aa aaVar) {
        Objects.requireNonNull(aaVar);
        ensureLoopsIsMutable();
        this.loops_.add(aaVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMaterialSpecs(x xVar) {
        Objects.requireNonNull(xVar);
        ensureMaterialSpecsIsMutable();
        this.materialSpecs_.add(xVar);
    }

    public static am parseFrom(InputStream inputStream) {
        return (am) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static am parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (am) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static am parseFrom(ByteBuffer byteBuffer) {
        return (am) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static am parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (am) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static am parseFrom(byte[] bArr) {
        return (am) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static am parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (am) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
