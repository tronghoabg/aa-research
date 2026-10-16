package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aga extends com.google.v.du<aga, afy> implements com.google.v.fj {
    public static final int APP_PACKAGE_FIELD_NUMBER = 1;
    public static final int DEEPLINK_ACTION_FIELD_NUMBER = 4;
    private static final aga DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<aga> PARSER = null;
    public static final int SDK_TYPE_FIELD_NUMBER = 5;
    public static final int TYPE_FIELD_NUMBER = 2;
    public static final int URL_FIELD_NUMBER = 3;
    private int sdkType_;
    private int type_;
    private String appPackage_ = "";
    private String url_ = "";
    private String deeplinkAction_ = "";

    static {
        aga agaVar = new aga();
        DEFAULT_INSTANCE = agaVar;
        com.google.v.du.registerDefaultInstance(aga.class, agaVar);
    }

    private aga() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppPackage() {
        this.appPackage_ = getDefaultInstance().getAppPackage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeeplinkAction() {
        this.deeplinkAction_ = getDefaultInstance().getDeeplinkAction();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSdkType() {
        this.sdkType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrl() {
        this.url_ = getDefaultInstance().getUrl();
    }

    public static aga getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static afy newBuilder() {
        return (afy) DEFAULT_INSTANCE.createBuilder();
    }

    public static aga parseDelimitedFrom(InputStream inputStream) {
        return (aga) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aga parseFrom(com.google.v.v vVar) {
        return (aga) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aga> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppPackage(String str) {
        Objects.requireNonNull(str);
        this.appPackage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppPackageBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.appPackage_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeeplinkAction(String str) {
        Objects.requireNonNull(str);
        this.deeplinkAction_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeeplinkActionBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.deeplinkAction_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSdkType(axv axvVar) {
        this.sdkType_ = axvVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSdkTypeValue(int i2) {
        this.sdkType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(afz afzVar) {
        this.type_ = afzVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i2) {
        this.type_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrl(String str) {
        Objects.requireNonNull(str);
        this.url_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrlBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.url_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003Ȉ\u0004Ȉ\u0005\f", new Object[]{"appPackage_", "type_", "url_", "deeplinkAction_", "sdkType_"});
        }
        if (iOrdinal == 3) {
            return new aga();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new afy(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aga> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aga.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getAppPackage() {
        return this.appPackage_;
    }

    public com.google.v.v getAppPackageBytes() {
        return com.google.v.v.s(this.appPackage_);
    }

    @Deprecated
    public String getDeeplinkAction() {
        return this.deeplinkAction_;
    }

    @Deprecated
    public com.google.v.v getDeeplinkActionBytes() {
        return com.google.v.v.s(this.deeplinkAction_);
    }

    public axv getSdkType() {
        axv axvVarA = axv.a(this.sdkType_);
        return axvVarA == null ? axv.UNRECOGNIZED : axvVarA;
    }

    public int getSdkTypeValue() {
        return this.sdkType_;
    }

    @Deprecated
    public afz getType() {
        afz afzVar;
        switch (this.type_) {
            case 0:
                afzVar = afz.TYPE_UNSPECIFIED;
                break;
            case 1:
                afzVar = afz.FIREBASE;
                break;
            case 2:
                afzVar = afz.WAZE_UNIVERSAL_LINK;
                break;
            case 3:
                afzVar = afz.NON_WAZE_UNIVERSAL_LINK;
                break;
            case 4:
                afzVar = afz.EXPLICIT_INTENT;
                break;
            case 5:
                afzVar = afz.IMPLICIT_INTENT;
                break;
            case 6:
                afzVar = afz.DEEP_LINK;
                break;
            default:
                afzVar = null;
                break;
        }
        return afzVar == null ? afz.UNRECOGNIZED : afzVar;
    }

    @Deprecated
    public int getTypeValue() {
        return this.type_;
    }

    public String getUrl() {
        return this.url_;
    }

    public com.google.v.v getUrlBytes() {
        return com.google.v.v.s(this.url_);
    }

    public static afy newBuilder(aga agaVar) {
        return (afy) DEFAULT_INSTANCE.createBuilder(agaVar);
    }

    public static aga parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aga) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aga parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aga) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aga parseFrom(com.google.v.z zVar) {
        return (aga) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aga parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aga) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aga parseFrom(InputStream inputStream) {
        return (aga) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aga parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aga) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aga parseFrom(ByteBuffer byteBuffer) {
        return (aga) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aga parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aga) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aga parseFrom(byte[] bArr) {
        return (aga) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aga parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aga) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
