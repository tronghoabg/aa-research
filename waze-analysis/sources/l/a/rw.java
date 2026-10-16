package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class rw extends com.google.v.du<rw, rv> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 1;
    private static final rw DEFAULT_INSTANCE;
    public static final int DETOUR_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<rw> PARSER;
    private int action_;
    private int bitField0_;
    private ro detour_;

    static {
        rw rwVar = new rw();
        DEFAULT_INSTANCE = rwVar;
        com.google.v.du.registerDefaultInstance(rw.class, rwVar);
    }

    private rw() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDetour() {
        this.detour_ = null;
        this.bitField0_ &= -2;
    }

    public static rw getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDetour(ro roVar) {
        Objects.requireNonNull(roVar);
        ro roVar2 = this.detour_;
        if (roVar2 != null && roVar2 != ro.getDefaultInstance()) {
            rn rnVarNewBuilder = ro.newBuilder(roVar2);
            rnVarNewBuilder.mergeFrom((rn) roVar);
            roVar = rnVarNewBuilder.buildPartial();
        }
        this.detour_ = roVar;
        this.bitField0_ |= 1;
    }

    public static rv newBuilder() {
        return (rv) DEFAULT_INSTANCE.createBuilder();
    }

    public static rw parseDelimitedFrom(InputStream inputStream) {
        return (rw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static rw parseFrom(com.google.v.v vVar) {
        return (rw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<rw> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(ru ruVar) {
        this.action_ = ruVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDetour(ro roVar) {
        Objects.requireNonNull(roVar);
        this.detour_ = roVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000", new Object[]{"bitField0_", "action_", "detour_"});
        }
        if (iOrdinal == 3) {
            return new rw();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new rv(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<rw> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (rw.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ru getAction() {
        int i2 = this.action_;
        ru ruVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : ru.DETOUR_TAKEN : ru.DETOUR_AVOIDED : ru.ACTION_UNSPECIFIED;
        return ruVar == null ? ru.UNRECOGNIZED : ruVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public ro getDetour() {
        ro roVar = this.detour_;
        return roVar == null ? ro.getDefaultInstance() : roVar;
    }

    public boolean hasDetour() {
        return (this.bitField0_ & 1) != 0;
    }

    public static rv newBuilder(rw rwVar) {
        return (rv) DEFAULT_INSTANCE.createBuilder(rwVar);
    }

    public static rw parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (rw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static rw parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (rw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static rw parseFrom(com.google.v.z zVar) {
        return (rw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static rw parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (rw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static rw parseFrom(InputStream inputStream) {
        return (rw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static rw parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (rw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static rw parseFrom(ByteBuffer byteBuffer) {
        return (rw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static rw parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (rw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static rw parseFrom(byte[] bArr) {
        return (rw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static rw parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (rw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
