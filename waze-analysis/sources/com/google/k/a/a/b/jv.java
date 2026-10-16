package com.google.k.a.a.b;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class jv extends com.google.v.du<jv, jt> implements jw {
    public static final int COMPONENT_TYPE_FIELD_NUMBER = 2;
    private static final jv DEFAULT_INSTANCE;
    public static final int INTERVAL_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<jv> PARSER;
    private int bitField0_;
    private int componentType_;
    private com.google.v.eo<kg> interval_ = emptyProtobufList();

    static {
        jv jvVar = new jv();
        DEFAULT_INSTANCE = jvVar;
        com.google.v.du.registerDefaultInstance(jv.class, jvVar);
    }

    private jv() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllInterval(Iterable<? extends kg> iterable) {
        ensureIntervalIsMutable();
        com.google.v.c.addAll(iterable, this.interval_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addInterval(int i2, kg kgVar) {
        Objects.requireNonNull(kgVar);
        ensureIntervalIsMutable();
        this.interval_.add(i2, kgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearComponentType() {
        this.bitField0_ &= -2;
        this.componentType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInterval() {
        this.interval_ = emptyProtobufList();
    }

    private void ensureIntervalIsMutable() {
        com.google.v.eo<kg> eoVar = this.interval_;
        if (eoVar.c()) {
            return;
        }
        this.interval_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static jv getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static jt newBuilder() {
        return (jt) DEFAULT_INSTANCE.createBuilder();
    }

    public static jv parseDelimitedFrom(InputStream inputStream) {
        return (jv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static jv parseFrom(com.google.v.v vVar) {
        return (jv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<jv> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeInterval(int i2) {
        ensureIntervalIsMutable();
        this.interval_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setComponentType(ju juVar) {
        this.componentType_ = juVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInterval(int i2, kg kgVar) {
        Objects.requireNonNull(kgVar);
        ensureIntervalIsMutable();
        this.interval_.set(i2, kgVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002᠌\u0000", new Object[]{"bitField0_", "interval_", kg.class, "componentType_", hs.t});
        }
        if (iOrdinal == 3) {
            return new jv();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new jt(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<jv> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (jv.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ju getComponentType() {
        ju juVarA = ju.a(this.componentType_);
        return juVarA == null ? ju.COMPONENT_TYPE_POSITIVE : juVarA;
    }

    public kg getInterval(int i2) {
        return this.interval_.get(i2);
    }

    public int getIntervalCount() {
        return this.interval_.size();
    }

    public List<kg> getIntervalList() {
        return this.interval_;
    }

    public kh getIntervalOrBuilder(int i2) {
        return this.interval_.get(i2);
    }

    public List<? extends kh> getIntervalOrBuilderList() {
        return this.interval_;
    }

    public boolean hasComponentType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static jt newBuilder(jv jvVar) {
        return (jt) DEFAULT_INSTANCE.createBuilder(jvVar);
    }

    public static jv parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (jv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static jv parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (jv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static jv parseFrom(com.google.v.z zVar) {
        return (jv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static jv parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (jv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addInterval(kg kgVar) {
        Objects.requireNonNull(kgVar);
        ensureIntervalIsMutable();
        this.interval_.add(kgVar);
    }

    public static jv parseFrom(InputStream inputStream) {
        return (jv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static jv parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (jv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static jv parseFrom(ByteBuffer byteBuffer) {
        return (jv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static jv parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (jv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static jv parseFrom(byte[] bArr) {
        return (jv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static jv parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (jv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
