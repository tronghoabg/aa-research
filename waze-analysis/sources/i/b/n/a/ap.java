package i.b.n.a;

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
public final class ap extends du<ap, ao> implements fj {
    public static final int BEST_FIELD_NUMBER = 2;
    private static final ap DEFAULT_INSTANCE;
    private static volatile fo<ap> PARSER = null;
    public static final int RECOMMENDED_FIELD_NUMBER = 1;
    private boolean best_;
    private int bitField0_;
    private boolean recommended_;

    static {
        ap apVar = new ap();
        DEFAULT_INSTANCE = apVar;
        du.registerDefaultInstance(ap.class, apVar);
    }

    private ap() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBest() {
        this.bitField0_ &= -3;
        this.best_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRecommended() {
        this.bitField0_ &= -2;
        this.recommended_ = false;
    }

    public static ap getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ao newBuilder() {
        return (ao) DEFAULT_INSTANCE.createBuilder();
    }

    public static ap parseDelimitedFrom(InputStream inputStream) {
        return (ap) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ap parseFrom(com.google.v.v vVar) {
        return (ap) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ap> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBest(boolean z) {
        this.bitField0_ |= 2;
        this.best_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecommended(boolean z) {
        this.bitField0_ |= 1;
        this.recommended_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"bitField0_", "recommended_", "best_"});
        }
        if (iOrdinal == 3) {
            return new ap();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ao(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ap> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ap.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getBest() {
        return this.best_;
    }

    public boolean getRecommended() {
        return this.recommended_;
    }

    public boolean hasBest() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasRecommended() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ao newBuilder(ap apVar) {
        return (ao) DEFAULT_INSTANCE.createBuilder(apVar);
    }

    public static ap parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ap) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ap parseFrom(com.google.v.v vVar, de deVar) {
        return (ap) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ap parseFrom(com.google.v.z zVar) {
        return (ap) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ap parseFrom(com.google.v.z zVar, de deVar) {
        return (ap) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ap parseFrom(InputStream inputStream) {
        return (ap) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ap parseFrom(InputStream inputStream, de deVar) {
        return (ap) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ap parseFrom(ByteBuffer byteBuffer) {
        return (ap) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ap parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ap) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ap parseFrom(byte[] bArr) {
        return (ap) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ap parseFrom(byte[] bArr, de deVar) {
        return (ap) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
