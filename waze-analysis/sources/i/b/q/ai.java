package i.b.q;

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
/* loaded from: classes8.dex */
public final class ai extends du<ai, ah> implements fj {
    private static final ai DEFAULT_INSTANCE;
    public static final int DRIVEPLANDURATION_FIELD_NUMBER = 1;
    public static final int ISPREFERRED_FIELD_NUMBER = 4;
    public static final int LEAVINGNOWDURATION_FIELD_NUMBER = 2;
    private static volatile fo<ai> PARSER = null;
    public static final int VIANAME_FIELD_NUMBER = 3;
    private int bitField0_;
    private i drivePlanDuration_;
    private boolean isPreferred_;
    private i leavingNowDuration_;
    private String viaName_ = "";

    static {
        ai aiVar = new ai();
        DEFAULT_INSTANCE = aiVar;
        du.registerDefaultInstance(ai.class, aiVar);
    }

    private ai() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDrivePlanDuration() {
        this.drivePlanDuration_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsPreferred() {
        this.bitField0_ &= -9;
        this.isPreferred_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLeavingNowDuration() {
        this.leavingNowDuration_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearViaName() {
        this.bitField0_ &= -5;
        this.viaName_ = getDefaultInstance().getViaName();
    }

    public static ai getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDrivePlanDuration(i iVar) {
        Objects.requireNonNull(iVar);
        i iVar2 = this.drivePlanDuration_;
        if (iVar2 != null && iVar2 != i.getDefaultInstance()) {
            h hVarNewBuilder = i.newBuilder(iVar2);
            hVarNewBuilder.mergeFrom((h) iVar);
            iVar = hVarNewBuilder.buildPartial();
        }
        this.drivePlanDuration_ = iVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLeavingNowDuration(i iVar) {
        Objects.requireNonNull(iVar);
        i iVar2 = this.leavingNowDuration_;
        if (iVar2 != null && iVar2 != i.getDefaultInstance()) {
            h hVarNewBuilder = i.newBuilder(iVar2);
            hVarNewBuilder.mergeFrom((h) iVar);
            iVar = hVarNewBuilder.buildPartial();
        }
        this.leavingNowDuration_ = iVar;
        this.bitField0_ |= 2;
    }

    public static ah newBuilder() {
        return (ah) DEFAULT_INSTANCE.createBuilder();
    }

    public static ai parseDelimitedFrom(InputStream inputStream) {
        return (ai) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ai parseFrom(com.google.v.v vVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ai> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDrivePlanDuration(i iVar) {
        Objects.requireNonNull(iVar);
        this.drivePlanDuration_ = iVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsPreferred(boolean z) {
        this.bitField0_ |= 8;
        this.isPreferred_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLeavingNowDuration(i iVar) {
        Objects.requireNonNull(iVar);
        this.leavingNowDuration_ = iVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setViaName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.viaName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setViaNameBytes(com.google.v.v vVar) {
        this.viaName_ = vVar.u();
        this.bitField0_ |= 4;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဇ\u0003", new Object[]{"bitField0_", "drivePlanDuration_", "leavingNowDuration_", "viaName_", "isPreferred_"});
        }
        if (iOrdinal == 3) {
            return new ai();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ah(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ai> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ai.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public i getDrivePlanDuration() {
        i iVar = this.drivePlanDuration_;
        return iVar == null ? i.getDefaultInstance() : iVar;
    }

    public boolean getIsPreferred() {
        return this.isPreferred_;
    }

    public i getLeavingNowDuration() {
        i iVar = this.leavingNowDuration_;
        return iVar == null ? i.getDefaultInstance() : iVar;
    }

    public String getViaName() {
        return this.viaName_;
    }

    public com.google.v.v getViaNameBytes() {
        return com.google.v.v.s(this.viaName_);
    }

    public boolean hasDrivePlanDuration() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasIsPreferred() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasLeavingNowDuration() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasViaName() {
        return (this.bitField0_ & 4) != 0;
    }

    public static ah newBuilder(ai aiVar) {
        return (ah) DEFAULT_INSTANCE.createBuilder(aiVar);
    }

    public static ai parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ai) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ai parseFrom(com.google.v.v vVar, de deVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ai parseFrom(com.google.v.z zVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ai parseFrom(com.google.v.z zVar, de deVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ai parseFrom(InputStream inputStream) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ai parseFrom(InputStream inputStream, de deVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ai parseFrom(ByteBuffer byteBuffer) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ai parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ai parseFrom(byte[] bArr) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ai parseFrom(byte[] bArr, de deVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
