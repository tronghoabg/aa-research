package i.b.h;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class j extends du<j, i> implements fj {
    private static final j DEFAULT_INSTANCE;
    private static volatile fo<j> PARSER = null;
    public static final int PIN_TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private b pinType_;

    static {
        j jVar = new j();
        DEFAULT_INSTANCE = jVar;
        du.registerDefaultInstance(j.class, jVar);
    }

    private j() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPinType() {
        this.pinType_ = null;
        this.bitField0_ &= -2;
    }

    public static j getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePinType(b bVar) {
        Objects.requireNonNull(bVar);
        b bVar2 = this.pinType_;
        if (bVar2 != null && bVar2 != b.getDefaultInstance()) {
            a aVarNewBuilder = b.newBuilder(bVar2);
            aVarNewBuilder.mergeFrom((a) bVar);
            bVar = aVarNewBuilder.buildPartial();
        }
        this.pinType_ = bVar;
        this.bitField0_ |= 1;
    }

    public static i newBuilder() {
        return (i) DEFAULT_INSTANCE.createBuilder();
    }

    public static j parseDelimitedFrom(InputStream inputStream) {
        return (j) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static j parseFrom(v vVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<j> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPinType(b bVar) {
        Objects.requireNonNull(bVar);
        this.pinType_ = bVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "pinType_"});
        }
        if (iOrdinal == 3) {
            return new j();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new i(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<j> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (j.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public b getPinType() {
        b bVar = this.pinType_;
        return bVar == null ? b.getDefaultInstance() : bVar;
    }

    public boolean hasPinType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static i newBuilder(j jVar) {
        return (i) DEFAULT_INSTANCE.createBuilder(jVar);
    }

    public static j parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (j) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static j parseFrom(v vVar, de deVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static j parseFrom(z zVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static j parseFrom(z zVar, de deVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static j parseFrom(InputStream inputStream) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static j parseFrom(InputStream inputStream, de deVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static j parseFrom(ByteBuffer byteBuffer) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static j parseFrom(byte[] bArr) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static j parseFrom(byte[] bArr, de deVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
