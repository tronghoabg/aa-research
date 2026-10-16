package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class axu extends com.google.v.du<axu, axt> implements com.google.v.fj {
    public static final int APP_PACKAGE_FIELD_NUMBER = 1;
    private static final axu DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<axu> PARSER = null;
    public static final int SDK_TYPE_FIELD_NUMBER = 2;
    private String appPackage_ = "";
    private int sdkType_;

    static {
        axu axuVar = new axu();
        DEFAULT_INSTANCE = axuVar;
        com.google.v.du.registerDefaultInstance(axu.class, axuVar);
    }

    private axu() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppPackage() {
        this.appPackage_ = getDefaultInstance().getAppPackage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSdkType() {
        this.sdkType_ = 0;
    }

    public static axu getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static axt newBuilder() {
        return (axt) DEFAULT_INSTANCE.createBuilder();
    }

    public static axu parseDelimitedFrom(InputStream inputStream) {
        return (axu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static axu parseFrom(com.google.v.v vVar) {
        return (axu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<axu> parser() {
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
    public void setSdkType(axv axvVar) {
        this.sdkType_ = axvVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSdkTypeValue(int i2) {
        this.sdkType_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"appPackage_", "sdkType_"});
        }
        if (iOrdinal == 3) {
            return new axu();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new axt(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<axu> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (axu.class) {
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

    public axv getSdkType() {
        axv axvVarA = axv.a(this.sdkType_);
        return axvVarA == null ? axv.UNRECOGNIZED : axvVarA;
    }

    public int getSdkTypeValue() {
        return this.sdkType_;
    }

    public static axt newBuilder(axu axuVar) {
        return (axt) DEFAULT_INSTANCE.createBuilder(axuVar);
    }

    public static axu parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (axu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static axu parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (axu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static axu parseFrom(com.google.v.z zVar) {
        return (axu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static axu parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (axu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static axu parseFrom(InputStream inputStream) {
        return (axu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static axu parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (axu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static axu parseFrom(ByteBuffer byteBuffer) {
        return (axu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static axu parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (axu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static axu parseFrom(byte[] bArr) {
        return (axu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static axu parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (axu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
