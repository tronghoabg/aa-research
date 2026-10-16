package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bck extends com.google.v.du<bck, bcj> implements com.google.v.fj {
    private static final bck DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bck> PARSER = null;
    public static final int SHARE_CLICK_INFORMATION_FIELD_NUMBER = 1;
    private int bitField0_;
    private bce shareClickInformation_;

    static {
        bck bckVar = new bck();
        DEFAULT_INSTANCE = bckVar;
        com.google.v.du.registerDefaultInstance(bck.class, bckVar);
    }

    private bck() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShareClickInformation() {
        this.shareClickInformation_ = null;
        this.bitField0_ &= -2;
    }

    public static bck getDefaultInstance() {
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

    public static bcj newBuilder() {
        return (bcj) DEFAULT_INSTANCE.createBuilder();
    }

    public static bck parseDelimitedFrom(InputStream inputStream) {
        return (bck) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bck parseFrom(com.google.v.v vVar) {
        return (bck) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bck> parser() {
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
            return new bck();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bcj(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bck> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bck.class) {
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

    public static bcj newBuilder(bck bckVar) {
        return (bcj) DEFAULT_INSTANCE.createBuilder(bckVar);
    }

    public static bck parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bck) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bck parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bck) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bck parseFrom(com.google.v.z zVar) {
        return (bck) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bck parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bck) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bck parseFrom(InputStream inputStream) {
        return (bck) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bck parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bck) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bck parseFrom(ByteBuffer byteBuffer) {
        return (bck) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bck parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bck) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bck parseFrom(byte[] bArr) {
        return (bck) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bck parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bck) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
