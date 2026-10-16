package i.b.l;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class dd extends com.google.v.du<dd, db> implements com.google.v.fj {
    private static final dd DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<dd> PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int bitField0_;
    private int status_;

    static {
        dd ddVar = new dd();
        DEFAULT_INSTANCE = ddVar;
        com.google.v.du.registerDefaultInstance(dd.class, ddVar);
    }

    private dd() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.bitField0_ &= -2;
        this.status_ = 0;
    }

    public static dd getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static db newBuilder() {
        return (db) DEFAULT_INSTANCE.createBuilder();
    }

    public static dd parseDelimitedFrom(InputStream inputStream) {
        return (dd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dd parseFrom(com.google.v.v vVar) {
        return (dd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<dd> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(dc dcVar) {
        this.status_ = dcVar.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"bitField0_", "status_", e.q});
        }
        if (iOrdinal == 3) {
            return new dd();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new db(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<dd> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (dd.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public dc getStatus() {
        dc dcVarA = dc.a(this.status_);
        return dcVarA == null ? dc.UNKNOWN : dcVarA;
    }

    public boolean hasStatus() {
        return (this.bitField0_ & 1) != 0;
    }

    public static db newBuilder(dd ddVar) {
        return (db) DEFAULT_INSTANCE.createBuilder(ddVar);
    }

    public static dd parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dd parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (dd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static dd parseFrom(com.google.v.z zVar) {
        return (dd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static dd parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (dd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static dd parseFrom(InputStream inputStream) {
        return (dd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dd parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dd parseFrom(ByteBuffer byteBuffer) {
        return (dd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static dd parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (dd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static dd parseFrom(byte[] bArr) {
        return (dd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static dd parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (dd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
