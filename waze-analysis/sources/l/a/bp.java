package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bp extends com.google.v.du<bp, bn> implements com.google.v.fj {
    public static final int AD_GENERIC_EVENT_FIELD_NUMBER = 1;
    public static final int AD_NAVIGATE_AROUND_DESTINATION_STAT_FIELD_NUMBER = 2;
    public static final int AD_NAVIGATE_ARRIVED_STAT_FIELD_NUMBER = 5;
    public static final int AD_NAVIGATE_START_STAT_FIELD_NUMBER = 3;
    public static final int AD_NAVIGATE_STOPPED_STAT_FIELD_NUMBER = 4;
    private static final bp DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bp> PARSER;
    private int statCase_ = 0;
    private Object stat_;

    static {
        bp bpVar = new bp();
        DEFAULT_INSTANCE = bpVar;
        com.google.v.du.registerDefaultInstance(bp.class, bpVar);
    }

    private bp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdGenericEvent() {
        if (this.statCase_ == 1) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdNavigateAroundDestinationStat() {
        if (this.statCase_ == 2) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdNavigateArrivedStat() {
        if (this.statCase_ == 5) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdNavigateStartStat() {
        if (this.statCase_ == 3) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdNavigateStoppedStat() {
        if (this.statCase_ == 4) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStat() {
        this.statCase_ = 0;
        this.stat_ = null;
    }

    public static bp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAdGenericEvent(u uVar) {
        Objects.requireNonNull(uVar);
        if (this.statCase_ == 1 && this.stat_ != u.getDefaultInstance()) {
            t tVarNewBuilder = u.newBuilder((u) this.stat_);
            tVarNewBuilder.mergeFrom((t) uVar);
            uVar = tVarNewBuilder.buildPartial();
        }
        this.stat_ = uVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAdNavigateAroundDestinationStat(ab abVar) {
        Objects.requireNonNull(abVar);
        if (this.statCase_ == 2 && this.stat_ != ab.getDefaultInstance()) {
            aa aaVarNewBuilder = ab.newBuilder((ab) this.stat_);
            aaVarNewBuilder.mergeFrom((aa) abVar);
            abVar = aaVarNewBuilder.buildPartial();
        }
        this.stat_ = abVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAdNavigateArrivedStat(ad adVar) {
        Objects.requireNonNull(adVar);
        if (this.statCase_ == 5 && this.stat_ != ad.getDefaultInstance()) {
            ac acVarNewBuilder = ad.newBuilder((ad) this.stat_);
            acVarNewBuilder.mergeFrom((ac) adVar);
            adVar = acVarNewBuilder.buildPartial();
        }
        this.stat_ = adVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAdNavigateStartStat(af afVar) {
        Objects.requireNonNull(afVar);
        if (this.statCase_ == 3 && this.stat_ != af.getDefaultInstance()) {
            ae aeVarNewBuilder = af.newBuilder((af) this.stat_);
            aeVarNewBuilder.mergeFrom((ae) afVar);
            afVar = aeVarNewBuilder.buildPartial();
        }
        this.stat_ = afVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAdNavigateStoppedStat(ah ahVar) {
        Objects.requireNonNull(ahVar);
        if (this.statCase_ == 4 && this.stat_ != ah.getDefaultInstance()) {
            ag agVarNewBuilder = ah.newBuilder((ah) this.stat_);
            agVarNewBuilder.mergeFrom((ag) ahVar);
            ahVar = agVarNewBuilder.buildPartial();
        }
        this.stat_ = ahVar;
        this.statCase_ = 4;
    }

    public static bn newBuilder() {
        return (bn) DEFAULT_INSTANCE.createBuilder();
    }

    public static bp parseDelimitedFrom(InputStream inputStream) {
        return (bp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bp parseFrom(com.google.v.v vVar) {
        return (bp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bp> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdGenericEvent(u uVar) {
        Objects.requireNonNull(uVar);
        this.stat_ = uVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdNavigateAroundDestinationStat(ab abVar) {
        Objects.requireNonNull(abVar);
        this.stat_ = abVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdNavigateArrivedStat(ad adVar) {
        Objects.requireNonNull(adVar);
        this.stat_ = adVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdNavigateStartStat(af afVar) {
        Objects.requireNonNull(afVar);
        this.stat_ = afVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdNavigateStoppedStat(ah ahVar) {
        Objects.requireNonNull(ahVar);
        this.stat_ = ahVar;
        this.statCase_ = 4;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"stat_", "statCase_", u.class, ab.class, af.class, ah.class, ad.class});
        }
        if (iOrdinal == 3) {
            return new bp();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bn(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bp> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bp.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public u getAdGenericEvent() {
        return this.statCase_ == 1 ? (u) this.stat_ : u.getDefaultInstance();
    }

    public ab getAdNavigateAroundDestinationStat() {
        return this.statCase_ == 2 ? (ab) this.stat_ : ab.getDefaultInstance();
    }

    public ad getAdNavigateArrivedStat() {
        return this.statCase_ == 5 ? (ad) this.stat_ : ad.getDefaultInstance();
    }

    public af getAdNavigateStartStat() {
        return this.statCase_ == 3 ? (af) this.stat_ : af.getDefaultInstance();
    }

    public ah getAdNavigateStoppedStat() {
        return this.statCase_ == 4 ? (ah) this.stat_ : ah.getDefaultInstance();
    }

    public bo getStatCase() {
        int i2 = this.statCase_;
        if (i2 == 0) {
            return bo.f54387f;
        }
        if (i2 == 1) {
            return bo.f54382a;
        }
        if (i2 == 2) {
            return bo.f54383b;
        }
        if (i2 == 3) {
            return bo.f54384c;
        }
        if (i2 == 4) {
            return bo.f54385d;
        }
        if (i2 != 5) {
            return null;
        }
        return bo.f54386e;
    }

    public boolean hasAdGenericEvent() {
        return this.statCase_ == 1;
    }

    public boolean hasAdNavigateAroundDestinationStat() {
        return this.statCase_ == 2;
    }

    public boolean hasAdNavigateArrivedStat() {
        return this.statCase_ == 5;
    }

    public boolean hasAdNavigateStartStat() {
        return this.statCase_ == 3;
    }

    public boolean hasAdNavigateStoppedStat() {
        return this.statCase_ == 4;
    }

    public static bn newBuilder(bp bpVar) {
        return (bn) DEFAULT_INSTANCE.createBuilder(bpVar);
    }

    public static bp parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bp parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bp parseFrom(com.google.v.z zVar) {
        return (bp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bp parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bp parseFrom(InputStream inputStream) {
        return (bp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bp parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bp parseFrom(ByteBuffer byteBuffer) {
        return (bp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bp parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bp parseFrom(byte[] bArr) {
        return (bp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bp parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
