package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bfu extends com.google.v.du<bfu, bft> implements com.google.v.fj {
    private static final bfu DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bfu> PARSER = null;
    public static final int SOUND_PLAYED_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean soundPlayed_;

    static {
        bfu bfuVar = new bfu();
        DEFAULT_INSTANCE = bfuVar;
        com.google.v.du.registerDefaultInstance(bfu.class, bfuVar);
    }

    private bfu() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSoundPlayed() {
        this.bitField0_ &= -2;
        this.soundPlayed_ = false;
    }

    public static bfu getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bft newBuilder() {
        return (bft) DEFAULT_INSTANCE.createBuilder();
    }

    public static bfu parseDelimitedFrom(InputStream inputStream) {
        return (bfu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bfu parseFrom(com.google.v.v vVar) {
        return (bfu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bfu> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSoundPlayed(boolean z) {
        this.bitField0_ |= 1;
        this.soundPlayed_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"bitField0_", "soundPlayed_"});
        }
        if (iOrdinal == 3) {
            return new bfu();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bft(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bfu> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bfu.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getSoundPlayed() {
        return this.soundPlayed_;
    }

    public boolean hasSoundPlayed() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bft newBuilder(bfu bfuVar) {
        return (bft) DEFAULT_INSTANCE.createBuilder(bfuVar);
    }

    public static bfu parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bfu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bfu parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bfu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bfu parseFrom(com.google.v.z zVar) {
        return (bfu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bfu parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bfu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bfu parseFrom(InputStream inputStream) {
        return (bfu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bfu parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bfu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bfu parseFrom(ByteBuffer byteBuffer) {
        return (bfu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bfu parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bfu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bfu parseFrom(byte[] bArr) {
        return (bfu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bfu parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bfu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
