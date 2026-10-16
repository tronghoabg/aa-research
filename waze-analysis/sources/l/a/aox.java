package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aox extends com.google.v.du<aox, aow> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 1;
    private static final aox DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<aox> PARSER;
    private int action_;

    static {
        aox aoxVar = new aox();
        DEFAULT_INSTANCE = aoxVar;
        com.google.v.du.registerDefaultInstance(aox.class, aoxVar);
    }

    private aox() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    public static aox getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static aow newBuilder() {
        return (aow) DEFAULT_INSTANCE.createBuilder();
    }

    public static aox parseDelimitedFrom(InputStream inputStream) {
        return (aox) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aox parseFrom(com.google.v.v vVar) {
        return (aox) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aox> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(aov aovVar) {
        this.action_ = aovVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"action_"});
        }
        if (iOrdinal == 3) {
            return new aox();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aow(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aox> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aox.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public aov getAction() {
        int i2 = this.action_;
        aov aovVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : aov.RECENTER : aov.OVERVIEW : aov.ACTION_UNSPECIFIED;
        return aovVar == null ? aov.UNRECOGNIZED : aovVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public static aow newBuilder(aox aoxVar) {
        return (aow) DEFAULT_INSTANCE.createBuilder(aoxVar);
    }

    public static aox parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aox) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aox parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aox) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aox parseFrom(com.google.v.z zVar) {
        return (aox) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aox parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aox) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aox parseFrom(InputStream inputStream) {
        return (aox) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aox parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aox) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aox parseFrom(ByteBuffer byteBuffer) {
        return (aox) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aox parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aox) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aox parseFrom(byte[] bArr) {
        return (aox) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aox parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aox) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
