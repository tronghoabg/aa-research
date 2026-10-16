package defpackage;

import android.bluetooth.BluetoothProfile;
import android.content.Context;
import j$.util.Optional;

/* loaded from: classes.dex */
public class oqz extends eql {
    public final Object a = new Object();
    public Optional h = Optional.empty();
    public final Context i;
    public final int j;

    protected oqz(Context context, int i) {
        this.i = context;
        this.j = i;
    }

    public final void b() {
        synchronized (this.a) {
            if (this.h.isEmpty()) {
                return;
            }
            Object obj = this.h.get();
            synchronized (obj) {
                ((oqi) obj).d = false;
                if (((oqi) obj).e.isPresent()) {
                    ((oqi) obj).a(((oqi) obj).f, (BluetoothProfile) ((oqi) obj).e.get());
                    ((oqi) obj).e = Optional.empty();
                }
            }
            this.h = Optional.empty();
        }
    }

    @Override // defpackage.eql, defpackage.eqj
    protected final void c() {
        super.c();
        r(oqt.a(), new ntw(this, 14));
    }

    @Override // defpackage.eql, defpackage.eqj
    protected final void d() {
        boolean zIsPresent;
        synchronized (this.a) {
            s(oqt.a());
            if (this.h.isPresent()) {
                Object obj = this.h.get();
                synchronized (obj) {
                    zIsPresent = ((oqi) obj).e.isPresent();
                }
                if (!zIsPresent) {
                    b();
                }
            }
            p();
        }
        super.d();
    }
}
