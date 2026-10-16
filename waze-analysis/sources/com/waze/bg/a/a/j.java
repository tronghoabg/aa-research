package com.waze.bg.a.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class j extends du<j, d> implements k {
    public static final int ANSWER_KEY_FIELD_NUMBER = 2;
    public static final int BLOCKED_LANE_FIELD_NUMBER = 4;
    private static final j DEFAULT_INSTANCE;
    public static final int HAZARD_FIELD_NUMBER = 1;
    private static volatile fo<j> PARSER = null;
    public static final int VALIDATION_FIELD_NUMBER = 3;
    private Object answerOption_;
    private int bitField0_;
    private int answerOptionCase_ = 0;
    private String answerKey_ = "";

    static {
        j jVar = new j();
        DEFAULT_INSTANCE = jVar;
        du.registerDefaultInstance(j.class, jVar);
    }

    private j() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAnswerKey() {
        this.bitField0_ &= -2;
        this.answerKey_ = getDefaultInstance().getAnswerKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAnswerOption() {
        this.answerOptionCase_ = 0;
        this.answerOption_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBlockedLane() {
        if (this.answerOptionCase_ == 4) {
            this.answerOptionCase_ = 0;
            this.answerOption_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHazard() {
        if (this.answerOptionCase_ == 1) {
            this.answerOptionCase_ = 0;
            this.answerOption_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValidation() {
        if (this.answerOptionCase_ == 3) {
            this.answerOptionCase_ = 0;
            this.answerOption_ = null;
        }
    }

    public static j getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBlockedLane(c cVar) {
        Objects.requireNonNull(cVar);
        if (this.answerOptionCase_ == 4 && this.answerOption_ != c.getDefaultInstance()) {
            b bVarNewBuilder = c.newBuilder((c) this.answerOption_);
            bVarNewBuilder.mergeFrom((b) cVar);
            cVar = bVarNewBuilder.buildPartial();
        }
        this.answerOption_ = cVar;
        this.answerOptionCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHazard(f fVar) {
        Objects.requireNonNull(fVar);
        if (this.answerOptionCase_ == 1 && this.answerOption_ != f.getDefaultInstance()) {
            e eVarNewBuilder = f.newBuilder((f) this.answerOption_);
            eVarNewBuilder.mergeFrom((e) fVar);
            fVar = eVarNewBuilder.buildPartial();
        }
        this.answerOption_ = fVar;
        this.answerOptionCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeValidation(i iVar) {
        Objects.requireNonNull(iVar);
        if (this.answerOptionCase_ == 3 && this.answerOption_ != i.getDefaultInstance()) {
            g gVarNewBuilder = i.newBuilder((i) this.answerOption_);
            gVarNewBuilder.mergeFrom((g) iVar);
            iVar = gVarNewBuilder.buildPartial();
        }
        this.answerOption_ = iVar;
        this.answerOptionCase_ = 3;
    }

    public static d newBuilder() {
        return (d) DEFAULT_INSTANCE.createBuilder();
    }

    public static j parseDelimitedFrom(InputStream inputStream) {
        return (j) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static j parseFrom(v vVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<j> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnswerKey(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.answerKey_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnswerKeyBytes(v vVar) {
        this.answerKey_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBlockedLane(c cVar) {
        Objects.requireNonNull(cVar);
        this.answerOption_ = cVar;
        this.answerOptionCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHazard(f fVar) {
        Objects.requireNonNull(fVar);
        this.answerOption_ = fVar;
        this.answerOptionCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValidation(i iVar) {
        Objects.requireNonNull(iVar);
        this.answerOption_ = iVar;
        this.answerOptionCase_ = 3;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002ဈ\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"answerOption_", "answerOptionCase_", "bitField0_", f.class, "answerKey_", i.class, c.class});
        }
        if (iOrdinal == 3) {
            return new j();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new d(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<j> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (j.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getAnswerKey() {
        return this.answerKey_;
    }

    public v getAnswerKeyBytes() {
        return v.s(this.answerKey_);
    }

    public a getAnswerOptionCase() {
        int i2 = this.answerOptionCase_;
        if (i2 == 0) {
            return a.f16305d;
        }
        if (i2 == 1) {
            return a.f16302a;
        }
        if (i2 == 3) {
            return a.f16304c;
        }
        if (i2 != 4) {
            return null;
        }
        return a.f16303b;
    }

    public c getBlockedLane() {
        return this.answerOptionCase_ == 4 ? (c) this.answerOption_ : c.getDefaultInstance();
    }

    public f getHazard() {
        return this.answerOptionCase_ == 1 ? (f) this.answerOption_ : f.getDefaultInstance();
    }

    public i getValidation() {
        return this.answerOptionCase_ == 3 ? (i) this.answerOption_ : i.getDefaultInstance();
    }

    public boolean hasAnswerKey() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasBlockedLane() {
        return this.answerOptionCase_ == 4;
    }

    public boolean hasHazard() {
        return this.answerOptionCase_ == 1;
    }

    public boolean hasValidation() {
        return this.answerOptionCase_ == 3;
    }

    public static d newBuilder(j jVar) {
        return (d) DEFAULT_INSTANCE.createBuilder(jVar);
    }

    public static j parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (j) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static j parseFrom(v vVar, de deVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static j parseFrom(z zVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static j parseFrom(z zVar, de deVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static j parseFrom(InputStream inputStream) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static j parseFrom(InputStream inputStream, de deVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static j parseFrom(ByteBuffer byteBuffer) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static j parseFrom(byte[] bArr) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static j parseFrom(byte[] bArr, de deVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
