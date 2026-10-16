package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class axp extends com.google.v.du<axp, axn> implements com.google.v.fj {
    public static final int CONTEXT_FIELD_NUMBER = 1;
    private static final axp DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<axp> PARSER;
    private int context_;

    static {
        axp axpVar = new axp();
        DEFAULT_INSTANCE = axpVar;
        com.google.v.du.registerDefaultInstance(axp.class, axpVar);
    }

    private axp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContext() {
        this.context_ = 0;
    }

    public static axp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static axn newBuilder() {
        return (axn) DEFAULT_INSTANCE.createBuilder();
    }

    public static axp parseDelimitedFrom(InputStream inputStream) {
        return (axp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static axp parseFrom(com.google.v.v vVar) {
        return (axp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<axp> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContext(axo axoVar) {
        this.context_ = axoVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContextValue(int i2) {
        this.context_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"context_"});
        }
        if (iOrdinal == 3) {
            return new axp();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new axn(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<axp> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (axp.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public axo getContext() {
        int i2 = this.context_;
        axo axoVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? null : axo.START_STATE_PLAN_DRIVE_EDIT_TIME : axo.SAVED_PLANNED_DRIVE_EDIT_TIME : axo.PLANNED_DRIVE_SCREEN : axo.ETA_SCREEN : axo.TRIP_OVERVIEW_SCREEN : axo.CONTEXT_UNSPECIFIED;
        return axoVar == null ? axo.UNRECOGNIZED : axoVar;
    }

    public int getContextValue() {
        return this.context_;
    }

    public static axn newBuilder(axp axpVar) {
        return (axn) DEFAULT_INSTANCE.createBuilder(axpVar);
    }

    public static axp parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (axp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static axp parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (axp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static axp parseFrom(com.google.v.z zVar) {
        return (axp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static axp parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (axp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static axp parseFrom(InputStream inputStream) {
        return (axp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static axp parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (axp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static axp parseFrom(ByteBuffer byteBuffer) {
        return (axp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static axp parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (axp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static axp parseFrom(byte[] bArr) {
        return (axp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static axp parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (axp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
