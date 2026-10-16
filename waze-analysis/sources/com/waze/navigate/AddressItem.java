package com.waze.navigate;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.waze.R;
import com.waze.jni.protos.OpeningHours;
import com.waze.jni.protos.VenueImage;
import java.util.Collections;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class AddressItem implements Parcelable {
    public static final int CALENDAR_ENC_ITEM = 12;
    public static final int CALENDAR_ITEM = 11;
    public static final int CATEGORY_CALENDAR = 7;
    public static final int CATEGORY_CONTACT = 5;
    public static final int CATEGORY_ERROR = 4;
    public static final int CATEGORY_EVENTS = 6;
    public static final int CATEGORY_FAVORITE = 1;
    public static final int CATEGORY_FAVORITE_HISTORY = 150;
    public static final int CATEGORY_HISTORY = 2;
    public static final int CATEGORY_OTHER = 99;
    public static final int CATEGORY_PLANNED_DRIVE = 9;
    public static final int CATEGORY_SEARCH = 3;
    public static final int CATEGORY_SHARED = 8;
    public static final Parcelable.Creator<AddressItem> CREATOR = new c(1);
    public static final int CUR_LOC_ITEM = 16;
    public static final int EVENT_ITEM = 9;
    public static final int FAVORITE_ITEM = 5;
    public static final int FAVORITE_ITEM_EMPTY = 6;
    public static final int HISTORY_ITEM = 8;
    public static final String HOME = "Home";
    public static final int HOME_ITEM = 1;
    public static final int HOME_ITEM_EMPTY = 2;
    public static final int PARKING_ITEM = 20;
    public static final int PLANNED_DRIVE_FOLDER_ITEM = 16;
    public static final int SEARCH_ITEM = 7;
    public static final int SHARED_ITEM = 13;
    public static final int UNKNOWN_ITEM = 0;
    public static final String WORK = "Work";
    public static final int WORK_ITEM = 3;
    public static final int WORK_ITEM_EMPTY = 4;
    private String MeetingId;
    private String address;
    public String adsContext;
    public int advPointId;
    public String brand;
    public String brandId;
    private int category;
    public String currency;
    public String dealId;
    public String dealText;
    public String dealTitle;
    public int dealType;
    private String distance;
    public int distanceMeters;
    public String formattedPrice;
    private String icon;
    private String id;
    private int image;
    public int index;
    public boolean isAddNewFavorite;
    private boolean isRecurring;
    private boolean is_validate;
    public long lastUpdated;
    d mAdvertiserData;
    public String mImageURL;
    public boolean mIsNavigable;
    public String mPreviewIcon;
    public boolean mSpecificIcon;
    private String partnerId;
    private String phone;
    public float price;
    public int range;
    private String secondaryTitle;
    private String starttime;
    private String timeOffRoute;
    private String title;
    private int type;
    com.waze.reports.ed venueData;

    protected AddressItem(Parcel parcel) {
        this.image = 0;
        this.category = 99;
        this.type = 0;
        this.is_validate = false;
        this.starttime = null;
        this.formattedPrice = null;
        this.currency = null;
        this.distanceMeters = 0;
        this.brand = "";
        this.index = -1;
        this.mImageURL = null;
        this.mPreviewIcon = "";
        this.mIsNavigable = true;
        this.isAddNewFavorite = false;
        this.mSpecificIcon = false;
        this.address = parcel.readString();
        this.title = parcel.readString();
        this.secondaryTitle = parcel.readString();
        this.distance = parcel.readString();
        this.timeOffRoute = parcel.readString();
        this.image = parcel.readInt();
        this.category = parcel.readInt();
        this.id = parcel.readString();
        this.type = parcel.readInt();
        this.phone = parcel.readString();
        this.icon = parcel.readString();
        this.MeetingId = parcel.readString();
        this.isRecurring = parcel.readByte() != 0;
        this.is_validate = parcel.readByte() != 0;
        this.starttime = parcel.readString();
        this.venueData = (com.waze.reports.ed) parcel.readParcelable(com.waze.reports.ed.class.getClassLoader());
        this.brandId = parcel.readString();
        this.adsContext = parcel.readString();
        this.dealType = parcel.readInt();
        this.dealTitle = parcel.readString();
        this.dealText = parcel.readString();
        this.price = parcel.readFloat();
        this.formattedPrice = parcel.readString();
        this.currency = parcel.readString();
        this.range = parcel.readInt();
        this.dealId = parcel.readString();
        this.advPointId = parcel.readInt();
        this.lastUpdated = parcel.readLong();
        this.distanceMeters = parcel.readInt();
        this.brand = parcel.readString();
        this.index = parcel.readInt();
        this.mImageURL = parcel.readString();
        this.mPreviewIcon = parcel.readString();
        this.mIsNavigable = parcel.readByte() != 0;
        this.isAddNewFavorite = parcel.readByte() != 0;
        this.mSpecificIcon = parcel.readByte() != 0;
        this.mAdvertiserData = (d) parcel.readParcelable(d.class.getClassLoader());
        this.partnerId = parcel.readString();
    }

    private static String getString(int i2) {
        return ((com.waze.shared_infra.o.a) com.waze.web.r.h(com.waze.shared_infra.o.a.class)).c(i2, new Object[0]);
    }

    private void init(int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, byte[] bArr, String str18) {
        int i3;
        this.address = str5;
        this.title = str3;
        this.secondaryTitle = str4;
        this.distance = str6;
        if (str15 != null) {
            this.type = Integer.parseInt(str15);
        } else {
            this.type = 0;
        }
        setSystemIcon(str12);
        if (str13 != null) {
            int iHashCode = str13.hashCode();
            if (iHashCode != 65) {
                if (iHashCode != 67) {
                    if (iHashCode != 72) {
                        if (iHashCode != 80) {
                            if (iHashCode != 83) {
                                if (iHashCode != 69) {
                                    if (iHashCode == 70 && str13.equals("F")) {
                                        i3 = 1;
                                        this.category = i3;
                                    }
                                } else if (str13.equals(ExifInterface.LONGITUDE_EAST)) {
                                    i3 = 6;
                                    this.category = i3;
                                }
                            } else if (str13.equals(ExifInterface.LATITUDE_SOUTH)) {
                                i3 = 3;
                                this.category = i3;
                            }
                        } else if (str13.equals("P")) {
                            i3 = 9;
                            this.category = i3;
                        }
                    } else if (str13.equals("H")) {
                        i3 = 8;
                        this.category = i3;
                    }
                } else if (str13.equals("C")) {
                    i3 = 7;
                    this.category = i3;
                }
            } else if (str13.equals(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS)) {
                i3 = 2;
                this.category = i3;
            }
        }
        this.id = str14;
        this.icon = str16;
        this.index = i2;
        this.venueData = bArr == null ? null : new com.waze.reports.ed(bArr);
        setVenueId(str17);
        setRoutingContext(str18);
        setVenueAddress(str7, str8, str9, str10, str11, null);
        setIntPosition(str2 == null ? null : Integer.valueOf(Integer.parseInt(str2)), str != null ? Integer.valueOf(Integer.parseInt(str)) : null);
    }

    private void setSystemIcon(String str) {
        if (str != null) {
            if (str.equals("list_icon_home")) {
                this.image = com.waze.design_components.b.d.f23304e.c(com.waze.design_components.b.e.f23314c);
                return;
            }
            if (str.equals("list_icon_work")) {
                this.image = com.waze.design_components.b.d.f23309j.c(com.waze.design_components.b.e.f23314c);
                return;
            }
            if (str.equals("list_icon_history")) {
                this.image = com.waze.design_components.b.d.P.c(com.waze.design_components.b.e.f23312a);
                return;
            }
            if (str.equals("Ads")) {
                this.image = com.waze.design_components.b.d.O.c(com.waze.design_components.b.e.f23312a);
                return;
            }
            if (str.equals("Event")) {
                this.image = R.drawable.cell_icon_calendar_fb;
                this.is_validate = false;
                return;
            }
            if (str.equals("PlanDrive")) {
                this.image = com.waze.design_components.b.d.K.c(com.waze.design_components.b.e.f23312a);
                return;
            }
            if (str.equals("EventVerified") || str.equals("list_icon_calendar_fb") || str.equals("ic_settings_calendar_fb")) {
                this.image = com.waze.design_components.b.d.K.c(com.waze.design_components.b.e.f23312a);
                this.is_validate = true;
                return;
            }
            if (str.equals("list_icon_deals")) {
                this.image = R.drawable.cell_icon_deals;
                return;
            }
            if (str.equals("list_icon_addfavorite")) {
                this.image = R.drawable.list_icon_addfavorite;
                this.isAddNewFavorite = true;
                return;
            }
            if (str.equals("list_icon_favorite") || str.equals("Star")) {
                this.image = com.waze.design_components.b.d.M.c(com.waze.design_components.b.e.f23312a);
                return;
            }
            if (str.equals("calendar_blue")) {
                this.image = com.waze.design_components.b.d.ab.c(com.waze.design_components.b.e.f23312a);
                this.is_validate = false;
                return;
            }
            if (str.equals("list_icon_calendar") || str.equals("list_icon_calendar_settings")) {
                this.image = com.waze.design_components.b.d.ab.c(com.waze.design_components.b.e.f23312a);
                this.is_validate = true;
            } else if (str.equals("category_menu_GAS_STATION")) {
                this.image = com.waze.design_components.b.d.f23303d.c(com.waze.design_components.b.e.f23312a);
            } else if (str.equals("category_menu_default")) {
                this.image = com.waze.design_components.b.d.I.c(com.waze.design_components.b.e.f23312a);
            } else if (this.type == 13) {
                this.mImageURL = str;
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAboutInfo() {
        com.waze.reports.ed edVar = this.venueData;
        if (edVar == null) {
            return null;
        }
        return edVar.k();
    }

    public String getAddress() {
        String str = this.address;
        return str == null ? "" : str;
    }

    public Integer getCategory() {
        int i2 = this.category;
        if (i2 != 0) {
            return Integer.valueOf(i2);
        }
        return 99;
    }

    public String getCity() {
        com.waze.reports.ed edVar = this.venueData;
        return edVar != null ? edVar.n() : "";
    }

    public com.waze.shared_infra.h.c getCoordinate() {
        return new com.waze.shared_infra.h.c(getLatitudeInt(), getLongitudeInt());
    }

    public String getCountry() {
        com.waze.reports.ed edVar = this.venueData;
        return edVar != null ? edVar.p() : "";
    }

    public int getDistanceMeters() {
        return this.distanceMeters;
    }

    public String getHouseNumber() {
        com.waze.reports.ed edVar = this.venueData;
        return edVar != null ? edVar.r() : "";
    }

    public String getIcon() {
        String str = this.icon;
        return (str == null || str.isEmpty()) ? "category_menu_default" : str;
    }

    public String getId() {
        return this.id;
    }

    public Integer getImage() {
        int i2 = this.image;
        if (i2 == 0) {
            return null;
        }
        return Integer.valueOf(i2);
    }

    public String getImageUrl() {
        return this.mImageURL;
    }

    public List<VenueImage> getImages() {
        com.waze.reports.ed edVar = this.venueData;
        return edVar == null ? Collections.EMPTY_LIST : edVar.F();
    }

    public boolean getIsValidate() {
        return this.is_validate;
    }

    public int getLatitudeInt() {
        com.waze.reports.ed edVar = this.venueData;
        if (edVar == null) {
            return 0;
        }
        return edVar.a();
    }

    public int getLongitudeInt() {
        com.waze.reports.ed edVar = this.venueData;
        if (edVar == null) {
            return 0;
        }
        return edVar.b();
    }

    public String getMeetingId() {
        return this.MeetingId;
    }

    public int getNumberOfImages() {
        com.waze.reports.ed edVar = this.venueData;
        if (edVar == null) {
            return 0;
        }
        return edVar.d();
    }

    public List<OpeningHours> getOpeningHours() {
        com.waze.reports.ed edVar = this.venueData;
        return edVar == null ? Collections.EMPTY_LIST : edVar.G();
    }

    public String getPhoneNumber() {
        com.waze.reports.ed edVar = this.venueData;
        if (edVar != null && !TextUtils.isEmpty(edVar.u())) {
            return this.venueData.u();
        }
        String str = this.phone;
        return str == null ? "" : str;
    }

    public String getRoutingContext() {
        com.waze.reports.ed edVar = this.venueData;
        return edVar == null ? "" : edVar.x();
    }

    public String getSecondaryTitle() {
        String str = this.secondaryTitle;
        return str == null ? "" : str;
    }

    public List<String> getServices() {
        com.waze.reports.ed edVar = this.venueData;
        return edVar == null ? Collections.EMPTY_LIST : edVar.I();
    }

    public String getStartTime() {
        return this.starttime;
    }

    public long getStartTimeMillis() {
        try {
            return Long.parseLong(getStartTime()) * 1000;
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public String getState() {
        com.waze.reports.ed edVar = this.venueData;
        return edVar != null ? edVar.y() : "";
    }

    public String getStreet() {
        com.waze.reports.ed edVar = this.venueData;
        return edVar != null ? edVar.z() : "";
    }

    public String getTitle() {
        String str = this.title;
        return str == null ? "" : str;
    }

    public int getType() {
        int i2 = this.type;
        if (i2 == 0) {
            return 0;
        }
        return i2;
    }

    public String getVenueContext() {
        com.waze.reports.ed edVar = this.venueData;
        return edVar != null ? edVar.o() : "";
    }

    public com.waze.reports.ed getVenueData() {
        return this.venueData;
    }

    public String getVenueId() {
        com.waze.reports.ed edVar = this.venueData;
        return edVar != null ? edVar.s() : "";
    }

    public String getVenueName() {
        com.waze.reports.ed edVar = this.venueData;
        return edVar != null ? edVar.t() : "";
    }

    public String getWebsite() {
        com.waze.reports.ed edVar = this.venueData;
        if (edVar == null) {
            return null;
        }
        return edVar.C();
    }

    public boolean hasIcon() {
        String str = this.icon;
        return (str == null || str.isEmpty() || str.equals("category_menu_default")) ? false : true;
    }

    public boolean hasLocation() {
        com.waze.reports.ed edVar = this.venueData;
        return edVar != null && edVar.ak();
    }

    public boolean hasMoreVenueData() {
        com.waze.reports.ed edVar = this.venueData;
        return edVar != null && edVar.aj();
    }

    public boolean hasVenueData() {
        return this.venueData != null;
    }

    public boolean isFavorite() {
        return this.type == 5;
    }

    public boolean isFutureDrive() {
        return isPlannedDrive();
    }

    public boolean isHome() {
        return this.type == 1 || HOME.equalsIgnoreCase(this.title) || com.waze.shared_infra.i.h.o(getString(R.string.HOME), this.title);
    }

    public boolean isPlannedDrive() {
        return getType() == 9 && getCategory().intValue() == 9;
    }

    public boolean isRecent() {
        return this.type == 8;
    }

    public boolean isUnverifiedEvent() {
        if (getType() == 9 || getType() == 11) {
            return ((isFutureDrive() || getIsValidate()) && hasLocation()) ? false : true;
        }
        return false;
    }

    public boolean isVenueResidence() {
        com.waze.reports.ed edVar = this.venueData;
        return edVar != null && edVar.al();
    }

    public boolean isVenueUpdatable() {
        com.waze.reports.ed edVar = this.venueData;
        return edVar != null && edVar.am();
    }

    public boolean isWork() {
        return this.type == 3 || WORK.equalsIgnoreCase(this.title) || com.waze.shared_infra.i.h.o(getString(R.string.WORK), this.title);
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public void setAdvertiserData(String str, String str2, int i2, String str3) {
        d dVar = new d();
        this.mAdvertiserData = dVar;
        dVar.f31221a = str;
        dVar.f31222b = str2;
        dVar.f31223c = i2;
        dVar.f31224d = str3;
    }

    public void setBrand(String str) {
        this.brand = str;
    }

    public void setCategory(Integer num) {
        this.category = num == null ? 99 : num.intValue();
    }

    public void setDeal(int i2, String str, String str2, float f2, int i3, long j2, String str3, int i4, String str4, String str5) {
        this.dealType = i2;
        this.dealTitle = str;
        this.dealText = str2;
        this.price = f2;
        this.range = i3;
        this.lastUpdated = j2;
        this.dealId = str3;
        this.advPointId = i4;
        this.formattedPrice = str4;
        if (str5 == null || str5.isEmpty()) {
            return;
        }
        this.currency = str5;
    }

    public void setDistance(int i2) {
        this.distanceMeters = i2;
    }

    public void setHasMoreVenueData(boolean z) {
        com.waze.reports.ed edVar = this.venueData;
        if (edVar != null) {
            edVar.S(z);
        }
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setImage(Integer num) {
        this.image = num == null ? 0 : num.intValue();
    }

    public void setIntPosition(Integer num, Integer num2) {
        if (num == null || num2 == null) {
            return;
        }
        com.waze.reports.ed edVar = this.venueData;
        if (edVar == null) {
            edVar = new com.waze.reports.ed();
            this.venueData = edVar;
        }
        edVar.Z(num.intValue(), num2.intValue());
    }

    public void setIsValidate(boolean z) {
        this.is_validate = z;
    }

    public void setMeetingId(String str) {
        this.MeetingId = str;
    }

    public void setPhone(String str) {
        this.phone = str;
    }

    public void setRoutingContext(String str) {
        if (str == null) {
            return;
        }
        com.waze.reports.ed edVar = this.venueData;
        if (edVar == null) {
            edVar = new com.waze.reports.ed();
            this.venueData = edVar;
        }
        edVar.ac(str);
    }

    public void setSecondaryTitle(String str) {
        this.secondaryTitle = str;
    }

    public void setStartTime(String str) {
        this.starttime = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setType(int i2) {
        this.type = i2;
    }

    public void setVenueAddress(String str, String str2, String str3, String str4, String str5, String str6) {
        if (str == null && str2 == null && str3 == null && str4 == null && str5 == null && str6 == null) {
            return;
        }
        com.waze.reports.ed edVar = this.venueData;
        if (edVar == null) {
            edVar = new com.waze.reports.ed();
            this.venueData = edVar;
        }
        if (str != null) {
            edVar.R(str);
        }
        if (str2 != null) {
            this.venueData.ae(str2);
        }
        if (str3 != null) {
            this.venueData.P(str3);
        }
        if (str4 != null) {
            this.venueData.af(str4);
        }
        if (str5 != null) {
            this.venueData.T(str5);
        }
        if (str6 != null) {
            this.venueData.ai(str6);
        }
    }

    public void setVenueId(String str) {
        if (str == null) {
            return;
        }
        com.waze.reports.ed edVar = this.venueData;
        if (edVar == null) {
            edVar = new com.waze.reports.ed();
            this.venueData = edVar;
        }
        edVar.U(str);
    }

    public String toString() {
        return "AddressItem { Title:" + this.title + ", Addr:" + this.address + ", Dist:" + this.distance + ", TimeOffRoute:" + this.timeOffRoute + ", Lon:" + getLongitudeInt() + ", Lat:" + getLatitudeInt() + ", Cat:" + this.category + ", Type:" + this.type + ", Id:" + this.id + ", Img:" + this.image + ", RoutingCtx:" + getRoutingContext() + ", VenueId:" + getVenueId() + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.address);
        parcel.writeString(this.title);
        parcel.writeString(this.secondaryTitle);
        parcel.writeString(this.distance);
        parcel.writeString(this.timeOffRoute);
        parcel.writeInt(this.image);
        parcel.writeInt(this.category);
        parcel.writeString(this.id);
        parcel.writeInt(this.type);
        parcel.writeString(this.phone);
        parcel.writeString(this.icon);
        parcel.writeString(this.MeetingId);
        parcel.writeByte(this.isRecurring ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.is_validate ? (byte) 1 : (byte) 0);
        parcel.writeString(this.starttime);
        parcel.writeParcelable(this.venueData, i2);
        parcel.writeString(this.brandId);
        parcel.writeString(this.adsContext);
        parcel.writeInt(this.dealType);
        parcel.writeString(this.dealTitle);
        parcel.writeString(this.dealText);
        parcel.writeFloat(this.price);
        parcel.writeString(this.formattedPrice);
        parcel.writeString(this.currency);
        parcel.writeInt(this.range);
        parcel.writeString(this.dealId);
        parcel.writeInt(this.advPointId);
        parcel.writeLong(this.lastUpdated);
        parcel.writeInt(this.distanceMeters);
        parcel.writeString(this.brand);
        parcel.writeInt(this.index);
        parcel.writeString(this.mImageURL);
        parcel.writeString(this.mPreviewIcon);
        parcel.writeByte(this.mIsNavigable ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isAddNewFavorite ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mSpecificIcon ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.mAdvertiserData, i2);
        parcel.writeString(this.partnerId);
    }

    public void setDistance(String str) {
        this.distance = str;
    }

    public AddressItem(int i2, int i3, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.image = 0;
        this.category = 99;
        this.type = 0;
        this.is_validate = false;
        this.starttime = null;
        this.formattedPrice = null;
        this.currency = null;
        this.distanceMeters = 0;
        this.brand = "";
        this.index = -1;
        this.mImageURL = null;
        this.mPreviewIcon = "";
        this.mIsNavigable = true;
        this.isAddNewFavorite = false;
        this.mSpecificIcon = false;
        this.title = str;
        setVenueId(str6);
        setRoutingContext(str7);
        setVenueAddress(str2, null, str3, str4, str5, null);
        setIntPosition(Integer.valueOf(i3), Integer.valueOf(i2));
    }

    public AddressItem(int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, byte[] bArr, String str18) {
        this.image = 0;
        this.category = 99;
        this.type = 0;
        this.is_validate = false;
        this.starttime = null;
        this.formattedPrice = null;
        this.currency = null;
        this.distanceMeters = 0;
        this.brand = "";
        this.index = -1;
        this.mImageURL = null;
        this.mPreviewIcon = "";
        this.mIsNavigable = true;
        this.isAddNewFavorite = false;
        this.mSpecificIcon = false;
        init(i2, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, bArr, str18);
    }

    public AddressItem(int i2, int i3, String str) {
        this(i2, i3, null, null, null, null, null, null, null);
        this.address = str;
    }

    public AddressItem(Integer num, Integer num2, String str, String str2, String str3, String str4, Integer num3, Integer num4, String str5, Integer num5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, byte[] bArr, String str13) {
        this.image = 0;
        this.category = 99;
        this.type = 0;
        this.is_validate = false;
        this.starttime = null;
        this.formattedPrice = null;
        this.currency = null;
        this.distanceMeters = 0;
        this.brand = "";
        this.index = -1;
        this.mImageURL = null;
        this.mPreviewIcon = "";
        this.mIsNavigable = true;
        this.isAddNewFavorite = false;
        this.mSpecificIcon = false;
        this.address = str3;
        this.title = str;
        this.secondaryTitle = str2;
        this.distance = str4;
        if (num3 != null) {
            this.image = num3.intValue();
        }
        if (num4 != null) {
            this.category = num4.intValue();
        } else {
            this.category = 99;
        }
        this.id = str5;
        if (num5 != null) {
            this.type = num5.intValue();
        } else {
            this.type = 0;
        }
        this.icon = str6;
        this.venueData = bArr != null ? new com.waze.reports.ed(bArr) : null;
        setVenueId(str7);
        setVenueAddress(str8, str9, str10, str11, str12, null);
        setRoutingContext(str13);
        setIntPosition(num2, num);
    }

    public AddressItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, byte[] bArr, boolean z, String str20) {
        String str21;
        this.image = 0;
        this.category = 99;
        this.type = 0;
        this.is_validate = false;
        this.starttime = null;
        this.formattedPrice = null;
        this.currency = null;
        this.distanceMeters = 0;
        this.brand = "";
        this.index = -1;
        this.mImageURL = null;
        this.mPreviewIcon = "";
        this.mIsNavigable = true;
        this.isAddNewFavorite = false;
        this.mSpecificIcon = false;
        init(-1, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str19, bArr, str20);
        if (str17 != null) {
            this.starttime = str17;
            str21 = str18;
            this.MeetingId = str21;
            this.isRecurring = z;
        } else {
            str21 = str18;
        }
        if (str15 == null || Integer.parseInt(str15) != 8 || str21 == null) {
            return;
        }
        this.MeetingId = str21;
    }

    public AddressItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, byte[] bArr, boolean z, boolean z2, String str20) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, bArr, z, str20);
        setIsValidate(z2);
    }
}
