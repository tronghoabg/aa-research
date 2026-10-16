package com.google.z.b.a.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ah extends du<ah, ag> implements fj {
    private static final ah DEFAULT_INSTANCE;
    private static volatile fo<ah> PARSER;

    static {
        ah ahVar = new ah();
        DEFAULT_INSTANCE = ahVar;
        du.registerDefaultInstance(ah.class, ahVar);
    }

    private ah() {
    }

    public static ah getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ag newBuilder() {
        return (ag) DEFAULT_INSTANCE.createBuilder();
    }

    public static ah parseDelimitedFrom(InputStream inputStream) {
        return (ah) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ah parseFrom(com.google.v.v vVar) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ah> parser() {
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0000", null);
        }
        if (iOrdinal == 3) {
            return new ah();
        }
        if (iOrdinal == 4) {
            return new ag(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ah> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ah.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static ag newBuilder(ah ahVar) {
        return (ag) DEFAULT_INSTANCE.createBuilder(ahVar);
    }

    public static ah parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ah) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ah parseFrom(com.google.v.v vVar, de deVar) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ah parseFrom(com.google.v.z zVar) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ah parseFrom(com.google.v.z zVar, de deVar) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ah parseFrom(InputStream inputStream) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ah parseFrom(InputStream inputStream, de deVar) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ah parseFrom(ByteBuffer byteBuffer) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ah parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ah parseFrom(byte[] bArr) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ah parseFrom(byte[] bArr, de deVar) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
