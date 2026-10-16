package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bhu extends com.google.v.du<bhu, bhs> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 2;
    private static final bhu DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bhu> PARSER = null;
    public static final int SURFACED_LOCATION_INFO_FIELD_NUMBER = 1;
    private int action_;
    private int bitField0_;
    private bhn surfacedLocationInfo_;

    static {
        bhu bhuVar = new bhu();
        DEFAULT_INSTANCE = bhuVar;
        com.google.v.du.registerDefaultInstance(bhu.class, bhuVar);
    }

    private bhu() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSurfacedLocationInfo() {
        this.surfacedLocationInfo_ = null;
        this.bitField0_ &= -2;
    }

    public static bhu getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSurfacedLocationInfo(bhn bhnVar) {
        Objects.requireNonNull(bhnVar);
        bhn bhnVar2 = this.surfacedLocationInfo_;
        if (bhnVar2 != null && bhnVar2 != bhn.getDefaultInstance()) {
            bhm bhmVarNewBuilder = bhn.newBuilder(bhnVar2);
            bhmVarNewBuilder.mergeFrom((bhm) bhnVar);
            bhnVar = bhmVarNewBuilder.buildPartial();
        }
        this.surfacedLocationInfo_ = bhnVar;
        this.bitField0_ |= 1;
    }

    public static bhs newBuilder() {
        return (bhs) DEFAULT_INSTANCE.createBuilder();
    }

    public static bhu parseDelimitedFrom(InputStream inputStream) {
        return (bhu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bhu parseFrom(com.google.v.v vVar) {
        return (bhu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bhu> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(bht bhtVar) {
        this.action_ = bhtVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSurfacedLocationInfo(bhn bhnVar) {
        Objects.requireNonNull(bhnVar);
        this.surfacedLocationInfo_ = bhnVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f", new Object[]{"bitField0_", "surfacedLocationInfo_", "action_"});
        }
        if (iOrdinal == 3) {
            return new bhu();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bhs(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bhu> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bhu.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bht getAction() {
        int i2 = this.action_;
        bht bhtVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : bht.TAKEOVER_ACTION_DRIVE_THERE : bht.TAKEOVER_ACTION_INFO : bht.TAKEOVER_ACTION_UNSPECIFIED;
        return bhtVar == null ? bht.UNRECOGNIZED : bhtVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public bhn getSurfacedLocationInfo() {
        bhn bhnVar = this.surfacedLocationInfo_;
        return bhnVar == null ? bhn.getDefaultInstance() : bhnVar;
    }

    public boolean hasSurfacedLocationInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bhs newBuilder(bhu bhuVar) {
        return (bhs) DEFAULT_INSTANCE.createBuilder(bhuVar);
    }

    public static bhu parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bhu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bhu parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bhu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bhu parseFrom(com.google.v.z zVar) {
        return (bhu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bhu parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bhu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bhu parseFrom(InputStream inputStream) {
        return (bhu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bhu parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bhu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bhu parseFrom(ByteBuffer byteBuffer) {
        return (bhu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bhu parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bhu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bhu parseFrom(byte[] bArr) {
        return (bhu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bhu parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bhu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
