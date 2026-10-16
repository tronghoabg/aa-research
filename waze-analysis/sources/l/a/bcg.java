package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bcg extends com.google.v.du<bcg, bcf> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 1;
    private static final bcg DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bcg> PARSER = null;
    public static final int USER_CUSTOM_VOICE_ID_FIELD_NUMBER = 2;
    private int action_;
    private String userCustomVoiceId_ = "";

    static {
        bcg bcgVar = new bcg();
        DEFAULT_INSTANCE = bcgVar;
        com.google.v.du.registerDefaultInstance(bcg.class, bcgVar);
    }

    private bcg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserCustomVoiceId() {
        this.userCustomVoiceId_ = getDefaultInstance().getUserCustomVoiceId();
    }

    public static bcg getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bcf newBuilder() {
        return (bcf) DEFAULT_INSTANCE.createBuilder();
    }

    public static bcg parseDelimitedFrom(InputStream inputStream) {
        return (bcg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bcg parseFrom(com.google.v.v vVar) {
        return (bcg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bcg> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(bcc bccVar) {
        this.action_ = bccVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserCustomVoiceId(String str) {
        Objects.requireNonNull(str);
        this.userCustomVoiceId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserCustomVoiceIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.userCustomVoiceId_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"action_", "userCustomVoiceId_"});
        }
        if (iOrdinal == 3) {
            return new bcg();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bcf(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bcg> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bcg.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bcc getAction() {
        bcc bccVarA = bcc.a(this.action_);
        return bccVarA == null ? bcc.UNRECOGNIZED : bccVarA;
    }

    public int getActionValue() {
        return this.action_;
    }

    public String getUserCustomVoiceId() {
        return this.userCustomVoiceId_;
    }

    public com.google.v.v getUserCustomVoiceIdBytes() {
        return com.google.v.v.s(this.userCustomVoiceId_);
    }

    public static bcf newBuilder(bcg bcgVar) {
        return (bcf) DEFAULT_INSTANCE.createBuilder(bcgVar);
    }

    public static bcg parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bcg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bcg parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bcg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bcg parseFrom(com.google.v.z zVar) {
        return (bcg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bcg parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bcg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bcg parseFrom(InputStream inputStream) {
        return (bcg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bcg parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bcg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bcg parseFrom(ByteBuffer byteBuffer) {
        return (bcg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bcg parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bcg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bcg parseFrom(byte[] bArr) {
        return (bcg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bcg parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bcg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
