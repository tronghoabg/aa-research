package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class dh extends com.google.v.du<dh, dg> implements com.google.v.fj {
    public static final int APP_DOWNLOAD_URL_FIELD_NUMBER = 2;
    private static final dh DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<dh> PARSER = null;
    public static final int UNSUPPORTED_OS_FIELD_NUMBER = 1;
    private String appDownloadUrl_ = "";
    private int bitField0_;
    private boolean unsupportedOs_;

    static {
        dh dhVar = new dh();
        DEFAULT_INSTANCE = dhVar;
        com.google.v.du.registerDefaultInstance(dh.class, dhVar);
    }

    private dh() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppDownloadUrl() {
        this.bitField0_ &= -3;
        this.appDownloadUrl_ = getDefaultInstance().getAppDownloadUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnsupportedOs() {
        this.bitField0_ &= -2;
        this.unsupportedOs_ = false;
    }

    public static dh getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static dg newBuilder() {
        return (dg) DEFAULT_INSTANCE.createBuilder();
    }

    public static dh parseDelimitedFrom(InputStream inputStream) {
        return (dh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dh parseFrom(com.google.v.v vVar) {
        return (dh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<dh> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppDownloadUrl(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.appDownloadUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppDownloadUrlBytes(com.google.v.v vVar) {
        this.appDownloadUrl_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnsupportedOs(boolean z) {
        this.bitField0_ |= 1;
        this.unsupportedOs_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "unsupportedOs_", "appDownloadUrl_"});
        }
        if (iOrdinal == 3) {
            return new dh();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new dg(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<dh> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (dh.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getAppDownloadUrl() {
        return this.appDownloadUrl_;
    }

    public com.google.v.v getAppDownloadUrlBytes() {
        return com.google.v.v.s(this.appDownloadUrl_);
    }

    public boolean getUnsupportedOs() {
        return this.unsupportedOs_;
    }

    public boolean hasAppDownloadUrl() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasUnsupportedOs() {
        return (this.bitField0_ & 1) != 0;
    }

    public static dg newBuilder(dh dhVar) {
        return (dg) DEFAULT_INSTANCE.createBuilder(dhVar);
    }

    public static dh parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dh parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (dh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static dh parseFrom(com.google.v.z zVar) {
        return (dh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static dh parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (dh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static dh parseFrom(InputStream inputStream) {
        return (dh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dh parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dh parseFrom(ByteBuffer byteBuffer) {
        return (dh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static dh parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (dh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static dh parseFrom(byte[] bArr) {
        return (dh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static dh parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (dh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
