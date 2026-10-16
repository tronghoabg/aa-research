package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bhl extends com.google.v.du<bhl, bhj> implements com.google.v.fj {
    private static final bhl DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bhl> PARSER = null;
    public static final int SURFACED_PIN_CLICKED_FIELD_NUMBER = 1;
    public static final int SURFACED_PIN_SHOWN_FIELD_NUMBER = 2;
    public static final int SURFACED_TAKEOVER_CLICKED_FIELD_NUMBER = 3;
    public static final int SURFACED_TAKEOVER_SHOWN_FIELD_NUMBER = 4;
    private int statCase_ = 0;
    private Object stat_;

    static {
        bhl bhlVar = new bhl();
        DEFAULT_INSTANCE = bhlVar;
        com.google.v.du.registerDefaultInstance(bhl.class, bhlVar);
    }

    private bhl() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStat() {
        this.statCase_ = 0;
        this.stat_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSurfacedPinClicked() {
        if (this.statCase_ == 1) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSurfacedPinShown() {
        if (this.statCase_ == 2) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSurfacedTakeoverClicked() {
        if (this.statCase_ == 3) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSurfacedTakeoverShown() {
        if (this.statCase_ == 4) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    public static bhl getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSurfacedPinClicked(bhp bhpVar) {
        Objects.requireNonNull(bhpVar);
        if (this.statCase_ == 1 && this.stat_ != bhp.getDefaultInstance()) {
            bho bhoVarNewBuilder = bhp.newBuilder((bhp) this.stat_);
            bhoVarNewBuilder.mergeFrom((bho) bhpVar);
            bhpVar = bhoVarNewBuilder.buildPartial();
        }
        this.stat_ = bhpVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSurfacedPinShown(bhr bhrVar) {
        Objects.requireNonNull(bhrVar);
        if (this.statCase_ == 2 && this.stat_ != bhr.getDefaultInstance()) {
            bhq bhqVarNewBuilder = bhr.newBuilder((bhr) this.stat_);
            bhqVarNewBuilder.mergeFrom((bhq) bhrVar);
            bhrVar = bhqVarNewBuilder.buildPartial();
        }
        this.stat_ = bhrVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSurfacedTakeoverClicked(bhu bhuVar) {
        Objects.requireNonNull(bhuVar);
        if (this.statCase_ == 3 && this.stat_ != bhu.getDefaultInstance()) {
            bhs bhsVarNewBuilder = bhu.newBuilder((bhu) this.stat_);
            bhsVarNewBuilder.mergeFrom((bhs) bhuVar);
            bhuVar = bhsVarNewBuilder.buildPartial();
        }
        this.stat_ = bhuVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSurfacedTakeoverShown(bhw bhwVar) {
        Objects.requireNonNull(bhwVar);
        if (this.statCase_ == 4 && this.stat_ != bhw.getDefaultInstance()) {
            bhv bhvVarNewBuilder = bhw.newBuilder((bhw) this.stat_);
            bhvVarNewBuilder.mergeFrom((bhv) bhwVar);
            bhwVar = bhvVarNewBuilder.buildPartial();
        }
        this.stat_ = bhwVar;
        this.statCase_ = 4;
    }

    public static bhj newBuilder() {
        return (bhj) DEFAULT_INSTANCE.createBuilder();
    }

    public static bhl parseDelimitedFrom(InputStream inputStream) {
        return (bhl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bhl parseFrom(com.google.v.v vVar) {
        return (bhl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bhl> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSurfacedPinClicked(bhp bhpVar) {
        Objects.requireNonNull(bhpVar);
        this.stat_ = bhpVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSurfacedPinShown(bhr bhrVar) {
        Objects.requireNonNull(bhrVar);
        this.stat_ = bhrVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSurfacedTakeoverClicked(bhu bhuVar) {
        Objects.requireNonNull(bhuVar);
        this.stat_ = bhuVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSurfacedTakeoverShown(bhw bhwVar) {
        Objects.requireNonNull(bhwVar);
        this.stat_ = bhwVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"stat_", "statCase_", bhp.class, bhr.class, bhu.class, bhw.class});
        }
        if (iOrdinal == 3) {
            return new bhl();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bhj(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bhl> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bhl.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bhk getStatCase() {
        int i2 = this.statCase_;
        if (i2 == 0) {
            return bhk.f54003e;
        }
        if (i2 == 1) {
            return bhk.f53999a;
        }
        if (i2 == 2) {
            return bhk.f54000b;
        }
        if (i2 == 3) {
            return bhk.f54001c;
        }
        if (i2 != 4) {
            return null;
        }
        return bhk.f54002d;
    }

    public bhp getSurfacedPinClicked() {
        return this.statCase_ == 1 ? (bhp) this.stat_ : bhp.getDefaultInstance();
    }

    public bhr getSurfacedPinShown() {
        return this.statCase_ == 2 ? (bhr) this.stat_ : bhr.getDefaultInstance();
    }

    public bhu getSurfacedTakeoverClicked() {
        return this.statCase_ == 3 ? (bhu) this.stat_ : bhu.getDefaultInstance();
    }

    public bhw getSurfacedTakeoverShown() {
        return this.statCase_ == 4 ? (bhw) this.stat_ : bhw.getDefaultInstance();
    }

    public boolean hasSurfacedPinClicked() {
        return this.statCase_ == 1;
    }

    public boolean hasSurfacedPinShown() {
        return this.statCase_ == 2;
    }

    public boolean hasSurfacedTakeoverClicked() {
        return this.statCase_ == 3;
    }

    public boolean hasSurfacedTakeoverShown() {
        return this.statCase_ == 4;
    }

    public static bhj newBuilder(bhl bhlVar) {
        return (bhj) DEFAULT_INSTANCE.createBuilder(bhlVar);
    }

    public static bhl parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bhl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bhl parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bhl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bhl parseFrom(com.google.v.z zVar) {
        return (bhl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bhl parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bhl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bhl parseFrom(InputStream inputStream) {
        return (bhl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bhl parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bhl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bhl parseFrom(ByteBuffer byteBuffer) {
        return (bhl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bhl parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bhl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bhl parseFrom(byte[] bArr) {
        return (bhl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bhl parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bhl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
