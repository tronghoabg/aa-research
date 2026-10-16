package com.google.k.a.a;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class aa extends com.google.v.du<aa, z> implements ab {
    private static final aa DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<aa> PARSER = null;
    public static final int X_INDICES_FIELD_NUMBER = 2;
    private int xIndicesMemoizedSerializedSize = -1;
    private com.google.v.ek xIndices_ = emptyIntList();

    static {
        aa aaVar = new aa();
        DEFAULT_INSTANCE = aaVar;
        com.google.v.du.registerDefaultInstance(aa.class, aaVar);
    }

    private aa() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllXIndices(Iterable<? extends Integer> iterable) {
        ensureXIndicesIsMutable();
        com.google.v.c.addAll(iterable, this.xIndices_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addXIndices(int i2) {
        ensureXIndicesIsMutable();
        this.xIndices_.i(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearXIndices() {
        this.xIndices_ = emptyIntList();
    }

    private void ensureXIndicesIsMutable() {
        com.google.v.ek ekVar = this.xIndices_;
        if (ekVar.c()) {
            return;
        }
        this.xIndices_ = com.google.v.du.mutableCopy(ekVar);
    }

    public static aa getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static z newBuilder() {
        return (z) DEFAULT_INSTANCE.createBuilder();
    }

    public static aa parseDelimitedFrom(InputStream inputStream) {
        return (aa) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aa parseFrom(com.google.v.v vVar) {
        return (aa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aa> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setXIndices(int i2, int i3) {
        ensureXIndicesIsMutable();
        this.xIndices_.e(i2, i3);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002'", new Object[]{"xIndices_"});
        }
        if (iOrdinal == 3) {
            return new aa();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new z(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aa> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aa.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getXIndices(int i2) {
        return this.xIndices_.d(i2);
    }

    public int getXIndicesCount() {
        return this.xIndices_.size();
    }

    public List<Integer> getXIndicesList() {
        return this.xIndices_;
    }

    public static z newBuilder(aa aaVar) {
        return (z) DEFAULT_INSTANCE.createBuilder(aaVar);
    }

    public static aa parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aa) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aa parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aa parseFrom(com.google.v.z zVar) {
        return (aa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aa parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aa parseFrom(InputStream inputStream) {
        return (aa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aa parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aa parseFrom(ByteBuffer byteBuffer) {
        return (aa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aa parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aa parseFrom(byte[] bArr) {
        return (aa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aa parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
