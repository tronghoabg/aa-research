package com.google.w.a.a;

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
public final class d extends du<d, c> implements fj {
    private static final d DEFAULT_INSTANCE;
    public static final int OPERATION_GROUP_IDS_FIELD_NUMBER = 1;
    private static volatile fo<d> PARSER;
    private eo<String> operationGroupIds_ = emptyProtobufList();

    static {
        d dVar = new d();
        DEFAULT_INSTANCE = dVar;
        du.registerDefaultInstance(d.class, dVar);
    }

    private d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOperationGroupIds(Iterable<String> iterable) {
        ensureOperationGroupIdsIsMutable();
        com.google.v.c.addAll(iterable, this.operationGroupIds_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOperationGroupIds(String str) {
        Objects.requireNonNull(str);
        ensureOperationGroupIdsIsMutable();
        this.operationGroupIds_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOperationGroupIdsBytes(v vVar) {
        ensureOperationGroupIdsIsMutable();
        this.operationGroupIds_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOperationGroupIds() {
        this.operationGroupIds_ = emptyProtobufList();
    }

    private void ensureOperationGroupIdsIsMutable() {
        eo<String> eoVar = this.operationGroupIds_;
        if (eoVar.c()) {
            return;
        }
        this.operationGroupIds_ = du.mutableCopy(eoVar);
    }

    public static d getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static c newBuilder() {
        return (c) DEFAULT_INSTANCE.createBuilder();
    }

    public static d parseDelimitedFrom(InputStream inputStream) {
        return (d) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static d parseFrom(v vVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<d> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOperationGroupIds(int i2, String str) {
        Objects.requireNonNull(str);
        ensureOperationGroupIdsIsMutable();
        this.operationGroupIds_.set(i2, str);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"operationGroupIds_"});
        }
        if (iOrdinal == 3) {
            return new d();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new c(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<d> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (d.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getOperationGroupIds(int i2) {
        return this.operationGroupIds_.get(i2);
    }

    public v getOperationGroupIdsBytes(int i2) {
        return v.s(this.operationGroupIds_.get(i2));
    }

    public int getOperationGroupIdsCount() {
        return this.operationGroupIds_.size();
    }

    public List<String> getOperationGroupIdsList() {
        return this.operationGroupIds_;
    }

    public static c newBuilder(d dVar) {
        return (c) DEFAULT_INSTANCE.createBuilder(dVar);
    }

    public static d parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (d) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static d parseFrom(v vVar, de deVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static d parseFrom(z zVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static d parseFrom(z zVar, de deVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static d parseFrom(InputStream inputStream) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static d parseFrom(InputStream inputStream, de deVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static d parseFrom(ByteBuffer byteBuffer) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static d parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static d parseFrom(byte[] bArr) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static d parseFrom(byte[] bArr, de deVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
