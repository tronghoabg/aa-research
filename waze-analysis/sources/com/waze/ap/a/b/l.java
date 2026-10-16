package com.waze.ap.a.b;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class l extends du<l, j> implements fj {
    private static final l DEFAULT_INSTANCE;
    public static final int INFRACTION_FIELD_NUMBER = 3;
    public static final int LIFECYCLE_FIELD_NUMBER = 1;
    private static volatile fo<l> PARSER = null;
    public static final int SCORE_FIELD_NUMBER = 2;
    private int soccerEventDetailsCase_ = 0;
    private Object soccerEventDetails_;

    static {
        l lVar = new l();
        DEFAULT_INSTANCE = lVar;
        du.registerDefaultInstance(l.class, lVar);
    }

    private l() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInfraction() {
        if (this.soccerEventDetailsCase_ == 3) {
            this.soccerEventDetailsCase_ = 0;
            this.soccerEventDetails_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLifecycle() {
        if (this.soccerEventDetailsCase_ == 1) {
            this.soccerEventDetailsCase_ = 0;
            this.soccerEventDetails_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScore() {
        if (this.soccerEventDetailsCase_ == 2) {
            this.soccerEventDetailsCase_ = 0;
            this.soccerEventDetails_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSoccerEventDetails() {
        this.soccerEventDetailsCase_ = 0;
        this.soccerEventDetails_ = null;
    }

    public static l getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInfraction(o oVar) {
        Objects.requireNonNull(oVar);
        if (this.soccerEventDetailsCase_ == 3 && this.soccerEventDetails_ != o.getDefaultInstance()) {
            m mVarNewBuilder = o.newBuilder((o) this.soccerEventDetails_);
            mVarNewBuilder.mergeFrom((m) oVar);
            oVar = mVarNewBuilder.buildPartial();
        }
        this.soccerEventDetails_ = oVar;
        this.soccerEventDetailsCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLifecycle(r rVar) {
        Objects.requireNonNull(rVar);
        if (this.soccerEventDetailsCase_ == 1 && this.soccerEventDetails_ != r.getDefaultInstance()) {
            p pVarNewBuilder = r.newBuilder((r) this.soccerEventDetails_);
            pVarNewBuilder.mergeFrom((p) rVar);
            rVar = pVarNewBuilder.buildPartial();
        }
        this.soccerEventDetails_ = rVar;
        this.soccerEventDetailsCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeScore(t tVar) {
        Objects.requireNonNull(tVar);
        if (this.soccerEventDetailsCase_ == 2 && this.soccerEventDetails_ != t.getDefaultInstance()) {
            s sVarNewBuilder = t.newBuilder((t) this.soccerEventDetails_);
            sVarNewBuilder.mergeFrom((s) tVar);
            tVar = sVarNewBuilder.buildPartial();
        }
        this.soccerEventDetails_ = tVar;
        this.soccerEventDetailsCase_ = 2;
    }

    public static j newBuilder() {
        return (j) DEFAULT_INSTANCE.createBuilder();
    }

    public static l parseDelimitedFrom(InputStream inputStream) {
        return (l) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static l parseFrom(com.google.v.v vVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<l> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInfraction(o oVar) {
        Objects.requireNonNull(oVar);
        this.soccerEventDetails_ = oVar;
        this.soccerEventDetailsCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLifecycle(r rVar) {
        Objects.requireNonNull(rVar);
        this.soccerEventDetails_ = rVar;
        this.soccerEventDetailsCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScore(t tVar) {
        Objects.requireNonNull(tVar);
        this.soccerEventDetails_ = tVar;
        this.soccerEventDetailsCase_ = 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"soccerEventDetails_", "soccerEventDetailsCase_", r.class, t.class, o.class});
        }
        if (iOrdinal == 3) {
            return new l();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new j(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<l> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (l.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public o getInfraction() {
        return this.soccerEventDetailsCase_ == 3 ? (o) this.soccerEventDetails_ : o.getDefaultInstance();
    }

    public r getLifecycle() {
        return this.soccerEventDetailsCase_ == 1 ? (r) this.soccerEventDetails_ : r.getDefaultInstance();
    }

    public t getScore() {
        return this.soccerEventDetailsCase_ == 2 ? (t) this.soccerEventDetails_ : t.getDefaultInstance();
    }

    public k getSoccerEventDetailsCase() {
        int i2 = this.soccerEventDetailsCase_;
        if (i2 == 0) {
            return k.f14987d;
        }
        if (i2 == 1) {
            return k.f14984a;
        }
        if (i2 == 2) {
            return k.f14985b;
        }
        if (i2 != 3) {
            return null;
        }
        return k.f14986c;
    }

    public boolean hasInfraction() {
        return this.soccerEventDetailsCase_ == 3;
    }

    public boolean hasLifecycle() {
        return this.soccerEventDetailsCase_ == 1;
    }

    public boolean hasScore() {
        return this.soccerEventDetailsCase_ == 2;
    }

    public static j newBuilder(l lVar) {
        return (j) DEFAULT_INSTANCE.createBuilder(lVar);
    }

    public static l parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (l) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static l parseFrom(com.google.v.v vVar, de deVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static l parseFrom(z zVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static l parseFrom(z zVar, de deVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static l parseFrom(InputStream inputStream) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static l parseFrom(InputStream inputStream, de deVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static l parseFrom(ByteBuffer byteBuffer) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static l parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static l parseFrom(byte[] bArr) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static l parseFrom(byte[] bArr, de deVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
