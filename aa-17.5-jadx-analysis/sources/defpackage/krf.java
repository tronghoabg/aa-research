package defpackage;

import android.content.Context;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class krf extends krh {
    private final esm b;
    private final kra c;
    private final htm d;

    public krf(Context context, esm esmVar, kra kraVar) {
        this.d = new htm((Object) context, (byte[]) null);
        this.b = esmVar;
        this.c = kraVar;
    }

    @Override // defpackage.krh
    protected final kqy f() {
        String strA = krd.b;
        if (mcd.A().u()) {
            kra kraVar = this.c;
            strA = kraVar.equals(kra.a) ? krd.a() : krd.b(kraVar.b);
        }
        return new kre((Context) this.d.a, this.b, new krd(R.id.contacts_manager_all_loader_id, strA, null));
    }
}
