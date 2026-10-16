package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class tl extends com.google.v.du<tl, tj> implements com.google.v.fj {
    private static final tl DEFAULT_INSTANCE;
    public static final int FREQUENCY_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<tl> PARSER;
    private int frequency_;

    static {
        tl tlVar = new tl();
        DEFAULT_INSTANCE = tlVar;
        com.google.v.du.registerDefaultInstance(tl.class, tlVar);
    }

    private tl() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFrequency() {
        this.frequency_ = 0;
    }

    public static tl getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static tj newBuilder() {
        return (tj) DEFAULT_INSTANCE.createBuilder();
    }

    public static tl parseDelimitedFrom(InputStream inputStream) {
        return (tl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static tl parseFrom(com.google.v.v vVar) {
        return (tl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<tl> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFrequency(tk tkVar) {
        this.frequency_ = tkVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFrequencyValue(int i2) {
        this.frequency_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"frequency_"});
        }
        if (iOrdinal == 3) {
            return new tl();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new tj(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<tl> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (tl.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public tk getFrequency() {
        int i2 = this.frequency_;
        tk tkVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : tk.DAILY : tk.EVERY_COLD_START : tk.FREQUENCY_UNSPECIFIED;
        return tkVar == null ? tk.UNRECOGNIZED : tkVar;
    }

    public int getFrequencyValue() {
        return this.frequency_;
    }

    public static tj newBuilder(tl tlVar) {
        return (tj) DEFAULT_INSTANCE.createBuilder(tlVar);
    }

    public static tl parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (tl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static tl parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (tl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static tl parseFrom(com.google.v.z zVar) {
        return (tl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static tl parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (tl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static tl parseFrom(InputStream inputStream) {
        return (tl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static tl parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (tl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static tl parseFrom(ByteBuffer byteBuffer) {
        return (tl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static tl parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (tl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static tl parseFrom(byte[] bArr) {
        return (tl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static tl parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (tl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
