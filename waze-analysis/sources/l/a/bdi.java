package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bdi extends com.google.v.du<bdi, bdh> implements com.google.v.fj {
    private static final bdi DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bdi> PARSER = null;
    public static final int SHARE_CLICK_INFORMATION_FIELD_NUMBER = 1;
    private int bitField0_;
    private bce shareClickInformation_;

    static {
        bdi bdiVar = new bdi();
        DEFAULT_INSTANCE = bdiVar;
        com.google.v.du.registerDefaultInstance(bdi.class, bdiVar);
    }

    private bdi() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShareClickInformation() {
        this.shareClickInformation_ = null;
        this.bitField0_ &= -2;
    }

    public static bdi getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeShareClickInformation(bce bceVar) {
        Objects.requireNonNull(bceVar);
        bce bceVar2 = this.shareClickInformation_;
        if (bceVar2 != null && bceVar2 != bce.getDefaultInstance()) {
            bcd bcdVarNewBuilder = bce.newBuilder(bceVar2);
            bcdVarNewBuilder.mergeFrom((bcd) bceVar);
            bceVar = bcdVarNewBuilder.buildPartial();
        }
        this.shareClickInformation_ = bceVar;
        this.bitField0_ |= 1;
    }

    public static bdh newBuilder() {
        return (bdh) DEFAULT_INSTANCE.createBuilder();
    }

    public static bdi parseDelimitedFrom(InputStream inputStream) {
        return (bdi) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bdi parseFrom(com.google.v.v vVar) {
        return (bdi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bdi> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShareClickInformation(bce bceVar) {
        Objects.requireNonNull(bceVar);
        this.shareClickInformation_ = bceVar;
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "shareClickInformation_"});
        }
        if (iOrdinal == 3) {
            return new bdi();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bdh(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bdi> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bdi.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bce getShareClickInformation() {
        bce bceVar = this.shareClickInformation_;
        return bceVar == null ? bce.getDefaultInstance() : bceVar;
    }

    public boolean hasShareClickInformation() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bdh newBuilder(bdi bdiVar) {
        return (bdh) DEFAULT_INSTANCE.createBuilder(bdiVar);
    }

    public static bdi parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bdi) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bdi parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bdi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bdi parseFrom(com.google.v.z zVar) {
        return (bdi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bdi parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bdi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bdi parseFrom(InputStream inputStream) {
        return (bdi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bdi parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bdi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bdi parseFrom(ByteBuffer byteBuffer) {
        return (bdi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bdi parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bdi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bdi parseFrom(byte[] bArr) {
        return (bdi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bdi parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bdi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
