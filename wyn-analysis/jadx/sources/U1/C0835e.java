package U1;

import N1.C0765n;
import android.text.TextUtils;

/* renamed from: U1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0835e {

    /* renamed from: a, reason: collision with root package name */
    public final String f12046a;

    /* renamed from: b, reason: collision with root package name */
    public final C0765n f12047b;

    /* renamed from: c, reason: collision with root package name */
    public final C0765n f12048c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12049d;

    /* renamed from: e, reason: collision with root package name */
    public final int f12050e;

    public C0835e(String str, C0765n c0765n, C0765n c0765n2, int i5, int i10) {
        Q1.k.c(i5 == 0 || i10 == 0);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f12046a = str;
        c0765n.getClass();
        this.f12047b = c0765n;
        c0765n2.getClass();
        this.f12048c = c0765n2;
        this.f12049d = i5;
        this.f12050e = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0835e.class == obj.getClass()) {
            C0835e c0835e = (C0835e) obj;
            if (this.f12049d == c0835e.f12049d && this.f12050e == c0835e.f12050e && this.f12046a.equals(c0835e.f12046a) && this.f12047b.equals(c0835e.f12047b) && this.f12048c.equals(c0835e.f12048c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f12048c.hashCode() + ((this.f12047b.hashCode() + N0.a.c((((527 + this.f12049d) * 31) + this.f12050e) * 31, 31, this.f12046a)) * 31);
    }
}
