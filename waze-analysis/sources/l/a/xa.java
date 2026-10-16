package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class xa extends com.google.v.du<xa, wz> implements com.google.v.fj {
    private static final xa DEFAULT_INSTANCE;
    public static final int MESSAGE_TYPE_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<xa> PARSER;
    private int messageType_;

    static {
        xa xaVar = new xa();
        DEFAULT_INSTANCE = xaVar;
        com.google.v.du.registerDefaultInstance(xa.class, xaVar);
    }

    private xa() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessageType() {
        this.messageType_ = 0;
    }

    public static xa getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static wz newBuilder() {
        return (wz) DEFAULT_INSTANCE.createBuilder();
    }

    public static xa parseDelimitedFrom(InputStream inputStream) {
        return (xa) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static xa parseFrom(com.google.v.v vVar) {
        return (xa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<xa> parser() {
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
            return new xa();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new wz(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<xa> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (xa.class) {
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

    public static wz newBuilder(xa xaVar) {
        return (wz) DEFAULT_INSTANCE.createBuilder(xaVar);
    }

    public static xa parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (xa) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static xa parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (xa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static xa parseFrom(com.google.v.z zVar) {
        return (xa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static xa parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (xa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static xa parseFrom(InputStream inputStream) {
        return (xa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static xa parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (xa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static xa parseFrom(ByteBuffer byteBuffer) {
        return (xa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static xa parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (xa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static xa parseFrom(byte[] bArr) {
        return (xa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static xa parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (xa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
