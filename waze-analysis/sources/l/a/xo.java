package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class xo extends com.google.v.du<xo, xn> implements com.google.v.fj {
    private static final xo DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<xo> PARSER = null;
    public static final int SOURCE_FIELD_NUMBER = 1;
    private int source_;

    static {
        xo xoVar = new xo();
        DEFAULT_INSTANCE = xoVar;
        com.google.v.du.registerDefaultInstance(xo.class, xoVar);
    }

    private xo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSource() {
        this.source_ = 0;
    }

    public static xo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static xn newBuilder() {
        return (xn) DEFAULT_INSTANCE.createBuilder();
    }

    public static xo parseDelimitedFrom(InputStream inputStream) {
        return (xo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static xo parseFrom(com.google.v.v vVar) {
        return (xo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<xo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSource(xp xpVar) {
        this.source_ = xpVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceValue(int i2) {
        this.source_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"source_"});
        }
        if (iOrdinal == 3) {
            return new xo();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new xn(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<xo> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (xo.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public xp getSource() {
        xp xpVarA = xp.a(this.source_);
        return xpVarA == null ? xp.UNRECOGNIZED : xpVarA;
    }

    public int getSourceValue() {
        return this.source_;
    }

    public static xn newBuilder(xo xoVar) {
        return (xn) DEFAULT_INSTANCE.createBuilder(xoVar);
    }

    public static xo parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (xo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static xo parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (xo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static xo parseFrom(com.google.v.z zVar) {
        return (xo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static xo parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (xo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static xo parseFrom(InputStream inputStream) {
        return (xo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static xo parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (xo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static xo parseFrom(ByteBuffer byteBuffer) {
        return (xo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static xo parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (xo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static xo parseFrom(byte[] bArr) {
        return (xo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static xo parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (xo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
