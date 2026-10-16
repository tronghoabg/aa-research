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
public final class q extends du<q, p> implements fj {
    public static final int ASSET_INFO_FIELD_NUMBER = 1;
    private static final q DEFAULT_INSTANCE;
    private static volatile fo<q> PARSER;
    private eo<n> assetInfo_ = emptyProtobufList();

    static {
        q qVar = new q();
        DEFAULT_INSTANCE = qVar;
        du.registerDefaultInstance(q.class, qVar);
    }

    private q() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAssetInfo(Iterable<? extends n> iterable) {
        ensureAssetInfoIsMutable();
        com.google.v.c.addAll(iterable, this.assetInfo_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAssetInfo(int i2, n nVar) {
        Objects.requireNonNull(nVar);
        ensureAssetInfoIsMutable();
        this.assetInfo_.add(i2, nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAssetInfo() {
        this.assetInfo_ = emptyProtobufList();
    }

    private void ensureAssetInfoIsMutable() {
        eo<n> eoVar = this.assetInfo_;
        if (eoVar.c()) {
            return;
        }
        this.assetInfo_ = du.mutableCopy(eoVar);
    }

    public static q getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static p newBuilder() {
        return (p) DEFAULT_INSTANCE.createBuilder();
    }

    public static q parseDelimitedFrom(InputStream inputStream) {
        return (q) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static q parseFrom(com.google.v.v vVar) {
        return (q) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<q> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAssetInfo(int i2) {
        ensureAssetInfoIsMutable();
        this.assetInfo_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAssetInfo(int i2, n nVar) {
        Objects.requireNonNull(nVar);
        ensureAssetInfoIsMutable();
        this.assetInfo_.set(i2, nVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"assetInfo_", n.class});
        }
        if (iOrdinal == 3) {
            return new q();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new p(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<q> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (q.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public n getAssetInfo(int i2) {
        return this.assetInfo_.get(i2);
    }

    public int getAssetInfoCount() {
        return this.assetInfo_.size();
    }

    public List<n> getAssetInfoList() {
        return this.assetInfo_;
    }

    public o getAssetInfoOrBuilder(int i2) {
        return this.assetInfo_.get(i2);
    }

    public List<? extends o> getAssetInfoOrBuilderList() {
        return this.assetInfo_;
    }

    public static p newBuilder(q qVar) {
        return (p) DEFAULT_INSTANCE.createBuilder(qVar);
    }

    public static q parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (q) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static q parseFrom(com.google.v.v vVar, de deVar) {
        return (q) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static q parseFrom(com.google.v.z zVar) {
        return (q) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static q parseFrom(com.google.v.z zVar, de deVar) {
        return (q) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAssetInfo(n nVar) {
        Objects.requireNonNull(nVar);
        ensureAssetInfoIsMutable();
        this.assetInfo_.add(nVar);
    }

    public static q parseFrom(InputStream inputStream) {
        return (q) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static q parseFrom(InputStream inputStream, de deVar) {
        return (q) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static q parseFrom(ByteBuffer byteBuffer) {
        return (q) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static q parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (q) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static q parseFrom(byte[] bArr) {
        return (q) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static q parseFrom(byte[] bArr, de deVar) {
        return (q) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
