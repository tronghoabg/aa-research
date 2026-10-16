package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aao extends com.google.v.du<aao, aan> implements com.google.v.fj {
    public static final int ACCURACY_AVG_METERS_FIELD_NUMBER = 4;
    public static final int ACCURACY_MAX_METERS_FIELD_NUMBER = 6;
    public static final int ACCURACY_MIN_METERS_FIELD_NUMBER = 5;
    public static final int BAD_SAMPLE_COUNT_FIELD_NUMBER = 2;
    public static final int COORDINATES_FIELD_NUMBER = 8;
    private static final aao DEFAULT_INSTANCE;
    public static final int DUPLICATE_SAMPLE_COUNT_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<aao> PARSER = null;
    public static final int POSITION_PROVIDER_FIELD_NUMBER = 7;
    public static final int SAMPLE_COUNT_FIELD_NUMBER = 1;
    private long accuracyAvgMeters_;
    private long accuracyMaxMeters_;
    private long accuracyMinMeters_;
    private long badSampleCount_;
    private int bitField0_;
    private afx coordinates_;
    private long duplicateSampleCount_;
    private int positionProvider_;
    private long sampleCount_;

    static {
        aao aaoVar = new aao();
        DEFAULT_INSTANCE = aaoVar;
        com.google.v.du.registerDefaultInstance(aao.class, aaoVar);
    }

    private aao() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccuracyAvgMeters() {
        this.bitField0_ &= -9;
        this.accuracyAvgMeters_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccuracyMaxMeters() {
        this.bitField0_ &= -33;
        this.accuracyMaxMeters_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccuracyMinMeters() {
        this.bitField0_ &= -17;
        this.accuracyMinMeters_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBadSampleCount() {
        this.bitField0_ &= -3;
        this.badSampleCount_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoordinates() {
        this.coordinates_ = null;
        this.bitField0_ &= -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDuplicateSampleCount() {
        this.bitField0_ &= -5;
        this.duplicateSampleCount_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPositionProvider() {
        this.positionProvider_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSampleCount() {
        this.bitField0_ &= -2;
        this.sampleCount_ = 0L;
    }

    public static aao getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCoordinates(afx afxVar) {
        Objects.requireNonNull(afxVar);
        afx afxVar2 = this.coordinates_;
        if (afxVar2 != null && afxVar2 != afx.getDefaultInstance()) {
            afw afwVarNewBuilder = afx.newBuilder(afxVar2);
            afwVarNewBuilder.mergeFrom((afw) afxVar);
            afxVar = afwVarNewBuilder.buildPartial();
        }
        this.coordinates_ = afxVar;
        this.bitField0_ |= 64;
    }

    public static aan newBuilder() {
        return (aan) DEFAULT_INSTANCE.createBuilder();
    }

    public static aao parseDelimitedFrom(InputStream inputStream) {
        return (aao) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aao parseFrom(com.google.v.v vVar) {
        return (aao) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aao> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccuracyAvgMeters(long j2) {
        this.bitField0_ |= 8;
        this.accuracyAvgMeters_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccuracyMaxMeters(long j2) {
        this.bitField0_ |= 32;
        this.accuracyMaxMeters_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccuracyMinMeters(long j2) {
        this.bitField0_ |= 16;
        this.accuracyMinMeters_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBadSampleCount(long j2) {
        this.bitField0_ |= 2;
        this.badSampleCount_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoordinates(afx afxVar) {
        Objects.requireNonNull(afxVar);
        this.coordinates_ = afxVar;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDuplicateSampleCount(long j2) {
        this.bitField0_ |= 4;
        this.duplicateSampleCount_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPositionProvider(agz agzVar) {
        this.positionProvider_ = agzVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPositionProviderValue(int i2) {
        this.positionProvider_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSampleCount(long j2) {
        this.bitField0_ |= 1;
        this.sampleCount_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007\f\bဉ\u0006", new Object[]{"bitField0_", "sampleCount_", "badSampleCount_", "duplicateSampleCount_", "accuracyAvgMeters_", "accuracyMinMeters_", "accuracyMaxMeters_", "positionProvider_", "coordinates_"});
        }
        if (iOrdinal == 3) {
            return new aao();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aan(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aao> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aao.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getAccuracyAvgMeters() {
        return this.accuracyAvgMeters_;
    }

    public long getAccuracyMaxMeters() {
        return this.accuracyMaxMeters_;
    }

    public long getAccuracyMinMeters() {
        return this.accuracyMinMeters_;
    }

    public long getBadSampleCount() {
        return this.badSampleCount_;
    }

    public afx getCoordinates() {
        afx afxVar = this.coordinates_;
        return afxVar == null ? afx.getDefaultInstance() : afxVar;
    }

    public long getDuplicateSampleCount() {
        return this.duplicateSampleCount_;
    }

    public agz getPositionProvider() {
        agz agzVarA = agz.a(this.positionProvider_);
        return agzVarA == null ? agz.UNRECOGNIZED : agzVarA;
    }

    public int getPositionProviderValue() {
        return this.positionProvider_;
    }

    public long getSampleCount() {
        return this.sampleCount_;
    }

    public boolean hasAccuracyAvgMeters() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasAccuracyMaxMeters() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasAccuracyMinMeters() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasBadSampleCount() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasCoordinates() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasDuplicateSampleCount() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasSampleCount() {
        return (this.bitField0_ & 1) != 0;
    }

    public static aan newBuilder(aao aaoVar) {
        return (aan) DEFAULT_INSTANCE.createBuilder(aaoVar);
    }

    public static aao parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aao) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aao parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aao) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aao parseFrom(com.google.v.z zVar) {
        return (aao) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aao parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aao) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aao parseFrom(InputStream inputStream) {
        return (aao) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aao parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aao) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aao parseFrom(ByteBuffer byteBuffer) {
        return (aao) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aao parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aao) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aao parseFrom(byte[] bArr) {
        return (aao) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aao parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aao) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
