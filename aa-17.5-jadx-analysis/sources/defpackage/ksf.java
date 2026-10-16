package defpackage;

import android.R;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.util.TypedValue;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class ksf implements lhg {
    public final eqm c;
    private final Context e;
    private final ComponentCallbacks f;
    public static final kse a = new kse();
    private static final yph d = yph.c("GH.PrimaryColorProvider");
    public static final afgl b = new kkp(mki.b, 3);

    public /* synthetic */ ksf(byte[] bArr) {
        Context context = mki.a.c;
        context.getClass();
        eqm eqmVar = new eqm(null);
        context.getClass();
        this.e = context;
        this.c = eqmVar;
        this.f = new rao(this, 1);
    }

    public static final ksf b() {
        return a.a();
    }

    public final int a(int i) {
        int i2 = this.e.getResources().getConfiguration().uiMode & 48;
        abzv abzvVar = new abzv(i);
        double d2 = abzvVar.a;
        double d3 = abzvVar.b;
        double d4 = 0.0d;
        double d5 = 150.0d;
        double d6 = 0.0d;
        while (d4 <= d5) {
            double d7 = i2 == 32 ? 80.0d : 50.0d;
            double d8 = ((d5 - d4) / 2.0d) + d4;
            woy.dN(d2, d8, new HashMap());
            double d9 = new abzv(new abzz(d2, d8).a((int) d7)).b;
            if (Math.abs(d9 - d3) < 0.5d) {
                d4 = d8 + 0.01d;
                d6 = d8;
            } else if (d9 < d3) {
                d4 = d8 + 0.01d;
            } else {
                d5 = (-0.01d) + d8;
            }
        }
        return new abzv(abzw.b(d2, d6 > 48.0d ? d6 : 48.0d, 50.0d)).c;
    }

    @Override // defpackage.lhg
    public final void c() {
        ((ype) d.f()).u("Setting up on lifetime start");
        f();
    }

    @Override // defpackage.lhg
    public final void d() {
        ((ype) d.f()).u("Tearing down on lifetime stop");
        e();
    }

    public final void e() {
        ((ype) d.f()).u("onProjectionEnd");
        this.e.unregisterComponentCallbacks(this.f);
    }

    public final void f() {
        ((ype) d.f()).u("onProjectionStart");
        this.e.registerComponentCallbacks(this.f);
        g();
    }

    public final void g() {
        if (acpc.a.gu().w()) {
            Context context = this.e;
            TypedValue typedValueX = woy.x(context.getTheme(), R.attr.colorPrimary);
            Integer numValueOf = typedValueX != null ? Integer.valueOf(woy.p(context, typedValueX)) : null;
            if (numValueOf == null) {
                ((ype) d.f()).u("Phone primary color is null");
                this.c.m(null);
                return;
            }
            yph yphVar = d;
            ((ype) yphVar.f()).w("Retrieved phone primary color: 0x%x", numValueOf.intValue());
            int iA = a(numValueOf.intValue());
            ((ype) yphVar.f()).w("Extracted seed color: 0x%x", numValueOf.intValue());
            this.c.m(Integer.valueOf(iA));
            return;
        }
        if (!((mkq) mki.a.i(mkq.class)).a().g("key_settings_use_phone_wallpaper", true)) {
            ((ype) d.f()).u("Not using phone wallpaper, setting seed color to null");
            this.c.m(null);
            return;
        }
        Context context2 = this.e;
        TypedValue typedValueX2 = woy.x(context2.getTheme(), R.attr.colorPrimary);
        Integer numValueOf2 = typedValueX2 != null ? Integer.valueOf(woy.p(context2, typedValueX2)) : null;
        if (numValueOf2 == null) {
            ((ype) d.f()).u("Phone primary color is null");
            return;
        }
        yph yphVar2 = d;
        ((ype) yphVar2.f()).w("Retrieved phone primary color: 0x%x", numValueOf2.intValue());
        int iA2 = a(numValueOf2.intValue());
        ((ype) yphVar2.f()).w("Extracted seed color: 0x%x", numValueOf2.intValue());
        this.c.m(Integer.valueOf(iA2));
    }

    public ksf() {
        this(null);
    }
}
