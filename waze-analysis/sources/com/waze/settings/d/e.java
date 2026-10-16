package com.waze.settings.d;

import android.view.View;
import androidx.lifecycle.LiveData;
import com.waze.settings.cr;
import com.waze.settings.tree.c.h;
import h.g.b.x;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e implements h {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f37009a;

    e(f fVar) {
        this.f37009a = fVar;
    }

    @Override // com.waze.settings.tree.c.h
    public final /* synthetic */ LiveData a() {
        return com.waze.settings.tree.a.d.d(this);
    }

    @Override // com.waze.settings.tree.c.h
    public final String b() {
        b bVarA = this.f37009a.h().a();
        return String.valueOf(bVarA != null ? bVarA.c().s() : null);
    }

    @Override // com.waze.settings.tree.c.h
    public final void c(View view, String str, String str2) {
        Object next;
        f fVar = this.f37009a;
        Iterator it = fVar.h().b().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (x.n(((b) next).c().s(), str)) {
                    break;
                }
            }
        }
        b bVar = (b) next;
        if (bVar == null) {
            com.waze.shared_infra.i.h.j("SettingsGasTypeController: no gas type found for id ".concat(String.valueOf(str)));
        } else {
            fVar.h().c(bVar);
            cr.setPreferredType$default(fVar.f37012c, bVar.a(), null, 2, null);
        }
    }
}
