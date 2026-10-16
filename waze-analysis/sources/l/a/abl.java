package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class abl extends com.google.v.du<abl, abk> implements com.google.v.fj {
    private static final abl DEFAULT_INSTANCE;
    public static final int HOV_MINIMUM_PASSENGERS_FIELD_NUMBER = 1;
    public static final int HOV_SAVING_MINUTES_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<abl> PARSER;
    private int bitField0_;
    private long hovMinimumPassengers_;
    private long hovSavingMinutes_;

    static {
        abl ablVar = new abl();
        DEFAULT_INSTANCE = ablVar;
        com.google.v.du.registerDefaultInstance(abl.class, ablVar);
    }

    private abl() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHovMinimumPassengers() {
        this.bitField0_ &= -2;
        this.hovMinimumPassengers_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHovSavingMinutes() {
        this.bitField0_ &= -3;
        this.hovSavingMinutes_ = 0L;
    }

    public static abl getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static abk newBuilder() {
        return (abk) DEFAULT_INSTANCE.createBuilder();
    }

    public static abl parseDelimitedFrom(InputStream inputStream) {
        return (abl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static abl parseFrom(com.google.v.v vVar) {
        return (abl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<abl> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHovMinimumPassengers(long j2) {
        this.bitField0_ |= 1;
        this.hovMinimumPassengers_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHovSavingMinutes(long j2) {
        this.bitField0_ |= 2;
        this.hovSavingMinutes_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"bitField0_", "hovMinimumPassengers_", "hovSavingMinutes_"});
        }
        if (iOrdinal == 3) {
            return new abl();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new abk(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<abl> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (abl.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getHovMinimumPassengers() {
        return this.hovMinimumPassengers_;
    }

    public long getHovSavingMinutes() {
        return this.hovSavingMinutes_;
    }

    public boolean hasHovMinimumPassengers() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasHovSavingMinutes() {
        return (this.bitField0_ & 2) != 0;
    }

    public static abk newBuilder(abl ablVar) {
        return (abk) DEFAULT_INSTANCE.createBuilder(ablVar);
    }

    public static abl parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (abl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static abl parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (abl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static abl parseFrom(com.google.v.z zVar) {
        return (abl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static abl parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (abl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static abl parseFrom(InputStream inputStream) {
        return (abl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static abl parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (abl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static abl parseFrom(ByteBuffer byteBuffer) {
        return (abl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static abl parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (abl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static abl parseFrom(byte[] bArr) {
        return (abl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static abl parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (abl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
