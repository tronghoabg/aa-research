package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bor extends com.google.v.du<bor, boq> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 1;
    public static final int BIRTHDATE_TIMESTAMP_SECONDS_FIELD_NUMBER = 2;
    private static final bor DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bor> PARSER;
    private int action_;
    private long birthdateTimestampSeconds_;
    private int bitField0_;

    static {
        bor borVar = new bor();
        DEFAULT_INSTANCE = borVar;
        com.google.v.du.registerDefaultInstance(bor.class, borVar);
    }

    private bor() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBirthdateTimestampSeconds() {
        this.bitField0_ &= -2;
        this.birthdateTimestampSeconds_ = 0L;
    }

    public static bor getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static boq newBuilder() {
        return (boq) DEFAULT_INSTANCE.createBuilder();
    }

    public static bor parseDelimitedFrom(InputStream inputStream) {
        return (bor) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bor parseFrom(com.google.v.v vVar) {
        return (bor) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bor> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(bop bopVar) {
        this.action_ = bopVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBirthdateTimestampSeconds(long j2) {
        this.bitField0_ |= 1;
        this.birthdateTimestampSeconds_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002တ\u0000", new Object[]{"bitField0_", "action_", "birthdateTimestampSeconds_"});
        }
        if (iOrdinal == 3) {
            return new bor();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new boq(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bor> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bor.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bop getAction() {
        int i2 = this.action_;
        bop bopVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : bop.EDIT_BIRTHDATE : bop.CONFIRM : bop.ACTION_UNSPECIFIED;
        return bopVar == null ? bop.UNRECOGNIZED : bopVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public long getBirthdateTimestampSeconds() {
        return this.birthdateTimestampSeconds_;
    }

    public boolean hasBirthdateTimestampSeconds() {
        return (this.bitField0_ & 1) != 0;
    }

    public static boq newBuilder(bor borVar) {
        return (boq) DEFAULT_INSTANCE.createBuilder(borVar);
    }

    public static bor parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bor) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bor parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bor) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bor parseFrom(com.google.v.z zVar) {
        return (bor) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bor parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bor) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bor parseFrom(InputStream inputStream) {
        return (bor) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bor parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bor) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bor parseFrom(ByteBuffer byteBuffer) {
        return (bor) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bor parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bor) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bor parseFrom(byte[] bArr) {
        return (bor) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bor parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bor) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
