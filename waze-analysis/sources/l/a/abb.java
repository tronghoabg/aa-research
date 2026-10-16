package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class abb extends com.google.v.du<abb, aay> implements com.google.v.fj {
    public static final int CHANGED_FROM_FIELD_NUMBER = 1;
    public static final int CHANGED_TO_FIELD_NUMBER = 2;
    private static final abb DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<abb> PARSER = null;
    public static final int SOURCE_FIELD_NUMBER = 3;
    private int changedFrom_;
    private int changedTo_;
    private int source_;

    static {
        abb abbVar = new abb();
        DEFAULT_INSTANCE = abbVar;
        com.google.v.du.registerDefaultInstance(abb.class, abbVar);
    }

    private abb() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChangedFrom() {
        this.changedFrom_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChangedTo() {
        this.changedTo_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSource() {
        this.source_ = 0;
    }

    public static abb getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static aay newBuilder() {
        return (aay) DEFAULT_INSTANCE.createBuilder();
    }

    public static abb parseDelimitedFrom(InputStream inputStream) {
        return (abb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static abb parseFrom(com.google.v.v vVar) {
        return (abb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<abb> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangedFrom(aaz aazVar) {
        this.changedFrom_ = aazVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangedFromValue(int i2) {
        this.changedFrom_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangedTo(aaz aazVar) {
        this.changedTo_ = aazVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangedToValue(int i2) {
        this.changedTo_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSource(aba abaVar) {
        this.source_ = abaVar.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"changedFrom_", "changedTo_", "source_"});
        }
        if (iOrdinal == 3) {
            return new abb();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aay(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<abb> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (abb.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public aaz getChangedFrom() {
        aaz aazVarA = aaz.a(this.changedFrom_);
        return aazVarA == null ? aaz.UNRECOGNIZED : aazVarA;
    }

    public int getChangedFromValue() {
        return this.changedFrom_;
    }

    public aaz getChangedTo() {
        aaz aazVarA = aaz.a(this.changedTo_);
        return aazVarA == null ? aaz.UNRECOGNIZED : aazVarA;
    }

    public int getChangedToValue() {
        return this.changedTo_;
    }

    public aba getSource() {
        int i2 = this.source_;
        aba abaVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? null : aba.NEW_USER_DEFAULT : aba.COMPANINIO : aba.DEEPLINK : aba.SOUND_SETTINGS : aba.MAP_SCREEN_SOUND_ICON : aba.SOURCE_UNSPECIFIED;
        return abaVar == null ? aba.UNRECOGNIZED : abaVar;
    }

    public int getSourceValue() {
        return this.source_;
    }

    public static aay newBuilder(abb abbVar) {
        return (aay) DEFAULT_INSTANCE.createBuilder(abbVar);
    }

    public static abb parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (abb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static abb parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (abb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static abb parseFrom(com.google.v.z zVar) {
        return (abb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static abb parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (abb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static abb parseFrom(InputStream inputStream) {
        return (abb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static abb parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (abb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static abb parseFrom(ByteBuffer byteBuffer) {
        return (abb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static abb parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (abb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static abb parseFrom(byte[] bArr) {
        return (abb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static abb parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (abb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
