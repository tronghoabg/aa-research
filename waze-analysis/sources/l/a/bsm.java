package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
@Deprecated
/* loaded from: classes9.dex */
public final class bsm extends com.google.v.du<bsm, bsk> implements com.google.v.fj {
    private static final bsm DEFAULT_INSTANCE;
    public static final int ETA_CLICK_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<bsm> PARSER;
    private int statCase_ = 0;
    private Object stat_;

    static {
        bsm bsmVar = new bsm();
        DEFAULT_INSTANCE = bsmVar;
        com.google.v.du.registerDefaultInstance(bsm.class, bsmVar);
    }

    private bsm() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEtaClick() {
        if (this.statCase_ == 2) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStat() {
        this.statCase_ = 0;
        this.stat_ = null;
    }

    public static bsm getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEtaClick(vd vdVar) {
        Objects.requireNonNull(vdVar);
        if (this.statCase_ == 2 && this.stat_ != vd.getDefaultInstance()) {
            vc vcVarNewBuilder = vd.newBuilder((vd) this.stat_);
            vcVarNewBuilder.mergeFrom((vc) vdVar);
            vdVar = vcVarNewBuilder.buildPartial();
        }
        this.stat_ = vdVar;
        this.statCase_ = 2;
    }

    public static bsk newBuilder() {
        return (bsk) DEFAULT_INSTANCE.createBuilder();
    }

    public static bsm parseDelimitedFrom(InputStream inputStream) {
        return (bsm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bsm parseFrom(com.google.v.v vVar) {
        return (bsm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bsm> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEtaClick(vd vdVar) {
        Objects.requireNonNull(vdVar);
        this.stat_ = vdVar;
        this.statCase_ = 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0001\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002<\u0000", new Object[]{"stat_", "statCase_", vd.class});
        }
        if (iOrdinal == 3) {
            return new bsm();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bsk(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bsm> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bsm.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public vd getEtaClick() {
        return this.statCase_ == 2 ? (vd) this.stat_ : vd.getDefaultInstance();
    }

    public bsl getStatCase() {
        int i2 = this.statCase_;
        if (i2 == 0) {
            return bsl.f54627b;
        }
        if (i2 != 2) {
            return null;
        }
        return bsl.f54626a;
    }

    public boolean hasEtaClick() {
        return this.statCase_ == 2;
    }

    public static bsk newBuilder(bsm bsmVar) {
        return (bsk) DEFAULT_INSTANCE.createBuilder(bsmVar);
    }

    public static bsm parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bsm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bsm parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bsm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bsm parseFrom(com.google.v.z zVar) {
        return (bsm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bsm parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bsm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bsm parseFrom(InputStream inputStream) {
        return (bsm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bsm parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bsm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bsm parseFrom(ByteBuffer byteBuffer) {
        return (bsm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bsm parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bsm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bsm parseFrom(byte[] bArr) {
        return (bsm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bsm parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bsm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
