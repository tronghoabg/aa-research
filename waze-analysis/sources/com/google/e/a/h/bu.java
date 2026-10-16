package com.google.e.a.h;

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
public final class bu extends du<bu, bq> implements fj {
    private static final bu DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile fo<bu> PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private eo<bs> key_ = emptyProtobufList();
    private int primaryKeyId_;

    static {
        bu buVar = new bu();
        DEFAULT_INSTANCE = buVar;
        du.registerDefaultInstance(bu.class, buVar);
    }

    private bu() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllKey(Iterable<? extends bs> iterable) {
        ensureKeyIsMutable();
        com.google.v.c.addAll(iterable, this.key_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addKey(int i2, bs bsVar) {
        Objects.requireNonNull(bsVar);
        ensureKeyIsMutable();
        this.key_.add(i2, bsVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKey() {
        this.key_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrimaryKeyId() {
        this.primaryKeyId_ = 0;
    }

    private void ensureKeyIsMutable() {
        eo<bs> eoVar = this.key_;
        if (eoVar.c()) {
            return;
        }
        this.key_ = du.mutableCopy(eoVar);
    }

    public static bu getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bq newBuilder() {
        return (bq) DEFAULT_INSTANCE.createBuilder();
    }

    public static bu parseDelimitedFrom(InputStream inputStream) {
        return (bu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bu parseFrom(com.google.v.v vVar) {
        return (bu) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<bu> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeKey(int i2) {
        ensureKeyIsMutable();
        this.key_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKey(int i2, bs bsVar) {
        Objects.requireNonNull(bsVar);
        ensureKeyIsMutable();
        this.key_.set(i2, bsVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrimaryKeyId(int i2) {
        this.primaryKeyId_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", bs.class});
        }
        if (iOrdinal == 3) {
            return new bu();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bq(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<bu> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bu.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bs getKey(int i2) {
        return this.key_.get(i2);
    }

    public int getKeyCount() {
        return this.key_.size();
    }

    public List<bs> getKeyList() {
        return this.key_;
    }

    public bt getKeyOrBuilder(int i2) {
        return this.key_.get(i2);
    }

    public List<? extends bt> getKeyOrBuilderList() {
        return this.key_;
    }

    public int getPrimaryKeyId() {
        return this.primaryKeyId_;
    }

    public static bq newBuilder(bu buVar) {
        return (bq) DEFAULT_INSTANCE.createBuilder(buVar);
    }

    public static bu parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (bu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bu parseFrom(com.google.v.v vVar, de deVar) {
        return (bu) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bu parseFrom(com.google.v.z zVar) {
        return (bu) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bu parseFrom(com.google.v.z zVar, de deVar) {
        return (bu) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addKey(bs bsVar) {
        Objects.requireNonNull(bsVar);
        ensureKeyIsMutable();
        this.key_.add(bsVar);
    }

    public static bu parseFrom(InputStream inputStream) {
        return (bu) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bu parseFrom(InputStream inputStream, de deVar) {
        return (bu) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bu parseFrom(ByteBuffer byteBuffer) {
        return (bu) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bu parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (bu) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bu parseFrom(byte[] bArr) {
        return (bu) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bu parseFrom(byte[] bArr, de deVar) {
        return (bu) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
