package com.google.android.apps.auto.components.calendar.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import com.google.android.enterprise.connectedapps.parcelablewrappers.ParcelableList;
import defpackage.a;
import defpackage.khy;
import j$.time.LocalDate;
import java.util.List;

/* loaded from: classes.dex */
public final class CrossProfileCalendarStore_Bundler implements Bundler {
    public static final Parcelable.Creator<CrossProfileCalendarStore_Bundler> CREATOR = new khy(0);

    @Override // com.google.android.enterprise.connectedapps.internal.Bundler
    public final Object a(Bundle bundle, String str, BundlerType bundlerType) {
        bundle.setClassLoader(Bundler.class.getClassLoader());
        String str2 = bundlerType.a;
        if ("java.lang.Void".equals(str2)) {
            return null;
        }
        if ("com.google.android.apps.auto.components.calendar.model.CalendarEvent".equals(str2)) {
            return (CalendarEvent) bundle.getParcelable(str);
        }
        if ("java.util.List".equals(str2)) {
            return ((ParcelableList) bundle.getParcelable(str)).a;
        }
        if ("java.time.LocalDate".equals(str2)) {
            return (LocalDate) bundle.getSerializable(str);
        }
        if ("com.google.android.apps.auto.components.calendar.model.CalendarReminder".equals(str2)) {
            return (CalendarReminder) bundle.getParcelable(str);
        }
        if ("java.lang.Long".equals(str2)) {
            return Long.valueOf(bundle.getLong(str));
        }
        throw new IllegalArgumentException(a.bq(str2, "Type ", " cannot be read from Bundle"));
    }

    @Override // com.google.android.enterprise.connectedapps.internal.Bundler
    public final Object b(Parcel parcel, BundlerType bundlerType) {
        String str = bundlerType.a;
        if ("java.lang.Void".equals(str)) {
            return null;
        }
        if ("com.google.android.apps.auto.components.calendar.model.CalendarEvent".equals(str)) {
            return (CalendarEvent) parcel.readParcelable(Bundler.class.getClassLoader());
        }
        if ("java.util.List".equals(str)) {
            return ((ParcelableList) parcel.readParcelable(Bundler.class.getClassLoader())).a;
        }
        if ("java.time.LocalDate".equals(str)) {
            return (LocalDate) parcel.readSerializable();
        }
        if ("com.google.android.apps.auto.components.calendar.model.CalendarReminder".equals(str)) {
            return (CalendarReminder) parcel.readParcelable(Bundler.class.getClassLoader());
        }
        if ("java.lang.Long".equals(str)) {
            return Long.valueOf(parcel.readLong());
        }
        throw new IllegalArgumentException(a.bq(str, "Type ", " cannot be read from Parcel"));
    }

    @Override // com.google.android.enterprise.connectedapps.internal.Bundler
    public final void c(Bundle bundle, String str, Object obj, BundlerType bundlerType) {
        String str2 = bundlerType.a;
        if ("java.lang.Void".equals(str2)) {
            return;
        }
        if ("com.google.android.apps.auto.components.calendar.model.CalendarEvent".equals(str2)) {
            bundle.putParcelable(str, (CalendarEvent) obj);
            return;
        }
        if ("java.util.List".equals(str2)) {
            bundle.putParcelable(str, new ParcelableList(this, bundlerType, (List) obj));
            return;
        }
        if ("java.time.LocalDate".equals(str2)) {
            bundle.putSerializable(str, (LocalDate) obj);
        } else if ("com.google.android.apps.auto.components.calendar.model.CalendarReminder".equals(str2)) {
            bundle.putParcelable(str, (CalendarReminder) obj);
        } else {
            if (!"java.lang.Long".equals(str2)) {
                throw new IllegalArgumentException(a.bq(str2, "Type ", " cannot be written to Bundle"));
            }
            bundle.putLong(str, ((Long) obj).longValue());
        }
    }

    @Override // com.google.android.enterprise.connectedapps.internal.Bundler
    public final void d(Parcel parcel, Object obj, BundlerType bundlerType, int i) {
        String str = bundlerType.a;
        if ("java.lang.Void".equals(str)) {
            return;
        }
        if ("com.google.android.apps.auto.components.calendar.model.CalendarEvent".equals(str)) {
            parcel.writeParcelable((CalendarEvent) obj, i);
            return;
        }
        if ("java.util.List".equals(str)) {
            parcel.writeParcelable(new ParcelableList(this, bundlerType, (List) obj), i);
            return;
        }
        if ("java.time.LocalDate".equals(str)) {
            parcel.writeSerializable((LocalDate) obj);
        } else if ("com.google.android.apps.auto.components.calendar.model.CalendarReminder".equals(str)) {
            parcel.writeParcelable((CalendarReminder) obj, i);
        } else {
            if (!"java.lang.Long".equals(str)) {
                throw new IllegalArgumentException(a.bq(str, "Type ", " cannot be written to Parcel"));
            }
            parcel.writeLong(((Long) obj).longValue());
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
    }
}
