package Y1;

import Q1.x;
import j$.util.Objects;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f16346a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16347b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16348c;

    /* renamed from: d, reason: collision with root package name */
    public final String f16349d;

    /* renamed from: e, reason: collision with root package name */
    public final String f16350e;

    public i(String str, String str2, String str3, String str4, String str5) {
        this.f16346a = str;
        this.f16347b = str2;
        this.f16348c = str3;
        this.f16349d = str4;
        this.f16350e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        String str = iVar.f16346a;
        int i5 = x.f9724a;
        return Objects.equals(this.f16346a, str) && Objects.equals(this.f16347b, iVar.f16347b) && Objects.equals(this.f16348c, iVar.f16348c) && Objects.equals(this.f16349d, iVar.f16349d) && Objects.equals(this.f16350e, iVar.f16350e);
    }

    public final int hashCode() {
        String str = this.f16346a;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f16347b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f16348c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f16349d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f16350e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
