package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class afo extends com.google.v.du<afo, afn> implements com.google.v.fj {
    public static final int CELLULAR_DOWNLOAD_FIELD_NUMBER = 1;
    public static final int CELLULAR_UPLOAD_FIELD_NUMBER = 3;
    private static final afo DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<afo> PARSER = null;
    public static final int WIFI_DOWNLOAD_FIELD_NUMBER = 2;
    public static final int WIFI_UPLOAD_FIELD_NUMBER = 4;
    private int bitField0_;
    private long cellularDownload_;
    private long cellularUpload_;
    private long wifiDownload_;
    private long wifiUpload_;

    static {
        afo afoVar = new afo();
        DEFAULT_INSTANCE = afoVar;
        com.google.v.du.registerDefaultInstance(afo.class, afoVar);
    }

    private afo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCellularDownload() {
        this.bitField0_ &= -2;
        this.cellularDownload_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCellularUpload() {
        this.bitField0_ &= -5;
        this.cellularUpload_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWifiDownload() {
        this.bitField0_ &= -3;
        this.wifiDownload_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWifiUpload() {
        this.bitField0_ &= -9;
        this.wifiUpload_ = 0L;
    }

    public static afo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static afn newBuilder() {
        return (afn) DEFAULT_INSTANCE.createBuilder();
    }

    public static afo parseDelimitedFrom(InputStream inputStream) {
        return (afo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static afo parseFrom(com.google.v.v vVar) {
        return (afo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<afo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCellularDownload(long j2) {
        this.bitField0_ |= 1;
        this.cellularDownload_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCellularUpload(long j2) {
        this.bitField0_ |= 4;
        this.cellularUpload_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWifiDownload(long j2) {
        this.bitField0_ |= 2;
        this.wifiDownload_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWifiUpload(long j2) {
        this.bitField0_ |= 8;
        this.wifiUpload_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"bitField0_", "cellularDownload_", "wifiDownload_", "cellularUpload_", "wifiUpload_"});
        }
        if (iOrdinal == 3) {
            return new afo();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new afn(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<afo> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (afo.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getCellularDownload() {
        return this.cellularDownload_;
    }

    public long getCellularUpload() {
        return this.cellularUpload_;
    }

    public long getWifiDownload() {
        return this.wifiDownload_;
    }

    public long getWifiUpload() {
        return this.wifiUpload_;
    }

    public boolean hasCellularDownload() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasCellularUpload() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasWifiDownload() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasWifiUpload() {
        return (this.bitField0_ & 8) != 0;
    }

    public static afn newBuilder(afo afoVar) {
        return (afn) DEFAULT_INSTANCE.createBuilder(afoVar);
    }

    public static afo parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (afo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static afo parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (afo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static afo parseFrom(com.google.v.z zVar) {
        return (afo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static afo parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (afo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static afo parseFrom(InputStream inputStream) {
        return (afo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static afo parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (afo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static afo parseFrom(ByteBuffer byteBuffer) {
        return (afo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static afo parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (afo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static afo parseFrom(byte[] bArr) {
        return (afo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static afo parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (afo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
