package i.b.l;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class mu extends com.google.v.du<mu, ms> implements mv {
    public static final int ARRIVAL_EPOCH_SECONDS_FIELD_NUMBER = 2;
    private static final mu DEFAULT_INSTANCE;
    public static final int DEPARTURE_EPOCH_SECONDS_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<mu> PARSER;
    private int constraintCase_ = 0;
    private Object constraint_;

    static {
        mu muVar = new mu();
        DEFAULT_INSTANCE = muVar;
        com.google.v.du.registerDefaultInstance(mu.class, muVar);
    }

    private mu() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearArrivalEpochSeconds() {
        if (this.constraintCase_ == 2) {
            this.constraintCase_ = 0;
            this.constraint_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConstraint() {
        this.constraintCase_ = 0;
        this.constraint_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDepartureEpochSeconds() {
        if (this.constraintCase_ == 1) {
            this.constraintCase_ = 0;
            this.constraint_ = null;
        }
    }

    public static mu getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ms newBuilder() {
        return (ms) DEFAULT_INSTANCE.createBuilder();
    }

    public static mu parseDelimitedFrom(InputStream inputStream) {
        return (mu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static mu parseFrom(com.google.v.v vVar) {
        return (mu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<mu> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setArrivalEpochSeconds(long j2) {
        this.constraintCase_ = 2;
        this.constraint_ = Long.valueOf(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDepartureEpochSeconds(long j2) {
        this.constraintCase_ = 1;
        this.constraint_ = Long.valueOf(j2);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u00015\u0000\u00025\u0000", new Object[]{"constraint_", "constraintCase_"});
        }
        if (iOrdinal == 3) {
            return new mu();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ms(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<mu> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (mu.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getArrivalEpochSeconds() {
        if (this.constraintCase_ == 2) {
            return ((Long) this.constraint_).longValue();
        }
        return 0L;
    }

    public mt getConstraintCase() {
        int i2 = this.constraintCase_;
        if (i2 == 0) {
            return mt.f48907c;
        }
        if (i2 == 1) {
            return mt.f48905a;
        }
        if (i2 != 2) {
            return null;
        }
        return mt.f48906b;
    }

    public long getDepartureEpochSeconds() {
        if (this.constraintCase_ == 1) {
            return ((Long) this.constraint_).longValue();
        }
        return 0L;
    }

    public boolean hasArrivalEpochSeconds() {
        return this.constraintCase_ == 2;
    }

    public boolean hasDepartureEpochSeconds() {
        return this.constraintCase_ == 1;
    }

    public static ms newBuilder(mu muVar) {
        return (ms) DEFAULT_INSTANCE.createBuilder(muVar);
    }

    public static mu parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (mu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static mu parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (mu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static mu parseFrom(com.google.v.z zVar) {
        return (mu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static mu parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (mu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static mu parseFrom(InputStream inputStream) {
        return (mu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static mu parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (mu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static mu parseFrom(ByteBuffer byteBuffer) {
        return (mu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static mu parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (mu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static mu parseFrom(byte[] bArr) {
        return (mu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static mu parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (mu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
