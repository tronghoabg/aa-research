package g1;

import A7.AbstractC0279p0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: g1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2669e implements InterfaceC2670f {

    /* renamed from: c, reason: collision with root package name */
    public static final Locale[] f35498c = new Locale[0];

    /* renamed from: a, reason: collision with root package name */
    public final Locale[] f35499a;

    /* renamed from: b, reason: collision with root package name */
    public final String f35500b;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        String[] strArrSplit = "en-Latn".split("-", -1);
        if (strArrSplit.length > 2) {
            new Locale(strArrSplit[0], strArrSplit[1], strArrSplit[2]);
        } else if (strArrSplit.length > 1) {
            new Locale(strArrSplit[0], strArrSplit[1]);
        } else {
            if (strArrSplit.length != 1) {
                throw new IllegalArgumentException("Can not parse language tag: [en-Latn]");
            }
            new Locale(strArrSplit[0]);
        }
    }

    public C2669e(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f35499a = f35498c;
            this.f35500b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb2 = new StringBuilder();
        for (int i5 = 0; i5 < localeArr.length; i5++) {
            Locale locale = localeArr[i5];
            if (locale == null) {
                throw new NullPointerException(AbstractC0279p0.i(i5, "list[", "] is null"));
            }
            if (!hashSet.contains(locale)) {
                Locale locale2 = (Locale) locale.clone();
                arrayList.add(locale2);
                sb2.append(locale2.getLanguage());
                String country = locale2.getCountry();
                if (country != null && !country.isEmpty()) {
                    sb2.append('-');
                    sb2.append(locale2.getCountry());
                }
                if (i5 < localeArr.length - 1) {
                    sb2.append(',');
                }
                hashSet.add(locale2);
            }
        }
        this.f35499a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f35500b = sb2.toString();
    }

    @Override // g1.InterfaceC2670f
    public final String a() {
        return this.f35500b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2669e)) {
            return false;
        }
        Locale[] localeArr = ((C2669e) obj).f35499a;
        Locale[] localeArr2 = this.f35499a;
        if (localeArr2.length != localeArr.length) {
            return false;
        }
        for (int i5 = 0; i5 < localeArr2.length; i5++) {
            if (!localeArr2[i5].equals(localeArr[i5])) {
                return false;
            }
        }
        return true;
    }

    @Override // g1.InterfaceC2670f
    public final Locale get(int i5) {
        if (i5 < 0) {
            return null;
        }
        Locale[] localeArr = this.f35499a;
        if (i5 < localeArr.length) {
            return localeArr[i5];
        }
        return null;
    }

    @Override // g1.InterfaceC2670f
    public final Object getLocaleList() {
        return null;
    }

    public final int hashCode() {
        int iHashCode = 1;
        for (Locale locale : this.f35499a) {
            iHashCode = (iHashCode * 31) + locale.hashCode();
        }
        return iHashCode;
    }

    @Override // g1.InterfaceC2670f
    public final boolean isEmpty() {
        return this.f35499a.length == 0;
    }

    @Override // g1.InterfaceC2670f
    public final int size() {
        return this.f35499a.length;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        int i5 = 0;
        while (true) {
            Locale[] localeArr = this.f35499a;
            if (i5 >= localeArr.length) {
                sb2.append("]");
                return sb2.toString();
            }
            sb2.append(localeArr[i5]);
            if (i5 < localeArr.length - 1) {
                sb2.append(',');
            }
            i5++;
        }
    }
}
