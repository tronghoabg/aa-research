package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class kn extends com.google.v.du<kn, kl> implements com.google.v.fj {
    public static final int BOOL_VAL_FIELD_NUMBER = 4;
    private static final kn DEFAULT_INSTANCE;
    public static final int FLOAT_VAL_FIELD_NUMBER = 3;
    public static final int INT_VAL_FIELD_NUMBER = 2;
    public static final int PARAMETER_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<kn> PARSER = null;
    public static final int STRING_VAL_FIELD_NUMBER = 5;
    private Object value_;
    private int valueCase_ = 0;
    private String parameter_ = "";

    static {
        kn knVar = new kn();
        DEFAULT_INSTANCE = knVar;
        com.google.v.du.registerDefaultInstance(kn.class, knVar);
    }

    private kn() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBoolVal() {
        if (this.valueCase_ == 4) {
            this.valueCase_ = 0;
            this.value_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFloatVal() {
        if (this.valueCase_ == 3) {
            this.valueCase_ = 0;
            this.value_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIntVal() {
        if (this.valueCase_ == 2) {
            this.valueCase_ = 0;
            this.value_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParameter() {
        this.parameter_ = getDefaultInstance().getParameter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStringVal() {
        if (this.valueCase_ == 5) {
            this.valueCase_ = 0;
            this.value_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.valueCase_ = 0;
        this.value_ = null;
    }

    public static kn getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static kl newBuilder() {
        return (kl) DEFAULT_INSTANCE.createBuilder();
    }

    public static kn parseDelimitedFrom(InputStream inputStream) {
        return (kn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static kn parseFrom(com.google.v.v vVar) {
        return (kn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<kn> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBoolVal(boolean z) {
        this.valueCase_ = 4;
        this.value_ = Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFloatVal(float f2) {
        this.valueCase_ = 3;
        this.value_ = Float.valueOf(f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIntVal(long j2) {
        this.valueCase_ = 2;
        this.value_ = Long.valueOf(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParameter(String str) {
        Objects.requireNonNull(str);
        this.parameter_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParameterBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.parameter_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStringVal(String str) {
        Objects.requireNonNull(str);
        this.valueCase_ = 5;
        this.value_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStringValBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.value_ = vVar.u();
        this.valueCase_ = 5;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u00025\u0000\u00034\u0000\u0004:\u0000\u0005Ȼ\u0000", new Object[]{"value_", "valueCase_", "parameter_"});
        }
        if (iOrdinal == 3) {
            return new kn();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new kl(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<kn> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (kn.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getBoolVal() {
        if (this.valueCase_ == 4) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public float getFloatVal() {
        if (this.valueCase_ == 3) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public long getIntVal() {
        if (this.valueCase_ == 2) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public String getParameter() {
        return this.parameter_;
    }

    public com.google.v.v getParameterBytes() {
        return com.google.v.v.s(this.parameter_);
    }

    public String getStringVal() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public com.google.v.v getStringValBytes() {
        return com.google.v.v.s(this.valueCase_ == 5 ? (String) this.value_ : "");
    }

    public km getValueCase() {
        int i2 = this.valueCase_;
        if (i2 == 0) {
            return km.f55019e;
        }
        if (i2 == 2) {
            return km.f55015a;
        }
        if (i2 == 3) {
            return km.f55016b;
        }
        if (i2 == 4) {
            return km.f55017c;
        }
        if (i2 != 5) {
            return null;
        }
        return km.f55018d;
    }

    public boolean hasBoolVal() {
        return this.valueCase_ == 4;
    }

    public boolean hasFloatVal() {
        return this.valueCase_ == 3;
    }

    public boolean hasIntVal() {
        return this.valueCase_ == 2;
    }

    public boolean hasStringVal() {
        return this.valueCase_ == 5;
    }

    public static kl newBuilder(kn knVar) {
        return (kl) DEFAULT_INSTANCE.createBuilder(knVar);
    }

    public static kn parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (kn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static kn parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (kn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static kn parseFrom(com.google.v.z zVar) {
        return (kn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static kn parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (kn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static kn parseFrom(InputStream inputStream) {
        return (kn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static kn parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (kn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static kn parseFrom(ByteBuffer byteBuffer) {
        return (kn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static kn parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (kn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static kn parseFrom(byte[] bArr) {
        return (kn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static kn parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (kn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
