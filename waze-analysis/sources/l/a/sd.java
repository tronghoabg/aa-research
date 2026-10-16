package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class sd extends com.google.v.du<sd, sc> implements com.google.v.fj {
    private static final sd DEFAULT_INSTANCE;
    public static final int DETOUR_FIELD_NUMBER = 1;
    public static final int MAP_IS_TRACKED_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<sd> PARSER;
    private int bitField0_;
    private ro detour_;
    private boolean mapIsTracked_;

    static {
        sd sdVar = new sd();
        DEFAULT_INSTANCE = sdVar;
        com.google.v.du.registerDefaultInstance(sd.class, sdVar);
    }

    private sd() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDetour() {
        this.detour_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMapIsTracked() {
        this.bitField0_ &= -3;
        this.mapIsTracked_ = false;
    }

    public static sd getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDetour(ro roVar) {
        Objects.requireNonNull(roVar);
        ro roVar2 = this.detour_;
        if (roVar2 != null && roVar2 != ro.getDefaultInstance()) {
            rn rnVarNewBuilder = ro.newBuilder(roVar2);
            rnVarNewBuilder.mergeFrom((rn) roVar);
            roVar = rnVarNewBuilder.buildPartial();
        }
        this.detour_ = roVar;
        this.bitField0_ |= 1;
    }

    public static sc newBuilder() {
        return (sc) DEFAULT_INSTANCE.createBuilder();
    }

    public static sd parseDelimitedFrom(InputStream inputStream) {
        return (sd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static sd parseFrom(com.google.v.v vVar) {
        return (sd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<sd> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDetour(ro roVar) {
        Objects.requireNonNull(roVar);
        this.detour_ = roVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMapIsTracked(boolean z) {
        this.bitField0_ |= 2;
        this.mapIsTracked_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001", new Object[]{"bitField0_", "detour_", "mapIsTracked_"});
        }
        if (iOrdinal == 3) {
            return new sd();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new sc(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<sd> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (sd.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ro getDetour() {
        ro roVar = this.detour_;
        return roVar == null ? ro.getDefaultInstance() : roVar;
    }

    public boolean getMapIsTracked() {
        return this.mapIsTracked_;
    }

    public boolean hasDetour() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasMapIsTracked() {
        return (this.bitField0_ & 2) != 0;
    }

    public static sc newBuilder(sd sdVar) {
        return (sc) DEFAULT_INSTANCE.createBuilder(sdVar);
    }

    public static sd parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (sd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static sd parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (sd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static sd parseFrom(com.google.v.z zVar) {
        return (sd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static sd parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (sd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static sd parseFrom(InputStream inputStream) {
        return (sd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static sd parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (sd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static sd parseFrom(ByteBuffer byteBuffer) {
        return (sd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static sd parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (sd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static sd parseFrom(byte[] bArr) {
        return (sd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static sd parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (sd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
