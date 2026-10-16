package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ak extends com.google.v.du<ak, aj> implements com.google.v.fj {
    private static final ak DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ak> PARSER = null;
    public static final int SHELLS_FIELD_NUMBER = 1;
    private com.google.v.eo<ad> shells_ = emptyProtobufList();

    static {
        ak akVar = new ak();
        DEFAULT_INSTANCE = akVar;
        com.google.v.du.registerDefaultInstance(ak.class, akVar);
    }

    private ak() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllShells(Iterable<? extends ad> iterable) {
        ensureShellsIsMutable();
        com.google.v.c.addAll(iterable, this.shells_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addShells(int i2, ad adVar) {
        Objects.requireNonNull(adVar);
        ensureShellsIsMutable();
        this.shells_.add(i2, adVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShells() {
        this.shells_ = emptyProtobufList();
    }

    private void ensureShellsIsMutable() {
        com.google.v.eo<ad> eoVar = this.shells_;
        if (eoVar.c()) {
            return;
        }
        this.shells_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static ak getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static aj newBuilder() {
        return (aj) DEFAULT_INSTANCE.createBuilder();
    }

    public static ak parseDelimitedFrom(InputStream inputStream) {
        return (ak) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ak parseFrom(com.google.v.v vVar) {
        return (ak) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ak> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeShells(int i2) {
        ensureShellsIsMutable();
        this.shells_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShells(int i2, ad adVar) {
        Objects.requireNonNull(adVar);
        ensureShellsIsMutable();
        this.shells_.set(i2, adVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"shells_", ad.class});
        }
        if (iOrdinal == 3) {
            return new ak();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aj(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ak> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ak.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ad getShells(int i2) {
        return this.shells_.get(i2);
    }

    public int getShellsCount() {
        return this.shells_.size();
    }

    public List<ad> getShellsList() {
        return this.shells_;
    }

    public ae getShellsOrBuilder(int i2) {
        return this.shells_.get(i2);
    }

    public List<? extends ae> getShellsOrBuilderList() {
        return this.shells_;
    }

    public static aj newBuilder(ak akVar) {
        return (aj) DEFAULT_INSTANCE.createBuilder(akVar);
    }

    public static ak parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ak) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ak parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ak) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ak parseFrom(com.google.v.z zVar) {
        return (ak) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ak parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ak) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addShells(ad adVar) {
        Objects.requireNonNull(adVar);
        ensureShellsIsMutable();
        this.shells_.add(adVar);
    }

    public static ak parseFrom(InputStream inputStream) {
        return (ak) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ak parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ak) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ak parseFrom(ByteBuffer byteBuffer) {
        return (ak) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ak parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ak) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ak parseFrom(byte[] bArr) {
        return (ak) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ak parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ak) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
