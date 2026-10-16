package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class abv extends com.google.v.du<abv, abu> implements com.google.v.fj {
    public static final int ACTION_SOURCE_FIELD_NUMBER = 1;
    private static final abv DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<abv> PARSER;
    private int actionSource_;

    static {
        abv abvVar = new abv();
        DEFAULT_INSTANCE = abvVar;
        com.google.v.du.registerDefaultInstance(abv.class, abvVar);
    }

    private abv() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActionSource() {
        this.actionSource_ = 0;
    }

    public static abv getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static abu newBuilder() {
        return (abu) DEFAULT_INSTANCE.createBuilder();
    }

    public static abv parseDelimitedFrom(InputStream inputStream) {
        return (abv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static abv parseFrom(com.google.v.v vVar) {
        return (abv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<abv> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionSource(abt abtVar) {
        this.actionSource_ = abtVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionSourceValue(int i2) {
        this.actionSource_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"actionSource_"});
        }
        if (iOrdinal == 3) {
            return new abv();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new abu(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<abv> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (abv.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public abt getActionSource() {
        int i2 = this.actionSource_;
        abt abtVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : abt.MAP : abt.TOP_BAR : abt.ACTION_UNSPECIFIED;
        return abtVar == null ? abt.UNRECOGNIZED : abtVar;
    }

    public int getActionSourceValue() {
        return this.actionSource_;
    }

    public static abu newBuilder(abv abvVar) {
        return (abu) DEFAULT_INSTANCE.createBuilder(abvVar);
    }

    public static abv parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (abv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static abv parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (abv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static abv parseFrom(com.google.v.z zVar) {
        return (abv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static abv parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (abv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static abv parseFrom(InputStream inputStream) {
        return (abv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static abv parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (abv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static abv parseFrom(ByteBuffer byteBuffer) {
        return (abv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static abv parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (abv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static abv parseFrom(byte[] bArr) {
        return (abv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static abv parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (abv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
