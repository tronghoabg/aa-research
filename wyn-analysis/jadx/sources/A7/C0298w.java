package A7;

import a.AbstractC1304a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;
import java.util.Iterator;
import org.apache.tika.mime.MimeTypesReaderMetKeys;

/* renamed from: A7.w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0298w extends AbstractC2614a implements Iterable {
    public static final Parcelable.Creator<C0298w> CREATOR = new A6.j(4);

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f1091a;

    public C0298w(Bundle bundle) {
        this.f1091a = bundle;
    }

    public final Double V() {
        return Double.valueOf(this.f1091a.getDouble(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR));
    }

    public final Bundle W() {
        return new Bundle(this.f1091a);
    }

    public final String X() {
        return this.f1091a.getString("currency");
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C0295v c0295v = new C0295v();
        c0295v.f1081b = this.f1091a.keySet().iterator();
        return c0295v;
    }

    public final String toString() {
        return this.f1091a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.S(parcel, 2, W(), false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
