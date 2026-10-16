package com.waze.bg.e.a;

import i.b.l.sy;
import i.b.l.sz;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class hv extends com.google.v.du<hv, hu> implements com.google.v.fj {
    private static final hv DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<hv> PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 1;
    private int bitField0_;
    private sz text_;

    static {
        hv hvVar = new hv();
        DEFAULT_INSTANCE = hvVar;
        com.google.v.du.registerDefaultInstance(hv.class, hvVar);
    }

    private hv() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearText() {
        this.text_ = null;
        this.bitField0_ &= -2;
    }

    public static hv getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeText(sz szVar) {
        Objects.requireNonNull(szVar);
        sz szVar2 = this.text_;
        if (szVar2 != null && szVar2 != sz.getDefaultInstance()) {
            sy syVarNewBuilder = sz.newBuilder(szVar2);
            syVarNewBuilder.mergeFrom((sy) szVar);
            szVar = syVarNewBuilder.buildPartial();
        }
        this.text_ = szVar;
        this.bitField0_ |= 1;
    }

    public static hu newBuilder() {
        return (hu) DEFAULT_INSTANCE.createBuilder();
    }

    public static hv parseDelimitedFrom(InputStream inputStream) {
        return (hv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static hv parseFrom(com.google.v.v vVar) {
        return (hv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<hv> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setText(sz szVar) {
        Objects.requireNonNull(szVar);
        this.text_ = szVar;
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "text_"});
        }
        if (iOrdinal == 3) {
            return new hv();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new hu(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<hv> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (hv.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public sz getText() {
        sz szVar = this.text_;
        return szVar == null ? sz.getDefaultInstance() : szVar;
    }

    public boolean hasText() {
        return (this.bitField0_ & 1) != 0;
    }

    public static hu newBuilder(hv hvVar) {
        return (hu) DEFAULT_INSTANCE.createBuilder(hvVar);
    }

    public static hv parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (hv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static hv parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (hv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static hv parseFrom(com.google.v.z zVar) {
        return (hv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static hv parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (hv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static hv parseFrom(InputStream inputStream) {
        return (hv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static hv parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (hv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static hv parseFrom(ByteBuffer byteBuffer) {
        return (hv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hv parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (hv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static hv parseFrom(byte[] bArr) {
        return (hv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static hv parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (hv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
