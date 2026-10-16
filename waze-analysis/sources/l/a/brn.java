package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class brn extends com.google.v.du<brn, brl> implements com.google.v.fj {
    private static final brn DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<brn> PARSER = null;
    public static final int REASON_FIELD_NUMBER = 2;
    public static final int WAZE_ASKS_INFO_FIELD_NUMBER = 1;
    private int bitField0_;
    private int reason_;
    private brz wazeAsksInfo_;

    static {
        brn brnVar = new brn();
        DEFAULT_INSTANCE = brnVar;
        com.google.v.du.registerDefaultInstance(brn.class, brnVar);
    }

    private brn() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReason() {
        this.reason_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWazeAsksInfo() {
        this.wazeAsksInfo_ = null;
        this.bitField0_ &= -2;
    }

    public static brn getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWazeAsksInfo(brz brzVar) {
        Objects.requireNonNull(brzVar);
        brz brzVar2 = this.wazeAsksInfo_;
        if (brzVar2 != null && brzVar2 != brz.getDefaultInstance()) {
            bro broVarNewBuilder = brz.newBuilder(brzVar2);
            broVarNewBuilder.mergeFrom((bro) brzVar);
            brzVar = broVarNewBuilder.buildPartial();
        }
        this.wazeAsksInfo_ = brzVar;
        this.bitField0_ |= 1;
    }

    public static brl newBuilder() {
        return (brl) DEFAULT_INSTANCE.createBuilder();
    }

    public static brn parseDelimitedFrom(InputStream inputStream) {
        return (brn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static brn parseFrom(com.google.v.v vVar) {
        return (brn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<brn> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReason(brm brmVar) {
        this.reason_ = brmVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReasonValue(int i2) {
        this.reason_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWazeAsksInfo(brz brzVar) {
        Objects.requireNonNull(brzVar);
        this.wazeAsksInfo_ = brzVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f", new Object[]{"bitField0_", "wazeAsksInfo_", "reason_"});
        }
        if (iOrdinal == 3) {
            return new brn();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new brl(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<brn> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (brn.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public brm getReason() {
        int i2 = this.reason_;
        brm brmVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : brm.TIMER_EXPIRED : brm.CLOSE : brm.REASON_UNSPECIFIED;
        return brmVar == null ? brm.UNRECOGNIZED : brmVar;
    }

    public int getReasonValue() {
        return this.reason_;
    }

    public brz getWazeAsksInfo() {
        brz brzVar = this.wazeAsksInfo_;
        return brzVar == null ? brz.getDefaultInstance() : brzVar;
    }

    public boolean hasWazeAsksInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public static brl newBuilder(brn brnVar) {
        return (brl) DEFAULT_INSTANCE.createBuilder(brnVar);
    }

    public static brn parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (brn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static brn parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (brn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static brn parseFrom(com.google.v.z zVar) {
        return (brn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static brn parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (brn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static brn parseFrom(InputStream inputStream) {
        return (brn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static brn parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (brn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static brn parseFrom(ByteBuffer byteBuffer) {
        return (brn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static brn parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (brn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static brn parseFrom(byte[] bArr) {
        return (brn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static brn parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (brn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
