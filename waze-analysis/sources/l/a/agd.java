package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class agd extends com.google.v.du<agd, agc> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 1;
    private static final agd DEFAULT_INSTANCE;
    public static final int MATCH_CONTENT_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<agd> PARSER;
    private int action_;
    private int bitField0_;
    private String matchContent_ = "";

    static {
        agd agdVar = new agd();
        DEFAULT_INSTANCE = agdVar;
        com.google.v.du.registerDefaultInstance(agd.class, agdVar);
    }

    private agd() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMatchContent() {
        this.bitField0_ &= -2;
        this.matchContent_ = getDefaultInstance().getMatchContent();
    }

    public static agd getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static agc newBuilder() {
        return (agc) DEFAULT_INSTANCE.createBuilder();
    }

    public static agd parseDelimitedFrom(InputStream inputStream) {
        return (agd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static agd parseFrom(com.google.v.v vVar) {
        return (agd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<agd> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(agb agbVar) {
        this.action_ = agbVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMatchContent(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.matchContent_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMatchContentBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.matchContent_ = vVar.u();
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002ለ\u0000", new Object[]{"bitField0_", "action_", "matchContent_"});
        }
        if (iOrdinal == 3) {
            return new agd();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new agc(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<agd> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (agd.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public agb getAction() {
        agb agbVar;
        switch (this.action_) {
            case 0:
                agbVar = agb.ACTION_UNSPECIFIED;
                break;
            case 1:
                agbVar = agb.CLOSE;
                break;
            case 2:
                agbVar = agb.CLICKED_LEADING_BUTTON;
                break;
            case 3:
                agbVar = agb.CLICKED_TRAILING_BUTTON;
                break;
            case 4:
                agbVar = agb.GENERAL_CARD_CLICK;
                break;
            case 5:
                agbVar = agb.TIMEOUT;
                break;
            case 6:
                agbVar = agb.CLOSED_BY_APP;
                break;
            case 7:
                agbVar = agb.TAPPED_MAP;
                break;
            case 8:
                agbVar = agb.DRAGGED_MAP;
                break;
            case 9:
                agbVar = agb.SWIPED_TO_DISMISS;
                break;
            default:
                agbVar = null;
                break;
        }
        return agbVar == null ? agb.UNRECOGNIZED : agbVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public String getMatchContent() {
        return this.matchContent_;
    }

    public com.google.v.v getMatchContentBytes() {
        return com.google.v.v.s(this.matchContent_);
    }

    public boolean hasMatchContent() {
        return (this.bitField0_ & 1) != 0;
    }

    public static agc newBuilder(agd agdVar) {
        return (agc) DEFAULT_INSTANCE.createBuilder(agdVar);
    }

    public static agd parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (agd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static agd parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (agd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static agd parseFrom(com.google.v.z zVar) {
        return (agd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static agd parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (agd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static agd parseFrom(InputStream inputStream) {
        return (agd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static agd parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (agd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static agd parseFrom(ByteBuffer byteBuffer) {
        return (agd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static agd parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (agd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static agd parseFrom(byte[] bArr) {
        return (agd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static agd parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (agd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
