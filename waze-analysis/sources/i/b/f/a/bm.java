package i.b.f.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bm extends du<bm, bl> implements fj {
    private static final bm DEFAULT_INSTANCE;
    private static volatile fo<bm> PARSER = null;
    public static final int TIME_IN_UNIT_FIELD_NUMBER = 1;
    public static final int TIME_UNIT_FIELD_NUMBER = 2;
    private int bitField0_;
    private long timeInUnit_;
    private int timeUnit_;

    static {
        bm bmVar = new bm();
        DEFAULT_INSTANCE = bmVar;
        du.registerDefaultInstance(bm.class, bmVar);
    }

    private bm() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeInUnit() {
        this.bitField0_ &= -2;
        this.timeInUnit_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeUnit() {
        this.bitField0_ &= -3;
        this.timeUnit_ = 0;
    }

    public static bm getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bl newBuilder() {
        return (bl) DEFAULT_INSTANCE.createBuilder();
    }

    public static bm parseDelimitedFrom(InputStream inputStream) {
        return (bm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bm parseFrom(com.google.v.v vVar) {
        return (bm) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<bm> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeInUnit(long j2) {
        this.bitField0_ |= 1;
        this.timeInUnit_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeUnit(bo boVar) {
        this.timeUnit_ = boVar.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001", new Object[]{"bitField0_", "timeInUnit_", "timeUnit_", bn.f48430a});
        }
        if (iOrdinal == 3) {
            return new bm();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bl(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<bm> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bm.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getTimeInUnit() {
        return this.timeInUnit_;
    }

    public bo getTimeUnit() {
        bo boVarA = bo.a(this.timeUnit_);
        return boVarA == null ? bo.EVER : boVarA;
    }

    public boolean hasTimeInUnit() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasTimeUnit() {
        return (this.bitField0_ & 2) != 0;
    }

    public static bl newBuilder(bm bmVar) {
        return (bl) DEFAULT_INSTANCE.createBuilder(bmVar);
    }

    public static bm parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (bm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bm parseFrom(com.google.v.v vVar, de deVar) {
        return (bm) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bm parseFrom(com.google.v.z zVar) {
        return (bm) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bm parseFrom(com.google.v.z zVar, de deVar) {
        return (bm) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bm parseFrom(InputStream inputStream) {
        return (bm) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bm parseFrom(InputStream inputStream, de deVar) {
        return (bm) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bm parseFrom(ByteBuffer byteBuffer) {
        return (bm) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bm parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (bm) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bm parseFrom(byte[] bArr) {
        return (bm) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bm parseFrom(byte[] bArr, de deVar) {
        return (bm) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
