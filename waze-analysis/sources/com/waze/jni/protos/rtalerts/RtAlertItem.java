package com.waze.jni.protos.rtalerts;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eg;
import com.google.v.eh;
import com.google.v.ei;
import com.google.v.ep;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class RtAlertItem extends du<RtAlertItem, Builder> implements RtAlertItemOrBuilder {
    public static final int BACKGROUND_COLOR_FIELD_NUMBER = 27;
    private static final RtAlertItem DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 8;
    public static final int DISTANCE_FIELD_NUMBER = 13;
    public static final int DISTANCE_STR_FIELD_NUMBER = 12;
    public static final int ICON_FIELD_NUMBER = 4;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int IMAGE_ID_FIELD_NUMBER = 15;
    public static final int IMAGE_URL_FIELD_NUMBER = 16;
    public static final int IS_ALERT_BY_ME_FIELD_NUMBER = 18;
    public static final int IS_ALERT_ON_ROUTE_FIELD_NUMBER = 20;
    public static final int IS_AUTO_JAM_FIELD_NUMBER = 17;
    public static final int IS_COMMENTING_ALLOWED_FIELD_NUMBER = 28;
    public static final int IS_LIKING_ALLOWED_FIELD_NUMBER = 29;
    public static final int IS_THUMBS_UP_BY_ME_FIELD_NUMBER = 19;
    public static final int LATITUDE_FIELD_NUMBER = 7;
    public static final int LOCATION_STR_FIELD_NUMBER = 5;
    public static final int LONGITUDE_FIELD_NUMBER = 6;
    public static final int MOOD_NAME_FIELD_NUMBER = 25;
    public static final int NUM_COMMENTS_FIELD_NUMBER = 21;
    public static final int NUM_THUMBS_UP_FIELD_NUMBER = 22;
    private static volatile fo<RtAlertItem> PARSER = null;
    public static final int REPORTED_BY_FIELD_NUMBER = 11;
    public static final int SCREEN_X_FIELD_NUMBER = 23;
    public static final int SCREEN_Y_FIELD_NUMBER = 24;
    public static final int TIME_ON_ROUTE_FIELD_NUMBER = 26;
    public static final int TIME_RELATIVE_FIELD_NUMBER = 9;
    public static final int TIME_STAMP_SEC_FIELD_NUMBER = 10;
    public static final int TITLE_FIELD_NUMBER = 3;
    public static final int TYPE_FIELD_NUMBER = 2;
    public static final int UNIT_FIELD_NUMBER = 14;
    private int backgroundColor_;
    private int bitField0_;
    private int distance_;
    private int id_;
    private boolean isAlertByMe_;
    private boolean isAlertOnRoute_;
    private boolean isAutoJam_;
    private boolean isCommentingAllowed_;
    private boolean isLikingAllowed_;
    private boolean isThumbsUpByMe_;
    private int latitude_;
    private int longitude_;
    private int numComments_;
    private int numThumbsUp_;
    private int screenX_;
    private int screenY_;
    private int timeStampSec_;
    private int type_;
    private String title_ = "";
    private String icon_ = "";
    private String locationStr_ = "";
    private String description_ = "";
    private String timeRelative_ = "";
    private String reportedBy_ = "";
    private String distanceStr_ = "";
    private String unit_ = "";
    private String imageId_ = "";
    private String imageUrl_ = "";
    private String moodName_ = "";
    private String timeOnRoute_ = "";

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.rtalerts.RtAlertItem$1, reason: invalid class name */
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
    public final class Builder extends dm<RtAlertItem, Builder> implements RtAlertItemOrBuilder {
        private Builder() {
            super(RtAlertItem.DEFAULT_INSTANCE);
        }

        public Builder clearBackgroundColor() {
            copyOnWrite();
            ((RtAlertItem) this.instance).clearBackgroundColor();
            return this;
        }

        public Builder clearDescription() {
            copyOnWrite();
            ((RtAlertItem) this.instance).clearDescription();
            return this;
        }

        public Builder clearDistance() {
            copyOnWrite();
            ((RtAlertItem) this.instance).clearDistance();
            return this;
        }

        public Builder clearDistanceStr() {
            copyOnWrite();
            ((RtAlertItem) this.instance).clearDistanceStr();
            return this;
        }

        public Builder clearIcon() {
            copyOnWrite();
            ((RtAlertItem) this.instance).clearIcon();
            return this;
        }

        public Builder clearId() {
            copyOnWrite();
            ((RtAlertItem) this.instance).clearId();
            return this;
        }

        public Builder clearImageId() {
            copyOnWrite();
            ((RtAlertItem) this.instance).clearImageId();
            return this;
        }

        public Builder clearImageUrl() {
            copyOnWrite();
            ((RtAlertItem) this.instance).clearImageUrl();
            return this;
        }

        public Builder clearIsAlertByMe() {
            copyOnWrite();
            ((RtAlertItem) this.instance).clearIsAlertByMe();
            return this;
        }

        public Builder clearIsAlertOnRoute() {
            copyOnWrite();
            ((RtAlertItem) this.instance).clearIsAlertOnRoute();
            return this;
        }

        public Builder clearIsAutoJam() {
            copyOnWrite();
            ((RtAlertItem) this.instance).clearIsAutoJam();
            return this;
        }

        public Builder clearIsCommentingAllowed() {
            copyOnWrite();
            ((RtAlertItem) this.instance).clearIsCommentingAllowed();
            return this;
        }

        public Builder clearIsLikingAllowed() {
            copyOnWrite();
            ((RtAlertItem) this.instance).clearIsLikingAllowed();
            return this;
        }

        public Builder clearIsThumbsUpByMe() {
            copyOnWrite();
            ((RtAlertItem) this.instance).clearIsThumbsUpByMe();
            return this;
        }

        public Builder clearLatitude() {
            copyOnWrite();
            ((RtAlertItem) this.instance).clearLatitude();
            return this;
        }

        public Builder clearLocationStr() {
            copyOnWrite();
            ((RtAlertItem) this.instance).clearLocationStr();
            return this;
        }

        public Builder clearLongitude() {
            copyOnWrite();
            ((RtAlertItem) this.instance).clearLongitude();
            return this;
        }

        public Builder clearMoodName() {
            copyOnWrite();
            ((RtAlertItem) this.instance).clearMoodName();
            return this;
        }

        public Builder clearNumComments() {
            copyOnWrite();
            ((RtAlertItem) this.instance).clearNumComments();
            return this;
        }

        public Builder clearNumThumbsUp() {
            copyOnWrite();
            ((RtAlertItem) this.instance).clearNumThumbsUp();
            return this;
        }

        public Builder clearReportedBy() {
            copyOnWrite();
            ((RtAlertItem) this.instance).clearReportedBy();
            return this;
        }

        public Builder clearScreenX() {
            copyOnWrite();
            ((RtAlertItem) this.instance).clearScreenX();
            return this;
        }

        public Builder clearScreenY() {
            copyOnWrite();
            ((RtAlertItem) this.instance).clearScreenY();
            return this;
        }

        public Builder clearTimeOnRoute() {
            copyOnWrite();
            ((RtAlertItem) this.instance).clearTimeOnRoute();
            return this;
        }

        public Builder clearTimeRelative() {
            copyOnWrite();
            ((RtAlertItem) this.instance).clearTimeRelative();
            return this;
        }

        public Builder clearTimeStampSec() {
            copyOnWrite();
            ((RtAlertItem) this.instance).clearTimeStampSec();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((RtAlertItem) this.instance).clearTitle();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((RtAlertItem) this.instance).clearType();
            return this;
        }

        public Builder clearUnit() {
            copyOnWrite();
            ((RtAlertItem) this.instance).clearUnit();
            return this;
        }

        @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
        public int getBackgroundColor() {
            return ((RtAlertItem) this.instance).getBackgroundColor();
        }

        @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
        public String getDescription() {
            return ((RtAlertItem) this.instance).getDescription();
        }

        @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
        public v getDescriptionBytes() {
            return ((RtAlertItem) this.instance).getDescriptionBytes();
        }

        @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
        public int getDistance() {
            return ((RtAlertItem) this.instance).getDistance();
        }

        @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
        public String getDistanceStr() {
            return ((RtAlertItem) this.instance).getDistanceStr();
        }

        @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
        public v getDistanceStrBytes() {
            return ((RtAlertItem) this.instance).getDistanceStrBytes();
        }

        @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
        public String getIcon() {
            return ((RtAlertItem) this.instance).getIcon();
        }

        @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
        public v getIconBytes() {
            return ((RtAlertItem) this.instance).getIconBytes();
        }

        @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
        public int getId() {
            return ((RtAlertItem) this.instance).getId();
        }

        @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
        public String getImageId() {
            return ((RtAlertItem) this.instance).getImageId();
        }

        @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
        public v getImageIdBytes() {
            return ((RtAlertItem) this.instance).getImageIdBytes();
        }

        @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
        public String getImageUrl() {
            return ((RtAlertItem) this.instance).getImageUrl();
        }

        @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
        public v getImageUrlBytes() {
            return ((RtAlertItem) this.instance).getImageUrlBytes();
        }

        @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
        public boolean getIsAlertByMe() {
            return ((RtAlertItem) this.instance).getIsAlertByMe();
        }

        @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
        public boolean getIsAlertOnRoute() {
            return ((RtAlertItem) this.instance).getIsAlertOnRoute();
        }

        @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
        public boolean getIsAutoJam() {
            return ((RtAlertItem) this.instance).getIsAutoJam();
        }

        @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
        public boolean getIsCommentingAllowed() {
            return ((RtAlertItem) this.instance).getIsCommentingAllowed();
        }

        @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
        public boolean getIsLikingAllowed() {
            return ((RtAlertItem) this.instance).getIsLikingAllowed();
        }

        @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
        public boolean getIsThumbsUpByMe() {
            return ((RtAlertItem) this.instance).getIsThumbsUpByMe();
        }

        @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
        public int getLatitude() {
            return ((RtAlertItem) this.instance).getLatitude();
        }

        @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
        public String getLocationStr() {
            return ((RtAlertItem) this.instance).getLocationStr();
        }

        @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
        public v getLocationStrBytes() {
            return ((RtAlertItem) this.instance).getLocationStrBytes();
        }

        @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
        public int getLongitude() {
            return ((RtAlertItem) this.instance).getLongitude();
        }

        @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
        public String getMoodName() {
            return ((RtAlertItem) this.instance).getMoodName();
        }

        @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
        public v getMoodNameBytes() {
            return ((RtAlertItem) this.instance).getMoodNameBytes();
        }

        @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
        public int getNumComments() {
            return ((RtAlertItem) this.instance).getNumComments();
        }

        @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
        public int getNumThumbsUp() {
            return ((RtAlertItem) this.instance).getNumThumbsUp();
        }

        @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
        public String getReportedBy() {
            return ((RtAlertItem) this.instance).getReportedBy();
        }

        @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
        public v getReportedByBytes() {
            return ((RtAlertItem) this.instance).getReportedByBytes();
        }

        @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
        public int getScreenX() {
            return ((RtAlertItem) this.instance).getScreenX();
        }

        @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
        public int getScreenY() {
            return ((RtAlertItem) this.instance).getScreenY();
        }

        @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
        public String getTimeOnRoute() {
            return ((RtAlertItem) this.instance).getTimeOnRoute();
        }

        @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
        public v getTimeOnRouteBytes() {
            return ((RtAlertItem) this.instance).getTimeOnRouteBytes();
        }

        @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
        public String getTimeRelative() {
            return ((RtAlertItem) this.instance).getTimeRelative();
        }

        @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
        public v getTimeRelativeBytes() {
            return ((RtAlertItem) this.instance).getTimeRelativeBytes();
        }

        @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
        public int getTimeStampSec() {
            return ((RtAlertItem) this.instance).getTimeStampSec();
        }

        @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
        public String getTitle() {
            return ((RtAlertItem) this.instance).getTitle();
        }

        @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
        public v getTitleBytes() {
            return ((RtAlertItem) this.instance).getTitleBytes();
        }

        @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
        public Type getType() {
            return ((RtAlertItem) this.instance).getType();
        }

        @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
        public int getTypeValue() {
            return ((RtAlertItem) this.instance).getTypeValue();
        }

        @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
        public String getUnit() {
            return ((RtAlertItem) this.instance).getUnit();
        }

        @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
        public v getUnitBytes() {
            return ((RtAlertItem) this.instance).getUnitBytes();
        }

        @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
        public boolean hasImageId() {
            return ((RtAlertItem) this.instance).hasImageId();
        }

        @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
        public boolean hasImageUrl() {
            return ((RtAlertItem) this.instance).hasImageUrl();
        }

        @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
        public boolean hasIsCommentingAllowed() {
            return ((RtAlertItem) this.instance).hasIsCommentingAllowed();
        }

        @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
        public boolean hasIsLikingAllowed() {
            return ((RtAlertItem) this.instance).hasIsLikingAllowed();
        }

        @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
        public boolean hasLatitude() {
            return ((RtAlertItem) this.instance).hasLatitude();
        }

        @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
        public boolean hasLongitude() {
            return ((RtAlertItem) this.instance).hasLongitude();
        }

        @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
        public boolean hasReportedBy() {
            return ((RtAlertItem) this.instance).hasReportedBy();
        }

        @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
        public boolean hasTimeRelative() {
            return ((RtAlertItem) this.instance).hasTimeRelative();
        }

        @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
        public boolean hasTimeStampSec() {
            return ((RtAlertItem) this.instance).hasTimeStampSec();
        }

        public Builder setBackgroundColor(int i2) {
            copyOnWrite();
            ((RtAlertItem) this.instance).setBackgroundColor(i2);
            return this;
        }

        public Builder setDescription(String str) {
            copyOnWrite();
            ((RtAlertItem) this.instance).setDescription(str);
            return this;
        }

        public Builder setDescriptionBytes(v vVar) {
            copyOnWrite();
            ((RtAlertItem) this.instance).setDescriptionBytes(vVar);
            return this;
        }

        public Builder setDistance(int i2) {
            copyOnWrite();
            ((RtAlertItem) this.instance).setDistance(i2);
            return this;
        }

        public Builder setDistanceStr(String str) {
            copyOnWrite();
            ((RtAlertItem) this.instance).setDistanceStr(str);
            return this;
        }

        public Builder setDistanceStrBytes(v vVar) {
            copyOnWrite();
            ((RtAlertItem) this.instance).setDistanceStrBytes(vVar);
            return this;
        }

        public Builder setIcon(String str) {
            copyOnWrite();
            ((RtAlertItem) this.instance).setIcon(str);
            return this;
        }

        public Builder setIconBytes(v vVar) {
            copyOnWrite();
            ((RtAlertItem) this.instance).setIconBytes(vVar);
            return this;
        }

        public Builder setId(int i2) {
            copyOnWrite();
            ((RtAlertItem) this.instance).setId(i2);
            return this;
        }

        public Builder setImageId(String str) {
            copyOnWrite();
            ((RtAlertItem) this.instance).setImageId(str);
            return this;
        }

        public Builder setImageIdBytes(v vVar) {
            copyOnWrite();
            ((RtAlertItem) this.instance).setImageIdBytes(vVar);
            return this;
        }

        public Builder setImageUrl(String str) {
            copyOnWrite();
            ((RtAlertItem) this.instance).setImageUrl(str);
            return this;
        }

        public Builder setImageUrlBytes(v vVar) {
            copyOnWrite();
            ((RtAlertItem) this.instance).setImageUrlBytes(vVar);
            return this;
        }

        public Builder setIsAlertByMe(boolean z) {
            copyOnWrite();
            ((RtAlertItem) this.instance).setIsAlertByMe(z);
            return this;
        }

        public Builder setIsAlertOnRoute(boolean z) {
            copyOnWrite();
            ((RtAlertItem) this.instance).setIsAlertOnRoute(z);
            return this;
        }

        public Builder setIsAutoJam(boolean z) {
            copyOnWrite();
            ((RtAlertItem) this.instance).setIsAutoJam(z);
            return this;
        }

        public Builder setIsCommentingAllowed(boolean z) {
            copyOnWrite();
            ((RtAlertItem) this.instance).setIsCommentingAllowed(z);
            return this;
        }

        public Builder setIsLikingAllowed(boolean z) {
            copyOnWrite();
            ((RtAlertItem) this.instance).setIsLikingAllowed(z);
            return this;
        }

        public Builder setIsThumbsUpByMe(boolean z) {
            copyOnWrite();
            ((RtAlertItem) this.instance).setIsThumbsUpByMe(z);
            return this;
        }

        public Builder setLatitude(int i2) {
            copyOnWrite();
            ((RtAlertItem) this.instance).setLatitude(i2);
            return this;
        }

        public Builder setLocationStr(String str) {
            copyOnWrite();
            ((RtAlertItem) this.instance).setLocationStr(str);
            return this;
        }

        public Builder setLocationStrBytes(v vVar) {
            copyOnWrite();
            ((RtAlertItem) this.instance).setLocationStrBytes(vVar);
            return this;
        }

        public Builder setLongitude(int i2) {
            copyOnWrite();
            ((RtAlertItem) this.instance).setLongitude(i2);
            return this;
        }

        public Builder setMoodName(String str) {
            copyOnWrite();
            ((RtAlertItem) this.instance).setMoodName(str);
            return this;
        }

        public Builder setMoodNameBytes(v vVar) {
            copyOnWrite();
            ((RtAlertItem) this.instance).setMoodNameBytes(vVar);
            return this;
        }

        public Builder setNumComments(int i2) {
            copyOnWrite();
            ((RtAlertItem) this.instance).setNumComments(i2);
            return this;
        }

        public Builder setNumThumbsUp(int i2) {
            copyOnWrite();
            ((RtAlertItem) this.instance).setNumThumbsUp(i2);
            return this;
        }

        public Builder setReportedBy(String str) {
            copyOnWrite();
            ((RtAlertItem) this.instance).setReportedBy(str);
            return this;
        }

        public Builder setReportedByBytes(v vVar) {
            copyOnWrite();
            ((RtAlertItem) this.instance).setReportedByBytes(vVar);
            return this;
        }

        public Builder setScreenX(int i2) {
            copyOnWrite();
            ((RtAlertItem) this.instance).setScreenX(i2);
            return this;
        }

        public Builder setScreenY(int i2) {
            copyOnWrite();
            ((RtAlertItem) this.instance).setScreenY(i2);
            return this;
        }

        public Builder setTimeOnRoute(String str) {
            copyOnWrite();
            ((RtAlertItem) this.instance).setTimeOnRoute(str);
            return this;
        }

        public Builder setTimeOnRouteBytes(v vVar) {
            copyOnWrite();
            ((RtAlertItem) this.instance).setTimeOnRouteBytes(vVar);
            return this;
        }

        public Builder setTimeRelative(String str) {
            copyOnWrite();
            ((RtAlertItem) this.instance).setTimeRelative(str);
            return this;
        }

        public Builder setTimeRelativeBytes(v vVar) {
            copyOnWrite();
            ((RtAlertItem) this.instance).setTimeRelativeBytes(vVar);
            return this;
        }

        public Builder setTimeStampSec(int i2) {
            copyOnWrite();
            ((RtAlertItem) this.instance).setTimeStampSec(i2);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((RtAlertItem) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(v vVar) {
            copyOnWrite();
            ((RtAlertItem) this.instance).setTitleBytes(vVar);
            return this;
        }

        public Builder setType(Type type) {
            copyOnWrite();
            ((RtAlertItem) this.instance).setType(type);
            return this;
        }

        public Builder setTypeValue(int i2) {
            copyOnWrite();
            ((RtAlertItem) this.instance).setTypeValue(i2);
            return this;
        }

        public Builder setUnit(String str) {
            copyOnWrite();
            ((RtAlertItem) this.instance).setUnit(str);
            return this;
        }

        public Builder setUnitBytes(v vVar) {
            copyOnWrite();
            ((RtAlertItem) this.instance).setUnitBytes(vVar);
            return this;
        }
    }

    /* compiled from: WazeSource */
    public enum Type implements eg {
        CHIT_CHAT(0),
        INVALID(-1),
        POLICE(1),
        ACCIDENT(2),
        TRAFFIC_JAM(3),
        TRAFFIC_INFO(4),
        HAZARD(5),
        OTHER(6),
        CONSTRUCTION(7),
        PARKING(8),
        DYNAMIC(9),
        CAMERA(10),
        PARKED(11),
        CLOSURE(12),
        SOS(15),
        REROUTE(16),
        GUARDIAN(17),
        ECO(18),
        BLOCKED_LANE(19),
        BAD_WEATHER(20),
        PERMANENT_HAZARD(21),
        SPEED_LIMIT_DECREASE(22),
        TURN_CLOSURE(23),
        PERSONAL_SAFETY(24),
        DANGER_ZONE(25),
        ANIMAL(26),
        TILE_INSIGHT(1000),
        UNRECOGNIZED(-1);

        public static final int ACCIDENT_VALUE = 2;
        public static final int ANIMAL_VALUE = 26;
        public static final int BAD_WEATHER_VALUE = 20;
        public static final int BLOCKED_LANE_VALUE = 19;
        public static final int CAMERA_VALUE = 10;
        public static final int CHIT_CHAT_VALUE = 0;
        public static final int CLOSURE_VALUE = 12;
        public static final int CONSTRUCTION_VALUE = 7;
        public static final int DANGER_ZONE_VALUE = 25;
        public static final int DYNAMIC_VALUE = 9;
        public static final int ECO_VALUE = 18;
        public static final int GUARDIAN_VALUE = 17;
        public static final int HAZARD_VALUE = 5;
        public static final int INVALID_VALUE = -1;
        public static final int OTHER_VALUE = 6;
        public static final int PARKED_VALUE = 11;
        public static final int PARKING_VALUE = 8;
        public static final int PERMANENT_HAZARD_VALUE = 21;
        public static final int PERSONAL_SAFETY_VALUE = 24;
        public static final int POLICE_VALUE = 1;
        public static final int REROUTE_VALUE = 16;
        public static final int SOS_VALUE = 15;
        public static final int SPEED_LIMIT_DECREASE_VALUE = 22;
        public static final int TILE_INSIGHT_VALUE = 1000;
        public static final int TRAFFIC_INFO_VALUE = 4;
        public static final int TRAFFIC_JAM_VALUE = 3;
        public static final int TURN_CLOSURE_VALUE = 23;
        private static final eh<Type> internalValueMap = new eh<Type>() { // from class: com.waze.jni.protos.rtalerts.RtAlertItem.Type.1
            @Override // com.google.v.eh
            public Type findValueByNumber(int i2) {
                return Type.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class TypeVerifier implements ei {
            static final ei INSTANCE = new TypeVerifier();

            private TypeVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return Type.forNumber(i2) != null;
            }
        }

        Type(int i2) {
            this.value = i2;
        }

        public static Type forNumber(int i2) {
            if (i2 == 1000) {
                return TILE_INSIGHT;
            }
            switch (i2) {
                case -1:
                    return INVALID;
                case 0:
                    return CHIT_CHAT;
                case 1:
                    return POLICE;
                case 2:
                    return ACCIDENT;
                case 3:
                    return TRAFFIC_JAM;
                case 4:
                    return TRAFFIC_INFO;
                case 5:
                    return HAZARD;
                case 6:
                    return OTHER;
                case 7:
                    return CONSTRUCTION;
                case 8:
                    return PARKING;
                case 9:
                    return DYNAMIC;
                case 10:
                    return CAMERA;
                case 11:
                    return PARKED;
                case 12:
                    return CLOSURE;
                default:
                    switch (i2) {
                        case 15:
                            return SOS;
                        case 16:
                            return REROUTE;
                        case 17:
                            return GUARDIAN;
                        case 18:
                            return ECO;
                        case 19:
                            return BLOCKED_LANE;
                        case 20:
                            return BAD_WEATHER;
                        case 21:
                            return PERMANENT_HAZARD;
                        case 22:
                            return SPEED_LIMIT_DECREASE;
                        case 23:
                            return TURN_CLOSURE;
                        case 24:
                            return PERSONAL_SAFETY;
                        case 25:
                            return DANGER_ZONE;
                        case 26:
                            return ANIMAL;
                        default:
                            return null;
                    }
            }
        }

        public static eh<Type> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return TypeVerifier.INSTANCE;
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

    static {
        RtAlertItem rtAlertItem = new RtAlertItem();
        DEFAULT_INSTANCE = rtAlertItem;
        du.registerDefaultInstance(RtAlertItem.class, rtAlertItem);
    }

    private RtAlertItem() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBackgroundColor() {
        this.backgroundColor_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.description_ = getDefaultInstance().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDistance() {
        this.distance_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDistanceStr() {
        this.distanceStr_ = getDefaultInstance().getDistanceStr();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIcon() {
        this.icon_ = getDefaultInstance().getIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImageId() {
        this.bitField0_ &= -33;
        this.imageId_ = getDefaultInstance().getImageId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImageUrl() {
        this.bitField0_ &= -65;
        this.imageUrl_ = getDefaultInstance().getImageUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsAlertByMe() {
        this.isAlertByMe_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsAlertOnRoute() {
        this.isAlertOnRoute_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsAutoJam() {
        this.isAutoJam_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsCommentingAllowed() {
        this.bitField0_ &= -129;
        this.isCommentingAllowed_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsLikingAllowed() {
        this.bitField0_ &= -257;
        this.isLikingAllowed_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsThumbsUpByMe() {
        this.isThumbsUpByMe_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLatitude() {
        this.bitField0_ &= -3;
        this.latitude_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocationStr() {
        this.locationStr_ = getDefaultInstance().getLocationStr();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLongitude() {
        this.bitField0_ &= -2;
        this.longitude_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMoodName() {
        this.moodName_ = getDefaultInstance().getMoodName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumComments() {
        this.numComments_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumThumbsUp() {
        this.numThumbsUp_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReportedBy() {
        this.bitField0_ &= -17;
        this.reportedBy_ = getDefaultInstance().getReportedBy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScreenX() {
        this.screenX_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScreenY() {
        this.screenY_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeOnRoute() {
        this.timeOnRoute_ = getDefaultInstance().getTimeOnRoute();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeRelative() {
        this.bitField0_ &= -5;
        this.timeRelative_ = getDefaultInstance().getTimeRelative();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeStampSec() {
        this.bitField0_ &= -9;
        this.timeStampSec_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnit() {
        this.unit_ = getDefaultInstance().getUnit();
    }

    public static RtAlertItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static RtAlertItem parseDelimitedFrom(InputStream inputStream) {
        return (RtAlertItem) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RtAlertItem parseFrom(v vVar) {
        return (RtAlertItem) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<RtAlertItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBackgroundColor(int i2) {
        this.backgroundColor_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescription(String str) {
        Objects.requireNonNull(str);
        this.description_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescriptionBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.description_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDistance(int i2) {
        this.distance_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDistanceStr(String str) {
        Objects.requireNonNull(str);
        this.distanceStr_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDistanceStrBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.distanceStr_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIcon(String str) {
        Objects.requireNonNull(str);
        this.icon_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.icon_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(int i2) {
        this.id_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.imageId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageIdBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.imageId_ = vVar.u();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageUrl(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 64;
        this.imageUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageUrlBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.imageUrl_ = vVar.u();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsAlertByMe(boolean z) {
        this.isAlertByMe_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsAlertOnRoute(boolean z) {
        this.isAlertOnRoute_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsAutoJam(boolean z) {
        this.isAutoJam_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsCommentingAllowed(boolean z) {
        this.bitField0_ |= 128;
        this.isCommentingAllowed_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsLikingAllowed(boolean z) {
        this.bitField0_ |= 256;
        this.isLikingAllowed_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsThumbsUpByMe(boolean z) {
        this.isThumbsUpByMe_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLatitude(int i2) {
        this.bitField0_ |= 2;
        this.latitude_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocationStr(String str) {
        Objects.requireNonNull(str);
        this.locationStr_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocationStrBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.locationStr_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLongitude(int i2) {
        this.bitField0_ |= 1;
        this.longitude_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMoodName(String str) {
        Objects.requireNonNull(str);
        this.moodName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMoodNameBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.moodName_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumComments(int i2) {
        this.numComments_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumThumbsUp(int i2) {
        this.numThumbsUp_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportedBy(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.reportedBy_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportedByBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.reportedBy_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreenX(int i2) {
        this.screenX_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreenY(int i2) {
        this.screenY_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeOnRoute(String str) {
        Objects.requireNonNull(str);
        this.timeOnRoute_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeOnRouteBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.timeOnRoute_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeRelative(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.timeRelative_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeRelativeBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.timeRelative_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeStampSec(int i2) {
        this.bitField0_ |= 8;
        this.timeStampSec_ = i2;
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
    public void setType(Type type) {
        this.type_ = type.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i2) {
        this.type_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnit(String str) {
        Objects.requireNonNull(str);
        this.unit_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnitBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.unit_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u001d\u0000\u0001\u0001\u001d\u001d\u0000\u0000\u0000\u0001\u0004\u0002\f\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006င\u0000\u0007င\u0001\bȈ\tለ\u0002\nင\u0003\u000bለ\u0004\fȈ\r\u0004\u000eȈ\u000fለ\u0005\u0010ለ\u0006\u0011\u0007\u0012\u0007\u0013\u0007\u0014\u0007\u0015\u0004\u0016\u0004\u0017\u0004\u0018\u0004\u0019Ȉ\u001aȈ\u001b\u0004\u001cဇ\u0007\u001dဇ\b", new Object[]{"bitField0_", "id_", "type_", "title_", "icon_", "locationStr_", "longitude_", "latitude_", "description_", "timeRelative_", "timeStampSec_", "reportedBy_", "distanceStr_", "distance_", "unit_", "imageId_", "imageUrl_", "isAutoJam_", "isAlertByMe_", "isThumbsUpByMe_", "isAlertOnRoute_", "numComments_", "numThumbsUp_", "screenX_", "screenY_", "moodName_", "timeOnRoute_", "backgroundColor_", "isCommentingAllowed_", "isLikingAllowed_"});
        }
        if (iOrdinal == 3) {
            return new RtAlertItem();
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
        fo<RtAlertItem> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (RtAlertItem.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
    public int getBackgroundColor() {
        return this.backgroundColor_;
    }

    @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
    public String getDescription() {
        return this.description_;
    }

    @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
    public v getDescriptionBytes() {
        return v.s(this.description_);
    }

    @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
    public int getDistance() {
        return this.distance_;
    }

    @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
    public String getDistanceStr() {
        return this.distanceStr_;
    }

    @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
    public v getDistanceStrBytes() {
        return v.s(this.distanceStr_);
    }

    @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
    public String getIcon() {
        return this.icon_;
    }

    @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
    public v getIconBytes() {
        return v.s(this.icon_);
    }

    @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
    public int getId() {
        return this.id_;
    }

    @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
    public String getImageId() {
        return this.imageId_;
    }

    @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
    public v getImageIdBytes() {
        return v.s(this.imageId_);
    }

    @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
    public String getImageUrl() {
        return this.imageUrl_;
    }

    @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
    public v getImageUrlBytes() {
        return v.s(this.imageUrl_);
    }

    @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
    public boolean getIsAlertByMe() {
        return this.isAlertByMe_;
    }

    @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
    public boolean getIsAlertOnRoute() {
        return this.isAlertOnRoute_;
    }

    @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
    public boolean getIsAutoJam() {
        return this.isAutoJam_;
    }

    @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
    public boolean getIsCommentingAllowed() {
        return this.isCommentingAllowed_;
    }

    @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
    public boolean getIsLikingAllowed() {
        return this.isLikingAllowed_;
    }

    @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
    public boolean getIsThumbsUpByMe() {
        return this.isThumbsUpByMe_;
    }

    @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
    public int getLatitude() {
        return this.latitude_;
    }

    @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
    public String getLocationStr() {
        return this.locationStr_;
    }

    @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
    public v getLocationStrBytes() {
        return v.s(this.locationStr_);
    }

    @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
    public int getLongitude() {
        return this.longitude_;
    }

    @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
    public String getMoodName() {
        return this.moodName_;
    }

    @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
    public v getMoodNameBytes() {
        return v.s(this.moodName_);
    }

    @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
    public int getNumComments() {
        return this.numComments_;
    }

    @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
    public int getNumThumbsUp() {
        return this.numThumbsUp_;
    }

    @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
    public String getReportedBy() {
        return this.reportedBy_;
    }

    @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
    public v getReportedByBytes() {
        return v.s(this.reportedBy_);
    }

    @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
    public int getScreenX() {
        return this.screenX_;
    }

    @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
    public int getScreenY() {
        return this.screenY_;
    }

    @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
    public String getTimeOnRoute() {
        return this.timeOnRoute_;
    }

    @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
    public v getTimeOnRouteBytes() {
        return v.s(this.timeOnRoute_);
    }

    @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
    public String getTimeRelative() {
        return this.timeRelative_;
    }

    @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
    public v getTimeRelativeBytes() {
        return v.s(this.timeRelative_);
    }

    @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
    public int getTimeStampSec() {
        return this.timeStampSec_;
    }

    @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
    public String getTitle() {
        return this.title_;
    }

    @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
    public v getTitleBytes() {
        return v.s(this.title_);
    }

    @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
    public Type getType() {
        Type typeForNumber = Type.forNumber(this.type_);
        return typeForNumber == null ? Type.UNRECOGNIZED : typeForNumber;
    }

    @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
    public int getTypeValue() {
        return this.type_;
    }

    @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
    public String getUnit() {
        return this.unit_;
    }

    @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
    public v getUnitBytes() {
        return v.s(this.unit_);
    }

    @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
    public boolean hasImageId() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
    public boolean hasImageUrl() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
    public boolean hasIsCommentingAllowed() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
    public boolean hasIsLikingAllowed() {
        return (this.bitField0_ & 256) != 0;
    }

    @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
    public boolean hasLatitude() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
    public boolean hasLongitude() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
    public boolean hasReportedBy() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
    public boolean hasTimeRelative() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.waze.jni.protos.rtalerts.RtAlertItemOrBuilder
    public boolean hasTimeStampSec() {
        return (this.bitField0_ & 8) != 0;
    }

    public static Builder newBuilder(RtAlertItem rtAlertItem) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(rtAlertItem);
    }

    public static RtAlertItem parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (RtAlertItem) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static RtAlertItem parseFrom(v vVar, de deVar) {
        return (RtAlertItem) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static RtAlertItem parseFrom(z zVar) {
        return (RtAlertItem) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static RtAlertItem parseFrom(z zVar, de deVar) {
        return (RtAlertItem) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static RtAlertItem parseFrom(InputStream inputStream) {
        return (RtAlertItem) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RtAlertItem parseFrom(InputStream inputStream, de deVar) {
        return (RtAlertItem) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static RtAlertItem parseFrom(ByteBuffer byteBuffer) {
        return (RtAlertItem) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static RtAlertItem parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (RtAlertItem) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static RtAlertItem parseFrom(byte[] bArr) {
        return (RtAlertItem) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RtAlertItem parseFrom(byte[] bArr, de deVar) {
        return (RtAlertItem) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
