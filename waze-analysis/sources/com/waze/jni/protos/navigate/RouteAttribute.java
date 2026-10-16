package com.waze.jni.protos.navigate;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import com.waze.jni.protos.navigate.Hov;
import com.waze.jni.protos.navigate.Toll;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class RouteAttribute extends du<RouteAttribute, Builder> implements RouteAttributeOrBuilder {
    public static final int BEACONS_FIELD_NUMBER = 11;
    public static final int BLOCKED_FIELD_NUMBER = 20;
    public static final int BORDERCROSSING_FIELD_NUMBER = 10;
    public static final int BYPASSESRESTRICTED_FIELD_NUMBER = 14;
    public static final int DANGEROUSTURN_FIELD_NUMBER = 8;
    public static final int DANGERZONE_FIELD_NUMBER = 3;
    private static final RouteAttribute DEFAULT_INSTANCE;
    public static final int ETAFROMML_FIELD_NUMBER = 16;
    public static final int FERRY_FIELD_NUMBER = 6;
    public static final int HOV_FIELD_NUMBER = 12;
    public static final int LICENSEPLATERESTRICTION_FIELD_NUMBER = 5;
    private static volatile fo<RouteAttribute> PARSER = null;
    public static final int PASSNEEDED_FIELD_NUMBER = 13;
    public static final int PRIMARYFORAVOIDERS_FIELD_NUMBER = 17;
    public static final int PUBLICTRANSPORTATION_FIELD_NUMBER = 4;
    public static final int RESTRICTEDAREA_FIELD_NUMBER = 2;
    public static final int SCHOOLAREA_FIELD_NUMBER = 9;
    public static final int STEPPEDONIT_FIELD_NUMBER = 15;
    public static final int TOLLFORAVOIDERS_FIELD_NUMBER = 19;
    public static final int TOLL_FIELD_NUMBER = 1;
    public static final int UNNATURAL_FIELD_NUMBER = 18;
    public static final int UNPAVED_FIELD_NUMBER = 7;
    private int attributeCase_ = 0;
    private Object attribute_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.navigate.RouteAttribute$1, reason: invalid class name */
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
    public enum AttributeCase {
        TOLL(1),
        RESTRICTEDAREA(2),
        DANGERZONE(3),
        PUBLICTRANSPORTATION(4),
        LICENSEPLATERESTRICTION(5),
        FERRY(6),
        UNPAVED(7),
        DANGEROUSTURN(8),
        SCHOOLAREA(9),
        BORDERCROSSING(10),
        BEACONS(11),
        HOV(12),
        PASSNEEDED(13),
        BYPASSESRESTRICTED(14),
        STEPPEDONIT(15),
        ETAFROMML(16),
        PRIMARYFORAVOIDERS(17),
        UNNATURAL(18),
        TOLLFORAVOIDERS(19),
        BLOCKED(20),
        ATTRIBUTE_NOT_SET(0);

        private final int value;

        AttributeCase(int i2) {
            this.value = i2;
        }

        public static AttributeCase forNumber(int i2) {
            switch (i2) {
                case 0:
                    return ATTRIBUTE_NOT_SET;
                case 1:
                    return TOLL;
                case 2:
                    return RESTRICTEDAREA;
                case 3:
                    return DANGERZONE;
                case 4:
                    return PUBLICTRANSPORTATION;
                case 5:
                    return LICENSEPLATERESTRICTION;
                case 6:
                    return FERRY;
                case 7:
                    return UNPAVED;
                case 8:
                    return DANGEROUSTURN;
                case 9:
                    return SCHOOLAREA;
                case 10:
                    return BORDERCROSSING;
                case 11:
                    return BEACONS;
                case 12:
                    return HOV;
                case 13:
                    return PASSNEEDED;
                case 14:
                    return BYPASSESRESTRICTED;
                case 15:
                    return STEPPEDONIT;
                case 16:
                    return ETAFROMML;
                case 17:
                    return PRIMARYFORAVOIDERS;
                case 18:
                    return UNNATURAL;
                case 19:
                    return TOLLFORAVOIDERS;
                case 20:
                    return BLOCKED;
                default:
                    return null;
            }
        }

        public int getNumber() {
            return this.value;
        }
    }

    /* compiled from: WazeSource */
    public interface BeaconsOrBuilder extends fj {
    }

    /* compiled from: WazeSource */
    public interface BlockedOrBuilder extends fj {
    }

    /* compiled from: WazeSource */
    public interface BorderCrossingOrBuilder extends fj {
    }

    /* compiled from: WazeSource */
    public interface BypassesRestrictedOrBuilder extends fj {
    }

    /* compiled from: WazeSource */
    public interface DangerZoneOrBuilder extends fj {
    }

    /* compiled from: WazeSource */
    public interface DangerousTurnOrBuilder extends fj {
    }

    /* compiled from: WazeSource */
    public interface ETAFromMLOrBuilder extends fj {
    }

    /* compiled from: WazeSource */
    public interface FerryOrBuilder extends fj {
    }

    /* compiled from: WazeSource */
    public interface LicensePlateRestrictionOrBuilder extends fj {
        String getAreaName();

        v getAreaNameBytes();

        boolean hasAreaName();
    }

    /* compiled from: WazeSource */
    public interface PassNeededOrBuilder extends fj {
        String getPass();

        v getPassBytes();
    }

    /* compiled from: WazeSource */
    public interface PrimaryForAvoidersOrBuilder extends fj {
    }

    /* compiled from: WazeSource */
    public interface PublicTransportationOrBuilder extends fj {
    }

    /* compiled from: WazeSource */
    public interface RestrictedAreaOrBuilder extends fj {
        String getAreaName();

        v getAreaNameBytes();

        boolean hasAreaName();
    }

    /* compiled from: WazeSource */
    public interface SchoolAreaOrBuilder extends fj {
    }

    /* compiled from: WazeSource */
    public interface SteppedOnITOrBuilder extends fj {
    }

    /* compiled from: WazeSource */
    public interface TollForAvoidersOrBuilder extends fj {
    }

    /* compiled from: WazeSource */
    public interface UnnaturalOrBuilder extends fj {
    }

    /* compiled from: WazeSource */
    public interface UnpavedOrBuilder extends fj {
    }

    static {
        RouteAttribute routeAttribute = new RouteAttribute();
        DEFAULT_INSTANCE = routeAttribute;
        du.registerDefaultInstance(RouteAttribute.class, routeAttribute);
    }

    private RouteAttribute() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAttribute() {
        this.attributeCase_ = 0;
        this.attribute_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBeacons() {
        if (this.attributeCase_ == 11) {
            this.attributeCase_ = 0;
            this.attribute_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBlocked() {
        if (this.attributeCase_ == 20) {
            this.attributeCase_ = 0;
            this.attribute_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBorderCrossing() {
        if (this.attributeCase_ == 10) {
            this.attributeCase_ = 0;
            this.attribute_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBypassesRestricted() {
        if (this.attributeCase_ == 14) {
            this.attributeCase_ = 0;
            this.attribute_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDangerZone() {
        if (this.attributeCase_ == 3) {
            this.attributeCase_ = 0;
            this.attribute_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDangerousTurn() {
        if (this.attributeCase_ == 8) {
            this.attributeCase_ = 0;
            this.attribute_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEtaFromML() {
        if (this.attributeCase_ == 16) {
            this.attributeCase_ = 0;
            this.attribute_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFerry() {
        if (this.attributeCase_ == 6) {
            this.attributeCase_ = 0;
            this.attribute_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHov() {
        if (this.attributeCase_ == 12) {
            this.attributeCase_ = 0;
            this.attribute_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLicensePlateRestriction() {
        if (this.attributeCase_ == 5) {
            this.attributeCase_ = 0;
            this.attribute_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPassNeeded() {
        if (this.attributeCase_ == 13) {
            this.attributeCase_ = 0;
            this.attribute_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrimaryForAvoiders() {
        if (this.attributeCase_ == 17) {
            this.attributeCase_ = 0;
            this.attribute_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPublicTransportation() {
        if (this.attributeCase_ == 4) {
            this.attributeCase_ = 0;
            this.attribute_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRestrictedArea() {
        if (this.attributeCase_ == 2) {
            this.attributeCase_ = 0;
            this.attribute_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSchoolArea() {
        if (this.attributeCase_ == 9) {
            this.attributeCase_ = 0;
            this.attribute_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSteppedOnIT() {
        if (this.attributeCase_ == 15) {
            this.attributeCase_ = 0;
            this.attribute_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToll() {
        if (this.attributeCase_ == 1) {
            this.attributeCase_ = 0;
            this.attribute_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTollForAvoiders() {
        if (this.attributeCase_ == 19) {
            this.attributeCase_ = 0;
            this.attribute_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnnatural() {
        if (this.attributeCase_ == 18) {
            this.attributeCase_ = 0;
            this.attribute_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnpaved() {
        if (this.attributeCase_ == 7) {
            this.attributeCase_ = 0;
            this.attribute_ = null;
        }
    }

    public static RouteAttribute getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBeacons(Beacons beacons) {
        Objects.requireNonNull(beacons);
        if (this.attributeCase_ == 11 && this.attribute_ != Beacons.getDefaultInstance()) {
            Beacons.Builder builderNewBuilder = Beacons.newBuilder((Beacons) this.attribute_);
            builderNewBuilder.mergeFrom((Beacons.Builder) beacons);
            beacons = builderNewBuilder.buildPartial();
        }
        this.attribute_ = beacons;
        this.attributeCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBlocked(Blocked blocked) {
        Objects.requireNonNull(blocked);
        if (this.attributeCase_ == 20 && this.attribute_ != Blocked.getDefaultInstance()) {
            Blocked.Builder builderNewBuilder = Blocked.newBuilder((Blocked) this.attribute_);
            builderNewBuilder.mergeFrom((Blocked.Builder) blocked);
            blocked = builderNewBuilder.buildPartial();
        }
        this.attribute_ = blocked;
        this.attributeCase_ = 20;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBorderCrossing(BorderCrossing borderCrossing) {
        Objects.requireNonNull(borderCrossing);
        if (this.attributeCase_ == 10 && this.attribute_ != BorderCrossing.getDefaultInstance()) {
            BorderCrossing.Builder builderNewBuilder = BorderCrossing.newBuilder((BorderCrossing) this.attribute_);
            builderNewBuilder.mergeFrom((BorderCrossing.Builder) borderCrossing);
            borderCrossing = builderNewBuilder.buildPartial();
        }
        this.attribute_ = borderCrossing;
        this.attributeCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBypassesRestricted(BypassesRestricted bypassesRestricted) {
        Objects.requireNonNull(bypassesRestricted);
        if (this.attributeCase_ == 14 && this.attribute_ != BypassesRestricted.getDefaultInstance()) {
            BypassesRestricted.Builder builderNewBuilder = BypassesRestricted.newBuilder((BypassesRestricted) this.attribute_);
            builderNewBuilder.mergeFrom((BypassesRestricted.Builder) bypassesRestricted);
            bypassesRestricted = builderNewBuilder.buildPartial();
        }
        this.attribute_ = bypassesRestricted;
        this.attributeCase_ = 14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDangerZone(DangerZone dangerZone) {
        Objects.requireNonNull(dangerZone);
        if (this.attributeCase_ == 3 && this.attribute_ != DangerZone.getDefaultInstance()) {
            DangerZone.Builder builderNewBuilder = DangerZone.newBuilder((DangerZone) this.attribute_);
            builderNewBuilder.mergeFrom((DangerZone.Builder) dangerZone);
            dangerZone = builderNewBuilder.buildPartial();
        }
        this.attribute_ = dangerZone;
        this.attributeCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDangerousTurn(DangerousTurn dangerousTurn) {
        Objects.requireNonNull(dangerousTurn);
        if (this.attributeCase_ == 8 && this.attribute_ != DangerousTurn.getDefaultInstance()) {
            DangerousTurn.Builder builderNewBuilder = DangerousTurn.newBuilder((DangerousTurn) this.attribute_);
            builderNewBuilder.mergeFrom((DangerousTurn.Builder) dangerousTurn);
            dangerousTurn = builderNewBuilder.buildPartial();
        }
        this.attribute_ = dangerousTurn;
        this.attributeCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEtaFromML(ETAFromML eTAFromML) {
        Objects.requireNonNull(eTAFromML);
        if (this.attributeCase_ == 16 && this.attribute_ != ETAFromML.getDefaultInstance()) {
            ETAFromML.Builder builderNewBuilder = ETAFromML.newBuilder((ETAFromML) this.attribute_);
            builderNewBuilder.mergeFrom((ETAFromML.Builder) eTAFromML);
            eTAFromML = builderNewBuilder.buildPartial();
        }
        this.attribute_ = eTAFromML;
        this.attributeCase_ = 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFerry(Ferry ferry) {
        Objects.requireNonNull(ferry);
        if (this.attributeCase_ == 6 && this.attribute_ != Ferry.getDefaultInstance()) {
            Ferry.Builder builderNewBuilder = Ferry.newBuilder((Ferry) this.attribute_);
            builderNewBuilder.mergeFrom((Ferry.Builder) ferry);
            ferry = builderNewBuilder.buildPartial();
        }
        this.attribute_ = ferry;
        this.attributeCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHov(Hov hov) {
        Objects.requireNonNull(hov);
        if (this.attributeCase_ == 12 && this.attribute_ != Hov.getDefaultInstance()) {
            Hov.Builder builderNewBuilder = Hov.newBuilder((Hov) this.attribute_);
            builderNewBuilder.mergeFrom((Hov.Builder) hov);
            hov = builderNewBuilder.buildPartial();
        }
        this.attribute_ = hov;
        this.attributeCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLicensePlateRestriction(LicensePlateRestriction licensePlateRestriction) {
        Objects.requireNonNull(licensePlateRestriction);
        if (this.attributeCase_ == 5 && this.attribute_ != LicensePlateRestriction.getDefaultInstance()) {
            LicensePlateRestriction.Builder builderNewBuilder = LicensePlateRestriction.newBuilder((LicensePlateRestriction) this.attribute_);
            builderNewBuilder.mergeFrom((LicensePlateRestriction.Builder) licensePlateRestriction);
            licensePlateRestriction = builderNewBuilder.buildPartial();
        }
        this.attribute_ = licensePlateRestriction;
        this.attributeCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePassNeeded(PassNeeded passNeeded) {
        Objects.requireNonNull(passNeeded);
        if (this.attributeCase_ == 13 && this.attribute_ != PassNeeded.getDefaultInstance()) {
            PassNeeded.Builder builderNewBuilder = PassNeeded.newBuilder((PassNeeded) this.attribute_);
            builderNewBuilder.mergeFrom((PassNeeded.Builder) passNeeded);
            passNeeded = builderNewBuilder.buildPartial();
        }
        this.attribute_ = passNeeded;
        this.attributeCase_ = 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePrimaryForAvoiders(PrimaryForAvoiders primaryForAvoiders) {
        Objects.requireNonNull(primaryForAvoiders);
        if (this.attributeCase_ == 17 && this.attribute_ != PrimaryForAvoiders.getDefaultInstance()) {
            PrimaryForAvoiders.Builder builderNewBuilder = PrimaryForAvoiders.newBuilder((PrimaryForAvoiders) this.attribute_);
            builderNewBuilder.mergeFrom((PrimaryForAvoiders.Builder) primaryForAvoiders);
            primaryForAvoiders = builderNewBuilder.buildPartial();
        }
        this.attribute_ = primaryForAvoiders;
        this.attributeCase_ = 17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePublicTransportation(PublicTransportation publicTransportation) {
        Objects.requireNonNull(publicTransportation);
        if (this.attributeCase_ == 4 && this.attribute_ != PublicTransportation.getDefaultInstance()) {
            PublicTransportation.Builder builderNewBuilder = PublicTransportation.newBuilder((PublicTransportation) this.attribute_);
            builderNewBuilder.mergeFrom((PublicTransportation.Builder) publicTransportation);
            publicTransportation = builderNewBuilder.buildPartial();
        }
        this.attribute_ = publicTransportation;
        this.attributeCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRestrictedArea(RestrictedArea restrictedArea) {
        Objects.requireNonNull(restrictedArea);
        if (this.attributeCase_ == 2 && this.attribute_ != RestrictedArea.getDefaultInstance()) {
            RestrictedArea.Builder builderNewBuilder = RestrictedArea.newBuilder((RestrictedArea) this.attribute_);
            builderNewBuilder.mergeFrom((RestrictedArea.Builder) restrictedArea);
            restrictedArea = builderNewBuilder.buildPartial();
        }
        this.attribute_ = restrictedArea;
        this.attributeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSchoolArea(SchoolArea schoolArea) {
        Objects.requireNonNull(schoolArea);
        if (this.attributeCase_ == 9 && this.attribute_ != SchoolArea.getDefaultInstance()) {
            SchoolArea.Builder builderNewBuilder = SchoolArea.newBuilder((SchoolArea) this.attribute_);
            builderNewBuilder.mergeFrom((SchoolArea.Builder) schoolArea);
            schoolArea = builderNewBuilder.buildPartial();
        }
        this.attribute_ = schoolArea;
        this.attributeCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSteppedOnIT(SteppedOnIT steppedOnIT) {
        Objects.requireNonNull(steppedOnIT);
        if (this.attributeCase_ == 15 && this.attribute_ != SteppedOnIT.getDefaultInstance()) {
            SteppedOnIT.Builder builderNewBuilder = SteppedOnIT.newBuilder((SteppedOnIT) this.attribute_);
            builderNewBuilder.mergeFrom((SteppedOnIT.Builder) steppedOnIT);
            steppedOnIT = builderNewBuilder.buildPartial();
        }
        this.attribute_ = steppedOnIT;
        this.attributeCase_ = 15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeToll(Toll toll) {
        Objects.requireNonNull(toll);
        if (this.attributeCase_ == 1 && this.attribute_ != Toll.getDefaultInstance()) {
            Toll.Builder builderNewBuilder = Toll.newBuilder((Toll) this.attribute_);
            builderNewBuilder.mergeFrom((Toll.Builder) toll);
            toll = builderNewBuilder.buildPartial();
        }
        this.attribute_ = toll;
        this.attributeCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTollForAvoiders(TollForAvoiders tollForAvoiders) {
        Objects.requireNonNull(tollForAvoiders);
        if (this.attributeCase_ == 19 && this.attribute_ != TollForAvoiders.getDefaultInstance()) {
            TollForAvoiders.Builder builderNewBuilder = TollForAvoiders.newBuilder((TollForAvoiders) this.attribute_);
            builderNewBuilder.mergeFrom((TollForAvoiders.Builder) tollForAvoiders);
            tollForAvoiders = builderNewBuilder.buildPartial();
        }
        this.attribute_ = tollForAvoiders;
        this.attributeCase_ = 19;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUnnatural(Unnatural unnatural) {
        Objects.requireNonNull(unnatural);
        if (this.attributeCase_ == 18 && this.attribute_ != Unnatural.getDefaultInstance()) {
            Unnatural.Builder builderNewBuilder = Unnatural.newBuilder((Unnatural) this.attribute_);
            builderNewBuilder.mergeFrom((Unnatural.Builder) unnatural);
            unnatural = builderNewBuilder.buildPartial();
        }
        this.attribute_ = unnatural;
        this.attributeCase_ = 18;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUnpaved(Unpaved unpaved) {
        Objects.requireNonNull(unpaved);
        if (this.attributeCase_ == 7 && this.attribute_ != Unpaved.getDefaultInstance()) {
            Unpaved.Builder builderNewBuilder = Unpaved.newBuilder((Unpaved) this.attribute_);
            builderNewBuilder.mergeFrom((Unpaved.Builder) unpaved);
            unpaved = builderNewBuilder.buildPartial();
        }
        this.attribute_ = unpaved;
        this.attributeCase_ = 7;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static RouteAttribute parseDelimitedFrom(InputStream inputStream) {
        return (RouteAttribute) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RouteAttribute parseFrom(v vVar) {
        return (RouteAttribute) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<RouteAttribute> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBeacons(Beacons beacons) {
        Objects.requireNonNull(beacons);
        this.attribute_ = beacons;
        this.attributeCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBlocked(Blocked blocked) {
        Objects.requireNonNull(blocked);
        this.attribute_ = blocked;
        this.attributeCase_ = 20;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBorderCrossing(BorderCrossing borderCrossing) {
        Objects.requireNonNull(borderCrossing);
        this.attribute_ = borderCrossing;
        this.attributeCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBypassesRestricted(BypassesRestricted bypassesRestricted) {
        Objects.requireNonNull(bypassesRestricted);
        this.attribute_ = bypassesRestricted;
        this.attributeCase_ = 14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDangerZone(DangerZone dangerZone) {
        Objects.requireNonNull(dangerZone);
        this.attribute_ = dangerZone;
        this.attributeCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDangerousTurn(DangerousTurn dangerousTurn) {
        Objects.requireNonNull(dangerousTurn);
        this.attribute_ = dangerousTurn;
        this.attributeCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEtaFromML(ETAFromML eTAFromML) {
        Objects.requireNonNull(eTAFromML);
        this.attribute_ = eTAFromML;
        this.attributeCase_ = 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFerry(Ferry ferry) {
        Objects.requireNonNull(ferry);
        this.attribute_ = ferry;
        this.attributeCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHov(Hov hov) {
        Objects.requireNonNull(hov);
        this.attribute_ = hov;
        this.attributeCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLicensePlateRestriction(LicensePlateRestriction licensePlateRestriction) {
        Objects.requireNonNull(licensePlateRestriction);
        this.attribute_ = licensePlateRestriction;
        this.attributeCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPassNeeded(PassNeeded passNeeded) {
        Objects.requireNonNull(passNeeded);
        this.attribute_ = passNeeded;
        this.attributeCase_ = 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrimaryForAvoiders(PrimaryForAvoiders primaryForAvoiders) {
        Objects.requireNonNull(primaryForAvoiders);
        this.attribute_ = primaryForAvoiders;
        this.attributeCase_ = 17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPublicTransportation(PublicTransportation publicTransportation) {
        Objects.requireNonNull(publicTransportation);
        this.attribute_ = publicTransportation;
        this.attributeCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRestrictedArea(RestrictedArea restrictedArea) {
        Objects.requireNonNull(restrictedArea);
        this.attribute_ = restrictedArea;
        this.attributeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSchoolArea(SchoolArea schoolArea) {
        Objects.requireNonNull(schoolArea);
        this.attribute_ = schoolArea;
        this.attributeCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSteppedOnIT(SteppedOnIT steppedOnIT) {
        Objects.requireNonNull(steppedOnIT);
        this.attribute_ = steppedOnIT;
        this.attributeCase_ = 15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToll(Toll toll) {
        Objects.requireNonNull(toll);
        this.attribute_ = toll;
        this.attributeCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTollForAvoiders(TollForAvoiders tollForAvoiders) {
        Objects.requireNonNull(tollForAvoiders);
        this.attribute_ = tollForAvoiders;
        this.attributeCase_ = 19;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnnatural(Unnatural unnatural) {
        Objects.requireNonNull(unnatural);
        this.attribute_ = unnatural;
        this.attributeCase_ = 18;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnpaved(Unpaved unpaved) {
        Objects.requireNonNull(unpaved);
        this.attribute_ = unpaved;
        this.attributeCase_ = 7;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0014\u0001\u0000\u0001\u0014\u0014\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000\u0011<\u0000\u0012<\u0000\u0013<\u0000\u0014<\u0000", new Object[]{"attribute_", "attributeCase_", Toll.class, RestrictedArea.class, DangerZone.class, PublicTransportation.class, LicensePlateRestriction.class, Ferry.class, Unpaved.class, DangerousTurn.class, SchoolArea.class, BorderCrossing.class, Beacons.class, Hov.class, PassNeeded.class, BypassesRestricted.class, SteppedOnIT.class, ETAFromML.class, PrimaryForAvoiders.class, Unnatural.class, TollForAvoiders.class, Blocked.class});
        }
        if (iOrdinal == 3) {
            return new RouteAttribute();
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
        fo<RouteAttribute> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (RouteAttribute.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
    public AttributeCase getAttributeCase() {
        return AttributeCase.forNumber(this.attributeCase_);
    }

    @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
    public Beacons getBeacons() {
        return this.attributeCase_ == 11 ? (Beacons) this.attribute_ : Beacons.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
    public Blocked getBlocked() {
        return this.attributeCase_ == 20 ? (Blocked) this.attribute_ : Blocked.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
    public BorderCrossing getBorderCrossing() {
        return this.attributeCase_ == 10 ? (BorderCrossing) this.attribute_ : BorderCrossing.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
    public BypassesRestricted getBypassesRestricted() {
        return this.attributeCase_ == 14 ? (BypassesRestricted) this.attribute_ : BypassesRestricted.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
    public DangerZone getDangerZone() {
        return this.attributeCase_ == 3 ? (DangerZone) this.attribute_ : DangerZone.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
    public DangerousTurn getDangerousTurn() {
        return this.attributeCase_ == 8 ? (DangerousTurn) this.attribute_ : DangerousTurn.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
    public ETAFromML getEtaFromML() {
        return this.attributeCase_ == 16 ? (ETAFromML) this.attribute_ : ETAFromML.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
    public Ferry getFerry() {
        return this.attributeCase_ == 6 ? (Ferry) this.attribute_ : Ferry.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
    public Hov getHov() {
        return this.attributeCase_ == 12 ? (Hov) this.attribute_ : Hov.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
    public LicensePlateRestriction getLicensePlateRestriction() {
        return this.attributeCase_ == 5 ? (LicensePlateRestriction) this.attribute_ : LicensePlateRestriction.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
    public PassNeeded getPassNeeded() {
        return this.attributeCase_ == 13 ? (PassNeeded) this.attribute_ : PassNeeded.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
    public PrimaryForAvoiders getPrimaryForAvoiders() {
        return this.attributeCase_ == 17 ? (PrimaryForAvoiders) this.attribute_ : PrimaryForAvoiders.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
    public PublicTransportation getPublicTransportation() {
        return this.attributeCase_ == 4 ? (PublicTransportation) this.attribute_ : PublicTransportation.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
    public RestrictedArea getRestrictedArea() {
        return this.attributeCase_ == 2 ? (RestrictedArea) this.attribute_ : RestrictedArea.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
    public SchoolArea getSchoolArea() {
        return this.attributeCase_ == 9 ? (SchoolArea) this.attribute_ : SchoolArea.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
    public SteppedOnIT getSteppedOnIT() {
        return this.attributeCase_ == 15 ? (SteppedOnIT) this.attribute_ : SteppedOnIT.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
    public Toll getToll() {
        return this.attributeCase_ == 1 ? (Toll) this.attribute_ : Toll.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
    public TollForAvoiders getTollForAvoiders() {
        return this.attributeCase_ == 19 ? (TollForAvoiders) this.attribute_ : TollForAvoiders.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
    public Unnatural getUnnatural() {
        return this.attributeCase_ == 18 ? (Unnatural) this.attribute_ : Unnatural.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
    public Unpaved getUnpaved() {
        return this.attributeCase_ == 7 ? (Unpaved) this.attribute_ : Unpaved.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
    public boolean hasBeacons() {
        return this.attributeCase_ == 11;
    }

    @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
    public boolean hasBlocked() {
        return this.attributeCase_ == 20;
    }

    @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
    public boolean hasBorderCrossing() {
        return this.attributeCase_ == 10;
    }

    @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
    public boolean hasBypassesRestricted() {
        return this.attributeCase_ == 14;
    }

    @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
    public boolean hasDangerZone() {
        return this.attributeCase_ == 3;
    }

    @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
    public boolean hasDangerousTurn() {
        return this.attributeCase_ == 8;
    }

    @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
    public boolean hasEtaFromML() {
        return this.attributeCase_ == 16;
    }

    @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
    public boolean hasFerry() {
        return this.attributeCase_ == 6;
    }

    @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
    public boolean hasHov() {
        return this.attributeCase_ == 12;
    }

    @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
    public boolean hasLicensePlateRestriction() {
        return this.attributeCase_ == 5;
    }

    @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
    public boolean hasPassNeeded() {
        return this.attributeCase_ == 13;
    }

    @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
    public boolean hasPrimaryForAvoiders() {
        return this.attributeCase_ == 17;
    }

    @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
    public boolean hasPublicTransportation() {
        return this.attributeCase_ == 4;
    }

    @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
    public boolean hasRestrictedArea() {
        return this.attributeCase_ == 2;
    }

    @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
    public boolean hasSchoolArea() {
        return this.attributeCase_ == 9;
    }

    @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
    public boolean hasSteppedOnIT() {
        return this.attributeCase_ == 15;
    }

    @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
    public boolean hasToll() {
        return this.attributeCase_ == 1;
    }

    @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
    public boolean hasTollForAvoiders() {
        return this.attributeCase_ == 19;
    }

    @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
    public boolean hasUnnatural() {
        return this.attributeCase_ == 18;
    }

    @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
    public boolean hasUnpaved() {
        return this.attributeCase_ == 7;
    }

    /* compiled from: WazeSource */
    public final class Beacons extends du<Beacons, Builder> implements BeaconsOrBuilder {
        private static final Beacons DEFAULT_INSTANCE;
        private static volatile fo<Beacons> PARSER;

        /* compiled from: WazeSource */
        public final class Builder extends dm<Beacons, Builder> implements BeaconsOrBuilder {
            private Builder() {
                super(Beacons.DEFAULT_INSTANCE);
            }
        }

        static {
            Beacons beacons = new Beacons();
            DEFAULT_INSTANCE = beacons;
            du.registerDefaultInstance(Beacons.class, beacons);
        }

        private Beacons() {
        }

        public static Beacons getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Beacons parseDelimitedFrom(InputStream inputStream) {
            return (Beacons) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Beacons parseFrom(v vVar) {
            return (Beacons) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<Beacons> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            }
            if (iOrdinal == 3) {
                return new Beacons();
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
            fo<Beacons> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (Beacons.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        public static Builder newBuilder(Beacons beacons) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(beacons);
        }

        public static Beacons parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (Beacons) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static Beacons parseFrom(v vVar, de deVar) {
            return (Beacons) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static Beacons parseFrom(z zVar) {
            return (Beacons) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static Beacons parseFrom(z zVar, de deVar) {
            return (Beacons) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static Beacons parseFrom(InputStream inputStream) {
            return (Beacons) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Beacons parseFrom(InputStream inputStream, de deVar) {
            return (Beacons) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static Beacons parseFrom(ByteBuffer byteBuffer) {
            return (Beacons) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Beacons parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (Beacons) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static Beacons parseFrom(byte[] bArr) {
            return (Beacons) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Beacons parseFrom(byte[] bArr, de deVar) {
            return (Beacons) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    /* compiled from: WazeSource */
    public final class Blocked extends du<Blocked, Builder> implements BlockedOrBuilder {
        private static final Blocked DEFAULT_INSTANCE;
        private static volatile fo<Blocked> PARSER;

        /* compiled from: WazeSource */
        public final class Builder extends dm<Blocked, Builder> implements BlockedOrBuilder {
            private Builder() {
                super(Blocked.DEFAULT_INSTANCE);
            }
        }

        static {
            Blocked blocked = new Blocked();
            DEFAULT_INSTANCE = blocked;
            du.registerDefaultInstance(Blocked.class, blocked);
        }

        private Blocked() {
        }

        public static Blocked getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Blocked parseDelimitedFrom(InputStream inputStream) {
            return (Blocked) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Blocked parseFrom(v vVar) {
            return (Blocked) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<Blocked> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            }
            if (iOrdinal == 3) {
                return new Blocked();
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
            fo<Blocked> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (Blocked.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        public static Builder newBuilder(Blocked blocked) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(blocked);
        }

        public static Blocked parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (Blocked) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static Blocked parseFrom(v vVar, de deVar) {
            return (Blocked) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static Blocked parseFrom(z zVar) {
            return (Blocked) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static Blocked parseFrom(z zVar, de deVar) {
            return (Blocked) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static Blocked parseFrom(InputStream inputStream) {
            return (Blocked) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Blocked parseFrom(InputStream inputStream, de deVar) {
            return (Blocked) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static Blocked parseFrom(ByteBuffer byteBuffer) {
            return (Blocked) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Blocked parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (Blocked) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static Blocked parseFrom(byte[] bArr) {
            return (Blocked) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Blocked parseFrom(byte[] bArr, de deVar) {
            return (Blocked) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    /* compiled from: WazeSource */
    public final class BorderCrossing extends du<BorderCrossing, Builder> implements BorderCrossingOrBuilder {
        private static final BorderCrossing DEFAULT_INSTANCE;
        private static volatile fo<BorderCrossing> PARSER;

        /* compiled from: WazeSource */
        public final class Builder extends dm<BorderCrossing, Builder> implements BorderCrossingOrBuilder {
            private Builder() {
                super(BorderCrossing.DEFAULT_INSTANCE);
            }
        }

        static {
            BorderCrossing borderCrossing = new BorderCrossing();
            DEFAULT_INSTANCE = borderCrossing;
            du.registerDefaultInstance(BorderCrossing.class, borderCrossing);
        }

        private BorderCrossing() {
        }

        public static BorderCrossing getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static BorderCrossing parseDelimitedFrom(InputStream inputStream) {
            return (BorderCrossing) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BorderCrossing parseFrom(v vVar) {
            return (BorderCrossing) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<BorderCrossing> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            }
            if (iOrdinal == 3) {
                return new BorderCrossing();
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
            fo<BorderCrossing> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (BorderCrossing.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        public static Builder newBuilder(BorderCrossing borderCrossing) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(borderCrossing);
        }

        public static BorderCrossing parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (BorderCrossing) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static BorderCrossing parseFrom(v vVar, de deVar) {
            return (BorderCrossing) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static BorderCrossing parseFrom(z zVar) {
            return (BorderCrossing) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static BorderCrossing parseFrom(z zVar, de deVar) {
            return (BorderCrossing) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static BorderCrossing parseFrom(InputStream inputStream) {
            return (BorderCrossing) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BorderCrossing parseFrom(InputStream inputStream, de deVar) {
            return (BorderCrossing) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static BorderCrossing parseFrom(ByteBuffer byteBuffer) {
            return (BorderCrossing) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static BorderCrossing parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (BorderCrossing) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static BorderCrossing parseFrom(byte[] bArr) {
            return (BorderCrossing) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BorderCrossing parseFrom(byte[] bArr, de deVar) {
            return (BorderCrossing) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    /* compiled from: WazeSource */
    public final class BypassesRestricted extends du<BypassesRestricted, Builder> implements BypassesRestrictedOrBuilder {
        private static final BypassesRestricted DEFAULT_INSTANCE;
        private static volatile fo<BypassesRestricted> PARSER;

        /* compiled from: WazeSource */
        public final class Builder extends dm<BypassesRestricted, Builder> implements BypassesRestrictedOrBuilder {
            private Builder() {
                super(BypassesRestricted.DEFAULT_INSTANCE);
            }
        }

        static {
            BypassesRestricted bypassesRestricted = new BypassesRestricted();
            DEFAULT_INSTANCE = bypassesRestricted;
            du.registerDefaultInstance(BypassesRestricted.class, bypassesRestricted);
        }

        private BypassesRestricted() {
        }

        public static BypassesRestricted getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static BypassesRestricted parseDelimitedFrom(InputStream inputStream) {
            return (BypassesRestricted) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BypassesRestricted parseFrom(v vVar) {
            return (BypassesRestricted) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<BypassesRestricted> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            }
            if (iOrdinal == 3) {
                return new BypassesRestricted();
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
            fo<BypassesRestricted> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (BypassesRestricted.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        public static Builder newBuilder(BypassesRestricted bypassesRestricted) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(bypassesRestricted);
        }

        public static BypassesRestricted parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (BypassesRestricted) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static BypassesRestricted parseFrom(v vVar, de deVar) {
            return (BypassesRestricted) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static BypassesRestricted parseFrom(z zVar) {
            return (BypassesRestricted) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static BypassesRestricted parseFrom(z zVar, de deVar) {
            return (BypassesRestricted) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static BypassesRestricted parseFrom(InputStream inputStream) {
            return (BypassesRestricted) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BypassesRestricted parseFrom(InputStream inputStream, de deVar) {
            return (BypassesRestricted) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static BypassesRestricted parseFrom(ByteBuffer byteBuffer) {
            return (BypassesRestricted) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static BypassesRestricted parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (BypassesRestricted) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static BypassesRestricted parseFrom(byte[] bArr) {
            return (BypassesRestricted) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BypassesRestricted parseFrom(byte[] bArr, de deVar) {
            return (BypassesRestricted) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    /* compiled from: WazeSource */
    public final class DangerZone extends du<DangerZone, Builder> implements DangerZoneOrBuilder {
        private static final DangerZone DEFAULT_INSTANCE;
        private static volatile fo<DangerZone> PARSER;

        /* compiled from: WazeSource */
        public final class Builder extends dm<DangerZone, Builder> implements DangerZoneOrBuilder {
            private Builder() {
                super(DangerZone.DEFAULT_INSTANCE);
            }
        }

        static {
            DangerZone dangerZone = new DangerZone();
            DEFAULT_INSTANCE = dangerZone;
            du.registerDefaultInstance(DangerZone.class, dangerZone);
        }

        private DangerZone() {
        }

        public static DangerZone getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static DangerZone parseDelimitedFrom(InputStream inputStream) {
            return (DangerZone) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DangerZone parseFrom(v vVar) {
            return (DangerZone) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<DangerZone> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            }
            if (iOrdinal == 3) {
                return new DangerZone();
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
            fo<DangerZone> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (DangerZone.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        public static Builder newBuilder(DangerZone dangerZone) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(dangerZone);
        }

        public static DangerZone parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (DangerZone) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static DangerZone parseFrom(v vVar, de deVar) {
            return (DangerZone) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static DangerZone parseFrom(z zVar) {
            return (DangerZone) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static DangerZone parseFrom(z zVar, de deVar) {
            return (DangerZone) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static DangerZone parseFrom(InputStream inputStream) {
            return (DangerZone) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DangerZone parseFrom(InputStream inputStream, de deVar) {
            return (DangerZone) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static DangerZone parseFrom(ByteBuffer byteBuffer) {
            return (DangerZone) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static DangerZone parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (DangerZone) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static DangerZone parseFrom(byte[] bArr) {
            return (DangerZone) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DangerZone parseFrom(byte[] bArr, de deVar) {
            return (DangerZone) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    /* compiled from: WazeSource */
    public final class DangerousTurn extends du<DangerousTurn, Builder> implements DangerousTurnOrBuilder {
        private static final DangerousTurn DEFAULT_INSTANCE;
        private static volatile fo<DangerousTurn> PARSER;

        /* compiled from: WazeSource */
        public final class Builder extends dm<DangerousTurn, Builder> implements DangerousTurnOrBuilder {
            private Builder() {
                super(DangerousTurn.DEFAULT_INSTANCE);
            }
        }

        static {
            DangerousTurn dangerousTurn = new DangerousTurn();
            DEFAULT_INSTANCE = dangerousTurn;
            du.registerDefaultInstance(DangerousTurn.class, dangerousTurn);
        }

        private DangerousTurn() {
        }

        public static DangerousTurn getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static DangerousTurn parseDelimitedFrom(InputStream inputStream) {
            return (DangerousTurn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DangerousTurn parseFrom(v vVar) {
            return (DangerousTurn) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<DangerousTurn> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            }
            if (iOrdinal == 3) {
                return new DangerousTurn();
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
            fo<DangerousTurn> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (DangerousTurn.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        public static Builder newBuilder(DangerousTurn dangerousTurn) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(dangerousTurn);
        }

        public static DangerousTurn parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (DangerousTurn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static DangerousTurn parseFrom(v vVar, de deVar) {
            return (DangerousTurn) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static DangerousTurn parseFrom(z zVar) {
            return (DangerousTurn) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static DangerousTurn parseFrom(z zVar, de deVar) {
            return (DangerousTurn) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static DangerousTurn parseFrom(InputStream inputStream) {
            return (DangerousTurn) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DangerousTurn parseFrom(InputStream inputStream, de deVar) {
            return (DangerousTurn) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static DangerousTurn parseFrom(ByteBuffer byteBuffer) {
            return (DangerousTurn) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static DangerousTurn parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (DangerousTurn) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static DangerousTurn parseFrom(byte[] bArr) {
            return (DangerousTurn) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DangerousTurn parseFrom(byte[] bArr, de deVar) {
            return (DangerousTurn) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    /* compiled from: WazeSource */
    public final class ETAFromML extends du<ETAFromML, Builder> implements ETAFromMLOrBuilder {
        private static final ETAFromML DEFAULT_INSTANCE;
        private static volatile fo<ETAFromML> PARSER;

        /* compiled from: WazeSource */
        public final class Builder extends dm<ETAFromML, Builder> implements ETAFromMLOrBuilder {
            private Builder() {
                super(ETAFromML.DEFAULT_INSTANCE);
            }
        }

        static {
            ETAFromML eTAFromML = new ETAFromML();
            DEFAULT_INSTANCE = eTAFromML;
            du.registerDefaultInstance(ETAFromML.class, eTAFromML);
        }

        private ETAFromML() {
        }

        public static ETAFromML getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ETAFromML parseDelimitedFrom(InputStream inputStream) {
            return (ETAFromML) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ETAFromML parseFrom(v vVar) {
            return (ETAFromML) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<ETAFromML> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            }
            if (iOrdinal == 3) {
                return new ETAFromML();
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
            fo<ETAFromML> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (ETAFromML.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        public static Builder newBuilder(ETAFromML eTAFromML) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(eTAFromML);
        }

        public static ETAFromML parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (ETAFromML) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static ETAFromML parseFrom(v vVar, de deVar) {
            return (ETAFromML) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static ETAFromML parseFrom(z zVar) {
            return (ETAFromML) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static ETAFromML parseFrom(z zVar, de deVar) {
            return (ETAFromML) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static ETAFromML parseFrom(InputStream inputStream) {
            return (ETAFromML) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ETAFromML parseFrom(InputStream inputStream, de deVar) {
            return (ETAFromML) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static ETAFromML parseFrom(ByteBuffer byteBuffer) {
            return (ETAFromML) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static ETAFromML parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (ETAFromML) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static ETAFromML parseFrom(byte[] bArr) {
            return (ETAFromML) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ETAFromML parseFrom(byte[] bArr, de deVar) {
            return (ETAFromML) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    /* compiled from: WazeSource */
    public final class Ferry extends du<Ferry, Builder> implements FerryOrBuilder {
        private static final Ferry DEFAULT_INSTANCE;
        private static volatile fo<Ferry> PARSER;

        /* compiled from: WazeSource */
        public final class Builder extends dm<Ferry, Builder> implements FerryOrBuilder {
            private Builder() {
                super(Ferry.DEFAULT_INSTANCE);
            }
        }

        static {
            Ferry ferry = new Ferry();
            DEFAULT_INSTANCE = ferry;
            du.registerDefaultInstance(Ferry.class, ferry);
        }

        private Ferry() {
        }

        public static Ferry getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Ferry parseDelimitedFrom(InputStream inputStream) {
            return (Ferry) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Ferry parseFrom(v vVar) {
            return (Ferry) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<Ferry> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            }
            if (iOrdinal == 3) {
                return new Ferry();
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
            fo<Ferry> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (Ferry.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        public static Builder newBuilder(Ferry ferry) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(ferry);
        }

        public static Ferry parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (Ferry) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static Ferry parseFrom(v vVar, de deVar) {
            return (Ferry) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static Ferry parseFrom(z zVar) {
            return (Ferry) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static Ferry parseFrom(z zVar, de deVar) {
            return (Ferry) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static Ferry parseFrom(InputStream inputStream) {
            return (Ferry) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Ferry parseFrom(InputStream inputStream, de deVar) {
            return (Ferry) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static Ferry parseFrom(ByteBuffer byteBuffer) {
            return (Ferry) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Ferry parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (Ferry) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static Ferry parseFrom(byte[] bArr) {
            return (Ferry) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Ferry parseFrom(byte[] bArr, de deVar) {
            return (Ferry) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    /* compiled from: WazeSource */
    public final class LicensePlateRestriction extends du<LicensePlateRestriction, Builder> implements LicensePlateRestrictionOrBuilder {
        public static final int AREANAME_FIELD_NUMBER = 1;
        private static final LicensePlateRestriction DEFAULT_INSTANCE;
        private static volatile fo<LicensePlateRestriction> PARSER;
        private String areaName_ = "";
        private int bitField0_;

        /* compiled from: WazeSource */
        public final class Builder extends dm<LicensePlateRestriction, Builder> implements LicensePlateRestrictionOrBuilder {
            private Builder() {
                super(LicensePlateRestriction.DEFAULT_INSTANCE);
            }

            public Builder clearAreaName() {
                copyOnWrite();
                ((LicensePlateRestriction) this.instance).clearAreaName();
                return this;
            }

            @Override // com.waze.jni.protos.navigate.RouteAttribute.LicensePlateRestrictionOrBuilder
            public String getAreaName() {
                return ((LicensePlateRestriction) this.instance).getAreaName();
            }

            @Override // com.waze.jni.protos.navigate.RouteAttribute.LicensePlateRestrictionOrBuilder
            public v getAreaNameBytes() {
                return ((LicensePlateRestriction) this.instance).getAreaNameBytes();
            }

            @Override // com.waze.jni.protos.navigate.RouteAttribute.LicensePlateRestrictionOrBuilder
            public boolean hasAreaName() {
                return ((LicensePlateRestriction) this.instance).hasAreaName();
            }

            public Builder setAreaName(String str) {
                copyOnWrite();
                ((LicensePlateRestriction) this.instance).setAreaName(str);
                return this;
            }

            public Builder setAreaNameBytes(v vVar) {
                copyOnWrite();
                ((LicensePlateRestriction) this.instance).setAreaNameBytes(vVar);
                return this;
            }
        }

        static {
            LicensePlateRestriction licensePlateRestriction = new LicensePlateRestriction();
            DEFAULT_INSTANCE = licensePlateRestriction;
            du.registerDefaultInstance(LicensePlateRestriction.class, licensePlateRestriction);
        }

        private LicensePlateRestriction() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAreaName() {
            this.bitField0_ &= -2;
            this.areaName_ = getDefaultInstance().getAreaName();
        }

        public static LicensePlateRestriction getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static LicensePlateRestriction parseDelimitedFrom(InputStream inputStream) {
            return (LicensePlateRestriction) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LicensePlateRestriction parseFrom(v vVar) {
            return (LicensePlateRestriction) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<LicensePlateRestriction> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAreaName(String str) {
            Objects.requireNonNull(str);
            this.bitField0_ |= 1;
            this.areaName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAreaNameBytes(v vVar) {
            checkByteStringIsUtf8(vVar);
            this.areaName_ = vVar.u();
            this.bitField0_ |= 1;
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"bitField0_", "areaName_"});
            }
            if (iOrdinal == 3) {
                return new LicensePlateRestriction();
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
            fo<LicensePlateRestriction> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (LicensePlateRestriction.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        @Override // com.waze.jni.protos.navigate.RouteAttribute.LicensePlateRestrictionOrBuilder
        public String getAreaName() {
            return this.areaName_;
        }

        @Override // com.waze.jni.protos.navigate.RouteAttribute.LicensePlateRestrictionOrBuilder
        public v getAreaNameBytes() {
            return v.s(this.areaName_);
        }

        @Override // com.waze.jni.protos.navigate.RouteAttribute.LicensePlateRestrictionOrBuilder
        public boolean hasAreaName() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(LicensePlateRestriction licensePlateRestriction) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(licensePlateRestriction);
        }

        public static LicensePlateRestriction parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (LicensePlateRestriction) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static LicensePlateRestriction parseFrom(v vVar, de deVar) {
            return (LicensePlateRestriction) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static LicensePlateRestriction parseFrom(z zVar) {
            return (LicensePlateRestriction) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static LicensePlateRestriction parseFrom(z zVar, de deVar) {
            return (LicensePlateRestriction) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static LicensePlateRestriction parseFrom(InputStream inputStream) {
            return (LicensePlateRestriction) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LicensePlateRestriction parseFrom(InputStream inputStream, de deVar) {
            return (LicensePlateRestriction) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static LicensePlateRestriction parseFrom(ByteBuffer byteBuffer) {
            return (LicensePlateRestriction) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static LicensePlateRestriction parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (LicensePlateRestriction) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static LicensePlateRestriction parseFrom(byte[] bArr) {
            return (LicensePlateRestriction) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LicensePlateRestriction parseFrom(byte[] bArr, de deVar) {
            return (LicensePlateRestriction) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    /* compiled from: WazeSource */
    public final class PassNeeded extends du<PassNeeded, Builder> implements PassNeededOrBuilder {
        private static final PassNeeded DEFAULT_INSTANCE;
        private static volatile fo<PassNeeded> PARSER = null;
        public static final int PASS_FIELD_NUMBER = 1;
        private String pass_ = "";

        /* compiled from: WazeSource */
        public final class Builder extends dm<PassNeeded, Builder> implements PassNeededOrBuilder {
            private Builder() {
                super(PassNeeded.DEFAULT_INSTANCE);
            }

            public Builder clearPass() {
                copyOnWrite();
                ((PassNeeded) this.instance).clearPass();
                return this;
            }

            @Override // com.waze.jni.protos.navigate.RouteAttribute.PassNeededOrBuilder
            public String getPass() {
                return ((PassNeeded) this.instance).getPass();
            }

            @Override // com.waze.jni.protos.navigate.RouteAttribute.PassNeededOrBuilder
            public v getPassBytes() {
                return ((PassNeeded) this.instance).getPassBytes();
            }

            public Builder setPass(String str) {
                copyOnWrite();
                ((PassNeeded) this.instance).setPass(str);
                return this;
            }

            public Builder setPassBytes(v vVar) {
                copyOnWrite();
                ((PassNeeded) this.instance).setPassBytes(vVar);
                return this;
            }
        }

        static {
            PassNeeded passNeeded = new PassNeeded();
            DEFAULT_INSTANCE = passNeeded;
            du.registerDefaultInstance(PassNeeded.class, passNeeded);
        }

        private PassNeeded() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPass() {
            this.pass_ = getDefaultInstance().getPass();
        }

        public static PassNeeded getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static PassNeeded parseDelimitedFrom(InputStream inputStream) {
            return (PassNeeded) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PassNeeded parseFrom(v vVar) {
            return (PassNeeded) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<PassNeeded> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPass(String str) {
            Objects.requireNonNull(str);
            this.pass_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPassBytes(v vVar) {
            checkByteStringIsUtf8(vVar);
            this.pass_ = vVar.u();
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"pass_"});
            }
            if (iOrdinal == 3) {
                return new PassNeeded();
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
            fo<PassNeeded> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (PassNeeded.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        @Override // com.waze.jni.protos.navigate.RouteAttribute.PassNeededOrBuilder
        public String getPass() {
            return this.pass_;
        }

        @Override // com.waze.jni.protos.navigate.RouteAttribute.PassNeededOrBuilder
        public v getPassBytes() {
            return v.s(this.pass_);
        }

        public static Builder newBuilder(PassNeeded passNeeded) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(passNeeded);
        }

        public static PassNeeded parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (PassNeeded) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static PassNeeded parseFrom(v vVar, de deVar) {
            return (PassNeeded) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static PassNeeded parseFrom(z zVar) {
            return (PassNeeded) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static PassNeeded parseFrom(z zVar, de deVar) {
            return (PassNeeded) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static PassNeeded parseFrom(InputStream inputStream) {
            return (PassNeeded) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PassNeeded parseFrom(InputStream inputStream, de deVar) {
            return (PassNeeded) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static PassNeeded parseFrom(ByteBuffer byteBuffer) {
            return (PassNeeded) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static PassNeeded parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (PassNeeded) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static PassNeeded parseFrom(byte[] bArr) {
            return (PassNeeded) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PassNeeded parseFrom(byte[] bArr, de deVar) {
            return (PassNeeded) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    /* compiled from: WazeSource */
    public final class PrimaryForAvoiders extends du<PrimaryForAvoiders, Builder> implements PrimaryForAvoidersOrBuilder {
        private static final PrimaryForAvoiders DEFAULT_INSTANCE;
        private static volatile fo<PrimaryForAvoiders> PARSER;

        /* compiled from: WazeSource */
        public final class Builder extends dm<PrimaryForAvoiders, Builder> implements PrimaryForAvoidersOrBuilder {
            private Builder() {
                super(PrimaryForAvoiders.DEFAULT_INSTANCE);
            }
        }

        static {
            PrimaryForAvoiders primaryForAvoiders = new PrimaryForAvoiders();
            DEFAULT_INSTANCE = primaryForAvoiders;
            du.registerDefaultInstance(PrimaryForAvoiders.class, primaryForAvoiders);
        }

        private PrimaryForAvoiders() {
        }

        public static PrimaryForAvoiders getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static PrimaryForAvoiders parseDelimitedFrom(InputStream inputStream) {
            return (PrimaryForAvoiders) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PrimaryForAvoiders parseFrom(v vVar) {
            return (PrimaryForAvoiders) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<PrimaryForAvoiders> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            }
            if (iOrdinal == 3) {
                return new PrimaryForAvoiders();
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
            fo<PrimaryForAvoiders> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (PrimaryForAvoiders.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        public static Builder newBuilder(PrimaryForAvoiders primaryForAvoiders) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(primaryForAvoiders);
        }

        public static PrimaryForAvoiders parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (PrimaryForAvoiders) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static PrimaryForAvoiders parseFrom(v vVar, de deVar) {
            return (PrimaryForAvoiders) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static PrimaryForAvoiders parseFrom(z zVar) {
            return (PrimaryForAvoiders) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static PrimaryForAvoiders parseFrom(z zVar, de deVar) {
            return (PrimaryForAvoiders) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static PrimaryForAvoiders parseFrom(InputStream inputStream) {
            return (PrimaryForAvoiders) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PrimaryForAvoiders parseFrom(InputStream inputStream, de deVar) {
            return (PrimaryForAvoiders) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static PrimaryForAvoiders parseFrom(ByteBuffer byteBuffer) {
            return (PrimaryForAvoiders) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static PrimaryForAvoiders parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (PrimaryForAvoiders) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static PrimaryForAvoiders parseFrom(byte[] bArr) {
            return (PrimaryForAvoiders) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PrimaryForAvoiders parseFrom(byte[] bArr, de deVar) {
            return (PrimaryForAvoiders) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    /* compiled from: WazeSource */
    public final class PublicTransportation extends du<PublicTransportation, Builder> implements PublicTransportationOrBuilder {
        private static final PublicTransportation DEFAULT_INSTANCE;
        private static volatile fo<PublicTransportation> PARSER;

        /* compiled from: WazeSource */
        public final class Builder extends dm<PublicTransportation, Builder> implements PublicTransportationOrBuilder {
            private Builder() {
                super(PublicTransportation.DEFAULT_INSTANCE);
            }
        }

        static {
            PublicTransportation publicTransportation = new PublicTransportation();
            DEFAULT_INSTANCE = publicTransportation;
            du.registerDefaultInstance(PublicTransportation.class, publicTransportation);
        }

        private PublicTransportation() {
        }

        public static PublicTransportation getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static PublicTransportation parseDelimitedFrom(InputStream inputStream) {
            return (PublicTransportation) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PublicTransportation parseFrom(v vVar) {
            return (PublicTransportation) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<PublicTransportation> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            }
            if (iOrdinal == 3) {
                return new PublicTransportation();
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
            fo<PublicTransportation> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (PublicTransportation.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        public static Builder newBuilder(PublicTransportation publicTransportation) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(publicTransportation);
        }

        public static PublicTransportation parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (PublicTransportation) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static PublicTransportation parseFrom(v vVar, de deVar) {
            return (PublicTransportation) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static PublicTransportation parseFrom(z zVar) {
            return (PublicTransportation) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static PublicTransportation parseFrom(z zVar, de deVar) {
            return (PublicTransportation) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static PublicTransportation parseFrom(InputStream inputStream) {
            return (PublicTransportation) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PublicTransportation parseFrom(InputStream inputStream, de deVar) {
            return (PublicTransportation) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static PublicTransportation parseFrom(ByteBuffer byteBuffer) {
            return (PublicTransportation) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static PublicTransportation parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (PublicTransportation) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static PublicTransportation parseFrom(byte[] bArr) {
            return (PublicTransportation) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PublicTransportation parseFrom(byte[] bArr, de deVar) {
            return (PublicTransportation) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    /* compiled from: WazeSource */
    public final class RestrictedArea extends du<RestrictedArea, Builder> implements RestrictedAreaOrBuilder {
        public static final int AREANAME_FIELD_NUMBER = 1;
        private static final RestrictedArea DEFAULT_INSTANCE;
        private static volatile fo<RestrictedArea> PARSER;
        private String areaName_ = "";
        private int bitField0_;

        /* compiled from: WazeSource */
        public final class Builder extends dm<RestrictedArea, Builder> implements RestrictedAreaOrBuilder {
            private Builder() {
                super(RestrictedArea.DEFAULT_INSTANCE);
            }

            public Builder clearAreaName() {
                copyOnWrite();
                ((RestrictedArea) this.instance).clearAreaName();
                return this;
            }

            @Override // com.waze.jni.protos.navigate.RouteAttribute.RestrictedAreaOrBuilder
            public String getAreaName() {
                return ((RestrictedArea) this.instance).getAreaName();
            }

            @Override // com.waze.jni.protos.navigate.RouteAttribute.RestrictedAreaOrBuilder
            public v getAreaNameBytes() {
                return ((RestrictedArea) this.instance).getAreaNameBytes();
            }

            @Override // com.waze.jni.protos.navigate.RouteAttribute.RestrictedAreaOrBuilder
            public boolean hasAreaName() {
                return ((RestrictedArea) this.instance).hasAreaName();
            }

            public Builder setAreaName(String str) {
                copyOnWrite();
                ((RestrictedArea) this.instance).setAreaName(str);
                return this;
            }

            public Builder setAreaNameBytes(v vVar) {
                copyOnWrite();
                ((RestrictedArea) this.instance).setAreaNameBytes(vVar);
                return this;
            }
        }

        static {
            RestrictedArea restrictedArea = new RestrictedArea();
            DEFAULT_INSTANCE = restrictedArea;
            du.registerDefaultInstance(RestrictedArea.class, restrictedArea);
        }

        private RestrictedArea() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAreaName() {
            this.bitField0_ &= -2;
            this.areaName_ = getDefaultInstance().getAreaName();
        }

        public static RestrictedArea getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static RestrictedArea parseDelimitedFrom(InputStream inputStream) {
            return (RestrictedArea) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RestrictedArea parseFrom(v vVar) {
            return (RestrictedArea) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<RestrictedArea> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAreaName(String str) {
            Objects.requireNonNull(str);
            this.bitField0_ |= 1;
            this.areaName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAreaNameBytes(v vVar) {
            checkByteStringIsUtf8(vVar);
            this.areaName_ = vVar.u();
            this.bitField0_ |= 1;
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"bitField0_", "areaName_"});
            }
            if (iOrdinal == 3) {
                return new RestrictedArea();
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
            fo<RestrictedArea> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (RestrictedArea.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        @Override // com.waze.jni.protos.navigate.RouteAttribute.RestrictedAreaOrBuilder
        public String getAreaName() {
            return this.areaName_;
        }

        @Override // com.waze.jni.protos.navigate.RouteAttribute.RestrictedAreaOrBuilder
        public v getAreaNameBytes() {
            return v.s(this.areaName_);
        }

        @Override // com.waze.jni.protos.navigate.RouteAttribute.RestrictedAreaOrBuilder
        public boolean hasAreaName() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(RestrictedArea restrictedArea) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(restrictedArea);
        }

        public static RestrictedArea parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (RestrictedArea) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static RestrictedArea parseFrom(v vVar, de deVar) {
            return (RestrictedArea) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static RestrictedArea parseFrom(z zVar) {
            return (RestrictedArea) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static RestrictedArea parseFrom(z zVar, de deVar) {
            return (RestrictedArea) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static RestrictedArea parseFrom(InputStream inputStream) {
            return (RestrictedArea) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RestrictedArea parseFrom(InputStream inputStream, de deVar) {
            return (RestrictedArea) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static RestrictedArea parseFrom(ByteBuffer byteBuffer) {
            return (RestrictedArea) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static RestrictedArea parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (RestrictedArea) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static RestrictedArea parseFrom(byte[] bArr) {
            return (RestrictedArea) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RestrictedArea parseFrom(byte[] bArr, de deVar) {
            return (RestrictedArea) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    /* compiled from: WazeSource */
    public final class SchoolArea extends du<SchoolArea, Builder> implements SchoolAreaOrBuilder {
        private static final SchoolArea DEFAULT_INSTANCE;
        private static volatile fo<SchoolArea> PARSER;

        /* compiled from: WazeSource */
        public final class Builder extends dm<SchoolArea, Builder> implements SchoolAreaOrBuilder {
            private Builder() {
                super(SchoolArea.DEFAULT_INSTANCE);
            }
        }

        static {
            SchoolArea schoolArea = new SchoolArea();
            DEFAULT_INSTANCE = schoolArea;
            du.registerDefaultInstance(SchoolArea.class, schoolArea);
        }

        private SchoolArea() {
        }

        public static SchoolArea getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static SchoolArea parseDelimitedFrom(InputStream inputStream) {
            return (SchoolArea) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SchoolArea parseFrom(v vVar) {
            return (SchoolArea) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<SchoolArea> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            }
            if (iOrdinal == 3) {
                return new SchoolArea();
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
            fo<SchoolArea> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (SchoolArea.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        public static Builder newBuilder(SchoolArea schoolArea) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(schoolArea);
        }

        public static SchoolArea parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (SchoolArea) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static SchoolArea parseFrom(v vVar, de deVar) {
            return (SchoolArea) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static SchoolArea parseFrom(z zVar) {
            return (SchoolArea) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static SchoolArea parseFrom(z zVar, de deVar) {
            return (SchoolArea) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static SchoolArea parseFrom(InputStream inputStream) {
            return (SchoolArea) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SchoolArea parseFrom(InputStream inputStream, de deVar) {
            return (SchoolArea) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static SchoolArea parseFrom(ByteBuffer byteBuffer) {
            return (SchoolArea) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static SchoolArea parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (SchoolArea) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static SchoolArea parseFrom(byte[] bArr) {
            return (SchoolArea) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SchoolArea parseFrom(byte[] bArr, de deVar) {
            return (SchoolArea) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    /* compiled from: WazeSource */
    public final class SteppedOnIT extends du<SteppedOnIT, Builder> implements SteppedOnITOrBuilder {
        private static final SteppedOnIT DEFAULT_INSTANCE;
        private static volatile fo<SteppedOnIT> PARSER;

        /* compiled from: WazeSource */
        public final class Builder extends dm<SteppedOnIT, Builder> implements SteppedOnITOrBuilder {
            private Builder() {
                super(SteppedOnIT.DEFAULT_INSTANCE);
            }
        }

        static {
            SteppedOnIT steppedOnIT = new SteppedOnIT();
            DEFAULT_INSTANCE = steppedOnIT;
            du.registerDefaultInstance(SteppedOnIT.class, steppedOnIT);
        }

        private SteppedOnIT() {
        }

        public static SteppedOnIT getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static SteppedOnIT parseDelimitedFrom(InputStream inputStream) {
            return (SteppedOnIT) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SteppedOnIT parseFrom(v vVar) {
            return (SteppedOnIT) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<SteppedOnIT> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            }
            if (iOrdinal == 3) {
                return new SteppedOnIT();
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
            fo<SteppedOnIT> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (SteppedOnIT.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        public static Builder newBuilder(SteppedOnIT steppedOnIT) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(steppedOnIT);
        }

        public static SteppedOnIT parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (SteppedOnIT) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static SteppedOnIT parseFrom(v vVar, de deVar) {
            return (SteppedOnIT) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static SteppedOnIT parseFrom(z zVar) {
            return (SteppedOnIT) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static SteppedOnIT parseFrom(z zVar, de deVar) {
            return (SteppedOnIT) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static SteppedOnIT parseFrom(InputStream inputStream) {
            return (SteppedOnIT) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SteppedOnIT parseFrom(InputStream inputStream, de deVar) {
            return (SteppedOnIT) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static SteppedOnIT parseFrom(ByteBuffer byteBuffer) {
            return (SteppedOnIT) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static SteppedOnIT parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (SteppedOnIT) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static SteppedOnIT parseFrom(byte[] bArr) {
            return (SteppedOnIT) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SteppedOnIT parseFrom(byte[] bArr, de deVar) {
            return (SteppedOnIT) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    /* compiled from: WazeSource */
    public final class TollForAvoiders extends du<TollForAvoiders, Builder> implements TollForAvoidersOrBuilder {
        private static final TollForAvoiders DEFAULT_INSTANCE;
        private static volatile fo<TollForAvoiders> PARSER;

        /* compiled from: WazeSource */
        public final class Builder extends dm<TollForAvoiders, Builder> implements TollForAvoidersOrBuilder {
            private Builder() {
                super(TollForAvoiders.DEFAULT_INSTANCE);
            }
        }

        static {
            TollForAvoiders tollForAvoiders = new TollForAvoiders();
            DEFAULT_INSTANCE = tollForAvoiders;
            du.registerDefaultInstance(TollForAvoiders.class, tollForAvoiders);
        }

        private TollForAvoiders() {
        }

        public static TollForAvoiders getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TollForAvoiders parseDelimitedFrom(InputStream inputStream) {
            return (TollForAvoiders) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TollForAvoiders parseFrom(v vVar) {
            return (TollForAvoiders) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<TollForAvoiders> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            }
            if (iOrdinal == 3) {
                return new TollForAvoiders();
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
            fo<TollForAvoiders> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (TollForAvoiders.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        public static Builder newBuilder(TollForAvoiders tollForAvoiders) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(tollForAvoiders);
        }

        public static TollForAvoiders parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (TollForAvoiders) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static TollForAvoiders parseFrom(v vVar, de deVar) {
            return (TollForAvoiders) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static TollForAvoiders parseFrom(z zVar) {
            return (TollForAvoiders) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static TollForAvoiders parseFrom(z zVar, de deVar) {
            return (TollForAvoiders) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static TollForAvoiders parseFrom(InputStream inputStream) {
            return (TollForAvoiders) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TollForAvoiders parseFrom(InputStream inputStream, de deVar) {
            return (TollForAvoiders) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static TollForAvoiders parseFrom(ByteBuffer byteBuffer) {
            return (TollForAvoiders) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static TollForAvoiders parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (TollForAvoiders) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static TollForAvoiders parseFrom(byte[] bArr) {
            return (TollForAvoiders) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TollForAvoiders parseFrom(byte[] bArr, de deVar) {
            return (TollForAvoiders) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    /* compiled from: WazeSource */
    public final class Unnatural extends du<Unnatural, Builder> implements UnnaturalOrBuilder {
        private static final Unnatural DEFAULT_INSTANCE;
        private static volatile fo<Unnatural> PARSER;

        /* compiled from: WazeSource */
        public final class Builder extends dm<Unnatural, Builder> implements UnnaturalOrBuilder {
            private Builder() {
                super(Unnatural.DEFAULT_INSTANCE);
            }
        }

        static {
            Unnatural unnatural = new Unnatural();
            DEFAULT_INSTANCE = unnatural;
            du.registerDefaultInstance(Unnatural.class, unnatural);
        }

        private Unnatural() {
        }

        public static Unnatural getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Unnatural parseDelimitedFrom(InputStream inputStream) {
            return (Unnatural) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Unnatural parseFrom(v vVar) {
            return (Unnatural) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<Unnatural> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            }
            if (iOrdinal == 3) {
                return new Unnatural();
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
            fo<Unnatural> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (Unnatural.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        public static Builder newBuilder(Unnatural unnatural) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(unnatural);
        }

        public static Unnatural parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (Unnatural) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static Unnatural parseFrom(v vVar, de deVar) {
            return (Unnatural) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static Unnatural parseFrom(z zVar) {
            return (Unnatural) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static Unnatural parseFrom(z zVar, de deVar) {
            return (Unnatural) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static Unnatural parseFrom(InputStream inputStream) {
            return (Unnatural) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Unnatural parseFrom(InputStream inputStream, de deVar) {
            return (Unnatural) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static Unnatural parseFrom(ByteBuffer byteBuffer) {
            return (Unnatural) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Unnatural parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (Unnatural) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static Unnatural parseFrom(byte[] bArr) {
            return (Unnatural) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Unnatural parseFrom(byte[] bArr, de deVar) {
            return (Unnatural) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    /* compiled from: WazeSource */
    public final class Unpaved extends du<Unpaved, Builder> implements UnpavedOrBuilder {
        private static final Unpaved DEFAULT_INSTANCE;
        private static volatile fo<Unpaved> PARSER;

        /* compiled from: WazeSource */
        public final class Builder extends dm<Unpaved, Builder> implements UnpavedOrBuilder {
            private Builder() {
                super(Unpaved.DEFAULT_INSTANCE);
            }
        }

        static {
            Unpaved unpaved = new Unpaved();
            DEFAULT_INSTANCE = unpaved;
            du.registerDefaultInstance(Unpaved.class, unpaved);
        }

        private Unpaved() {
        }

        public static Unpaved getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Unpaved parseDelimitedFrom(InputStream inputStream) {
            return (Unpaved) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Unpaved parseFrom(v vVar) {
            return (Unpaved) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<Unpaved> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            }
            if (iOrdinal == 3) {
                return new Unpaved();
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
            fo<Unpaved> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (Unpaved.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        public static Builder newBuilder(Unpaved unpaved) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(unpaved);
        }

        public static Unpaved parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (Unpaved) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static Unpaved parseFrom(v vVar, de deVar) {
            return (Unpaved) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static Unpaved parseFrom(z zVar) {
            return (Unpaved) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static Unpaved parseFrom(z zVar, de deVar) {
            return (Unpaved) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static Unpaved parseFrom(InputStream inputStream) {
            return (Unpaved) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Unpaved parseFrom(InputStream inputStream, de deVar) {
            return (Unpaved) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static Unpaved parseFrom(ByteBuffer byteBuffer) {
            return (Unpaved) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Unpaved parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (Unpaved) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static Unpaved parseFrom(byte[] bArr) {
            return (Unpaved) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Unpaved parseFrom(byte[] bArr, de deVar) {
            return (Unpaved) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    public static Builder newBuilder(RouteAttribute routeAttribute) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(routeAttribute);
    }

    public static RouteAttribute parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (RouteAttribute) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static RouteAttribute parseFrom(v vVar, de deVar) {
        return (RouteAttribute) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static RouteAttribute parseFrom(z zVar) {
        return (RouteAttribute) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static RouteAttribute parseFrom(z zVar, de deVar) {
        return (RouteAttribute) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static RouteAttribute parseFrom(InputStream inputStream) {
        return (RouteAttribute) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RouteAttribute parseFrom(InputStream inputStream, de deVar) {
        return (RouteAttribute) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static RouteAttribute parseFrom(ByteBuffer byteBuffer) {
        return (RouteAttribute) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static RouteAttribute parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (RouteAttribute) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<RouteAttribute, Builder> implements RouteAttributeOrBuilder {
        private Builder() {
            super(RouteAttribute.DEFAULT_INSTANCE);
        }

        public Builder clearAttribute() {
            copyOnWrite();
            ((RouteAttribute) this.instance).clearAttribute();
            return this;
        }

        public Builder clearBeacons() {
            copyOnWrite();
            ((RouteAttribute) this.instance).clearBeacons();
            return this;
        }

        public Builder clearBlocked() {
            copyOnWrite();
            ((RouteAttribute) this.instance).clearBlocked();
            return this;
        }

        public Builder clearBorderCrossing() {
            copyOnWrite();
            ((RouteAttribute) this.instance).clearBorderCrossing();
            return this;
        }

        public Builder clearBypassesRestricted() {
            copyOnWrite();
            ((RouteAttribute) this.instance).clearBypassesRestricted();
            return this;
        }

        public Builder clearDangerZone() {
            copyOnWrite();
            ((RouteAttribute) this.instance).clearDangerZone();
            return this;
        }

        public Builder clearDangerousTurn() {
            copyOnWrite();
            ((RouteAttribute) this.instance).clearDangerousTurn();
            return this;
        }

        public Builder clearEtaFromML() {
            copyOnWrite();
            ((RouteAttribute) this.instance).clearEtaFromML();
            return this;
        }

        public Builder clearFerry() {
            copyOnWrite();
            ((RouteAttribute) this.instance).clearFerry();
            return this;
        }

        public Builder clearHov() {
            copyOnWrite();
            ((RouteAttribute) this.instance).clearHov();
            return this;
        }

        public Builder clearLicensePlateRestriction() {
            copyOnWrite();
            ((RouteAttribute) this.instance).clearLicensePlateRestriction();
            return this;
        }

        public Builder clearPassNeeded() {
            copyOnWrite();
            ((RouteAttribute) this.instance).clearPassNeeded();
            return this;
        }

        public Builder clearPrimaryForAvoiders() {
            copyOnWrite();
            ((RouteAttribute) this.instance).clearPrimaryForAvoiders();
            return this;
        }

        public Builder clearPublicTransportation() {
            copyOnWrite();
            ((RouteAttribute) this.instance).clearPublicTransportation();
            return this;
        }

        public Builder clearRestrictedArea() {
            copyOnWrite();
            ((RouteAttribute) this.instance).clearRestrictedArea();
            return this;
        }

        public Builder clearSchoolArea() {
            copyOnWrite();
            ((RouteAttribute) this.instance).clearSchoolArea();
            return this;
        }

        public Builder clearSteppedOnIT() {
            copyOnWrite();
            ((RouteAttribute) this.instance).clearSteppedOnIT();
            return this;
        }

        public Builder clearToll() {
            copyOnWrite();
            ((RouteAttribute) this.instance).clearToll();
            return this;
        }

        public Builder clearTollForAvoiders() {
            copyOnWrite();
            ((RouteAttribute) this.instance).clearTollForAvoiders();
            return this;
        }

        public Builder clearUnnatural() {
            copyOnWrite();
            ((RouteAttribute) this.instance).clearUnnatural();
            return this;
        }

        public Builder clearUnpaved() {
            copyOnWrite();
            ((RouteAttribute) this.instance).clearUnpaved();
            return this;
        }

        @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
        public AttributeCase getAttributeCase() {
            return ((RouteAttribute) this.instance).getAttributeCase();
        }

        @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
        public Beacons getBeacons() {
            return ((RouteAttribute) this.instance).getBeacons();
        }

        @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
        public Blocked getBlocked() {
            return ((RouteAttribute) this.instance).getBlocked();
        }

        @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
        public BorderCrossing getBorderCrossing() {
            return ((RouteAttribute) this.instance).getBorderCrossing();
        }

        @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
        public BypassesRestricted getBypassesRestricted() {
            return ((RouteAttribute) this.instance).getBypassesRestricted();
        }

        @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
        public DangerZone getDangerZone() {
            return ((RouteAttribute) this.instance).getDangerZone();
        }

        @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
        public DangerousTurn getDangerousTurn() {
            return ((RouteAttribute) this.instance).getDangerousTurn();
        }

        @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
        public ETAFromML getEtaFromML() {
            return ((RouteAttribute) this.instance).getEtaFromML();
        }

        @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
        public Ferry getFerry() {
            return ((RouteAttribute) this.instance).getFerry();
        }

        @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
        public Hov getHov() {
            return ((RouteAttribute) this.instance).getHov();
        }

        @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
        public LicensePlateRestriction getLicensePlateRestriction() {
            return ((RouteAttribute) this.instance).getLicensePlateRestriction();
        }

        @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
        public PassNeeded getPassNeeded() {
            return ((RouteAttribute) this.instance).getPassNeeded();
        }

        @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
        public PrimaryForAvoiders getPrimaryForAvoiders() {
            return ((RouteAttribute) this.instance).getPrimaryForAvoiders();
        }

        @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
        public PublicTransportation getPublicTransportation() {
            return ((RouteAttribute) this.instance).getPublicTransportation();
        }

        @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
        public RestrictedArea getRestrictedArea() {
            return ((RouteAttribute) this.instance).getRestrictedArea();
        }

        @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
        public SchoolArea getSchoolArea() {
            return ((RouteAttribute) this.instance).getSchoolArea();
        }

        @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
        public SteppedOnIT getSteppedOnIT() {
            return ((RouteAttribute) this.instance).getSteppedOnIT();
        }

        @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
        public Toll getToll() {
            return ((RouteAttribute) this.instance).getToll();
        }

        @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
        public TollForAvoiders getTollForAvoiders() {
            return ((RouteAttribute) this.instance).getTollForAvoiders();
        }

        @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
        public Unnatural getUnnatural() {
            return ((RouteAttribute) this.instance).getUnnatural();
        }

        @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
        public Unpaved getUnpaved() {
            return ((RouteAttribute) this.instance).getUnpaved();
        }

        @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
        public boolean hasBeacons() {
            return ((RouteAttribute) this.instance).hasBeacons();
        }

        @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
        public boolean hasBlocked() {
            return ((RouteAttribute) this.instance).hasBlocked();
        }

        @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
        public boolean hasBorderCrossing() {
            return ((RouteAttribute) this.instance).hasBorderCrossing();
        }

        @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
        public boolean hasBypassesRestricted() {
            return ((RouteAttribute) this.instance).hasBypassesRestricted();
        }

        @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
        public boolean hasDangerZone() {
            return ((RouteAttribute) this.instance).hasDangerZone();
        }

        @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
        public boolean hasDangerousTurn() {
            return ((RouteAttribute) this.instance).hasDangerousTurn();
        }

        @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
        public boolean hasEtaFromML() {
            return ((RouteAttribute) this.instance).hasEtaFromML();
        }

        @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
        public boolean hasFerry() {
            return ((RouteAttribute) this.instance).hasFerry();
        }

        @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
        public boolean hasHov() {
            return ((RouteAttribute) this.instance).hasHov();
        }

        @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
        public boolean hasLicensePlateRestriction() {
            return ((RouteAttribute) this.instance).hasLicensePlateRestriction();
        }

        @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
        public boolean hasPassNeeded() {
            return ((RouteAttribute) this.instance).hasPassNeeded();
        }

        @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
        public boolean hasPrimaryForAvoiders() {
            return ((RouteAttribute) this.instance).hasPrimaryForAvoiders();
        }

        @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
        public boolean hasPublicTransportation() {
            return ((RouteAttribute) this.instance).hasPublicTransportation();
        }

        @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
        public boolean hasRestrictedArea() {
            return ((RouteAttribute) this.instance).hasRestrictedArea();
        }

        @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
        public boolean hasSchoolArea() {
            return ((RouteAttribute) this.instance).hasSchoolArea();
        }

        @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
        public boolean hasSteppedOnIT() {
            return ((RouteAttribute) this.instance).hasSteppedOnIT();
        }

        @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
        public boolean hasToll() {
            return ((RouteAttribute) this.instance).hasToll();
        }

        @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
        public boolean hasTollForAvoiders() {
            return ((RouteAttribute) this.instance).hasTollForAvoiders();
        }

        @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
        public boolean hasUnnatural() {
            return ((RouteAttribute) this.instance).hasUnnatural();
        }

        @Override // com.waze.jni.protos.navigate.RouteAttributeOrBuilder
        public boolean hasUnpaved() {
            return ((RouteAttribute) this.instance).hasUnpaved();
        }

        public Builder mergeBeacons(Beacons beacons) {
            copyOnWrite();
            ((RouteAttribute) this.instance).mergeBeacons(beacons);
            return this;
        }

        public Builder mergeBlocked(Blocked blocked) {
            copyOnWrite();
            ((RouteAttribute) this.instance).mergeBlocked(blocked);
            return this;
        }

        public Builder mergeBorderCrossing(BorderCrossing borderCrossing) {
            copyOnWrite();
            ((RouteAttribute) this.instance).mergeBorderCrossing(borderCrossing);
            return this;
        }

        public Builder mergeBypassesRestricted(BypassesRestricted bypassesRestricted) {
            copyOnWrite();
            ((RouteAttribute) this.instance).mergeBypassesRestricted(bypassesRestricted);
            return this;
        }

        public Builder mergeDangerZone(DangerZone dangerZone) {
            copyOnWrite();
            ((RouteAttribute) this.instance).mergeDangerZone(dangerZone);
            return this;
        }

        public Builder mergeDangerousTurn(DangerousTurn dangerousTurn) {
            copyOnWrite();
            ((RouteAttribute) this.instance).mergeDangerousTurn(dangerousTurn);
            return this;
        }

        public Builder mergeEtaFromML(ETAFromML eTAFromML) {
            copyOnWrite();
            ((RouteAttribute) this.instance).mergeEtaFromML(eTAFromML);
            return this;
        }

        public Builder mergeFerry(Ferry ferry) {
            copyOnWrite();
            ((RouteAttribute) this.instance).mergeFerry(ferry);
            return this;
        }

        public Builder mergeHov(Hov hov) {
            copyOnWrite();
            ((RouteAttribute) this.instance).mergeHov(hov);
            return this;
        }

        public Builder mergeLicensePlateRestriction(LicensePlateRestriction licensePlateRestriction) {
            copyOnWrite();
            ((RouteAttribute) this.instance).mergeLicensePlateRestriction(licensePlateRestriction);
            return this;
        }

        public Builder mergePassNeeded(PassNeeded passNeeded) {
            copyOnWrite();
            ((RouteAttribute) this.instance).mergePassNeeded(passNeeded);
            return this;
        }

        public Builder mergePrimaryForAvoiders(PrimaryForAvoiders primaryForAvoiders) {
            copyOnWrite();
            ((RouteAttribute) this.instance).mergePrimaryForAvoiders(primaryForAvoiders);
            return this;
        }

        public Builder mergePublicTransportation(PublicTransportation publicTransportation) {
            copyOnWrite();
            ((RouteAttribute) this.instance).mergePublicTransportation(publicTransportation);
            return this;
        }

        public Builder mergeRestrictedArea(RestrictedArea restrictedArea) {
            copyOnWrite();
            ((RouteAttribute) this.instance).mergeRestrictedArea(restrictedArea);
            return this;
        }

        public Builder mergeSchoolArea(SchoolArea schoolArea) {
            copyOnWrite();
            ((RouteAttribute) this.instance).mergeSchoolArea(schoolArea);
            return this;
        }

        public Builder mergeSteppedOnIT(SteppedOnIT steppedOnIT) {
            copyOnWrite();
            ((RouteAttribute) this.instance).mergeSteppedOnIT(steppedOnIT);
            return this;
        }

        public Builder mergeToll(Toll toll) {
            copyOnWrite();
            ((RouteAttribute) this.instance).mergeToll(toll);
            return this;
        }

        public Builder mergeTollForAvoiders(TollForAvoiders tollForAvoiders) {
            copyOnWrite();
            ((RouteAttribute) this.instance).mergeTollForAvoiders(tollForAvoiders);
            return this;
        }

        public Builder mergeUnnatural(Unnatural unnatural) {
            copyOnWrite();
            ((RouteAttribute) this.instance).mergeUnnatural(unnatural);
            return this;
        }

        public Builder mergeUnpaved(Unpaved unpaved) {
            copyOnWrite();
            ((RouteAttribute) this.instance).mergeUnpaved(unpaved);
            return this;
        }

        public Builder setBeacons(Beacons.Builder builder) {
            copyOnWrite();
            ((RouteAttribute) this.instance).setBeacons(builder.build());
            return this;
        }

        public Builder setBlocked(Blocked.Builder builder) {
            copyOnWrite();
            ((RouteAttribute) this.instance).setBlocked(builder.build());
            return this;
        }

        public Builder setBorderCrossing(BorderCrossing.Builder builder) {
            copyOnWrite();
            ((RouteAttribute) this.instance).setBorderCrossing(builder.build());
            return this;
        }

        public Builder setBypassesRestricted(BypassesRestricted.Builder builder) {
            copyOnWrite();
            ((RouteAttribute) this.instance).setBypassesRestricted(builder.build());
            return this;
        }

        public Builder setDangerZone(DangerZone.Builder builder) {
            copyOnWrite();
            ((RouteAttribute) this.instance).setDangerZone(builder.build());
            return this;
        }

        public Builder setDangerousTurn(DangerousTurn.Builder builder) {
            copyOnWrite();
            ((RouteAttribute) this.instance).setDangerousTurn(builder.build());
            return this;
        }

        public Builder setEtaFromML(ETAFromML.Builder builder) {
            copyOnWrite();
            ((RouteAttribute) this.instance).setEtaFromML(builder.build());
            return this;
        }

        public Builder setFerry(Ferry.Builder builder) {
            copyOnWrite();
            ((RouteAttribute) this.instance).setFerry(builder.build());
            return this;
        }

        public Builder setHov(Hov.Builder builder) {
            copyOnWrite();
            ((RouteAttribute) this.instance).setHov(builder.build());
            return this;
        }

        public Builder setLicensePlateRestriction(LicensePlateRestriction.Builder builder) {
            copyOnWrite();
            ((RouteAttribute) this.instance).setLicensePlateRestriction(builder.build());
            return this;
        }

        public Builder setPassNeeded(PassNeeded.Builder builder) {
            copyOnWrite();
            ((RouteAttribute) this.instance).setPassNeeded(builder.build());
            return this;
        }

        public Builder setPrimaryForAvoiders(PrimaryForAvoiders.Builder builder) {
            copyOnWrite();
            ((RouteAttribute) this.instance).setPrimaryForAvoiders(builder.build());
            return this;
        }

        public Builder setPublicTransportation(PublicTransportation.Builder builder) {
            copyOnWrite();
            ((RouteAttribute) this.instance).setPublicTransportation(builder.build());
            return this;
        }

        public Builder setRestrictedArea(RestrictedArea.Builder builder) {
            copyOnWrite();
            ((RouteAttribute) this.instance).setRestrictedArea(builder.build());
            return this;
        }

        public Builder setSchoolArea(SchoolArea.Builder builder) {
            copyOnWrite();
            ((RouteAttribute) this.instance).setSchoolArea(builder.build());
            return this;
        }

        public Builder setSteppedOnIT(SteppedOnIT.Builder builder) {
            copyOnWrite();
            ((RouteAttribute) this.instance).setSteppedOnIT(builder.build());
            return this;
        }

        public Builder setToll(Toll.Builder builder) {
            copyOnWrite();
            ((RouteAttribute) this.instance).setToll(builder.build());
            return this;
        }

        public Builder setTollForAvoiders(TollForAvoiders.Builder builder) {
            copyOnWrite();
            ((RouteAttribute) this.instance).setTollForAvoiders(builder.build());
            return this;
        }

        public Builder setUnnatural(Unnatural.Builder builder) {
            copyOnWrite();
            ((RouteAttribute) this.instance).setUnnatural(builder.build());
            return this;
        }

        public Builder setUnpaved(Unpaved.Builder builder) {
            copyOnWrite();
            ((RouteAttribute) this.instance).setUnpaved(builder.build());
            return this;
        }

        public Builder setBeacons(Beacons beacons) {
            copyOnWrite();
            ((RouteAttribute) this.instance).setBeacons(beacons);
            return this;
        }

        public Builder setBlocked(Blocked blocked) {
            copyOnWrite();
            ((RouteAttribute) this.instance).setBlocked(blocked);
            return this;
        }

        public Builder setBorderCrossing(BorderCrossing borderCrossing) {
            copyOnWrite();
            ((RouteAttribute) this.instance).setBorderCrossing(borderCrossing);
            return this;
        }

        public Builder setBypassesRestricted(BypassesRestricted bypassesRestricted) {
            copyOnWrite();
            ((RouteAttribute) this.instance).setBypassesRestricted(bypassesRestricted);
            return this;
        }

        public Builder setDangerZone(DangerZone dangerZone) {
            copyOnWrite();
            ((RouteAttribute) this.instance).setDangerZone(dangerZone);
            return this;
        }

        public Builder setDangerousTurn(DangerousTurn dangerousTurn) {
            copyOnWrite();
            ((RouteAttribute) this.instance).setDangerousTurn(dangerousTurn);
            return this;
        }

        public Builder setEtaFromML(ETAFromML eTAFromML) {
            copyOnWrite();
            ((RouteAttribute) this.instance).setEtaFromML(eTAFromML);
            return this;
        }

        public Builder setFerry(Ferry ferry) {
            copyOnWrite();
            ((RouteAttribute) this.instance).setFerry(ferry);
            return this;
        }

        public Builder setHov(Hov hov) {
            copyOnWrite();
            ((RouteAttribute) this.instance).setHov(hov);
            return this;
        }

        public Builder setLicensePlateRestriction(LicensePlateRestriction licensePlateRestriction) {
            copyOnWrite();
            ((RouteAttribute) this.instance).setLicensePlateRestriction(licensePlateRestriction);
            return this;
        }

        public Builder setPassNeeded(PassNeeded passNeeded) {
            copyOnWrite();
            ((RouteAttribute) this.instance).setPassNeeded(passNeeded);
            return this;
        }

        public Builder setPrimaryForAvoiders(PrimaryForAvoiders primaryForAvoiders) {
            copyOnWrite();
            ((RouteAttribute) this.instance).setPrimaryForAvoiders(primaryForAvoiders);
            return this;
        }

        public Builder setPublicTransportation(PublicTransportation publicTransportation) {
            copyOnWrite();
            ((RouteAttribute) this.instance).setPublicTransportation(publicTransportation);
            return this;
        }

        public Builder setRestrictedArea(RestrictedArea restrictedArea) {
            copyOnWrite();
            ((RouteAttribute) this.instance).setRestrictedArea(restrictedArea);
            return this;
        }

        public Builder setSchoolArea(SchoolArea schoolArea) {
            copyOnWrite();
            ((RouteAttribute) this.instance).setSchoolArea(schoolArea);
            return this;
        }

        public Builder setSteppedOnIT(SteppedOnIT steppedOnIT) {
            copyOnWrite();
            ((RouteAttribute) this.instance).setSteppedOnIT(steppedOnIT);
            return this;
        }

        public Builder setToll(Toll toll) {
            copyOnWrite();
            ((RouteAttribute) this.instance).setToll(toll);
            return this;
        }

        public Builder setTollForAvoiders(TollForAvoiders tollForAvoiders) {
            copyOnWrite();
            ((RouteAttribute) this.instance).setTollForAvoiders(tollForAvoiders);
            return this;
        }

        public Builder setUnnatural(Unnatural unnatural) {
            copyOnWrite();
            ((RouteAttribute) this.instance).setUnnatural(unnatural);
            return this;
        }

        public Builder setUnpaved(Unpaved unpaved) {
            copyOnWrite();
            ((RouteAttribute) this.instance).setUnpaved(unpaved);
            return this;
        }
    }

    public static RouteAttribute parseFrom(byte[] bArr) {
        return (RouteAttribute) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RouteAttribute parseFrom(byte[] bArr, de deVar) {
        return (RouteAttribute) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
