package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class dwj implements dzg {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public dwj(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.dzg
    public final /* synthetic */ void a(Object obj) {
        if (this.b != 0) {
            acjs acjsVar = (acjs) obj;
            if (acjsVar == null) {
                acjsVar = new acjs(-3, null, null);
            }
            ((rz) this.a).r(acjsVar);
            return;
        }
        acjs acjsVar2 = (acjs) obj;
        synchronized (dwk.c) {
            aat aatVar = dwk.d;
            Object obj2 = this.a;
            ArrayList arrayList = (ArrayList) aatVar.get(obj2);
            if (arrayList == null) {
                return;
            }
            aatVar.remove(obj2);
            for (int i = 0; i < arrayList.size(); i++) {
                ((dzg) arrayList.get(i)).a(acjsVar2);
            }
        }
    }
}
