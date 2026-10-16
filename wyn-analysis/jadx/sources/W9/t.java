package W9;

import a.AbstractC1304a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;
import java.util.Map;
import x.C4412e;

/* loaded from: classes4.dex */
public final class t extends AbstractC2614a {
    public static final Parcelable.Creator<t> CREATOR = new T6.f(8);

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f15385a;

    /* renamed from: b, reason: collision with root package name */
    public C4412e f15386b;

    /* renamed from: c, reason: collision with root package name */
    public s f15387c;

    public t(Bundle bundle) {
        this.f15385a = bundle;
    }

    public final Map V() {
        if (this.f15386b == null) {
            C4412e c4412e = new C4412e(0);
            Bundle bundle = this.f15385a;
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        c4412e.put(str, str2);
                    }
                }
            }
            this.f15386b = c4412e;
        }
        return this.f15386b;
    }

    public final String W() {
        Bundle bundle = this.f15385a;
        String string = bundle.getString("google.message_id");
        return string == null ? bundle.getString("message_id") : string;
    }

    public final s X() {
        if (this.f15387c == null) {
            Bundle bundle = this.f15385a;
            if (p.l(bundle)) {
                this.f15387c = new s(new p(bundle));
            }
        }
        return this.f15387c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.S(parcel, 2, this.f15385a, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
