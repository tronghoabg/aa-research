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
public final class e extends du<e, d> implements fj {
    private static final e DEFAULT_INSTANCE;
    private static volatile fo<e> PARSER = null;
    public static final int QUALIFIER_FIELD_NUMBER = 2;
    public static final int SEMANTIC_TYPE_FIELD_NUMBER = 1;
    private static final el<t> semanticType_converter_ = new i(1);
    private int bitField0_;
    private q qualifier_;
    private int semanticTypeMemoizedSerializedSize;
    private ek semanticType_ = emptyIntList();

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        du.registerDefaultInstance(e.class, eVar);
    }

    private e() {
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
    public void clearQualifier() {
        this.qualifier_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSemanticType() {
        this.semanticType_ = emptyIntList();
    }

    private void ensureSemanticTypeIsMutable() {
        ek ekVar = this.semanticType_;
        if (ekVar.c()) {
            return;
        }
        this.semanticType_ = du.mutableCopy(ekVar);
    }

    public static e getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeQualifier(q qVar) {
        Objects.requireNonNull(qVar);
        q qVar2 = this.qualifier_;
        if (qVar2 != null && qVar2 != q.getDefaultInstance()) {
            p pVarNewBuilder = q.newBuilder(qVar2);
            pVarNewBuilder.mergeFrom((p) qVar);
            qVar = pVarNewBuilder.buildPartial();
        }
        this.qualifier_ = qVar;
        this.bitField0_ |= 1;
    }

    public static d newBuilder() {
        return (d) DEFAULT_INSTANCE.createBuilder();
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
    public void setQualifier(q qVar) {
        Objects.requireNonNull(qVar);
        this.qualifier_ = qVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSemanticType(int i2, t tVar) {
        Objects.requireNonNull(tVar);
        ensureSemanticTypeIsMutable();
        this.semanticType_.e(i2, tVar.getNumber());
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ࠬ\u0002ဉ\u0000", new Object[]{"bitField0_", "semanticType_", s.f13142a, "qualifier_"});
        }
        if (iOrdinal == 3) {
            return new e();
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

    public q getQualifier() {
        q qVar = this.qualifier_;
        return qVar == null ? q.getDefaultInstance() : qVar;
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

    public boolean hasQualifier() {
        return (this.bitField0_ & 1) != 0;
    }

    public static d newBuilder(e eVar) {
        return (d) DEFAULT_INSTANCE.createBuilder(eVar);
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
