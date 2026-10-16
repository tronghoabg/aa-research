package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bms extends com.google.v.du<bms, bmr> implements com.google.v.fj {
    private static final bms DEFAULT_INSTANCE;
    public static final int LOCK_SCREEN_MODE_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<bms> PARSER = null;
    public static final int UGC_INFO_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean lockScreenMode_;
    private bnb ugcInfo_;

    static {
        bms bmsVar = new bms();
        DEFAULT_INSTANCE = bmsVar;
        com.google.v.du.registerDefaultInstance(bms.class, bmsVar);
    }

    private bms() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLockScreenMode() {
        this.bitField0_ &= -3;
        this.lockScreenMode_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUgcInfo() {
        this.ugcInfo_ = null;
        this.bitField0_ &= -2;
    }

    public static bms getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUgcInfo(bnb bnbVar) {
        Objects.requireNonNull(bnbVar);
        bnb bnbVar2 = this.ugcInfo_;
        if (bnbVar2 != null && bnbVar2 != bnb.getDefaultInstance()) {
            bna bnaVarNewBuilder = bnb.newBuilder(bnbVar2);
            bnaVarNewBuilder.mergeFrom((bna) bnbVar);
            bnbVar = bnaVarNewBuilder.buildPartial();
        }
        this.ugcInfo_ = bnbVar;
        this.bitField0_ |= 1;
    }

    public static bmr newBuilder() {
        return (bmr) DEFAULT_INSTANCE.createBuilder();
    }

    public static bms parseDelimitedFrom(InputStream inputStream) {
        return (bms) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bms parseFrom(com.google.v.v vVar) {
        return (bms) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bms> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLockScreenMode(boolean z) {
        this.bitField0_ |= 2;
        this.lockScreenMode_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUgcInfo(bnb bnbVar) {
        Objects.requireNonNull(bnbVar);
        this.ugcInfo_ = bnbVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001", new Object[]{"bitField0_", "ugcInfo_", "lockScreenMode_"});
        }
        if (iOrdinal == 3) {
            return new bms();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bmr(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bms> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bms.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getLockScreenMode() {
        return this.lockScreenMode_;
    }

    public bnb getUgcInfo() {
        bnb bnbVar = this.ugcInfo_;
        return bnbVar == null ? bnb.getDefaultInstance() : bnbVar;
    }

    public boolean hasLockScreenMode() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasUgcInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bmr newBuilder(bms bmsVar) {
        return (bmr) DEFAULT_INSTANCE.createBuilder(bmsVar);
    }

    public static bms parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bms) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bms parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bms) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bms parseFrom(com.google.v.z zVar) {
        return (bms) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bms parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bms) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bms parseFrom(InputStream inputStream) {
        return (bms) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bms parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bms) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bms parseFrom(ByteBuffer byteBuffer) {
        return (bms) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bms parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bms) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bms parseFrom(byte[] bArr) {
        return (bms) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bms parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bms) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
