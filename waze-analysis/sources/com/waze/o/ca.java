package com.waze.o;

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
public final class ca extends du<ca, by> implements fj {
    public static final int ADD_FAVORITE_FIELD_NUMBER = 1;
    private static final ca DEFAULT_INSTANCE;
    public static final int DELETE_FAVORITE_FIELD_NUMBER = 2;
    private static volatile fo<ca> PARSER;
    private int updateTypeCase_ = 0;
    private Object updateType_;

    static {
        ca caVar = new ca();
        DEFAULT_INSTANCE = caVar;
        du.registerDefaultInstance(ca.class, caVar);
    }

    private ca() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAddFavorite() {
        if (this.updateTypeCase_ == 1) {
            this.updateTypeCase_ = 0;
            this.updateType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeleteFavorite() {
        if (this.updateTypeCase_ == 2) {
            this.updateTypeCase_ = 0;
            this.updateType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpdateType() {
        this.updateTypeCase_ = 0;
        this.updateType_ = null;
    }

    public static ca getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAddFavorite(e eVar) {
        Objects.requireNonNull(eVar);
        if (this.updateTypeCase_ == 1 && this.updateType_ != e.getDefaultInstance()) {
            d dVarNewBuilder = e.newBuilder((e) this.updateType_);
            dVarNewBuilder.mergeFrom((d) eVar);
            eVar = dVarNewBuilder.buildPartial();
        }
        this.updateType_ = eVar;
        this.updateTypeCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDeleteFavorite(af afVar) {
        Objects.requireNonNull(afVar);
        if (this.updateTypeCase_ == 2 && this.updateType_ != af.getDefaultInstance()) {
            ae aeVarNewBuilder = af.newBuilder((af) this.updateType_);
            aeVarNewBuilder.mergeFrom((ae) afVar);
            afVar = aeVarNewBuilder.buildPartial();
        }
        this.updateType_ = afVar;
        this.updateTypeCase_ = 2;
    }

    public static by newBuilder() {
        return (by) DEFAULT_INSTANCE.createBuilder();
    }

    public static ca parseDelimitedFrom(InputStream inputStream) {
        return (ca) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ca parseFrom(com.google.v.v vVar) {
        return (ca) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ca> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddFavorite(e eVar) {
        Objects.requireNonNull(eVar);
        this.updateType_ = eVar;
        this.updateTypeCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeleteFavorite(af afVar) {
        Objects.requireNonNull(afVar);
        this.updateType_ = afVar;
        this.updateTypeCase_ = 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"updateType_", "updateTypeCase_", e.class, af.class});
        }
        if (iOrdinal == 3) {
            return new ca();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new by(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ca> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ca.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public e getAddFavorite() {
        return this.updateTypeCase_ == 1 ? (e) this.updateType_ : e.getDefaultInstance();
    }

    public af getDeleteFavorite() {
        return this.updateTypeCase_ == 2 ? (af) this.updateType_ : af.getDefaultInstance();
    }

    public bz getUpdateTypeCase() {
        int i2 = this.updateTypeCase_;
        if (i2 == 0) {
            return bz.f32785c;
        }
        if (i2 == 1) {
            return bz.f32783a;
        }
        if (i2 != 2) {
            return null;
        }
        return bz.f32784b;
    }

    public boolean hasAddFavorite() {
        return this.updateTypeCase_ == 1;
    }

    public boolean hasDeleteFavorite() {
        return this.updateTypeCase_ == 2;
    }

    public static by newBuilder(ca caVar) {
        return (by) DEFAULT_INSTANCE.createBuilder(caVar);
    }

    public static ca parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ca) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ca parseFrom(com.google.v.v vVar, de deVar) {
        return (ca) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ca parseFrom(com.google.v.z zVar) {
        return (ca) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ca parseFrom(com.google.v.z zVar, de deVar) {
        return (ca) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ca parseFrom(InputStream inputStream) {
        return (ca) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ca parseFrom(InputStream inputStream, de deVar) {
        return (ca) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ca parseFrom(ByteBuffer byteBuffer) {
        return (ca) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ca parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ca) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ca parseFrom(byte[] bArr) {
        return (ca) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ca parseFrom(byte[] bArr, de deVar) {
        return (ca) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
