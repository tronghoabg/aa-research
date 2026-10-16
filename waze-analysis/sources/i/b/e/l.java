package i.b.e;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class l extends du<l, i> implements m {
    private static final l DEFAULT_INSTANCE;
    public static final int LAST_DRIVE_TIME_FIELD_NUMBER = 5;
    public static final int NAME_FIELD_NUMBER = 2;
    public static final int NOTIFICATION_USERS_FIELD_NUMBER = 4;
    private static volatile fo<l> PARSER = null;
    public static final int PLACE_FIELD_NUMBER = 1;
    public static final int TYPE_FIELD_NUMBER = 3;
    private int bitField0_;
    private long lastDriveTime_;
    private String name_ = "";
    private eo<String> notificationUsers_ = emptyProtobufList();
    private y place_;
    private int type_;

    static {
        l lVar = new l();
        DEFAULT_INSTANCE = lVar;
        du.registerDefaultInstance(l.class, lVar);
    }

    private l() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllNotificationUsers(Iterable<String> iterable) {
        ensureNotificationUsersIsMutable();
        com.google.v.c.addAll(iterable, this.notificationUsers_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNotificationUsers(String str) {
        Objects.requireNonNull(str);
        ensureNotificationUsersIsMutable();
        this.notificationUsers_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNotificationUsersBytes(com.google.v.v vVar) {
        ensureNotificationUsersIsMutable();
        this.notificationUsers_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastDriveTime() {
        this.bitField0_ &= -9;
        this.lastDriveTime_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -3;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNotificationUsers() {
        this.notificationUsers_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlace() {
        this.place_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -5;
        this.type_ = 0;
    }

    private void ensureNotificationUsersIsMutable() {
        eo<String> eoVar = this.notificationUsers_;
        if (eoVar.c()) {
            return;
        }
        this.notificationUsers_ = du.mutableCopy(eoVar);
    }

    public static l getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlace(y yVar) {
        Objects.requireNonNull(yVar);
        y yVar2 = this.place_;
        if (yVar2 != null && yVar2 != y.getDefaultInstance()) {
            x xVarNewBuilder = y.newBuilder(yVar2);
            xVarNewBuilder.mergeFrom((x) yVar);
            yVar = xVarNewBuilder.buildPartial();
        }
        this.place_ = yVar;
        this.bitField0_ |= 1;
    }

    public static i newBuilder() {
        return (i) DEFAULT_INSTANCE.createBuilder();
    }

    public static l parseDelimitedFrom(InputStream inputStream) {
        return (l) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static l parseFrom(com.google.v.v vVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<l> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastDriveTime(long j2) {
        this.bitField0_ |= 8;
        this.lastDriveTime_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(com.google.v.v vVar) {
        this.name_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNotificationUsers(int i2, String str) {
        Objects.requireNonNull(str);
        ensureNotificationUsersIsMutable();
        this.notificationUsers_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlace(y yVar) {
        Objects.requireNonNull(yVar);
        this.place_ = yVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(k kVar) {
        this.type_ = kVar.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004\u001a\u0005ဂ\u0003", new Object[]{"bitField0_", "place_", "name_", "type_", j.f48400a, "notificationUsers_", "lastDriveTime_"});
        }
        if (iOrdinal == 3) {
            return new l();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new i(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<l> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (l.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getLastDriveTime() {
        return this.lastDriveTime_;
    }

    public String getName() {
        return this.name_;
    }

    public com.google.v.v getNameBytes() {
        return com.google.v.v.s(this.name_);
    }

    public String getNotificationUsers(int i2) {
        return this.notificationUsers_.get(i2);
    }

    public com.google.v.v getNotificationUsersBytes(int i2) {
        return com.google.v.v.s(this.notificationUsers_.get(i2));
    }

    public int getNotificationUsersCount() {
        return this.notificationUsers_.size();
    }

    public List<String> getNotificationUsersList() {
        return this.notificationUsers_;
    }

    public y getPlace() {
        y yVar = this.place_;
        return yVar == null ? y.getDefaultInstance() : yVar;
    }

    public k getType() {
        k kVarB = k.b(this.type_);
        return kVarB == null ? k.UNKNOWN : kVarB;
    }

    public boolean hasLastDriveTime() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasName() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasPlace() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasType() {
        return (this.bitField0_ & 4) != 0;
    }

    public static i newBuilder(l lVar) {
        return (i) DEFAULT_INSTANCE.createBuilder(lVar);
    }

    public static l parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (l) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static l parseFrom(com.google.v.v vVar, de deVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static l parseFrom(com.google.v.z zVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static l parseFrom(com.google.v.z zVar, de deVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static l parseFrom(InputStream inputStream) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static l parseFrom(InputStream inputStream, de deVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static l parseFrom(ByteBuffer byteBuffer) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static l parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static l parseFrom(byte[] bArr) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static l parseFrom(byte[] bArr, de deVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
