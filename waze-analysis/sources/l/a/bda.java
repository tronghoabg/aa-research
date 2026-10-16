package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bda extends com.google.v.du<bda, bcz> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 1;
    private static final bda DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bda> PARSER = null;
    public static final int SCREEN_TYPE_FIELD_NUMBER = 2;
    public static final int SHARE_DRIVE_INFORMATION_FIELD_NUMBER = 3;
    private int action_;
    private int bitField0_;
    private int screenType_;
    private bco shareDriveInformation_;

    static {
        bda bdaVar = new bda();
        DEFAULT_INSTANCE = bdaVar;
        com.google.v.du.registerDefaultInstance(bda.class, bdaVar);
    }

    private bda() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
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

    public static bda getDefaultInstance() {
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

    public static bcz newBuilder() {
        return (bcz) DEFAULT_INSTANCE.createBuilder();
    }

    public static bda parseDelimitedFrom(InputStream inputStream) {
        return (bda) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bda parseFrom(com.google.v.v vVar) {
        return (bda) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bda> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(bcy bcyVar) {
        this.action_ = bcyVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003ဉ\u0000", new Object[]{"bitField0_", "action_", "screenType_", "shareDriveInformation_"});
        }
        if (iOrdinal == 3) {
            return new bda();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bcz(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bda> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bda.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bcy getAction() {
        int i2 = this.action_;
        bcy bcyVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? null : bcy.EDIT : bcy.CLOSE : bcy.VIEW_DRIVE : bcy.CANCEL : bcy.SHARE_DRIVE : bcy.ACTION_UNSPECIFIED;
        return bcyVar == null ? bcy.UNRECOGNIZED : bcyVar;
    }

    public int getActionValue() {
        return this.action_;
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

    public static bcz newBuilder(bda bdaVar) {
        return (bcz) DEFAULT_INSTANCE.createBuilder(bdaVar);
    }

    public static bda parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bda) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bda parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bda) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bda parseFrom(com.google.v.z zVar) {
        return (bda) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bda parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bda) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bda parseFrom(InputStream inputStream) {
        return (bda) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bda parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bda) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bda parseFrom(ByteBuffer byteBuffer) {
        return (bda) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bda parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bda) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bda parseFrom(byte[] bArr) {
        return (bda) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bda parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bda) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
