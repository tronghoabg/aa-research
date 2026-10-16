package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bdg extends com.google.v.du<bdg, bde> implements com.google.v.fj {
    private static final bdg DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bdg> PARSER = null;
    public static final int SHARE_DRIVE_DRAWER_CLICKED_FIELD_NUMBER = 2;
    public static final int SHARE_DRIVE_DRAWER_SHOWN_FIELD_NUMBER = 1;
    public static final int SHARE_DRIVE_LIVE_SCREEN_CLICKED_FIELD_NUMBER = 8;
    public static final int SHARE_DRIVE_LIVE_SCREEN_SHOWN_FIELD_NUMBER = 7;
    public static final int SHARE_DRIVE_PRE_SHARE_SCREEN_CLICKED_FIELD_NUMBER = 6;
    public static final int SHARE_DRIVE_PRE_SHARE_SCREEN_SHOWN_FIELD_NUMBER = 5;
    public static final int SHARE_LOCATION_DRAWER_CLICKED_FIELD_NUMBER = 3;
    public static final int SHARE_LOCATION_DRAWER_SHOWN_FIELD_NUMBER = 4;
    private int statCase_ = 0;
    private Object stat_;

    static {
        bdg bdgVar = new bdg();
        DEFAULT_INSTANCE = bdgVar;
        com.google.v.du.registerDefaultInstance(bdg.class, bdgVar);
    }

    private bdg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShareDriveDrawerClicked() {
        if (this.statCase_ == 2) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShareDriveDrawerShown() {
        if (this.statCase_ == 1) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShareDriveLiveScreenClicked() {
        if (this.statCase_ == 8) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShareDriveLiveScreenShown() {
        if (this.statCase_ == 7) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShareDrivePreShareScreenClicked() {
        if (this.statCase_ == 6) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShareDrivePreShareScreenShown() {
        if (this.statCase_ == 5) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShareLocationDrawerClicked() {
        if (this.statCase_ == 3) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShareLocationDrawerShown() {
        if (this.statCase_ == 4) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStat() {
        this.statCase_ = 0;
        this.stat_ = null;
    }

    public static bdg getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeShareDriveDrawerClicked(bck bckVar) {
        Objects.requireNonNull(bckVar);
        if (this.statCase_ == 2 && this.stat_ != bck.getDefaultInstance()) {
            bcj bcjVarNewBuilder = bck.newBuilder((bck) this.stat_);
            bcjVarNewBuilder.mergeFrom((bcj) bckVar);
            bckVar = bcjVarNewBuilder.buildPartial();
        }
        this.stat_ = bckVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeShareDriveDrawerShown(bcm bcmVar) {
        Objects.requireNonNull(bcmVar);
        if (this.statCase_ == 1 && this.stat_ != bcm.getDefaultInstance()) {
            bcl bclVarNewBuilder = bcm.newBuilder((bcm) this.stat_);
            bclVarNewBuilder.mergeFrom((bcl) bcmVar);
            bcmVar = bclVarNewBuilder.buildPartial();
        }
        this.stat_ = bcmVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeShareDriveLiveScreenClicked(bcr bcrVar) {
        Objects.requireNonNull(bcrVar);
        if (this.statCase_ == 8 && this.stat_ != bcr.getDefaultInstance()) {
            bcq bcqVarNewBuilder = bcr.newBuilder((bcr) this.stat_);
            bcqVarNewBuilder.mergeFrom((bcq) bcrVar);
            bcrVar = bcqVarNewBuilder.buildPartial();
        }
        this.stat_ = bcrVar;
        this.statCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeShareDriveLiveScreenShown(bct bctVar) {
        Objects.requireNonNull(bctVar);
        if (this.statCase_ == 7 && this.stat_ != bct.getDefaultInstance()) {
            bcs bcsVarNewBuilder = bct.newBuilder((bct) this.stat_);
            bcsVarNewBuilder.mergeFrom((bcs) bctVar);
            bctVar = bcsVarNewBuilder.buildPartial();
        }
        this.stat_ = bctVar;
        this.statCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeShareDrivePreShareScreenClicked(bda bdaVar) {
        Objects.requireNonNull(bdaVar);
        if (this.statCase_ == 6 && this.stat_ != bda.getDefaultInstance()) {
            bcz bczVarNewBuilder = bda.newBuilder((bda) this.stat_);
            bczVarNewBuilder.mergeFrom((bcz) bdaVar);
            bdaVar = bczVarNewBuilder.buildPartial();
        }
        this.stat_ = bdaVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeShareDrivePreShareScreenShown(bdc bdcVar) {
        Objects.requireNonNull(bdcVar);
        if (this.statCase_ == 5 && this.stat_ != bdc.getDefaultInstance()) {
            bdb bdbVarNewBuilder = bdc.newBuilder((bdc) this.stat_);
            bdbVarNewBuilder.mergeFrom((bdb) bdcVar);
            bdcVar = bdbVarNewBuilder.buildPartial();
        }
        this.stat_ = bdcVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeShareLocationDrawerClicked(bdi bdiVar) {
        Objects.requireNonNull(bdiVar);
        if (this.statCase_ == 3 && this.stat_ != bdi.getDefaultInstance()) {
            bdh bdhVarNewBuilder = bdi.newBuilder((bdi) this.stat_);
            bdhVarNewBuilder.mergeFrom((bdh) bdiVar);
            bdiVar = bdhVarNewBuilder.buildPartial();
        }
        this.stat_ = bdiVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeShareLocationDrawerShown(bdk bdkVar) {
        Objects.requireNonNull(bdkVar);
        if (this.statCase_ == 4 && this.stat_ != bdk.getDefaultInstance()) {
            bdj bdjVarNewBuilder = bdk.newBuilder((bdk) this.stat_);
            bdjVarNewBuilder.mergeFrom((bdj) bdkVar);
            bdkVar = bdjVarNewBuilder.buildPartial();
        }
        this.stat_ = bdkVar;
        this.statCase_ = 4;
    }

    public static bde newBuilder() {
        return (bde) DEFAULT_INSTANCE.createBuilder();
    }

    public static bdg parseDelimitedFrom(InputStream inputStream) {
        return (bdg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bdg parseFrom(com.google.v.v vVar) {
        return (bdg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bdg> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShareDriveDrawerClicked(bck bckVar) {
        Objects.requireNonNull(bckVar);
        this.stat_ = bckVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShareDriveDrawerShown(bcm bcmVar) {
        Objects.requireNonNull(bcmVar);
        this.stat_ = bcmVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShareDriveLiveScreenClicked(bcr bcrVar) {
        Objects.requireNonNull(bcrVar);
        this.stat_ = bcrVar;
        this.statCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShareDriveLiveScreenShown(bct bctVar) {
        Objects.requireNonNull(bctVar);
        this.stat_ = bctVar;
        this.statCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShareDrivePreShareScreenClicked(bda bdaVar) {
        Objects.requireNonNull(bdaVar);
        this.stat_ = bdaVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShareDrivePreShareScreenShown(bdc bdcVar) {
        Objects.requireNonNull(bdcVar);
        this.stat_ = bdcVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShareLocationDrawerClicked(bdi bdiVar) {
        Objects.requireNonNull(bdiVar);
        this.stat_ = bdiVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShareLocationDrawerShown(bdk bdkVar) {
        Objects.requireNonNull(bdkVar);
        this.stat_ = bdkVar;
        this.statCase_ = 4;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000", new Object[]{"stat_", "statCase_", bcm.class, bck.class, bdi.class, bdk.class, bdc.class, bda.class, bct.class, bcr.class});
        }
        if (iOrdinal == 3) {
            return new bdg();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bde(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bdg> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bdg.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bck getShareDriveDrawerClicked() {
        return this.statCase_ == 2 ? (bck) this.stat_ : bck.getDefaultInstance();
    }

    public bcm getShareDriveDrawerShown() {
        return this.statCase_ == 1 ? (bcm) this.stat_ : bcm.getDefaultInstance();
    }

    public bcr getShareDriveLiveScreenClicked() {
        return this.statCase_ == 8 ? (bcr) this.stat_ : bcr.getDefaultInstance();
    }

    public bct getShareDriveLiveScreenShown() {
        return this.statCase_ == 7 ? (bct) this.stat_ : bct.getDefaultInstance();
    }

    public bda getShareDrivePreShareScreenClicked() {
        return this.statCase_ == 6 ? (bda) this.stat_ : bda.getDefaultInstance();
    }

    public bdc getShareDrivePreShareScreenShown() {
        return this.statCase_ == 5 ? (bdc) this.stat_ : bdc.getDefaultInstance();
    }

    public bdi getShareLocationDrawerClicked() {
        return this.statCase_ == 3 ? (bdi) this.stat_ : bdi.getDefaultInstance();
    }

    public bdk getShareLocationDrawerShown() {
        return this.statCase_ == 4 ? (bdk) this.stat_ : bdk.getDefaultInstance();
    }

    public bdf getStatCase() {
        switch (this.statCase_) {
            case 0:
                return bdf.f53768i;
            case 1:
                return bdf.f53760a;
            case 2:
                return bdf.f53761b;
            case 3:
                return bdf.f53762c;
            case 4:
                return bdf.f53763d;
            case 5:
                return bdf.f53764e;
            case 6:
                return bdf.f53765f;
            case 7:
                return bdf.f53766g;
            case 8:
                return bdf.f53767h;
            default:
                return null;
        }
    }

    public boolean hasShareDriveDrawerClicked() {
        return this.statCase_ == 2;
    }

    public boolean hasShareDriveDrawerShown() {
        return this.statCase_ == 1;
    }

    public boolean hasShareDriveLiveScreenClicked() {
        return this.statCase_ == 8;
    }

    public boolean hasShareDriveLiveScreenShown() {
        return this.statCase_ == 7;
    }

    public boolean hasShareDrivePreShareScreenClicked() {
        return this.statCase_ == 6;
    }

    public boolean hasShareDrivePreShareScreenShown() {
        return this.statCase_ == 5;
    }

    public boolean hasShareLocationDrawerClicked() {
        return this.statCase_ == 3;
    }

    public boolean hasShareLocationDrawerShown() {
        return this.statCase_ == 4;
    }

    public static bde newBuilder(bdg bdgVar) {
        return (bde) DEFAULT_INSTANCE.createBuilder(bdgVar);
    }

    public static bdg parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bdg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bdg parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bdg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bdg parseFrom(com.google.v.z zVar) {
        return (bdg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bdg parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bdg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bdg parseFrom(InputStream inputStream) {
        return (bdg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bdg parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bdg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bdg parseFrom(ByteBuffer byteBuffer) {
        return (bdg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bdg parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bdg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bdg parseFrom(byte[] bArr) {
        return (bdg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bdg parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bdg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
