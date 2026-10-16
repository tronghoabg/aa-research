package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class pp extends com.google.v.du<pp, po> implements com.google.v.fj {
    private static final pp DEFAULT_INSTANCE;
    public static final int DURATION_MS_FIELD_NUMBER = 1;
    public static final int END_COORDINATES_FIELD_NUMBER = 3;
    public static final int ERROR_DISTANCE_METERS_FIELD_NUMBER = 4;
    private static volatile com.google.v.fo<pp> PARSER = null;
    public static final int PASSED_THROUGH_TUNNEL_FIELD_NUMBER = 6;
    public static final int START_COORDINATES_FIELD_NUMBER = 2;
    public static final int WAIT_MS_FIELD_NUMBER = 5;
    private int bitField0_;
    private long durationMs_;
    private afx endCoordinates_;
    private long errorDistanceMeters_;
    private boolean passedThroughTunnel_;
    private afx startCoordinates_;
    private long waitMs_;

    static {
        pp ppVar = new pp();
        DEFAULT_INSTANCE = ppVar;
        com.google.v.du.registerDefaultInstance(pp.class, ppVar);
    }

    private pp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDurationMs() {
        this.bitField0_ &= -2;
        this.durationMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndCoordinates() {
        this.endCoordinates_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearErrorDistanceMeters() {
        this.bitField0_ &= -9;
        this.errorDistanceMeters_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPassedThroughTunnel() {
        this.bitField0_ &= -33;
        this.passedThroughTunnel_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartCoordinates() {
        this.startCoordinates_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWaitMs() {
        this.bitField0_ &= -17;
        this.waitMs_ = 0L;
    }

    public static pp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEndCoordinates(afx afxVar) {
        Objects.requireNonNull(afxVar);
        afx afxVar2 = this.endCoordinates_;
        if (afxVar2 != null && afxVar2 != afx.getDefaultInstance()) {
            afw afwVarNewBuilder = afx.newBuilder(afxVar2);
            afwVarNewBuilder.mergeFrom((afw) afxVar);
            afxVar = afwVarNewBuilder.buildPartial();
        }
        this.endCoordinates_ = afxVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStartCoordinates(afx afxVar) {
        Objects.requireNonNull(afxVar);
        afx afxVar2 = this.startCoordinates_;
        if (afxVar2 != null && afxVar2 != afx.getDefaultInstance()) {
            afw afwVarNewBuilder = afx.newBuilder(afxVar2);
            afwVarNewBuilder.mergeFrom((afw) afxVar);
            afxVar = afwVarNewBuilder.buildPartial();
        }
        this.startCoordinates_ = afxVar;
        this.bitField0_ |= 2;
    }

    public static po newBuilder() {
        return (po) DEFAULT_INSTANCE.createBuilder();
    }

    public static pp parseDelimitedFrom(InputStream inputStream) {
        return (pp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static pp parseFrom(com.google.v.v vVar) {
        return (pp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<pp> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDurationMs(long j2) {
        this.bitField0_ |= 1;
        this.durationMs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndCoordinates(afx afxVar) {
        Objects.requireNonNull(afxVar);
        this.endCoordinates_ = afxVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorDistanceMeters(long j2) {
        this.bitField0_ |= 8;
        this.errorDistanceMeters_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPassedThroughTunnel(boolean z) {
        this.bitField0_ |= 32;
        this.passedThroughTunnel_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartCoordinates(afx afxVar) {
        Objects.requireNonNull(afxVar);
        this.startCoordinates_ = afxVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWaitMs(long j2) {
        this.bitField0_ |= 16;
        this.waitMs_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဇ\u0005", new Object[]{"bitField0_", "durationMs_", "startCoordinates_", "endCoordinates_", "errorDistanceMeters_", "waitMs_", "passedThroughTunnel_"});
        }
        if (iOrdinal == 3) {
            return new pp();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new po(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<pp> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (pp.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getDurationMs() {
        return this.durationMs_;
    }

    public afx getEndCoordinates() {
        afx afxVar = this.endCoordinates_;
        return afxVar == null ? afx.getDefaultInstance() : afxVar;
    }

    public long getErrorDistanceMeters() {
        return this.errorDistanceMeters_;
    }

    public boolean getPassedThroughTunnel() {
        return this.passedThroughTunnel_;
    }

    public afx getStartCoordinates() {
        afx afxVar = this.startCoordinates_;
        return afxVar == null ? afx.getDefaultInstance() : afxVar;
    }

    public long getWaitMs() {
        return this.waitMs_;
    }

    public boolean hasDurationMs() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasEndCoordinates() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasErrorDistanceMeters() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasPassedThroughTunnel() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasStartCoordinates() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasWaitMs() {
        return (this.bitField0_ & 16) != 0;
    }

    public static po newBuilder(pp ppVar) {
        return (po) DEFAULT_INSTANCE.createBuilder(ppVar);
    }

    public static pp parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (pp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static pp parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (pp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static pp parseFrom(com.google.v.z zVar) {
        return (pp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static pp parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (pp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static pp parseFrom(InputStream inputStream) {
        return (pp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static pp parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (pp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static pp parseFrom(ByteBuffer byteBuffer) {
        return (pp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static pp parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (pp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static pp parseFrom(byte[] bArr) {
        return (pp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static pp parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (pp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
