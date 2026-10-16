package u0;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import k1.C3115b;
import kotlin.jvm.internal.AbstractC3340k;
import l1.C3375e;
import x0.C4438h;
import x0.C4440j;
import x0.C4441k;
import x0.InterfaceC4439i;

/* renamed from: u0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4184l extends C3115b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t0.t f46250d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4188n f46251e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4188n f46252f;

    public C4184l(t0.t tVar, C4188n c4188n, C4188n c4188n2) {
        this.f46250d = tVar;
        this.f46251e = c4188n;
        this.f46252f = c4188n2;
    }

    @Override // k1.C3115b
    public final void d(View host, C3375e c3375e) {
        AbstractC3340k.e(host, "host");
        View.AccessibilityDelegate accessibilityDelegate = this.f38800a;
        AccessibilityNodeInfo accessibilityNodeInfo = c3375e.f39862a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(host, accessibilityNodeInfo);
        C4438h c4438hV = S3.f.v(this.f46250d);
        AbstractC3340k.b(c4438hV);
        c4438hV.j();
        int i5 = ((C4440j) ((InterfaceC4439i) ((Z.j) c4438hV.f15789c))).f47597a;
        t0.t tVarJ = ((t0.y) c4438hV.f15788b).f45561e.j();
        while (true) {
            if (tVarJ == null) {
                tVarJ = null;
                break;
            } else {
                if (S3.f.v(tVarJ) != null) {
                    break;
                } else {
                    tVarJ = tVarJ.j();
                }
            }
        }
        C4438h c4438hV2 = tVarJ != null ? S3.f.v(tVarJ) : null;
        C4441k c4441k = c4438hV2 != null ? new C4441k(c4438hV2, false) : null;
        AbstractC3340k.b(c4441k);
        int i10 = this.f46251e.getSemanticsOwner().a().f47604f;
        int i11 = c4441k.f47604f;
        if (i11 == i10) {
            i11 = -1;
        }
        C4188n c4188n = this.f46252f;
        c3375e.f39863b = i11;
        accessibilityNodeInfo.setParent(c4188n, i11);
    }
}
