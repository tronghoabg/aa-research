package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class mm extends com.google.v.du<mm, ml> implements com.google.v.fj {
    private static final mm DEFAULT_INSTANCE;
    public static final int DISTANCE_TO_DESTINATION_METERS_FIELD_NUMBER = 4;
    public static final int DOMINANT_CLOSURE_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<mm> PARSER = null;
    public static final int TYPICAL_TIME_TO_DESTINATION_MINUTES_FIELD_NUMBER = 3;
    private int bitField0_;
    private int distanceToDestinationMeters_;
    private ln dominantClosure_;
    private String name_ = "unreachable_destination";
    private int typicalTimeToDestinationMinutes_;

    static {
        mm mmVar = new mm();
        DEFAULT_INSTANCE = mmVar;
        com.google.v.du.registerDefaultInstance(mm.class, mmVar);
    }

    private mm() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDistanceToDestinationMeters() {
        this.bitField0_ &= -9;
        this.distanceToDestinationMeters_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDominantClosure() {
        this.dominantClosure_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -2;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTypicalTimeToDestinationMinutes() {
        this.bitField0_ &= -5;
        this.typicalTimeToDestinationMinutes_ = 0;
    }

    public static mm getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDominantClosure(ln lnVar) {
        Objects.requireNonNull(lnVar);
        ln lnVar2 = this.dominantClosure_;
        if (lnVar2 != null && lnVar2 != ln.getDefaultInstance()) {
            lm lmVarNewBuilder = ln.newBuilder(lnVar2);
            lmVarNewBuilder.mergeFrom((lm) lnVar);
            lnVar = lmVarNewBuilder.buildPartial();
        }
        this.dominantClosure_ = lnVar;
        this.bitField0_ |= 2;
    }

    public static ml newBuilder() {
        return (ml) DEFAULT_INSTANCE.createBuilder();
    }

    public static mm parseDelimitedFrom(InputStream inputStream) {
        return (mm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static mm parseFrom(com.google.v.v vVar) {
        return (mm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<mm> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDistanceToDestinationMeters(int i2) {
        this.bitField0_ |= 8;
        this.distanceToDestinationMeters_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDominantClosure(ln lnVar) {
        Objects.requireNonNull(lnVar);
        this.dominantClosure_ = lnVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(com.google.v.v vVar) {
        this.name_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypicalTimeToDestinationMinutes(int i2) {
        this.bitField0_ |= 4;
        this.typicalTimeToDestinationMinutes_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"bitField0_", "name_", "dominantClosure_", "typicalTimeToDestinationMinutes_", "distanceToDestinationMeters_"});
        }
        if (iOrdinal == 3) {
            return new mm();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ml(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<mm> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (mm.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getDistanceToDestinationMeters() {
        return this.distanceToDestinationMeters_;
    }

    public ln getDominantClosure() {
        ln lnVar = this.dominantClosure_;
        return lnVar == null ? ln.getDefaultInstance() : lnVar;
    }

    public String getName() {
        return this.name_;
    }

    public com.google.v.v getNameBytes() {
        return com.google.v.v.s(this.name_);
    }

    public int getTypicalTimeToDestinationMinutes() {
        return this.typicalTimeToDestinationMinutes_;
    }

    public boolean hasDistanceToDestinationMeters() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasDominantClosure() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasTypicalTimeToDestinationMinutes() {
        return (this.bitField0_ & 4) != 0;
    }

    public static ml newBuilder(mm mmVar) {
        return (ml) DEFAULT_INSTANCE.createBuilder(mmVar);
    }

    public static mm parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (mm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static mm parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (mm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static mm parseFrom(com.google.v.z zVar) {
        return (mm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static mm parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (mm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static mm parseFrom(InputStream inputStream) {
        return (mm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static mm parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (mm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static mm parseFrom(ByteBuffer byteBuffer) {
        return (mm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static mm parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (mm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static mm parseFrom(byte[] bArr) {
        return (mm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static mm parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (mm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
