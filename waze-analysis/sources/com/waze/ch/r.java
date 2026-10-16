package com.waze.ch;

import com.google.v.da;
import com.google.v.db;
import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class r extends du<r, p> implements fj {
    private static final r DEFAULT_INSTANCE;
    public static final int EMPTY_ADS_REASON_FIELD_NUMBER = 5;
    public static final int METADATA_FIELD_NUMBER = 7;
    public static final int MINIMUM_REFRESH_INTERVAL_FIELD_NUMBER = 4;
    private static volatile fo<r> PARSER = null;
    public static final int PIN_ADS_FIELD_NUMBER = 1;
    public static final int PIN_AD_PARAMETERS_FIELD_NUMBER = 2;
    public static final int PP_VIEWPORT_FIELD_NUMBER = 3;
    public static final int STATUS_FIELD_NUMBER = 6;
    private int bitField0_;
    private int emptyAdsReason_;
    private g metadata_;
    private db minimumRefreshInterval_;
    private af pinAdParameters_;
    private eo<ac> pinAds_ = emptyProtobufList();
    private i.b.x ppViewport_;
    private i.b.ah status_;

    static {
        r rVar = new r();
        DEFAULT_INSTANCE = rVar;
        du.registerDefaultInstance(r.class, rVar);
    }

    private r() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPinAds(Iterable<? extends ac> iterable) {
        ensurePinAdsIsMutable();
        com.google.v.c.addAll(iterable, this.pinAds_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPinAds(int i2, ac acVar) {
        Objects.requireNonNull(acVar);
        ensurePinAdsIsMutable();
        this.pinAds_.add(i2, acVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEmptyAdsReason() {
        this.bitField0_ &= -9;
        this.emptyAdsReason_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetadata() {
        this.metadata_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMinimumRefreshInterval() {
        this.minimumRefreshInterval_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPinAdParameters() {
        this.pinAdParameters_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPinAds() {
        this.pinAds_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPpViewport() {
        this.ppViewport_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = null;
        this.bitField0_ &= -17;
    }

    private void ensurePinAdsIsMutable() {
        eo<ac> eoVar = this.pinAds_;
        if (eoVar.c()) {
            return;
        }
        this.pinAds_ = du.mutableCopy(eoVar);
    }

    public static r getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMetadata(g gVar) {
        Objects.requireNonNull(gVar);
        g gVar2 = this.metadata_;
        if (gVar2 != null && gVar2 != g.getDefaultInstance()) {
            f fVarNewBuilder = g.newBuilder(gVar2);
            fVarNewBuilder.mergeFrom((f) gVar);
            gVar = fVarNewBuilder.buildPartial();
        }
        this.metadata_ = gVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMinimumRefreshInterval(db dbVar) {
        Objects.requireNonNull(dbVar);
        db dbVar2 = this.minimumRefreshInterval_;
        if (dbVar2 != null && dbVar2 != db.getDefaultInstance()) {
            da daVarNewBuilder = db.newBuilder(dbVar2);
            daVarNewBuilder.mergeFrom((da) dbVar);
            dbVar = daVarNewBuilder.buildPartial();
        }
        this.minimumRefreshInterval_ = dbVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePinAdParameters(af afVar) {
        Objects.requireNonNull(afVar);
        af afVar2 = this.pinAdParameters_;
        if (afVar2 != null && afVar2 != af.getDefaultInstance()) {
            ae aeVarNewBuilder = af.newBuilder(afVar2);
            aeVarNewBuilder.mergeFrom((ae) afVar);
            afVar = aeVarNewBuilder.buildPartial();
        }
        this.pinAdParameters_ = afVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePpViewport(i.b.x xVar) {
        Objects.requireNonNull(xVar);
        i.b.x xVar2 = this.ppViewport_;
        if (xVar2 != null && xVar2 != i.b.x.getDefaultInstance()) {
            i.b.w wVarNewBuilder = i.b.x.newBuilder(xVar2);
            wVarNewBuilder.mergeFrom((i.b.w) xVar);
            xVar = wVarNewBuilder.buildPartial();
        }
        this.ppViewport_ = xVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStatus(i.b.ah ahVar) {
        Objects.requireNonNull(ahVar);
        i.b.ah ahVar2 = this.status_;
        if (ahVar2 != null && ahVar2 != i.b.ah.getDefaultInstance()) {
            i.b.af afVarNewBuilder = i.b.ah.newBuilder(ahVar2);
            afVarNewBuilder.mergeFrom((i.b.af) ahVar);
            ahVar = afVarNewBuilder.buildPartial();
        }
        this.status_ = ahVar;
        this.bitField0_ |= 16;
    }

    public static p newBuilder() {
        return (p) DEFAULT_INSTANCE.createBuilder();
    }

    public static r parseDelimitedFrom(InputStream inputStream) {
        return (r) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static r parseFrom(com.google.v.v vVar) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<r> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePinAds(int i2) {
        ensurePinAdsIsMutable();
        this.pinAds_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmptyAdsReason(q qVar) {
        this.emptyAdsReason_ = qVar.getNumber();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadata(g gVar) {
        Objects.requireNonNull(gVar);
        this.metadata_ = gVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMinimumRefreshInterval(db dbVar) {
        Objects.requireNonNull(dbVar);
        this.minimumRefreshInterval_ = dbVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPinAdParameters(af afVar) {
        Objects.requireNonNull(afVar);
        this.pinAdParameters_ = afVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPinAds(int i2, ac acVar) {
        Objects.requireNonNull(acVar);
        ensurePinAdsIsMutable();
        this.pinAds_.set(i2, acVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPpViewport(i.b.x xVar) {
        Objects.requireNonNull(xVar);
        this.ppViewport_ = xVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(i.b.ah ahVar) {
        Objects.requireNonNull(ahVar);
        this.status_ = ahVar;
        this.bitField0_ |= 16;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005᠌\u0003\u0006ဉ\u0004\u0007ဉ\u0005", new Object[]{"bitField0_", "pinAds_", ac.class, "pinAdParameters_", "ppViewport_", "minimumRefreshInterval_", "emptyAdsReason_", j.f22368e, "status_", "metadata_"});
        }
        if (iOrdinal == 3) {
            return new r();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new p(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<r> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (r.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public q getEmptyAdsReason() {
        q qVarA = q.a(this.emptyAdsReason_);
        return qVarA == null ? q.REASON_UNSPECIFIED : qVarA;
    }

    public g getMetadata() {
        g gVar = this.metadata_;
        return gVar == null ? g.getDefaultInstance() : gVar;
    }

    public db getMinimumRefreshInterval() {
        db dbVar = this.minimumRefreshInterval_;
        return dbVar == null ? db.getDefaultInstance() : dbVar;
    }

    public af getPinAdParameters() {
        af afVar = this.pinAdParameters_;
        return afVar == null ? af.getDefaultInstance() : afVar;
    }

    public ac getPinAds(int i2) {
        return this.pinAds_.get(i2);
    }

    public int getPinAdsCount() {
        return this.pinAds_.size();
    }

    public List<ac> getPinAdsList() {
        return this.pinAds_;
    }

    public ad getPinAdsOrBuilder(int i2) {
        return this.pinAds_.get(i2);
    }

    public List<? extends ad> getPinAdsOrBuilderList() {
        return this.pinAds_;
    }

    public i.b.x getPpViewport() {
        i.b.x xVar = this.ppViewport_;
        return xVar == null ? i.b.x.getDefaultInstance() : xVar;
    }

    public i.b.ah getStatus() {
        i.b.ah ahVar = this.status_;
        return ahVar == null ? i.b.ah.getDefaultInstance() : ahVar;
    }

    public boolean hasEmptyAdsReason() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasMetadata() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasMinimumRefreshInterval() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasPinAdParameters() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasPpViewport() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasStatus() {
        return (this.bitField0_ & 16) != 0;
    }

    public static p newBuilder(r rVar) {
        return (p) DEFAULT_INSTANCE.createBuilder(rVar);
    }

    public static r parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (r) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static r parseFrom(com.google.v.v vVar, de deVar) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static r parseFrom(com.google.v.z zVar) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static r parseFrom(com.google.v.z zVar, de deVar) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPinAds(ac acVar) {
        Objects.requireNonNull(acVar);
        ensurePinAdsIsMutable();
        this.pinAds_.add(acVar);
    }

    public static r parseFrom(InputStream inputStream) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static r parseFrom(InputStream inputStream, de deVar) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static r parseFrom(ByteBuffer byteBuffer) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static r parseFrom(byte[] bArr) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static r parseFrom(byte[] bArr, de deVar) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
