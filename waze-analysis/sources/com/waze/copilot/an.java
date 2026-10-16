package com.waze.copilot;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class an extends du<an, am> implements ao {
    private static final an DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 8;
    public static final int DOWNLOADABLE_FIELD_NUMBER = 5;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int LANG_FIELD_NUMBER = 3;
    public static final int LOCALE_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile fo<an> PARSER = null;
    public static final int PREVIEW_FIELD_NUMBER = 6;
    public static final int VERSION_FIELD_NUMBER = 9;
    public static final int VOICE_TYPE_FIELD_NUMBER = 7;
    private int bitField0_;
    private b downloadable_;
    private d preview_;
    private int version_;
    private int voiceType_;
    private String id_ = "";
    private String name_ = "";
    private String lang_ = "";
    private String locale_ = "";
    private String description_ = "";

    static {
        an anVar = new an();
        DEFAULT_INSTANCE = anVar;
        du.registerDefaultInstance(an.class, anVar);
    }

    private an() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.bitField0_ &= -129;
        this.description_ = getDefaultInstance().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDownloadable() {
        this.downloadable_ = null;
        this.bitField0_ &= -17;
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
    public void clearPreview() {
        this.preview_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.bitField0_ &= -257;
        this.version_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVoiceType() {
        this.bitField0_ &= -65;
        this.voiceType_ = 0;
    }

    public static an getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDownloadable(b bVar) {
        Objects.requireNonNull(bVar);
        b bVar2 = this.downloadable_;
        if (bVar2 != null && bVar2 != b.getDefaultInstance()) {
            a aVarNewBuilder = b.newBuilder(bVar2);
            aVarNewBuilder.mergeFrom((a) bVar);
            bVar = aVarNewBuilder.buildPartial();
        }
        this.downloadable_ = bVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePreview(d dVar) {
        Objects.requireNonNull(dVar);
        d dVar2 = this.preview_;
        if (dVar2 != null && dVar2 != d.getDefaultInstance()) {
            c cVarNewBuilder = d.newBuilder(dVar2);
            cVarNewBuilder.mergeFrom((c) dVar);
            dVar = cVarNewBuilder.buildPartial();
        }
        this.preview_ = dVar;
        this.bitField0_ |= 32;
    }

    public static am newBuilder() {
        return (am) DEFAULT_INSTANCE.createBuilder();
    }

    public static an parseDelimitedFrom(InputStream inputStream) {
        return (an) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static an parseFrom(com.google.v.v vVar) {
        return (an) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<an> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescription(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 128;
        this.description_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescriptionBytes(com.google.v.v vVar) {
        this.description_ = vVar.u();
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDownloadable(b bVar) {
        Objects.requireNonNull(bVar);
        this.downloadable_ = bVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(com.google.v.v vVar) {
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
    public void setLangBytes(com.google.v.v vVar) {
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
    public void setLocaleBytes(com.google.v.v vVar) {
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
    public void setNameBytes(com.google.v.v vVar) {
        this.name_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreview(d dVar) {
        Objects.requireNonNull(dVar);
        this.preview_ = dVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersion(int i2) {
        this.bitField0_ |= 256;
        this.version_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVoiceType(aq aqVar) {
        this.voiceType_ = aqVar.getNumber();
        this.bitField0_ |= 64;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007᠌\u0006\bဈ\u0007\tင\b", new Object[]{"bitField0_", "id_", "name_", "lang_", "locale_", "downloadable_", "preview_", "voiceType_", ap.f22896a, "description_", "version_"});
        }
        if (iOrdinal == 3) {
            return new an();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new am(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<an> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (an.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getDescription() {
        return this.description_;
    }

    public com.google.v.v getDescriptionBytes() {
        return com.google.v.v.s(this.description_);
    }

    public b getDownloadable() {
        b bVar = this.downloadable_;
        return bVar == null ? b.getDefaultInstance() : bVar;
    }

    public String getId() {
        return this.id_;
    }

    public com.google.v.v getIdBytes() {
        return com.google.v.v.s(this.id_);
    }

    public String getLang() {
        return this.lang_;
    }

    public com.google.v.v getLangBytes() {
        return com.google.v.v.s(this.lang_);
    }

    public String getLocale() {
        return this.locale_;
    }

    public com.google.v.v getLocaleBytes() {
        return com.google.v.v.s(this.locale_);
    }

    public String getName() {
        return this.name_;
    }

    public com.google.v.v getNameBytes() {
        return com.google.v.v.s(this.name_);
    }

    public d getPreview() {
        d dVar = this.preview_;
        return dVar == null ? d.getDefaultInstance() : dVar;
    }

    public int getVersion() {
        return this.version_;
    }

    public aq getVoiceType() {
        aq aqVarA = aq.a(this.voiceType_);
        return aqVarA == null ? aq.VOICE_TYPE_UNSPECIFIED : aqVarA;
    }

    public boolean hasDescription() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasDownloadable() {
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

    public boolean hasPreview() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasVersion() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasVoiceType() {
        return (this.bitField0_ & 64) != 0;
    }

    public static am newBuilder(an anVar) {
        return (am) DEFAULT_INSTANCE.createBuilder(anVar);
    }

    public static an parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (an) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static an parseFrom(com.google.v.v vVar, de deVar) {
        return (an) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static an parseFrom(com.google.v.z zVar) {
        return (an) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static an parseFrom(com.google.v.z zVar, de deVar) {
        return (an) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static an parseFrom(InputStream inputStream) {
        return (an) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static an parseFrom(InputStream inputStream, de deVar) {
        return (an) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static an parseFrom(ByteBuffer byteBuffer) {
        return (an) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static an parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (an) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static an parseFrom(byte[] bArr) {
        return (an) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static an parseFrom(byte[] bArr, de deVar) {
        return (an) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
