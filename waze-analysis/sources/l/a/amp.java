package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class amp extends com.google.v.du<amp, amn> implements com.google.v.fj {
    private static final amp DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<amp> PARSER = null;
    public static final int SOURCE_FIELD_NUMBER = 1;
    private int source_;

    static {
        amp ampVar = new amp();
        DEFAULT_INSTANCE = ampVar;
        com.google.v.du.registerDefaultInstance(amp.class, ampVar);
    }

    private amp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSource() {
        this.source_ = 0;
    }

    public static amp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static amn newBuilder() {
        return (amn) DEFAULT_INSTANCE.createBuilder();
    }

    public static amp parseDelimitedFrom(InputStream inputStream) {
        return (amp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static amp parseFrom(com.google.v.v vVar) {
        return (amp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<amp> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSource(amo amoVar) {
        this.source_ = amoVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceValue(int i2) {
        this.source_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"source_"});
        }
        if (iOrdinal == 3) {
            return new amp();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new amn(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<amp> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (amp.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public amo getSource() {
        amo amoVar;
        switch (this.source_) {
            case 0:
                amoVar = amo.SOURCE_UNSPECIFIED;
                break;
            case 1:
                amoVar = amo.FAVORITE;
                break;
            case 2:
                amoVar = amo.HISTORY;
                break;
            case 3:
                amoVar = amo.MAP;
                break;
            case 4:
                amoVar = amo.RESUME_NAV;
                break;
            case 5:
                amoVar = amo.SEARCH;
                break;
            case 6:
                amoVar = amo.TOP_FAVORITE;
                break;
            default:
                amoVar = null;
                break;
        }
        return amoVar == null ? amo.UNRECOGNIZED : amoVar;
    }

    public int getSourceValue() {
        return this.source_;
    }

    public static amn newBuilder(amp ampVar) {
        return (amn) DEFAULT_INSTANCE.createBuilder(ampVar);
    }

    public static amp parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (amp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static amp parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (amp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static amp parseFrom(com.google.v.z zVar) {
        return (amp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static amp parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (amp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static amp parseFrom(InputStream inputStream) {
        return (amp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static amp parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (amp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static amp parseFrom(ByteBuffer byteBuffer) {
        return (amp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static amp parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (amp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static amp parseFrom(byte[] bArr) {
        return (amp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static amp parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (amp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
