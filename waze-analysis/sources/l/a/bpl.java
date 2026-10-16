package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bpl extends com.google.v.du<bpl, bpk> implements com.google.v.fj {
    public static final int ALERTER_INFO_FIELD_NUMBER = 1;
    private static final bpl DEFAULT_INSTANCE;
    public static final int DISTANCE_TO_REPORT_METERS_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<bpl> PARSER;
    private ck alerterInfo_;
    private int bitField0_;
    private long distanceToReportMeters_;

    static {
        bpl bplVar = new bpl();
        DEFAULT_INSTANCE = bplVar;
        com.google.v.du.registerDefaultInstance(bpl.class, bplVar);
    }

    private bpl() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlerterInfo() {
        this.alerterInfo_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDistanceToReportMeters() {
        this.bitField0_ &= -3;
        this.distanceToReportMeters_ = 0L;
    }

    public static bpl getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAlerterInfo(ck ckVar) {
        Objects.requireNonNull(ckVar);
        ck ckVar2 = this.alerterInfo_;
        if (ckVar2 != null && ckVar2 != ck.getDefaultInstance()) {
            cj cjVarNewBuilder = ck.newBuilder(ckVar2);
            cjVarNewBuilder.mergeFrom((cj) ckVar);
            ckVar = cjVarNewBuilder.buildPartial();
        }
        this.alerterInfo_ = ckVar;
        this.bitField0_ |= 1;
    }

    public static bpk newBuilder() {
        return (bpk) DEFAULT_INSTANCE.createBuilder();
    }

    public static bpl parseDelimitedFrom(InputStream inputStream) {
        return (bpl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bpl parseFrom(com.google.v.v vVar) {
        return (bpl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bpl> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlerterInfo(ck ckVar) {
        Objects.requireNonNull(ckVar);
        this.alerterInfo_ = ckVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDistanceToReportMeters(long j2) {
        this.bitField0_ |= 2;
        this.distanceToReportMeters_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"bitField0_", "alerterInfo_", "distanceToReportMeters_"});
        }
        if (iOrdinal == 3) {
            return new bpl();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bpk(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bpl> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bpl.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ck getAlerterInfo() {
        ck ckVar = this.alerterInfo_;
        return ckVar == null ? ck.getDefaultInstance() : ckVar;
    }

    public long getDistanceToReportMeters() {
        return this.distanceToReportMeters_;
    }

    public boolean hasAlerterInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasDistanceToReportMeters() {
        return (this.bitField0_ & 2) != 0;
    }

    public static bpk newBuilder(bpl bplVar) {
        return (bpk) DEFAULT_INSTANCE.createBuilder(bplVar);
    }

    public static bpl parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bpl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bpl parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bpl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bpl parseFrom(com.google.v.z zVar) {
        return (bpl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bpl parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bpl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bpl parseFrom(InputStream inputStream) {
        return (bpl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bpl parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bpl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bpl parseFrom(ByteBuffer byteBuffer) {
        return (bpl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bpl parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bpl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bpl parseFrom(byte[] bArr) {
        return (bpl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bpl parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bpl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
