package com.waze.jni.protos.rtalerts;

import com.waze.jni.protos.rtalerts.RtAlertItem;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class RtAlertItemKt {
    public static final RtAlertItemKt INSTANCE = new RtAlertItemKt();

    private RtAlertItemKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final RtAlertItem.Builder _builder;

        private Dsl(RtAlertItem.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ RtAlertItem _build() {
            RtAlertItem rtAlertItemBuild = this._builder.build();
            x.e(rtAlertItemBuild, "build(...)");
            return rtAlertItemBuild;
        }

        public final void clearBackgroundColor() {
            this._builder.clearBackgroundColor();
        }

        public final void clearDescription() {
            this._builder.clearDescription();
        }

        public final void clearDistance() {
            this._builder.clearDistance();
        }

        public final void clearDistanceStr() {
            this._builder.clearDistanceStr();
        }

        public final void clearIcon() {
            this._builder.clearIcon();
        }

        public final void clearId() {
            this._builder.clearId();
        }

        public final void clearImageId() {
            this._builder.clearImageId();
        }

        public final void clearImageUrl() {
            this._builder.clearImageUrl();
        }

        public final void clearIsAlertByMe() {
            this._builder.clearIsAlertByMe();
        }

        public final void clearIsAlertOnRoute() {
            this._builder.clearIsAlertOnRoute();
        }

        public final void clearIsAutoJam() {
            this._builder.clearIsAutoJam();
        }

        public final void clearIsCommentingAllowed() {
            this._builder.clearIsCommentingAllowed();
        }

        public final void clearIsLikingAllowed() {
            this._builder.clearIsLikingAllowed();
        }

        public final void clearIsThumbsUpByMe() {
            this._builder.clearIsThumbsUpByMe();
        }

        public final void clearLatitude() {
            this._builder.clearLatitude();
        }

        public final void clearLocationStr() {
            this._builder.clearLocationStr();
        }

        public final void clearLongitude() {
            this._builder.clearLongitude();
        }

        public final void clearMoodName() {
            this._builder.clearMoodName();
        }

        public final void clearNumComments() {
            this._builder.clearNumComments();
        }

        public final void clearNumThumbsUp() {
            this._builder.clearNumThumbsUp();
        }

        public final void clearReportedBy() {
            this._builder.clearReportedBy();
        }

        public final void clearScreenX() {
            this._builder.clearScreenX();
        }

        public final void clearScreenY() {
            this._builder.clearScreenY();
        }

        public final void clearTimeOnRoute() {
            this._builder.clearTimeOnRoute();
        }

        public final void clearTimeRelative() {
            this._builder.clearTimeRelative();
        }

        public final void clearTimeStampSec() {
            this._builder.clearTimeStampSec();
        }

        public final void clearTitle() {
            this._builder.clearTitle();
        }

        public final void clearType() {
            this._builder.clearType();
        }

        public final void clearUnit() {
            this._builder.clearUnit();
        }

        public final int getBackgroundColor() {
            return this._builder.getBackgroundColor();
        }

        public final String getDescription() {
            String description = this._builder.getDescription();
            x.e(description, "getDescription(...)");
            return description;
        }

        public final int getDistance() {
            return this._builder.getDistance();
        }

        public final String getDistanceStr() {
            String distanceStr = this._builder.getDistanceStr();
            x.e(distanceStr, "getDistanceStr(...)");
            return distanceStr;
        }

        public final String getIcon() {
            String icon = this._builder.getIcon();
            x.e(icon, "getIcon(...)");
            return icon;
        }

        public final int getId() {
            return this._builder.getId();
        }

        public final String getImageId() {
            String imageId = this._builder.getImageId();
            x.e(imageId, "getImageId(...)");
            return imageId;
        }

        public final String getImageUrl() {
            String imageUrl = this._builder.getImageUrl();
            x.e(imageUrl, "getImageUrl(...)");
            return imageUrl;
        }

        public final boolean getIsAlertByMe() {
            return this._builder.getIsAlertByMe();
        }

        public final boolean getIsAlertOnRoute() {
            return this._builder.getIsAlertOnRoute();
        }

        public final boolean getIsAutoJam() {
            return this._builder.getIsAutoJam();
        }

        public final boolean getIsCommentingAllowed() {
            return this._builder.getIsCommentingAllowed();
        }

        public final boolean getIsLikingAllowed() {
            return this._builder.getIsLikingAllowed();
        }

        public final boolean getIsThumbsUpByMe() {
            return this._builder.getIsThumbsUpByMe();
        }

        public final int getLatitude() {
            return this._builder.getLatitude();
        }

        public final String getLocationStr() {
            String locationStr = this._builder.getLocationStr();
            x.e(locationStr, "getLocationStr(...)");
            return locationStr;
        }

        public final int getLongitude() {
            return this._builder.getLongitude();
        }

        public final String getMoodName() {
            String moodName = this._builder.getMoodName();
            x.e(moodName, "getMoodName(...)");
            return moodName;
        }

        public final int getNumComments() {
            return this._builder.getNumComments();
        }

        public final int getNumThumbsUp() {
            return this._builder.getNumThumbsUp();
        }

        public final String getReportedBy() {
            String reportedBy = this._builder.getReportedBy();
            x.e(reportedBy, "getReportedBy(...)");
            return reportedBy;
        }

        public final int getScreenX() {
            return this._builder.getScreenX();
        }

        public final int getScreenY() {
            return this._builder.getScreenY();
        }

        public final String getTimeOnRoute() {
            String timeOnRoute = this._builder.getTimeOnRoute();
            x.e(timeOnRoute, "getTimeOnRoute(...)");
            return timeOnRoute;
        }

        public final String getTimeRelative() {
            String timeRelative = this._builder.getTimeRelative();
            x.e(timeRelative, "getTimeRelative(...)");
            return timeRelative;
        }

        public final int getTimeStampSec() {
            return this._builder.getTimeStampSec();
        }

        public final String getTitle() {
            String title = this._builder.getTitle();
            x.e(title, "getTitle(...)");
            return title;
        }

        public final RtAlertItem.Type getType() {
            RtAlertItem.Type type = this._builder.getType();
            x.e(type, "getType(...)");
            return type;
        }

        public final int getTypeValue() {
            return this._builder.getTypeValue();
        }

        public final String getUnit() {
            String unit = this._builder.getUnit();
            x.e(unit, "getUnit(...)");
            return unit;
        }

        public final boolean hasImageId() {
            return this._builder.hasImageId();
        }

        public final boolean hasImageUrl() {
            return this._builder.hasImageUrl();
        }

        public final boolean hasIsCommentingAllowed() {
            return this._builder.hasIsCommentingAllowed();
        }

        public final boolean hasIsLikingAllowed() {
            return this._builder.hasIsLikingAllowed();
        }

        public final boolean hasLatitude() {
            return this._builder.hasLatitude();
        }

        public final boolean hasLongitude() {
            return this._builder.hasLongitude();
        }

        public final boolean hasReportedBy() {
            return this._builder.hasReportedBy();
        }

        public final boolean hasTimeRelative() {
            return this._builder.hasTimeRelative();
        }

        public final boolean hasTimeStampSec() {
            return this._builder.hasTimeStampSec();
        }

        public final void setBackgroundColor(int i2) {
            this._builder.setBackgroundColor(i2);
        }

        public final void setDescription(String str) {
            x.f(str, "value");
            this._builder.setDescription(str);
        }

        public final void setDistance(int i2) {
            this._builder.setDistance(i2);
        }

        public final void setDistanceStr(String str) {
            x.f(str, "value");
            this._builder.setDistanceStr(str);
        }

        public final void setIcon(String str) {
            x.f(str, "value");
            this._builder.setIcon(str);
        }

        public final void setId(int i2) {
            this._builder.setId(i2);
        }

        public final void setImageId(String str) {
            x.f(str, "value");
            this._builder.setImageId(str);
        }

        public final void setImageUrl(String str) {
            x.f(str, "value");
            this._builder.setImageUrl(str);
        }

        public final void setIsAlertByMe(boolean z) {
            this._builder.setIsAlertByMe(z);
        }

        public final void setIsAlertOnRoute(boolean z) {
            this._builder.setIsAlertOnRoute(z);
        }

        public final void setIsAutoJam(boolean z) {
            this._builder.setIsAutoJam(z);
        }

        public final void setIsCommentingAllowed(boolean z) {
            this._builder.setIsCommentingAllowed(z);
        }

        public final void setIsLikingAllowed(boolean z) {
            this._builder.setIsLikingAllowed(z);
        }

        public final void setIsThumbsUpByMe(boolean z) {
            this._builder.setIsThumbsUpByMe(z);
        }

        public final void setLatitude(int i2) {
            this._builder.setLatitude(i2);
        }

        public final void setLocationStr(String str) {
            x.f(str, "value");
            this._builder.setLocationStr(str);
        }

        public final void setLongitude(int i2) {
            this._builder.setLongitude(i2);
        }

        public final void setMoodName(String str) {
            x.f(str, "value");
            this._builder.setMoodName(str);
        }

        public final void setNumComments(int i2) {
            this._builder.setNumComments(i2);
        }

        public final void setNumThumbsUp(int i2) {
            this._builder.setNumThumbsUp(i2);
        }

        public final void setReportedBy(String str) {
            x.f(str, "value");
            this._builder.setReportedBy(str);
        }

        public final void setScreenX(int i2) {
            this._builder.setScreenX(i2);
        }

        public final void setScreenY(int i2) {
            this._builder.setScreenY(i2);
        }

        public final void setTimeOnRoute(String str) {
            x.f(str, "value");
            this._builder.setTimeOnRoute(str);
        }

        public final void setTimeRelative(String str) {
            x.f(str, "value");
            this._builder.setTimeRelative(str);
        }

        public final void setTimeStampSec(int i2) {
            this._builder.setTimeStampSec(i2);
        }

        public final void setTitle(String str) {
            x.f(str, "value");
            this._builder.setTitle(str);
        }

        public final void setType(RtAlertItem.Type type) {
            x.f(type, "value");
            this._builder.setType(type);
        }

        public final void setTypeValue(int i2) {
            this._builder.setTypeValue(i2);
        }

        public final void setUnit(String str) {
            x.f(str, "value");
            this._builder.setUnit(str);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(RtAlertItem.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(RtAlertItem.Builder builder, o oVar) {
            this(builder);
        }
    }
}
