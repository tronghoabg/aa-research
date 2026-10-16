package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class op extends com.google.v.du<op, oo> implements com.google.v.fj {
    public static final int CURACCURACY_FIELD_NUMBER = 2;
    public static final int CURCOMPASS_FIELD_NUMBER = 4;
    public static final int CURGYRO_FIELD_NUMBER = 5;
    public static final int CURHEADING_FIELD_NUMBER = 3;
    public static final int CURSATELLITES_FIELD_NUMBER = 1;
    private static final op DEFAULT_INSTANCE;
    public static final int LASTHEADING_FIELD_NUMBER = 7;
    public static final int LASTPOS_FIELD_NUMBER = 6;
    private static volatile com.google.v.fo<op> PARSER;
    private int bitField0_;
    private int curAccuracy_;
    private int curCompass_;
    private i.b.r curGyro_;
    private int curHeading_;
    private int curSatellites_;
    private int lastHeading_;
    private i.b.s lastPos_;

    static {
        op opVar = new op();
        DEFAULT_INSTANCE = opVar;
        com.google.v.du.registerDefaultInstance(op.class, opVar);
    }

    private op() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurAccuracy() {
        this.bitField0_ &= -3;
        this.curAccuracy_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurCompass() {
        this.bitField0_ &= -9;
        this.curCompass_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurGyro() {
        this.curGyro_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurHeading() {
        this.bitField0_ &= -5;
        this.curHeading_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurSatellites() {
        this.bitField0_ &= -2;
        this.curSatellites_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastHeading() {
        this.bitField0_ &= -65;
        this.lastHeading_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastPos() {
        this.lastPos_ = null;
        this.bitField0_ &= -33;
    }

    public static op getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCurGyro(i.b.r rVar) {
        Objects.requireNonNull(rVar);
        i.b.r rVar2 = this.curGyro_;
        if (rVar2 != null && rVar2 != i.b.r.getDefaultInstance()) {
            i.b.q qVarNewBuilder = i.b.r.newBuilder(rVar2);
            qVarNewBuilder.mergeFrom((i.b.q) rVar);
            rVar = qVarNewBuilder.buildPartial();
        }
        this.curGyro_ = rVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLastPos(i.b.s sVar) {
        Objects.requireNonNull(sVar);
        i.b.s sVar2 = this.lastPos_;
        if (sVar2 != null && sVar2 != i.b.s.getDefaultInstance()) {
            i.b.p pVarNewBuilder = i.b.s.newBuilder(sVar2);
            pVarNewBuilder.mergeFrom((i.b.p) sVar);
            sVar = pVarNewBuilder.buildPartial();
        }
        this.lastPos_ = sVar;
        this.bitField0_ |= 32;
    }

    public static oo newBuilder() {
        return (oo) DEFAULT_INSTANCE.createBuilder();
    }

    public static op parseDelimitedFrom(InputStream inputStream) {
        return (op) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static op parseFrom(com.google.v.v vVar) {
        return (op) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<op> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurAccuracy(int i2) {
        this.bitField0_ |= 2;
        this.curAccuracy_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurCompass(int i2) {
        this.bitField0_ |= 8;
        this.curCompass_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurGyro(i.b.r rVar) {
        Objects.requireNonNull(rVar);
        this.curGyro_ = rVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurHeading(int i2) {
        this.bitField0_ |= 4;
        this.curHeading_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurSatellites(int i2) {
        this.bitField0_ |= 1;
        this.curSatellites_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastHeading(int i2) {
        this.bitField0_ |= 64;
        this.lastHeading_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastPos(i.b.s sVar) {
        Objects.requireNonNull(sVar);
        this.lastPos_ = sVar;
        this.bitField0_ |= 32;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007င\u0006", new Object[]{"bitField0_", "curSatellites_", "curAccuracy_", "curHeading_", "curCompass_", "curGyro_", "lastPos_", "lastHeading_"});
        }
        if (iOrdinal == 3) {
            return new op();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new oo(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<op> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (op.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getCurAccuracy() {
        return this.curAccuracy_;
    }

    public int getCurCompass() {
        return this.curCompass_;
    }

    public i.b.r getCurGyro() {
        i.b.r rVar = this.curGyro_;
        return rVar == null ? i.b.r.getDefaultInstance() : rVar;
    }

    public int getCurHeading() {
        return this.curHeading_;
    }

    public int getCurSatellites() {
        return this.curSatellites_;
    }

    public int getLastHeading() {
        return this.lastHeading_;
    }

    public i.b.s getLastPos() {
        i.b.s sVar = this.lastPos_;
        return sVar == null ? i.b.s.getDefaultInstance() : sVar;
    }

    public boolean hasCurAccuracy() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasCurCompass() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasCurGyro() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasCurHeading() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasCurSatellites() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasLastHeading() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasLastPos() {
        return (this.bitField0_ & 32) != 0;
    }

    public static oo newBuilder(op opVar) {
        return (oo) DEFAULT_INSTANCE.createBuilder(opVar);
    }

    public static op parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (op) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static op parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (op) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static op parseFrom(com.google.v.z zVar) {
        return (op) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static op parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (op) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static op parseFrom(InputStream inputStream) {
        return (op) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static op parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (op) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static op parseFrom(ByteBuffer byteBuffer) {
        return (op) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static op parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (op) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static op parseFrom(byte[] bArr) {
        return (op) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static op parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (op) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
