package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class hz extends com.google.v.du<hz, hy> implements ia {
    private static final hz DEFAULT_INSTANCE;
    public static final int NAME_INFO_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<hz> PARSER;
    private com.google.v.eo<iz> nameInfo_ = emptyProtobufList();

    static {
        hz hzVar = new hz();
        DEFAULT_INSTANCE = hzVar;
        com.google.v.du.registerDefaultInstance(hz.class, hzVar);
    }

    private hz() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllNameInfo(Iterable<? extends iz> iterable) {
        ensureNameInfoIsMutable();
        com.google.v.c.addAll(iterable, this.nameInfo_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNameInfo(int i2, iz izVar) {
        Objects.requireNonNull(izVar);
        ensureNameInfoIsMutable();
        this.nameInfo_.add(i2, izVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNameInfo() {
        this.nameInfo_ = emptyProtobufList();
    }

    private void ensureNameInfoIsMutable() {
        com.google.v.eo<iz> eoVar = this.nameInfo_;
        if (eoVar.c()) {
            return;
        }
        this.nameInfo_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static hz getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static hy newBuilder() {
        return (hy) DEFAULT_INSTANCE.createBuilder();
    }

    public static hz parseDelimitedFrom(InputStream inputStream) {
        return (hz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static hz parseFrom(com.google.v.v vVar) {
        return (hz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<hz> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeNameInfo(int i2) {
        ensureNameInfoIsMutable();
        this.nameInfo_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameInfo(int i2, iz izVar) {
        Objects.requireNonNull(izVar);
        ensureNameInfoIsMutable();
        this.nameInfo_.set(i2, izVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"nameInfo_", iz.class});
        }
        if (iOrdinal == 3) {
            return new hz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new hy(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<hz> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (hz.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public iz getNameInfo(int i2) {
        return this.nameInfo_.get(i2);
    }

    public int getNameInfoCount() {
        return this.nameInfo_.size();
    }

    public List<iz> getNameInfoList() {
        return this.nameInfo_;
    }

    public ja getNameInfoOrBuilder(int i2) {
        return this.nameInfo_.get(i2);
    }

    public List<? extends ja> getNameInfoOrBuilderList() {
        return this.nameInfo_;
    }

    public static hy newBuilder(hz hzVar) {
        return (hy) DEFAULT_INSTANCE.createBuilder(hzVar);
    }

    public static hz parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (hz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static hz parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (hz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static hz parseFrom(com.google.v.z zVar) {
        return (hz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static hz parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (hz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNameInfo(iz izVar) {
        Objects.requireNonNull(izVar);
        ensureNameInfoIsMutable();
        this.nameInfo_.add(izVar);
    }

    public static hz parseFrom(InputStream inputStream) {
        return (hz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static hz parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (hz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static hz parseFrom(ByteBuffer byteBuffer) {
        return (hz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hz parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (hz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static hz parseFrom(byte[] bArr) {
        return (hz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static hz parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (hz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
