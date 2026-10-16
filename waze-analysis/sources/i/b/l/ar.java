package i.b.l;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ar extends com.google.v.du<ar, ap> implements as {
    private static final ar DEFAULT_INSTANCE;
    public static final int HEIGHT_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<ar> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int WIDTH_FIELD_NUMBER = 2;
    private int bitField0_;
    private int height_;
    private int type_ = 1;
    private int width_;

    static {
        ar arVar = new ar();
        DEFAULT_INSTANCE = arVar;
        com.google.v.du.registerDefaultInstance(ar.class, arVar);
    }

    private ar() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeight() {
        this.bitField0_ &= -5;
        this.height_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -2;
        this.type_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWidth() {
        this.bitField0_ &= -3;
        this.width_ = 0;
    }

    public static ar getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ap newBuilder() {
        return (ap) DEFAULT_INSTANCE.createBuilder();
    }

    public static ar parseDelimitedFrom(InputStream inputStream) {
        return (ar) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ar parseFrom(com.google.v.v vVar) {
        return (ar) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ar> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeight(int i2) {
        this.bitField0_ |= 4;
        this.height_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(aq aqVar) {
        this.type_ = aqVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWidth(int i2) {
        this.bitField0_ |= 2;
        this.width_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"bitField0_", "type_", e.f48664k, "width_", "height_"});
        }
        if (iOrdinal == 3) {
            return new ar();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ap(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ar> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ar.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getHeight() {
        return this.height_;
    }

    public aq getType() {
        aq aqVarA = aq.a(this.type_);
        return aqVarA == null ? aq.UNKNOWN : aqVarA;
    }

    public int getWidth() {
        return this.width_;
    }

    public boolean hasHeight() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasWidth() {
        return (this.bitField0_ & 2) != 0;
    }

    public static ap newBuilder(ar arVar) {
        return (ap) DEFAULT_INSTANCE.createBuilder(arVar);
    }

    public static ar parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ar) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ar parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ar) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ar parseFrom(com.google.v.z zVar) {
        return (ar) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ar parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ar) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ar parseFrom(InputStream inputStream) {
        return (ar) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ar parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ar) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ar parseFrom(ByteBuffer byteBuffer) {
        return (ar) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ar parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ar) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ar parseFrom(byte[] bArr) {
        return (ar) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ar parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ar) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
