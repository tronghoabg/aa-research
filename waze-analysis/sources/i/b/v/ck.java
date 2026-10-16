package i.b.v;

import androidx.camera.video.AudioStats;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ck extends com.google.v.du<ck, cj> implements cx {
    private static final ck DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1001;
    private static volatile com.google.v.fo<ck> PARSER = null;
    public static final int WALKINGDISTANCE_FIELD_NUMBER = 1002;
    private int bitField0_;
    private String id_ = "";
    private double walkingDistance_;

    static {
        ck ckVar = new ck();
        DEFAULT_INSTANCE = ckVar;
        com.google.v.du.registerDefaultInstance(ck.class, ckVar);
    }

    private ck() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.bitField0_ &= -2;
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWalkingDistance() {
        this.bitField0_ &= -3;
        this.walkingDistance_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    public static ck getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static cj newBuilder() {
        return (cj) DEFAULT_INSTANCE.createBuilder();
    }

    public static ck parseDelimitedFrom(InputStream inputStream) {
        return (ck) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ck parseFrom(com.google.v.v vVar) {
        return (ck) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ck> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(com.google.v.v vVar) {
        this.id_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWalkingDistance(double d2) {
        this.bitField0_ |= 2;
        this.walkingDistance_ = d2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001ϩϪ\u0002\u0000\u0000\u0000ϩဈ\u0000Ϫက\u0001", new Object[]{"bitField0_", "id_", "walkingDistance_"});
        }
        if (iOrdinal == 3) {
            return new ck();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new cj(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ck> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ck.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getId() {
        return this.id_;
    }

    public com.google.v.v getIdBytes() {
        return com.google.v.v.s(this.id_);
    }

    public double getWalkingDistance() {
        return this.walkingDistance_;
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasWalkingDistance() {
        return (this.bitField0_ & 2) != 0;
    }

    public static cj newBuilder(ck ckVar) {
        return (cj) DEFAULT_INSTANCE.createBuilder(ckVar);
    }

    public static ck parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ck) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ck parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ck) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ck parseFrom(com.google.v.z zVar) {
        return (ck) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ck parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ck) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ck parseFrom(InputStream inputStream) {
        return (ck) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ck parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ck) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ck parseFrom(ByteBuffer byteBuffer) {
        return (ck) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ck parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ck) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ck parseFrom(byte[] bArr) {
        return (ck) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ck parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ck) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
