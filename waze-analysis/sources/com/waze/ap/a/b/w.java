package com.waze.ap.a.b;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class w extends du<w, v> implements fj {
    private static final w DEFAULT_INSTANCE;
    public static final int ICON_EMOJI_FIELD_NUMBER = 4;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int LONG_NAME_FIELD_NUMBER = 3;
    private static volatile fo<w> PARSER = null;
    public static final int SHORT_NAME_FIELD_NUMBER = 2;
    private String id_ = "";
    private String shortName_ = "";
    private String longName_ = "";
    private String iconEmoji_ = "";

    static {
        w wVar = new w();
        DEFAULT_INSTANCE = wVar;
        du.registerDefaultInstance(w.class, wVar);
    }

    private w() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIconEmoji() {
        this.iconEmoji_ = getDefaultInstance().getIconEmoji();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLongName() {
        this.longName_ = getDefaultInstance().getLongName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShortName() {
        this.shortName_ = getDefaultInstance().getShortName();
    }

    public static w getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static v newBuilder() {
        return (v) DEFAULT_INSTANCE.createBuilder();
    }

    public static w parseDelimitedFrom(InputStream inputStream) {
        return (w) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static w parseFrom(com.google.v.v vVar) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<w> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconEmoji(String str) {
        Objects.requireNonNull(str);
        this.iconEmoji_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconEmojiBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.iconEmoji_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        Objects.requireNonNull(str);
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.id_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLongName(String str) {
        Objects.requireNonNull(str);
        this.longName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLongNameBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.longName_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShortName(String str) {
        Objects.requireNonNull(str);
        this.shortName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShortNameBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.shortName_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"id_", "shortName_", "longName_", "iconEmoji_"});
        }
        if (iOrdinal == 3) {
            return new w();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new v(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<w> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (w.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getIconEmoji() {
        return this.iconEmoji_;
    }

    public com.google.v.v getIconEmojiBytes() {
        return com.google.v.v.s(this.iconEmoji_);
    }

    public String getId() {
        return this.id_;
    }

    public com.google.v.v getIdBytes() {
        return com.google.v.v.s(this.id_);
    }

    public String getLongName() {
        return this.longName_;
    }

    public com.google.v.v getLongNameBytes() {
        return com.google.v.v.s(this.longName_);
    }

    public String getShortName() {
        return this.shortName_;
    }

    public com.google.v.v getShortNameBytes() {
        return com.google.v.v.s(this.shortName_);
    }

    public static v newBuilder(w wVar) {
        return (v) DEFAULT_INSTANCE.createBuilder(wVar);
    }

    public static w parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (w) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static w parseFrom(com.google.v.v vVar, de deVar) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static w parseFrom(z zVar) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static w parseFrom(z zVar, de deVar) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static w parseFrom(InputStream inputStream) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static w parseFrom(InputStream inputStream, de deVar) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static w parseFrom(ByteBuffer byteBuffer) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static w parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static w parseFrom(byte[] bArr) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static w parseFrom(byte[] bArr, de deVar) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
