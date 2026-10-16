package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ajz extends com.google.v.du<ajz, ajy> implements com.google.v.fj {
    private static final ajz DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ajz> PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 1;
    public static final int TITLE_FIELD_NUMBER = 2;
    private String text_ = "";
    private String title_ = "";

    static {
        ajz ajzVar = new ajz();
        DEFAULT_INSTANCE = ajzVar;
        com.google.v.du.registerDefaultInstance(ajz.class, ajzVar);
    }

    private ajz() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearText() {
        this.text_ = getDefaultInstance().getText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    public static ajz getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ajy newBuilder() {
        return (ajy) DEFAULT_INSTANCE.createBuilder();
    }

    public static ajz parseDelimitedFrom(InputStream inputStream) {
        return (ajz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ajz parseFrom(com.google.v.v vVar) {
        return (ajz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ajz> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setText(String str) {
        Objects.requireNonNull(str);
        this.text_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.text_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitle(String str) {
        Objects.requireNonNull(str);
        this.title_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.title_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"text_", "title_"});
        }
        if (iOrdinal == 3) {
            return new ajz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ajy(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ajz> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ajz.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getText() {
        return this.text_;
    }

    public com.google.v.v getTextBytes() {
        return com.google.v.v.s(this.text_);
    }

    public String getTitle() {
        return this.title_;
    }

    public com.google.v.v getTitleBytes() {
        return com.google.v.v.s(this.title_);
    }

    public static ajy newBuilder(ajz ajzVar) {
        return (ajy) DEFAULT_INSTANCE.createBuilder(ajzVar);
    }

    public static ajz parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ajz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ajz parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ajz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ajz parseFrom(com.google.v.z zVar) {
        return (ajz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ajz parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ajz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ajz parseFrom(InputStream inputStream) {
        return (ajz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ajz parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ajz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ajz parseFrom(ByteBuffer byteBuffer) {
        return (ajz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ajz parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ajz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ajz parseFrom(byte[] bArr) {
        return (ajz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ajz parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ajz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
