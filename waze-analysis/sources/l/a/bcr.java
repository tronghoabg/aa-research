package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bcr extends com.google.v.du<bcr, bcq> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 2;
    private static final bcr DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bcr> PARSER = null;
    public static final int SHARE_DRIVE_INFORMATION_FIELD_NUMBER = 1;
    private int action_;
    private int bitField0_;
    private bco shareDriveInformation_;

    static {
        bcr bcrVar = new bcr();
        DEFAULT_INSTANCE = bcrVar;
        com.google.v.du.registerDefaultInstance(bcr.class, bcrVar);
    }

    private bcr() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShareDriveInformation() {
        this.shareDriveInformation_ = null;
        this.bitField0_ &= -2;
    }

    public static bcr getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeShareDriveInformation(bco bcoVar) {
        Objects.requireNonNull(bcoVar);
        bco bcoVar2 = this.shareDriveInformation_;
        if (bcoVar2 != null && bcoVar2 != bco.getDefaultInstance()) {
            bcn bcnVarNewBuilder = bco.newBuilder(bcoVar2);
            bcnVarNewBuilder.mergeFrom((bcn) bcoVar);
            bcoVar = bcnVarNewBuilder.buildPartial();
        }
        this.shareDriveInformation_ = bcoVar;
        this.bitField0_ |= 1;
    }

    public static bcq newBuilder() {
        return (bcq) DEFAULT_INSTANCE.createBuilder();
    }

    public static bcr parseDelimitedFrom(InputStream inputStream) {
        return (bcr) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bcr parseFrom(com.google.v.v vVar) {
        return (bcr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bcr> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(bcp bcpVar) {
        this.action_ = bcpVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShareDriveInformation(bco bcoVar) {
        Objects.requireNonNull(bcoVar);
        this.shareDriveInformation_ = bcoVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f", new Object[]{"bitField0_", "shareDriveInformation_", "action_"});
        }
        if (iOrdinal == 3) {
            return new bcr();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bcq(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bcr> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bcr.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bcp getAction() {
        bcp bcpVar;
        switch (this.action_) {
            case 0:
                bcpVar = bcp.ACTION_UNSPECIFIED;
                break;
            case 1:
                bcpVar = bcp.CLOSE;
                break;
            case 2:
                bcpVar = bcp.DRIVE_THERE;
                break;
            case 3:
                bcpVar = bcp.EXIT_LIVE_DRIVE;
                break;
            case 4:
                bcpVar = bcp.RESUME_DRIVE;
                break;
            case 5:
                bcpVar = bcp.SHARE_DRIVE;
                break;
            case 6:
                bcpVar = bcp.SWIPE_DOWN;
                break;
            case 7:
                bcpVar = bcp.SWIPE_UP;
                break;
            default:
                bcpVar = null;
                break;
        }
        return bcpVar == null ? bcp.UNRECOGNIZED : bcpVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public bco getShareDriveInformation() {
        bco bcoVar = this.shareDriveInformation_;
        return bcoVar == null ? bco.getDefaultInstance() : bcoVar;
    }

    public boolean hasShareDriveInformation() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bcq newBuilder(bcr bcrVar) {
        return (bcq) DEFAULT_INSTANCE.createBuilder(bcrVar);
    }

    public static bcr parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bcr) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bcr parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bcr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bcr parseFrom(com.google.v.z zVar) {
        return (bcr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bcr parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bcr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bcr parseFrom(InputStream inputStream) {
        return (bcr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bcr parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bcr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bcr parseFrom(ByteBuffer byteBuffer) {
        return (bcr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bcr parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bcr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bcr parseFrom(byte[] bArr) {
        return (bcr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bcr parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bcr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
