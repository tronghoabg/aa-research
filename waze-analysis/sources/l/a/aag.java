package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aag extends com.google.v.du<aag, aae> implements com.google.v.fj {
    private static final aag DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<aag> PARSER = null;
    public static final int USER_ACTION_FIELD_NUMBER = 1;
    public static final int VOICE_INSTRUCTIONS_SOUND_FIELD_NUMBER = 2;
    private int userAction_;
    private int voiceInstructionsSound_;

    static {
        aag aagVar = new aag();
        DEFAULT_INSTANCE = aagVar;
        com.google.v.du.registerDefaultInstance(aag.class, aagVar);
    }

    private aag() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserAction() {
        this.userAction_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVoiceInstructionsSound() {
        this.voiceInstructionsSound_ = 0;
    }

    public static aag getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static aae newBuilder() {
        return (aae) DEFAULT_INSTANCE.createBuilder();
    }

    public static aag parseDelimitedFrom(InputStream inputStream) {
        return (aag) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aag parseFrom(com.google.v.v vVar) {
        return (aag) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aag> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserAction(aaf aafVar) {
        this.userAction_ = aafVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserActionValue(int i2) {
        this.userAction_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVoiceInstructionsSound(bql bqlVar) {
        this.voiceInstructionsSound_ = bqlVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVoiceInstructionsSoundValue(int i2) {
        this.voiceInstructionsSound_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", new Object[]{"userAction_", "voiceInstructionsSound_"});
        }
        if (iOrdinal == 3) {
            return new aag();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aae(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aag> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aag.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public aaf getUserAction() {
        int i2 = this.userAction_;
        aaf aafVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? null : aaf.REPORT_TRAFFIC : aaf.REPORT_POLICE : aaf.REPORT_HAZARD : aaf.REPORT_CRASH : aaf.USER_ACTION_UNSPECIFIED;
        return aafVar == null ? aaf.UNRECOGNIZED : aafVar;
    }

    public int getUserActionValue() {
        return this.userAction_;
    }

    public bql getVoiceInstructionsSound() {
        bql bqlVarA = bql.a(this.voiceInstructionsSound_);
        return bqlVarA == null ? bql.UNRECOGNIZED : bqlVarA;
    }

    public int getVoiceInstructionsSoundValue() {
        return this.voiceInstructionsSound_;
    }

    public static aae newBuilder(aag aagVar) {
        return (aae) DEFAULT_INSTANCE.createBuilder(aagVar);
    }

    public static aag parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aag) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aag parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aag) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aag parseFrom(com.google.v.z zVar) {
        return (aag) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aag parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aag) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aag parseFrom(InputStream inputStream) {
        return (aag) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aag parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aag) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aag parseFrom(ByteBuffer byteBuffer) {
        return (aag) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aag parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aag) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aag parseFrom(byte[] bArr) {
        return (aag) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aag parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aag) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
