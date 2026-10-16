package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ja extends com.google.v.du<ja, iz> implements com.google.v.fj {
    private static final ja DEFAULT_INSTANCE;
    public static final int HOME_FIELD_NUMBER = 1;
    public static final int NUM_FAVORITES_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<ja> PARSER = null;
    public static final int WORK_FIELD_NUMBER = 2;
    private int bitField0_;
    private i.b.e.l home_;
    private int numFavorites_;
    private i.b.e.l work_;

    static {
        ja jaVar = new ja();
        DEFAULT_INSTANCE = jaVar;
        com.google.v.du.registerDefaultInstance(ja.class, jaVar);
    }

    private ja() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHome() {
        this.home_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumFavorites() {
        this.bitField0_ &= -5;
        this.numFavorites_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWork() {
        this.work_ = null;
        this.bitField0_ &= -3;
    }

    public static ja getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHome(i.b.e.l lVar) {
        Objects.requireNonNull(lVar);
        i.b.e.l lVar2 = this.home_;
        if (lVar2 != null && lVar2 != i.b.e.l.getDefaultInstance()) {
            i.b.e.i iVarNewBuilder = i.b.e.l.newBuilder(lVar2);
            iVarNewBuilder.mergeFrom((i.b.e.i) lVar);
            lVar = iVarNewBuilder.buildPartial();
        }
        this.home_ = lVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWork(i.b.e.l lVar) {
        Objects.requireNonNull(lVar);
        i.b.e.l lVar2 = this.work_;
        if (lVar2 != null && lVar2 != i.b.e.l.getDefaultInstance()) {
            i.b.e.i iVarNewBuilder = i.b.e.l.newBuilder(lVar2);
            iVarNewBuilder.mergeFrom((i.b.e.i) lVar);
            lVar = iVarNewBuilder.buildPartial();
        }
        this.work_ = lVar;
        this.bitField0_ |= 2;
    }

    public static iz newBuilder() {
        return (iz) DEFAULT_INSTANCE.createBuilder();
    }

    public static ja parseDelimitedFrom(InputStream inputStream) {
        return (ja) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ja parseFrom(com.google.v.v vVar) {
        return (ja) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ja> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHome(i.b.e.l lVar) {
        Objects.requireNonNull(lVar);
        this.home_ = lVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumFavorites(int i2) {
        this.bitField0_ |= 4;
        this.numFavorites_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWork(i.b.e.l lVar) {
        Objects.requireNonNull(lVar);
        this.work_ = lVar;
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003င\u0002", new Object[]{"bitField0_", "home_", "work_", "numFavorites_"});
        }
        if (iOrdinal == 3) {
            return new ja();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new iz(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ja> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ja.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public i.b.e.l getHome() {
        i.b.e.l lVar = this.home_;
        return lVar == null ? i.b.e.l.getDefaultInstance() : lVar;
    }

    public int getNumFavorites() {
        return this.numFavorites_;
    }

    public i.b.e.l getWork() {
        i.b.e.l lVar = this.work_;
        return lVar == null ? i.b.e.l.getDefaultInstance() : lVar;
    }

    public boolean hasHome() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasNumFavorites() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasWork() {
        return (this.bitField0_ & 2) != 0;
    }

    public static iz newBuilder(ja jaVar) {
        return (iz) DEFAULT_INSTANCE.createBuilder(jaVar);
    }

    public static ja parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ja) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ja parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ja) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ja parseFrom(com.google.v.z zVar) {
        return (ja) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ja parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ja) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ja parseFrom(InputStream inputStream) {
        return (ja) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ja parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ja) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ja parseFrom(ByteBuffer byteBuffer) {
        return (ja) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ja parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ja) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ja parseFrom(byte[] bArr) {
        return (ja) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ja parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ja) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
