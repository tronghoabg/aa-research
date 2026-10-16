package com.waze.ap.b;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class h extends du<h, g> implements fj {
    private static final h DEFAULT_INSTANCE;
    public static final int LIVE_MATCHES_FIELD_NUMBER = 1;
    private static volatile fo<h> PARSER;
    private eo<com.waze.ap.a.b.b> liveMatches_ = emptyProtobufList();

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        du.registerDefaultInstance(h.class, hVar);
    }

    private h() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLiveMatches(Iterable<? extends com.waze.ap.a.b.b> iterable) {
        ensureLiveMatchesIsMutable();
        com.google.v.c.addAll(iterable, this.liveMatches_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLiveMatches(int i2, com.waze.ap.a.b.b bVar) {
        Objects.requireNonNull(bVar);
        ensureLiveMatchesIsMutable();
        this.liveMatches_.add(i2, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLiveMatches() {
        this.liveMatches_ = emptyProtobufList();
    }

    private void ensureLiveMatchesIsMutable() {
        eo<com.waze.ap.a.b.b> eoVar = this.liveMatches_;
        if (eoVar.c()) {
            return;
        }
        this.liveMatches_ = du.mutableCopy(eoVar);
    }

    public static h getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static g newBuilder() {
        return (g) DEFAULT_INSTANCE.createBuilder();
    }

    public static h parseDelimitedFrom(InputStream inputStream) {
        return (h) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static h parseFrom(v vVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<h> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLiveMatches(int i2) {
        ensureLiveMatchesIsMutable();
        this.liveMatches_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLiveMatches(int i2, com.waze.ap.a.b.b bVar) {
        Objects.requireNonNull(bVar);
        ensureLiveMatchesIsMutable();
        this.liveMatches_.set(i2, bVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"liveMatches_", com.waze.ap.a.b.b.class});
        }
        if (iOrdinal == 3) {
            return new h();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new g(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<h> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (h.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public com.waze.ap.a.b.b getLiveMatches(int i2) {
        return this.liveMatches_.get(i2);
    }

    public int getLiveMatchesCount() {
        return this.liveMatches_.size();
    }

    public List<com.waze.ap.a.b.b> getLiveMatchesList() {
        return this.liveMatches_;
    }

    public com.waze.ap.a.b.c getLiveMatchesOrBuilder(int i2) {
        return this.liveMatches_.get(i2);
    }

    public List<? extends com.waze.ap.a.b.c> getLiveMatchesOrBuilderList() {
        return this.liveMatches_;
    }

    public static g newBuilder(h hVar) {
        return (g) DEFAULT_INSTANCE.createBuilder(hVar);
    }

    public static h parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (h) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static h parseFrom(v vVar, de deVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static h parseFrom(z zVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static h parseFrom(z zVar, de deVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLiveMatches(com.waze.ap.a.b.b bVar) {
        Objects.requireNonNull(bVar);
        ensureLiveMatchesIsMutable();
        this.liveMatches_.add(bVar);
    }

    public static h parseFrom(InputStream inputStream) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static h parseFrom(InputStream inputStream, de deVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static h parseFrom(ByteBuffer byteBuffer) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static h parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static h parseFrom(byte[] bArr) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static h parseFrom(byte[] bArr, de deVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
