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
public final class be extends du<be, bd> implements fj {
    public static final int DAILY_STRIKE_FIELD_NUMBER = 4;
    private static final be DEFAULT_INSTANCE;
    private static volatile fo<be> PARSER = null;
    public static final int TIMES_FIELD_NUMBER = 1;
    public static final int TIME_FRAME_FIELD_NUMBER = 3;
    public static final int TIME_PERIOD_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean dailyStrike_;
    private bi timeFrame_;
    private bm timePeriod_;
    private long times_;

    static {
        be beVar = new be();
        DEFAULT_INSTANCE = beVar;
        du.registerDefaultInstance(be.class, beVar);
    }

    private be() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDailyStrike() {
        this.bitField0_ &= -9;
        this.dailyStrike_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeFrame() {
        this.timeFrame_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimePeriod() {
        this.timePeriod_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimes() {
        this.bitField0_ &= -2;
        this.times_ = 0L;
    }

    public static be getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTimeFrame(bi biVar) {
        Objects.requireNonNull(biVar);
        bi biVar2 = this.timeFrame_;
        if (biVar2 != null && biVar2 != bi.getDefaultInstance()) {
            bh bhVarNewBuilder = bi.newBuilder(biVar2);
            bhVarNewBuilder.mergeFrom((bh) biVar);
            biVar = bhVarNewBuilder.buildPartial();
        }
        this.timeFrame_ = biVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTimePeriod(bm bmVar) {
        Objects.requireNonNull(bmVar);
        bm bmVar2 = this.timePeriod_;
        if (bmVar2 != null && bmVar2 != bm.getDefaultInstance()) {
            bl blVarNewBuilder = bm.newBuilder(bmVar2);
            blVarNewBuilder.mergeFrom((bl) bmVar);
            bmVar = blVarNewBuilder.buildPartial();
        }
        this.timePeriod_ = bmVar;
        this.bitField0_ |= 2;
    }

    public static bd newBuilder() {
        return (bd) DEFAULT_INSTANCE.createBuilder();
    }

    public static be parseDelimitedFrom(InputStream inputStream) {
        return (be) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static be parseFrom(com.google.v.v vVar) {
        return (be) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<be> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDailyStrike(boolean z) {
        this.bitField0_ |= 8;
        this.dailyStrike_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeFrame(bi biVar) {
        Objects.requireNonNull(biVar);
        this.timeFrame_ = biVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimePeriod(bm bmVar) {
        Objects.requireNonNull(bmVar);
        this.timePeriod_ = bmVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimes(long j2) {
        this.bitField0_ |= 1;
        this.times_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"bitField0_", "times_", "timePeriod_", "timeFrame_", "dailyStrike_"});
        }
        if (iOrdinal == 3) {
            return new be();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bd(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<be> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (be.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getDailyStrike() {
        return this.dailyStrike_;
    }

    public bi getTimeFrame() {
        bi biVar = this.timeFrame_;
        return biVar == null ? bi.getDefaultInstance() : biVar;
    }

    public bm getTimePeriod() {
        bm bmVar = this.timePeriod_;
        return bmVar == null ? bm.getDefaultInstance() : bmVar;
    }

    public long getTimes() {
        return this.times_;
    }

    public boolean hasDailyStrike() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasTimeFrame() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasTimePeriod() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasTimes() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bd newBuilder(be beVar) {
        return (bd) DEFAULT_INSTANCE.createBuilder(beVar);
    }

    public static be parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (be) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static be parseFrom(com.google.v.v vVar, de deVar) {
        return (be) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static be parseFrom(com.google.v.z zVar) {
        return (be) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static be parseFrom(com.google.v.z zVar, de deVar) {
        return (be) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static be parseFrom(InputStream inputStream) {
        return (be) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static be parseFrom(InputStream inputStream, de deVar) {
        return (be) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static be parseFrom(ByteBuffer byteBuffer) {
        return (be) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static be parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (be) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static be parseFrom(byte[] bArr) {
        return (be) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static be parseFrom(byte[] bArr, de deVar) {
        return (be) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
