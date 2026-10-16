package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ov extends com.google.v.du<ov, ot> implements com.google.v.fj {
    private static final ov DEFAULT_INSTANCE;
    public static final int LOCK_WINDOW_FIELD_NUMBER = 4;
    private static volatile com.google.v.fo<ov> PARSER = null;
    public static final int REPORTED_COARSE_VALUE_FIELD_NUMBER = 2;
    public static final int REPORTED_CONVERSION_VALUE_FIELD_NUMBER = 3;
    public static final int SUCCESS_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean lockWindow_;
    private int reportedCoarseValue_;
    private long reportedConversionValue_;
    private boolean success_;

    static {
        ov ovVar = new ov();
        DEFAULT_INSTANCE = ovVar;
        com.google.v.du.registerDefaultInstance(ov.class, ovVar);
    }

    private ov() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLockWindow() {
        this.bitField0_ &= -5;
        this.lockWindow_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReportedCoarseValue() {
        this.reportedCoarseValue_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReportedConversionValue() {
        this.bitField0_ &= -3;
        this.reportedConversionValue_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSuccess() {
        this.bitField0_ &= -2;
        this.success_ = false;
    }

    public static ov getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ot newBuilder() {
        return (ot) DEFAULT_INSTANCE.createBuilder();
    }

    public static ov parseDelimitedFrom(InputStream inputStream) {
        return (ov) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ov parseFrom(com.google.v.v vVar) {
        return (ov) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ov> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLockWindow(boolean z) {
        this.bitField0_ |= 4;
        this.lockWindow_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportedCoarseValue(ou ouVar) {
        this.reportedCoarseValue_ = ouVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportedCoarseValueValue(int i2) {
        this.reportedCoarseValue_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportedConversionValue(long j2) {
        this.bitField0_ |= 2;
        this.reportedConversionValue_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuccess(boolean z) {
        this.bitField0_ |= 1;
        this.success_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002\f\u0003ဂ\u0001\u0004ဇ\u0002", new Object[]{"bitField0_", "success_", "reportedCoarseValue_", "reportedConversionValue_", "lockWindow_"});
        }
        if (iOrdinal == 3) {
            return new ov();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ot(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ov> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ov.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getLockWindow() {
        return this.lockWindow_;
    }

    public ou getReportedCoarseValue() {
        int i2 = this.reportedCoarseValue_;
        ou ouVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : ou.HIGH : ou.MEDIUM : ou.LOW : ou.REPORTED_COARSE_VALUE_UNSPECIFIED;
        return ouVar == null ? ou.UNRECOGNIZED : ouVar;
    }

    public int getReportedCoarseValueValue() {
        return this.reportedCoarseValue_;
    }

    public long getReportedConversionValue() {
        return this.reportedConversionValue_;
    }

    public boolean getSuccess() {
        return this.success_;
    }

    public boolean hasLockWindow() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasReportedConversionValue() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSuccess() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ot newBuilder(ov ovVar) {
        return (ot) DEFAULT_INSTANCE.createBuilder(ovVar);
    }

    public static ov parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ov) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ov parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ov) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ov parseFrom(com.google.v.z zVar) {
        return (ov) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ov parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ov) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ov parseFrom(InputStream inputStream) {
        return (ov) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ov parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ov) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ov parseFrom(ByteBuffer byteBuffer) {
        return (ov) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ov parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ov) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ov parseFrom(byte[] bArr) {
        return (ov) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ov parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ov) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
