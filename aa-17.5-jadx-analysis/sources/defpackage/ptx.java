package defpackage;

import android.content.Context;
import com.google.android.gms.carsetup.CarInfoInternal;

/* loaded from: classes2.dex */
public final class ptx implements zge {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public ptx(knv knvVar, Context context, String str, gms gmsVar, Runnable runnable, int i) {
        this.f = i;
        this.e = context;
        this.a = str;
        this.b = gmsVar;
        this.d = runnable;
        this.c = knvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [abow, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [abow, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, pwq] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, pwq] */
    /* JADX WARN: Type inference failed for: r6v0, types: [abow, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, pwq] */
    @Override // defpackage.zge
    public final void a(Throwable th) {
        int i = this.f;
        if (i == 0) {
            ptz ptzVar = (ptz) this.e;
            if (ptzVar.g.isDone()) {
                return;
            }
            ?? r13 = this.a;
            if (ptzVar.c(r13)) {
                return;
            }
            ptzVar.g(th, r13, ((uia) ptzVar.d.a()).a((pwp) this.b), 1, this.c, (qaz) this.d);
            return;
        }
        if (i == 1) {
            ((ype) ((ype) ((ype) knv.a.g()).p(th)).ai((char) 3255)).u("Unable to retrieve bluetooth device");
            return;
        }
        Object obj = this.e;
        if (i != 2) {
            ptz ptzVar2 = (ptz) obj;
            pwh pwhVarA = ((uia) ptzVar2.d.a()).a((pwp) this.b);
            Object obj2 = this.d;
            ptzVar2.g(th, this.a, pwhVarA, 1, this.c, (qaz) obj2);
            return;
        }
        ptz ptzVar3 = (ptz) obj;
        ptzVar3.e.b();
        Object obj3 = this.d;
        ptzVar3.g(th, this.a, (pwh) this.b, 1, this.c, (qaz) obj3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.lang.Runnable] */
    @Override // defpackage.zge
    public final /* synthetic */ void b(Object obj) {
        int i = this.f;
        if (i == 0) {
            return;
        }
        if (i != 1) {
            if (i != 2) {
                return;
            } else {
                return;
            }
        }
        xxh xxhVarD = knv.d((Context) this.e, (xxh) obj);
        if (xxhVarD.f()) {
            ((ype) knv.a.l().ai(3256)).M("For rule %s, found known bluetooth device pointing to car: %s", this.a, ((CarInfoInternal) xxhVarD.b()).a);
            Object obj2 = this.b;
            Object objB = xxhVarD.b();
            ?? r0 = ((gms) obj2).a;
            if (!((yfq) r0).isEmpty()) {
                int size = r0.size();
                boolean z = false;
                boolean z2 = false;
                for (int i2 = 0; i2 < size; i2++) {
                    rrh rrhVar = (rrh) r0.get(i2);
                    boolean zEquals = !rrhVar.equals(rrh.a);
                    if ((rrhVar.b & 1) != 0) {
                        zEquals &= rrhVar.c.equalsIgnoreCase(((CarInfoInternal) objB).a.a);
                    }
                    if ((rrhVar.b & 2) != 0) {
                        zEquals &= rrhVar.d.equalsIgnoreCase(((CarInfoInternal) objB).a.b);
                    }
                    if ((rrhVar.b & 8) != 0) {
                        zEquals &= rrhVar.f.equalsIgnoreCase(((CarInfoInternal) objB).a.j);
                    }
                    if ((rrhVar.b & 4) != 0) {
                        zEquals &= rrhVar.e.equals(((CarInfoInternal) objB).a.c);
                    }
                    if (!rrhVar.g) {
                        z2 |= zEquals;
                        z = true;
                    } else if (zEquals) {
                        return;
                    }
                }
                if (z && !z2) {
                    return;
                }
            }
            ((knv) this.c).c.post(this.d);
        }
    }

    public ptx(ptz ptzVar, abow abowVar, Object obj, pwq pwqVar, qaz qazVar, int i) {
        this.f = i;
        this.a = abowVar;
        this.b = obj;
        this.c = pwqVar;
        this.d = qazVar;
        this.e = ptzVar;
    }
}
