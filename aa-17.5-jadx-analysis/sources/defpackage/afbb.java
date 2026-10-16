package defpackage;

import android.view.ViewGroup;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class afbb implements airp {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public afbb(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Iterable, java.lang.Object] */
    @Override // defpackage.airp
    public final Iterator a() {
        int i = this.b;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? new aish(this.a) : new airs(this.a) : this.a : afrg.a(this.a) : this.a.iterator() : new eat(ebf.b((ViewGroup) this.a).a(), ebq.a) : afez.d((Object[]) this.a);
    }
}
