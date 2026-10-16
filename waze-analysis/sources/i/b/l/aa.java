package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class aa extends com.google.v.du<aa, z> implements com.google.v.fj {
    private static final aa DEFAULT_INSTANCE;
    public static final int LAST_ALERT_TEXT_FIELD_NUMBER = 10264;
    public static final int LAST_ALERT_TYPE_FIELD_NUMBER = 10263;
    private static volatile com.google.v.fo<aa> PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 10261;
    public static final int TIME_AGO_SEC_FIELD_NUMBER = 10262;
    private int bitField0_;
    private int lastAlertType_;
    private int timeAgoSec_;
    private String text_ = "";
    private String lastAlertText_ = "";

    static {
        aa aaVar = new aa();
        DEFAULT_INSTANCE = aaVar;
        com.google.v.du.registerDefaultInstance(aa.class, aaVar);
    }

    private aa() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastAlertText() {
        this.bitField0_ &= -9;
        this.lastAlertText_ = getDefaultInstance().getLastAlertText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastAlertType() {
        this.bitField0_ &= -5;
        this.lastAlertType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearText() {
        this.bitField0_ &= -2;
        this.text_ = getDefaultInstance().getText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeAgoSec() {
        this.bitField0_ &= -3;
        this.timeAgoSec_ = 0;
    }

    public static aa getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static z newBuilder() {
        return (z) DEFAULT_INSTANCE.createBuilder();
    }

    public static aa parseDelimitedFrom(InputStream inputStream) {
        return (aa) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aa parseFrom(com.google.v.v vVar) {
        return (aa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aa> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastAlertText(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.lastAlertText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastAlertTextBytes(com.google.v.v vVar) {
        this.lastAlertText_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastAlertType(i.b.l lVar) {
        this.lastAlertType_ = lVar.getNumber();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setText(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.text_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextBytes(com.google.v.v vVar) {
        this.text_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeAgoSec(int i2) {
        this.bitField0_ |= 2;
        this.timeAgoSec_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001⠕⠘\u0004\u0000\u0000\u0000⠕ဈ\u0000⠖င\u0001⠗᠌\u0002⠘ဈ\u0003", new Object[]{"bitField0_", "text_", "timeAgoSec_", "lastAlertType_", i.b.l.a(), "lastAlertText_"});
        }
        if (iOrdinal == 3) {
            return new aa();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new z(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aa> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aa.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getLastAlertText() {
        return this.lastAlertText_;
    }

    public com.google.v.v getLastAlertTextBytes() {
        return com.google.v.v.s(this.lastAlertText_);
    }

    public i.b.l getLastAlertType() {
        i.b.l lVarB = i.b.l.b(this.lastAlertType_);
        return lVarB == null ? i.b.l.CHIT_CHAT : lVarB;
    }

    public String getText() {
        return this.text_;
    }

    public com.google.v.v getTextBytes() {
        return com.google.v.v.s(this.text_);
    }

    public int getTimeAgoSec() {
        return this.timeAgoSec_;
    }

    public boolean hasLastAlertText() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasLastAlertType() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasText() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasTimeAgoSec() {
        return (this.bitField0_ & 2) != 0;
    }

    public static z newBuilder(aa aaVar) {
        return (z) DEFAULT_INSTANCE.createBuilder(aaVar);
    }

    public static aa parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aa) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aa parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aa parseFrom(com.google.v.z zVar) {
        return (aa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aa parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aa parseFrom(InputStream inputStream) {
        return (aa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aa parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aa parseFrom(ByteBuffer byteBuffer) {
        return (aa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aa parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aa parseFrom(byte[] bArr) {
        return (aa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aa parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
