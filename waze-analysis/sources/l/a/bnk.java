package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bnk extends com.google.v.du<bnk, bni> implements com.google.v.fj {
    private static final bnk DEFAULT_INSTANCE;
    public static final int LEVEL_FIELD_NUMBER = 2;
    public static final int MODE_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<bnk> PARSER = null;
    public static final int REASON_FIELD_NUMBER = 4;
    public static final int UGC_INFO_FIELD_NUMBER = 1;
    private int bitField0_;
    private int level_;
    private int mode_;
    private int reason_;
    private bnb ugcInfo_;

    static {
        bnk bnkVar = new bnk();
        DEFAULT_INSTANCE = bnkVar;
        com.google.v.du.registerDefaultInstance(bnk.class, bnkVar);
    }

    private bnk() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLevel() {
        this.level_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMode() {
        this.mode_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReason() {
        this.reason_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUgcInfo() {
        this.ugcInfo_ = null;
        this.bitField0_ &= -2;
    }

    public static bnk getDefaultInstance() {
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

    public static bni newBuilder() {
        return (bni) DEFAULT_INSTANCE.createBuilder();
    }

    public static bnk parseDelimitedFrom(InputStream inputStream) {
        return (bnk) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bnk parseFrom(com.google.v.v vVar) {
        return (bnk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bnk> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLevel(bny bnyVar) {
        this.level_ = bnyVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLevelValue(int i2) {
        this.level_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMode(bnz bnzVar) {
        this.mode_ = bnzVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModeValue(int i2) {
        this.mode_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReason(bnj bnjVar) {
        this.reason_ = bnjVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReasonValue(int i2) {
        this.reason_ = i2;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\f\u0004\f", new Object[]{"bitField0_", "ugcInfo_", "level_", "mode_", "reason_"});
        }
        if (iOrdinal == 3) {
            return new bnk();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bni(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bnk> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bnk.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bny getLevel() {
        bny bnyVarA = bny.a(this.level_);
        return bnyVarA == null ? bny.UNRECOGNIZED : bnyVarA;
    }

    public int getLevelValue() {
        return this.level_;
    }

    public bnz getMode() {
        bnz bnzVarA = bnz.a(this.mode_);
        return bnzVarA == null ? bnz.UNRECOGNIZED : bnzVarA;
    }

    public int getModeValue() {
        return this.mode_;
    }

    public bnj getReason() {
        int i2 = this.reason_;
        bnj bnjVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : bnj.CANCEL : bnj.CLOSE : bnj.REASON_UNSPECIFIED;
        return bnjVar == null ? bnj.UNRECOGNIZED : bnjVar;
    }

    public int getReasonValue() {
        return this.reason_;
    }

    public bnb getUgcInfo() {
        bnb bnbVar = this.ugcInfo_;
        return bnbVar == null ? bnb.getDefaultInstance() : bnbVar;
    }

    public boolean hasUgcInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bni newBuilder(bnk bnkVar) {
        return (bni) DEFAULT_INSTANCE.createBuilder(bnkVar);
    }

    public static bnk parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bnk) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bnk parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bnk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bnk parseFrom(com.google.v.z zVar) {
        return (bnk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bnk parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bnk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bnk parseFrom(InputStream inputStream) {
        return (bnk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bnk parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bnk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bnk parseFrom(ByteBuffer byteBuffer) {
        return (bnk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bnk parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bnk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bnk parseFrom(byte[] bArr) {
        return (bnk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bnk parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bnk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
