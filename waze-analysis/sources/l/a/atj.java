package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class atj extends com.google.v.du<atj, ati> implements com.google.v.fj {
    public static final int AVOID_FERRIES_CHANGED_TO_FIELD_NUMBER = 2;
    public static final int AVOID_TOLLS_CHANGED_TO_FIELD_NUMBER = 1;
    public static final int CONTEXT_FIELD_NUMBER = 3;
    private static final atj DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<atj> PARSER;
    private boolean avoidFerriesChangedTo_;
    private boolean avoidTollsChangedTo_;
    private int bitField0_;
    private int context_;

    static {
        atj atjVar = new atj();
        DEFAULT_INSTANCE = atjVar;
        com.google.v.du.registerDefaultInstance(atj.class, atjVar);
    }

    private atj() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvoidFerriesChangedTo() {
        this.bitField0_ &= -3;
        this.avoidFerriesChangedTo_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvoidTollsChangedTo() {
        this.bitField0_ &= -2;
        this.avoidTollsChangedTo_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContext() {
        this.context_ = 0;
    }

    public static atj getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ati newBuilder() {
        return (ati) DEFAULT_INSTANCE.createBuilder();
    }

    public static atj parseDelimitedFrom(InputStream inputStream) {
        return (atj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static atj parseFrom(com.google.v.v vVar) {
        return (atj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<atj> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvoidFerriesChangedTo(boolean z) {
        this.bitField0_ |= 2;
        this.avoidFerriesChangedTo_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvoidTollsChangedTo(boolean z) {
        this.bitField0_ |= 1;
        this.avoidTollsChangedTo_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContext(atk atkVar) {
        this.context_ = atkVar.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003\f", new Object[]{"bitField0_", "avoidTollsChangedTo_", "avoidFerriesChangedTo_", "context_"});
        }
        if (iOrdinal == 3) {
            return new atj();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ati(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<atj> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (atj.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getAvoidFerriesChangedTo() {
        return this.avoidFerriesChangedTo_;
    }

    public boolean getAvoidTollsChangedTo() {
        return this.avoidTollsChangedTo_;
    }

    public atk getContext() {
        atk atkVarA = atk.a(this.context_);
        return atkVarA == null ? atk.UNRECOGNIZED : atkVarA;
    }

    public int getContextValue() {
        return this.context_;
    }

    public boolean hasAvoidFerriesChangedTo() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasAvoidTollsChangedTo() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ati newBuilder(atj atjVar) {
        return (ati) DEFAULT_INSTANCE.createBuilder(atjVar);
    }

    public static atj parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (atj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static atj parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (atj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static atj parseFrom(com.google.v.z zVar) {
        return (atj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static atj parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (atj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static atj parseFrom(InputStream inputStream) {
        return (atj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static atj parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (atj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static atj parseFrom(ByteBuffer byteBuffer) {
        return (atj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static atj parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (atj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static atj parseFrom(byte[] bArr) {
        return (atj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static atj parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (atj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
