package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class akt extends com.google.v.du<akt, akr> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 2;
    public static final int BUTTON_FIELD_NUMBER = 1;
    public static final int CHANGED_FROM_FIELD_NUMBER = 3;
    public static final int CHANGED_TO_FIELD_NUMBER = 4;
    private static final akt DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<akt> PARSER = null;
    public static final int PARTNER_NAME_FIELD_NUMBER = 5;
    private int action_;
    private int bitField0_;
    private int button_;
    private boolean changedFrom_;
    private boolean changedTo_;
    private String partnerName_ = "";

    static {
        akt aktVar = new akt();
        DEFAULT_INSTANCE = aktVar;
        com.google.v.du.registerDefaultInstance(akt.class, aktVar);
    }

    private akt() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearButton() {
        this.button_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChangedFrom() {
        this.bitField0_ &= -2;
        this.changedFrom_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChangedTo() {
        this.bitField0_ &= -3;
        this.changedTo_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPartnerName() {
        this.partnerName_ = getDefaultInstance().getPartnerName();
    }

    public static akt getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static akr newBuilder() {
        return (akr) DEFAULT_INSTANCE.createBuilder();
    }

    public static akt parseDelimitedFrom(InputStream inputStream) {
        return (akt) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static akt parseFrom(com.google.v.v vVar) {
        return (akt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<akt> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(bbs bbsVar) {
        this.action_ = bbsVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButton(aks aksVar) {
        this.button_ = aksVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButtonValue(int i2) {
        this.button_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangedFrom(boolean z) {
        this.bitField0_ |= 1;
        this.changedFrom_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangedTo(boolean z) {
        this.bitField0_ |= 2;
        this.changedTo_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPartnerName(String str) {
        Objects.requireNonNull(str);
        this.partnerName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPartnerNameBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.partnerName_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002\f\u0003ဇ\u0000\u0004ဇ\u0001\u0005Ȉ", new Object[]{"bitField0_", "button_", "action_", "changedFrom_", "changedTo_", "partnerName_"});
        }
        if (iOrdinal == 3) {
            return new akt();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new akr(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<akt> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (akt.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bbs getAction() {
        bbs bbsVarA = bbs.a(this.action_);
        return bbsVarA == null ? bbs.UNRECOGNIZED : bbsVarA;
    }

    public int getActionValue() {
        return this.action_;
    }

    public aks getButton() {
        int i2 = this.button_;
        aks aksVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : aks.OTHER_PARTNER_APP : aks.ENABLE_ALERT_WHILE_MUSIC_PLAYING : aks.ENABLE_AUDIO_APPS : aks.BUTTON_UNSPECIFIED;
        return aksVar == null ? aks.UNRECOGNIZED : aksVar;
    }

    public int getButtonValue() {
        return this.button_;
    }

    public boolean getChangedFrom() {
        return this.changedFrom_;
    }

    public boolean getChangedTo() {
        return this.changedTo_;
    }

    public String getPartnerName() {
        return this.partnerName_;
    }

    public com.google.v.v getPartnerNameBytes() {
        return com.google.v.v.s(this.partnerName_);
    }

    public boolean hasChangedFrom() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasChangedTo() {
        return (this.bitField0_ & 2) != 0;
    }

    public static akr newBuilder(akt aktVar) {
        return (akr) DEFAULT_INSTANCE.createBuilder(aktVar);
    }

    public static akt parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (akt) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static akt parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (akt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static akt parseFrom(com.google.v.z zVar) {
        return (akt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static akt parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (akt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static akt parseFrom(InputStream inputStream) {
        return (akt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static akt parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (akt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static akt parseFrom(ByteBuffer byteBuffer) {
        return (akt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static akt parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (akt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static akt parseFrom(byte[] bArr) {
        return (akt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static akt parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (akt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
