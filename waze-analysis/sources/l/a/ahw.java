package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ahw extends com.google.v.du<ahw, ahu> implements com.google.v.fj {
    public static final int CHANGED_FROM_FIELD_NUMBER = 1;
    public static final int CHANGED_SOURCE_FIELD_NUMBER = 4;
    public static final int CHANGED_TO_FIELD_NUMBER = 2;
    private static final ahw DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ahw> PARSER = null;
    public static final int SOURCE_FIELD_NUMBER = 3;
    private int changedSource_;
    private int source_;
    private String changedFrom_ = "";
    private String changedTo_ = "";

    static {
        ahw ahwVar = new ahw();
        DEFAULT_INSTANCE = ahwVar;
        com.google.v.du.registerDefaultInstance(ahw.class, ahwVar);
    }

    private ahw() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChangedFrom() {
        this.changedFrom_ = getDefaultInstance().getChangedFrom();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChangedSource() {
        this.changedSource_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChangedTo() {
        this.changedTo_ = getDefaultInstance().getChangedTo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSource() {
        this.source_ = 0;
    }

    public static ahw getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ahu newBuilder() {
        return (ahu) DEFAULT_INSTANCE.createBuilder();
    }

    public static ahw parseDelimitedFrom(InputStream inputStream) {
        return (ahw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ahw parseFrom(com.google.v.v vVar) {
        return (ahw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ahw> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangedFrom(String str) {
        Objects.requireNonNull(str);
        this.changedFrom_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangedFromBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.changedFrom_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangedSource(fv fvVar) {
        this.changedSource_ = fvVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangedSourceValue(int i2) {
        this.changedSource_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangedTo(String str) {
        Objects.requireNonNull(str);
        this.changedTo_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangedToBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.changedTo_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSource(ahv ahvVar) {
        this.source_ = ahvVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceValue(int i2) {
        this.source_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f\u0004\f", new Object[]{"changedFrom_", "changedTo_", "source_", "changedSource_"});
        }
        if (iOrdinal == 3) {
            return new ahw();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ahu(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ahw> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ahw.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getChangedFrom() {
        return this.changedFrom_;
    }

    public com.google.v.v getChangedFromBytes() {
        return com.google.v.v.s(this.changedFrom_);
    }

    public fv getChangedSource() {
        fv fvVarA = fv.a(this.changedSource_);
        return fvVarA == null ? fv.UNRECOGNIZED : fvVarA;
    }

    public int getChangedSourceValue() {
        return this.changedSource_;
    }

    public String getChangedTo() {
        return this.changedTo_;
    }

    public com.google.v.v getChangedToBytes() {
        return com.google.v.v.s(this.changedTo_);
    }

    @Deprecated
    public ahv getSource() {
        int i2 = this.source_;
        ahv ahvVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? null : ahv.SETTINGS : ahv.MARKETPLACE : ahv.LEGACY_COPILOT : ahv.DEEPLINK : ahv.SOURCE_UNSPECIFIED;
        return ahvVar == null ? ahv.UNRECOGNIZED : ahvVar;
    }

    @Deprecated
    public int getSourceValue() {
        return this.source_;
    }

    public static ahu newBuilder(ahw ahwVar) {
        return (ahu) DEFAULT_INSTANCE.createBuilder(ahwVar);
    }

    public static ahw parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ahw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ahw parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ahw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ahw parseFrom(com.google.v.z zVar) {
        return (ahw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ahw parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ahw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ahw parseFrom(InputStream inputStream) {
        return (ahw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ahw parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ahw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ahw parseFrom(ByteBuffer byteBuffer) {
        return (ahw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ahw parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ahw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ahw parseFrom(byte[] bArr) {
        return (ahw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ahw parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ahw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
