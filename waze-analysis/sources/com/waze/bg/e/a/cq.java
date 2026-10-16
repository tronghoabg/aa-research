package com.waze.bg.e.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cq extends com.google.v.du<cq, co> implements com.google.v.fj {
    public static final int CUSTOM_FAVORITE_FIELD_NUMBER = 3;
    private static final cq DEFAULT_INSTANCE;
    public static final int HOME_FAVORITE_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<cq> PARSER = null;
    public static final int WORK_FAVORITE_FIELD_NUMBER = 2;
    private int favoriteCase_ = 0;
    private Object favorite_;

    static {
        cq cqVar = new cq();
        DEFAULT_INSTANCE = cqVar;
        com.google.v.du.registerDefaultInstance(cq.class, cqVar);
    }

    private cq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCustomFavorite() {
        if (this.favoriteCase_ == 3) {
            this.favoriteCase_ = 0;
            this.favorite_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFavorite() {
        this.favoriteCase_ = 0;
        this.favorite_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHomeFavorite() {
        if (this.favoriteCase_ == 1) {
            this.favoriteCase_ = 0;
            this.favorite_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWorkFavorite() {
        if (this.favoriteCase_ == 2) {
            this.favoriteCase_ = 0;
            this.favorite_ = null;
        }
    }

    public static cq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCustomFavorite(cn cnVar) {
        Objects.requireNonNull(cnVar);
        if (this.favoriteCase_ == 3 && this.favorite_ != cn.getDefaultInstance()) {
            cm cmVarNewBuilder = cn.newBuilder((cn) this.favorite_);
            cmVarNewBuilder.mergeFrom((cm) cnVar);
            cnVar = cmVarNewBuilder.buildPartial();
        }
        this.favorite_ = cnVar;
        this.favoriteCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHomeFavorite(cs csVar) {
        Objects.requireNonNull(csVar);
        if (this.favoriteCase_ == 1 && this.favorite_ != cs.getDefaultInstance()) {
            cr crVarNewBuilder = cs.newBuilder((cs) this.favorite_);
            crVarNewBuilder.mergeFrom((cr) csVar);
            csVar = crVarNewBuilder.buildPartial();
        }
        this.favorite_ = csVar;
        this.favoriteCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWorkFavorite(cw cwVar) {
        Objects.requireNonNull(cwVar);
        if (this.favoriteCase_ == 2 && this.favorite_ != cw.getDefaultInstance()) {
            cv cvVarNewBuilder = cw.newBuilder((cw) this.favorite_);
            cvVarNewBuilder.mergeFrom((cv) cwVar);
            cwVar = cvVarNewBuilder.buildPartial();
        }
        this.favorite_ = cwVar;
        this.favoriteCase_ = 2;
    }

    public static co newBuilder() {
        return (co) DEFAULT_INSTANCE.createBuilder();
    }

    public static cq parseDelimitedFrom(InputStream inputStream) {
        return (cq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cq parseFrom(com.google.v.v vVar) {
        return (cq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<cq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCustomFavorite(cn cnVar) {
        Objects.requireNonNull(cnVar);
        this.favorite_ = cnVar;
        this.favoriteCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHomeFavorite(cs csVar) {
        Objects.requireNonNull(csVar);
        this.favorite_ = csVar;
        this.favoriteCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWorkFavorite(cw cwVar) {
        Objects.requireNonNull(cwVar);
        this.favorite_ = cwVar;
        this.favoriteCase_ = 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"favorite_", "favoriteCase_", cs.class, cw.class, cn.class});
        }
        if (iOrdinal == 3) {
            return new cq();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new co(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<cq> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (cq.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public cn getCustomFavorite() {
        return this.favoriteCase_ == 3 ? (cn) this.favorite_ : cn.getDefaultInstance();
    }

    public cp getFavoriteCase() {
        int i2 = this.favoriteCase_;
        if (i2 == 0) {
            return cp.f16654d;
        }
        if (i2 == 1) {
            return cp.f16651a;
        }
        if (i2 == 2) {
            return cp.f16652b;
        }
        if (i2 != 3) {
            return null;
        }
        return cp.f16653c;
    }

    public cs getHomeFavorite() {
        return this.favoriteCase_ == 1 ? (cs) this.favorite_ : cs.getDefaultInstance();
    }

    public cw getWorkFavorite() {
        return this.favoriteCase_ == 2 ? (cw) this.favorite_ : cw.getDefaultInstance();
    }

    public boolean hasCustomFavorite() {
        return this.favoriteCase_ == 3;
    }

    public boolean hasHomeFavorite() {
        return this.favoriteCase_ == 1;
    }

    public boolean hasWorkFavorite() {
        return this.favoriteCase_ == 2;
    }

    public static co newBuilder(cq cqVar) {
        return (co) DEFAULT_INSTANCE.createBuilder(cqVar);
    }

    public static cq parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cq parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (cq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cq parseFrom(com.google.v.z zVar) {
        return (cq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cq parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (cq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static cq parseFrom(InputStream inputStream) {
        return (cq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cq parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cq parseFrom(ByteBuffer byteBuffer) {
        return (cq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cq parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (cq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cq parseFrom(byte[] bArr) {
        return (cq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cq parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (cq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
