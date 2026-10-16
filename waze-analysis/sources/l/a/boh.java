package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class boh extends com.google.v.du<boh, bog> implements com.google.v.fj {
    public static final int CONTEXT_FIELD_NUMBER = 1;
    private static final boh DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<boh> PARSER;
    private int context_;

    static {
        boh bohVar = new boh();
        DEFAULT_INSTANCE = bohVar;
        com.google.v.du.registerDefaultInstance(boh.class, bohVar);
    }

    private boh() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContext() {
        this.context_ = 0;
    }

    public static boh getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bog newBuilder() {
        return (bog) DEFAULT_INSTANCE.createBuilder();
    }

    public static boh parseDelimitedFrom(InputStream inputStream) {
        return (boh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static boh parseFrom(com.google.v.v vVar) {
        return (boh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<boh> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContext(bu buVar) {
        this.context_ = buVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContextValue(int i2) {
        this.context_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"context_"});
        }
        if (iOrdinal == 3) {
            return new boh();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bog(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<boh> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (boh.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bu getContext() {
        bu buVarA = bu.a(this.context_);
        return buVarA == null ? bu.UNRECOGNIZED : buVarA;
    }

    public int getContextValue() {
        return this.context_;
    }

    public static bog newBuilder(boh bohVar) {
        return (bog) DEFAULT_INSTANCE.createBuilder(bohVar);
    }

    public static boh parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (boh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static boh parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (boh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static boh parseFrom(com.google.v.z zVar) {
        return (boh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static boh parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (boh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static boh parseFrom(InputStream inputStream) {
        return (boh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static boh parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (boh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static boh parseFrom(ByteBuffer byteBuffer) {
        return (boh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static boh parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (boh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static boh parseFrom(byte[] bArr) {
        return (boh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static boh parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (boh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
