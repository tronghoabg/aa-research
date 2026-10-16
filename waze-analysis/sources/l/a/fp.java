package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class fp extends com.google.v.du<fp, fo> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 2;
    private static final fp DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<fp> PARSER = null;
    public static final int URL_FIELD_NUMBER = 1;
    private int action_;
    private String url_ = "";

    static {
        fp fpVar = new fp();
        DEFAULT_INSTANCE = fpVar;
        com.google.v.du.registerDefaultInstance(fp.class, fpVar);
    }

    private fp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrl() {
        this.url_ = getDefaultInstance().getUrl();
    }

    public static fp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static fo newBuilder() {
        return (fo) DEFAULT_INSTANCE.createBuilder();
    }

    public static fp parseDelimitedFrom(InputStream inputStream) {
        return (fp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fp parseFrom(com.google.v.v vVar) {
        return (fp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<fp> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(fn fnVar) {
        this.action_ = fnVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"url_", "action_"});
        }
        if (iOrdinal == 3) {
            return new fp();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new fo(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<fp> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (fp.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public fn getAction() {
        int i2 = this.action_;
        fn fnVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : fn.CANCEL : fn.UPGRADE : fn.ACTION_UNSPECIFIED;
        return fnVar == null ? fn.UNRECOGNIZED : fnVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public String getUrl() {
        return this.url_;
    }

    public com.google.v.v getUrlBytes() {
        return com.google.v.v.s(this.url_);
    }

    public static fo newBuilder(fp fpVar) {
        return (fo) DEFAULT_INSTANCE.createBuilder(fpVar);
    }

    public static fp parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fp parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (fp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static fp parseFrom(com.google.v.z zVar) {
        return (fp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static fp parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (fp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static fp parseFrom(InputStream inputStream) {
        return (fp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fp parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fp parseFrom(ByteBuffer byteBuffer) {
        return (fp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static fp parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (fp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static fp parseFrom(byte[] bArr) {
        return (fp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static fp parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (fp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
