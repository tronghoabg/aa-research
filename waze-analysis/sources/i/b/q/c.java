package i.b.q;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class c extends du<c, a> implements fj {
    private static final c DEFAULT_INSTANCE;
    public static final int ETACHECKINFO_FIELD_NUMBER = 3;
    private static volatile fo<c> PARSER = null;
    public static final int PLANNEDDRIVEINFO_FIELD_NUMBER = 1;
    public static final int PREDICTIONINFO_FIELD_NUMBER = 2;
    private int infoCase_ = 0;
    private Object info_;

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        du.registerDefaultInstance(c.class, cVar);
    }

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEtaCheckInfo() {
        if (this.infoCase_ == 3) {
            this.infoCase_ = 0;
            this.info_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInfo() {
        this.infoCase_ = 0;
        this.info_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlannedDriveInfo() {
        if (this.infoCase_ == 1) {
            this.infoCase_ = 0;
            this.info_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPredictionInfo() {
        if (this.infoCase_ == 2) {
            this.infoCase_ = 0;
            this.info_ = null;
        }
    }

    public static c getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEtaCheckInfo(s sVar) {
        Objects.requireNonNull(sVar);
        if (this.infoCase_ == 3 && this.info_ != s.getDefaultInstance()) {
            r rVarNewBuilder = s.newBuilder((s) this.info_);
            rVarNewBuilder.mergeFrom((r) sVar);
            sVar = rVarNewBuilder.buildPartial();
        }
        this.info_ = sVar;
        this.infoCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlannedDriveInfo(ae aeVar) {
        Objects.requireNonNull(aeVar);
        if (this.infoCase_ == 1 && this.info_ != ae.getDefaultInstance()) {
            ab abVarNewBuilder = ae.newBuilder((ae) this.info_);
            abVarNewBuilder.mergeFrom((ab) aeVar);
            aeVar = abVarNewBuilder.buildPartial();
        }
        this.info_ = aeVar;
        this.infoCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePredictionInfo(ag agVar) {
        Objects.requireNonNull(agVar);
        if (this.infoCase_ == 2 && this.info_ != ag.getDefaultInstance()) {
            af afVarNewBuilder = ag.newBuilder((ag) this.info_);
            afVarNewBuilder.mergeFrom((af) agVar);
            agVar = afVarNewBuilder.buildPartial();
        }
        this.info_ = agVar;
        this.infoCase_ = 2;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static c parseDelimitedFrom(InputStream inputStream) {
        return (c) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static c parseFrom(com.google.v.v vVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<c> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEtaCheckInfo(s sVar) {
        Objects.requireNonNull(sVar);
        this.info_ = sVar;
        this.infoCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlannedDriveInfo(ae aeVar) {
        Objects.requireNonNull(aeVar);
        this.info_ = aeVar;
        this.infoCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPredictionInfo(ag agVar) {
        Objects.requireNonNull(agVar);
        this.info_ = agVar;
        this.infoCase_ = 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"info_", "infoCase_", ae.class, ag.class, s.class});
        }
        if (iOrdinal == 3) {
            return new c();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new a(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<c> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (c.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public s getEtaCheckInfo() {
        return this.infoCase_ == 3 ? (s) this.info_ : s.getDefaultInstance();
    }

    public b getInfoCase() {
        int i2 = this.infoCase_;
        if (i2 == 0) {
            return b.f49247d;
        }
        if (i2 == 1) {
            return b.f49244a;
        }
        if (i2 == 2) {
            return b.f49245b;
        }
        if (i2 != 3) {
            return null;
        }
        return b.f49246c;
    }

    public ae getPlannedDriveInfo() {
        return this.infoCase_ == 1 ? (ae) this.info_ : ae.getDefaultInstance();
    }

    public ag getPredictionInfo() {
        return this.infoCase_ == 2 ? (ag) this.info_ : ag.getDefaultInstance();
    }

    public boolean hasEtaCheckInfo() {
        return this.infoCase_ == 3;
    }

    public boolean hasPlannedDriveInfo() {
        return this.infoCase_ == 1;
    }

    public boolean hasPredictionInfo() {
        return this.infoCase_ == 2;
    }

    public static a newBuilder(c cVar) {
        return (a) DEFAULT_INSTANCE.createBuilder(cVar);
    }

    public static c parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (c) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static c parseFrom(com.google.v.v vVar, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static c parseFrom(com.google.v.z zVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static c parseFrom(com.google.v.z zVar, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static c parseFrom(InputStream inputStream) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static c parseFrom(InputStream inputStream, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static c parseFrom(ByteBuffer byteBuffer) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static c parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static c parseFrom(byte[] bArr) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static c parseFrom(byte[] bArr, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
