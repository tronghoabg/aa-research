package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class uu extends com.google.v.du<uu, us> implements com.google.v.fj {
    private static final uu DEFAULT_INSTANCE;
    public static final int ENCOURAGEMENT_CLICKED_FIELD_NUMBER = 2;
    public static final int ENCOURAGEMENT_RECEIVED_FIELD_NUMBER = 3;
    public static final int ENCOURAGEMENT_SHOWN_FIELD_NUMBER = 1;
    public static final int ENCOURAGEMENT_SKIPPED_FIELD_NUMBER = 4;
    private static volatile com.google.v.fo<uu> PARSER;
    private int statCase_ = 0;
    private Object stat_;

    static {
        uu uuVar = new uu();
        DEFAULT_INSTANCE = uuVar;
        com.google.v.du.registerDefaultInstance(uu.class, uuVar);
    }

    private uu() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEncouragementClicked() {
        if (this.statCase_ == 2) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEncouragementReceived() {
        if (this.statCase_ == 3) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEncouragementShown() {
        if (this.statCase_ == 1) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEncouragementSkipped() {
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

    public static uu getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEncouragementClicked(ug ugVar) {
        Objects.requireNonNull(ugVar);
        if (this.statCase_ == 2 && this.stat_ != ug.getDefaultInstance()) {
            ue ueVarNewBuilder = ug.newBuilder((ug) this.stat_);
            ueVarNewBuilder.mergeFrom((ue) ugVar);
            ugVar = ueVarNewBuilder.buildPartial();
        }
        this.stat_ = ugVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEncouragementReceived(ul ulVar) {
        Objects.requireNonNull(ulVar);
        if (this.statCase_ == 3 && this.stat_ != ul.getDefaultInstance()) {
            uk ukVarNewBuilder = ul.newBuilder((ul) this.stat_);
            ukVarNewBuilder.mergeFrom((uk) ulVar);
            ulVar = ukVarNewBuilder.buildPartial();
        }
        this.stat_ = ulVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEncouragementShown(uo uoVar) {
        Objects.requireNonNull(uoVar);
        if (this.statCase_ == 1 && this.stat_ != uo.getDefaultInstance()) {
            um umVarNewBuilder = uo.newBuilder((uo) this.stat_);
            umVarNewBuilder.mergeFrom((um) uoVar);
            uoVar = umVarNewBuilder.buildPartial();
        }
        this.stat_ = uoVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEncouragementSkipped(ur urVar) {
        Objects.requireNonNull(urVar);
        if (this.statCase_ == 4 && this.stat_ != ur.getDefaultInstance()) {
            up upVarNewBuilder = ur.newBuilder((ur) this.stat_);
            upVarNewBuilder.mergeFrom((up) urVar);
            urVar = upVarNewBuilder.buildPartial();
        }
        this.stat_ = urVar;
        this.statCase_ = 4;
    }

    public static us newBuilder() {
        return (us) DEFAULT_INSTANCE.createBuilder();
    }

    public static uu parseDelimitedFrom(InputStream inputStream) {
        return (uu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static uu parseFrom(com.google.v.v vVar) {
        return (uu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<uu> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEncouragementClicked(ug ugVar) {
        Objects.requireNonNull(ugVar);
        this.stat_ = ugVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEncouragementReceived(ul ulVar) {
        Objects.requireNonNull(ulVar);
        this.stat_ = ulVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEncouragementShown(uo uoVar) {
        Objects.requireNonNull(uoVar);
        this.stat_ = uoVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEncouragementSkipped(ur urVar) {
        Objects.requireNonNull(urVar);
        this.stat_ = urVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"stat_", "statCase_", uo.class, ug.class, ul.class, ur.class});
        }
        if (iOrdinal == 3) {
            return new uu();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new us(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<uu> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (uu.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ug getEncouragementClicked() {
        return this.statCase_ == 2 ? (ug) this.stat_ : ug.getDefaultInstance();
    }

    public ul getEncouragementReceived() {
        return this.statCase_ == 3 ? (ul) this.stat_ : ul.getDefaultInstance();
    }

    public uo getEncouragementShown() {
        return this.statCase_ == 1 ? (uo) this.stat_ : uo.getDefaultInstance();
    }

    public ur getEncouragementSkipped() {
        return this.statCase_ == 4 ? (ur) this.stat_ : ur.getDefaultInstance();
    }

    public ut getStatCase() {
        int i2 = this.statCase_;
        if (i2 == 0) {
            return ut.f55521e;
        }
        if (i2 == 1) {
            return ut.f55517a;
        }
        if (i2 == 2) {
            return ut.f55518b;
        }
        if (i2 == 3) {
            return ut.f55519c;
        }
        if (i2 != 4) {
            return null;
        }
        return ut.f55520d;
    }

    public boolean hasEncouragementClicked() {
        return this.statCase_ == 2;
    }

    public boolean hasEncouragementReceived() {
        return this.statCase_ == 3;
    }

    public boolean hasEncouragementShown() {
        return this.statCase_ == 1;
    }

    public boolean hasEncouragementSkipped() {
        return this.statCase_ == 4;
    }

    public static us newBuilder(uu uuVar) {
        return (us) DEFAULT_INSTANCE.createBuilder(uuVar);
    }

    public static uu parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (uu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static uu parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (uu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static uu parseFrom(com.google.v.z zVar) {
        return (uu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static uu parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (uu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static uu parseFrom(InputStream inputStream) {
        return (uu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static uu parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (uu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static uu parseFrom(ByteBuffer byteBuffer) {
        return (uu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uu parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (uu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static uu parseFrom(byte[] bArr) {
        return (uu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static uu parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (uu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
