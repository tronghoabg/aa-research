package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bew extends com.google.v.du<bew, beu> implements com.google.v.fj {
    private static final bew DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bew> PARSER = null;
    public static final int SIRI_SHORTCUT_ADDED_FIELD_NUMBER = 2;
    public static final int SIRI_SHORTCUT_FINISHED_FIELD_NUMBER = 1;
    private int statCase_ = 0;
    private Object stat_;

    static {
        bew bewVar = new bew();
        DEFAULT_INSTANCE = bewVar;
        com.google.v.du.registerDefaultInstance(bew.class, bewVar);
    }

    private bew() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSiriShortcutAdded() {
        if (this.statCase_ == 2) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSiriShortcutFinished() {
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

    public static bew getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSiriShortcutAdded(bep bepVar) {
        Objects.requireNonNull(bepVar);
        if (this.statCase_ == 2 && this.stat_ != bep.getDefaultInstance()) {
            bem bemVarNewBuilder = bep.newBuilder((bep) this.stat_);
            bemVarNewBuilder.mergeFrom((bem) bepVar);
            bepVar = bemVarNewBuilder.buildPartial();
        }
        this.stat_ = bepVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSiriShortcutFinished(bet betVar) {
        Objects.requireNonNull(betVar);
        if (this.statCase_ == 1 && this.stat_ != bet.getDefaultInstance()) {
            beq beqVarNewBuilder = bet.newBuilder((bet) this.stat_);
            beqVarNewBuilder.mergeFrom((beq) betVar);
            betVar = beqVarNewBuilder.buildPartial();
        }
        this.stat_ = betVar;
        this.statCase_ = 1;
    }

    public static beu newBuilder() {
        return (beu) DEFAULT_INSTANCE.createBuilder();
    }

    public static bew parseDelimitedFrom(InputStream inputStream) {
        return (bew) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bew parseFrom(com.google.v.v vVar) {
        return (bew) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bew> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSiriShortcutAdded(bep bepVar) {
        Objects.requireNonNull(bepVar);
        this.stat_ = bepVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSiriShortcutFinished(bet betVar) {
        Objects.requireNonNull(betVar);
        this.stat_ = betVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"stat_", "statCase_", bet.class, bep.class});
        }
        if (iOrdinal == 3) {
            return new bew();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new beu(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bew> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bew.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bep getSiriShortcutAdded() {
        return this.statCase_ == 2 ? (bep) this.stat_ : bep.getDefaultInstance();
    }

    public bet getSiriShortcutFinished() {
        return this.statCase_ == 1 ? (bet) this.stat_ : bet.getDefaultInstance();
    }

    public bev getStatCase() {
        int i2 = this.statCase_;
        if (i2 == 0) {
            return bev.f53840c;
        }
        if (i2 == 1) {
            return bev.f53838a;
        }
        if (i2 != 2) {
            return null;
        }
        return bev.f53839b;
    }

    public boolean hasSiriShortcutAdded() {
        return this.statCase_ == 2;
    }

    public boolean hasSiriShortcutFinished() {
        return this.statCase_ == 1;
    }

    public static beu newBuilder(bew bewVar) {
        return (beu) DEFAULT_INSTANCE.createBuilder(bewVar);
    }

    public static bew parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bew) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bew parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bew) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bew parseFrom(com.google.v.z zVar) {
        return (bew) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bew parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bew) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bew parseFrom(InputStream inputStream) {
        return (bew) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bew parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bew) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bew parseFrom(ByteBuffer byteBuffer) {
        return (bew) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bew parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bew) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bew parseFrom(byte[] bArr) {
        return (bew) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bew parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bew) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
