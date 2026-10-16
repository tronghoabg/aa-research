package com.waze.jni.protos.alerters;

import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import com.waze.jni.protos.Position;
import com.waze.jni.protos.alerters.AlertValidationResult;
import com.waze.jni.protos.alerters.AlerterId;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class AlerterInfo extends du<AlerterInfo, Builder> implements AlerterInfoOrBuilder {
    public static final int ALERT_ID_FIELD_NUMBER = 16;
    public static final int CLOSE_DISTANCE_SAME_ALERTS_CAPPING_ENABLED_FIELD_NUMBER = 23;
    private static final AlerterInfo DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    public static final int DISTANCE_STRING_FIELD_NUMBER = 15;
    public static final int HIDE_ACTIONS_WHEN_INVALID_FIELD_NUMBER = 27;
    public static final int ICON_NAME_FIELD_NUMBER = 3;
    public static final int IS_APPROACHING_WITH_VALIDATION_FIELD_NUMBER = 25;
    public static final int IS_CANCELLABLE_FIELD_NUMBER = 6;
    public static final int IS_CLOSE_ONLY_FIELD_NUMBER = 14;
    public static final int IS_ETA_CLICKABLE_FIELD_NUMBER = 24;
    public static final int IS_WARNING_MODE_FIELD_NUMBER = 12;
    public static final int NUM_THUMBS_UP_FIELD_NUMBER = 13;
    private static volatile fo<AlerterInfo> PARSER = null;
    public static final int POSITION_FIELD_NUMBER = 22;
    public static final int PRIMARY_BUTTON_TEXT_FIELD_NUMBER = 4;
    public static final int REPORT_ID_FIELD_NUMBER = 28;
    public static final int SECONDARY_BUTTON_TEXT_FIELD_NUMBER = 5;
    public static final int SHOULD_SHOW_STILL_THERE_FIELD_NUMBER = 18;
    public static final int SHOW_DISTANCE_FIELD_NUMBER = 19;
    public static final int SHOW_THUMBS_UP_FIELD_NUMBER = 10;
    public static final int SHOW_WITH_ETA_FIELD_NUMBER = 9;
    public static final int SILENT_ACTIVATION_FIELD_NUMBER = 21;
    public static final int SUB_TYPE_FIELD_NUMBER = 17;
    public static final int TIMEOUT_SECONDS_FIELD_NUMBER = 7;
    public static final int TIMER_TYPE_FIELD_NUMBER = 8;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int TITLE_WITH_DISTANCE_FIELD_NUMBER = 20;
    public static final int TYPE_FIELD_NUMBER = 11;
    public static final int VALIDATION_RESULT_FIELD_NUMBER = 26;
    private AlerterId alertId_;
    private int bitField0_;
    private boolean closeDistanceSameAlertsCappingEnabled_;
    private boolean hideActionsWhenInvalid_;
    private boolean isApproachingWithValidation_;
    private boolean isCancellable_;
    private boolean isCloseOnly_;
    private boolean isEtaClickable_;
    private boolean isWarningMode_;
    private int numThumbsUp_;
    private Position.IntPosition position_;
    private int reportId_;
    private boolean shouldShowStillThere_;
    private boolean showDistance_;
    private boolean showThumbsUp_;
    private boolean showWithEta_;
    private int silentActivation_;
    private int subType_;
    private int timeoutSeconds_;
    private int timerType_;
    private int type_;
    private AlertValidationResult validationResult_;
    private String title_ = "";
    private String description_ = "";
    private String iconName_ = "";
    private String primaryButtonText_ = "";
    private String secondaryButtonText_ = "";
    private String distanceString_ = "";
    private String titleWithDistance_ = "";

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.alerters.AlerterInfo$1, reason: invalid class name */
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
        AlerterInfo alerterInfo = new AlerterInfo();
        DEFAULT_INSTANCE = alerterInfo;
        du.registerDefaultInstance(AlerterInfo.class, alerterInfo);
    }

    private AlerterInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlertId() {
        this.alertId_ = null;
        this.bitField0_ &= -32769;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCloseDistanceSameAlertsCappingEnabled() {
        this.bitField0_ &= -4194305;
        this.closeDistanceSameAlertsCappingEnabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.bitField0_ &= -3;
        this.description_ = getDefaultInstance().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDistanceString() {
        this.bitField0_ &= -16385;
        this.distanceString_ = getDefaultInstance().getDistanceString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHideActionsWhenInvalid() {
        this.bitField0_ &= -67108865;
        this.hideActionsWhenInvalid_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIconName() {
        this.bitField0_ &= -5;
        this.iconName_ = getDefaultInstance().getIconName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsApproachingWithValidation() {
        this.bitField0_ &= -16777217;
        this.isApproachingWithValidation_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsCancellable() {
        this.bitField0_ &= -33;
        this.isCancellable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsCloseOnly() {
        this.bitField0_ &= -8193;
        this.isCloseOnly_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsEtaClickable() {
        this.bitField0_ &= -8388609;
        this.isEtaClickable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsWarningMode() {
        this.bitField0_ &= -2049;
        this.isWarningMode_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumThumbsUp() {
        this.bitField0_ &= -4097;
        this.numThumbsUp_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPosition() {
        this.position_ = null;
        this.bitField0_ &= -2097153;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrimaryButtonText() {
        this.bitField0_ &= -9;
        this.primaryButtonText_ = getDefaultInstance().getPrimaryButtonText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReportId() {
        this.bitField0_ &= -134217729;
        this.reportId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSecondaryButtonText() {
        this.bitField0_ &= -17;
        this.secondaryButtonText_ = getDefaultInstance().getSecondaryButtonText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShouldShowStillThere() {
        this.bitField0_ &= -131073;
        this.shouldShowStillThere_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowDistance() {
        this.bitField0_ &= -262145;
        this.showDistance_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowThumbsUp() {
        this.bitField0_ &= -513;
        this.showThumbsUp_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowWithEta() {
        this.bitField0_ &= -257;
        this.showWithEta_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSilentActivation() {
        this.bitField0_ &= -1048577;
        this.silentActivation_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubType() {
        this.bitField0_ &= -65537;
        this.subType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeoutSeconds() {
        this.bitField0_ &= -65;
        this.timeoutSeconds_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimerType() {
        this.bitField0_ &= -129;
        this.timerType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.bitField0_ &= -2;
        this.title_ = getDefaultInstance().getTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitleWithDistance() {
        this.bitField0_ &= -524289;
        this.titleWithDistance_ = getDefaultInstance().getTitleWithDistance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -1025;
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValidationResult() {
        this.validationResult_ = null;
        this.bitField0_ &= -33554433;
    }

    public static AlerterInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAlertId(AlerterId alerterId) {
        Objects.requireNonNull(alerterId);
        AlerterId alerterId2 = this.alertId_;
        if (alerterId2 != null && alerterId2 != AlerterId.getDefaultInstance()) {
            AlerterId.Builder builderNewBuilder = AlerterId.newBuilder(alerterId2);
            builderNewBuilder.mergeFrom((AlerterId.Builder) alerterId);
            alerterId = builderNewBuilder.buildPartial();
        }
        this.alertId_ = alerterId;
        this.bitField0_ |= 32768;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePosition(Position.IntPosition intPosition) {
        Objects.requireNonNull(intPosition);
        Position.IntPosition intPosition2 = this.position_;
        if (intPosition2 != null && intPosition2 != Position.IntPosition.getDefaultInstance()) {
            Position.IntPosition.Builder builderNewBuilder = Position.IntPosition.newBuilder(intPosition2);
            builderNewBuilder.mergeFrom((Position.IntPosition.Builder) intPosition);
            intPosition = builderNewBuilder.buildPartial();
        }
        this.position_ = intPosition;
        this.bitField0_ |= 2097152;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeValidationResult(AlertValidationResult alertValidationResult) {
        Objects.requireNonNull(alertValidationResult);
        AlertValidationResult alertValidationResult2 = this.validationResult_;
        if (alertValidationResult2 != null && alertValidationResult2 != AlertValidationResult.getDefaultInstance()) {
            AlertValidationResult.Builder builderNewBuilder = AlertValidationResult.newBuilder(alertValidationResult2);
            builderNewBuilder.mergeFrom((AlertValidationResult.Builder) alertValidationResult);
            alertValidationResult = builderNewBuilder.buildPartial();
        }
        this.validationResult_ = alertValidationResult;
        this.bitField0_ |= GroupFlagsKt.HasAuxSlotFlag;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static AlerterInfo parseDelimitedFrom(InputStream inputStream) {
        return (AlerterInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AlerterInfo parseFrom(v vVar) {
        return (AlerterInfo) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<AlerterInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertId(AlerterId alerterId) {
        Objects.requireNonNull(alerterId);
        this.alertId_ = alerterId;
        this.bitField0_ |= 32768;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCloseDistanceSameAlertsCappingEnabled(boolean z) {
        this.bitField0_ |= 4194304;
        this.closeDistanceSameAlertsCappingEnabled_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescription(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.description_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescriptionBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.description_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDistanceString(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16384;
        this.distanceString_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDistanceStringBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.distanceString_ = vVar.u();
        this.bitField0_ |= 16384;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHideActionsWhenInvalid(boolean z) {
        this.bitField0_ |= 67108864;
        this.hideActionsWhenInvalid_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.iconName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconNameBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.iconName_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsApproachingWithValidation(boolean z) {
        this.bitField0_ |= 16777216;
        this.isApproachingWithValidation_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsCancellable(boolean z) {
        this.bitField0_ |= 32;
        this.isCancellable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsCloseOnly(boolean z) {
        this.bitField0_ |= 8192;
        this.isCloseOnly_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsEtaClickable(boolean z) {
        this.bitField0_ |= 8388608;
        this.isEtaClickable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsWarningMode(boolean z) {
        this.bitField0_ |= 2048;
        this.isWarningMode_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumThumbsUp(int i2) {
        this.bitField0_ |= 4096;
        this.numThumbsUp_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPosition(Position.IntPosition intPosition) {
        Objects.requireNonNull(intPosition);
        this.position_ = intPosition;
        this.bitField0_ |= 2097152;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrimaryButtonText(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.primaryButtonText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrimaryButtonTextBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.primaryButtonText_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportId(int i2) {
        this.bitField0_ |= 134217728;
        this.reportId_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecondaryButtonText(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.secondaryButtonText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecondaryButtonTextBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.secondaryButtonText_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShouldShowStillThere(boolean z) {
        this.bitField0_ |= 131072;
        this.shouldShowStillThere_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowDistance(boolean z) {
        this.bitField0_ |= 262144;
        this.showDistance_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowThumbsUp(boolean z) {
        this.bitField0_ |= 512;
        this.showThumbsUp_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowWithEta(boolean z) {
        this.bitField0_ |= 256;
        this.showWithEta_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSilentActivation(SilentActivation silentActivation) {
        this.silentActivation_ = silentActivation.getNumber();
        this.bitField0_ |= 1048576;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSilentActivationValue(int i2) {
        this.bitField0_ |= 1048576;
        this.silentActivation_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubType(int i2) {
        this.bitField0_ |= 65536;
        this.subType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeoutSeconds(int i2) {
        this.bitField0_ |= 64;
        this.timeoutSeconds_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimerType(AlerterTimerType alerterTimerType) {
        this.timerType_ = alerterTimerType.getNumber();
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimerTypeValue(int i2) {
        this.bitField0_ |= 128;
        this.timerType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitle(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.title_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.title_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleWithDistance(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 524288;
        this.titleWithDistance_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleWithDistanceBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.titleWithDistance_ = vVar.u();
        this.bitField0_ |= 524288;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(AlerterType alerterType) {
        this.type_ = alerterType.getNumber();
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i2) {
        this.bitField0_ |= 1024;
        this.type_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValidationResult(AlertValidationResult alertValidationResult) {
        Objects.requireNonNull(alertValidationResult);
        this.validationResult_ = alertValidationResult;
        this.bitField0_ |= GroupFlagsKt.HasAuxSlotFlag;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u001c\u0000\u0001\u0001\u001c\u001c\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ဇ\u0005\u0007င\u0006\bဌ\u0007\tဇ\b\nဇ\t\u000bဌ\n\fဇ\u000b\rင\f\u000eဇ\r\u000fለ\u000e\u0010ဉ\u000f\u0011င\u0010\u0012ဇ\u0011\u0013ဇ\u0012\u0014ለ\u0013\u0015ဌ\u0014\u0016ဉ\u0015\u0017ဇ\u0016\u0018ဇ\u0017\u0019ဇ\u0018\u001aဉ\u0019\u001bဇ\u001a\u001cင\u001b", new Object[]{"bitField0_", "title_", "description_", "iconName_", "primaryButtonText_", "secondaryButtonText_", "isCancellable_", "timeoutSeconds_", "timerType_", "showWithEta_", "showThumbsUp_", "type_", "isWarningMode_", "numThumbsUp_", "isCloseOnly_", "distanceString_", "alertId_", "subType_", "shouldShowStillThere_", "showDistance_", "titleWithDistance_", "silentActivation_", "position_", "closeDistanceSameAlertsCappingEnabled_", "isEtaClickable_", "isApproachingWithValidation_", "validationResult_", "hideActionsWhenInvalid_", "reportId_"});
        }
        if (iOrdinal == 3) {
            return new AlerterInfo();
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
        fo<AlerterInfo> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (AlerterInfo.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public AlerterId getAlertId() {
        AlerterId alerterId = this.alertId_;
        return alerterId == null ? AlerterId.getDefaultInstance() : alerterId;
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public boolean getCloseDistanceSameAlertsCappingEnabled() {
        return this.closeDistanceSameAlertsCappingEnabled_;
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public String getDescription() {
        return this.description_;
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public v getDescriptionBytes() {
        return v.s(this.description_);
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public String getDistanceString() {
        return this.distanceString_;
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public v getDistanceStringBytes() {
        return v.s(this.distanceString_);
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public boolean getHideActionsWhenInvalid() {
        return this.hideActionsWhenInvalid_;
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public String getIconName() {
        return this.iconName_;
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public v getIconNameBytes() {
        return v.s(this.iconName_);
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public boolean getIsApproachingWithValidation() {
        return this.isApproachingWithValidation_;
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public boolean getIsCancellable() {
        return this.isCancellable_;
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public boolean getIsCloseOnly() {
        return this.isCloseOnly_;
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public boolean getIsEtaClickable() {
        return this.isEtaClickable_;
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public boolean getIsWarningMode() {
        return this.isWarningMode_;
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public int getNumThumbsUp() {
        return this.numThumbsUp_;
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public Position.IntPosition getPosition() {
        Position.IntPosition intPosition = this.position_;
        return intPosition == null ? Position.IntPosition.getDefaultInstance() : intPosition;
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public String getPrimaryButtonText() {
        return this.primaryButtonText_;
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public v getPrimaryButtonTextBytes() {
        return v.s(this.primaryButtonText_);
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public int getReportId() {
        return this.reportId_;
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public String getSecondaryButtonText() {
        return this.secondaryButtonText_;
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public v getSecondaryButtonTextBytes() {
        return v.s(this.secondaryButtonText_);
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public boolean getShouldShowStillThere() {
        return this.shouldShowStillThere_;
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public boolean getShowDistance() {
        return this.showDistance_;
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public boolean getShowThumbsUp() {
        return this.showThumbsUp_;
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public boolean getShowWithEta() {
        return this.showWithEta_;
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public SilentActivation getSilentActivation() {
        SilentActivation silentActivationForNumber = SilentActivation.forNumber(this.silentActivation_);
        return silentActivationForNumber == null ? SilentActivation.UNRECOGNIZED : silentActivationForNumber;
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public int getSilentActivationValue() {
        return this.silentActivation_;
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public int getSubType() {
        return this.subType_;
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public int getTimeoutSeconds() {
        return this.timeoutSeconds_;
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public AlerterTimerType getTimerType() {
        AlerterTimerType alerterTimerTypeForNumber = AlerterTimerType.forNumber(this.timerType_);
        return alerterTimerTypeForNumber == null ? AlerterTimerType.UNRECOGNIZED : alerterTimerTypeForNumber;
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public int getTimerTypeValue() {
        return this.timerType_;
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public String getTitle() {
        return this.title_;
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public v getTitleBytes() {
        return v.s(this.title_);
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public String getTitleWithDistance() {
        return this.titleWithDistance_;
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public v getTitleWithDistanceBytes() {
        return v.s(this.titleWithDistance_);
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public AlerterType getType() {
        AlerterType alerterTypeForNumber = AlerterType.forNumber(this.type_);
        return alerterTypeForNumber == null ? AlerterType.UNRECOGNIZED : alerterTypeForNumber;
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public int getTypeValue() {
        return this.type_;
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public AlertValidationResult getValidationResult() {
        AlertValidationResult alertValidationResult = this.validationResult_;
        return alertValidationResult == null ? AlertValidationResult.getDefaultInstance() : alertValidationResult;
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public boolean hasAlertId() {
        return (this.bitField0_ & 32768) != 0;
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public boolean hasCloseDistanceSameAlertsCappingEnabled() {
        return (this.bitField0_ & 4194304) != 0;
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public boolean hasDescription() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public boolean hasDistanceString() {
        return (this.bitField0_ & 16384) != 0;
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public boolean hasHideActionsWhenInvalid() {
        return (this.bitField0_ & 67108864) != 0;
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public boolean hasIconName() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public boolean hasIsApproachingWithValidation() {
        return (this.bitField0_ & 16777216) != 0;
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public boolean hasIsCancellable() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public boolean hasIsCloseOnly() {
        return (this.bitField0_ & 8192) != 0;
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public boolean hasIsEtaClickable() {
        return (this.bitField0_ & 8388608) != 0;
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public boolean hasIsWarningMode() {
        return (this.bitField0_ & 2048) != 0;
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public boolean hasNumThumbsUp() {
        return (this.bitField0_ & 4096) != 0;
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public boolean hasPosition() {
        return (this.bitField0_ & 2097152) != 0;
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public boolean hasPrimaryButtonText() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public boolean hasReportId() {
        return (this.bitField0_ & 134217728) != 0;
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public boolean hasSecondaryButtonText() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public boolean hasShouldShowStillThere() {
        return (this.bitField0_ & 131072) != 0;
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public boolean hasShowDistance() {
        return (this.bitField0_ & 262144) != 0;
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public boolean hasShowThumbsUp() {
        return (this.bitField0_ & 512) != 0;
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public boolean hasShowWithEta() {
        return (this.bitField0_ & 256) != 0;
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public boolean hasSilentActivation() {
        return (this.bitField0_ & 1048576) != 0;
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public boolean hasSubType() {
        return (this.bitField0_ & 65536) != 0;
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public boolean hasTimeoutSeconds() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public boolean hasTimerType() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public boolean hasTitle() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public boolean hasTitleWithDistance() {
        return (this.bitField0_ & 524288) != 0;
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public boolean hasType() {
        return (this.bitField0_ & 1024) != 0;
    }

    @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
    public boolean hasValidationResult() {
        return (this.bitField0_ & GroupFlagsKt.HasAuxSlotFlag) != 0;
    }

    public static Builder newBuilder(AlerterInfo alerterInfo) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(alerterInfo);
    }

    public static AlerterInfo parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (AlerterInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static AlerterInfo parseFrom(v vVar, de deVar) {
        return (AlerterInfo) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static AlerterInfo parseFrom(z zVar) {
        return (AlerterInfo) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static AlerterInfo parseFrom(z zVar, de deVar) {
        return (AlerterInfo) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static AlerterInfo parseFrom(InputStream inputStream) {
        return (AlerterInfo) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AlerterInfo parseFrom(InputStream inputStream, de deVar) {
        return (AlerterInfo) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static AlerterInfo parseFrom(ByteBuffer byteBuffer) {
        return (AlerterInfo) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AlerterInfo parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (AlerterInfo) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<AlerterInfo, Builder> implements AlerterInfoOrBuilder {
        private Builder() {
            super(AlerterInfo.DEFAULT_INSTANCE);
        }

        public Builder clearAlertId() {
            copyOnWrite();
            ((AlerterInfo) this.instance).clearAlertId();
            return this;
        }

        public Builder clearCloseDistanceSameAlertsCappingEnabled() {
            copyOnWrite();
            ((AlerterInfo) this.instance).clearCloseDistanceSameAlertsCappingEnabled();
            return this;
        }

        public Builder clearDescription() {
            copyOnWrite();
            ((AlerterInfo) this.instance).clearDescription();
            return this;
        }

        public Builder clearDistanceString() {
            copyOnWrite();
            ((AlerterInfo) this.instance).clearDistanceString();
            return this;
        }

        public Builder clearHideActionsWhenInvalid() {
            copyOnWrite();
            ((AlerterInfo) this.instance).clearHideActionsWhenInvalid();
            return this;
        }

        public Builder clearIconName() {
            copyOnWrite();
            ((AlerterInfo) this.instance).clearIconName();
            return this;
        }

        public Builder clearIsApproachingWithValidation() {
            copyOnWrite();
            ((AlerterInfo) this.instance).clearIsApproachingWithValidation();
            return this;
        }

        public Builder clearIsCancellable() {
            copyOnWrite();
            ((AlerterInfo) this.instance).clearIsCancellable();
            return this;
        }

        public Builder clearIsCloseOnly() {
            copyOnWrite();
            ((AlerterInfo) this.instance).clearIsCloseOnly();
            return this;
        }

        public Builder clearIsEtaClickable() {
            copyOnWrite();
            ((AlerterInfo) this.instance).clearIsEtaClickable();
            return this;
        }

        public Builder clearIsWarningMode() {
            copyOnWrite();
            ((AlerterInfo) this.instance).clearIsWarningMode();
            return this;
        }

        public Builder clearNumThumbsUp() {
            copyOnWrite();
            ((AlerterInfo) this.instance).clearNumThumbsUp();
            return this;
        }

        public Builder clearPosition() {
            copyOnWrite();
            ((AlerterInfo) this.instance).clearPosition();
            return this;
        }

        public Builder clearPrimaryButtonText() {
            copyOnWrite();
            ((AlerterInfo) this.instance).clearPrimaryButtonText();
            return this;
        }

        public Builder clearReportId() {
            copyOnWrite();
            ((AlerterInfo) this.instance).clearReportId();
            return this;
        }

        public Builder clearSecondaryButtonText() {
            copyOnWrite();
            ((AlerterInfo) this.instance).clearSecondaryButtonText();
            return this;
        }

        public Builder clearShouldShowStillThere() {
            copyOnWrite();
            ((AlerterInfo) this.instance).clearShouldShowStillThere();
            return this;
        }

        public Builder clearShowDistance() {
            copyOnWrite();
            ((AlerterInfo) this.instance).clearShowDistance();
            return this;
        }

        public Builder clearShowThumbsUp() {
            copyOnWrite();
            ((AlerterInfo) this.instance).clearShowThumbsUp();
            return this;
        }

        public Builder clearShowWithEta() {
            copyOnWrite();
            ((AlerterInfo) this.instance).clearShowWithEta();
            return this;
        }

        public Builder clearSilentActivation() {
            copyOnWrite();
            ((AlerterInfo) this.instance).clearSilentActivation();
            return this;
        }

        public Builder clearSubType() {
            copyOnWrite();
            ((AlerterInfo) this.instance).clearSubType();
            return this;
        }

        public Builder clearTimeoutSeconds() {
            copyOnWrite();
            ((AlerterInfo) this.instance).clearTimeoutSeconds();
            return this;
        }

        public Builder clearTimerType() {
            copyOnWrite();
            ((AlerterInfo) this.instance).clearTimerType();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((AlerterInfo) this.instance).clearTitle();
            return this;
        }

        public Builder clearTitleWithDistance() {
            copyOnWrite();
            ((AlerterInfo) this.instance).clearTitleWithDistance();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((AlerterInfo) this.instance).clearType();
            return this;
        }

        public Builder clearValidationResult() {
            copyOnWrite();
            ((AlerterInfo) this.instance).clearValidationResult();
            return this;
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public AlerterId getAlertId() {
            return ((AlerterInfo) this.instance).getAlertId();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public boolean getCloseDistanceSameAlertsCappingEnabled() {
            return ((AlerterInfo) this.instance).getCloseDistanceSameAlertsCappingEnabled();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public String getDescription() {
            return ((AlerterInfo) this.instance).getDescription();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public v getDescriptionBytes() {
            return ((AlerterInfo) this.instance).getDescriptionBytes();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public String getDistanceString() {
            return ((AlerterInfo) this.instance).getDistanceString();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public v getDistanceStringBytes() {
            return ((AlerterInfo) this.instance).getDistanceStringBytes();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public boolean getHideActionsWhenInvalid() {
            return ((AlerterInfo) this.instance).getHideActionsWhenInvalid();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public String getIconName() {
            return ((AlerterInfo) this.instance).getIconName();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public v getIconNameBytes() {
            return ((AlerterInfo) this.instance).getIconNameBytes();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public boolean getIsApproachingWithValidation() {
            return ((AlerterInfo) this.instance).getIsApproachingWithValidation();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public boolean getIsCancellable() {
            return ((AlerterInfo) this.instance).getIsCancellable();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public boolean getIsCloseOnly() {
            return ((AlerterInfo) this.instance).getIsCloseOnly();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public boolean getIsEtaClickable() {
            return ((AlerterInfo) this.instance).getIsEtaClickable();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public boolean getIsWarningMode() {
            return ((AlerterInfo) this.instance).getIsWarningMode();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public int getNumThumbsUp() {
            return ((AlerterInfo) this.instance).getNumThumbsUp();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public Position.IntPosition getPosition() {
            return ((AlerterInfo) this.instance).getPosition();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public String getPrimaryButtonText() {
            return ((AlerterInfo) this.instance).getPrimaryButtonText();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public v getPrimaryButtonTextBytes() {
            return ((AlerterInfo) this.instance).getPrimaryButtonTextBytes();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public int getReportId() {
            return ((AlerterInfo) this.instance).getReportId();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public String getSecondaryButtonText() {
            return ((AlerterInfo) this.instance).getSecondaryButtonText();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public v getSecondaryButtonTextBytes() {
            return ((AlerterInfo) this.instance).getSecondaryButtonTextBytes();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public boolean getShouldShowStillThere() {
            return ((AlerterInfo) this.instance).getShouldShowStillThere();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public boolean getShowDistance() {
            return ((AlerterInfo) this.instance).getShowDistance();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public boolean getShowThumbsUp() {
            return ((AlerterInfo) this.instance).getShowThumbsUp();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public boolean getShowWithEta() {
            return ((AlerterInfo) this.instance).getShowWithEta();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public SilentActivation getSilentActivation() {
            return ((AlerterInfo) this.instance).getSilentActivation();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public int getSilentActivationValue() {
            return ((AlerterInfo) this.instance).getSilentActivationValue();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public int getSubType() {
            return ((AlerterInfo) this.instance).getSubType();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public int getTimeoutSeconds() {
            return ((AlerterInfo) this.instance).getTimeoutSeconds();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public AlerterTimerType getTimerType() {
            return ((AlerterInfo) this.instance).getTimerType();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public int getTimerTypeValue() {
            return ((AlerterInfo) this.instance).getTimerTypeValue();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public String getTitle() {
            return ((AlerterInfo) this.instance).getTitle();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public v getTitleBytes() {
            return ((AlerterInfo) this.instance).getTitleBytes();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public String getTitleWithDistance() {
            return ((AlerterInfo) this.instance).getTitleWithDistance();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public v getTitleWithDistanceBytes() {
            return ((AlerterInfo) this.instance).getTitleWithDistanceBytes();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public AlerterType getType() {
            return ((AlerterInfo) this.instance).getType();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public int getTypeValue() {
            return ((AlerterInfo) this.instance).getTypeValue();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public AlertValidationResult getValidationResult() {
            return ((AlerterInfo) this.instance).getValidationResult();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public boolean hasAlertId() {
            return ((AlerterInfo) this.instance).hasAlertId();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public boolean hasCloseDistanceSameAlertsCappingEnabled() {
            return ((AlerterInfo) this.instance).hasCloseDistanceSameAlertsCappingEnabled();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public boolean hasDescription() {
            return ((AlerterInfo) this.instance).hasDescription();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public boolean hasDistanceString() {
            return ((AlerterInfo) this.instance).hasDistanceString();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public boolean hasHideActionsWhenInvalid() {
            return ((AlerterInfo) this.instance).hasHideActionsWhenInvalid();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public boolean hasIconName() {
            return ((AlerterInfo) this.instance).hasIconName();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public boolean hasIsApproachingWithValidation() {
            return ((AlerterInfo) this.instance).hasIsApproachingWithValidation();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public boolean hasIsCancellable() {
            return ((AlerterInfo) this.instance).hasIsCancellable();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public boolean hasIsCloseOnly() {
            return ((AlerterInfo) this.instance).hasIsCloseOnly();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public boolean hasIsEtaClickable() {
            return ((AlerterInfo) this.instance).hasIsEtaClickable();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public boolean hasIsWarningMode() {
            return ((AlerterInfo) this.instance).hasIsWarningMode();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public boolean hasNumThumbsUp() {
            return ((AlerterInfo) this.instance).hasNumThumbsUp();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public boolean hasPosition() {
            return ((AlerterInfo) this.instance).hasPosition();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public boolean hasPrimaryButtonText() {
            return ((AlerterInfo) this.instance).hasPrimaryButtonText();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public boolean hasReportId() {
            return ((AlerterInfo) this.instance).hasReportId();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public boolean hasSecondaryButtonText() {
            return ((AlerterInfo) this.instance).hasSecondaryButtonText();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public boolean hasShouldShowStillThere() {
            return ((AlerterInfo) this.instance).hasShouldShowStillThere();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public boolean hasShowDistance() {
            return ((AlerterInfo) this.instance).hasShowDistance();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public boolean hasShowThumbsUp() {
            return ((AlerterInfo) this.instance).hasShowThumbsUp();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public boolean hasShowWithEta() {
            return ((AlerterInfo) this.instance).hasShowWithEta();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public boolean hasSilentActivation() {
            return ((AlerterInfo) this.instance).hasSilentActivation();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public boolean hasSubType() {
            return ((AlerterInfo) this.instance).hasSubType();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public boolean hasTimeoutSeconds() {
            return ((AlerterInfo) this.instance).hasTimeoutSeconds();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public boolean hasTimerType() {
            return ((AlerterInfo) this.instance).hasTimerType();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public boolean hasTitle() {
            return ((AlerterInfo) this.instance).hasTitle();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public boolean hasTitleWithDistance() {
            return ((AlerterInfo) this.instance).hasTitleWithDistance();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public boolean hasType() {
            return ((AlerterInfo) this.instance).hasType();
        }

        @Override // com.waze.jni.protos.alerters.AlerterInfoOrBuilder
        public boolean hasValidationResult() {
            return ((AlerterInfo) this.instance).hasValidationResult();
        }

        public Builder mergeAlertId(AlerterId alerterId) {
            copyOnWrite();
            ((AlerterInfo) this.instance).mergeAlertId(alerterId);
            return this;
        }

        public Builder mergePosition(Position.IntPosition intPosition) {
            copyOnWrite();
            ((AlerterInfo) this.instance).mergePosition(intPosition);
            return this;
        }

        public Builder mergeValidationResult(AlertValidationResult alertValidationResult) {
            copyOnWrite();
            ((AlerterInfo) this.instance).mergeValidationResult(alertValidationResult);
            return this;
        }

        public Builder setAlertId(AlerterId.Builder builder) {
            copyOnWrite();
            ((AlerterInfo) this.instance).setAlertId(builder.build());
            return this;
        }

        public Builder setCloseDistanceSameAlertsCappingEnabled(boolean z) {
            copyOnWrite();
            ((AlerterInfo) this.instance).setCloseDistanceSameAlertsCappingEnabled(z);
            return this;
        }

        public Builder setDescription(String str) {
            copyOnWrite();
            ((AlerterInfo) this.instance).setDescription(str);
            return this;
        }

        public Builder setDescriptionBytes(v vVar) {
            copyOnWrite();
            ((AlerterInfo) this.instance).setDescriptionBytes(vVar);
            return this;
        }

        public Builder setDistanceString(String str) {
            copyOnWrite();
            ((AlerterInfo) this.instance).setDistanceString(str);
            return this;
        }

        public Builder setDistanceStringBytes(v vVar) {
            copyOnWrite();
            ((AlerterInfo) this.instance).setDistanceStringBytes(vVar);
            return this;
        }

        public Builder setHideActionsWhenInvalid(boolean z) {
            copyOnWrite();
            ((AlerterInfo) this.instance).setHideActionsWhenInvalid(z);
            return this;
        }

        public Builder setIconName(String str) {
            copyOnWrite();
            ((AlerterInfo) this.instance).setIconName(str);
            return this;
        }

        public Builder setIconNameBytes(v vVar) {
            copyOnWrite();
            ((AlerterInfo) this.instance).setIconNameBytes(vVar);
            return this;
        }

        public Builder setIsApproachingWithValidation(boolean z) {
            copyOnWrite();
            ((AlerterInfo) this.instance).setIsApproachingWithValidation(z);
            return this;
        }

        public Builder setIsCancellable(boolean z) {
            copyOnWrite();
            ((AlerterInfo) this.instance).setIsCancellable(z);
            return this;
        }

        public Builder setIsCloseOnly(boolean z) {
            copyOnWrite();
            ((AlerterInfo) this.instance).setIsCloseOnly(z);
            return this;
        }

        public Builder setIsEtaClickable(boolean z) {
            copyOnWrite();
            ((AlerterInfo) this.instance).setIsEtaClickable(z);
            return this;
        }

        public Builder setIsWarningMode(boolean z) {
            copyOnWrite();
            ((AlerterInfo) this.instance).setIsWarningMode(z);
            return this;
        }

        public Builder setNumThumbsUp(int i2) {
            copyOnWrite();
            ((AlerterInfo) this.instance).setNumThumbsUp(i2);
            return this;
        }

        public Builder setPosition(Position.IntPosition.Builder builder) {
            copyOnWrite();
            ((AlerterInfo) this.instance).setPosition(builder.build());
            return this;
        }

        public Builder setPrimaryButtonText(String str) {
            copyOnWrite();
            ((AlerterInfo) this.instance).setPrimaryButtonText(str);
            return this;
        }

        public Builder setPrimaryButtonTextBytes(v vVar) {
            copyOnWrite();
            ((AlerterInfo) this.instance).setPrimaryButtonTextBytes(vVar);
            return this;
        }

        public Builder setReportId(int i2) {
            copyOnWrite();
            ((AlerterInfo) this.instance).setReportId(i2);
            return this;
        }

        public Builder setSecondaryButtonText(String str) {
            copyOnWrite();
            ((AlerterInfo) this.instance).setSecondaryButtonText(str);
            return this;
        }

        public Builder setSecondaryButtonTextBytes(v vVar) {
            copyOnWrite();
            ((AlerterInfo) this.instance).setSecondaryButtonTextBytes(vVar);
            return this;
        }

        public Builder setShouldShowStillThere(boolean z) {
            copyOnWrite();
            ((AlerterInfo) this.instance).setShouldShowStillThere(z);
            return this;
        }

        public Builder setShowDistance(boolean z) {
            copyOnWrite();
            ((AlerterInfo) this.instance).setShowDistance(z);
            return this;
        }

        public Builder setShowThumbsUp(boolean z) {
            copyOnWrite();
            ((AlerterInfo) this.instance).setShowThumbsUp(z);
            return this;
        }

        public Builder setShowWithEta(boolean z) {
            copyOnWrite();
            ((AlerterInfo) this.instance).setShowWithEta(z);
            return this;
        }

        public Builder setSilentActivation(SilentActivation silentActivation) {
            copyOnWrite();
            ((AlerterInfo) this.instance).setSilentActivation(silentActivation);
            return this;
        }

        public Builder setSilentActivationValue(int i2) {
            copyOnWrite();
            ((AlerterInfo) this.instance).setSilentActivationValue(i2);
            return this;
        }

        public Builder setSubType(int i2) {
            copyOnWrite();
            ((AlerterInfo) this.instance).setSubType(i2);
            return this;
        }

        public Builder setTimeoutSeconds(int i2) {
            copyOnWrite();
            ((AlerterInfo) this.instance).setTimeoutSeconds(i2);
            return this;
        }

        public Builder setTimerType(AlerterTimerType alerterTimerType) {
            copyOnWrite();
            ((AlerterInfo) this.instance).setTimerType(alerterTimerType);
            return this;
        }

        public Builder setTimerTypeValue(int i2) {
            copyOnWrite();
            ((AlerterInfo) this.instance).setTimerTypeValue(i2);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((AlerterInfo) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(v vVar) {
            copyOnWrite();
            ((AlerterInfo) this.instance).setTitleBytes(vVar);
            return this;
        }

        public Builder setTitleWithDistance(String str) {
            copyOnWrite();
            ((AlerterInfo) this.instance).setTitleWithDistance(str);
            return this;
        }

        public Builder setTitleWithDistanceBytes(v vVar) {
            copyOnWrite();
            ((AlerterInfo) this.instance).setTitleWithDistanceBytes(vVar);
            return this;
        }

        public Builder setType(AlerterType alerterType) {
            copyOnWrite();
            ((AlerterInfo) this.instance).setType(alerterType);
            return this;
        }

        public Builder setTypeValue(int i2) {
            copyOnWrite();
            ((AlerterInfo) this.instance).setTypeValue(i2);
            return this;
        }

        public Builder setValidationResult(AlertValidationResult.Builder builder) {
            copyOnWrite();
            ((AlerterInfo) this.instance).setValidationResult(builder.build());
            return this;
        }

        public Builder setAlertId(AlerterId alerterId) {
            copyOnWrite();
            ((AlerterInfo) this.instance).setAlertId(alerterId);
            return this;
        }

        public Builder setPosition(Position.IntPosition intPosition) {
            copyOnWrite();
            ((AlerterInfo) this.instance).setPosition(intPosition);
            return this;
        }

        public Builder setValidationResult(AlertValidationResult alertValidationResult) {
            copyOnWrite();
            ((AlerterInfo) this.instance).setValidationResult(alertValidationResult);
            return this;
        }
    }

    public static AlerterInfo parseFrom(byte[] bArr) {
        return (AlerterInfo) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AlerterInfo parseFrom(byte[] bArr, de deVar) {
        return (AlerterInfo) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
