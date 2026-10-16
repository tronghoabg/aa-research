package A7;

import N.C0718d;
import android.os.Parcel;
import kotlin.jvm.internal.AbstractC3340k;
import q7.BinderC3877b;
import q7.InterfaceC3876a;
import u6.AbstractC4256a;
import vf.AbstractC4345a;

/* renamed from: A7.p0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC0279p0 {
    public static /* synthetic */ String A(int i5) {
        switch (i5) {
            case 1:
                return "NOT_REQUIRED";
            case 2:
                return "CONNECTED";
            case 3:
                return "UNMETERED";
            case 4:
                return "NOT_ROAMING";
            case 5:
                return "METERED";
            case 6:
                return "TEMPORARILY_UNMETERED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String B(int i5) {
        switch (i5) {
            case 1:
                return "ENQUEUED";
            case 2:
                return "RUNNING";
            case 3:
                return "SUCCEEDED";
            case 4:
                return "FAILED";
            case 5:
                return "BLOCKED";
            case 6:
                return "CANCELLED";
            default:
                return "null";
        }
    }

    public static int a(L0.b bVar, float f10) {
        float fT = bVar.t(f10);
        return Float.isInfinite(fT) ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : AbstractC4345a.H(fT);
    }

    public static float b(long j8, L0.b bVar) {
        if (!L0.k.a(L0.j.b(j8), 4294967296L)) {
            throw new IllegalStateException("Only Sp can convert to Px");
        }
        return bVar.b() * bVar.getFontScale() * L0.j.c(j8);
    }

    public static long c(long j8, L0.b bVar) {
        int i5 = L0.f.f6801c;
        if (j8 != L0.f.f6800b) {
            return com.moloco.sdk.internal.publisher.H.I(bVar.t(L0.f.b(j8)), bVar.t(L0.f.a(j8)));
        }
        int i10 = d0.f.f33951d;
        return d0.f.f33950c;
    }

    public static final boolean d(int i5) {
        return i5 == 3 || i5 == 4 || i5 == 6;
    }

    public static int e(int i5, int i10, int i11) {
        return i5 | i10 | i11 | 128;
    }

    public static int f(int i5, int i10) {
        return String.valueOf(i5).length() + i10;
    }

    public static int g(int i5, int i10, String str) {
        return str.length() + i5 + i10;
    }

    public static C0271m1 h(C0273n0 c0273n0) {
        C0271m1 c0271m1M = c0273n0.m();
        c0271m1M.c0();
        c0271m1M.h0();
        return c0271m1M;
    }

    public static String i(int i5, String str, String str2) {
        return str + i5 + str2;
    }

    public static String j(int i5, String str, StringBuilder sb2) {
        sb2.append(i5);
        sb2.append(str);
        return sb2.toString();
    }

    public static String k(long j8, String str) {
        return str + j8;
    }

    public static String l(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String m(StringBuilder sb2, float f10, char c10) {
        sb2.append(f10);
        sb2.append(c10);
        return sb2.toString();
    }

    public static String n(StringBuilder sb2, String str, char c10) {
        sb2.append(str);
        sb2.append(c10);
        return sb2.toString();
    }

    public static String o(StringBuilder sb2, String str, int i5, String str2) {
        sb2.append(str);
        sb2.append(i5);
        sb2.append(str2);
        return sb2.toString();
    }

    public static String p(StringBuilder sb2, boolean z2, char c10) {
        sb2.append(z2);
        sb2.append(c10);
        return sb2.toString();
    }

    public static StringBuilder q(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        return sb2;
    }

    public static StringBuilder r(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        sb2.append(str5);
        return sb2;
    }

    public static kotlin.jvm.internal.G s(Object obj) {
        Fe.e.U(obj);
        return new kotlin.jvm.internal.G();
    }

    public static InterfaceC3876a t(Parcel parcel) {
        InterfaceC3876a interfaceC3876aR = BinderC3877b.R(parcel.readStrongBinder());
        parcel.recycle();
        return interfaceC3876aR;
    }

    public static void u(int i5, String str, String str2) {
        AbstractC4256a.E(str2, str + i5);
    }

    public static void v(StringBuilder sb2, int i5, String str, String str2, String str3) {
        sb2.append(i5);
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
    }

    public static StringBuilder w(String str, String str2) {
        AbstractC3340k.d(str, str2);
        return new StringBuilder();
    }

    public static void x(StringBuilder sb2, int i5, String str, String str2, String str3) {
        sb2.append(i5);
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        C0718d.P(sb2.toString());
        throw null;
    }

    public static /* synthetic */ String y(int i5) {
        return i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? i5 != 5 ? "null" : "MEMORY_CACHE" : "RESOURCE_DISK_CACHE" : "DATA_DISK_CACHE" : "REMOTE" : "LOCAL";
    }

    public static /* synthetic */ String z(int i5) {
        switch (i5) {
            case 1:
                return "INITIALIZE";
            case 2:
                return "RESOURCE_CACHE";
            case 3:
                return "DATA_CACHE";
            case 4:
                return "SOURCE";
            case 5:
                return "ENCODE";
            case 6:
                return "FINISHED";
            default:
                return "null";
        }
    }
}
