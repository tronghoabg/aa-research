package defpackage;

import android.content.Context;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class kri extends krh {
    private final esm b;
    private final htm c;

    public kri(Context context, esm esmVar) {
        this.c = new htm((Object) context, (byte[]) null);
        this.b = esmVar;
    }

    @Override // defpackage.krh
    protected final kqy f() {
        Object obj = this.c.a;
        return new kre((Context) obj, this.b, new krd(R.id.contacts_manager_starred_loader_id, krd.c, krd.e));
    }
}
