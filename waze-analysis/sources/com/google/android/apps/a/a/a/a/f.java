package com.google.android.apps.a.a.a.a;

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
/* loaded from: classes4.dex */
public final class f extends du<f, e> implements fj {
    private static final f DEFAULT_INSTANCE;
    public static final int DEPRECATED_SUBFLOWS_FIELD_NUMBER = 7;
    public static final int HSV_URL_FIELD_NUMBER = 4;
    public static final int IS_BACKLOGGED_FIELD_NUMBER = 5;
    public static final int IS_DEPRECATED_FIELD_NUMBER = 8;
    private static volatile fo<f> PARSER = null;
    public static final int SCREENSHOT_URL_FIELD_NUMBER = 3;
    public static final int TEXT_DESCRIPTION_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean isBacklogged_;
    private boolean isDeprecated_;
    private String textDescription_ = "";
    private String screenshotUrl_ = "";
    private String hsvUrl_ = "";
    private eo<h> deprecatedSubflows_ = emptyProtobufList();

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        du.registerDefaultInstance(f.class, fVar);
    }

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDeprecatedSubflows(Iterable<? extends h> iterable) {
        ensureDeprecatedSubflowsIsMutable();
        com.google.v.c.addAll(iterable, this.deprecatedSubflows_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDeprecatedSubflows(int i2, h hVar) {
        Objects.requireNonNull(hVar);
        ensureDeprecatedSubflowsIsMutable();
        this.deprecatedSubflows_.add(i2, hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeprecatedSubflows() {
        this.deprecatedSubflows_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHsvUrl() {
        this.bitField0_ &= -5;
        this.hsvUrl_ = getDefaultInstance().getHsvUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsBacklogged() {
        this.bitField0_ &= -9;
        this.isBacklogged_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsDeprecated() {
        this.bitField0_ &= -17;
        this.isDeprecated_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScreenshotUrl() {
        this.bitField0_ &= -3;
        this.screenshotUrl_ = getDefaultInstance().getScreenshotUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTextDescription() {
        this.bitField0_ &= -2;
        this.textDescription_ = getDefaultInstance().getTextDescription();
    }

    private void ensureDeprecatedSubflowsIsMutable() {
        eo<h> eoVar = this.deprecatedSubflows_;
        if (eoVar.c()) {
            return;
        }
        this.deprecatedSubflows_ = du.mutableCopy(eoVar);
    }

    public static f getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static e newBuilder() {
        return (e) DEFAULT_INSTANCE.createBuilder();
    }

    public static f parseDelimitedFrom(InputStream inputStream) {
        return (f) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static f parseFrom(v vVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<f> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDeprecatedSubflows(int i2) {
        ensureDeprecatedSubflowsIsMutable();
        this.deprecatedSubflows_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeprecatedSubflows(int i2, h hVar) {
        Objects.requireNonNull(hVar);
        ensureDeprecatedSubflowsIsMutable();
        this.deprecatedSubflows_.set(i2, hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHsvUrl(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.hsvUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHsvUrlBytes(v vVar) {
        this.hsvUrl_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsBacklogged(boolean z) {
        this.bitField0_ |= 8;
        this.isBacklogged_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsDeprecated(boolean z) {
        this.bitField0_ |= 16;
        this.isDeprecated_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreenshotUrl(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.screenshotUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreenshotUrlBytes(v vVar) {
        this.screenshotUrl_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextDescription(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.textDescription_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextDescriptionBytes(v vVar) {
        this.textDescription_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0004\u0006\u0000\u0001\u0002\b\u0006\u0000\u0001\u0000\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0007\u001b\bဇ\u0004", new Object[]{"bitField0_", "textDescription_", "screenshotUrl_", "hsvUrl_", "isBacklogged_", "deprecatedSubflows_", h.class, "isDeprecated_"});
        }
        if (iOrdinal == 3) {
            return new f();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new e(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<f> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (f.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Deprecated
    public h getDeprecatedSubflows(int i2) {
        return this.deprecatedSubflows_.get(i2);
    }

    @Deprecated
    public int getDeprecatedSubflowsCount() {
        return this.deprecatedSubflows_.size();
    }

    @Deprecated
    public List<h> getDeprecatedSubflowsList() {
        return this.deprecatedSubflows_;
    }

    @Deprecated
    public i getDeprecatedSubflowsOrBuilder(int i2) {
        return this.deprecatedSubflows_.get(i2);
    }

    @Deprecated
    public List<? extends i> getDeprecatedSubflowsOrBuilderList() {
        return this.deprecatedSubflows_;
    }

    public String getHsvUrl() {
        return this.hsvUrl_;
    }

    public v getHsvUrlBytes() {
        return v.s(this.hsvUrl_);
    }

    public boolean getIsBacklogged() {
        return this.isBacklogged_;
    }

    public boolean getIsDeprecated() {
        return this.isDeprecated_;
    }

    public String getScreenshotUrl() {
        return this.screenshotUrl_;
    }

    public v getScreenshotUrlBytes() {
        return v.s(this.screenshotUrl_);
    }

    public String getTextDescription() {
        return this.textDescription_;
    }

    public v getTextDescriptionBytes() {
        return v.s(this.textDescription_);
    }

    public boolean hasHsvUrl() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasIsBacklogged() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasIsDeprecated() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasScreenshotUrl() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasTextDescription() {
        return (this.bitField0_ & 1) != 0;
    }

    public static e newBuilder(f fVar) {
        return (e) DEFAULT_INSTANCE.createBuilder(fVar);
    }

    public static f parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (f) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static f parseFrom(v vVar, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static f parseFrom(z zVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static f parseFrom(z zVar, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDeprecatedSubflows(h hVar) {
        Objects.requireNonNull(hVar);
        ensureDeprecatedSubflowsIsMutable();
        this.deprecatedSubflows_.add(hVar);
    }

    public static f parseFrom(InputStream inputStream) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static f parseFrom(InputStream inputStream, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static f parseFrom(ByteBuffer byteBuffer) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static f parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static f parseFrom(byte[] bArr) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static f parseFrom(byte[] bArr, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
