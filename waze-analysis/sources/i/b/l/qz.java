package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class qz extends com.google.v.du<qz, qy> implements com.google.v.fj {
    public static final int ALERTDETAILS_FIELD_NUMBER = 12;
    private static final qz DEFAULT_INSTANCE;
    public static final int DETOURID_FIELD_NUMBER = 1;
    public static final int DETOURLABEL_FIELD_NUMBER = 13;
    public static final int DETOURTOTALLENGTH_FIELD_NUMBER = 5;
    public static final int DETOURTOTALSECONDS_FIELD_NUMBER = 6;
    public static final int DETOURTYPE_FIELD_NUMBER = 14;
    public static final int ISREASSURANCE_FIELD_NUMBER = 7;
    public static final int MAINALERTSUBTYPE_FIELD_NUMBER = 9;
    public static final int MAINALERTTYPE_FIELD_NUMBER = 8;
    public static final int NAIVEROUTEATTR_FIELD_NUMBER = 11;
    public static final int NAIVEROUTENAME_FIELD_NUMBER = 10;
    public static final int NAIVEROUTESEGMENT_FIELD_NUMBER = 2;
    public static final int NAIVETOTALLENGTH_FIELD_NUMBER = 3;
    public static final int NAIVETOTALSECONDS_FIELD_NUMBER = 4;
    private static volatile com.google.v.fo<qz> PARSER;
    private static final com.google.v.el<i.c.a.a.c> naiveRouteAttr_converter_ = new ff(13);
    private com.waze.bg.a.ej alertDetails_;
    private int bitField0_;
    private long detourId_;
    private rd detourLabel_;
    private long detourTotalLength_;
    private long detourTotalSeconds_;
    private int detourType_;
    private boolean isReassurance_;
    private int mainAlertSubType_;
    private int mainAlertType_;
    private long naiveTotalLength_;
    private long naiveTotalSeconds_;
    private com.google.v.eo<si> naiveRouteSegment_ = emptyProtobufList();
    private String naiveRouteName_ = "";
    private com.google.v.ek naiveRouteAttr_ = emptyIntList();

    static {
        qz qzVar = new qz();
        DEFAULT_INSTANCE = qzVar;
        com.google.v.du.registerDefaultInstance(qz.class, qzVar);
    }

    private qz() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllNaiveRouteAttr(Iterable<? extends i.c.a.a.c> iterable) {
        ensureNaiveRouteAttrIsMutable();
        Iterator<? extends i.c.a.a.c> it = iterable.iterator();
        while (it.hasNext()) {
            this.naiveRouteAttr_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllNaiveRouteSegment(Iterable<? extends si> iterable) {
        ensureNaiveRouteSegmentIsMutable();
        com.google.v.c.addAll(iterable, this.naiveRouteSegment_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNaiveRouteAttr(i.c.a.a.c cVar) {
        Objects.requireNonNull(cVar);
        ensureNaiveRouteAttrIsMutable();
        this.naiveRouteAttr_.i(cVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNaiveRouteSegment(int i2, si siVar) {
        Objects.requireNonNull(siVar);
        ensureNaiveRouteSegmentIsMutable();
        this.naiveRouteSegment_.add(i2, siVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlertDetails() {
        this.alertDetails_ = null;
        this.bitField0_ &= -2049;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDetourId() {
        this.bitField0_ &= -2;
        this.detourId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDetourLabel() {
        this.detourLabel_ = null;
        this.bitField0_ &= -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDetourTotalLength() {
        this.bitField0_ &= -9;
        this.detourTotalLength_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDetourTotalSeconds() {
        this.bitField0_ &= -17;
        this.detourTotalSeconds_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDetourType() {
        this.bitField0_ &= -129;
        this.detourType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsReassurance() {
        this.bitField0_ &= -257;
        this.isReassurance_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMainAlertSubType() {
        this.bitField0_ &= -1025;
        this.mainAlertSubType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMainAlertType() {
        this.bitField0_ &= -513;
        this.mainAlertType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNaiveRouteAttr() {
        this.naiveRouteAttr_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNaiveRouteName() {
        this.bitField0_ &= -33;
        this.naiveRouteName_ = getDefaultInstance().getNaiveRouteName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNaiveRouteSegment() {
        this.naiveRouteSegment_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNaiveTotalLength() {
        this.bitField0_ &= -3;
        this.naiveTotalLength_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNaiveTotalSeconds() {
        this.bitField0_ &= -5;
        this.naiveTotalSeconds_ = 0L;
    }

    private void ensureNaiveRouteAttrIsMutable() {
        com.google.v.ek ekVar = this.naiveRouteAttr_;
        if (ekVar.c()) {
            return;
        }
        this.naiveRouteAttr_ = com.google.v.du.mutableCopy(ekVar);
    }

    private void ensureNaiveRouteSegmentIsMutable() {
        com.google.v.eo<si> eoVar = this.naiveRouteSegment_;
        if (eoVar.c()) {
            return;
        }
        this.naiveRouteSegment_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static qz getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAlertDetails(com.waze.bg.a.ej ejVar) {
        Objects.requireNonNull(ejVar);
        com.waze.bg.a.ej ejVar2 = this.alertDetails_;
        if (ejVar2 != null && ejVar2 != com.waze.bg.a.ej.getDefaultInstance()) {
            com.waze.bg.a.dk dkVarNewBuilder = com.waze.bg.a.ej.newBuilder(ejVar2);
            dkVarNewBuilder.mergeFrom((com.waze.bg.a.dk) ejVar);
            ejVar = dkVarNewBuilder.buildPartial();
        }
        this.alertDetails_ = ejVar;
        this.bitField0_ |= 2048;
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
        this.bitField0_ |= 64;
    }

    public static qy newBuilder() {
        return (qy) DEFAULT_INSTANCE.createBuilder();
    }

    public static qz parseDelimitedFrom(InputStream inputStream) {
        return (qz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static qz parseFrom(com.google.v.v vVar) {
        return (qz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<qz> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeNaiveRouteSegment(int i2) {
        ensureNaiveRouteSegmentIsMutable();
        this.naiveRouteSegment_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertDetails(com.waze.bg.a.ej ejVar) {
        Objects.requireNonNull(ejVar);
        this.alertDetails_ = ejVar;
        this.bitField0_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDetourId(long j2) {
        this.bitField0_ |= 1;
        this.detourId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDetourLabel(rd rdVar) {
        Objects.requireNonNull(rdVar);
        this.detourLabel_ = rdVar;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDetourTotalLength(long j2) {
        this.bitField0_ |= 8;
        this.detourTotalLength_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDetourTotalSeconds(long j2) {
        this.bitField0_ |= 16;
        this.detourTotalSeconds_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDetourType(i.c.a.a.a aVar) {
        this.detourType_ = aVar.getNumber();
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsReassurance(boolean z) {
        this.bitField0_ |= 256;
        this.isReassurance_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMainAlertSubType(i.b.j jVar) {
        this.mainAlertSubType_ = jVar.getNumber();
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMainAlertType(i.b.l lVar) {
        this.mainAlertType_ = lVar.getNumber();
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNaiveRouteAttr(int i2, i.c.a.a.c cVar) {
        Objects.requireNonNull(cVar);
        ensureNaiveRouteAttrIsMutable();
        this.naiveRouteAttr_.e(i2, cVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNaiveRouteName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.naiveRouteName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNaiveRouteNameBytes(com.google.v.v vVar) {
        this.naiveRouteName_ = vVar.u();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNaiveRouteSegment(int i2, si siVar) {
        Objects.requireNonNull(siVar);
        ensureNaiveRouteSegmentIsMutable();
        this.naiveRouteSegment_.set(i2, siVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNaiveTotalLength(long j2) {
        this.bitField0_ |= 2;
        this.naiveTotalLength_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNaiveTotalSeconds(long j2) {
        this.bitField0_ |= 4;
        this.naiveTotalSeconds_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0002\u0000\u0001ဂ\u0000\u0002\u001b\u0003ဂ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u0006ဂ\u0004\u0007ဇ\b\b᠌\t\t᠌\n\nဈ\u0005\u000bࠞ\fဉ\u000b\rဉ\u0006\u000e᠌\u0007", new Object[]{"bitField0_", "detourId_", "naiveRouteSegment_", si.class, "naiveTotalLength_", "naiveTotalSeconds_", "detourTotalLength_", "detourTotalSeconds_", "isReassurance_", "mainAlertType_", i.b.l.a(), "mainAlertSubType_", i.b.j.a(), "naiveRouteName_", "naiveRouteAttr_", i.c.a.a.c.a(), "alertDetails_", "detourLabel_", "detourType_", i.c.a.a.a.a()});
        }
        if (iOrdinal == 3) {
            return new qz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new qy(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<qz> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (qz.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Deprecated
    public com.waze.bg.a.ej getAlertDetails() {
        com.waze.bg.a.ej ejVar = this.alertDetails_;
        return ejVar == null ? com.waze.bg.a.ej.getDefaultInstance() : ejVar;
    }

    public long getDetourId() {
        return this.detourId_;
    }

    public rd getDetourLabel() {
        rd rdVar = this.detourLabel_;
        return rdVar == null ? rd.getDefaultInstance() : rdVar;
    }

    public long getDetourTotalLength() {
        return this.detourTotalLength_;
    }

    public long getDetourTotalSeconds() {
        return this.detourTotalSeconds_;
    }

    public i.c.a.a.a getDetourType() {
        i.c.a.a.a aVarB = i.c.a.a.a.b(this.detourType_);
        return aVarB == null ? i.c.a.a.a.UNKNOWN : aVarB;
    }

    @Deprecated
    public boolean getIsReassurance() {
        return this.isReassurance_;
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

    public i.c.a.a.c getNaiveRouteAttr(int i2) {
        i.c.a.a.c cVarB = i.c.a.a.c.b(this.naiveRouteAttr_.d(i2));
        return cVarB == null ? i.c.a.a.c.UNKNOWN : cVarB;
    }

    public int getNaiveRouteAttrCount() {
        return this.naiveRouteAttr_.size();
    }

    public List<i.c.a.a.c> getNaiveRouteAttrList() {
        return new com.google.v.em(this.naiveRouteAttr_, naiveRouteAttr_converter_);
    }

    public String getNaiveRouteName() {
        return this.naiveRouteName_;
    }

    public com.google.v.v getNaiveRouteNameBytes() {
        return com.google.v.v.s(this.naiveRouteName_);
    }

    public si getNaiveRouteSegment(int i2) {
        return this.naiveRouteSegment_.get(i2);
    }

    public int getNaiveRouteSegmentCount() {
        return this.naiveRouteSegment_.size();
    }

    public List<si> getNaiveRouteSegmentList() {
        return this.naiveRouteSegment_;
    }

    public sj getNaiveRouteSegmentOrBuilder(int i2) {
        return this.naiveRouteSegment_.get(i2);
    }

    public List<? extends sj> getNaiveRouteSegmentOrBuilderList() {
        return this.naiveRouteSegment_;
    }

    public long getNaiveTotalLength() {
        return this.naiveTotalLength_;
    }

    public long getNaiveTotalSeconds() {
        return this.naiveTotalSeconds_;
    }

    @Deprecated
    public boolean hasAlertDetails() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasDetourId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasDetourLabel() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasDetourTotalLength() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasDetourTotalSeconds() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasDetourType() {
        return (this.bitField0_ & 128) != 0;
    }

    @Deprecated
    public boolean hasIsReassurance() {
        return (this.bitField0_ & 256) != 0;
    }

    @Deprecated
    public boolean hasMainAlertSubType() {
        return (this.bitField0_ & 1024) != 0;
    }

    @Deprecated
    public boolean hasMainAlertType() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasNaiveRouteName() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasNaiveTotalLength() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasNaiveTotalSeconds() {
        return (this.bitField0_ & 4) != 0;
    }

    public static qy newBuilder(qz qzVar) {
        return (qy) DEFAULT_INSTANCE.createBuilder(qzVar);
    }

    public static qz parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (qz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static qz parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (qz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static qz parseFrom(com.google.v.z zVar) {
        return (qz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static qz parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (qz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNaiveRouteSegment(si siVar) {
        Objects.requireNonNull(siVar);
        ensureNaiveRouteSegmentIsMutable();
        this.naiveRouteSegment_.add(siVar);
    }

    public static qz parseFrom(InputStream inputStream) {
        return (qz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static qz parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (qz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static qz parseFrom(ByteBuffer byteBuffer) {
        return (qz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qz parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (qz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static qz parseFrom(byte[] bArr) {
        return (qz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static qz parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (qz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
