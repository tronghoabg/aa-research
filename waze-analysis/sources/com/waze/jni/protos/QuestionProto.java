package com.waze.jni.protos;

import com.google.v.c;
import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eg;
import com.google.v.eh;
import com.google.v.ei;
import com.google.v.eo;
import com.google.v.ep;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class QuestionProto extends du<QuestionProto, Builder> implements QuestionProtoOrBuilder {
    public static final int ALWAYS_SHOW_FIELD_NUMBER = 11;
    public static final int BUTTON_ORIENTATION_FIELD_NUMBER = 7;
    public static final int CTAS_FIELD_NUMBER = 5;
    private static final QuestionProto DEFAULT_INSTANCE;
    public static final int DISMISSIBLE_FIELD_NUMBER = 12;
    public static final int DISPLAY_TIME_SEC_FIELD_NUMBER = 9;
    public static final int ENC_TEMPLATE_FIELD_NUMBER = 10;
    public static final int IMAGE_URL_FIELD_NUMBER = 4;
    public static final int KEY_FIELD_NUMBER = 8;
    public static final int LINKS_FIELD_NUMBER = 6;
    private static volatile fo<QuestionProto> PARSER = null;
    public static final int QUESTION_ID_FIELD_NUMBER = 1;
    public static final int SUBTITLE_FIELD_NUMBER = 3;
    public static final int TEXT_FIELD_NUMBER = 2;
    private boolean alwaysShow_;
    private int bitField0_;
    private int buttonOrientation_;
    private boolean dismissible_;
    private int displayTimeSec_;
    private int encTemplate_;
    private String questionId_ = "";
    private String text_ = "";
    private String subtitle_ = "";
    private String imageUrl_ = "";
    private eo<CallToAction> ctas_ = emptyProtobufList();
    private eo<Link> links_ = emptyProtobufList();
    private String key_ = "";

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.QuestionProto$1, reason: invalid class name */
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
    public interface CallToActionOrBuilder extends fj {
        int getBgColor();

        String getIcon();

        v getIconBytes();

        String getId();

        v getIdBytes();

        String getText();

        v getTextBytes();

        int getTextColor();

        String getUrl();

        v getUrlBytes();

        float getWidthRatio();

        boolean hasIcon();

        boolean hasId();

        boolean hasText();

        boolean hasUrl();
    }

    /* compiled from: WazeSource */
    public enum EncTemplate implements eg {
        UNKNOWN(0),
        FULLSCREEN(1),
        MESSAGE_BOX(2),
        APP_LAUNCH_DIALOG(3),
        UNRECOGNIZED(-1);

        public static final int APP_LAUNCH_DIALOG_VALUE = 3;
        public static final int FULLSCREEN_VALUE = 1;
        public static final int MESSAGE_BOX_VALUE = 2;
        public static final int UNKNOWN_VALUE = 0;
        private static final eh<EncTemplate> internalValueMap = new eh<EncTemplate>() { // from class: com.waze.jni.protos.QuestionProto.EncTemplate.1
            @Override // com.google.v.eh
            public EncTemplate findValueByNumber(int i2) {
                return EncTemplate.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class EncTemplateVerifier implements ei {
            static final ei INSTANCE = new EncTemplateVerifier();

            private EncTemplateVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return EncTemplate.forNumber(i2) != null;
            }
        }

        EncTemplate(int i2) {
            this.value = i2;
        }

        public static EncTemplate forNumber(int i2) {
            if (i2 == 0) {
                return UNKNOWN;
            }
            if (i2 == 1) {
                return FULLSCREEN;
            }
            if (i2 == 2) {
                return MESSAGE_BOX;
            }
            if (i2 != 3) {
                return null;
            }
            return APP_LAUNCH_DIALOG;
        }

        public static eh<EncTemplate> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return EncTemplateVerifier.INSTANCE;
        }

        @Override // com.google.v.eg
        public final int getNumber() {
            return this == UNRECOGNIZED ? ep.b() : this.value;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return Integer.toString(this.value);
        }
    }

    /* compiled from: WazeSource */
    public interface LinkOrBuilder extends fj {
        String getCaption();

        v getCaptionBytes();

        String getTitle();

        v getTitleBytes();

        String getUrl();

        v getUrlBytes();

        boolean hasCaption();

        boolean hasTitle();

        boolean hasUrl();
    }

    static {
        QuestionProto questionProto = new QuestionProto();
        DEFAULT_INSTANCE = questionProto;
        du.registerDefaultInstance(QuestionProto.class, questionProto);
    }

    private QuestionProto() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCtas(Iterable<? extends CallToAction> iterable) {
        ensureCtasIsMutable();
        c.addAll(iterable, this.ctas_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLinks(Iterable<? extends Link> iterable) {
        ensureLinksIsMutable();
        c.addAll(iterable, this.links_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCtas(int i2, CallToAction callToAction) {
        Objects.requireNonNull(callToAction);
        ensureCtasIsMutable();
        this.ctas_.add(i2, callToAction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLinks(int i2, Link link) {
        Objects.requireNonNull(link);
        ensureLinksIsMutable();
        this.links_.add(i2, link);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlwaysShow() {
        this.alwaysShow_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearButtonOrientation() {
        this.buttonOrientation_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCtas() {
        this.ctas_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDismissible() {
        this.dismissible_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisplayTimeSec() {
        this.displayTimeSec_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEncTemplate() {
        this.encTemplate_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImageUrl() {
        this.bitField0_ &= -9;
        this.imageUrl_ = getDefaultInstance().getImageUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKey() {
        this.bitField0_ &= -17;
        this.key_ = getDefaultInstance().getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLinks() {
        this.links_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuestionId() {
        this.bitField0_ &= -2;
        this.questionId_ = getDefaultInstance().getQuestionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubtitle() {
        this.bitField0_ &= -5;
        this.subtitle_ = getDefaultInstance().getSubtitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearText() {
        this.bitField0_ &= -3;
        this.text_ = getDefaultInstance().getText();
    }

    private void ensureCtasIsMutable() {
        eo<CallToAction> eoVar = this.ctas_;
        if (eoVar.c()) {
            return;
        }
        this.ctas_ = du.mutableCopy(eoVar);
    }

    private void ensureLinksIsMutable() {
        eo<Link> eoVar = this.links_;
        if (eoVar.c()) {
            return;
        }
        this.links_ = du.mutableCopy(eoVar);
    }

    public static QuestionProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static QuestionProto parseDelimitedFrom(InputStream inputStream) {
        return (QuestionProto) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static QuestionProto parseFrom(v vVar) {
        return (QuestionProto) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<QuestionProto> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeCtas(int i2) {
        ensureCtasIsMutable();
        this.ctas_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLinks(int i2) {
        ensureLinksIsMutable();
        this.links_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlwaysShow(boolean z) {
        this.alwaysShow_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButtonOrientation(int i2) {
        this.buttonOrientation_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCtas(int i2, CallToAction callToAction) {
        Objects.requireNonNull(callToAction);
        ensureCtasIsMutable();
        this.ctas_.set(i2, callToAction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDismissible(boolean z) {
        this.dismissible_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayTimeSec(int i2) {
        this.displayTimeSec_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEncTemplate(EncTemplate encTemplate) {
        this.encTemplate_ = encTemplate.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEncTemplateValue(int i2) {
        this.encTemplate_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageUrl(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.imageUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageUrlBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.imageUrl_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKey(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.key_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.key_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinks(int i2, Link link) {
        Objects.requireNonNull(link);
        ensureLinksIsMutable();
        this.links_.set(i2, link);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuestionId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.questionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuestionIdBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.questionId_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubtitle(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.subtitle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubtitleBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.subtitle_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setText(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.text_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.text_ = vVar.u();
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0001\u0001\f\f\u0000\u0002\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005\u001b\u0006\u001b\u0007\u0004\bለ\u0004\t\u0004\n\f\u000b\u0007\f\u0007", new Object[]{"bitField0_", "questionId_", "text_", "subtitle_", "imageUrl_", "ctas_", CallToAction.class, "links_", Link.class, "buttonOrientation_", "key_", "displayTimeSec_", "encTemplate_", "alwaysShow_", "dismissible_"});
        }
        if (iOrdinal == 3) {
            return new QuestionProto();
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
        fo<QuestionProto> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (QuestionProto.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.QuestionProtoOrBuilder
    public boolean getAlwaysShow() {
        return this.alwaysShow_;
    }

    @Override // com.waze.jni.protos.QuestionProtoOrBuilder
    public int getButtonOrientation() {
        return this.buttonOrientation_;
    }

    @Override // com.waze.jni.protos.QuestionProtoOrBuilder
    public CallToAction getCtas(int i2) {
        return this.ctas_.get(i2);
    }

    @Override // com.waze.jni.protos.QuestionProtoOrBuilder
    public int getCtasCount() {
        return this.ctas_.size();
    }

    @Override // com.waze.jni.protos.QuestionProtoOrBuilder
    public List<CallToAction> getCtasList() {
        return this.ctas_;
    }

    public CallToActionOrBuilder getCtasOrBuilder(int i2) {
        return this.ctas_.get(i2);
    }

    public List<? extends CallToActionOrBuilder> getCtasOrBuilderList() {
        return this.ctas_;
    }

    @Override // com.waze.jni.protos.QuestionProtoOrBuilder
    public boolean getDismissible() {
        return this.dismissible_;
    }

    @Override // com.waze.jni.protos.QuestionProtoOrBuilder
    public int getDisplayTimeSec() {
        return this.displayTimeSec_;
    }

    @Override // com.waze.jni.protos.QuestionProtoOrBuilder
    public EncTemplate getEncTemplate() {
        EncTemplate encTemplateForNumber = EncTemplate.forNumber(this.encTemplate_);
        return encTemplateForNumber == null ? EncTemplate.UNRECOGNIZED : encTemplateForNumber;
    }

    @Override // com.waze.jni.protos.QuestionProtoOrBuilder
    public int getEncTemplateValue() {
        return this.encTemplate_;
    }

    @Override // com.waze.jni.protos.QuestionProtoOrBuilder
    public String getImageUrl() {
        return this.imageUrl_;
    }

    @Override // com.waze.jni.protos.QuestionProtoOrBuilder
    public v getImageUrlBytes() {
        return v.s(this.imageUrl_);
    }

    @Override // com.waze.jni.protos.QuestionProtoOrBuilder
    public String getKey() {
        return this.key_;
    }

    @Override // com.waze.jni.protos.QuestionProtoOrBuilder
    public v getKeyBytes() {
        return v.s(this.key_);
    }

    @Override // com.waze.jni.protos.QuestionProtoOrBuilder
    public Link getLinks(int i2) {
        return this.links_.get(i2);
    }

    @Override // com.waze.jni.protos.QuestionProtoOrBuilder
    public int getLinksCount() {
        return this.links_.size();
    }

    @Override // com.waze.jni.protos.QuestionProtoOrBuilder
    public List<Link> getLinksList() {
        return this.links_;
    }

    public LinkOrBuilder getLinksOrBuilder(int i2) {
        return this.links_.get(i2);
    }

    public List<? extends LinkOrBuilder> getLinksOrBuilderList() {
        return this.links_;
    }

    @Override // com.waze.jni.protos.QuestionProtoOrBuilder
    public String getQuestionId() {
        return this.questionId_;
    }

    @Override // com.waze.jni.protos.QuestionProtoOrBuilder
    public v getQuestionIdBytes() {
        return v.s(this.questionId_);
    }

    @Override // com.waze.jni.protos.QuestionProtoOrBuilder
    public String getSubtitle() {
        return this.subtitle_;
    }

    @Override // com.waze.jni.protos.QuestionProtoOrBuilder
    public v getSubtitleBytes() {
        return v.s(this.subtitle_);
    }

    @Override // com.waze.jni.protos.QuestionProtoOrBuilder
    public String getText() {
        return this.text_;
    }

    @Override // com.waze.jni.protos.QuestionProtoOrBuilder
    public v getTextBytes() {
        return v.s(this.text_);
    }

    @Override // com.waze.jni.protos.QuestionProtoOrBuilder
    public boolean hasImageUrl() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.waze.jni.protos.QuestionProtoOrBuilder
    public boolean hasKey() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.waze.jni.protos.QuestionProtoOrBuilder
    public boolean hasQuestionId() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.waze.jni.protos.QuestionProtoOrBuilder
    public boolean hasSubtitle() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.waze.jni.protos.QuestionProtoOrBuilder
    public boolean hasText() {
        return (this.bitField0_ & 2) != 0;
    }

    /* compiled from: WazeSource */
    public final class CallToAction extends du<CallToAction, Builder> implements CallToActionOrBuilder {
        public static final int BG_COLOR_FIELD_NUMBER = 5;
        private static final CallToAction DEFAULT_INSTANCE;
        public static final int ICON_FIELD_NUMBER = 4;
        public static final int ID_FIELD_NUMBER = 3;
        private static volatile fo<CallToAction> PARSER = null;
        public static final int TEXT_COLOR_FIELD_NUMBER = 6;
        public static final int TEXT_FIELD_NUMBER = 1;
        public static final int URL_FIELD_NUMBER = 2;
        public static final int WIDTH_RATIO_FIELD_NUMBER = 7;
        private int bgColor_;
        private int bitField0_;
        private int textColor_;
        private float widthRatio_;
        private String text_ = "";
        private String url_ = "";
        private String id_ = "";
        private String icon_ = "";

        /* compiled from: WazeSource */
        public final class Builder extends dm<CallToAction, Builder> implements CallToActionOrBuilder {
            private Builder() {
                super(CallToAction.DEFAULT_INSTANCE);
            }

            public Builder clearBgColor() {
                copyOnWrite();
                ((CallToAction) this.instance).clearBgColor();
                return this;
            }

            public Builder clearIcon() {
                copyOnWrite();
                ((CallToAction) this.instance).clearIcon();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((CallToAction) this.instance).clearId();
                return this;
            }

            public Builder clearText() {
                copyOnWrite();
                ((CallToAction) this.instance).clearText();
                return this;
            }

            public Builder clearTextColor() {
                copyOnWrite();
                ((CallToAction) this.instance).clearTextColor();
                return this;
            }

            public Builder clearUrl() {
                copyOnWrite();
                ((CallToAction) this.instance).clearUrl();
                return this;
            }

            public Builder clearWidthRatio() {
                copyOnWrite();
                ((CallToAction) this.instance).clearWidthRatio();
                return this;
            }

            @Override // com.waze.jni.protos.QuestionProto.CallToActionOrBuilder
            public int getBgColor() {
                return ((CallToAction) this.instance).getBgColor();
            }

            @Override // com.waze.jni.protos.QuestionProto.CallToActionOrBuilder
            public String getIcon() {
                return ((CallToAction) this.instance).getIcon();
            }

            @Override // com.waze.jni.protos.QuestionProto.CallToActionOrBuilder
            public v getIconBytes() {
                return ((CallToAction) this.instance).getIconBytes();
            }

            @Override // com.waze.jni.protos.QuestionProto.CallToActionOrBuilder
            public String getId() {
                return ((CallToAction) this.instance).getId();
            }

            @Override // com.waze.jni.protos.QuestionProto.CallToActionOrBuilder
            public v getIdBytes() {
                return ((CallToAction) this.instance).getIdBytes();
            }

            @Override // com.waze.jni.protos.QuestionProto.CallToActionOrBuilder
            public String getText() {
                return ((CallToAction) this.instance).getText();
            }

            @Override // com.waze.jni.protos.QuestionProto.CallToActionOrBuilder
            public v getTextBytes() {
                return ((CallToAction) this.instance).getTextBytes();
            }

            @Override // com.waze.jni.protos.QuestionProto.CallToActionOrBuilder
            public int getTextColor() {
                return ((CallToAction) this.instance).getTextColor();
            }

            @Override // com.waze.jni.protos.QuestionProto.CallToActionOrBuilder
            public String getUrl() {
                return ((CallToAction) this.instance).getUrl();
            }

            @Override // com.waze.jni.protos.QuestionProto.CallToActionOrBuilder
            public v getUrlBytes() {
                return ((CallToAction) this.instance).getUrlBytes();
            }

            @Override // com.waze.jni.protos.QuestionProto.CallToActionOrBuilder
            public float getWidthRatio() {
                return ((CallToAction) this.instance).getWidthRatio();
            }

            @Override // com.waze.jni.protos.QuestionProto.CallToActionOrBuilder
            public boolean hasIcon() {
                return ((CallToAction) this.instance).hasIcon();
            }

            @Override // com.waze.jni.protos.QuestionProto.CallToActionOrBuilder
            public boolean hasId() {
                return ((CallToAction) this.instance).hasId();
            }

            @Override // com.waze.jni.protos.QuestionProto.CallToActionOrBuilder
            public boolean hasText() {
                return ((CallToAction) this.instance).hasText();
            }

            @Override // com.waze.jni.protos.QuestionProto.CallToActionOrBuilder
            public boolean hasUrl() {
                return ((CallToAction) this.instance).hasUrl();
            }

            public Builder setBgColor(int i2) {
                copyOnWrite();
                ((CallToAction) this.instance).setBgColor(i2);
                return this;
            }

            public Builder setIcon(String str) {
                copyOnWrite();
                ((CallToAction) this.instance).setIcon(str);
                return this;
            }

            public Builder setIconBytes(v vVar) {
                copyOnWrite();
                ((CallToAction) this.instance).setIconBytes(vVar);
                return this;
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((CallToAction) this.instance).setId(str);
                return this;
            }

            public Builder setIdBytes(v vVar) {
                copyOnWrite();
                ((CallToAction) this.instance).setIdBytes(vVar);
                return this;
            }

            public Builder setText(String str) {
                copyOnWrite();
                ((CallToAction) this.instance).setText(str);
                return this;
            }

            public Builder setTextBytes(v vVar) {
                copyOnWrite();
                ((CallToAction) this.instance).setTextBytes(vVar);
                return this;
            }

            public Builder setTextColor(int i2) {
                copyOnWrite();
                ((CallToAction) this.instance).setTextColor(i2);
                return this;
            }

            public Builder setUrl(String str) {
                copyOnWrite();
                ((CallToAction) this.instance).setUrl(str);
                return this;
            }

            public Builder setUrlBytes(v vVar) {
                copyOnWrite();
                ((CallToAction) this.instance).setUrlBytes(vVar);
                return this;
            }

            public Builder setWidthRatio(float f2) {
                copyOnWrite();
                ((CallToAction) this.instance).setWidthRatio(f2);
                return this;
            }
        }

        static {
            CallToAction callToAction = new CallToAction();
            DEFAULT_INSTANCE = callToAction;
            du.registerDefaultInstance(CallToAction.class, callToAction);
        }

        private CallToAction() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBgColor() {
            this.bgColor_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIcon() {
            this.bitField0_ &= -9;
            this.icon_ = getDefaultInstance().getIcon();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.bitField0_ &= -5;
            this.id_ = getDefaultInstance().getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearText() {
            this.bitField0_ &= -2;
            this.text_ = getDefaultInstance().getText();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTextColor() {
            this.textColor_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUrl() {
            this.bitField0_ &= -3;
            this.url_ = getDefaultInstance().getUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWidthRatio() {
            this.widthRatio_ = 0.0f;
        }

        public static CallToAction getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static CallToAction parseDelimitedFrom(InputStream inputStream) {
            return (CallToAction) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CallToAction parseFrom(v vVar) {
            return (CallToAction) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<CallToAction> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBgColor(int i2) {
            this.bgColor_ = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIcon(String str) {
            Objects.requireNonNull(str);
            this.bitField0_ |= 8;
            this.icon_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIconBytes(v vVar) {
            checkByteStringIsUtf8(vVar);
            this.icon_ = vVar.u();
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(String str) {
            Objects.requireNonNull(str);
            this.bitField0_ |= 4;
            this.id_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdBytes(v vVar) {
            checkByteStringIsUtf8(vVar);
            this.id_ = vVar.u();
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setText(String str) {
            Objects.requireNonNull(str);
            this.bitField0_ |= 1;
            this.text_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTextBytes(v vVar) {
            checkByteStringIsUtf8(vVar);
            this.text_ = vVar.u();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTextColor(int i2) {
            this.textColor_ = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUrl(String str) {
            Objects.requireNonNull(str);
            this.bitField0_ |= 2;
            this.url_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUrlBytes(v vVar) {
            checkByteStringIsUtf8(vVar);
            this.url_ = vVar.u();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWidthRatio(float f2) {
            this.widthRatio_ = f2;
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005\u000b\u0006\u000b\u0007\u0001", new Object[]{"bitField0_", "text_", "url_", "id_", "icon_", "bgColor_", "textColor_", "widthRatio_"});
            }
            if (iOrdinal == 3) {
                return new CallToAction();
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
            fo<CallToAction> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (CallToAction.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        @Override // com.waze.jni.protos.QuestionProto.CallToActionOrBuilder
        public int getBgColor() {
            return this.bgColor_;
        }

        @Override // com.waze.jni.protos.QuestionProto.CallToActionOrBuilder
        public String getIcon() {
            return this.icon_;
        }

        @Override // com.waze.jni.protos.QuestionProto.CallToActionOrBuilder
        public v getIconBytes() {
            return v.s(this.icon_);
        }

        @Override // com.waze.jni.protos.QuestionProto.CallToActionOrBuilder
        public String getId() {
            return this.id_;
        }

        @Override // com.waze.jni.protos.QuestionProto.CallToActionOrBuilder
        public v getIdBytes() {
            return v.s(this.id_);
        }

        @Override // com.waze.jni.protos.QuestionProto.CallToActionOrBuilder
        public String getText() {
            return this.text_;
        }

        @Override // com.waze.jni.protos.QuestionProto.CallToActionOrBuilder
        public v getTextBytes() {
            return v.s(this.text_);
        }

        @Override // com.waze.jni.protos.QuestionProto.CallToActionOrBuilder
        public int getTextColor() {
            return this.textColor_;
        }

        @Override // com.waze.jni.protos.QuestionProto.CallToActionOrBuilder
        public String getUrl() {
            return this.url_;
        }

        @Override // com.waze.jni.protos.QuestionProto.CallToActionOrBuilder
        public v getUrlBytes() {
            return v.s(this.url_);
        }

        @Override // com.waze.jni.protos.QuestionProto.CallToActionOrBuilder
        public float getWidthRatio() {
            return this.widthRatio_;
        }

        @Override // com.waze.jni.protos.QuestionProto.CallToActionOrBuilder
        public boolean hasIcon() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.waze.jni.protos.QuestionProto.CallToActionOrBuilder
        public boolean hasId() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.waze.jni.protos.QuestionProto.CallToActionOrBuilder
        public boolean hasText() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.waze.jni.protos.QuestionProto.CallToActionOrBuilder
        public boolean hasUrl() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(CallToAction callToAction) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(callToAction);
        }

        public static CallToAction parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (CallToAction) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static CallToAction parseFrom(v vVar, de deVar) {
            return (CallToAction) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static CallToAction parseFrom(z zVar) {
            return (CallToAction) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static CallToAction parseFrom(z zVar, de deVar) {
            return (CallToAction) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static CallToAction parseFrom(InputStream inputStream) {
            return (CallToAction) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CallToAction parseFrom(InputStream inputStream, de deVar) {
            return (CallToAction) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static CallToAction parseFrom(ByteBuffer byteBuffer) {
            return (CallToAction) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static CallToAction parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (CallToAction) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static CallToAction parseFrom(byte[] bArr) {
            return (CallToAction) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CallToAction parseFrom(byte[] bArr, de deVar) {
            return (CallToAction) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    /* compiled from: WazeSource */
    public final class Link extends du<Link, Builder> implements LinkOrBuilder {
        public static final int CAPTION_FIELD_NUMBER = 1;
        private static final Link DEFAULT_INSTANCE;
        private static volatile fo<Link> PARSER = null;
        public static final int TITLE_FIELD_NUMBER = 3;
        public static final int URL_FIELD_NUMBER = 2;
        private int bitField0_;
        private String caption_ = "";
        private String url_ = "";
        private String title_ = "";

        /* compiled from: WazeSource */
        public final class Builder extends dm<Link, Builder> implements LinkOrBuilder {
            private Builder() {
                super(Link.DEFAULT_INSTANCE);
            }

            public Builder clearCaption() {
                copyOnWrite();
                ((Link) this.instance).clearCaption();
                return this;
            }

            public Builder clearTitle() {
                copyOnWrite();
                ((Link) this.instance).clearTitle();
                return this;
            }

            public Builder clearUrl() {
                copyOnWrite();
                ((Link) this.instance).clearUrl();
                return this;
            }

            @Override // com.waze.jni.protos.QuestionProto.LinkOrBuilder
            public String getCaption() {
                return ((Link) this.instance).getCaption();
            }

            @Override // com.waze.jni.protos.QuestionProto.LinkOrBuilder
            public v getCaptionBytes() {
                return ((Link) this.instance).getCaptionBytes();
            }

            @Override // com.waze.jni.protos.QuestionProto.LinkOrBuilder
            public String getTitle() {
                return ((Link) this.instance).getTitle();
            }

            @Override // com.waze.jni.protos.QuestionProto.LinkOrBuilder
            public v getTitleBytes() {
                return ((Link) this.instance).getTitleBytes();
            }

            @Override // com.waze.jni.protos.QuestionProto.LinkOrBuilder
            public String getUrl() {
                return ((Link) this.instance).getUrl();
            }

            @Override // com.waze.jni.protos.QuestionProto.LinkOrBuilder
            public v getUrlBytes() {
                return ((Link) this.instance).getUrlBytes();
            }

            @Override // com.waze.jni.protos.QuestionProto.LinkOrBuilder
            public boolean hasCaption() {
                return ((Link) this.instance).hasCaption();
            }

            @Override // com.waze.jni.protos.QuestionProto.LinkOrBuilder
            public boolean hasTitle() {
                return ((Link) this.instance).hasTitle();
            }

            @Override // com.waze.jni.protos.QuestionProto.LinkOrBuilder
            public boolean hasUrl() {
                return ((Link) this.instance).hasUrl();
            }

            public Builder setCaption(String str) {
                copyOnWrite();
                ((Link) this.instance).setCaption(str);
                return this;
            }

            public Builder setCaptionBytes(v vVar) {
                copyOnWrite();
                ((Link) this.instance).setCaptionBytes(vVar);
                return this;
            }

            public Builder setTitle(String str) {
                copyOnWrite();
                ((Link) this.instance).setTitle(str);
                return this;
            }

            public Builder setTitleBytes(v vVar) {
                copyOnWrite();
                ((Link) this.instance).setTitleBytes(vVar);
                return this;
            }

            public Builder setUrl(String str) {
                copyOnWrite();
                ((Link) this.instance).setUrl(str);
                return this;
            }

            public Builder setUrlBytes(v vVar) {
                copyOnWrite();
                ((Link) this.instance).setUrlBytes(vVar);
                return this;
            }
        }

        static {
            Link link = new Link();
            DEFAULT_INSTANCE = link;
            du.registerDefaultInstance(Link.class, link);
        }

        private Link() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCaption() {
            this.bitField0_ &= -2;
            this.caption_ = getDefaultInstance().getCaption();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTitle() {
            this.bitField0_ &= -5;
            this.title_ = getDefaultInstance().getTitle();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUrl() {
            this.bitField0_ &= -3;
            this.url_ = getDefaultInstance().getUrl();
        }

        public static Link getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Link parseDelimitedFrom(InputStream inputStream) {
            return (Link) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Link parseFrom(v vVar) {
            return (Link) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<Link> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCaption(String str) {
            Objects.requireNonNull(str);
            this.bitField0_ |= 1;
            this.caption_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCaptionBytes(v vVar) {
            checkByteStringIsUtf8(vVar);
            this.caption_ = vVar.u();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTitle(String str) {
            Objects.requireNonNull(str);
            this.bitField0_ |= 4;
            this.title_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTitleBytes(v vVar) {
            checkByteStringIsUtf8(vVar);
            this.title_ = vVar.u();
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUrl(String str) {
            Objects.requireNonNull(str);
            this.bitField0_ |= 2;
            this.url_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUrlBytes(v vVar) {
            checkByteStringIsUtf8(vVar);
            this.url_ = vVar.u();
            this.bitField0_ |= 2;
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002", new Object[]{"bitField0_", "caption_", "url_", "title_"});
            }
            if (iOrdinal == 3) {
                return new Link();
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
            fo<Link> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (Link.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        @Override // com.waze.jni.protos.QuestionProto.LinkOrBuilder
        public String getCaption() {
            return this.caption_;
        }

        @Override // com.waze.jni.protos.QuestionProto.LinkOrBuilder
        public v getCaptionBytes() {
            return v.s(this.caption_);
        }

        @Override // com.waze.jni.protos.QuestionProto.LinkOrBuilder
        public String getTitle() {
            return this.title_;
        }

        @Override // com.waze.jni.protos.QuestionProto.LinkOrBuilder
        public v getTitleBytes() {
            return v.s(this.title_);
        }

        @Override // com.waze.jni.protos.QuestionProto.LinkOrBuilder
        public String getUrl() {
            return this.url_;
        }

        @Override // com.waze.jni.protos.QuestionProto.LinkOrBuilder
        public v getUrlBytes() {
            return v.s(this.url_);
        }

        @Override // com.waze.jni.protos.QuestionProto.LinkOrBuilder
        public boolean hasCaption() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.waze.jni.protos.QuestionProto.LinkOrBuilder
        public boolean hasTitle() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.waze.jni.protos.QuestionProto.LinkOrBuilder
        public boolean hasUrl() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(Link link) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(link);
        }

        public static Link parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (Link) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static Link parseFrom(v vVar, de deVar) {
            return (Link) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static Link parseFrom(z zVar) {
            return (Link) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static Link parseFrom(z zVar, de deVar) {
            return (Link) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static Link parseFrom(InputStream inputStream) {
            return (Link) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Link parseFrom(InputStream inputStream, de deVar) {
            return (Link) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static Link parseFrom(ByteBuffer byteBuffer) {
            return (Link) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Link parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (Link) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static Link parseFrom(byte[] bArr) {
            return (Link) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Link parseFrom(byte[] bArr, de deVar) {
            return (Link) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    public static Builder newBuilder(QuestionProto questionProto) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(questionProto);
    }

    public static QuestionProto parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (QuestionProto) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static QuestionProto parseFrom(v vVar, de deVar) {
        return (QuestionProto) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static QuestionProto parseFrom(z zVar) {
        return (QuestionProto) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static QuestionProto parseFrom(z zVar, de deVar) {
        return (QuestionProto) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCtas(CallToAction callToAction) {
        Objects.requireNonNull(callToAction);
        ensureCtasIsMutable();
        this.ctas_.add(callToAction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLinks(Link link) {
        Objects.requireNonNull(link);
        ensureLinksIsMutable();
        this.links_.add(link);
    }

    public static QuestionProto parseFrom(InputStream inputStream) {
        return (QuestionProto) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static QuestionProto parseFrom(InputStream inputStream, de deVar) {
        return (QuestionProto) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static QuestionProto parseFrom(ByteBuffer byteBuffer) {
        return (QuestionProto) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static QuestionProto parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (QuestionProto) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<QuestionProto, Builder> implements QuestionProtoOrBuilder {
        private Builder() {
            super(QuestionProto.DEFAULT_INSTANCE);
        }

        public Builder addAllCtas(Iterable<? extends CallToAction> iterable) {
            copyOnWrite();
            ((QuestionProto) this.instance).addAllCtas(iterable);
            return this;
        }

        public Builder addAllLinks(Iterable<? extends Link> iterable) {
            copyOnWrite();
            ((QuestionProto) this.instance).addAllLinks(iterable);
            return this;
        }

        public Builder addCtas(int i2, CallToAction.Builder builder) {
            copyOnWrite();
            ((QuestionProto) this.instance).addCtas(i2, builder.build());
            return this;
        }

        public Builder addLinks(int i2, Link.Builder builder) {
            copyOnWrite();
            ((QuestionProto) this.instance).addLinks(i2, builder.build());
            return this;
        }

        public Builder clearAlwaysShow() {
            copyOnWrite();
            ((QuestionProto) this.instance).clearAlwaysShow();
            return this;
        }

        public Builder clearButtonOrientation() {
            copyOnWrite();
            ((QuestionProto) this.instance).clearButtonOrientation();
            return this;
        }

        public Builder clearCtas() {
            copyOnWrite();
            ((QuestionProto) this.instance).clearCtas();
            return this;
        }

        public Builder clearDismissible() {
            copyOnWrite();
            ((QuestionProto) this.instance).clearDismissible();
            return this;
        }

        public Builder clearDisplayTimeSec() {
            copyOnWrite();
            ((QuestionProto) this.instance).clearDisplayTimeSec();
            return this;
        }

        public Builder clearEncTemplate() {
            copyOnWrite();
            ((QuestionProto) this.instance).clearEncTemplate();
            return this;
        }

        public Builder clearImageUrl() {
            copyOnWrite();
            ((QuestionProto) this.instance).clearImageUrl();
            return this;
        }

        public Builder clearKey() {
            copyOnWrite();
            ((QuestionProto) this.instance).clearKey();
            return this;
        }

        public Builder clearLinks() {
            copyOnWrite();
            ((QuestionProto) this.instance).clearLinks();
            return this;
        }

        public Builder clearQuestionId() {
            copyOnWrite();
            ((QuestionProto) this.instance).clearQuestionId();
            return this;
        }

        public Builder clearSubtitle() {
            copyOnWrite();
            ((QuestionProto) this.instance).clearSubtitle();
            return this;
        }

        public Builder clearText() {
            copyOnWrite();
            ((QuestionProto) this.instance).clearText();
            return this;
        }

        @Override // com.waze.jni.protos.QuestionProtoOrBuilder
        public boolean getAlwaysShow() {
            return ((QuestionProto) this.instance).getAlwaysShow();
        }

        @Override // com.waze.jni.protos.QuestionProtoOrBuilder
        public int getButtonOrientation() {
            return ((QuestionProto) this.instance).getButtonOrientation();
        }

        @Override // com.waze.jni.protos.QuestionProtoOrBuilder
        public CallToAction getCtas(int i2) {
            return ((QuestionProto) this.instance).getCtas(i2);
        }

        @Override // com.waze.jni.protos.QuestionProtoOrBuilder
        public int getCtasCount() {
            return ((QuestionProto) this.instance).getCtasCount();
        }

        @Override // com.waze.jni.protos.QuestionProtoOrBuilder
        public List<CallToAction> getCtasList() {
            return DesugarCollections.unmodifiableList(((QuestionProto) this.instance).getCtasList());
        }

        @Override // com.waze.jni.protos.QuestionProtoOrBuilder
        public boolean getDismissible() {
            return ((QuestionProto) this.instance).getDismissible();
        }

        @Override // com.waze.jni.protos.QuestionProtoOrBuilder
        public int getDisplayTimeSec() {
            return ((QuestionProto) this.instance).getDisplayTimeSec();
        }

        @Override // com.waze.jni.protos.QuestionProtoOrBuilder
        public EncTemplate getEncTemplate() {
            return ((QuestionProto) this.instance).getEncTemplate();
        }

        @Override // com.waze.jni.protos.QuestionProtoOrBuilder
        public int getEncTemplateValue() {
            return ((QuestionProto) this.instance).getEncTemplateValue();
        }

        @Override // com.waze.jni.protos.QuestionProtoOrBuilder
        public String getImageUrl() {
            return ((QuestionProto) this.instance).getImageUrl();
        }

        @Override // com.waze.jni.protos.QuestionProtoOrBuilder
        public v getImageUrlBytes() {
            return ((QuestionProto) this.instance).getImageUrlBytes();
        }

        @Override // com.waze.jni.protos.QuestionProtoOrBuilder
        public String getKey() {
            return ((QuestionProto) this.instance).getKey();
        }

        @Override // com.waze.jni.protos.QuestionProtoOrBuilder
        public v getKeyBytes() {
            return ((QuestionProto) this.instance).getKeyBytes();
        }

        @Override // com.waze.jni.protos.QuestionProtoOrBuilder
        public Link getLinks(int i2) {
            return ((QuestionProto) this.instance).getLinks(i2);
        }

        @Override // com.waze.jni.protos.QuestionProtoOrBuilder
        public int getLinksCount() {
            return ((QuestionProto) this.instance).getLinksCount();
        }

        @Override // com.waze.jni.protos.QuestionProtoOrBuilder
        public List<Link> getLinksList() {
            return DesugarCollections.unmodifiableList(((QuestionProto) this.instance).getLinksList());
        }

        @Override // com.waze.jni.protos.QuestionProtoOrBuilder
        public String getQuestionId() {
            return ((QuestionProto) this.instance).getQuestionId();
        }

        @Override // com.waze.jni.protos.QuestionProtoOrBuilder
        public v getQuestionIdBytes() {
            return ((QuestionProto) this.instance).getQuestionIdBytes();
        }

        @Override // com.waze.jni.protos.QuestionProtoOrBuilder
        public String getSubtitle() {
            return ((QuestionProto) this.instance).getSubtitle();
        }

        @Override // com.waze.jni.protos.QuestionProtoOrBuilder
        public v getSubtitleBytes() {
            return ((QuestionProto) this.instance).getSubtitleBytes();
        }

        @Override // com.waze.jni.protos.QuestionProtoOrBuilder
        public String getText() {
            return ((QuestionProto) this.instance).getText();
        }

        @Override // com.waze.jni.protos.QuestionProtoOrBuilder
        public v getTextBytes() {
            return ((QuestionProto) this.instance).getTextBytes();
        }

        @Override // com.waze.jni.protos.QuestionProtoOrBuilder
        public boolean hasImageUrl() {
            return ((QuestionProto) this.instance).hasImageUrl();
        }

        @Override // com.waze.jni.protos.QuestionProtoOrBuilder
        public boolean hasKey() {
            return ((QuestionProto) this.instance).hasKey();
        }

        @Override // com.waze.jni.protos.QuestionProtoOrBuilder
        public boolean hasQuestionId() {
            return ((QuestionProto) this.instance).hasQuestionId();
        }

        @Override // com.waze.jni.protos.QuestionProtoOrBuilder
        public boolean hasSubtitle() {
            return ((QuestionProto) this.instance).hasSubtitle();
        }

        @Override // com.waze.jni.protos.QuestionProtoOrBuilder
        public boolean hasText() {
            return ((QuestionProto) this.instance).hasText();
        }

        public Builder removeCtas(int i2) {
            copyOnWrite();
            ((QuestionProto) this.instance).removeCtas(i2);
            return this;
        }

        public Builder removeLinks(int i2) {
            copyOnWrite();
            ((QuestionProto) this.instance).removeLinks(i2);
            return this;
        }

        public Builder setAlwaysShow(boolean z) {
            copyOnWrite();
            ((QuestionProto) this.instance).setAlwaysShow(z);
            return this;
        }

        public Builder setButtonOrientation(int i2) {
            copyOnWrite();
            ((QuestionProto) this.instance).setButtonOrientation(i2);
            return this;
        }

        public Builder setCtas(int i2, CallToAction.Builder builder) {
            copyOnWrite();
            ((QuestionProto) this.instance).setCtas(i2, builder.build());
            return this;
        }

        public Builder setDismissible(boolean z) {
            copyOnWrite();
            ((QuestionProto) this.instance).setDismissible(z);
            return this;
        }

        public Builder setDisplayTimeSec(int i2) {
            copyOnWrite();
            ((QuestionProto) this.instance).setDisplayTimeSec(i2);
            return this;
        }

        public Builder setEncTemplate(EncTemplate encTemplate) {
            copyOnWrite();
            ((QuestionProto) this.instance).setEncTemplate(encTemplate);
            return this;
        }

        public Builder setEncTemplateValue(int i2) {
            copyOnWrite();
            ((QuestionProto) this.instance).setEncTemplateValue(i2);
            return this;
        }

        public Builder setImageUrl(String str) {
            copyOnWrite();
            ((QuestionProto) this.instance).setImageUrl(str);
            return this;
        }

        public Builder setImageUrlBytes(v vVar) {
            copyOnWrite();
            ((QuestionProto) this.instance).setImageUrlBytes(vVar);
            return this;
        }

        public Builder setKey(String str) {
            copyOnWrite();
            ((QuestionProto) this.instance).setKey(str);
            return this;
        }

        public Builder setKeyBytes(v vVar) {
            copyOnWrite();
            ((QuestionProto) this.instance).setKeyBytes(vVar);
            return this;
        }

        public Builder setLinks(int i2, Link.Builder builder) {
            copyOnWrite();
            ((QuestionProto) this.instance).setLinks(i2, builder.build());
            return this;
        }

        public Builder setQuestionId(String str) {
            copyOnWrite();
            ((QuestionProto) this.instance).setQuestionId(str);
            return this;
        }

        public Builder setQuestionIdBytes(v vVar) {
            copyOnWrite();
            ((QuestionProto) this.instance).setQuestionIdBytes(vVar);
            return this;
        }

        public Builder setSubtitle(String str) {
            copyOnWrite();
            ((QuestionProto) this.instance).setSubtitle(str);
            return this;
        }

        public Builder setSubtitleBytes(v vVar) {
            copyOnWrite();
            ((QuestionProto) this.instance).setSubtitleBytes(vVar);
            return this;
        }

        public Builder setText(String str) {
            copyOnWrite();
            ((QuestionProto) this.instance).setText(str);
            return this;
        }

        public Builder setTextBytes(v vVar) {
            copyOnWrite();
            ((QuestionProto) this.instance).setTextBytes(vVar);
            return this;
        }

        public Builder addCtas(int i2, CallToAction callToAction) {
            copyOnWrite();
            ((QuestionProto) this.instance).addCtas(i2, callToAction);
            return this;
        }

        public Builder addLinks(int i2, Link link) {
            copyOnWrite();
            ((QuestionProto) this.instance).addLinks(i2, link);
            return this;
        }

        public Builder setCtas(int i2, CallToAction callToAction) {
            copyOnWrite();
            ((QuestionProto) this.instance).setCtas(i2, callToAction);
            return this;
        }

        public Builder setLinks(int i2, Link link) {
            copyOnWrite();
            ((QuestionProto) this.instance).setLinks(i2, link);
            return this;
        }

        public Builder addCtas(CallToAction.Builder builder) {
            copyOnWrite();
            ((QuestionProto) this.instance).addCtas(builder.build());
            return this;
        }

        public Builder addLinks(Link.Builder builder) {
            copyOnWrite();
            ((QuestionProto) this.instance).addLinks(builder.build());
            return this;
        }

        public Builder addCtas(CallToAction callToAction) {
            copyOnWrite();
            ((QuestionProto) this.instance).addCtas(callToAction);
            return this;
        }

        public Builder addLinks(Link link) {
            copyOnWrite();
            ((QuestionProto) this.instance).addLinks(link);
            return this;
        }
    }

    public static QuestionProto parseFrom(byte[] bArr) {
        return (QuestionProto) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static QuestionProto parseFrom(byte[] bArr, de deVar) {
        return (QuestionProto) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
