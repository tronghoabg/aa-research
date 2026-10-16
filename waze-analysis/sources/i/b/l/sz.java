package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class sz extends com.google.v.du<sz, sy> implements com.google.v.fj {
    private static final sz DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<sz> PARSER = null;
    public static final int PLAIN_TEXT_FIELD_NUMBER = 1;
    private int bitField0_;
    private String plainText_ = "";

    static {
        sz szVar = new sz();
        DEFAULT_INSTANCE = szVar;
        com.google.v.du.registerDefaultInstance(sz.class, szVar);
    }

    private sz() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlainText() {
        this.bitField0_ &= -2;
        this.plainText_ = getDefaultInstance().getPlainText();
    }

    public static sz getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static sy newBuilder() {
        return (sy) DEFAULT_INSTANCE.createBuilder();
    }

    public static sz parseDelimitedFrom(InputStream inputStream) {
        return (sz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static sz parseFrom(com.google.v.v vVar) {
        return (sz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<sz> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlainText(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.plainText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlainTextBytes(com.google.v.v vVar) {
        this.plainText_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "plainText_"});
        }
        if (iOrdinal == 3) {
            return new sz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new sy(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<sz> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (sz.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getPlainText() {
        return this.plainText_;
    }

    public com.google.v.v getPlainTextBytes() {
        return com.google.v.v.s(this.plainText_);
    }

    public boolean hasPlainText() {
        return (this.bitField0_ & 1) != 0;
    }

    public static sy newBuilder(sz szVar) {
        return (sy) DEFAULT_INSTANCE.createBuilder(szVar);
    }

    public static sz parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (sz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static sz parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (sz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static sz parseFrom(com.google.v.z zVar) {
        return (sz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static sz parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (sz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static sz parseFrom(InputStream inputStream) {
        return (sz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static sz parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (sz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static sz parseFrom(ByteBuffer byteBuffer) {
        return (sz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static sz parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (sz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static sz parseFrom(byte[] bArr) {
        return (sz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static sz parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (sz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
