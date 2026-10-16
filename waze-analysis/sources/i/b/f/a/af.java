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
public final class af extends du<af, ae> implements fj {
    private static final af DEFAULT_INSTANCE;
    private static volatile fo<af> PARSER = null;
    public static final int TIMES_PER_TIME_PERIOD_FIELD_NUMBER = 1;
    public static final int TIME_PERIOD_FIELD_NUMBER = 2;
    private int bitField0_;
    private bm timePeriod_;
    private long timesPerTimePeriod_;

    static {
        af afVar = new af();
        DEFAULT_INSTANCE = afVar;
        du.registerDefaultInstance(af.class, afVar);
    }

    private af() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimePeriod() {
        this.timePeriod_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimesPerTimePeriod() {
        this.bitField0_ &= -2;
        this.timesPerTimePeriod_ = 0L;
    }

    public static af getDefaultInstance() {
        return DEFAULT_INSTANCE;
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

    public static ae newBuilder() {
        return (ae) DEFAULT_INSTANCE.createBuilder();
    }

    public static af parseDelimitedFrom(InputStream inputStream) {
        return (af) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static af parseFrom(com.google.v.v vVar) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<af> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimePeriod(bm bmVar) {
        Objects.requireNonNull(bmVar);
        this.timePeriod_ = bmVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimesPerTimePeriod(long j2) {
        this.bitField0_ |= 1;
        this.timesPerTimePeriod_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "timesPerTimePeriod_", "timePeriod_"});
        }
        if (iOrdinal == 3) {
            return new af();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ae(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<af> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (af.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bm getTimePeriod() {
        bm bmVar = this.timePeriod_;
        return bmVar == null ? bm.getDefaultInstance() : bmVar;
    }

    public long getTimesPerTimePeriod() {
        return this.timesPerTimePeriod_;
    }

    public boolean hasTimePeriod() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasTimesPerTimePeriod() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ae newBuilder(af afVar) {
        return (ae) DEFAULT_INSTANCE.createBuilder(afVar);
    }

    public static af parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (af) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static af parseFrom(com.google.v.v vVar, de deVar) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static af parseFrom(com.google.v.z zVar) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static af parseFrom(com.google.v.z zVar, de deVar) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static af parseFrom(InputStream inputStream) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static af parseFrom(InputStream inputStream, de deVar) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static af parseFrom(ByteBuffer byteBuffer) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static af parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static af parseFrom(byte[] bArr) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static af parseFrom(byte[] bArr, de deVar) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
