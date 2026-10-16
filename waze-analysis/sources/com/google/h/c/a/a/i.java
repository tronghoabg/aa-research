package com.google.h.c.a.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class i extends du<i, h> implements fj {
    public static final int CLEAR_FIELD_FIELD_NUMBER = 1;
    private static final i DEFAULT_INSTANCE;
    private static volatile fo<i> PARSER = null;
    public static final int REORDER_REPEATED_FIELD_NUMBER = 2;
    public static final int REWRITE_IDENTIFIER_FIELD_NUMBER = 5;
    public static final int REWRITE_TIME_FIELD_NUMBER = 3;
    public static final int SET_REGEX_TO_VALUE_FIELD_NUMBER = 6;
    public static final int SET_TO_VALUE_FIELD_NUMBER = 4;
    public static final int STATE_FIELD_NUMBER = 7;
    public static final int TRUNCATE_TO_PRECISION_FIELD_NUMBER = 9;
    public static final int VALIDATION_FIELD_NUMBER = 8;
    private Object annotationOneof_;
    private int bitField0_;
    private e validation_;
    private int annotationOneofCase_ = 0;
    private int state_ = 3;

    static {
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        du.registerDefaultInstance(i.class, iVar);
    }

    private i() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAnnotationOneof() {
        this.annotationOneofCase_ = 0;
        this.annotationOneof_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClearField() {
        if (this.annotationOneofCase_ == 1) {
            this.annotationOneofCase_ = 0;
            this.annotationOneof_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReorderRepeated() {
        if (this.annotationOneofCase_ == 2) {
            this.annotationOneofCase_ = 0;
            this.annotationOneof_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRewriteIdentifier() {
        if (this.annotationOneofCase_ == 5) {
            this.annotationOneofCase_ = 0;
            this.annotationOneof_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRewriteTime() {
        if (this.annotationOneofCase_ == 3) {
            this.annotationOneofCase_ = 0;
            this.annotationOneof_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSetRegexToValue() {
        if (this.annotationOneofCase_ == 6) {
            this.annotationOneofCase_ = 0;
            this.annotationOneof_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSetToValue() {
        if (this.annotationOneofCase_ == 4) {
            this.annotationOneofCase_ = 0;
            this.annotationOneof_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearState() {
        this.bitField0_ &= -2;
        this.state_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTruncateToPrecision() {
        if (this.annotationOneofCase_ == 9) {
            this.annotationOneofCase_ = 0;
            this.annotationOneof_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValidation() {
        this.validation_ = null;
        this.bitField0_ &= -3;
    }

    public static i getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSetRegexToValue(k kVar) {
        Objects.requireNonNull(kVar);
        if (this.annotationOneofCase_ == 6 && this.annotationOneof_ != k.getDefaultInstance()) {
            j jVarNewBuilder = k.newBuilder((k) this.annotationOneof_);
            jVarNewBuilder.mergeFrom((j) kVar);
            kVar = jVarNewBuilder.buildPartial();
        }
        this.annotationOneof_ = kVar;
        this.annotationOneofCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeValidation(e eVar) {
        Objects.requireNonNull(eVar);
        e eVar2 = this.validation_;
        if (eVar2 != null && eVar2 != e.getDefaultInstance()) {
            d dVarNewBuilder = e.newBuilder(eVar2);
            dVarNewBuilder.mergeFrom((d) eVar);
            eVar = dVarNewBuilder.buildPartial();
        }
        this.validation_ = eVar;
        this.bitField0_ |= 2;
    }

    public static h newBuilder() {
        return (h) DEFAULT_INSTANCE.createBuilder();
    }

    public static i parseDelimitedFrom(InputStream inputStream) {
        return (i) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static i parseFrom(v vVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<i> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClearField(boolean z) {
        this.annotationOneofCase_ = 1;
        this.annotationOneof_ = Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReorderRepeated(boolean z) {
        this.annotationOneofCase_ = 2;
        this.annotationOneof_ = Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRewriteIdentifier(String str) {
        Objects.requireNonNull(str);
        this.annotationOneofCase_ = 5;
        this.annotationOneof_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRewriteIdentifierBytes(v vVar) {
        this.annotationOneof_ = vVar.u();
        this.annotationOneofCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRewriteTime(m mVar) {
        this.annotationOneof_ = Integer.valueOf(mVar.getNumber());
        this.annotationOneofCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSetRegexToValue(k kVar) {
        Objects.requireNonNull(kVar);
        this.annotationOneof_ = kVar;
        this.annotationOneofCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSetToValue(String str) {
        Objects.requireNonNull(str);
        this.annotationOneofCase_ = 4;
        this.annotationOneof_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSetToValueBytes(v vVar) {
        this.annotationOneof_ = vVar.u();
        this.annotationOneofCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setState(f fVar) {
        this.state_ = fVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTruncateToPrecision(int i2) {
        this.annotationOneofCase_ = 9;
        this.annotationOneof_ = Integer.valueOf(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValidation(e eVar) {
        Objects.requireNonNull(eVar);
        this.validation_ = eVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\t\u0001\u0001\u0001\t\t\u0000\u0000\u0000\u0001:\u0000\u0002:\u0000\u0003\u083f\u0000\u0004;\u0000\u0005;\u0000\u0006<\u0000\u0007᠌\u0000\bဉ\u0001\t7\u0000", new Object[]{"annotationOneof_", "annotationOneofCase_", "bitField0_", l.f11049a, k.class, "state_", l.f11050b, "validation_"});
        }
        if (iOrdinal == 3) {
            return new i();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new h(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<i> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (i.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public g getAnnotationOneofCase() {
        int i2 = this.annotationOneofCase_;
        if (i2 == 9) {
            return g.f11046g;
        }
        switch (i2) {
            case 0:
                return g.f11047h;
            case 1:
                return g.f11040a;
            case 2:
                return g.f11041b;
            case 3:
                return g.f11042c;
            case 4:
                return g.f11043d;
            case 5:
                return g.f11044e;
            case 6:
                return g.f11045f;
            default:
                return null;
        }
    }

    public boolean getClearField() {
        if (this.annotationOneofCase_ == 1) {
            return ((Boolean) this.annotationOneof_).booleanValue();
        }
        return false;
    }

    public boolean getReorderRepeated() {
        if (this.annotationOneofCase_ == 2) {
            return ((Boolean) this.annotationOneof_).booleanValue();
        }
        return false;
    }

    public String getRewriteIdentifier() {
        return this.annotationOneofCase_ == 5 ? (String) this.annotationOneof_ : "";
    }

    public v getRewriteIdentifierBytes() {
        return v.s(this.annotationOneofCase_ == 5 ? (String) this.annotationOneof_ : "");
    }

    public m getRewriteTime() {
        m mVarA;
        return (this.annotationOneofCase_ != 3 || (mVarA = m.a(((Integer) this.annotationOneof_).intValue())) == null) ? m.NONE : mVarA;
    }

    public k getSetRegexToValue() {
        return this.annotationOneofCase_ == 6 ? (k) this.annotationOneof_ : k.getDefaultInstance();
    }

    public String getSetToValue() {
        return this.annotationOneofCase_ == 4 ? (String) this.annotationOneof_ : "";
    }

    public v getSetToValueBytes() {
        return v.s(this.annotationOneofCase_ == 4 ? (String) this.annotationOneof_ : "");
    }

    public f getState() {
        f fVarA = f.a(this.state_);
        return fVarA == null ? f.ROLLOUT_ENABLED_REMOVE_OVERRIDES : fVarA;
    }

    public int getTruncateToPrecision() {
        if (this.annotationOneofCase_ == 9) {
            return ((Integer) this.annotationOneof_).intValue();
        }
        return 0;
    }

    public e getValidation() {
        e eVar = this.validation_;
        return eVar == null ? e.getDefaultInstance() : eVar;
    }

    public boolean hasClearField() {
        return this.annotationOneofCase_ == 1;
    }

    public boolean hasReorderRepeated() {
        return this.annotationOneofCase_ == 2;
    }

    public boolean hasRewriteIdentifier() {
        return this.annotationOneofCase_ == 5;
    }

    public boolean hasRewriteTime() {
        return this.annotationOneofCase_ == 3;
    }

    public boolean hasSetRegexToValue() {
        return this.annotationOneofCase_ == 6;
    }

    public boolean hasSetToValue() {
        return this.annotationOneofCase_ == 4;
    }

    public boolean hasState() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasTruncateToPrecision() {
        return this.annotationOneofCase_ == 9;
    }

    public boolean hasValidation() {
        return (this.bitField0_ & 2) != 0;
    }

    public static h newBuilder(i iVar) {
        return (h) DEFAULT_INSTANCE.createBuilder(iVar);
    }

    public static i parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (i) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static i parseFrom(v vVar, de deVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static i parseFrom(z zVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static i parseFrom(z zVar, de deVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static i parseFrom(InputStream inputStream) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static i parseFrom(InputStream inputStream, de deVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static i parseFrom(ByteBuffer byteBuffer) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static i parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static i parseFrom(byte[] bArr) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static i parseFrom(byte[] bArr, de deVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
