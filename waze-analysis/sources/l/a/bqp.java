package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bqp extends com.google.v.du<bqp, bqo> implements com.google.v.fj {
    public static final int AUTO_SELECTED_FIELD_NUMBER = 2;
    private static final bqp DEFAULT_INSTANCE;
    public static final int LANGUAGE_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<bqp> PARSER;
    private boolean autoSelected_;
    private int bitField0_;
    private String language_ = "";

    static {
        bqp bqpVar = new bqp();
        DEFAULT_INSTANCE = bqpVar;
        com.google.v.du.registerDefaultInstance(bqp.class, bqpVar);
    }

    private bqp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAutoSelected() {
        this.bitField0_ &= -2;
        this.autoSelected_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLanguage() {
        this.language_ = getDefaultInstance().getLanguage();
    }

    public static bqp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bqo newBuilder() {
        return (bqo) DEFAULT_INSTANCE.createBuilder();
    }

    public static bqp parseDelimitedFrom(InputStream inputStream) {
        return (bqp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bqp parseFrom(com.google.v.v vVar) {
        return (bqp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bqp> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAutoSelected(boolean z) {
        this.bitField0_ |= 1;
        this.autoSelected_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguage(String str) {
        Objects.requireNonNull(str);
        this.language_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguageBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.language_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဇ\u0000", new Object[]{"bitField0_", "language_", "autoSelected_"});
        }
        if (iOrdinal == 3) {
            return new bqp();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bqo(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bqp> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bqp.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getAutoSelected() {
        return this.autoSelected_;
    }

    public String getLanguage() {
        return this.language_;
    }

    public com.google.v.v getLanguageBytes() {
        return com.google.v.v.s(this.language_);
    }

    public boolean hasAutoSelected() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bqo newBuilder(bqp bqpVar) {
        return (bqo) DEFAULT_INSTANCE.createBuilder(bqpVar);
    }

    public static bqp parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bqp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bqp parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bqp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bqp parseFrom(com.google.v.z zVar) {
        return (bqp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bqp parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bqp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bqp parseFrom(InputStream inputStream) {
        return (bqp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bqp parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bqp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bqp parseFrom(ByteBuffer byteBuffer) {
        return (bqp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bqp parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bqp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bqp parseFrom(byte[] bArr) {
        return (bqp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bqp parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bqp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
