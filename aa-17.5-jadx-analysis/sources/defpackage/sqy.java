package defpackage;

import android.app.ApplicationErrorReport;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.WorkSource;
import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.feedback.AdditionalConsentConfig;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FileTeleporter;
import com.google.android.gms.feedback.LogOptions;
import com.google.android.gms.feedback.ServiceDump;
import com.google.android.gms.feedback.ServiceDumpRequest;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.FRDProductSpecificDataEntry;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;
import com.google.android.gms.googlehelp.ND4CSettings;
import com.google.android.gms.googlehelp.OfflineSuggestion;
import com.google.android.gms.googlehelp.internal.common.OverflowMenuItem;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import com.google.android.gms.googlehelp.trails.TrailsInteraction;
import com.google.android.gms.libs.identity.ClientIdentity;
import com.google.android.gms.libs.throttling.ThrottlingLimits;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.internal.FusedLocationProviderResult;
import com.google.android.gms.location.internal.LocationReceiver;
import com.google.android.gms.location.internal.LocationRequestInternal;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class sqy implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public sqy(int i) {
        this.a = i;
    }

    public static final ErrorReport a(Parcel parcel) {
        int iP = spu.P(parcel);
        ApplicationErrorReport applicationErrorReport = null;
        String strX = null;
        String strX2 = null;
        String strX3 = null;
        String strX4 = null;
        String strX5 = null;
        String strX6 = null;
        String strX7 = null;
        String strX8 = null;
        String strX9 = null;
        String strX10 = null;
        String strX11 = null;
        String strX12 = null;
        String strX13 = null;
        String[] strArrAj = null;
        String[] strArrAj2 = null;
        String[] strArrAj3 = null;
        String strX14 = null;
        String strX15 = null;
        byte[] bArrAg = null;
        String strX16 = null;
        String strX17 = null;
        String strX18 = null;
        Bundle bundleR = null;
        String strX19 = null;
        String strX20 = null;
        String strX21 = null;
        String strX22 = null;
        String strX23 = null;
        String strX24 = null;
        String strX25 = null;
        String strX26 = null;
        String strX27 = null;
        BitmapTeleporter bitmapTeleporter = null;
        String strX28 = null;
        FileTeleporter[] fileTeleporterArr = null;
        String[] strArrAj4 = null;
        String strX29 = null;
        ThemeSettings themeSettings = null;
        LogOptions logOptions = null;
        String strX30 = null;
        Bundle bundleR2 = null;
        ArrayList arrayListAb = null;
        Bitmap bitmap = null;
        String strX31 = null;
        ArrayList arrayListAa = null;
        String[] strArrAj5 = null;
        String[] strArrAj6 = null;
        String[] strArrAj7 = null;
        String strX32 = null;
        AdditionalConsentConfig additionalConsentConfig = null;
        ServiceDump[] serviceDumpArr = null;
        String strX33 = null;
        int iN = 0;
        int iN2 = 0;
        int iN3 = 0;
        int iN4 = 0;
        int iN5 = 0;
        int iN6 = 0;
        boolean zAf = false;
        int iN7 = 0;
        int iN8 = 0;
        boolean zAf2 = false;
        int iN9 = 0;
        boolean zAf3 = false;
        boolean zAf4 = false;
        boolean zAf5 = false;
        int iN10 = 0;
        int iN11 = 0;
        boolean zAf6 = false;
        boolean zAf7 = false;
        while (parcel.dataPosition() < iP) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    applicationErrorReport = (ApplicationErrorReport) spu.T(parcel, i, ApplicationErrorReport.CREATOR);
                    break;
                case 3:
                    strX = spu.X(parcel, i);
                    break;
                case 4:
                    iN = spu.N(parcel, i);
                    break;
                case 5:
                    strX2 = spu.X(parcel, i);
                    break;
                case 6:
                    strX3 = spu.X(parcel, i);
                    break;
                case 7:
                    strX4 = spu.X(parcel, i);
                    break;
                case '\b':
                    strX5 = spu.X(parcel, i);
                    break;
                case '\t':
                    strX6 = spu.X(parcel, i);
                    break;
                case '\n':
                    strX7 = spu.X(parcel, i);
                    break;
                case 11:
                    strX8 = spu.X(parcel, i);
                    break;
                case '\f':
                    iN2 = spu.N(parcel, i);
                    break;
                case '\r':
                    strX9 = spu.X(parcel, i);
                    break;
                case 14:
                    strX10 = spu.X(parcel, i);
                    break;
                case 15:
                    strX11 = spu.X(parcel, i);
                    break;
                case 16:
                    strX12 = spu.X(parcel, i);
                    break;
                case 17:
                    strX13 = spu.X(parcel, i);
                    break;
                case 18:
                    strArrAj = spu.aj(parcel, i);
                    break;
                case 19:
                    strArrAj2 = spu.aj(parcel, i);
                    break;
                case 20:
                    strArrAj3 = spu.aj(parcel, i);
                    break;
                case 21:
                    strX14 = spu.X(parcel, i);
                    break;
                case 22:
                    strX15 = spu.X(parcel, i);
                    break;
                case 23:
                    bArrAg = spu.ag(parcel, i);
                    break;
                case 24:
                    iN3 = spu.N(parcel, i);
                    break;
                case 25:
                    iN4 = spu.N(parcel, i);
                    break;
                case 26:
                    iN5 = spu.N(parcel, i);
                    break;
                case 27:
                    iN6 = spu.N(parcel, i);
                    break;
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    strX16 = spu.X(parcel, i);
                    break;
                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                    strX17 = spu.X(parcel, i);
                    break;
                case 30:
                    strX18 = spu.X(parcel, i);
                    break;
                case 31:
                    bundleR = spu.R(parcel, i);
                    break;
                case ' ':
                    zAf = spu.af(parcel, i);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                    iN7 = spu.N(parcel, i);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                    iN8 = spu.N(parcel, i);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                    zAf2 = spu.af(parcel, i);
                    break;
                case Maneuver.TYPE_STRAIGHT /* 36 */:
                    strX19 = spu.X(parcel, i);
                    break;
                case '%':
                    strX20 = spu.X(parcel, i);
                    break;
                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                    iN9 = spu.N(parcel, i);
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    strX21 = spu.X(parcel, i);
                    break;
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    strX22 = spu.X(parcel, i);
                    break;
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    strX23 = spu.X(parcel, i);
                    break;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    strX24 = spu.X(parcel, i);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    strX25 = spu.X(parcel, i);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    strX26 = spu.X(parcel, i);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    strX27 = spu.X(parcel, i);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    bitmapTeleporter = (BitmapTeleporter) spu.T(parcel, i, BitmapTeleporter.CREATOR);
                    break;
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    strX28 = spu.X(parcel, i);
                    break;
                case '0':
                    fileTeleporterArr = (FileTeleporter[]) spu.ai(parcel, i, FileTeleporter.CREATOR);
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    strArrAj4 = spu.aj(parcel, i);
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    zAf3 = spu.af(parcel, i);
                    break;
                case '3':
                    strX29 = spu.X(parcel, i);
                    break;
                case '4':
                    themeSettings = (ThemeSettings) spu.T(parcel, i, ThemeSettings.CREATOR);
                    break;
                case '5':
                    logOptions = (LogOptions) spu.T(parcel, i, LogOptions.CREATOR);
                    break;
                case '6':
                    strX30 = spu.X(parcel, i);
                    break;
                case '7':
                    zAf4 = spu.af(parcel, i);
                    break;
                case '8':
                    bundleR2 = spu.R(parcel, i);
                    break;
                case '9':
                    arrayListAb = spu.ab(parcel, i, RectF.CREATOR);
                    break;
                case ':':
                    zAf5 = spu.af(parcel, i);
                    break;
                case ';':
                    bitmap = (Bitmap) spu.T(parcel, i, Bitmap.CREATOR);
                    break;
                case '<':
                    strX31 = spu.X(parcel, i);
                    break;
                case '=':
                    arrayListAa = spu.aa(parcel, i);
                    break;
                case '>':
                    iN10 = spu.N(parcel, i);
                    break;
                case '?':
                    iN11 = spu.N(parcel, i);
                    break;
                case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                    strArrAj5 = spu.aj(parcel, i);
                    break;
                case 'A':
                    strArrAj6 = spu.aj(parcel, i);
                    break;
                case 'B':
                    strArrAj7 = spu.aj(parcel, i);
                    break;
                case 'C':
                    zAf6 = spu.af(parcel, i);
                    break;
                case 'D':
                    zAf7 = spu.af(parcel, i);
                    break;
                case 'E':
                    strX32 = spu.X(parcel, i);
                    break;
                case 'F':
                    additionalConsentConfig = (AdditionalConsentConfig) spu.T(parcel, i, AdditionalConsentConfig.CREATOR);
                    break;
                case 'G':
                    serviceDumpArr = (ServiceDump[]) spu.ai(parcel, i, ServiceDump.CREATOR);
                    break;
                case 'H':
                    strX33 = spu.X(parcel, i);
                    break;
                default:
                    spu.ae(parcel, i);
                    break;
            }
        }
        spu.ac(parcel, iP);
        return new ErrorReport(applicationErrorReport, strX, iN, strX2, strX3, strX4, strX5, strX6, strX7, strX8, iN2, strX9, strX10, strX11, strX12, strX13, strArrAj, strArrAj2, strArrAj3, strX14, strX15, bArrAg, iN3, iN4, iN5, iN6, strX16, strX17, strX18, bundleR, zAf, iN7, iN8, zAf2, strX19, strX20, iN9, strX21, strX22, strX23, strX24, strX25, strX26, strX27, bitmapTeleporter, strX28, fileTeleporterArr, strArrAj4, zAf3, strX29, themeSettings, logOptions, strX30, zAf4, bundleR2, arrayListAb, zAf5, bitmap, strX31, arrayListAa, iN10, iN11, strArrAj5, strArrAj6, strArrAj7, zAf6, zAf7, strX32, additionalConsentConfig, serviceDumpArr, strX33);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iN = 0;
        int iN2 = 0;
        boolean zAf = false;
        ParcelFileDescriptor parcelFileDescriptor = null;
        Status status = null;
        String strX = null;
        String strX2 = null;
        String strX3 = null;
        String strX4 = null;
        String strX5 = null;
        switch (this.a) {
            case 0:
                int iP = spu.P(parcel);
                String strX6 = null;
                String strX7 = null;
                String strX8 = null;
                String strX9 = null;
                String strX10 = null;
                Bundle bundleR = null;
                while (parcel.dataPosition() < iP) {
                    int i = parcel.readInt();
                    switch ((char) i) {
                        case 2:
                            strX6 = spu.X(parcel, i);
                            break;
                        case 3:
                            strX7 = spu.X(parcel, i);
                            break;
                        case 4:
                            strX8 = spu.X(parcel, i);
                            break;
                        case 5:
                            strX9 = spu.X(parcel, i);
                            break;
                        case 6:
                            strX10 = spu.X(parcel, i);
                            break;
                        case 7:
                            bundleR = spu.R(parcel, i);
                            break;
                        default:
                            spu.ae(parcel, i);
                            break;
                    }
                }
                spu.ac(parcel, iP);
                return new AdditionalConsentConfig(strX6, strX7, strX8, strX9, strX10, bundleR);
            case 1:
                return a(parcel);
            case 2:
                int iP2 = spu.P(parcel);
                String strX11 = null;
                String strX12 = null;
                while (parcel.dataPosition() < iP2) {
                    int i2 = parcel.readInt();
                    char c = (char) i2;
                    if (c == 2) {
                        parcelFileDescriptor = (ParcelFileDescriptor) spu.T(parcel, i2, ParcelFileDescriptor.CREATOR);
                    } else if (c == 3) {
                        strX11 = spu.X(parcel, i2);
                    } else if (c != 4) {
                        spu.ae(parcel, i2);
                    } else {
                        strX12 = spu.X(parcel, i2);
                    }
                }
                spu.ac(parcel, iP2);
                return new FileTeleporter(parcelFileDescriptor, strX11, strX12);
            case 3:
                int iP3 = spu.P(parcel);
                boolean zAf2 = false;
                boolean zAf3 = false;
                boolean zAf4 = false;
                boolean zAf5 = false;
                boolean zAf6 = false;
                String strX13 = null;
                ServiceDumpRequest[] serviceDumpRequestArr = null;
                while (parcel.dataPosition() < iP3) {
                    int i3 = parcel.readInt();
                    switch ((char) i3) {
                        case 2:
                            strX13 = spu.X(parcel, i3);
                            break;
                        case 3:
                            zAf2 = spu.af(parcel, i3);
                            break;
                        case 4:
                            zAf3 = spu.af(parcel, i3);
                            break;
                        case 5:
                            zAf4 = spu.af(parcel, i3);
                            break;
                        case 6:
                            zAf5 = spu.af(parcel, i3);
                            break;
                        case 7:
                            serviceDumpRequestArr = (ServiceDumpRequest[]) spu.ai(parcel, i3, ServiceDumpRequest.CREATOR);
                            break;
                        case '\b':
                            zAf6 = spu.af(parcel, i3);
                            break;
                        default:
                            spu.ae(parcel, i3);
                            break;
                    }
                }
                spu.ac(parcel, iP3);
                return new LogOptions(strX13, zAf2, zAf3, zAf4, zAf5, serviceDumpRequestArr, zAf6);
            case 4:
                int iP4 = spu.P(parcel);
                int iN3 = 0;
                while (parcel.dataPosition() < iP4) {
                    int i4 = parcel.readInt();
                    char c2 = (char) i4;
                    if (c2 == 2) {
                        iN = spu.N(parcel, i4);
                    } else if (c2 != 3) {
                        spu.ae(parcel, i4);
                    } else {
                        iN3 = spu.N(parcel, i4);
                    }
                }
                spu.ac(parcel, iP4);
                return new ThemeSettings(iN, iN3);
            case 5:
                int iP5 = spu.P(parcel);
                int iN4 = 0;
                int iN5 = 0;
                Boolean boolValueOf = null;
                ArrayList arrayListAa = null;
                ArrayList arrayListZ = null;
                ArrayList arrayListAa2 = null;
                ArrayList arrayListZ2 = null;
                byte[][] bArrAk = null;
                while (parcel.dataPosition() < iP5) {
                    int i5 = parcel.readInt();
                    switch ((char) i5) {
                        case 2:
                            iN4 = spu.N(parcel, i5);
                            break;
                        case 3:
                            iN5 = spu.N(parcel, i5);
                            break;
                        case 4:
                            arrayListAa = spu.aa(parcel, i5);
                            break;
                        case 5:
                            arrayListZ = spu.Z(parcel, i5);
                            break;
                        case 6:
                            arrayListAa2 = spu.aa(parcel, i5);
                            break;
                        case 7:
                            arrayListZ2 = spu.Z(parcel, i5);
                            break;
                        case '\b':
                            bArrAk = spu.ak(parcel, i5);
                            break;
                        case '\t':
                            int iO = spu.O(parcel, i5);
                            if (iO != 0) {
                                spu.al(parcel, iO, 4);
                                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                                break;
                            } else {
                                boolValueOf = null;
                                break;
                            }
                        default:
                            spu.ae(parcel, i5);
                            break;
                    }
                }
                spu.ac(parcel, iP5);
                return new FRDProductSpecificDataEntry(iN4, iN5, arrayListAa, arrayListZ, arrayListAa2, arrayListZ2, bArrAk, boolValueOf.booleanValue());
            case 6:
                int iP6 = spu.P(parcel);
                int iN6 = 0;
                int iN7 = 0;
                GoogleHelp googleHelp = null;
                String strX14 = null;
                String strX15 = null;
                String strX16 = null;
                String strX17 = null;
                while (parcel.dataPosition() < iP6) {
                    int i6 = parcel.readInt();
                    switch ((char) i6) {
                        case 1:
                            googleHelp = (GoogleHelp) spu.T(parcel, i6, GoogleHelp.CREATOR);
                            break;
                        case 2:
                            strX14 = spu.X(parcel, i6);
                            break;
                        case 3:
                            strX15 = spu.X(parcel, i6);
                            break;
                        case 4:
                            iN6 = spu.N(parcel, i6);
                            break;
                        case 5:
                            strX16 = spu.X(parcel, i6);
                            break;
                        case 6:
                            iN7 = spu.N(parcel, i6);
                            break;
                        case 7:
                            strX17 = spu.X(parcel, i6);
                            break;
                        default:
                            spu.ae(parcel, i6);
                            break;
                    }
                }
                spu.ac(parcel, iP6);
                return new InProductHelp(googleHelp, strX14, strX15, iN6, strX16, iN7, strX17);
            case 7:
                int iP7 = spu.P(parcel);
                while (parcel.dataPosition() < iP7) {
                    int i7 = parcel.readInt();
                    char c3 = (char) i7;
                    if (c3 == 2) {
                        zAf = spu.af(parcel, i7);
                    } else if (c3 != 3) {
                        spu.ae(parcel, i7);
                    } else {
                        strX5 = spu.X(parcel, i7);
                    }
                }
                spu.ac(parcel, iP7);
                return new ND4CSettings(zAf, strX5);
            case 8:
                int iP8 = spu.P(parcel);
                String strX18 = null;
                String strX19 = null;
                String strX20 = null;
                while (parcel.dataPosition() < iP8) {
                    int i8 = parcel.readInt();
                    char c4 = (char) i8;
                    if (c4 == 2) {
                        strX4 = spu.X(parcel, i8);
                    } else if (c4 == 3) {
                        strX18 = spu.X(parcel, i8);
                    } else if (c4 == 4) {
                        strX20 = spu.X(parcel, i8);
                    } else if (c4 != 5) {
                        spu.ae(parcel, i8);
                    } else {
                        strX19 = spu.X(parcel, i8);
                    }
                }
                spu.ac(parcel, iP8);
                return new OfflineSuggestion(strX4, strX18, strX19, strX20);
            case 9:
                int iP9 = spu.P(parcel);
                Intent intent = null;
                while (parcel.dataPosition() < iP9) {
                    int i9 = parcel.readInt();
                    char c5 = (char) i9;
                    if (c5 == 2) {
                        iN2 = spu.N(parcel, i9);
                    } else if (c5 == 3) {
                        strX3 = spu.X(parcel, i9);
                    } else if (c5 != 4) {
                        spu.ae(parcel, i9);
                    } else {
                        intent = (Intent) spu.T(parcel, i9, Intent.CREATOR);
                    }
                }
                spu.ac(parcel, iP9);
                return new OverflowMenuItem(iN2, strX3, intent);
            case 10:
                int iP10 = spu.P(parcel);
                String strX21 = null;
                String strX22 = null;
                while (parcel.dataPosition() < iP10) {
                    int i10 = parcel.readInt();
                    char c6 = (char) i10;
                    if (c6 == 2) {
                        strX2 = spu.X(parcel, i10);
                    } else if (c6 == 3) {
                        strX21 = spu.X(parcel, i10);
                    } else if (c6 != 4) {
                        spu.ae(parcel, i10);
                    } else {
                        strX22 = spu.X(parcel, i10);
                    }
                }
                spu.ac(parcel, iP10);
                return new TogglingData(strX2, strX21, strX22);
            case 11:
                int iP11 = spu.P(parcel);
                String strX23 = "";
                long jQ = 0;
                while (parcel.dataPosition() < iP11) {
                    int i11 = parcel.readInt();
                    char c7 = (char) i11;
                    if (c7 == 1) {
                        strX = spu.X(parcel, i11);
                    } else if (c7 == 2) {
                        jQ = spu.Q(parcel, i11);
                    } else if (c7 != 3) {
                        spu.ae(parcel, i11);
                    } else {
                        strX23 = spu.X(parcel, i11);
                    }
                }
                spu.ac(parcel, iP11);
                return new TrailsInteraction(strX, jQ, strX23);
            case 12:
                int iP12 = spu.P(parcel);
                int iN8 = 0;
                String strX24 = null;
                String strX25 = null;
                String strX26 = null;
                ArrayList arrayListAb = null;
                ClientIdentity clientIdentity = null;
                while (parcel.dataPosition() < iP12) {
                    int i12 = parcel.readInt();
                    char c8 = (char) i12;
                    if (c8 == 1) {
                        iN8 = spu.N(parcel, i12);
                    } else if (c8 == 3) {
                        strX24 = spu.X(parcel, i12);
                    } else if (c8 == 4) {
                        strX25 = spu.X(parcel, i12);
                    } else if (c8 == 6) {
                        strX26 = spu.X(parcel, i12);
                    } else if (c8 == 7) {
                        clientIdentity = (ClientIdentity) spu.T(parcel, i12, ClientIdentity.CREATOR);
                    } else if (c8 != '\b') {
                        spu.ae(parcel, i12);
                    } else {
                        arrayListAb = spu.ab(parcel, i12, Feature.CREATOR);
                    }
                }
                spu.ac(parcel, iP12);
                strX24.getClass();
                return new ClientIdentity(iN8, strX24, strX25, strX26, arrayListAb, clientIdentity);
            case 13:
                int iP13 = spu.P(parcel);
                int iN9 = -1;
                while (parcel.dataPosition() < iP13) {
                    int i13 = parcel.readInt();
                    if (((char) i13) != 1) {
                        spu.ae(parcel, i13);
                    } else {
                        iN9 = spu.N(parcel, i13);
                    }
                }
                spu.ac(parcel, iP13);
                return new ThrottlingLimits(iN9);
            case 14:
                int iP14 = spu.P(parcel);
                WorkSource workSource = new WorkSource();
                int iN10 = 102;
                long jQ2 = Long.MAX_VALUE;
                long jQ3 = Long.MAX_VALUE;
                int iN11 = 0;
                boolean zAf7 = false;
                int iN12 = 0;
                ClientIdentity clientIdentity2 = null;
                while (parcel.dataPosition() < iP14) {
                    int i14 = parcel.readInt();
                    switch ((char) i14) {
                        case 1:
                            jQ2 = spu.Q(parcel, i14);
                            break;
                        case 2:
                            iN11 = spu.N(parcel, i14);
                            break;
                        case 3:
                            iN10 = spu.N(parcel, i14);
                            break;
                        case 4:
                            jQ3 = spu.Q(parcel, i14);
                            break;
                        case 5:
                            zAf7 = spu.af(parcel, i14);
                            break;
                        case 6:
                            workSource = (WorkSource) spu.T(parcel, i14, WorkSource.CREATOR);
                            break;
                        case 7:
                            iN12 = spu.N(parcel, i14);
                            break;
                        case '\b':
                        default:
                            spu.ae(parcel, i14);
                            break;
                        case '\t':
                            clientIdentity2 = (ClientIdentity) spu.T(parcel, i14, ClientIdentity.CREATOR);
                            break;
                    }
                }
                spu.ac(parcel, iP14);
                return new CurrentLocationRequest(jQ2, iN11, iN10, jQ3, zAf7, iN12, workSource, clientIdentity2);
            case 15:
                int iP15 = spu.P(parcel);
                long jQ4 = Long.MAX_VALUE;
                int iN13 = 0;
                boolean zAf8 = false;
                ClientIdentity clientIdentity3 = null;
                while (parcel.dataPosition() < iP15) {
                    int i15 = parcel.readInt();
                    char c9 = (char) i15;
                    if (c9 == 1) {
                        jQ4 = spu.Q(parcel, i15);
                    } else if (c9 == 2) {
                        iN13 = spu.N(parcel, i15);
                    } else if (c9 == 3) {
                        zAf8 = spu.af(parcel, i15);
                    } else if (c9 != 5) {
                        spu.ae(parcel, i15);
                    } else {
                        clientIdentity3 = (ClientIdentity) spu.T(parcel, i15, ClientIdentity.CREATOR);
                    }
                }
                spu.ac(parcel, iP15);
                return new LastLocationRequest(jQ4, iN13, zAf8, clientIdentity3);
            case 16:
                int iP16 = spu.P(parcel);
                int iN14 = 1000;
                while (parcel.dataPosition() < iP16) {
                    int i16 = parcel.readInt();
                    char c10 = (char) i16;
                    if (c10 == 4) {
                        iN14 = spu.N(parcel, i16);
                    } else if (c10 != 6) {
                        spu.ae(parcel, i16);
                    } else {
                        spu.af(parcel, i16);
                    }
                }
                spu.ac(parcel, iP16);
                return new LocationAvailability(iN14);
            case 17:
                int iP17 = spu.P(parcel);
                List listAb = LocationResult.a;
                while (parcel.dataPosition() < iP17) {
                    int i17 = parcel.readInt();
                    if (((char) i17) != 1) {
                        spu.ae(parcel, i17);
                    } else {
                        listAb = spu.ab(parcel, i17, Location.CREATOR);
                    }
                }
                spu.ac(parcel, iP17);
                return new LocationResult(listAb);
            case 18:
                int iP18 = spu.P(parcel);
                while (parcel.dataPosition() < iP18) {
                    int i18 = parcel.readInt();
                    if (((char) i18) != 1) {
                        spu.ae(parcel, i18);
                    } else {
                        status = (Status) spu.T(parcel, i18, Status.CREATOR);
                    }
                }
                spu.ac(parcel, iP18);
                return new FusedLocationProviderResult(status);
            case 19:
                int iP19 = spu.P(parcel);
                int iN15 = 0;
                IBinder iBinderS = null;
                IBinder iBinderS2 = null;
                PendingIntent pendingIntent = null;
                String strX27 = null;
                while (parcel.dataPosition() < iP19) {
                    int i19 = parcel.readInt();
                    char c11 = (char) i19;
                    if (c11 == 1) {
                        iN15 = spu.N(parcel, i19);
                    } else if (c11 == 2) {
                        iBinderS = spu.S(parcel, i19);
                    } else if (c11 == 3) {
                        iBinderS2 = spu.S(parcel, i19);
                    } else if (c11 == 4) {
                        pendingIntent = (PendingIntent) spu.T(parcel, i19, PendingIntent.CREATOR);
                    } else if (c11 != 6) {
                        spu.ae(parcel, i19);
                    } else {
                        strX27 = spu.X(parcel, i19);
                    }
                }
                spu.ac(parcel, iP19);
                return new LocationReceiver(iN15, iBinderS, iBinderS2, pendingIntent, strX27);
            default:
                int iP20 = spu.P(parcel);
                long jQ5 = Long.MAX_VALUE;
                boolean zAf9 = false;
                boolean zAf10 = false;
                boolean zAf11 = false;
                boolean zAf12 = false;
                LocationRequest locationRequest = null;
                ArrayList arrayListAb2 = null;
                while (parcel.dataPosition() < iP20) {
                    int i20 = parcel.readInt();
                    char c12 = (char) i20;
                    if (c12 == 1) {
                        locationRequest = (LocationRequest) spu.T(parcel, i20, LocationRequest.CREATOR);
                    } else if (c12 == 5) {
                        arrayListAb2 = spu.ab(parcel, i20, com.google.android.gms.common.internal.ClientIdentity.CREATOR);
                    } else if (c12 == '\b') {
                        zAf9 = spu.af(parcel, i20);
                    } else if (c12 != '\t') {
                        switch (c12) {
                            case 11:
                                zAf11 = spu.af(parcel, i20);
                                break;
                            case '\f':
                                zAf12 = spu.af(parcel, i20);
                                break;
                            case '\r':
                                spu.X(parcel, i20);
                                break;
                            case 14:
                                jQ5 = spu.Q(parcel, i20);
                                break;
                            default:
                                spu.ae(parcel, i20);
                                break;
                        }
                    } else {
                        zAf10 = spu.af(parcel, i20);
                    }
                }
                spu.ac(parcel, iP20);
                return new LocationRequestInternal(locationRequest, arrayListAb2, zAf9, zAf10, zAf11, zAf12, jQ5);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new AdditionalConsentConfig[i];
            case 1:
                return new ErrorReport[i];
            case 2:
                return new FileTeleporter[i];
            case 3:
                return new LogOptions[i];
            case 4:
                return new ThemeSettings[i];
            case 5:
                return new FRDProductSpecificDataEntry[i];
            case 6:
                return new InProductHelp[i];
            case 7:
                return new ND4CSettings[i];
            case 8:
                return new OfflineSuggestion[i];
            case 9:
                return new OverflowMenuItem[i];
            case 10:
                return new TogglingData[i];
            case 11:
                return new TrailsInteraction[i];
            case 12:
                return new ClientIdentity[i];
            case 13:
                return new ThrottlingLimits[i];
            case 14:
                return new CurrentLocationRequest[i];
            case 15:
                return new LastLocationRequest[i];
            case 16:
                return new LocationAvailability[i];
            case 17:
                return new LocationResult[i];
            case 18:
                return new FusedLocationProviderResult[i];
            case 19:
                return new LocationReceiver[i];
            default:
                return new LocationRequestInternal[i];
        }
    }
}
