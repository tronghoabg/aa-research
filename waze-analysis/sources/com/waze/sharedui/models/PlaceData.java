package com.waze.sharedui.models;

import android.text.TextUtils;
import com.google.d.b.an;
import com.waze.shared_infra.h.c;
import com.waze.shared_infra.i.h;
import java.io.Serializable;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class PlaceData implements Serializable {
    private static final String LOG_TAG = "PlaceData";
    public static final String NON_WAZE_VENUE_ID = "NON_WAZE_VENUE_ID";
    private static final long serialVersionUID = 3;
    private String city;
    private c coordinate;
    private a detailsLevel = a.f39060a;
    private boolean home;
    private String houseNumber;
    private String street;
    private String title;
    private final String venueId;
    private boolean work;

    public PlaceData(String str) {
        this.venueId = str;
    }

    public static PlaceData copy(PlaceData placeData) {
        PlaceData placeData2 = new PlaceData(placeData.venueId);
        placeData2.detailsLevel = placeData.detailsLevel;
        placeData2.title = placeData.title;
        placeData2.coordinate = placeData.coordinate;
        placeData2.city = placeData.city;
        placeData2.street = placeData.street;
        placeData2.houseNumber = placeData.houseNumber;
        placeData2.home = placeData.home;
        placeData2.work = placeData.work;
        return placeData2;
    }

    public static PlaceData createLatLngPlaceWithTitle(c cVar, String str) {
        PlaceData placeData = new PlaceData("");
        placeData.detailsLevel = a.f39060a;
        placeData.coordinate = cVar;
        placeData.title = str;
        return placeData;
    }

    private String uniqueString() {
        if (!TextUtils.isEmpty(this.venueId)) {
            return this.venueId;
        }
        c cVar = this.coordinate;
        if (cVar != null) {
            return cVar.toString();
        }
        h.a("no venueId nor coordinates. BAD PlaceData OBJECT. fallback to description");
        return getDescription();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof PlaceData)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return uniqueString().equalsIgnoreCase(((PlaceData) obj).uniqueString());
    }

    public String getAddressWithCity() {
        String city = getCity();
        String street = getStreet();
        if (street != null) {
            if (!an.f(getHouseNumber())) {
                street = getHouseNumber() + " " + street;
            }
            if (city == null || city.isEmpty()) {
                return street;
            }
            if (!street.isEmpty()) {
                return street + " " + city;
            }
        } else if (city == null) {
            return "";
        }
        return city;
    }

    public String getCity() {
        return this.city;
    }

    public c getCoordinate() {
        return this.coordinate;
    }

    public String getDescription() {
        return isFullAddress() ? getAddressWithCity() : (getTitle() == null || getTitle().isEmpty()) ? getCoordinate() == null ? "" : String.format("%2.2f, %2.2f", Double.valueOf(getCoordinate().a()), Double.valueOf(getCoordinate().b())) : getTitle();
    }

    public String getHouseNumber() {
        return this.houseNumber;
    }

    public String getStreet() {
        return this.street;
    }

    public String getTitle() {
        return this.title;
    }

    public String getVenueId() {
        return this.venueId;
    }

    public int hashCode() {
        return uniqueString().hashCode();
    }

    public boolean isFullAddress() {
        return this.detailsLevel == a.f39061b;
    }

    public boolean isHome() {
        return this.home;
    }

    public boolean isWork() {
        return this.work;
    }

    public void setCoordinate(c cVar) {
        this.coordinate = cVar;
    }

    public void setFullAddress(String str, String str2, String str3) {
        if ((str == null || str.isEmpty()) && ((str2 == null || str2.isEmpty()) && (str3 == null || str3.isEmpty()))) {
            h.b(LOG_TAG, "Empty address was given to place data");
            return;
        }
        this.detailsLevel = a.f39061b;
        this.city = str;
        this.street = str2;
        this.houseNumber = str3;
    }

    public void setHome(boolean z) {
        this.home = z;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setWork(boolean z) {
        this.work = z;
    }

    public String toString() {
        return getDescription();
    }
}
