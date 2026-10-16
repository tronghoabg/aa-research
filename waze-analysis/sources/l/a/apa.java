package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class apa extends com.google.v.du<apa, aoz> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 1;
    private static final apa DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<apa> PARSER;
    private int action_;

    static {
        apa apaVar = new apa();
        DEFAULT_INSTANCE = apaVar;
        com.google.v.du.registerDefaultInstance(apa.class, apaVar);
    }

    private apa() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    public static apa getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static aoz newBuilder() {
        return (aoz) DEFAULT_INSTANCE.createBuilder();
    }

    public static apa parseDelimitedFrom(InputStream inputStream) {
        return (apa) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static apa parseFrom(com.google.v.v vVar) {
        return (apa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<apa> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(aoy aoyVar) {
        this.action_ = aoyVar.getNumber();
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
            return new apa();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aoz(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<apa> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (apa.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public aoy getAction() {
        int i2 = this.action_;
        aoy aoyVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? null : aoy.REMOVE : aoy.PREVIEW : aoy.EDIT : aoy.CLOSE : aoy.ACTION_UNSPECIFIED;
        return aoyVar == null ? aoy.UNRECOGNIZED : aoyVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public static aoz newBuilder(apa apaVar) {
        return (aoz) DEFAULT_INSTANCE.createBuilder(apaVar);
    }

    public static apa parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (apa) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static apa parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (apa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static apa parseFrom(com.google.v.z zVar) {
        return (apa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static apa parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (apa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static apa parseFrom(InputStream inputStream) {
        return (apa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static apa parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (apa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static apa parseFrom(ByteBuffer byteBuffer) {
        return (apa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static apa parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (apa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static apa parseFrom(byte[] bArr) {
        return (apa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static apa parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (apa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
