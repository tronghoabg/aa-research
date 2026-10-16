package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class hm extends com.google.v.du<hm, hl> implements com.google.v.fj {
    public static final int BEACON_ID_SUFFIX_FIELD_NUMBER = 4;
    private static final hm DEFAULT_INSTANCE;
    public static final int FIRST_SAMPLE_TIMESTAMP_MS_FIELD_NUMBER = 5;
    public static final int FIRST_SAMPLE_TIMESTAMP_UNIX_MS_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<hm> PARSER = null;
    public static final int SAMPLES_FIELD_NUMBER = 1;
    public static final int SUFFIX_FIELD_NUMBER = 2;
    private int bitField0_;
    private long firstSampleTimestampMs_;
    private long firstSampleTimestampUnixMs_;
    private com.google.v.eo<ho> samples_ = emptyProtobufList();
    private String suffix_ = "";
    private String beaconIdSuffix_ = "";

    static {
        hm hmVar = new hm();
        DEFAULT_INSTANCE = hmVar;
        com.google.v.du.registerDefaultInstance(hm.class, hmVar);
    }

    private hm() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSamples(Iterable<? extends ho> iterable) {
        ensureSamplesIsMutable();
        com.google.v.c.addAll(iterable, this.samples_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSamples(int i2, ho hoVar) {
        Objects.requireNonNull(hoVar);
        ensureSamplesIsMutable();
        this.samples_.add(i2, hoVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBeaconIdSuffix() {
        this.beaconIdSuffix_ = getDefaultInstance().getBeaconIdSuffix();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFirstSampleTimestampMs() {
        this.bitField0_ &= -3;
        this.firstSampleTimestampMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFirstSampleTimestampUnixMs() {
        this.bitField0_ &= -2;
        this.firstSampleTimestampUnixMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSamples() {
        this.samples_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSuffix() {
        this.suffix_ = getDefaultInstance().getSuffix();
    }

    private void ensureSamplesIsMutable() {
        com.google.v.eo<ho> eoVar = this.samples_;
        if (eoVar.c()) {
            return;
        }
        this.samples_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static hm getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static hl newBuilder() {
        return (hl) DEFAULT_INSTANCE.createBuilder();
    }

    public static hm parseDelimitedFrom(InputStream inputStream) {
        return (hm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static hm parseFrom(com.google.v.v vVar) {
        return (hm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<hm> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSamples(int i2) {
        ensureSamplesIsMutable();
        this.samples_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBeaconIdSuffix(String str) {
        Objects.requireNonNull(str);
        this.beaconIdSuffix_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBeaconIdSuffixBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.beaconIdSuffix_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFirstSampleTimestampMs(long j2) {
        this.bitField0_ |= 2;
        this.firstSampleTimestampMs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFirstSampleTimestampUnixMs(long j2) {
        this.bitField0_ |= 1;
        this.firstSampleTimestampUnixMs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSamples(int i2, ho hoVar) {
        Objects.requireNonNull(hoVar);
        ensureSamplesIsMutable();
        this.samples_.set(i2, hoVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuffix(String str) {
        Objects.requireNonNull(str);
        this.suffix_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuffixBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.suffix_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002Ȉ\u0003ဂ\u0000\u0004Ȉ\u0005ဂ\u0001", new Object[]{"bitField0_", "samples_", ho.class, "suffix_", "firstSampleTimestampUnixMs_", "beaconIdSuffix_", "firstSampleTimestampMs_"});
        }
        if (iOrdinal == 3) {
            return new hm();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new hl(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<hm> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (hm.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getBeaconIdSuffix() {
        return this.beaconIdSuffix_;
    }

    public com.google.v.v getBeaconIdSuffixBytes() {
        return com.google.v.v.s(this.beaconIdSuffix_);
    }

    public long getFirstSampleTimestampMs() {
        return this.firstSampleTimestampMs_;
    }

    @Deprecated
    public long getFirstSampleTimestampUnixMs() {
        return this.firstSampleTimestampUnixMs_;
    }

    public ho getSamples(int i2) {
        return this.samples_.get(i2);
    }

    public int getSamplesCount() {
        return this.samples_.size();
    }

    public List<ho> getSamplesList() {
        return this.samples_;
    }

    public hp getSamplesOrBuilder(int i2) {
        return this.samples_.get(i2);
    }

    public List<? extends hp> getSamplesOrBuilderList() {
        return this.samples_;
    }

    @Deprecated
    public String getSuffix() {
        return this.suffix_;
    }

    @Deprecated
    public com.google.v.v getSuffixBytes() {
        return com.google.v.v.s(this.suffix_);
    }

    public boolean hasFirstSampleTimestampMs() {
        return (this.bitField0_ & 2) != 0;
    }

    @Deprecated
    public boolean hasFirstSampleTimestampUnixMs() {
        return (this.bitField0_ & 1) != 0;
    }

    public static hl newBuilder(hm hmVar) {
        return (hl) DEFAULT_INSTANCE.createBuilder(hmVar);
    }

    public static hm parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (hm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static hm parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (hm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static hm parseFrom(com.google.v.z zVar) {
        return (hm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static hm parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (hm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSamples(ho hoVar) {
        Objects.requireNonNull(hoVar);
        ensureSamplesIsMutable();
        this.samples_.add(hoVar);
    }

    public static hm parseFrom(InputStream inputStream) {
        return (hm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static hm parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (hm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static hm parseFrom(ByteBuffer byteBuffer) {
        return (hm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hm parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (hm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static hm parseFrom(byte[] bArr) {
        return (hm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static hm parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (hm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
