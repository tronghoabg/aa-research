package com.waze.jni.protos;

import com.google.v.fj;
import com.google.v.v;
import com.waze.jni.protos.Position;
import com.waze.jni.protos.places.Address;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface VenueDataOrBuilder extends fj {
    String getAbout();

    v getAboutBytes();

    Address getAddress();

    String getAliases(int i2);

    v getAliasesBytes(int i2);

    int getAliasesCount();

    List<String> getAliasesList();

    String getBrand();

    v getBrandBytes();

    String getBrandId();

    v getBrandIdBytes();

    BusinessStatus getBusinessStatus();

    int getBusinessStatusValue();

    String getCategories(int i2);

    v getCategoriesBytes(int i2);

    int getCategoriesCount();

    List<String> getCategoriesList();

    String getDetails();

    v getDetailsBytes();

    EVChargingVenue getEvChargingVenue();

    boolean getHasMoreData();

    String getId();

    v getIdBytes();

    VenueImage getImages(int i2);

    int getImagesCount();

    List<VenueImage> getImagesList();

    boolean getIsResidence();

    boolean getIsUpdatable();

    String getName();

    v getNameBytes();

    String getNewImageIds(int i2);

    v getNewImageIdsBytes(int i2);

    int getNewImageIdsCount();

    List<String> getNewImageIdsList();

    OpeningHours getOpeningHours(int i2);

    int getOpeningHoursCount();

    List<OpeningHours> getOpeningHoursList();

    String getPhoneNumber();

    v getPhoneNumberBytes();

    Position.IntPosition getPosition();

    int getPriceLevel();

    CandidateProduct getProducts(int i2);

    int getProductsCount();

    List<CandidateProduct> getProductsList();

    String getProviderId();

    v getProviderIdBytes();

    double getRating();

    Reporter getReporter();

    String getRoutingContext();

    v getRoutingContextBytes();

    String getServices(int i2);

    v getServicesBytes(int i2);

    int getServicesCount();

    List<String> getServicesList();

    String getTakeoverImage();

    v getTakeoverImageBytes();

    String getTakeoverLabel();

    v getTakeoverLabelBytes();

    Reporter getUpdater();

    String getVenueContext();

    v getVenueContextBytes();

    String getWebsite();

    v getWebsiteBytes();

    String getWebsiteDisplayText();

    v getWebsiteDisplayTextBytes();

    boolean hasAbout();

    boolean hasAddress();

    boolean hasBrand();

    boolean hasBrandId();

    boolean hasBusinessStatus();

    boolean hasDetails();

    boolean hasEvChargingVenue();

    boolean hasHasMoreData();

    boolean hasId();

    boolean hasIsResidence();

    boolean hasIsUpdatable();

    boolean hasName();

    boolean hasPhoneNumber();

    boolean hasPosition();

    boolean hasPriceLevel();

    boolean hasProviderId();

    boolean hasRating();

    boolean hasReporter();

    boolean hasRoutingContext();

    boolean hasTakeoverImage();

    boolean hasTakeoverLabel();

    boolean hasUpdater();

    boolean hasVenueContext();

    boolean hasWebsite();

    boolean hasWebsiteDisplayText();
}
