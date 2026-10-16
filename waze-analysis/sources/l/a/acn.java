package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class acn extends com.google.v.du<acn, acl> implements com.google.v.fj {
    public static final int BUTTON_SECTION_FIELD_NUMBER = 2;
    public static final int CLICKED_BUTTON_FIELD_NUMBER = 1;
    private static final acn DEFAULT_INSTANCE;
    public static final int IN_CAR_SCREEN_MODE_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<acn> PARSER;
    private int bitField0_;
    private int buttonSection_;
    private int clickedButton_;
    private int inCarScreenMode_;

    static {
        acn acnVar = new acn();
        DEFAULT_INSTANCE = acnVar;
        com.google.v.du.registerDefaultInstance(acn.class, acnVar);
    }

    private acn() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearButtonSection() {
        this.buttonSection_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClickedButton() {
        this.clickedButton_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInCarScreenMode() {
        this.bitField0_ &= -2;
        this.inCarScreenMode_ = 0;
    }

    public static acn getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static acl newBuilder() {
        return (acl) DEFAULT_INSTANCE.createBuilder();
    }

    public static acn parseDelimitedFrom(InputStream inputStream) {
        return (acn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static acn parseFrom(com.google.v.v vVar) {
        return (acn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<acn> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButtonSection(acq acqVar) {
        this.buttonSection_ = acqVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButtonSectionValue(int i2) {
        this.buttonSection_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClickedButton(ack ackVar) {
        this.clickedButton_ = ackVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClickedButtonValue(int i2) {
        this.clickedButton_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInCarScreenMode(acm acmVar) {
        this.inCarScreenMode_ = acmVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInCarScreenModeValue(int i2) {
        this.bitField0_ |= 1;
        this.inCarScreenMode_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003ဌ\u0000", new Object[]{"bitField0_", "clickedButton_", "buttonSection_", "inCarScreenMode_"});
        }
        if (iOrdinal == 3) {
            return new acn();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new acl(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<acn> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (acn.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public acq getButtonSection() {
        int i2 = this.buttonSection_;
        acq acqVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : acq.TOP_BAR : acq.MAP : acq.LOCATION_UNSPECIFIED;
        return acqVar == null ? acq.UNRECOGNIZED : acqVar;
    }

    public int getButtonSectionValue() {
        return this.buttonSection_;
    }

    public ack getClickedButton() {
        ack ackVarA = ack.a(this.clickedButton_);
        return ackVarA == null ? ack.UNRECOGNIZED : ackVarA;
    }

    public int getClickedButtonValue() {
        return this.clickedButton_;
    }

    public acm getInCarScreenMode() {
        int i2 = this.inCarScreenMode_;
        acm acmVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : acm.IN_CAR_SCREEN_MODE_AA_COOLWALK : acm.IN_CAR_SCREEN_MODE_AA_MAIN_SCREEN : acm.IN_CAR_SCREEN_MODE_CARPLAY : acm.IN_CAR_SCREEN_MODE_UNSPECIFIED;
        return acmVar == null ? acm.UNRECOGNIZED : acmVar;
    }

    public int getInCarScreenModeValue() {
        return this.inCarScreenMode_;
    }

    public boolean hasInCarScreenMode() {
        return (this.bitField0_ & 1) != 0;
    }

    public static acl newBuilder(acn acnVar) {
        return (acl) DEFAULT_INSTANCE.createBuilder(acnVar);
    }

    public static acn parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (acn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static acn parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (acn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static acn parseFrom(com.google.v.z zVar) {
        return (acn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static acn parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (acn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static acn parseFrom(InputStream inputStream) {
        return (acn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static acn parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (acn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static acn parseFrom(ByteBuffer byteBuffer) {
        return (acn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static acn parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (acn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static acn parseFrom(byte[] bArr) {
        return (acn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static acn parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (acn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
