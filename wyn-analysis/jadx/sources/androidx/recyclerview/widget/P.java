package androidx.recyclerview.widget;

import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class P {

    /* renamed from: a, reason: collision with root package name */
    public N f18779a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f18780b;

    /* renamed from: c, reason: collision with root package name */
    public long f18781c;

    /* renamed from: d, reason: collision with root package name */
    public long f18782d;

    /* renamed from: e, reason: collision with root package name */
    public long f18783e;

    /* renamed from: f, reason: collision with root package name */
    public long f18784f;

    public static void b(m0 m0Var) {
        int i5 = m0Var.mFlags;
        if (!m0Var.isInvalid() && (i5 & 4) == 0) {
            m0Var.getOldPosition();
            m0Var.getAbsoluteAdapterPosition();
        }
    }

    public abstract boolean a(m0 m0Var, m0 m0Var2, O o7, O o10);

    public final void c(m0 m0Var) {
        N n10 = this.f18779a;
        if (n10 != null) {
            G g9 = (G) n10;
            g9.getClass();
            m0Var.setIsRecyclable(true);
            if (m0Var.mShadowedHolder != null && m0Var.mShadowingHolder == null) {
                m0Var.mShadowedHolder = null;
            }
            m0Var.mShadowingHolder = null;
            if (m0Var.shouldBeKeptAsChild()) {
                return;
            }
            View view = m0Var.itemView;
            RecyclerView recyclerView = g9.f18766a;
            if (recyclerView.removeAnimatingView(view) || !m0Var.isTmpDetached()) {
                return;
            }
            recyclerView.removeDetachedView(m0Var.itemView, false);
        }
    }

    public abstract void d(m0 m0Var);

    public abstract void e();

    public abstract boolean f();
}
