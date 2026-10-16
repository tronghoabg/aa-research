package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ajv extends com.google.v.du<ajv, aju> implements com.google.v.fj {
    public static final int BACK_BUTTON_AVAILABLE_FIELD_NUMBER = 1;
    public static final int CLOSE_BUTTON_AVAILABLE_FIELD_NUMBER = 2;
    private static final ajv DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ajv> PARSER = null;
    public static final int SHARE_BUTTON_AVAILABLE_FIELD_NUMBER = 3;
    private boolean backButtonAvailable_;
    private int bitField0_;
    private boolean closeButtonAvailable_;
    private boolean shareButtonAvailable_;

    static {
        ajv ajvVar = new ajv();
        DEFAULT_INSTANCE = ajvVar;
        com.google.v.du.registerDefaultInstance(ajv.class, ajvVar);
    }

    private ajv() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBackButtonAvailable() {
        this.bitField0_ &= -2;
        this.backButtonAvailable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCloseButtonAvailable() {
        this.bitField0_ &= -3;
        this.closeButtonAvailable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShareButtonAvailable() {
        this.bitField0_ &= -5;
        this.shareButtonAvailable_ = false;
    }

    public static ajv getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static aju newBuilder() {
        return (aju) DEFAULT_INSTANCE.createBuilder();
    }

    public static ajv parseDelimitedFrom(InputStream inputStream) {
        return (ajv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ajv parseFrom(com.google.v.v vVar) {
        return (ajv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ajv> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBackButtonAvailable(boolean z) {
        this.bitField0_ |= 1;
        this.backButtonAvailable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCloseButtonAvailable(boolean z) {
        this.bitField0_ |= 2;
        this.closeButtonAvailable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShareButtonAvailable(boolean z) {
        this.bitField0_ |= 4;
        this.shareButtonAvailable_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"bitField0_", "backButtonAvailable_", "closeButtonAvailable_", "shareButtonAvailable_"});
        }
        if (iOrdinal == 3) {
            return new ajv();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aju(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ajv> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ajv.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getBackButtonAvailable() {
        return this.backButtonAvailable_;
    }

    public boolean getCloseButtonAvailable() {
        return this.closeButtonAvailable_;
    }

    public boolean getShareButtonAvailable() {
        return this.shareButtonAvailable_;
    }

    public boolean hasBackButtonAvailable() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasCloseButtonAvailable() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasShareButtonAvailable() {
        return (this.bitField0_ & 4) != 0;
    }

    public static aju newBuilder(ajv ajvVar) {
        return (aju) DEFAULT_INSTANCE.createBuilder(ajvVar);
    }

    public static ajv parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ajv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ajv parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ajv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ajv parseFrom(com.google.v.z zVar) {
        return (ajv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ajv parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ajv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ajv parseFrom(InputStream inputStream) {
        return (ajv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ajv parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ajv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ajv parseFrom(ByteBuffer byteBuffer) {
        return (ajv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ajv parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ajv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ajv parseFrom(byte[] bArr) {
        return (ajv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ajv parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ajv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
