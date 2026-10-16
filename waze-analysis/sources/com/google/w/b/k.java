package com.google.w.b;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.ek;
import com.google.v.el;
import com.google.v.em;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class k extends du<k, j> implements fj {
    private static final k DEFAULT_INSTANCE;
    public static final int KEY_ANNOTATIONS_FIELD_NUMBER = 2;
    private static volatile fo<k> PARSER = null;
    public static final int SEMANTIC_TYPE_FIELD_NUMBER = 1;
    public static final int VALUE_ANNOTATIONS_FIELD_NUMBER = 3;
    private static final el<t> semanticType_converter_ = new i(0);
    private int bitField0_;
    private e keyAnnotations_;
    private ek semanticType_ = emptyIntList();
    private e valueAnnotations_;

    static {
        k kVar = new k();
        DEFAULT_INSTANCE = kVar;
        du.registerDefaultInstance(k.class, kVar);
    }

    private k() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSemanticType(Iterable<? extends t> iterable) {
        ensureSemanticTypeIsMutable();
        Iterator<? extends t> it = iterable.iterator();
        while (it.hasNext()) {
            this.semanticType_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSemanticType(t tVar) {
        Objects.requireNonNull(tVar);
        ensureSemanticTypeIsMutable();
        this.semanticType_.i(tVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeyAnnotations() {
        this.keyAnnotations_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSemanticType() {
        this.semanticType_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValueAnnotations() {
        this.valueAnnotations_ = null;
        this.bitField0_ &= -3;
    }

    private void ensureSemanticTypeIsMutable() {
        ek ekVar = this.semanticType_;
        if (ekVar.c()) {
            return;
        }
        this.semanticType_ = du.mutableCopy(ekVar);
    }

    public static k getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeKeyAnnotations(e eVar) {
        Objects.requireNonNull(eVar);
        e eVar2 = this.keyAnnotations_;
        if (eVar2 != null && eVar2 != e.getDefaultInstance()) {
            d dVarNewBuilder = e.newBuilder(eVar2);
            dVarNewBuilder.mergeFrom((d) eVar);
            eVar = dVarNewBuilder.buildPartial();
        }
        this.keyAnnotations_ = eVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeValueAnnotations(e eVar) {
        Objects.requireNonNull(eVar);
        e eVar2 = this.valueAnnotations_;
        if (eVar2 != null && eVar2 != e.getDefaultInstance()) {
            d dVarNewBuilder = e.newBuilder(eVar2);
            dVarNewBuilder.mergeFrom((d) eVar);
            eVar = dVarNewBuilder.buildPartial();
        }
        this.valueAnnotations_ = eVar;
        this.bitField0_ |= 2;
    }

    public static j newBuilder() {
        return (j) DEFAULT_INSTANCE.createBuilder();
    }

    public static k parseDelimitedFrom(InputStream inputStream) {
        return (k) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static k parseFrom(v vVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<k> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyAnnotations(e eVar) {
        Objects.requireNonNull(eVar);
        this.keyAnnotations_ = eVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSemanticType(int i2, t tVar) {
        Objects.requireNonNull(tVar);
        ensureSemanticTypeIsMutable();
        this.semanticType_.e(i2, tVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValueAnnotations(e eVar) {
        Objects.requireNonNull(eVar);
        this.valueAnnotations_ = eVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ࠞ\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "semanticType_", s.f13142a, "keyAnnotations_", "valueAnnotations_"});
        }
        if (iOrdinal == 3) {
            return new k();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new j(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<k> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (k.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public e getKeyAnnotations() {
        e eVar = this.keyAnnotations_;
        return eVar == null ? e.getDefaultInstance() : eVar;
    }

    public t getSemanticType(int i2) {
        t tVarB = t.b(this.semanticType_.d(i2));
        return tVarB == null ? t.ST_NOT_SPECIFIED : tVarB;
    }

    public int getSemanticTypeCount() {
        return this.semanticType_.size();
    }

    public List<t> getSemanticTypeList() {
        return new em(this.semanticType_, semanticType_converter_);
    }

    public e getValueAnnotations() {
        e eVar = this.valueAnnotations_;
        return eVar == null ? e.getDefaultInstance() : eVar;
    }

    public boolean hasKeyAnnotations() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasValueAnnotations() {
        return (this.bitField0_ & 2) != 0;
    }

    public static j newBuilder(k kVar) {
        return (j) DEFAULT_INSTANCE.createBuilder(kVar);
    }

    public static k parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (k) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static k parseFrom(v vVar, de deVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static k parseFrom(z zVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static k parseFrom(z zVar, de deVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static k parseFrom(InputStream inputStream) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static k parseFrom(InputStream inputStream, de deVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static k parseFrom(ByteBuffer byteBuffer) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static k parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static k parseFrom(byte[] bArr) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static k parseFrom(byte[] bArr, de deVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
