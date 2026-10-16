package com.waze.bg.e.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class hy extends com.google.v.du<hy, hx> implements com.google.v.fj {
    public static final int CONTENT_FIELD_NUMBER = 2;
    private static final hy DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<hy> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private hv content_;
    private int type_;

    static {
        hy hyVar = new hy();
        DEFAULT_INSTANCE = hyVar;
        com.google.v.du.registerDefaultInstance(hy.class, hyVar);
    }

    private hy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContent() {
        this.content_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -2;
        this.type_ = 0;
    }

    public static hy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeContent(hv hvVar) {
        Objects.requireNonNull(hvVar);
        hv hvVar2 = this.content_;
        if (hvVar2 != null && hvVar2 != hv.getDefaultInstance()) {
            hu huVarNewBuilder = hv.newBuilder(hvVar2);
            huVarNewBuilder.mergeFrom((hu) hvVar);
            hvVar = huVarNewBuilder.buildPartial();
        }
        this.content_ = hvVar;
        this.bitField0_ |= 2;
    }

    public static hx newBuilder() {
        return (hx) DEFAULT_INSTANCE.createBuilder();
    }

    public static hy parseDelimitedFrom(InputStream inputStream) {
        return (hy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static hy parseFrom(com.google.v.v vVar) {
        return (hy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<hy> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContent(hv hvVar) {
        Objects.requireNonNull(hvVar);
        this.content_ = hvVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(hw hwVar) {
        this.type_ = hwVar.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "type_", ci.f16641g, "content_"});
        }
        if (iOrdinal == 3) {
            return new hy();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new hx(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<hy> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (hy.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public hv getContent() {
        hv hvVar = this.content_;
        return hvVar == null ? hv.getDefaultInstance() : hvVar;
    }

    public hw getType() {
        hw hwVarA = hw.a(this.type_);
        return hwVarA == null ? hw.CARD_TYPE_UNSPECIFIED : hwVarA;
    }

    public boolean hasContent() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static hx newBuilder(hy hyVar) {
        return (hx) DEFAULT_INSTANCE.createBuilder(hyVar);
    }

    public static hy parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (hy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static hy parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (hy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static hy parseFrom(com.google.v.z zVar) {
        return (hy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static hy parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (hy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static hy parseFrom(InputStream inputStream) {
        return (hy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static hy parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (hy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static hy parseFrom(ByteBuffer byteBuffer) {
        return (hy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hy parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (hy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static hy parseFrom(byte[] bArr) {
        return (hy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static hy parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (hy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
