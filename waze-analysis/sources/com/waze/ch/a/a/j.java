package com.waze.ch.a.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class j extends du<j, i> implements fj {
    private static final j DEFAULT_INSTANCE;
    private static volatile fo<j> PARSER;

    static {
        j jVar = new j();
        DEFAULT_INSTANCE = jVar;
        du.registerDefaultInstance(j.class, jVar);
    }

    private j() {
    }

    public static j getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static i newBuilder() {
        return (i) DEFAULT_INSTANCE.createBuilder();
    }

    public static j parseDelimitedFrom(InputStream inputStream) {
        return (j) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static j parseFrom(v vVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<j> parser() {
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
            return new j();
        }
        if (iOrdinal == 4) {
            return new i(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<j> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (j.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static i newBuilder(j jVar) {
        return (i) DEFAULT_INSTANCE.createBuilder(jVar);
    }

    public static j parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (j) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static j parseFrom(v vVar, de deVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static j parseFrom(z zVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static j parseFrom(z zVar, de deVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static j parseFrom(InputStream inputStream) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static j parseFrom(InputStream inputStream, de deVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static j parseFrom(ByteBuffer byteBuffer) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static j parseFrom(byte[] bArr) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static j parseFrom(byte[] bArr, de deVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
