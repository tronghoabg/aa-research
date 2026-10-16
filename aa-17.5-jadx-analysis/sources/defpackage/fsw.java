package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class fsw {
    public Object a;
    public ftp b;
    public fqo c;
    public int d;
    public int e;
    private final Context f;
    private fss g;
    private List h;
    private final Map i;
    private Boolean j;
    private fto k;
    private ept l;
    private fto m;
    private int n;
    private final gjv o;
    private final erb p;

    public fsw(fsy fsyVar, Context context) {
        int i;
        this.f = context;
        this.g = fsyVar.y;
        this.a = fsyVar.b;
        this.b = fsyVar.c;
        this.d = fsyVar.x.d;
        this.c = fsyVar.e;
        this.h = fsyVar.f;
        this.p = ahdw.j(fsyVar.h);
        this.i = woy.be(fsyVar.i.b);
        this.j = fsyVar.x.b;
        this.o = new gjv(fsyVar.w);
        fst fstVar = fsyVar.x;
        this.k = fstVar.a;
        this.e = fstVar.c;
        if (fsyVar.a == context) {
            this.l = fsyVar.u;
            this.m = fsyVar.v;
            i = fsyVar.A;
        } else {
            this.l = null;
            this.m = null;
            i = 0;
        }
        this.n = i;
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, java.util.Map] */
    public final fsy a() {
        boolean z;
        ept eptVar;
        fto ftoVar;
        int i;
        fte fteVar;
        Object obj = this.a;
        if (obj == null) {
            obj = fta.a;
        }
        Object obj2 = obj;
        ftp ftpVar = this.b;
        fss fssVar = this.g;
        Bitmap.Config config = fssVar.f;
        int i2 = this.d;
        if (i2 == 0) {
            int i3 = fssVar.j;
            i2 = 3;
        }
        int i4 = i2;
        fqo fqoVar = this.c;
        List list = this.h;
        ftr ftrVar = fssVar.e;
        erb erbVar = this.p;
        ajhv ajhvVarK = erbVar != null ? ahdw.k(erbVar) : null;
        Bitmap.Config[] configArr = ftw.a;
        if (ajhvVarK == null) {
            ajhvVarK = ftw.c;
        }
        ajhv ajhvVar = ajhvVarK;
        Map map = this.i;
        fth fthVar = map != null ? new fth(a.be(map)) : null;
        if (fthVar == null) {
            fthVar = fth.a;
        }
        fth fthVar2 = fthVar;
        Boolean bool = this.j;
        if (bool != null) {
            bool.booleanValue();
            z = false;
        } else {
            z = true;
        }
        boolean z2 = z;
        Context context = this.f;
        fss fssVar2 = this.g;
        fsr fsrVar = fssVar2.g;
        fsr fsrVar2 = fssVar2.h;
        fsr fsrVar3 = fssVar2.i;
        aitu aituVar = fssVar2.a;
        aitu aituVar2 = fssVar2.b;
        aitu aituVar3 = fssVar2.c;
        aitu aituVar4 = fssVar2.d;
        ept lifecycle = this.l;
        if (lifecycle == null) {
            Object baseContext = context;
            while (true) {
                if (baseContext instanceof eqa) {
                    lifecycle = ((eqa) baseContext).getLifecycle();
                    break;
                }
                if (!(baseContext instanceof ContextWrapper)) {
                    lifecycle = null;
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            if (lifecycle == null) {
                lifecycle = fsv.b;
            }
        }
        fto ftoVar2 = this.k;
        if (ftoVar2 == null) {
            eptVar = lifecycle;
            fto ftkVar = this.m;
            if (ftkVar == null) {
                ftkVar = new ftk(context);
            }
            ftoVar = ftkVar;
        } else {
            eptVar = lifecycle;
            ftoVar = ftoVar2;
        }
        int i5 = this.e;
        if (i5 == 0 && (i5 = this.n) == 0) {
            if ((ftoVar2 instanceof ftm ? (ftm) ftoVar2 : null) != null) {
                throw null;
            }
            i5 = 2;
        }
        gjv gjvVar = this.o;
        if (gjvVar != null) {
            i = i5;
            fteVar = new fte(a.be(gjvVar.a));
        } else {
            i = i5;
            fteVar = null;
        }
        if (fteVar == null) {
            fteVar = fte.a;
        }
        return new fsy(context, obj2, ftpVar, config, i4, fqoVar, list, ftrVar, ajhvVar, fthVar2, z2, fsrVar, fsrVar2, fsrVar3, aituVar, aituVar2, aituVar3, aituVar4, eptVar, ftoVar, i, fteVar, new fst(this.k, this.e, this.d, this.j), this.g);
    }

    public final void b() {
        this.l = null;
        this.m = null;
        this.n = 0;
    }

    public final void c() {
        this.j = false;
    }

    public final void d(fss fssVar) {
        this.g = fssVar;
        this.n = 0;
    }

    public final void e(fto ftoVar) {
        ftoVar.getClass();
        this.k = ftoVar;
        b();
    }

    public final void f(ftn ftnVar) {
        ftnVar.getClass();
        e(new ftl(ftnVar));
    }

    public final void g(ieb... iebVarArr) {
        this.h = a.bd(woy.df(iebVarArr));
    }

    public fsw(Context context) {
        context.getClass();
        this.f = context;
        this.g = ftu.a;
        this.a = null;
        this.b = null;
        this.d = 0;
        this.c = null;
        this.h = afbe.a;
        this.p = null;
        this.i = null;
        this.j = null;
        this.o = null;
        this.k = null;
        this.e = 0;
        this.l = null;
        this.m = null;
        this.n = 0;
    }
}
