package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ge extends com.google.v.du<ge, gd> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 1;
    private static final ge DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ge> PARSER = null;
    public static final int PARTNER_NAME_FIELD_NUMBER = 2;
    private int action_;
    private String partnerName_ = "";

    static {
        ge geVar = new ge();
        DEFAULT_INSTANCE = geVar;
        com.google.v.du.registerDefaultInstance(ge.class, geVar);
    }

    private ge() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPartnerName() {
        this.partnerName_ = getDefaultInstance().getPartnerName();
    }

    public static ge getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static gd newBuilder() {
        return (gd) DEFAULT_INSTANCE.createBuilder();
    }

    public static ge parseDelimitedFrom(InputStream inputStream) {
        return (ge) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ge parseFrom(com.google.v.v vVar) {
        return (ge) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ge> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(gc gcVar) {
        this.action_ = gcVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"action_", "partnerName_"});
        }
        if (iOrdinal == 3) {
            return new ge();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new gd(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ge> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ge.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public gc getAction() {
        gc gcVar;
        switch (this.action_) {
            case 0:
                gcVar = gc.ACTION_UNSPECIFIED;
                break;
            case 1:
                gcVar = gc.FORWARD;
                break;
            case 2:
                gcVar = gc.NEXT;
                break;
            case 3:
                gcVar = gc.RESUME;
                break;
            case 4:
                gcVar = gc.COLLAPSE;
                break;
            case 5:
                gcVar = gc.PLAY;
                break;
            case 6:
                gcVar = gc.REWIND;
                break;
            case 7:
                gcVar = gc.SHOW_LIST;
                break;
            case 8:
                gcVar = gc.SETTINGS;
                break;
            case 9:
                gcVar = gc.PAUSE;
                break;
            case 10:
                gcVar = gc.OPEN_PARTNER_APP;
                break;
            case 11:
                gcVar = gc.PREVIOUS;
                break;
            case 12:
                gcVar = gc.CHANGE_APP;
                break;
            case 13:
                gcVar = gc.SHUFFLE;
                break;
            case 14:
                gcVar = gc.THUMB_DOWN;
                break;
            case 15:
                gcVar = gc.FAVORITE;
                break;
            case 16:
                gcVar = gc.SAVE;
                break;
            case 17:
                gcVar = gc.REPEAT;
                break;
            case 18:
                gcVar = gc.THUMB_UP;
                break;
            default:
                gcVar = null;
                break;
        }
        return gcVar == null ? gc.UNRECOGNIZED : gcVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public String getPartnerName() {
        return this.partnerName_;
    }

    public com.google.v.v getPartnerNameBytes() {
        return com.google.v.v.s(this.partnerName_);
    }

    public static gd newBuilder(ge geVar) {
        return (gd) DEFAULT_INSTANCE.createBuilder(geVar);
    }

    public static ge parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ge) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ge parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ge) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ge parseFrom(com.google.v.z zVar) {
        return (ge) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ge parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ge) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ge parseFrom(InputStream inputStream) {
        return (ge) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ge parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ge) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ge parseFrom(ByteBuffer byteBuffer) {
        return (ge) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ge parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ge) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ge parseFrom(byte[] bArr) {
        return (ge) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ge parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ge) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
