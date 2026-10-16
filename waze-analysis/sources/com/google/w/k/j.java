package com.google.w.k;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class j extends du<j, i> implements k {
    private static final j DEFAULT_INSTANCE;
    private static volatile fo<j> PARSER = null;
    public static final int QUALIFIERS_FIELD_NUMBER = 1;
    private eo<g> qualifiers_ = emptyProtobufList();

    static {
        j jVar = new j();
        DEFAULT_INSTANCE = jVar;
        du.registerDefaultInstance(j.class, jVar);
    }

    private j() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllQualifiers(Iterable<? extends g> iterable) {
        ensureQualifiersIsMutable();
        com.google.v.c.addAll(iterable, this.qualifiers_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addQualifiers(int i2, g gVar) {
        Objects.requireNonNull(gVar);
        ensureQualifiersIsMutable();
        this.qualifiers_.add(i2, gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQualifiers() {
        this.qualifiers_ = emptyProtobufList();
    }

    private void ensureQualifiersIsMutable() {
        eo<g> eoVar = this.qualifiers_;
        if (eoVar.c()) {
            return;
        }
        this.qualifiers_ = du.mutableCopy(eoVar);
    }

    public static j getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static i newBuilder() {
        return (i) DEFAULT_INSTANCE.createBuilder();
    }

    public static j parseDelimitedFrom(InputStream inputStream) {
        return (j) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static j parseFrom(com.google.v.v vVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<j> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeQualifiers(int i2) {
        ensureQualifiersIsMutable();
        this.qualifiers_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQualifiers(int i2, g gVar) {
        Objects.requireNonNull(gVar);
        ensureQualifiersIsMutable();
        this.qualifiers_.set(i2, gVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"qualifiers_", g.class});
        }
        if (iOrdinal == 3) {
            return new j();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new i(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<j> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (j.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public g getQualifiers(int i2) {
        return this.qualifiers_.get(i2);
    }

    public int getQualifiersCount() {
        return this.qualifiers_.size();
    }

    public List<g> getQualifiersList() {
        return this.qualifiers_;
    }

    public h getQualifiersOrBuilder(int i2) {
        return this.qualifiers_.get(i2);
    }

    public List<? extends h> getQualifiersOrBuilderList() {
        return this.qualifiers_;
    }

    public static i newBuilder(j jVar) {
        return (i) DEFAULT_INSTANCE.createBuilder(jVar);
    }

    public static j parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (j) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static j parseFrom(com.google.v.v vVar, de deVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static j parseFrom(com.google.v.z zVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static j parseFrom(com.google.v.z zVar, de deVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addQualifiers(g gVar) {
        Objects.requireNonNull(gVar);
        ensureQualifiersIsMutable();
        this.qualifiers_.add(gVar);
    }

    public static j parseFrom(InputStream inputStream) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static j parseFrom(InputStream inputStream, de deVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static j parseFrom(ByteBuffer byteBuffer) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static j parseFrom(byte[] bArr) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static j parseFrom(byte[] bArr, de deVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
