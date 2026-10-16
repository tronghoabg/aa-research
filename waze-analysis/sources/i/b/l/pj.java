package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class pj extends com.google.v.du<pj, pg> implements com.google.v.fj {
    public static final int ACCEPTED_REASON_FIELD_NUMBER = 2;
    public static final int ALTERNATIVE_ROUTE_UUID_FIELD_NUMBER = 1;
    public static final int DECLINED_REASON_FIELD_NUMBER = 3;
    private static final pj DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<pj> PARSER;
    private int bitField0_;
    private Object oneofReason_;
    private int oneofReasonCase_ = 0;
    private String alternativeRouteUuid_ = "";

    static {
        pj pjVar = new pj();
        DEFAULT_INSTANCE = pjVar;
        com.google.v.du.registerDefaultInstance(pj.class, pjVar);
    }

    private pj() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAcceptedReason() {
        if (this.oneofReasonCase_ == 2) {
            this.oneofReasonCase_ = 0;
            this.oneofReason_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlternativeRouteUuid() {
        this.bitField0_ &= -2;
        this.alternativeRouteUuid_ = getDefaultInstance().getAlternativeRouteUuid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeclinedReason() {
        if (this.oneofReasonCase_ == 3) {
            this.oneofReasonCase_ = 0;
            this.oneofReason_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOneofReason() {
        this.oneofReasonCase_ = 0;
        this.oneofReason_ = null;
    }

    public static pj getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static pg newBuilder() {
        return (pg) DEFAULT_INSTANCE.createBuilder();
    }

    public static pj parseDelimitedFrom(InputStream inputStream) {
        return (pj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static pj parseFrom(com.google.v.v vVar) {
        return (pj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<pj> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAcceptedReason(pf pfVar) {
        this.oneofReason_ = Integer.valueOf(pfVar.getNumber());
        this.oneofReasonCase_ = 2;
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
    public void setDeclinedReason(ph phVar) {
        this.oneofReason_ = Integer.valueOf(phVar.getNumber());
        this.oneofReasonCase_ = 3;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002\u083f\u0000\u0003\u083f\u0000", new Object[]{"oneofReason_", "oneofReasonCase_", "bitField0_", "alternativeRouteUuid_", pa.f48954c, pa.f48955d});
        }
        if (iOrdinal == 3) {
            return new pj();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new pg(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<pj> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (pj.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public pf getAcceptedReason() {
        pf pfVarA;
        return (this.oneofReasonCase_ != 2 || (pfVarA = pf.a(((Integer) this.oneofReason_).intValue())) == null) ? pf.ACCEPT_REASON_UNSPECIFIED : pfVarA;
    }

    public String getAlternativeRouteUuid() {
        return this.alternativeRouteUuid_;
    }

    public com.google.v.v getAlternativeRouteUuidBytes() {
        return com.google.v.v.s(this.alternativeRouteUuid_);
    }

    public ph getDeclinedReason() {
        ph phVarA;
        return (this.oneofReasonCase_ != 3 || (phVarA = ph.a(((Integer) this.oneofReason_).intValue())) == null) ? ph.DECLINE_REASON_UNSPECIFIED : phVarA;
    }

    public pi getOneofReasonCase() {
        int i2 = this.oneofReasonCase_;
        if (i2 == 0) {
            return pi.f48988c;
        }
        if (i2 == 2) {
            return pi.f48986a;
        }
        if (i2 != 3) {
            return null;
        }
        return pi.f48987b;
    }

    public boolean hasAcceptedReason() {
        return this.oneofReasonCase_ == 2;
    }

    public boolean hasAlternativeRouteUuid() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasDeclinedReason() {
        return this.oneofReasonCase_ == 3;
    }

    public static pg newBuilder(pj pjVar) {
        return (pg) DEFAULT_INSTANCE.createBuilder(pjVar);
    }

    public static pj parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (pj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static pj parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (pj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static pj parseFrom(com.google.v.z zVar) {
        return (pj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static pj parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (pj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static pj parseFrom(InputStream inputStream) {
        return (pj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static pj parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (pj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static pj parseFrom(ByteBuffer byteBuffer) {
        return (pj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static pj parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (pj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static pj parseFrom(byte[] bArr) {
        return (pj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static pj parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (pj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
