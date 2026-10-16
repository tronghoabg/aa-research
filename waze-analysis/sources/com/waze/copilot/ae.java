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
public final class ae extends du<ae, ad> implements fj {
    public static final int CAR_ASSETS_FIELD_NUMBER = 1;
    private static final ae DEFAULT_INSTANCE;
    private static volatile fo<ae> PARSER;
    private eo<j> carAssets_ = emptyProtobufList();

    static {
        ae aeVar = new ae();
        DEFAULT_INSTANCE = aeVar;
        du.registerDefaultInstance(ae.class, aeVar);
    }

    private ae() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCarAssets(Iterable<? extends j> iterable) {
        ensureCarAssetsIsMutable();
        com.google.v.c.addAll(iterable, this.carAssets_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCarAssets(int i2, j jVar) {
        Objects.requireNonNull(jVar);
        ensureCarAssetsIsMutable();
        this.carAssets_.add(i2, jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCarAssets() {
        this.carAssets_ = emptyProtobufList();
    }

    private void ensureCarAssetsIsMutable() {
        eo<j> eoVar = this.carAssets_;
        if (eoVar.c()) {
            return;
        }
        this.carAssets_ = du.mutableCopy(eoVar);
    }

    public static ae getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ad newBuilder() {
        return (ad) DEFAULT_INSTANCE.createBuilder();
    }

    public static ae parseDelimitedFrom(InputStream inputStream) {
        return (ae) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ae parseFrom(com.google.v.v vVar) {
        return (ae) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ae> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeCarAssets(int i2) {
        ensureCarAssetsIsMutable();
        this.carAssets_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCarAssets(int i2, j jVar) {
        Objects.requireNonNull(jVar);
        ensureCarAssetsIsMutable();
        this.carAssets_.set(i2, jVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"carAssets_", j.class});
        }
        if (iOrdinal == 3) {
            return new ae();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ad(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ae> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ae.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public j getCarAssets(int i2) {
        return this.carAssets_.get(i2);
    }

    public int getCarAssetsCount() {
        return this.carAssets_.size();
    }

    public List<j> getCarAssetsList() {
        return this.carAssets_;
    }

    public k getCarAssetsOrBuilder(int i2) {
        return this.carAssets_.get(i2);
    }

    public List<? extends k> getCarAssetsOrBuilderList() {
        return this.carAssets_;
    }

    public static ad newBuilder(ae aeVar) {
        return (ad) DEFAULT_INSTANCE.createBuilder(aeVar);
    }

    public static ae parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ae) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ae parseFrom(com.google.v.v vVar, de deVar) {
        return (ae) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ae parseFrom(com.google.v.z zVar) {
        return (ae) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ae parseFrom(com.google.v.z zVar, de deVar) {
        return (ae) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCarAssets(j jVar) {
        Objects.requireNonNull(jVar);
        ensureCarAssetsIsMutable();
        this.carAssets_.add(jVar);
    }

    public static ae parseFrom(InputStream inputStream) {
        return (ae) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ae parseFrom(InputStream inputStream, de deVar) {
        return (ae) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ae parseFrom(ByteBuffer byteBuffer) {
        return (ae) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ae parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ae) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ae parseFrom(byte[] bArr) {
        return (ae) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ae parseFrom(byte[] bArr, de deVar) {
        return (ae) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
