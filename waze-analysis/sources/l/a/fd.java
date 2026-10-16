package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class fd extends com.google.v.du<fd, fc> implements com.google.v.fj {
    private static final fd DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<fd> PARSER = null;
    public static final int URL_FIELD_NUMBER = 1;
    private String url_ = "";

    static {
        fd fdVar = new fd();
        DEFAULT_INSTANCE = fdVar;
        com.google.v.du.registerDefaultInstance(fd.class, fdVar);
    }

    private fd() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrl() {
        this.url_ = getDefaultInstance().getUrl();
    }

    public static fd getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static fc newBuilder() {
        return (fc) DEFAULT_INSTANCE.createBuilder();
    }

    public static fd parseDelimitedFrom(InputStream inputStream) {
        return (fd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fd parseFrom(com.google.v.v vVar) {
        return (fd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<fd> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrl(String str) {
        Objects.requireNonNull(str);
        this.url_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrlBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.url_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"url_"});
        }
        if (iOrdinal == 3) {
            return new fd();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new fc(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<fd> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (fd.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getUrl() {
        return this.url_;
    }

    public com.google.v.v getUrlBytes() {
        return com.google.v.v.s(this.url_);
    }

    public static fc newBuilder(fd fdVar) {
        return (fc) DEFAULT_INSTANCE.createBuilder(fdVar);
    }

    public static fd parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fd parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (fd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static fd parseFrom(com.google.v.z zVar) {
        return (fd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static fd parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (fd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static fd parseFrom(InputStream inputStream) {
        return (fd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fd parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fd parseFrom(ByteBuffer byteBuffer) {
        return (fd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static fd parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (fd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static fd parseFrom(byte[] bArr) {
        return (fd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static fd parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (fd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
