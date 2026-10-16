package defpackage;

import android.content.ComponentName;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class sgs extends ssv {
    public final sgw a;
    public final long b;
    public final ComponentName c;
    public final rtf d;
    public rwv f;
    public ruw g;
    public final /* synthetic */ sgx h;
    public final rwl j;
    public final List e = new ArrayList();
    public int i = 3;

    public sgs(sgx sgxVar, long j, ComponentName componentName, rtf rtfVar) {
        this.h = sgxVar;
        this.a = new sgw(sgxVar);
        this.j = new rwl(sgxVar);
        this.b = j;
        this.c = componentName;
        this.d = rtfVar;
    }

    @Override // defpackage.ssv
    public final void a(ComponentName componentName, IBinder iBinder) {
        this.h.c.post(new jpx(this, iBinder, 13, (byte[]) null));
    }

    @Override // defpackage.ssv
    public final void b(ComponentName componentName) {
        this.h.c.post(new rzy(this, 16));
    }
}
