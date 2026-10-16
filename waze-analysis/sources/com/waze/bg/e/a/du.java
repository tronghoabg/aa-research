package com.waze.bg.e.a;

import j$.util.DesugarCollections;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class du extends com.google.v.du<du, ds> implements com.google.v.fj {
    private static final du DEFAULT_INSTANCE;
    public static final int DETOUR_ESTIMATIONS_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<du> PARSER;
    private com.google.v.ff<Integer, dc> detourEstimations_ = com.google.v.ff.a();

    static {
        du duVar = new du();
        DEFAULT_INSTANCE = duVar;
        com.google.v.du.registerDefaultInstance(du.class, duVar);
    }

    private du() {
    }

    public static du getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<Integer, dc> getMutableDetourEstimationsMap() {
        return internalGetMutableDetourEstimations();
    }

    private com.google.v.ff<Integer, dc> internalGetDetourEstimations() {
        return this.detourEstimations_;
    }

    private com.google.v.ff<Integer, dc> internalGetMutableDetourEstimations() {
        if (!this.detourEstimations_.e()) {
            this.detourEstimations_ = this.detourEstimations_.b();
        }
        return this.detourEstimations_;
    }

    public static ds newBuilder() {
        return (ds) DEFAULT_INSTANCE.createBuilder();
    }

    public static du parseDelimitedFrom(InputStream inputStream) {
        return (du) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static du parseFrom(com.google.v.v vVar) {
        return (du) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<du> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public boolean containsDetourEstimations(int i2) {
        return internalGetDetourEstimations().containsKey(Integer.valueOf(i2));
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"detourEstimations_", dt.f16672a});
        }
        if (iOrdinal == 3) {
            return new du();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ds(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<du> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (du.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getDetourEstimationsCount() {
        return internalGetDetourEstimations().size();
    }

    public Map<Integer, dc> getDetourEstimationsMap() {
        return DesugarCollections.unmodifiableMap(internalGetDetourEstimations());
    }

    public dc getDetourEstimationsOrDefault(int i2, dc dcVar) {
        dc dcVar2 = internalGetDetourEstimations().get(Integer.valueOf(i2));
        return dcVar2 != null ? dcVar2 : dcVar;
    }

    public dc getDetourEstimationsOrThrow(int i2) {
        dc dcVar = internalGetDetourEstimations().get(Integer.valueOf(i2));
        if (dcVar != null) {
            return dcVar;
        }
        throw new IllegalArgumentException();
    }

    public static ds newBuilder(du duVar) {
        return (ds) DEFAULT_INSTANCE.createBuilder(duVar);
    }

    public static du parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (du) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static du parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (du) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static du parseFrom(com.google.v.z zVar) {
        return (du) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static du parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (du) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static du parseFrom(InputStream inputStream) {
        return (du) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static du parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (du) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static du parseFrom(ByteBuffer byteBuffer) {
        return (du) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static du parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (du) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static du parseFrom(byte[] bArr) {
        return (du) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static du parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (du) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
