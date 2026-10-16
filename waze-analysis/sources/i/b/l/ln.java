package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ln extends com.google.v.du<ln, lm> implements com.google.v.fj {
    private static final ln DEFAULT_INSTANCE;
    public static final int IS_PLANNED_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 4;
    private static volatile com.google.v.fo<ln> PARSER = null;
    public static final int PLANNED_END_TIME_EPOCH_MSEC_FIELD_NUMBER = 3;
    public static final int PLANNED_START_TIME_EPOCH_MSEC_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean isPlanned_;
    private String name_ = "";
    private long plannedEndTimeEpochMsec_;
    private long plannedStartTimeEpochMsec_;

    static {
        ln lnVar = new ln();
        DEFAULT_INSTANCE = lnVar;
        com.google.v.du.registerDefaultInstance(ln.class, lnVar);
    }

    private ln() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsPlanned() {
        this.bitField0_ &= -2;
        this.isPlanned_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -9;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlannedEndTimeEpochMsec() {
        this.bitField0_ &= -5;
        this.plannedEndTimeEpochMsec_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlannedStartTimeEpochMsec() {
        this.bitField0_ &= -3;
        this.plannedStartTimeEpochMsec_ = 0L;
    }

    public static ln getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static lm newBuilder() {
        return (lm) DEFAULT_INSTANCE.createBuilder();
    }

    public static ln parseDelimitedFrom(InputStream inputStream) {
        return (ln) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ln parseFrom(com.google.v.v vVar) {
        return (ln) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ln> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsPlanned(boolean z) {
        this.bitField0_ |= 1;
        this.isPlanned_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(com.google.v.v vVar) {
        this.name_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlannedEndTimeEpochMsec(long j2) {
        this.bitField0_ |= 4;
        this.plannedEndTimeEpochMsec_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlannedStartTimeEpochMsec(long j2) {
        this.bitField0_ |= 2;
        this.plannedStartTimeEpochMsec_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "isPlanned_", "plannedStartTimeEpochMsec_", "plannedEndTimeEpochMsec_", "name_"});
        }
        if (iOrdinal == 3) {
            return new ln();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new lm(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ln> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ln.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getIsPlanned() {
        return this.isPlanned_;
    }

    public String getName() {
        return this.name_;
    }

    public com.google.v.v getNameBytes() {
        return com.google.v.v.s(this.name_);
    }

    public long getPlannedEndTimeEpochMsec() {
        return this.plannedEndTimeEpochMsec_;
    }

    public long getPlannedStartTimeEpochMsec() {
        return this.plannedStartTimeEpochMsec_;
    }

    public boolean hasIsPlanned() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasName() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasPlannedEndTimeEpochMsec() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasPlannedStartTimeEpochMsec() {
        return (this.bitField0_ & 2) != 0;
    }

    public static lm newBuilder(ln lnVar) {
        return (lm) DEFAULT_INSTANCE.createBuilder(lnVar);
    }

    public static ln parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ln) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ln parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ln) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ln parseFrom(com.google.v.z zVar) {
        return (ln) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ln parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ln) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ln parseFrom(InputStream inputStream) {
        return (ln) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ln parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ln) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ln parseFrom(ByteBuffer byteBuffer) {
        return (ln) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ln parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ln) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ln parseFrom(byte[] bArr) {
        return (ln) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ln parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ln) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
