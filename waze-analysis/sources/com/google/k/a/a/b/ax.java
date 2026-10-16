package com.google.k.a.a.b;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ax extends com.google.v.du<ax, av> implements com.google.v.fj {
    private static final ax DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ax> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private int type_;

    static {
        ax axVar = new ax();
        DEFAULT_INSTANCE = axVar;
        com.google.v.du.registerDefaultInstance(ax.class, axVar);
    }

    private ax() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -2;
        this.type_ = 0;
    }

    public static ax getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static av newBuilder() {
        return (av) DEFAULT_INSTANCE.createBuilder();
    }

    public static ax parseDelimitedFrom(InputStream inputStream) {
        return (ax) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ax parseFrom(com.google.v.v vVar) {
        return (ax) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ax> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(aw awVar) {
        this.type_ = awVar.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"bitField0_", "type_", c.f11206j});
        }
        if (iOrdinal == 3) {
            return new ax();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new av(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ax> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ax.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public aw getType() {
        aw awVarA = aw.a(this.type_);
        return awVarA == null ? aw.TYPE_ANY : awVarA;
    }

    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static av newBuilder(ax axVar) {
        return (av) DEFAULT_INSTANCE.createBuilder(axVar);
    }

    public static ax parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ax) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ax parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ax) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ax parseFrom(com.google.v.z zVar) {
        return (ax) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ax parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ax) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ax parseFrom(InputStream inputStream) {
        return (ax) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ax parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ax) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ax parseFrom(ByteBuffer byteBuffer) {
        return (ax) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ax parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ax) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ax parseFrom(byte[] bArr) {
        return (ax) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ax parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ax) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
