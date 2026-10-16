package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ase extends com.google.v.du<ase, asd> implements com.google.v.fj {
    private static final ase DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int IMAGE_URL_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<ase> PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 2;
    private String id_ = "";
    private String text_ = "";
    private String imageUrl_ = "";

    static {
        ase aseVar = new ase();
        DEFAULT_INSTANCE = aseVar;
        com.google.v.du.registerDefaultInstance(ase.class, aseVar);
    }

    private ase() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImageUrl() {
        this.imageUrl_ = getDefaultInstance().getImageUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearText() {
        this.text_ = getDefaultInstance().getText();
    }

    public static ase getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static asd newBuilder() {
        return (asd) DEFAULT_INSTANCE.createBuilder();
    }

    public static ase parseDelimitedFrom(InputStream inputStream) {
        return (ase) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ase parseFrom(com.google.v.v vVar) {
        return (ase) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ase> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        Objects.requireNonNull(str);
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.id_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageUrl(String str) {
        Objects.requireNonNull(str);
        this.imageUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageUrlBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.imageUrl_ = vVar.u();
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

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"id_", "text_", "imageUrl_"});
        }
        if (iOrdinal == 3) {
            return new ase();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new asd(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ase> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ase.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getId() {
        return this.id_;
    }

    public com.google.v.v getIdBytes() {
        return com.google.v.v.s(this.id_);
    }

    public String getImageUrl() {
        return this.imageUrl_;
    }

    public com.google.v.v getImageUrlBytes() {
        return com.google.v.v.s(this.imageUrl_);
    }

    public String getText() {
        return this.text_;
    }

    public com.google.v.v getTextBytes() {
        return com.google.v.v.s(this.text_);
    }

    public static asd newBuilder(ase aseVar) {
        return (asd) DEFAULT_INSTANCE.createBuilder(aseVar);
    }

    public static ase parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ase) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ase parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ase) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ase parseFrom(com.google.v.z zVar) {
        return (ase) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ase parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ase) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ase parseFrom(InputStream inputStream) {
        return (ase) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ase parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ase) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ase parseFrom(ByteBuffer byteBuffer) {
        return (ase) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ase parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ase) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ase parseFrom(byte[] bArr) {
        return (ase) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ase parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ase) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
