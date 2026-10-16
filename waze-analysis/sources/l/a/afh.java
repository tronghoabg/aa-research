package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class afh extends com.google.v.du<afh, afg> implements com.google.v.fj {
    public static final int BACKGROUND_AUDIO_SECONDS_FIELD_NUMBER = 3;
    public static final int BACKGROUND_LOCATION_SECONDS_FIELD_NUMBER = 4;
    public static final int BACKGROUND_SECONDS_FIELD_NUMBER = 2;
    private static final afh DEFAULT_INSTANCE;
    public static final int FOREGROUND_SECONDS_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<afh> PARSER;
    private long backgroundAudioSeconds_;
    private long backgroundLocationSeconds_;
    private long backgroundSeconds_;
    private int bitField0_;
    private long foregroundSeconds_;

    static {
        afh afhVar = new afh();
        DEFAULT_INSTANCE = afhVar;
        com.google.v.du.registerDefaultInstance(afh.class, afhVar);
    }

    private afh() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBackgroundAudioSeconds() {
        this.bitField0_ &= -5;
        this.backgroundAudioSeconds_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBackgroundLocationSeconds() {
        this.bitField0_ &= -9;
        this.backgroundLocationSeconds_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBackgroundSeconds() {
        this.bitField0_ &= -3;
        this.backgroundSeconds_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearForegroundSeconds() {
        this.bitField0_ &= -2;
        this.foregroundSeconds_ = 0L;
    }

    public static afh getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static afg newBuilder() {
        return (afg) DEFAULT_INSTANCE.createBuilder();
    }

    public static afh parseDelimitedFrom(InputStream inputStream) {
        return (afh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static afh parseFrom(com.google.v.v vVar) {
        return (afh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<afh> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBackgroundAudioSeconds(long j2) {
        this.bitField0_ |= 4;
        this.backgroundAudioSeconds_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBackgroundLocationSeconds(long j2) {
        this.bitField0_ |= 8;
        this.backgroundLocationSeconds_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBackgroundSeconds(long j2) {
        this.bitField0_ |= 2;
        this.backgroundSeconds_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setForegroundSeconds(long j2) {
        this.bitField0_ |= 1;
        this.foregroundSeconds_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"bitField0_", "foregroundSeconds_", "backgroundSeconds_", "backgroundAudioSeconds_", "backgroundLocationSeconds_"});
        }
        if (iOrdinal == 3) {
            return new afh();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new afg(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<afh> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (afh.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getBackgroundAudioSeconds() {
        return this.backgroundAudioSeconds_;
    }

    public long getBackgroundLocationSeconds() {
        return this.backgroundLocationSeconds_;
    }

    public long getBackgroundSeconds() {
        return this.backgroundSeconds_;
    }

    public long getForegroundSeconds() {
        return this.foregroundSeconds_;
    }

    public boolean hasBackgroundAudioSeconds() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasBackgroundLocationSeconds() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasBackgroundSeconds() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasForegroundSeconds() {
        return (this.bitField0_ & 1) != 0;
    }

    public static afg newBuilder(afh afhVar) {
        return (afg) DEFAULT_INSTANCE.createBuilder(afhVar);
    }

    public static afh parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (afh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static afh parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (afh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static afh parseFrom(com.google.v.z zVar) {
        return (afh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static afh parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (afh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static afh parseFrom(InputStream inputStream) {
        return (afh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static afh parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (afh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static afh parseFrom(ByteBuffer byteBuffer) {
        return (afh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static afh parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (afh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static afh parseFrom(byte[] bArr) {
        return (afh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static afh parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (afh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
