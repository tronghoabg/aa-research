package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aar extends com.google.v.du<aar, aap> implements com.google.v.fj {
    public static final int CHANGED_FROM_FIELD_NUMBER = 1;
    public static final int CHANGED_TO_FIELD_NUMBER = 2;
    private static final aar DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<aar> PARSER;
    private int changedFrom_;
    private int changedTo_;

    static {
        aar aarVar = new aar();
        DEFAULT_INSTANCE = aarVar;
        com.google.v.du.registerDefaultInstance(aar.class, aarVar);
    }

    private aar() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChangedFrom() {
        this.changedFrom_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChangedTo() {
        this.changedTo_ = 0;
    }

    public static aar getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static aap newBuilder() {
        return (aap) DEFAULT_INSTANCE.createBuilder();
    }

    public static aar parseDelimitedFrom(InputStream inputStream) {
        return (aar) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aar parseFrom(com.google.v.v vVar) {
        return (aar) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aar> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangedFrom(aaq aaqVar) {
        this.changedFrom_ = aaqVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangedFromValue(int i2) {
        this.changedFrom_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangedTo(aaq aaqVar) {
        this.changedTo_ = aaqVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangedToValue(int i2) {
        this.changedTo_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", new Object[]{"changedFrom_", "changedTo_"});
        }
        if (iOrdinal == 3) {
            return new aar();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aap(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aar> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aar.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public aaq getChangedFrom() {
        aaq aaqVarA = aaq.a(this.changedFrom_);
        return aaqVarA == null ? aaq.UNRECOGNIZED : aaqVarA;
    }

    public int getChangedFromValue() {
        return this.changedFrom_;
    }

    public aaq getChangedTo() {
        aaq aaqVarA = aaq.a(this.changedTo_);
        return aaqVarA == null ? aaq.UNRECOGNIZED : aaqVarA;
    }

    public int getChangedToValue() {
        return this.changedTo_;
    }

    public static aap newBuilder(aar aarVar) {
        return (aap) DEFAULT_INSTANCE.createBuilder(aarVar);
    }

    public static aar parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aar) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aar parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aar) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aar parseFrom(com.google.v.z zVar) {
        return (aar) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aar parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aar) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aar parseFrom(InputStream inputStream) {
        return (aar) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aar parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aar) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aar parseFrom(ByteBuffer byteBuffer) {
        return (aar) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aar parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aar) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aar parseFrom(byte[] bArr) {
        return (aar) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aar parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aar) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
