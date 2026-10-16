package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bi extends com.google.v.du<bi, bb> implements com.google.v.fj {
    private static final bi DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bi> PARSER = null;
    public static final int ROTATE_FIELD_NUMBER = 2;
    public static final int SCALE_FIELD_NUMBER = 1;
    public static final int TRANSLATE_FIELD_NUMBER = 3;
    private int bitField0_;
    private bd rotate_;
    private bf scale_;
    private bh translate_;

    static {
        bi biVar = new bi();
        DEFAULT_INSTANCE = biVar;
        com.google.v.du.registerDefaultInstance(bi.class, biVar);
    }

    private bi() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRotate() {
        this.rotate_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScale() {
        this.scale_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTranslate() {
        this.translate_ = null;
        this.bitField0_ &= -5;
    }

    public static bi getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRotate(bd bdVar) {
        Objects.requireNonNull(bdVar);
        bd bdVar2 = this.rotate_;
        if (bdVar2 != null && bdVar2 != bd.getDefaultInstance()) {
            bc bcVarNewBuilder = bd.newBuilder(bdVar2);
            bcVarNewBuilder.mergeFrom((bc) bdVar);
            bdVar = bcVarNewBuilder.buildPartial();
        }
        this.rotate_ = bdVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeScale(bf bfVar) {
        Objects.requireNonNull(bfVar);
        bf bfVar2 = this.scale_;
        if (bfVar2 != null && bfVar2 != bf.getDefaultInstance()) {
            be beVarNewBuilder = bf.newBuilder(bfVar2);
            beVarNewBuilder.mergeFrom((be) bfVar);
            bfVar = beVarNewBuilder.buildPartial();
        }
        this.scale_ = bfVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTranslate(bh bhVar) {
        Objects.requireNonNull(bhVar);
        bh bhVar2 = this.translate_;
        if (bhVar2 != null && bhVar2 != bh.getDefaultInstance()) {
            bg bgVarNewBuilder = bh.newBuilder(bhVar2);
            bgVarNewBuilder.mergeFrom((bg) bhVar);
            bhVar = bgVarNewBuilder.buildPartial();
        }
        this.translate_ = bhVar;
        this.bitField0_ |= 4;
    }

    public static bb newBuilder() {
        return (bb) DEFAULT_INSTANCE.createBuilder();
    }

    public static bi parseDelimitedFrom(InputStream inputStream) {
        return (bi) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bi parseFrom(com.google.v.v vVar) {
        return (bi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bi> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRotate(bd bdVar) {
        Objects.requireNonNull(bdVar);
        this.rotate_ = bdVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScale(bf bfVar) {
        Objects.requireNonNull(bfVar);
        this.scale_ = bfVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTranslate(bh bhVar) {
        Objects.requireNonNull(bhVar);
        this.translate_ = bhVar;
        this.bitField0_ |= 4;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "scale_", "rotate_", "translate_"});
        }
        if (iOrdinal == 3) {
            return new bi();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bb(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bi> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bi.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bd getRotate() {
        bd bdVar = this.rotate_;
        return bdVar == null ? bd.getDefaultInstance() : bdVar;
    }

    public bf getScale() {
        bf bfVar = this.scale_;
        return bfVar == null ? bf.getDefaultInstance() : bfVar;
    }

    public bh getTranslate() {
        bh bhVar = this.translate_;
        return bhVar == null ? bh.getDefaultInstance() : bhVar;
    }

    public boolean hasRotate() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasScale() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasTranslate() {
        return (this.bitField0_ & 4) != 0;
    }

    public static bb newBuilder(bi biVar) {
        return (bb) DEFAULT_INSTANCE.createBuilder(biVar);
    }

    public static bi parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bi) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bi parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bi parseFrom(com.google.v.z zVar) {
        return (bi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bi parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bi parseFrom(InputStream inputStream) {
        return (bi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bi parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bi parseFrom(ByteBuffer byteBuffer) {
        return (bi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bi parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bi parseFrom(byte[] bArr) {
        return (bi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bi parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
