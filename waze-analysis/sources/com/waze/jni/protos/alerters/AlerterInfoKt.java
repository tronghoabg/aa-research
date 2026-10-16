package com.waze.jni.protos.alerters;

import com.waze.jni.protos.Position;
import com.waze.jni.protos.alerters.AlerterInfo;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class AlerterInfoKt {
    public static final AlerterInfoKt INSTANCE = new AlerterInfoKt();

    private AlerterInfoKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final AlerterInfo.Builder _builder;

        private Dsl(AlerterInfo.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ AlerterInfo _build() {
            AlerterInfo alerterInfoBuild = this._builder.build();
            x.e(alerterInfoBuild, "build(...)");
            return alerterInfoBuild;
        }

        public final void clearAlertId() {
            this._builder.clearAlertId();
        }

        public final void clearCloseDistanceSameAlertsCappingEnabled() {
            this._builder.clearCloseDistanceSameAlertsCappingEnabled();
        }

        public final void clearDescription() {
            this._builder.clearDescription();
        }

        public final void clearDistanceString() {
            this._builder.clearDistanceString();
        }

        public final void clearHideActionsWhenInvalid() {
            this._builder.clearHideActionsWhenInvalid();
        }

        public final void clearIconName() {
            this._builder.clearIconName();
        }

        public final void clearIsApproachingWithValidation() {
            this._builder.clearIsApproachingWithValidation();
        }

        public final void clearIsCancellable() {
            this._builder.clearIsCancellable();
        }

        public final void clearIsCloseOnly() {
            this._builder.clearIsCloseOnly();
        }

        public final void clearIsEtaClickable() {
            this._builder.clearIsEtaClickable();
        }

        public final void clearIsWarningMode() {
            this._builder.clearIsWarningMode();
        }

        public final void clearNumThumbsUp() {
            this._builder.clearNumThumbsUp();
        }

        public final void clearPosition() {
            this._builder.clearPosition();
        }

        public final void clearPrimaryButtonText() {
            this._builder.clearPrimaryButtonText();
        }

        public final void clearReportId() {
            this._builder.clearReportId();
        }

        public final void clearSecondaryButtonText() {
            this._builder.clearSecondaryButtonText();
        }

        public final void clearShouldShowStillThere() {
            this._builder.clearShouldShowStillThere();
        }

        public final void clearShowDistance() {
            this._builder.clearShowDistance();
        }

        public final void clearShowThumbsUp() {
            this._builder.clearShowThumbsUp();
        }

        public final void clearShowWithEta() {
            this._builder.clearShowWithEta();
        }

        public final void clearSilentActivation() {
            this._builder.clearSilentActivation();
        }

        public final void clearSubType() {
            this._builder.clearSubType();
        }

        public final void clearTimeoutSeconds() {
            this._builder.clearTimeoutSeconds();
        }

        public final void clearTimerType() {
            this._builder.clearTimerType();
        }

        public final void clearTitle() {
            this._builder.clearTitle();
        }

        public final void clearTitleWithDistance() {
            this._builder.clearTitleWithDistance();
        }

        public final void clearType() {
            this._builder.clearType();
        }

        public final void clearValidationResult() {
            this._builder.clearValidationResult();
        }

        public final AlerterId getAlertId() {
            AlerterId alertId = this._builder.getAlertId();
            x.e(alertId, "getAlertId(...)");
            return alertId;
        }

        public final AlerterId getAlertIdOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return AlerterInfoKtKt.getAlertIdOrNull(dsl._builder);
        }

        public final boolean getCloseDistanceSameAlertsCappingEnabled() {
            return this._builder.getCloseDistanceSameAlertsCappingEnabled();
        }

        public final String getDescription() {
            String description = this._builder.getDescription();
            x.e(description, "getDescription(...)");
            return description;
        }

        public final String getDistanceString() {
            String distanceString = this._builder.getDistanceString();
            x.e(distanceString, "getDistanceString(...)");
            return distanceString;
        }

        public final boolean getHideActionsWhenInvalid() {
            return this._builder.getHideActionsWhenInvalid();
        }

        public final String getIconName() {
            String iconName = this._builder.getIconName();
            x.e(iconName, "getIconName(...)");
            return iconName;
        }

        public final boolean getIsApproachingWithValidation() {
            return this._builder.getIsApproachingWithValidation();
        }

        public final boolean getIsCancellable() {
            return this._builder.getIsCancellable();
        }

        public final boolean getIsCloseOnly() {
            return this._builder.getIsCloseOnly();
        }

        public final boolean getIsEtaClickable() {
            return this._builder.getIsEtaClickable();
        }

        public final boolean getIsWarningMode() {
            return this._builder.getIsWarningMode();
        }

        public final int getNumThumbsUp() {
            return this._builder.getNumThumbsUp();
        }

        public final Position.IntPosition getPosition() {
            Position.IntPosition position = this._builder.getPosition();
            x.e(position, "getPosition(...)");
            return position;
        }

        public final Position.IntPosition getPositionOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return AlerterInfoKtKt.getPositionOrNull(dsl._builder);
        }

        public final String getPrimaryButtonText() {
            String primaryButtonText = this._builder.getPrimaryButtonText();
            x.e(primaryButtonText, "getPrimaryButtonText(...)");
            return primaryButtonText;
        }

        public final int getReportId() {
            return this._builder.getReportId();
        }

        public final String getSecondaryButtonText() {
            String secondaryButtonText = this._builder.getSecondaryButtonText();
            x.e(secondaryButtonText, "getSecondaryButtonText(...)");
            return secondaryButtonText;
        }

        public final boolean getShouldShowStillThere() {
            return this._builder.getShouldShowStillThere();
        }

        public final boolean getShowDistance() {
            return this._builder.getShowDistance();
        }

        public final boolean getShowThumbsUp() {
            return this._builder.getShowThumbsUp();
        }

        public final boolean getShowWithEta() {
            return this._builder.getShowWithEta();
        }

        public final SilentActivation getSilentActivation() {
            SilentActivation silentActivation = this._builder.getSilentActivation();
            x.e(silentActivation, "getSilentActivation(...)");
            return silentActivation;
        }

        public final int getSilentActivationValue() {
            return this._builder.getSilentActivationValue();
        }

        public final int getSubType() {
            return this._builder.getSubType();
        }

        public final int getTimeoutSeconds() {
            return this._builder.getTimeoutSeconds();
        }

        public final AlerterTimerType getTimerType() {
            AlerterTimerType timerType = this._builder.getTimerType();
            x.e(timerType, "getTimerType(...)");
            return timerType;
        }

        public final int getTimerTypeValue() {
            return this._builder.getTimerTypeValue();
        }

        public final String getTitle() {
            String title = this._builder.getTitle();
            x.e(title, "getTitle(...)");
            return title;
        }

        public final String getTitleWithDistance() {
            String titleWithDistance = this._builder.getTitleWithDistance();
            x.e(titleWithDistance, "getTitleWithDistance(...)");
            return titleWithDistance;
        }

        public final AlerterType getType() {
            AlerterType type = this._builder.getType();
            x.e(type, "getType(...)");
            return type;
        }

        public final int getTypeValue() {
            return this._builder.getTypeValue();
        }

        public final AlertValidationResult getValidationResult() {
            AlertValidationResult validationResult = this._builder.getValidationResult();
            x.e(validationResult, "getValidationResult(...)");
            return validationResult;
        }

        public final AlertValidationResult getValidationResultOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return AlerterInfoKtKt.getValidationResultOrNull(dsl._builder);
        }

        public final boolean hasAlertId() {
            return this._builder.hasAlertId();
        }

        public final boolean hasCloseDistanceSameAlertsCappingEnabled() {
            return this._builder.hasCloseDistanceSameAlertsCappingEnabled();
        }

        public final boolean hasDescription() {
            return this._builder.hasDescription();
        }

        public final boolean hasDistanceString() {
            return this._builder.hasDistanceString();
        }

        public final boolean hasHideActionsWhenInvalid() {
            return this._builder.hasHideActionsWhenInvalid();
        }

        public final boolean hasIconName() {
            return this._builder.hasIconName();
        }

        public final boolean hasIsApproachingWithValidation() {
            return this._builder.hasIsApproachingWithValidation();
        }

        public final boolean hasIsCancellable() {
            return this._builder.hasIsCancellable();
        }

        public final boolean hasIsCloseOnly() {
            return this._builder.hasIsCloseOnly();
        }

        public final boolean hasIsEtaClickable() {
            return this._builder.hasIsEtaClickable();
        }

        public final boolean hasIsWarningMode() {
            return this._builder.hasIsWarningMode();
        }

        public final boolean hasNumThumbsUp() {
            return this._builder.hasNumThumbsUp();
        }

        public final boolean hasPosition() {
            return this._builder.hasPosition();
        }

        public final boolean hasPrimaryButtonText() {
            return this._builder.hasPrimaryButtonText();
        }

        public final boolean hasReportId() {
            return this._builder.hasReportId();
        }

        public final boolean hasSecondaryButtonText() {
            return this._builder.hasSecondaryButtonText();
        }

        public final boolean hasShouldShowStillThere() {
            return this._builder.hasShouldShowStillThere();
        }

        public final boolean hasShowDistance() {
            return this._builder.hasShowDistance();
        }

        public final boolean hasShowThumbsUp() {
            return this._builder.hasShowThumbsUp();
        }

        public final boolean hasShowWithEta() {
            return this._builder.hasShowWithEta();
        }

        public final boolean hasSilentActivation() {
            return this._builder.hasSilentActivation();
        }

        public final boolean hasSubType() {
            return this._builder.hasSubType();
        }

        public final boolean hasTimeoutSeconds() {
            return this._builder.hasTimeoutSeconds();
        }

        public final boolean hasTimerType() {
            return this._builder.hasTimerType();
        }

        public final boolean hasTitle() {
            return this._builder.hasTitle();
        }

        public final boolean hasTitleWithDistance() {
            return this._builder.hasTitleWithDistance();
        }

        public final boolean hasType() {
            return this._builder.hasType();
        }

        public final boolean hasValidationResult() {
            return this._builder.hasValidationResult();
        }

        public final void setAlertId(AlerterId alerterId) {
            x.f(alerterId, "value");
            this._builder.setAlertId(alerterId);
        }

        public final void setCloseDistanceSameAlertsCappingEnabled(boolean z) {
            this._builder.setCloseDistanceSameAlertsCappingEnabled(z);
        }

        public final void setDescription(String str) {
            x.f(str, "value");
            this._builder.setDescription(str);
        }

        public final void setDistanceString(String str) {
            x.f(str, "value");
            this._builder.setDistanceString(str);
        }

        public final void setHideActionsWhenInvalid(boolean z) {
            this._builder.setHideActionsWhenInvalid(z);
        }

        public final void setIconName(String str) {
            x.f(str, "value");
            this._builder.setIconName(str);
        }

        public final void setIsApproachingWithValidation(boolean z) {
            this._builder.setIsApproachingWithValidation(z);
        }

        public final void setIsCancellable(boolean z) {
            this._builder.setIsCancellable(z);
        }

        public final void setIsCloseOnly(boolean z) {
            this._builder.setIsCloseOnly(z);
        }

        public final void setIsEtaClickable(boolean z) {
            this._builder.setIsEtaClickable(z);
        }

        public final void setIsWarningMode(boolean z) {
            this._builder.setIsWarningMode(z);
        }

        public final void setNumThumbsUp(int i2) {
            this._builder.setNumThumbsUp(i2);
        }

        public final void setPosition(Position.IntPosition intPosition) {
            x.f(intPosition, "value");
            this._builder.setPosition(intPosition);
        }

        public final void setPrimaryButtonText(String str) {
            x.f(str, "value");
            this._builder.setPrimaryButtonText(str);
        }

        public final void setReportId(int i2) {
            this._builder.setReportId(i2);
        }

        public final void setSecondaryButtonText(String str) {
            x.f(str, "value");
            this._builder.setSecondaryButtonText(str);
        }

        public final void setShouldShowStillThere(boolean z) {
            this._builder.setShouldShowStillThere(z);
        }

        public final void setShowDistance(boolean z) {
            this._builder.setShowDistance(z);
        }

        public final void setShowThumbsUp(boolean z) {
            this._builder.setShowThumbsUp(z);
        }

        public final void setShowWithEta(boolean z) {
            this._builder.setShowWithEta(z);
        }

        public final void setSilentActivation(SilentActivation silentActivation) {
            x.f(silentActivation, "value");
            this._builder.setSilentActivation(silentActivation);
        }

        public final void setSilentActivationValue(int i2) {
            this._builder.setSilentActivationValue(i2);
        }

        public final void setSubType(int i2) {
            this._builder.setSubType(i2);
        }

        public final void setTimeoutSeconds(int i2) {
            this._builder.setTimeoutSeconds(i2);
        }

        public final void setTimerType(AlerterTimerType alerterTimerType) {
            x.f(alerterTimerType, "value");
            this._builder.setTimerType(alerterTimerType);
        }

        public final void setTimerTypeValue(int i2) {
            this._builder.setTimerTypeValue(i2);
        }

        public final void setTitle(String str) {
            x.f(str, "value");
            this._builder.setTitle(str);
        }

        public final void setTitleWithDistance(String str) {
            x.f(str, "value");
            this._builder.setTitleWithDistance(str);
        }

        public final void setType(AlerterType alerterType) {
            x.f(alerterType, "value");
            this._builder.setType(alerterType);
        }

        public final void setTypeValue(int i2) {
            this._builder.setTypeValue(i2);
        }

        public final void setValidationResult(AlertValidationResult alertValidationResult) {
            x.f(alertValidationResult, "value");
            this._builder.setValidationResult(alertValidationResult);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(AlerterInfo.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(AlerterInfo.Builder builder, o oVar) {
            this(builder);
        }
    }
}
