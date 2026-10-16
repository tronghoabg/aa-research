package hd;

import A.AbstractC0213f;
import E5.Y;
import J8.AbstractC0626a;
import N1.C0769s;
import N1.C0770t;
import N1.C0771u;
import N1.C0773w;
import N1.r;
import N1.z;
import android.content.Context;
import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import k2.C3164v;
import k2.G;
import l8.e0;
import za.C4658a;

/* renamed from: hd.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2818b extends AbstractC0626a {

    /* renamed from: b, reason: collision with root package name */
    public final int f36395b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f36396c;

    /* renamed from: d, reason: collision with root package name */
    public final String f36397d;

    public C2818b(String str, int i5, HashMap map, String str2) {
        super(str);
        this.f36395b = i5;
        this.f36396c = map;
        this.f36397d = str2;
    }

    @Override // J8.AbstractC0626a
    public final C0773w b() {
        J5.n nVar = new J5.n(3);
        new C4658a();
        List list = Collections.EMPTY_LIST;
        e0 e0Var = e0.f40101e;
        Y y10 = new Y();
        C0771u c0771u = C0771u.f8270a;
        String str = this.f5783a;
        Uri uri = str == null ? null : Uri.parse(str);
        int iF = AbstractC0213f.f(this.f36395b);
        String str2 = iF != 1 ? iF != 2 ? iF != 3 ? null : "application/x-mpegURL" : "application/dash+xml" : "application/vnd.ms-sstr+xml";
        if (str2 == null) {
            str2 = null;
        }
        return new C0773w("", new r(nVar), uri != null ? new C0770t(uri, str2, null, list, e0Var, null, -9223372036854775807L) : null, new C0769s(y10), z.f8304B, c0771u);
    }

    @Override // J8.AbstractC0626a
    public final G c(Context context) {
        N2.e eVar = new N2.e(1);
        eVar.f8354f = this.f36397d;
        eVar.f8352d = true;
        HashMap map = this.f36396c;
        if (!map.isEmpty()) {
            eVar.e(map);
        }
        S3.c cVar = new S3.c(context, eVar);
        C3164v c3164v = new C3164v(context);
        c3164v.f39163b = cVar;
        F6.r rVar = c3164v.f39162a;
        if (cVar != ((S3.c) rVar.f4015f)) {
            rVar.f4015f = cVar;
            ((HashMap) rVar.f4013d).clear();
            ((HashMap) rVar.f4014e).clear();
        }
        return c3164v;
    }
}
