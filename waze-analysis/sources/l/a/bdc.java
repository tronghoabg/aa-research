package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bdc extends com.google.v.du<bdc, bdb> implements com.google.v.fj {
    private static final bdc DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bdc> PARSER = null;
    public static final int SCREEN_TYPE_FIELD_NUMBER = 1;
    public static final int SHARE_DRIVE_INFORMATION_FIELD_NUMBER = 2;
    private int bitField0_;
    private int screenType_;
    private bco shareDriveInformation_;

    static {
        bdc bdcVar = new bdc();
        DEFAULT_INSTANCE = bdcVar;
        com.google.v.du.registerDefaultInstance(bdc.class, bdcVar);
    }

    private bdc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScreenType() {
        this.screenType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShareDriveInformation() {
        this.shareDriveInformation_ = null;
        this.bitField0_ &= -2;
    }

    public static bdc getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeShareDriveInformation(bco bcoVar) {
        Objects.requireNonNull(bcoVar);
        bco bcoVar2 = this.shareDriveInformation_;
        if (bcoVar2 != null && bcoVar2 != bco.getDefaultInstance()) {
            bcn bcnVarNewBuilder = bco.newBuilder(bcoVar2);
            bcnVarNewBuilder.mergeFrom((bcn) bcoVar);
            bcoVar = bcnVarNewBuilder.buildPartial();
        }
        this.shareDriveInformation_ = bcoVar;
        this.bitField0_ |= 1;
    }

    public static bdb newBuilder() {
        return (bdb) DEFAULT_INSTANCE.createBuilder();
    }

    public static bdc parseDelimitedFrom(InputStream inputStream) {
        return (bdc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bdc parseFrom(com.google.v.v vVar) {
        return (bdc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bdc> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreenType(bdd bddVar) {
        this.screenType_ = bddVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreenTypeValue(int i2) {
        this.screenType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShareDriveInformation(bco bcoVar) {
        Objects.requireNonNull(bcoVar);
        this.shareDriveInformation_ = bcoVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000", new Object[]{"bitField0_", "screenType_", "shareDriveInformation_"});
        }
        if (iOrdinal == 3) {
            return new bdc();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bdb(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bdc> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bdc.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bdd getScreenType() {
        bdd bddVarA = bdd.a(this.screenType_);
        return bddVarA == null ? bdd.UNRECOGNIZED : bddVarA;
    }

    public int getScreenTypeValue() {
        return this.screenType_;
    }

    public bco getShareDriveInformation() {
        bco bcoVar = this.shareDriveInformation_;
        return bcoVar == null ? bco.getDefaultInstance() : bcoVar;
    }

    public boolean hasShareDriveInformation() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bdb newBuilder(bdc bdcVar) {
        return (bdb) DEFAULT_INSTANCE.createBuilder(bdcVar);
    }

    public static bdc parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bdc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bdc parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bdc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bdc parseFrom(com.google.v.z zVar) {
        return (bdc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bdc parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bdc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bdc parseFrom(InputStream inputStream) {
        return (bdc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bdc parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bdc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bdc parseFrom(ByteBuffer byteBuffer) {
        return (bdc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bdc parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bdc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bdc parseFrom(byte[] bArr) {
        return (bdc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bdc parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bdc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
