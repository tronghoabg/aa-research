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
public final class bq extends du<bq, bp> implements fj {
    public static final int ACTION_FIELD_NUMBER = 1;
    private static final bq DEFAULT_INSTANCE;
    private static volatile fo<bq> PARSER = null;
    public static final int PROPERTY_FIELD_NUMBER = 2;
    private String action_ = "";
    private int bitField0_;
    private at property_;

    static {
        bq bqVar = new bq();
        DEFAULT_INSTANCE = bqVar;
        du.registerDefaultInstance(bq.class, bqVar);
    }

    private bq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.bitField0_ &= -2;
        this.action_ = getDefaultInstance().getAction();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProperty() {
        this.property_ = null;
        this.bitField0_ &= -3;
    }

    public static bq getDefaultInstance() {
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
        this.bitField0_ |= 2;
    }

    public static bp newBuilder() {
        return (bp) DEFAULT_INSTANCE.createBuilder();
    }

    public static bq parseDelimitedFrom(InputStream inputStream) {
        return (bq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bq parseFrom(com.google.v.v vVar) {
        return (bq) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<bq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.action_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionBytes(com.google.v.v vVar) {
        this.action_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProperty(at atVar) {
        Objects.requireNonNull(atVar);
        this.property_ = atVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "action_", "property_"});
        }
        if (iOrdinal == 3) {
            return new bq();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bp(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<bq> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bq.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getAction() {
        return this.action_;
    }

    public com.google.v.v getActionBytes() {
        return com.google.v.v.s(this.action_);
    }

    public at getProperty() {
        at atVar = this.property_;
        return atVar == null ? at.getDefaultInstance() : atVar;
    }

    public boolean hasAction() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasProperty() {
        return (this.bitField0_ & 2) != 0;
    }

    public static bp newBuilder(bq bqVar) {
        return (bp) DEFAULT_INSTANCE.createBuilder(bqVar);
    }

    public static bq parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (bq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bq parseFrom(com.google.v.v vVar, de deVar) {
        return (bq) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bq parseFrom(com.google.v.z zVar) {
        return (bq) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bq parseFrom(com.google.v.z zVar, de deVar) {
        return (bq) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bq parseFrom(InputStream inputStream) {
        return (bq) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bq parseFrom(InputStream inputStream, de deVar) {
        return (bq) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bq parseFrom(ByteBuffer byteBuffer) {
        return (bq) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bq parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (bq) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bq parseFrom(byte[] bArr) {
        return (bq) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bq parseFrom(byte[] bArr, de deVar) {
        return (bq) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
