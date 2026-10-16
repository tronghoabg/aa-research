package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class id extends com.google.v.du<id, ib> implements com.google.v.fj {
    public static final int CHANGED_FROM_FIELD_NUMBER = 1;
    public static final int CHANGED_TO_FIELD_NUMBER = 2;
    private static final id DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<id> PARSER;
    private int changedFrom_;
    private int changedTo_;

    static {
        id idVar = new id();
        DEFAULT_INSTANCE = idVar;
        com.google.v.du.registerDefaultInstance(id.class, idVar);
    }

    private id() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChangedFrom() {
        this.changedFrom_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChangedTo() {
        this.changedTo_ = 0;
    }

    public static id getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ib newBuilder() {
        return (ib) DEFAULT_INSTANCE.createBuilder();
    }

    public static id parseDelimitedFrom(InputStream inputStream) {
        return (id) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static id parseFrom(com.google.v.v vVar) {
        return (id) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<id> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangedFrom(ic icVar) {
        this.changedFrom_ = icVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangedFromValue(int i2) {
        this.changedFrom_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangedTo(ic icVar) {
        this.changedTo_ = icVar.getNumber();
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
            return new id();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ib(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<id> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (id.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ic getChangedFrom() {
        ic icVarA = ic.a(this.changedFrom_);
        return icVarA == null ? ic.UNRECOGNIZED : icVarA;
    }

    public int getChangedFromValue() {
        return this.changedFrom_;
    }

    public ic getChangedTo() {
        ic icVarA = ic.a(this.changedTo_);
        return icVarA == null ? ic.UNRECOGNIZED : icVarA;
    }

    public int getChangedToValue() {
        return this.changedTo_;
    }

    public static ib newBuilder(id idVar) {
        return (ib) DEFAULT_INSTANCE.createBuilder(idVar);
    }

    public static id parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (id) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static id parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (id) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static id parseFrom(com.google.v.z zVar) {
        return (id) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static id parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (id) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static id parseFrom(InputStream inputStream) {
        return (id) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static id parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (id) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static id parseFrom(ByteBuffer byteBuffer) {
        return (id) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static id parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (id) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static id parseFrom(byte[] bArr) {
        return (id) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static id parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (id) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
