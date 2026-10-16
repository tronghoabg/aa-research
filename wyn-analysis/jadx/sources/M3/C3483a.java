package m3;

import Bf.k;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: m3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3483a {

    /* renamed from: a, reason: collision with root package name */
    public final String f40329a;

    /* renamed from: b, reason: collision with root package name */
    public final String f40330b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f40331c;

    /* renamed from: d, reason: collision with root package name */
    public final int f40332d;

    /* renamed from: e, reason: collision with root package name */
    public final String f40333e;

    /* renamed from: f, reason: collision with root package name */
    public final int f40334f;

    /* renamed from: g, reason: collision with root package name */
    public final int f40335g;

    public C3483a(int i5, String str, String str2, String str3, boolean z2, int i10) {
        this.f40329a = str;
        this.f40330b = str2;
        this.f40331c = z2;
        this.f40332d = i5;
        this.f40333e = str3;
        this.f40334f = i10;
        Locale US = Locale.US;
        AbstractC3340k.d(US, "US");
        String upperCase = str2.toUpperCase(US);
        AbstractC3340k.d(upperCase, "this as java.lang.String).toUpperCase(locale)");
        this.f40335g = k.n0(upperCase, "INT", false) ? 3 : (k.n0(upperCase, "CHAR", false) || k.n0(upperCase, "CLOB", false) || k.n0(upperCase, "TEXT", false)) ? 2 : k.n0(upperCase, "BLOB", false) ? 5 : (k.n0(upperCase, "REAL", false) || k.n0(upperCase, "FLOA", false) || k.n0(upperCase, "DOUB", false)) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C3483a)) {
                return false;
            }
            C3483a c3483a = (C3483a) obj;
            if (this.f40332d != c3483a.f40332d) {
                return false;
            }
            if (!this.f40329a.equals(c3483a.f40329a) || this.f40331c != c3483a.f40331c) {
                return false;
            }
            int i5 = c3483a.f40334f;
            String str = c3483a.f40333e;
            String str2 = this.f40333e;
            int i10 = this.f40334f;
            if (i10 == 1 && i5 == 2 && str2 != null && !android.support.v4.media.session.b.b0(str2, str)) {
                return false;
            }
            if (i10 == 2 && i5 == 1 && str != null && !android.support.v4.media.session.b.b0(str, str2)) {
                return false;
            }
            if (i10 != 0 && i10 == i5) {
                if (str2 != null) {
                    if (!android.support.v4.media.session.b.b0(str2, str)) {
                        return false;
                    }
                } else if (str != null) {
                    return false;
                }
            }
            if (this.f40335g != c3483a.f40335g) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.f40329a.hashCode() * 31) + this.f40335g) * 31) + (this.f40331c ? 1231 : 1237)) * 31) + this.f40332d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Column{name='");
        sb2.append(this.f40329a);
        sb2.append("', type='");
        sb2.append(this.f40330b);
        sb2.append("', affinity='");
        sb2.append(this.f40335g);
        sb2.append("', notNull=");
        sb2.append(this.f40331c);
        sb2.append(", primaryKeyPosition=");
        sb2.append(this.f40332d);
        sb2.append(", defaultValue='");
        String str = this.f40333e;
        if (str == null) {
            str = "undefined";
        }
        return wg.b.c(sb2, str, "'}");
    }
}
