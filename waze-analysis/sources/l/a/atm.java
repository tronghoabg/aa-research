package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class atm extends com.google.v.du<atm, atl> implements com.google.v.fj {
    public static final int AVOID_FERRIES_SHOWN_FIELD_NUMBER = 2;
    public static final int AVOID_TOLLS_SHOWN_FIELD_NUMBER = 1;
    public static final int CONTEXT_FIELD_NUMBER = 3;
    private static final atm DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<atm> PARSER;
    private boolean avoidFerriesShown_;
    private boolean avoidTollsShown_;
    private int bitField0_;
    private int context_;

    static {
        atm atmVar = new atm();
        DEFAULT_INSTANCE = atmVar;
        com.google.v.du.registerDefaultInstance(atm.class, atmVar);
    }

    private atm() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvoidFerriesShown() {
        this.bitField0_ &= -3;
        this.avoidFerriesShown_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvoidTollsShown() {
        this.bitField0_ &= -2;
        this.avoidTollsShown_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContext() {
        this.context_ = 0;
    }

    public static atm getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static atl newBuilder() {
        return (atl) DEFAULT_INSTANCE.createBuilder();
    }

    public static atm parseDelimitedFrom(InputStream inputStream) {
        return (atm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static atm parseFrom(com.google.v.v vVar) {
        return (atm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<atm> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvoidFerriesShown(boolean z) {
        this.bitField0_ |= 2;
        this.avoidFerriesShown_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvoidTollsShown(boolean z) {
        this.bitField0_ |= 1;
        this.avoidTollsShown_ = z;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003\f", new Object[]{"bitField0_", "avoidTollsShown_", "avoidFerriesShown_", "context_"});
        }
        if (iOrdinal == 3) {
            return new atm();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new atl(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<atm> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (atm.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getAvoidFerriesShown() {
        return this.avoidFerriesShown_;
    }

    public boolean getAvoidTollsShown() {
        return this.avoidTollsShown_;
    }

    public atk getContext() {
        atk atkVarA = atk.a(this.context_);
        return atkVarA == null ? atk.UNRECOGNIZED : atkVarA;
    }

    public int getContextValue() {
        return this.context_;
    }

    public boolean hasAvoidFerriesShown() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasAvoidTollsShown() {
        return (this.bitField0_ & 1) != 0;
    }

    public static atl newBuilder(atm atmVar) {
        return (atl) DEFAULT_INSTANCE.createBuilder(atmVar);
    }

    public static atm parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (atm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static atm parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (atm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static atm parseFrom(com.google.v.z zVar) {
        return (atm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static atm parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (atm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static atm parseFrom(InputStream inputStream) {
        return (atm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static atm parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (atm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static atm parseFrom(ByteBuffer byteBuffer) {
        return (atm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static atm parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (atm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static atm parseFrom(byte[] bArr) {
        return (atm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static atm parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (atm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
