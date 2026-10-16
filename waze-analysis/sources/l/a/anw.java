package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class anw extends com.google.v.du<anw, ant> implements com.google.v.fj {
    private static final anw DEFAULT_INSTANCE;
    public static final int NON_LOCATION_BASED_MESSAGE_SUBTYPE_FIELD_NUMBER = 2;
    public static final int NON_LOCATION_BASED_MESSAGE_TYPE_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<anw> PARSER;
    private int nonLocationBasedMessageSubtype_;
    private int nonLocationBasedMessageType_;

    static {
        anw anwVar = new anw();
        DEFAULT_INSTANCE = anwVar;
        com.google.v.du.registerDefaultInstance(anw.class, anwVar);
    }

    private anw() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNonLocationBasedMessageSubtype() {
        this.nonLocationBasedMessageSubtype_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNonLocationBasedMessageType() {
        this.nonLocationBasedMessageType_ = 0;
    }

    public static anw getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ant newBuilder() {
        return (ant) DEFAULT_INSTANCE.createBuilder();
    }

    public static anw parseDelimitedFrom(InputStream inputStream) {
        return (anw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static anw parseFrom(com.google.v.v vVar) {
        return (anw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<anw> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNonLocationBasedMessageSubtype(anu anuVar) {
        this.nonLocationBasedMessageSubtype_ = anuVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNonLocationBasedMessageSubtypeValue(int i2) {
        this.nonLocationBasedMessageSubtype_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNonLocationBasedMessageType(anv anvVar) {
        this.nonLocationBasedMessageType_ = anvVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNonLocationBasedMessageTypeValue(int i2) {
        this.nonLocationBasedMessageType_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", new Object[]{"nonLocationBasedMessageType_", "nonLocationBasedMessageSubtype_"});
        }
        if (iOrdinal == 3) {
            return new anw();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ant(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<anw> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (anw.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public anu getNonLocationBasedMessageSubtype() {
        int i2 = this.nonLocationBasedMessageSubtype_;
        anu anuVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 6 ? null : anu.NETWORK_ISSUE_DEFAULT : anu.GTW_REROUTE_SUGGESTION_DEFAULT : anu.MID_DRIVE_TOAST_THANK_YOU : anu.ECO_REGULATION_DEFAULT : anu.TURN_ON_YOUR_HEADLIGHTS_DEFAULT : anu.SUBTYPE_UNSPECIFIED;
        return anuVar == null ? anu.UNRECOGNIZED : anuVar;
    }

    public int getNonLocationBasedMessageSubtypeValue() {
        return this.nonLocationBasedMessageSubtype_;
    }

    public anv getNonLocationBasedMessageType() {
        int i2 = this.nonLocationBasedMessageType_;
        anv anvVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 6 ? null : anv.NETWORK_ISSUE : anv.GTW_REROUTE_SUGGESTION : anv.MID_DRIVE_TOAST : anv.ECO_REGULATION : anv.TURN_ON_YOUR_HEADLIGHTS : anv.TYPE_UNSPECIFIED;
        return anvVar == null ? anv.UNRECOGNIZED : anvVar;
    }

    public int getNonLocationBasedMessageTypeValue() {
        return this.nonLocationBasedMessageType_;
    }

    public static ant newBuilder(anw anwVar) {
        return (ant) DEFAULT_INSTANCE.createBuilder(anwVar);
    }

    public static anw parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (anw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static anw parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (anw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static anw parseFrom(com.google.v.z zVar) {
        return (anw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static anw parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (anw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static anw parseFrom(InputStream inputStream) {
        return (anw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static anw parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (anw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static anw parseFrom(ByteBuffer byteBuffer) {
        return (anw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static anw parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (anw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static anw parseFrom(byte[] bArr) {
        return (anw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static anw parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (anw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
