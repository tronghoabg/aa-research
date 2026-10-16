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
public final class c extends du<c, b> implements fj {
    private static final c DEFAULT_INSTANCE;
    public static final int ELIGIBLE_USES_FIELD_NUMBER = 5;
    public static final int FEATURES_FIELD_NUMBER = 1;
    private static volatile fo<c> PARSER = null;
    public static final int USE_CASES_FIELD_NUMBER = 2;
    private int eligibleUsesMemoizedSerializedSize;
    private static final el<g> useCases_converter_ = new a(1);
    private static final el<i> eligibleUses_converter_ = new a(0);
    private eo<String> features_ = emptyProtobufList();
    private ek useCases_ = emptyIntList();
    private ek eligibleUses_ = emptyIntList();

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        du.registerDefaultInstance(c.class, cVar);
    }

    private c() {
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

    private void ensureUseCasesIsMutable() {
        ek ekVar = this.useCases_;
        if (ekVar.c()) {
            return;
        }
        this.useCases_ = du.mutableCopy(ekVar);
    }

    public static c getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static c parseDelimitedFrom(InputStream inputStream) {
        return (c) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static c parseFrom(v vVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<c> parser() {
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0000\u0001\u0005\u0003\u0000\u0003\u0000\u0001\u001a\u0002ࠞ\u0005ࠬ", new Object[]{"features_", "useCases_", h.f13102b, "eligibleUses_", h.f13101a});
        }
        if (iOrdinal == 3) {
            return new c();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new b(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<c> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (c.class) {
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

    public static b newBuilder(c cVar) {
        return (b) DEFAULT_INSTANCE.createBuilder(cVar);
    }

    public static c parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (c) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static c parseFrom(v vVar, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static c parseFrom(z zVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static c parseFrom(z zVar, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static c parseFrom(InputStream inputStream) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static c parseFrom(InputStream inputStream, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static c parseFrom(ByteBuffer byteBuffer) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static c parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static c parseFrom(byte[] bArr) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static c parseFrom(byte[] bArr, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
