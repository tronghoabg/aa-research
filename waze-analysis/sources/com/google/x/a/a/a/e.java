package com.google.x.a.a.a;

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
    public static final int DAYOPEN_FIELD_NUMBER = 4;
    private static final e DEFAULT_INSTANCE;
    public static final int INTERVAL_FIELD_NUMBER = 1;
    private static volatile fo<e> PARSER;
    private int bitField0_;
    private int dayopen_;
    private byte memoizedIsInitialized = 2;
    private eo<c> interval_ = emptyProtobufList();

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        du.registerDefaultInstance(e.class, eVar);
    }

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllInterval(Iterable<? extends c> iterable) {
        ensureIntervalIsMutable();
        com.google.v.c.addAll(iterable, this.interval_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addInterval(int i2, c cVar) {
        Objects.requireNonNull(cVar);
        ensureIntervalIsMutable();
        this.interval_.add(i2, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDayopen() {
        this.bitField0_ &= -2;
        this.dayopen_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInterval() {
        this.interval_ = emptyProtobufList();
    }

    private void ensureIntervalIsMutable() {
        eo<c> eoVar = this.interval_;
        if (eoVar.c()) {
            return;
        }
        this.interval_ = du.mutableCopy(eoVar);
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
    public void removeInterval(int i2) {
        ensureIntervalIsMutable();
        this.interval_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDayopen(int i2) {
        this.bitField0_ |= 1;
        this.dayopen_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInterval(int i2, c cVar) {
        Objects.requireNonNull(cVar);
        ensureIntervalIsMutable();
        this.interval_.set(i2, cVar);
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0001\u0002\u0001б\u0004ᔄ\u0000", new Object[]{"bitField0_", "interval_", c.class, "dayopen_"});
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

    public int getDayopen() {
        return this.dayopen_;
    }

    public c getInterval(int i2) {
        return this.interval_.get(i2);
    }

    public int getIntervalCount() {
        return this.interval_.size();
    }

    public List<c> getIntervalList() {
        return this.interval_;
    }

    public d getIntervalOrBuilder(int i2) {
        return this.interval_.get(i2);
    }

    public List<? extends d> getIntervalOrBuilderList() {
        return this.interval_;
    }

    public boolean hasDayopen() {
        return (this.bitField0_ & 1) != 0;
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
    public void addInterval(c cVar) {
        Objects.requireNonNull(cVar);
        ensureIntervalIsMutable();
        this.interval_.add(cVar);
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
