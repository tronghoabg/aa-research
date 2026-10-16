package i.b.f.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bb extends du<bb, ba> implements bc {
    private static final bb DEFAULT_INSTANCE;
    private static volatile fo<bb> PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    public static final int STATUS_TIME_MILLIS_FIELD_NUMBER = 2;
    private int bitField0_;
    private long statusTimeMillis_;
    private int status_;

    static {
        bb bbVar = new bb();
        DEFAULT_INSTANCE = bbVar;
        du.registerDefaultInstance(bb.class, bbVar);
    }

    private bb() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.bitField0_ &= -2;
        this.status_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatusTimeMillis() {
        this.bitField0_ &= -3;
        this.statusTimeMillis_ = 0L;
    }

    public static bb getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ba newBuilder() {
        return (ba) DEFAULT_INSTANCE.createBuilder();
    }

    public static bb parseDelimitedFrom(InputStream inputStream) {
        return (bb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bb parseFrom(com.google.v.v vVar) {
        return (bb) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<bb> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(ab abVar) {
        this.status_ = abVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatusTimeMillis(long j2) {
        this.bitField0_ |= 2;
        this.statusTimeMillis_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"bitField0_", "status_", bn.f48431b, "statusTimeMillis_"});
        }
        if (iOrdinal == 3) {
            return new bb();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ba(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<bb> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bb.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ab getStatus() {
        ab abVarA = ab.a(this.status_);
        return abVarA == null ? ab.UNKNOWN : abVarA;
    }

    public long getStatusTimeMillis() {
        return this.statusTimeMillis_;
    }

    public boolean hasStatus() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasStatusTimeMillis() {
        return (this.bitField0_ & 2) != 0;
    }

    public static ba newBuilder(bb bbVar) {
        return (ba) DEFAULT_INSTANCE.createBuilder(bbVar);
    }

    public static bb parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (bb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bb parseFrom(com.google.v.v vVar, de deVar) {
        return (bb) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bb parseFrom(com.google.v.z zVar) {
        return (bb) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bb parseFrom(com.google.v.z zVar, de deVar) {
        return (bb) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bb parseFrom(InputStream inputStream) {
        return (bb) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bb parseFrom(InputStream inputStream, de deVar) {
        return (bb) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bb parseFrom(ByteBuffer byteBuffer) {
        return (bb) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bb parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (bb) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bb parseFrom(byte[] bArr) {
        return (bb) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bb parseFrom(byte[] bArr, de deVar) {
        return (bb) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
