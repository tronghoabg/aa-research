package ad;

import D6.H0;
import android.os.RemoteException;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import x6.C4478i;

/* renamed from: ad.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1363h {

    /* renamed from: a, reason: collision with root package name */
    public final String f17581a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17582b;

    /* renamed from: c, reason: collision with root package name */
    public final List f17583c;

    /* renamed from: d, reason: collision with root package name */
    public final C1360e f17584d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f17585e;

    public C1363h(x6.t tVar) {
        H0 h02;
        this.f17581a = tVar.b();
        try {
            h02 = tVar.f47747a;
        } catch (RemoteException e7) {
            H6.l.d("Could not forward getMediationAdapterClassName to ResponseInfo.", e7);
        }
        String strZze = h02 != null ? h02.zze() : null;
        this.f17582b = strZze;
        ArrayList arrayList = new ArrayList();
        Iterator it = tVar.f47748b.iterator();
        while (it.hasNext()) {
            arrayList.add(new C1360e((C4478i) it.next()));
        }
        this.f17583c = arrayList;
        C4478i c4478i = tVar.f47749c;
        if (c4478i != null) {
            this.f17584d = new C1360e(c4478i);
        } else {
            this.f17584d = null;
        }
        HashMap map = new HashMap();
        if (tVar.a() != null) {
            for (String str : tVar.a().keySet()) {
                map.put(str, tVar.a().getString(str));
            }
        }
        this.f17585e = map;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1363h)) {
            return false;
        }
        C1363h c1363h = (C1363h) obj;
        return Objects.equals(this.f17581a, c1363h.f17581a) && Objects.equals(this.f17582b, c1363h.f17582b) && Objects.equals(this.f17583c, c1363h.f17583c) && Objects.equals(this.f17584d, c1363h.f17584d);
    }

    public final int hashCode() {
        return Objects.hash(this.f17581a, this.f17582b, this.f17583c, this.f17584d);
    }

    public C1363h(String str, String str2, List list, C1360e c1360e, Map map) {
        this.f17581a = str;
        this.f17582b = str2;
        this.f17583c = list;
        this.f17584d = c1360e;
        this.f17585e = map;
    }
}
