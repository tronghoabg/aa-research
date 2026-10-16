package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class awa extends com.google.v.du<awa, avz> implements com.google.v.fj {
    public static final int ALTERNATIVE_ROUTE_UUID_FIELD_NUMBER = 1;
    private static final awa DEFAULT_INSTANCE;
    public static final int EVENTS_TIMELINE_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<awa> PARSER;
    private String alternativeRouteUuid_ = "";
    private int bitField0_;
    private vv eventsTimeline_;

    static {
        awa awaVar = new awa();
        DEFAULT_INSTANCE = awaVar;
        com.google.v.du.registerDefaultInstance(awa.class, awaVar);
    }

    private awa() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlternativeRouteUuid() {
        this.alternativeRouteUuid_ = getDefaultInstance().getAlternativeRouteUuid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEventsTimeline() {
        this.eventsTimeline_ = null;
        this.bitField0_ &= -2;
    }

    public static awa getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEventsTimeline(vv vvVar) {
        Objects.requireNonNull(vvVar);
        vv vvVar2 = this.eventsTimeline_;
        if (vvVar2 != null && vvVar2 != vv.getDefaultInstance()) {
            vu vuVarNewBuilder = vv.newBuilder(vvVar2);
            vuVarNewBuilder.mergeFrom((vu) vvVar);
            vvVar = vuVarNewBuilder.buildPartial();
        }
        this.eventsTimeline_ = vvVar;
        this.bitField0_ |= 1;
    }

    public static avz newBuilder() {
        return (avz) DEFAULT_INSTANCE.createBuilder();
    }

    public static awa parseDelimitedFrom(InputStream inputStream) {
        return (awa) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static awa parseFrom(com.google.v.v vVar) {
        return (awa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<awa> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlternativeRouteUuid(String str) {
        Objects.requireNonNull(str);
        this.alternativeRouteUuid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlternativeRouteUuidBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.alternativeRouteUuid_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventsTimeline(vv vvVar) {
        Objects.requireNonNull(vvVar);
        this.eventsTimeline_ = vvVar;
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "alternativeRouteUuid_", "eventsTimeline_"});
        }
        if (iOrdinal == 3) {
            return new awa();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new avz(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<awa> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (awa.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getAlternativeRouteUuid() {
        return this.alternativeRouteUuid_;
    }

    public com.google.v.v getAlternativeRouteUuidBytes() {
        return com.google.v.v.s(this.alternativeRouteUuid_);
    }

    public vv getEventsTimeline() {
        vv vvVar = this.eventsTimeline_;
        return vvVar == null ? vv.getDefaultInstance() : vvVar;
    }

    public boolean hasEventsTimeline() {
        return (this.bitField0_ & 1) != 0;
    }

    public static avz newBuilder(awa awaVar) {
        return (avz) DEFAULT_INSTANCE.createBuilder(awaVar);
    }

    public static awa parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (awa) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static awa parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (awa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static awa parseFrom(com.google.v.z zVar) {
        return (awa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static awa parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (awa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static awa parseFrom(InputStream inputStream) {
        return (awa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static awa parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (awa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static awa parseFrom(ByteBuffer byteBuffer) {
        return (awa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static awa parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (awa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static awa parseFrom(byte[] bArr) {
        return (awa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static awa parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (awa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
