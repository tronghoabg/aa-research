package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class atc extends com.google.v.du<atc, ata> implements com.google.v.fj {
    private static final atc DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<atc> PARSER = null;
    public static final int PUSH_MESSAGE_BUTTON_CLICKED_FIELD_NUMBER = 2;
    public static final int PUSH_MESSAGE_DISMISSED_FIELD_NUMBER = 3;
    public static final int PUSH_MESSAGE_LAUNCHED_FIELD_NUMBER = 1;
    public static final int PUSH_MESSAGE_RECEIVED_WHILE_NOT_RUNNING_FIELD_NUMBER = 4;
    public static final int PUSH_MESSAGE_RECEIVED_WHILE_RUNNING_FIELD_NUMBER = 5;
    private int statCase_ = 0;
    private Object stat_;

    static {
        atc atcVar = new atc();
        DEFAULT_INSTANCE = atcVar;
        com.google.v.du.registerDefaultInstance(atc.class, atcVar);
    }

    private atc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPushMessageButtonClicked() {
        if (this.statCase_ == 2) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPushMessageDismissed() {
        if (this.statCase_ == 3) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPushMessageLaunched() {
        if (this.statCase_ == 1) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPushMessageReceivedWhileNotRunning() {
        if (this.statCase_ == 4) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPushMessageReceivedWhileRunning() {
        if (this.statCase_ == 5) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStat() {
        this.statCase_ = 0;
        this.stat_ = null;
    }

    public static atc getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePushMessageButtonClicked(asp aspVar) {
        Objects.requireNonNull(aspVar);
        if (this.statCase_ == 2 && this.stat_ != asp.getDefaultInstance()) {
            aso asoVarNewBuilder = asp.newBuilder((asp) this.stat_);
            asoVarNewBuilder.mergeFrom((aso) aspVar);
            aspVar = asoVarNewBuilder.buildPartial();
        }
        this.stat_ = aspVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePushMessageDismissed(asr asrVar) {
        Objects.requireNonNull(asrVar);
        if (this.statCase_ == 3 && this.stat_ != asr.getDefaultInstance()) {
            asq asqVarNewBuilder = asr.newBuilder((asr) this.stat_);
            asqVarNewBuilder.mergeFrom((asq) asrVar);
            asrVar = asqVarNewBuilder.buildPartial();
        }
        this.stat_ = asrVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePushMessageLaunched(asv asvVar) {
        Objects.requireNonNull(asvVar);
        if (this.statCase_ == 1 && this.stat_ != asv.getDefaultInstance()) {
            asu asuVarNewBuilder = asv.newBuilder((asv) this.stat_);
            asuVarNewBuilder.mergeFrom((asu) asvVar);
            asvVar = asuVarNewBuilder.buildPartial();
        }
        this.stat_ = asvVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePushMessageReceivedWhileNotRunning(asx asxVar) {
        Objects.requireNonNull(asxVar);
        if (this.statCase_ == 4 && this.stat_ != asx.getDefaultInstance()) {
            asw aswVarNewBuilder = asx.newBuilder((asx) this.stat_);
            aswVarNewBuilder.mergeFrom((asw) asxVar);
            asxVar = aswVarNewBuilder.buildPartial();
        }
        this.stat_ = asxVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePushMessageReceivedWhileRunning(asz aszVar) {
        Objects.requireNonNull(aszVar);
        if (this.statCase_ == 5 && this.stat_ != asz.getDefaultInstance()) {
            asy asyVarNewBuilder = asz.newBuilder((asz) this.stat_);
            asyVarNewBuilder.mergeFrom((asy) aszVar);
            aszVar = asyVarNewBuilder.buildPartial();
        }
        this.stat_ = aszVar;
        this.statCase_ = 5;
    }

    public static ata newBuilder() {
        return (ata) DEFAULT_INSTANCE.createBuilder();
    }

    public static atc parseDelimitedFrom(InputStream inputStream) {
        return (atc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static atc parseFrom(com.google.v.v vVar) {
        return (atc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<atc> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPushMessageButtonClicked(asp aspVar) {
        Objects.requireNonNull(aspVar);
        this.stat_ = aspVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPushMessageDismissed(asr asrVar) {
        Objects.requireNonNull(asrVar);
        this.stat_ = asrVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPushMessageLaunched(asv asvVar) {
        Objects.requireNonNull(asvVar);
        this.stat_ = asvVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPushMessageReceivedWhileNotRunning(asx asxVar) {
        Objects.requireNonNull(asxVar);
        this.stat_ = asxVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPushMessageReceivedWhileRunning(asz aszVar) {
        Objects.requireNonNull(aszVar);
        this.stat_ = aszVar;
        this.statCase_ = 5;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"stat_", "statCase_", asv.class, asp.class, asr.class, asx.class, asz.class});
        }
        if (iOrdinal == 3) {
            return new atc();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ata(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<atc> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (atc.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public asp getPushMessageButtonClicked() {
        return this.statCase_ == 2 ? (asp) this.stat_ : asp.getDefaultInstance();
    }

    public asr getPushMessageDismissed() {
        return this.statCase_ == 3 ? (asr) this.stat_ : asr.getDefaultInstance();
    }

    public asv getPushMessageLaunched() {
        return this.statCase_ == 1 ? (asv) this.stat_ : asv.getDefaultInstance();
    }

    public asx getPushMessageReceivedWhileNotRunning() {
        return this.statCase_ == 4 ? (asx) this.stat_ : asx.getDefaultInstance();
    }

    public asz getPushMessageReceivedWhileRunning() {
        return this.statCase_ == 5 ? (asz) this.stat_ : asz.getDefaultInstance();
    }

    public atb getStatCase() {
        int i2 = this.statCase_;
        if (i2 == 0) {
            return atb.f53124f;
        }
        if (i2 == 1) {
            return atb.f53119a;
        }
        if (i2 == 2) {
            return atb.f53120b;
        }
        if (i2 == 3) {
            return atb.f53121c;
        }
        if (i2 == 4) {
            return atb.f53122d;
        }
        if (i2 != 5) {
            return null;
        }
        return atb.f53123e;
    }

    public boolean hasPushMessageButtonClicked() {
        return this.statCase_ == 2;
    }

    public boolean hasPushMessageDismissed() {
        return this.statCase_ == 3;
    }

    public boolean hasPushMessageLaunched() {
        return this.statCase_ == 1;
    }

    public boolean hasPushMessageReceivedWhileNotRunning() {
        return this.statCase_ == 4;
    }

    public boolean hasPushMessageReceivedWhileRunning() {
        return this.statCase_ == 5;
    }

    public static ata newBuilder(atc atcVar) {
        return (ata) DEFAULT_INSTANCE.createBuilder(atcVar);
    }

    public static atc parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (atc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static atc parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (atc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static atc parseFrom(com.google.v.z zVar) {
        return (atc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static atc parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (atc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static atc parseFrom(InputStream inputStream) {
        return (atc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static atc parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (atc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static atc parseFrom(ByteBuffer byteBuffer) {
        return (atc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static atc parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (atc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static atc parseFrom(byte[] bArr) {
        return (atc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static atc parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (atc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
