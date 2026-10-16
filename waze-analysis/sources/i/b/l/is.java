package i.b.l;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class is extends com.google.v.du<is, ir> implements com.google.v.fj {
    private static final is DEFAULT_INSTANCE;
    public static final int IS_AADC_RESTRICTED_FIELD_NUMBER = 1;
    public static final int IS_U16_RESTRICTED_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<is> PARSER;
    private int bitField0_;
    private boolean isAadcRestricted_;
    private boolean isU16Restricted_;

    static {
        is isVar = new is();
        DEFAULT_INSTANCE = isVar;
        com.google.v.du.registerDefaultInstance(is.class, isVar);
    }

    private is() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsAadcRestricted() {
        this.bitField0_ &= -2;
        this.isAadcRestricted_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsU16Restricted() {
        this.bitField0_ &= -3;
        this.isU16Restricted_ = false;
    }

    public static is getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ir newBuilder() {
        return (ir) DEFAULT_INSTANCE.createBuilder();
    }

    public static is parseDelimitedFrom(InputStream inputStream) {
        return (is) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static is parseFrom(com.google.v.v vVar) {
        return (is) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<is> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsAadcRestricted(boolean z) {
        this.bitField0_ |= 1;
        this.isAadcRestricted_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsU16Restricted(boolean z) {
        this.bitField0_ |= 2;
        this.isU16Restricted_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"bitField0_", "isAadcRestricted_", "isU16Restricted_"});
        }
        if (iOrdinal == 3) {
            return new is();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ir(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<is> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (is.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getIsAadcRestricted() {
        return this.isAadcRestricted_;
    }

    public boolean getIsU16Restricted() {
        return this.isU16Restricted_;
    }

    public boolean hasIsAadcRestricted() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasIsU16Restricted() {
        return (this.bitField0_ & 2) != 0;
    }

    public static ir newBuilder(is isVar) {
        return (ir) DEFAULT_INSTANCE.createBuilder(isVar);
    }

    public static is parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (is) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static is parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (is) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static is parseFrom(com.google.v.z zVar) {
        return (is) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static is parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (is) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static is parseFrom(InputStream inputStream) {
        return (is) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static is parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (is) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static is parseFrom(ByteBuffer byteBuffer) {
        return (is) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static is parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (is) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static is parseFrom(byte[] bArr) {
        return (is) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static is parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (is) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
