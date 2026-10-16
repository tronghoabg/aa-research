package i.b.n.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class av extends du<av, au> implements fj {
    private static final av DEFAULT_INSTANCE;
    private static volatile fo<av> PARSER = null;
    public static final int WALKING_DISTANCE_METERS_FIELD_NUMBER = 1;
    public static final int WALKING_MINUTES_FIELD_NUMBER = 2;
    private int bitField0_;
    private int walkingDistanceMeters_;
    private int walkingMinutes_;

    static {
        av avVar = new av();
        DEFAULT_INSTANCE = avVar;
        du.registerDefaultInstance(av.class, avVar);
    }

    private av() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWalkingDistanceMeters() {
        this.bitField0_ &= -2;
        this.walkingDistanceMeters_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWalkingMinutes() {
        this.bitField0_ &= -3;
        this.walkingMinutes_ = 0;
    }

    public static av getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static au newBuilder() {
        return (au) DEFAULT_INSTANCE.createBuilder();
    }

    public static av parseDelimitedFrom(InputStream inputStream) {
        return (av) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static av parseFrom(com.google.v.v vVar) {
        return (av) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<av> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWalkingDistanceMeters(int i2) {
        this.bitField0_ |= 1;
        this.walkingDistanceMeters_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWalkingMinutes(int i2) {
        this.bitField0_ |= 2;
        this.walkingMinutes_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"bitField0_", "walkingDistanceMeters_", "walkingMinutes_"});
        }
        if (iOrdinal == 3) {
            return new av();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new au(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<av> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (av.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getWalkingDistanceMeters() {
        return this.walkingDistanceMeters_;
    }

    public int getWalkingMinutes() {
        return this.walkingMinutes_;
    }

    public boolean hasWalkingDistanceMeters() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasWalkingMinutes() {
        return (this.bitField0_ & 2) != 0;
    }

    public static au newBuilder(av avVar) {
        return (au) DEFAULT_INSTANCE.createBuilder(avVar);
    }

    public static av parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (av) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static av parseFrom(com.google.v.v vVar, de deVar) {
        return (av) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static av parseFrom(com.google.v.z zVar) {
        return (av) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static av parseFrom(com.google.v.z zVar, de deVar) {
        return (av) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static av parseFrom(InputStream inputStream) {
        return (av) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static av parseFrom(InputStream inputStream, de deVar) {
        return (av) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static av parseFrom(ByteBuffer byteBuffer) {
        return (av) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static av parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (av) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static av parseFrom(byte[] bArr) {
        return (av) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static av parseFrom(byte[] bArr, de deVar) {
        return (av) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
