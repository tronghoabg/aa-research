package H0;

import A0.q;
import android.text.Layout;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final c f4849a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4850b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4851c;

    /* renamed from: d, reason: collision with root package name */
    public final q f4852d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f4853e;

    /* JADX WARN: Removed duplicated region for block: B:64:0x00b1  */
    /* JADX WARN: Type inference failed for: r12v11, types: [ef.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v19, types: [ef.i, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(H0.c r18, int r19, boolean r20, long r21) {
        /*
            Method dump skipped, instructions count: 547
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H0.a.<init>(H0.c, int, boolean, long):void");
    }

    public final q a(int i5, int i10, TextUtils.TruncateAt truncateAt, int i11) {
        c cVar = this.f4849a;
        return new q(cVar.f4863h, c(), cVar.f4862g, i5, truncateAt, cVar.k, i11, i10, cVar.f4864i);
    }

    public final float b() {
        q qVar = this.f4852d;
        boolean z2 = qVar.f228a;
        Layout layout = qVar.f229b;
        return (z2 ? layout.getLineBottom(qVar.f230c - 1) : layout.getHeight()) + qVar.f231d + qVar.f232e;
    }

    public final float c() {
        return L0.a.e(this.f4851c);
    }
}
