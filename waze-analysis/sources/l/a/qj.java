package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class qj extends com.google.v.du<qj, qh> implements com.google.v.fj {
    private static final qj DEFAULT_INSTANCE;
    public static final int DESTINATION_CARDS_LOADED_FIELD_NUMBER = 2;
    public static final int DESTINATION_CARD_CLICKED_FIELD_NUMBER = 1;
    public static final int DESTINATION_CARD_MENU_CLICKED_FIELD_NUMBER = 4;
    public static final int DESTINATION_CARD_MENU_SHOWN_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<qj> PARSER;
    private int statCase_ = 0;
    private Object stat_;

    static {
        qj qjVar = new qj();
        DEFAULT_INSTANCE = qjVar;
        com.google.v.du.registerDefaultInstance(qj.class, qjVar);
    }

    private qj() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestinationCardClicked() {
        if (this.statCase_ == 1) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestinationCardMenuClicked() {
        if (this.statCase_ == 4) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestinationCardMenuShown() {
        if (this.statCase_ == 3) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestinationCardsLoaded() {
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

    public static qj getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDestinationCardClicked(qa qaVar) {
        Objects.requireNonNull(qaVar);
        if (this.statCase_ == 1 && this.stat_ != qa.getDefaultInstance()) {
            pz pzVarNewBuilder = qa.newBuilder((qa) this.stat_);
            pzVarNewBuilder.mergeFrom((pz) qaVar);
            qaVar = pzVarNewBuilder.buildPartial();
        }
        this.stat_ = qaVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDestinationCardMenuClicked(qd qdVar) {
        Objects.requireNonNull(qdVar);
        if (this.statCase_ == 4 && this.stat_ != qd.getDefaultInstance()) {
            qc qcVarNewBuilder = qd.newBuilder((qd) this.stat_);
            qcVarNewBuilder.mergeFrom((qc) qdVar);
            qdVar = qcVarNewBuilder.buildPartial();
        }
        this.stat_ = qdVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDestinationCardMenuShown(qf qfVar) {
        Objects.requireNonNull(qfVar);
        if (this.statCase_ == 3 && this.stat_ != qf.getDefaultInstance()) {
            qe qeVarNewBuilder = qf.newBuilder((qf) this.stat_);
            qeVarNewBuilder.mergeFrom((qe) qfVar);
            qfVar = qeVarNewBuilder.buildPartial();
        }
        this.stat_ = qfVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDestinationCardsLoaded(qm qmVar) {
        Objects.requireNonNull(qmVar);
        if (this.statCase_ == 2 && this.stat_ != qm.getDefaultInstance()) {
            qk qkVarNewBuilder = qm.newBuilder((qm) this.stat_);
            qkVarNewBuilder.mergeFrom((qk) qmVar);
            qmVar = qkVarNewBuilder.buildPartial();
        }
        this.stat_ = qmVar;
        this.statCase_ = 2;
    }

    public static qh newBuilder() {
        return (qh) DEFAULT_INSTANCE.createBuilder();
    }

    public static qj parseDelimitedFrom(InputStream inputStream) {
        return (qj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static qj parseFrom(com.google.v.v vVar) {
        return (qj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<qj> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestinationCardClicked(qa qaVar) {
        Objects.requireNonNull(qaVar);
        this.stat_ = qaVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestinationCardMenuClicked(qd qdVar) {
        Objects.requireNonNull(qdVar);
        this.stat_ = qdVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestinationCardMenuShown(qf qfVar) {
        Objects.requireNonNull(qfVar);
        this.stat_ = qfVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestinationCardsLoaded(qm qmVar) {
        Objects.requireNonNull(qmVar);
        this.stat_ = qmVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"stat_", "statCase_", qa.class, qm.class, qf.class, qd.class});
        }
        if (iOrdinal == 3) {
            return new qj();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new qh(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<qj> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (qj.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Deprecated
    public qa getDestinationCardClicked() {
        return this.statCase_ == 1 ? (qa) this.stat_ : qa.getDefaultInstance();
    }

    public qd getDestinationCardMenuClicked() {
        return this.statCase_ == 4 ? (qd) this.stat_ : qd.getDefaultInstance();
    }

    public qf getDestinationCardMenuShown() {
        return this.statCase_ == 3 ? (qf) this.stat_ : qf.getDefaultInstance();
    }

    @Deprecated
    public qm getDestinationCardsLoaded() {
        return this.statCase_ == 2 ? (qm) this.stat_ : qm.getDefaultInstance();
    }

    public qi getStatCase() {
        int i2 = this.statCase_;
        if (i2 == 0) {
            return qi.f55293e;
        }
        if (i2 == 1) {
            return qi.f55289a;
        }
        if (i2 == 2) {
            return qi.f55290b;
        }
        if (i2 == 3) {
            return qi.f55291c;
        }
        if (i2 != 4) {
            return null;
        }
        return qi.f55292d;
    }

    @Deprecated
    public boolean hasDestinationCardClicked() {
        return this.statCase_ == 1;
    }

    public boolean hasDestinationCardMenuClicked() {
        return this.statCase_ == 4;
    }

    public boolean hasDestinationCardMenuShown() {
        return this.statCase_ == 3;
    }

    @Deprecated
    public boolean hasDestinationCardsLoaded() {
        return this.statCase_ == 2;
    }

    public static qh newBuilder(qj qjVar) {
        return (qh) DEFAULT_INSTANCE.createBuilder(qjVar);
    }

    public static qj parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (qj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static qj parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (qj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static qj parseFrom(com.google.v.z zVar) {
        return (qj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static qj parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (qj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static qj parseFrom(InputStream inputStream) {
        return (qj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static qj parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (qj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static qj parseFrom(ByteBuffer byteBuffer) {
        return (qj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qj parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (qj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static qj parseFrom(byte[] bArr) {
        return (qj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static qj parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (qj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
