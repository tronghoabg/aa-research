package com.google.k.e;

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
/* loaded from: classes5.dex */
public final class b extends du<b, a> implements fj {
    public static final int CANONICAL_GCONCEPTS_FIELD_NUMBER = 1;
    private static final b DEFAULT_INSTANCE;
    private static volatile fo<b> PARSER;
    private eo<d> canonicalGconcepts_ = emptyProtobufList();

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        du.registerDefaultInstance(b.class, bVar);
    }

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCanonicalGconcepts(Iterable<? extends d> iterable) {
        ensureCanonicalGconceptsIsMutable();
        com.google.v.c.addAll(iterable, this.canonicalGconcepts_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCanonicalGconcepts(int i2, d dVar) {
        Objects.requireNonNull(dVar);
        ensureCanonicalGconceptsIsMutable();
        this.canonicalGconcepts_.add(i2, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCanonicalGconcepts() {
        this.canonicalGconcepts_ = emptyProtobufList();
    }

    private void ensureCanonicalGconceptsIsMutable() {
        eo<d> eoVar = this.canonicalGconcepts_;
        if (eoVar.c()) {
            return;
        }
        this.canonicalGconcepts_ = du.mutableCopy(eoVar);
    }

    public static b getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static b parseDelimitedFrom(InputStream inputStream) {
        return (b) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static b parseFrom(v vVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<b> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeCanonicalGconcepts(int i2) {
        ensureCanonicalGconceptsIsMutable();
        this.canonicalGconcepts_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCanonicalGconcepts(int i2, d dVar) {
        Objects.requireNonNull(dVar);
        ensureCanonicalGconceptsIsMutable();
        this.canonicalGconcepts_.set(i2, dVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"canonicalGconcepts_", d.class});
        }
        if (iOrdinal == 3) {
            return new b();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new a(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<b> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (b.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public d getCanonicalGconcepts(int i2) {
        return this.canonicalGconcepts_.get(i2);
    }

    public int getCanonicalGconceptsCount() {
        return this.canonicalGconcepts_.size();
    }

    public List<d> getCanonicalGconceptsList() {
        return this.canonicalGconcepts_;
    }

    public e getCanonicalGconceptsOrBuilder(int i2) {
        return this.canonicalGconcepts_.get(i2);
    }

    public List<? extends e> getCanonicalGconceptsOrBuilderList() {
        return this.canonicalGconcepts_;
    }

    public static a newBuilder(b bVar) {
        return (a) DEFAULT_INSTANCE.createBuilder(bVar);
    }

    public static b parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (b) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static b parseFrom(v vVar, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static b parseFrom(z zVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static b parseFrom(z zVar, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCanonicalGconcepts(d dVar) {
        Objects.requireNonNull(dVar);
        ensureCanonicalGconceptsIsMutable();
        this.canonicalGconcepts_.add(dVar);
    }

    public static b parseFrom(InputStream inputStream) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static b parseFrom(InputStream inputStream, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static b parseFrom(ByteBuffer byteBuffer) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static b parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static b parseFrom(byte[] bArr) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static b parseFrom(byte[] bArr, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
