package J9;

import android.os.Bundle;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class L implements w8.d {

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f5891a;

    @Override // w8.d
    public final void a(String str, String str2) {
        Object obj = this.f5891a;
        w8.d dVar = obj instanceof w8.d ? (w8.d) obj : null;
        if (dVar != null) {
            dVar.a(str, str2);
        }
    }

    @Override // w8.d
    public final void b(String str, String str2, Bundle bundle) {
        Object obj = this.f5891a;
        w8.d dVar = obj instanceof w8.d ? (w8.d) obj : null;
        if (dVar != null) {
            dVar.b(str, str2, bundle);
        }
    }

    @Override // w8.d
    public final List d(String str) {
        return Collections.EMPTY_LIST;
    }

    @Override // w8.d
    public final Map e(boolean z2) {
        return Collections.EMPTY_MAP;
    }

    @Override // w8.d
    public final int f(String str) {
        return 0;
    }

    @Override // w8.d
    public final w8.a h(String str, w8.b bVar) {
        Object obj = this.f5891a;
        if (obj instanceof w8.d) {
            return ((w8.d) obj).h(str, bVar);
        }
        K k = new K();
        k.f5889a = new HashSet();
        ((L8.r) obj).a(new A5.g(k, str, bVar, 5));
        return k;
    }

    @Override // w8.d
    public final void c(String str) {
    }

    @Override // w8.d
    public final void g(w8.c cVar) {
    }
}
