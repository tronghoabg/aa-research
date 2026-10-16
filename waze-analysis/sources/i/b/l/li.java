package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class li extends com.google.v.du<li, lh> implements com.google.v.fj {
    private static final li DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<li> PARSER = null;
    public static final int VENUE_FIELD_NUMBER = 1;
    private int bitField0_;
    private byte memoizedIsInitialized = 2;
    private i.b.v.ef venue_;

    static {
        li liVar = new li();
        DEFAULT_INSTANCE = liVar;
        com.google.v.du.registerDefaultInstance(li.class, liVar);
    }

    private li() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenue() {
        this.venue_ = null;
        this.bitField0_ &= -2;
    }

    public static li getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVenue(i.b.v.ef efVar) {
        Objects.requireNonNull(efVar);
        i.b.v.ef efVar2 = this.venue_;
        if (efVar2 != null && efVar2 != i.b.v.ef.getDefaultInstance()) {
            i.b.v.eb ebVarNewBuilder = i.b.v.ef.newBuilder(efVar2);
            ebVarNewBuilder.mergeFrom((i.b.v.eb) efVar);
            efVar = ebVarNewBuilder.buildPartial();
        }
        this.venue_ = efVar;
        this.bitField0_ |= 1;
    }

    public static lh newBuilder() {
        return (lh) DEFAULT_INSTANCE.createBuilder();
    }

    public static li parseDelimitedFrom(InputStream inputStream) {
        return (li) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static li parseFrom(com.google.v.v vVar) {
        return (li) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<li> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenue(i.b.v.ef efVar) {
        Objects.requireNonNull(efVar);
        this.venue_ = efVar;
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        byte[] bArr = null;
        switch (dtVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"bitField0_", "venue_"});
            case 3:
                return new li();
            case 4:
                return new lh(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<li> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (li.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            default:
                throw null;
        }
    }

    public i.b.v.ef getVenue() {
        i.b.v.ef efVar = this.venue_;
        return efVar == null ? i.b.v.ef.getDefaultInstance() : efVar;
    }

    public boolean hasVenue() {
        return (this.bitField0_ & 1) != 0;
    }

    public static lh newBuilder(li liVar) {
        return (lh) DEFAULT_INSTANCE.createBuilder(liVar);
    }

    public static li parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (li) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static li parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (li) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static li parseFrom(com.google.v.z zVar) {
        return (li) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static li parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (li) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static li parseFrom(InputStream inputStream) {
        return (li) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static li parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (li) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static li parseFrom(ByteBuffer byteBuffer) {
        return (li) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static li parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (li) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static li parseFrom(byte[] bArr) {
        return (li) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static li parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (li) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
