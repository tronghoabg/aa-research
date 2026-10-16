package com.google.android.apps.auto.components.calendar.model;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class CrossProfileCalendarStore_Bundler implements com.google.android.enterprise.connectedapps.internal.Bundler {
    public static final android.os.Parcelable.Creator<com.google.android.apps.auto.components.calendar.model.CrossProfileCalendarStore_Bundler> CREATOR = new defpackage.kid(0);

    public final java.lang.Object a(android.os.Bundle bundle, java.lang.String str, com.google.android.enterprise.connectedapps.internal.BundlerType bundlerType) {
        bundle.setClassLoader(com.google.android.enterprise.connectedapps.internal.Bundler.class.getClassLoader());
        java.lang.String str2 = bundlerType.a;
        if ("java.lang.Void".equals(str2)) {
            return null;
        }
        if ("com.google.android.apps.auto.components.calendar.model.CalendarEvent".equals(str2)) {
            return bundle.getParcelable(str);
        }
        if ("java.util.List".equals(str2)) {
            return bundle.getParcelable(str).a;
        }
        if ("java.time.LocalDate".equals(str2)) {
            return bundle.getSerializable(str);
        }
        if ("com.google.android.apps.auto.components.calendar.model.CalendarReminder".equals(str2)) {
            return bundle.getParcelable(str);
        }
        if ("java.lang.Long".equals(str2)) {
            return java.lang.Long.valueOf(bundle.getLong(str));
        }
        throw new java.lang.IllegalArgumentException(defpackage.a.bp(str2, "Type ", " cannot be read from Bundle"));
    }

    public final java.lang.Object b(android.os.Parcel parcel, com.google.android.enterprise.connectedapps.internal.BundlerType bundlerType) {
        java.lang.String str = bundlerType.a;
        if ("java.lang.Void".equals(str)) {
            return null;
        }
        if ("com.google.android.apps.auto.components.calendar.model.CalendarEvent".equals(str)) {
            return parcel.readParcelable(com.google.android.enterprise.connectedapps.internal.Bundler.class.getClassLoader());
        }
        if ("java.util.List".equals(str)) {
            return parcel.readParcelable(com.google.android.enterprise.connectedapps.internal.Bundler.class.getClassLoader()).a;
        }
        if ("java.time.LocalDate".equals(str)) {
            return parcel.readSerializable();
        }
        if ("com.google.android.apps.auto.components.calendar.model.CalendarReminder".equals(str)) {
            return parcel.readParcelable(com.google.android.enterprise.connectedapps.internal.Bundler.class.getClassLoader());
        }
        if ("java.lang.Long".equals(str)) {
            return java.lang.Long.valueOf(parcel.readLong());
        }
        throw new java.lang.IllegalArgumentException(defpackage.a.bp(str, "Type ", " cannot be read from Parcel"));
    }

    public final void c(android.os.Bundle bundle, java.lang.String str, java.lang.Object obj, com.google.android.enterprise.connectedapps.internal.BundlerType bundlerType) {
        java.lang.String str2 = bundlerType.a;
        if ("java.lang.Void".equals(str2)) {
            return;
        }
        if ("com.google.android.apps.auto.components.calendar.model.CalendarEvent".equals(str2)) {
            bundle.putParcelable(str, (com.google.android.apps.auto.components.calendar.model.CalendarEvent) obj);
            return;
        }
        if ("java.util.List".equals(str2)) {
            bundle.putParcelable(str, new com.google.android.enterprise.connectedapps.parcelablewrappers.ParcelableList(this, bundlerType, (java.util.List) obj));
            return;
        }
        if ("java.time.LocalDate".equals(str2)) {
            bundle.putSerializable(str, (j$.time.LocalDate) obj);
        } else if ("com.google.android.apps.auto.components.calendar.model.CalendarReminder".equals(str2)) {
            bundle.putParcelable(str, (com.google.android.apps.auto.components.calendar.model.CalendarReminder) obj);
        } else {
            if (!"java.lang.Long".equals(str2)) {
                throw new java.lang.IllegalArgumentException(defpackage.a.bp(str2, "Type ", " cannot be written to Bundle"));
            }
            bundle.putLong(str, ((java.lang.Long) obj).longValue());
        }
    }

    public final void d(android.os.Parcel parcel, java.lang.Object obj, com.google.android.enterprise.connectedapps.internal.BundlerType bundlerType, int i) {
        java.lang.String str = bundlerType.a;
        if ("java.lang.Void".equals(str)) {
            return;
        }
        if ("com.google.android.apps.auto.components.calendar.model.CalendarEvent".equals(str)) {
            parcel.writeParcelable((com.google.android.apps.auto.components.calendar.model.CalendarEvent) obj, i);
            return;
        }
        if ("java.util.List".equals(str)) {
            parcel.writeParcelable(new com.google.android.enterprise.connectedapps.parcelablewrappers.ParcelableList(this, bundlerType, (java.util.List) obj), i);
            return;
        }
        if ("java.time.LocalDate".equals(str)) {
            parcel.writeSerializable((j$.time.LocalDate) obj);
        } else if ("com.google.android.apps.auto.components.calendar.model.CalendarReminder".equals(str)) {
            parcel.writeParcelable((com.google.android.apps.auto.components.calendar.model.CalendarReminder) obj, i);
        } else {
            if (!"java.lang.Long".equals(str)) {
                throw new java.lang.IllegalArgumentException(defpackage.a.bp(str, "Type ", " cannot be written to Parcel"));
            }
            parcel.writeLong(((java.lang.Long) obj).longValue());
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
    }
}
