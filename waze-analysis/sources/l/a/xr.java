package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class xr extends com.google.v.du<xr, xq> implements com.google.v.fj {
    private static final xr DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<xr> PARSER = null;
    public static final int SOURCE_FIELD_NUMBER = 1;
    private int source_;

    static {
        xr xrVar = new xr();
        DEFAULT_INSTANCE = xrVar;
        com.google.v.du.registerDefaultInstance(xr.class, xrVar);
    }

    private xr() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSource() {
        this.source_ = 0;
    }

    public static xr getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static xq newBuilder() {
        return (xq) DEFAULT_INSTANCE.createBuilder();
    }

    public static xr parseDelimitedFrom(InputStream inputStream) {
        return (xr) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static xr parseFrom(com.google.v.v vVar) {
        return (xr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<xr> parser() {
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
            return new xr();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new xq(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<xr> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (xr.class) {
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

    public static xq newBuilder(xr xrVar) {
        return (xq) DEFAULT_INSTANCE.createBuilder(xrVar);
    }

    public static xr parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (xr) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static xr parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (xr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static xr parseFrom(com.google.v.z zVar) {
        return (xr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static xr parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (xr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static xr parseFrom(InputStream inputStream) {
        return (xr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static xr parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (xr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static xr parseFrom(ByteBuffer byteBuffer) {
        return (xr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static xr parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (xr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static xr parseFrom(byte[] bArr) {
        return (xr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static xr parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (xr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
