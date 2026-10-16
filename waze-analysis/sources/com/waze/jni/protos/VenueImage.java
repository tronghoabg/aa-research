package com.waze.jni.protos;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import com.waze.jni.protos.Reporter;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class VenueImage extends du<VenueImage, Builder> implements VenueImageOrBuilder {
    public static final int BY_ME_FIELD_NUMBER = 5;
    private static final VenueImage DEFAULT_INSTANCE;
    public static final int LIKED_FIELD_NUMBER = 4;
    private static volatile fo<VenueImage> PARSER = null;
    public static final int REPORTER_FIELD_NUMBER = 3;
    public static final int THUMBNAIL_URL_FIELD_NUMBER = 2;
    public static final int URL_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean byMe_;
    private boolean liked_;
    private Reporter reporter_;
    private String url_ = "";
    private String thumbnailUrl_ = "";

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.VenueImage$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[dt.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[dt.f12882d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12883e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12881c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12884f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12885g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12879a.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12880b.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        VenueImage venueImage = new VenueImage();
        DEFAULT_INSTANCE = venueImage;
        du.registerDefaultInstance(VenueImage.class, venueImage);
    }

    private VenueImage() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearByMe() {
        this.bitField0_ &= -17;
        this.byMe_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLiked() {
        this.bitField0_ &= -9;
        this.liked_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReporter() {
        this.reporter_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearThumbnailUrl() {
        this.bitField0_ &= -3;
        this.thumbnailUrl_ = getDefaultInstance().getThumbnailUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrl() {
        this.bitField0_ &= -2;
        this.url_ = getDefaultInstance().getUrl();
    }

    public static VenueImage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReporter(Reporter reporter) {
        Objects.requireNonNull(reporter);
        Reporter reporter2 = this.reporter_;
        if (reporter2 != null && reporter2 != Reporter.getDefaultInstance()) {
            Reporter.Builder builderNewBuilder = Reporter.newBuilder(reporter2);
            builderNewBuilder.mergeFrom((Reporter.Builder) reporter);
            reporter = builderNewBuilder.buildPartial();
        }
        this.reporter_ = reporter;
        this.bitField0_ |= 4;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static VenueImage parseDelimitedFrom(InputStream inputStream) {
        return (VenueImage) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VenueImage parseFrom(v vVar) {
        return (VenueImage) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<VenueImage> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setByMe(boolean z) {
        this.bitField0_ |= 16;
        this.byMe_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLiked(boolean z) {
        this.bitField0_ |= 8;
        this.liked_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReporter(Reporter reporter) {
        Objects.requireNonNull(reporter);
        this.reporter_ = reporter;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setThumbnailUrl(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.thumbnailUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setThumbnailUrlBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.thumbnailUrl_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrl(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.url_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrlBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.url_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"bitField0_", "url_", "thumbnailUrl_", "reporter_", "liked_", "byMe_"});
        }
        if (iOrdinal == 3) {
            return new VenueImage();
        }
        if (iOrdinal == 4) {
            return new Builder();
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<VenueImage> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (VenueImage.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.VenueImageOrBuilder
    public boolean getByMe() {
        return this.byMe_;
    }

    @Override // com.waze.jni.protos.VenueImageOrBuilder
    public boolean getLiked() {
        return this.liked_;
    }

    @Override // com.waze.jni.protos.VenueImageOrBuilder
    public Reporter getReporter() {
        Reporter reporter = this.reporter_;
        return reporter == null ? Reporter.getDefaultInstance() : reporter;
    }

    @Override // com.waze.jni.protos.VenueImageOrBuilder
    public String getThumbnailUrl() {
        return this.thumbnailUrl_;
    }

    @Override // com.waze.jni.protos.VenueImageOrBuilder
    public v getThumbnailUrlBytes() {
        return v.s(this.thumbnailUrl_);
    }

    @Override // com.waze.jni.protos.VenueImageOrBuilder
    public String getUrl() {
        return this.url_;
    }

    @Override // com.waze.jni.protos.VenueImageOrBuilder
    public v getUrlBytes() {
        return v.s(this.url_);
    }

    @Override // com.waze.jni.protos.VenueImageOrBuilder
    public boolean hasByMe() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.waze.jni.protos.VenueImageOrBuilder
    public boolean hasLiked() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.waze.jni.protos.VenueImageOrBuilder
    public boolean hasReporter() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.waze.jni.protos.VenueImageOrBuilder
    public boolean hasThumbnailUrl() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.waze.jni.protos.VenueImageOrBuilder
    public boolean hasUrl() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(VenueImage venueImage) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(venueImage);
    }

    public static VenueImage parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (VenueImage) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static VenueImage parseFrom(v vVar, de deVar) {
        return (VenueImage) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static VenueImage parseFrom(z zVar) {
        return (VenueImage) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static VenueImage parseFrom(z zVar, de deVar) {
        return (VenueImage) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static VenueImage parseFrom(InputStream inputStream) {
        return (VenueImage) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VenueImage parseFrom(InputStream inputStream, de deVar) {
        return (VenueImage) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static VenueImage parseFrom(ByteBuffer byteBuffer) {
        return (VenueImage) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static VenueImage parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (VenueImage) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<VenueImage, Builder> implements VenueImageOrBuilder {
        private Builder() {
            super(VenueImage.DEFAULT_INSTANCE);
        }

        public Builder clearByMe() {
            copyOnWrite();
            ((VenueImage) this.instance).clearByMe();
            return this;
        }

        public Builder clearLiked() {
            copyOnWrite();
            ((VenueImage) this.instance).clearLiked();
            return this;
        }

        public Builder clearReporter() {
            copyOnWrite();
            ((VenueImage) this.instance).clearReporter();
            return this;
        }

        public Builder clearThumbnailUrl() {
            copyOnWrite();
            ((VenueImage) this.instance).clearThumbnailUrl();
            return this;
        }

        public Builder clearUrl() {
            copyOnWrite();
            ((VenueImage) this.instance).clearUrl();
            return this;
        }

        @Override // com.waze.jni.protos.VenueImageOrBuilder
        public boolean getByMe() {
            return ((VenueImage) this.instance).getByMe();
        }

        @Override // com.waze.jni.protos.VenueImageOrBuilder
        public boolean getLiked() {
            return ((VenueImage) this.instance).getLiked();
        }

        @Override // com.waze.jni.protos.VenueImageOrBuilder
        public Reporter getReporter() {
            return ((VenueImage) this.instance).getReporter();
        }

        @Override // com.waze.jni.protos.VenueImageOrBuilder
        public String getThumbnailUrl() {
            return ((VenueImage) this.instance).getThumbnailUrl();
        }

        @Override // com.waze.jni.protos.VenueImageOrBuilder
        public v getThumbnailUrlBytes() {
            return ((VenueImage) this.instance).getThumbnailUrlBytes();
        }

        @Override // com.waze.jni.protos.VenueImageOrBuilder
        public String getUrl() {
            return ((VenueImage) this.instance).getUrl();
        }

        @Override // com.waze.jni.protos.VenueImageOrBuilder
        public v getUrlBytes() {
            return ((VenueImage) this.instance).getUrlBytes();
        }

        @Override // com.waze.jni.protos.VenueImageOrBuilder
        public boolean hasByMe() {
            return ((VenueImage) this.instance).hasByMe();
        }

        @Override // com.waze.jni.protos.VenueImageOrBuilder
        public boolean hasLiked() {
            return ((VenueImage) this.instance).hasLiked();
        }

        @Override // com.waze.jni.protos.VenueImageOrBuilder
        public boolean hasReporter() {
            return ((VenueImage) this.instance).hasReporter();
        }

        @Override // com.waze.jni.protos.VenueImageOrBuilder
        public boolean hasThumbnailUrl() {
            return ((VenueImage) this.instance).hasThumbnailUrl();
        }

        @Override // com.waze.jni.protos.VenueImageOrBuilder
        public boolean hasUrl() {
            return ((VenueImage) this.instance).hasUrl();
        }

        public Builder mergeReporter(Reporter reporter) {
            copyOnWrite();
            ((VenueImage) this.instance).mergeReporter(reporter);
            return this;
        }

        public Builder setByMe(boolean z) {
            copyOnWrite();
            ((VenueImage) this.instance).setByMe(z);
            return this;
        }

        public Builder setLiked(boolean z) {
            copyOnWrite();
            ((VenueImage) this.instance).setLiked(z);
            return this;
        }

        public Builder setReporter(Reporter.Builder builder) {
            copyOnWrite();
            ((VenueImage) this.instance).setReporter(builder.build());
            return this;
        }

        public Builder setThumbnailUrl(String str) {
            copyOnWrite();
            ((VenueImage) this.instance).setThumbnailUrl(str);
            return this;
        }

        public Builder setThumbnailUrlBytes(v vVar) {
            copyOnWrite();
            ((VenueImage) this.instance).setThumbnailUrlBytes(vVar);
            return this;
        }

        public Builder setUrl(String str) {
            copyOnWrite();
            ((VenueImage) this.instance).setUrl(str);
            return this;
        }

        public Builder setUrlBytes(v vVar) {
            copyOnWrite();
            ((VenueImage) this.instance).setUrlBytes(vVar);
            return this;
        }

        public Builder setReporter(Reporter reporter) {
            copyOnWrite();
            ((VenueImage) this.instance).setReporter(reporter);
            return this;
        }
    }

    public static VenueImage parseFrom(byte[] bArr) {
        return (VenueImage) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static VenueImage parseFrom(byte[] bArr, de deVar) {
        return (VenueImage) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
