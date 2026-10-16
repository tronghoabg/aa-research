package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bhw extends com.google.v.du<bhw, bhv> implements com.google.v.fj {
    private static final bhw DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bhw> PARSER = null;
    public static final int SURFACED_LOCATION_INFO_FIELD_NUMBER = 1;
    private int bitField0_;
    private bhn surfacedLocationInfo_;

    static {
        bhw bhwVar = new bhw();
        DEFAULT_INSTANCE = bhwVar;
        com.google.v.du.registerDefaultInstance(bhw.class, bhwVar);
    }

    private bhw() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSurfacedLocationInfo() {
        this.surfacedLocationInfo_ = null;
        this.bitField0_ &= -2;
    }

    public static bhw getDefaultInstance() {
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

    public static bhv newBuilder() {
        return (bhv) DEFAULT_INSTANCE.createBuilder();
    }

    public static bhw parseDelimitedFrom(InputStream inputStream) {
        return (bhw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bhw parseFrom(com.google.v.v vVar) {
        return (bhw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bhw> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "surfacedLocationInfo_"});
        }
        if (iOrdinal == 3) {
            return new bhw();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bhv(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bhw> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bhw.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bhn getSurfacedLocationInfo() {
        bhn bhnVar = this.surfacedLocationInfo_;
        return bhnVar == null ? bhn.getDefaultInstance() : bhnVar;
    }

    public boolean hasSurfacedLocationInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bhv newBuilder(bhw bhwVar) {
        return (bhv) DEFAULT_INSTANCE.createBuilder(bhwVar);
    }

    public static bhw parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bhw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bhw parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bhw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bhw parseFrom(com.google.v.z zVar) {
        return (bhw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bhw parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bhw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bhw parseFrom(InputStream inputStream) {
        return (bhw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bhw parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bhw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bhw parseFrom(ByteBuffer byteBuffer) {
        return (bhw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bhw parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bhw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bhw parseFrom(byte[] bArr) {
        return (bhw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bhw parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bhw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
