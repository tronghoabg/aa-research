package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bef extends com.google.v.du<bef, bee> implements com.google.v.fj {
    private static final bef DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bef> PARSER = null;
    public static final int REPORT_TYPE_FIELD_NUMBER = 2;
    public static final int REPORT_TYPE_PHRASE_FIELD_NUMBER = 1;
    private String reportTypePhrase_ = "";
    private int reportType_;

    static {
        bef befVar = new bef();
        DEFAULT_INSTANCE = befVar;
        com.google.v.du.registerDefaultInstance(bef.class, befVar);
    }

    private bef() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReportType() {
        this.reportType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReportTypePhrase() {
        this.reportTypePhrase_ = getDefaultInstance().getReportTypePhrase();
    }

    public static bef getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bee newBuilder() {
        return (bee) DEFAULT_INSTANCE.createBuilder();
    }

    public static bef parseDelimitedFrom(InputStream inputStream) {
        return (bef) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bef parseFrom(com.google.v.v vVar) {
        return (bef) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bef> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportType(bob bobVar) {
        this.reportType_ = bobVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportTypePhrase(String str) {
        Objects.requireNonNull(str);
        this.reportTypePhrase_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportTypePhraseBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.reportTypePhrase_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportTypeValue(int i2) {
        this.reportType_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"reportTypePhrase_", "reportType_"});
        }
        if (iOrdinal == 3) {
            return new bef();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bee(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bef> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bef.class) {
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

    public String getReportTypePhrase() {
        return this.reportTypePhrase_;
    }

    public com.google.v.v getReportTypePhraseBytes() {
        return com.google.v.v.s(this.reportTypePhrase_);
    }

    public int getReportTypeValue() {
        return this.reportType_;
    }

    public static bee newBuilder(bef befVar) {
        return (bee) DEFAULT_INSTANCE.createBuilder(befVar);
    }

    public static bef parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bef) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bef parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bef) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bef parseFrom(com.google.v.z zVar) {
        return (bef) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bef parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bef) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bef parseFrom(InputStream inputStream) {
        return (bef) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bef parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bef) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bef parseFrom(ByteBuffer byteBuffer) {
        return (bef) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bef parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bef) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bef parseFrom(byte[] bArr) {
        return (bef) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bef parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bef) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
