package i.b.f.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class am extends du<am, ak> implements fj {
    private static final am DEFAULT_INSTANCE;
    public static final int MULTIPLY_FIELD_NUMBER = 2;
    private static volatile fo<am> PARSER = null;
    public static final int PROPERTY_KEY_FIELD_NUMBER = 1;
    private int bitField0_;
    private Object function_;
    private int functionCase_ = 0;
    private String propertyKey_ = "";

    static {
        am amVar = new am();
        DEFAULT_INSTANCE = amVar;
        du.registerDefaultInstance(am.class, amVar);
    }

    private am() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFunction() {
        this.functionCase_ = 0;
        this.function_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMultiply() {
        if (this.functionCase_ == 2) {
            this.functionCase_ = 0;
            this.function_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPropertyKey() {
        this.bitField0_ &= -2;
        this.propertyKey_ = getDefaultInstance().getPropertyKey();
    }

    public static am getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMultiply(ah ahVar) {
        Objects.requireNonNull(ahVar);
        if (this.functionCase_ == 2 && this.function_ != ah.getDefaultInstance()) {
            ag agVarNewBuilder = ah.newBuilder((ah) this.function_);
            agVarNewBuilder.mergeFrom((ag) ahVar);
            ahVar = agVarNewBuilder.buildPartial();
        }
        this.function_ = ahVar;
        this.functionCase_ = 2;
    }

    public static ak newBuilder() {
        return (ak) DEFAULT_INSTANCE.createBuilder();
    }

    public static am parseDelimitedFrom(InputStream inputStream) {
        return (am) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static am parseFrom(com.google.v.v vVar) {
        return (am) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<am> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMultiply(ah ahVar) {
        Objects.requireNonNull(ahVar);
        this.function_ = ahVar;
        this.functionCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPropertyKey(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.propertyKey_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPropertyKeyBytes(com.google.v.v vVar) {
        this.propertyKey_ = vVar.u();
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002<\u0000", new Object[]{"function_", "functionCase_", "bitField0_", "propertyKey_", ah.class});
        }
        if (iOrdinal == 3) {
            return new am();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ak(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<am> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (am.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public al getFunctionCase() {
        int i2 = this.functionCase_;
        if (i2 == 0) {
            return al.f48416b;
        }
        if (i2 != 2) {
            return null;
        }
        return al.f48415a;
    }

    public ah getMultiply() {
        return this.functionCase_ == 2 ? (ah) this.function_ : ah.getDefaultInstance();
    }

    public String getPropertyKey() {
        return this.propertyKey_;
    }

    public com.google.v.v getPropertyKeyBytes() {
        return com.google.v.v.s(this.propertyKey_);
    }

    public boolean hasMultiply() {
        return this.functionCase_ == 2;
    }

    public boolean hasPropertyKey() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ak newBuilder(am amVar) {
        return (ak) DEFAULT_INSTANCE.createBuilder(amVar);
    }

    public static am parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (am) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static am parseFrom(com.google.v.v vVar, de deVar) {
        return (am) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static am parseFrom(com.google.v.z zVar) {
        return (am) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static am parseFrom(com.google.v.z zVar, de deVar) {
        return (am) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static am parseFrom(InputStream inputStream) {
        return (am) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static am parseFrom(InputStream inputStream, de deVar) {
        return (am) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static am parseFrom(ByteBuffer byteBuffer) {
        return (am) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static am parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (am) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static am parseFrom(byte[] bArr) {
        return (am) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static am parseFrom(byte[] bArr, de deVar) {
        return (am) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
