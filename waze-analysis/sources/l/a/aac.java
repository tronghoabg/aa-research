package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aac extends com.google.v.du<aac, aab> implements com.google.v.fj {
    public static final int ANDROID_INVOCATION_CODE_FIELD_NUMBER = 2;
    private static final aac DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<aac> PARSER = null;
    public static final int SOURCE_TYPE_FIELD_NUMBER = 1;
    private String androidInvocationCode_ = "";
    private int sourceType_;

    static {
        aac aacVar = new aac();
        DEFAULT_INSTANCE = aacVar;
        com.google.v.du.registerDefaultInstance(aac.class, aacVar);
    }

    private aac() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAndroidInvocationCode() {
        this.androidInvocationCode_ = getDefaultInstance().getAndroidInvocationCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSourceType() {
        this.sourceType_ = 0;
    }

    public static aac getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static aab newBuilder() {
        return (aab) DEFAULT_INSTANCE.createBuilder();
    }

    public static aac parseDelimitedFrom(InputStream inputStream) {
        return (aac) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aac parseFrom(com.google.v.v vVar) {
        return (aac) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aac> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAndroidInvocationCode(String str) {
        Objects.requireNonNull(str);
        this.androidInvocationCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAndroidInvocationCodeBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.androidInvocationCode_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceType(aaj aajVar) {
        this.sourceType_ = aajVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceTypeValue(int i2) {
        this.sourceType_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"sourceType_", "androidInvocationCode_"});
        }
        if (iOrdinal == 3) {
            return new aac();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aab(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aac> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aac.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getAndroidInvocationCode() {
        return this.androidInvocationCode_;
    }

    public com.google.v.v getAndroidInvocationCodeBytes() {
        return com.google.v.v.s(this.androidInvocationCode_);
    }

    public aaj getSourceType() {
        aaj aajVarA = aaj.a(this.sourceType_);
        return aajVarA == null ? aaj.UNRECOGNIZED : aajVarA;
    }

    public int getSourceTypeValue() {
        return this.sourceType_;
    }

    public static aab newBuilder(aac aacVar) {
        return (aab) DEFAULT_INSTANCE.createBuilder(aacVar);
    }

    public static aac parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aac) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aac parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aac) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aac parseFrom(com.google.v.z zVar) {
        return (aac) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aac parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aac) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aac parseFrom(InputStream inputStream) {
        return (aac) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aac parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aac) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aac parseFrom(ByteBuffer byteBuffer) {
        return (aac) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aac parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aac) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aac parseFrom(byte[] bArr) {
        return (aac) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aac parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aac) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
