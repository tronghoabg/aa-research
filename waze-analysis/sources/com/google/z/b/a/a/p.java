package com.google.z.b.a.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dq;
import com.google.v.ds;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.gm;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class p extends dq<p, o> implements fj {
    private static final p DEFAULT_INSTANCE;
    public static final int MESSAGE_SET_EXTENSION_FIELD_NUMBER = 45632928;
    private static volatile fo<p> PARSER = null;
    public static final int TRIPLE_FIELD_NUMBER = 1;
    public static final ds<com.google.w.n.a.b, p> messageSetExtension;
    private byte memoizedIsInitialized = 2;
    private eo<m> triple_ = emptyProtobufList();

    static {
        p pVar = new p();
        DEFAULT_INSTANCE = pVar;
        du.registerDefaultInstance(p.class, pVar);
        messageSetExtension = du.newSingularGeneratedExtension(com.google.w.n.a.b.getDefaultInstance(), getDefaultInstance(), getDefaultInstance(), null, MESSAGE_SET_EXTENSION_FIELD_NUMBER, gm.MESSAGE, p.class);
    }

    private p() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTriple(Iterable<? extends m> iterable) {
        ensureTripleIsMutable();
        com.google.v.c.addAll(iterable, this.triple_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTriple(int i2, m mVar) {
        Objects.requireNonNull(mVar);
        ensureTripleIsMutable();
        this.triple_.add(i2, mVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTriple() {
        this.triple_ = emptyProtobufList();
    }

    private void ensureTripleIsMutable() {
        eo<m> eoVar = this.triple_;
        if (eoVar.c()) {
            return;
        }
        this.triple_ = du.mutableCopy(eoVar);
    }

    public static p getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static o newBuilder() {
        return (o) DEFAULT_INSTANCE.createBuilder();
    }

    public static p parseDelimitedFrom(InputStream inputStream) {
        return (p) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static p parseFrom(com.google.v.v vVar) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<p> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTriple(int i2) {
        ensureTripleIsMutable();
        this.triple_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTriple(int i2, m mVar) {
        Objects.requireNonNull(mVar);
        ensureTripleIsMutable();
        this.triple_.set(i2, mVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        byte[] bArr = null;
        switch (dtVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"triple_", m.class});
            case 3:
                return new p();
            case 4:
                return new o(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                fo<p> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (p.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            default:
                throw null;
        }
    }

    public m getTriple(int i2) {
        return this.triple_.get(i2);
    }

    public int getTripleCount() {
        return this.triple_.size();
    }

    public List<m> getTripleList() {
        return this.triple_;
    }

    public n getTripleOrBuilder(int i2) {
        return this.triple_.get(i2);
    }

    public List<? extends n> getTripleOrBuilderList() {
        return this.triple_;
    }

    public static o newBuilder(p pVar) {
        return (o) DEFAULT_INSTANCE.createBuilder(pVar);
    }

    public static p parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (p) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static p parseFrom(com.google.v.v vVar, de deVar) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static p parseFrom(com.google.v.z zVar) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static p parseFrom(com.google.v.z zVar, de deVar) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTriple(m mVar) {
        Objects.requireNonNull(mVar);
        ensureTripleIsMutable();
        this.triple_.add(mVar);
    }

    public static p parseFrom(InputStream inputStream) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static p parseFrom(InputStream inputStream, de deVar) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static p parseFrom(ByteBuffer byteBuffer) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static p parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static p parseFrom(byte[] bArr) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static p parseFrom(byte[] bArr, de deVar) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
