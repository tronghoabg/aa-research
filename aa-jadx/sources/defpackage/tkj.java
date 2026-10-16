package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class tkj extends defpackage.bup {
    public tkj(defpackage.tkl tklVar) {
        super(tklVar);
    }

    @Override // defpackage.bup
    protected final void e() {
        defpackage.tkl tklVar = (defpackage.tkl) this.a;
        tklVar.e();
        tklVar.k.clear();
    }

    @Override // defpackage.buq
    public final /* synthetic */ void i(int i, java.lang.Object obj) {
        ((defpackage.tkl) obj).getClass();
    }

    @Override // defpackage.buq
    public final /* bridge */ /* synthetic */ void j(int i, java.lang.Object obj) {
        defpackage.tkl tklVar = (defpackage.tkl) obj;
        tklVar.getClass();
        ((defpackage.tkl) this.b).e();
        ((defpackage.tkl) this.b).k.add(i, tklVar);
    }

    @Override // defpackage.buq
    public final void k(int i, int i2, int i3) {
        ((defpackage.tkl) this.b).e();
        java.util.List list = ((defpackage.tkl) this.b).k;
        int i4 = i > i2 ? i2 : i2 - i3;
        if (i3 == 1) {
            if (i == i2 + 1 || i == i2 - 1) {
                list.set(i, list.set(i2, list.get(i)));
                return;
            } else {
                list.add(i4, list.remove(i));
                return;
            }
        }
        java.util.List listSubList = list.subList(i, i3 + i);
        listSubList.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList(listSubList);
        listSubList.clear();
        list.addAll(i4, arrayList);
    }

    @Override // defpackage.buq
    public final void l(int i, int i2) {
        ((defpackage.tkl) this.b).e();
        java.util.List list = ((defpackage.tkl) this.b).k;
        if (i2 == 1) {
            list.remove(i);
        } else {
            list.subList(i, i2 + i).clear();
        }
    }
}
