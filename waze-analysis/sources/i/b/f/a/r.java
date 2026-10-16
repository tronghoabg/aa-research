package i.b.f.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class r extends du<r, q> implements fj {
    public static final int COUNTRY_CODE_FIELD_NUMBER = 2;
    public static final int COUNTRY_RANK_FIELD_NUMBER = 3;
    private static final r DEFAULT_INSTANCE;
    public static final int FIXED_LOCALITY_COUNTRY_CODE_FIELD_NUMBER = 7;
    public static final int FIXED_LOCALITY_STATE_CODE_FIELD_NUMBER = 8;
    public static final int GLOBAL_RANK_FIELD_NUMBER = 1;
    public static final int INCLUDED_FIELD_NUMBER = 6;
    private static volatile fo<r> PARSER = null;
    public static final int STATE_CODE_FIELD_NUMBER = 4;
    public static final int STATE_RANK_FIELD_NUMBER = 5;
    private int bitField0_;
    private long countryRank_;
    private long globalRank_;
    private boolean included_;
    private long stateRank_;
    private String countryCode_ = "";
    private String stateCode_ = "";
    private String fixedLocalityCountryCode_ = "";
    private String fixedLocalityStateCode_ = "";

    static {
        r rVar = new r();
        DEFAULT_INSTANCE = rVar;
        du.registerDefaultInstance(r.class, rVar);
    }

    private r() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCountryCode() {
        this.bitField0_ &= -3;
        this.countryCode_ = getDefaultInstance().getCountryCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCountryRank() {
        this.bitField0_ &= -5;
        this.countryRank_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFixedLocalityCountryCode() {
        this.bitField0_ &= -65;
        this.fixedLocalityCountryCode_ = getDefaultInstance().getFixedLocalityCountryCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFixedLocalityStateCode() {
        this.bitField0_ &= -129;
        this.fixedLocalityStateCode_ = getDefaultInstance().getFixedLocalityStateCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGlobalRank() {
        this.bitField0_ &= -2;
        this.globalRank_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIncluded() {
        this.bitField0_ &= -33;
        this.included_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStateCode() {
        this.bitField0_ &= -9;
        this.stateCode_ = getDefaultInstance().getStateCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStateRank() {
        this.bitField0_ &= -17;
        this.stateRank_ = 0L;
    }

    public static r getDefaultInstance() {
        return DEFAULT_INSTANCE;
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
    public void setCountryCode(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.countryCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountryCodeBytes(com.google.v.v vVar) {
        this.countryCode_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountryRank(long j2) {
        this.bitField0_ |= 4;
        this.countryRank_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFixedLocalityCountryCode(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 64;
        this.fixedLocalityCountryCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFixedLocalityCountryCodeBytes(com.google.v.v vVar) {
        this.fixedLocalityCountryCode_ = vVar.u();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFixedLocalityStateCode(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 128;
        this.fixedLocalityStateCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFixedLocalityStateCodeBytes(com.google.v.v vVar) {
        this.fixedLocalityStateCode_ = vVar.u();
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGlobalRank(long j2) {
        this.bitField0_ |= 1;
        this.globalRank_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIncluded(boolean z) {
        this.bitField0_ |= 32;
        this.included_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStateCode(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.stateCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStateCodeBytes(com.google.v.v vVar) {
        this.stateCode_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStateRank(long j2) {
        this.bitField0_ |= 16;
        this.stateRank_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဇ\u0005\u0007ဈ\u0006\bဈ\u0007", new Object[]{"bitField0_", "globalRank_", "countryCode_", "countryRank_", "stateCode_", "stateRank_", "included_", "fixedLocalityCountryCode_", "fixedLocalityStateCode_"});
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

    public String getCountryCode() {
        return this.countryCode_;
    }

    public com.google.v.v getCountryCodeBytes() {
        return com.google.v.v.s(this.countryCode_);
    }

    public long getCountryRank() {
        return this.countryRank_;
    }

    public String getFixedLocalityCountryCode() {
        return this.fixedLocalityCountryCode_;
    }

    public com.google.v.v getFixedLocalityCountryCodeBytes() {
        return com.google.v.v.s(this.fixedLocalityCountryCode_);
    }

    public String getFixedLocalityStateCode() {
        return this.fixedLocalityStateCode_;
    }

    public com.google.v.v getFixedLocalityStateCodeBytes() {
        return com.google.v.v.s(this.fixedLocalityStateCode_);
    }

    public long getGlobalRank() {
        return this.globalRank_;
    }

    public boolean getIncluded() {
        return this.included_;
    }

    public String getStateCode() {
        return this.stateCode_;
    }

    public com.google.v.v getStateCodeBytes() {
        return com.google.v.v.s(this.stateCode_);
    }

    public long getStateRank() {
        return this.stateRank_;
    }

    public boolean hasCountryCode() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasCountryRank() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasFixedLocalityCountryCode() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasFixedLocalityStateCode() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasGlobalRank() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasIncluded() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasStateCode() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasStateRank() {
        return (this.bitField0_ & 16) != 0;
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
