package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class go extends com.google.v.du<go, gn> implements gp {
    private static final go DEFAULT_INSTANCE;
    public static final int IS_ADS_FIELD_NUMBER = 4;
    public static final int IS_HIDDEN_FIELD_NUMBER = 3;
    public static final int MOOD_ID_FIELD_NUMBER = 1;
    public static final int MOOD_NAME_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<go> PARSER;
    private int bitField0_;
    private boolean isAds_;
    private boolean isHidden_;
    private int moodId_;
    private String moodName_ = "";

    static {
        go goVar = new go();
        DEFAULT_INSTANCE = goVar;
        com.google.v.du.registerDefaultInstance(go.class, goVar);
    }

    private go() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsAds() {
        this.bitField0_ &= -9;
        this.isAds_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsHidden() {
        this.bitField0_ &= -5;
        this.isHidden_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMoodId() {
        this.bitField0_ &= -2;
        this.moodId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMoodName() {
        this.bitField0_ &= -3;
        this.moodName_ = getDefaultInstance().getMoodName();
    }

    public static go getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static gn newBuilder() {
        return (gn) DEFAULT_INSTANCE.createBuilder();
    }

    public static go parseDelimitedFrom(InputStream inputStream) {
        return (go) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static go parseFrom(com.google.v.v vVar) {
        return (go) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<go> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsAds(boolean z) {
        this.bitField0_ |= 8;
        this.isAds_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsHidden(boolean z) {
        this.bitField0_ |= 4;
        this.isHidden_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMoodId(int i2) {
        this.bitField0_ |= 1;
        this.moodId_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMoodName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.moodName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMoodNameBytes(com.google.v.v vVar) {
        this.moodName_ = vVar.u();
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"bitField0_", "moodId_", "moodName_", "isHidden_", "isAds_"});
        }
        if (iOrdinal == 3) {
            return new go();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new gn(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<go> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (go.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getIsAds() {
        return this.isAds_;
    }

    public boolean getIsHidden() {
        return this.isHidden_;
    }

    public int getMoodId() {
        return this.moodId_;
    }

    public String getMoodName() {
        return this.moodName_;
    }

    public com.google.v.v getMoodNameBytes() {
        return com.google.v.v.s(this.moodName_);
    }

    public boolean hasIsAds() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasIsHidden() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasMoodId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasMoodName() {
        return (this.bitField0_ & 2) != 0;
    }

    public static gn newBuilder(go goVar) {
        return (gn) DEFAULT_INSTANCE.createBuilder(goVar);
    }

    public static go parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (go) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static go parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (go) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static go parseFrom(com.google.v.z zVar) {
        return (go) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static go parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (go) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static go parseFrom(InputStream inputStream) {
        return (go) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static go parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (go) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static go parseFrom(ByteBuffer byteBuffer) {
        return (go) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static go parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (go) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static go parseFrom(byte[] bArr) {
        return (go) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static go parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (go) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
