package defpackage;

import android.content.ComponentName;
import android.support.v4.media.session.MediaSessionCompat;

/* loaded from: classes2.dex */
public abstract class gqb implements hem, gbl {
    @Override // defpackage.gbl
    public final aiyk a() {
        fmn fmnVar = new fmn(dtx.m(d().b()), 6);
        gpz gpzVar = new gpz(null, dtx.m((eqj) d().a), dtx.m(d().d()), dtx.m((eqj) d().i), this);
        int i = aizc.a;
        return aiyr.a(new ajaq(gpzVar, fmnVar));
    }

    public abstract void b(MediaSessionCompat.Token token, ComponentName componentName, boolean z);

    public abstract void c(ComponentName componentName);

    public abstract usw d();
}
