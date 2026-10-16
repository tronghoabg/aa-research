package defpackage;

import com.google.android.libraries.social.licenses.License;

/* loaded from: classes3.dex */
final class wej extends gf {
    @Override // defpackage.gf
    public final /* bridge */ /* synthetic */ boolean a(Object obj, Object obj2) {
        License license = (License) obj;
        License license2 = (License) obj2;
        return license.a.equals(license2.a) && license.b == license2.b && license.c == license2.c;
    }

    @Override // defpackage.gf
    public final /* bridge */ /* synthetic */ boolean b(Object obj, Object obj2) {
        return ((License) obj).a.equals(((License) obj2).a);
    }
}
