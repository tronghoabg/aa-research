package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bel extends com.google.v.du<bel, bek> implements com.google.v.fj {
    private static final bel DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bel> PARSER = null;
    public static final int REPORT_TYPE_FIELD_NUMBER = 1;
    public static final int UGC_CONTEXT_ID_FIELD_NUMBER = 2;
    private int reportType_;
    private String ugcContextId_ = "";

    static {
        bel belVar = new bel();
        DEFAULT_INSTANCE = belVar;
        com.google.v.du.registerDefaultInstance(bel.class, belVar);
    }

    private bel() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReportType() {
        this.reportType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUgcContextId() {
        this.ugcContextId_ = getDefaultInstance().getUgcContextId();
    }

    public static bel getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bek newBuilder() {
        return (bek) DEFAULT_INSTANCE.createBuilder();
    }

    public static bel parseDelimitedFrom(InputStream inputStream) {
        return (bel) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bel parseFrom(com.google.v.v vVar) {
        return (bel) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bel> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportType(bob bobVar) {
        this.reportType_ = bobVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportTypeValue(int i2) {
        this.reportType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUgcContextId(String str) {
        Objects.requireNonNull(str);
        this.ugcContextId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUgcContextIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.ugcContextId_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"reportType_", "ugcContextId_"});
        }
        if (iOrdinal == 3) {
            return new bel();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bek(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bel> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bel.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bob getReportType() {
        bob bobVarA = bob.a(this.reportType_);
        return bobVarA == null ? bob.UNRECOGNIZED : bobVarA;
    }

    public int getReportTypeValue() {
        return this.reportType_;
    }

    public String getUgcContextId() {
        return this.ugcContextId_;
    }

    public com.google.v.v getUgcContextIdBytes() {
        return com.google.v.v.s(this.ugcContextId_);
    }

    public static bek newBuilder(bel belVar) {
        return (bek) DEFAULT_INSTANCE.createBuilder(belVar);
    }

    public static bel parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bel) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bel parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bel) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bel parseFrom(com.google.v.z zVar) {
        return (bel) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bel parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bel) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bel parseFrom(InputStream inputStream) {
        return (bel) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bel parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bel) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bel parseFrom(ByteBuffer byteBuffer) {
        return (bel) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bel parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bel) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bel parseFrom(byte[] bArr) {
        return (bel) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bel parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bel) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
