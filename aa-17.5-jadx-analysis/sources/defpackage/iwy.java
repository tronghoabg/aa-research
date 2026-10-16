package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class iwy implements iwv {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public iwy(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.iwv
    public final void a() {
        if (this.b == 0) {
            Iterator it = ((iwz) this.a).f.iterator();
            while (it.hasNext()) {
                ((iwv) it.next()).a();
            }
        } else {
            ((ype) ((ype) irg.a.f()).ai((char) 1241)).u("onCarMicClosed");
            irg irgVar = (irg) this.a;
            irgVar.h = false;
            irgVar.a(null);
        }
    }

    @Override // defpackage.iwv
    public final void b() {
        if (this.b == 0) {
            Iterator it = ((iwz) this.a).f.iterator();
            while (it.hasNext()) {
                ((iwv) it.next()).b();
            }
        } else {
            ((ype) ((ype) irg.a.f()).ai((char) 1242)).u("onCarMicOpened");
            irg irgVar = (irg) this.a;
            irgVar.h = true;
            irgVar.a(null);
        }
    }
}
