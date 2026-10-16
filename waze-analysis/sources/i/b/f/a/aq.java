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
public final class aq extends du<aq, ap> implements fj {
    private static final aq DEFAULT_INSTANCE;
    private static volatile fo<aq> PARSER = null;
    public static final int TARGET_FIELD_NUMBER = 1;
    private int bitField0_;
    private long target_;

    static {
        aq aqVar = new aq();
        DEFAULT_INSTANCE = aqVar;
        du.registerDefaultInstance(aq.class, aqVar);
    }

    private aq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTarget() {
        this.bitField0_ &= -2;
        this.target_ = 0L;
    }

    public static aq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ap newBuilder() {
        return (ap) DEFAULT_INSTANCE.createBuilder();
    }

    public static aq parseDelimitedFrom(InputStream inputStream) {
        return (aq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aq parseFrom(com.google.v.v vVar) {
        return (aq) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<aq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTarget(long j2) {
        this.bitField0_ |= 1;
        this.target_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"bitField0_", "target_"});
        }
        if (iOrdinal == 3) {
            return new aq();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ap(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<aq> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aq.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getTarget() {
        return this.target_;
    }

    public boolean hasTarget() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ap newBuilder(aq aqVar) {
        return (ap) DEFAULT_INSTANCE.createBuilder(aqVar);
    }

    public static aq parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (aq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aq parseFrom(com.google.v.v vVar, de deVar) {
        return (aq) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aq parseFrom(com.google.v.z zVar) {
        return (aq) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aq parseFrom(com.google.v.z zVar, de deVar) {
        return (aq) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aq parseFrom(InputStream inputStream) {
        return (aq) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aq parseFrom(InputStream inputStream, de deVar) {
        return (aq) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aq parseFrom(ByteBuffer byteBuffer) {
        return (aq) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aq parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (aq) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aq parseFrom(byte[] bArr) {
        return (aq) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aq parseFrom(byte[] bArr, de deVar) {
        return (aq) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
