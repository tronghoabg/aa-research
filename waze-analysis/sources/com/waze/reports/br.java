package com.waze.reports;

import android.os.Parcel;
import android.os.Parcelable;
import com.waze.R;
import com.waze.jni.protos.OpeningHours;
import java.io.Serializable;
import java.util.Calendar;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class br implements Parcelable, Serializable {
    public static final Parcelable.Creator<br> CREATOR;

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f33717a;

    /* renamed from: e, reason: collision with root package name */
    private static final int f33718e;

    /* renamed from: f, reason: collision with root package name */
    private static String f33719f = null;

    /* renamed from: g, reason: collision with root package name */
    private static String f33720g = null;

    /* renamed from: h, reason: collision with root package name */
    private static String f33721h = null;

    /* renamed from: i, reason: collision with root package name */
    private static String f33722i = null;

    /* renamed from: j, reason: collision with root package name */
    private static String f33723j = null;

    /* renamed from: k, reason: collision with root package name */
    private static String f33724k = null;

    /* renamed from: l, reason: collision with root package name */
    private static String f33725l = null;
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    public int[] f33726b;

    /* renamed from: c, reason: collision with root package name */
    public String f33727c;

    /* renamed from: d, reason: collision with root package name */
    public String f33728d;

    static {
        f33717a = Calendar.getInstance().getFirstDayOfWeek() == 1;
        f33718e = 7;
        CREATOR = new bw(1);
        f33719f = null;
    }

    public br(OpeningHours openingHours) {
        int i2 = f33718e;
        this.f33726b = new int[i2];
        for (int i3 = 0; i3 < openingHours.getDaysCount() && i3 < i2; i3++) {
            this.f33726b[i3] = openingHours.getDays(i3);
        }
        this.f33727c = openingHours.getFrom();
        this.f33728d = openingHours.getTo();
    }

    private static final void d(StringBuilder sb, boolean z, String str, bq bqVar) {
        if (!z) {
            if (bqVar.f33713b) {
                sb.append(bqVar.f33716e);
            }
            bqVar.f33713b = false;
            bqVar.f33712a = false;
        } else if (!bqVar.f33712a) {
            if (!bqVar.f33714c) {
                sb.append(", ");
            }
            sb.append(str);
            bqVar.f33712a = true;
            bqVar.f33714c = false;
        } else if (!bqVar.f33713b) {
            sb.append(bqVar.f33715d);
            bqVar.f33713b = true;
        }
        bqVar.f33716e = str;
    }

    public final OpeningHours a() {
        OpeningHours.Builder builderNewBuilder = OpeningHours.newBuilder();
        builderNewBuilder.setFrom(this.f33727c);
        builderNewBuilder.setTo(this.f33728d);
        for (int i2 = 0; i2 < f33718e; i2++) {
            builderNewBuilder.addDays(this.f33726b[i2]);
        }
        return builderNewBuilder.build();
    }

    public final String b() {
        StringBuilder sb = new StringBuilder();
        com.waze.shared_infra.o.a aVarA = com.waze.shared_infra.o.b.a();
        bq bqVar = new bq(this);
        bqVar.f33715d = " " + aVarA.c(R.string.DAYS_TO, new Object[0]) + " ";
        if (f33719f == null) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(7, 1);
            f33719f = com.waze.shared_infra.i.h.w(aVarA, calendar.getTimeInMillis());
            calendar.set(7, 2);
            f33720g = com.waze.shared_infra.i.h.w(aVarA, calendar.getTimeInMillis());
            calendar.set(7, 3);
            f33721h = com.waze.shared_infra.i.h.w(aVarA, calendar.getTimeInMillis());
            calendar.set(7, 4);
            f33722i = com.waze.shared_infra.i.h.w(aVarA, calendar.getTimeInMillis());
            calendar.set(7, 5);
            f33723j = com.waze.shared_infra.i.h.w(aVarA, calendar.getTimeInMillis());
            calendar.set(7, 6);
            f33724k = com.waze.shared_infra.i.h.w(aVarA, calendar.getTimeInMillis());
            calendar.set(7, 7);
            f33725l = com.waze.shared_infra.i.h.w(aVarA, calendar.getTimeInMillis());
        }
        boolean z = f33717a;
        if (z) {
            d(sb, this.f33726b[0] != 0, f33719f, bqVar);
        }
        d(sb, this.f33726b[1] != 0, f33720g, bqVar);
        d(sb, this.f33726b[2] != 0, f33721h, bqVar);
        d(sb, this.f33726b[3] != 0, f33722i, bqVar);
        d(sb, this.f33726b[4] != 0, f33723j, bqVar);
        d(sb, this.f33726b[5] != 0, f33724k, bqVar);
        d(sb, this.f33726b[6] != 0, f33725l, bqVar);
        if (!z) {
            d(sb, this.f33726b[0] != 0, f33719f, bqVar);
        }
        d(sb, false, null, bqVar);
        return sb.toString();
    }

    public final String c() {
        String str;
        com.waze.shared_infra.o.a aVarA = com.waze.shared_infra.o.b.a();
        String str2 = this.f33727c;
        if ((str2 == null || str2.isEmpty()) && ((str = this.f33728d) == null || str.isEmpty())) {
            return aVarA.c(R.string.TWENTY_FOUR_HOURS, new Object[0]);
        }
        if (str2 == null || str2.isEmpty()) {
            this.f33727c = "0:00";
        }
        String str3 = this.f33728d;
        if (str3 == null || str3.isEmpty()) {
            this.f33728d = "24:00";
        }
        return this.f33727c.equals(this.f33728d) ? aVarA.c(R.string.TWENTY_FOUR_HOURS, new Object[0]) : String.format("%s - %s", this.f33727c, this.f33728d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeIntArray(this.f33726b);
        parcel.writeString(this.f33727c);
        parcel.writeString(this.f33728d);
    }

    public br(Parcel parcel) {
        int[] iArr = new int[f33718e];
        this.f33726b = iArr;
        parcel.readIntArray(iArr);
        this.f33727c = parcel.readString();
        this.f33728d = parcel.readString();
    }

    public br() {
        this.f33726b = new int[f33718e];
    }
}
