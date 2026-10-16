package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bff extends com.google.v.du<bff, bfe> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 1;
    private static final bff DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bff> PARSER;
    private int action_;

    static {
        bff bffVar = new bff();
        DEFAULT_INSTANCE = bffVar;
        com.google.v.du.registerDefaultInstance(bff.class, bffVar);
    }

    private bff() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    public static bff getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bfe newBuilder() {
        return (bfe) DEFAULT_INSTANCE.createBuilder();
    }

    public static bff parseDelimitedFrom(InputStream inputStream) {
        return (bff) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bff parseFrom(com.google.v.v vVar) {
        return (bff) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bff> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(bfd bfdVar) {
        this.action_ = bfdVar.getNumber();
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
            return new bff();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bfe(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bff> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bff.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bfd getAction() {
        bfd bfdVar;
        switch (this.action_) {
            case 0:
                bfdVar = bfd.ACTION_UNSPECIFIED;
                break;
            case 1:
                bfdVar = bfd.ALERTS_ONLY;
                break;
            case 2:
                bfdVar = bfd.CLOSE;
                break;
            case 3:
                bfdVar = bfd.LISTENING_WITH;
                break;
            case 4:
                bfdVar = bfd.SOUNDS_OFF;
                break;
            case 5:
                bfdVar = bfd.SOUNDS_ON;
                break;
            case 6:
                bfdVar = bfd.VOICE_DIRECTIONS;
                break;
            case 7:
                bfdVar = bfd.LESS_CHATTY_INSTRUCTIONS;
                break;
            case 8:
                bfdVar = bfd.SMART_GUIDANCE_INSTRUCTIONS;
                break;
            default:
                bfdVar = null;
                break;
        }
        return bfdVar == null ? bfd.UNRECOGNIZED : bfdVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public static bfe newBuilder(bff bffVar) {
        return (bfe) DEFAULT_INSTANCE.createBuilder(bffVar);
    }

    public static bff parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bff) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bff parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bff) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bff parseFrom(com.google.v.z zVar) {
        return (bff) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bff parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bff) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bff parseFrom(InputStream inputStream) {
        return (bff) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bff parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bff) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bff parseFrom(ByteBuffer byteBuffer) {
        return (bff) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bff parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bff) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bff parseFrom(byte[] bArr) {
        return (bff) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bff parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bff) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
