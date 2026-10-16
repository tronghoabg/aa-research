package i.b.i;

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
/* loaded from: classes7.dex */
public final class ai extends du<ai, ah> implements fj {
    private static final ai DEFAULT_INSTANCE;
    private static volatile fo<ai> PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    public static final int USER_ID_FIELD_NUMBER = 2;
    private int bitField0_;
    private ad preferences_;
    private long userId_;

    static {
        ai aiVar = new ai();
        DEFAULT_INSTANCE = aiVar;
        du.registerDefaultInstance(ai.class, aiVar);
    }

    private ai() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreferences() {
        this.preferences_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserId() {
        this.bitField0_ &= -3;
        this.userId_ = 0L;
    }

    public static ai getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePreferences(ad adVar) {
        Objects.requireNonNull(adVar);
        ad adVar2 = this.preferences_;
        if (adVar2 != null && adVar2 != ad.getDefaultInstance()) {
            ac acVarNewBuilder = ad.newBuilder(adVar2);
            acVarNewBuilder.mergeFrom((ac) adVar);
            adVar = acVarNewBuilder.buildPartial();
        }
        this.preferences_ = adVar;
        this.bitField0_ |= 1;
    }

    public static ah newBuilder() {
        return (ah) DEFAULT_INSTANCE.createBuilder();
    }

    public static ai parseDelimitedFrom(InputStream inputStream) {
        return (ai) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ai parseFrom(com.google.v.v vVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ai> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreferences(ad adVar) {
        Objects.requireNonNull(adVar);
        this.preferences_ = adVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserId(long j2) {
        this.bitField0_ |= 2;
        this.userId_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"bitField0_", "preferences_", "userId_"});
        }
        if (iOrdinal == 3) {
            return new ai();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ah(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ai> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ai.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ad getPreferences() {
        ad adVar = this.preferences_;
        return adVar == null ? ad.getDefaultInstance() : adVar;
    }

    public long getUserId() {
        return this.userId_;
    }

    public boolean hasPreferences() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasUserId() {
        return (this.bitField0_ & 2) != 0;
    }

    public static ah newBuilder(ai aiVar) {
        return (ah) DEFAULT_INSTANCE.createBuilder(aiVar);
    }

    public static ai parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ai) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ai parseFrom(com.google.v.v vVar, de deVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ai parseFrom(com.google.v.z zVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ai parseFrom(com.google.v.z zVar, de deVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ai parseFrom(InputStream inputStream) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ai parseFrom(InputStream inputStream, de deVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ai parseFrom(ByteBuffer byteBuffer) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ai parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ai parseFrom(byte[] bArr) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ai parseFrom(byte[] bArr, de deVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
