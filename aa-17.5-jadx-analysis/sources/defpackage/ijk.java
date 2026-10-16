package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes2.dex */
public final class ijk extends cmw implements bxq {
    public final Drawable a;
    public final bwq b;
    public final bwq c;
    private final aezr d;

    public ijk(Drawable drawable) {
        drawable.getClass();
        this.a = drawable;
        bxp bxpVar = bxp.c;
        this.b = new ParcelableSnapshotMutableState(0, bxpVar);
        this.c = new ParcelableSnapshotMutableState(new cjd(ijl.a(drawable)), bxpVar);
        this.d = woy.dG(new gzm(this, 12));
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // defpackage.cmw
    public final long a() {
        return ((cjd) this.c.a()).a;
    }

    @Override // defpackage.cmw
    protected final void b(cmd cmdVar) {
        cju cjuVarB = cmdVar.r().b();
        g();
        int iK = afgi.k(Float.intBitsToFloat((int) (cmdVar.o() >> 32)));
        int iK2 = afgi.k(Float.intBitsToFloat((int) (cmdVar.o() & 4294967295L)));
        Drawable drawable = this.a;
        drawable.setBounds(0, 0, iK, iK2);
        try {
            cjuVarB.g();
            drawable.draw(cjf.a(cjuVarB));
        } finally {
            cjuVarB.e();
        }
    }

    @Override // defpackage.cmw
    protected final boolean c(float f) {
        this.a.setAlpha(afpt.g(afgi.k(f * 255.0f), 0, 255));
        return true;
    }

    @Override // defpackage.cmw
    protected final boolean d(cjw cjwVar) {
        this.a.setColorFilter(cjwVar != null ? cjwVar.b : null);
        return true;
    }

    @Override // defpackage.bxq
    public final void eW() {
        eX();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bxq
    public final void eX() {
        Drawable drawable = this.a;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bxq
    public final void eo() {
        Drawable.Callback callback = (Drawable.Callback) this.d.a();
        Drawable drawable = this.a;
        drawable.setCallback(callback);
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    @Override // defpackage.cmw
    protected final void f(dlr dlrVar) {
        int i;
        dlrVar.getClass();
        int iOrdinal = dlrVar.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                throw new aezs();
            }
        } else {
            i = 0;
        }
        this.a.setLayoutDirection(i);
    }

    public final int g() {
        return ((Number) this.b.a()).intValue();
    }
}
