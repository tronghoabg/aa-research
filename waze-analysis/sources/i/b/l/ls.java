package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ls extends com.google.v.du<ls, lr> implements com.google.v.fj {
    public static final int ALTERNATIVE_ROUTE_FIELD_NUMBER = 3;
    public static final int ALTERNATIVE_ROUTE_UNIQUE_NEGATIVE_FACTORS_FIELD_NUMBER = 4;
    public static final int CURRENT_ROUTE_FIELD_NUMBER = 2;
    public static final int CURRENT_ROUTE_UNIQUE_POSITIVE_FACTORS_FIELD_NUMBER = 5;
    private static final ls DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<ls> PARSER;
    private static final com.google.v.el<mf> alternativeRouteUniqueNegativeFactors_converter_ = new ff(11);
    private static final com.google.v.el<mg> currentRouteUniquePositiveFactors_converter_ = new ff(12);
    private me alternativeRoute_;
    private int bitField0_;
    private me currentRoute_;
    private String name_ = "fastest_not_suggested";
    private com.google.v.ek alternativeRouteUniqueNegativeFactors_ = emptyIntList();
    private com.google.v.ek currentRouteUniquePositiveFactors_ = emptyIntList();

    static {
        ls lsVar = new ls();
        DEFAULT_INSTANCE = lsVar;
        com.google.v.du.registerDefaultInstance(ls.class, lsVar);
    }

    private ls() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAlternativeRouteUniqueNegativeFactors(Iterable<? extends mf> iterable) {
        ensureAlternativeRouteUniqueNegativeFactorsIsMutable();
        Iterator<? extends mf> it = iterable.iterator();
        while (it.hasNext()) {
            this.alternativeRouteUniqueNegativeFactors_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCurrentRouteUniquePositiveFactors(Iterable<? extends mg> iterable) {
        ensureCurrentRouteUniquePositiveFactorsIsMutable();
        Iterator<? extends mg> it = iterable.iterator();
        while (it.hasNext()) {
            this.currentRouteUniquePositiveFactors_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAlternativeRouteUniqueNegativeFactors(mf mfVar) {
        Objects.requireNonNull(mfVar);
        ensureAlternativeRouteUniqueNegativeFactorsIsMutable();
        this.alternativeRouteUniqueNegativeFactors_.i(mfVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCurrentRouteUniquePositiveFactors(mg mgVar) {
        Objects.requireNonNull(mgVar);
        ensureCurrentRouteUniquePositiveFactorsIsMutable();
        this.currentRouteUniquePositiveFactors_.i(mgVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlternativeRoute() {
        this.alternativeRoute_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlternativeRouteUniqueNegativeFactors() {
        this.alternativeRouteUniqueNegativeFactors_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentRoute() {
        this.currentRoute_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentRouteUniquePositiveFactors() {
        this.currentRouteUniquePositiveFactors_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -2;
        this.name_ = getDefaultInstance().getName();
    }

    private void ensureAlternativeRouteUniqueNegativeFactorsIsMutable() {
        com.google.v.ek ekVar = this.alternativeRouteUniqueNegativeFactors_;
        if (ekVar.c()) {
            return;
        }
        this.alternativeRouteUniqueNegativeFactors_ = com.google.v.du.mutableCopy(ekVar);
    }

    private void ensureCurrentRouteUniquePositiveFactorsIsMutable() {
        com.google.v.ek ekVar = this.currentRouteUniquePositiveFactors_;
        if (ekVar.c()) {
            return;
        }
        this.currentRouteUniquePositiveFactors_ = com.google.v.du.mutableCopy(ekVar);
    }

    public static ls getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAlternativeRoute(me meVar) {
        Objects.requireNonNull(meVar);
        me meVar2 = this.alternativeRoute_;
        if (meVar2 != null && meVar2 != me.getDefaultInstance()) {
            mc mcVarNewBuilder = me.newBuilder(meVar2);
            mcVarNewBuilder.mergeFrom((mc) meVar);
            meVar = mcVarNewBuilder.buildPartial();
        }
        this.alternativeRoute_ = meVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCurrentRoute(me meVar) {
        Objects.requireNonNull(meVar);
        me meVar2 = this.currentRoute_;
        if (meVar2 != null && meVar2 != me.getDefaultInstance()) {
            mc mcVarNewBuilder = me.newBuilder(meVar2);
            mcVarNewBuilder.mergeFrom((mc) meVar);
            meVar = mcVarNewBuilder.buildPartial();
        }
        this.currentRoute_ = meVar;
        this.bitField0_ |= 2;
    }

    public static lr newBuilder() {
        return (lr) DEFAULT_INSTANCE.createBuilder();
    }

    public static ls parseDelimitedFrom(InputStream inputStream) {
        return (ls) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ls parseFrom(com.google.v.v vVar) {
        return (ls) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ls> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlternativeRoute(me meVar) {
        Objects.requireNonNull(meVar);
        this.alternativeRoute_ = meVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlternativeRouteUniqueNegativeFactors(int i2, mf mfVar) {
        Objects.requireNonNull(mfVar);
        ensureAlternativeRouteUniqueNegativeFactorsIsMutable();
        this.alternativeRouteUniqueNegativeFactors_.e(i2, mfVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentRoute(me meVar) {
        Objects.requireNonNull(meVar);
        this.currentRoute_ = meVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentRouteUniquePositiveFactors(int i2, mg mgVar) {
        Objects.requireNonNull(mgVar);
        ensureCurrentRouteUniquePositiveFactorsIsMutable();
        this.currentRouteUniquePositiveFactors_.e(i2, mgVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(com.google.v.v vVar) {
        this.name_ = vVar.u();
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ࠞ\u0005ࠞ", new Object[]{"bitField0_", "name_", "currentRoute_", "alternativeRoute_", "alternativeRouteUniqueNegativeFactors_", hf.q, "currentRouteUniquePositiveFactors_", hf.r});
        }
        if (iOrdinal == 3) {
            return new ls();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new lr(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ls> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ls.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public me getAlternativeRoute() {
        me meVar = this.alternativeRoute_;
        return meVar == null ? me.getDefaultInstance() : meVar;
    }

    public mf getAlternativeRouteUniqueNegativeFactors(int i2) {
        mf mfVarA = mf.a(this.alternativeRouteUniqueNegativeFactors_.d(i2));
        return mfVarA == null ? mf.UNSPECIFIED_NEGATIVE_FACTOR : mfVarA;
    }

    public int getAlternativeRouteUniqueNegativeFactorsCount() {
        return this.alternativeRouteUniqueNegativeFactors_.size();
    }

    public List<mf> getAlternativeRouteUniqueNegativeFactorsList() {
        return new com.google.v.em(this.alternativeRouteUniqueNegativeFactors_, alternativeRouteUniqueNegativeFactors_converter_);
    }

    public me getCurrentRoute() {
        me meVar = this.currentRoute_;
        return meVar == null ? me.getDefaultInstance() : meVar;
    }

    public mg getCurrentRouteUniquePositiveFactors(int i2) {
        mg mgVarA = mg.a(this.currentRouteUniquePositiveFactors_.d(i2));
        return mgVarA == null ? mg.UNSPECIFIED_POSITIVE_FACTOR : mgVarA;
    }

    public int getCurrentRouteUniquePositiveFactorsCount() {
        return this.currentRouteUniquePositiveFactors_.size();
    }

    public List<mg> getCurrentRouteUniquePositiveFactorsList() {
        return new com.google.v.em(this.currentRouteUniquePositiveFactors_, currentRouteUniquePositiveFactors_converter_);
    }

    public String getName() {
        return this.name_;
    }

    public com.google.v.v getNameBytes() {
        return com.google.v.v.s(this.name_);
    }

    public boolean hasAlternativeRoute() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasCurrentRoute() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    public static lr newBuilder(ls lsVar) {
        return (lr) DEFAULT_INSTANCE.createBuilder(lsVar);
    }

    public static ls parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ls) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ls parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ls) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ls parseFrom(com.google.v.z zVar) {
        return (ls) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ls parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ls) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ls parseFrom(InputStream inputStream) {
        return (ls) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ls parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ls) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ls parseFrom(ByteBuffer byteBuffer) {
        return (ls) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ls parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ls) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ls parseFrom(byte[] bArr) {
        return (ls) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ls parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ls) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
