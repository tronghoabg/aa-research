package com.google.c.a.a;

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
/* loaded from: classes4.dex */
public final class e extends du<e, a> implements fj {
    public static final int CHANGE_FIELD_NUMBER = 1;
    private static final e DEFAULT_INSTANCE;
    private static volatile fo<e> PARSER;
    private eo<c> change_ = emptyProtobufList();

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        du.registerDefaultInstance(e.class, eVar);
    }

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllChange(Iterable<? extends c> iterable) {
        ensureChangeIsMutable();
        com.google.v.c.addAll(iterable, this.change_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addChange(int i2, c cVar) {
        Objects.requireNonNull(cVar);
        ensureChangeIsMutable();
        this.change_.add(i2, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChange() {
        this.change_ = emptyProtobufList();
    }

    private void ensureChangeIsMutable() {
        eo<c> eoVar = this.change_;
        if (eoVar.c()) {
            return;
        }
        this.change_ = du.mutableCopy(eoVar);
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

    public static e parseFrom(v vVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<e> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeChange(int i2) {
        ensureChangeIsMutable();
        this.change_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChange(int i2, c cVar) {
        Objects.requireNonNull(cVar);
        ensureChangeIsMutable();
        this.change_.set(i2, cVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"change_", c.class});
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

    public c getChange(int i2) {
        return this.change_.get(i2);
    }

    public int getChangeCount() {
        return this.change_.size();
    }

    public List<c> getChangeList() {
        return this.change_;
    }

    public d getChangeOrBuilder(int i2) {
        return this.change_.get(i2);
    }

    public List<? extends d> getChangeOrBuilderList() {
        return this.change_;
    }

    public static a newBuilder(e eVar) {
        return (a) DEFAULT_INSTANCE.createBuilder(eVar);
    }

    public static e parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (e) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static e parseFrom(v vVar, de deVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static e parseFrom(z zVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static e parseFrom(z zVar, de deVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addChange(c cVar) {
        Objects.requireNonNull(cVar);
        ensureChangeIsMutable();
        this.change_.add(cVar);
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
