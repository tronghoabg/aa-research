package com.google.firebase.perf.f;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class v extends du<v, u> implements w {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final v DEFAULT_INSTANCE;
    public static final int FREE_APP_HEAP_MEMORY_KB_FIELD_NUMBER = 3;
    private static volatile fo<v> PARSER = null;
    public static final int USED_APP_HEAP_MEMORY_KB_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private int freeAppHeapMemoryKb_;
    private int usedAppHeapMemoryKb_;

    static {
        v vVar = new v();
        DEFAULT_INSTANCE = vVar;
        du.registerDefaultInstance(v.class, vVar);
    }

    private v() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientTimeUs() {
        this.bitField0_ &= -2;
        this.clientTimeUs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFreeAppHeapMemoryKb() {
        this.bitField0_ &= -5;
        this.freeAppHeapMemoryKb_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUsedAppHeapMemoryKb() {
        this.bitField0_ &= -3;
        this.usedAppHeapMemoryKb_ = 0;
    }

    public static v getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static u newBuilder() {
        return (u) DEFAULT_INSTANCE.createBuilder();
    }

    public static v parseDelimitedFrom(InputStream inputStream) {
        return (v) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static v parseFrom(com.google.v.v vVar) {
        return (v) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<v> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientTimeUs(long j2) {
        this.bitField0_ |= 1;
        this.clientTimeUs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFreeAppHeapMemoryKb(int i2) {
        this.bitField0_ |= 4;
        this.freeAppHeapMemoryKb_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUsedAppHeapMemoryKb(int i2) {
        this.bitField0_ |= 2;
        this.usedAppHeapMemoryKb_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"bitField0_", "clientTimeUs_", "usedAppHeapMemoryKb_", "freeAppHeapMemoryKb_"});
        }
        if (iOrdinal == 3) {
            return new v();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new u(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<v> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (v.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getClientTimeUs() {
        return this.clientTimeUs_;
    }

    public int getFreeAppHeapMemoryKb() {
        return this.freeAppHeapMemoryKb_;
    }

    public int getUsedAppHeapMemoryKb() {
        return this.usedAppHeapMemoryKb_;
    }

    public boolean hasClientTimeUs() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasFreeAppHeapMemoryKb() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasUsedAppHeapMemoryKb() {
        return (this.bitField0_ & 2) != 0;
    }

    public static u newBuilder(v vVar) {
        return (u) DEFAULT_INSTANCE.createBuilder(vVar);
    }

    public static v parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (v) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static v parseFrom(com.google.v.v vVar, de deVar) {
        return (v) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static v parseFrom(com.google.v.z zVar) {
        return (v) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static v parseFrom(com.google.v.z zVar, de deVar) {
        return (v) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static v parseFrom(InputStream inputStream) {
        return (v) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static v parseFrom(InputStream inputStream, de deVar) {
        return (v) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static v parseFrom(ByteBuffer byteBuffer) {
        return (v) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static v parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (v) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static v parseFrom(byte[] bArr) {
        return (v) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static v parseFrom(byte[] bArr, de deVar) {
        return (v) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
