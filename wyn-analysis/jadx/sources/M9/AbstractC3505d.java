package m9;

import com.qonversion.android.sdk.internal.Constants;
import j$.util.Objects;

/* renamed from: m9.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3505d {

    /* renamed from: a, reason: collision with root package name */
    public final r f40470a;

    /* renamed from: b, reason: collision with root package name */
    public final String f40471b;

    /* renamed from: c, reason: collision with root package name */
    public final String f40472c;

    public AbstractC3505d(r rVar, String str) {
        String str2;
        this.f40470a = rVar;
        this.f40471b = str;
        StringBuilder sbJ = N0.a.j(str);
        if (rVar == null) {
            str2 = "";
        } else {
            str2 = Constants.USER_ID_SEPARATOR + rVar;
        }
        sbJ.append(str2);
        this.f40472c = sbJ.toString();
    }

    public final String a() {
        r rVar = this.f40470a;
        return rVar == null ? "" : rVar.f40508a.c();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC3505d)) {
            return false;
        }
        AbstractC3505d abstractC3505d = (AbstractC3505d) obj;
        r rVar = this.f40470a;
        return (rVar == null || abstractC3505d.f40470a == null) ? rVar == null && abstractC3505d.f40470a == null : this.f40471b.equals(abstractC3505d.f40471b) && a().equals(abstractC3505d.a());
    }

    public final int hashCode() {
        return Objects.hash(this.f40471b, a());
    }
}
