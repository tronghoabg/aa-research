package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;
import com.google.android.apps.auto.components.notifications.listener.ParceledNotificationList;
import com.google.android.material.search.SearchBar;
import com.google.android.material.search.SearchView;

/* loaded from: classes2.dex */
public final class mh implements Parcelable.ClassLoaderCreator {
    private final /* synthetic */ int a;

    public mh(int i) {
        this.a = i;
    }

    public static final AbsSavedState a(Parcel parcel, ClassLoader classLoader) {
        if (parcel.readParcelable(classLoader) == null) {
            return AbsSavedState.c;
        }
        throw new IllegalStateException("superState must be null");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new RecyclerView.SavedState(parcel, null);
            case 1:
                return new Fragment.SavedState(parcel, null);
            case 2:
                return new Toolbar.SavedState(parcel, null);
            case 3:
                return new CoordinatorLayout.SavedState(parcel, null);
            case 4:
                return a(parcel, null);
            case 5:
                return new DrawerLayout.SavedState(parcel, null);
            case 6:
                return new ViewPager.SavedState(parcel, null);
            case 7:
                return new ParceledNotificationList(parcel, null);
            case 8:
                return new SearchBar.SavedState(parcel, null);
            default:
                return new SearchView.SavedState(parcel, null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new RecyclerView.SavedState[i];
            case 1:
                return new Fragment.SavedState[i];
            case 2:
                return new Toolbar.SavedState[i];
            case 3:
                return new CoordinatorLayout.SavedState[i];
            case 4:
                return new AbsSavedState[i];
            case 5:
                return new DrawerLayout.SavedState[i];
            case 6:
                return new ViewPager.SavedState[i];
            case 7:
                return new ParceledNotificationList[i];
            case 8:
                return new SearchBar.SavedState[i];
            default:
                return new SearchView.SavedState[i];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                return new RecyclerView.SavedState(parcel, classLoader);
            case 1:
                return new Fragment.SavedState(parcel, classLoader);
            case 2:
                return new Toolbar.SavedState(parcel, classLoader);
            case 3:
                return new CoordinatorLayout.SavedState(parcel, classLoader);
            case 4:
                return a(parcel, classLoader);
            case 5:
                return new DrawerLayout.SavedState(parcel, classLoader);
            case 6:
                return new ViewPager.SavedState(parcel, classLoader);
            case 7:
                return new ParceledNotificationList(parcel, classLoader);
            case 8:
                return new SearchBar.SavedState(parcel, classLoader);
            default:
                return new SearchView.SavedState(parcel, classLoader);
        }
    }
}
