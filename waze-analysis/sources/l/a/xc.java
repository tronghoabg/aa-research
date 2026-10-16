package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class xc extends com.google.v.du<xc, xb> implements com.google.v.fj {
    private static final xc DEFAULT_INSTANCE;
    public static final int MESSAGE_TYPE_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<xc> PARSER;
    private int messageType_;

    static {
        xc xcVar = new xc();
        DEFAULT_INSTANCE = xcVar;
        com.google.v.du.registerDefaultInstance(xc.class, xcVar);
    }

    private xc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessageType() {
        this.messageType_ = 0;
    }

    public static xc getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static xb newBuilder() {
        return (xb) DEFAULT_INSTANCE.createBuilder();
    }

    public static xc parseDelimitedFrom(InputStream inputStream) {
        return (xc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static xc parseFrom(com.google.v.v vVar) {
        return (xc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<xc> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageType(xd xdVar) {
        this.messageType_ = xdVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageTypeValue(int i2) {
        this.messageType_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"messageType_"});
        }
        if (iOrdinal == 3) {
            return new xc();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new xb(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<xc> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (xc.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public xd getMessageType() {
        xd xdVarA = xd.a(this.messageType_);
        return xdVarA == null ? xd.UNRECOGNIZED : xdVarA;
    }

    public int getMessageTypeValue() {
        return this.messageType_;
    }

    public static xb newBuilder(xc xcVar) {
        return (xb) DEFAULT_INSTANCE.createBuilder(xcVar);
    }

    public static xc parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (xc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static xc parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (xc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static xc parseFrom(com.google.v.z zVar) {
        return (xc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static xc parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (xc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static xc parseFrom(InputStream inputStream) {
        return (xc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static xc parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (xc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static xc parseFrom(ByteBuffer byteBuffer) {
        return (xc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static xc parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (xc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static xc parseFrom(byte[] bArr) {
        return (xc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static xc parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (xc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
