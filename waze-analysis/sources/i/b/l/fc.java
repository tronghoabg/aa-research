package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class fc extends com.google.v.du<fc, fb> implements com.google.v.fj {
    private static final fc DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<fc> PARSER = null;
    public static final int REQUEST_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private String requestId_ = "";

    static {
        fc fcVar = new fc();
        DEFAULT_INSTANCE = fcVar;
        com.google.v.du.registerDefaultInstance(fc.class, fcVar);
    }

    private fc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestId() {
        this.bitField0_ &= -2;
        this.requestId_ = getDefaultInstance().getRequestId();
    }

    public static fc getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static fb newBuilder() {
        return (fb) DEFAULT_INSTANCE.createBuilder();
    }

    public static fc parseDelimitedFrom(InputStream inputStream) {
        return (fc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fc parseFrom(com.google.v.v vVar) {
        return (fc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<fc> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.requestId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestIdBytes(com.google.v.v vVar) {
        this.requestId_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "requestId_"});
        }
        if (iOrdinal == 3) {
            return new fc();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new fb(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<fc> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (fc.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getRequestId() {
        return this.requestId_;
    }

    public com.google.v.v getRequestIdBytes() {
        return com.google.v.v.s(this.requestId_);
    }

    public boolean hasRequestId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static fb newBuilder(fc fcVar) {
        return (fb) DEFAULT_INSTANCE.createBuilder(fcVar);
    }

    public static fc parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fc parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (fc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static fc parseFrom(com.google.v.z zVar) {
        return (fc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static fc parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (fc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static fc parseFrom(InputStream inputStream) {
        return (fc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fc parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fc parseFrom(ByteBuffer byteBuffer) {
        return (fc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static fc parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (fc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static fc parseFrom(byte[] bArr) {
        return (fc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static fc parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (fc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
