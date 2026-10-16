package i.c.a.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class h extends du<h, f> implements i {
    public static final int ACCURACY_DEGREES_FIELD_NUMBER = 3;
    private static final h DEFAULT_INSTANCE;
    public static final int DEGREES_FIELD_NUMBER = 1;
    public static final int EPOCH_MILLIS_FIELD_NUMBER = 2;
    private static volatile fo<h> PARSER = null;
    public static final int SOURCE_FIELD_NUMBER = 4;
    private float accuracyDegrees_;
    private int bitField0_;
    private float degrees_;
    private long epochMillis_;
    private int source_;

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        du.registerDefaultInstance(h.class, hVar);
    }

    private h() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccuracyDegrees() {
        this.bitField0_ &= -5;
        this.accuracyDegrees_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDegrees() {
        this.bitField0_ &= -2;
        this.degrees_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEpochMillis() {
        this.bitField0_ &= -3;
        this.epochMillis_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSource() {
        this.bitField0_ &= -9;
        this.source_ = 0;
    }

    public static h getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static f newBuilder() {
        return (f) DEFAULT_INSTANCE.createBuilder();
    }

    public static h parseDelimitedFrom(InputStream inputStream) {
        return (h) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static h parseFrom(v vVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<h> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccuracyDegrees(float f2) {
        this.bitField0_ |= 4;
        this.accuracyDegrees_ = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDegrees(float f2) {
        this.bitField0_ |= 1;
        this.degrees_ = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEpochMillis(long j2) {
        this.bitField0_ |= 2;
        this.epochMillis_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSource(g gVar) {
        this.source_ = gVar.getNumber();
        this.bitField0_ |= 8;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ဂ\u0001\u0003ခ\u0002\u0004᠌\u0003", new Object[]{"bitField0_", "degrees_", "epochMillis_", "accuracyDegrees_", "source_", b.f49575d});
        }
        if (iOrdinal == 3) {
            return new h();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new f(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<h> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (h.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public float getAccuracyDegrees() {
        return this.accuracyDegrees_;
    }

    public float getDegrees() {
        return this.degrees_;
    }

    public long getEpochMillis() {
        return this.epochMillis_;
    }

    public g getSource() {
        g gVarA = g.a(this.source_);
        return gVarA == null ? g.UNSPECIFIED : gVarA;
    }

    public boolean hasAccuracyDegrees() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasDegrees() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasEpochMillis() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSource() {
        return (this.bitField0_ & 8) != 0;
    }

    public static f newBuilder(h hVar) {
        return (f) DEFAULT_INSTANCE.createBuilder(hVar);
    }

    public static h parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (h) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static h parseFrom(v vVar, de deVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static h parseFrom(z zVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static h parseFrom(z zVar, de deVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static h parseFrom(InputStream inputStream) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static h parseFrom(InputStream inputStream, de deVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static h parseFrom(ByteBuffer byteBuffer) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static h parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static h parseFrom(byte[] bArr) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static h parseFrom(byte[] bArr, de deVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
