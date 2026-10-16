package com.google.v;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ec extends du<ec, eb> implements fj {
    private static final ec DEFAULT_INSTANCE;
    private static volatile fo<ec> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int value_;

    static {
        ec ecVar = new ec();
        DEFAULT_INSTANCE = ecVar;
        du.registerDefaultInstance(ec.class, ecVar);
    }

    private ec() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = 0;
    }

    public static ec getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static eb newBuilder() {
        return (eb) DEFAULT_INSTANCE.createBuilder();
    }

    public static ec of(int i2) {
        eb ebVarNewBuilder = newBuilder();
        ebVarNewBuilder.copyOnWrite();
        ((ec) ebVarNewBuilder.instance).setValue(i2);
        return ebVarNewBuilder.build();
    }

    public static ec parseDelimitedFrom(InputStream inputStream) {
        return (ec) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ec parseFrom(v vVar) {
        return (ec) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ec> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(int i2) {
        this.value_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"value_"});
        }
        if (iOrdinal == 3) {
            return new ec();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new eb(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ec> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ec.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getValue() {
        return this.value_;
    }

    public static eb newBuilder(ec ecVar) {
        return (eb) DEFAULT_INSTANCE.createBuilder(ecVar);
    }

    public static ec parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ec) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ec parseFrom(v vVar, de deVar) {
        return (ec) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ec parseFrom(z zVar) {
        return (ec) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ec parseFrom(z zVar, de deVar) {
        return (ec) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ec parseFrom(InputStream inputStream) {
        return (ec) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ec parseFrom(InputStream inputStream, de deVar) {
        return (ec) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ec parseFrom(ByteBuffer byteBuffer) {
        return (ec) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ec parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ec) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ec parseFrom(byte[] bArr) {
        return (ec) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ec parseFrom(byte[] bArr, de deVar) {
        return (ec) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
