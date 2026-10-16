package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bgk extends com.google.v.du<bgk, bgi> implements com.google.v.fj {
    private static final bgk DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bgk> PARSER = null;
    public static final int SERVER_SUGGESTIONS_CONTENT_RECEIVED_FIELD_NUMBER = 2;
    public static final int SERVER_SUGGESTIONS_CONTENT_REQUESTED_FIELD_NUMBER = 3;
    public static final int START_STATE_DRAWER_CHANGED_FIELD_NUMBER = 1;
    public static final int START_STATE_DRAWER_CLICKED_FIELD_NUMBER = 4;
    public static final int START_STATE_DRAWER_SHOWN_FIELD_NUMBER = 6;
    public static final int START_STATE_RT_INFO_UPDATED_FIELD_NUMBER = 5;
    private int statCase_ = 0;
    private Object stat_;

    static {
        bgk bgkVar = new bgk();
        DEFAULT_INSTANCE = bgkVar;
        com.google.v.du.registerDefaultInstance(bgk.class, bgkVar);
    }

    private bgk() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServerSuggestionsContentReceived() {
        if (this.statCase_ == 2) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServerSuggestionsContentRequested() {
        if (this.statCase_ == 3) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartStateDrawerChanged() {
        if (this.statCase_ == 1) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartStateDrawerClicked() {
        if (this.statCase_ == 4) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartStateDrawerShown() {
        if (this.statCase_ == 6) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartStateRtInfoUpdated() {
        if (this.statCase_ == 5) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStat() {
        this.statCase_ = 0;
        this.stat_ = null;
    }

    public static bgk getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeServerSuggestionsContentReceived(bbc bbcVar) {
        Objects.requireNonNull(bbcVar);
        if (this.statCase_ == 2 && this.stat_ != bbc.getDefaultInstance()) {
            bbb bbbVarNewBuilder = bbc.newBuilder((bbc) this.stat_);
            bbbVarNewBuilder.mergeFrom((bbb) bbcVar);
            bbcVar = bbbVarNewBuilder.buildPartial();
        }
        this.stat_ = bbcVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeServerSuggestionsContentRequested(bbf bbfVar) {
        Objects.requireNonNull(bbfVar);
        if (this.statCase_ == 3 && this.stat_ != bbf.getDefaultInstance()) {
            bbd bbdVarNewBuilder = bbf.newBuilder((bbf) this.stat_);
            bbdVarNewBuilder.mergeFrom((bbd) bbfVar);
            bbfVar = bbdVarNewBuilder.buildPartial();
        }
        this.stat_ = bbfVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStartStateDrawerChanged(bfy bfyVar) {
        Objects.requireNonNull(bfyVar);
        if (this.statCase_ == 1 && this.stat_ != bfy.getDefaultInstance()) {
            bfv bfvVarNewBuilder = bfy.newBuilder((bfy) this.stat_);
            bfvVarNewBuilder.mergeFrom((bfv) bfyVar);
            bfyVar = bfvVarNewBuilder.buildPartial();
        }
        this.stat_ = bfyVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStartStateDrawerClicked(bgc bgcVar) {
        Objects.requireNonNull(bgcVar);
        if (this.statCase_ == 4 && this.stat_ != bgc.getDefaultInstance()) {
            bga bgaVarNewBuilder = bgc.newBuilder((bgc) this.stat_);
            bgaVarNewBuilder.mergeFrom((bga) bgcVar);
            bgcVar = bgaVarNewBuilder.buildPartial();
        }
        this.stat_ = bgcVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStartStateDrawerShown(bgf bgfVar) {
        Objects.requireNonNull(bgfVar);
        if (this.statCase_ == 6 && this.stat_ != bgf.getDefaultInstance()) {
            bgd bgdVarNewBuilder = bgf.newBuilder((bgf) this.stat_);
            bgdVarNewBuilder.mergeFrom((bgd) bgfVar);
            bgfVar = bgdVarNewBuilder.buildPartial();
        }
        this.stat_ = bgfVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStartStateRtInfoUpdated(bgh bghVar) {
        Objects.requireNonNull(bghVar);
        if (this.statCase_ == 5 && this.stat_ != bgh.getDefaultInstance()) {
            bgg bggVarNewBuilder = bgh.newBuilder((bgh) this.stat_);
            bggVarNewBuilder.mergeFrom((bgg) bghVar);
            bghVar = bggVarNewBuilder.buildPartial();
        }
        this.stat_ = bghVar;
        this.statCase_ = 5;
    }

    public static bgi newBuilder() {
        return (bgi) DEFAULT_INSTANCE.createBuilder();
    }

    public static bgk parseDelimitedFrom(InputStream inputStream) {
        return (bgk) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bgk parseFrom(com.google.v.v vVar) {
        return (bgk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bgk> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerSuggestionsContentReceived(bbc bbcVar) {
        Objects.requireNonNull(bbcVar);
        this.stat_ = bbcVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerSuggestionsContentRequested(bbf bbfVar) {
        Objects.requireNonNull(bbfVar);
        this.stat_ = bbfVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartStateDrawerChanged(bfy bfyVar) {
        Objects.requireNonNull(bfyVar);
        this.stat_ = bfyVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartStateDrawerClicked(bgc bgcVar) {
        Objects.requireNonNull(bgcVar);
        this.stat_ = bgcVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartStateDrawerShown(bgf bgfVar) {
        Objects.requireNonNull(bgfVar);
        this.stat_ = bgfVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartStateRtInfoUpdated(bgh bghVar) {
        Objects.requireNonNull(bghVar);
        this.stat_ = bghVar;
        this.statCase_ = 5;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"stat_", "statCase_", bfy.class, bbc.class, bbf.class, bgc.class, bgh.class, bgf.class});
        }
        if (iOrdinal == 3) {
            return new bgk();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bgi(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bgk> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bgk.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bbc getServerSuggestionsContentReceived() {
        return this.statCase_ == 2 ? (bbc) this.stat_ : bbc.getDefaultInstance();
    }

    public bbf getServerSuggestionsContentRequested() {
        return this.statCase_ == 3 ? (bbf) this.stat_ : bbf.getDefaultInstance();
    }

    public bfy getStartStateDrawerChanged() {
        return this.statCase_ == 1 ? (bfy) this.stat_ : bfy.getDefaultInstance();
    }

    public bgc getStartStateDrawerClicked() {
        return this.statCase_ == 4 ? (bgc) this.stat_ : bgc.getDefaultInstance();
    }

    public bgf getStartStateDrawerShown() {
        return this.statCase_ == 6 ? (bgf) this.stat_ : bgf.getDefaultInstance();
    }

    public bgh getStartStateRtInfoUpdated() {
        return this.statCase_ == 5 ? (bgh) this.stat_ : bgh.getDefaultInstance();
    }

    public bgj getStatCase() {
        switch (this.statCase_) {
            case 0:
                return bgj.f53930g;
            case 1:
                return bgj.f53924a;
            case 2:
                return bgj.f53925b;
            case 3:
                return bgj.f53926c;
            case 4:
                return bgj.f53927d;
            case 5:
                return bgj.f53928e;
            case 6:
                return bgj.f53929f;
            default:
                return null;
        }
    }

    public boolean hasServerSuggestionsContentReceived() {
        return this.statCase_ == 2;
    }

    public boolean hasServerSuggestionsContentRequested() {
        return this.statCase_ == 3;
    }

    public boolean hasStartStateDrawerChanged() {
        return this.statCase_ == 1;
    }

    public boolean hasStartStateDrawerClicked() {
        return this.statCase_ == 4;
    }

    public boolean hasStartStateDrawerShown() {
        return this.statCase_ == 6;
    }

    public boolean hasStartStateRtInfoUpdated() {
        return this.statCase_ == 5;
    }

    public static bgi newBuilder(bgk bgkVar) {
        return (bgi) DEFAULT_INSTANCE.createBuilder(bgkVar);
    }

    public static bgk parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bgk) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bgk parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bgk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bgk parseFrom(com.google.v.z zVar) {
        return (bgk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bgk parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bgk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bgk parseFrom(InputStream inputStream) {
        return (bgk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bgk parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bgk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bgk parseFrom(ByteBuffer byteBuffer) {
        return (bgk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bgk parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bgk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bgk parseFrom(byte[] bArr) {
        return (bgk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bgk parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bgk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
