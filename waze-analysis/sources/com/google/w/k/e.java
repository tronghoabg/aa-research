package com.google.w.k;

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
/* loaded from: classes5.dex */
public final class e extends du<e, a> implements fj {
    private static final e DEFAULT_INSTANCE;
    private static volatile fo<e> PARSER = null;
    public static final int PREDICATE_OBJS_FIELD_NUMBER = 1;
    private eo<c> predicateObjs_ = emptyProtobufList();

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        du.registerDefaultInstance(e.class, eVar);
    }

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPredicateObjs(Iterable<? extends c> iterable) {
        ensurePredicateObjsIsMutable();
        com.google.v.c.addAll(iterable, this.predicateObjs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPredicateObjs(int i2, c cVar) {
        Objects.requireNonNull(cVar);
        ensurePredicateObjsIsMutable();
        this.predicateObjs_.add(i2, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPredicateObjs() {
        this.predicateObjs_ = emptyProtobufList();
    }

    private void ensurePredicateObjsIsMutable() {
        eo<c> eoVar = this.predicateObjs_;
        if (eoVar.c()) {
            return;
        }
        this.predicateObjs_ = du.mutableCopy(eoVar);
    }

    public static e getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static e parseDelimitedFrom(InputStream inputStream) {
        return (e) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static e parseFrom(com.google.v.v vVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<e> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePredicateObjs(int i2) {
        ensurePredicateObjsIsMutable();
        this.predicateObjs_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPredicateObjs(int i2, c cVar) {
        Objects.requireNonNull(cVar);
        ensurePredicateObjsIsMutable();
        this.predicateObjs_.set(i2, cVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"predicateObjs_", c.class});
        }
        if (iOrdinal == 3) {
            return new e();
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
        fo<e> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (e.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public c getPredicateObjs(int i2) {
        return this.predicateObjs_.get(i2);
    }

    public int getPredicateObjsCount() {
        return this.predicateObjs_.size();
    }

    public List<c> getPredicateObjsList() {
        return this.predicateObjs_;
    }

    public d getPredicateObjsOrBuilder(int i2) {
        return this.predicateObjs_.get(i2);
    }

    public List<? extends d> getPredicateObjsOrBuilderList() {
        return this.predicateObjs_;
    }

    public static a newBuilder(e eVar) {
        return (a) DEFAULT_INSTANCE.createBuilder(eVar);
    }

    public static e parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (e) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static e parseFrom(com.google.v.v vVar, de deVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static e parseFrom(com.google.v.z zVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static e parseFrom(com.google.v.z zVar, de deVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPredicateObjs(c cVar) {
        Objects.requireNonNull(cVar);
        ensurePredicateObjsIsMutable();
        this.predicateObjs_.add(cVar);
    }

    public static e parseFrom(InputStream inputStream) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static e parseFrom(InputStream inputStream, de deVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static e parseFrom(ByteBuffer byteBuffer) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static e parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static e parseFrom(byte[] bArr) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static e parseFrom(byte[] bArr, de deVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
