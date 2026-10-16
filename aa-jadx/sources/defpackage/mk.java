package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mk implements android.os.Parcelable.ClassLoaderCreator {
    private final /* synthetic */ int a;

    public mk(int i) {
        this.a = i;
    }

    public static final androidx.compose.ui.platform.ParcelableMapHolder a(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = androidx.compose.ui.platform.ParcelableMapHolder.class.getClassLoader();
        }
        int i = parcel.readInt();
        defpackage.aau aauVar = new defpackage.aau(i);
        for (int i2 = 0; i2 < i; i2++) {
            java.lang.String string = parcel.readString();
            if (string != null) {
                java.lang.Object value = parcel.readValue(classLoader);
                value.getClass();
                aauVar.m(string, (java.util.List) value);
            }
        }
        return new androidx.compose.ui.platform.ParcelableMapHolder(aauVar.b());
    }

    public static final androidx.customview.view.AbsSavedState b(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        if (parcel.readParcelable(classLoader) == null) {
            return androidx.customview.view.AbsSavedState.c;
        }
        throw new java.lang.IllegalStateException("superState must be null");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        switch (this.a) {
            case 0:
                return new android.support.v7.widget.RecyclerView.SavedState(parcel, null);
            case 1:
                return new android.support.v4.app.Fragment.SavedState(parcel, null);
            case 2:
                return new android.support.v7.widget.Toolbar.SavedState(parcel, null);
            case 3:
                return a(parcel, null);
            case 4:
                return new androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState(parcel, null);
            case 5:
                return b(parcel, null);
            case 6:
                return new androidx.drawerlayout.widget.DrawerLayout.SavedState(parcel, null);
            case 7:
                return new androidx.viewpager.widget.ViewPager.SavedState(parcel, null);
            case 8:
                return new com.google.android.apps.auto.components.notifications.listener.ParceledNotificationList(parcel, null);
            case 9:
                return new com.google.android.material.search.SearchBar.SavedState(parcel, null);
            default:
                return new com.google.android.material.search.SearchView.SavedState(parcel, null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new android.support.v7.widget.RecyclerView.SavedState[i];
            case 1:
                return new android.support.v4.app.Fragment.SavedState[i];
            case 2:
                return new android.support.v7.widget.Toolbar.SavedState[i];
            case 3:
                return new androidx.compose.ui.platform.ParcelableMapHolder[i];
            case 4:
                return new androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState[i];
            case 5:
                return new androidx.customview.view.AbsSavedState[i];
            case 6:
                return new androidx.drawerlayout.widget.DrawerLayout.SavedState[i];
            case 7:
                return new androidx.viewpager.widget.ViewPager.SavedState[i];
            case 8:
                return new com.google.android.apps.auto.components.notifications.listener.ParceledNotificationList[i];
            case 9:
                return new com.google.android.material.search.SearchBar.SavedState[i];
            default:
                return new com.google.android.material.search.SearchView.SavedState[i];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                return new android.support.v7.widget.RecyclerView.SavedState(parcel, classLoader);
            case 1:
                return new android.support.v4.app.Fragment.SavedState(parcel, classLoader);
            case 2:
                return new android.support.v7.widget.Toolbar.SavedState(parcel, classLoader);
            case 3:
                return a(parcel, classLoader);
            case 4:
                return new androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState(parcel, classLoader);
            case 5:
                return b(parcel, classLoader);
            case 6:
                return new androidx.drawerlayout.widget.DrawerLayout.SavedState(parcel, classLoader);
            case 7:
                return new androidx.viewpager.widget.ViewPager.SavedState(parcel, classLoader);
            case 8:
                return new com.google.android.apps.auto.components.notifications.listener.ParceledNotificationList(parcel, classLoader);
            case 9:
                return new com.google.android.material.search.SearchBar.SavedState(parcel, classLoader);
            default:
                return new com.google.android.material.search.SearchView.SavedState(parcel, classLoader);
        }
    }
}
