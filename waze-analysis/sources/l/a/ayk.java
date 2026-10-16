package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ayk extends com.google.v.du<ayk, ayj> implements com.google.v.fj {
    public static final int CHANGED_FROM_FIELD_NUMBER = 1;
    public static final int CHANGED_TO_FIELD_NUMBER = 2;
    private static final ayk DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ayk> PARSER;
    private String changedFrom_ = "";
    private String changedTo_ = "";

    static {
        ayk aykVar = new ayk();
        DEFAULT_INSTANCE = aykVar;
        com.google.v.du.registerDefaultInstance(ayk.class, aykVar);
    }

    private ayk() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChangedFrom() {
        this.changedFrom_ = getDefaultInstance().getChangedFrom();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChangedTo() {
        this.changedTo_ = getDefaultInstance().getChangedTo();
    }

    public static ayk getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ayj newBuilder() {
        return (ayj) DEFAULT_INSTANCE.createBuilder();
    }

    public static ayk parseDelimitedFrom(InputStream inputStream) {
        return (ayk) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ayk parseFrom(com.google.v.v vVar) {
        return (ayk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ayk> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangedFrom(String str) {
        Objects.requireNonNull(str);
        this.changedFrom_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangedFromBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.changedFrom_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangedTo(String str) {
        Objects.requireNonNull(str);
        this.changedTo_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangedToBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.changedTo_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"changedFrom_", "changedTo_"});
        }
        if (iOrdinal == 3) {
            return new ayk();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ayj(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ayk> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ayk.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getChangedFrom() {
        return this.changedFrom_;
    }

    public com.google.v.v getChangedFromBytes() {
        return com.google.v.v.s(this.changedFrom_);
    }

    public String getChangedTo() {
        return this.changedTo_;
    }

    public com.google.v.v getChangedToBytes() {
        return com.google.v.v.s(this.changedTo_);
    }

    public static ayj newBuilder(ayk aykVar) {
        return (ayj) DEFAULT_INSTANCE.createBuilder(aykVar);
    }

    public static ayk parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ayk) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ayk parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ayk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ayk parseFrom(com.google.v.z zVar) {
        return (ayk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ayk parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ayk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ayk parseFrom(InputStream inputStream) {
        return (ayk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ayk parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ayk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ayk parseFrom(ByteBuffer byteBuffer) {
        return (ayk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ayk parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ayk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ayk parseFrom(byte[] bArr) {
        return (ayk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ayk parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ayk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
