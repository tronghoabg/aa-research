package com.waze.jni.protos;

import com.google.v.b.a;
import com.google.v.b.c;
import com.waze.jni.protos.Position;
import com.waze.jni.protos.VenueData;
import com.waze.jni.protos.places.Address;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class VenueDataKt {
    public static final VenueDataKt INSTANCE = new VenueDataKt();

    private VenueDataKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final VenueData.Builder _builder;

        /* compiled from: WazeSource */
        public final class AliasesProxy extends c {
            private AliasesProxy() {
            }
        }

        /* compiled from: WazeSource */
        public final class CategoriesProxy extends c {
            private CategoriesProxy() {
            }
        }

        /* compiled from: WazeSource */
        public final class ImagesProxy extends c {
            private ImagesProxy() {
            }
        }

        /* compiled from: WazeSource */
        public final class NewImageIdsProxy extends c {
            private NewImageIdsProxy() {
            }
        }

        /* compiled from: WazeSource */
        public final class OpeningHoursProxy extends c {
            private OpeningHoursProxy() {
            }
        }

        /* compiled from: WazeSource */
        public final class ProductsProxy extends c {
            private ProductsProxy() {
            }
        }

        /* compiled from: WazeSource */
        public final class ServicesProxy extends c {
            private ServicesProxy() {
            }
        }

        private Dsl(VenueData.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ VenueData _build() {
            VenueData venueDataBuild = this._builder.build();
            x.e(venueDataBuild, "build(...)");
            return venueDataBuild;
        }

        public final /* synthetic */ void addAliases(a aVar, String str) {
            x.f(aVar, "<this>");
            x.f(str, "value");
            this._builder.addAliases(str);
        }

        public final /* synthetic */ void addAllAliases(a aVar, Iterable iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            this._builder.addAllAliases(iterable);
        }

        public final /* synthetic */ void addAllCategories(a aVar, Iterable iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            this._builder.addAllCategories(iterable);
        }

        public final /* synthetic */ void addAllImages(a aVar, Iterable iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            this._builder.addAllImages(iterable);
        }

        public final /* synthetic */ void addAllNewImageIds(a aVar, Iterable iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            this._builder.addAllNewImageIds(iterable);
        }

        public final /* synthetic */ void addAllOpeningHours(a aVar, Iterable iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            this._builder.addAllOpeningHours(iterable);
        }

        public final /* synthetic */ void addAllProducts(a aVar, Iterable iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            this._builder.addAllProducts(iterable);
        }

        public final /* synthetic */ void addAllServices(a aVar, Iterable iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            this._builder.addAllServices(iterable);
        }

        public final /* synthetic */ void addCategories(a aVar, String str) {
            x.f(aVar, "<this>");
            x.f(str, "value");
            this._builder.addCategories(str);
        }

        public final /* synthetic */ void addImages(a aVar, VenueImage venueImage) {
            x.f(aVar, "<this>");
            x.f(venueImage, "value");
            this._builder.addImages(venueImage);
        }

        public final /* synthetic */ void addNewImageIds(a aVar, String str) {
            x.f(aVar, "<this>");
            x.f(str, "value");
            this._builder.addNewImageIds(str);
        }

        public final /* synthetic */ void addOpeningHours(a aVar, OpeningHours openingHours) {
            x.f(aVar, "<this>");
            x.f(openingHours, "value");
            this._builder.addOpeningHours(openingHours);
        }

        public final /* synthetic */ void addProducts(a aVar, CandidateProduct candidateProduct) {
            x.f(aVar, "<this>");
            x.f(candidateProduct, "value");
            this._builder.addProducts(candidateProduct);
        }

        public final /* synthetic */ void addServices(a aVar, String str) {
            x.f(aVar, "<this>");
            x.f(str, "value");
            this._builder.addServices(str);
        }

        public final void clearAbout() {
            this._builder.clearAbout();
        }

        public final void clearAddress() {
            this._builder.clearAddress();
        }

        public final void clearBrand() {
            this._builder.clearBrand();
        }

        public final void clearBrandId() {
            this._builder.clearBrandId();
        }

        public final void clearBusinessStatus() {
            this._builder.clearBusinessStatus();
        }

        public final void clearDetails() {
            this._builder.clearDetails();
        }

        public final void clearEvChargingVenue() {
            this._builder.clearEvChargingVenue();
        }

        public final void clearHasMoreData() {
            this._builder.clearHasMoreData();
        }

        public final void clearId() {
            this._builder.clearId();
        }

        public final /* synthetic */ void clearImages(a aVar) {
            x.f(aVar, "<this>");
            this._builder.clearImages();
        }

        public final void clearIsResidence() {
            this._builder.clearIsResidence();
        }

        public final void clearIsUpdatable() {
            this._builder.clearIsUpdatable();
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final /* synthetic */ void clearOpeningHours(a aVar) {
            x.f(aVar, "<this>");
            this._builder.clearOpeningHours();
        }

        public final void clearPhoneNumber() {
            this._builder.clearPhoneNumber();
        }

        public final void clearPosition() {
            this._builder.clearPosition();
        }

        public final void clearPriceLevel() {
            this._builder.clearPriceLevel();
        }

        public final /* synthetic */ void clearProducts(a aVar) {
            x.f(aVar, "<this>");
            this._builder.clearProducts();
        }

        public final void clearProviderId() {
            this._builder.clearProviderId();
        }

        public final void clearRating() {
            this._builder.clearRating();
        }

        public final void clearReporter() {
            this._builder.clearReporter();
        }

        public final void clearRoutingContext() {
            this._builder.clearRoutingContext();
        }

        public final void clearTakeoverImage() {
            this._builder.clearTakeoverImage();
        }

        public final void clearTakeoverLabel() {
            this._builder.clearTakeoverLabel();
        }

        public final void clearUpdater() {
            this._builder.clearUpdater();
        }

        public final void clearVenueContext() {
            this._builder.clearVenueContext();
        }

        public final void clearWebsite() {
            this._builder.clearWebsite();
        }

        public final void clearWebsiteDisplayText() {
            this._builder.clearWebsiteDisplayText();
        }

        public final String getAbout() {
            String about = this._builder.getAbout();
            x.e(about, "getAbout(...)");
            return about;
        }

        public final Address getAddress() {
            Address address = this._builder.getAddress();
            x.e(address, "getAddress(...)");
            return address;
        }

        public final Address getAddressOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return VenueDataKtKt.getAddressOrNull(dsl._builder);
        }

        public final a<String, AliasesProxy> getAliases() {
            List<String> aliasesList = this._builder.getAliasesList();
            x.e(aliasesList, "getAliasesList(...)");
            return new a<>(aliasesList);
        }

        public final String getBrand() {
            String brand = this._builder.getBrand();
            x.e(brand, "getBrand(...)");
            return brand;
        }

        public final String getBrandId() {
            String brandId = this._builder.getBrandId();
            x.e(brandId, "getBrandId(...)");
            return brandId;
        }

        public final BusinessStatus getBusinessStatus() {
            BusinessStatus businessStatus = this._builder.getBusinessStatus();
            x.e(businessStatus, "getBusinessStatus(...)");
            return businessStatus;
        }

        public final int getBusinessStatusValue() {
            return this._builder.getBusinessStatusValue();
        }

        public final a<String, CategoriesProxy> getCategories() {
            List<String> categoriesList = this._builder.getCategoriesList();
            x.e(categoriesList, "getCategoriesList(...)");
            return new a<>(categoriesList);
        }

        public final String getDetails() {
            String details = this._builder.getDetails();
            x.e(details, "getDetails(...)");
            return details;
        }

        public final EVChargingVenue getEvChargingVenue() {
            EVChargingVenue evChargingVenue = this._builder.getEvChargingVenue();
            x.e(evChargingVenue, "getEvChargingVenue(...)");
            return evChargingVenue;
        }

        public final EVChargingVenue getEvChargingVenueOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return VenueDataKtKt.getEvChargingVenueOrNull(dsl._builder);
        }

        public final boolean getHasMoreData() {
            return this._builder.getHasMoreData();
        }

        public final String getId() {
            String id = this._builder.getId();
            x.e(id, "getId(...)");
            return id;
        }

        public final /* synthetic */ a getImages() {
            List<VenueImage> imagesList = this._builder.getImagesList();
            x.e(imagesList, "getImagesList(...)");
            return new a(imagesList);
        }

        public final boolean getIsResidence() {
            return this._builder.getIsResidence();
        }

        public final boolean getIsUpdatable() {
            return this._builder.getIsUpdatable();
        }

        public final String getName() {
            String name = this._builder.getName();
            x.e(name, "getName(...)");
            return name;
        }

        public final a<String, NewImageIdsProxy> getNewImageIds() {
            List<String> newImageIdsList = this._builder.getNewImageIdsList();
            x.e(newImageIdsList, "getNewImageIdsList(...)");
            return new a<>(newImageIdsList);
        }

        public final /* synthetic */ a getOpeningHours() {
            List<OpeningHours> openingHoursList = this._builder.getOpeningHoursList();
            x.e(openingHoursList, "getOpeningHoursList(...)");
            return new a(openingHoursList);
        }

        public final String getPhoneNumber() {
            String phoneNumber = this._builder.getPhoneNumber();
            x.e(phoneNumber, "getPhoneNumber(...)");
            return phoneNumber;
        }

        public final Position.IntPosition getPosition() {
            Position.IntPosition position = this._builder.getPosition();
            x.e(position, "getPosition(...)");
            return position;
        }

        public final Position.IntPosition getPositionOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return VenueDataKtKt.getPositionOrNull(dsl._builder);
        }

        public final int getPriceLevel() {
            return this._builder.getPriceLevel();
        }

        public final /* synthetic */ a getProducts() {
            List<CandidateProduct> productsList = this._builder.getProductsList();
            x.e(productsList, "getProductsList(...)");
            return new a(productsList);
        }

        public final String getProviderId() {
            String providerId = this._builder.getProviderId();
            x.e(providerId, "getProviderId(...)");
            return providerId;
        }

        public final double getRating() {
            return this._builder.getRating();
        }

        public final Reporter getReporter() {
            Reporter reporter = this._builder.getReporter();
            x.e(reporter, "getReporter(...)");
            return reporter;
        }

        public final Reporter getReporterOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return VenueDataKtKt.getReporterOrNull(dsl._builder);
        }

        public final String getRoutingContext() {
            String routingContext = this._builder.getRoutingContext();
            x.e(routingContext, "getRoutingContext(...)");
            return routingContext;
        }

        public final a<String, ServicesProxy> getServices() {
            List<String> servicesList = this._builder.getServicesList();
            x.e(servicesList, "getServicesList(...)");
            return new a<>(servicesList);
        }

        public final String getTakeoverImage() {
            String takeoverImage = this._builder.getTakeoverImage();
            x.e(takeoverImage, "getTakeoverImage(...)");
            return takeoverImage;
        }

        public final String getTakeoverLabel() {
            String takeoverLabel = this._builder.getTakeoverLabel();
            x.e(takeoverLabel, "getTakeoverLabel(...)");
            return takeoverLabel;
        }

        public final Reporter getUpdater() {
            Reporter updater = this._builder.getUpdater();
            x.e(updater, "getUpdater(...)");
            return updater;
        }

        public final Reporter getUpdaterOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return VenueDataKtKt.getUpdaterOrNull(dsl._builder);
        }

        public final String getVenueContext() {
            String venueContext = this._builder.getVenueContext();
            x.e(venueContext, "getVenueContext(...)");
            return venueContext;
        }

        public final String getWebsite() {
            String website = this._builder.getWebsite();
            x.e(website, "getWebsite(...)");
            return website;
        }

        public final String getWebsiteDisplayText() {
            String websiteDisplayText = this._builder.getWebsiteDisplayText();
            x.e(websiteDisplayText, "getWebsiteDisplayText(...)");
            return websiteDisplayText;
        }

        public final boolean hasAbout() {
            return this._builder.hasAbout();
        }

        public final boolean hasAddress() {
            return this._builder.hasAddress();
        }

        public final boolean hasBrand() {
            return this._builder.hasBrand();
        }

        public final boolean hasBrandId() {
            return this._builder.hasBrandId();
        }

        public final boolean hasBusinessStatus() {
            return this._builder.hasBusinessStatus();
        }

        public final boolean hasDetails() {
            return this._builder.hasDetails();
        }

        public final boolean hasEvChargingVenue() {
            return this._builder.hasEvChargingVenue();
        }

        public final boolean hasHasMoreData() {
            return this._builder.hasHasMoreData();
        }

        public final boolean hasId() {
            return this._builder.hasId();
        }

        public final boolean hasIsResidence() {
            return this._builder.hasIsResidence();
        }

        public final boolean hasIsUpdatable() {
            return this._builder.hasIsUpdatable();
        }

        public final boolean hasName() {
            return this._builder.hasName();
        }

        public final boolean hasPhoneNumber() {
            return this._builder.hasPhoneNumber();
        }

        public final boolean hasPosition() {
            return this._builder.hasPosition();
        }

        public final boolean hasPriceLevel() {
            return this._builder.hasPriceLevel();
        }

        public final boolean hasProviderId() {
            return this._builder.hasProviderId();
        }

        public final boolean hasRating() {
            return this._builder.hasRating();
        }

        public final boolean hasReporter() {
            return this._builder.hasReporter();
        }

        public final boolean hasRoutingContext() {
            return this._builder.hasRoutingContext();
        }

        public final boolean hasTakeoverImage() {
            return this._builder.hasTakeoverImage();
        }

        public final boolean hasTakeoverLabel() {
            return this._builder.hasTakeoverLabel();
        }

        public final boolean hasUpdater() {
            return this._builder.hasUpdater();
        }

        public final boolean hasVenueContext() {
            return this._builder.hasVenueContext();
        }

        public final boolean hasWebsite() {
            return this._builder.hasWebsite();
        }

        public final boolean hasWebsiteDisplayText() {
            return this._builder.hasWebsiteDisplayText();
        }

        public final /* synthetic */ void plusAssignAliases(a<String, AliasesProxy> aVar, String str) {
            x.f(aVar, "<this>");
            x.f(str, "value");
            addAliases(aVar, str);
        }

        public final /* synthetic */ void plusAssignAllAliases(a<String, AliasesProxy> aVar, Iterable<String> iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            addAllAliases(aVar, iterable);
        }

        public final /* synthetic */ void plusAssignAllCategories(a<String, CategoriesProxy> aVar, Iterable<String> iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            addAllCategories(aVar, iterable);
        }

        public final /* synthetic */ void plusAssignAllImages(a<VenueImage, ImagesProxy> aVar, Iterable<VenueImage> iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            addAllImages(aVar, iterable);
        }

        public final /* synthetic */ void plusAssignAllNewImageIds(a<String, NewImageIdsProxy> aVar, Iterable<String> iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            addAllNewImageIds(aVar, iterable);
        }

        public final /* synthetic */ void plusAssignAllOpeningHours(a<OpeningHours, OpeningHoursProxy> aVar, Iterable<OpeningHours> iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            addAllOpeningHours(aVar, iterable);
        }

        public final /* synthetic */ void plusAssignAllProducts(a<CandidateProduct, ProductsProxy> aVar, Iterable<CandidateProduct> iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            addAllProducts(aVar, iterable);
        }

        public final /* synthetic */ void plusAssignAllServices(a<String, ServicesProxy> aVar, Iterable<String> iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            addAllServices(aVar, iterable);
        }

        public final /* synthetic */ void plusAssignCategories(a<String, CategoriesProxy> aVar, String str) {
            x.f(aVar, "<this>");
            x.f(str, "value");
            addCategories(aVar, str);
        }

        public final /* synthetic */ void plusAssignImages(a<VenueImage, ImagesProxy> aVar, VenueImage venueImage) {
            x.f(aVar, "<this>");
            x.f(venueImage, "value");
            addImages(aVar, venueImage);
        }

        public final /* synthetic */ void plusAssignNewImageIds(a<String, NewImageIdsProxy> aVar, String str) {
            x.f(aVar, "<this>");
            x.f(str, "value");
            addNewImageIds(aVar, str);
        }

        public final /* synthetic */ void plusAssignOpeningHours(a<OpeningHours, OpeningHoursProxy> aVar, OpeningHours openingHours) {
            x.f(aVar, "<this>");
            x.f(openingHours, "value");
            addOpeningHours(aVar, openingHours);
        }

        public final /* synthetic */ void plusAssignProducts(a<CandidateProduct, ProductsProxy> aVar, CandidateProduct candidateProduct) {
            x.f(aVar, "<this>");
            x.f(candidateProduct, "value");
            addProducts(aVar, candidateProduct);
        }

        public final /* synthetic */ void plusAssignServices(a<String, ServicesProxy> aVar, String str) {
            x.f(aVar, "<this>");
            x.f(str, "value");
            addServices(aVar, str);
        }

        public final void setAbout(String str) {
            x.f(str, "value");
            this._builder.setAbout(str);
        }

        public final void setAddress(Address address) {
            x.f(address, "value");
            this._builder.setAddress(address);
        }

        public final /* synthetic */ void setAliases(a aVar, int i2, String str) {
            x.f(aVar, "<this>");
            x.f(str, "value");
            this._builder.setAliases(i2, str);
        }

        public final void setBrand(String str) {
            x.f(str, "value");
            this._builder.setBrand(str);
        }

        public final void setBrandId(String str) {
            x.f(str, "value");
            this._builder.setBrandId(str);
        }

        public final void setBusinessStatus(BusinessStatus businessStatus) {
            x.f(businessStatus, "value");
            this._builder.setBusinessStatus(businessStatus);
        }

        public final void setBusinessStatusValue(int i2) {
            this._builder.setBusinessStatusValue(i2);
        }

        public final /* synthetic */ void setCategories(a aVar, int i2, String str) {
            x.f(aVar, "<this>");
            x.f(str, "value");
            this._builder.setCategories(i2, str);
        }

        public final void setDetails(String str) {
            x.f(str, "value");
            this._builder.setDetails(str);
        }

        public final void setEvChargingVenue(EVChargingVenue eVChargingVenue) {
            x.f(eVChargingVenue, "value");
            this._builder.setEvChargingVenue(eVChargingVenue);
        }

        public final void setHasMoreData(boolean z) {
            this._builder.setHasMoreData(z);
        }

        public final void setId(String str) {
            x.f(str, "value");
            this._builder.setId(str);
        }

        public final /* synthetic */ void setImages(a aVar, int i2, VenueImage venueImage) {
            x.f(aVar, "<this>");
            x.f(venueImage, "value");
            this._builder.setImages(i2, venueImage);
        }

        public final void setIsResidence(boolean z) {
            this._builder.setIsResidence(z);
        }

        public final void setIsUpdatable(boolean z) {
            this._builder.setIsUpdatable(z);
        }

        public final void setName(String str) {
            x.f(str, "value");
            this._builder.setName(str);
        }

        public final /* synthetic */ void setNewImageIds(a aVar, int i2, String str) {
            x.f(aVar, "<this>");
            x.f(str, "value");
            this._builder.setNewImageIds(i2, str);
        }

        public final /* synthetic */ void setOpeningHours(a aVar, int i2, OpeningHours openingHours) {
            x.f(aVar, "<this>");
            x.f(openingHours, "value");
            this._builder.setOpeningHours(i2, openingHours);
        }

        public final void setPhoneNumber(String str) {
            x.f(str, "value");
            this._builder.setPhoneNumber(str);
        }

        public final void setPosition(Position.IntPosition intPosition) {
            x.f(intPosition, "value");
            this._builder.setPosition(intPosition);
        }

        public final void setPriceLevel(int i2) {
            this._builder.setPriceLevel(i2);
        }

        public final /* synthetic */ void setProducts(a aVar, int i2, CandidateProduct candidateProduct) {
            x.f(aVar, "<this>");
            x.f(candidateProduct, "value");
            this._builder.setProducts(i2, candidateProduct);
        }

        public final void setProviderId(String str) {
            x.f(str, "value");
            this._builder.setProviderId(str);
        }

        public final void setRating(double d2) {
            this._builder.setRating(d2);
        }

        public final void setReporter(Reporter reporter) {
            x.f(reporter, "value");
            this._builder.setReporter(reporter);
        }

        public final void setRoutingContext(String str) {
            x.f(str, "value");
            this._builder.setRoutingContext(str);
        }

        public final /* synthetic */ void setServices(a aVar, int i2, String str) {
            x.f(aVar, "<this>");
            x.f(str, "value");
            this._builder.setServices(i2, str);
        }

        public final void setTakeoverImage(String str) {
            x.f(str, "value");
            this._builder.setTakeoverImage(str);
        }

        public final void setTakeoverLabel(String str) {
            x.f(str, "value");
            this._builder.setTakeoverLabel(str);
        }

        public final void setUpdater(Reporter reporter) {
            x.f(reporter, "value");
            this._builder.setUpdater(reporter);
        }

        public final void setVenueContext(String str) {
            x.f(str, "value");
            this._builder.setVenueContext(str);
        }

        public final void setWebsite(String str) {
            x.f(str, "value");
            this._builder.setWebsite(str);
        }

        public final void setWebsiteDisplayText(String str) {
            x.f(str, "value");
            this._builder.setWebsiteDisplayText(str);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(VenueData.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(VenueData.Builder builder, o oVar) {
            this(builder);
        }

        public final /* synthetic */ void setAliases(a aVar) {
            x.f(aVar, "<this>");
            this._builder.clearAliases();
        }

        public final /* synthetic */ void setCategories(a aVar) {
            x.f(aVar, "<this>");
            this._builder.clearCategories();
        }

        public final /* synthetic */ void setNewImageIds(a aVar) {
            x.f(aVar, "<this>");
            this._builder.clearNewImageIds();
        }

        public final /* synthetic */ void setServices(a aVar) {
            x.f(aVar, "<this>");
            this._builder.clearServices();
        }
    }
}
