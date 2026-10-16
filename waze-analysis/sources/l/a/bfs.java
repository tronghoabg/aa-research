package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bfs extends com.google.v.du<bfs, bfr> implements com.google.v.fj {
    private static final bfs DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bfs> PARSER;

    static {
        bfs bfsVar = new bfs();
        DEFAULT_INSTANCE = bfsVar;
        com.google.v.du.registerDefaultInstance(bfs.class, bfsVar);
    }

    private bfs() {
    }

    public static bfs getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bfr newBuilder() {
        return (bfr) DEFAULT_INSTANCE.createBuilder();
    }

    public static bfs parseDelimitedFrom(InputStream inputStream) {
        return (bfs) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bfs parseFrom(com.google.v.v vVar) {
        return (bfs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bfs> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        byte[] bArr = null;
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
        }
        if (iOrdinal == 3) {
            return new bfs();
        }
        if (iOrdinal == 4) {
            return new bfr(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bfs> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bfs.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static bfr newBuilder(bfs bfsVar) {
        return (bfr) DEFAULT_INSTANCE.createBuilder(bfsVar);
    }

    public static bfs parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bfs) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bfs parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bfs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bfs parseFrom(com.google.v.z zVar) {
        return (bfs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bfs parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bfs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bfs parseFrom(InputStream inputStream) {
        return (bfs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bfs parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bfs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bfs parseFrom(ByteBuffer byteBuffer) {
        return (bfs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bfs parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bfs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bfs parseFrom(byte[] bArr) {
        return (bfs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bfs parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bfs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
