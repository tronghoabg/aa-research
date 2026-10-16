package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.FRDProductSpecificDataEntry;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.ND4CSettings;
import com.google.android.gms.googlehelp.OfflineSuggestion;
import com.google.android.gms.googlehelp.internal.common.OverflowMenuItem;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import com.google.android.gms.googlehelp.trails.TrailsInteraction;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class srq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iP = spu.P(parcel);
        String strX = null;
        Account account = null;
        Bundle bundleR = null;
        String strX2 = null;
        String strX3 = null;
        Bitmap bitmap = null;
        ArrayList arrayListAa = null;
        Bundle bundleR2 = null;
        Bitmap bitmap2 = null;
        byte[] bArrAg = null;
        String strX4 = null;
        Uri uri = null;
        ArrayList arrayListAb = null;
        ThemeSettings themeSettings = null;
        ArrayList arrayListAb2 = null;
        ErrorReport errorReport = null;
        TogglingData togglingData = null;
        PendingIntent pendingIntent = null;
        String strX5 = null;
        String strX6 = null;
        ND4CSettings nD4CSettings = null;
        ArrayList arrayListAb3 = null;
        String strX7 = null;
        ArrayList arrayListAb4 = null;
        String strX8 = null;
        Intent intent = null;
        ArrayList arrayListAa2 = null;
        int iN = 0;
        boolean zAf = false;
        boolean zAf2 = false;
        int iN2 = 0;
        int iN3 = 0;
        int iN4 = 0;
        boolean zAf3 = false;
        int iN5 = 0;
        int iN6 = 0;
        boolean zAf4 = false;
        boolean zAf5 = false;
        int iN7 = 0;
        boolean zAf6 = false;
        boolean zAf7 = false;
        boolean zAf8 = false;
        int iN8 = 0;
        int iN9 = 0;
        while (parcel.dataPosition() < iP) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iN = spu.N(parcel, i);
                    break;
                case 2:
                    strX = spu.X(parcel, i);
                    break;
                case 3:
                    account = (Account) spu.T(parcel, i, Account.CREATOR);
                    break;
                case 4:
                    bundleR = spu.R(parcel, i);
                    break;
                case 5:
                    zAf = spu.af(parcel, i);
                    break;
                case 6:
                    zAf2 = spu.af(parcel, i);
                    break;
                case 7:
                    arrayListAa = spu.aa(parcel, i);
                    break;
                case '\b':
                case '\t':
                case '\f':
                case '\r':
                case 24:
                case 26:
                case 27:
                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                case 30:
                default:
                    spu.ae(parcel, i);
                    break;
                case '\n':
                    bundleR2 = spu.R(parcel, i);
                    break;
                case 11:
                    bitmap2 = (Bitmap) spu.T(parcel, i, Bitmap.CREATOR);
                    break;
                case 14:
                    strX4 = spu.X(parcel, i);
                    break;
                case 15:
                    uri = (Uri) spu.T(parcel, i, Uri.CREATOR);
                    break;
                case 16:
                    arrayListAb = spu.ab(parcel, i, OverflowMenuItem.CREATOR);
                    break;
                case 17:
                    iN4 = spu.N(parcel, i);
                    break;
                case 18:
                    arrayListAb2 = spu.ab(parcel, i, OfflineSuggestion.CREATOR);
                    break;
                case 19:
                    bArrAg = spu.ag(parcel, i);
                    break;
                case 20:
                    iN2 = spu.N(parcel, i);
                    break;
                case 21:
                    iN3 = spu.N(parcel, i);
                    break;
                case 22:
                    zAf3 = spu.af(parcel, i);
                    break;
                case 23:
                    errorReport = (ErrorReport) spu.T(parcel, i, ErrorReport.CREATOR);
                    break;
                case 25:
                    themeSettings = (ThemeSettings) spu.T(parcel, i, ThemeSettings.CREATOR);
                    break;
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    strX2 = spu.X(parcel, i);
                    break;
                case 31:
                    togglingData = (TogglingData) spu.T(parcel, i, TogglingData.CREATOR);
                    break;
                case ' ':
                    iN5 = spu.N(parcel, i);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                    pendingIntent = (PendingIntent) spu.T(parcel, i, PendingIntent.CREATOR);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                    strX3 = spu.X(parcel, i);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                    bitmap = (Bitmap) spu.T(parcel, i, Bitmap.CREATOR);
                    break;
                case Maneuver.TYPE_STRAIGHT /* 36 */:
                    iN6 = spu.N(parcel, i);
                    break;
                case '%':
                    zAf4 = spu.af(parcel, i);
                    break;
                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                    zAf5 = spu.af(parcel, i);
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    iN7 = spu.N(parcel, i);
                    break;
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    strX5 = spu.X(parcel, i);
                    break;
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    zAf6 = spu.af(parcel, i);
                    break;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    strX6 = spu.X(parcel, i);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    zAf7 = spu.af(parcel, i);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    nD4CSettings = (ND4CSettings) spu.T(parcel, i, ND4CSettings.CREATOR);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    zAf8 = spu.af(parcel, i);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    arrayListAb3 = spu.ab(parcel, i, FRDProductSpecificDataEntry.CREATOR);
                    break;
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    strX7 = spu.X(parcel, i);
                    break;
                case '0':
                    iN8 = spu.N(parcel, i);
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    iN9 = spu.N(parcel, i);
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    arrayListAb4 = spu.ab(parcel, i, TrailsInteraction.CREATOR);
                    break;
                case '3':
                    strX8 = spu.X(parcel, i);
                    break;
                case '4':
                    intent = (Intent) spu.T(parcel, i, Intent.CREATOR);
                    break;
                case '5':
                    arrayListAa2 = spu.aa(parcel, i);
                    break;
            }
        }
        spu.ac(parcel, iP);
        return new GoogleHelp(iN, strX, account, bundleR, strX2, strX3, bitmap, zAf, zAf2, arrayListAa, bundleR2, bitmap2, bArrAg, iN2, iN3, strX4, uri, arrayListAb, iN4, themeSettings, arrayListAb2, zAf3, errorReport, togglingData, iN5, pendingIntent, iN6, zAf4, zAf5, iN7, strX5, zAf6, strX6, zAf7, nD4CSettings, zAf8, arrayListAb3, strX7, iN8, iN9, arrayListAb4, strX8, intent, arrayListAa2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleHelp[i];
    }
}
