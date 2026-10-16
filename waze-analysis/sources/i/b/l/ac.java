package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ac extends com.google.v.du<ac, ab> implements com.google.v.fj {
    private static final ac DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ac> PARSER = null;
    public static final int RETURN_ONLY_SAFETY_INCIDENT_FREE_ALTERNATIVES_FIELD_NUMBER = 2;
    public static final int ROUTING_REQUEST_FIELD_NUMBER = 1;
    private int bitField0_;
    private byte memoizedIsInitialized = 2;
    private boolean returnOnlySafetyIncidentFreeAlternatives_;
    private pq routingRequest_;

    static {
        ac acVar = new ac();
        DEFAULT_INSTANCE = acVar;
        com.google.v.du.registerDefaultInstance(ac.class, acVar);
    }

    private ac() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReturnOnlySafetyIncidentFreeAlternatives() {
        this.bitField0_ &= -3;
        this.returnOnlySafetyIncidentFreeAlternatives_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoutingRequest() {
        this.routingRequest_ = null;
        this.bitField0_ &= -2;
    }

    public static ac getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRoutingRequest(pq pqVar) {
        Objects.requireNonNull(pqVar);
        pq pqVar2 = this.routingRequest_;
        if (pqVar2 != null && pqVar2 != pq.getDefaultInstance()) {
            pn pnVarNewBuilder = pq.newBuilder(pqVar2);
            pnVarNewBuilder.mergeFrom((pn) pqVar);
            pqVar = pnVarNewBuilder.buildPartial();
        }
        this.routingRequest_ = pqVar;
        this.bitField0_ |= 1;
    }

    public static ab newBuilder() {
        return (ab) DEFAULT_INSTANCE.createBuilder();
    }

    public static ac parseDelimitedFrom(InputStream inputStream) {
        return (ac) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ac parseFrom(com.google.v.v vVar) {
        return (ac) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ac> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReturnOnlySafetyIncidentFreeAlternatives(boolean z) {
        this.bitField0_ |= 2;
        this.returnOnlySafetyIncidentFreeAlternatives_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoutingRequest(pq pqVar) {
        Objects.requireNonNull(pqVar);
        this.routingRequest_ = pqVar;
        this.bitField0_ |= 1;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဇ\u0001", new Object[]{"bitField0_", "routingRequest_", "returnOnlySafetyIncidentFreeAlternatives_"});
            case 3:
                return new ac();
            case 4:
                return new ab(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<ac> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (ac.class) {
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

    public boolean getReturnOnlySafetyIncidentFreeAlternatives() {
        return this.returnOnlySafetyIncidentFreeAlternatives_;
    }

    public pq getRoutingRequest() {
        pq pqVar = this.routingRequest_;
        return pqVar == null ? pq.getDefaultInstance() : pqVar;
    }

    public boolean hasReturnOnlySafetyIncidentFreeAlternatives() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasRoutingRequest() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ab newBuilder(ac acVar) {
        return (ab) DEFAULT_INSTANCE.createBuilder(acVar);
    }

    public static ac parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ac) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ac parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ac) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ac parseFrom(com.google.v.z zVar) {
        return (ac) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ac parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ac) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ac parseFrom(InputStream inputStream) {
        return (ac) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ac parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ac) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ac parseFrom(ByteBuffer byteBuffer) {
        return (ac) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ac parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ac) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ac parseFrom(byte[] bArr) {
        return (ac) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ac parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ac) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
