package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class boj extends com.google.v.du<boj, boi> implements com.google.v.fj {
    public static final int CONTEXT_FIELD_NUMBER = 1;
    private static final boj DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<boj> PARSER;
    private int context_;

    static {
        boj bojVar = new boj();
        DEFAULT_INSTANCE = bojVar;
        com.google.v.du.registerDefaultInstance(boj.class, bojVar);
    }

    private boj() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContext() {
        this.context_ = 0;
    }

    public static boj getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static boi newBuilder() {
        return (boi) DEFAULT_INSTANCE.createBuilder();
    }

    public static boj parseDelimitedFrom(InputStream inputStream) {
        return (boj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static boj parseFrom(com.google.v.v vVar) {
        return (boj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<boj> parser() {
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
            return new boj();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new boi(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<boj> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (boj.class) {
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

    public static boi newBuilder(boj bojVar) {
        return (boi) DEFAULT_INSTANCE.createBuilder(bojVar);
    }

    public static boj parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (boj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static boj parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (boj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static boj parseFrom(com.google.v.z zVar) {
        return (boj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static boj parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (boj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static boj parseFrom(InputStream inputStream) {
        return (boj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static boj parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (boj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static boj parseFrom(ByteBuffer byteBuffer) {
        return (boj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static boj parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (boj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static boj parseFrom(byte[] bArr) {
        return (boj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static boj parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (boj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
