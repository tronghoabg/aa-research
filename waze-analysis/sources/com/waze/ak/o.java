package com.waze.ak;

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
/* loaded from: classes5.dex */
public final class o extends du<o, m> implements fj {
    public static final int CUSTOM_FAVORITE_FIELD_NUMBER = 3;
    private static final o DEFAULT_INSTANCE;
    public static final int HOME_FAVORITE_FIELD_NUMBER = 1;
    private static volatile fo<o> PARSER = null;
    public static final int WORK_FAVORITE_FIELD_NUMBER = 2;
    private int favoriteCase_ = 0;
    private Object favorite_;

    static {
        o oVar = new o();
        DEFAULT_INSTANCE = oVar;
        du.registerDefaultInstance(o.class, oVar);
    }

    private o() {
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

    public static o getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCustomFavorite(f fVar) {
        Objects.requireNonNull(fVar);
        if (this.favoriteCase_ == 3 && this.favorite_ != f.getDefaultInstance()) {
            e eVarNewBuilder = f.newBuilder((f) this.favorite_);
            eVarNewBuilder.mergeFrom((e) fVar);
            fVar = eVarNewBuilder.buildPartial();
        }
        this.favorite_ = fVar;
        this.favoriteCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHomeFavorite(u uVar) {
        Objects.requireNonNull(uVar);
        if (this.favoriteCase_ == 1 && this.favorite_ != u.getDefaultInstance()) {
            t tVarNewBuilder = u.newBuilder((u) this.favorite_);
            tVarNewBuilder.mergeFrom((t) uVar);
            uVar = tVarNewBuilder.buildPartial();
        }
        this.favorite_ = uVar;
        this.favoriteCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWorkFavorite(ak akVar) {
        Objects.requireNonNull(akVar);
        if (this.favoriteCase_ == 2 && this.favorite_ != ak.getDefaultInstance()) {
            aj ajVarNewBuilder = ak.newBuilder((ak) this.favorite_);
            ajVarNewBuilder.mergeFrom((aj) akVar);
            akVar = ajVarNewBuilder.buildPartial();
        }
        this.favorite_ = akVar;
        this.favoriteCase_ = 2;
    }

    public static m newBuilder() {
        return (m) DEFAULT_INSTANCE.createBuilder();
    }

    public static o parseDelimitedFrom(InputStream inputStream) {
        return (o) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static o parseFrom(com.google.v.v vVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<o> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCustomFavorite(f fVar) {
        Objects.requireNonNull(fVar);
        this.favorite_ = fVar;
        this.favoriteCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHomeFavorite(u uVar) {
        Objects.requireNonNull(uVar);
        this.favorite_ = uVar;
        this.favoriteCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWorkFavorite(ak akVar) {
        Objects.requireNonNull(akVar);
        this.favorite_ = akVar;
        this.favoriteCase_ = 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"favorite_", "favoriteCase_", u.class, ak.class, f.class});
        }
        if (iOrdinal == 3) {
            return new o();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new m(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<o> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (o.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public f getCustomFavorite() {
        return this.favoriteCase_ == 3 ? (f) this.favorite_ : f.getDefaultInstance();
    }

    public n getFavoriteCase() {
        int i2 = this.favoriteCase_;
        if (i2 == 0) {
            return n.f14116d;
        }
        if (i2 == 1) {
            return n.f14113a;
        }
        if (i2 == 2) {
            return n.f14114b;
        }
        if (i2 != 3) {
            return null;
        }
        return n.f14115c;
    }

    public u getHomeFavorite() {
        return this.favoriteCase_ == 1 ? (u) this.favorite_ : u.getDefaultInstance();
    }

    public ak getWorkFavorite() {
        return this.favoriteCase_ == 2 ? (ak) this.favorite_ : ak.getDefaultInstance();
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

    public static m newBuilder(o oVar) {
        return (m) DEFAULT_INSTANCE.createBuilder(oVar);
    }

    public static o parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (o) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static o parseFrom(com.google.v.v vVar, de deVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static o parseFrom(com.google.v.z zVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static o parseFrom(com.google.v.z zVar, de deVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static o parseFrom(InputStream inputStream) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static o parseFrom(InputStream inputStream, de deVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static o parseFrom(ByteBuffer byteBuffer) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static o parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static o parseFrom(byte[] bArr) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static o parseFrom(byte[] bArr, de deVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
