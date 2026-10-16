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
public final class h extends du<h, g> implements fj {
    public static final int CLIENT_PIN_ID_FIELD_NUMBER = 1;
    private static final h DEFAULT_INSTANCE;
    public static final int IS_PROMOTIONED_FIELD_NUMBER = 3;
    private static volatile fo<h> PARSER = null;
    public static final int PIN_FIELD_NUMBER = 2;
    private int bitField0_;
    private int clientPinId_;
    private int isPromotioned_;
    private d pin_;

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        du.registerDefaultInstance(h.class, hVar);
    }

    private h() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientPinId() {
        this.bitField0_ &= -2;
        this.clientPinId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsPromotioned() {
        this.bitField0_ &= -5;
        this.isPromotioned_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPin() {
        this.pin_ = null;
        this.bitField0_ &= -3;
    }

    public static h getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePin(d dVar) {
        Objects.requireNonNull(dVar);
        d dVar2 = this.pin_;
        if (dVar2 != null && dVar2 != d.getDefaultInstance()) {
            c cVarNewBuilder = d.newBuilder(dVar2);
            cVarNewBuilder.mergeFrom((c) dVar);
            dVar = cVarNewBuilder.buildPartial();
        }
        this.pin_ = dVar;
        this.bitField0_ |= 2;
    }

    public static g newBuilder() {
        return (g) DEFAULT_INSTANCE.createBuilder();
    }

    public static h parseDelimitedFrom(InputStream inputStream) {
        return (h) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static h parseFrom(v vVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<h> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientPinId(int i2) {
        this.bitField0_ |= 1;
        this.clientPinId_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsPromotioned(int i2) {
        this.bitField0_ |= 4;
        this.isPromotioned_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPin(d dVar) {
        Objects.requireNonNull(dVar);
        this.pin_ = dVar;
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003င\u0002", new Object[]{"bitField0_", "clientPinId_", "pin_", "isPromotioned_"});
        }
        if (iOrdinal == 3) {
            return new h();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new g(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<h> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (h.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getClientPinId() {
        return this.clientPinId_;
    }

    public int getIsPromotioned() {
        return this.isPromotioned_;
    }

    public d getPin() {
        d dVar = this.pin_;
        return dVar == null ? d.getDefaultInstance() : dVar;
    }

    public boolean hasClientPinId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasIsPromotioned() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasPin() {
        return (this.bitField0_ & 2) != 0;
    }

    public static g newBuilder(h hVar) {
        return (g) DEFAULT_INSTANCE.createBuilder(hVar);
    }

    public static h parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (h) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static h parseFrom(v vVar, de deVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static h parseFrom(z zVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static h parseFrom(z zVar, de deVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static h parseFrom(InputStream inputStream) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static h parseFrom(InputStream inputStream, de deVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static h parseFrom(ByteBuffer byteBuffer) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static h parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static h parseFrom(byte[] bArr) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static h parseFrom(byte[] bArr, de deVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
