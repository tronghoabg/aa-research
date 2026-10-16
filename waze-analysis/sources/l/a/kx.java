package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class kx extends com.google.v.du<kx, kw> implements com.google.v.fj {
    private static final kx DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<kx> PARSER = null;
    public static final int SETTINGS_CHANGED_FIELD_NUMBER = 1;
    private int settingsChanged_;

    static {
        kx kxVar = new kx();
        DEFAULT_INSTANCE = kxVar;
        com.google.v.du.registerDefaultInstance(kx.class, kxVar);
    }

    private kx() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSettingsChanged() {
        this.settingsChanged_ = 0;
    }

    public static kx getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static kw newBuilder() {
        return (kw) DEFAULT_INSTANCE.createBuilder();
    }

    public static kx parseDelimitedFrom(InputStream inputStream) {
        return (kx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static kx parseFrom(com.google.v.v vVar) {
        return (kx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<kx> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSettingsChanged(lc lcVar) {
        this.settingsChanged_ = lcVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSettingsChangedValue(int i2) {
        this.settingsChanged_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"settingsChanged_"});
        }
        if (iOrdinal == 3) {
            return new kx();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new kw(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<kx> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (kx.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public lc getSettingsChanged() {
        lc lcVarA = lc.a(this.settingsChanged_);
        return lcVarA == null ? lc.UNRECOGNIZED : lcVarA;
    }

    public int getSettingsChangedValue() {
        return this.settingsChanged_;
    }

    public static kw newBuilder(kx kxVar) {
        return (kw) DEFAULT_INSTANCE.createBuilder(kxVar);
    }

    public static kx parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (kx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static kx parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (kx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static kx parseFrom(com.google.v.z zVar) {
        return (kx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static kx parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (kx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static kx parseFrom(InputStream inputStream) {
        return (kx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static kx parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (kx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static kx parseFrom(ByteBuffer byteBuffer) {
        return (kx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static kx parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (kx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static kx parseFrom(byte[] bArr) {
        return (kx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static kx parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (kx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
