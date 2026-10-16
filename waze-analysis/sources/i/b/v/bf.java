package i.b.v;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class bf extends com.google.v.du<bf, be> implements com.google.v.fj {
    public static final int ACTIVE_FIELD_NUMBER = 901;
    private static final bf DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bf> PARSER;
    private boolean active_;
    private int bitField0_;

    static {
        bf bfVar = new bf();
        DEFAULT_INSTANCE = bfVar;
        com.google.v.du.registerDefaultInstance(bf.class, bfVar);
    }

    private bf() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActive() {
        this.bitField0_ &= -2;
        this.active_ = false;
    }

    public static bf getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static be newBuilder() {
        return (be) DEFAULT_INSTANCE.createBuilder();
    }

    public static bf parseDelimitedFrom(InputStream inputStream) {
        return (bf) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bf parseFrom(com.google.v.v vVar) {
        return (bf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bf> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActive(boolean z) {
        this.bitField0_ |= 1;
        this.active_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001΅΅\u0001\u0000\u0000\u0000΅ဇ\u0000", new Object[]{"bitField0_", "active_"});
        }
        if (iOrdinal == 3) {
            return new bf();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new be(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bf> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bf.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getActive() {
        return this.active_;
    }

    public boolean hasActive() {
        return (this.bitField0_ & 1) != 0;
    }

    public static be newBuilder(bf bfVar) {
        return (be) DEFAULT_INSTANCE.createBuilder(bfVar);
    }

    public static bf parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bf) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bf parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bf parseFrom(com.google.v.z zVar) {
        return (bf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bf parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bf parseFrom(InputStream inputStream) {
        return (bf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bf parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bf parseFrom(ByteBuffer byteBuffer) {
        return (bf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bf parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bf parseFrom(byte[] bArr) {
        return (bf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bf parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
