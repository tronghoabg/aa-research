package com.google.w.k;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c extends du<c, b> implements d {
    private static final c DEFAULT_INSTANCE;
    public static final int OBJS_FIELD_NUMBER = 2;
    private static volatile fo<c> PARSER = null;
    public static final int PRED_FIELD_NUMBER = 1;
    private int bitField0_;
    private String pred_ = "";
    private eo<aa> objs_ = emptyProtobufList();

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        du.registerDefaultInstance(c.class, cVar);
    }

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllObjs(Iterable<? extends aa> iterable) {
        ensureObjsIsMutable();
        com.google.v.c.addAll(iterable, this.objs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addObjs(int i2, aa aaVar) {
        Objects.requireNonNull(aaVar);
        ensureObjsIsMutable();
        this.objs_.add(i2, aaVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearObjs() {
        this.objs_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPred() {
        this.bitField0_ &= -2;
        this.pred_ = getDefaultInstance().getPred();
    }

    private void ensureObjsIsMutable() {
        eo<aa> eoVar = this.objs_;
        if (eoVar.c()) {
            return;
        }
        this.objs_ = du.mutableCopy(eoVar);
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

    public static c parseFrom(com.google.v.v vVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<c> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeObjs(int i2) {
        ensureObjsIsMutable();
        this.objs_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setObjs(int i2, aa aaVar) {
        Objects.requireNonNull(aaVar);
        ensureObjsIsMutable();
        this.objs_.set(i2, aaVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPred(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.pred_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPredBytes(com.google.v.v vVar) {
        this.pred_ = vVar.u();
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"bitField0_", "pred_", "objs_", aa.class});
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

    public aa getObjs(int i2) {
        return this.objs_.get(i2);
    }

    public int getObjsCount() {
        return this.objs_.size();
    }

    public List<aa> getObjsList() {
        return this.objs_;
    }

    public ab getObjsOrBuilder(int i2) {
        return this.objs_.get(i2);
    }

    public List<? extends ab> getObjsOrBuilderList() {
        return this.objs_;
    }

    public String getPred() {
        return this.pred_;
    }

    public com.google.v.v getPredBytes() {
        return com.google.v.v.s(this.pred_);
    }

    public boolean hasPred() {
        return (this.bitField0_ & 1) != 0;
    }

    public static b newBuilder(c cVar) {
        return (b) DEFAULT_INSTANCE.createBuilder(cVar);
    }

    public static c parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (c) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static c parseFrom(com.google.v.v vVar, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static c parseFrom(com.google.v.z zVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static c parseFrom(com.google.v.z zVar, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addObjs(aa aaVar) {
        Objects.requireNonNull(aaVar);
        ensureObjsIsMutable();
        this.objs_.add(aaVar);
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
