package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ada extends com.google.v.du<ada, acz> implements com.google.v.fj {
    private static final ada DEFAULT_INSTANCE;
    public static final int MESSAGE_ID_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<ada> PARSER;
    private String messageId_ = "";

    static {
        ada adaVar = new ada();
        DEFAULT_INSTANCE = adaVar;
        com.google.v.du.registerDefaultInstance(ada.class, adaVar);
    }

    private ada() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessageId() {
        this.messageId_ = getDefaultInstance().getMessageId();
    }

    public static ada getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static acz newBuilder() {
        return (acz) DEFAULT_INSTANCE.createBuilder();
    }

    public static ada parseDelimitedFrom(InputStream inputStream) {
        return (ada) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ada parseFrom(com.google.v.v vVar) {
        return (ada) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ada> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageId(String str) {
        Objects.requireNonNull(str);
        this.messageId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.messageId_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"messageId_"});
        }
        if (iOrdinal == 3) {
            return new ada();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new acz(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ada> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ada.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getMessageId() {
        return this.messageId_;
    }

    public com.google.v.v getMessageIdBytes() {
        return com.google.v.v.s(this.messageId_);
    }

    public static acz newBuilder(ada adaVar) {
        return (acz) DEFAULT_INSTANCE.createBuilder(adaVar);
    }

    public static ada parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ada) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ada parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ada) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ada parseFrom(com.google.v.z zVar) {
        return (ada) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ada parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ada) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ada parseFrom(InputStream inputStream) {
        return (ada) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ada parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ada) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ada parseFrom(ByteBuffer byteBuffer) {
        return (ada) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ada parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ada) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ada parseFrom(byte[] bArr) {
        return (ada) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ada parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ada) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
