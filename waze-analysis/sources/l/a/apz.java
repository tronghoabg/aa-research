package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class apz extends com.google.v.du<apz, apx> implements com.google.v.fj {
    public static final int BOOT_PERFORMANCE_FIELD_NUMBER = 3;
    private static final apz DEFAULT_INSTANCE;
    public static final int DOWNLOADER_INITIALIZED_FIELD_NUMBER = 5;
    public static final int HEALTH_REPORT_FIELD_NUMBER = 4;
    public static final int IOS_LONG_HANG_DETECTED_FIELD_NUMBER = 8;
    public static final int IOS_METRICKIT_DIAGNOSTIC_REPORT_FIELD_NUMBER = 6;
    public static final int IOS_METRICKIT_METRIC_REPORT_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<apz> PARSER = null;
    public static final int RESOURCES_CONSUMPTION_FIELD_NUMBER = 1;
    public static final int SHUTDOWN_FROM_BG_FIELD_NUMBER = 7;
    private int statCase_ = 0;
    private Object stat_;

    static {
        apz apzVar = new apz();
        DEFAULT_INSTANCE = apzVar;
        com.google.v.du.registerDefaultInstance(apz.class, apzVar);
    }

    private apz() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBootPerformance() {
        if (this.statCase_ == 3) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDownloaderInitialized() {
        if (this.statCase_ == 5) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHealthReport() {
        if (this.statCase_ == 4) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIosLongHangDetected() {
        if (this.statCase_ == 8) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIosMetrickitDiagnosticReport() {
        if (this.statCase_ == 6) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIosMetrickitMetricReport() {
        if (this.statCase_ == 2) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResourcesConsumption() {
        if (this.statCase_ == 1) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShutdownFromBg() {
        if (this.statCase_ == 7) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStat() {
        this.statCase_ = 0;
        this.stat_ = null;
    }

    public static apz getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBootPerformance(ip ipVar) {
        Objects.requireNonNull(ipVar);
        if (this.statCase_ == 3 && this.stat_ != ip.getDefaultInstance()) {
            io ioVarNewBuilder = ip.newBuilder((ip) this.stat_);
            ioVarNewBuilder.mergeFrom((io) ipVar);
            ipVar = ioVarNewBuilder.buildPartial();
        }
        this.stat_ = ipVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDownloaderInitialized(su suVar) {
        Objects.requireNonNull(suVar);
        if (this.statCase_ == 5 && this.stat_ != su.getDefaultInstance()) {
            st stVarNewBuilder = su.newBuilder((su) this.stat_);
            stVarNewBuilder.mergeFrom((st) suVar);
            suVar = stVarNewBuilder.buildPartial();
        }
        this.stat_ = suVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHealthReport(abj abjVar) {
        Objects.requireNonNull(abjVar);
        if (this.statCase_ == 4 && this.stat_ != abj.getDefaultInstance()) {
            abi abiVarNewBuilder = abj.newBuilder((abj) this.stat_);
            abiVarNewBuilder.mergeFrom((abi) abjVar);
            abjVar = abiVarNewBuilder.buildPartial();
        }
        this.stat_ = abjVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeIosLongHangDetected(afb afbVar) {
        Objects.requireNonNull(afbVar);
        if (this.statCase_ == 8 && this.stat_ != afb.getDefaultInstance()) {
            afa afaVarNewBuilder = afb.newBuilder((afb) this.stat_);
            afaVarNewBuilder.mergeFrom((afa) afbVar);
            afbVar = afaVarNewBuilder.buildPartial();
        }
        this.stat_ = afbVar;
        this.statCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeIosMetrickitDiagnosticReport(afd afdVar) {
        Objects.requireNonNull(afdVar);
        if (this.statCase_ == 6 && this.stat_ != afd.getDefaultInstance()) {
            afc afcVarNewBuilder = afd.newBuilder((afd) this.stat_);
            afcVarNewBuilder.mergeFrom((afc) afdVar);
            afdVar = afcVarNewBuilder.buildPartial();
        }
        this.stat_ = afdVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeIosMetrickitMetricReport(afp afpVar) {
        Objects.requireNonNull(afpVar);
        if (this.statCase_ == 2 && this.stat_ != afp.getDefaultInstance()) {
            afk afkVarNewBuilder = afp.newBuilder((afp) this.stat_);
            afkVarNewBuilder.mergeFrom((afk) afpVar);
            afpVar = afkVarNewBuilder.buildPartial();
        }
        this.stat_ = afpVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeResourcesConsumption(avu avuVar) {
        Objects.requireNonNull(avuVar);
        if (this.statCase_ == 1 && this.stat_ != avu.getDefaultInstance()) {
            avt avtVarNewBuilder = avu.newBuilder((avu) this.stat_);
            avtVarNewBuilder.mergeFrom((avt) avuVar);
            avuVar = avtVarNewBuilder.buildPartial();
        }
        this.stat_ = avuVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeShutdownFromBg(bdp bdpVar) {
        Objects.requireNonNull(bdpVar);
        if (this.statCase_ == 7 && this.stat_ != bdp.getDefaultInstance()) {
            bdo bdoVarNewBuilder = bdp.newBuilder((bdp) this.stat_);
            bdoVarNewBuilder.mergeFrom((bdo) bdpVar);
            bdpVar = bdoVarNewBuilder.buildPartial();
        }
        this.stat_ = bdpVar;
        this.statCase_ = 7;
    }

    public static apx newBuilder() {
        return (apx) DEFAULT_INSTANCE.createBuilder();
    }

    public static apz parseDelimitedFrom(InputStream inputStream) {
        return (apz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static apz parseFrom(com.google.v.v vVar) {
        return (apz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<apz> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBootPerformance(ip ipVar) {
        Objects.requireNonNull(ipVar);
        this.stat_ = ipVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDownloaderInitialized(su suVar) {
        Objects.requireNonNull(suVar);
        this.stat_ = suVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHealthReport(abj abjVar) {
        Objects.requireNonNull(abjVar);
        this.stat_ = abjVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIosLongHangDetected(afb afbVar) {
        Objects.requireNonNull(afbVar);
        this.stat_ = afbVar;
        this.statCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIosMetrickitDiagnosticReport(afd afdVar) {
        Objects.requireNonNull(afdVar);
        this.stat_ = afdVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIosMetrickitMetricReport(afp afpVar) {
        Objects.requireNonNull(afpVar);
        this.stat_ = afpVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResourcesConsumption(avu avuVar) {
        Objects.requireNonNull(avuVar);
        this.stat_ = avuVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShutdownFromBg(bdp bdpVar) {
        Objects.requireNonNull(bdpVar);
        this.stat_ = bdpVar;
        this.statCase_ = 7;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000", new Object[]{"stat_", "statCase_", avu.class, afp.class, ip.class, abj.class, su.class, afd.class, bdp.class, afb.class});
        }
        if (iOrdinal == 3) {
            return new apz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new apx(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<apz> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (apz.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ip getBootPerformance() {
        return this.statCase_ == 3 ? (ip) this.stat_ : ip.getDefaultInstance();
    }

    public su getDownloaderInitialized() {
        return this.statCase_ == 5 ? (su) this.stat_ : su.getDefaultInstance();
    }

    public abj getHealthReport() {
        return this.statCase_ == 4 ? (abj) this.stat_ : abj.getDefaultInstance();
    }

    public afb getIosLongHangDetected() {
        return this.statCase_ == 8 ? (afb) this.stat_ : afb.getDefaultInstance();
    }

    @Deprecated
    public afd getIosMetrickitDiagnosticReport() {
        return this.statCase_ == 6 ? (afd) this.stat_ : afd.getDefaultInstance();
    }

    public afp getIosMetrickitMetricReport() {
        return this.statCase_ == 2 ? (afp) this.stat_ : afp.getDefaultInstance();
    }

    public avu getResourcesConsumption() {
        return this.statCase_ == 1 ? (avu) this.stat_ : avu.getDefaultInstance();
    }

    public bdp getShutdownFromBg() {
        return this.statCase_ == 7 ? (bdp) this.stat_ : bdp.getDefaultInstance();
    }

    public apy getStatCase() {
        switch (this.statCase_) {
            case 0:
                return apy.f52957i;
            case 1:
                return apy.f52949a;
            case 2:
                return apy.f52950b;
            case 3:
                return apy.f52951c;
            case 4:
                return apy.f52952d;
            case 5:
                return apy.f52953e;
            case 6:
                return apy.f52954f;
            case 7:
                return apy.f52955g;
            case 8:
                return apy.f52956h;
            default:
                return null;
        }
    }

    public boolean hasBootPerformance() {
        return this.statCase_ == 3;
    }

    public boolean hasDownloaderInitialized() {
        return this.statCase_ == 5;
    }

    public boolean hasHealthReport() {
        return this.statCase_ == 4;
    }

    public boolean hasIosLongHangDetected() {
        return this.statCase_ == 8;
    }

    @Deprecated
    public boolean hasIosMetrickitDiagnosticReport() {
        return this.statCase_ == 6;
    }

    public boolean hasIosMetrickitMetricReport() {
        return this.statCase_ == 2;
    }

    public boolean hasResourcesConsumption() {
        return this.statCase_ == 1;
    }

    public boolean hasShutdownFromBg() {
        return this.statCase_ == 7;
    }

    public static apx newBuilder(apz apzVar) {
        return (apx) DEFAULT_INSTANCE.createBuilder(apzVar);
    }

    public static apz parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (apz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static apz parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (apz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static apz parseFrom(com.google.v.z zVar) {
        return (apz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static apz parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (apz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static apz parseFrom(InputStream inputStream) {
        return (apz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static apz parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (apz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static apz parseFrom(ByteBuffer byteBuffer) {
        return (apz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static apz parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (apz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static apz parseFrom(byte[] bArr) {
        return (apz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static apz parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (apz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
