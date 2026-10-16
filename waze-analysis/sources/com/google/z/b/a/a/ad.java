package com.google.z.b.a.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.ds;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.en;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.gm;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ad extends du<ad, ac> implements fj {
    private static final ad DEFAULT_INSTANCE;
    public static final int ELIGIBLE_SURFACES_FIELD_NUMBER = 2;
    public static final int MESSAGE_SET_EXTENSION_FIELD_NUMBER = 525000454;
    private static volatile fo<ad> PARSER;
    public static final ds<com.google.w.n.a.b, ad> messageSetExtension;
    private int eligibleSurfacesMemoizedSerializedSize = -1;
    private en eligibleSurfaces_ = emptyLongList();

    static {
        ad adVar = new ad();
        DEFAULT_INSTANCE = adVar;
        du.registerDefaultInstance(ad.class, adVar);
        messageSetExtension = du.newSingularGeneratedExtension(com.google.w.n.a.b.getDefaultInstance(), getDefaultInstance(), getDefaultInstance(), null, MESSAGE_SET_EXTENSION_FIELD_NUMBER, gm.MESSAGE, ad.class);
    }

    private ad() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEligibleSurfaces(Iterable<? extends Long> iterable) {
        ensureEligibleSurfacesIsMutable();
        com.google.v.c.addAll(iterable, this.eligibleSurfaces_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEligibleSurfaces(long j2) {
        ensureEligibleSurfacesIsMutable();
        this.eligibleSurfaces_.g(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEligibleSurfaces() {
        this.eligibleSurfaces_ = emptyLongList();
    }

    private void ensureEligibleSurfacesIsMutable() {
        en enVar = this.eligibleSurfaces_;
        if (enVar.c()) {
            return;
        }
        this.eligibleSurfaces_ = du.mutableCopy(enVar);
    }

    public static ad getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ac newBuilder() {
        return (ac) DEFAULT_INSTANCE.createBuilder();
    }

    public static ad parseDelimitedFrom(InputStream inputStream) {
        return (ad) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ad parseFrom(com.google.v.v vVar) {
        return (ad) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ad> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEligibleSurfaces(int i2, long j2) {
        ensureEligibleSurfacesIsMutable();
        this.eligibleSurfaces_.d(i2, j2);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002%", new Object[]{"eligibleSurfaces_"});
        }
        if (iOrdinal == 3) {
            return new ad();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ac(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ad> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ad.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getEligibleSurfaces(int i2) {
        return this.eligibleSurfaces_.a(i2);
    }

    public int getEligibleSurfacesCount() {
        return this.eligibleSurfaces_.size();
    }

    public List<Long> getEligibleSurfacesList() {
        return this.eligibleSurfaces_;
    }

    public static ac newBuilder(ad adVar) {
        return (ac) DEFAULT_INSTANCE.createBuilder(adVar);
    }

    public static ad parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ad) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ad parseFrom(com.google.v.v vVar, de deVar) {
        return (ad) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ad parseFrom(com.google.v.z zVar) {
        return (ad) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ad parseFrom(com.google.v.z zVar, de deVar) {
        return (ad) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ad parseFrom(InputStream inputStream) {
        return (ad) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ad parseFrom(InputStream inputStream, de deVar) {
        return (ad) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ad parseFrom(ByteBuffer byteBuffer) {
        return (ad) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ad parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ad) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ad parseFrom(byte[] bArr) {
        return (ad) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ad parseFrom(byte[] bArr, de deVar) {
        return (ad) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
