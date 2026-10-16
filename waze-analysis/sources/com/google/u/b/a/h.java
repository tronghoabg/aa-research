package com.google.u.b.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.ek;
import com.google.v.el;
import com.google.v.em;
import com.google.v.eo;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class h extends du<h, c> implements fj {
    public static final int BASIS_FIELD_NUMBER = 1;
    private static final h DEFAULT_INSTANCE;
    public static final int OR_SPEC_FIELD_NUMBER = 2;
    private static volatile fo<h> PARSER;
    private static final el<b> basis_converter_ = new d(1);
    private ek basis_ = emptyIntList();
    private eo<m> orSpec_ = emptyProtobufList();

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        du.registerDefaultInstance(h.class, hVar);
    }

    private h() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllBasis(Iterable<? extends b> iterable) {
        ensureBasisIsMutable();
        Iterator<? extends b> it = iterable.iterator();
        while (it.hasNext()) {
            this.basis_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOrSpec(Iterable<? extends m> iterable) {
        ensureOrSpecIsMutable();
        com.google.v.c.addAll(iterable, this.orSpec_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBasis(b bVar) {
        Objects.requireNonNull(bVar);
        ensureBasisIsMutable();
        this.basis_.i(bVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOrSpec(int i2, m mVar) {
        Objects.requireNonNull(mVar);
        ensureOrSpecIsMutable();
        this.orSpec_.add(i2, mVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBasis() {
        this.basis_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOrSpec() {
        this.orSpec_ = emptyProtobufList();
    }

    private void ensureBasisIsMutable() {
        ek ekVar = this.basis_;
        if (ekVar.c()) {
            return;
        }
        this.basis_ = du.mutableCopy(ekVar);
    }

    private void ensureOrSpecIsMutable() {
        eo<m> eoVar = this.orSpec_;
        if (eoVar.c()) {
            return;
        }
        this.orSpec_ = du.mutableCopy(eoVar);
    }

    public static h getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static c newBuilder() {
        return (c) DEFAULT_INSTANCE.createBuilder();
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
    public void removeOrSpec(int i2) {
        ensureOrSpecIsMutable();
        this.orSpec_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBasis(int i2, b bVar) {
        Objects.requireNonNull(bVar);
        ensureBasisIsMutable();
        this.basis_.e(i2, bVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrSpec(int i2, m mVar) {
        Objects.requireNonNull(mVar);
        ensureOrSpecIsMutable();
        this.orSpec_.set(i2, mVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001ࠞ\u0002\u001b", new Object[]{"basis_", a.f12605a, "orSpec_", m.class});
        }
        if (iOrdinal == 3) {
            return new h();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new c(bArr);
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

    public b getBasis(int i2) {
        b bVarA = b.a(this.basis_.d(i2));
        return bVarA == null ? b.CB_NONE : bVarA;
    }

    public int getBasisCount() {
        return this.basis_.size();
    }

    public List<b> getBasisList() {
        return new em(this.basis_, basis_converter_);
    }

    public m getOrSpec(int i2) {
        return this.orSpec_.get(i2);
    }

    public int getOrSpecCount() {
        return this.orSpec_.size();
    }

    public List<m> getOrSpecList() {
        return this.orSpec_;
    }

    public n getOrSpecOrBuilder(int i2) {
        return this.orSpec_.get(i2);
    }

    public List<? extends n> getOrSpecOrBuilderList() {
        return this.orSpec_;
    }

    public static c newBuilder(h hVar) {
        return (c) DEFAULT_INSTANCE.createBuilder(hVar);
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
    public void addOrSpec(m mVar) {
        Objects.requireNonNull(mVar);
        ensureOrSpecIsMutable();
        this.orSpec_.add(mVar);
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
