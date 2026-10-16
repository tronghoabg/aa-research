package f8;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import l1.C3375e;

/* loaded from: classes4.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f35176a;

    /* renamed from: b, reason: collision with root package name */
    public final m f35177b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f35178c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f35179d;

    public n(m mVar) {
        this.f35176a = mVar.f35155a;
        this.f35177b = mVar;
        this.f35178c = mVar.getContext();
        this.f35179d = mVar.f35161g;
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public com.unity3d.services.core.webview.b h() {
        return null;
    }

    public boolean i(int i5) {
        return true;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return this instanceof j;
    }

    public boolean l() {
        return false;
    }

    public final void q() {
        this.f35177b.e(false);
    }

    public void a() {
    }

    public void b() {
    }

    public void r() {
    }

    public void s() {
    }

    public void m(EditText editText) {
    }

    public void n(C3375e c3375e) {
    }

    public void o(AccessibilityEvent accessibilityEvent) {
    }

    public void p(boolean z2) {
    }
}
