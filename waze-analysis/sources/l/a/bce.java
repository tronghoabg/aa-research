package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bce extends com.google.v.du<bce, bcd> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 1;
    private static final bce DEFAULT_INSTANCE;
    public static final int OPERATING_SYSTEM_SHARE_OPTIONS_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<bce> PARSER = null;
    public static final int SHARE_PLATFORM_TYPE_FIELD_NUMBER = 2;
    private int action_;
    private String sharePlatformType_ = "";
    private String operatingSystemShareOptions_ = "";

    static {
        bce bceVar = new bce();
        DEFAULT_INSTANCE = bceVar;
        com.google.v.du.registerDefaultInstance(bce.class, bceVar);
    }

    private bce() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOperatingSystemShareOptions() {
        this.operatingSystemShareOptions_ = getDefaultInstance().getOperatingSystemShareOptions();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSharePlatformType() {
        this.sharePlatformType_ = getDefaultInstance().getSharePlatformType();
    }

    public static bce getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bcd newBuilder() {
        return (bcd) DEFAULT_INSTANCE.createBuilder();
    }

    public static bce parseDelimitedFrom(InputStream inputStream) {
        return (bce) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bce parseFrom(com.google.v.v vVar) {
        return (bce) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bce> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(bcc bccVar) {
        this.action_ = bccVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOperatingSystemShareOptions(String str) {
        Objects.requireNonNull(str);
        this.operatingSystemShareOptions_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOperatingSystemShareOptionsBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.operatingSystemShareOptions_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSharePlatformType(String str) {
        Objects.requireNonNull(str);
        this.sharePlatformType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSharePlatformTypeBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.sharePlatformType_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ", new Object[]{"action_", "sharePlatformType_", "operatingSystemShareOptions_"});
        }
        if (iOrdinal == 3) {
            return new bce();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bcd(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bce> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bce.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bcc getAction() {
        bcc bccVarA = bcc.a(this.action_);
        return bccVarA == null ? bcc.UNRECOGNIZED : bccVarA;
    }

    public int getActionValue() {
        return this.action_;
    }

    public String getOperatingSystemShareOptions() {
        return this.operatingSystemShareOptions_;
    }

    public com.google.v.v getOperatingSystemShareOptionsBytes() {
        return com.google.v.v.s(this.operatingSystemShareOptions_);
    }

    public String getSharePlatformType() {
        return this.sharePlatformType_;
    }

    public com.google.v.v getSharePlatformTypeBytes() {
        return com.google.v.v.s(this.sharePlatformType_);
    }

    public static bcd newBuilder(bce bceVar) {
        return (bcd) DEFAULT_INSTANCE.createBuilder(bceVar);
    }

    public static bce parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bce) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bce parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bce) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bce parseFrom(com.google.v.z zVar) {
        return (bce) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bce parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bce) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bce parseFrom(InputStream inputStream) {
        return (bce) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bce parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bce) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bce parseFrom(ByteBuffer byteBuffer) {
        return (bce) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bce parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bce) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bce parseFrom(byte[] bArr) {
        return (bce) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bce parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bce) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
