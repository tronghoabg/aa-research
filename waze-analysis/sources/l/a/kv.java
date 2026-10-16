package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class kv extends com.google.v.du<kv, ku> implements com.google.v.fj {
    private static final kv DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<kv> PARSER = null;
    public static final int SETTINGS_CHANGED_FIELD_NUMBER = 1;
    private int settingsChanged_;

    static {
        kv kvVar = new kv();
        DEFAULT_INSTANCE = kvVar;
        com.google.v.du.registerDefaultInstance(kv.class, kvVar);
    }

    private kv() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSettingsChanged() {
        this.settingsChanged_ = 0;
    }

    public static kv getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ku newBuilder() {
        return (ku) DEFAULT_INSTANCE.createBuilder();
    }

    public static kv parseDelimitedFrom(InputStream inputStream) {
        return (kv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static kv parseFrom(com.google.v.v vVar) {
        return (kv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<kv> parser() {
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
            return new kv();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ku(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<kv> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (kv.class) {
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

    public static ku newBuilder(kv kvVar) {
        return (ku) DEFAULT_INSTANCE.createBuilder(kvVar);
    }

    public static kv parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (kv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static kv parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (kv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static kv parseFrom(com.google.v.z zVar) {
        return (kv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static kv parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (kv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static kv parseFrom(InputStream inputStream) {
        return (kv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static kv parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (kv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static kv parseFrom(ByteBuffer byteBuffer) {
        return (kv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static kv parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (kv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static kv parseFrom(byte[] bArr) {
        return (kv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static kv parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (kv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
