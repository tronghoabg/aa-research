package defpackage;

import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class wdb {
    public final Context a;
    public final xyc b;
    public final xyc c;
    public final xyc d;
    public volatile int e = 0;
    public final CopyOnWriteArrayList f = new CopyOnWriteArrayList();
    public final Object g = new Object();
    public volatile zgp h = null;

    public wdb(Context context, xyc xycVar, xyc xycVar2, xyc xycVar3) {
        this.a = context;
        this.b = xycVar;
        this.c = xycVar2;
        this.d = xycVar3;
    }
}
