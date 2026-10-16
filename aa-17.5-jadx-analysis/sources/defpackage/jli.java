package defpackage;

import android.content.ComponentName;
import android.os.IBinder;

/* loaded from: classes2.dex */
public final class jli extends rhu {
    public final /* synthetic */ jln a;

    public jli(jln jlnVar) {
        this.a = jlnVar;
    }

    @Override // defpackage.rhu
    public final void a(ComponentName componentName, IBinder iBinder) {
        ((ype) ((ype) jln.a.f()).ai((char) 2297)).u("Service available");
        this.a.e.post(new jda((Object) this, (Object) componentName, (Object) iBinder, 6, (char[]) null));
    }

    @Override // defpackage.rhu
    public final void b(ComponentName componentName) {
        this.a.e.post(new jlh(this, componentName, 0));
    }
}
