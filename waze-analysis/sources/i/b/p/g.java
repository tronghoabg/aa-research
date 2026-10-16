package i.b.p;

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
public final class g extends du<g, f> implements fj {
    public static final int CLIENT_NAME_FIELD_NUMBER = 9;
    public static final int CLIENT_SUPPORTS_PINCODE_LENGTH_FIELD_NUMBER = 10;
    public static final int COMMUNITY_FIELD_NUMBER = 2;
    private static final g DEFAULT_INSTANCE;
    public static final int DEVICE_FIELD_NUMBER = 7;
    public static final int FRIENDS_FIELD_NUMBER = 6;
    private static volatile fo<g> PARSER = null;
    public static final int PHONE_FIELD_NUMBER = 4;
    public static final int PIN_FIELD_NUMBER = 5;
    public static final int TOKEN_FIELD_NUMBER = 3;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int USER_ID_FIELD_NUMBER = 8;
    private int bitField0_;
    private boolean clientSupportsPincodeLength_;
    private o community_;
    private int device_;
    private m friends_;
    private af phone_;
    private ah pin_;
    private int type_;
    private long userId_;
    private String token_ = "";
    private int clientName_ = 1;

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        du.registerDefaultInstance(g.class, gVar);
    }

    private g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientName() {
        this.bitField0_ &= -257;
        this.clientName_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientSupportsPincodeLength() {
        this.bitField0_ &= -513;
        this.clientSupportsPincodeLength_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCommunity() {
        this.community_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDevice() {
        this.bitField0_ &= -65;
        this.device_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFriends() {
        this.friends_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPhone() {
        this.phone_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPin() {
        this.pin_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToken() {
        this.bitField0_ &= -5;
        this.token_ = getDefaultInstance().getToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -2;
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserId() {
        this.bitField0_ &= -129;
        this.userId_ = 0L;
    }

    public static g getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCommunity(o oVar) {
        Objects.requireNonNull(oVar);
        o oVar2 = this.community_;
        if (oVar2 != null && oVar2 != o.getDefaultInstance()) {
            n nVarNewBuilder = o.newBuilder(oVar2);
            nVarNewBuilder.mergeFrom((n) oVar);
            oVar = nVarNewBuilder.buildPartial();
        }
        this.community_ = oVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFriends(m mVar) {
        Objects.requireNonNull(mVar);
        m mVar2 = this.friends_;
        if (mVar2 != null && mVar2 != m.getDefaultInstance()) {
            l lVarNewBuilder = m.newBuilder(mVar2);
            lVarNewBuilder.mergeFrom((l) mVar);
            mVar = lVarNewBuilder.buildPartial();
        }
        this.friends_ = mVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePhone(af afVar) {
        Objects.requireNonNull(afVar);
        af afVar2 = this.phone_;
        if (afVar2 != null && afVar2 != af.getDefaultInstance()) {
            ad adVarNewBuilder = af.newBuilder(afVar2);
            adVarNewBuilder.mergeFrom((ad) afVar);
            afVar = adVarNewBuilder.buildPartial();
        }
        this.phone_ = afVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePin(ah ahVar) {
        Objects.requireNonNull(ahVar);
        ah ahVar2 = this.pin_;
        if (ahVar2 != null && ahVar2 != ah.getDefaultInstance()) {
            ag agVarNewBuilder = ah.newBuilder(ahVar2);
            agVarNewBuilder.mergeFrom((ag) ahVar);
            ahVar = agVarNewBuilder.buildPartial();
        }
        this.pin_ = ahVar;
        this.bitField0_ |= 16;
    }

    public static f newBuilder() {
        return (f) DEFAULT_INSTANCE.createBuilder();
    }

    public static g parseDelimitedFrom(InputStream inputStream) {
        return (g) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static g parseFrom(com.google.v.v vVar) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<g> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientName(i iVar) {
        this.clientName_ = iVar.getNumber();
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientSupportsPincodeLength(boolean z) {
        this.bitField0_ |= 512;
        this.clientSupportsPincodeLength_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCommunity(o oVar) {
        Objects.requireNonNull(oVar);
        this.community_ = oVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDevice(i.b.u uVar) {
        this.device_ = uVar.getNumber();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFriends(m mVar) {
        Objects.requireNonNull(mVar);
        this.friends_ = mVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhone(af afVar) {
        Objects.requireNonNull(afVar);
        this.phone_ = afVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPin(ah ahVar) {
        Objects.requireNonNull(ahVar);
        this.pin_ = ahVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToken(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.token_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTokenBytes(com.google.v.v vVar) {
        this.token_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(h hVar) {
        this.type_ = hVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserId(long j2) {
        this.bitField0_ |= 128;
        this.userId_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007᠌\u0006\bဂ\u0007\t᠌\b\nဇ\t", new Object[]{"bitField0_", "type_", b.f49188c, "community_", "token_", "phone_", "pin_", "friends_", "device_", i.b.u.a(), "userId_", "clientName_", b.f49189d, "clientSupportsPincodeLength_"});
        }
        if (iOrdinal == 3) {
            return new g();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new f(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<g> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (g.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public i getClientName() {
        i iVarA = i.a(this.clientName_);
        return iVarA == null ? i.WAZE : iVarA;
    }

    public boolean getClientSupportsPincodeLength() {
        return this.clientSupportsPincodeLength_;
    }

    public o getCommunity() {
        o oVar = this.community_;
        return oVar == null ? o.getDefaultInstance() : oVar;
    }

    public i.b.u getDevice() {
        i.b.u uVarB = i.b.u.b(this.device_);
        return uVarB == null ? i.b.u.UNKNOWN_DEVICE_TYPE : uVarB;
    }

    public m getFriends() {
        m mVar = this.friends_;
        return mVar == null ? m.getDefaultInstance() : mVar;
    }

    public af getPhone() {
        af afVar = this.phone_;
        return afVar == null ? af.getDefaultInstance() : afVar;
    }

    public ah getPin() {
        ah ahVar = this.pin_;
        return ahVar == null ? ah.getDefaultInstance() : ahVar;
    }

    public String getToken() {
        return this.token_;
    }

    public com.google.v.v getTokenBytes() {
        return com.google.v.v.s(this.token_);
    }

    public h getType() {
        h hVarA = h.a(this.type_);
        return hVarA == null ? h.UNKNOWN : hVarA;
    }

    public long getUserId() {
        return this.userId_;
    }

    public boolean hasClientName() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasClientSupportsPincodeLength() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasCommunity() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasDevice() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasFriends() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasPhone() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasPin() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasToken() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasUserId() {
        return (this.bitField0_ & 128) != 0;
    }

    public static f newBuilder(g gVar) {
        return (f) DEFAULT_INSTANCE.createBuilder(gVar);
    }

    public static g parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (g) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static g parseFrom(com.google.v.v vVar, de deVar) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static g parseFrom(com.google.v.z zVar) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static g parseFrom(com.google.v.z zVar, de deVar) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static g parseFrom(InputStream inputStream) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static g parseFrom(InputStream inputStream, de deVar) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static g parseFrom(ByteBuffer byteBuffer) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static g parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static g parseFrom(byte[] bArr) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static g parseFrom(byte[] bArr, de deVar) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
