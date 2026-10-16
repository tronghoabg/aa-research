package i.b.v;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class b extends com.google.v.du<b, a> implements c {
    public static final int DAY_FIELD_NUMBER = 1;
    private static final b DEFAULT_INSTANCE;
    public static final int FROM_MINUTES_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<b> PARSER = null;
    public static final int PERCENTAGEAVAILABLE_FIELD_NUMBER = 4;
    public static final int TO_MINUTES_FIELD_NUMBER = 3;
    private int bitField0_;
    private int day_;
    private int fromMinutes_;
    private int percentageAvailable_;
    private int toMinutes_;

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        com.google.v.du.registerDefaultInstance(b.class, bVar);
    }

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDay() {
        this.bitField0_ &= -2;
        this.day_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFromMinutes() {
        this.bitField0_ &= -3;
        this.fromMinutes_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPercentageAvailable() {
        this.bitField0_ &= -9;
        this.percentageAvailable_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToMinutes() {
        this.bitField0_ &= -5;
        this.toMinutes_ = 0;
    }

    public static b getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static b parseDelimitedFrom(InputStream inputStream) {
        return (b) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static b parseFrom(com.google.v.v vVar) {
        return (b) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<b> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDay(int i2) {
        this.bitField0_ |= 1;
        this.day_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromMinutes(int i2) {
        this.bitField0_ |= 2;
        this.fromMinutes_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPercentageAvailable(int i2) {
        this.bitField0_ |= 8;
        this.percentageAvailable_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToMinutes(int i2) {
        this.bitField0_ |= 4;
        this.toMinutes_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"bitField0_", "day_", "fromMinutes_", "toMinutes_", "percentageAvailable_"});
        }
        if (iOrdinal == 3) {
            return new b();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new a(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<b> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (b.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getDay() {
        return this.day_;
    }

    public int getFromMinutes() {
        return this.fromMinutes_;
    }

    public int getPercentageAvailable() {
        return this.percentageAvailable_;
    }

    public int getToMinutes() {
        return this.toMinutes_;
    }

    public boolean hasDay() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasFromMinutes() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasPercentageAvailable() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasToMinutes() {
        return (this.bitField0_ & 4) != 0;
    }

    public static a newBuilder(b bVar) {
        return (a) DEFAULT_INSTANCE.createBuilder(bVar);
    }

    public static b parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (b) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static b parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (b) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static b parseFrom(com.google.v.z zVar) {
        return (b) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static b parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (b) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static b parseFrom(InputStream inputStream) {
        return (b) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static b parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (b) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static b parseFrom(ByteBuffer byteBuffer) {
        return (b) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static b parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (b) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static b parseFrom(byte[] bArr) {
        return (b) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static b parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (b) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
