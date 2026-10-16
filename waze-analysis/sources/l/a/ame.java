package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ame extends com.google.v.du<ame, amd> implements com.google.v.fj {
    private static final ame DEFAULT_INSTANCE;
    public static final int MODE_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<ame> PARSER;
    private int mode_;

    static {
        ame ameVar = new ame();
        DEFAULT_INSTANCE = ameVar;
        com.google.v.du.registerDefaultInstance(ame.class, ameVar);
    }

    private ame() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMode() {
        this.mode_ = 0;
    }

    public static ame getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static amd newBuilder() {
        return (amd) DEFAULT_INSTANCE.createBuilder();
    }

    public static ame parseDelimitedFrom(InputStream inputStream) {
        return (ame) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ame parseFrom(com.google.v.v vVar) {
        return (ame) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ame> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMode(amc amcVar) {
        this.mode_ = amcVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModeValue(int i2) {
        this.mode_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"mode_"});
        }
        if (iOrdinal == 3) {
            return new ame();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new amd(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ame> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ame.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public amc getMode() {
        amc amcVarA = amc.a(this.mode_);
        return amcVarA == null ? amc.UNRECOGNIZED : amcVarA;
    }

    public int getModeValue() {
        return this.mode_;
    }

    public static amd newBuilder(ame ameVar) {
        return (amd) DEFAULT_INSTANCE.createBuilder(ameVar);
    }

    public static ame parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ame) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ame parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ame) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ame parseFrom(com.google.v.z zVar) {
        return (ame) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ame parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ame) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ame parseFrom(InputStream inputStream) {
        return (ame) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ame parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ame) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ame parseFrom(ByteBuffer byteBuffer) {
        return (ame) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ame parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ame) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ame parseFrom(byte[] bArr) {
        return (ame) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ame parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ame) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
