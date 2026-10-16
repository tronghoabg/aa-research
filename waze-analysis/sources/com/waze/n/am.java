package com.waze.n;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import l.a.brg;
import l.a.bri;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class am extends du<am, al> implements an {
    private static final am DEFAULT_INSTANCE;
    public static final int METADATA_FIELD_NUMBER = 1;
    private static volatile fo<am> PARSER = null;
    public static final int PAYLOAD_FIELD_NUMBER = 4;
    private int bitField0_;
    private v metadata_;
    private bri payload_;

    static {
        am amVar = new am();
        DEFAULT_INSTANCE = amVar;
        du.registerDefaultInstance(am.class, amVar);
    }

    private am() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetadata() {
        this.metadata_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPayload() {
        this.payload_ = null;
        this.bitField0_ &= -3;
    }

    public static am getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMetadata(v vVar) {
        Objects.requireNonNull(vVar);
        v vVar2 = this.metadata_;
        if (vVar2 != null && vVar2 != v.getDefaultInstance()) {
            u uVarNewBuilder = v.newBuilder(vVar2);
            uVarNewBuilder.mergeFrom((u) vVar);
            vVar = uVarNewBuilder.buildPartial();
        }
        this.metadata_ = vVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePayload(bri briVar) {
        Objects.requireNonNull(briVar);
        bri briVar2 = this.payload_;
        if (briVar2 != null && briVar2 != bri.getDefaultInstance()) {
            brg brgVarNewBuilder = bri.newBuilder(briVar2);
            brgVarNewBuilder.mergeFrom((brg) briVar);
            briVar = brgVarNewBuilder.buildPartial();
        }
        this.payload_ = briVar;
        this.bitField0_ |= 2;
    }

    public static al newBuilder() {
        return (al) DEFAULT_INSTANCE.createBuilder();
    }

    public static am parseDelimitedFrom(InputStream inputStream) {
        return (am) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static am parseFrom(com.google.v.v vVar) {
        return (am) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<am> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadata(v vVar) {
        Objects.requireNonNull(vVar);
        this.metadata_ = vVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPayload(bri briVar) {
        Objects.requireNonNull(briVar);
        this.payload_ = briVar;
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0004ဉ\u0001", new Object[]{"bitField0_", "metadata_", "payload_"});
        }
        if (iOrdinal == 3) {
            return new am();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new al(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<am> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (am.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public v getMetadata() {
        v vVar = this.metadata_;
        return vVar == null ? v.getDefaultInstance() : vVar;
    }

    public bri getPayload() {
        bri briVar = this.payload_;
        return briVar == null ? bri.getDefaultInstance() : briVar;
    }

    public boolean hasMetadata() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasPayload() {
        return (this.bitField0_ & 2) != 0;
    }

    public static al newBuilder(am amVar) {
        return (al) DEFAULT_INSTANCE.createBuilder(amVar);
    }

    public static am parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (am) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static am parseFrom(com.google.v.v vVar, de deVar) {
        return (am) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static am parseFrom(com.google.v.z zVar) {
        return (am) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static am parseFrom(com.google.v.z zVar, de deVar) {
        return (am) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static am parseFrom(InputStream inputStream) {
        return (am) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static am parseFrom(InputStream inputStream, de deVar) {
        return (am) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static am parseFrom(ByteBuffer byteBuffer) {
        return (am) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static am parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (am) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static am parseFrom(byte[] bArr) {
        return (am) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static am parseFrom(byte[] bArr, de deVar) {
        return (am) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
