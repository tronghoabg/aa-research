package com.google.o.a.b;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b extends du<b, a> implements fj {
    public static final int DAYS_FIELD_NUMBER = 3;
    private static final b DEFAULT_INSTANCE;
    public static final int HOURS_FIELD_NUMBER = 4;
    public static final int MICROSECONDS_FIELD_NUMBER = 7;
    public static final int MINUTES_FIELD_NUMBER = 5;
    public static final int MONTHS_FIELD_NUMBER = 2;
    private static volatile fo<b> PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 6;
    public static final int TZ_OFFSET_FIELD_NUMBER = 8;
    public static final int YEARS_FIELD_NUMBER = 1;
    private int bitField0_;
    private int days_;
    private int hours_;
    private int microseconds_;
    private int minutes_;
    private int months_;
    private int seconds_;
    private long tzOffset_;
    private int years_;

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        du.registerDefaultInstance(b.class, bVar);
    }

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDays() {
        this.bitField0_ &= -5;
        this.days_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHours() {
        this.bitField0_ &= -9;
        this.hours_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMicroseconds() {
        this.bitField0_ &= -65;
        this.microseconds_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMinutes() {
        this.bitField0_ &= -17;
        this.minutes_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMonths() {
        this.bitField0_ &= -3;
        this.months_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeconds() {
        this.bitField0_ &= -33;
        this.seconds_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTzOffset() {
        this.bitField0_ &= -129;
        this.tzOffset_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearYears() {
        this.bitField0_ &= -2;
        this.years_ = 0;
    }

    public static b getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static b parseDelimitedFrom(InputStream inputStream) {
        return (b) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static b parseFrom(v vVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<b> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDays(int i2) {
        this.bitField0_ |= 4;
        this.days_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHours(int i2) {
        this.bitField0_ |= 8;
        this.hours_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMicroseconds(int i2) {
        this.bitField0_ |= 64;
        this.microseconds_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMinutes(int i2) {
        this.bitField0_ |= 16;
        this.minutes_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMonths(int i2) {
        this.bitField0_ |= 2;
        this.months_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeconds(int i2) {
        this.bitField0_ |= 32;
        this.seconds_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTzOffset(long j2) {
        this.bitField0_ |= 128;
        this.tzOffset_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setYears(int i2) {
        this.bitField0_ |= 1;
        this.years_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bဂ\u0007", new Object[]{"bitField0_", "years_", "months_", "days_", "hours_", "minutes_", "seconds_", "microseconds_", "tzOffset_"});
        }
        if (iOrdinal == 3) {
            return new b();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new a(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<b> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (b.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getDays() {
        return this.days_;
    }

    public int getHours() {
        return this.hours_;
    }

    public int getMicroseconds() {
        return this.microseconds_;
    }

    public int getMinutes() {
        return this.minutes_;
    }

    public int getMonths() {
        return this.months_;
    }

    public int getSeconds() {
        return this.seconds_;
    }

    public long getTzOffset() {
        return this.tzOffset_;
    }

    public int getYears() {
        return this.years_;
    }

    public boolean hasDays() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasHours() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasMicroseconds() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasMinutes() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasMonths() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSeconds() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasTzOffset() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasYears() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(b bVar) {
        return (a) DEFAULT_INSTANCE.createBuilder(bVar);
    }

    public static b parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (b) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static b parseFrom(v vVar, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static b parseFrom(z zVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static b parseFrom(z zVar, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static b parseFrom(InputStream inputStream) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static b parseFrom(InputStream inputStream, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static b parseFrom(ByteBuffer byteBuffer) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static b parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static b parseFrom(byte[] bArr) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static b parseFrom(byte[] bArr, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
