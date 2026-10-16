package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aez extends com.google.v.du<aez, aew> implements com.google.v.fj {
    private static final aez DEFAULT_INSTANCE;
    public static final int IS_NEW_DRIVER_FIELD_NUMBER = 1;
    public static final int LOADER_DISPLAY_DURATION_MILLISECONDS_FIELD_NUMBER = 3;
    public static final int LOADER_MESSAGES_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<aez> PARSER = null;
    public static final int TRIGGER_EVENT_FIELD_NUMBER = 4;
    public static final int VEHICLE_TYPE_FIELD_NUMBER = 5;
    private int bitField0_;
    private boolean isNewDriver_;
    private float loaderDisplayDurationMilliseconds_;
    private com.google.v.eo<String> loaderMessages_ = emptyProtobufList();
    private int triggerEvent_;
    private int vehicleType_;

    static {
        aez aezVar = new aez();
        DEFAULT_INSTANCE = aezVar;
        com.google.v.du.registerDefaultInstance(aez.class, aezVar);
    }

    private aez() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLoaderMessages(Iterable<String> iterable) {
        ensureLoaderMessagesIsMutable();
        com.google.v.c.addAll(iterable, this.loaderMessages_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLoaderMessages(String str) {
        Objects.requireNonNull(str);
        ensureLoaderMessagesIsMutable();
        this.loaderMessages_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLoaderMessagesBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        ensureLoaderMessagesIsMutable();
        this.loaderMessages_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsNewDriver() {
        this.bitField0_ &= -2;
        this.isNewDriver_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLoaderDisplayDurationMilliseconds() {
        this.bitField0_ &= -3;
        this.loaderDisplayDurationMilliseconds_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLoaderMessages() {
        this.loaderMessages_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTriggerEvent() {
        this.bitField0_ &= -5;
        this.triggerEvent_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVehicleType() {
        this.bitField0_ &= -9;
        this.vehicleType_ = 0;
    }

    private void ensureLoaderMessagesIsMutable() {
        com.google.v.eo<String> eoVar = this.loaderMessages_;
        if (eoVar.c()) {
            return;
        }
        this.loaderMessages_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static aez getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static aew newBuilder() {
        return (aew) DEFAULT_INSTANCE.createBuilder();
    }

    public static aez parseDelimitedFrom(InputStream inputStream) {
        return (aez) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aez parseFrom(com.google.v.v vVar) {
        return (aez) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aez> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsNewDriver(boolean z) {
        this.bitField0_ |= 1;
        this.isNewDriver_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLoaderDisplayDurationMilliseconds(float f2) {
        this.bitField0_ |= 2;
        this.loaderDisplayDurationMilliseconds_ = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLoaderMessages(int i2, String str) {
        Objects.requireNonNull(str);
        ensureLoaderMessagesIsMutable();
        this.loaderMessages_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTriggerEvent(aex aexVar) {
        this.triggerEvent_ = aexVar.getNumber();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTriggerEventValue(int i2) {
        this.bitField0_ |= 4;
        this.triggerEvent_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVehicleType(aey aeyVar) {
        this.vehicleType_ = aeyVar.getNumber();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVehicleTypeValue(int i2) {
        this.bitField0_ |= 8;
        this.vehicleType_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဇ\u0000\u0002Ț\u0003ခ\u0001\u0004ဌ\u0002\u0005ဌ\u0003", new Object[]{"bitField0_", "isNewDriver_", "loaderMessages_", "loaderDisplayDurationMilliseconds_", "triggerEvent_", "vehicleType_"});
        }
        if (iOrdinal == 3) {
            return new aez();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aew(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aez> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aez.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getIsNewDriver() {
        return this.isNewDriver_;
    }

    public float getLoaderDisplayDurationMilliseconds() {
        return this.loaderDisplayDurationMilliseconds_;
    }

    public String getLoaderMessages(int i2) {
        return this.loaderMessages_.get(i2);
    }

    public com.google.v.v getLoaderMessagesBytes(int i2) {
        return com.google.v.v.s(this.loaderMessages_.get(i2));
    }

    public int getLoaderMessagesCount() {
        return this.loaderMessages_.size();
    }

    public List<String> getLoaderMessagesList() {
        return this.loaderMessages_;
    }

    public aex getTriggerEvent() {
        int i2 = this.triggerEvent_;
        aex aexVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? null : aex.RECALCULATION_AFTER_ENDPOINT_EDIT : aex.RECALCULATION_AFTER_PREFERENCE_CHANGE : aex.RECALCULATION_AFTER_VEHICLE_TYPE_CHANGE : aex.INITIAL_LOADING : aex.TRIGGER_EVENT_UNSPECIFIED;
        return aexVar == null ? aex.UNRECOGNIZED : aexVar;
    }

    public int getTriggerEventValue() {
        return this.triggerEvent_;
    }

    public aey getVehicleType() {
        int i2 = this.vehicleType_;
        aey aeyVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : aey.TAXI : aey.MOTORCYCLE : aey.PRIVATE : aey.VEHICLE_TYPE_UNSPECIFIED;
        return aeyVar == null ? aey.UNRECOGNIZED : aeyVar;
    }

    public int getVehicleTypeValue() {
        return this.vehicleType_;
    }

    public boolean hasIsNewDriver() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasLoaderDisplayDurationMilliseconds() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasTriggerEvent() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasVehicleType() {
        return (this.bitField0_ & 8) != 0;
    }

    public static aew newBuilder(aez aezVar) {
        return (aew) DEFAULT_INSTANCE.createBuilder(aezVar);
    }

    public static aez parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aez) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aez parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aez) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aez parseFrom(com.google.v.z zVar) {
        return (aez) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aez parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aez) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aez parseFrom(InputStream inputStream) {
        return (aez) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aez parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aez) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aez parseFrom(ByteBuffer byteBuffer) {
        return (aez) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aez parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aez) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aez parseFrom(byte[] bArr) {
        return (aez) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aez parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aez) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
