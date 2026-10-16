package defpackage;

import android.graphics.Bitmap;
import java.util.Iterator;

/* loaded from: classes.dex */
final class kyq extends qjm {
    final /* synthetic */ kyw a;

    public kyq(kyw kywVar) {
        this.a = kywVar;
    }

    @Override // defpackage.qjm
    public final void a(String str, int i) {
        Iterator it = this.a.y.iterator();
        while (it.hasNext()) {
            ((qjm) it.next()).a(str, i);
        }
    }

    @Override // defpackage.qjm
    public final void b(String str, int i, Bitmap bitmap) {
        Iterator it = this.a.y.iterator();
        while (it.hasNext()) {
            ((qjm) it.next()).b(str, i, bitmap);
        }
    }

    @Override // defpackage.qjm
    public final void c() {
        Iterator it = this.a.y.iterator();
        while (it.hasNext()) {
            ((qjm) it.next()).c();
        }
    }

    @Override // defpackage.qjm
    public final void d(String str, String str2) {
        Iterator it = this.a.y.iterator();
        while (it.hasNext()) {
            ((qjm) it.next()).d(str, str2);
        }
    }

    @Override // defpackage.qjm
    public final void e(String str) {
        Iterator it = this.a.y.iterator();
        while (it.hasNext()) {
            ((qjm) it.next()).e(str);
        }
    }

    @Override // defpackage.qjm
    public final void f() {
        Iterator it = this.a.y.iterator();
        while (it.hasNext()) {
            ((qjm) it.next()).f();
        }
    }

    @Override // defpackage.qjm
    public final void g(String str, int i, Bitmap bitmap, String str2) {
        Iterator it = this.a.y.iterator();
        while (it.hasNext()) {
            ((qjm) it.next()).g(str, i, bitmap, str2);
        }
    }
}
