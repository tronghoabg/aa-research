package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class xm extends com.google.v.du<xm, xl> implements com.google.v.fj {
    private static final xm DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<xm> PARSER = null;
    public static final int SOURCE_FIELD_NUMBER = 1;
    private int source_;

    static {
        xm xmVar = new xm();
        DEFAULT_INSTANCE = xmVar;
        com.google.v.du.registerDefaultInstance(xm.class, xmVar);
    }

    private xm() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSource() {
        this.source_ = 0;
    }

    public static xm getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static xl newBuilder() {
        return (xl) DEFAULT_INSTANCE.createBuilder();
    }

    public static xm parseDelimitedFrom(InputStream inputStream) {
        return (xm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static xm parseFrom(com.google.v.v vVar) {
        return (xm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<xm> parser() {
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
            return new xm();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new xl(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<xm> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (xm.class) {
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

    public static xl newBuilder(xm xmVar) {
        return (xl) DEFAULT_INSTANCE.createBuilder(xmVar);
    }

    public static xm parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (xm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static xm parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (xm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static xm parseFrom(com.google.v.z zVar) {
        return (xm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static xm parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (xm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static xm parseFrom(InputStream inputStream) {
        return (xm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static xm parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (xm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static xm parseFrom(ByteBuffer byteBuffer) {
        return (xm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static xm parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (xm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static xm parseFrom(byte[] bArr) {
        return (xm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static xm parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (xm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
