package i.b.o;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import i.b.al;
import i.b.am;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class q extends du<q, p> implements fj {
    public static final int CRISIS_RESPONSE_USER_IN_CR_AREA_FIELD_NUMBER = 6;
    private static final q DEFAULT_INSTANCE;
    private static volatile fo<q> PARSER = null;
    public static final int PREV_CHECKSUM_FIELD_NUMBER = 1;
    public static final int USERNAME_FIELD_NUMBER = 4;
    public static final int USER_CONFIG_FIELD_NUMBER = 2;
    public static final int USER_COUNTRY_CODE_FIELD_NUMBER = 3;
    public static final int USER_LOCATION_FIELD_NUMBER = 5;
    private int bitField0_;
    private boolean crisisResponseUserInCrArea_;
    private am userConfig_;
    private i.b.s userLocation_;
    private String prevChecksum_ = "";
    private String userCountryCode_ = "";
    private String username_ = "";

    static {
        q qVar = new q();
        DEFAULT_INSTANCE = qVar;
        du.registerDefaultInstance(q.class, qVar);
    }

    private q() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCrisisResponseUserInCrArea() {
        this.bitField0_ &= -33;
        this.crisisResponseUserInCrArea_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrevChecksum() {
        this.bitField0_ &= -2;
        this.prevChecksum_ = getDefaultInstance().getPrevChecksum();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserConfig() {
        this.userConfig_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserCountryCode() {
        this.bitField0_ &= -5;
        this.userCountryCode_ = getDefaultInstance().getUserCountryCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserLocation() {
        this.userLocation_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUsername() {
        this.bitField0_ &= -9;
        this.username_ = getDefaultInstance().getUsername();
    }

    public static q getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserConfig(am amVar) {
        Objects.requireNonNull(amVar);
        am amVar2 = this.userConfig_;
        if (amVar2 != null && amVar2 != am.getDefaultInstance()) {
            al alVarNewBuilder = am.newBuilder(amVar2);
            alVarNewBuilder.mergeFrom((al) amVar);
            amVar = alVarNewBuilder.buildPartial();
        }
        this.userConfig_ = amVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserLocation(i.b.s sVar) {
        Objects.requireNonNull(sVar);
        i.b.s sVar2 = this.userLocation_;
        if (sVar2 != null && sVar2 != i.b.s.getDefaultInstance()) {
            i.b.p pVarNewBuilder = i.b.s.newBuilder(sVar2);
            pVarNewBuilder.mergeFrom((i.b.p) sVar);
            sVar = pVarNewBuilder.buildPartial();
        }
        this.userLocation_ = sVar;
        this.bitField0_ |= 16;
    }

    public static p newBuilder() {
        return (p) DEFAULT_INSTANCE.createBuilder();
    }

    public static q parseDelimitedFrom(InputStream inputStream) {
        return (q) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static q parseFrom(v vVar) {
        return (q) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<q> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCrisisResponseUserInCrArea(boolean z) {
        this.bitField0_ |= 32;
        this.crisisResponseUserInCrArea_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrevChecksum(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.prevChecksum_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrevChecksumBytes(v vVar) {
        this.prevChecksum_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserConfig(am amVar) {
        Objects.requireNonNull(amVar);
        this.userConfig_ = amVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserCountryCode(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.userCountryCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserCountryCodeBytes(v vVar) {
        this.userCountryCode_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserLocation(i.b.s sVar) {
        Objects.requireNonNull(sVar);
        this.userLocation_ = sVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUsername(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.username_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUsernameBytes(v vVar) {
        this.username_ = vVar.u();
        this.bitField0_ |= 8;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဉ\u0004\u0006ဇ\u0005", new Object[]{"bitField0_", "prevChecksum_", "userConfig_", "userCountryCode_", "username_", "userLocation_", "crisisResponseUserInCrArea_"});
        }
        if (iOrdinal == 3) {
            return new q();
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
        fo<q> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (q.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getCrisisResponseUserInCrArea() {
        return this.crisisResponseUserInCrArea_;
    }

    public String getPrevChecksum() {
        return this.prevChecksum_;
    }

    public v getPrevChecksumBytes() {
        return v.s(this.prevChecksum_);
    }

    public am getUserConfig() {
        am amVar = this.userConfig_;
        return amVar == null ? am.getDefaultInstance() : amVar;
    }

    public String getUserCountryCode() {
        return this.userCountryCode_;
    }

    public v getUserCountryCodeBytes() {
        return v.s(this.userCountryCode_);
    }

    public i.b.s getUserLocation() {
        i.b.s sVar = this.userLocation_;
        return sVar == null ? i.b.s.getDefaultInstance() : sVar;
    }

    public String getUsername() {
        return this.username_;
    }

    public v getUsernameBytes() {
        return v.s(this.username_);
    }

    public boolean hasCrisisResponseUserInCrArea() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasPrevChecksum() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasUserConfig() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasUserCountryCode() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasUserLocation() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasUsername() {
        return (this.bitField0_ & 8) != 0;
    }

    public static p newBuilder(q qVar) {
        return (p) DEFAULT_INSTANCE.createBuilder(qVar);
    }

    public static q parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (q) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static q parseFrom(v vVar, de deVar) {
        return (q) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static q parseFrom(z zVar) {
        return (q) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static q parseFrom(z zVar, de deVar) {
        return (q) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static q parseFrom(InputStream inputStream) {
        return (q) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static q parseFrom(InputStream inputStream, de deVar) {
        return (q) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static q parseFrom(ByteBuffer byteBuffer) {
        return (q) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static q parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (q) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static q parseFrom(byte[] bArr) {
        return (q) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static q parseFrom(byte[] bArr, de deVar) {
        return (q) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
