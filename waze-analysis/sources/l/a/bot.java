package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bot extends com.google.v.du<bot, bos> implements com.google.v.fj {
    public static final int AGE_VALUE_YEARS_FIELD_NUMBER = 1;
    public static final int BIRTHDATE_TIMESTAMP_SECONDS_FIELD_NUMBER = 2;
    private static final bot DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bot> PARSER;
    private long ageValueYears_;
    private long birthdateTimestampSeconds_;
    private int bitField0_;

    static {
        bot botVar = new bot();
        DEFAULT_INSTANCE = botVar;
        com.google.v.du.registerDefaultInstance(bot.class, botVar);
    }

    private bot() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAgeValueYears() {
        this.bitField0_ &= -2;
        this.ageValueYears_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBirthdateTimestampSeconds() {
        this.bitField0_ &= -3;
        this.birthdateTimestampSeconds_ = 0L;
    }

    public static bot getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bos newBuilder() {
        return (bos) DEFAULT_INSTANCE.createBuilder();
    }

    public static bot parseDelimitedFrom(InputStream inputStream) {
        return (bot) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bot parseFrom(com.google.v.v vVar) {
        return (bot) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bot> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAgeValueYears(long j2) {
        this.bitField0_ |= 1;
        this.ageValueYears_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBirthdateTimestampSeconds(long j2) {
        this.bitField0_ |= 2;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002တ\u0001", new Object[]{"bitField0_", "ageValueYears_", "birthdateTimestampSeconds_"});
        }
        if (iOrdinal == 3) {
            return new bot();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bos(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bot> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bot.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getAgeValueYears() {
        return this.ageValueYears_;
    }

    public long getBirthdateTimestampSeconds() {
        return this.birthdateTimestampSeconds_;
    }

    public boolean hasAgeValueYears() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasBirthdateTimestampSeconds() {
        return (this.bitField0_ & 2) != 0;
    }

    public static bos newBuilder(bot botVar) {
        return (bos) DEFAULT_INSTANCE.createBuilder(botVar);
    }

    public static bot parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bot) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bot parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bot) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bot parseFrom(com.google.v.z zVar) {
        return (bot) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bot parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bot) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bot parseFrom(InputStream inputStream) {
        return (bot) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bot parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bot) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bot parseFrom(ByteBuffer byteBuffer) {
        return (bot) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bot parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bot) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bot parseFrom(byte[] bArr) {
        return (bot) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bot parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bot) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
