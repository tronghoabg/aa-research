package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class kw extends com.google.v.du<kw, kv> implements com.google.v.fj {
    public static final int CODE_FIELD_NUMBER = 1;
    private static final kw DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<kw> PARSER;
    private int bitField0_;
    private String code_ = "";

    static {
        kw kwVar = new kw();
        DEFAULT_INSTANCE = kwVar;
        com.google.v.du.registerDefaultInstance(kw.class, kwVar);
    }

    private kw() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCode() {
        this.bitField0_ &= -2;
        this.code_ = getDefaultInstance().getCode();
    }

    public static kw getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static kv newBuilder() {
        return (kv) DEFAULT_INSTANCE.createBuilder();
    }

    public static kw parseDelimitedFrom(InputStream inputStream) {
        return (kw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static kw parseFrom(com.google.v.v vVar) {
        return (kw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<kw> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCode(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.code_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCodeBytes(com.google.v.v vVar) {
        this.code_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "code_"});
        }
        if (iOrdinal == 3) {
            return new kw();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new kv(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<kw> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (kw.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getCode() {
        return this.code_;
    }

    public com.google.v.v getCodeBytes() {
        return com.google.v.v.s(this.code_);
    }

    public boolean hasCode() {
        return (this.bitField0_ & 1) != 0;
    }

    public static kv newBuilder(kw kwVar) {
        return (kv) DEFAULT_INSTANCE.createBuilder(kwVar);
    }

    public static kw parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (kw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static kw parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (kw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static kw parseFrom(com.google.v.z zVar) {
        return (kw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static kw parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (kw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static kw parseFrom(InputStream inputStream) {
        return (kw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static kw parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (kw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static kw parseFrom(ByteBuffer byteBuffer) {
        return (kw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static kw parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (kw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static kw parseFrom(byte[] bArr) {
        return (kw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static kw parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (kw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
