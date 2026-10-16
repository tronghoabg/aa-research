package com.waze.jni.protos.navigate;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import com.waze.jni.protos.navigate.RoutingPopupActions;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class RoutingPopup extends du<RoutingPopup, Builder> implements RoutingPopupOrBuilder {
    public static final int ACTIONS_FIELD_NUMBER = 10;
    public static final int CHECKBOX_TEXT_FIELD_NUMBER = 12;
    private static final RoutingPopup DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 5;
    public static final int IN_CAR_ACTIONS_FIELD_NUMBER = 11;
    public static final int IN_CAR_PRIMARY_BUTTON_TEXT_FIELD_NUMBER = 7;
    public static final int IN_CAR_SECONDARY_BUTTON_TEXT_FIELD_NUMBER = 9;
    public static final int IN_CAR_SUBTITLE_FIELD_NUMBER = 4;
    public static final int IN_CAR_TITLE_FIELD_NUMBER = 2;
    private static volatile fo<RoutingPopup> PARSER = null;
    public static final int PRIMARY_BUTTON_TEXT_FIELD_NUMBER = 6;
    public static final int SECONDARY_BUTTON_TEXT_FIELD_NUMBER = 8;
    public static final int SUBTITLE_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 1;
    private RoutingPopupActions actions_;
    private int bitField0_;
    private RoutingPopupActions inCarActions_;
    private String title_ = "";
    private String inCarTitle_ = "";
    private String subtitle_ = "";
    private String inCarSubtitle_ = "";
    private String imageUrl_ = "";
    private String primaryButtonText_ = "";
    private String inCarPrimaryButtonText_ = "";
    private String secondaryButtonText_ = "";
    private String inCarSecondaryButtonText_ = "";
    private String checkboxText_ = "";

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.navigate.RoutingPopup$1, reason: invalid class name */
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
        RoutingPopup routingPopup = new RoutingPopup();
        DEFAULT_INSTANCE = routingPopup;
        du.registerDefaultInstance(RoutingPopup.class, routingPopup);
    }

    private RoutingPopup() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActions() {
        this.actions_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCheckboxText() {
        this.bitField0_ &= -5;
        this.checkboxText_ = getDefaultInstance().getCheckboxText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImageUrl() {
        this.imageUrl_ = getDefaultInstance().getImageUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInCarActions() {
        this.inCarActions_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInCarPrimaryButtonText() {
        this.inCarPrimaryButtonText_ = getDefaultInstance().getInCarPrimaryButtonText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInCarSecondaryButtonText() {
        this.inCarSecondaryButtonText_ = getDefaultInstance().getInCarSecondaryButtonText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInCarSubtitle() {
        this.inCarSubtitle_ = getDefaultInstance().getInCarSubtitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInCarTitle() {
        this.inCarTitle_ = getDefaultInstance().getInCarTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrimaryButtonText() {
        this.primaryButtonText_ = getDefaultInstance().getPrimaryButtonText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSecondaryButtonText() {
        this.secondaryButtonText_ = getDefaultInstance().getSecondaryButtonText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubtitle() {
        this.subtitle_ = getDefaultInstance().getSubtitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    public static RoutingPopup getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeActions(RoutingPopupActions routingPopupActions) {
        Objects.requireNonNull(routingPopupActions);
        RoutingPopupActions routingPopupActions2 = this.actions_;
        if (routingPopupActions2 != null && routingPopupActions2 != RoutingPopupActions.getDefaultInstance()) {
            RoutingPopupActions.Builder builderNewBuilder = RoutingPopupActions.newBuilder(routingPopupActions2);
            builderNewBuilder.mergeFrom((RoutingPopupActions.Builder) routingPopupActions);
            routingPopupActions = builderNewBuilder.buildPartial();
        }
        this.actions_ = routingPopupActions;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInCarActions(RoutingPopupActions routingPopupActions) {
        Objects.requireNonNull(routingPopupActions);
        RoutingPopupActions routingPopupActions2 = this.inCarActions_;
        if (routingPopupActions2 != null && routingPopupActions2 != RoutingPopupActions.getDefaultInstance()) {
            RoutingPopupActions.Builder builderNewBuilder = RoutingPopupActions.newBuilder(routingPopupActions2);
            builderNewBuilder.mergeFrom((RoutingPopupActions.Builder) routingPopupActions);
            routingPopupActions = builderNewBuilder.buildPartial();
        }
        this.inCarActions_ = routingPopupActions;
        this.bitField0_ |= 2;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static RoutingPopup parseDelimitedFrom(InputStream inputStream) {
        return (RoutingPopup) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RoutingPopup parseFrom(v vVar) {
        return (RoutingPopup) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<RoutingPopup> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActions(RoutingPopupActions routingPopupActions) {
        Objects.requireNonNull(routingPopupActions);
        this.actions_ = routingPopupActions;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckboxText(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.checkboxText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckboxTextBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.checkboxText_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageUrl(String str) {
        Objects.requireNonNull(str);
        this.imageUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageUrlBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.imageUrl_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInCarActions(RoutingPopupActions routingPopupActions) {
        Objects.requireNonNull(routingPopupActions);
        this.inCarActions_ = routingPopupActions;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInCarPrimaryButtonText(String str) {
        Objects.requireNonNull(str);
        this.inCarPrimaryButtonText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInCarPrimaryButtonTextBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.inCarPrimaryButtonText_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInCarSecondaryButtonText(String str) {
        Objects.requireNonNull(str);
        this.inCarSecondaryButtonText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInCarSecondaryButtonTextBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.inCarSecondaryButtonText_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInCarSubtitle(String str) {
        Objects.requireNonNull(str);
        this.inCarSubtitle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInCarSubtitleBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.inCarSubtitle_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInCarTitle(String str) {
        Objects.requireNonNull(str);
        this.inCarTitle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInCarTitleBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.inCarTitle_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrimaryButtonText(String str) {
        Objects.requireNonNull(str);
        this.primaryButtonText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrimaryButtonTextBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.primaryButtonText_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecondaryButtonText(String str) {
        Objects.requireNonNull(str);
        this.secondaryButtonText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecondaryButtonTextBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.secondaryButtonText_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubtitle(String str) {
        Objects.requireNonNull(str);
        this.subtitle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubtitleBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.subtitle_ = vVar.u();
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

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȈ\nဉ\u0000\u000bဉ\u0001\fለ\u0002", new Object[]{"bitField0_", "title_", "inCarTitle_", "subtitle_", "inCarSubtitle_", "imageUrl_", "primaryButtonText_", "inCarPrimaryButtonText_", "secondaryButtonText_", "inCarSecondaryButtonText_", "actions_", "inCarActions_", "checkboxText_"});
        }
        if (iOrdinal == 3) {
            return new RoutingPopup();
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
        fo<RoutingPopup> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (RoutingPopup.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.navigate.RoutingPopupOrBuilder
    public RoutingPopupActions getActions() {
        RoutingPopupActions routingPopupActions = this.actions_;
        return routingPopupActions == null ? RoutingPopupActions.getDefaultInstance() : routingPopupActions;
    }

    @Override // com.waze.jni.protos.navigate.RoutingPopupOrBuilder
    public String getCheckboxText() {
        return this.checkboxText_;
    }

    @Override // com.waze.jni.protos.navigate.RoutingPopupOrBuilder
    public v getCheckboxTextBytes() {
        return v.s(this.checkboxText_);
    }

    @Override // com.waze.jni.protos.navigate.RoutingPopupOrBuilder
    public String getImageUrl() {
        return this.imageUrl_;
    }

    @Override // com.waze.jni.protos.navigate.RoutingPopupOrBuilder
    public v getImageUrlBytes() {
        return v.s(this.imageUrl_);
    }

    @Override // com.waze.jni.protos.navigate.RoutingPopupOrBuilder
    public RoutingPopupActions getInCarActions() {
        RoutingPopupActions routingPopupActions = this.inCarActions_;
        return routingPopupActions == null ? RoutingPopupActions.getDefaultInstance() : routingPopupActions;
    }

    @Override // com.waze.jni.protos.navigate.RoutingPopupOrBuilder
    public String getInCarPrimaryButtonText() {
        return this.inCarPrimaryButtonText_;
    }

    @Override // com.waze.jni.protos.navigate.RoutingPopupOrBuilder
    public v getInCarPrimaryButtonTextBytes() {
        return v.s(this.inCarPrimaryButtonText_);
    }

    @Override // com.waze.jni.protos.navigate.RoutingPopupOrBuilder
    public String getInCarSecondaryButtonText() {
        return this.inCarSecondaryButtonText_;
    }

    @Override // com.waze.jni.protos.navigate.RoutingPopupOrBuilder
    public v getInCarSecondaryButtonTextBytes() {
        return v.s(this.inCarSecondaryButtonText_);
    }

    @Override // com.waze.jni.protos.navigate.RoutingPopupOrBuilder
    public String getInCarSubtitle() {
        return this.inCarSubtitle_;
    }

    @Override // com.waze.jni.protos.navigate.RoutingPopupOrBuilder
    public v getInCarSubtitleBytes() {
        return v.s(this.inCarSubtitle_);
    }

    @Override // com.waze.jni.protos.navigate.RoutingPopupOrBuilder
    public String getInCarTitle() {
        return this.inCarTitle_;
    }

    @Override // com.waze.jni.protos.navigate.RoutingPopupOrBuilder
    public v getInCarTitleBytes() {
        return v.s(this.inCarTitle_);
    }

    @Override // com.waze.jni.protos.navigate.RoutingPopupOrBuilder
    public String getPrimaryButtonText() {
        return this.primaryButtonText_;
    }

    @Override // com.waze.jni.protos.navigate.RoutingPopupOrBuilder
    public v getPrimaryButtonTextBytes() {
        return v.s(this.primaryButtonText_);
    }

    @Override // com.waze.jni.protos.navigate.RoutingPopupOrBuilder
    public String getSecondaryButtonText() {
        return this.secondaryButtonText_;
    }

    @Override // com.waze.jni.protos.navigate.RoutingPopupOrBuilder
    public v getSecondaryButtonTextBytes() {
        return v.s(this.secondaryButtonText_);
    }

    @Override // com.waze.jni.protos.navigate.RoutingPopupOrBuilder
    public String getSubtitle() {
        return this.subtitle_;
    }

    @Override // com.waze.jni.protos.navigate.RoutingPopupOrBuilder
    public v getSubtitleBytes() {
        return v.s(this.subtitle_);
    }

    @Override // com.waze.jni.protos.navigate.RoutingPopupOrBuilder
    public String getTitle() {
        return this.title_;
    }

    @Override // com.waze.jni.protos.navigate.RoutingPopupOrBuilder
    public v getTitleBytes() {
        return v.s(this.title_);
    }

    @Override // com.waze.jni.protos.navigate.RoutingPopupOrBuilder
    public boolean hasActions() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.waze.jni.protos.navigate.RoutingPopupOrBuilder
    public boolean hasCheckboxText() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.waze.jni.protos.navigate.RoutingPopupOrBuilder
    public boolean hasInCarActions() {
        return (this.bitField0_ & 2) != 0;
    }

    public static Builder newBuilder(RoutingPopup routingPopup) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(routingPopup);
    }

    public static RoutingPopup parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (RoutingPopup) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static RoutingPopup parseFrom(v vVar, de deVar) {
        return (RoutingPopup) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static RoutingPopup parseFrom(z zVar) {
        return (RoutingPopup) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static RoutingPopup parseFrom(z zVar, de deVar) {
        return (RoutingPopup) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static RoutingPopup parseFrom(InputStream inputStream) {
        return (RoutingPopup) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RoutingPopup parseFrom(InputStream inputStream, de deVar) {
        return (RoutingPopup) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static RoutingPopup parseFrom(ByteBuffer byteBuffer) {
        return (RoutingPopup) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static RoutingPopup parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (RoutingPopup) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<RoutingPopup, Builder> implements RoutingPopupOrBuilder {
        private Builder() {
            super(RoutingPopup.DEFAULT_INSTANCE);
        }

        public Builder clearActions() {
            copyOnWrite();
            ((RoutingPopup) this.instance).clearActions();
            return this;
        }

        public Builder clearCheckboxText() {
            copyOnWrite();
            ((RoutingPopup) this.instance).clearCheckboxText();
            return this;
        }

        public Builder clearImageUrl() {
            copyOnWrite();
            ((RoutingPopup) this.instance).clearImageUrl();
            return this;
        }

        public Builder clearInCarActions() {
            copyOnWrite();
            ((RoutingPopup) this.instance).clearInCarActions();
            return this;
        }

        public Builder clearInCarPrimaryButtonText() {
            copyOnWrite();
            ((RoutingPopup) this.instance).clearInCarPrimaryButtonText();
            return this;
        }

        public Builder clearInCarSecondaryButtonText() {
            copyOnWrite();
            ((RoutingPopup) this.instance).clearInCarSecondaryButtonText();
            return this;
        }

        public Builder clearInCarSubtitle() {
            copyOnWrite();
            ((RoutingPopup) this.instance).clearInCarSubtitle();
            return this;
        }

        public Builder clearInCarTitle() {
            copyOnWrite();
            ((RoutingPopup) this.instance).clearInCarTitle();
            return this;
        }

        public Builder clearPrimaryButtonText() {
            copyOnWrite();
            ((RoutingPopup) this.instance).clearPrimaryButtonText();
            return this;
        }

        public Builder clearSecondaryButtonText() {
            copyOnWrite();
            ((RoutingPopup) this.instance).clearSecondaryButtonText();
            return this;
        }

        public Builder clearSubtitle() {
            copyOnWrite();
            ((RoutingPopup) this.instance).clearSubtitle();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((RoutingPopup) this.instance).clearTitle();
            return this;
        }

        @Override // com.waze.jni.protos.navigate.RoutingPopupOrBuilder
        public RoutingPopupActions getActions() {
            return ((RoutingPopup) this.instance).getActions();
        }

        @Override // com.waze.jni.protos.navigate.RoutingPopupOrBuilder
        public String getCheckboxText() {
            return ((RoutingPopup) this.instance).getCheckboxText();
        }

        @Override // com.waze.jni.protos.navigate.RoutingPopupOrBuilder
        public v getCheckboxTextBytes() {
            return ((RoutingPopup) this.instance).getCheckboxTextBytes();
        }

        @Override // com.waze.jni.protos.navigate.RoutingPopupOrBuilder
        public String getImageUrl() {
            return ((RoutingPopup) this.instance).getImageUrl();
        }

        @Override // com.waze.jni.protos.navigate.RoutingPopupOrBuilder
        public v getImageUrlBytes() {
            return ((RoutingPopup) this.instance).getImageUrlBytes();
        }

        @Override // com.waze.jni.protos.navigate.RoutingPopupOrBuilder
        public RoutingPopupActions getInCarActions() {
            return ((RoutingPopup) this.instance).getInCarActions();
        }

        @Override // com.waze.jni.protos.navigate.RoutingPopupOrBuilder
        public String getInCarPrimaryButtonText() {
            return ((RoutingPopup) this.instance).getInCarPrimaryButtonText();
        }

        @Override // com.waze.jni.protos.navigate.RoutingPopupOrBuilder
        public v getInCarPrimaryButtonTextBytes() {
            return ((RoutingPopup) this.instance).getInCarPrimaryButtonTextBytes();
        }

        @Override // com.waze.jni.protos.navigate.RoutingPopupOrBuilder
        public String getInCarSecondaryButtonText() {
            return ((RoutingPopup) this.instance).getInCarSecondaryButtonText();
        }

        @Override // com.waze.jni.protos.navigate.RoutingPopupOrBuilder
        public v getInCarSecondaryButtonTextBytes() {
            return ((RoutingPopup) this.instance).getInCarSecondaryButtonTextBytes();
        }

        @Override // com.waze.jni.protos.navigate.RoutingPopupOrBuilder
        public String getInCarSubtitle() {
            return ((RoutingPopup) this.instance).getInCarSubtitle();
        }

        @Override // com.waze.jni.protos.navigate.RoutingPopupOrBuilder
        public v getInCarSubtitleBytes() {
            return ((RoutingPopup) this.instance).getInCarSubtitleBytes();
        }

        @Override // com.waze.jni.protos.navigate.RoutingPopupOrBuilder
        public String getInCarTitle() {
            return ((RoutingPopup) this.instance).getInCarTitle();
        }

        @Override // com.waze.jni.protos.navigate.RoutingPopupOrBuilder
        public v getInCarTitleBytes() {
            return ((RoutingPopup) this.instance).getInCarTitleBytes();
        }

        @Override // com.waze.jni.protos.navigate.RoutingPopupOrBuilder
        public String getPrimaryButtonText() {
            return ((RoutingPopup) this.instance).getPrimaryButtonText();
        }

        @Override // com.waze.jni.protos.navigate.RoutingPopupOrBuilder
        public v getPrimaryButtonTextBytes() {
            return ((RoutingPopup) this.instance).getPrimaryButtonTextBytes();
        }

        @Override // com.waze.jni.protos.navigate.RoutingPopupOrBuilder
        public String getSecondaryButtonText() {
            return ((RoutingPopup) this.instance).getSecondaryButtonText();
        }

        @Override // com.waze.jni.protos.navigate.RoutingPopupOrBuilder
        public v getSecondaryButtonTextBytes() {
            return ((RoutingPopup) this.instance).getSecondaryButtonTextBytes();
        }

        @Override // com.waze.jni.protos.navigate.RoutingPopupOrBuilder
        public String getSubtitle() {
            return ((RoutingPopup) this.instance).getSubtitle();
        }

        @Override // com.waze.jni.protos.navigate.RoutingPopupOrBuilder
        public v getSubtitleBytes() {
            return ((RoutingPopup) this.instance).getSubtitleBytes();
        }

        @Override // com.waze.jni.protos.navigate.RoutingPopupOrBuilder
        public String getTitle() {
            return ((RoutingPopup) this.instance).getTitle();
        }

        @Override // com.waze.jni.protos.navigate.RoutingPopupOrBuilder
        public v getTitleBytes() {
            return ((RoutingPopup) this.instance).getTitleBytes();
        }

        @Override // com.waze.jni.protos.navigate.RoutingPopupOrBuilder
        public boolean hasActions() {
            return ((RoutingPopup) this.instance).hasActions();
        }

        @Override // com.waze.jni.protos.navigate.RoutingPopupOrBuilder
        public boolean hasCheckboxText() {
            return ((RoutingPopup) this.instance).hasCheckboxText();
        }

        @Override // com.waze.jni.protos.navigate.RoutingPopupOrBuilder
        public boolean hasInCarActions() {
            return ((RoutingPopup) this.instance).hasInCarActions();
        }

        public Builder mergeActions(RoutingPopupActions routingPopupActions) {
            copyOnWrite();
            ((RoutingPopup) this.instance).mergeActions(routingPopupActions);
            return this;
        }

        public Builder mergeInCarActions(RoutingPopupActions routingPopupActions) {
            copyOnWrite();
            ((RoutingPopup) this.instance).mergeInCarActions(routingPopupActions);
            return this;
        }

        public Builder setActions(RoutingPopupActions.Builder builder) {
            copyOnWrite();
            ((RoutingPopup) this.instance).setActions(builder.build());
            return this;
        }

        public Builder setCheckboxText(String str) {
            copyOnWrite();
            ((RoutingPopup) this.instance).setCheckboxText(str);
            return this;
        }

        public Builder setCheckboxTextBytes(v vVar) {
            copyOnWrite();
            ((RoutingPopup) this.instance).setCheckboxTextBytes(vVar);
            return this;
        }

        public Builder setImageUrl(String str) {
            copyOnWrite();
            ((RoutingPopup) this.instance).setImageUrl(str);
            return this;
        }

        public Builder setImageUrlBytes(v vVar) {
            copyOnWrite();
            ((RoutingPopup) this.instance).setImageUrlBytes(vVar);
            return this;
        }

        public Builder setInCarActions(RoutingPopupActions.Builder builder) {
            copyOnWrite();
            ((RoutingPopup) this.instance).setInCarActions(builder.build());
            return this;
        }

        public Builder setInCarPrimaryButtonText(String str) {
            copyOnWrite();
            ((RoutingPopup) this.instance).setInCarPrimaryButtonText(str);
            return this;
        }

        public Builder setInCarPrimaryButtonTextBytes(v vVar) {
            copyOnWrite();
            ((RoutingPopup) this.instance).setInCarPrimaryButtonTextBytes(vVar);
            return this;
        }

        public Builder setInCarSecondaryButtonText(String str) {
            copyOnWrite();
            ((RoutingPopup) this.instance).setInCarSecondaryButtonText(str);
            return this;
        }

        public Builder setInCarSecondaryButtonTextBytes(v vVar) {
            copyOnWrite();
            ((RoutingPopup) this.instance).setInCarSecondaryButtonTextBytes(vVar);
            return this;
        }

        public Builder setInCarSubtitle(String str) {
            copyOnWrite();
            ((RoutingPopup) this.instance).setInCarSubtitle(str);
            return this;
        }

        public Builder setInCarSubtitleBytes(v vVar) {
            copyOnWrite();
            ((RoutingPopup) this.instance).setInCarSubtitleBytes(vVar);
            return this;
        }

        public Builder setInCarTitle(String str) {
            copyOnWrite();
            ((RoutingPopup) this.instance).setInCarTitle(str);
            return this;
        }

        public Builder setInCarTitleBytes(v vVar) {
            copyOnWrite();
            ((RoutingPopup) this.instance).setInCarTitleBytes(vVar);
            return this;
        }

        public Builder setPrimaryButtonText(String str) {
            copyOnWrite();
            ((RoutingPopup) this.instance).setPrimaryButtonText(str);
            return this;
        }

        public Builder setPrimaryButtonTextBytes(v vVar) {
            copyOnWrite();
            ((RoutingPopup) this.instance).setPrimaryButtonTextBytes(vVar);
            return this;
        }

        public Builder setSecondaryButtonText(String str) {
            copyOnWrite();
            ((RoutingPopup) this.instance).setSecondaryButtonText(str);
            return this;
        }

        public Builder setSecondaryButtonTextBytes(v vVar) {
            copyOnWrite();
            ((RoutingPopup) this.instance).setSecondaryButtonTextBytes(vVar);
            return this;
        }

        public Builder setSubtitle(String str) {
            copyOnWrite();
            ((RoutingPopup) this.instance).setSubtitle(str);
            return this;
        }

        public Builder setSubtitleBytes(v vVar) {
            copyOnWrite();
            ((RoutingPopup) this.instance).setSubtitleBytes(vVar);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((RoutingPopup) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(v vVar) {
            copyOnWrite();
            ((RoutingPopup) this.instance).setTitleBytes(vVar);
            return this;
        }

        public Builder setActions(RoutingPopupActions routingPopupActions) {
            copyOnWrite();
            ((RoutingPopup) this.instance).setActions(routingPopupActions);
            return this;
        }

        public Builder setInCarActions(RoutingPopupActions routingPopupActions) {
            copyOnWrite();
            ((RoutingPopup) this.instance).setInCarActions(routingPopupActions);
            return this;
        }
    }

    public static RoutingPopup parseFrom(byte[] bArr) {
        return (RoutingPopup) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RoutingPopup parseFrom(byte[] bArr, de deVar) {
        return (RoutingPopup) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
