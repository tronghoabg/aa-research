package Ne;

import Le.d;
import kotlin.jvm.internal.AbstractC3340k;
import o3.e;
import o3.f;

/* loaded from: classes5.dex */
public final class a implements d, f {

    /* renamed from: a, reason: collision with root package name */
    public final String f8670a;

    @Override // o3.f
    public String a() {
        return this.f8670a;
    }

    @Override // Le.d
    public boolean test(Object obj) {
        String str = this.f8670a;
        if (obj != str) {
            return obj != null && obj.equals(str);
        }
        return true;
    }

    public a(String query) {
        AbstractC3340k.e(query, "query");
        this.f8670a = query;
    }

    @Override // o3.f
    public void b(e eVar) {
    }
}
