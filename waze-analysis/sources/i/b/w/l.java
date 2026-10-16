package i.b.w;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class l extends du<l, k> implements m {
    public static final int CREATED_BY_FIELD_NUMBER = 10;
    public static final int CREATED_ON_FIELD_NUMBER = 9;
    private static final l DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 5;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int LANG_FIELD_NUMBER = 3;
    public static final int LOCALE_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile fo<l> PARSER = null;
    public static final int REVISION_FIELD_NUMBER = 12;
    public static final int TYPE_FIELD_NUMBER = 8;
    public static final int UPDATED_ON_FIELD_NUMBER = 11;
    public static final int VERSION_FIELD_NUMBER = 6;
    public static final int VISIBLE_FIELD_NUMBER = 7;
    private int bitField0_;
    private long createdBy_;
    private long createdOn_;
    private int revision_;
    private int type_;
    private long updatedOn_;
    private boolean visible_;
    private String id_ = "";
    private String name_ = "";
    private String lang_ = "";
    private String locale_ = "";
    private String description_ = "";
    private String version_ = "";

    static {
        l lVar = new l();
        DEFAULT_INSTANCE = lVar;
        du.registerDefaultInstance(l.class, lVar);
    }

    private l() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreatedBy() {
        this.bitField0_ &= -513;
        this.createdBy_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreatedOn() {
        this.bitField0_ &= -257;
        this.createdOn_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.bitField0_ &= -17;
        this.description_ = getDefaultInstance().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.bitField0_ &= -2;
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLang() {
        this.bitField0_ &= -5;
        this.lang_ = getDefaultInstance().getLang();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocale() {
        this.bitField0_ &= -9;
        this.locale_ = getDefaultInstance().getLocale();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -3;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRevision() {
        this.bitField0_ &= -2049;
        this.revision_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -129;
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpdatedOn() {
        this.bitField0_ &= -1025;
        this.updatedOn_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.bitField0_ &= -33;
        this.version_ = getDefaultInstance().getVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVisible() {
        this.bitField0_ &= -65;
        this.visible_ = false;
    }

    public static l getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static k newBuilder() {
        return (k) DEFAULT_INSTANCE.createBuilder();
    }

    public static l parseDelimitedFrom(InputStream inputStream) {
        return (l) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static l parseFrom(v vVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<l> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreatedBy(long j2) {
        this.bitField0_ |= 512;
        this.createdBy_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreatedOn(long j2) {
        this.bitField0_ |= 256;
        this.createdOn_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescription(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.description_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescriptionBytes(v vVar) {
        this.description_ = vVar.u();
        this.bitField0_ |= 16;
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
    public void setLang(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.lang_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLangBytes(v vVar) {
        this.lang_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocale(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.locale_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocaleBytes(v vVar) {
        this.locale_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(v vVar) {
        this.name_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRevision(int i2) {
        this.bitField0_ |= 2048;
        this.revision_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(int i2) {
        this.bitField0_ |= 128;
        this.type_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdatedOn(long j2) {
        this.bitField0_ |= 1024;
        this.updatedOn_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersion(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.version_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersionBytes(v vVar) {
        this.version_ = vVar.u();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVisible(boolean z) {
        this.bitField0_ |= 64;
        this.visible_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bင\u0007\tဂ\b\nဂ\t\u000bဂ\n\fင\u000b", new Object[]{"bitField0_", "id_", "name_", "lang_", "locale_", "description_", "version_", "visible_", "type_", "createdOn_", "createdBy_", "updatedOn_", "revision_"});
        }
        if (iOrdinal == 3) {
            return new l();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new k(bArr);
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

    public long getCreatedBy() {
        return this.createdBy_;
    }

    public long getCreatedOn() {
        return this.createdOn_;
    }

    public String getDescription() {
        return this.description_;
    }

    public v getDescriptionBytes() {
        return v.s(this.description_);
    }

    public String getId() {
        return this.id_;
    }

    public v getIdBytes() {
        return v.s(this.id_);
    }

    public String getLang() {
        return this.lang_;
    }

    public v getLangBytes() {
        return v.s(this.lang_);
    }

    public String getLocale() {
        return this.locale_;
    }

    public v getLocaleBytes() {
        return v.s(this.locale_);
    }

    public String getName() {
        return this.name_;
    }

    public v getNameBytes() {
        return v.s(this.name_);
    }

    public int getRevision() {
        return this.revision_;
    }

    public int getType() {
        return this.type_;
    }

    public long getUpdatedOn() {
        return this.updatedOn_;
    }

    public String getVersion() {
        return this.version_;
    }

    public v getVersionBytes() {
        return v.s(this.version_);
    }

    public boolean getVisible() {
        return this.visible_;
    }

    public boolean hasCreatedBy() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasCreatedOn() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasDescription() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasLang() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasLocale() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasName() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasRevision() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasType() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasUpdatedOn() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasVersion() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasVisible() {
        return (this.bitField0_ & 64) != 0;
    }

    public static k newBuilder(l lVar) {
        return (k) DEFAULT_INSTANCE.createBuilder(lVar);
    }

    public static l parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (l) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static l parseFrom(v vVar, de deVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static l parseFrom(z zVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static l parseFrom(z zVar, de deVar) {
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
