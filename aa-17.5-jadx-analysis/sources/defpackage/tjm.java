package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class tjm extends bui {
    public tjm(tjo tjoVar) {
        super(tjoVar);
    }

    @Override // defpackage.bui
    protected final void e() {
        tjo tjoVar = (tjo) this.a;
        tjoVar.e();
        tjoVar.k.clear();
    }

    @Override // defpackage.buj
    public final /* synthetic */ void i(int i, Object obj) {
        ((tjo) obj).getClass();
    }

    @Override // defpackage.buj
    public final /* bridge */ /* synthetic */ void j(int i, Object obj) {
        tjo tjoVar = (tjo) obj;
        tjoVar.getClass();
        ((tjo) this.b).e();
        ((tjo) this.b).k.add(i, tjoVar);
    }

    @Override // defpackage.buj
    public final void k(int i, int i2, int i3) {
        ((tjo) this.b).e();
        List list = ((tjo) this.b).k;
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
        List listSubList = list.subList(i, i3 + i);
        listSubList.getClass();
        ArrayList arrayList = new ArrayList(listSubList);
        listSubList.clear();
        list.addAll(i4, arrayList);
    }

    @Override // defpackage.buj
    public final void l(int i, int i2) {
        ((tjo) this.b).e();
        List list = ((tjo) this.b).k;
        if (i2 == 1) {
            list.remove(i);
        } else {
            list.subList(i, i2 + i).clear();
        }
    }
}
