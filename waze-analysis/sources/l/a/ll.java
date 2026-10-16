package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ll extends com.google.v.du<ll, lk> implements com.google.v.fj {
    private static final ll DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ll> PARSER;

    static {
        ll llVar = new ll();
        DEFAULT_INSTANCE = llVar;
        com.google.v.du.registerDefaultInstance(ll.class, llVar);
    }

    private ll() {
    }

    public static ll getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static lk newBuilder() {
        return (lk) DEFAULT_INSTANCE.createBuilder();
    }

    public static ll parseDelimitedFrom(InputStream inputStream) {
        return (ll) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ll parseFrom(com.google.v.v vVar) {
        return (ll) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ll> parser() {
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
            return new ll();
        }
        if (iOrdinal == 4) {
            return new lk(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ll> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ll.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static lk newBuilder(ll llVar) {
        return (lk) DEFAULT_INSTANCE.createBuilder(llVar);
    }

    public static ll parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ll) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ll parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ll) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ll parseFrom(com.google.v.z zVar) {
        return (ll) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ll parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ll) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ll parseFrom(InputStream inputStream) {
        return (ll) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ll parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ll) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ll parseFrom(ByteBuffer byteBuffer) {
        return (ll) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ll parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ll) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ll parseFrom(byte[] bArr) {
        return (ll) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ll parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ll) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
