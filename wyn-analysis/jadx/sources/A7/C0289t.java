package A7;

import com.google.android.gms.common.internal.AbstractC1732v;

/* renamed from: A7.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0289t {

    /* renamed from: a, reason: collision with root package name */
    public final String f1051a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1052b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1053c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1054d;

    /* renamed from: e, reason: collision with root package name */
    public final long f1055e;

    /* renamed from: f, reason: collision with root package name */
    public final long f1056f;

    /* renamed from: g, reason: collision with root package name */
    public final long f1057g;

    /* renamed from: h, reason: collision with root package name */
    public final Long f1058h;

    /* renamed from: i, reason: collision with root package name */
    public final Long f1059i;

    /* renamed from: j, reason: collision with root package name */
    public final Long f1060j;
    public final Boolean k;

    public C0289t(String str, String str2, long j8) {
        this(str, str2, 0L, 0L, 0L, j8, 0L, null, null, null, null);
    }

    public final C0289t a(long j8) {
        return new C0289t(this.f1051a, this.f1052b, this.f1053c, this.f1054d, this.f1055e, j8, this.f1057g, this.f1058h, this.f1059i, this.f1060j, this.k);
    }

    public final C0289t b(Boolean bool, Long l10, Long l11) {
        return new C0289t(this.f1051a, this.f1052b, this.f1053c, this.f1054d, this.f1055e, this.f1056f, this.f1057g, this.f1058h, l10, l11, (bool == null || bool.booleanValue()) ? bool : null);
    }

    public C0289t(String str, String str2, long j8, long j10, long j11, long j12, long j13, Long l10, Long l11, Long l12, Boolean bool) {
        AbstractC1732v.f(str);
        AbstractC1732v.f(str2);
        AbstractC1732v.b(j8 >= 0);
        AbstractC1732v.b(j10 >= 0);
        AbstractC1732v.b(j11 >= 0);
        AbstractC1732v.b(j13 >= 0);
        this.f1051a = str;
        this.f1052b = str2;
        this.f1053c = j8;
        this.f1054d = j10;
        this.f1055e = j11;
        this.f1056f = j12;
        this.f1057g = j13;
        this.f1058h = l10;
        this.f1059i = l11;
        this.f1060j = l12;
        this.k = bool;
    }
}
