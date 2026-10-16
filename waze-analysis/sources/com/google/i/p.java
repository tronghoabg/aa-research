package com.google.i;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.ds;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fo;
import com.google.v.gm;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class p extends du<p, n> implements q {
    private static final p DEFAULT_INSTANCE;
    public static final int MESSAGE_SET_EXTENSION_FIELD_NUMBER = 115225276;
    private static volatile fo<p> PARSER = null;
    public static final int PROPERTY_FIELD_NUMBER = 1;
    public static final int TOTAL_VALUE_COUNT_FIELD_NUMBER = 3;
    public static final int VALUE_FIELD_NUMBER = 2;
    public static final int VALUE_STATUS_FIELD_NUMBER = 4;
    public static final ds<com.google.w.n.a.b, p> messageSetExtension;
    private int bitField0_;
    private d property_;
    private long totalValueCount_;
    private byte memoizedIsInitialized = 2;
    private eo<x> value_ = emptyProtobufList();
    private int valueStatus_ = 1;

    static {
        p pVar = new p();
        DEFAULT_INSTANCE = pVar;
        du.registerDefaultInstance(p.class, pVar);
        messageSetExtension = du.newSingularGeneratedExtension(com.google.w.n.a.b.getDefaultInstance(), getDefaultInstance(), getDefaultInstance(), null, MESSAGE_SET_EXTENSION_FIELD_NUMBER, gm.MESSAGE, p.class);
    }

    private p() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllValue(Iterable<? extends x> iterable) {
        ensureValueIsMutable();
        com.google.v.c.addAll(iterable, this.value_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addValue(int i2, x xVar) {
        Objects.requireNonNull(xVar);
        ensureValueIsMutable();
        this.value_.add(i2, xVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProperty() {
        this.property_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalValueCount() {
        this.bitField0_ &= -3;
        this.totalValueCount_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValueStatus() {
        this.bitField0_ &= -5;
        this.valueStatus_ = 1;
    }

    private void ensureValueIsMutable() {
        eo<x> eoVar = this.value_;
        if (eoVar.c()) {
            return;
        }
        this.value_ = du.mutableCopy(eoVar);
    }

    public static p getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeProperty(d dVar) {
        Objects.requireNonNull(dVar);
        d dVar2 = this.property_;
        if (dVar2 != null && dVar2 != d.getDefaultInstance()) {
            c cVarNewBuilder = d.newBuilder(dVar2);
            cVarNewBuilder.mergeFrom((c) dVar);
            dVar = cVarNewBuilder.buildPartial();
        }
        this.property_ = dVar;
        this.bitField0_ |= 1;
    }

    public static n newBuilder() {
        return (n) DEFAULT_INSTANCE.createBuilder();
    }

    public static p parseDelimitedFrom(InputStream inputStream) {
        return (p) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static p parseFrom(com.google.v.v vVar) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<p> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeValue(int i2) {
        ensureValueIsMutable();
        this.value_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProperty(d dVar) {
        Objects.requireNonNull(dVar);
        this.property_ = dVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalValueCount(long j2) {
        this.bitField0_ |= 2;
        this.totalValueCount_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(int i2, x xVar) {
        Objects.requireNonNull(xVar);
        ensureValueIsMutable();
        this.value_.set(i2, xVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValueStatus(o oVar) {
        this.valueStatus_ = oVar.getNumber();
        this.bitField0_ |= 4;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        byte[] bArr = null;
        switch (dtVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001ᐉ\u0000\u0002Л\u0003ဂ\u0001\u0004᠌\u0002", new Object[]{"bitField0_", "property_", "value_", x.class, "totalValueCount_", "valueStatus_", v.f11070b});
            case 3:
                return new p();
            case 4:
                return new n(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                fo<p> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (p.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            default:
                throw null;
        }
    }

    public d getProperty() {
        d dVar = this.property_;
        return dVar == null ? d.getDefaultInstance() : dVar;
    }

    public long getTotalValueCount() {
        return this.totalValueCount_;
    }

    public x getValue(int i2) {
        return this.value_.get(i2);
    }

    public int getValueCount() {
        return this.value_.size();
    }

    public List<x> getValueList() {
        return this.value_;
    }

    public y getValueOrBuilder(int i2) {
        return this.value_.get(i2);
    }

    public List<? extends y> getValueOrBuilderList() {
        return this.value_;
    }

    public o getValueStatus() {
        o oVarA = o.a(this.valueStatus_);
        return oVarA == null ? o.HAS_UNKNOWN_VALUE : oVarA;
    }

    public boolean hasProperty() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasTotalValueCount() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasValueStatus() {
        return (this.bitField0_ & 4) != 0;
    }

    public static n newBuilder(p pVar) {
        return (n) DEFAULT_INSTANCE.createBuilder(pVar);
    }

    public static p parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (p) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static p parseFrom(com.google.v.v vVar, de deVar) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static p parseFrom(z zVar) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static p parseFrom(z zVar, de deVar) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addValue(x xVar) {
        Objects.requireNonNull(xVar);
        ensureValueIsMutable();
        this.value_.add(xVar);
    }

    public static p parseFrom(InputStream inputStream) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static p parseFrom(InputStream inputStream, de deVar) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static p parseFrom(ByteBuffer byteBuffer) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static p parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static p parseFrom(byte[] bArr) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static p parseFrom(byte[] bArr, de deVar) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
