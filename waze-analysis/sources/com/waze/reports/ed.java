package com.waze.reports;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.v.eu;
import com.waze.jni.protos.EVChargingVenue;
import com.waze.jni.protos.Position;
import com.waze.jni.protos.Reporter;
import com.waze.jni.protos.VenueData;
import com.waze.jni.protos.VenueImage;
import com.waze.jni.protos.places.Address;
import com.waze.jni.protos.places.Place;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ed implements Parcelable, Serializable, Cloneable {
    public static final Parcelable.Creator<ed> CREATOR = new bw(2);
    private static final long serialVersionUID = 1;

    /* renamed from: a, reason: collision with root package name */
    public boolean f33905a;

    /* renamed from: b, reason: collision with root package name */
    final VenueData.Builder f33906b;

    /* JADX WARN: Illegal instructions before constructor call */
    /* synthetic */ ed(Parcel parcel) {
        byte[] bArr = new byte[parcel.readInt()];
        parcel.readByteArray(bArr);
        this(bArr);
        this.f33905a = parcel.readInt() != 0;
    }

    private final Address.Builder ar() {
        VenueData.Builder builder = this.f33906b;
        return builder.hasAddress() ? Address.newBuilder(builder.getAddress()) : Address.newBuilder();
    }

    public final String A() {
        VenueData.Builder builder = this.f33906b;
        if (builder.hasUpdater()) {
            return builder.getUpdater().getMood();
        }
        return null;
    }

    public final String B() {
        VenueData.Builder builder = this.f33906b;
        if (builder.hasUpdater()) {
            return builder.getUpdater().getName();
        }
        return null;
    }

    public final String C() {
        return this.f33906b.getWebsite();
    }

    public final String D() {
        return this.f33906b.getWebsiteDisplayText();
    }

    public final List E() {
        return this.f33906b.getCategoriesList();
    }

    public final List F() {
        return this.f33906b.getImagesList();
    }

    public final List G() {
        return this.f33906b.getOpeningHoursList();
    }

    public final List H() {
        return this.f33906b.getProductsList();
    }

    public final List I() {
        return this.f33906b.getServicesList();
    }

    public final void J(String str, String str2, String str3) {
        if (str == null) {
            return;
        }
        VenueData.Builder builder = this.f33906b;
        if (builder.getImagesCount() >= 30) {
            builder.removeImages(0);
        }
        VenueImage.Builder builderNewBuilder = VenueImage.newBuilder();
        builderNewBuilder.setUrl(str);
        if (str2 != null) {
            builderNewBuilder.setThumbnailUrl(str2);
        }
        if (str3 != null) {
            Reporter.Builder builderNewBuilder2 = Reporter.newBuilder();
            builderNewBuilder2.setName(str3);
            builderNewBuilder.setReporter(builderNewBuilder2);
        }
        builder.addImages(builderNewBuilder);
    }

    public final void K(String str) {
        if (str == null) {
            return;
        }
        VenueData.Builder builder = this.f33906b;
        if (builder.getNewImageIdsCount() != 30) {
            builder.addNewImageIds(str);
        }
    }

    public final void L() {
        this.f33906b.clearCategories();
    }

    public final void M(String str, String str2, String str3) {
        if (str == null) {
            return;
        }
        int i2 = 0;
        while (true) {
            VenueData.Builder builder = this.f33906b;
            if (i2 >= builder.getImagesCount()) {
                return;
            }
            VenueImage images = builder.getImages(i2);
            if (images.hasUrl() && images.getUrl().contentEquals(str)) {
                builder.removeImages(i2);
                VenueImage.Builder builderNewBuilder = VenueImage.newBuilder();
                builderNewBuilder.setUrl(str2);
                builderNewBuilder.setThumbnailUrl(str3);
                builderNewBuilder.setByMe(true);
                builder.addImages(i2, builderNewBuilder);
                return;
            }
            i2++;
        }
    }

    public final void N(String str) {
        VenueData.Builder builder = this.f33906b;
        if (str != null) {
            builder.setAbout(str);
        } else {
            builder.clearAbout();
        }
    }

    public final void O(List list) {
        L();
        int size = list.size();
        VenueData.Builder builder = this.f33906b;
        if (size <= 30) {
            builder.addAllCategories(list);
        } else {
            builder.addAllCategories(list.subList(0, 30));
        }
    }

    public final void P(String str) {
        VenueData.Builder builder = this.f33906b;
        if (str != null) {
            Address.Builder builderAr = ar();
            builderAr.setCity(str);
            builder.setAddress(builderAr);
        } else if (builder.hasAddress()) {
            Address.Builder builderAr2 = ar();
            builderAr2.clearCity();
            builder.setAddress(builderAr2);
        }
    }

    public final void Q(String str) {
        VenueData.Builder builder = this.f33906b;
        if (str != null) {
            builder.setVenueContext(str);
        } else {
            builder.clearVenueContext();
        }
    }

    public final void R(String str) {
        Address.Builder builderAr = ar();
        builderAr.setCountry(str);
        this.f33906b.setAddress(builderAr);
    }

    public final void S(boolean z) {
        this.f33906b.setHasMoreData(z);
    }

    public final void T(String str) {
        VenueData.Builder builder = this.f33906b;
        if (str != null) {
            Address.Builder builderAr = ar();
            builderAr.setHouseNumber(str);
            builder.setAddress(builderAr);
        } else if (builder.hasAddress()) {
            Address.Builder builderAr2 = ar();
            builderAr2.clearHouseNumber();
            builder.setAddress(builderAr2);
        }
    }

    public final void U(String str) {
        VenueData.Builder builder = this.f33906b;
        if (str != null) {
            builder.setId(str);
        } else {
            builder.clearId();
        }
    }

    public final void V(boolean z) {
        this.f33906b.setIsResidence(z);
    }

    public final void W(String str) {
        VenueData.Builder builder = this.f33906b;
        if (str != null) {
            builder.setName(str);
        } else {
            builder.clearName();
        }
    }

    public final void X(List list) {
        VenueData.Builder builder = this.f33906b;
        builder.clearOpeningHours();
        if (list.size() <= 30) {
            builder.addAllOpeningHours(list);
        } else {
            builder.addAllOpeningHours(list.subList(0, 30));
        }
    }

    public final void Y(String str) {
        VenueData.Builder builder = this.f33906b;
        if (str != null) {
            builder.setPhoneNumber(str);
        } else {
            builder.clearPhoneNumber();
        }
    }

    public final void Z(int i2, int i3) {
        Position.IntPosition.Builder builderNewBuilder = Position.IntPosition.newBuilder();
        builderNewBuilder.setLatitude(i2);
        builderNewBuilder.setLongitude(i3);
        this.f33906b.setPosition(builderNewBuilder);
    }

    public final int a() {
        VenueData.Builder builder = this.f33906b;
        if (builder.hasPosition()) {
            return builder.getPosition().getLatitude();
        }
        return 0;
    }

    public final void aa(Integer num) {
        this.f33906b.setPriceLevel(num.intValue());
    }

    public final void ab(Double d2) {
        this.f33906b.setRating(d2.doubleValue());
    }

    public final void ac(String str) {
        VenueData.Builder builder = this.f33906b;
        if (str != null) {
            builder.setRoutingContext(str);
        } else {
            builder.clearVenueContext();
        }
    }

    public final void ad(List list) {
        VenueData.Builder builder = this.f33906b;
        builder.clearServices();
        if (list.size() <= 30) {
            builder.addAllServices(list);
        } else {
            builder.addAllServices(list.subList(0, 30));
        }
    }

    public final void ae(String str) {
        Address.Builder builderAr = ar();
        builderAr.setState(str);
        this.f33906b.setAddress(builderAr);
    }

    public final void af(String str) {
        VenueData.Builder builder = this.f33906b;
        if (str != null) {
            Address.Builder builderAr = ar();
            builderAr.setStreet(str);
            builder.setAddress(builderAr);
        } else if (builder.hasAddress()) {
            Address.Builder builderAr2 = ar();
            builderAr2.clearStreet();
            builder.setAddress(builderAr2);
        }
    }

    public final void ag(Boolean bool) {
        this.f33906b.setIsUpdatable(bool.booleanValue());
    }

    public final void ah(String str) {
        VenueData.Builder builder = this.f33906b;
        if (str != null) {
            builder.setWebsite(str);
        } else {
            builder.clearWebsite();
        }
    }

    public final void ai(String str) {
        Address.Builder builderAr = ar();
        builderAr.setZip(str);
        this.f33906b.setAddress(builderAr);
    }

    public final boolean aj() {
        return this.f33906b.getHasMoreData();
    }

    public final boolean ak() {
        VenueData.Builder builder = this.f33906b;
        if (!builder.hasPosition()) {
            return false;
        }
        int latitude = builder.getPosition().getLatitude();
        int longitude = builder.getPosition().getLongitude();
        return latitude == 0 ? longitude != 0 : (latitude == -1 && longitude == -1) ? false : true;
    }

    public final boolean al() {
        return this.f33906b.getIsResidence();
    }

    public final boolean am() {
        return this.f33906b.getIsUpdatable();
    }

    public final byte[] an() {
        return this.f33906b.build().toByteArray();
    }

    public final void ao(String str) {
        VenueData.Builder builder = this.f33906b;
        List<String> categoriesList = builder.getCategoriesList();
        builder.clearCategories();
        for (String str2 : categoriesList) {
            if (!TextUtils.equals(str2, str)) {
                builder.addCategories(str2);
            }
        }
    }

    public final void ap(int i2) {
        VenueData.Builder builder = this.f33906b;
        if (builder.getImagesCount() > i2) {
            builder.removeImages(i2);
        }
    }

    public final void aq(int i2) {
        VenueData.Builder builder = this.f33906b;
        if (builder.getNewImageIdsCount() <= i2 || i2 < 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(builder.getNewImageIdsList());
        arrayList.remove(i2);
        builder.clearNewImageIds();
        builder.addAllNewImageIds(arrayList);
    }

    public final int b() {
        VenueData.Builder builder = this.f33906b;
        if (builder.hasPosition()) {
            return builder.getPosition().getLongitude();
        }
        return 0;
    }

    public final int c() {
        return this.f33906b.getCategoriesCount();
    }

    public final int d() {
        return this.f33906b.getImagesCount();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.f33906b.getNewImageIdsCount();
    }

    public final com.waze.ev.a f() {
        VenueData.Builder builder = this.f33906b;
        if (!builder.hasEvChargingVenue()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (EVChargingVenue.EVConnectorOverview eVConnectorOverview : builder.getEvChargingVenue().getEvConnectorOverviewsList()) {
            arrayList.add(new com.waze.ev.c(eVConnectorOverview.getEvConnector().getTypeId(), eVConnectorOverview.getCount(), eVConnectorOverview.getMaxPowerKw(), eVConnectorOverview.hasAvailableCount() ? Integer.valueOf(eVConnectorOverview.getAvailableCount()) : null));
        }
        ArrayList arrayList2 = new ArrayList(builder.getEvChargingVenue().getPaymentMethodsList());
        String directions = builder.getEvChargingVenue().getDirections();
        return new com.waze.ev.a(arrayList, builder.getEvChargingVenue().getRestrictedAccess(), arrayList2, true != a.a.y(directions) ? directions : null);
    }

    public final Position.IntPosition g() {
        VenueData.Builder builder = this.f33906b;
        if (builder.hasPosition()) {
            return builder.getPosition();
        }
        Position.IntPosition.Builder builderNewBuilder = Position.IntPosition.newBuilder();
        builderNewBuilder.setLongitude(0);
        builderNewBuilder.setLatitude(0);
        return builderNewBuilder.build();
    }

    public final VenueData h() {
        return this.f33906b.build();
    }

    public final Place i() {
        VenueData.Builder builder = this.f33906b;
        Place.Builder builderNewBuilder = Place.newBuilder();
        builderNewBuilder.setName(builder.getName());
        builderNewBuilder.setPosition(g());
        builderNewBuilder.setAddress(builder.getAddress());
        builderNewBuilder.setVenueId(builder.getId());
        builderNewBuilder.setRoutingContext(builder.getRoutingContext());
        return builderNewBuilder.build();
    }

    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final ed clone() {
        ed edVar = new ed(this.f33906b.build().toByteArray());
        edVar.f33905a = this.f33905a;
        return edVar;
    }

    public final String k() {
        return this.f33906b.getAbout();
    }

    public final String l() {
        StringBuilder sb = new StringBuilder();
        VenueData.Builder builder = this.f33906b;
        if (builder.hasAddress()) {
            if (!TextUtils.isEmpty(builder.getAddress().getStreet())) {
                sb.append(builder.getAddress().getStreet());
                if (!TextUtils.isEmpty(builder.getAddress().getHouseNumber())) {
                    sb.append(" ");
                    sb.append(builder.getAddress().getHouseNumber());
                }
            }
            if (!TextUtils.isEmpty(builder.getAddress().getCity())) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(builder.getAddress().getCity());
            }
        }
        return sb.toString();
    }

    public final String m() {
        return this.f33906b.getBrandId();
    }

    public final String n() {
        VenueData.Builder builder = this.f33906b;
        return builder.hasAddress() ? builder.getAddress().getCity() : "";
    }

    public final String o() {
        return this.f33906b.getVenueContext();
    }

    public final String p() {
        VenueData.Builder builder = this.f33906b;
        return builder.hasAddress() ? builder.getAddress().getCountry() : "";
    }

    public final String q() {
        return this.f33906b.getDetails();
    }

    public final String r() {
        VenueData.Builder builder = this.f33906b;
        return builder.hasAddress() ? builder.getAddress().getHouseNumber() : "";
    }

    public final String s() {
        return this.f33906b.getId();
    }

    public final String t() {
        return this.f33906b.getName();
    }

    public final String u() {
        return this.f33906b.getPhoneNumber();
    }

    public final String v() {
        VenueData.Builder builder = this.f33906b;
        if (builder.hasReporter()) {
            return builder.getReporter().getMood();
        }
        return null;
    }

    public final String w() {
        VenueData.Builder builder = this.f33906b;
        if (builder.hasReporter()) {
            return builder.getReporter().getName();
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        byte[] byteArray = this.f33906b.build().toByteArray();
        parcel.writeInt(byteArray.length);
        parcel.writeByteArray(byteArray);
        parcel.writeInt(this.f33905a ? 1 : 0);
    }

    public final String x() {
        return this.f33906b.getRoutingContext();
    }

    public final String y() {
        VenueData.Builder builder = this.f33906b;
        return builder.hasAddress() ? builder.getAddress().getState() : "";
    }

    public final String z() {
        VenueData.Builder builder = this.f33906b;
        return builder.hasAddress() ? builder.getAddress().getStreet() : "";
    }

    public ed() {
        this.f33905a = false;
        this.f33906b = VenueData.newBuilder();
    }

    public ed(VenueData venueData) {
        this.f33905a = false;
        this.f33906b = VenueData.newBuilder(venueData);
    }

    public ed(byte[] bArr) {
        VenueData defaultInstance;
        this.f33905a = false;
        try {
            defaultInstance = VenueData.parseFrom(bArr);
        } catch (eu unused) {
            defaultInstance = VenueData.getDefaultInstance();
        }
        this.f33906b = VenueData.newBuilder(defaultInstance);
    }
}
