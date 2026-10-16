package com.waze.jni.protos;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import com.waze.jni.protos.common.SkinState;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class EtaLabelData extends du<EtaLabelData, Builder> implements EtaLabelDataOrBuilder {
    public static final int BACKGROUND_COLOR_FIELD_NUMBER = 7;
    private static final EtaLabelData DEFAULT_INSTANCE;
    public static final int DPI_FIELD_NUMBER = 8;
    public static final int IMAGE_FIELD_NUMBER = 3;
    public static final int IMAGE_TYPE_FIELD_NUMBER = 9;
    private static volatile fo<EtaLabelData> PARSER = null;
    public static final int SKIN_STATE_FIELD_NUMBER = 4;
    public static final int SUBTITLE_COLOR_FIELD_NUMBER = 6;
    public static final int SUB_TITLE_FIELD_NUMBER = 2;
    public static final int TITLE_COLOR_FIELD_NUMBER = 5;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int backgroundColor_;
    private int bitField0_;
    private int dpi_;
    private int imageType_;
    private int skinState_;
    private int subtitleColor_;
    private int titleColor_;
    private String title_ = "";
    private String subTitle_ = "";
    private String image_ = "";

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.EtaLabelData$1, reason: invalid class name */
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

    /* compiled from: WazeSource */
    public final class Builder extends dm<EtaLabelData, Builder> implements EtaLabelDataOrBuilder {
        private Builder() {
            super(EtaLabelData.DEFAULT_INSTANCE);
        }

        public Builder clearBackgroundColor() {
            copyOnWrite();
            ((EtaLabelData) this.instance).clearBackgroundColor();
            return this;
        }

        public Builder clearDpi() {
            copyOnWrite();
            ((EtaLabelData) this.instance).clearDpi();
            return this;
        }

        public Builder clearImage() {
            copyOnWrite();
            ((EtaLabelData) this.instance).clearImage();
            return this;
        }

        public Builder clearImageType() {
            copyOnWrite();
            ((EtaLabelData) this.instance).clearImageType();
            return this;
        }

        public Builder clearSkinState() {
            copyOnWrite();
            ((EtaLabelData) this.instance).clearSkinState();
            return this;
        }

        public Builder clearSubTitle() {
            copyOnWrite();
            ((EtaLabelData) this.instance).clearSubTitle();
            return this;
        }

        public Builder clearSubtitleColor() {
            copyOnWrite();
            ((EtaLabelData) this.instance).clearSubtitleColor();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((EtaLabelData) this.instance).clearTitle();
            return this;
        }

        public Builder clearTitleColor() {
            copyOnWrite();
            ((EtaLabelData) this.instance).clearTitleColor();
            return this;
        }

        @Override // com.waze.jni.protos.EtaLabelDataOrBuilder
        public int getBackgroundColor() {
            return ((EtaLabelData) this.instance).getBackgroundColor();
        }

        @Override // com.waze.jni.protos.EtaLabelDataOrBuilder
        public int getDpi() {
            return ((EtaLabelData) this.instance).getDpi();
        }

        @Override // com.waze.jni.protos.EtaLabelDataOrBuilder
        public String getImage() {
            return ((EtaLabelData) this.instance).getImage();
        }

        @Override // com.waze.jni.protos.EtaLabelDataOrBuilder
        public v getImageBytes() {
            return ((EtaLabelData) this.instance).getImageBytes();
        }

        @Override // com.waze.jni.protos.EtaLabelDataOrBuilder
        public int getImageType() {
            return ((EtaLabelData) this.instance).getImageType();
        }

        @Override // com.waze.jni.protos.EtaLabelDataOrBuilder
        public SkinState getSkinState() {
            return ((EtaLabelData) this.instance).getSkinState();
        }

        @Override // com.waze.jni.protos.EtaLabelDataOrBuilder
        public int getSkinStateValue() {
            return ((EtaLabelData) this.instance).getSkinStateValue();
        }

        @Override // com.waze.jni.protos.EtaLabelDataOrBuilder
        public String getSubTitle() {
            return ((EtaLabelData) this.instance).getSubTitle();
        }

        @Override // com.waze.jni.protos.EtaLabelDataOrBuilder
        public v getSubTitleBytes() {
            return ((EtaLabelData) this.instance).getSubTitleBytes();
        }

        @Override // com.waze.jni.protos.EtaLabelDataOrBuilder
        public int getSubtitleColor() {
            return ((EtaLabelData) this.instance).getSubtitleColor();
        }

        @Override // com.waze.jni.protos.EtaLabelDataOrBuilder
        public String getTitle() {
            return ((EtaLabelData) this.instance).getTitle();
        }

        @Override // com.waze.jni.protos.EtaLabelDataOrBuilder
        public v getTitleBytes() {
            return ((EtaLabelData) this.instance).getTitleBytes();
        }

        @Override // com.waze.jni.protos.EtaLabelDataOrBuilder
        public int getTitleColor() {
            return ((EtaLabelData) this.instance).getTitleColor();
        }

        @Override // com.waze.jni.protos.EtaLabelDataOrBuilder
        public boolean hasImage() {
            return ((EtaLabelData) this.instance).hasImage();
        }

        @Override // com.waze.jni.protos.EtaLabelDataOrBuilder
        public boolean hasImageType() {
            return ((EtaLabelData) this.instance).hasImageType();
        }

        @Override // com.waze.jni.protos.EtaLabelDataOrBuilder
        public boolean hasSubTitle() {
            return ((EtaLabelData) this.instance).hasSubTitle();
        }

        @Override // com.waze.jni.protos.EtaLabelDataOrBuilder
        public boolean hasSubtitleColor() {
            return ((EtaLabelData) this.instance).hasSubtitleColor();
        }

        public Builder setBackgroundColor(int i2) {
            copyOnWrite();
            ((EtaLabelData) this.instance).setBackgroundColor(i2);
            return this;
        }

        public Builder setDpi(int i2) {
            copyOnWrite();
            ((EtaLabelData) this.instance).setDpi(i2);
            return this;
        }

        public Builder setImage(String str) {
            copyOnWrite();
            ((EtaLabelData) this.instance).setImage(str);
            return this;
        }

        public Builder setImageBytes(v vVar) {
            copyOnWrite();
            ((EtaLabelData) this.instance).setImageBytes(vVar);
            return this;
        }

        public Builder setImageType(int i2) {
            copyOnWrite();
            ((EtaLabelData) this.instance).setImageType(i2);
            return this;
        }

        public Builder setSkinState(SkinState skinState) {
            copyOnWrite();
            ((EtaLabelData) this.instance).setSkinState(skinState);
            return this;
        }

        public Builder setSkinStateValue(int i2) {
            copyOnWrite();
            ((EtaLabelData) this.instance).setSkinStateValue(i2);
            return this;
        }

        public Builder setSubTitle(String str) {
            copyOnWrite();
            ((EtaLabelData) this.instance).setSubTitle(str);
            return this;
        }

        public Builder setSubTitleBytes(v vVar) {
            copyOnWrite();
            ((EtaLabelData) this.instance).setSubTitleBytes(vVar);
            return this;
        }

        public Builder setSubtitleColor(int i2) {
            copyOnWrite();
            ((EtaLabelData) this.instance).setSubtitleColor(i2);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((EtaLabelData) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(v vVar) {
            copyOnWrite();
            ((EtaLabelData) this.instance).setTitleBytes(vVar);
            return this;
        }

        public Builder setTitleColor(int i2) {
            copyOnWrite();
            ((EtaLabelData) this.instance).setTitleColor(i2);
            return this;
        }
    }

    static {
        EtaLabelData etaLabelData = new EtaLabelData();
        DEFAULT_INSTANCE = etaLabelData;
        du.registerDefaultInstance(EtaLabelData.class, etaLabelData);
    }

    private EtaLabelData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBackgroundColor() {
        this.backgroundColor_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDpi() {
        this.dpi_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImage() {
        this.bitField0_ &= -3;
        this.image_ = getDefaultInstance().getImage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImageType() {
        this.bitField0_ &= -9;
        this.imageType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSkinState() {
        this.skinState_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubTitle() {
        this.bitField0_ &= -2;
        this.subTitle_ = getDefaultInstance().getSubTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubtitleColor() {
        this.bitField0_ &= -5;
        this.subtitleColor_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitleColor() {
        this.titleColor_ = 0;
    }

    public static EtaLabelData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static EtaLabelData parseDelimitedFrom(InputStream inputStream) {
        return (EtaLabelData) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EtaLabelData parseFrom(v vVar) {
        return (EtaLabelData) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<EtaLabelData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBackgroundColor(int i2) {
        this.backgroundColor_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDpi(int i2) {
        this.dpi_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImage(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.image_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.image_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageType(int i2) {
        this.bitField0_ |= 8;
        this.imageType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSkinState(SkinState skinState) {
        this.skinState_ = skinState.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSkinStateValue(int i2) {
        this.skinState_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubTitle(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.subTitle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubTitleBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.subTitle_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubtitleColor(int i2) {
        this.bitField0_ |= 4;
        this.subtitleColor_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitle(String str) {
        Objects.requireNonNull(str);
        this.title_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.title_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleColor(int i2) {
        this.titleColor_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000\u0003ለ\u0001\u0004\f\u0005\u000b\u0006ဋ\u0002\u0007\u000b\b\u0004\tင\u0003", new Object[]{"bitField0_", "title_", "subTitle_", "image_", "skinState_", "titleColor_", "subtitleColor_", "backgroundColor_", "dpi_", "imageType_"});
        }
        if (iOrdinal == 3) {
            return new EtaLabelData();
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
        fo<EtaLabelData> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (EtaLabelData.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.EtaLabelDataOrBuilder
    public int getBackgroundColor() {
        return this.backgroundColor_;
    }

    @Override // com.waze.jni.protos.EtaLabelDataOrBuilder
    public int getDpi() {
        return this.dpi_;
    }

    @Override // com.waze.jni.protos.EtaLabelDataOrBuilder
    public String getImage() {
        return this.image_;
    }

    @Override // com.waze.jni.protos.EtaLabelDataOrBuilder
    public v getImageBytes() {
        return v.s(this.image_);
    }

    @Override // com.waze.jni.protos.EtaLabelDataOrBuilder
    public int getImageType() {
        return this.imageType_;
    }

    @Override // com.waze.jni.protos.EtaLabelDataOrBuilder
    public SkinState getSkinState() {
        SkinState skinStateForNumber = SkinState.forNumber(this.skinState_);
        return skinStateForNumber == null ? SkinState.UNRECOGNIZED : skinStateForNumber;
    }

    @Override // com.waze.jni.protos.EtaLabelDataOrBuilder
    public int getSkinStateValue() {
        return this.skinState_;
    }

    @Override // com.waze.jni.protos.EtaLabelDataOrBuilder
    public String getSubTitle() {
        return this.subTitle_;
    }

    @Override // com.waze.jni.protos.EtaLabelDataOrBuilder
    public v getSubTitleBytes() {
        return v.s(this.subTitle_);
    }

    @Override // com.waze.jni.protos.EtaLabelDataOrBuilder
    public int getSubtitleColor() {
        return this.subtitleColor_;
    }

    @Override // com.waze.jni.protos.EtaLabelDataOrBuilder
    public String getTitle() {
        return this.title_;
    }

    @Override // com.waze.jni.protos.EtaLabelDataOrBuilder
    public v getTitleBytes() {
        return v.s(this.title_);
    }

    @Override // com.waze.jni.protos.EtaLabelDataOrBuilder
    public int getTitleColor() {
        return this.titleColor_;
    }

    @Override // com.waze.jni.protos.EtaLabelDataOrBuilder
    public boolean hasImage() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.waze.jni.protos.EtaLabelDataOrBuilder
    public boolean hasImageType() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.waze.jni.protos.EtaLabelDataOrBuilder
    public boolean hasSubTitle() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.waze.jni.protos.EtaLabelDataOrBuilder
    public boolean hasSubtitleColor() {
        return (this.bitField0_ & 4) != 0;
    }

    public static Builder newBuilder(EtaLabelData etaLabelData) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(etaLabelData);
    }

    public static EtaLabelData parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (EtaLabelData) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static EtaLabelData parseFrom(v vVar, de deVar) {
        return (EtaLabelData) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static EtaLabelData parseFrom(z zVar) {
        return (EtaLabelData) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static EtaLabelData parseFrom(z zVar, de deVar) {
        return (EtaLabelData) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static EtaLabelData parseFrom(InputStream inputStream) {
        return (EtaLabelData) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EtaLabelData parseFrom(InputStream inputStream, de deVar) {
        return (EtaLabelData) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static EtaLabelData parseFrom(ByteBuffer byteBuffer) {
        return (EtaLabelData) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static EtaLabelData parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (EtaLabelData) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static EtaLabelData parseFrom(byte[] bArr) {
        return (EtaLabelData) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EtaLabelData parseFrom(byte[] bArr, de deVar) {
        return (EtaLabelData) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
