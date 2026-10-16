package com.google.k.d.a.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.ds;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.gm;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class e extends du<e, d> implements fj {
    private static final e DEFAULT_INSTANCE;
    public static final int INSTANCE_FIELD_NUMBER = 1;
    public static final int MESSAGE_SET_EXTENSION_FIELD_NUMBER = 20497290;
    private static volatile fo<e> PARSER;
    public static final ds<com.google.w.n.a.b, e> messageSetExtension;
    private eo<b> instance_ = emptyProtobufList();

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        du.registerDefaultInstance(e.class, eVar);
        messageSetExtension = du.newSingularGeneratedExtension(com.google.w.n.a.b.getDefaultInstance(), getDefaultInstance(), getDefaultInstance(), null, MESSAGE_SET_EXTENSION_FIELD_NUMBER, gm.MESSAGE, e.class);
    }

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllInstance(Iterable<? extends b> iterable) {
        ensureInstanceIsMutable();
        com.google.v.c.addAll(iterable, this.instance_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addInstance(int i2, b bVar) {
        Objects.requireNonNull(bVar);
        ensureInstanceIsMutable();
        this.instance_.add(i2, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInstance() {
        this.instance_ = emptyProtobufList();
    }

    private void ensureInstanceIsMutable() {
        eo<b> eoVar = this.instance_;
        if (eoVar.c()) {
            return;
        }
        this.instance_ = du.mutableCopy(eoVar);
    }

    public static e getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static d newBuilder() {
        return (d) DEFAULT_INSTANCE.createBuilder();
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
    public void removeInstance(int i2) {
        ensureInstanceIsMutable();
        this.instance_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstance(int i2, b bVar) {
        Objects.requireNonNull(bVar);
        ensureInstanceIsMutable();
        this.instance_.set(i2, bVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"instance_", b.class});
        }
        if (iOrdinal == 3) {
            return new e();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new d(bArr);
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

    public b getInstance(int i2) {
        return this.instance_.get(i2);
    }

    public int getInstanceCount() {
        return this.instance_.size();
    }

    public List<b> getInstanceList() {
        return this.instance_;
    }

    public c getInstanceOrBuilder(int i2) {
        return this.instance_.get(i2);
    }

    public List<? extends c> getInstanceOrBuilderList() {
        return this.instance_;
    }

    public static d newBuilder(e eVar) {
        return (d) DEFAULT_INSTANCE.createBuilder(eVar);
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
    public void addInstance(b bVar) {
        Objects.requireNonNull(bVar);
        ensureInstanceIsMutable();
        this.instance_.add(bVar);
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
