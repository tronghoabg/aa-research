package H0;

import android.text.TextPaint;
import d0.C2384c;
import e0.C2441D;
import e0.C2465q;
import e0.z;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class d extends TextPaint {

    /* renamed from: a, reason: collision with root package name */
    public K0.d f4866a;

    /* renamed from: b, reason: collision with root package name */
    public C2441D f4867b;

    public final void a(long j8) {
        int iS;
        int i5 = C2465q.f34381j;
        if (j8 == C2465q.f34380i || getColor() == (iS = z.s(j8))) {
            return;
        }
        setColor(iS);
    }

    public final void b(C2441D c2441d) {
        if (c2441d == null) {
            C2441D c2441d2 = C2441D.f34337d;
            c2441d = C2441D.f34337d;
        }
        if (AbstractC3340k.a(this.f4867b, c2441d)) {
            return;
        }
        this.f4867b = c2441d;
        C2441D c2441d3 = C2441D.f34337d;
        if (AbstractC3340k.a(c2441d, C2441D.f34337d)) {
            clearShadowLayer();
        } else {
            C2441D c2441d4 = this.f4867b;
            setShadowLayer(c2441d4.f34340c, C2384c.b(c2441d4.f34339b), C2384c.c(this.f4867b.f34339b), z.s(this.f4867b.f34338a));
        }
    }

    public final void c(K0.d dVar) {
        if (dVar == null) {
            dVar = K0.d.f6315b;
        }
        if (AbstractC3340k.a(this.f4866a, dVar)) {
            return;
        }
        this.f4866a = dVar;
        int i5 = dVar.f6316a;
        setUnderlineText((i5 | 1) == i5);
        int i10 = this.f4866a.f6316a;
        setStrikeThruText((i10 | 2) == i10);
    }
}
