package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class ewx {
    public final afaz a;
    public final afaz b;
    public ewt c;
    public int d;
    public eww e;
    public final ajab f = new ajab(ewy.a);
    private final aizz g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private final ajab n;
    private final aaj o;
    private final aaj p;
    private final aaj q;

    public ewx() {
        ajab ajabVar = new ajab(new ewu(null));
        this.n = ajabVar;
        this.g = new aizl(ajabVar, null);
        this.a = new afaz();
        this.b = new afaz();
        int i = aak.a;
        this.o = new aaj(6);
        this.p = new aaj(6);
        this.q = new aaj(6);
    }

    public final ewt a(int i) {
        Object next;
        Object next2;
        afaz afazVar = this.a;
        Object obj = null;
        if (i != -1) {
            Iterator<E> it = afazVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
                if (((ewt) next2).e) {
                    break;
                }
            }
            ewt ewtVar = (ewt) next2;
            if (ewtVar != null) {
                return ewtVar;
            }
            Iterator<E> it2 = this.b.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next3 = it2.next();
                if (((ewt) next3).e) {
                    obj = next3;
                    break;
                }
            }
            return (ewt) obj;
        }
        Iterator<E> it3 = afazVar.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
            if (((ewt) next).e) {
                break;
            }
        }
        ewt ewtVar2 = (ewt) next;
        if (ewtVar2 != null) {
            return ewtVar2;
        }
        Iterator<E> it4 = this.b.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            Object next4 = it4.next();
            if (((ewt) next4).e) {
                obj = next4;
                break;
            }
        }
        return (ewt) obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ewx.b():void");
    }

    public final void c(mko mkoVar, eww ewwVar, int i) {
        (i != 0 ? i != 1 ? this.o : this.p : this.q).d(ewwVar);
        mko mkoVar2 = ewwVar.d;
        if (mkoVar2 != null) {
            throw new IllegalArgumentException(a.bw(mkoVar2, ewwVar, "Input '", "' is already added to dispatcher ", "."));
        }
        ewwVar.d = mkoVar;
        ((ewu) this.g.b()).getClass();
        ewwVar.c(i != 0 ? i != 1 ? this.m : this.i : this.k);
    }
}
