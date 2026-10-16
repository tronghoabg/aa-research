package defpackage;

import android.graphics.Path;
import android.os.Build;
import android.view.View;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;
import com.google.android.projection.gearhead.R;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class awp {
    public static final WeakHashMap a = new WeakHashMap();
    public final asr b;
    public final asr c;
    public final asr d;
    public final asr e;
    public final asr f;
    public final asr g;
    public final asr h;
    public final asr i;
    public final awl j;
    public final awo k;
    public final awo l;
    public final awo m;
    public final boolean n;
    private final asr o;
    private final bwq p;
    private final awl q;
    private final awl r;
    private final awl s;
    private final awl t;
    private final awl u;
    private final awl v;
    private final awl w;
    private int x;
    private final aut y;

    public awp(View view) {
        asr asrVar = new asr(4, "captionBar");
        this.b = asrVar;
        asr asrVar2 = new asr(128, "displayCutout");
        this.c = asrVar2;
        asr asrVar3 = new asr(8, CloudRecognizerProtocolStrings.IME);
        this.d = asrVar3;
        asr asrVar4 = new asr(32, "mandatorySystemGestures");
        this.e = asrVar4;
        asr asrVar5 = new asr(2, "navigationBars");
        this.f = asrVar5;
        asr asrVar6 = new asr(1, "statusBars");
        this.g = asrVar6;
        asr asrVar7 = new asr(519, "systemBars");
        this.h = asrVar7;
        asr asrVar8 = new asr(16, "systemGestures");
        this.i = asrVar8;
        asr asrVar9 = new asr(64, "tappableElement");
        this.o = asrVar9;
        dve dveVar = dve.a;
        awl awlVar = new awl(asl.u(dveVar), "waterfall");
        this.j = awlVar;
        this.p = new ParcelableSnapshotMutableState(null, bxp.c);
        awi awiVar = new awi(new awi(asrVar7, asrVar3), asrVar2);
        this.k = awiVar;
        awi awiVar2 = new awi(new awi(new awi(asrVar9, asrVar4), asrVar8), awlVar);
        this.l = awiVar2;
        this.m = new awi(awiVar, awiVar2);
        this.q = new awl(asl.u(dveVar), "captionBarIgnoringVisibility");
        this.r = new awl(asl.u(dveVar), "navigationBarsIgnoringVisibility");
        this.s = new awl(asl.u(dveVar), "statusBarsIgnoringVisibility");
        this.t = new awl(asl.u(dveVar), "systemBarsIgnoringVisibility");
        this.u = new awl(asl.u(dveVar), "tappableElementIgnoringVisibility");
        this.v = new awl(asl.u(dveVar), "imeAnimationTarget");
        this.w = new awl(asl.u(dveVar), "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.n = bool != null ? bool.booleanValue() : false;
        this.y = new aut(this);
        int[] iArr = ebm.a;
        ecy ecyVarA = ebf.a(view);
        if (ecyVarA != null) {
            asrVar.f(ecyVarA.z(4));
            asrVar2.f(ecyVarA.z(128));
            asrVar3.f(ecyVarA.z(8));
            asrVar4.f(ecyVarA.z(32));
            asrVar5.f(ecyVarA.z(2));
            asrVar6.f(ecyVarA.z(1));
            asrVar7.f(ecyVarA.z(519));
            asrVar8.f(ecyVarA.z(16));
            asrVar9.f(ecyVarA.z(64));
        }
    }

    public final void a(View view) {
        int i = this.x - 1;
        this.x = i;
        if (i == 0) {
            int[] iArr = ebm.a;
            ebe.e(view, null);
            lds.V(view, null);
            view.removeOnAttachStateChangeListener(this.y);
        }
    }

    public final void b(View view) {
        if (this.x == 0) {
            aut autVar = this.y;
            autVar.a = false;
            autVar.b = false;
            autVar.c = null;
            int[] iArr = ebm.a;
            ebe.e(view, autVar);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(autVar);
            lds.V(view, autVar);
        }
        this.x++;
    }

    public final void c(ecy ecyVar) {
        this.w.f(asl.u(ecyVar.f(8)));
    }

    public final void d(ecy ecyVar) {
        this.v.f(asl.u(ecyVar.f(8)));
    }

    public final void e(ecy ecyVar) {
        this.b.g(ecyVar);
        this.d.g(ecyVar);
        this.c.g(ecyVar);
        this.f.g(ecyVar);
        this.g.g(ecyVar);
        this.h.g(ecyVar);
        this.i.g(ecyVar);
        this.o.g(ecyVar);
        this.e.g(ecyVar);
        this.q.f(asl.u(ecyVar.g(4)));
        this.r.f(asl.u(ecyVar.g(2)));
        this.s.f(asl.u(ecyVar.g(1)));
        this.t.f(asl.u(ecyVar.g(519)));
        this.u.f(asl.u(ecyVar.g(64)));
        dzz dzzVarK = ecyVar.k();
        this.j.f(asl.u(dzzVarK != null ? dzzVarK.a() : dve.a));
        cjm cjmVar = null;
        if (dzzVarK != null) {
            Path cutoutPath = Build.VERSION.SDK_INT >= 31 ? dzzVarK.a.getCutoutPath() : null;
            if (cutoutPath != null) {
                cjmVar = new cjm(cutoutPath);
            }
        }
        this.p.b(cjmVar);
        byx.m();
    }
}
