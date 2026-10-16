package com.google.k.a.a.b;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class kc extends com.google.v.du<kc, jx> implements com.google.v.fj {
    public static final int DAY_FIELD_NUMBER = 4;
    public static final int DAY_TYPE_FIELD_NUMBER = 5;
    private static final kc DEFAULT_INSTANCE;
    public static final int HOUR_FIELD_NUMBER = 3;
    public static final int MINUTE_FIELD_NUMBER = 2;
    public static final int MONTH_FIELD_NUMBER = 8;
    private static volatile com.google.v.fo<kc> PARSER = null;
    public static final int SECOND_FIELD_NUMBER = 1;
    public static final int WEEK_FIELD_NUMBER = 6;
    public static final int WEEK_TYPE_FIELD_NUMBER = 7;
    public static final int YEAR_FIELD_NUMBER = 9;
    private int bitField0_;
    private int dayType_;
    private int day_;
    private int hour_;
    private int minute_;
    private int month_ = 1;
    private int second_;
    private int weekType_;
    private int week_;
    private int year_;

    static {
        kc kcVar = new kc();
        DEFAULT_INSTANCE = kcVar;
        com.google.v.du.registerDefaultInstance(kc.class, kcVar);
    }

    private kc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDay() {
        this.bitField0_ &= -9;
        this.day_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDayType() {
        this.bitField0_ &= -17;
        this.dayType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHour() {
        this.bitField0_ &= -5;
        this.hour_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMinute() {
        this.bitField0_ &= -3;
        this.minute_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMonth() {
        this.bitField0_ &= -129;
        this.month_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSecond() {
        this.bitField0_ &= -2;
        this.second_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWeek() {
        this.bitField0_ &= -33;
        this.week_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWeekType() {
        this.bitField0_ &= -65;
        this.weekType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearYear() {
        this.bitField0_ &= -257;
        this.year_ = 0;
    }

    public static kc getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static jx newBuilder() {
        return (jx) DEFAULT_INSTANCE.createBuilder();
    }

    public static kc parseDelimitedFrom(InputStream inputStream) {
        return (kc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static kc parseFrom(com.google.v.v vVar) {
        return (kc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<kc> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDay(int i2) {
        this.bitField0_ |= 8;
        this.day_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDayType(jy jyVar) {
        this.dayType_ = jyVar.getNumber();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHour(int i2) {
        this.bitField0_ |= 4;
        this.hour_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMinute(int i2) {
        this.bitField0_ |= 2;
        this.minute_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMonth(jz jzVar) {
        this.month_ = jzVar.getNumber();
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecond(int i2) {
        this.bitField0_ |= 1;
        this.second_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWeek(int i2) {
        this.bitField0_ |= 32;
        this.week_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWeekType(kb kbVar) {
        this.weekType_ = kbVar.getNumber();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setYear(int i2) {
        this.bitField0_ |= 256;
        this.year_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005᠌\u0004\u0006င\u0005\u0007᠌\u0006\b᠌\u0007\tင\b", new Object[]{"bitField0_", "second_", "minute_", "hour_", "day_", "dayType_", hs.u, "week_", "weekType_", ka.f11671a, "month_", ka.f11672b, "year_"});
        }
        if (iOrdinal == 3) {
            return new kc();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new jx(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<kc> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (kc.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getDay() {
        return this.day_;
    }

    public jy getDayType() {
        jy jyVarA = jy.a(this.dayType_);
        return jyVarA == null ? jy.DAY_OF_WEEK : jyVarA;
    }

    public int getHour() {
        return this.hour_;
    }

    public int getMinute() {
        return this.minute_;
    }

    public jz getMonth() {
        jz jzVarA = jz.a(this.month_);
        return jzVarA == null ? jz.JANUARY : jzVarA;
    }

    public int getSecond() {
        return this.second_;
    }

    public int getWeek() {
        return this.week_;
    }

    public kb getWeekType() {
        kb kbVarA = kb.a(this.weekType_);
        return kbVarA == null ? kb.WEEK_OF_MONTH : kbVarA;
    }

    public int getYear() {
        return this.year_;
    }

    public boolean hasDay() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasDayType() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasHour() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasMinute() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasMonth() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasSecond() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasWeek() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasWeekType() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasYear() {
        return (this.bitField0_ & 256) != 0;
    }

    public static jx newBuilder(kc kcVar) {
        return (jx) DEFAULT_INSTANCE.createBuilder(kcVar);
    }

    public static kc parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (kc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static kc parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (kc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static kc parseFrom(com.google.v.z zVar) {
        return (kc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static kc parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (kc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static kc parseFrom(InputStream inputStream) {
        return (kc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static kc parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (kc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static kc parseFrom(ByteBuffer byteBuffer) {
        return (kc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static kc parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (kc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static kc parseFrom(byte[] bArr) {
        return (kc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static kc parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (kc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
