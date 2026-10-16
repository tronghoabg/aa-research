package i.b.l;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class pl extends com.google.v.du<pl, pk> implements com.google.v.fj {
    private static final pl DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<pl> PARSER = null;
    public static final int USES2_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean useS2_;

    static {
        pl plVar = new pl();
        DEFAULT_INSTANCE = plVar;
        com.google.v.du.registerDefaultInstance(pl.class, plVar);
    }

    private pl() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUseS2() {
        this.bitField0_ &= -2;
        this.useS2_ = false;
    }

    public static pl getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static pk newBuilder() {
        return (pk) DEFAULT_INSTANCE.createBuilder();
    }

    public static pl parseDelimitedFrom(InputStream inputStream) {
        return (pl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static pl parseFrom(com.google.v.v vVar) {
        return (pl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<pl> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUseS2(boolean z) {
        this.bitField0_ |= 1;
        this.useS2_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"bitField0_", "useS2_"});
        }
        if (iOrdinal == 3) {
            return new pl();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new pk(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<pl> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (pl.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getUseS2() {
        return this.useS2_;
    }

    public boolean hasUseS2() {
        return (this.bitField0_ & 1) != 0;
    }

    public static pk newBuilder(pl plVar) {
        return (pk) DEFAULT_INSTANCE.createBuilder(plVar);
    }

    public static pl parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (pl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static pl parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (pl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static pl parseFrom(com.google.v.z zVar) {
        return (pl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static pl parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (pl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static pl parseFrom(InputStream inputStream) {
        return (pl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static pl parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (pl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static pl parseFrom(ByteBuffer byteBuffer) {
        return (pl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static pl parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (pl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static pl parseFrom(byte[] bArr) {
        return (pl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static pl parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (pl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
