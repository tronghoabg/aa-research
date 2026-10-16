package com.google.android.libraries.phenotype.client.stable;

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
/* loaded from: classes4.dex */
public final class v extends du<v, u> implements fj {
    public static final int CONFIG_PACKAGES_FIELD_NUMBER = 1;
    private static final v DEFAULT_INSTANCE;
    private static volatile fo<v> PARSER;
    private eo<String> configPackages_ = emptyProtobufList();

    static {
        v vVar = new v();
        DEFAULT_INSTANCE = vVar;
        du.registerDefaultInstance(v.class, vVar);
    }

    private v() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllConfigPackages(Iterable<String> iterable) {
        ensureConfigPackagesIsMutable();
        com.google.v.c.addAll(iterable, this.configPackages_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addConfigPackages(String str) {
        Objects.requireNonNull(str);
        ensureConfigPackagesIsMutable();
        this.configPackages_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addConfigPackagesBytes(com.google.v.v vVar) {
        ensureConfigPackagesIsMutable();
        this.configPackages_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConfigPackages() {
        this.configPackages_ = emptyProtobufList();
    }

    private void ensureConfigPackagesIsMutable() {
        eo<String> eoVar = this.configPackages_;
        if (eoVar.c()) {
            return;
        }
        this.configPackages_ = du.mutableCopy(eoVar);
    }

    public static v getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static u newBuilder() {
        return (u) DEFAULT_INSTANCE.createBuilder();
    }

    public static v parseDelimitedFrom(InputStream inputStream) {
        return (v) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static v parseFrom(com.google.v.v vVar) {
        return (v) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<v> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConfigPackages(int i2, String str) {
        Objects.requireNonNull(str);
        ensureConfigPackagesIsMutable();
        this.configPackages_.set(i2, str);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"configPackages_"});
        }
        if (iOrdinal == 3) {
            return new v();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new u(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<v> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (v.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getConfigPackages(int i2) {
        return this.configPackages_.get(i2);
    }

    public com.google.v.v getConfigPackagesBytes(int i2) {
        return com.google.v.v.s(this.configPackages_.get(i2));
    }

    public int getConfigPackagesCount() {
        return this.configPackages_.size();
    }

    public List<String> getConfigPackagesList() {
        return this.configPackages_;
    }

    public static u newBuilder(v vVar) {
        return (u) DEFAULT_INSTANCE.createBuilder(vVar);
    }

    public static v parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (v) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static v parseFrom(com.google.v.v vVar, de deVar) {
        return (v) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static v parseFrom(com.google.v.z zVar) {
        return (v) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static v parseFrom(com.google.v.z zVar, de deVar) {
        return (v) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static v parseFrom(InputStream inputStream) {
        return (v) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static v parseFrom(InputStream inputStream, de deVar) {
        return (v) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static v parseFrom(ByteBuffer byteBuffer) {
        return (v) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static v parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (v) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static v parseFrom(byte[] bArr) {
        return (v) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static v parseFrom(byte[] bArr, de deVar) {
        return (v) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
