package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ahk extends com.google.v.du<ahk, ahj> implements com.google.v.fj {
    public static final int BADGE_FIELD_NUMBER = 1;
    private static final ahk DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ahk> PARSER;
    private boolean badge_;
    private int bitField0_;

    static {
        ahk ahkVar = new ahk();
        DEFAULT_INSTANCE = ahkVar;
        com.google.v.du.registerDefaultInstance(ahk.class, ahkVar);
    }

    private ahk() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBadge() {
        this.bitField0_ &= -2;
        this.badge_ = false;
    }

    public static ahk getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ahj newBuilder() {
        return (ahj) DEFAULT_INSTANCE.createBuilder();
    }

    public static ahk parseDelimitedFrom(InputStream inputStream) {
        return (ahk) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ahk parseFrom(com.google.v.v vVar) {
        return (ahk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ahk> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBadge(boolean z) {
        this.bitField0_ |= 1;
        this.badge_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"bitField0_", "badge_"});
        }
        if (iOrdinal == 3) {
            return new ahk();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ahj(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ahk> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ahk.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getBadge() {
        return this.badge_;
    }

    public boolean hasBadge() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ahj newBuilder(ahk ahkVar) {
        return (ahj) DEFAULT_INSTANCE.createBuilder(ahkVar);
    }

    public static ahk parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ahk) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ahk parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ahk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ahk parseFrom(com.google.v.z zVar) {
        return (ahk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ahk parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ahk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ahk parseFrom(InputStream inputStream) {
        return (ahk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ahk parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ahk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ahk parseFrom(ByteBuffer byteBuffer) {
        return (ahk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ahk parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ahk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ahk parseFrom(byte[] bArr) {
        return (ahk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ahk parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ahk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
