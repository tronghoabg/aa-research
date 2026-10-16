package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aws extends com.google.v.du<aws, awr> implements com.google.v.fj {
    private static final aws DEFAULT_INSTANCE;
    public static final int ND4C_ALGO_TRANSPARENCY_LINK_SHOWN_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<aws> PARSER = null;
    public static final int ROUTES_SCREEN_VIEW_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean nd4CAlgoTransparencyLinkShown_;
    private int routesScreenView_;

    static {
        aws awsVar = new aws();
        DEFAULT_INSTANCE = awsVar;
        com.google.v.du.registerDefaultInstance(aws.class, awsVar);
    }

    private aws() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNd4CAlgoTransparencyLinkShown() {
        this.bitField0_ &= -2;
        this.nd4CAlgoTransparencyLinkShown_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoutesScreenView() {
        this.routesScreenView_ = 0;
    }

    public static aws getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static awr newBuilder() {
        return (awr) DEFAULT_INSTANCE.createBuilder();
    }

    public static aws parseDelimitedFrom(InputStream inputStream) {
        return (aws) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aws parseFrom(com.google.v.v vVar) {
        return (aws) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aws> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNd4CAlgoTransparencyLinkShown(boolean z) {
        this.bitField0_ |= 1;
        this.nd4CAlgoTransparencyLinkShown_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoutesScreenView(awt awtVar) {
        this.routesScreenView_ = awtVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoutesScreenViewValue(int i2) {
        this.routesScreenView_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002\f", new Object[]{"bitField0_", "nd4CAlgoTransparencyLinkShown_", "routesScreenView_"});
        }
        if (iOrdinal == 3) {
            return new aws();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new awr(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aws> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aws.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getNd4CAlgoTransparencyLinkShown() {
        return this.nd4CAlgoTransparencyLinkShown_;
    }

    public awt getRoutesScreenView() {
        awt awtVarA = awt.a(this.routesScreenView_);
        return awtVarA == null ? awt.UNRECOGNIZED : awtVarA;
    }

    public int getRoutesScreenViewValue() {
        return this.routesScreenView_;
    }

    public boolean hasNd4CAlgoTransparencyLinkShown() {
        return (this.bitField0_ & 1) != 0;
    }

    public static awr newBuilder(aws awsVar) {
        return (awr) DEFAULT_INSTANCE.createBuilder(awsVar);
    }

    public static aws parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aws) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aws parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aws) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aws parseFrom(com.google.v.z zVar) {
        return (aws) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aws parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aws) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aws parseFrom(InputStream inputStream) {
        return (aws) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aws parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aws) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aws parseFrom(ByteBuffer byteBuffer) {
        return (aws) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aws parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aws) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aws parseFrom(byte[] bArr) {
        return (aws) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aws parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aws) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
