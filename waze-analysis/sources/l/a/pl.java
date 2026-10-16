package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class pl extends com.google.v.du<pl, pk> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 1;
    private static final pl DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<pl> PARSER = null;
    public static final int PROMPT_TYPE_FIELD_NUMBER = 2;
    private int action_;
    private String promptType_ = "";

    static {
        pl plVar = new pl();
        DEFAULT_INSTANCE = plVar;
        com.google.v.du.registerDefaultInstance(pl.class, plVar);
    }

    private pl() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPromptType() {
        this.promptType_ = getDefaultInstance().getPromptType();
    }

    public static pl getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static pk newBuilder() {
        return (pk) DEFAULT_INSTANCE.createBuilder();
    }

    public static pl parseDelimitedFrom(InputStream inputStream) {
        return (pl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static pl parseFrom(com.google.v.v vVar) {
        return (pl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<pl> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(pj pjVar) {
        this.action_ = pjVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPromptType(String str) {
        Objects.requireNonNull(str);
        this.promptType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPromptTypeBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.promptType_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"action_", "promptType_"});
        }
        if (iOrdinal == 3) {
            return new pl();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new pk(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<pl> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (pl.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public pj getAction() {
        pj pjVar;
        switch (this.action_) {
            case 0:
                pjVar = pj.ACTION_UNSPECIFIED;
                break;
            case 1:
                pjVar = pj.SAVE_VOICE;
                break;
            case 2:
                pjVar = pj.RECORD_INSTRUCTION;
                break;
            case 3:
                pjVar = pj.PLAY_RECORDING;
                break;
            case 4:
                pjVar = pj.EDIT_VOICE_NAME;
                break;
            case 5:
                pjVar = pj.DELETE_RECORDING;
                break;
            case 6:
                pjVar = pj.SELECT_FALLBACK;
                break;
            case 7:
                pjVar = pj.DELETE_ALL_RECORDINGS;
                break;
            case 8:
                pjVar = pj.BACK;
                break;
            case 9:
                pjVar = pj.DELETE_VOICE;
                break;
            default:
                pjVar = null;
                break;
        }
        return pjVar == null ? pj.UNRECOGNIZED : pjVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public String getPromptType() {
        return this.promptType_;
    }

    public com.google.v.v getPromptTypeBytes() {
        return com.google.v.v.s(this.promptType_);
    }

    public static pk newBuilder(pl plVar) {
        return (pk) DEFAULT_INSTANCE.createBuilder(plVar);
    }

    public static pl parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (pl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static pl parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (pl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static pl parseFrom(com.google.v.z zVar) {
        return (pl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static pl parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (pl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static pl parseFrom(InputStream inputStream) {
        return (pl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static pl parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (pl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static pl parseFrom(ByteBuffer byteBuffer) {
        return (pl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static pl parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (pl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static pl parseFrom(byte[] bArr) {
        return (pl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static pl parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (pl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
