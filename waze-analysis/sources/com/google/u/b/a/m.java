package com.google.u.b.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.ek;
import com.google.v.el;
import com.google.v.em;
import com.google.v.eo;
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
public final class m extends du<m, i> implements n {
    public static final int AND_SPEC_FIELD_NUMBER = 2;
    public static final int BASIS_FIELD_NUMBER = 1;
    private static final m DEFAULT_INSTANCE;
    private static volatile fo<m> PARSER;
    private static final el<b> basis_converter_ = new d(2);
    private ek basis_ = emptyIntList();
    private eo<f> andSpec_ = emptyProtobufList();

    static {
        m mVar = new m();
        DEFAULT_INSTANCE = mVar;
        du.registerDefaultInstance(m.class, mVar);
    }

    private m() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAndSpec(Iterable<? extends f> iterable) {
        ensureAndSpecIsMutable();
        com.google.v.c.addAll(iterable, this.andSpec_);
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
    public void addAndSpec(int i2, f fVar) {
        Objects.requireNonNull(fVar);
        ensureAndSpecIsMutable();
        this.andSpec_.add(i2, fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBasis(b bVar) {
        Objects.requireNonNull(bVar);
        ensureBasisIsMutable();
        this.basis_.i(bVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAndSpec() {
        this.andSpec_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBasis() {
        this.basis_ = emptyIntList();
    }

    private void ensureAndSpecIsMutable() {
        eo<f> eoVar = this.andSpec_;
        if (eoVar.c()) {
            return;
        }
        this.andSpec_ = du.mutableCopy(eoVar);
    }

    private void ensureBasisIsMutable() {
        ek ekVar = this.basis_;
        if (ekVar.c()) {
            return;
        }
        this.basis_ = du.mutableCopy(ekVar);
    }

    public static m getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static i newBuilder() {
        return (i) DEFAULT_INSTANCE.createBuilder();
    }

    public static m parseDelimitedFrom(InputStream inputStream) {
        return (m) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static m parseFrom(v vVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<m> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAndSpec(int i2) {
        ensureAndSpecIsMutable();
        this.andSpec_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAndSpec(int i2, f fVar) {
        Objects.requireNonNull(fVar);
        ensureAndSpecIsMutable();
        this.andSpec_.set(i2, fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBasis(int i2, b bVar) {
        Objects.requireNonNull(bVar);
        ensureBasisIsMutable();
        this.basis_.e(i2, bVar.getNumber());
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001ࠞ\u0002\u001b", new Object[]{"basis_", a.f12605a, "andSpec_", f.class});
        }
        if (iOrdinal == 3) {
            return new m();
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

    public f getAndSpec(int i2) {
        return this.andSpec_.get(i2);
    }

    public int getAndSpecCount() {
        return this.andSpec_.size();
    }

    public List<f> getAndSpecList() {
        return this.andSpec_;
    }

    public g getAndSpecOrBuilder(int i2) {
        return this.andSpec_.get(i2);
    }

    public List<? extends g> getAndSpecOrBuilderList() {
        return this.andSpec_;
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

    public static i newBuilder(m mVar) {
        return (i) DEFAULT_INSTANCE.createBuilder(mVar);
    }

    public static m parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (m) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static m parseFrom(v vVar, de deVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static m parseFrom(z zVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static m parseFrom(z zVar, de deVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAndSpec(f fVar) {
        Objects.requireNonNull(fVar);
        ensureAndSpecIsMutable();
        this.andSpec_.add(fVar);
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
