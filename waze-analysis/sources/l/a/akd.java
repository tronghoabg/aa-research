package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class akd extends com.google.v.du<akd, akc> implements com.google.v.fj {
    private static final akd DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<akd> PARSER;

    static {
        akd akdVar = new akd();
        DEFAULT_INSTANCE = akdVar;
        com.google.v.du.registerDefaultInstance(akd.class, akdVar);
    }

    private akd() {
    }

    public static akd getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static akc newBuilder() {
        return (akc) DEFAULT_INSTANCE.createBuilder();
    }

    public static akd parseDelimitedFrom(InputStream inputStream) {
        return (akd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static akd parseFrom(com.google.v.v vVar) {
        return (akd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<akd> parser() {
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
            return new akd();
        }
        if (iOrdinal == 4) {
            return new akc(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<akd> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (akd.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static akc newBuilder(akd akdVar) {
        return (akc) DEFAULT_INSTANCE.createBuilder(akdVar);
    }

    public static akd parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (akd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static akd parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (akd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static akd parseFrom(com.google.v.z zVar) {
        return (akd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static akd parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (akd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static akd parseFrom(InputStream inputStream) {
        return (akd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static akd parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (akd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static akd parseFrom(ByteBuffer byteBuffer) {
        return (akd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static akd parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (akd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static akd parseFrom(byte[] bArr) {
        return (akd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static akd parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (akd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
