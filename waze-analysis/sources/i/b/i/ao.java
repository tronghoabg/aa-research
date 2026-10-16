package i.b.i;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ao extends du<ao, an> implements fj {
    public static final int ALERT_FIELD_NUMBER = 1;
    public static final int BADGE_FIELD_NUMBER = 2;
    private static final ao DEFAULT_INSTANCE;
    public static final int NOTIFICATION_CENTER_FIELD_NUMBER = 4;
    public static final int ON_LOCK_FIELD_NUMBER = 5;
    private static volatile fo<ao> PARSER = null;
    public static final int SOUND_FIELD_NUMBER = 3;
    private boolean alert_;
    private boolean badge_;
    private int bitField0_;
    private boolean notificationCenter_;
    private boolean onLock_;
    private boolean sound_;

    static {
        ao aoVar = new ao();
        DEFAULT_INSTANCE = aoVar;
        du.registerDefaultInstance(ao.class, aoVar);
    }

    private ao() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlert() {
        this.bitField0_ &= -2;
        this.alert_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBadge() {
        this.bitField0_ &= -3;
        this.badge_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNotificationCenter() {
        this.bitField0_ &= -9;
        this.notificationCenter_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOnLock() {
        this.bitField0_ &= -17;
        this.onLock_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSound() {
        this.bitField0_ &= -5;
        this.sound_ = false;
    }

    public static ao getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static an newBuilder() {
        return (an) DEFAULT_INSTANCE.createBuilder();
    }

    public static ao parseDelimitedFrom(InputStream inputStream) {
        return (ao) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ao parseFrom(com.google.v.v vVar) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ao> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlert(boolean z) {
        this.bitField0_ |= 1;
        this.alert_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBadge(boolean z) {
        this.bitField0_ |= 2;
        this.badge_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNotificationCenter(boolean z) {
        this.bitField0_ |= 8;
        this.notificationCenter_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnLock(boolean z) {
        this.bitField0_ |= 16;
        this.onLock_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSound(boolean z) {
        this.bitField0_ |= 4;
        this.sound_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"bitField0_", "alert_", "badge_", "sound_", "notificationCenter_", "onLock_"});
        }
        if (iOrdinal == 3) {
            return new ao();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new an(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ao> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ao.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getAlert() {
        return this.alert_;
    }

    public boolean getBadge() {
        return this.badge_;
    }

    public boolean getNotificationCenter() {
        return this.notificationCenter_;
    }

    public boolean getOnLock() {
        return this.onLock_;
    }

    public boolean getSound() {
        return this.sound_;
    }

    public boolean hasAlert() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasBadge() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasNotificationCenter() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasOnLock() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasSound() {
        return (this.bitField0_ & 4) != 0;
    }

    public static an newBuilder(ao aoVar) {
        return (an) DEFAULT_INSTANCE.createBuilder(aoVar);
    }

    public static ao parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ao) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ao parseFrom(com.google.v.v vVar, de deVar) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ao parseFrom(com.google.v.z zVar) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ao parseFrom(com.google.v.z zVar, de deVar) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ao parseFrom(InputStream inputStream) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ao parseFrom(InputStream inputStream, de deVar) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ao parseFrom(ByteBuffer byteBuffer) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ao parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ao parseFrom(byte[] bArr) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ao parseFrom(byte[] bArr, de deVar) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
