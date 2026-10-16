package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class eza {
    public final afhe a;
    public final Context b;
    public final String c;
    public Executor f;
    public Executor g;
    public fbo h;
    public boolean i;
    public boolean n;
    public boolean o;
    public final List d = new ArrayList();
    public final List e = new ArrayList();
    public final erb p = new erb((byte[]) null);
    public final Set j = new LinkedHashSet();
    public final Set k = new LinkedHashSet();
    public final List l = new ArrayList();
    public boolean m = true;

    public eza(Context context, Class cls, String str) {
        this.a = affa.l(cls);
        this.b = context;
        this.c = str;
    }

    public final void a(fak... fakVarArr) {
        fak fakVar = fakVarArr[0];
        Integer numValueOf = Integer.valueOf(fakVar.a);
        Set set = this.k;
        set.add(numValueOf);
        set.add(Integer.valueOf(fakVar.b));
        fak[] fakVarArr2 = (fak[]) Arrays.copyOf(fakVarArr, 1);
        fakVarArr2.getClass();
        for (fak fakVar2 : fakVarArr2) {
            this.p.A(fakVar2);
        }
    }
}
