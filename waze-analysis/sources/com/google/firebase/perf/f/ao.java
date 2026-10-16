package com.google.firebase.perf.f;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.ff;
import com.google.v.fo;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ao extends du<ao, al> implements ap {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 4;
    public static final int COUNTERS_FIELD_NUMBER = 6;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 8;
    private static final ao DEFAULT_INSTANCE;
    public static final int DURATION_US_FIELD_NUMBER = 5;
    public static final int IS_AUTO_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile fo<ao> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 9;
    public static final int SUBTRACES_FIELD_NUMBER = 7;
    private int bitField0_;
    private long clientStartTimeUs_;
    private long durationUs_;
    private boolean isAuto_;
    private ff<String, Long> counters_ = ff.a();
    private ff<String, String> customAttributes_ = ff.a();
    private String name_ = "";
    private eo<ao> subtraces_ = emptyProtobufList();
    private eo<ah> perfSessions_ = emptyProtobufList();

    static {
        ao aoVar = new ao();
        DEFAULT_INSTANCE = aoVar;
        du.registerDefaultInstance(ao.class, aoVar);
    }

    private ao() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPerfSessions(Iterable<? extends ah> iterable) {
        ensurePerfSessionsIsMutable();
        com.google.v.c.addAll(iterable, this.perfSessions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSubtraces(Iterable<? extends ao> iterable) {
        ensureSubtracesIsMutable();
        com.google.v.c.addAll(iterable, this.subtraces_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPerfSessions(int i2, ah ahVar) {
        Objects.requireNonNull(ahVar);
        ensurePerfSessionsIsMutable();
        this.perfSessions_.add(i2, ahVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSubtraces(int i2, ao aoVar) {
        Objects.requireNonNull(aoVar);
        ensureSubtracesIsMutable();
        this.subtraces_.add(i2, aoVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientStartTimeUs() {
        this.bitField0_ &= -5;
        this.clientStartTimeUs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDurationUs() {
        this.bitField0_ &= -9;
        this.durationUs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsAuto() {
        this.bitField0_ &= -3;
        this.isAuto_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -2;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPerfSessions() {
        this.perfSessions_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubtraces() {
        this.subtraces_ = emptyProtobufList();
    }

    private void ensurePerfSessionsIsMutable() {
        eo<ah> eoVar = this.perfSessions_;
        if (eoVar.c()) {
            return;
        }
        this.perfSessions_ = du.mutableCopy(eoVar);
    }

    private void ensureSubtracesIsMutable() {
        eo<ao> eoVar = this.subtraces_;
        if (eoVar.c()) {
            return;
        }
        this.subtraces_ = du.mutableCopy(eoVar);
    }

    public static ao getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Long> getMutableCountersMap() {
        return internalGetMutableCounters();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getMutableCustomAttributesMap() {
        return internalGetMutableCustomAttributes();
    }

    private ff<String, Long> internalGetCounters() {
        return this.counters_;
    }

    private ff<String, String> internalGetCustomAttributes() {
        return this.customAttributes_;
    }

    private ff<String, Long> internalGetMutableCounters() {
        if (!this.counters_.e()) {
            this.counters_ = this.counters_.b();
        }
        return this.counters_;
    }

    private ff<String, String> internalGetMutableCustomAttributes() {
        if (!this.customAttributes_.e()) {
            this.customAttributes_ = this.customAttributes_.b();
        }
        return this.customAttributes_;
    }

    public static al newBuilder() {
        return (al) DEFAULT_INSTANCE.createBuilder();
    }

    public static ao parseDelimitedFrom(InputStream inputStream) {
        return (ao) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ao parseFrom(com.google.v.v vVar) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ao> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePerfSessions(int i2) {
        ensurePerfSessionsIsMutable();
        this.perfSessions_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSubtraces(int i2) {
        ensureSubtracesIsMutable();
        this.subtraces_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientStartTimeUs(long j2) {
        this.bitField0_ |= 4;
        this.clientStartTimeUs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDurationUs(long j2) {
        this.bitField0_ |= 8;
        this.durationUs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsAuto(boolean z) {
        this.bitField0_ |= 2;
        this.isAuto_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(com.google.v.v vVar) {
        this.name_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPerfSessions(int i2, ah ahVar) {
        Objects.requireNonNull(ahVar);
        ensurePerfSessionsIsMutable();
        this.perfSessions_.set(i2, ahVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubtraces(int i2, ao aoVar) {
        Objects.requireNonNull(aoVar);
        ensureSubtracesIsMutable();
        this.subtraces_.set(i2, aoVar);
    }

    public boolean containsCounters(String str) {
        Objects.requireNonNull(str);
        return internalGetCounters().containsKey(str);
    }

    public boolean containsCustomAttributes(String str) {
        Objects.requireNonNull(str);
        return internalGetCustomAttributes().containsKey(str);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0004\b\u0000\u0001\u0001\t\b\u0002\u0002\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u00062\u0007\u001b\b2\t\u001b", new Object[]{"bitField0_", "name_", "isAuto_", "clientStartTimeUs_", "durationUs_", "counters_", am.f10434a, "subtraces_", ao.class, "customAttributes_", an.f10435a, "perfSessions_", ah.class});
        }
        if (iOrdinal == 3) {
            return new ao();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new al(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ao> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ao.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getClientStartTimeUs() {
        return this.clientStartTimeUs_;
    }

    public int getCountersCount() {
        return internalGetCounters().size();
    }

    public Map<String, Long> getCountersMap() {
        return DesugarCollections.unmodifiableMap(internalGetCounters());
    }

    public long getCountersOrDefault(String str, long j2) {
        Objects.requireNonNull(str);
        Long l2 = internalGetCounters().get(str);
        return l2 != null ? l2.longValue() : j2;
    }

    public long getCountersOrThrow(String str) {
        Objects.requireNonNull(str);
        Long l2 = internalGetCounters().get(str);
        if (l2 != null) {
            return l2.longValue();
        }
        throw new IllegalArgumentException();
    }

    public int getCustomAttributesCount() {
        return internalGetCustomAttributes().size();
    }

    public Map<String, String> getCustomAttributesMap() {
        return DesugarCollections.unmodifiableMap(internalGetCustomAttributes());
    }

    public String getCustomAttributesOrDefault(String str, String str2) {
        Objects.requireNonNull(str);
        String str3 = internalGetCustomAttributes().get(str);
        return str3 != null ? str3 : str2;
    }

    public String getCustomAttributesOrThrow(String str) {
        Objects.requireNonNull(str);
        String str2 = internalGetCustomAttributes().get(str);
        if (str2 != null) {
            return str2;
        }
        throw new IllegalArgumentException();
    }

    public long getDurationUs() {
        return this.durationUs_;
    }

    public boolean getIsAuto() {
        return this.isAuto_;
    }

    public String getName() {
        return this.name_;
    }

    public com.google.v.v getNameBytes() {
        return com.google.v.v.s(this.name_);
    }

    public ah getPerfSessions(int i2) {
        return this.perfSessions_.get(i2);
    }

    public int getPerfSessionsCount() {
        return this.perfSessions_.size();
    }

    public List<ah> getPerfSessionsList() {
        return this.perfSessions_;
    }

    public ai getPerfSessionsOrBuilder(int i2) {
        return this.perfSessions_.get(i2);
    }

    public List<? extends ai> getPerfSessionsOrBuilderList() {
        return this.perfSessions_;
    }

    public ao getSubtraces(int i2) {
        return this.subtraces_.get(i2);
    }

    public int getSubtracesCount() {
        return this.subtraces_.size();
    }

    public List<ao> getSubtracesList() {
        return this.subtraces_;
    }

    public ap getSubtracesOrBuilder(int i2) {
        return this.subtraces_.get(i2);
    }

    public List<? extends ap> getSubtracesOrBuilderList() {
        return this.subtraces_;
    }

    public boolean hasClientStartTimeUs() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasDurationUs() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasIsAuto() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    public static al newBuilder(ao aoVar) {
        return (al) DEFAULT_INSTANCE.createBuilder(aoVar);
    }

    public static ao parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ao) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ao parseFrom(com.google.v.v vVar, de deVar) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ao parseFrom(com.google.v.z zVar) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ao parseFrom(com.google.v.z zVar, de deVar) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPerfSessions(ah ahVar) {
        Objects.requireNonNull(ahVar);
        ensurePerfSessionsIsMutable();
        this.perfSessions_.add(ahVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSubtraces(ao aoVar) {
        Objects.requireNonNull(aoVar);
        ensureSubtracesIsMutable();
        this.subtraces_.add(aoVar);
    }

    public static ao parseFrom(InputStream inputStream) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ao parseFrom(InputStream inputStream, de deVar) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ao parseFrom(ByteBuffer byteBuffer) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ao parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ao parseFrom(byte[] bArr) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ao parseFrom(byte[] bArr, de deVar) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
