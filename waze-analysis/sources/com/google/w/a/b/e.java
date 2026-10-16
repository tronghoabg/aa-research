package com.google.w.a.b;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.ek;
import com.google.v.el;
import com.google.v.em;
import com.google.v.eo;
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
    public static final int ELIGIBLE_USES_FIELD_NUMBER = 5;
    public static final int FEATURES_FIELD_NUMBER = 1;
    public static final int FIELDS_FIELD_NUMBER = 3;
    public static final int FIELD_NAMES_FIELD_NUMBER = 4;
    private static volatile fo<e> PARSER = null;
    public static final int USE_CASES_FIELD_NUMBER = 2;
    private int eligibleUsesMemoizedSerializedSize;
    private static final el<g> useCases_converter_ = new a(2);
    private static final el<i> eligibleUses_converter_ = new a(3);
    private eo<String> features_ = emptyProtobufList();
    private ek useCases_ = emptyIntList();
    private ek eligibleUses_ = emptyIntList();
    private ek fields_ = emptyIntList();
    private eo<String> fieldNames_ = emptyProtobufList();

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        du.registerDefaultInstance(e.class, eVar);
    }

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEligibleUses(Iterable<? extends i> iterable) {
        ensureEligibleUsesIsMutable();
        Iterator<? extends i> it = iterable.iterator();
        while (it.hasNext()) {
            this.eligibleUses_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFeatures(Iterable<String> iterable) {
        ensureFeaturesIsMutable();
        com.google.v.c.addAll(iterable, this.features_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFieldNames(Iterable<String> iterable) {
        ensureFieldNamesIsMutable();
        com.google.v.c.addAll(iterable, this.fieldNames_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFields(Iterable<? extends Integer> iterable) {
        ensureFieldsIsMutable();
        com.google.v.c.addAll(iterable, this.fields_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllUseCases(Iterable<? extends g> iterable) {
        ensureUseCasesIsMutable();
        Iterator<? extends g> it = iterable.iterator();
        while (it.hasNext()) {
            this.useCases_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEligibleUses(i iVar) {
        Objects.requireNonNull(iVar);
        ensureEligibleUsesIsMutable();
        this.eligibleUses_.i(iVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFeatures(String str) {
        Objects.requireNonNull(str);
        ensureFeaturesIsMutable();
        this.features_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFeaturesBytes(v vVar) {
        ensureFeaturesIsMutable();
        this.features_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFieldNames(String str) {
        Objects.requireNonNull(str);
        ensureFieldNamesIsMutable();
        this.fieldNames_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFieldNamesBytes(v vVar) {
        ensureFieldNamesIsMutable();
        this.fieldNames_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFields(int i2) {
        ensureFieldsIsMutable();
        this.fields_.i(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUseCases(g gVar) {
        Objects.requireNonNull(gVar);
        ensureUseCasesIsMutable();
        this.useCases_.i(gVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEligibleUses() {
        this.eligibleUses_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeatures() {
        this.features_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFieldNames() {
        this.fieldNames_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFields() {
        this.fields_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUseCases() {
        this.useCases_ = emptyIntList();
    }

    private void ensureEligibleUsesIsMutable() {
        ek ekVar = this.eligibleUses_;
        if (ekVar.c()) {
            return;
        }
        this.eligibleUses_ = du.mutableCopy(ekVar);
    }

    private void ensureFeaturesIsMutable() {
        eo<String> eoVar = this.features_;
        if (eoVar.c()) {
            return;
        }
        this.features_ = du.mutableCopy(eoVar);
    }

    private void ensureFieldNamesIsMutable() {
        eo<String> eoVar = this.fieldNames_;
        if (eoVar.c()) {
            return;
        }
        this.fieldNames_ = du.mutableCopy(eoVar);
    }

    private void ensureFieldsIsMutable() {
        ek ekVar = this.fields_;
        if (ekVar.c()) {
            return;
        }
        this.fields_ = du.mutableCopy(ekVar);
    }

    private void ensureUseCasesIsMutable() {
        ek ekVar = this.useCases_;
        if (ekVar.c()) {
            return;
        }
        this.useCases_ = du.mutableCopy(ekVar);
    }

    public static e getDefaultInstance() {
        return DEFAULT_INSTANCE;
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
    public void setEligibleUses(int i2, i iVar) {
        Objects.requireNonNull(iVar);
        ensureEligibleUsesIsMutable();
        this.eligibleUses_.e(i2, iVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeatures(int i2, String str) {
        Objects.requireNonNull(str);
        ensureFeaturesIsMutable();
        this.features_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFieldNames(int i2, String str) {
        Objects.requireNonNull(str);
        ensureFieldNamesIsMutable();
        this.fieldNames_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFields(int i2, int i3) {
        ensureFieldsIsMutable();
        this.fields_.e(i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUseCases(int i2, g gVar) {
        Objects.requireNonNull(gVar);
        ensureUseCasesIsMutable();
        this.useCases_.e(i2, gVar.getNumber());
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0005\u0000\u0001\u001a\u0002ࠞ\u0003\u0016\u0004\u001a\u0005ࠬ", new Object[]{"features_", "useCases_", h.f13102b, "fields_", "fieldNames_", "eligibleUses_", h.f13101a});
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

    public i getEligibleUses(int i2) {
        i iVarA = i.a(this.eligibleUses_.d(i2));
        return iVarA == null ? i.EC_NONE : iVarA;
    }

    public int getEligibleUsesCount() {
        return this.eligibleUses_.size();
    }

    public List<i> getEligibleUsesList() {
        return new em(this.eligibleUses_, eligibleUses_converter_);
    }

    public String getFeatures(int i2) {
        return this.features_.get(i2);
    }

    public v getFeaturesBytes(int i2) {
        return v.s(this.features_.get(i2));
    }

    public int getFeaturesCount() {
        return this.features_.size();
    }

    public List<String> getFeaturesList() {
        return this.features_;
    }

    public String getFieldNames(int i2) {
        return this.fieldNames_.get(i2);
    }

    public v getFieldNamesBytes(int i2) {
        return v.s(this.fieldNames_.get(i2));
    }

    public int getFieldNamesCount() {
        return this.fieldNames_.size();
    }

    public List<String> getFieldNamesList() {
        return this.fieldNames_;
    }

    public int getFields(int i2) {
        return this.fields_.d(i2);
    }

    public int getFieldsCount() {
        return this.fields_.size();
    }

    public List<Integer> getFieldsList() {
        return this.fields_;
    }

    public g getUseCases(int i2) {
        g gVarA = g.a(this.useCases_.d(i2));
        return gVarA == null ? g.UC_DEFAULT : gVarA;
    }

    public int getUseCasesCount() {
        return this.useCases_.size();
    }

    public List<g> getUseCasesList() {
        return new em(this.useCases_, useCases_converter_);
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
