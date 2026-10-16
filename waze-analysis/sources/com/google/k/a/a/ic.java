package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ic extends com.google.v.du<ic, ib> implements com.google.v.fj {
    private static final ic DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ic> PARSER = null;
    public static final int QUANTITY_FIELD_NUMBER = 1;
    public static final int UNIT_FIELD_NUMBER = 2;
    private int bitField0_;
    private int quantity_;
    private com.google.v.eo<iz> unit_ = emptyProtobufList();

    static {
        ic icVar = new ic();
        DEFAULT_INSTANCE = icVar;
        com.google.v.du.registerDefaultInstance(ic.class, icVar);
    }

    private ic() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllUnit(Iterable<? extends iz> iterable) {
        ensureUnitIsMutable();
        com.google.v.c.addAll(iterable, this.unit_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUnit(int i2, iz izVar) {
        Objects.requireNonNull(izVar);
        ensureUnitIsMutable();
        this.unit_.add(i2, izVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuantity() {
        this.bitField0_ &= -2;
        this.quantity_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnit() {
        this.unit_ = emptyProtobufList();
    }

    private void ensureUnitIsMutable() {
        com.google.v.eo<iz> eoVar = this.unit_;
        if (eoVar.c()) {
            return;
        }
        this.unit_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static ic getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ib newBuilder() {
        return (ib) DEFAULT_INSTANCE.createBuilder();
    }

    public static ic parseDelimitedFrom(InputStream inputStream) {
        return (ic) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ic parseFrom(com.google.v.v vVar) {
        return (ic) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ic> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeUnit(int i2) {
        ensureUnitIsMutable();
        this.unit_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuantity(int i2) {
        this.bitField0_ |= 1;
        this.quantity_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnit(int i2, iz izVar) {
        Objects.requireNonNull(izVar);
        ensureUnitIsMutable();
        this.unit_.set(i2, izVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u001b", new Object[]{"bitField0_", "quantity_", "unit_", iz.class});
        }
        if (iOrdinal == 3) {
            return new ic();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ib(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ic> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ic.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getQuantity() {
        return this.quantity_;
    }

    public iz getUnit(int i2) {
        return this.unit_.get(i2);
    }

    public int getUnitCount() {
        return this.unit_.size();
    }

    public List<iz> getUnitList() {
        return this.unit_;
    }

    public ja getUnitOrBuilder(int i2) {
        return this.unit_.get(i2);
    }

    public List<? extends ja> getUnitOrBuilderList() {
        return this.unit_;
    }

    public boolean hasQuantity() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ib newBuilder(ic icVar) {
        return (ib) DEFAULT_INSTANCE.createBuilder(icVar);
    }

    public static ic parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ic) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ic parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ic) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ic parseFrom(com.google.v.z zVar) {
        return (ic) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ic parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ic) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUnit(iz izVar) {
        Objects.requireNonNull(izVar);
        ensureUnitIsMutable();
        this.unit_.add(izVar);
    }

    public static ic parseFrom(InputStream inputStream) {
        return (ic) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ic parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ic) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ic parseFrom(ByteBuffer byteBuffer) {
        return (ic) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ic parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ic) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ic parseFrom(byte[] bArr) {
        return (ic) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ic parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ic) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
