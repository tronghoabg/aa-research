package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ne extends com.google.v.du<ne, nc> implements com.google.v.fj {
    public static final int CONVERSATION_INFO_FIELD_NUMBER = 1;
    private static final ne DEFAULT_INSTANCE;
    public static final int FIRST_SPEAKER_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<ne> PARSER;
    private int bitField0_;
    private mp conversationInfo_;
    private int firstSpeaker_;

    static {
        ne neVar = new ne();
        DEFAULT_INSTANCE = neVar;
        com.google.v.du.registerDefaultInstance(ne.class, neVar);
    }

    private ne() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConversationInfo() {
        this.conversationInfo_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFirstSpeaker() {
        this.firstSpeaker_ = 0;
    }

    public static ne getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeConversationInfo(mp mpVar) {
        Objects.requireNonNull(mpVar);
        mp mpVar2 = this.conversationInfo_;
        if (mpVar2 != null && mpVar2 != mp.getDefaultInstance()) {
            mn mnVarNewBuilder = mp.newBuilder(mpVar2);
            mnVarNewBuilder.mergeFrom((mn) mpVar);
            mpVar = mnVarNewBuilder.buildPartial();
        }
        this.conversationInfo_ = mpVar;
        this.bitField0_ |= 1;
    }

    public static nc newBuilder() {
        return (nc) DEFAULT_INSTANCE.createBuilder();
    }

    public static ne parseDelimitedFrom(InputStream inputStream) {
        return (ne) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ne parseFrom(com.google.v.v vVar) {
        return (ne) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ne> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConversationInfo(mp mpVar) {
        Objects.requireNonNull(mpVar);
        this.conversationInfo_ = mpVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFirstSpeaker(nd ndVar) {
        this.firstSpeaker_ = ndVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFirstSpeakerValue(int i2) {
        this.firstSpeaker_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f", new Object[]{"bitField0_", "conversationInfo_", "firstSpeaker_"});
        }
        if (iOrdinal == 3) {
            return new ne();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new nc(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ne> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ne.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public mp getConversationInfo() {
        mp mpVar = this.conversationInfo_;
        return mpVar == null ? mp.getDefaultInstance() : mpVar;
    }

    public nd getFirstSpeaker() {
        int i2 = this.firstSpeaker_;
        nd ndVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : nd.FIRST_SPEAKER_USER : nd.FIRST_SPEAKER_AGENT : nd.FIRST_SPEAKER_UNSPECIFIED;
        return ndVar == null ? nd.UNRECOGNIZED : ndVar;
    }

    public int getFirstSpeakerValue() {
        return this.firstSpeaker_;
    }

    public boolean hasConversationInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public static nc newBuilder(ne neVar) {
        return (nc) DEFAULT_INSTANCE.createBuilder(neVar);
    }

    public static ne parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ne) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ne parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ne) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ne parseFrom(com.google.v.z zVar) {
        return (ne) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ne parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ne) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ne parseFrom(InputStream inputStream) {
        return (ne) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ne parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ne) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ne parseFrom(ByteBuffer byteBuffer) {
        return (ne) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ne parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ne) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ne parseFrom(byte[] bArr) {
        return (ne) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ne parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ne) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
