package l7;

import Y2.B;
import a.AbstractC1304a;
import android.os.Parcel;
import f7.AbstractC2614a;
import k7.C3190a;
import k7.C3191b;

/* renamed from: l7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3397a extends AbstractC2614a {
    public static final e CREATOR = new e();

    /* renamed from: a, reason: collision with root package name */
    public final int f40012a;

    /* renamed from: b, reason: collision with root package name */
    public final int f40013b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f40014c;

    /* renamed from: d, reason: collision with root package name */
    public final int f40015d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f40016e;

    /* renamed from: f, reason: collision with root package name */
    public final String f40017f;

    /* renamed from: g, reason: collision with root package name */
    public final int f40018g;

    /* renamed from: h, reason: collision with root package name */
    public final Class f40019h;

    /* renamed from: i, reason: collision with root package name */
    public final String f40020i;

    /* renamed from: j, reason: collision with root package name */
    public h f40021j;
    public final C3190a k;

    public C3397a(int i5, int i10, boolean z2, int i11, boolean z10, String str, int i12, String str2, C3191b c3191b) {
        this.f40012a = i5;
        this.f40013b = i10;
        this.f40014c = z2;
        this.f40015d = i11;
        this.f40016e = z10;
        this.f40017f = str;
        this.f40018g = i12;
        if (str2 == null) {
            this.f40019h = null;
            this.f40020i = null;
        } else {
            this.f40019h = d.class;
            this.f40020i = str2;
        }
        if (c3191b == null) {
            this.k = null;
            return;
        }
        C3190a c3190a = c3191b.f39289b;
        if (c3190a == null) {
            throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
        }
        this.k = c3190a;
    }

    public static C3397a V(int i5, String str) {
        return new C3397a(7, true, 7, true, str, i5, null);
    }

    public final String toString() {
        B b5 = new B(this);
        b5.g(Integer.valueOf(this.f40012a), "versionCode");
        b5.g(Integer.valueOf(this.f40013b), "typeIn");
        b5.g(Boolean.valueOf(this.f40014c), "typeInArray");
        b5.g(Integer.valueOf(this.f40015d), "typeOut");
        b5.g(Boolean.valueOf(this.f40016e), "typeOutArray");
        b5.g(this.f40017f, "outputFieldName");
        b5.g(Integer.valueOf(this.f40018g), "safeParcelFieldId");
        String str = this.f40020i;
        if (str == null) {
            str = null;
        }
        b5.g(str, "concreteTypeName");
        Class cls = this.f40019h;
        if (cls != null) {
            b5.g(cls.getCanonicalName(), "concreteType.class");
        }
        C3190a c3190a = this.k;
        if (c3190a != null) {
            b5.g(c3190a.getClass().getCanonicalName(), "converterName");
        }
        return b5.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(this.f40012a);
        AbstractC1304a.k0(parcel, 2, 4);
        parcel.writeInt(this.f40013b);
        AbstractC1304a.k0(parcel, 3, 4);
        parcel.writeInt(this.f40014c ? 1 : 0);
        AbstractC1304a.k0(parcel, 4, 4);
        parcel.writeInt(this.f40015d);
        AbstractC1304a.k0(parcel, 5, 4);
        parcel.writeInt(this.f40016e ? 1 : 0);
        AbstractC1304a.a0(parcel, 6, this.f40017f, false);
        AbstractC1304a.k0(parcel, 7, 4);
        parcel.writeInt(this.f40018g);
        C3191b c3191b = null;
        String str = this.f40020i;
        if (str == null) {
            str = null;
        }
        AbstractC1304a.a0(parcel, 8, str, false);
        C3190a c3190a = this.k;
        if (c3190a != null) {
            if (!(c3190a instanceof C3190a)) {
                throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
            }
            c3191b = new C3191b(c3190a);
        }
        AbstractC1304a.Z(parcel, 9, c3191b, i5, false);
        AbstractC1304a.m0(iL0, parcel);
    }

    public C3397a(int i5, boolean z2, int i10, boolean z10, String str, int i11, Class cls) {
        this.f40012a = 1;
        this.f40013b = i5;
        this.f40014c = z2;
        this.f40015d = i10;
        this.f40016e = z10;
        this.f40017f = str;
        this.f40018g = i11;
        this.f40019h = cls;
        if (cls == null) {
            this.f40020i = null;
        } else {
            this.f40020i = cls.getCanonicalName();
        }
        this.k = null;
    }
}
