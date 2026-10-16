package X0;

import android.app.Notification;
import android.os.Parcel;
import c.C1533a;
import c.InterfaceC1535c;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    public final String f15791a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15792b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15793c;

    /* renamed from: d, reason: collision with root package name */
    public final Notification f15794d;

    public J(String str, int i5, String str2, Notification notification) {
        this.f15791a = str;
        this.f15792b = i5;
        this.f15793c = str2;
        this.f15794d = notification;
    }

    public final void a(InterfaceC1535c interfaceC1535c) {
        String str = this.f15791a;
        int i5 = this.f15792b;
        String str2 = this.f15793c;
        C1533a c1533a = (C1533a) interfaceC1535c;
        c1533a.getClass();
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC1535c.f19486V8);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i5);
            parcelObtain.writeString(str2);
            Notification notification = this.f15794d;
            if (notification != null) {
                parcelObtain.writeInt(1);
                notification.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            c1533a.f19484a.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NotifyTask[packageName:");
        sb2.append(this.f15791a);
        sb2.append(", id:");
        sb2.append(this.f15792b);
        sb2.append(", tag:");
        return wg.b.c(sb2, this.f15793c, "]");
    }
}
