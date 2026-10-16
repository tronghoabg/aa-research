package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes3.dex */
public final class tki implements tjy {
    public final String a;
    public final tkm b;
    private final tjy c;

    public tki(Context context, ept eptVar, tjy tjyVar, String str) {
        this.c = tjyVar;
        this.a = str;
        tkm tkmVarA = tkm.a.a(context);
        this.b = tkmVarA;
        yob yobVar = tkm.b;
        ((ynz) yobVar.f().ai(9080)).y("Register delegate %s", str);
        if (((tjy) tkmVarA.c.put(str, tjyVar)) != null) {
            ((ynz) yobVar.h().ai(9081)).y("Icon proxy delegate %s already registered", str);
        }
        eptVar.c(new wr(this, 4));
    }

    @Override // defpackage.tjy
    public final Uri a(Object obj) {
        return this.b.a(new tkl(this.a, this.c.a(obj)));
    }

    @Override // defpackage.tjy
    public final IconCompat b(Object obj) {
        obj.getClass();
        return IconCompat.l(a(obj));
    }

    @Override // defpackage.tjy
    public final /* synthetic */ IconCompat c(Uri uri) {
        return szp.y(this, uri);
    }

    @Override // defpackage.tjy
    public final Object d(Uri uri) {
        return this.c.d(this.b.d(uri).b);
    }
}
