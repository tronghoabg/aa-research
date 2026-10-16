package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class uj extends com.google.v.du<uj, uh> implements com.google.v.fj {
    private static final uj DEFAULT_INSTANCE;
    public static final int IMAGE_NAME_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<uj> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private String imageName_ = "";
    private int type_;

    static {
        uj ujVar = new uj();
        DEFAULT_INSTANCE = ujVar;
        com.google.v.du.registerDefaultInstance(uj.class, ujVar);
    }

    private uj() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImageName() {
        this.imageName_ = getDefaultInstance().getImageName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static uj getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static uh newBuilder() {
        return (uh) DEFAULT_INSTANCE.createBuilder();
    }

    public static uj parseDelimitedFrom(InputStream inputStream) {
        return (uj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static uj parseFrom(com.google.v.v vVar) {
        return (uj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<uj> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageName(String str) {
        Objects.requireNonNull(str);
        this.imageName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageNameBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.imageName_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(ui uiVar) {
        this.type_ = uiVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i2) {
        this.type_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"type_", "imageName_"});
        }
        if (iOrdinal == 3) {
            return new uj();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new uh(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<uj> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (uj.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getImageName() {
        return this.imageName_;
    }

    public com.google.v.v getImageNameBytes() {
        return com.google.v.v.s(this.imageName_);
    }

    public ui getType() {
        int i2 = this.type_;
        ui uiVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? null : ui.APP_LAUNCH_DIALOG : ui.ENCOURAGEMENT_POPUP : ui.ETA_POPUP : ui.ETA_CARD : ui.TYPE_UNSPECIFIED;
        return uiVar == null ? ui.UNRECOGNIZED : uiVar;
    }

    public int getTypeValue() {
        return this.type_;
    }

    public static uh newBuilder(uj ujVar) {
        return (uh) DEFAULT_INSTANCE.createBuilder(ujVar);
    }

    public static uj parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (uj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static uj parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (uj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static uj parseFrom(com.google.v.z zVar) {
        return (uj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static uj parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (uj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static uj parseFrom(InputStream inputStream) {
        return (uj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static uj parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (uj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static uj parseFrom(ByteBuffer byteBuffer) {
        return (uj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uj parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (uj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static uj parseFrom(byte[] bArr) {
        return (uj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static uj parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (uj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
