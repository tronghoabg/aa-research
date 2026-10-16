package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class dv extends com.google.v.du<dv, dt> implements com.google.v.fj {
    public static final int DEBUG_MESSAGE_FIELD_NUMBER = 2;
    private static final dv DEFAULT_INSTANCE;
    public static final int ISSUE_TYPE_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<dv> PARSER;
    private int bitField0_;
    private String debugMessage_ = "";
    private int issueType_;

    static {
        dv dvVar = new dv();
        DEFAULT_INSTANCE = dvVar;
        com.google.v.du.registerDefaultInstance(dv.class, dvVar);
    }

    private dv() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDebugMessage() {
        this.bitField0_ &= -3;
        this.debugMessage_ = getDefaultInstance().getDebugMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIssueType() {
        this.bitField0_ &= -2;
        this.issueType_ = 0;
    }

    public static dv getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static dt newBuilder() {
        return (dt) DEFAULT_INSTANCE.createBuilder();
    }

    public static dv parseDelimitedFrom(InputStream inputStream) {
        return (dv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dv parseFrom(com.google.v.v vVar) {
        return (dv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<dv> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDebugMessage(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.debugMessage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDebugMessageBytes(com.google.v.v vVar) {
        this.debugMessage_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIssueType(du duVar) {
        this.issueType_ = duVar.getNumber();
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "issueType_", e.r, "debugMessage_"});
        }
        if (iOrdinal == 3) {
            return new dv();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new dt(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<dv> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (dv.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getDebugMessage() {
        return this.debugMessage_;
    }

    public com.google.v.v getDebugMessageBytes() {
        return com.google.v.v.s(this.debugMessage_);
    }

    public du getIssueType() {
        du duVarA = du.a(this.issueType_);
        return duVarA == null ? du.INTERNAL_ISSUE_UNSPECIFIED : duVarA;
    }

    public boolean hasDebugMessage() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasIssueType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static dt newBuilder(dv dvVar) {
        return (dt) DEFAULT_INSTANCE.createBuilder(dvVar);
    }

    public static dv parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dv parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (dv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static dv parseFrom(com.google.v.z zVar) {
        return (dv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static dv parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (dv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static dv parseFrom(InputStream inputStream) {
        return (dv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dv parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dv parseFrom(ByteBuffer byteBuffer) {
        return (dv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static dv parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (dv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static dv parseFrom(byte[] bArr) {
        return (dv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static dv parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (dv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
