package i.b;

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
public final class x extends du<x, w> implements fj {
    public static final int BOTTOM_LEFT_FIELD_NUMBER = 1;
    private static final x DEFAULT_INSTANCE;
    private static volatile fo<x> PARSER = null;
    public static final int TOP_RIGHT_FIELD_NUMBER = 2;
    private int bitField0_;
    private s bottomLeft_;
    private s topRight_;

    static {
        x xVar = new x();
        DEFAULT_INSTANCE = xVar;
        du.registerDefaultInstance(x.class, xVar);
    }

    private x() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBottomLeft() {
        this.bottomLeft_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTopRight() {
        this.topRight_ = null;
        this.bitField0_ &= -3;
    }

    public static x getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBottomLeft(s sVar) {
        Objects.requireNonNull(sVar);
        s sVar2 = this.bottomLeft_;
        if (sVar2 != null && sVar2 != s.getDefaultInstance()) {
            p pVarNewBuilder = s.newBuilder(sVar2);
            pVarNewBuilder.mergeFrom((p) sVar);
            sVar = pVarNewBuilder.buildPartial();
        }
        this.bottomLeft_ = sVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTopRight(s sVar) {
        Objects.requireNonNull(sVar);
        s sVar2 = this.topRight_;
        if (sVar2 != null && sVar2 != s.getDefaultInstance()) {
            p pVarNewBuilder = s.newBuilder(sVar2);
            pVarNewBuilder.mergeFrom((p) sVar);
            sVar = pVarNewBuilder.buildPartial();
        }
        this.topRight_ = sVar;
        this.bitField0_ |= 2;
    }

    public static w newBuilder() {
        return (w) DEFAULT_INSTANCE.createBuilder();
    }

    public static x parseDelimitedFrom(InputStream inputStream) {
        return (x) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static x parseFrom(com.google.v.v vVar) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<x> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBottomLeft(s sVar) {
        Objects.requireNonNull(sVar);
        this.bottomLeft_ = sVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTopRight(s sVar) {
        Objects.requireNonNull(sVar);
        this.topRight_ = sVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "bottomLeft_", "topRight_"});
        }
        if (iOrdinal == 3) {
            return new x();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new w(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<x> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (x.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public s getBottomLeft() {
        s sVar = this.bottomLeft_;
        return sVar == null ? s.getDefaultInstance() : sVar;
    }

    public s getTopRight() {
        s sVar = this.topRight_;
        return sVar == null ? s.getDefaultInstance() : sVar;
    }

    public boolean hasBottomLeft() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasTopRight() {
        return (this.bitField0_ & 2) != 0;
    }

    public static w newBuilder(x xVar) {
        return (w) DEFAULT_INSTANCE.createBuilder(xVar);
    }

    public static x parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (x) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static x parseFrom(com.google.v.v vVar, de deVar) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static x parseFrom(com.google.v.z zVar) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static x parseFrom(com.google.v.z zVar, de deVar) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static x parseFrom(InputStream inputStream) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static x parseFrom(InputStream inputStream, de deVar) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static x parseFrom(ByteBuffer byteBuffer) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static x parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static x parseFrom(byte[] bArr) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static x parseFrom(byte[] bArr, de deVar) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
