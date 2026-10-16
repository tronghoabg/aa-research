package ad;

import com.google.android.gms.ads.initialization.AdapterStatus;

/* renamed from: ad.z, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1380z {

    /* renamed from: a, reason: collision with root package name */
    public final EnumC1379y f17620a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17621b;

    /* renamed from: c, reason: collision with root package name */
    public final Number f17622c;

    public C1380z(EnumC1379y enumC1379y, String str, Number number) {
        this.f17620a = enumC1379y;
        this.f17621b = str;
        this.f17622c = number;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1380z)) {
            return false;
        }
        C1380z c1380z = (C1380z) obj;
        if (this.f17620a == c1380z.f17620a && this.f17621b.equals(c1380z.f17621b)) {
            return this.f17622c.equals(c1380z.f17622c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17622c.hashCode() + N0.a.c(this.f17620a.hashCode() * 31, 31, this.f17621b);
    }

    public C1380z(AdapterStatus adapterStatus) {
        int i5 = AbstractC1378x.f17616a[adapterStatus.getInitializationState().ordinal()];
        if (i5 == 1) {
            this.f17620a = EnumC1379y.f17617a;
        } else if (i5 == 2) {
            this.f17620a = EnumC1379y.f17618b;
        } else {
            throw new IllegalArgumentException("Unable to handle state: " + adapterStatus.getInitializationState());
        }
        this.f17621b = adapterStatus.getDescription();
        this.f17622c = Integer.valueOf(adapterStatus.getLatency());
    }
}
