package com.google.firebase.perf.f;

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
/* loaded from: classes4.dex */
public final class r extends du<r, q> implements fj {
    public static final int ANDROID_MEMORY_READINGS_FIELD_NUMBER = 4;
    public static final int CPU_METRIC_READINGS_FIELD_NUMBER = 2;
    private static final r DEFAULT_INSTANCE;
    public static final int GAUGE_METADATA_FIELD_NUMBER = 3;
    public static final int IOS_MEMORY_READINGS_FIELD_NUMBER = 5;
    private static volatile fo<r> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private p gaugeMetadata_;
    private String sessionId_ = "";
    private eo<k> cpuMetricReadings_ = emptyProtobufList();
    private eo<d> androidMemoryReadings_ = emptyProtobufList();
    private eo<v> iosMemoryReadings_ = emptyProtobufList();

    static {
        r rVar = new r();
        DEFAULT_INSTANCE = rVar;
        du.registerDefaultInstance(r.class, rVar);
    }

    private r() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAndroidMemoryReadings(Iterable<? extends d> iterable) {
        ensureAndroidMemoryReadingsIsMutable();
        com.google.v.c.addAll(iterable, this.androidMemoryReadings_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCpuMetricReadings(Iterable<? extends k> iterable) {
        ensureCpuMetricReadingsIsMutable();
        com.google.v.c.addAll(iterable, this.cpuMetricReadings_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllIosMemoryReadings(Iterable<? extends v> iterable) {
        ensureIosMemoryReadingsIsMutable();
        com.google.v.c.addAll(iterable, this.iosMemoryReadings_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAndroidMemoryReadings(int i2, d dVar) {
        Objects.requireNonNull(dVar);
        ensureAndroidMemoryReadingsIsMutable();
        this.androidMemoryReadings_.add(i2, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCpuMetricReadings(int i2, k kVar) {
        Objects.requireNonNull(kVar);
        ensureCpuMetricReadingsIsMutable();
        this.cpuMetricReadings_.add(i2, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addIosMemoryReadings(int i2, v vVar) {
        Objects.requireNonNull(vVar);
        ensureIosMemoryReadingsIsMutable();
        this.iosMemoryReadings_.add(i2, vVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAndroidMemoryReadings() {
        this.androidMemoryReadings_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCpuMetricReadings() {
        this.cpuMetricReadings_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGaugeMetadata() {
        this.gaugeMetadata_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIosMemoryReadings() {
        this.iosMemoryReadings_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionId() {
        this.bitField0_ &= -2;
        this.sessionId_ = getDefaultInstance().getSessionId();
    }

    private void ensureAndroidMemoryReadingsIsMutable() {
        eo<d> eoVar = this.androidMemoryReadings_;
        if (eoVar.c()) {
            return;
        }
        this.androidMemoryReadings_ = du.mutableCopy(eoVar);
    }

    private void ensureCpuMetricReadingsIsMutable() {
        eo<k> eoVar = this.cpuMetricReadings_;
        if (eoVar.c()) {
            return;
        }
        this.cpuMetricReadings_ = du.mutableCopy(eoVar);
    }

    private void ensureIosMemoryReadingsIsMutable() {
        eo<v> eoVar = this.iosMemoryReadings_;
        if (eoVar.c()) {
            return;
        }
        this.iosMemoryReadings_ = du.mutableCopy(eoVar);
    }

    public static r getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGaugeMetadata(p pVar) {
        Objects.requireNonNull(pVar);
        p pVar2 = this.gaugeMetadata_;
        if (pVar2 != null && pVar2 != p.getDefaultInstance()) {
            o oVarNewBuilder = p.newBuilder(pVar2);
            oVarNewBuilder.mergeFrom((o) pVar);
            pVar = oVarNewBuilder.buildPartial();
        }
        this.gaugeMetadata_ = pVar;
        this.bitField0_ |= 2;
    }

    public static q newBuilder() {
        return (q) DEFAULT_INSTANCE.createBuilder();
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
    public void removeAndroidMemoryReadings(int i2) {
        ensureAndroidMemoryReadingsIsMutable();
        this.androidMemoryReadings_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeCpuMetricReadings(int i2) {
        ensureCpuMetricReadingsIsMutable();
        this.cpuMetricReadings_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeIosMemoryReadings(int i2) {
        ensureIosMemoryReadingsIsMutable();
        this.iosMemoryReadings_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAndroidMemoryReadings(int i2, d dVar) {
        Objects.requireNonNull(dVar);
        ensureAndroidMemoryReadingsIsMutable();
        this.androidMemoryReadings_.set(i2, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCpuMetricReadings(int i2, k kVar) {
        Objects.requireNonNull(kVar);
        ensureCpuMetricReadingsIsMutable();
        this.cpuMetricReadings_.set(i2, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGaugeMetadata(p pVar) {
        Objects.requireNonNull(pVar);
        this.gaugeMetadata_ = pVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIosMemoryReadings(int i2, v vVar) {
        Objects.requireNonNull(vVar);
        ensureIosMemoryReadingsIsMutable();
        this.iosMemoryReadings_.set(i2, vVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionIdBytes(com.google.v.v vVar) {
        this.sessionId_ = vVar.u();
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0003\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b\u0005\u001b", new Object[]{"bitField0_", "sessionId_", "cpuMetricReadings_", k.class, "gaugeMetadata_", "androidMemoryReadings_", d.class, "iosMemoryReadings_", v.class});
        }
        if (iOrdinal == 3) {
            return new r();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new q(bArr);
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

    public d getAndroidMemoryReadings(int i2) {
        return this.androidMemoryReadings_.get(i2);
    }

    public int getAndroidMemoryReadingsCount() {
        return this.androidMemoryReadings_.size();
    }

    public List<d> getAndroidMemoryReadingsList() {
        return this.androidMemoryReadings_;
    }

    public e getAndroidMemoryReadingsOrBuilder(int i2) {
        return this.androidMemoryReadings_.get(i2);
    }

    public List<? extends e> getAndroidMemoryReadingsOrBuilderList() {
        return this.androidMemoryReadings_;
    }

    public k getCpuMetricReadings(int i2) {
        return this.cpuMetricReadings_.get(i2);
    }

    public int getCpuMetricReadingsCount() {
        return this.cpuMetricReadings_.size();
    }

    public List<k> getCpuMetricReadingsList() {
        return this.cpuMetricReadings_;
    }

    public l getCpuMetricReadingsOrBuilder(int i2) {
        return this.cpuMetricReadings_.get(i2);
    }

    public List<? extends l> getCpuMetricReadingsOrBuilderList() {
        return this.cpuMetricReadings_;
    }

    public p getGaugeMetadata() {
        p pVar = this.gaugeMetadata_;
        return pVar == null ? p.getDefaultInstance() : pVar;
    }

    public v getIosMemoryReadings(int i2) {
        return this.iosMemoryReadings_.get(i2);
    }

    public int getIosMemoryReadingsCount() {
        return this.iosMemoryReadings_.size();
    }

    public List<v> getIosMemoryReadingsList() {
        return this.iosMemoryReadings_;
    }

    public w getIosMemoryReadingsOrBuilder(int i2) {
        return this.iosMemoryReadings_.get(i2);
    }

    public List<? extends w> getIosMemoryReadingsOrBuilderList() {
        return this.iosMemoryReadings_;
    }

    public String getSessionId() {
        return this.sessionId_;
    }

    public com.google.v.v getSessionIdBytes() {
        return com.google.v.v.s(this.sessionId_);
    }

    public boolean hasGaugeMetadata() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSessionId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static q newBuilder(r rVar) {
        return (q) DEFAULT_INSTANCE.createBuilder(rVar);
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
    public void addAndroidMemoryReadings(d dVar) {
        Objects.requireNonNull(dVar);
        ensureAndroidMemoryReadingsIsMutable();
        this.androidMemoryReadings_.add(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCpuMetricReadings(k kVar) {
        Objects.requireNonNull(kVar);
        ensureCpuMetricReadingsIsMutable();
        this.cpuMetricReadings_.add(kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addIosMemoryReadings(v vVar) {
        Objects.requireNonNull(vVar);
        ensureIosMemoryReadingsIsMutable();
        this.iosMemoryReadings_.add(vVar);
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
