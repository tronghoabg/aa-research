package com.waze.bg.e.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class aq extends com.google.v.du<aq, ap> implements com.google.v.fj {
    private static final aq DEFAULT_INSTANCE;
    public static final int DETOURS_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<aq> PARSER = null;
    public static final int ROUTE_FIELD_NUMBER = 1;
    public static final int START_NAVIGATION_INFO_FIELD_NUMBER = 3;
    private int bitField0_;
    private com.google.v.eo<da> detours_ = emptyProtobufList();
    private ec route_;
    private hm startNavigationInfo_;

    static {
        aq aqVar = new aq();
        DEFAULT_INSTANCE = aqVar;
        com.google.v.du.registerDefaultInstance(aq.class, aqVar);
    }

    private aq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDetours(Iterable<? extends da> iterable) {
        ensureDetoursIsMutable();
        com.google.v.c.addAll(iterable, this.detours_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDetours(int i2, da daVar) {
        Objects.requireNonNull(daVar);
        ensureDetoursIsMutable();
        this.detours_.add(i2, daVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDetours() {
        this.detours_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoute() {
        this.route_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartNavigationInfo() {
        this.startNavigationInfo_ = null;
        this.bitField0_ &= -3;
    }

    private void ensureDetoursIsMutable() {
        com.google.v.eo<da> eoVar = this.detours_;
        if (eoVar.c()) {
            return;
        }
        this.detours_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static aq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRoute(ec ecVar) {
        Objects.requireNonNull(ecVar);
        ec ecVar2 = this.route_;
        if (ecVar2 != null && ecVar2 != ec.getDefaultInstance()) {
            eb ebVarNewBuilder = ec.newBuilder(ecVar2);
            ebVarNewBuilder.mergeFrom((eb) ecVar);
            ecVar = ebVarNewBuilder.buildPartial();
        }
        this.route_ = ecVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStartNavigationInfo(hm hmVar) {
        Objects.requireNonNull(hmVar);
        hm hmVar2 = this.startNavigationInfo_;
        if (hmVar2 != null && hmVar2 != hm.getDefaultInstance()) {
            hl hlVarNewBuilder = hm.newBuilder(hmVar2);
            hlVarNewBuilder.mergeFrom((hl) hmVar);
            hmVar = hlVarNewBuilder.buildPartial();
        }
        this.startNavigationInfo_ = hmVar;
        this.bitField0_ |= 2;
    }

    public static ap newBuilder() {
        return (ap) DEFAULT_INSTANCE.createBuilder();
    }

    public static aq parseDelimitedFrom(InputStream inputStream) {
        return (aq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aq parseFrom(com.google.v.v vVar) {
        return (aq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDetours(int i2) {
        ensureDetoursIsMutable();
        this.detours_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDetours(int i2, da daVar) {
        Objects.requireNonNull(daVar);
        ensureDetoursIsMutable();
        this.detours_.set(i2, daVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoute(ec ecVar) {
        Objects.requireNonNull(ecVar);
        this.route_ = ecVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartNavigationInfo(hm hmVar) {
        Objects.requireNonNull(hmVar);
        this.startNavigationInfo_ = hmVar;
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဉ\u0001", new Object[]{"bitField0_", "route_", "detours_", da.class, "startNavigationInfo_"});
        }
        if (iOrdinal == 3) {
            return new aq();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ap(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aq> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aq.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Deprecated
    public da getDetours(int i2) {
        return this.detours_.get(i2);
    }

    @Deprecated
    public int getDetoursCount() {
        return this.detours_.size();
    }

    @Deprecated
    public List<da> getDetoursList() {
        return this.detours_;
    }

    @Deprecated
    public dd getDetoursOrBuilder(int i2) {
        return this.detours_.get(i2);
    }

    @Deprecated
    public List<? extends dd> getDetoursOrBuilderList() {
        return this.detours_;
    }

    @Deprecated
    public ec getRoute() {
        ec ecVar = this.route_;
        return ecVar == null ? ec.getDefaultInstance() : ecVar;
    }

    public hm getStartNavigationInfo() {
        hm hmVar = this.startNavigationInfo_;
        return hmVar == null ? hm.getDefaultInstance() : hmVar;
    }

    @Deprecated
    public boolean hasRoute() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasStartNavigationInfo() {
        return (this.bitField0_ & 2) != 0;
    }

    public static ap newBuilder(aq aqVar) {
        return (ap) DEFAULT_INSTANCE.createBuilder(aqVar);
    }

    public static aq parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aq parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aq parseFrom(com.google.v.z zVar) {
        return (aq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aq parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDetours(da daVar) {
        Objects.requireNonNull(daVar);
        ensureDetoursIsMutable();
        this.detours_.add(daVar);
    }

    public static aq parseFrom(InputStream inputStream) {
        return (aq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aq parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aq parseFrom(ByteBuffer byteBuffer) {
        return (aq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aq parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aq parseFrom(byte[] bArr) {
        return (aq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aq parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
