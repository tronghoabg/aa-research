package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ad extends com.google.v.du<ad, ac> implements ae {
    private static final ad DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ad> PARSER = null;
    public static final int SURFACES_FIELD_NUMBER = 1;
    private com.google.v.eo<am> surfaces_ = emptyProtobufList();

    static {
        ad adVar = new ad();
        DEFAULT_INSTANCE = adVar;
        com.google.v.du.registerDefaultInstance(ad.class, adVar);
    }

    private ad() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSurfaces(Iterable<? extends am> iterable) {
        ensureSurfacesIsMutable();
        com.google.v.c.addAll(iterable, this.surfaces_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSurfaces(int i2, am amVar) {
        Objects.requireNonNull(amVar);
        ensureSurfacesIsMutable();
        this.surfaces_.add(i2, amVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSurfaces() {
        this.surfaces_ = emptyProtobufList();
    }

    private void ensureSurfacesIsMutable() {
        com.google.v.eo<am> eoVar = this.surfaces_;
        if (eoVar.c()) {
            return;
        }
        this.surfaces_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static ad getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ac newBuilder() {
        return (ac) DEFAULT_INSTANCE.createBuilder();
    }

    public static ad parseDelimitedFrom(InputStream inputStream) {
        return (ad) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ad parseFrom(com.google.v.v vVar) {
        return (ad) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ad> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSurfaces(int i2) {
        ensureSurfacesIsMutable();
        this.surfaces_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSurfaces(int i2, am amVar) {
        Objects.requireNonNull(amVar);
        ensureSurfacesIsMutable();
        this.surfaces_.set(i2, amVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"surfaces_", am.class});
        }
        if (iOrdinal == 3) {
            return new ad();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ac(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ad> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ad.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public am getSurfaces(int i2) {
        return this.surfaces_.get(i2);
    }

    public int getSurfacesCount() {
        return this.surfaces_.size();
    }

    public List<am> getSurfacesList() {
        return this.surfaces_;
    }

    public an getSurfacesOrBuilder(int i2) {
        return this.surfaces_.get(i2);
    }

    public List<? extends an> getSurfacesOrBuilderList() {
        return this.surfaces_;
    }

    public static ac newBuilder(ad adVar) {
        return (ac) DEFAULT_INSTANCE.createBuilder(adVar);
    }

    public static ad parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ad) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ad parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ad) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ad parseFrom(com.google.v.z zVar) {
        return (ad) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ad parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ad) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSurfaces(am amVar) {
        Objects.requireNonNull(amVar);
        ensureSurfacesIsMutable();
        this.surfaces_.add(amVar);
    }

    public static ad parseFrom(InputStream inputStream) {
        return (ad) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ad parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ad) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ad parseFrom(ByteBuffer byteBuffer) {
        return (ad) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ad parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ad) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ad parseFrom(byte[] bArr) {
        return (ad) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ad parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ad) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
