package defpackage;

import java.util.LinkedList;
import java.util.Queue;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@Deprecated
/* loaded from: classes2.dex */
public final class ajxu {
    protected final ajtg b;
    protected final int c;
    protected final ajtd d;
    public final Log a = LogFactory.getLog(getClass());
    protected final LinkedList e = new LinkedList();
    protected final Queue f = new LinkedList();
    protected int g = 0;

    public ajxu(ajtg ajtgVar, ajtd ajtdVar) {
        this.b = ajtgVar;
        this.d = ajtdVar;
        this.c = ajtdVar.a(ajtgVar);
    }

    public final int a() {
        return this.d.a(this.b) - this.g;
    }

    public final void b() {
        ahkp.b(this.g > 0, "There is no entry that could be dropped");
        this.g--;
    }

    public final void c(ajxx ajxxVar) {
        this.f.remove(ajxxVar);
    }
}
