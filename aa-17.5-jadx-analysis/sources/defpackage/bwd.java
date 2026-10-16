package defpackage;

/* loaded from: classes.dex */
public final class bwd {
    public int a;
    public Object b;
    public final Object c;

    public bwd() {
        this.c = new byw(new os[16]);
    }

    public final void a(int i, Object obj) {
        if (i < 0) {
            asl.c("size should be >=0");
        }
        if (i == 0) {
            return;
        }
        os osVar = new os(this.a, i, obj);
        this.a += i;
        ((byw) this.c).n(osVar);
    }

    public final os b(int i) {
        if (i < 0 || i >= this.a) {
            asl.e("Index " + i + ", size " + this.a);
        }
        Object obj = this.b;
        if (obj != null) {
            os osVar = (os) obj;
            int i2 = osVar.a;
            if (i < osVar.b + i2 && i2 <= i) {
                return osVar;
            }
        }
        byw bywVar = (byw) this.c;
        os osVar2 = (os) bywVar.a[awx.q(bywVar, i)];
        this.b = osVar2;
        return osVar2;
    }

    public bwd(bxf bxfVar, int i, Object obj) {
        this.c = bxfVar;
        this.a = i;
        this.b = obj;
    }

    public bwd(dcc dccVar) {
        this.c = dccVar;
    }
}
