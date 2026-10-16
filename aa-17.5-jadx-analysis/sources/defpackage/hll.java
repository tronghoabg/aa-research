package defpackage;

import android.view.MotionEvent;
import android.view.View;
import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class hll implements View.OnGenericMotionListener, View.OnTouchListener {
    public float a;
    public float b;
    public boolean c;
    private final geu d;
    private final hlk e;
    private boolean f;
    private final ieb g;

    public hll(geu geuVar, hlk hlkVar, long j) {
        this.d = geuVar;
        this.e = hlkVar;
        this.g = new ieb(geuVar, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x014f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hll.a(android.view.MotionEvent):void");
    }

    public final void b(boolean z) {
        this.f = z;
        if (!this.c || z) {
            return;
        }
        c(false);
    }

    public final void c(boolean z) {
        boolean z2 = this.c;
        this.c = z;
        if (z2 != z) {
            this.e.m(z);
        }
    }

    public final boolean d(int i) {
        float f;
        if (!this.c) {
            return false;
        }
        geu geuVar = this.d;
        ges gesVarH = geuVar.h();
        if (!gesVarH.e()) {
            return false;
        }
        float f2 = -50.0f;
        if (i == 21) {
            f = 0.0f;
        } else {
            f = 50.0f;
            if (i == 22) {
                f2 = 50.0f;
                f = 0.0f;
            } else if (i == 19) {
                f = -50.0f;
                f2 = 0.0f;
            } else {
                f2 = 0.0f;
                if (i != 20) {
                    f = 0.0f;
                }
            }
        }
        if (f2 == BitmapDescriptorFactory.HUE_RED && f == BitmapDescriptorFactory.HUE_RED) {
            return false;
        }
        gesVarH.d(f2, f);
        geuVar.k().d(gnr.a(16));
        return true;
    }

    public final acjs e(geu geuVar, ActionStrip actionStrip) {
        ArrayList arrayList = new ArrayList();
        Iterator<Action> it = actionStrip.getActions().iterator();
        int i = 0;
        int i2 = -1;
        while (true) {
            ajmd ajmdVar = null;
            if (!it.hasNext()) {
                ajju ajjuVar = new ajju(arrayList, (byte[]) null, (byte[]) null);
                ajjuVar.a = i2;
                return ajjuVar.r();
            }
            Action next = it.next();
            if (next.getType() == 65540) {
                if (!geuVar.x().a()) {
                    ajmdVar = new ajmd(this);
                    if (this.c && geuVar.x().b()) {
                        i2 = i;
                    }
                }
            }
            arrayList.add(new hig(next, ajmdVar));
            i++;
        }
    }

    @Override // android.view.View.OnGenericMotionListener
    public final boolean onGenericMotion(View view, MotionEvent motionEvent) {
        if (!this.c || !this.f || motionEvent.getAction() == 8) {
            return false;
        }
        a(motionEvent);
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f) {
            return false;
        }
        a(motionEvent);
        return true;
    }
}
