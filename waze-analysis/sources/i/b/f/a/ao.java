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
public final class ao extends du<ao, an> implements fj {
    private static final ao DEFAULT_INSTANCE;
    public static final int FUNCTION_FIELD_NUMBER = 2;
    private static volatile fo<ao> PARSER = null;
    public static final int POINTS_FIELD_NUMBER = 1;
    private int bitField0_;
    private am function_;
    private aj points_;

    static {
        ao aoVar = new ao();
        DEFAULT_INSTANCE = aoVar;
        du.registerDefaultInstance(ao.class, aoVar);
    }

    private ao() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFunction() {
        this.function_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPoints() {
        this.points_ = null;
        this.bitField0_ &= -2;
    }

    public static ao getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFunction(am amVar) {
        Objects.requireNonNull(amVar);
        am amVar2 = this.function_;
        if (amVar2 != null && amVar2 != am.getDefaultInstance()) {
            ak akVarNewBuilder = am.newBuilder(amVar2);
            akVarNewBuilder.mergeFrom((ak) amVar);
            amVar = akVarNewBuilder.buildPartial();
        }
        this.function_ = amVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePoints(aj ajVar) {
        Objects.requireNonNull(ajVar);
        aj ajVar2 = this.points_;
        if (ajVar2 != null && ajVar2 != aj.getDefaultInstance()) {
            ai aiVarNewBuilder = aj.newBuilder(ajVar2);
            aiVarNewBuilder.mergeFrom((ai) ajVar);
            ajVar = aiVarNewBuilder.buildPartial();
        }
        this.points_ = ajVar;
        this.bitField0_ |= 1;
    }

    public static an newBuilder() {
        return (an) DEFAULT_INSTANCE.createBuilder();
    }

    public static ao parseDelimitedFrom(InputStream inputStream) {
        return (ao) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ao parseFrom(com.google.v.v vVar) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ao> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFunction(am amVar) {
        Objects.requireNonNull(amVar);
        this.function_ = amVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPoints(aj ajVar) {
        Objects.requireNonNull(ajVar);
        this.points_ = ajVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "points_", "function_"});
        }
        if (iOrdinal == 3) {
            return new ao();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new an(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ao> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ao.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public am getFunction() {
        am amVar = this.function_;
        return amVar == null ? am.getDefaultInstance() : amVar;
    }

    public aj getPoints() {
        aj ajVar = this.points_;
        return ajVar == null ? aj.getDefaultInstance() : ajVar;
    }

    public boolean hasFunction() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasPoints() {
        return (this.bitField0_ & 1) != 0;
    }

    public static an newBuilder(ao aoVar) {
        return (an) DEFAULT_INSTANCE.createBuilder(aoVar);
    }

    public static ao parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ao) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ao parseFrom(com.google.v.v vVar, de deVar) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ao parseFrom(com.google.v.z zVar) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ao parseFrom(com.google.v.z zVar, de deVar) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ao parseFrom(InputStream inputStream) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ao parseFrom(InputStream inputStream, de deVar) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ao parseFrom(ByteBuffer byteBuffer) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ao parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ao parseFrom(byte[] bArr) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ao parseFrom(byte[] bArr, de deVar) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
