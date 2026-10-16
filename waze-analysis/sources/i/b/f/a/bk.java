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
public final class bk extends du<bk, bj> implements fj {
    private static final bk DEFAULT_INSTANCE;
    public static final int FROM_EPOCH_FIELD_NUMBER = 1;
    private static volatile fo<bk> PARSER = null;
    public static final int TO_EPOCH_FIELD_NUMBER = 2;
    private int bitField0_;
    private long fromEpoch_;
    private long toEpoch_;

    static {
        bk bkVar = new bk();
        DEFAULT_INSTANCE = bkVar;
        du.registerDefaultInstance(bk.class, bkVar);
    }

    private bk() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFromEpoch() {
        this.bitField0_ &= -2;
        this.fromEpoch_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToEpoch() {
        this.bitField0_ &= -3;
        this.toEpoch_ = 0L;
    }

    public static bk getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bj newBuilder() {
        return (bj) DEFAULT_INSTANCE.createBuilder();
    }

    public static bk parseDelimitedFrom(InputStream inputStream) {
        return (bk) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bk parseFrom(com.google.v.v vVar) {
        return (bk) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<bk> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromEpoch(long j2) {
        this.bitField0_ |= 1;
        this.fromEpoch_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToEpoch(long j2) {
        this.bitField0_ |= 2;
        this.toEpoch_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"bitField0_", "fromEpoch_", "toEpoch_"});
        }
        if (iOrdinal == 3) {
            return new bk();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bj(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<bk> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bk.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getFromEpoch() {
        return this.fromEpoch_;
    }

    public long getToEpoch() {
        return this.toEpoch_;
    }

    public boolean hasFromEpoch() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasToEpoch() {
        return (this.bitField0_ & 2) != 0;
    }

    public static bj newBuilder(bk bkVar) {
        return (bj) DEFAULT_INSTANCE.createBuilder(bkVar);
    }

    public static bk parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (bk) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bk parseFrom(com.google.v.v vVar, de deVar) {
        return (bk) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bk parseFrom(com.google.v.z zVar) {
        return (bk) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bk parseFrom(com.google.v.z zVar, de deVar) {
        return (bk) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bk parseFrom(InputStream inputStream) {
        return (bk) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bk parseFrom(InputStream inputStream, de deVar) {
        return (bk) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bk parseFrom(ByteBuffer byteBuffer) {
        return (bk) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bk parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (bk) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bk parseFrom(byte[] bArr) {
        return (bk) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bk parseFrom(byte[] bArr, de deVar) {
        return (bk) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
