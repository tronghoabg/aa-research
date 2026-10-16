package com.google.w.s;

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
public final class e extends du<e, c> implements fj {
    public static final int CAN_REPORT_ALL_PREDICATE_VIOLATIONS_FIELD_NUMBER = 7;
    private static final e DEFAULT_INSTANCE;
    public static final int ELEMENT_PREDICATE_FIELD_NUMBER = 3;
    public static final int IS_REQUIRED_FIELD_NUMBER = 1;
    public static final int ONE_OF_FIELD_NUMBER = 4;
    private static volatile fo<e> PARSER = null;
    public static final int PREDICATE_FIELD_NUMBER = 2;
    public static final int PRESENT_IFF_FIELD_NUMBER = 5;
    public static final int SKIP_MESSAGE_VALIDATION_FIELD_NUMBER = 6;
    private int bitField0_;
    private boolean canReportAllPredicateViolations_;
    private Object fieldPresencePredicate_;
    private boolean skipMessageValidation_;
    private int fieldPresencePredicateCase_ = 0;
    private eo<String> predicate_ = emptyProtobufList();
    private eo<String> elementPredicate_ = emptyProtobufList();
    private String oneOf_ = "";

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        du.registerDefaultInstance(e.class, eVar);
    }

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllElementPredicate(Iterable<String> iterable) {
        ensureElementPredicateIsMutable();
        com.google.v.c.addAll(iterable, this.elementPredicate_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPredicate(Iterable<String> iterable) {
        ensurePredicateIsMutable();
        com.google.v.c.addAll(iterable, this.predicate_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addElementPredicate(String str) {
        Objects.requireNonNull(str);
        ensureElementPredicateIsMutable();
        this.elementPredicate_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addElementPredicateBytes(v vVar) {
        ensureElementPredicateIsMutable();
        this.elementPredicate_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPredicate(String str) {
        Objects.requireNonNull(str);
        ensurePredicateIsMutable();
        this.predicate_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPredicateBytes(v vVar) {
        ensurePredicateIsMutable();
        this.predicate_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCanReportAllPredicateViolations() {
        this.bitField0_ &= -5;
        this.canReportAllPredicateViolations_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearElementPredicate() {
        this.elementPredicate_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFieldPresencePredicate() {
        this.fieldPresencePredicateCase_ = 0;
        this.fieldPresencePredicate_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsRequired() {
        if (this.fieldPresencePredicateCase_ == 1) {
            this.fieldPresencePredicateCase_ = 0;
            this.fieldPresencePredicate_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOneOf() {
        this.bitField0_ &= -2;
        this.oneOf_ = getDefaultInstance().getOneOf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPredicate() {
        this.predicate_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPresentIff() {
        if (this.fieldPresencePredicateCase_ == 5) {
            this.fieldPresencePredicateCase_ = 0;
            this.fieldPresencePredicate_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSkipMessageValidation() {
        this.bitField0_ &= -3;
        this.skipMessageValidation_ = false;
    }

    private void ensureElementPredicateIsMutable() {
        eo<String> eoVar = this.elementPredicate_;
        if (eoVar.c()) {
            return;
        }
        this.elementPredicate_ = du.mutableCopy(eoVar);
    }

    private void ensurePredicateIsMutable() {
        eo<String> eoVar = this.predicate_;
        if (eoVar.c()) {
            return;
        }
        this.predicate_ = du.mutableCopy(eoVar);
    }

    public static e getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static c newBuilder() {
        return (c) DEFAULT_INSTANCE.createBuilder();
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
    public void setCanReportAllPredicateViolations(boolean z) {
        this.bitField0_ |= 4;
        this.canReportAllPredicateViolations_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setElementPredicate(int i2, String str) {
        Objects.requireNonNull(str);
        ensureElementPredicateIsMutable();
        this.elementPredicate_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsRequired(String str) {
        Objects.requireNonNull(str);
        this.fieldPresencePredicateCase_ = 1;
        this.fieldPresencePredicate_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsRequiredBytes(v vVar) {
        this.fieldPresencePredicate_ = vVar.u();
        this.fieldPresencePredicateCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOneOf(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.oneOf_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOneOfBytes(v vVar) {
        this.oneOf_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPredicate(int i2, String str) {
        Objects.requireNonNull(str);
        ensurePredicateIsMutable();
        this.predicate_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPresentIff(String str) {
        Objects.requireNonNull(str);
        this.fieldPresencePredicateCase_ = 5;
        this.fieldPresencePredicate_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPresentIffBytes(v vVar) {
        this.fieldPresencePredicate_ = vVar.u();
        this.fieldPresencePredicateCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSkipMessageValidation(boolean z) {
        this.bitField0_ |= 2;
        this.skipMessageValidation_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001;\u0000\u0002\u001a\u0003\u001a\u0004ဈ\u0000\u0005;\u0000\u0006ဇ\u0001\u0007ဇ\u0002", new Object[]{"fieldPresencePredicate_", "fieldPresencePredicateCase_", "bitField0_", "predicate_", "elementPredicate_", "oneOf_", "skipMessageValidation_", "canReportAllPredicateViolations_"});
        }
        if (iOrdinal == 3) {
            return new e();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new c(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
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
    }

    public boolean getCanReportAllPredicateViolations() {
        return this.canReportAllPredicateViolations_;
    }

    public String getElementPredicate(int i2) {
        return this.elementPredicate_.get(i2);
    }

    public v getElementPredicateBytes(int i2) {
        return v.s(this.elementPredicate_.get(i2));
    }

    public int getElementPredicateCount() {
        return this.elementPredicate_.size();
    }

    public List<String> getElementPredicateList() {
        return this.elementPredicate_;
    }

    public d getFieldPresencePredicateCase() {
        int i2 = this.fieldPresencePredicateCase_;
        if (i2 == 0) {
            return d.f13352c;
        }
        if (i2 == 1) {
            return d.f13350a;
        }
        if (i2 != 5) {
            return null;
        }
        return d.f13351b;
    }

    public String getIsRequired() {
        return this.fieldPresencePredicateCase_ == 1 ? (String) this.fieldPresencePredicate_ : "";
    }

    public v getIsRequiredBytes() {
        return v.s(this.fieldPresencePredicateCase_ == 1 ? (String) this.fieldPresencePredicate_ : "");
    }

    public String getOneOf() {
        return this.oneOf_;
    }

    public v getOneOfBytes() {
        return v.s(this.oneOf_);
    }

    public String getPredicate(int i2) {
        return this.predicate_.get(i2);
    }

    public v getPredicateBytes(int i2) {
        return v.s(this.predicate_.get(i2));
    }

    public int getPredicateCount() {
        return this.predicate_.size();
    }

    public List<String> getPredicateList() {
        return this.predicate_;
    }

    public String getPresentIff() {
        return this.fieldPresencePredicateCase_ == 5 ? (String) this.fieldPresencePredicate_ : "";
    }

    public v getPresentIffBytes() {
        return v.s(this.fieldPresencePredicateCase_ == 5 ? (String) this.fieldPresencePredicate_ : "");
    }

    public boolean getSkipMessageValidation() {
        return this.skipMessageValidation_;
    }

    public boolean hasCanReportAllPredicateViolations() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasIsRequired() {
        return this.fieldPresencePredicateCase_ == 1;
    }

    public boolean hasOneOf() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasPresentIff() {
        return this.fieldPresencePredicateCase_ == 5;
    }

    public boolean hasSkipMessageValidation() {
        return (this.bitField0_ & 2) != 0;
    }

    public static c newBuilder(e eVar) {
        return (c) DEFAULT_INSTANCE.createBuilder(eVar);
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
