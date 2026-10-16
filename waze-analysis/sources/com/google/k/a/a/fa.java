package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class fa extends com.google.v.du<fa, ez> implements com.google.v.fj {
    private static final fa DEFAULT_INSTANCE;
    public static final int MATERIAL_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<fa> PARSER;
    private static final com.google.v.el<ey> material_converter_ = new fn(1);
    private com.google.v.ek material_ = emptyIntList();

    static {
        fa faVar = new fa();
        DEFAULT_INSTANCE = faVar;
        com.google.v.du.registerDefaultInstance(fa.class, faVar);
    }

    private fa() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMaterial(Iterable<? extends ey> iterable) {
        ensureMaterialIsMutable();
        Iterator<? extends ey> it = iterable.iterator();
        while (it.hasNext()) {
            this.material_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMaterial(ey eyVar) {
        Objects.requireNonNull(eyVar);
        ensureMaterialIsMutable();
        this.material_.i(eyVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaterial() {
        this.material_ = emptyIntList();
    }

    private void ensureMaterialIsMutable() {
        com.google.v.ek ekVar = this.material_;
        if (ekVar.c()) {
            return;
        }
        this.material_ = com.google.v.du.mutableCopy(ekVar);
    }

    public static fa getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ez newBuilder() {
        return (ez) DEFAULT_INSTANCE.createBuilder();
    }

    public static fa parseDelimitedFrom(InputStream inputStream) {
        return (fa) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fa parseFrom(com.google.v.v vVar) {
        return (fa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<fa> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaterial(int i2, ey eyVar) {
        Objects.requireNonNull(eyVar);
        ensureMaterialIsMutable();
        this.material_.e(i2, eyVar.getNumber());
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001ࠞ", new Object[]{"material_", h.f11882k});
        }
        if (iOrdinal == 3) {
            return new fa();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ez(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<fa> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (fa.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ey getMaterial(int i2) {
        ey eyVarA = ey.a(this.material_.d(i2));
        return eyVarA == null ? ey.UNKNOWN_LOGICAL_MATERIAL : eyVarA;
    }

    public int getMaterialCount() {
        return this.material_.size();
    }

    public List<ey> getMaterialList() {
        return new com.google.v.em(this.material_, material_converter_);
    }

    public static ez newBuilder(fa faVar) {
        return (ez) DEFAULT_INSTANCE.createBuilder(faVar);
    }

    public static fa parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fa) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fa parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (fa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static fa parseFrom(com.google.v.z zVar) {
        return (fa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static fa parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (fa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static fa parseFrom(InputStream inputStream) {
        return (fa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fa parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fa parseFrom(ByteBuffer byteBuffer) {
        return (fa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static fa parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (fa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static fa parseFrom(byte[] bArr) {
        return (fa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static fa parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (fa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
