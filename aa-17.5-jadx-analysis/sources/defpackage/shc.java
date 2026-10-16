package defpackage;

import android.content.ComponentName;
import android.os.IBinder;

/* loaded from: classes.dex */
public final class shc extends ssv {
    public final /* synthetic */ shi a;

    public shc(shi shiVar) {
        this.a = shiVar;
    }

    @Override // defpackage.ssv
    public final void a(ComponentName componentName, IBinder iBinder) {
        shi.a.f().ai(8945).u("Service available");
        this.a.e.post(new imp((Object) this, (Object) componentName, (Object) iBinder, 11, (byte[]) null));
    }

    @Override // defpackage.ssv
    public final void b(ComponentName componentName) {
        this.a.e.post(new sbj(this, componentName, 5, (byte[]) null));
    }
}
