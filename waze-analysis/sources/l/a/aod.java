package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aod extends com.google.v.du<aod, aoc> implements com.google.v.fj {
    public static final int ALERTER_INFO_FIELD_NUMBER = 1;
    private static final aod DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<aod> PARSER;
    private ck alerterInfo_;
    private int bitField0_;

    static {
        aod aodVar = new aod();
        DEFAULT_INSTANCE = aodVar;
        com.google.v.du.registerDefaultInstance(aod.class, aodVar);
    }

    private aod() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlerterInfo() {
        this.alerterInfo_ = null;
        this.bitField0_ &= -2;
    }

    public static aod getDefaultInstance() {
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

    public static aoc newBuilder() {
        return (aoc) DEFAULT_INSTANCE.createBuilder();
    }

    public static aod parseDelimitedFrom(InputStream inputStream) {
        return (aod) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aod parseFrom(com.google.v.v vVar) {
        return (aod) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aod> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlerterInfo(ck ckVar) {
        Objects.requireNonNull(ckVar);
        this.alerterInfo_ = ckVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "alerterInfo_"});
        }
        if (iOrdinal == 3) {
            return new aod();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aoc(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aod> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aod.class) {
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

    public boolean hasAlerterInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public static aoc newBuilder(aod aodVar) {
        return (aoc) DEFAULT_INSTANCE.createBuilder(aodVar);
    }

    public static aod parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aod) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aod parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aod) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aod parseFrom(com.google.v.z zVar) {
        return (aod) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aod parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aod) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aod parseFrom(InputStream inputStream) {
        return (aod) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aod parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aod) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aod parseFrom(ByteBuffer byteBuffer) {
        return (aod) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aod parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aod) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aod parseFrom(byte[] bArr) {
        return (aod) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aod parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aod) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
