package defpackage;

import android.net.Uri;
import java.util.List;

/* loaded from: classes.dex */
public final class wu {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public wu(ukr ukrVar) {
        this.e = ukrVar.k;
        this.c = ukrVar.m;
        this.b = ukrVar.n;
        this.a = ukrVar.o;
        this.d = ukrVar.q;
    }

    public final kfk a() {
        Object obj;
        Object obj2;
        Object obj3 = this.e;
        if (obj3 == null || (obj = this.d) == null || (obj2 = this.c) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.e == null) {
                sb.append(" uri");
            }
            if (this.d == null) {
                sb.append(" projection");
            }
            if (this.c == null) {
                sb.append(" selectionArgs");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        Uri uri = (Uri) obj3;
        kfk kfkVar = new kfk(uri, (yfq) obj, (String) this.b, (yfq) obj2, (String) this.a);
        boolean z = true;
        if (kfkVar.c == null && !kfkVar.d.isEmpty()) {
            z = false;
        }
        woy.O(z, "If selection is null, args must be empty");
        return kfkVar;
    }

    public final void b(List list) {
        this.d = yfq.o(list);
    }

    public final void c(List list) {
        this.c = yfq.o(list);
    }

    public final void d(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null uri");
        }
        this.e = uri;
    }

    public final ukr e() {
        if (this.e == null) {
            int i = yfq.d;
            this.e = yls.a;
        }
        if (this.d == null) {
            throw new IllegalStateException();
        }
        Object obj = this.e;
        Object obj2 = this.c;
        Object obj3 = this.b;
        String str = (String) obj3;
        String str2 = (String) obj2;
        return new uiq((yfq) obj, str2, str, (String) this.a, (ygr) this.d);
    }
}
