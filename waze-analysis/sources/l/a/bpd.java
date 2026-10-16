package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bpd extends com.google.v.du<bpd, bpb> implements com.google.v.fj {
    public static final int CAR_COMPASS_DETECTED_FIELD_NUMBER = 1;
    private static final bpd DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bpd> PARSER;
    private int statCase_ = 0;
    private Object stat_;

    static {
        bpd bpdVar = new bpd();
        DEFAULT_INSTANCE = bpdVar;
        com.google.v.du.registerDefaultInstance(bpd.class, bpdVar);
    }

    private bpd() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCarCompassDetected() {
        if (this.statCase_ == 1) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStat() {
        this.statCase_ = 0;
        this.stat_ = null;
    }

    public static bpd getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCarCompassDetected(ix ixVar) {
        Objects.requireNonNull(ixVar);
        if (this.statCase_ == 1 && this.stat_ != ix.getDefaultInstance()) {
            iw iwVarNewBuilder = ix.newBuilder((ix) this.stat_);
            iwVarNewBuilder.mergeFrom((iw) ixVar);
            ixVar = iwVarNewBuilder.buildPartial();
        }
        this.stat_ = ixVar;
        this.statCase_ = 1;
    }

    public static bpb newBuilder() {
        return (bpb) DEFAULT_INSTANCE.createBuilder();
    }

    public static bpd parseDelimitedFrom(InputStream inputStream) {
        return (bpd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bpd parseFrom(com.google.v.v vVar) {
        return (bpd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bpd> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCarCompassDetected(ix ixVar) {
        Objects.requireNonNull(ixVar);
        this.stat_ = ixVar;
        this.statCase_ = 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"stat_", "statCase_", ix.class});
        }
        if (iOrdinal == 3) {
            return new bpd();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bpb(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bpd> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bpd.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ix getCarCompassDetected() {
        return this.statCase_ == 1 ? (ix) this.stat_ : ix.getDefaultInstance();
    }

    public bpc getStatCase() {
        int i2 = this.statCase_;
        if (i2 == 0) {
            return bpc.f54448b;
        }
        if (i2 != 1) {
            return null;
        }
        return bpc.f54447a;
    }

    public boolean hasCarCompassDetected() {
        return this.statCase_ == 1;
    }

    public static bpb newBuilder(bpd bpdVar) {
        return (bpb) DEFAULT_INSTANCE.createBuilder(bpdVar);
    }

    public static bpd parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bpd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bpd parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bpd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bpd parseFrom(com.google.v.z zVar) {
        return (bpd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bpd parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bpd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bpd parseFrom(InputStream inputStream) {
        return (bpd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bpd parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bpd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bpd parseFrom(ByteBuffer byteBuffer) {
        return (bpd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bpd parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bpd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bpd parseFrom(byte[] bArr) {
        return (bpd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bpd parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bpd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
