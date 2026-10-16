package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class he extends com.google.v.du<he, hd> implements com.google.v.fj {
    public static final int BLUE_DOT_FIELD_NUMBER = 1;
    private static final he DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<he> PARSER = null;
    public static final int TOOL_TIP_FIELD_NUMBER = 2;
    private int bitField0_;
    private hb blueDot_;
    private hb toolTip_;

    static {
        he heVar = new he();
        DEFAULT_INSTANCE = heVar;
        com.google.v.du.registerDefaultInstance(he.class, heVar);
    }

    private he() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBlueDot() {
        this.blueDot_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToolTip() {
        this.toolTip_ = null;
        this.bitField0_ &= -3;
    }

    public static he getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBlueDot(hb hbVar) {
        Objects.requireNonNull(hbVar);
        hb hbVar2 = this.blueDot_;
        if (hbVar2 != null && hbVar2 != hb.getDefaultInstance()) {
            gz gzVarNewBuilder = hb.newBuilder(hbVar2);
            gzVarNewBuilder.mergeFrom((gz) hbVar);
            hbVar = gzVarNewBuilder.buildPartial();
        }
        this.blueDot_ = hbVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeToolTip(hb hbVar) {
        Objects.requireNonNull(hbVar);
        hb hbVar2 = this.toolTip_;
        if (hbVar2 != null && hbVar2 != hb.getDefaultInstance()) {
            gz gzVarNewBuilder = hb.newBuilder(hbVar2);
            gzVarNewBuilder.mergeFrom((gz) hbVar);
            hbVar = gzVarNewBuilder.buildPartial();
        }
        this.toolTip_ = hbVar;
        this.bitField0_ |= 2;
    }

    public static hd newBuilder() {
        return (hd) DEFAULT_INSTANCE.createBuilder();
    }

    public static he parseDelimitedFrom(InputStream inputStream) {
        return (he) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static he parseFrom(com.google.v.v vVar) {
        return (he) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<he> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBlueDot(hb hbVar) {
        Objects.requireNonNull(hbVar);
        this.blueDot_ = hbVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToolTip(hb hbVar) {
        Objects.requireNonNull(hbVar);
        this.toolTip_ = hbVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "blueDot_", "toolTip_"});
        }
        if (iOrdinal == 3) {
            return new he();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new hd(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<he> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (he.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public hb getBlueDot() {
        hb hbVar = this.blueDot_;
        return hbVar == null ? hb.getDefaultInstance() : hbVar;
    }

    public hb getToolTip() {
        hb hbVar = this.toolTip_;
        return hbVar == null ? hb.getDefaultInstance() : hbVar;
    }

    public boolean hasBlueDot() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasToolTip() {
        return (this.bitField0_ & 2) != 0;
    }

    public static hd newBuilder(he heVar) {
        return (hd) DEFAULT_INSTANCE.createBuilder(heVar);
    }

    public static he parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (he) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static he parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (he) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static he parseFrom(com.google.v.z zVar) {
        return (he) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static he parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (he) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static he parseFrom(InputStream inputStream) {
        return (he) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static he parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (he) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static he parseFrom(ByteBuffer byteBuffer) {
        return (he) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static he parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (he) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static he parseFrom(byte[] bArr) {
        return (he) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static he parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (he) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
