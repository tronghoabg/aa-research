package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bqc extends com.google.v.du<bqc, bqb> implements com.google.v.fj {
    public static final int CHANGED_FROM_FIELD_NUMBER = 1;
    public static final int CHANGED_SOURCE_FIELD_NUMBER = 3;
    public static final int CHANGED_TO_FIELD_NUMBER = 2;
    private static final bqc DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bqc> PARSER;
    private int changedSource_;
    private String changedFrom_ = "";
    private String changedTo_ = "";

    static {
        bqc bqcVar = new bqc();
        DEFAULT_INSTANCE = bqcVar;
        com.google.v.du.registerDefaultInstance(bqc.class, bqcVar);
    }

    private bqc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChangedFrom() {
        this.changedFrom_ = getDefaultInstance().getChangedFrom();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChangedSource() {
        this.changedSource_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChangedTo() {
        this.changedTo_ = getDefaultInstance().getChangedTo();
    }

    public static bqc getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bqb newBuilder() {
        return (bqb) DEFAULT_INSTANCE.createBuilder();
    }

    public static bqc parseDelimitedFrom(InputStream inputStream) {
        return (bqc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bqc parseFrom(com.google.v.v vVar) {
        return (bqc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bqc> parser() {
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
    public void setChangedSource(fv fvVar) {
        this.changedSource_ = fvVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangedSourceValue(int i2) {
        this.changedSource_ = i2;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f", new Object[]{"changedFrom_", "changedTo_", "changedSource_"});
        }
        if (iOrdinal == 3) {
            return new bqc();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bqb(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bqc> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bqc.class) {
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

    public fv getChangedSource() {
        fv fvVarA = fv.a(this.changedSource_);
        return fvVarA == null ? fv.UNRECOGNIZED : fvVarA;
    }

    public int getChangedSourceValue() {
        return this.changedSource_;
    }

    public String getChangedTo() {
        return this.changedTo_;
    }

    public com.google.v.v getChangedToBytes() {
        return com.google.v.v.s(this.changedTo_);
    }

    public static bqb newBuilder(bqc bqcVar) {
        return (bqb) DEFAULT_INSTANCE.createBuilder(bqcVar);
    }

    public static bqc parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bqc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bqc parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bqc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bqc parseFrom(com.google.v.z zVar) {
        return (bqc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bqc parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bqc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bqc parseFrom(InputStream inputStream) {
        return (bqc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bqc parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bqc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bqc parseFrom(ByteBuffer byteBuffer) {
        return (bqc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bqc parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bqc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bqc parseFrom(byte[] bArr) {
        return (bqc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bqc parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bqc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
