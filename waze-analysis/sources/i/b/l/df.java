package i.b.l;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class df extends com.google.v.du<df, de> implements com.google.v.fj {
    public static final int APP_TYPE_FIELD_NUMBER = 1;
    private static final df DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<df> PARSER;
    private int appType_;
    private int bitField0_;

    static {
        df dfVar = new df();
        DEFAULT_INSTANCE = dfVar;
        com.google.v.du.registerDefaultInstance(df.class, dfVar);
    }

    private df() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppType() {
        this.bitField0_ &= -2;
        this.appType_ = 0;
    }

    public static df getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static de newBuilder() {
        return (de) DEFAULT_INSTANCE.createBuilder();
    }

    public static df parseDelimitedFrom(InputStream inputStream) {
        return (df) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static df parseFrom(com.google.v.v vVar) {
        return (df) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<df> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppType(i.b.n nVar) {
        this.appType_ = nVar.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"bitField0_", "appType_", i.b.n.a()});
        }
        if (iOrdinal == 3) {
            return new df();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new de(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<df> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (df.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public i.b.n getAppType() {
        i.b.n nVarB = i.b.n.b(this.appType_);
        return nVarB == null ? i.b.n.UNKNOWN_APP_TYPE : nVarB;
    }

    public boolean hasAppType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static de newBuilder(df dfVar) {
        return (de) DEFAULT_INSTANCE.createBuilder(dfVar);
    }

    public static df parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (df) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static df parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (df) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static df parseFrom(com.google.v.z zVar) {
        return (df) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static df parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (df) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static df parseFrom(InputStream inputStream) {
        return (df) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static df parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (df) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static df parseFrom(ByteBuffer byteBuffer) {
        return (df) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static df parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (df) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static df parseFrom(byte[] bArr) {
        return (df) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static df parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (df) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
