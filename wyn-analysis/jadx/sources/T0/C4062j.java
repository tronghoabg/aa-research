package t0;

import kotlin.jvm.internal.AbstractC3340k;
import x0.C4438h;

/* renamed from: t0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4062j implements s0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45482a;

    public /* synthetic */ C4062j(int i5) {
        this.f45482a = i5;
    }

    @Override // s0.c
    public Object a(a2.v vVar) {
        AbstractC3340k.e(vVar, "<this>");
        return ((tf.a) vVar.f17322b).invoke();
    }

    public Object b(X0.E e7) {
        switch (this.f45482a) {
            case 1:
                C4047L entity = (C4047L) e7;
                AbstractC3340k.e(entity, "entity");
                return ((p0.o) ((Z.j) entity.f15789c)).s();
            default:
                C4438h entity2 = (C4438h) e7;
                AbstractC3340k.e(entity2, "entity");
                return entity2;
        }
    }
}
