package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class d extends com.google.v.du<d, a> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 1;
    public static final int BUTTON_FIELD_NUMBER = 2;
    private static final d DEFAULT_INSTANCE;
    public static final int EMAIL_INFO_FIELD_NUMBER = 3;
    public static final int HAS_GOOGLE_EMAIL_FIELD_NUMBER = 5;
    private static volatile com.google.v.fo<d> PARSER = null;
    public static final int REGISTERED_FIELD_NUMBER = 6;
    private int action_;
    private int bitField0_;
    private int button_;
    private int emailInfo_;
    private boolean hasGoogleEmail_;
    private boolean registered_;

    static {
        d dVar = new d();
        DEFAULT_INSTANCE = dVar;
        com.google.v.du.registerDefaultInstance(d.class, dVar);
    }

    private d() {
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
    public void clearEmailInfo() {
        this.emailInfo_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasGoogleEmail() {
        this.bitField0_ &= -2;
        this.hasGoogleEmail_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegistered() {
        this.bitField0_ &= -3;
        this.registered_ = false;
    }

    public static d getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static d parseDelimitedFrom(InputStream inputStream) {
        return (d) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static d parseFrom(com.google.v.v vVar) {
        return (d) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<d> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(yl ylVar) {
        this.action_ = ylVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButton(b bVar) {
        this.button_ = bVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButtonValue(int i2) {
        this.button_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmailInfo(c cVar) {
        this.emailInfo_ = cVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmailInfoValue(int i2) {
        this.emailInfo_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasGoogleEmail(boolean z) {
        this.bitField0_ |= 1;
        this.hasGoogleEmail_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegistered(boolean z) {
        this.bitField0_ |= 2;
        this.registered_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f\u0005ဇ\u0000\u0006ဇ\u0001", new Object[]{"bitField0_", "action_", "button_", "emailInfo_", "hasGoogleEmail_", "registered_"});
        }
        if (iOrdinal == 3) {
            return new d();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new a(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<d> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (d.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public yl getAction() {
        yl ylVarA = yl.a(this.action_);
        return ylVarA == null ? yl.UNRECOGNIZED : ylVarA;
    }

    public int getActionValue() {
        return this.action_;
    }

    public b getButton() {
        b bVar;
        switch (this.button_) {
            case 0:
                bVar = b.BUTTON_UNSPECIFIED;
                break;
            case 1:
                bVar = b.USER_IMAGE;
                break;
            case 2:
                bVar = b.USERNAME;
                break;
            case 3:
                bVar = b.REGISTER;
                break;
            case 4:
            case 10:
            default:
                bVar = null;
                break;
            case 5:
                bVar = b.PASSWORD;
                break;
            case 6:
                bVar = b.LOGOUT;
                break;
            case 7:
                bVar = b.LOGIN;
                break;
            case 8:
                bVar = b.IN_CAR_SIGN_OUT;
                break;
            case 9:
                bVar = b.FULL_NAME;
                break;
            case 11:
                bVar = b.EMAIL;
                break;
            case 12:
                bVar = b.EDIT_AGE;
                break;
            case 13:
                bVar = b.DELETE_ACCOUNT;
                break;
        }
        return bVar == null ? b.UNRECOGNIZED : bVar;
    }

    public int getButtonValue() {
        return this.button_;
    }

    public c getEmailInfo() {
        int i2 = this.emailInfo_;
        c cVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : c.VERIFIED : c.UNVERIFIED : c.EMPTY : c.EMAIL_TYPE_UNSPECIFIED;
        return cVar == null ? c.UNRECOGNIZED : cVar;
    }

    public int getEmailInfoValue() {
        return this.emailInfo_;
    }

    public boolean getHasGoogleEmail() {
        return this.hasGoogleEmail_;
    }

    public boolean getRegistered() {
        return this.registered_;
    }

    public boolean hasHasGoogleEmail() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasRegistered() {
        return (this.bitField0_ & 2) != 0;
    }

    public static a newBuilder(d dVar) {
        return (a) DEFAULT_INSTANCE.createBuilder(dVar);
    }

    public static d parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (d) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static d parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (d) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static d parseFrom(com.google.v.z zVar) {
        return (d) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static d parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (d) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static d parseFrom(InputStream inputStream) {
        return (d) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static d parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (d) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static d parseFrom(ByteBuffer byteBuffer) {
        return (d) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static d parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (d) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static d parseFrom(byte[] bArr) {
        return (d) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static d parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (d) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
