package i.b.g;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class n extends du<n, k> implements fj {
    private static final n DEFAULT_INSTANCE;
    public static final int EXPIRES_ON_FIELD_NUMBER = 1014;
    public static final int EXTERNAL_REFERENCE_FIELD_NUMBER = 1012;
    public static final int EXTRA_FIELD_NUMBER = 1006;
    public static final int ID_FIELD_NUMBER = 1001;
    public static final int MESSAGETYPE_FIELD_NUMBER = 1007;
    public static final int MESSAGE_FIELD_NUMBER = 1005;
    private static volatile fo<n> PARSER = null;
    public static final int PREVIEW_FIELD_NUMBER = 1008;
    public static final int SENDER_ID_FIELD_NUMBER = 1009;
    public static final int SENT_FIELD_NUMBER = 1003;
    public static final int THREAD_ID_FIELD_NUMBER = 1010;
    public static final int TITLE_FIELD_NUMBER = 1004;
    public static final int UNREAD_FIELD_NUMBER = 1002;
    public static final int USER_ID_FIELD_NUMBER = 1013;
    public static final int VISIBLE_FIELD_NUMBER = 1011;
    private int bitField0_;
    private long expiresOn_;
    private int messageType_;
    private long senderId_;
    private long sent_;
    private boolean unread_;
    private long userId_;
    private boolean visible_;
    private byte memoizedIsInitialized = 2;
    private String id_ = "";
    private String title_ = "";
    private String message_ = "";
    private eo<i> extra_ = emptyProtobufList();
    private String preview_ = "";
    private String threadId_ = "";
    private eo<b> externalReference_ = emptyProtobufList();

    static {
        n nVar = new n();
        DEFAULT_INSTANCE = nVar;
        du.registerDefaultInstance(n.class, nVar);
    }

    private n() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllExternalReference(Iterable<? extends b> iterable) {
        ensureExternalReferenceIsMutable();
        com.google.v.c.addAll(iterable, this.externalReference_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllExtra(Iterable<? extends i> iterable) {
        ensureExtraIsMutable();
        com.google.v.c.addAll(iterable, this.extra_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExternalReference(int i2, b bVar) {
        Objects.requireNonNull(bVar);
        ensureExternalReferenceIsMutable();
        this.externalReference_.add(i2, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExtra(int i2, i iVar) {
        Objects.requireNonNull(iVar);
        ensureExtraIsMutable();
        this.extra_.add(i2, iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExpiresOn() {
        this.bitField0_ &= -2049;
        this.expiresOn_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExternalReference() {
        this.externalReference_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtra() {
        this.extra_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.bitField0_ &= -2;
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessage() {
        this.bitField0_ &= -17;
        this.message_ = getDefaultInstance().getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessageType() {
        this.bitField0_ &= -33;
        this.messageType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreview() {
        this.bitField0_ &= -65;
        this.preview_ = getDefaultInstance().getPreview();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSenderId() {
        this.bitField0_ &= -129;
        this.senderId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSent() {
        this.bitField0_ &= -5;
        this.sent_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearThreadId() {
        this.bitField0_ &= -257;
        this.threadId_ = getDefaultInstance().getThreadId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.bitField0_ &= -9;
        this.title_ = getDefaultInstance().getTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnread() {
        this.bitField0_ &= -3;
        this.unread_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserId() {
        this.bitField0_ &= -1025;
        this.userId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVisible() {
        this.bitField0_ &= -513;
        this.visible_ = false;
    }

    private void ensureExternalReferenceIsMutable() {
        eo<b> eoVar = this.externalReference_;
        if (eoVar.c()) {
            return;
        }
        this.externalReference_ = du.mutableCopy(eoVar);
    }

    private void ensureExtraIsMutable() {
        eo<i> eoVar = this.extra_;
        if (eoVar.c()) {
            return;
        }
        this.extra_ = du.mutableCopy(eoVar);
    }

    public static n getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static k newBuilder() {
        return (k) DEFAULT_INSTANCE.createBuilder();
    }

    public static n parseDelimitedFrom(InputStream inputStream) {
        return (n) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static n parseFrom(v vVar) {
        return (n) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<n> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeExternalReference(int i2) {
        ensureExternalReferenceIsMutable();
        this.externalReference_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeExtra(int i2) {
        ensureExtraIsMutable();
        this.extra_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExpiresOn(long j2) {
        this.bitField0_ |= 2048;
        this.expiresOn_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExternalReference(int i2, b bVar) {
        Objects.requireNonNull(bVar);
        ensureExternalReferenceIsMutable();
        this.externalReference_.set(i2, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtra(int i2, i iVar) {
        Objects.requireNonNull(iVar);
        ensureExtraIsMutable();
        this.extra_.set(i2, iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(v vVar) {
        this.id_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessage(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.message_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageBytes(v vVar) {
        this.message_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageType(m mVar) {
        this.messageType_ = mVar.getNumber();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreview(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 64;
        this.preview_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreviewBytes(v vVar) {
        this.preview_ = vVar.u();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSenderId(long j2) {
        this.bitField0_ |= 128;
        this.senderId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSent(long j2) {
        this.bitField0_ |= 4;
        this.sent_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setThreadId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 256;
        this.threadId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setThreadIdBytes(v vVar) {
        this.threadId_ = vVar.u();
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitle(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.title_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleBytes(v vVar) {
        this.title_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnread(boolean z) {
        this.bitField0_ |= 2;
        this.unread_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserId(long j2) {
        this.bitField0_ |= 1024;
        this.userId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVisible(boolean z) {
        this.bitField0_ |= 512;
        this.visible_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        byte[] bArr = null;
        switch (dtVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000e\u0000\u0001ϩ϶\u000e\u0000\u0002\u0001ϩဈ\u0000Ϫဇ\u0001ϫတ\u0002Ϭဈ\u0003ϭဈ\u0004ϮЛϯ᠌\u0005ϰဈ\u0006ϱဂ\u0007ϲဈ\bϳဇ\tϴ\u001bϵဂ\n϶ဂ\u000b", new Object[]{"bitField0_", "id_", "unread_", "sent_", "title_", "message_", "extra_", i.class, "messageType_", l.f48456a, "preview_", "senderId_", "threadId_", "visible_", "externalReference_", b.class, "userId_", "expiresOn_"});
            case 3:
                return new n();
            case 4:
                return new k(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                fo<n> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (n.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            default:
                throw null;
        }
    }

    public long getExpiresOn() {
        return this.expiresOn_;
    }

    public b getExternalReference(int i2) {
        return this.externalReference_.get(i2);
    }

    public int getExternalReferenceCount() {
        return this.externalReference_.size();
    }

    public List<b> getExternalReferenceList() {
        return this.externalReference_;
    }

    public c getExternalReferenceOrBuilder(int i2) {
        return this.externalReference_.get(i2);
    }

    public List<? extends c> getExternalReferenceOrBuilderList() {
        return this.externalReference_;
    }

    public i getExtra(int i2) {
        return this.extra_.get(i2);
    }

    public int getExtraCount() {
        return this.extra_.size();
    }

    public List<i> getExtraList() {
        return this.extra_;
    }

    public j getExtraOrBuilder(int i2) {
        return this.extra_.get(i2);
    }

    public List<? extends j> getExtraOrBuilderList() {
        return this.extra_;
    }

    public String getId() {
        return this.id_;
    }

    public v getIdBytes() {
        return v.s(this.id_);
    }

    public String getMessage() {
        return this.message_;
    }

    public v getMessageBytes() {
        return v.s(this.message_);
    }

    public m getMessageType() {
        m mVarA = m.a(this.messageType_);
        return mVarA == null ? m.link : mVarA;
    }

    public String getPreview() {
        return this.preview_;
    }

    public v getPreviewBytes() {
        return v.s(this.preview_);
    }

    public long getSenderId() {
        return this.senderId_;
    }

    public long getSent() {
        return this.sent_;
    }

    public String getThreadId() {
        return this.threadId_;
    }

    public v getThreadIdBytes() {
        return v.s(this.threadId_);
    }

    public String getTitle() {
        return this.title_;
    }

    public v getTitleBytes() {
        return v.s(this.title_);
    }

    public boolean getUnread() {
        return this.unread_;
    }

    public long getUserId() {
        return this.userId_;
    }

    public boolean getVisible() {
        return this.visible_;
    }

    public boolean hasExpiresOn() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasMessage() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasMessageType() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasPreview() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasSenderId() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasSent() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasThreadId() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasTitle() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasUnread() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasUserId() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasVisible() {
        return (this.bitField0_ & 512) != 0;
    }

    public static k newBuilder(n nVar) {
        return (k) DEFAULT_INSTANCE.createBuilder(nVar);
    }

    public static n parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (n) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static n parseFrom(v vVar, de deVar) {
        return (n) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static n parseFrom(z zVar) {
        return (n) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static n parseFrom(z zVar, de deVar) {
        return (n) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExternalReference(b bVar) {
        Objects.requireNonNull(bVar);
        ensureExternalReferenceIsMutable();
        this.externalReference_.add(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExtra(i iVar) {
        Objects.requireNonNull(iVar);
        ensureExtraIsMutable();
        this.extra_.add(iVar);
    }

    public static n parseFrom(InputStream inputStream) {
        return (n) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static n parseFrom(InputStream inputStream, de deVar) {
        return (n) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static n parseFrom(ByteBuffer byteBuffer) {
        return (n) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static n parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (n) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static n parseFrom(byte[] bArr) {
        return (n) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static n parseFrom(byte[] bArr, de deVar) {
        return (n) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
