package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class alt extends com.google.v.du<alt, alr> implements com.google.v.fj {
    private static final alt DEFAULT_INSTANCE;
    public static final int NAV_CONNECT_BUTTON_CLICKED_FIELD_NUMBER = 1;
    public static final int NAV_CONNECT_CONSENT_SCREEN_CLICKED_FIELD_NUMBER = 3;
    public static final int NAV_CONNECT_CONSENT_SCREEN_SHOWN_FIELD_NUMBER = 2;
    public static final int NAV_CONNECT_CONSENT_SCREEN_SKIPPED_FIELD_NUMBER = 4;
    public static final int NAV_CONNECT_SERVER_REQUEST_RESULT_FIELD_NUMBER = 5;
    public static final int NAV_CONNECT_TRIP_ENDED_FIELD_NUMBER = 6;
    private static volatile com.google.v.fo<alt> PARSER;
    private int statCase_ = 0;
    private Object stat_;

    static {
        alt altVar = new alt();
        DEFAULT_INSTANCE = altVar;
        com.google.v.du.registerDefaultInstance(alt.class, altVar);
    }

    private alt() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNavConnectButtonClicked() {
        if (this.statCase_ == 1) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNavConnectConsentScreenClicked() {
        if (this.statCase_ == 3) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNavConnectConsentScreenShown() {
        if (this.statCase_ == 2) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNavConnectConsentScreenSkipped() {
        if (this.statCase_ == 4) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNavConnectServerRequestResult() {
        if (this.statCase_ == 5) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNavConnectTripEnded() {
        if (this.statCase_ == 6) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStat() {
        this.statCase_ = 0;
        this.stat_ = null;
    }

    public static alt getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNavConnectButtonClicked(ald aldVar) {
        Objects.requireNonNull(aldVar);
        if (this.statCase_ == 1 && this.stat_ != ald.getDefaultInstance()) {
            alc alcVarNewBuilder = ald.newBuilder((ald) this.stat_);
            alcVarNewBuilder.mergeFrom((alc) aldVar);
            aldVar = alcVarNewBuilder.buildPartial();
        }
        this.stat_ = aldVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNavConnectConsentScreenClicked(alh alhVar) {
        Objects.requireNonNull(alhVar);
        if (this.statCase_ == 3 && this.stat_ != alh.getDefaultInstance()) {
            alg algVarNewBuilder = alh.newBuilder((alh) this.stat_);
            algVarNewBuilder.mergeFrom((alg) alhVar);
            alhVar = algVarNewBuilder.buildPartial();
        }
        this.stat_ = alhVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNavConnectConsentScreenShown(alk alkVar) {
        Objects.requireNonNull(alkVar);
        if (this.statCase_ == 2 && this.stat_ != alk.getDefaultInstance()) {
            ali aliVarNewBuilder = alk.newBuilder((alk) this.stat_);
            aliVarNewBuilder.mergeFrom((ali) alkVar);
            alkVar = aliVarNewBuilder.buildPartial();
        }
        this.stat_ = alkVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNavConnectConsentScreenSkipped(aln alnVar) {
        Objects.requireNonNull(alnVar);
        if (this.statCase_ == 4 && this.stat_ != aln.getDefaultInstance()) {
            all allVarNewBuilder = aln.newBuilder((aln) this.stat_);
            allVarNewBuilder.mergeFrom((all) alnVar);
            alnVar = allVarNewBuilder.buildPartial();
        }
        this.stat_ = alnVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNavConnectServerRequestResult(alq alqVar) {
        Objects.requireNonNull(alqVar);
        if (this.statCase_ == 5 && this.stat_ != alq.getDefaultInstance()) {
            alo aloVarNewBuilder = alq.newBuilder((alq) this.stat_);
            aloVarNewBuilder.mergeFrom((alo) alqVar);
            alqVar = aloVarNewBuilder.buildPartial();
        }
        this.stat_ = alqVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNavConnectTripEnded(alw alwVar) {
        Objects.requireNonNull(alwVar);
        if (this.statCase_ == 6 && this.stat_ != alw.getDefaultInstance()) {
            alu aluVarNewBuilder = alw.newBuilder((alw) this.stat_);
            aluVarNewBuilder.mergeFrom((alu) alwVar);
            alwVar = aluVarNewBuilder.buildPartial();
        }
        this.stat_ = alwVar;
        this.statCase_ = 6;
    }

    public static alr newBuilder() {
        return (alr) DEFAULT_INSTANCE.createBuilder();
    }

    public static alt parseDelimitedFrom(InputStream inputStream) {
        return (alt) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static alt parseFrom(com.google.v.v vVar) {
        return (alt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<alt> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNavConnectButtonClicked(ald aldVar) {
        Objects.requireNonNull(aldVar);
        this.stat_ = aldVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNavConnectConsentScreenClicked(alh alhVar) {
        Objects.requireNonNull(alhVar);
        this.stat_ = alhVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNavConnectConsentScreenShown(alk alkVar) {
        Objects.requireNonNull(alkVar);
        this.stat_ = alkVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNavConnectConsentScreenSkipped(aln alnVar) {
        Objects.requireNonNull(alnVar);
        this.stat_ = alnVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNavConnectServerRequestResult(alq alqVar) {
        Objects.requireNonNull(alqVar);
        this.stat_ = alqVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNavConnectTripEnded(alw alwVar) {
        Objects.requireNonNull(alwVar);
        this.stat_ = alwVar;
        this.statCase_ = 6;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"stat_", "statCase_", ald.class, alk.class, alh.class, aln.class, alq.class, alw.class});
        }
        if (iOrdinal == 3) {
            return new alt();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new alr(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<alt> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (alt.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ald getNavConnectButtonClicked() {
        return this.statCase_ == 1 ? (ald) this.stat_ : ald.getDefaultInstance();
    }

    public alh getNavConnectConsentScreenClicked() {
        return this.statCase_ == 3 ? (alh) this.stat_ : alh.getDefaultInstance();
    }

    public alk getNavConnectConsentScreenShown() {
        return this.statCase_ == 2 ? (alk) this.stat_ : alk.getDefaultInstance();
    }

    public aln getNavConnectConsentScreenSkipped() {
        return this.statCase_ == 4 ? (aln) this.stat_ : aln.getDefaultInstance();
    }

    public alq getNavConnectServerRequestResult() {
        return this.statCase_ == 5 ? (alq) this.stat_ : alq.getDefaultInstance();
    }

    public alw getNavConnectTripEnded() {
        return this.statCase_ == 6 ? (alw) this.stat_ : alw.getDefaultInstance();
    }

    public als getStatCase() {
        switch (this.statCase_) {
            case 0:
                return als.f52706g;
            case 1:
                return als.f52700a;
            case 2:
                return als.f52701b;
            case 3:
                return als.f52702c;
            case 4:
                return als.f52703d;
            case 5:
                return als.f52704e;
            case 6:
                return als.f52705f;
            default:
                return null;
        }
    }

    public boolean hasNavConnectButtonClicked() {
        return this.statCase_ == 1;
    }

    public boolean hasNavConnectConsentScreenClicked() {
        return this.statCase_ == 3;
    }

    public boolean hasNavConnectConsentScreenShown() {
        return this.statCase_ == 2;
    }

    public boolean hasNavConnectConsentScreenSkipped() {
        return this.statCase_ == 4;
    }

    public boolean hasNavConnectServerRequestResult() {
        return this.statCase_ == 5;
    }

    public boolean hasNavConnectTripEnded() {
        return this.statCase_ == 6;
    }

    public static alr newBuilder(alt altVar) {
        return (alr) DEFAULT_INSTANCE.createBuilder(altVar);
    }

    public static alt parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (alt) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static alt parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (alt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static alt parseFrom(com.google.v.z zVar) {
        return (alt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static alt parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (alt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static alt parseFrom(InputStream inputStream) {
        return (alt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static alt parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (alt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static alt parseFrom(ByteBuffer byteBuffer) {
        return (alt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static alt parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (alt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static alt parseFrom(byte[] bArr) {
        return (alt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static alt parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (alt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
