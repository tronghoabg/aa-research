package com.google.w.s;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b extends du<b, a> implements fj {
    private static final b DEFAULT_INSTANCE;
    public static final int FEATURE_FIELD_NUMBER = 1;
    public static final int ONE_OF_GROUP_FIELD_NUMBER = 2;
    private static volatile fo<b> PARSER;
    private eo<String> feature_ = emptyProtobufList();
    private eo<g> oneOfGroup_ = emptyProtobufList();

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        du.registerDefaultInstance(b.class, bVar);
    }

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFeature(Iterable<String> iterable) {
        ensureFeatureIsMutable();
        com.google.v.c.addAll(iterable, this.feature_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOneOfGroup(Iterable<? extends g> iterable) {
        ensureOneOfGroupIsMutable();
        com.google.v.c.addAll(iterable, this.oneOfGroup_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFeature(String str) {
        Objects.requireNonNull(str);
        ensureFeatureIsMutable();
        this.feature_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFeatureBytes(v vVar) {
        ensureFeatureIsMutable();
        this.feature_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOneOfGroup(int i2, g gVar) {
        Objects.requireNonNull(gVar);
        ensureOneOfGroupIsMutable();
        this.oneOfGroup_.add(i2, gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeature() {
        this.feature_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOneOfGroup() {
        this.oneOfGroup_ = emptyProtobufList();
    }

    private void ensureFeatureIsMutable() {
        eo<String> eoVar = this.feature_;
        if (eoVar.c()) {
            return;
        }
        this.feature_ = du.mutableCopy(eoVar);
    }

    private void ensureOneOfGroupIsMutable() {
        eo<g> eoVar = this.oneOfGroup_;
        if (eoVar.c()) {
            return;
        }
        this.oneOfGroup_ = du.mutableCopy(eoVar);
    }

    public static b getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static b parseDelimitedFrom(InputStream inputStream) {
        return (b) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static b parseFrom(v vVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<b> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeOneOfGroup(int i2) {
        ensureOneOfGroupIsMutable();
        this.oneOfGroup_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeature(int i2, String str) {
        Objects.requireNonNull(str);
        ensureFeatureIsMutable();
        this.feature_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOneOfGroup(int i2, g gVar) {
        Objects.requireNonNull(gVar);
        ensureOneOfGroupIsMutable();
        this.oneOfGroup_.set(i2, gVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001a\u0002\u001b", new Object[]{"feature_", "oneOfGroup_", g.class});
        }
        if (iOrdinal == 3) {
            return new b();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new a(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<b> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (b.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getFeature(int i2) {
        return this.feature_.get(i2);
    }

    public v getFeatureBytes(int i2) {
        return v.s(this.feature_.get(i2));
    }

    public int getFeatureCount() {
        return this.feature_.size();
    }

    public List<String> getFeatureList() {
        return this.feature_;
    }

    public g getOneOfGroup(int i2) {
        return this.oneOfGroup_.get(i2);
    }

    public int getOneOfGroupCount() {
        return this.oneOfGroup_.size();
    }

    public List<g> getOneOfGroupList() {
        return this.oneOfGroup_;
    }

    public h getOneOfGroupOrBuilder(int i2) {
        return this.oneOfGroup_.get(i2);
    }

    public List<? extends h> getOneOfGroupOrBuilderList() {
        return this.oneOfGroup_;
    }

    public static a newBuilder(b bVar) {
        return (a) DEFAULT_INSTANCE.createBuilder(bVar);
    }

    public static b parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (b) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static b parseFrom(v vVar, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static b parseFrom(z zVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static b parseFrom(z zVar, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOneOfGroup(g gVar) {
        Objects.requireNonNull(gVar);
        ensureOneOfGroupIsMutable();
        this.oneOfGroup_.add(gVar);
    }

    public static b parseFrom(InputStream inputStream) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static b parseFrom(InputStream inputStream, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static b parseFrom(ByteBuffer byteBuffer) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static b parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static b parseFrom(byte[] bArr) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static b parseFrom(byte[] bArr, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
