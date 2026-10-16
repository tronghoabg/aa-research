package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class rl extends com.google.v.du<rl, rk> implements com.google.v.fj {
    private static final rl DEFAULT_INSTANCE;
    public static final int DESTINATION_REPORTING_INFO_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<rl> PARSER;
    private int bitField0_;
    private rg destinationReportingInfo_;

    static {
        rl rlVar = new rl();
        DEFAULT_INSTANCE = rlVar;
        com.google.v.du.registerDefaultInstance(rl.class, rlVar);
    }

    private rl() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestinationReportingInfo() {
        this.destinationReportingInfo_ = null;
        this.bitField0_ &= -2;
    }

    public static rl getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDestinationReportingInfo(rg rgVar) {
        Objects.requireNonNull(rgVar);
        rg rgVar2 = this.destinationReportingInfo_;
        if (rgVar2 != null && rgVar2 != rg.getDefaultInstance()) {
            qw qwVarNewBuilder = rg.newBuilder(rgVar2);
            qwVarNewBuilder.mergeFrom((qw) rgVar);
            rgVar = qwVarNewBuilder.buildPartial();
        }
        this.destinationReportingInfo_ = rgVar;
        this.bitField0_ |= 1;
    }

    public static rk newBuilder() {
        return (rk) DEFAULT_INSTANCE.createBuilder();
    }

    public static rl parseDelimitedFrom(InputStream inputStream) {
        return (rl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static rl parseFrom(com.google.v.v vVar) {
        return (rl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<rl> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestinationReportingInfo(rg rgVar) {
        Objects.requireNonNull(rgVar);
        this.destinationReportingInfo_ = rgVar;
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "destinationReportingInfo_"});
        }
        if (iOrdinal == 3) {
            return new rl();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new rk(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<rl> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (rl.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public rg getDestinationReportingInfo() {
        rg rgVar = this.destinationReportingInfo_;
        return rgVar == null ? rg.getDefaultInstance() : rgVar;
    }

    public boolean hasDestinationReportingInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public static rk newBuilder(rl rlVar) {
        return (rk) DEFAULT_INSTANCE.createBuilder(rlVar);
    }

    public static rl parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (rl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static rl parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (rl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static rl parseFrom(com.google.v.z zVar) {
        return (rl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static rl parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (rl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static rl parseFrom(InputStream inputStream) {
        return (rl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static rl parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (rl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static rl parseFrom(ByteBuffer byteBuffer) {
        return (rl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static rl parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (rl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static rl parseFrom(byte[] bArr) {
        return (rl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static rl parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (rl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
