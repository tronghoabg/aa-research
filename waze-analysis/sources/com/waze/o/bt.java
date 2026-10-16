package com.waze.o;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bt extends du<bt, bm> implements fj {
    private static final bt DEFAULT_INSTANCE;
    private static volatile fo<bt> PARSER = null;
    public static final int REASON_FIELD_NUMBER = 1;
    public static final int SILENT_FIELD_NUMBER = 100;
    public static final int SUGGESTION_FIELD_NUMBER = 101;
    private int bitField0_;
    private int reason_;
    private int typeCase_ = 0;
    private Object type_;

    static {
        bt btVar = new bt();
        DEFAULT_INSTANCE = btVar;
        du.registerDefaultInstance(bt.class, btVar);
    }

    private bt() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReason() {
        this.bitField0_ &= -2;
        this.reason_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSilent() {
        if (this.typeCase_ == 100) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSuggestion() {
        if (this.typeCase_ == 101) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.typeCase_ = 0;
        this.type_ = null;
    }

    public static bt getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSilent(bp bpVar) {
        Objects.requireNonNull(bpVar);
        if (this.typeCase_ == 100 && this.type_ != bp.getDefaultInstance()) {
            bo boVarNewBuilder = bp.newBuilder((bp) this.type_);
            boVarNewBuilder.mergeFrom((bo) bpVar);
            bpVar = boVarNewBuilder.buildPartial();
        }
        this.type_ = bpVar;
        this.typeCase_ = 100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSuggestion(br brVar) {
        Objects.requireNonNull(brVar);
        if (this.typeCase_ == 101 && this.type_ != br.getDefaultInstance()) {
            bq bqVarNewBuilder = br.newBuilder((br) this.type_);
            bqVarNewBuilder.mergeFrom((bq) brVar);
            brVar = bqVarNewBuilder.buildPartial();
        }
        this.type_ = brVar;
        this.typeCase_ = 101;
    }

    public static bm newBuilder() {
        return (bm) DEFAULT_INSTANCE.createBuilder();
    }

    public static bt parseDelimitedFrom(InputStream inputStream) {
        return (bt) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bt parseFrom(com.google.v.v vVar) {
        return (bt) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<bt> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReason(bn bnVar) {
        this.reason_ = bnVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSilent(bp bpVar) {
        Objects.requireNonNull(bpVar);
        this.type_ = bpVar;
        this.typeCase_ = 100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuggestion(br brVar) {
        Objects.requireNonNull(brVar);
        this.type_ = brVar;
        this.typeCase_ = 101;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0001\u0001\u0001e\u0003\u0000\u0000\u0000\u0001᠌\u0000d<\u0000e<\u0000", new Object[]{"type_", "typeCase_", "bitField0_", "reason_", o.f32909d, bp.class, br.class});
        }
        if (iOrdinal == 3) {
            return new bt();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bm(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<bt> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bt.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bn getReason() {
        bn bnVarA = bn.a(this.reason_);
        return bnVarA == null ? bn.REASON_UNSPECIFIED : bnVarA;
    }

    public bp getSilent() {
        return this.typeCase_ == 100 ? (bp) this.type_ : bp.getDefaultInstance();
    }

    public br getSuggestion() {
        return this.typeCase_ == 101 ? (br) this.type_ : br.getDefaultInstance();
    }

    public bs getTypeCase() {
        int i2 = this.typeCase_;
        if (i2 == 0) {
            return bs.f32776c;
        }
        if (i2 == 100) {
            return bs.f32774a;
        }
        if (i2 != 101) {
            return null;
        }
        return bs.f32775b;
    }

    public boolean hasReason() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasSilent() {
        return this.typeCase_ == 100;
    }

    public boolean hasSuggestion() {
        return this.typeCase_ == 101;
    }

    public static bm newBuilder(bt btVar) {
        return (bm) DEFAULT_INSTANCE.createBuilder(btVar);
    }

    public static bt parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (bt) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bt parseFrom(com.google.v.v vVar, de deVar) {
        return (bt) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bt parseFrom(com.google.v.z zVar) {
        return (bt) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bt parseFrom(com.google.v.z zVar, de deVar) {
        return (bt) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bt parseFrom(InputStream inputStream) {
        return (bt) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bt parseFrom(InputStream inputStream, de deVar) {
        return (bt) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bt parseFrom(ByteBuffer byteBuffer) {
        return (bt) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bt parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (bt) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bt parseFrom(byte[] bArr) {
        return (bt) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bt parseFrom(byte[] bArr, de deVar) {
        return (bt) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
