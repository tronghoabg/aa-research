package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ast extends com.google.v.du<ast, ass> implements com.google.v.fj {
    private static final ast DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ast> PARSER = null;
    public static final int RIDE_ID_FIELD_NUMBER = 2;
    public static final int VALUE_FIELD_NUMBER = 1;
    private String value_ = "";
    private String rideId_ = "";

    static {
        ast astVar = new ast();
        DEFAULT_INSTANCE = astVar;
        com.google.v.du.registerDefaultInstance(ast.class, astVar);
    }

    private ast() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRideId() {
        this.rideId_ = getDefaultInstance().getRideId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = getDefaultInstance().getValue();
    }

    public static ast getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ass newBuilder() {
        return (ass) DEFAULT_INSTANCE.createBuilder();
    }

    public static ast parseDelimitedFrom(InputStream inputStream) {
        return (ast) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ast parseFrom(com.google.v.v vVar) {
        return (ast) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ast> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRideId(String str) {
        Objects.requireNonNull(str);
        this.rideId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRideIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.rideId_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(String str) {
        Objects.requireNonNull(str);
        this.value_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValueBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.value_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"value_", "rideId_"});
        }
        if (iOrdinal == 3) {
            return new ast();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ass(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ast> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ast.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getRideId() {
        return this.rideId_;
    }

    public com.google.v.v getRideIdBytes() {
        return com.google.v.v.s(this.rideId_);
    }

    public String getValue() {
        return this.value_;
    }

    public com.google.v.v getValueBytes() {
        return com.google.v.v.s(this.value_);
    }

    public static ass newBuilder(ast astVar) {
        return (ass) DEFAULT_INSTANCE.createBuilder(astVar);
    }

    public static ast parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ast) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ast parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ast) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ast parseFrom(com.google.v.z zVar) {
        return (ast) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ast parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ast) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ast parseFrom(InputStream inputStream) {
        return (ast) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ast parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ast) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ast parseFrom(ByteBuffer byteBuffer) {
        return (ast) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ast parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ast) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ast parseFrom(byte[] bArr) {
        return (ast) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ast parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ast) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
