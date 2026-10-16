package N7;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.E;
import androidx.recyclerview.widget.f0;
import d8.C2399a;
import f8.A;
import q.Y0;
import q.m1;
import s1.AbstractC3989b;

/* loaded from: classes4.dex */
public final class c implements Parcelable.ClassLoaderCreator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8581a;

    public /* synthetic */ c(int i5) {
        this.f8581a = i5;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f8581a) {
            case 0:
                return new d(parcel, null);
            case 1:
                return new O7.b(parcel, null);
            case 2:
                return new V0.f(parcel, null);
            case 3:
                return new W7.a(parcel, null);
            case 4:
                return new E(parcel, null);
            case 5:
                return new f0(parcel, null);
            case 6:
                return new C2399a(parcel, null);
            case 7:
                return new A(parcel, null);
            case 8:
                return new Y0(parcel, null);
            case 9:
                return new m1(parcel, null);
            default:
                if (parcel.readParcelable(null) == null) {
                    return AbstractC3989b.f44825b;
                }
                throw new IllegalStateException("superState must be null");
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i5) {
        switch (this.f8581a) {
            case 0:
                return new d[i5];
            case 1:
                return new O7.b[i5];
            case 2:
                return new V0.f[i5];
            case 3:
                return new W7.a[i5];
            case 4:
                return new E[i5];
            case 5:
                return new f0[i5];
            case 6:
                return new C2399a[i5];
            case 7:
                return new A[i5];
            case 8:
                return new Y0[i5];
            case 9:
                return new m1[i5];
            default:
                return new AbstractC3989b[i5];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f8581a) {
            case 0:
                return new d(parcel, classLoader);
            case 1:
                return new O7.b(parcel, classLoader);
            case 2:
                return new V0.f(parcel, classLoader);
            case 3:
                return new W7.a(parcel, classLoader);
            case 4:
                return new E(parcel, classLoader);
            case 5:
                return new f0(parcel, classLoader);
            case 6:
                return new C2399a(parcel, classLoader);
            case 7:
                return new A(parcel, classLoader);
            case 8:
                return new Y0(parcel, classLoader);
            case 9:
                return new m1(parcel, classLoader);
            default:
                if (parcel.readParcelable(classLoader) == null) {
                    return AbstractC3989b.f44825b;
                }
                throw new IllegalStateException("superState must be null");
        }
    }
}
