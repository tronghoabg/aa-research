package defpackage;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.feedback.AdditionalConsentConfig;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.FileTeleporter;
import com.google.android.gms.feedback.LogOptions;
import com.google.android.gms.feedback.ThemeSettings;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class sre implements Parcelable.Creator {
    public static void a(FeedbackOptions feedbackOptions, Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.F(parcel, 2, feedbackOptions.a);
        spu.u(parcel, 3, feedbackOptions.b);
        spu.F(parcel, 5, feedbackOptions.c);
        spu.E(parcel, 6, feedbackOptions.d, i);
        spu.F(parcel, 7, feedbackOptions.e);
        spu.E(parcel, 8, feedbackOptions.f, i);
        spu.F(parcel, 9, feedbackOptions.g);
        spu.J(parcel, 10, feedbackOptions.h);
        spu.n(parcel, 11, feedbackOptions.i);
        spu.E(parcel, 12, feedbackOptions.j, i);
        spu.E(parcel, 13, feedbackOptions.k, i);
        spu.n(parcel, 14, feedbackOptions.l);
        spu.E(parcel, 15, feedbackOptions.m, i);
        spu.F(parcel, 16, feedbackOptions.n);
        spu.n(parcel, 17, feedbackOptions.o);
        spu.s(parcel, 18, feedbackOptions.p);
        spu.n(parcel, 19, feedbackOptions.q);
        spu.F(parcel, 20, feedbackOptions.r);
        spu.E(parcel, 21, feedbackOptions.s, i);
        spu.F(parcel, 22, feedbackOptions.t);
        spu.m(parcel, iL);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iP = spu.P(parcel);
        String strX = null;
        Bundle bundleR = null;
        String strX2 = null;
        ApplicationErrorReport applicationErrorReport = null;
        String strX3 = null;
        BitmapTeleporter bitmapTeleporter = null;
        String strX4 = null;
        ArrayList arrayListAb = null;
        ThemeSettings themeSettings = null;
        LogOptions logOptions = null;
        Bitmap bitmap = null;
        String strX5 = null;
        String strX6 = null;
        AdditionalConsentConfig additionalConsentConfig = null;
        String strX7 = null;
        boolean zAf = false;
        boolean zAf2 = false;
        boolean zAf3 = false;
        boolean zAf4 = false;
        long jQ = 0;
        while (parcel.dataPosition() < iP) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    strX = spu.X(parcel, i);
                    break;
                case 3:
                    bundleR = spu.R(parcel, i);
                    break;
                case 4:
                default:
                    spu.ae(parcel, i);
                    break;
                case 5:
                    strX2 = spu.X(parcel, i);
                    break;
                case 6:
                    applicationErrorReport = (ApplicationErrorReport) spu.T(parcel, i, ApplicationErrorReport.CREATOR);
                    break;
                case 7:
                    strX3 = spu.X(parcel, i);
                    break;
                case '\b':
                    bitmapTeleporter = (BitmapTeleporter) spu.T(parcel, i, BitmapTeleporter.CREATOR);
                    break;
                case '\t':
                    strX4 = spu.X(parcel, i);
                    break;
                case '\n':
                    arrayListAb = spu.ab(parcel, i, FileTeleporter.CREATOR);
                    break;
                case 11:
                    zAf = spu.af(parcel, i);
                    break;
                case '\f':
                    themeSettings = (ThemeSettings) spu.T(parcel, i, ThemeSettings.CREATOR);
                    break;
                case '\r':
                    logOptions = (LogOptions) spu.T(parcel, i, LogOptions.CREATOR);
                    break;
                case 14:
                    zAf2 = spu.af(parcel, i);
                    break;
                case 15:
                    bitmap = (Bitmap) spu.T(parcel, i, Bitmap.CREATOR);
                    break;
                case 16:
                    strX5 = spu.X(parcel, i);
                    break;
                case 17:
                    zAf3 = spu.af(parcel, i);
                    break;
                case 18:
                    jQ = spu.Q(parcel, i);
                    break;
                case 19:
                    zAf4 = spu.af(parcel, i);
                    break;
                case 20:
                    strX6 = spu.X(parcel, i);
                    break;
                case 21:
                    additionalConsentConfig = (AdditionalConsentConfig) spu.T(parcel, i, AdditionalConsentConfig.CREATOR);
                    break;
                case 22:
                    strX7 = spu.X(parcel, i);
                    break;
            }
        }
        spu.ac(parcel, iP);
        return new FeedbackOptions(strX, bundleR, strX2, applicationErrorReport, strX3, bitmapTeleporter, strX4, arrayListAb, zAf, themeSettings, logOptions, zAf2, bitmap, strX5, zAf3, jQ, zAf4, strX6, additionalConsentConfig, strX7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new FeedbackOptions[i];
    }
}
