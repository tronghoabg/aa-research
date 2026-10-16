package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aau extends com.google.v.du<aau, aas> implements com.google.v.fj {
    public static final int CHANGED_FROM_FIELD_NUMBER = 1;
    public static final int CHANGED_TO_FIELD_NUMBER = 2;
    private static final aau DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<aau> PARSER;
    private int changedFrom_;
    private int changedTo_;

    static {
        aau aauVar = new aau();
        DEFAULT_INSTANCE = aauVar;
        com.google.v.du.registerDefaultInstance(aau.class, aauVar);
    }

    private aau() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChangedFrom() {
        this.changedFrom_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChangedTo() {
        this.changedTo_ = 0;
    }

    public static aau getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static aas newBuilder() {
        return (aas) DEFAULT_INSTANCE.createBuilder();
    }

    public static aau parseDelimitedFrom(InputStream inputStream) {
        return (aau) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aau parseFrom(com.google.v.v vVar) {
        return (aau) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aau> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangedFrom(aat aatVar) {
        this.changedFrom_ = aatVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangedFromValue(int i2) {
        this.changedFrom_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangedTo(aat aatVar) {
        this.changedTo_ = aatVar.getNumber();
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
            return new aau();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aas(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aau> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aau.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public aat getChangedFrom() {
        aat aatVarA = aat.a(this.changedFrom_);
        return aatVarA == null ? aat.UNRECOGNIZED : aatVarA;
    }

    public int getChangedFromValue() {
        return this.changedFrom_;
    }

    public aat getChangedTo() {
        aat aatVarA = aat.a(this.changedTo_);
        return aatVarA == null ? aat.UNRECOGNIZED : aatVarA;
    }

    public int getChangedToValue() {
        return this.changedTo_;
    }

    public static aas newBuilder(aau aauVar) {
        return (aas) DEFAULT_INSTANCE.createBuilder(aauVar);
    }

    public static aau parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aau) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aau parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aau) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aau parseFrom(com.google.v.z zVar) {
        return (aau) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aau parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aau) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aau parseFrom(InputStream inputStream) {
        return (aau) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aau parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aau) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aau parseFrom(ByteBuffer byteBuffer) {
        return (aau) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aau parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aau) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aau parseFrom(byte[] bArr) {
        return (aau) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aau parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aau) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
