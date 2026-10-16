package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class akg extends com.google.v.du<akg, akf> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 1;
    public static final int CATEGORICAL_GROUP_SEARCH_NAME_FIELD_NUMBER = 2;
    private static final akg DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<akg> PARSER;
    private int action_;
    private int categoricalGroupSearchName_;

    static {
        akg akgVar = new akg();
        DEFAULT_INSTANCE = akgVar;
        com.google.v.du.registerDefaultInstance(akg.class, akgVar);
    }

    private akg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCategoricalGroupSearchName() {
        this.categoricalGroupSearchName_ = 0;
    }

    public static akg getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static akf newBuilder() {
        return (akf) DEFAULT_INSTANCE.createBuilder();
    }

    public static akg parseDelimitedFrom(InputStream inputStream) {
        return (akg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static akg parseFrom(com.google.v.v vVar) {
        return (akg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<akg> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(ake akeVar) {
        this.action_ = akeVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategoricalGroupSearchName(ayn aynVar) {
        this.categoricalGroupSearchName_ = aynVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategoricalGroupSearchNameValue(int i2) {
        this.categoricalGroupSearchName_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", new Object[]{"action_", "categoricalGroupSearchName_"});
        }
        if (iOrdinal == 3) {
            return new akg();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new akf(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<akg> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (akg.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ake getAction() {
        int i2 = this.action_;
        ake akeVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : ake.CATEGORY : ake.CLOSE : ake.BACK : ake.ACTION_UNSPECIFIED;
        return akeVar == null ? ake.UNRECOGNIZED : akeVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public ayn getCategoricalGroupSearchName() {
        ayn aynVarA = ayn.a(this.categoricalGroupSearchName_);
        return aynVarA == null ? ayn.UNRECOGNIZED : aynVarA;
    }

    public int getCategoricalGroupSearchNameValue() {
        return this.categoricalGroupSearchName_;
    }

    public static akf newBuilder(akg akgVar) {
        return (akf) DEFAULT_INSTANCE.createBuilder(akgVar);
    }

    public static akg parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (akg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static akg parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (akg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static akg parseFrom(com.google.v.z zVar) {
        return (akg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static akg parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (akg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static akg parseFrom(InputStream inputStream) {
        return (akg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static akg parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (akg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static akg parseFrom(ByteBuffer byteBuffer) {
        return (akg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static akg parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (akg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static akg parseFrom(byte[] bArr) {
        return (akg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static akg parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (akg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
