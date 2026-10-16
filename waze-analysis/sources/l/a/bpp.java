package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bpp extends com.google.v.du<bpp, bpm> implements com.google.v.fj {
    public static final int CHANGED_FROM_FIELD_NUMBER = 1;
    public static final int CHANGED_TO_FIELD_NUMBER = 2;
    private static final bpp DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bpp> PARSER = null;
    public static final int SOURCE_FIELD_NUMBER = 4;
    public static final int THIS_DRIVE_ONLY_FIELD_NUMBER = 3;
    private int bitField0_;
    private int changedFrom_;
    private int changedTo_;
    private int source_;
    private boolean thisDriveOnly_;

    static {
        bpp bppVar = new bpp();
        DEFAULT_INSTANCE = bppVar;
        com.google.v.du.registerDefaultInstance(bpp.class, bppVar);
    }

    private bpp() {
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

    /* JADX INFO: Access modifiers changed from: private */
    public void clearThisDriveOnly() {
        this.bitField0_ &= -2;
        this.thisDriveOnly_ = false;
    }

    public static bpp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bpm newBuilder() {
        return (bpm) DEFAULT_INSTANCE.createBuilder();
    }

    public static bpp parseDelimitedFrom(InputStream inputStream) {
        return (bpp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bpp parseFrom(com.google.v.v vVar) {
        return (bpp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bpp> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangedFrom(bpn bpnVar) {
        this.changedFrom_ = bpnVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangedFromValue(int i2) {
        this.changedFrom_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangedTo(bpn bpnVar) {
        this.changedTo_ = bpnVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangedToValue(int i2) {
        this.changedTo_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSource(bpo bpoVar) {
        this.source_ = bpoVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceValue(int i2) {
        this.source_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setThisDriveOnly(boolean z) {
        this.bitField0_ |= 1;
        this.thisDriveOnly_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002\f\u0003ဇ\u0000\u0004\f", new Object[]{"bitField0_", "changedFrom_", "changedTo_", "thisDriveOnly_", "source_"});
        }
        if (iOrdinal == 3) {
            return new bpp();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bpm(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bpp> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bpp.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bpn getChangedFrom() {
        bpn bpnVarA = bpn.a(this.changedFrom_);
        return bpnVarA == null ? bpn.UNRECOGNIZED : bpnVarA;
    }

    public int getChangedFromValue() {
        return this.changedFrom_;
    }

    public bpn getChangedTo() {
        bpn bpnVarA = bpn.a(this.changedTo_);
        return bpnVarA == null ? bpn.UNRECOGNIZED : bpnVarA;
    }

    public int getChangedToValue() {
        return this.changedTo_;
    }

    @Deprecated
    public bpo getSource() {
        int i2 = this.source_;
        bpo bpoVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : bpo.TRIP_OVERVIEW_SCREEN : bpo.CAR_ICON_SETTINGS : bpo.MAIN_SETTINGS_MENU : bpo.VEHICLE_TYPE_SELECTION_SOURCE_UNSPECIFIED;
        return bpoVar == null ? bpo.UNRECOGNIZED : bpoVar;
    }

    @Deprecated
    public int getSourceValue() {
        return this.source_;
    }

    public boolean getThisDriveOnly() {
        return this.thisDriveOnly_;
    }

    public boolean hasThisDriveOnly() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bpm newBuilder(bpp bppVar) {
        return (bpm) DEFAULT_INSTANCE.createBuilder(bppVar);
    }

    public static bpp parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bpp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bpp parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bpp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bpp parseFrom(com.google.v.z zVar) {
        return (bpp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bpp parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bpp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bpp parseFrom(InputStream inputStream) {
        return (bpp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bpp parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bpp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bpp parseFrom(ByteBuffer byteBuffer) {
        return (bpp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bpp parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bpp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bpp parseFrom(byte[] bArr) {
        return (bpp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bpp parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bpp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
