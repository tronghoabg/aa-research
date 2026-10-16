package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class pc extends com.google.v.du<pc, oz> implements com.google.v.fj {
    public static final int ALTERNATIVE_ROUTE_UUID_FIELD_NUMBER = 1;
    private static final pc DEFAULT_INSTANCE;
    public static final int DETOURID_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<pc> PARSER = null;
    public static final int REMOVEREASON_FIELD_NUMBER = 3;
    private String alternativeRouteUuid_ = "";
    private int bitField0_;
    private long detourId_;
    private int removeReason_;

    static {
        pc pcVar = new pc();
        DEFAULT_INSTANCE = pcVar;
        com.google.v.du.registerDefaultInstance(pc.class, pcVar);
    }

    private pc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlternativeRouteUuid() {
        this.bitField0_ &= -2;
        this.alternativeRouteUuid_ = getDefaultInstance().getAlternativeRouteUuid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDetourId() {
        this.bitField0_ &= -3;
        this.detourId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRemoveReason() {
        this.bitField0_ &= -5;
        this.removeReason_ = 0;
    }

    public static pc getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static oz newBuilder() {
        return (oz) DEFAULT_INSTANCE.createBuilder();
    }

    public static pc parseDelimitedFrom(InputStream inputStream) {
        return (pc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static pc parseFrom(com.google.v.v vVar) {
        return (pc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<pc> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlternativeRouteUuid(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.alternativeRouteUuid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlternativeRouteUuidBytes(com.google.v.v vVar) {
        this.alternativeRouteUuid_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDetourId(long j2) {
        this.bitField0_ |= 2;
        this.detourId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRemoveReason(pb pbVar) {
        this.removeReason_ = pbVar.getNumber();
        this.bitField0_ |= 4;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003᠌\u0002", new Object[]{"bitField0_", "alternativeRouteUuid_", "detourId_", "removeReason_", pa.f48952a});
        }
        if (iOrdinal == 3) {
            return new pc();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new oz(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<pc> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (pc.class) {
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

    public long getDetourId() {
        return this.detourId_;
    }

    public pb getRemoveReason() {
        pb pbVarA = pb.a(this.removeReason_);
        return pbVarA == null ? pb.DETOUR_REMOVE_REASON_UNSPECIFIED : pbVarA;
    }

    public boolean hasAlternativeRouteUuid() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasDetourId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasRemoveReason() {
        return (this.bitField0_ & 4) != 0;
    }

    public static oz newBuilder(pc pcVar) {
        return (oz) DEFAULT_INSTANCE.createBuilder(pcVar);
    }

    public static pc parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (pc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static pc parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (pc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static pc parseFrom(com.google.v.z zVar) {
        return (pc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static pc parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (pc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static pc parseFrom(InputStream inputStream) {
        return (pc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static pc parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (pc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static pc parseFrom(ByteBuffer byteBuffer) {
        return (pc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static pc parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (pc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static pc parseFrom(byte[] bArr) {
        return (pc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static pc parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (pc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
