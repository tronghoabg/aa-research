package i.b.v;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class du extends com.google.v.du<du, dt> implements com.google.v.fj {
    private static final du DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<du> PARSER = null;
    public static final int TAKEOVER_IMAGE_FIELD_NUMBER = 2;
    public static final int TAKEOVER_LABEL_FIELD_NUMBER = 1;
    private int bitField0_;
    private String takeoverLabel_ = "";
    private String takeoverImage_ = "";

    static {
        du duVar = new du();
        DEFAULT_INSTANCE = duVar;
        com.google.v.du.registerDefaultInstance(du.class, duVar);
    }

    private du() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTakeoverImage() {
        this.bitField0_ &= -3;
        this.takeoverImage_ = getDefaultInstance().getTakeoverImage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTakeoverLabel() {
        this.bitField0_ &= -2;
        this.takeoverLabel_ = getDefaultInstance().getTakeoverLabel();
    }

    public static du getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static dt newBuilder() {
        return (dt) DEFAULT_INSTANCE.createBuilder();
    }

    public static du parseDelimitedFrom(InputStream inputStream) {
        return (du) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static du parseFrom(com.google.v.v vVar) {
        return (du) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<du> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTakeoverImage(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.takeoverImage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTakeoverImageBytes(com.google.v.v vVar) {
        this.takeoverImage_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTakeoverLabel(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.takeoverLabel_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTakeoverLabelBytes(com.google.v.v vVar) {
        this.takeoverLabel_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "takeoverLabel_", "takeoverImage_"});
        }
        if (iOrdinal == 3) {
            return new du();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new dt(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<du> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (du.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getTakeoverImage() {
        return this.takeoverImage_;
    }

    public com.google.v.v getTakeoverImageBytes() {
        return com.google.v.v.s(this.takeoverImage_);
    }

    public String getTakeoverLabel() {
        return this.takeoverLabel_;
    }

    public com.google.v.v getTakeoverLabelBytes() {
        return com.google.v.v.s(this.takeoverLabel_);
    }

    public boolean hasTakeoverImage() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasTakeoverLabel() {
        return (this.bitField0_ & 1) != 0;
    }

    public static dt newBuilder(du duVar) {
        return (dt) DEFAULT_INSTANCE.createBuilder(duVar);
    }

    public static du parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (du) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static du parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (du) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static du parseFrom(com.google.v.z zVar) {
        return (du) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static du parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (du) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static du parseFrom(InputStream inputStream) {
        return (du) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static du parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (du) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static du parseFrom(ByteBuffer byteBuffer) {
        return (du) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static du parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (du) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static du parseFrom(byte[] bArr) {
        return (du) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static du parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (du) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
