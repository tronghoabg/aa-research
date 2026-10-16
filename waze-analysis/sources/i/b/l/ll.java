package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ll extends com.google.v.du<ll, lj> implements com.google.v.fj {
    public static final int BLOCKED_ROUTE_IMPACT_TYPE_FIELD_NUMBER = 3;
    private static final ll DEFAULT_INSTANCE;
    public static final int DOMINANT_CLOSURE_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<ll> PARSER;
    private int bitField0_;
    private int blockedRouteImpactType_;
    private ln dominantClosure_;
    private String name_ = "closure_impact";

    static {
        ll llVar = new ll();
        DEFAULT_INSTANCE = llVar;
        com.google.v.du.registerDefaultInstance(ll.class, llVar);
    }

    private ll() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBlockedRouteImpactType() {
        this.bitField0_ &= -5;
        this.blockedRouteImpactType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDominantClosure() {
        this.dominantClosure_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -2;
        this.name_ = getDefaultInstance().getName();
    }

    public static ll getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDominantClosure(ln lnVar) {
        Objects.requireNonNull(lnVar);
        ln lnVar2 = this.dominantClosure_;
        if (lnVar2 != null && lnVar2 != ln.getDefaultInstance()) {
            lm lmVarNewBuilder = ln.newBuilder(lnVar2);
            lmVarNewBuilder.mergeFrom((lm) lnVar);
            lnVar = lmVarNewBuilder.buildPartial();
        }
        this.dominantClosure_ = lnVar;
        this.bitField0_ |= 2;
    }

    public static lj newBuilder() {
        return (lj) DEFAULT_INSTANCE.createBuilder();
    }

    public static ll parseDelimitedFrom(InputStream inputStream) {
        return (ll) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ll parseFrom(com.google.v.v vVar) {
        return (ll) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ll> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBlockedRouteImpactType(lk lkVar) {
        this.blockedRouteImpactType_ = lkVar.getNumber();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDominantClosure(ln lnVar) {
        Objects.requireNonNull(lnVar);
        this.dominantClosure_ = lnVar;
        this.bitField0_ |= 2;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003᠌\u0002", new Object[]{"bitField0_", "name_", "dominantClosure_", "blockedRouteImpactType_", hf.f48747k});
        }
        if (iOrdinal == 3) {
            return new ll();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new lj(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ll> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ll.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public lk getBlockedRouteImpactType() {
        lk lkVarA = lk.a(this.blockedRouteImpactType_);
        return lkVarA == null ? lk.IMPACT_TYPE_UNSPECIFIED : lkVarA;
    }

    public ln getDominantClosure() {
        ln lnVar = this.dominantClosure_;
        return lnVar == null ? ln.getDefaultInstance() : lnVar;
    }

    public String getName() {
        return this.name_;
    }

    public com.google.v.v getNameBytes() {
        return com.google.v.v.s(this.name_);
    }

    public boolean hasBlockedRouteImpactType() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasDominantClosure() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    public static lj newBuilder(ll llVar) {
        return (lj) DEFAULT_INSTANCE.createBuilder(llVar);
    }

    public static ll parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ll) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ll parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ll) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ll parseFrom(com.google.v.z zVar) {
        return (ll) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ll parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ll) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ll parseFrom(InputStream inputStream) {
        return (ll) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ll parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ll) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ll parseFrom(ByteBuffer byteBuffer) {
        return (ll) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ll parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ll) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ll parseFrom(byte[] bArr) {
        return (ll) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ll parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ll) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
