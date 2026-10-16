package i.b.q;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class p extends du<p, n> implements fj {
    public static final int ARRIVALTIMEINEPOCHSEC_FIELD_NUMBER = 2;
    private static final p DEFAULT_INSTANCE;
    public static final int DEPARTURETIMEINEPOCHSEC_FIELD_NUMBER = 1;
    private static volatile fo<p> PARSER;
    private int departOrArriveTimeCase_ = 0;
    private Object departOrArriveTime_;

    static {
        p pVar = new p();
        DEFAULT_INSTANCE = pVar;
        du.registerDefaultInstance(p.class, pVar);
    }

    private p() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearArrivalTimeInEpochSec() {
        if (this.departOrArriveTimeCase_ == 2) {
            this.departOrArriveTimeCase_ = 0;
            this.departOrArriveTime_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDepartOrArriveTime() {
        this.departOrArriveTimeCase_ = 0;
        this.departOrArriveTime_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDepartureTimeInEpochSec() {
        if (this.departOrArriveTimeCase_ == 1) {
            this.departOrArriveTimeCase_ = 0;
            this.departOrArriveTime_ = null;
        }
    }

    public static p getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static n newBuilder() {
        return (n) DEFAULT_INSTANCE.createBuilder();
    }

    public static p parseDelimitedFrom(InputStream inputStream) {
        return (p) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static p parseFrom(com.google.v.v vVar) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<p> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setArrivalTimeInEpochSec(long j2) {
        this.departOrArriveTimeCase_ = 2;
        this.departOrArriveTime_ = Long.valueOf(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDepartureTimeInEpochSec(long j2) {
        this.departOrArriveTimeCase_ = 1;
        this.departOrArriveTime_ = Long.valueOf(j2);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u00015\u0000\u00025\u0000", new Object[]{"departOrArriveTime_", "departOrArriveTimeCase_"});
        }
        if (iOrdinal == 3) {
            return new p();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new n(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<p> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (p.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getArrivalTimeInEpochSec() {
        if (this.departOrArriveTimeCase_ == 2) {
            return ((Long) this.departOrArriveTime_).longValue();
        }
        return 0L;
    }

    public o getDepartOrArriveTimeCase() {
        int i2 = this.departOrArriveTimeCase_;
        if (i2 == 0) {
            return o.f49251c;
        }
        if (i2 == 1) {
            return o.f49249a;
        }
        if (i2 != 2) {
            return null;
        }
        return o.f49250b;
    }

    public long getDepartureTimeInEpochSec() {
        if (this.departOrArriveTimeCase_ == 1) {
            return ((Long) this.departOrArriveTime_).longValue();
        }
        return 0L;
    }

    public boolean hasArrivalTimeInEpochSec() {
        return this.departOrArriveTimeCase_ == 2;
    }

    public boolean hasDepartureTimeInEpochSec() {
        return this.departOrArriveTimeCase_ == 1;
    }

    public static n newBuilder(p pVar) {
        return (n) DEFAULT_INSTANCE.createBuilder(pVar);
    }

    public static p parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (p) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static p parseFrom(com.google.v.v vVar, de deVar) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static p parseFrom(com.google.v.z zVar) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static p parseFrom(com.google.v.z zVar, de deVar) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static p parseFrom(InputStream inputStream) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static p parseFrom(InputStream inputStream, de deVar) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static p parseFrom(ByteBuffer byteBuffer) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static p parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static p parseFrom(byte[] bArr) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static p parseFrom(byte[] bArr, de deVar) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
