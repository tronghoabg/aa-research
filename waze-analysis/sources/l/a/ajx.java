package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ajx extends com.google.v.du<ajx, ajw> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 1;
    private static final ajx DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ajx> PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 3;
    private String action_ = "";
    private String text_ = "";
    private String title_ = "";

    static {
        ajx ajxVar = new ajx();
        DEFAULT_INSTANCE = ajxVar;
        com.google.v.du.registerDefaultInstance(ajx.class, ajxVar);
    }

    private ajx() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = getDefaultInstance().getAction();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearText() {
        this.text_ = getDefaultInstance().getText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    public static ajx getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ajw newBuilder() {
        return (ajw) DEFAULT_INSTANCE.createBuilder();
    }

    public static ajx parseDelimitedFrom(InputStream inputStream) {
        return (ajx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ajx parseFrom(com.google.v.v vVar) {
        return (ajx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ajx> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(String str) {
        Objects.requireNonNull(str);
        this.action_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.action_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"action_", "text_", "title_"});
        }
        if (iOrdinal == 3) {
            return new ajx();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ajw(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ajx> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ajx.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getAction() {
        return this.action_;
    }

    public com.google.v.v getActionBytes() {
        return com.google.v.v.s(this.action_);
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

    public static ajw newBuilder(ajx ajxVar) {
        return (ajw) DEFAULT_INSTANCE.createBuilder(ajxVar);
    }

    public static ajx parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ajx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ajx parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ajx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ajx parseFrom(com.google.v.z zVar) {
        return (ajx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ajx parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ajx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ajx parseFrom(InputStream inputStream) {
        return (ajx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ajx parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ajx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ajx parseFrom(ByteBuffer byteBuffer) {
        return (ajx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ajx parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ajx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ajx parseFrom(byte[] bArr) {
        return (ajx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ajx parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ajx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
