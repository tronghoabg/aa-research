package defpackage;

import java.util.LinkedList;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class zza {
    public boolean a;
    protected final zzb b;

    public zza(zzb zzbVar) {
        this.b = zzbVar;
    }

    public final void a(zzf zzfVar) {
        if (!this.a) {
            throw new IllegalStateException("Gesture already inactive: ".concat(String.valueOf(getClass().getName())));
        }
        this.a = false;
        b(zzfVar);
    }

    protected abstract void b(zzf zzfVar);

    protected abstract boolean c(zzf zzfVar);

    public boolean d() {
        return false;
    }

    public boolean e() {
        return false;
    }

    public boolean f() {
        return false;
    }

    protected abstract boolean g(zzf zzfVar);

    protected abstract int h(long j, LinkedList linkedList, List list);
}
