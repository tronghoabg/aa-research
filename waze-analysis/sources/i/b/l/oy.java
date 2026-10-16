package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class oy extends com.google.v.du<oy, ox> implements com.google.v.fj {
    public static final int ALTERNATIVE_ROUTE_UUID_FIELD_NUMBER = 1;
    private static final oy DEFAULT_INSTANCE;
    public static final int DETOURID_FIELD_NUMBER = 2;
    public static final int DETOURLABEL_FIELD_NUMBER = 9;
    public static final int DETOURTOTALSECONDS_FIELD_NUMBER = 4;
    public static final int MAINALERTSUBTYPE_FIELD_NUMBER = 6;
    public static final int MAINALERTTYPE_FIELD_NUMBER = 5;
    public static final int NAIVETOTALSECONDS_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<oy> PARSER = null;
    public static final int TRENDINGUP_FIELD_NUMBER = 7;
    private String alternativeRouteUuid_ = "";
    private int bitField0_;
    private long detourId_;
    private rd detourLabel_;
    private long detourTotalSeconds_;
    private int mainAlertSubType_;
    private int mainAlertType_;
    private long naiveTotalSeconds_;
    private boolean trendingUp_;

    static {
        oy oyVar = new oy();
        DEFAULT_INSTANCE = oyVar;
        com.google.v.du.registerDefaultInstance(oy.class, oyVar);
    }

    private oy() {
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
    public void clearDetourLabel() {
        this.detourLabel_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDetourTotalSeconds() {
        this.bitField0_ &= -9;
        this.detourTotalSeconds_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMainAlertSubType() {
        this.bitField0_ &= -129;
        this.mainAlertSubType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMainAlertType() {
        this.bitField0_ &= -65;
        this.mainAlertType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNaiveTotalSeconds() {
        this.bitField0_ &= -5;
        this.naiveTotalSeconds_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrendingUp() {
        this.bitField0_ &= -17;
        this.trendingUp_ = false;
    }

    public static oy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDetourLabel(rd rdVar) {
        Objects.requireNonNull(rdVar);
        rd rdVar2 = this.detourLabel_;
        if (rdVar2 != null && rdVar2 != rd.getDefaultInstance()) {
            ra raVarNewBuilder = rd.newBuilder(rdVar2);
            raVarNewBuilder.mergeFrom((ra) rdVar);
            rdVar = raVarNewBuilder.buildPartial();
        }
        this.detourLabel_ = rdVar;
        this.bitField0_ |= 32;
    }

    public static ox newBuilder() {
        return (ox) DEFAULT_INSTANCE.createBuilder();
    }

    public static oy parseDelimitedFrom(InputStream inputStream) {
        return (oy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static oy parseFrom(com.google.v.v vVar) {
        return (oy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<oy> parser() {
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
    public void setDetourLabel(rd rdVar) {
        Objects.requireNonNull(rdVar);
        this.detourLabel_ = rdVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDetourTotalSeconds(long j2) {
        this.bitField0_ |= 8;
        this.detourTotalSeconds_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMainAlertSubType(i.b.j jVar) {
        this.mainAlertSubType_ = jVar.getNumber();
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMainAlertType(i.b.l lVar) {
        this.mainAlertType_ = lVar.getNumber();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNaiveTotalSeconds(long j2) {
        this.bitField0_ |= 4;
        this.naiveTotalSeconds_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrendingUp(boolean z) {
        this.bitField0_ |= 16;
        this.trendingUp_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005᠌\u0006\u0006᠌\u0007\u0007ဇ\u0004\tဉ\u0005", new Object[]{"bitField0_", "alternativeRouteUuid_", "detourId_", "naiveTotalSeconds_", "detourTotalSeconds_", "mainAlertType_", i.b.l.a(), "mainAlertSubType_", i.b.j.a(), "trendingUp_", "detourLabel_"});
        }
        if (iOrdinal == 3) {
            return new oy();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ox(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<oy> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (oy.class) {
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

    public rd getDetourLabel() {
        rd rdVar = this.detourLabel_;
        return rdVar == null ? rd.getDefaultInstance() : rdVar;
    }

    public long getDetourTotalSeconds() {
        return this.detourTotalSeconds_;
    }

    @Deprecated
    public i.b.j getMainAlertSubType() {
        i.b.j jVarB = i.b.j.b(this.mainAlertSubType_);
        return jVarB == null ? i.b.j.NO_SUBTYPE : jVarB;
    }

    @Deprecated
    public i.b.l getMainAlertType() {
        i.b.l lVarB = i.b.l.b(this.mainAlertType_);
        return lVarB == null ? i.b.l.CHIT_CHAT : lVarB;
    }

    public long getNaiveTotalSeconds() {
        return this.naiveTotalSeconds_;
    }

    public boolean getTrendingUp() {
        return this.trendingUp_;
    }

    public boolean hasAlternativeRouteUuid() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasDetourId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasDetourLabel() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasDetourTotalSeconds() {
        return (this.bitField0_ & 8) != 0;
    }

    @Deprecated
    public boolean hasMainAlertSubType() {
        return (this.bitField0_ & 128) != 0;
    }

    @Deprecated
    public boolean hasMainAlertType() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasNaiveTotalSeconds() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasTrendingUp() {
        return (this.bitField0_ & 16) != 0;
    }

    public static ox newBuilder(oy oyVar) {
        return (ox) DEFAULT_INSTANCE.createBuilder(oyVar);
    }

    public static oy parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (oy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static oy parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (oy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static oy parseFrom(com.google.v.z zVar) {
        return (oy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static oy parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (oy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static oy parseFrom(InputStream inputStream) {
        return (oy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static oy parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (oy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static oy parseFrom(ByteBuffer byteBuffer) {
        return (oy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static oy parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (oy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static oy parseFrom(byte[] bArr) {
        return (oy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static oy parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (oy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
