package J4;

import I4.l;
import I4.p;
import I4.q;
import I4.v;
import android.content.Context;
import i8.h;

/* loaded from: classes.dex */
public final class c implements q, h, E0.d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5596a;

    public /* synthetic */ c(Context context, boolean z2) {
        this.f5596a = context;
    }

    @Override // i8.i
    public Object a() {
        return this.f5596a;
    }

    @Override // I4.q
    public p d(v vVar) {
        return new l(this.f5596a, 2);
    }

    public c(Context context) {
        this.f5596a = context.getApplicationContext();
    }
}
