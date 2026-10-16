package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class brk extends com.google.v.du<brk, brj> implements com.google.v.fj {
    private static final brk DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<brk> PARSER = null;
    public static final int SELECTED_ANSWER_FIELD_NUMBER = 3;
    public static final int SELECTED_SUBTYPE_FIELD_NUMBER = 2;
    public static final int WAZE_ASKS_INFO_FIELD_NUMBER = 1;
    private int bitField0_;
    private brt selectedAnswer_;
    private int selectedSubtype_;
    private brz wazeAsksInfo_;

    static {
        brk brkVar = new brk();
        DEFAULT_INSTANCE = brkVar;
        com.google.v.du.registerDefaultInstance(brk.class, brkVar);
    }

    private brk() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelectedAnswer() {
        this.selectedAnswer_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelectedSubtype() {
        this.bitField0_ &= -3;
        this.selectedSubtype_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWazeAsksInfo() {
        this.wazeAsksInfo_ = null;
        this.bitField0_ &= -2;
    }

    public static brk getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSelectedAnswer(brt brtVar) {
        Objects.requireNonNull(brtVar);
        brt brtVar2 = this.selectedAnswer_;
        if (brtVar2 != null && brtVar2 != brt.getDefaultInstance()) {
            brs brsVarNewBuilder = brt.newBuilder(brtVar2);
            brsVarNewBuilder.mergeFrom((brs) brtVar);
            brtVar = brsVarNewBuilder.buildPartial();
        }
        this.selectedAnswer_ = brtVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWazeAsksInfo(brz brzVar) {
        Objects.requireNonNull(brzVar);
        brz brzVar2 = this.wazeAsksInfo_;
        if (brzVar2 != null && brzVar2 != brz.getDefaultInstance()) {
            bro broVarNewBuilder = brz.newBuilder(brzVar2);
            broVarNewBuilder.mergeFrom((bro) brzVar);
            brzVar = broVarNewBuilder.buildPartial();
        }
        this.wazeAsksInfo_ = brzVar;
        this.bitField0_ |= 1;
    }

    public static brj newBuilder() {
        return (brj) DEFAULT_INSTANCE.createBuilder();
    }

    public static brk parseDelimitedFrom(InputStream inputStream) {
        return (brk) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static brk parseFrom(com.google.v.v vVar) {
        return (brk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<brk> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelectedAnswer(brt brtVar) {
        Objects.requireNonNull(brtVar);
        this.selectedAnswer_ = brtVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelectedSubtype(boa boaVar) {
        this.selectedSubtype_ = boaVar.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelectedSubtypeValue(int i2) {
        this.bitField0_ |= 2;
        this.selectedSubtype_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWazeAsksInfo(brz brzVar) {
        Objects.requireNonNull(brzVar);
        this.wazeAsksInfo_ = brzVar;
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "wazeAsksInfo_", "selectedSubtype_", "selectedAnswer_"});
        }
        if (iOrdinal == 3) {
            return new brk();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new brj(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<brk> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (brk.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public brt getSelectedAnswer() {
        brt brtVar = this.selectedAnswer_;
        return brtVar == null ? brt.getDefaultInstance() : brtVar;
    }

    public boa getSelectedSubtype() {
        boa boaVarA = boa.a(this.selectedSubtype_);
        return boaVarA == null ? boa.UNRECOGNIZED : boaVarA;
    }

    public int getSelectedSubtypeValue() {
        return this.selectedSubtype_;
    }

    public brz getWazeAsksInfo() {
        brz brzVar = this.wazeAsksInfo_;
        return brzVar == null ? brz.getDefaultInstance() : brzVar;
    }

    public boolean hasSelectedAnswer() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasSelectedSubtype() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasWazeAsksInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public static brj newBuilder(brk brkVar) {
        return (brj) DEFAULT_INSTANCE.createBuilder(brkVar);
    }

    public static brk parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (brk) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static brk parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (brk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static brk parseFrom(com.google.v.z zVar) {
        return (brk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static brk parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (brk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static brk parseFrom(InputStream inputStream) {
        return (brk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static brk parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (brk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static brk parseFrom(ByteBuffer byteBuffer) {
        return (brk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static brk parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (brk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static brk parseFrom(byte[] bArr) {
        return (brk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static brk parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (brk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
