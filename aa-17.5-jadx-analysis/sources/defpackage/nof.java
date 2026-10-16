package defpackage;

import android.content.Context;
import android.support.v4.app.Fragment;

/* loaded from: classes.dex */
final class nof implements eqn {
    final /* synthetic */ noh a;
    private krz b;

    public nof(noh nohVar) {
        this.a = nohVar;
    }

    @Override // defpackage.eqn
    public final /* bridge */ /* synthetic */ void eS(Object obj) {
        Context contextRequireContext;
        Context contextA;
        krz krzVar = (krz) obj;
        krz krzVar2 = this.b;
        if (krzVar2 == null) {
            this.b = krzVar;
            return;
        }
        if (krzVar2 == krzVar) {
            return;
        }
        this.b = krzVar;
        noh nohVar = this.a;
        Fragment fragmentA = nohVar.a();
        if (fragmentA == null || fragmentA.getContext() == null || contextRequireContext == (contextA = ksa.d().a((contextRequireContext = fragmentA.requireContext())))) {
            return;
        }
        if (!nohVar.d) {
            ((ype) ((ype) noc.a.h()).ai((char) 5315)).u("Attempted to recreate Fragment when not ready. Context changes will be applied when creating View.");
            return;
        }
        rbx rbxVarA = rbx.a(nohVar.c);
        nohVar.i(contextA);
        nohVar.j.G();
        if (rbxVarA != null) {
            rbxVarA.b(nohVar.c);
        }
    }
}
