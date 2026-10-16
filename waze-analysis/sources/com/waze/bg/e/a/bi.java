package com.waze.bg.e.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bi extends com.google.v.du<bi, bc> implements bj {
    public static final int ADD_DETOUR_INSTRUCTION_FIELD_NUMBER = 1;
    private static final bi DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bi> PARSER = null;
    public static final int REFRESH_DETOUR_INSTRUCTION_FIELD_NUMBER = 3;
    public static final int REMOVE_DETOUR_INSTRUCTION_FIELD_NUMBER = 2;
    private int detourInstructionOneOfCase_ = 0;
    private Object detourInstructionOneOf_;

    static {
        bi biVar = new bi();
        DEFAULT_INSTANCE = biVar;
        com.google.v.du.registerDefaultInstance(bi.class, biVar);
    }

    private bi() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAddDetourInstruction() {
        if (this.detourInstructionOneOfCase_ == 1) {
            this.detourInstructionOneOfCase_ = 0;
            this.detourInstructionOneOf_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDetourInstructionOneOf() {
        this.detourInstructionOneOfCase_ = 0;
        this.detourInstructionOneOf_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRefreshDetourInstruction() {
        if (this.detourInstructionOneOfCase_ == 3) {
            this.detourInstructionOneOfCase_ = 0;
            this.detourInstructionOneOf_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRemoveDetourInstruction() {
        if (this.detourInstructionOneOfCase_ == 2) {
            this.detourInstructionOneOfCase_ = 0;
            this.detourInstructionOneOf_ = null;
        }
    }

    public static bi getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAddDetourInstruction(bb bbVar) {
        Objects.requireNonNull(bbVar);
        if (this.detourInstructionOneOfCase_ == 1 && this.detourInstructionOneOf_ != bb.getDefaultInstance()) {
            ba baVarNewBuilder = bb.newBuilder((bb) this.detourInstructionOneOf_);
            baVarNewBuilder.mergeFrom((ba) bbVar);
            bbVar = baVarNewBuilder.buildPartial();
        }
        this.detourInstructionOneOf_ = bbVar;
        this.detourInstructionOneOfCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRefreshDetourInstruction(bf bfVar) {
        Objects.requireNonNull(bfVar);
        if (this.detourInstructionOneOfCase_ == 3 && this.detourInstructionOneOf_ != bf.getDefaultInstance()) {
            be beVarNewBuilder = bf.newBuilder((bf) this.detourInstructionOneOf_);
            beVarNewBuilder.mergeFrom((be) bfVar);
            bfVar = beVarNewBuilder.buildPartial();
        }
        this.detourInstructionOneOf_ = bfVar;
        this.detourInstructionOneOfCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRemoveDetourInstruction(bh bhVar) {
        Objects.requireNonNull(bhVar);
        if (this.detourInstructionOneOfCase_ == 2 && this.detourInstructionOneOf_ != bh.getDefaultInstance()) {
            bg bgVarNewBuilder = bh.newBuilder((bh) this.detourInstructionOneOf_);
            bgVarNewBuilder.mergeFrom((bg) bhVar);
            bhVar = bgVarNewBuilder.buildPartial();
        }
        this.detourInstructionOneOf_ = bhVar;
        this.detourInstructionOneOfCase_ = 2;
    }

    public static bc newBuilder() {
        return (bc) DEFAULT_INSTANCE.createBuilder();
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
    public void setAddDetourInstruction(bb bbVar) {
        Objects.requireNonNull(bbVar);
        this.detourInstructionOneOf_ = bbVar;
        this.detourInstructionOneOfCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRefreshDetourInstruction(bf bfVar) {
        Objects.requireNonNull(bfVar);
        this.detourInstructionOneOf_ = bfVar;
        this.detourInstructionOneOfCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRemoveDetourInstruction(bh bhVar) {
        Objects.requireNonNull(bhVar);
        this.detourInstructionOneOf_ = bhVar;
        this.detourInstructionOneOfCase_ = 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"detourInstructionOneOf_", "detourInstructionOneOfCase_", bb.class, bh.class, bf.class});
        }
        if (iOrdinal == 3) {
            return new bi();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bc(bArr);
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

    public bb getAddDetourInstruction() {
        return this.detourInstructionOneOfCase_ == 1 ? (bb) this.detourInstructionOneOf_ : bb.getDefaultInstance();
    }

    public bd getDetourInstructionOneOfCase() {
        int i2 = this.detourInstructionOneOfCase_;
        if (i2 == 0) {
            return bd.f16624d;
        }
        if (i2 == 1) {
            return bd.f16621a;
        }
        if (i2 == 2) {
            return bd.f16622b;
        }
        if (i2 != 3) {
            return null;
        }
        return bd.f16623c;
    }

    public bf getRefreshDetourInstruction() {
        return this.detourInstructionOneOfCase_ == 3 ? (bf) this.detourInstructionOneOf_ : bf.getDefaultInstance();
    }

    public bh getRemoveDetourInstruction() {
        return this.detourInstructionOneOfCase_ == 2 ? (bh) this.detourInstructionOneOf_ : bh.getDefaultInstance();
    }

    public boolean hasAddDetourInstruction() {
        return this.detourInstructionOneOfCase_ == 1;
    }

    public boolean hasRefreshDetourInstruction() {
        return this.detourInstructionOneOfCase_ == 3;
    }

    public boolean hasRemoveDetourInstruction() {
        return this.detourInstructionOneOfCase_ == 2;
    }

    public static bc newBuilder(bi biVar) {
        return (bc) DEFAULT_INSTANCE.createBuilder(biVar);
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
