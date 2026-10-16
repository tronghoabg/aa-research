package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class sg extends com.google.v.du<sg, sf> implements com.google.v.fj {
    private static final sg DEFAULT_INSTANCE;
    public static final int EXTRA_INFO_LABEL_FIELD_NUMBER = 2;
    public static final int MAP_VIEW_LABEL_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<sg> PARSER = null;
    public static final int TTS_FIELD_NUMBER = 3;
    private int bitField0_;
    private rl extraInfoLabel_;
    private ru mapViewLabel_;
    private String tts_ = "";

    static {
        sg sgVar = new sg();
        DEFAULT_INSTANCE = sgVar;
        com.google.v.du.registerDefaultInstance(sg.class, sgVar);
    }

    private sg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtraInfoLabel() {
        this.extraInfoLabel_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMapViewLabel() {
        this.mapViewLabel_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTts() {
        this.bitField0_ &= -5;
        this.tts_ = getDefaultInstance().getTts();
    }

    public static sg getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeExtraInfoLabel(rl rlVar) {
        Objects.requireNonNull(rlVar);
        rl rlVar2 = this.extraInfoLabel_;
        if (rlVar2 != null && rlVar2 != rl.getDefaultInstance()) {
            rk rkVarNewBuilder = rl.newBuilder(rlVar2);
            rkVarNewBuilder.mergeFrom((rk) rlVar);
            rlVar = rkVarNewBuilder.buildPartial();
        }
        this.extraInfoLabel_ = rlVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMapViewLabel(ru ruVar) {
        Objects.requireNonNull(ruVar);
        ru ruVar2 = this.mapViewLabel_;
        if (ruVar2 != null && ruVar2 != ru.getDefaultInstance()) {
            rt rtVarNewBuilder = ru.newBuilder(ruVar2);
            rtVarNewBuilder.mergeFrom((rt) ruVar);
            ruVar = rtVarNewBuilder.buildPartial();
        }
        this.mapViewLabel_ = ruVar;
        this.bitField0_ |= 1;
    }

    public static sf newBuilder() {
        return (sf) DEFAULT_INSTANCE.createBuilder();
    }

    public static sg parseDelimitedFrom(InputStream inputStream) {
        return (sg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static sg parseFrom(com.google.v.v vVar) {
        return (sg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<sg> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtraInfoLabel(rl rlVar) {
        Objects.requireNonNull(rlVar);
        this.extraInfoLabel_ = rlVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMapViewLabel(ru ruVar) {
        Objects.requireNonNull(ruVar);
        this.mapViewLabel_ = ruVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTts(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.tts_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTtsBytes(com.google.v.v vVar) {
        this.tts_ = vVar.u();
        this.bitField0_ |= 4;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "mapViewLabel_", "extraInfoLabel_", "tts_"});
        }
        if (iOrdinal == 3) {
            return new sg();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new sf(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<sg> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (sg.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public rl getExtraInfoLabel() {
        rl rlVar = this.extraInfoLabel_;
        return rlVar == null ? rl.getDefaultInstance() : rlVar;
    }

    public ru getMapViewLabel() {
        ru ruVar = this.mapViewLabel_;
        return ruVar == null ? ru.getDefaultInstance() : ruVar;
    }

    public String getTts() {
        return this.tts_;
    }

    public com.google.v.v getTtsBytes() {
        return com.google.v.v.s(this.tts_);
    }

    public boolean hasExtraInfoLabel() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasMapViewLabel() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasTts() {
        return (this.bitField0_ & 4) != 0;
    }

    public static sf newBuilder(sg sgVar) {
        return (sf) DEFAULT_INSTANCE.createBuilder(sgVar);
    }

    public static sg parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (sg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static sg parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (sg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static sg parseFrom(com.google.v.z zVar) {
        return (sg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static sg parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (sg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static sg parseFrom(InputStream inputStream) {
        return (sg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static sg parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (sg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static sg parseFrom(ByteBuffer byteBuffer) {
        return (sg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static sg parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (sg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static sg parseFrom(byte[] bArr) {
        return (sg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static sg parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (sg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
