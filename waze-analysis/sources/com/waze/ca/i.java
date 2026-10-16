package com.waze.ca;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.ei;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i extends du<i, h> implements fj {
    private static final i DEFAULT_INSTANCE;
    public static final int END_DAY_FIELD_NUMBER = 3;
    public static final int END_TIME_FIELD_NUMBER = 4;
    private static volatile fo<i> PARSER = null;
    public static final int START_DAY_FIELD_NUMBER = 1;
    public static final int START_TIME_FIELD_NUMBER = 2;
    private int bitField0_;
    private int endDay_;
    private int startDay_;
    private String startTime_ = "";
    private String endTime_ = "";

    static {
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        du.registerDefaultInstance(i.class, iVar);
    }

    private i() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndDay() {
        this.bitField0_ &= -5;
        this.endDay_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndTime() {
        this.bitField0_ &= -9;
        this.endTime_ = getDefaultInstance().getEndTime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartDay() {
        this.bitField0_ &= -2;
        this.startDay_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartTime() {
        this.bitField0_ &= -3;
        this.startTime_ = getDefaultInstance().getStartTime();
    }

    public static i getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static h newBuilder() {
        return (h) DEFAULT_INSTANCE.createBuilder();
    }

    public static i parseDelimitedFrom(InputStream inputStream) {
        return (i) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static i parseFrom(v vVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<i> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndDay(g gVar) {
        this.endDay_ = gVar.getNumber();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndTime(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.endTime_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndTimeBytes(v vVar) {
        this.endTime_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartDay(g gVar) {
        this.startDay_ = gVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartTime(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.startTime_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartTimeBytes(v vVar) {
        this.startTime_ = vVar.u();
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            ei eiVar = f.f18731a;
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "startDay_", eiVar, "startTime_", "endDay_", eiVar, "endTime_"});
        }
        if (iOrdinal == 3) {
            return new i();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new h(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<i> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (i.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public g getEndDay() {
        g gVarA = g.a(this.endDay_);
        return gVarA == null ? g.DAY_OF_WEEK_UNSPECIFIED : gVarA;
    }

    public String getEndTime() {
        return this.endTime_;
    }

    public v getEndTimeBytes() {
        return v.s(this.endTime_);
    }

    public g getStartDay() {
        g gVarA = g.a(this.startDay_);
        return gVarA == null ? g.DAY_OF_WEEK_UNSPECIFIED : gVarA;
    }

    public String getStartTime() {
        return this.startTime_;
    }

    public v getStartTimeBytes() {
        return v.s(this.startTime_);
    }

    public boolean hasEndDay() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasEndTime() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasStartDay() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasStartTime() {
        return (this.bitField0_ & 2) != 0;
    }

    public static h newBuilder(i iVar) {
        return (h) DEFAULT_INSTANCE.createBuilder(iVar);
    }

    public static i parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (i) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static i parseFrom(v vVar, de deVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static i parseFrom(z zVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static i parseFrom(z zVar, de deVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static i parseFrom(InputStream inputStream) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static i parseFrom(InputStream inputStream, de deVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static i parseFrom(ByteBuffer byteBuffer) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static i parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static i parseFrom(byte[] bArr) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static i parseFrom(byte[] bArr, de deVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
