package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class shp {
    protected final Context a;
    protected final String b;
    protected siv c = siv.a;
    public zwt d;

    public shp(Context context, String str) {
        if (context == null) {
            throw new NullPointerException("null reference");
        }
        this.a = context;
        spu.at(str);
        this.b = str;
    }

    public final shv a() {
        return new shv(this.a, this.b, null, this.c, 0, null, null, null, this.d);
    }

    public final void b(siv sivVar) {
        spu.aw(sivVar);
        this.c = sivVar;
        shq.b(sivVar);
    }
}
