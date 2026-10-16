package i.b.q;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class w extends du<w, v> implements fj {
    private static final w DEFAULT_INSTANCE;
    private static volatile fo<w> PARSER = null;
    public static final int USERINFO_FIELD_NUMBER = 2;
    public static final int USERLOCATION_FIELD_NUMBER = 1;
    public static final int USERSETTINGS_FIELD_NUMBER = 3;
    private int bitField0_;
    private ao userInfo_;
    private e userLocation_;
    private aq userSettings_;

    static {
        w wVar = new w();
        DEFAULT_INSTANCE = wVar;
        du.registerDefaultInstance(w.class, wVar);
    }

    private w() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserInfo() {
        this.userInfo_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserLocation() {
        this.userLocation_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserSettings() {
        this.userSettings_ = null;
        this.bitField0_ &= -5;
    }

    public static w getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserInfo(ao aoVar) {
        Objects.requireNonNull(aoVar);
        ao aoVar2 = this.userInfo_;
        if (aoVar2 != null && aoVar2 != ao.getDefaultInstance()) {
            an anVarNewBuilder = ao.newBuilder(aoVar2);
            anVarNewBuilder.mergeFrom((an) aoVar);
            aoVar = anVarNewBuilder.buildPartial();
        }
        this.userInfo_ = aoVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserLocation(e eVar) {
        Objects.requireNonNull(eVar);
        e eVar2 = this.userLocation_;
        if (eVar2 != null && eVar2 != e.getDefaultInstance()) {
            d dVarNewBuilder = e.newBuilder(eVar2);
            dVarNewBuilder.mergeFrom((d) eVar);
            eVar = dVarNewBuilder.buildPartial();
        }
        this.userLocation_ = eVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserSettings(aq aqVar) {
        Objects.requireNonNull(aqVar);
        aq aqVar2 = this.userSettings_;
        if (aqVar2 != null && aqVar2 != aq.getDefaultInstance()) {
            ap apVarNewBuilder = aq.newBuilder(aqVar2);
            apVarNewBuilder.mergeFrom((ap) aqVar);
            aqVar = apVarNewBuilder.buildPartial();
        }
        this.userSettings_ = aqVar;
        this.bitField0_ |= 4;
    }

    public static v newBuilder() {
        return (v) DEFAULT_INSTANCE.createBuilder();
    }

    public static w parseDelimitedFrom(InputStream inputStream) {
        return (w) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static w parseFrom(com.google.v.v vVar) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<w> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserInfo(ao aoVar) {
        Objects.requireNonNull(aoVar);
        this.userInfo_ = aoVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserLocation(e eVar) {
        Objects.requireNonNull(eVar);
        this.userLocation_ = eVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserSettings(aq aqVar) {
        Objects.requireNonNull(aqVar);
        this.userSettings_ = aqVar;
        this.bitField0_ |= 4;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "userLocation_", "userInfo_", "userSettings_"});
        }
        if (iOrdinal == 3) {
            return new w();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new v(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<w> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (w.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ao getUserInfo() {
        ao aoVar = this.userInfo_;
        return aoVar == null ? ao.getDefaultInstance() : aoVar;
    }

    public e getUserLocation() {
        e eVar = this.userLocation_;
        return eVar == null ? e.getDefaultInstance() : eVar;
    }

    public aq getUserSettings() {
        aq aqVar = this.userSettings_;
        return aqVar == null ? aq.getDefaultInstance() : aqVar;
    }

    public boolean hasUserInfo() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasUserLocation() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasUserSettings() {
        return (this.bitField0_ & 4) != 0;
    }

    public static v newBuilder(w wVar) {
        return (v) DEFAULT_INSTANCE.createBuilder(wVar);
    }

    public static w parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (w) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static w parseFrom(com.google.v.v vVar, de deVar) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static w parseFrom(com.google.v.z zVar) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static w parseFrom(com.google.v.z zVar, de deVar) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static w parseFrom(InputStream inputStream) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static w parseFrom(InputStream inputStream, de deVar) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static w parseFrom(ByteBuffer byteBuffer) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static w parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static w parseFrom(byte[] bArr) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static w parseFrom(byte[] bArr, de deVar) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
