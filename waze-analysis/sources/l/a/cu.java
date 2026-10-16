package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class cu extends com.google.v.du<cu, cs> implements com.google.v.fj {
    private static final cu DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<cu> PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int WAZE_ASKS_INFO_FIELD_NUMBER = 1;
    private int bitField0_;
    private int title_;
    private brz wazeAsksInfo_;

    static {
        cu cuVar = new cu();
        DEFAULT_INSTANCE = cuVar;
        com.google.v.du.registerDefaultInstance(cu.class, cuVar);
    }

    private cu() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWazeAsksInfo() {
        this.wazeAsksInfo_ = null;
        this.bitField0_ &= -2;
    }

    public static cu getDefaultInstance() {
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

    public static cs newBuilder() {
        return (cs) DEFAULT_INSTANCE.createBuilder();
    }

    public static cu parseDelimitedFrom(InputStream inputStream) {
        return (cu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cu parseFrom(com.google.v.v vVar) {
        return (cu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<cu> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitle(ct ctVar) {
        this.title_ = ctVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleValue(int i2) {
        this.title_ = i2;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f", new Object[]{"bitField0_", "wazeAsksInfo_", "title_"});
        }
        if (iOrdinal == 3) {
            return new cu();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new cs(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<cu> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (cu.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ct getTitle() {
        int i2 = this.title_;
        ct ctVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : ct.THANKS_FOR_FEEDBACK : ct.HIDDEN_CURRENT_DRIVE : ct.TITLE_UNSPECIFIED;
        return ctVar == null ? ct.UNRECOGNIZED : ctVar;
    }

    public int getTitleValue() {
        return this.title_;
    }

    public brz getWazeAsksInfo() {
        brz brzVar = this.wazeAsksInfo_;
        return brzVar == null ? brz.getDefaultInstance() : brzVar;
    }

    public boolean hasWazeAsksInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public static cs newBuilder(cu cuVar) {
        return (cs) DEFAULT_INSTANCE.createBuilder(cuVar);
    }

    public static cu parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cu parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (cu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cu parseFrom(com.google.v.z zVar) {
        return (cu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cu parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (cu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static cu parseFrom(InputStream inputStream) {
        return (cu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cu parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cu parseFrom(ByteBuffer byteBuffer) {
        return (cu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cu parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (cu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cu parseFrom(byte[] bArr) {
        return (cu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cu parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (cu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
