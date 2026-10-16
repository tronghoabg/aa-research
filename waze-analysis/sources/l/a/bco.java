package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bco extends com.google.v.du<bco, bcn> implements com.google.v.fj {
    private static final bco DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bco> PARSER = null;
    public static final int PARTICIPANTS_FIELD_NUMBER = 3;
    public static final int SHARE_DRIVE_ID_FIELD_NUMBER = 1;
    public static final int TRIGGERING_USER_FIELD_NUMBER = 2;
    private int bitField0_;
    private bcw triggeringUser_;
    private String shareDriveId_ = "";
    private com.google.v.eo<bcw> participants_ = emptyProtobufList();

    static {
        bco bcoVar = new bco();
        DEFAULT_INSTANCE = bcoVar;
        com.google.v.du.registerDefaultInstance(bco.class, bcoVar);
    }

    private bco() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllParticipants(Iterable<? extends bcw> iterable) {
        ensureParticipantsIsMutable();
        com.google.v.c.addAll(iterable, this.participants_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addParticipants(int i2, bcw bcwVar) {
        Objects.requireNonNull(bcwVar);
        ensureParticipantsIsMutable();
        this.participants_.add(i2, bcwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipants() {
        this.participants_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShareDriveId() {
        this.shareDriveId_ = getDefaultInstance().getShareDriveId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTriggeringUser() {
        this.triggeringUser_ = null;
        this.bitField0_ &= -2;
    }

    private void ensureParticipantsIsMutable() {
        com.google.v.eo<bcw> eoVar = this.participants_;
        if (eoVar.c()) {
            return;
        }
        this.participants_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static bco getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTriggeringUser(bcw bcwVar) {
        Objects.requireNonNull(bcwVar);
        bcw bcwVar2 = this.triggeringUser_;
        if (bcwVar2 != null && bcwVar2 != bcw.getDefaultInstance()) {
            bcu bcuVarNewBuilder = bcw.newBuilder(bcwVar2);
            bcuVarNewBuilder.mergeFrom((bcu) bcwVar);
            bcwVar = bcuVarNewBuilder.buildPartial();
        }
        this.triggeringUser_ = bcwVar;
        this.bitField0_ |= 1;
    }

    public static bcn newBuilder() {
        return (bcn) DEFAULT_INSTANCE.createBuilder();
    }

    public static bco parseDelimitedFrom(InputStream inputStream) {
        return (bco) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bco parseFrom(com.google.v.v vVar) {
        return (bco) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bco> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeParticipants(int i2) {
        ensureParticipantsIsMutable();
        this.participants_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipants(int i2, bcw bcwVar) {
        Objects.requireNonNull(bcwVar);
        ensureParticipantsIsMutable();
        this.participants_.set(i2, bcwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShareDriveId(String str) {
        Objects.requireNonNull(str);
        this.shareDriveId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShareDriveIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.shareDriveId_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTriggeringUser(bcw bcwVar) {
        Objects.requireNonNull(bcwVar);
        this.triggeringUser_ = bcwVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u001b", new Object[]{"bitField0_", "shareDriveId_", "triggeringUser_", "participants_", bcw.class});
        }
        if (iOrdinal == 3) {
            return new bco();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bcn(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bco> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bco.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bcw getParticipants(int i2) {
        return this.participants_.get(i2);
    }

    public int getParticipantsCount() {
        return this.participants_.size();
    }

    public List<bcw> getParticipantsList() {
        return this.participants_;
    }

    public bcx getParticipantsOrBuilder(int i2) {
        return this.participants_.get(i2);
    }

    public List<? extends bcx> getParticipantsOrBuilderList() {
        return this.participants_;
    }

    public String getShareDriveId() {
        return this.shareDriveId_;
    }

    public com.google.v.v getShareDriveIdBytes() {
        return com.google.v.v.s(this.shareDriveId_);
    }

    public bcw getTriggeringUser() {
        bcw bcwVar = this.triggeringUser_;
        return bcwVar == null ? bcw.getDefaultInstance() : bcwVar;
    }

    public boolean hasTriggeringUser() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bcn newBuilder(bco bcoVar) {
        return (bcn) DEFAULT_INSTANCE.createBuilder(bcoVar);
    }

    public static bco parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bco) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bco parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bco) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bco parseFrom(com.google.v.z zVar) {
        return (bco) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bco parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bco) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addParticipants(bcw bcwVar) {
        Objects.requireNonNull(bcwVar);
        ensureParticipantsIsMutable();
        this.participants_.add(bcwVar);
    }

    public static bco parseFrom(InputStream inputStream) {
        return (bco) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bco parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bco) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bco parseFrom(ByteBuffer byteBuffer) {
        return (bco) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bco parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bco) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bco parseFrom(byte[] bArr) {
        return (bco) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bco parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bco) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
