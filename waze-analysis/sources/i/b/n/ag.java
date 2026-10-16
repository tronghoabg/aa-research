package i.b.n;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import i.b.v.aj;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ag extends du<ag, af> implements fj {
    public static final int AVAILABILITY_UPDATE_DURING_LAST_MILLIS_FIELD_NUMBER = 3;
    private static final ag DEFAULT_INSTANCE;
    private static volatile fo<ag> PARSER = null;
    public static final int REQUIRE_EV_AVAILABILITY_FIELD_NUMBER = 2;
    public static final int REQUIRE_EV_CHARGING_PORT_FIELD_NUMBER = 1;
    private int availabilityUpdateDuringLastMillis_;
    private int bitField0_;
    private aj requireEvAvailability_;
    private aj requireEvChargingPort_;

    static {
        ag agVar = new ag();
        DEFAULT_INSTANCE = agVar;
        du.registerDefaultInstance(ag.class, agVar);
    }

    private ag() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvailabilityUpdateDuringLastMillis() {
        this.bitField0_ &= -5;
        this.availabilityUpdateDuringLastMillis_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequireEvAvailability() {
        this.requireEvAvailability_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequireEvChargingPort() {
        this.requireEvChargingPort_ = null;
        this.bitField0_ &= -2;
    }

    public static ag getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRequireEvAvailability(aj ajVar) {
        Objects.requireNonNull(ajVar);
        aj ajVar2 = this.requireEvAvailability_;
        if (ajVar2 != null && ajVar2 != aj.getDefaultInstance()) {
            i.b.v.ai aiVarNewBuilder = aj.newBuilder(ajVar2);
            aiVarNewBuilder.mergeFrom((i.b.v.ai) ajVar);
            ajVar = aiVarNewBuilder.buildPartial();
        }
        this.requireEvAvailability_ = ajVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRequireEvChargingPort(aj ajVar) {
        Objects.requireNonNull(ajVar);
        aj ajVar2 = this.requireEvChargingPort_;
        if (ajVar2 != null && ajVar2 != aj.getDefaultInstance()) {
            i.b.v.ai aiVarNewBuilder = aj.newBuilder(ajVar2);
            aiVarNewBuilder.mergeFrom((i.b.v.ai) ajVar);
            ajVar = aiVarNewBuilder.buildPartial();
        }
        this.requireEvChargingPort_ = ajVar;
        this.bitField0_ |= 1;
    }

    public static af newBuilder() {
        return (af) DEFAULT_INSTANCE.createBuilder();
    }

    public static ag parseDelimitedFrom(InputStream inputStream) {
        return (ag) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ag parseFrom(com.google.v.v vVar) {
        return (ag) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ag> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvailabilityUpdateDuringLastMillis(int i2) {
        this.bitField0_ |= 4;
        this.availabilityUpdateDuringLastMillis_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequireEvAvailability(aj ajVar) {
        Objects.requireNonNull(ajVar);
        this.requireEvAvailability_ = ajVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequireEvChargingPort(aj ajVar) {
        Objects.requireNonNull(ajVar);
        this.requireEvChargingPort_ = ajVar;
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003င\u0002", new Object[]{"bitField0_", "requireEvChargingPort_", "requireEvAvailability_", "availabilityUpdateDuringLastMillis_"});
        }
        if (iOrdinal == 3) {
            return new ag();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new af(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ag> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ag.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Deprecated
    public int getAvailabilityUpdateDuringLastMillis() {
        return this.availabilityUpdateDuringLastMillis_;
    }

    @Deprecated
    public aj getRequireEvAvailability() {
        aj ajVar = this.requireEvAvailability_;
        return ajVar == null ? aj.getDefaultInstance() : ajVar;
    }

    @Deprecated
    public aj getRequireEvChargingPort() {
        aj ajVar = this.requireEvChargingPort_;
        return ajVar == null ? aj.getDefaultInstance() : ajVar;
    }

    @Deprecated
    public boolean hasAvailabilityUpdateDuringLastMillis() {
        return (this.bitField0_ & 4) != 0;
    }

    @Deprecated
    public boolean hasRequireEvAvailability() {
        return (this.bitField0_ & 2) != 0;
    }

    @Deprecated
    public boolean hasRequireEvChargingPort() {
        return (this.bitField0_ & 1) != 0;
    }

    public static af newBuilder(ag agVar) {
        return (af) DEFAULT_INSTANCE.createBuilder(agVar);
    }

    public static ag parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ag) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ag parseFrom(com.google.v.v vVar, de deVar) {
        return (ag) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ag parseFrom(com.google.v.z zVar) {
        return (ag) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ag parseFrom(com.google.v.z zVar, de deVar) {
        return (ag) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ag parseFrom(InputStream inputStream) {
        return (ag) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ag parseFrom(InputStream inputStream, de deVar) {
        return (ag) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ag parseFrom(ByteBuffer byteBuffer) {
        return (ag) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ag parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ag) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ag parseFrom(byte[] bArr) {
        return (ag) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ag parseFrom(byte[] bArr, de deVar) {
        return (ag) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
