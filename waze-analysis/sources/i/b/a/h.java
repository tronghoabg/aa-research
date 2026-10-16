package i.b.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h extends du<h, g> implements fj {
    private static final h DEFAULT_INSTANCE;
    public static final int ISV_BUSINESS_NAME_FIELD_NUMBER = 5;
    public static final int ISV_PRIVACY_POLICY_URI_FIELD_NUMBER = 6;
    public static final int LEARN_MORE_URI_FIELD_NUMBER = 3;
    private static volatile fo<h> PARSER = null;
    public static final int THIRD_PARTY_APPLICATION_ID_FIELD_NUMBER = 1;
    public static final int THIRD_PARTY_APPLICATION_TITLE_FIELD_NUMBER = 4;
    public static final int THIRD_PARTY_PRIVACY_POLICY_URI_FIELD_NUMBER = 2;
    private int bitField0_;
    private String thirdPartyApplicationId_ = "";
    private String thirdPartyPrivacyPolicyUri_ = "";
    private String learnMoreUri_ = "";
    private String thirdPartyApplicationTitle_ = "";
    private String isvBusinessName_ = "";
    private String isvPrivacyPolicyUri_ = "";

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        du.registerDefaultInstance(h.class, hVar);
    }

    private h() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsvBusinessName() {
        this.bitField0_ &= -17;
        this.isvBusinessName_ = getDefaultInstance().getIsvBusinessName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsvPrivacyPolicyUri() {
        this.bitField0_ &= -33;
        this.isvPrivacyPolicyUri_ = getDefaultInstance().getIsvPrivacyPolicyUri();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLearnMoreUri() {
        this.bitField0_ &= -5;
        this.learnMoreUri_ = getDefaultInstance().getLearnMoreUri();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearThirdPartyApplicationId() {
        this.bitField0_ &= -2;
        this.thirdPartyApplicationId_ = getDefaultInstance().getThirdPartyApplicationId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearThirdPartyApplicationTitle() {
        this.bitField0_ &= -9;
        this.thirdPartyApplicationTitle_ = getDefaultInstance().getThirdPartyApplicationTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearThirdPartyPrivacyPolicyUri() {
        this.bitField0_ &= -3;
        this.thirdPartyPrivacyPolicyUri_ = getDefaultInstance().getThirdPartyPrivacyPolicyUri();
    }

    public static h getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static g newBuilder() {
        return (g) DEFAULT_INSTANCE.createBuilder();
    }

    public static h parseDelimitedFrom(InputStream inputStream) {
        return (h) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static h parseFrom(v vVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<h> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsvBusinessName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.isvBusinessName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsvBusinessNameBytes(v vVar) {
        this.isvBusinessName_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsvPrivacyPolicyUri(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.isvPrivacyPolicyUri_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsvPrivacyPolicyUriBytes(v vVar) {
        this.isvPrivacyPolicyUri_ = vVar.u();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLearnMoreUri(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.learnMoreUri_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLearnMoreUriBytes(v vVar) {
        this.learnMoreUri_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setThirdPartyApplicationId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.thirdPartyApplicationId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setThirdPartyApplicationIdBytes(v vVar) {
        this.thirdPartyApplicationId_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setThirdPartyApplicationTitle(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.thirdPartyApplicationTitle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setThirdPartyApplicationTitleBytes(v vVar) {
        this.thirdPartyApplicationTitle_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setThirdPartyPrivacyPolicyUri(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.thirdPartyPrivacyPolicyUri_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setThirdPartyPrivacyPolicyUriBytes(v vVar) {
        this.thirdPartyPrivacyPolicyUri_ = vVar.u();
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"bitField0_", "thirdPartyApplicationId_", "thirdPartyPrivacyPolicyUri_", "learnMoreUri_", "thirdPartyApplicationTitle_", "isvBusinessName_", "isvPrivacyPolicyUri_"});
        }
        if (iOrdinal == 3) {
            return new h();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new g(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<h> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (h.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getIsvBusinessName() {
        return this.isvBusinessName_;
    }

    public v getIsvBusinessNameBytes() {
        return v.s(this.isvBusinessName_);
    }

    public String getIsvPrivacyPolicyUri() {
        return this.isvPrivacyPolicyUri_;
    }

    public v getIsvPrivacyPolicyUriBytes() {
        return v.s(this.isvPrivacyPolicyUri_);
    }

    public String getLearnMoreUri() {
        return this.learnMoreUri_;
    }

    public v getLearnMoreUriBytes() {
        return v.s(this.learnMoreUri_);
    }

    public String getThirdPartyApplicationId() {
        return this.thirdPartyApplicationId_;
    }

    public v getThirdPartyApplicationIdBytes() {
        return v.s(this.thirdPartyApplicationId_);
    }

    public String getThirdPartyApplicationTitle() {
        return this.thirdPartyApplicationTitle_;
    }

    public v getThirdPartyApplicationTitleBytes() {
        return v.s(this.thirdPartyApplicationTitle_);
    }

    public String getThirdPartyPrivacyPolicyUri() {
        return this.thirdPartyPrivacyPolicyUri_;
    }

    public v getThirdPartyPrivacyPolicyUriBytes() {
        return v.s(this.thirdPartyPrivacyPolicyUri_);
    }

    public boolean hasIsvBusinessName() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasIsvPrivacyPolicyUri() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasLearnMoreUri() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasThirdPartyApplicationId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasThirdPartyApplicationTitle() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasThirdPartyPrivacyPolicyUri() {
        return (this.bitField0_ & 2) != 0;
    }

    public static g newBuilder(h hVar) {
        return (g) DEFAULT_INSTANCE.createBuilder(hVar);
    }

    public static h parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (h) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static h parseFrom(v vVar, de deVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static h parseFrom(z zVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static h parseFrom(z zVar, de deVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static h parseFrom(InputStream inputStream) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static h parseFrom(InputStream inputStream, de deVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static h parseFrom(ByteBuffer byteBuffer) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static h parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static h parseFrom(byte[] bArr) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static h parseFrom(byte[] bArr, de deVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
