package defpackage;

import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class epk {
    public Object a;
    public Object b;
    public final Object c;

    public epk(byte[] bArr) {
        long[] jArr = aao.a;
        this.c = new aan(6);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map$Entry] */
    public final Map.Entry a() {
        ?? r1 = this.a;
        if (r1 != 0) {
            return r1;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public final boolean b(Object obj) {
        obj.getClass();
        return aan.f((aan) this.c, obj);
    }

    public final boolean c(int i) {
        Object obj;
        if (i == 7 || i == 2 || i == 6 || i == 5 || i == 3 || i == 4) {
            e();
        } else if (i != 1 && i != 0) {
            throw new IllegalStateException("invalid ImeAction");
        }
        if (i == 6) {
            d().i(1, true);
            return true;
        }
        if (i == 5) {
            d().i(2, true);
            return true;
        }
        if (i != 7 || (obj = this.c) == null) {
            return false;
        }
        ((sm) obj).q();
        return true;
    }

    public final cic d() {
        Object obj = this.a;
        if (obj != null) {
            return (cic) obj;
        }
        affa.d("focusManager");
        return null;
    }

    public final void e() {
        if (this.b != null) {
            return;
        }
        affa.d("keyboardActions");
    }

    public final int f() {
        if (i().a.isEmpty()) {
            return -1;
        }
        return (int) afpt.h(((bav) woy.bF(i().a)).a - i().h, 0L);
    }

    public final int g() {
        if (i().a.isEmpty()) {
            return -1;
        }
        return (int) afpt.i(((bav) woy.bK(i().a)).a + i().h, h() - 1);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [afdr, java.lang.Object] */
    public final int h() {
        return ((Number) this.c.invoke()).intValue();
    }

    public final bbj i() {
        Object obj = this.a;
        if (obj != null) {
            return (bbj) obj;
        }
        affa.d("layoutInfo");
        return null;
    }

    public final void j(int[] iArr) {
        iArr[0] = f();
    }

    public final void k(int[] iArr) {
        iArr[0] = g();
    }

    public final void l(int[] iArr) {
        if (i().a.isEmpty()) {
            iArr[0] = 0;
        } else {
            iArr[0] = Math.abs(((((bav) woy.bK(i().a)).h + i().b) + i().c) - i().g);
        }
    }

    public final void m(int[] iArr) {
        if (i().a.isEmpty()) {
            iArr[0] = 0;
        } else {
            iArr[0] = Math.abs(afpt.f(((bav) woy.bF(i().a)).h + (-i().f), 0));
        }
    }

    public final boolean n() {
        return !i().a.isEmpty();
    }

    public final List o(int i, afec afecVar) {
        long j = i().s;
        Object obj = this.b;
        if (obj == null) {
            affa.d("state");
            obj = null;
        }
        return woy.bg(((azt) obj).a(i, j, true, new aju(afecVar, this, 17)));
    }

    public final void p() {
        dlg dlgVar = i().r;
    }

    public final void q() {
        afp.V(i());
    }

    public epk() {
        this.c = new aan(6);
    }

    public epk(Object obj) {
        this.c = obj;
    }
}
