package i.b;

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
public final class r extends du<r, q> implements fj {
    public static final int ALT_TIMES_1000000_FIELD_NUMBER = 103;
    private static final r DEFAULT_INSTANCE;
    public static final int LAT_TIMES_1000000_FIELD_NUMBER = 102;
    public static final int LON_TIMES_1000000_FIELD_NUMBER = 101;
    private static volatile fo<r> PARSER;
    private int altTimes1000000_;
    private int bitField0_;
    private int latTimes1000000_;
    private int lonTimes1000000_;

    static {
        r rVar = new r();
        DEFAULT_INSTANCE = rVar;
        du.registerDefaultInstance(r.class, rVar);
    }

    private r() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAltTimes1000000() {
        this.bitField0_ &= -5;
        this.altTimes1000000_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLatTimes1000000() {
        this.bitField0_ &= -3;
        this.latTimes1000000_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLonTimes1000000() {
        this.bitField0_ &= -2;
        this.lonTimes1000000_ = 0;
    }

    public static r getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static q newBuilder() {
        return (q) DEFAULT_INSTANCE.createBuilder();
    }

    public static r parseDelimitedFrom(InputStream inputStream) {
        return (r) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static r parseFrom(com.google.v.v vVar) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<r> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAltTimes1000000(int i2) {
        this.bitField0_ |= 4;
        this.altTimes1000000_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLatTimes1000000(int i2) {
        this.bitField0_ |= 2;
        this.latTimes1000000_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLonTimes1000000(int i2) {
        this.bitField0_ |= 1;
        this.lonTimes1000000_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001eg\u0003\u0000\u0000\u0000eင\u0000fင\u0001gင\u0002", new Object[]{"bitField0_", "lonTimes1000000_", "latTimes1000000_", "altTimes1000000_"});
        }
        if (iOrdinal == 3) {
            return new r();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new q(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<r> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (r.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getAltTimes1000000() {
        return this.altTimes1000000_;
    }

    public int getLatTimes1000000() {
        return this.latTimes1000000_;
    }

    public int getLonTimes1000000() {
        return this.lonTimes1000000_;
    }

    public boolean hasAltTimes1000000() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasLatTimes1000000() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasLonTimes1000000() {
        return (this.bitField0_ & 1) != 0;
    }

    public static q newBuilder(r rVar) {
        return (q) DEFAULT_INSTANCE.createBuilder(rVar);
    }

    public static r parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (r) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static r parseFrom(com.google.v.v vVar, de deVar) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static r parseFrom(com.google.v.z zVar) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static r parseFrom(com.google.v.z zVar, de deVar) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static r parseFrom(InputStream inputStream) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static r parseFrom(InputStream inputStream, de deVar) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static r parseFrom(ByteBuffer byteBuffer) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static r parseFrom(byte[] bArr) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static r parseFrom(byte[] bArr, de deVar) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
