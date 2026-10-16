package com.waze.bg.e.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ee extends com.google.v.du<ee, ed> implements com.google.v.fj {
    private static final ee DEFAULT_INSTANCE;
    public static final int DIFFERENCE_MINUTES_FIELD_NUMBER = 2;
    public static final int MIN_PASSENGERS_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<ee> PARSER = null;
    public static final int REQUIRED_PERMITS_FIELD_NUMBER = 3;
    private int bitField0_;
    private long differenceMinutes_;
    private int minPassengers_;
    private com.google.v.eo<String> requiredPermits_ = emptyProtobufList();

    static {
        ee eeVar = new ee();
        DEFAULT_INSTANCE = eeVar;
        com.google.v.du.registerDefaultInstance(ee.class, eeVar);
    }

    private ee() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRequiredPermits(Iterable<String> iterable) {
        ensureRequiredPermitsIsMutable();
        com.google.v.c.addAll(iterable, this.requiredPermits_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRequiredPermits(String str) {
        Objects.requireNonNull(str);
        ensureRequiredPermitsIsMutable();
        this.requiredPermits_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRequiredPermitsBytes(com.google.v.v vVar) {
        ensureRequiredPermitsIsMutable();
        this.requiredPermits_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDifferenceMinutes() {
        this.bitField0_ &= -3;
        this.differenceMinutes_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMinPassengers() {
        this.bitField0_ &= -2;
        this.minPassengers_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequiredPermits() {
        this.requiredPermits_ = emptyProtobufList();
    }

    private void ensureRequiredPermitsIsMutable() {
        com.google.v.eo<String> eoVar = this.requiredPermits_;
        if (eoVar.c()) {
            return;
        }
        this.requiredPermits_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static ee getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ed newBuilder() {
        return (ed) DEFAULT_INSTANCE.createBuilder();
    }

    public static ee parseDelimitedFrom(InputStream inputStream) {
        return (ee) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ee parseFrom(com.google.v.v vVar) {
        return (ee) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ee> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDifferenceMinutes(long j2) {
        this.bitField0_ |= 2;
        this.differenceMinutes_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMinPassengers(int i2) {
        this.bitField0_ |= 1;
        this.minPassengers_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequiredPermits(int i2, String str) {
        Objects.requireNonNull(str);
        ensureRequiredPermitsIsMutable();
        this.requiredPermits_.set(i2, str);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002ဂ\u0001\u0003\u001a", new Object[]{"bitField0_", "minPassengers_", "differenceMinutes_", "requiredPermits_"});
        }
        if (iOrdinal == 3) {
            return new ee();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ed(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ee> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ee.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getDifferenceMinutes() {
        return this.differenceMinutes_;
    }

    public int getMinPassengers() {
        return this.minPassengers_;
    }

    public String getRequiredPermits(int i2) {
        return this.requiredPermits_.get(i2);
    }

    public com.google.v.v getRequiredPermitsBytes(int i2) {
        return com.google.v.v.s(this.requiredPermits_.get(i2));
    }

    public int getRequiredPermitsCount() {
        return this.requiredPermits_.size();
    }

    public List<String> getRequiredPermitsList() {
        return this.requiredPermits_;
    }

    public boolean hasDifferenceMinutes() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasMinPassengers() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ed newBuilder(ee eeVar) {
        return (ed) DEFAULT_INSTANCE.createBuilder(eeVar);
    }

    public static ee parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ee) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ee parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ee) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ee parseFrom(com.google.v.z zVar) {
        return (ee) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ee parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ee) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ee parseFrom(InputStream inputStream) {
        return (ee) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ee parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ee) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ee parseFrom(ByteBuffer byteBuffer) {
        return (ee) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ee parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ee) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ee parseFrom(byte[] bArr) {
        return (ee) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ee parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ee) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
