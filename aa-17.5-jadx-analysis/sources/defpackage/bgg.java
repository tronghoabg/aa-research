package defpackage;

import android.view.ActionMode;
import android.view.View;

/* loaded from: classes.dex */
public final class bgg implements bhp {
    public final View a;
    public final afdr b;
    public ActionMode f;
    public Runnable g;
    public Runnable h;
    private final bii i = new bii((byte[]) null, (char[]) null);
    public final ces c = new ces(new bgb(this, 0));
    public final afec d = new bgb(this, 2);
    public final afec e = new bgb(this, 3);

    public bgg(View view, afdr afdrVar) {
        this.a = view;
        this.b = afdrVar;
    }

    public final Object a(Object obj, afec afecVar, afdr afdrVar) {
        affv affvVar = new affv();
        this.c.b(obj, afecVar, new aiy(affvVar, afdrVar, 14, null));
        Object obj2 = affvVar.a;
        if (obj2 != null) {
            return obj2;
        }
        affa.d("result");
        return afak.a;
    }

    @Override // defpackage.bhp
    public final Object b(bho bhoVar, afck afckVar) {
        Object objR = this.i.r(akq.a, new bgf(this, bhoVar, (afck) null, 0), afckVar);
        return objR == afcr.a ? objR : afak.a;
    }
}
