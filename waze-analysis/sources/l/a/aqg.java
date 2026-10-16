package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aqg extends com.google.v.du<aqg, aqe> implements com.google.v.fj {
    public static final int BLUETOOTH_PERMISSION_REQUESTED_FIELD_NUMBER = 6;
    public static final int BLUETOOTH_PERMISSION_REQUEST_POPUP_CLICKED_FIELD_NUMBER = 3;
    public static final int BLUETOOTH_PERMISSION_REQUEST_POPUP_SHOWN_FIELD_NUMBER = 4;
    public static final int BLUETOOTH_PERMISSION_REQUEST_RESPONDED_FIELD_NUMBER = 5;
    private static final aqg DEFAULT_INSTANCE;
    public static final int LOCATION_ACCESS_DENIED_ERROR_FIELD_NUMBER = 1;
    public static final int LOCATION_PERMISSION_REQUEST_POPUP_CLICKED_FIELD_NUMBER = 8;
    public static final int LOCATION_PERMISSION_REQUEST_POPUP_SHOWN_FIELD_NUMBER = 7;
    public static final int OS_PERMISSIONS_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<aqg> PARSER;
    private int statCase_ = 0;
    private Object stat_;

    static {
        aqg aqgVar = new aqg();
        DEFAULT_INSTANCE = aqgVar;
        com.google.v.du.registerDefaultInstance(aqg.class, aqgVar);
    }

    private aqg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBluetoothPermissionRequestPopupClicked() {
        if (this.statCase_ == 3) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBluetoothPermissionRequestPopupShown() {
        if (this.statCase_ == 4) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBluetoothPermissionRequestResponded() {
        if (this.statCase_ == 5) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBluetoothPermissionRequested() {
        if (this.statCase_ == 6) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocationAccessDeniedError() {
        if (this.statCase_ == 1) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocationPermissionRequestPopupClicked() {
        if (this.statCase_ == 8) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocationPermissionRequestPopupShown() {
        if (this.statCase_ == 7) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOsPermissions() {
        if (this.statCase_ == 2) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStat() {
        this.statCase_ = 0;
        this.stat_ = null;
    }

    public static aqg getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBluetoothPermissionRequestPopupClicked(ig igVar) {
        Objects.requireNonNull(igVar);
        if (this.statCase_ == 3 && this.stat_ != ig.getDefaultInstance()) {
            Cif cifNewBuilder = ig.newBuilder((ig) this.stat_);
            cifNewBuilder.mergeFrom((Cif) igVar);
            igVar = cifNewBuilder.buildPartial();
        }
        this.stat_ = igVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBluetoothPermissionRequestPopupShown(ii iiVar) {
        Objects.requireNonNull(iiVar);
        if (this.statCase_ == 4 && this.stat_ != ii.getDefaultInstance()) {
            ih ihVarNewBuilder = ii.newBuilder((ii) this.stat_);
            ihVarNewBuilder.mergeFrom((ih) iiVar);
            iiVar = ihVarNewBuilder.buildPartial();
        }
        this.stat_ = iiVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBluetoothPermissionRequestResponded(ik ikVar) {
        Objects.requireNonNull(ikVar);
        if (this.statCase_ == 5 && this.stat_ != ik.getDefaultInstance()) {
            ij ijVarNewBuilder = ik.newBuilder((ik) this.stat_);
            ijVarNewBuilder.mergeFrom((ij) ikVar);
            ikVar = ijVarNewBuilder.buildPartial();
        }
        this.stat_ = ikVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBluetoothPermissionRequested(im imVar) {
        Objects.requireNonNull(imVar);
        if (this.statCase_ == 6 && this.stat_ != im.getDefaultInstance()) {
            il ilVarNewBuilder = im.newBuilder((im) this.stat_);
            ilVarNewBuilder.mergeFrom((il) imVar);
            imVar = ilVarNewBuilder.buildPartial();
        }
        this.stat_ = imVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLocationAccessDeniedError(agj agjVar) {
        Objects.requireNonNull(agjVar);
        if (this.statCase_ == 1 && this.stat_ != agj.getDefaultInstance()) {
            agh aghVarNewBuilder = agj.newBuilder((agj) this.stat_);
            aghVarNewBuilder.mergeFrom((agh) agjVar);
            agjVar = aghVarNewBuilder.buildPartial();
        }
        this.stat_ = agjVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLocationPermissionRequestPopupClicked(ags agsVar) {
        Objects.requireNonNull(agsVar);
        if (this.statCase_ == 8 && this.stat_ != ags.getDefaultInstance()) {
            agr agrVarNewBuilder = ags.newBuilder((ags) this.stat_);
            agrVarNewBuilder.mergeFrom((agr) agsVar);
            agsVar = agrVarNewBuilder.buildPartial();
        }
        this.stat_ = agsVar;
        this.statCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLocationPermissionRequestPopupShown(agu aguVar) {
        Objects.requireNonNull(aguVar);
        if (this.statCase_ == 7 && this.stat_ != agu.getDefaultInstance()) {
            agt agtVarNewBuilder = agu.newBuilder((agu) this.stat_);
            agtVarNewBuilder.mergeFrom((agt) aguVar);
            aguVar = agtVarNewBuilder.buildPartial();
        }
        this.stat_ = aguVar;
        this.statCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOsPermissions(aou aouVar) {
        Objects.requireNonNull(aouVar);
        if (this.statCase_ == 2 && this.stat_ != aou.getDefaultInstance()) {
            aos aosVarNewBuilder = aou.newBuilder((aou) this.stat_);
            aosVarNewBuilder.mergeFrom((aos) aouVar);
            aouVar = aosVarNewBuilder.buildPartial();
        }
        this.stat_ = aouVar;
        this.statCase_ = 2;
    }

    public static aqe newBuilder() {
        return (aqe) DEFAULT_INSTANCE.createBuilder();
    }

    public static aqg parseDelimitedFrom(InputStream inputStream) {
        return (aqg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aqg parseFrom(com.google.v.v vVar) {
        return (aqg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aqg> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBluetoothPermissionRequestPopupClicked(ig igVar) {
        Objects.requireNonNull(igVar);
        this.stat_ = igVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBluetoothPermissionRequestPopupShown(ii iiVar) {
        Objects.requireNonNull(iiVar);
        this.stat_ = iiVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBluetoothPermissionRequestResponded(ik ikVar) {
        Objects.requireNonNull(ikVar);
        this.stat_ = ikVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBluetoothPermissionRequested(im imVar) {
        Objects.requireNonNull(imVar);
        this.stat_ = imVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocationAccessDeniedError(agj agjVar) {
        Objects.requireNonNull(agjVar);
        this.stat_ = agjVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocationPermissionRequestPopupClicked(ags agsVar) {
        Objects.requireNonNull(agsVar);
        this.stat_ = agsVar;
        this.statCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocationPermissionRequestPopupShown(agu aguVar) {
        Objects.requireNonNull(aguVar);
        this.stat_ = aguVar;
        this.statCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsPermissions(aou aouVar) {
        Objects.requireNonNull(aouVar);
        this.stat_ = aouVar;
        this.statCase_ = 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000", new Object[]{"stat_", "statCase_", agj.class, aou.class, ig.class, ii.class, ik.class, im.class, agu.class, ags.class});
        }
        if (iOrdinal == 3) {
            return new aqg();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aqe(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aqg> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aqg.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ig getBluetoothPermissionRequestPopupClicked() {
        return this.statCase_ == 3 ? (ig) this.stat_ : ig.getDefaultInstance();
    }

    public ii getBluetoothPermissionRequestPopupShown() {
        return this.statCase_ == 4 ? (ii) this.stat_ : ii.getDefaultInstance();
    }

    public ik getBluetoothPermissionRequestResponded() {
        return this.statCase_ == 5 ? (ik) this.stat_ : ik.getDefaultInstance();
    }

    public im getBluetoothPermissionRequested() {
        return this.statCase_ == 6 ? (im) this.stat_ : im.getDefaultInstance();
    }

    public agj getLocationAccessDeniedError() {
        return this.statCase_ == 1 ? (agj) this.stat_ : agj.getDefaultInstance();
    }

    public ags getLocationPermissionRequestPopupClicked() {
        return this.statCase_ == 8 ? (ags) this.stat_ : ags.getDefaultInstance();
    }

    public agu getLocationPermissionRequestPopupShown() {
        return this.statCase_ == 7 ? (agu) this.stat_ : agu.getDefaultInstance();
    }

    public aou getOsPermissions() {
        return this.statCase_ == 2 ? (aou) this.stat_ : aou.getDefaultInstance();
    }

    public aqf getStatCase() {
        switch (this.statCase_) {
            case 0:
                return aqf.f52988i;
            case 1:
                return aqf.f52980a;
            case 2:
                return aqf.f52981b;
            case 3:
                return aqf.f52982c;
            case 4:
                return aqf.f52983d;
            case 5:
                return aqf.f52984e;
            case 6:
                return aqf.f52985f;
            case 7:
                return aqf.f52986g;
            case 8:
                return aqf.f52987h;
            default:
                return null;
        }
    }

    public boolean hasBluetoothPermissionRequestPopupClicked() {
        return this.statCase_ == 3;
    }

    public boolean hasBluetoothPermissionRequestPopupShown() {
        return this.statCase_ == 4;
    }

    public boolean hasBluetoothPermissionRequestResponded() {
        return this.statCase_ == 5;
    }

    public boolean hasBluetoothPermissionRequested() {
        return this.statCase_ == 6;
    }

    public boolean hasLocationAccessDeniedError() {
        return this.statCase_ == 1;
    }

    public boolean hasLocationPermissionRequestPopupClicked() {
        return this.statCase_ == 8;
    }

    public boolean hasLocationPermissionRequestPopupShown() {
        return this.statCase_ == 7;
    }

    public boolean hasOsPermissions() {
        return this.statCase_ == 2;
    }

    public static aqe newBuilder(aqg aqgVar) {
        return (aqe) DEFAULT_INSTANCE.createBuilder(aqgVar);
    }

    public static aqg parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aqg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aqg parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aqg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aqg parseFrom(com.google.v.z zVar) {
        return (aqg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aqg parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aqg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aqg parseFrom(InputStream inputStream) {
        return (aqg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aqg parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aqg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aqg parseFrom(ByteBuffer byteBuffer) {
        return (aqg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aqg parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aqg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aqg parseFrom(byte[] bArr) {
        return (aqg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aqg parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aqg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
