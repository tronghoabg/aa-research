package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ip extends com.google.v.du<ip, io> implements com.google.v.fj {
    public static final int ANDROID_APP_CREATED_MS_FIELD_NUMBER = 3;
    public static final int COMMON_CODE_INIT_MS_FIELD_NUMBER = 4;
    public static final int COMMON_CODE_READY_MS_FIELD_NUMBER = 6;
    public static final int COMMON_CODE_START_MS_FIELD_NUMBER = 5;
    private static final ip DEFAULT_INSTANCE;
    public static final int ENTER_FOREGROUND_MS_FIELD_NUMBER = 7;
    public static final int ENTRY_POINT_MS_FIELD_NUMBER = 1;
    public static final int GPS_LOCATION_RECEIVED_MS_FIELD_NUMBER = 8;
    public static final int INFO_AROUND_BUBBLE_SHOWN_MS_FIELD_NUMBER = 15;
    public static final int IOS_APPLICATION_INIT_MS_FIELD_NUMBER = 2;
    public static final int LOGIN_SUCCESS_MS_FIELD_NUMBER = 10;
    public static final int MAIN_SCREEN_VISIBLE_MS_FIELD_NUMBER = 11;
    public static final int MAP_JAMS_ALERTS_RECEIVED_MS_FIELD_NUMBER = 16;
    public static final int MAP_SHOWN_AND_READY_MS_FIELD_NUMBER = 12;
    public static final int NETWORK_CONNECTED_MS_FIELD_NUMBER = 9;
    private static volatile com.google.v.fo<ip> PARSER = null;
    public static final int REGULAR_SESSION_FIELD_NUMBER = 14;
    public static final int START_STATE_READY_MS_FIELD_NUMBER = 13;
    private long androidAppCreatedMs_;
    private int bitField0_;
    private long commonCodeInitMs_;
    private long commonCodeReadyMs_;
    private long commonCodeStartMs_;
    private long enterForegroundMs_;
    private long entryPointMs_;
    private long gpsLocationReceivedMs_;
    private long infoAroundBubbleShownMs_;
    private long iosApplicationInitMs_;
    private long loginSuccessMs_;
    private long mainScreenVisibleMs_;
    private long mapJamsAlertsReceivedMs_;
    private long mapShownAndReadyMs_;
    private long networkConnectedMs_;
    private boolean regularSession_;
    private long startStateReadyMs_;

    static {
        ip ipVar = new ip();
        DEFAULT_INSTANCE = ipVar;
        com.google.v.du.registerDefaultInstance(ip.class, ipVar);
    }

    private ip() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAndroidAppCreatedMs() {
        this.bitField0_ &= -5;
        this.androidAppCreatedMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCommonCodeInitMs() {
        this.bitField0_ &= -9;
        this.commonCodeInitMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCommonCodeReadyMs() {
        this.bitField0_ &= -33;
        this.commonCodeReadyMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCommonCodeStartMs() {
        this.bitField0_ &= -17;
        this.commonCodeStartMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnterForegroundMs() {
        this.bitField0_ &= -65;
        this.enterForegroundMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEntryPointMs() {
        this.bitField0_ &= -2;
        this.entryPointMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGpsLocationReceivedMs() {
        this.bitField0_ &= -129;
        this.gpsLocationReceivedMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInfoAroundBubbleShownMs() {
        this.bitField0_ &= -16385;
        this.infoAroundBubbleShownMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIosApplicationInitMs() {
        this.bitField0_ &= -3;
        this.iosApplicationInitMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLoginSuccessMs() {
        this.bitField0_ &= -513;
        this.loginSuccessMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMainScreenVisibleMs() {
        this.bitField0_ &= -1025;
        this.mainScreenVisibleMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMapJamsAlertsReceivedMs() {
        this.bitField0_ &= -32769;
        this.mapJamsAlertsReceivedMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMapShownAndReadyMs() {
        this.bitField0_ &= -2049;
        this.mapShownAndReadyMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNetworkConnectedMs() {
        this.bitField0_ &= -257;
        this.networkConnectedMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegularSession() {
        this.bitField0_ &= -8193;
        this.regularSession_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartStateReadyMs() {
        this.bitField0_ &= -4097;
        this.startStateReadyMs_ = 0L;
    }

    public static ip getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io newBuilder() {
        return (io) DEFAULT_INSTANCE.createBuilder();
    }

    public static ip parseDelimitedFrom(InputStream inputStream) {
        return (ip) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ip parseFrom(com.google.v.v vVar) {
        return (ip) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ip> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAndroidAppCreatedMs(long j2) {
        this.bitField0_ |= 4;
        this.androidAppCreatedMs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCommonCodeInitMs(long j2) {
        this.bitField0_ |= 8;
        this.commonCodeInitMs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCommonCodeReadyMs(long j2) {
        this.bitField0_ |= 32;
        this.commonCodeReadyMs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCommonCodeStartMs(long j2) {
        this.bitField0_ |= 16;
        this.commonCodeStartMs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnterForegroundMs(long j2) {
        this.bitField0_ |= 64;
        this.enterForegroundMs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEntryPointMs(long j2) {
        this.bitField0_ |= 1;
        this.entryPointMs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGpsLocationReceivedMs(long j2) {
        this.bitField0_ |= 128;
        this.gpsLocationReceivedMs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInfoAroundBubbleShownMs(long j2) {
        this.bitField0_ |= 16384;
        this.infoAroundBubbleShownMs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIosApplicationInitMs(long j2) {
        this.bitField0_ |= 2;
        this.iosApplicationInitMs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLoginSuccessMs(long j2) {
        this.bitField0_ |= 512;
        this.loginSuccessMs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMainScreenVisibleMs(long j2) {
        this.bitField0_ |= 1024;
        this.mainScreenVisibleMs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMapJamsAlertsReceivedMs(long j2) {
        this.bitField0_ |= 32768;
        this.mapJamsAlertsReceivedMs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMapShownAndReadyMs(long j2) {
        this.bitField0_ |= 2048;
        this.mapShownAndReadyMs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNetworkConnectedMs(long j2) {
        this.bitField0_ |= 256;
        this.networkConnectedMs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegularSession(boolean z) {
        this.bitField0_ |= 8192;
        this.regularSession_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartStateReadyMs(long j2) {
        this.bitField0_ |= 4096;
        this.startStateReadyMs_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဂ\f\u000eဇ\r\u000fဂ\u000e\u0010ဂ\u000f", new Object[]{"bitField0_", "entryPointMs_", "iosApplicationInitMs_", "androidAppCreatedMs_", "commonCodeInitMs_", "commonCodeStartMs_", "commonCodeReadyMs_", "enterForegroundMs_", "gpsLocationReceivedMs_", "networkConnectedMs_", "loginSuccessMs_", "mainScreenVisibleMs_", "mapShownAndReadyMs_", "startStateReadyMs_", "regularSession_", "infoAroundBubbleShownMs_", "mapJamsAlertsReceivedMs_"});
        }
        if (iOrdinal == 3) {
            return new ip();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new io(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ip> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ip.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getAndroidAppCreatedMs() {
        return this.androidAppCreatedMs_;
    }

    public long getCommonCodeInitMs() {
        return this.commonCodeInitMs_;
    }

    public long getCommonCodeReadyMs() {
        return this.commonCodeReadyMs_;
    }

    public long getCommonCodeStartMs() {
        return this.commonCodeStartMs_;
    }

    public long getEnterForegroundMs() {
        return this.enterForegroundMs_;
    }

    public long getEntryPointMs() {
        return this.entryPointMs_;
    }

    public long getGpsLocationReceivedMs() {
        return this.gpsLocationReceivedMs_;
    }

    public long getInfoAroundBubbleShownMs() {
        return this.infoAroundBubbleShownMs_;
    }

    public long getIosApplicationInitMs() {
        return this.iosApplicationInitMs_;
    }

    public long getLoginSuccessMs() {
        return this.loginSuccessMs_;
    }

    public long getMainScreenVisibleMs() {
        return this.mainScreenVisibleMs_;
    }

    public long getMapJamsAlertsReceivedMs() {
        return this.mapJamsAlertsReceivedMs_;
    }

    public long getMapShownAndReadyMs() {
        return this.mapShownAndReadyMs_;
    }

    public long getNetworkConnectedMs() {
        return this.networkConnectedMs_;
    }

    public boolean getRegularSession() {
        return this.regularSession_;
    }

    public long getStartStateReadyMs() {
        return this.startStateReadyMs_;
    }

    public boolean hasAndroidAppCreatedMs() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasCommonCodeInitMs() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasCommonCodeReadyMs() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasCommonCodeStartMs() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasEnterForegroundMs() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasEntryPointMs() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasGpsLocationReceivedMs() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasInfoAroundBubbleShownMs() {
        return (this.bitField0_ & 16384) != 0;
    }

    public boolean hasIosApplicationInitMs() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasLoginSuccessMs() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasMainScreenVisibleMs() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasMapJamsAlertsReceivedMs() {
        return (this.bitField0_ & 32768) != 0;
    }

    public boolean hasMapShownAndReadyMs() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasNetworkConnectedMs() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasRegularSession() {
        return (this.bitField0_ & 8192) != 0;
    }

    public boolean hasStartStateReadyMs() {
        return (this.bitField0_ & 4096) != 0;
    }

    public static io newBuilder(ip ipVar) {
        return (io) DEFAULT_INSTANCE.createBuilder(ipVar);
    }

    public static ip parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ip) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ip parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ip) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ip parseFrom(com.google.v.z zVar) {
        return (ip) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ip parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ip) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ip parseFrom(InputStream inputStream) {
        return (ip) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ip parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ip) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ip parseFrom(ByteBuffer byteBuffer) {
        return (ip) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ip parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ip) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ip parseFrom(byte[] bArr) {
        return (ip) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ip parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ip) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
