package d0;

import A.AbstractC0213f;
import Fe.g;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final float f33941a;

    /* renamed from: b, reason: collision with root package name */
    public final float f33942b;

    /* renamed from: c, reason: collision with root package name */
    public final float f33943c;

    /* renamed from: d, reason: collision with root package name */
    public final float f33944d;

    /* renamed from: e, reason: collision with root package name */
    public final long f33945e;

    /* renamed from: f, reason: collision with root package name */
    public final long f33946f;

    /* renamed from: g, reason: collision with root package name */
    public final long f33947g;

    /* renamed from: h, reason: collision with root package name */
    public final long f33948h;

    static {
        long j8 = AbstractC2382a.f33925a;
        g.a(AbstractC2382a.b(j8), AbstractC2382a.c(j8));
    }

    public e(float f10, float f11, float f12, float f13, long j8, long j10, long j11, long j12) {
        this.f33941a = f10;
        this.f33942b = f11;
        this.f33943c = f12;
        this.f33944d = f13;
        this.f33945e = j8;
        this.f33946f = j10;
        this.f33947g = j11;
        this.f33948h = j12;
    }

    public final float a() {
        return this.f33944d - this.f33942b;
    }

    public final float b() {
        return this.f33943c - this.f33941a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.valueOf(this.f33941a).equals(Float.valueOf(eVar.f33941a)) && Float.valueOf(this.f33942b).equals(Float.valueOf(eVar.f33942b)) && Float.valueOf(this.f33943c).equals(Float.valueOf(eVar.f33943c)) && Float.valueOf(this.f33944d).equals(Float.valueOf(eVar.f33944d)) && AbstractC2382a.a(this.f33945e, eVar.f33945e) && AbstractC2382a.a(this.f33946f, eVar.f33946f) && AbstractC2382a.a(this.f33947g, eVar.f33947g) && AbstractC2382a.a(this.f33948h, eVar.f33948h);
    }

    public final int hashCode() {
        int iC = AbstractC0213f.c(this.f33944d, AbstractC0213f.c(this.f33943c, AbstractC0213f.c(this.f33942b, Float.floatToIntBits(this.f33941a) * 31, 31), 31), 31);
        long j8 = this.f33945e;
        long j10 = this.f33946f;
        int i5 = (((int) (j10 ^ (j10 >>> 32))) + ((((int) (j8 ^ (j8 >>> 32))) + iC) * 31)) * 31;
        long j11 = this.f33947g;
        int i10 = (((int) (j11 ^ (j11 >>> 32))) + i5) * 31;
        long j12 = this.f33948h;
        return ((int) (j12 ^ (j12 >>> 32))) + i10;
    }

    public final String toString() {
        String str = S3.f.O(this.f33941a) + ", " + S3.f.O(this.f33942b) + ", " + S3.f.O(this.f33943c) + ", " + S3.f.O(this.f33944d);
        long j8 = this.f33945e;
        long j10 = this.f33946f;
        boolean zA = AbstractC2382a.a(j8, j10);
        long j11 = this.f33947g;
        long j12 = this.f33948h;
        if (!zA || !AbstractC2382a.a(j10, j11) || !AbstractC2382a.a(j11, j12)) {
            StringBuilder sbW = com.google.android.gms.internal.consent_sdk.a.w("RoundRect(rect=", str, ", topLeft=");
            sbW.append((Object) AbstractC2382a.d(j8));
            sbW.append(", topRight=");
            sbW.append((Object) AbstractC2382a.d(j10));
            sbW.append(", bottomRight=");
            sbW.append((Object) AbstractC2382a.d(j11));
            sbW.append(", bottomLeft=");
            sbW.append((Object) AbstractC2382a.d(j12));
            sbW.append(')');
            return sbW.toString();
        }
        if (AbstractC2382a.b(j8) == AbstractC2382a.c(j8)) {
            StringBuilder sbW2 = com.google.android.gms.internal.consent_sdk.a.w("RoundRect(rect=", str, ", radius=");
            sbW2.append(S3.f.O(AbstractC2382a.b(j8)));
            sbW2.append(')');
            return sbW2.toString();
        }
        StringBuilder sbW3 = com.google.android.gms.internal.consent_sdk.a.w("RoundRect(rect=", str, ", x=");
        sbW3.append(S3.f.O(AbstractC2382a.b(j8)));
        sbW3.append(", y=");
        sbW3.append(S3.f.O(AbstractC2382a.c(j8)));
        sbW3.append(')');
        return sbW3.toString();
    }
}
