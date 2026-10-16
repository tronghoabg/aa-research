package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class axm extends com.google.v.du<axm, axk> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 2;
    public static final int DAYS_AHEAD_FIELD_NUMBER = 1;
    private static final axm DEFAULT_INSTANCE;
    public static final int FROM_LOCATION_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<axm> PARSER;
    private int action_;
    private int bitField0_;
    private long daysAhead_;
    private int fromLocation_;

    static {
        axm axmVar = new axm();
        DEFAULT_INSTANCE = axmVar;
        com.google.v.du.registerDefaultInstance(axm.class, axmVar);
    }

    private axm() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDaysAhead() {
        this.bitField0_ &= -2;
        this.daysAhead_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFromLocation() {
        this.fromLocation_ = 0;
    }

    public static axm getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static axk newBuilder() {
        return (axk) DEFAULT_INSTANCE.createBuilder();
    }

    public static axm parseDelimitedFrom(InputStream inputStream) {
        return (axm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static axm parseFrom(com.google.v.v vVar) {
        return (axm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<axm> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(axj axjVar) {
        this.action_ = axjVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDaysAhead(long j2) {
        this.bitField0_ |= 1;
        this.daysAhead_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromLocation(axl axlVar) {
        this.fromLocation_ = axlVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromLocationValue(int i2) {
        this.fromLocation_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002\f\u0003\f", new Object[]{"bitField0_", "daysAhead_", "action_", "fromLocation_"});
        }
        if (iOrdinal == 3) {
            return new axm();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new axk(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<axm> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (axm.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public axj getAction() {
        int i2 = this.action_;
        axj axjVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : axj.SAVE : axj.BACK : axj.ACTION_UNSPECIFIED;
        return axjVar == null ? axj.UNRECOGNIZED : axjVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public long getDaysAhead() {
        return this.daysAhead_;
    }

    public axl getFromLocation() {
        int i2 = this.fromLocation_;
        axl axlVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : axl.CHANGED : axl.CURRENT : axl.FROM_LOCATION_UNSPECIFIED;
        return axlVar == null ? axl.UNRECOGNIZED : axlVar;
    }

    public int getFromLocationValue() {
        return this.fromLocation_;
    }

    public boolean hasDaysAhead() {
        return (this.bitField0_ & 1) != 0;
    }

    public static axk newBuilder(axm axmVar) {
        return (axk) DEFAULT_INSTANCE.createBuilder(axmVar);
    }

    public static axm parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (axm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static axm parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (axm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static axm parseFrom(com.google.v.z zVar) {
        return (axm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static axm parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (axm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static axm parseFrom(InputStream inputStream) {
        return (axm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static axm parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (axm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static axm parseFrom(ByteBuffer byteBuffer) {
        return (axm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static axm parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (axm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static axm parseFrom(byte[] bArr) {
        return (axm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static axm parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (axm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
