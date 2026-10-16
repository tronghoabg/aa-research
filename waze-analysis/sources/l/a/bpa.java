package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bpa extends com.google.v.du<bpa, boz> implements com.google.v.fj {
    public static final int CHANGED_FROM_FIELD_NUMBER = 1;
    public static final int CHANGED_SOURCE_FIELD_NUMBER = 3;
    public static final int CHANGED_TO_FIELD_NUMBER = 2;
    private static final bpa DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bpa> PARSER;
    private int changedSource_;
    private String changedFrom_ = "";
    private String changedTo_ = "";

    static {
        bpa bpaVar = new bpa();
        DEFAULT_INSTANCE = bpaVar;
        com.google.v.du.registerDefaultInstance(bpa.class, bpaVar);
    }

    private bpa() {
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

    public static bpa getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static boz newBuilder() {
        return (boz) DEFAULT_INSTANCE.createBuilder();
    }

    public static bpa parseDelimitedFrom(InputStream inputStream) {
        return (bpa) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bpa parseFrom(com.google.v.v vVar) {
        return (bpa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bpa> parser() {
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
            return new bpa();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new boz(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bpa> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bpa.class) {
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

    public static boz newBuilder(bpa bpaVar) {
        return (boz) DEFAULT_INSTANCE.createBuilder(bpaVar);
    }

    public static bpa parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bpa) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bpa parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bpa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bpa parseFrom(com.google.v.z zVar) {
        return (bpa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bpa parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bpa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bpa parseFrom(InputStream inputStream) {
        return (bpa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bpa parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bpa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bpa parseFrom(ByteBuffer byteBuffer) {
        return (bpa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bpa parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bpa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bpa parseFrom(byte[] bArr) {
        return (bpa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bpa parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bpa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
