package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bse extends com.google.v.du<bse, bsd> implements com.google.v.fj {
    private static final bse DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bse> PARSER = null;
    public static final int SILENT_FIELD_NUMBER = 2;
    public static final int WAZE_ASKS_INFO_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean silent_;
    private brz wazeAsksInfo_;

    static {
        bse bseVar = new bse();
        DEFAULT_INSTANCE = bseVar;
        com.google.v.du.registerDefaultInstance(bse.class, bseVar);
    }

    private bse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSilent() {
        this.bitField0_ &= -3;
        this.silent_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWazeAsksInfo() {
        this.wazeAsksInfo_ = null;
        this.bitField0_ &= -2;
    }

    public static bse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWazeAsksInfo(brz brzVar) {
        Objects.requireNonNull(brzVar);
        brz brzVar2 = this.wazeAsksInfo_;
        if (brzVar2 != null && brzVar2 != brz.getDefaultInstance()) {
            bro broVarNewBuilder = brz.newBuilder(brzVar2);
            broVarNewBuilder.mergeFrom((bro) brzVar);
            brzVar = broVarNewBuilder.buildPartial();
        }
        this.wazeAsksInfo_ = brzVar;
        this.bitField0_ |= 1;
    }

    public static bsd newBuilder() {
        return (bsd) DEFAULT_INSTANCE.createBuilder();
    }

    public static bse parseDelimitedFrom(InputStream inputStream) {
        return (bse) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bse parseFrom(com.google.v.v vVar) {
        return (bse) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSilent(boolean z) {
        this.bitField0_ |= 2;
        this.silent_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWazeAsksInfo(brz brzVar) {
        Objects.requireNonNull(brzVar);
        this.wazeAsksInfo_ = brzVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001", new Object[]{"bitField0_", "wazeAsksInfo_", "silent_"});
        }
        if (iOrdinal == 3) {
            return new bse();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bsd(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bse> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bse.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getSilent() {
        return this.silent_;
    }

    public brz getWazeAsksInfo() {
        brz brzVar = this.wazeAsksInfo_;
        return brzVar == null ? brz.getDefaultInstance() : brzVar;
    }

    public boolean hasSilent() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasWazeAsksInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bsd newBuilder(bse bseVar) {
        return (bsd) DEFAULT_INSTANCE.createBuilder(bseVar);
    }

    public static bse parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bse) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bse parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bse) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bse parseFrom(com.google.v.z zVar) {
        return (bse) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bse parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bse) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bse parseFrom(InputStream inputStream) {
        return (bse) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bse parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bse) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bse parseFrom(ByteBuffer byteBuffer) {
        return (bse) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bse parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bse) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bse parseFrom(byte[] bArr) {
        return (bse) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bse parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bse) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
