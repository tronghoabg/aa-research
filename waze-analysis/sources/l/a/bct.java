package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bct extends com.google.v.du<bct, bcs> implements com.google.v.fj {
    private static final bct DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bct> PARSER = null;
    public static final int SHARE_DRIVE_INFORMATION_FIELD_NUMBER = 2;
    private int bitField0_;
    private bco shareDriveInformation_;

    static {
        bct bctVar = new bct();
        DEFAULT_INSTANCE = bctVar;
        com.google.v.du.registerDefaultInstance(bct.class, bctVar);
    }

    private bct() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShareDriveInformation() {
        this.shareDriveInformation_ = null;
        this.bitField0_ &= -2;
    }

    public static bct getDefaultInstance() {
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

    public static bcs newBuilder() {
        return (bcs) DEFAULT_INSTANCE.createBuilder();
    }

    public static bct parseDelimitedFrom(InputStream inputStream) {
        return (bct) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bct parseFrom(com.google.v.v vVar) {
        return (bct) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bct> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"bitField0_", "shareDriveInformation_"});
        }
        if (iOrdinal == 3) {
            return new bct();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bcs(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bct> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bct.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bco getShareDriveInformation() {
        bco bcoVar = this.shareDriveInformation_;
        return bcoVar == null ? bco.getDefaultInstance() : bcoVar;
    }

    public boolean hasShareDriveInformation() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bcs newBuilder(bct bctVar) {
        return (bcs) DEFAULT_INSTANCE.createBuilder(bctVar);
    }

    public static bct parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bct) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bct parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bct) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bct parseFrom(com.google.v.z zVar) {
        return (bct) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bct parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bct) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bct parseFrom(InputStream inputStream) {
        return (bct) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bct parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bct) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bct parseFrom(ByteBuffer byteBuffer) {
        return (bct) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bct parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bct) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bct parseFrom(byte[] bArr) {
        return (bct) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bct parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bct) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
