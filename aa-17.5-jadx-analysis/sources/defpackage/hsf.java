package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class hsf extends ContextWrapper {
    static final hst a = new hrs();
    public final List b;
    public final Map c;
    public final hwj d;
    public final int e;
    public final hxl f;
    public final htm g;
    public final fxy h;
    private final ifs i;
    private iek j;

    public hsf(Context context, hxl hxlVar, ifs ifsVar, fxy fxyVar, Map map, List list, hwj hwjVar, htm htmVar) {
        super(context.getApplicationContext());
        this.f = hxlVar;
        this.h = fxyVar;
        this.b = list;
        this.c = map;
        this.d = hwjVar;
        this.g = htmVar;
        this.e = 4;
        this.i = new ifr(ifsVar);
    }

    public final hsn a() {
        return (hsn) this.i.a();
    }

    public final synchronized iek b() {
        iek iekVar;
        iekVar = this.j;
        if (iekVar == null) {
            iekVar = new iek();
            iekVar.Y();
            this.j = iekVar;
        }
        return iekVar;
    }
}
