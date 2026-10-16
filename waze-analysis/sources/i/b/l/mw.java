package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class mw extends com.google.v.du<mw, mr> implements mx {
    public static final int CALCULATE_REALTIME_ROUTE_FIELD_NUMBER = 4;
    private static final mw DEFAULT_INSTANCE;
    public static final int DESTINATION_FIELD_NUMBER = 3;
    public static final int FUTURE_ROUTE_CONSTRAINTS_FIELD_NUMBER = 5;
    public static final int IDENTIFIER_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<mw> PARSER = null;
    public static final int SOURCE_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean calculateRealtimeRoute_;
    private oi destination_;
    private or source_;
    private byte memoizedIsInitialized = 2;
    private String identifier_ = "";
    private com.google.v.eo<mu> futureRouteConstraints_ = emptyProtobufList();

    static {
        mw mwVar = new mw();
        DEFAULT_INSTANCE = mwVar;
        com.google.v.du.registerDefaultInstance(mw.class, mwVar);
    }

    private mw() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFutureRouteConstraints(Iterable<? extends mu> iterable) {
        ensureFutureRouteConstraintsIsMutable();
        com.google.v.c.addAll(iterable, this.futureRouteConstraints_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFutureRouteConstraints(int i2, mu muVar) {
        Objects.requireNonNull(muVar);
        ensureFutureRouteConstraintsIsMutable();
        this.futureRouteConstraints_.add(i2, muVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCalculateRealtimeRoute() {
        this.bitField0_ &= -9;
        this.calculateRealtimeRoute_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestination() {
        this.destination_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFutureRouteConstraints() {
        this.futureRouteConstraints_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIdentifier() {
        this.bitField0_ &= -2;
        this.identifier_ = getDefaultInstance().getIdentifier();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSource() {
        this.source_ = null;
        this.bitField0_ &= -3;
    }

    private void ensureFutureRouteConstraintsIsMutable() {
        com.google.v.eo<mu> eoVar = this.futureRouteConstraints_;
        if (eoVar.c()) {
            return;
        }
        this.futureRouteConstraints_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static mw getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDestination(oi oiVar) {
        Objects.requireNonNull(oiVar);
        oi oiVar2 = this.destination_;
        if (oiVar2 != null && oiVar2 != oi.getDefaultInstance()) {
            oh ohVarNewBuilder = oi.newBuilder(oiVar2);
            ohVarNewBuilder.mergeFrom((oh) oiVar);
            oiVar = ohVarNewBuilder.buildPartial();
        }
        this.destination_ = oiVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSource(or orVar) {
        Objects.requireNonNull(orVar);
        or orVar2 = this.source_;
        if (orVar2 != null && orVar2 != or.getDefaultInstance()) {
            oq oqVarNewBuilder = or.newBuilder(orVar2);
            oqVarNewBuilder.mergeFrom((oq) orVar);
            orVar = oqVarNewBuilder.buildPartial();
        }
        this.source_ = orVar;
        this.bitField0_ |= 2;
    }

    public static mr newBuilder() {
        return (mr) DEFAULT_INSTANCE.createBuilder();
    }

    public static mw parseDelimitedFrom(InputStream inputStream) {
        return (mw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static mw parseFrom(com.google.v.v vVar) {
        return (mw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<mw> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFutureRouteConstraints(int i2) {
        ensureFutureRouteConstraintsIsMutable();
        this.futureRouteConstraints_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCalculateRealtimeRoute(boolean z) {
        this.bitField0_ |= 8;
        this.calculateRealtimeRoute_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestination(oi oiVar) {
        Objects.requireNonNull(oiVar);
        this.destination_ = oiVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFutureRouteConstraints(int i2, mu muVar) {
        Objects.requireNonNull(muVar);
        ensureFutureRouteConstraintsIsMutable();
        this.futureRouteConstraints_.set(i2, muVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdentifier(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.identifier_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdentifierBytes(com.google.v.v vVar) {
        this.identifier_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSource(or orVar) {
        Objects.requireNonNull(orVar);
        this.source_ = orVar;
        this.bitField0_ |= 2;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဈ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002\u0004ဇ\u0003\u0005\u001b", new Object[]{"bitField0_", "identifier_", "source_", "destination_", "calculateRealtimeRoute_", "futureRouteConstraints_", mu.class});
            case 3:
                return new mw();
            case 4:
                return new mr(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<mw> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (mw.class) {
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

    public boolean getCalculateRealtimeRoute() {
        return this.calculateRealtimeRoute_;
    }

    public oi getDestination() {
        oi oiVar = this.destination_;
        return oiVar == null ? oi.getDefaultInstance() : oiVar;
    }

    public mu getFutureRouteConstraints(int i2) {
        return this.futureRouteConstraints_.get(i2);
    }

    public int getFutureRouteConstraintsCount() {
        return this.futureRouteConstraints_.size();
    }

    public List<mu> getFutureRouteConstraintsList() {
        return this.futureRouteConstraints_;
    }

    public mv getFutureRouteConstraintsOrBuilder(int i2) {
        return this.futureRouteConstraints_.get(i2);
    }

    public List<? extends mv> getFutureRouteConstraintsOrBuilderList() {
        return this.futureRouteConstraints_;
    }

    public String getIdentifier() {
        return this.identifier_;
    }

    public com.google.v.v getIdentifierBytes() {
        return com.google.v.v.s(this.identifier_);
    }

    public or getSource() {
        or orVar = this.source_;
        return orVar == null ? or.getDefaultInstance() : orVar;
    }

    public boolean hasCalculateRealtimeRoute() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasDestination() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasIdentifier() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasSource() {
        return (this.bitField0_ & 2) != 0;
    }

    public static mr newBuilder(mw mwVar) {
        return (mr) DEFAULT_INSTANCE.createBuilder(mwVar);
    }

    public static mw parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (mw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static mw parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (mw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static mw parseFrom(com.google.v.z zVar) {
        return (mw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static mw parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (mw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFutureRouteConstraints(mu muVar) {
        Objects.requireNonNull(muVar);
        ensureFutureRouteConstraintsIsMutable();
        this.futureRouteConstraints_.add(muVar);
    }

    public static mw parseFrom(InputStream inputStream) {
        return (mw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static mw parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (mw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static mw parseFrom(ByteBuffer byteBuffer) {
        return (mw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static mw parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (mw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static mw parseFrom(byte[] bArr) {
        return (mw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static mw parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (mw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
