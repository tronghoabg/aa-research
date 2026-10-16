package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ex extends com.google.v.du<ex, et> implements com.google.v.fj {
    private static final ex DEFAULT_INSTANCE;
    public static final int DISALLOWED_CONNECTIONS_FIELD_NUMBER = 2;
    public static final int DISALLOWED_PRIMARY_CONNECTION_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<ex> PARSER = null;
    public static final int TRAVEL_ALLOWANCE_FIELD_NUMBER = 1;
    private byte memoizedIsInitialized = 2;
    private com.google.v.eo<com.google.k.a.a.b.gk> travelAllowance_ = emptyProtobufList();
    private com.google.v.eo<ev> disallowedConnections_ = emptyProtobufList();
    private com.google.v.eo<ev> disallowedPrimaryConnection_ = emptyProtobufList();

    static {
        ex exVar = new ex();
        DEFAULT_INSTANCE = exVar;
        com.google.v.du.registerDefaultInstance(ex.class, exVar);
    }

    private ex() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDisallowedConnections(Iterable<? extends ev> iterable) {
        ensureDisallowedConnectionsIsMutable();
        com.google.v.c.addAll(iterable, this.disallowedConnections_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDisallowedPrimaryConnection(Iterable<? extends ev> iterable) {
        ensureDisallowedPrimaryConnectionIsMutable();
        com.google.v.c.addAll(iterable, this.disallowedPrimaryConnection_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTravelAllowance(Iterable<? extends com.google.k.a.a.b.gk> iterable) {
        ensureTravelAllowanceIsMutable();
        com.google.v.c.addAll(iterable, this.travelAllowance_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDisallowedConnections(int i2, ev evVar) {
        Objects.requireNonNull(evVar);
        ensureDisallowedConnectionsIsMutable();
        this.disallowedConnections_.add(i2, evVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDisallowedPrimaryConnection(int i2, ev evVar) {
        Objects.requireNonNull(evVar);
        ensureDisallowedPrimaryConnectionIsMutable();
        this.disallowedPrimaryConnection_.add(i2, evVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTravelAllowance(int i2, com.google.k.a.a.b.gk gkVar) {
        Objects.requireNonNull(gkVar);
        ensureTravelAllowanceIsMutable();
        this.travelAllowance_.add(i2, gkVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisallowedConnections() {
        this.disallowedConnections_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisallowedPrimaryConnection() {
        this.disallowedPrimaryConnection_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTravelAllowance() {
        this.travelAllowance_ = emptyProtobufList();
    }

    private void ensureDisallowedConnectionsIsMutable() {
        com.google.v.eo<ev> eoVar = this.disallowedConnections_;
        if (eoVar.c()) {
            return;
        }
        this.disallowedConnections_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureDisallowedPrimaryConnectionIsMutable() {
        com.google.v.eo<ev> eoVar = this.disallowedPrimaryConnection_;
        if (eoVar.c()) {
            return;
        }
        this.disallowedPrimaryConnection_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureTravelAllowanceIsMutable() {
        com.google.v.eo<com.google.k.a.a.b.gk> eoVar = this.travelAllowance_;
        if (eoVar.c()) {
            return;
        }
        this.travelAllowance_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static ex getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static et newBuilder() {
        return (et) DEFAULT_INSTANCE.createBuilder();
    }

    public static ex parseDelimitedFrom(InputStream inputStream) {
        return (ex) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ex parseFrom(com.google.v.v vVar) {
        return (ex) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ex> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDisallowedConnections(int i2) {
        ensureDisallowedConnectionsIsMutable();
        this.disallowedConnections_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDisallowedPrimaryConnection(int i2) {
        ensureDisallowedPrimaryConnectionIsMutable();
        this.disallowedPrimaryConnection_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTravelAllowance(int i2) {
        ensureTravelAllowanceIsMutable();
        this.travelAllowance_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisallowedConnections(int i2, ev evVar) {
        Objects.requireNonNull(evVar);
        ensureDisallowedConnectionsIsMutable();
        this.disallowedConnections_.set(i2, evVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisallowedPrimaryConnection(int i2, ev evVar) {
        Objects.requireNonNull(evVar);
        ensureDisallowedPrimaryConnectionIsMutable();
        this.disallowedPrimaryConnection_.set(i2, evVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTravelAllowance(int i2, com.google.k.a.a.b.gk gkVar) {
        Objects.requireNonNull(gkVar);
        ensureTravelAllowanceIsMutable();
        this.travelAllowance_.set(i2, gkVar);
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0003\u0001Л\u0002Л\u0003Л", new Object[]{"travelAllowance_", com.google.k.a.a.b.gk.class, "disallowedConnections_", ev.class, "disallowedPrimaryConnection_", ev.class});
            case 3:
                return new ex();
            case 4:
                return new et(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<ex> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (ex.class) {
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

    public ev getDisallowedConnections(int i2) {
        return this.disallowedConnections_.get(i2);
    }

    public int getDisallowedConnectionsCount() {
        return this.disallowedConnections_.size();
    }

    public List<ev> getDisallowedConnectionsList() {
        return this.disallowedConnections_;
    }

    public ew getDisallowedConnectionsOrBuilder(int i2) {
        return this.disallowedConnections_.get(i2);
    }

    public List<? extends ew> getDisallowedConnectionsOrBuilderList() {
        return this.disallowedConnections_;
    }

    public ev getDisallowedPrimaryConnection(int i2) {
        return this.disallowedPrimaryConnection_.get(i2);
    }

    public int getDisallowedPrimaryConnectionCount() {
        return this.disallowedPrimaryConnection_.size();
    }

    public List<ev> getDisallowedPrimaryConnectionList() {
        return this.disallowedPrimaryConnection_;
    }

    public ew getDisallowedPrimaryConnectionOrBuilder(int i2) {
        return this.disallowedPrimaryConnection_.get(i2);
    }

    public List<? extends ew> getDisallowedPrimaryConnectionOrBuilderList() {
        return this.disallowedPrimaryConnection_;
    }

    public com.google.k.a.a.b.gk getTravelAllowance(int i2) {
        return this.travelAllowance_.get(i2);
    }

    public int getTravelAllowanceCount() {
        return this.travelAllowance_.size();
    }

    public List<com.google.k.a.a.b.gk> getTravelAllowanceList() {
        return this.travelAllowance_;
    }

    public com.google.k.a.a.b.gl getTravelAllowanceOrBuilder(int i2) {
        return this.travelAllowance_.get(i2);
    }

    public List<? extends com.google.k.a.a.b.gl> getTravelAllowanceOrBuilderList() {
        return this.travelAllowance_;
    }

    public static et newBuilder(ex exVar) {
        return (et) DEFAULT_INSTANCE.createBuilder(exVar);
    }

    public static ex parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ex) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ex parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ex) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ex parseFrom(com.google.v.z zVar) {
        return (ex) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ex parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ex) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDisallowedConnections(ev evVar) {
        Objects.requireNonNull(evVar);
        ensureDisallowedConnectionsIsMutable();
        this.disallowedConnections_.add(evVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDisallowedPrimaryConnection(ev evVar) {
        Objects.requireNonNull(evVar);
        ensureDisallowedPrimaryConnectionIsMutable();
        this.disallowedPrimaryConnection_.add(evVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTravelAllowance(com.google.k.a.a.b.gk gkVar) {
        Objects.requireNonNull(gkVar);
        ensureTravelAllowanceIsMutable();
        this.travelAllowance_.add(gkVar);
    }

    public static ex parseFrom(InputStream inputStream) {
        return (ex) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ex parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ex) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ex parseFrom(ByteBuffer byteBuffer) {
        return (ex) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ex parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ex) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ex parseFrom(byte[] bArr) {
        return (ex) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ex parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ex) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
