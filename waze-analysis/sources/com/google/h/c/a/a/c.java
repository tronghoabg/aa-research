package com.google.h.c.a.a;

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
/* loaded from: classes4.dex */
public final class c extends du<c, b> implements fj {
    private static final c DEFAULT_INSTANCE;
    public static final int DESTINATION_KEY_FIELD_NUMBER = 2;
    private static volatile fo<c> PARSER = null;
    public static final int SOURCE_KEY_FIELD_NUMBER = 1;
    private eo<String> sourceKey_ = emptyProtobufList();
    private eo<String> destinationKey_ = emptyProtobufList();

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        du.registerDefaultInstance(c.class, cVar);
    }

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDestinationKey(Iterable<String> iterable) {
        ensureDestinationKeyIsMutable();
        com.google.v.c.addAll(iterable, this.destinationKey_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSourceKey(Iterable<String> iterable) {
        ensureSourceKeyIsMutable();
        com.google.v.c.addAll(iterable, this.sourceKey_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDestinationKey(String str) {
        Objects.requireNonNull(str);
        ensureDestinationKeyIsMutable();
        this.destinationKey_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDestinationKeyBytes(v vVar) {
        ensureDestinationKeyIsMutable();
        this.destinationKey_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSourceKey(String str) {
        Objects.requireNonNull(str);
        ensureSourceKeyIsMutable();
        this.sourceKey_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSourceKeyBytes(v vVar) {
        ensureSourceKeyIsMutable();
        this.sourceKey_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestinationKey() {
        this.destinationKey_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSourceKey() {
        this.sourceKey_ = emptyProtobufList();
    }

    private void ensureDestinationKeyIsMutable() {
        eo<String> eoVar = this.destinationKey_;
        if (eoVar.c()) {
            return;
        }
        this.destinationKey_ = du.mutableCopy(eoVar);
    }

    private void ensureSourceKeyIsMutable() {
        eo<String> eoVar = this.sourceKey_;
        if (eoVar.c()) {
            return;
        }
        this.sourceKey_ = du.mutableCopy(eoVar);
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
    public void setDestinationKey(int i2, String str) {
        Objects.requireNonNull(str);
        ensureDestinationKeyIsMutable();
        this.destinationKey_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceKey(int i2, String str) {
        Objects.requireNonNull(str);
        ensureSourceKeyIsMutable();
        this.sourceKey_.set(i2, str);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001a\u0002\u001a", new Object[]{"sourceKey_", "destinationKey_"});
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

    public String getDestinationKey(int i2) {
        return this.destinationKey_.get(i2);
    }

    public v getDestinationKeyBytes(int i2) {
        return v.s(this.destinationKey_.get(i2));
    }

    public int getDestinationKeyCount() {
        return this.destinationKey_.size();
    }

    public List<String> getDestinationKeyList() {
        return this.destinationKey_;
    }

    public String getSourceKey(int i2) {
        return this.sourceKey_.get(i2);
    }

    public v getSourceKeyBytes(int i2) {
        return v.s(this.sourceKey_.get(i2));
    }

    public int getSourceKeyCount() {
        return this.sourceKey_.size();
    }

    public List<String> getSourceKeyList() {
        return this.sourceKey_;
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
