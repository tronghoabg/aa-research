package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class nu extends com.google.v.du<nu, nt> implements com.google.v.fj {
    public static final int CARPOOL_ID_FIELD_NUMBER = 1;
    private static final nu DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<nu> PARSER = null;
    public static final int VIA_POINT_ID_FIELD_NUMBER = 2;
    private int bitField0_;
    private String carpoolId_ = "";
    private String viaPointId_ = "";

    static {
        nu nuVar = new nu();
        DEFAULT_INSTANCE = nuVar;
        com.google.v.du.registerDefaultInstance(nu.class, nuVar);
    }

    private nu() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCarpoolId() {
        this.bitField0_ &= -2;
        this.carpoolId_ = getDefaultInstance().getCarpoolId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearViaPointId() {
        this.bitField0_ &= -3;
        this.viaPointId_ = getDefaultInstance().getViaPointId();
    }

    public static nu getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static nt newBuilder() {
        return (nt) DEFAULT_INSTANCE.createBuilder();
    }

    public static nu parseDelimitedFrom(InputStream inputStream) {
        return (nu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static nu parseFrom(com.google.v.v vVar) {
        return (nu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<nu> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCarpoolId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.carpoolId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCarpoolIdBytes(com.google.v.v vVar) {
        this.carpoolId_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setViaPointId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.viaPointId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setViaPointIdBytes(com.google.v.v vVar) {
        this.viaPointId_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "carpoolId_", "viaPointId_"});
        }
        if (iOrdinal == 3) {
            return new nu();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new nt(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<nu> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (nu.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getCarpoolId() {
        return this.carpoolId_;
    }

    public com.google.v.v getCarpoolIdBytes() {
        return com.google.v.v.s(this.carpoolId_);
    }

    public String getViaPointId() {
        return this.viaPointId_;
    }

    public com.google.v.v getViaPointIdBytes() {
        return com.google.v.v.s(this.viaPointId_);
    }

    public boolean hasCarpoolId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasViaPointId() {
        return (this.bitField0_ & 2) != 0;
    }

    public static nt newBuilder(nu nuVar) {
        return (nt) DEFAULT_INSTANCE.createBuilder(nuVar);
    }

    public static nu parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (nu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static nu parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (nu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static nu parseFrom(com.google.v.z zVar) {
        return (nu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static nu parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (nu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static nu parseFrom(InputStream inputStream) {
        return (nu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static nu parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (nu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static nu parseFrom(ByteBuffer byteBuffer) {
        return (nu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static nu parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (nu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static nu parseFrom(byte[] bArr) {
        return (nu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static nu parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (nu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
