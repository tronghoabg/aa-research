package com.waze.bm.a.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class m extends du<m, l> implements fj {
    public static final int CANDIDATES_FIELD_NUMBER = 1;
    private static final m DEFAULT_INSTANCE;
    private static volatile fo<m> PARSER;
    private eo<h> candidates_ = emptyProtobufList();

    static {
        m mVar = new m();
        DEFAULT_INSTANCE = mVar;
        du.registerDefaultInstance(m.class, mVar);
    }

    private m() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCandidates(Iterable<? extends h> iterable) {
        ensureCandidatesIsMutable();
        com.google.v.c.addAll(iterable, this.candidates_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCandidates(int i2, h hVar) {
        Objects.requireNonNull(hVar);
        ensureCandidatesIsMutable();
        this.candidates_.add(i2, hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCandidates() {
        this.candidates_ = emptyProtobufList();
    }

    private void ensureCandidatesIsMutable() {
        eo<h> eoVar = this.candidates_;
        if (eoVar.c()) {
            return;
        }
        this.candidates_ = du.mutableCopy(eoVar);
    }

    public static m getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static l newBuilder() {
        return (l) DEFAULT_INSTANCE.createBuilder();
    }

    public static m parseDelimitedFrom(InputStream inputStream) {
        return (m) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static m parseFrom(com.google.v.v vVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<m> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeCandidates(int i2) {
        ensureCandidatesIsMutable();
        this.candidates_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCandidates(int i2, h hVar) {
        Objects.requireNonNull(hVar);
        ensureCandidatesIsMutable();
        this.candidates_.set(i2, hVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"candidates_", h.class});
        }
        if (iOrdinal == 3) {
            return new m();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new l(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<m> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (m.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public h getCandidates(int i2) {
        return this.candidates_.get(i2);
    }

    public int getCandidatesCount() {
        return this.candidates_.size();
    }

    public List<h> getCandidatesList() {
        return this.candidates_;
    }

    public i getCandidatesOrBuilder(int i2) {
        return this.candidates_.get(i2);
    }

    public List<? extends i> getCandidatesOrBuilderList() {
        return this.candidates_;
    }

    public static l newBuilder(m mVar) {
        return (l) DEFAULT_INSTANCE.createBuilder(mVar);
    }

    public static m parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (m) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static m parseFrom(com.google.v.v vVar, de deVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static m parseFrom(com.google.v.z zVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static m parseFrom(com.google.v.z zVar, de deVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCandidates(h hVar) {
        Objects.requireNonNull(hVar);
        ensureCandidatesIsMutable();
        this.candidates_.add(hVar);
    }

    public static m parseFrom(InputStream inputStream) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static m parseFrom(InputStream inputStream, de deVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static m parseFrom(ByteBuffer byteBuffer) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static m parseFrom(byte[] bArr) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static m parseFrom(byte[] bArr, de deVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
