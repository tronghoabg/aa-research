package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class boc extends com.google.v.du<boc, bnx> implements com.google.v.fj {
    private static final boc DEFAULT_INSTANCE;
    public static final int LEVEL_FIELD_NUMBER = 3;
    public static final int MODE_FIELD_NUMBER = 4;
    private static volatile com.google.v.fo<boc> PARSER = null;
    public static final int SUBTYPE_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int level_;
    private int mode_;
    private int subtype_;
    private int type_;

    static {
        boc bocVar = new boc();
        DEFAULT_INSTANCE = bocVar;
        com.google.v.du.registerDefaultInstance(boc.class, bocVar);
    }

    private boc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLevel() {
        this.level_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMode() {
        this.mode_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubtype() {
        this.subtype_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static boc getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bnx newBuilder() {
        return (bnx) DEFAULT_INSTANCE.createBuilder();
    }

    public static boc parseDelimitedFrom(InputStream inputStream) {
        return (boc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static boc parseFrom(com.google.v.v vVar) {
        return (boc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<boc> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLevel(bny bnyVar) {
        this.level_ = bnyVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLevelValue(int i2) {
        this.level_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMode(bnz bnzVar) {
        this.mode_ = bnzVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModeValue(int i2) {
        this.mode_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubtype(boa boaVar) {
        this.subtype_ = boaVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubtypeValue(int i2) {
        this.subtype_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(bob bobVar) {
        this.type_ = bobVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i2) {
        this.type_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f\u0004\f", new Object[]{"type_", "subtype_", "level_", "mode_"});
        }
        if (iOrdinal == 3) {
            return new boc();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bnx(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<boc> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (boc.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bny getLevel() {
        bny bnyVarA = bny.a(this.level_);
        return bnyVarA == null ? bny.UNRECOGNIZED : bnyVarA;
    }

    public int getLevelValue() {
        return this.level_;
    }

    public bnz getMode() {
        bnz bnzVarA = bnz.a(this.mode_);
        return bnzVarA == null ? bnz.UNRECOGNIZED : bnzVarA;
    }

    public int getModeValue() {
        return this.mode_;
    }

    public boa getSubtype() {
        boa boaVarA = boa.a(this.subtype_);
        return boaVarA == null ? boa.UNRECOGNIZED : boaVarA;
    }

    public int getSubtypeValue() {
        return this.subtype_;
    }

    public bob getType() {
        bob bobVarA = bob.a(this.type_);
        return bobVarA == null ? bob.UNRECOGNIZED : bobVarA;
    }

    public int getTypeValue() {
        return this.type_;
    }

    public static bnx newBuilder(boc bocVar) {
        return (bnx) DEFAULT_INSTANCE.createBuilder(bocVar);
    }

    public static boc parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (boc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static boc parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (boc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static boc parseFrom(com.google.v.z zVar) {
        return (boc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static boc parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (boc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static boc parseFrom(InputStream inputStream) {
        return (boc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static boc parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (boc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static boc parseFrom(ByteBuffer byteBuffer) {
        return (boc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static boc parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (boc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static boc parseFrom(byte[] bArr) {
        return (boc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static boc parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (boc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
