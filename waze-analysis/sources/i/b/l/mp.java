package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class mp extends com.google.v.du<mp, mn> implements com.google.v.fj {
    public static final int CLOSURE_IMPACT_FIELD_NUMBER = 7;
    private static final mp DEFAULT_INSTANCE;
    public static final int FASTEST_NOT_SUGGESTED_FIELD_NUMBER = 5;
    public static final int MTE_IMPACT_FIELD_NUMBER = 9;
    public static final int NO_USE_CASE_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<mp> PARSER = null;
    public static final int PREFERRED_NOT_SUGGESTED_FIELD_NUMBER = 2;
    public static final int TYPICALLY_BEST_NOT_SUGGESTED_FIELD_NUMBER = 3;
    public static final int UNEXPECTED_ETA_FIELD_NUMBER = 4;
    public static final int UNREACHABLE_DESTINATION_FIELD_NUMBER = 6;
    private int useCasesCase_ = 0;
    private Object useCases_;

    static {
        mp mpVar = new mp();
        DEFAULT_INSTANCE = mpVar;
        com.google.v.du.registerDefaultInstance(mp.class, mpVar);
    }

    private mp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClosureImpact() {
        if (this.useCasesCase_ == 7) {
            this.useCasesCase_ = 0;
            this.useCases_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFastestNotSuggested() {
        if (this.useCasesCase_ == 5) {
            this.useCasesCase_ = 0;
            this.useCases_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMteImpact() {
        if (this.useCasesCase_ == 9) {
            this.useCasesCase_ = 0;
            this.useCases_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNoUseCase() {
        if (this.useCasesCase_ == 1) {
            this.useCasesCase_ = 0;
            this.useCases_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreferredNotSuggested() {
        if (this.useCasesCase_ == 2) {
            this.useCasesCase_ = 0;
            this.useCases_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTypicallyBestNotSuggested() {
        if (this.useCasesCase_ == 3) {
            this.useCasesCase_ = 0;
            this.useCases_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnexpectedEta() {
        if (this.useCasesCase_ == 4) {
            this.useCasesCase_ = 0;
            this.useCases_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnreachableDestination() {
        if (this.useCasesCase_ == 6) {
            this.useCasesCase_ = 0;
            this.useCases_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUseCases() {
        this.useCasesCase_ = 0;
        this.useCases_ = null;
    }

    public static mp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeClosureImpact(ll llVar) {
        Objects.requireNonNull(llVar);
        if (this.useCasesCase_ == 7 && this.useCases_ != ll.getDefaultInstance()) {
            lj ljVarNewBuilder = ll.newBuilder((ll) this.useCases_);
            ljVarNewBuilder.mergeFrom((lj) llVar);
            llVar = ljVarNewBuilder.buildPartial();
        }
        this.useCases_ = llVar;
        this.useCasesCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFastestNotSuggested(ls lsVar) {
        Objects.requireNonNull(lsVar);
        if (this.useCasesCase_ == 5 && this.useCases_ != ls.getDefaultInstance()) {
            lr lrVarNewBuilder = ls.newBuilder((ls) this.useCases_);
            lrVarNewBuilder.mergeFrom((lr) lsVar);
            lsVar = lrVarNewBuilder.buildPartial();
        }
        this.useCases_ = lsVar;
        this.useCasesCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMteImpact(lx lxVar) {
        Objects.requireNonNull(lxVar);
        if (this.useCasesCase_ == 9 && this.useCases_ != lx.getDefaultInstance()) {
            lt ltVarNewBuilder = lx.newBuilder((lx) this.useCases_);
            ltVarNewBuilder.mergeFrom((lt) lxVar);
            lxVar = ltVarNewBuilder.buildPartial();
        }
        this.useCases_ = lxVar;
        this.useCasesCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNoUseCase(lz lzVar) {
        Objects.requireNonNull(lzVar);
        if (this.useCasesCase_ == 1 && this.useCases_ != lz.getDefaultInstance()) {
            ly lyVarNewBuilder = lz.newBuilder((lz) this.useCases_);
            lyVarNewBuilder.mergeFrom((ly) lzVar);
            lzVar = lyVarNewBuilder.buildPartial();
        }
        this.useCases_ = lzVar;
        this.useCasesCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePreferredNotSuggested(mb mbVar) {
        Objects.requireNonNull(mbVar);
        if (this.useCasesCase_ == 2 && this.useCases_ != mb.getDefaultInstance()) {
            ma maVarNewBuilder = mb.newBuilder((mb) this.useCases_);
            maVarNewBuilder.mergeFrom((ma) mbVar);
            mbVar = maVarNewBuilder.buildPartial();
        }
        this.useCases_ = mbVar;
        this.useCasesCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTypicallyBestNotSuggested(mi miVar) {
        Objects.requireNonNull(miVar);
        if (this.useCasesCase_ == 3 && this.useCases_ != mi.getDefaultInstance()) {
            mh mhVarNewBuilder = mi.newBuilder((mi) this.useCases_);
            mhVarNewBuilder.mergeFrom((mh) miVar);
            miVar = mhVarNewBuilder.buildPartial();
        }
        this.useCases_ = miVar;
        this.useCasesCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUnexpectedEta(mk mkVar) {
        Objects.requireNonNull(mkVar);
        if (this.useCasesCase_ == 4 && this.useCases_ != mk.getDefaultInstance()) {
            mj mjVarNewBuilder = mk.newBuilder((mk) this.useCases_);
            mjVarNewBuilder.mergeFrom((mj) mkVar);
            mkVar = mjVarNewBuilder.buildPartial();
        }
        this.useCases_ = mkVar;
        this.useCasesCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUnreachableDestination(mm mmVar) {
        Objects.requireNonNull(mmVar);
        if (this.useCasesCase_ == 6 && this.useCases_ != mm.getDefaultInstance()) {
            ml mlVarNewBuilder = mm.newBuilder((mm) this.useCases_);
            mlVarNewBuilder.mergeFrom((ml) mmVar);
            mmVar = mlVarNewBuilder.buildPartial();
        }
        this.useCases_ = mmVar;
        this.useCasesCase_ = 6;
    }

    public static mn newBuilder() {
        return (mn) DEFAULT_INSTANCE.createBuilder();
    }

    public static mp parseDelimitedFrom(InputStream inputStream) {
        return (mp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static mp parseFrom(com.google.v.v vVar) {
        return (mp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<mp> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClosureImpact(ll llVar) {
        Objects.requireNonNull(llVar);
        this.useCases_ = llVar;
        this.useCasesCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFastestNotSuggested(ls lsVar) {
        Objects.requireNonNull(lsVar);
        this.useCases_ = lsVar;
        this.useCasesCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMteImpact(lx lxVar) {
        Objects.requireNonNull(lxVar);
        this.useCases_ = lxVar;
        this.useCasesCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNoUseCase(lz lzVar) {
        Objects.requireNonNull(lzVar);
        this.useCases_ = lzVar;
        this.useCasesCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreferredNotSuggested(mb mbVar) {
        Objects.requireNonNull(mbVar);
        this.useCases_ = mbVar;
        this.useCasesCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypicallyBestNotSuggested(mi miVar) {
        Objects.requireNonNull(miVar);
        this.useCases_ = miVar;
        this.useCasesCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnexpectedEta(mk mkVar) {
        Objects.requireNonNull(mkVar);
        this.useCases_ = mkVar;
        this.useCasesCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnreachableDestination(mm mmVar) {
        Objects.requireNonNull(mmVar);
        this.useCases_ = mmVar;
        this.useCasesCase_ = 6;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\t\b\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\t<\u0000", new Object[]{"useCases_", "useCasesCase_", lz.class, mb.class, mi.class, mk.class, ls.class, mm.class, ll.class, lx.class});
        }
        if (iOrdinal == 3) {
            return new mp();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new mn(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<mp> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (mp.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ll getClosureImpact() {
        return this.useCasesCase_ == 7 ? (ll) this.useCases_ : ll.getDefaultInstance();
    }

    public ls getFastestNotSuggested() {
        return this.useCasesCase_ == 5 ? (ls) this.useCases_ : ls.getDefaultInstance();
    }

    public lx getMteImpact() {
        return this.useCasesCase_ == 9 ? (lx) this.useCases_ : lx.getDefaultInstance();
    }

    public lz getNoUseCase() {
        return this.useCasesCase_ == 1 ? (lz) this.useCases_ : lz.getDefaultInstance();
    }

    public mb getPreferredNotSuggested() {
        return this.useCasesCase_ == 2 ? (mb) this.useCases_ : mb.getDefaultInstance();
    }

    public mi getTypicallyBestNotSuggested() {
        return this.useCasesCase_ == 3 ? (mi) this.useCases_ : mi.getDefaultInstance();
    }

    public mk getUnexpectedEta() {
        return this.useCasesCase_ == 4 ? (mk) this.useCases_ : mk.getDefaultInstance();
    }

    public mm getUnreachableDestination() {
        return this.useCasesCase_ == 6 ? (mm) this.useCases_ : mm.getDefaultInstance();
    }

    public mo getUseCasesCase() {
        switch (this.useCasesCase_) {
            case 0:
                return mo.f48903i;
            case 1:
                return mo.f48895a;
            case 2:
                return mo.f48896b;
            case 3:
                return mo.f48897c;
            case 4:
                return mo.f48898d;
            case 5:
                return mo.f48899e;
            case 6:
                return mo.f48900f;
            case 7:
                return mo.f48901g;
            case 8:
            default:
                return null;
            case 9:
                return mo.f48902h;
        }
    }

    public boolean hasClosureImpact() {
        return this.useCasesCase_ == 7;
    }

    public boolean hasFastestNotSuggested() {
        return this.useCasesCase_ == 5;
    }

    public boolean hasMteImpact() {
        return this.useCasesCase_ == 9;
    }

    public boolean hasNoUseCase() {
        return this.useCasesCase_ == 1;
    }

    public boolean hasPreferredNotSuggested() {
        return this.useCasesCase_ == 2;
    }

    public boolean hasTypicallyBestNotSuggested() {
        return this.useCasesCase_ == 3;
    }

    public boolean hasUnexpectedEta() {
        return this.useCasesCase_ == 4;
    }

    public boolean hasUnreachableDestination() {
        return this.useCasesCase_ == 6;
    }

    public static mn newBuilder(mp mpVar) {
        return (mn) DEFAULT_INSTANCE.createBuilder(mpVar);
    }

    public static mp parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (mp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static mp parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (mp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static mp parseFrom(com.google.v.z zVar) {
        return (mp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static mp parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (mp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static mp parseFrom(InputStream inputStream) {
        return (mp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static mp parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (mp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static mp parseFrom(ByteBuffer byteBuffer) {
        return (mp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static mp parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (mp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static mp parseFrom(byte[] bArr) {
        return (mp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static mp parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (mp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
