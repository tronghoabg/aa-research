package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aiv extends com.google.v.du<aiv, aiu> implements com.google.v.fj {
    private static final aiv DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<aiv> PARSER = null;
    public static final int RESULT_FIELD_NUMBER = 2;
    public static final int SUCCESS_FIELD_NUMBER = 1;
    private int bitField0_;
    private String result_ = "";
    private boolean success_;

    static {
        aiv aivVar = new aiv();
        DEFAULT_INSTANCE = aivVar;
        com.google.v.du.registerDefaultInstance(aiv.class, aivVar);
    }

    private aiv() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResult() {
        this.result_ = getDefaultInstance().getResult();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSuccess() {
        this.bitField0_ &= -2;
        this.success_ = false;
    }

    public static aiv getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static aiu newBuilder() {
        return (aiu) DEFAULT_INSTANCE.createBuilder();
    }

    public static aiv parseDelimitedFrom(InputStream inputStream) {
        return (aiv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aiv parseFrom(com.google.v.v vVar) {
        return (aiv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aiv> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResult(String str) {
        Objects.requireNonNull(str);
        this.result_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResultBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.result_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuccess(boolean z) {
        this.bitField0_ |= 1;
        this.success_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002Ȉ", new Object[]{"bitField0_", "success_", "result_"});
        }
        if (iOrdinal == 3) {
            return new aiv();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aiu(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aiv> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aiv.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getResult() {
        return this.result_;
    }

    public com.google.v.v getResultBytes() {
        return com.google.v.v.s(this.result_);
    }

    public boolean getSuccess() {
        return this.success_;
    }

    public boolean hasSuccess() {
        return (this.bitField0_ & 1) != 0;
    }

    public static aiu newBuilder(aiv aivVar) {
        return (aiu) DEFAULT_INSTANCE.createBuilder(aivVar);
    }

    public static aiv parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aiv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aiv parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aiv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aiv parseFrom(com.google.v.z zVar) {
        return (aiv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aiv parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aiv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aiv parseFrom(InputStream inputStream) {
        return (aiv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aiv parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aiv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aiv parseFrom(ByteBuffer byteBuffer) {
        return (aiv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aiv parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aiv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aiv parseFrom(byte[] bArr) {
        return (aiv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aiv parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aiv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
