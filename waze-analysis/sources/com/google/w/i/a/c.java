package com.google.w.i.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c extends du<c, b> implements d {
    private static final c DEFAULT_INSTANCE;
    private static volatile fo<c> PARSER = null;
    public static final int REGIONS_FIELD_NUMBER = 1;
    public static final int REGION_TYPE_FIELD_NUMBER = 2;
    private int regionType_;
    private eo<String> regions_ = emptyProtobufList();

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        du.registerDefaultInstance(c.class, cVar);
    }

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRegions(Iterable<String> iterable) {
        ensureRegionsIsMutable();
        com.google.v.c.addAll(iterable, this.regions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRegions(String str) {
        Objects.requireNonNull(str);
        ensureRegionsIsMutable();
        this.regions_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRegionsBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        ensureRegionsIsMutable();
        this.regions_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegionType() {
        this.regionType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegions() {
        this.regions_ = emptyProtobufList();
    }

    private void ensureRegionsIsMutable() {
        eo<String> eoVar = this.regions_;
        if (eoVar.c()) {
            return;
        }
        this.regions_ = du.mutableCopy(eoVar);
    }

    public static c getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static c parseDelimitedFrom(InputStream inputStream) {
        return (c) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static c parseFrom(v vVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<c> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegionType(a aVar) {
        this.regionType_ = aVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegionTypeValue(int i2) {
        this.regionType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegions(int i2, String str) {
        Objects.requireNonNull(str);
        ensureRegionsIsMutable();
        this.regions_.set(i2, str);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ț\u0002\f", new Object[]{"regions_", "regionType_"});
        }
        if (iOrdinal == 3) {
            return new c();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new b(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<c> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (c.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public a getRegionType() {
        int i2 = this.regionType_;
        a aVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : a.TRUSTED_LOCATION_VIEW_REGION_CODE : a.FRONTEND_REGION_CODE : a.UNKNOWN;
        return aVar == null ? a.UNRECOGNIZED : aVar;
    }

    public int getRegionTypeValue() {
        return this.regionType_;
    }

    public String getRegions(int i2) {
        return this.regions_.get(i2);
    }

    public v getRegionsBytes(int i2) {
        return v.s(this.regions_.get(i2));
    }

    public int getRegionsCount() {
        return this.regions_.size();
    }

    public List<String> getRegionsList() {
        return this.regions_;
    }

    public static b newBuilder(c cVar) {
        return (b) DEFAULT_INSTANCE.createBuilder(cVar);
    }

    public static c parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (c) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static c parseFrom(v vVar, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static c parseFrom(z zVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static c parseFrom(z zVar, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static c parseFrom(InputStream inputStream) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static c parseFrom(InputStream inputStream, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static c parseFrom(ByteBuffer byteBuffer) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static c parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static c parseFrom(byte[] bArr) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static c parseFrom(byte[] bArr, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
