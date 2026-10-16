package com.waze.sharedui.profile;

import com.waze.sharedui.models.PlaceData;
import h.g.b.x;
import java.io.Serializable;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ProfilePlaces implements Serializable {
    private final PlaceData home;
    private final int numFavorites;
    private final PlaceData work;

    public ProfilePlaces(PlaceData placeData, PlaceData placeData2, int i2) {
        this.home = placeData;
        this.work = placeData2;
        this.numFavorites = i2;
    }

    public static /* synthetic */ ProfilePlaces copy$default(ProfilePlaces profilePlaces, PlaceData placeData, PlaceData placeData2, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            placeData = profilePlaces.home;
        }
        if ((i3 & 2) != 0) {
            placeData2 = profilePlaces.work;
        }
        if ((i3 & 4) != 0) {
            i2 = profilePlaces.numFavorites;
        }
        return profilePlaces.copy(placeData, placeData2, i2);
    }

    public final PlaceData component1() {
        return this.home;
    }

    public final PlaceData component2() {
        return this.work;
    }

    public final int component3() {
        return this.numFavorites;
    }

    public final ProfilePlaces copy(PlaceData placeData, PlaceData placeData2, int i2) {
        return new ProfilePlaces(placeData, placeData2, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfilePlaces)) {
            return false;
        }
        ProfilePlaces profilePlaces = (ProfilePlaces) obj;
        return x.n(this.home, profilePlaces.home) && x.n(this.work, profilePlaces.work) && this.numFavorites == profilePlaces.numFavorites;
    }

    public final PlaceData getHome() {
        return this.home;
    }

    public final int getNumFavorites() {
        return this.numFavorites;
    }

    public final PlaceData getWork() {
        return this.work;
    }

    public int hashCode() {
        PlaceData placeData = this.home;
        int iHashCode = placeData == null ? 0 : placeData.hashCode();
        PlaceData placeData2 = this.work;
        return (((iHashCode * 31) + (placeData2 != null ? placeData2.hashCode() : 0)) * 31) + this.numFavorites;
    }

    public String toString() {
        return "ProfilePlaces(home=" + this.home + ", work=" + this.work + ", numFavorites=" + this.numFavorites + ")";
    }
}
