package i.b.l;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class bd extends com.google.v.du<bd, bc> implements com.google.v.fj {
    public static final int CONSENT_CHECKBOX_VALUE_FIELD_NUMBER = 2;
    private static final bd DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bd> PARSER = null;
    public static final int WAS_CONSENT_CHECKBOX_SHOWN_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean consentCheckboxValue_;
    private boolean wasConsentCheckboxShown_;

    static {
        bd bdVar = new bd();
        DEFAULT_INSTANCE = bdVar;
        com.google.v.du.registerDefaultInstance(bd.class, bdVar);
    }

    private bd() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConsentCheckboxValue() {
        this.bitField0_ &= -3;
        this.consentCheckboxValue_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWasConsentCheckboxShown() {
        this.bitField0_ &= -2;
        this.wasConsentCheckboxShown_ = false;
    }

    public static bd getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bc newBuilder() {
        return (bc) DEFAULT_INSTANCE.createBuilder();
    }

    public static bd parseDelimitedFrom(InputStream inputStream) {
        return (bd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bd parseFrom(com.google.v.v vVar) {
        return (bd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bd> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConsentCheckboxValue(boolean z) {
        this.bitField0_ |= 2;
        this.consentCheckboxValue_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWasConsentCheckboxShown(boolean z) {
        this.bitField0_ |= 1;
        this.wasConsentCheckboxShown_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"bitField0_", "wasConsentCheckboxShown_", "consentCheckboxValue_"});
        }
        if (iOrdinal == 3) {
            return new bd();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bc(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bd> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bd.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getConsentCheckboxValue() {
        return this.consentCheckboxValue_;
    }

    public boolean getWasConsentCheckboxShown() {
        return this.wasConsentCheckboxShown_;
    }

    public boolean hasConsentCheckboxValue() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasWasConsentCheckboxShown() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bc newBuilder(bd bdVar) {
        return (bc) DEFAULT_INSTANCE.createBuilder(bdVar);
    }

    public static bd parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bd parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bd parseFrom(com.google.v.z zVar) {
        return (bd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bd parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bd parseFrom(InputStream inputStream) {
        return (bd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bd parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bd parseFrom(ByteBuffer byteBuffer) {
        return (bd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bd parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bd parseFrom(byte[] bArr) {
        return (bd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bd parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
