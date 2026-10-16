package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bsc extends com.google.v.du<bsc, bsa> implements com.google.v.fj {
    private static final bsc DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bsc> PARSER = null;
    public static final int REASON_NOT_SHOWN_FIELD_NUMBER = 2;
    public static final int WAZE_ASKS_INFO_FIELD_NUMBER = 1;
    private int bitField0_;
    private int reasonNotShown_;
    private brz wazeAsksInfo_;

    static {
        bsc bscVar = new bsc();
        DEFAULT_INSTANCE = bscVar;
        com.google.v.du.registerDefaultInstance(bsc.class, bscVar);
    }

    private bsc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReasonNotShown() {
        this.reasonNotShown_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWazeAsksInfo() {
        this.wazeAsksInfo_ = null;
        this.bitField0_ &= -2;
    }

    public static bsc getDefaultInstance() {
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

    public static bsa newBuilder() {
        return (bsa) DEFAULT_INSTANCE.createBuilder();
    }

    public static bsc parseDelimitedFrom(InputStream inputStream) {
        return (bsc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bsc parseFrom(com.google.v.v vVar) {
        return (bsc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bsc> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReasonNotShown(bsb bsbVar) {
        this.reasonNotShown_ = bsbVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReasonNotShownValue(int i2) {
        this.reasonNotShown_ = i2;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f", new Object[]{"bitField0_", "wazeAsksInfo_", "reasonNotShown_"});
        }
        if (iOrdinal == 3) {
            return new bsc();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bsa(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bsc> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bsc.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bsb getReasonNotShown() {
        int i2 = this.reasonNotShown_;
        bsb bsbVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? null : bsb.NO_QUESTION_PROVIDED : bsb.ALERTER_ALREADY_SHOWN : bsb.QUESTION_IS_CAPPED : bsb.ANOTHER_WAZE_ASKS_SHOWN : bsb.REASON_NOT_SHOWN_UNSPECIFIED;
        return bsbVar == null ? bsb.UNRECOGNIZED : bsbVar;
    }

    public int getReasonNotShownValue() {
        return this.reasonNotShown_;
    }

    public brz getWazeAsksInfo() {
        brz brzVar = this.wazeAsksInfo_;
        return brzVar == null ? brz.getDefaultInstance() : brzVar;
    }

    public boolean hasWazeAsksInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bsa newBuilder(bsc bscVar) {
        return (bsa) DEFAULT_INSTANCE.createBuilder(bscVar);
    }

    public static bsc parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bsc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bsc parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bsc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bsc parseFrom(com.google.v.z zVar) {
        return (bsc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bsc parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bsc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bsc parseFrom(InputStream inputStream) {
        return (bsc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bsc parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bsc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bsc parseFrom(ByteBuffer byteBuffer) {
        return (bsc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bsc parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bsc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bsc parseFrom(byte[] bArr) {
        return (bsc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bsc parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bsc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
