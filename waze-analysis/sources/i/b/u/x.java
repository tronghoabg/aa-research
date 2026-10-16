package i.b.u;

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
/* loaded from: classes8.dex */
public final class x extends du<x, w> implements fj {
    public static final int APP_TYPE_FIELD_NUMBER = 8;
    public static final int CHANNEL_FIELD_NUMBER = 6;
    private static final x DEFAULT_INSTANCE;
    public static final int EMAIL_FIELD_NUMBER = 3;
    public static final int EMAIL_TYPE_FIELD_NUMBER = 4;
    public static final int LOCALE_FIELD_NUMBER = 2;
    private static volatile fo<x> PARSER = null;
    public static final int PAYLOAD_FIELD_NUMBER = 7;
    public static final int REQUIRE_PIN_CODE_FIELD_NUMBER = 10;
    public static final int TRACK_EMAIL_LINK_FIELD_NUMBER = 9;
    public static final int USER_ID_FIELD_NUMBER = 1;
    public static final int USE_CUSTOM_VERIFICATION_EMAIL_FIELD_NUMBER = 5;
    public static final int USE_NEW_ERROR_SCHEME_FIELD_NUMBER = 11;
    private int appType_;
    private int bitField0_;
    private int emailType_;
    private boolean requirePinCode_;
    private boolean trackEmailLink_;
    private boolean useCustomVerificationEmail_;
    private boolean useNewErrorScheme_;
    private long userId_;
    private String locale_ = "";
    private String email_ = "";
    private String channel_ = "";
    private String payload_ = "";

    static {
        x xVar = new x();
        DEFAULT_INSTANCE = xVar;
        du.registerDefaultInstance(x.class, xVar);
    }

    private x() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppType() {
        this.bitField0_ &= -129;
        this.appType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChannel() {
        this.bitField0_ &= -33;
        this.channel_ = getDefaultInstance().getChannel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEmail() {
        this.bitField0_ &= -5;
        this.email_ = getDefaultInstance().getEmail();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEmailType() {
        this.bitField0_ &= -9;
        this.emailType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocale() {
        this.bitField0_ &= -3;
        this.locale_ = getDefaultInstance().getLocale();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPayload() {
        this.bitField0_ &= -65;
        this.payload_ = getDefaultInstance().getPayload();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequirePinCode() {
        this.bitField0_ &= -513;
        this.requirePinCode_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackEmailLink() {
        this.bitField0_ &= -257;
        this.trackEmailLink_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUseCustomVerificationEmail() {
        this.bitField0_ &= -17;
        this.useCustomVerificationEmail_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUseNewErrorScheme() {
        this.bitField0_ &= -1025;
        this.useNewErrorScheme_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserId() {
        this.bitField0_ &= -2;
        this.userId_ = 0L;
    }

    public static x getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static w newBuilder() {
        return (w) DEFAULT_INSTANCE.createBuilder();
    }

    public static x parseDelimitedFrom(InputStream inputStream) {
        return (x) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static x parseFrom(com.google.v.v vVar) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<x> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppType(i.b.n nVar) {
        this.appType_ = nVar.getNumber();
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChannel(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.channel_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChannelBytes(com.google.v.v vVar) {
        this.channel_ = vVar.u();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmail(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.email_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmailBytes(com.google.v.v vVar) {
        this.email_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmailType(i iVar) {
        this.emailType_ = iVar.getNumber();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocale(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.locale_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocaleBytes(com.google.v.v vVar) {
        this.locale_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPayload(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 64;
        this.payload_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPayloadBytes(com.google.v.v vVar) {
        this.payload_ = vVar.u();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequirePinCode(boolean z) {
        this.bitField0_ |= 512;
        this.requirePinCode_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackEmailLink(boolean z) {
        this.bitField0_ |= 256;
        this.trackEmailLink_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUseCustomVerificationEmail(boolean z) {
        this.bitField0_ |= 16;
        this.useCustomVerificationEmail_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUseNewErrorScheme(boolean z) {
        this.bitField0_ |= 1024;
        this.useNewErrorScheme_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserId(long j2) {
        this.bitField0_ |= 1;
        this.userId_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004᠌\u0003\u0005ဇ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\b᠌\u0007\tဇ\b\nဇ\t\u000bဇ\n", new Object[]{"bitField0_", "userId_", "locale_", "email_", "emailType_", h.f49310a, "useCustomVerificationEmail_", "channel_", "payload_", "appType_", i.b.n.a(), "trackEmailLink_", "requirePinCode_", "useNewErrorScheme_"});
        }
        if (iOrdinal == 3) {
            return new x();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new w(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<x> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (x.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public i.b.n getAppType() {
        i.b.n nVarB = i.b.n.b(this.appType_);
        return nVarB == null ? i.b.n.UNKNOWN_APP_TYPE : nVarB;
    }

    public String getChannel() {
        return this.channel_;
    }

    public com.google.v.v getChannelBytes() {
        return com.google.v.v.s(this.channel_);
    }

    public String getEmail() {
        return this.email_;
    }

    public com.google.v.v getEmailBytes() {
        return com.google.v.v.s(this.email_);
    }

    public i getEmailType() {
        i iVarA = i.a(this.emailType_);
        return iVarA == null ? i.EMAIL_TYPE_UNKNOWN : iVarA;
    }

    public String getLocale() {
        return this.locale_;
    }

    public com.google.v.v getLocaleBytes() {
        return com.google.v.v.s(this.locale_);
    }

    public String getPayload() {
        return this.payload_;
    }

    public com.google.v.v getPayloadBytes() {
        return com.google.v.v.s(this.payload_);
    }

    public boolean getRequirePinCode() {
        return this.requirePinCode_;
    }

    public boolean getTrackEmailLink() {
        return this.trackEmailLink_;
    }

    public boolean getUseCustomVerificationEmail() {
        return this.useCustomVerificationEmail_;
    }

    public boolean getUseNewErrorScheme() {
        return this.useNewErrorScheme_;
    }

    public long getUserId() {
        return this.userId_;
    }

    public boolean hasAppType() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasChannel() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasEmail() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasEmailType() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasLocale() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasPayload() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasRequirePinCode() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasTrackEmailLink() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasUseCustomVerificationEmail() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasUseNewErrorScheme() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasUserId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static w newBuilder(x xVar) {
        return (w) DEFAULT_INSTANCE.createBuilder(xVar);
    }

    public static x parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (x) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static x parseFrom(com.google.v.v vVar, de deVar) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static x parseFrom(com.google.v.z zVar) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static x parseFrom(com.google.v.z zVar, de deVar) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static x parseFrom(InputStream inputStream) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static x parseFrom(InputStream inputStream, de deVar) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static x parseFrom(ByteBuffer byteBuffer) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static x parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static x parseFrom(byte[] bArr) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static x parseFrom(byte[] bArr, de deVar) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
