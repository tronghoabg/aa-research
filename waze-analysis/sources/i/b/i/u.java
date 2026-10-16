package i.b.i;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class u extends du<u, t> implements fj {
    public static final int APP_TYPE_FIELD_NUMBER = 5;
    public static final int CHANNEL_FIELD_NUMBER = 2;
    private static final u DEFAULT_INSTANCE;
    public static final int LOCALE_FIELD_NUMBER = 3;
    private static volatile fo<u> PARSER = null;
    public static final int PROTOCOL_FIELD_NUMBER = 4;
    public static final int USER_ID_FIELD_NUMBER = 1;
    private int appType_;
    private int bitField0_;
    private eo<String> channel_ = emptyProtobufList();
    private String locale_ = "";
    private int protocol_ = 1;
    private long userId_;

    static {
        u uVar = new u();
        DEFAULT_INSTANCE = uVar;
        du.registerDefaultInstance(u.class, uVar);
    }

    private u() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllChannel(Iterable<String> iterable) {
        ensureChannelIsMutable();
        com.google.v.c.addAll(iterable, this.channel_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addChannel(String str) {
        Objects.requireNonNull(str);
        ensureChannelIsMutable();
        this.channel_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addChannelBytes(com.google.v.v vVar) {
        ensureChannelIsMutable();
        this.channel_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppType() {
        this.bitField0_ &= -9;
        this.appType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChannel() {
        this.channel_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocale() {
        this.bitField0_ &= -3;
        this.locale_ = getDefaultInstance().getLocale();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProtocol() {
        this.bitField0_ &= -5;
        this.protocol_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserId() {
        this.bitField0_ &= -2;
        this.userId_ = 0L;
    }

    private void ensureChannelIsMutable() {
        eo<String> eoVar = this.channel_;
        if (eoVar.c()) {
            return;
        }
        this.channel_ = du.mutableCopy(eoVar);
    }

    public static u getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static t newBuilder() {
        return (t) DEFAULT_INSTANCE.createBuilder();
    }

    public static u parseDelimitedFrom(InputStream inputStream) {
        return (u) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static u parseFrom(com.google.v.v vVar) {
        return (u) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<u> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppType(i.b.n nVar) {
        this.appType_ = nVar.getNumber();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChannel(int i2, String str) {
        Objects.requireNonNull(str);
        ensureChannelIsMutable();
        this.channel_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocale(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.locale_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocaleBytes(com.google.v.v vVar) {
        this.locale_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProtocol(int i2) {
        this.bitField0_ |= 4;
        this.protocol_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserId(long j2) {
        this.bitField0_ |= 1;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဂ\u0000\u0002\u001a\u0003ဈ\u0001\u0004င\u0002\u0005᠌\u0003", new Object[]{"bitField0_", "userId_", "channel_", "locale_", "protocol_", "appType_", i.b.n.a()});
        }
        if (iOrdinal == 3) {
            return new u();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new t(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<u> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (u.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public i.b.n getAppType() {
        i.b.n nVarB = i.b.n.b(this.appType_);
        return nVarB == null ? i.b.n.UNKNOWN_APP_TYPE : nVarB;
    }

    public String getChannel(int i2) {
        return this.channel_.get(i2);
    }

    public com.google.v.v getChannelBytes(int i2) {
        return com.google.v.v.s(this.channel_.get(i2));
    }

    public int getChannelCount() {
        return this.channel_.size();
    }

    public List<String> getChannelList() {
        return this.channel_;
    }

    public String getLocale() {
        return this.locale_;
    }

    public com.google.v.v getLocaleBytes() {
        return com.google.v.v.s(this.locale_);
    }

    public int getProtocol() {
        return this.protocol_;
    }

    public long getUserId() {
        return this.userId_;
    }

    public boolean hasAppType() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasLocale() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasProtocol() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasUserId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static t newBuilder(u uVar) {
        return (t) DEFAULT_INSTANCE.createBuilder(uVar);
    }

    public static u parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (u) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static u parseFrom(com.google.v.v vVar, de deVar) {
        return (u) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static u parseFrom(com.google.v.z zVar) {
        return (u) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static u parseFrom(com.google.v.z zVar, de deVar) {
        return (u) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static u parseFrom(InputStream inputStream) {
        return (u) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static u parseFrom(InputStream inputStream, de deVar) {
        return (u) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static u parseFrom(ByteBuffer byteBuffer) {
        return (u) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static u parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (u) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static u parseFrom(byte[] bArr) {
        return (u) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static u parseFrom(byte[] bArr, de deVar) {
        return (u) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
