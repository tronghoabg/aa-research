package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bik extends com.google.v.du<bik, bij> implements com.google.v.fj {
    private static final bik DEFAULT_INSTANCE;
    public static final int ERROR_MESSAGE_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<bik> PARSER = null;
    public static final int TILE_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private String errorMessage_ = "";
    private long tileId_;

    static {
        bik bikVar = new bik();
        DEFAULT_INSTANCE = bikVar;
        com.google.v.du.registerDefaultInstance(bik.class, bikVar);
    }

    private bik() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearErrorMessage() {
        this.errorMessage_ = getDefaultInstance().getErrorMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTileId() {
        this.bitField0_ &= -2;
        this.tileId_ = 0L;
    }

    public static bik getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bij newBuilder() {
        return (bij) DEFAULT_INSTANCE.createBuilder();
    }

    public static bik parseDelimitedFrom(InputStream inputStream) {
        return (bik) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bik parseFrom(com.google.v.v vVar) {
        return (bik) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bik> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorMessage(String str) {
        Objects.requireNonNull(str);
        this.errorMessage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorMessageBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.errorMessage_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTileId(long j2) {
        this.bitField0_ |= 1;
        this.tileId_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002Ȉ", new Object[]{"bitField0_", "tileId_", "errorMessage_"});
        }
        if (iOrdinal == 3) {
            return new bik();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bij(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bik> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bik.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getErrorMessage() {
        return this.errorMessage_;
    }

    public com.google.v.v getErrorMessageBytes() {
        return com.google.v.v.s(this.errorMessage_);
    }

    public long getTileId() {
        return this.tileId_;
    }

    public boolean hasTileId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bij newBuilder(bik bikVar) {
        return (bij) DEFAULT_INSTANCE.createBuilder(bikVar);
    }

    public static bik parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bik) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bik parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bik) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bik parseFrom(com.google.v.z zVar) {
        return (bik) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bik parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bik) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bik parseFrom(InputStream inputStream) {
        return (bik) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bik parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bik) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bik parseFrom(ByteBuffer byteBuffer) {
        return (bik) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bik parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bik) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bik parseFrom(byte[] bArr) {
        return (bik) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bik parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bik) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
