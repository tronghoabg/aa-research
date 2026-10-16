package i.b.c;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class n extends du<n, m> implements fj {
    private static final n DEFAULT_INSTANCE;
    private static volatile fo<n> PARSER = null;
    public static final int START_WALKING_PARAMS_FIELD_NUMBER = 1;
    private int bitField0_;
    private l startWalkingParams_;

    static {
        n nVar = new n();
        DEFAULT_INSTANCE = nVar;
        du.registerDefaultInstance(n.class, nVar);
    }

    private n() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartWalkingParams() {
        this.startWalkingParams_ = null;
        this.bitField0_ &= -2;
    }

    public static n getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStartWalkingParams(l lVar) {
        Objects.requireNonNull(lVar);
        l lVar2 = this.startWalkingParams_;
        if (lVar2 != null && lVar2 != l.getDefaultInstance()) {
            k kVarNewBuilder = l.newBuilder(lVar2);
            kVarNewBuilder.mergeFrom((k) lVar);
            lVar = kVarNewBuilder.buildPartial();
        }
        this.startWalkingParams_ = lVar;
        this.bitField0_ |= 1;
    }

    public static m newBuilder() {
        return (m) DEFAULT_INSTANCE.createBuilder();
    }

    public static n parseDelimitedFrom(InputStream inputStream) {
        return (n) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static n parseFrom(v vVar) {
        return (n) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<n> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartWalkingParams(l lVar) {
        Objects.requireNonNull(lVar);
        this.startWalkingParams_ = lVar;
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "startWalkingParams_"});
        }
        if (iOrdinal == 3) {
            return new n();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new m(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<n> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (n.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public l getStartWalkingParams() {
        l lVar = this.startWalkingParams_;
        return lVar == null ? l.getDefaultInstance() : lVar;
    }

    public boolean hasStartWalkingParams() {
        return (this.bitField0_ & 1) != 0;
    }

    public static m newBuilder(n nVar) {
        return (m) DEFAULT_INSTANCE.createBuilder(nVar);
    }

    public static n parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (n) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static n parseFrom(v vVar, de deVar) {
        return (n) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static n parseFrom(z zVar) {
        return (n) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static n parseFrom(z zVar, de deVar) {
        return (n) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static n parseFrom(InputStream inputStream) {
        return (n) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static n parseFrom(InputStream inputStream, de deVar) {
        return (n) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static n parseFrom(ByteBuffer byteBuffer) {
        return (n) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static n parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (n) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static n parseFrom(byte[] bArr) {
        return (n) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static n parseFrom(byte[] bArr, de deVar) {
        return (n) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
