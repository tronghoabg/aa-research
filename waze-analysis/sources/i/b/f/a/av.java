package i.b.f.a;

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
public final class av extends du<av, au> implements fj {
    private static final av DEFAULT_INSTANCE;
    private static volatile fo<av> PARSER = null;
    public static final int PROPERTY_FIELD_NUMBER = 1;
    private int bitField0_;
    private at property_;

    static {
        av avVar = new av();
        DEFAULT_INSTANCE = avVar;
        du.registerDefaultInstance(av.class, avVar);
    }

    private av() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProperty() {
        this.property_ = null;
        this.bitField0_ &= -2;
    }

    public static av getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeProperty(at atVar) {
        Objects.requireNonNull(atVar);
        at atVar2 = this.property_;
        if (atVar2 != null && atVar2 != at.getDefaultInstance()) {
            ar arVarNewBuilder = at.newBuilder(atVar2);
            arVarNewBuilder.mergeFrom((ar) atVar);
            atVar = arVarNewBuilder.buildPartial();
        }
        this.property_ = atVar;
        this.bitField0_ |= 1;
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
    public void setProperty(at atVar) {
        Objects.requireNonNull(atVar);
        this.property_ = atVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "property_"});
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

    public at getProperty() {
        at atVar = this.property_;
        return atVar == null ? at.getDefaultInstance() : atVar;
    }

    public boolean hasProperty() {
        return (this.bitField0_ & 1) != 0;
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
