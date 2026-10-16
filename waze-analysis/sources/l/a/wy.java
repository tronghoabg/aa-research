package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class wy extends com.google.v.du<wy, wx> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 1;
    public static final int CTA_ADDRESS_FIELD_NUMBER = 2;
    private static final wy DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<wy> PARSER;
    private int action_;
    private String ctaAddress_ = "";

    static {
        wy wyVar = new wy();
        DEFAULT_INSTANCE = wyVar;
        com.google.v.du.registerDefaultInstance(wy.class, wyVar);
    }

    private wy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCtaAddress() {
        this.ctaAddress_ = getDefaultInstance().getCtaAddress();
    }

    public static wy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static wx newBuilder() {
        return (wx) DEFAULT_INSTANCE.createBuilder();
    }

    public static wy parseDelimitedFrom(InputStream inputStream) {
        return (wy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static wy parseFrom(com.google.v.v vVar) {
        return (wy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<wy> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(ww wwVar) {
        this.action_ = wwVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCtaAddress(String str) {
        Objects.requireNonNull(str);
        this.ctaAddress_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCtaAddressBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.ctaAddress_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"action_", "ctaAddress_"});
        }
        if (iOrdinal == 3) {
            return new wy();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new wx(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<wy> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (wy.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ww getAction() {
        int i2 = this.action_;
        ww wwVar = i2 != 0 ? i2 != 1 ? null : ww.CTA : ww.ACTION_UNSPECIFIED;
        return wwVar == null ? ww.UNRECOGNIZED : wwVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public String getCtaAddress() {
        return this.ctaAddress_;
    }

    public com.google.v.v getCtaAddressBytes() {
        return com.google.v.v.s(this.ctaAddress_);
    }

    public static wx newBuilder(wy wyVar) {
        return (wx) DEFAULT_INSTANCE.createBuilder(wyVar);
    }

    public static wy parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (wy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static wy parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (wy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static wy parseFrom(com.google.v.z zVar) {
        return (wy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static wy parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (wy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static wy parseFrom(InputStream inputStream) {
        return (wy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static wy parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (wy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static wy parseFrom(ByteBuffer byteBuffer) {
        return (wy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static wy parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (wy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static wy parseFrom(byte[] bArr) {
        return (wy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static wy parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (wy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
