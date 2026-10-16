package u0;

import E.C0421k;
import N.C0718d;
import N.C0729i0;
import N.C0740o;
import android.content.Context;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class L extends AbstractC4162a {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f46134j = 0;

    /* renamed from: h, reason: collision with root package name */
    public final N.Y f46135h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f46136i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(Context context) {
        super(context, null, 0);
        AbstractC3340k.e(context, "context");
        setClipChildren(false);
        setClipToPadding(false);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.T t10 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.T(this, 5);
        addOnAttachStateChangeListener(t10);
        V v2 = new V();
        android.support.v4.media.session.b.g0(this).f44318a.add(v2);
        this.f46183e = new A0.d(this, t10, v2, 2);
        this.f46135h = C0718d.G(null, N.P.f7730f);
    }

    @Override // u0.AbstractC4162a
    public final void a(int i5, C0740o c0740o) {
        c0740o.N(420213850);
        tf.p pVar = (tf.p) this.f46135h.getValue();
        if (pVar != null) {
            pVar.invoke(c0740o, 0);
        }
        C0729i0 c0729i0R = c0740o.r();
        if (c0729i0R == null) {
            return;
        }
        c0729i0R.f7788d = new C0421k(this, i5, 7);
    }

    @Override // android.view.ViewGroup, android.view.View
    @NotNull
    public CharSequence getAccessibilityClassName() {
        return L.class.getName();
    }

    @Override // u0.AbstractC4162a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f46136i;
    }

    public final void setContent(@NotNull tf.p content) {
        AbstractC3340k.e(content, "content");
        this.f46136i = true;
        this.f46135h.setValue(content);
        if (isAttachedToWindow()) {
            if (this.f46182d == null && !isAttachedToWindow()) {
                throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
            }
            c();
        }
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
