package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class td extends com.google.v.du<td, tc> implements com.google.v.fj {
    private static final td DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<td> PARSER = null;
    public static final int SUCCESS_MESSAGE_FIELD_NUMBER = 1;
    private int bitField0_;
    private String successMessage_ = "";

    static {
        td tdVar = new td();
        DEFAULT_INSTANCE = tdVar;
        com.google.v.du.registerDefaultInstance(td.class, tdVar);
    }

    private td() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSuccessMessage() {
        this.bitField0_ &= -2;
        this.successMessage_ = getDefaultInstance().getSuccessMessage();
    }

    public static td getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static tc newBuilder() {
        return (tc) DEFAULT_INSTANCE.createBuilder();
    }

    public static td parseDelimitedFrom(InputStream inputStream) {
        return (td) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static td parseFrom(com.google.v.v vVar) {
        return (td) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<td> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuccessMessage(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.successMessage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuccessMessageBytes(com.google.v.v vVar) {
        this.successMessage_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "successMessage_"});
        }
        if (iOrdinal == 3) {
            return new td();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new tc(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<td> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (td.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getSuccessMessage() {
        return this.successMessage_;
    }

    public com.google.v.v getSuccessMessageBytes() {
        return com.google.v.v.s(this.successMessage_);
    }

    public boolean hasSuccessMessage() {
        return (this.bitField0_ & 1) != 0;
    }

    public static tc newBuilder(td tdVar) {
        return (tc) DEFAULT_INSTANCE.createBuilder(tdVar);
    }

    public static td parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (td) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static td parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (td) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static td parseFrom(com.google.v.z zVar) {
        return (td) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static td parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (td) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static td parseFrom(InputStream inputStream) {
        return (td) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static td parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (td) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static td parseFrom(ByteBuffer byteBuffer) {
        return (td) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static td parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (td) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static td parseFrom(byte[] bArr) {
        return (td) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static td parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (td) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
