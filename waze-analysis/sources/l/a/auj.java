package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class auj extends com.google.v.du<auj, aug> implements com.google.v.fj {
    private static final auj DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<auj> PARSER = null;
    public static final int TRIGGER_FIELD_NUMBER = 1;
    public static final int USE_CASE_FIELD_NUMBER = 2;
    private int trigger_;
    private int useCase_;

    static {
        auj aujVar = new auj();
        DEFAULT_INSTANCE = aujVar;
        com.google.v.du.registerDefaultInstance(auj.class, aujVar);
    }

    private auj() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrigger() {
        this.trigger_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUseCase() {
        this.useCase_ = 0;
    }

    public static auj getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static aug newBuilder() {
        return (aug) DEFAULT_INSTANCE.createBuilder();
    }

    public static auj parseDelimitedFrom(InputStream inputStream) {
        return (auj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static auj parseFrom(com.google.v.v vVar) {
        return (auj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<auj> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrigger(auh auhVar) {
        this.trigger_ = auhVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTriggerValue(int i2) {
        this.trigger_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUseCase(aui auiVar) {
        this.useCase_ = auiVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUseCaseValue(int i2) {
        this.useCase_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", new Object[]{"trigger_", "useCase_"});
        }
        if (iOrdinal == 3) {
            return new auj();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aug(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<auj> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (auj.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public auh getTrigger() {
        int i2 = this.trigger_;
        auh auhVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : auh.ZERO_SPEED : auh.START_NAVIGATION : auh.TRIGGER_UNSPECIFIED;
        return auhVar == null ? auh.UNRECOGNIZED : auhVar;
    }

    public int getTriggerValue() {
        return this.trigger_;
    }

    public aui getUseCase() {
        int i2 = this.useCase_;
        aui auiVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : aui.TAP_REPORTING : aui.CONVERSATIONAL_REPORTING : aui.USE_CASE_UNSPECIFIED;
        return auiVar == null ? aui.UNRECOGNIZED : auiVar;
    }

    public int getUseCaseValue() {
        return this.useCase_;
    }

    public static aug newBuilder(auj aujVar) {
        return (aug) DEFAULT_INSTANCE.createBuilder(aujVar);
    }

    public static auj parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (auj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static auj parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (auj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static auj parseFrom(com.google.v.z zVar) {
        return (auj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static auj parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (auj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static auj parseFrom(InputStream inputStream) {
        return (auj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static auj parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (auj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static auj parseFrom(ByteBuffer byteBuffer) {
        return (auj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static auj parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (auj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static auj parseFrom(byte[] bArr) {
        return (auj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static auj parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (auj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
