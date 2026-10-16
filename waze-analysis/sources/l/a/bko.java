package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bko extends com.google.v.du<bko, bkm> implements com.google.v.fj {
    private static final bko DEFAULT_INSTANCE;
    public static final int ERROR_CODE_FIELD_NUMBER = 3;
    public static final int ERROR_SERVER_DESCRIPTION_FIELD_NUMBER = 4;
    private static volatile com.google.v.fo<bko> PARSER = null;
    public static final int SOURCE_FIELD_NUMBER = 1;
    public static final int TRIGGERED_FROM_FIELD_NUMBER = 2;
    private String errorCode_ = "";
    private String errorServerDescription_ = "";
    private int source_;
    private int triggeredFrom_;

    static {
        bko bkoVar = new bko();
        DEFAULT_INSTANCE = bkoVar;
        com.google.v.du.registerDefaultInstance(bko.class, bkoVar);
    }

    private bko() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearErrorCode() {
        this.errorCode_ = getDefaultInstance().getErrorCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearErrorServerDescription() {
        this.errorServerDescription_ = getDefaultInstance().getErrorServerDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSource() {
        this.source_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTriggeredFrom() {
        this.triggeredFrom_ = 0;
    }

    public static bko getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bkm newBuilder() {
        return (bkm) DEFAULT_INSTANCE.createBuilder();
    }

    public static bko parseDelimitedFrom(InputStream inputStream) {
        return (bko) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bko parseFrom(com.google.v.v vVar) {
        return (bko) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bko> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorCode(String str) {
        Objects.requireNonNull(str);
        this.errorCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorCodeBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.errorCode_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorServerDescription(String str) {
        Objects.requireNonNull(str);
        this.errorServerDescription_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorServerDescriptionBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.errorServerDescription_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSource(bfn bfnVar) {
        this.source_ = bfnVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceValue(int i2) {
        this.source_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTriggeredFrom(bkn bknVar) {
        this.triggeredFrom_ = bknVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTriggeredFromValue(int i2) {
        this.triggeredFrom_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002\f\u0003Ȉ\u0004Ȉ", new Object[]{"source_", "triggeredFrom_", "errorCode_", "errorServerDescription_"});
        }
        if (iOrdinal == 3) {
            return new bko();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bkm(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bko> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bko.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getErrorCode() {
        return this.errorCode_;
    }

    public com.google.v.v getErrorCodeBytes() {
        return com.google.v.v.s(this.errorCode_);
    }

    public String getErrorServerDescription() {
        return this.errorServerDescription_;
    }

    public com.google.v.v getErrorServerDescriptionBytes() {
        return com.google.v.v.s(this.errorServerDescription_);
    }

    public bfn getSource() {
        bfn bfnVarA = bfn.a(this.source_);
        return bfnVarA == null ? bfn.UNRECOGNIZED : bfnVarA;
    }

    public int getSourceValue() {
        return this.source_;
    }

    public bkn getTriggeredFrom() {
        int i2 = this.triggeredFrom_;
        bkn bknVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : bkn.ROUTE_RECALCULATION : bkn.TRIP_OVERVIEW_LAUNCH : bkn.START_NAVIGATION : bkn.TRIGGERED_FROM_UNSPECIFIED;
        return bknVar == null ? bkn.UNRECOGNIZED : bknVar;
    }

    public int getTriggeredFromValue() {
        return this.triggeredFrom_;
    }

    public static bkm newBuilder(bko bkoVar) {
        return (bkm) DEFAULT_INSTANCE.createBuilder(bkoVar);
    }

    public static bko parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bko) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bko parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bko) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bko parseFrom(com.google.v.z zVar) {
        return (bko) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bko parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bko) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bko parseFrom(InputStream inputStream) {
        return (bko) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bko parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bko) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bko parseFrom(ByteBuffer byteBuffer) {
        return (bko) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bko parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bko) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bko parseFrom(byte[] bArr) {
        return (bko) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bko parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bko) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
