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
public final class bz extends du<bz, bv> implements fj {
    private static final bz DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile fo<bz> PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private eo<bx> keyInfo_ = emptyProtobufList();
    private int primaryKeyId_;

    static {
        bz bzVar = new bz();
        DEFAULT_INSTANCE = bzVar;
        du.registerDefaultInstance(bz.class, bzVar);
    }

    private bz() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllKeyInfo(Iterable<? extends bx> iterable) {
        ensureKeyInfoIsMutable();
        com.google.v.c.addAll(iterable, this.keyInfo_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addKeyInfo(int i2, bx bxVar) {
        Objects.requireNonNull(bxVar);
        ensureKeyInfoIsMutable();
        this.keyInfo_.add(i2, bxVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeyInfo() {
        this.keyInfo_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrimaryKeyId() {
        this.primaryKeyId_ = 0;
    }

    private void ensureKeyInfoIsMutable() {
        eo<bx> eoVar = this.keyInfo_;
        if (eoVar.c()) {
            return;
        }
        this.keyInfo_ = du.mutableCopy(eoVar);
    }

    public static bz getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bv newBuilder() {
        return (bv) DEFAULT_INSTANCE.createBuilder();
    }

    public static bz parseDelimitedFrom(InputStream inputStream) {
        return (bz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bz parseFrom(com.google.v.v vVar) {
        return (bz) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<bz> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeKeyInfo(int i2) {
        ensureKeyInfoIsMutable();
        this.keyInfo_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyInfo(int i2, bx bxVar) {
        Objects.requireNonNull(bxVar);
        ensureKeyInfoIsMutable();
        this.keyInfo_.set(i2, bxVar);
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", bx.class});
        }
        if (iOrdinal == 3) {
            return new bz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bv(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<bz> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bz.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bx getKeyInfo(int i2) {
        return this.keyInfo_.get(i2);
    }

    public int getKeyInfoCount() {
        return this.keyInfo_.size();
    }

    public List<bx> getKeyInfoList() {
        return this.keyInfo_;
    }

    public by getKeyInfoOrBuilder(int i2) {
        return this.keyInfo_.get(i2);
    }

    public List<? extends by> getKeyInfoOrBuilderList() {
        return this.keyInfo_;
    }

    public int getPrimaryKeyId() {
        return this.primaryKeyId_;
    }

    public static bv newBuilder(bz bzVar) {
        return (bv) DEFAULT_INSTANCE.createBuilder(bzVar);
    }

    public static bz parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (bz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bz parseFrom(com.google.v.v vVar, de deVar) {
        return (bz) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bz parseFrom(com.google.v.z zVar) {
        return (bz) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bz parseFrom(com.google.v.z zVar, de deVar) {
        return (bz) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addKeyInfo(bx bxVar) {
        Objects.requireNonNull(bxVar);
        ensureKeyInfoIsMutable();
        this.keyInfo_.add(bxVar);
    }

    public static bz parseFrom(InputStream inputStream) {
        return (bz) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bz parseFrom(InputStream inputStream, de deVar) {
        return (bz) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bz parseFrom(ByteBuffer byteBuffer) {
        return (bz) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bz parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (bz) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bz parseFrom(byte[] bArr) {
        return (bz) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bz parseFrom(byte[] bArr, de deVar) {
        return (bz) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
