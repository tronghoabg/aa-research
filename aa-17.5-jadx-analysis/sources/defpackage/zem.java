package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zem implements Comparable {
    public final Object a;
    final int b;
    public final List c = new ArrayList();
    public int d;

    public zem(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.b, ((zem) obj).b);
    }
}
