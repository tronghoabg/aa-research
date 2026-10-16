package com.waze.sharedrive.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ak extends du<ak, aj> implements fj {
    private static final ak DEFAULT_INSTANCE;
    private static volatile fo<ak> PARSER;

    static {
        ak akVar = new ak();
        DEFAULT_INSTANCE = akVar;
        du.registerDefaultInstance(ak.class, akVar);
    }

    private ak() {
    }

    public static ak getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static aj newBuilder() {
        return (aj) DEFAULT_INSTANCE.createBuilder();
    }

    public static ak parseDelimitedFrom(InputStream inputStream) {
        return (ak) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ak parseFrom(com.google.v.v vVar) {
        return (ak) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ak> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        byte[] bArr = null;
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
        }
        if (iOrdinal == 3) {
            return new ak();
        }
        if (iOrdinal == 4) {
            return new aj(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ak> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ak.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static aj newBuilder(ak akVar) {
        return (aj) DEFAULT_INSTANCE.createBuilder(akVar);
    }

    public static ak parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ak) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ak parseFrom(com.google.v.v vVar, de deVar) {
        return (ak) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ak parseFrom(com.google.v.z zVar) {
        return (ak) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ak parseFrom(com.google.v.z zVar, de deVar) {
        return (ak) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ak parseFrom(InputStream inputStream) {
        return (ak) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ak parseFrom(InputStream inputStream, de deVar) {
        return (ak) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ak parseFrom(ByteBuffer byteBuffer) {
        return (ak) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ak parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ak) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ak parseFrom(byte[] bArr) {
        return (ak) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ak parseFrom(byte[] bArr, de deVar) {
        return (ak) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
