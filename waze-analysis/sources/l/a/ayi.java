package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ayi extends com.google.v.du<ayi, ayh> implements com.google.v.fj {
    public static final int AUTO_LANG_FIELD_NUMBER = 1;
    private static final ayi DEFAULT_INSTANCE;
    public static final int ENABLED_AUTO_DETECTION_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<ayi> PARSER;
    private String autoLang_ = "";
    private int bitField0_;
    private boolean enabledAutoDetection_;

    static {
        ayi ayiVar = new ayi();
        DEFAULT_INSTANCE = ayiVar;
        com.google.v.du.registerDefaultInstance(ayi.class, ayiVar);
    }

    private ayi() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAutoLang() {
        this.autoLang_ = getDefaultInstance().getAutoLang();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnabledAutoDetection() {
        this.bitField0_ &= -2;
        this.enabledAutoDetection_ = false;
    }

    public static ayi getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ayh newBuilder() {
        return (ayh) DEFAULT_INSTANCE.createBuilder();
    }

    public static ayi parseDelimitedFrom(InputStream inputStream) {
        return (ayi) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ayi parseFrom(com.google.v.v vVar) {
        return (ayi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ayi> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAutoLang(String str) {
        Objects.requireNonNull(str);
        this.autoLang_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAutoLangBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.autoLang_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnabledAutoDetection(boolean z) {
        this.bitField0_ |= 1;
        this.enabledAutoDetection_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဇ\u0000", new Object[]{"bitField0_", "autoLang_", "enabledAutoDetection_"});
        }
        if (iOrdinal == 3) {
            return new ayi();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ayh(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ayi> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ayi.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getAutoLang() {
        return this.autoLang_;
    }

    public com.google.v.v getAutoLangBytes() {
        return com.google.v.v.s(this.autoLang_);
    }

    public boolean getEnabledAutoDetection() {
        return this.enabledAutoDetection_;
    }

    public boolean hasEnabledAutoDetection() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ayh newBuilder(ayi ayiVar) {
        return (ayh) DEFAULT_INSTANCE.createBuilder(ayiVar);
    }

    public static ayi parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ayi) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ayi parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ayi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ayi parseFrom(com.google.v.z zVar) {
        return (ayi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ayi parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ayi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ayi parseFrom(InputStream inputStream) {
        return (ayi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ayi parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ayi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ayi parseFrom(ByteBuffer byteBuffer) {
        return (ayi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ayi parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ayi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ayi parseFrom(byte[] bArr) {
        return (ayi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ayi parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ayi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
