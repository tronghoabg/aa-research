package com.google.w.l;

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
public final class e extends du<e, a> implements fj {
    private static final e DEFAULT_INSTANCE;
    public static final int MAY_APPEAR_IN_FIELD_NUMBER = 1;
    private static volatile fo<e> PARSER;
    private byte memoizedIsInitialized = 2;
    private eo<c> mayAppearIn_ = emptyProtobufList();

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        du.registerDefaultInstance(e.class, eVar);
    }

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMayAppearIn(Iterable<? extends c> iterable) {
        ensureMayAppearInIsMutable();
        com.google.v.c.addAll(iterable, this.mayAppearIn_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMayAppearIn(int i2, c cVar) {
        Objects.requireNonNull(cVar);
        ensureMayAppearInIsMutable();
        this.mayAppearIn_.add(i2, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMayAppearIn() {
        this.mayAppearIn_ = emptyProtobufList();
    }

    private void ensureMayAppearInIsMutable() {
        eo<c> eoVar = this.mayAppearIn_;
        if (eoVar.c()) {
            return;
        }
        this.mayAppearIn_ = du.mutableCopy(eoVar);
    }

    public static e getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static e parseDelimitedFrom(InputStream inputStream) {
        return (e) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static e parseFrom(v vVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<e> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMayAppearIn(int i2) {
        ensureMayAppearInIsMutable();
        this.mayAppearIn_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMayAppearIn(int i2, c cVar) {
        Objects.requireNonNull(cVar);
        ensureMayAppearInIsMutable();
        this.mayAppearIn_.set(i2, cVar);
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"mayAppearIn_", c.class});
            case 3:
                return new e();
            case 4:
                return new a(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                fo<e> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (e.class) {
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

    public c getMayAppearIn(int i2) {
        return this.mayAppearIn_.get(i2);
    }

    public int getMayAppearInCount() {
        return this.mayAppearIn_.size();
    }

    public List<c> getMayAppearInList() {
        return this.mayAppearIn_;
    }

    public d getMayAppearInOrBuilder(int i2) {
        return this.mayAppearIn_.get(i2);
    }

    public List<? extends d> getMayAppearInOrBuilderList() {
        return this.mayAppearIn_;
    }

    public static a newBuilder(e eVar) {
        return (a) DEFAULT_INSTANCE.createBuilder(eVar);
    }

    public static e parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (e) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static e parseFrom(v vVar, de deVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static e parseFrom(z zVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static e parseFrom(z zVar, de deVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMayAppearIn(c cVar) {
        Objects.requireNonNull(cVar);
        ensureMayAppearInIsMutable();
        this.mayAppearIn_.add(cVar);
    }

    public static e parseFrom(InputStream inputStream) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static e parseFrom(InputStream inputStream, de deVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static e parseFrom(ByteBuffer byteBuffer) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static e parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static e parseFrom(byte[] bArr) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static e parseFrom(byte[] bArr, de deVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
