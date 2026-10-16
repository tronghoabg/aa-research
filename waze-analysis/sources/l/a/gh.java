package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class gh extends com.google.v.du<gh, gf> implements com.google.v.fj {
    public static final int CONTEXT_FIELD_NUMBER = 1;
    private static final gh DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<gh> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 2;
    private int context_;
    private int type_;

    static {
        gh ghVar = new gh();
        DEFAULT_INSTANCE = ghVar;
        com.google.v.du.registerDefaultInstance(gh.class, ghVar);
    }

    private gh() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContext() {
        this.context_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static gh getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static gf newBuilder() {
        return (gf) DEFAULT_INSTANCE.createBuilder();
    }

    public static gh parseDelimitedFrom(InputStream inputStream) {
        return (gh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gh parseFrom(com.google.v.v vVar) {
        return (gh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<gh> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContext(aoh aohVar) {
        this.context_ = aohVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContextValue(int i2) {
        this.context_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(gg ggVar) {
        this.type_ = ggVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i2) {
        this.type_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", new Object[]{"context_", "type_"});
        }
        if (iOrdinal == 3) {
            return new gh();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new gf(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<gh> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (gh.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public aoh getContext() {
        aoh aohVarA = aoh.a(this.context_);
        return aohVarA == null ? aoh.UNRECOGNIZED : aohVarA;
    }

    public int getContextValue() {
        return this.context_;
    }

    public gg getType() {
        int i2 = this.type_;
        gg ggVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : gg.NEW_ACCOUNT : gg.EXISTING_ACCOUNT : gg.TYPE_UNSPECIFIED;
        return ggVar == null ? gg.UNRECOGNIZED : ggVar;
    }

    public int getTypeValue() {
        return this.type_;
    }

    public static gf newBuilder(gh ghVar) {
        return (gf) DEFAULT_INSTANCE.createBuilder(ghVar);
    }

    public static gh parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gh parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (gh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static gh parseFrom(com.google.v.z zVar) {
        return (gh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static gh parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (gh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static gh parseFrom(InputStream inputStream) {
        return (gh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gh parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gh parseFrom(ByteBuffer byteBuffer) {
        return (gh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static gh parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (gh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static gh parseFrom(byte[] bArr) {
        return (gh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static gh parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (gh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
