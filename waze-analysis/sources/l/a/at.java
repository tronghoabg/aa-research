package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class at extends com.google.v.du<at, as> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 1;
    private static final at DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<at> PARSER;
    private int action_;

    static {
        at atVar = new at();
        DEFAULT_INSTANCE = atVar;
        com.google.v.du.registerDefaultInstance(at.class, atVar);
    }

    private at() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    public static at getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static as newBuilder() {
        return (as) DEFAULT_INSTANCE.createBuilder();
    }

    public static at parseDelimitedFrom(InputStream inputStream) {
        return (at) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static at parseFrom(com.google.v.v vVar) {
        return (at) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<at> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(ar arVar) {
        this.action_ = arVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"action_"});
        }
        if (iOrdinal == 3) {
            return new at();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new as(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<at> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (at.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ar getAction() {
        int i2 = this.action_;
        ar arVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : ar.CANCEL : ar.VIEW_LOCATION : ar.ACTION_UNSPECIFIED;
        return arVar == null ? ar.UNRECOGNIZED : arVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public static as newBuilder(at atVar) {
        return (as) DEFAULT_INSTANCE.createBuilder(atVar);
    }

    public static at parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (at) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static at parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (at) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static at parseFrom(com.google.v.z zVar) {
        return (at) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static at parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (at) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static at parseFrom(InputStream inputStream) {
        return (at) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static at parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (at) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static at parseFrom(ByteBuffer byteBuffer) {
        return (at) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static at parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (at) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static at parseFrom(byte[] bArr) {
        return (at) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static at parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (at) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
