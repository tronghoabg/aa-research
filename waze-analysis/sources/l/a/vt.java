package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class vt extends com.google.v.du<vt, vr> implements com.google.v.fj {
    private static final vt DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<vt> PARSER = null;
    public static final int TEST_FIELD_NUMBER = 1;
    private int statCase_ = 0;
    private Object stat_;

    static {
        vt vtVar = new vt();
        DEFAULT_INSTANCE = vtVar;
        com.google.v.du.registerDefaultInstance(vt.class, vtVar);
    }

    private vt() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStat() {
        this.statCase_ = 0;
        this.stat_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTest() {
        if (this.statCase_ == 1) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    public static vt getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static vr newBuilder() {
        return (vr) DEFAULT_INSTANCE.createBuilder();
    }

    public static vt parseDelimitedFrom(InputStream inputStream) {
        return (vt) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static vt parseFrom(com.google.v.v vVar) {
        return (vt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<vt> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTest(String str) {
        Objects.requireNonNull(str);
        this.statCase_ = 1;
        this.stat_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTestBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.stat_ = vVar.u();
        this.statCase_ = 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȼ\u0000", new Object[]{"stat_", "statCase_"});
        }
        if (iOrdinal == 3) {
            return new vt();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new vr(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<vt> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (vt.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public vs getStatCase() {
        int i2 = this.statCase_;
        if (i2 == 0) {
            return vs.f55570b;
        }
        if (i2 != 1) {
            return null;
        }
        return vs.f55569a;
    }

    public String getTest() {
        return this.statCase_ == 1 ? (String) this.stat_ : "";
    }

    public com.google.v.v getTestBytes() {
        return com.google.v.v.s(this.statCase_ == 1 ? (String) this.stat_ : "");
    }

    public boolean hasTest() {
        return this.statCase_ == 1;
    }

    public static vr newBuilder(vt vtVar) {
        return (vr) DEFAULT_INSTANCE.createBuilder(vtVar);
    }

    public static vt parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (vt) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static vt parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (vt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static vt parseFrom(com.google.v.z zVar) {
        return (vt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static vt parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (vt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static vt parseFrom(InputStream inputStream) {
        return (vt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static vt parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (vt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static vt parseFrom(ByteBuffer byteBuffer) {
        return (vt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static vt parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (vt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static vt parseFrom(byte[] bArr) {
        return (vt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static vt parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (vt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
