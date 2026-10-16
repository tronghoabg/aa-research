package com.waze.copilot;

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
public final class w extends du<w, r> implements fj {
    public static final int ASSETS_FIELD_NUMBER = 1;
    private static final w DEFAULT_INSTANCE;
    private static volatile fo<w> PARSER;
    private eo<u> assets_ = emptyProtobufList();

    static {
        w wVar = new w();
        DEFAULT_INSTANCE = wVar;
        du.registerDefaultInstance(w.class, wVar);
    }

    private w() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAssets(Iterable<? extends u> iterable) {
        ensureAssetsIsMutable();
        com.google.v.c.addAll(iterable, this.assets_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAssets(int i2, u uVar) {
        Objects.requireNonNull(uVar);
        ensureAssetsIsMutable();
        this.assets_.add(i2, uVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAssets() {
        this.assets_ = emptyProtobufList();
    }

    private void ensureAssetsIsMutable() {
        eo<u> eoVar = this.assets_;
        if (eoVar.c()) {
            return;
        }
        this.assets_ = du.mutableCopy(eoVar);
    }

    public static w getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static r newBuilder() {
        return (r) DEFAULT_INSTANCE.createBuilder();
    }

    public static w parseDelimitedFrom(InputStream inputStream) {
        return (w) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static w parseFrom(com.google.v.v vVar) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<w> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAssets(int i2) {
        ensureAssetsIsMutable();
        this.assets_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAssets(int i2, u uVar) {
        Objects.requireNonNull(uVar);
        ensureAssetsIsMutable();
        this.assets_.set(i2, uVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"assets_", u.class});
        }
        if (iOrdinal == 3) {
            return new w();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new r(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<w> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (w.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public u getAssets(int i2) {
        return this.assets_.get(i2);
    }

    public int getAssetsCount() {
        return this.assets_.size();
    }

    public List<u> getAssetsList() {
        return this.assets_;
    }

    public v getAssetsOrBuilder(int i2) {
        return this.assets_.get(i2);
    }

    public List<? extends v> getAssetsOrBuilderList() {
        return this.assets_;
    }

    public static r newBuilder(w wVar) {
        return (r) DEFAULT_INSTANCE.createBuilder(wVar);
    }

    public static w parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (w) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static w parseFrom(com.google.v.v vVar, de deVar) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static w parseFrom(com.google.v.z zVar) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static w parseFrom(com.google.v.z zVar, de deVar) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAssets(u uVar) {
        Objects.requireNonNull(uVar);
        ensureAssetsIsMutable();
        this.assets_.add(uVar);
    }

    public static w parseFrom(InputStream inputStream) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static w parseFrom(InputStream inputStream, de deVar) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static w parseFrom(ByteBuffer byteBuffer) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static w parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static w parseFrom(byte[] bArr) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static w parseFrom(byte[] bArr, de deVar) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
