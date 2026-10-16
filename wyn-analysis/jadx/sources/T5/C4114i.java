package t5;

import android.util.Base64;
import java.util.Arrays;
import ne.C3618a;
import q5.EnumC3870e;

/* renamed from: t5.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4114i {

    /* renamed from: a, reason: collision with root package name */
    public final String f45776a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f45777b;

    /* renamed from: c, reason: collision with root package name */
    public final EnumC3870e f45778c;

    public C4114i(String str, byte[] bArr, EnumC3870e enumC3870e) {
        this.f45776a = str;
        this.f45777b = bArr;
        this.f45778c = enumC3870e;
    }

    public static C3618a a() {
        C3618a c3618a = new C3618a();
        c3618a.f41022c = EnumC3870e.f44125a;
        return c3618a;
    }

    public final C4114i b(EnumC3870e enumC3870e) {
        C3618a c3618aA = a();
        c3618aA.h(this.f45776a);
        if (enumC3870e == null) {
            throw new NullPointerException("Null priority");
        }
        c3618aA.f41022c = enumC3870e;
        c3618aA.f41021b = this.f45777b;
        return c3618aA.c();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4114i) {
            C4114i c4114i = (C4114i) obj;
            if (this.f45776a.equals(c4114i.f45776a) && Arrays.equals(this.f45777b, c4114i.f45777b) && this.f45778c.equals(c4114i.f45778c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f45776a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f45777b)) * 1000003) ^ this.f45778c.hashCode();
    }

    public final String toString() {
        byte[] bArr = this.f45777b;
        return "TransportContext(" + this.f45776a + ", " + this.f45778c + ", " + (bArr == null ? "" : Base64.encodeToString(bArr, 2)) + ")";
    }
}
