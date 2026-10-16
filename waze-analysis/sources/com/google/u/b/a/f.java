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
public final class f extends du<f, e> implements g {
    public static final int BASIS_FIELD_NUMBER = 1;
    private static final f DEFAULT_INSTANCE;
    public static final int OR_SPEC_FIELD_NUMBER = 2;
    private static volatile fo<f> PARSER;
    private static final el<b> basis_converter_ = new d(0);
    private ek basis_ = emptyIntList();
    private eo<k> orSpec_ = emptyProtobufList();

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        du.registerDefaultInstance(f.class, fVar);
    }

    private f() {
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
    public void addAllOrSpec(Iterable<? extends k> iterable) {
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
    public void addOrSpec(int i2, k kVar) {
        Objects.requireNonNull(kVar);
        ensureOrSpecIsMutable();
        this.orSpec_.add(i2, kVar);
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
        eo<k> eoVar = this.orSpec_;
        if (eoVar.c()) {
            return;
        }
        this.orSpec_ = du.mutableCopy(eoVar);
    }

    public static f getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static e newBuilder() {
        return (e) DEFAULT_INSTANCE.createBuilder();
    }

    public static f parseDelimitedFrom(InputStream inputStream) {
        return (f) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static f parseFrom(v vVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<f> parser() {
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
    public void setOrSpec(int i2, k kVar) {
        Objects.requireNonNull(kVar);
        ensureOrSpecIsMutable();
        this.orSpec_.set(i2, kVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001ࠞ\u0002\u001b", new Object[]{"basis_", a.f12605a, "orSpec_", k.class});
        }
        if (iOrdinal == 3) {
            return new f();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new e(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<f> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (f.class) {
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

    public k getOrSpec(int i2) {
        return this.orSpec_.get(i2);
    }

    public int getOrSpecCount() {
        return this.orSpec_.size();
    }

    public List<k> getOrSpecList() {
        return this.orSpec_;
    }

    public l getOrSpecOrBuilder(int i2) {
        return this.orSpec_.get(i2);
    }

    public List<? extends l> getOrSpecOrBuilderList() {
        return this.orSpec_;
    }

    public static e newBuilder(f fVar) {
        return (e) DEFAULT_INSTANCE.createBuilder(fVar);
    }

    public static f parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (f) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static f parseFrom(v vVar, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static f parseFrom(z zVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static f parseFrom(z zVar, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOrSpec(k kVar) {
        Objects.requireNonNull(kVar);
        ensureOrSpecIsMutable();
        this.orSpec_.add(kVar);
    }

    public static f parseFrom(InputStream inputStream) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static f parseFrom(InputStream inputStream, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static f parseFrom(ByteBuffer byteBuffer) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static f parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static f parseFrom(byte[] bArr) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static f parseFrom(byte[] bArr, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
