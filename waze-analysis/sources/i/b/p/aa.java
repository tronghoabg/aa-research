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
public final class aa extends du<aa, z> implements fj {
    private static final aa DEFAULT_INSTANCE;
    private static volatile fo<aa> PARSER = null;
    public static final int PERMISSIONS_FIELD_NUMBER = 2;
    public static final int PHONE_FIELD_NUMBER = 3;
    public static final int WAZER_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private int permissions_;
    private String phone_ = "";
    private i.b.aq wazerId_;

    static {
        aa aaVar = new aa();
        DEFAULT_INSTANCE = aaVar;
        du.registerDefaultInstance(aa.class, aaVar);
    }

    private aa() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPermissions() {
        this.bitField0_ &= -3;
        this.permissions_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPhone() {
        this.bitField0_ &= -5;
        this.phone_ = getDefaultInstance().getPhone();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWazerId() {
        this.wazerId_ = null;
        this.bitField0_ &= -2;
    }

    public static aa getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWazerId(i.b.aq aqVar) {
        Objects.requireNonNull(aqVar);
        i.b.aq aqVar2 = this.wazerId_;
        if (aqVar2 != null && aqVar2 != i.b.aq.getDefaultInstance()) {
            i.b.ap apVarNewBuilder = i.b.aq.newBuilder(aqVar2);
            apVarNewBuilder.mergeFrom((i.b.ap) aqVar);
            aqVar = apVarNewBuilder.buildPartial();
        }
        this.wazerId_ = aqVar;
        this.bitField0_ |= 1;
    }

    public static z newBuilder() {
        return (z) DEFAULT_INSTANCE.createBuilder();
    }

    public static aa parseDelimitedFrom(InputStream inputStream) {
        return (aa) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aa parseFrom(com.google.v.v vVar) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<aa> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPermissions(int i2) {
        this.bitField0_ |= 2;
        this.permissions_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhone(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.phone_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhoneBytes(com.google.v.v vVar) {
        this.phone_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWazerId(i.b.aq aqVar) {
        Objects.requireNonNull(aqVar);
        this.wazerId_ = aqVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "wazerId_", "permissions_", "phone_"});
        }
        if (iOrdinal == 3) {
            return new aa();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new z(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<aa> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aa.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getPermissions() {
        return this.permissions_;
    }

    public String getPhone() {
        return this.phone_;
    }

    public com.google.v.v getPhoneBytes() {
        return com.google.v.v.s(this.phone_);
    }

    public i.b.aq getWazerId() {
        i.b.aq aqVar = this.wazerId_;
        return aqVar == null ? i.b.aq.getDefaultInstance() : aqVar;
    }

    public boolean hasPermissions() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasPhone() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasWazerId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static z newBuilder(aa aaVar) {
        return (z) DEFAULT_INSTANCE.createBuilder(aaVar);
    }

    public static aa parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (aa) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aa parseFrom(com.google.v.v vVar, de deVar) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aa parseFrom(com.google.v.z zVar) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aa parseFrom(com.google.v.z zVar, de deVar) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aa parseFrom(InputStream inputStream) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aa parseFrom(InputStream inputStream, de deVar) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aa parseFrom(ByteBuffer byteBuffer) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aa parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aa parseFrom(byte[] bArr) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aa parseFrom(byte[] bArr, de deVar) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
