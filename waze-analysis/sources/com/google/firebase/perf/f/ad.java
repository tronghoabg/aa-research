package com.google.firebase.perf.f;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ad extends du<ad, ac> implements ae {
    public static final int APPLICATION_INFO_FIELD_NUMBER = 1;
    private static final ad DEFAULT_INSTANCE;
    public static final int GAUGE_METRIC_FIELD_NUMBER = 4;
    public static final int NETWORK_REQUEST_METRIC_FIELD_NUMBER = 3;
    private static volatile fo<ad> PARSER = null;
    public static final int TRACE_METRIC_FIELD_NUMBER = 2;
    public static final int TRANSPORT_INFO_FIELD_NUMBER = 5;
    private h applicationInfo_;
    private int bitField0_;
    private r gaugeMetric_;
    private ab networkRequestMetric_;
    private ao traceMetric_;
    private as transportInfo_;

    static {
        ad adVar = new ad();
        DEFAULT_INSTANCE = adVar;
        du.registerDefaultInstance(ad.class, adVar);
    }

    private ad() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearApplicationInfo() {
        this.applicationInfo_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGaugeMetric() {
        this.gaugeMetric_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNetworkRequestMetric() {
        this.networkRequestMetric_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTraceMetric() {
        this.traceMetric_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTransportInfo() {
        this.transportInfo_ = null;
        this.bitField0_ &= -17;
    }

    public static ad getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeApplicationInfo(h hVar) {
        Objects.requireNonNull(hVar);
        h hVar2 = this.applicationInfo_;
        if (hVar2 != null && hVar2 != h.getDefaultInstance()) {
            f fVarNewBuilder = h.newBuilder(hVar2);
            fVarNewBuilder.mergeFrom((f) hVar);
            hVar = fVarNewBuilder.buildPartial();
        }
        this.applicationInfo_ = hVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGaugeMetric(r rVar) {
        Objects.requireNonNull(rVar);
        r rVar2 = this.gaugeMetric_;
        if (rVar2 != null && rVar2 != r.getDefaultInstance()) {
            q qVarNewBuilder = r.newBuilder(rVar2);
            qVarNewBuilder.mergeFrom((q) rVar);
            rVar = qVarNewBuilder.buildPartial();
        }
        this.gaugeMetric_ = rVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNetworkRequestMetric(ab abVar) {
        Objects.requireNonNull(abVar);
        ab abVar2 = this.networkRequestMetric_;
        if (abVar2 != null && abVar2 != ab.getDefaultInstance()) {
            x xVarNewBuilder = ab.newBuilder(abVar2);
            xVarNewBuilder.mergeFrom((x) abVar);
            abVar = xVarNewBuilder.buildPartial();
        }
        this.networkRequestMetric_ = abVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTraceMetric(ao aoVar) {
        Objects.requireNonNull(aoVar);
        ao aoVar2 = this.traceMetric_;
        if (aoVar2 != null && aoVar2 != ao.getDefaultInstance()) {
            al alVarNewBuilder = ao.newBuilder(aoVar2);
            alVarNewBuilder.mergeFrom((al) aoVar);
            aoVar = alVarNewBuilder.buildPartial();
        }
        this.traceMetric_ = aoVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTransportInfo(as asVar) {
        Objects.requireNonNull(asVar);
        as asVar2 = this.transportInfo_;
        if (asVar2 != null && asVar2 != as.getDefaultInstance()) {
            aq aqVarNewBuilder = as.newBuilder(asVar2);
            aqVarNewBuilder.mergeFrom((aq) asVar);
            asVar = aqVarNewBuilder.buildPartial();
        }
        this.transportInfo_ = asVar;
        this.bitField0_ |= 16;
    }

    public static ac newBuilder() {
        return (ac) DEFAULT_INSTANCE.createBuilder();
    }

    public static ad parseDelimitedFrom(InputStream inputStream) {
        return (ad) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ad parseFrom(com.google.v.v vVar) {
        return (ad) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ad> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApplicationInfo(h hVar) {
        Objects.requireNonNull(hVar);
        this.applicationInfo_ = hVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGaugeMetric(r rVar) {
        Objects.requireNonNull(rVar);
        this.gaugeMetric_ = rVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNetworkRequestMetric(ab abVar) {
        Objects.requireNonNull(abVar);
        this.networkRequestMetric_ = abVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTraceMetric(ao aoVar) {
        Objects.requireNonNull(aoVar);
        this.traceMetric_ = aoVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTransportInfo(as asVar) {
        Objects.requireNonNull(asVar);
        this.transportInfo_ = asVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "applicationInfo_", "traceMetric_", "networkRequestMetric_", "gaugeMetric_", "transportInfo_"});
        }
        if (iOrdinal == 3) {
            return new ad();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ac(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ad> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ad.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public h getApplicationInfo() {
        h hVar = this.applicationInfo_;
        return hVar == null ? h.getDefaultInstance() : hVar;
    }

    @Override // com.google.firebase.perf.f.ae
    public r getGaugeMetric() {
        r rVar = this.gaugeMetric_;
        return rVar == null ? r.getDefaultInstance() : rVar;
    }

    @Override // com.google.firebase.perf.f.ae
    public ab getNetworkRequestMetric() {
        ab abVar = this.networkRequestMetric_;
        return abVar == null ? ab.getDefaultInstance() : abVar;
    }

    @Override // com.google.firebase.perf.f.ae
    public ao getTraceMetric() {
        ao aoVar = this.traceMetric_;
        return aoVar == null ? ao.getDefaultInstance() : aoVar;
    }

    public as getTransportInfo() {
        as asVar = this.transportInfo_;
        return asVar == null ? as.getDefaultInstance() : asVar;
    }

    public boolean hasApplicationInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.firebase.perf.f.ae
    public boolean hasGaugeMetric() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.firebase.perf.f.ae
    public boolean hasNetworkRequestMetric() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.firebase.perf.f.ae
    public boolean hasTraceMetric() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasTransportInfo() {
        return (this.bitField0_ & 16) != 0;
    }

    public static ac newBuilder(ad adVar) {
        return (ac) DEFAULT_INSTANCE.createBuilder(adVar);
    }

    public static ad parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ad) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ad parseFrom(com.google.v.v vVar, de deVar) {
        return (ad) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ad parseFrom(com.google.v.z zVar) {
        return (ad) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ad parseFrom(com.google.v.z zVar, de deVar) {
        return (ad) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ad parseFrom(InputStream inputStream) {
        return (ad) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ad parseFrom(InputStream inputStream, de deVar) {
        return (ad) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ad parseFrom(ByteBuffer byteBuffer) {
        return (ad) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ad parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ad) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ad parseFrom(byte[] bArr) {
        return (ad) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ad parseFrom(byte[] bArr, de deVar) {
        return (ad) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
