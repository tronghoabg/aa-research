package q;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import j.C3065b;
import j.C3068e;
import j.DialogInterfaceC3069f;

/* loaded from: classes.dex */
public final class G implements L, DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public DialogInterfaceC3069f f43652a;

    /* renamed from: b, reason: collision with root package name */
    public H f43653b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f43654c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ M f43655d;

    public G(M m10) {
        this.f43655d = m10;
    }

    @Override // q.L
    public final boolean a() {
        DialogInterfaceC3069f dialogInterfaceC3069f = this.f43652a;
        if (dialogInterfaceC3069f != null) {
            return dialogInterfaceC3069f.isShowing();
        }
        return false;
    }

    @Override // q.L
    public final int b() {
        return 0;
    }

    @Override // q.L
    public final void c(int i5) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // q.L
    public final CharSequence d() {
        return this.f43654c;
    }

    @Override // q.L
    public final void dismiss() {
        DialogInterfaceC3069f dialogInterfaceC3069f = this.f43652a;
        if (dialogInterfaceC3069f != null) {
            dialogInterfaceC3069f.dismiss();
            this.f43652a = null;
        }
    }

    @Override // q.L
    public final Drawable e() {
        return null;
    }

    @Override // q.L
    public final void f(CharSequence charSequence) {
        this.f43654c = charSequence;
    }

    @Override // q.L
    public final void g(int i5) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // q.L
    public final void h(int i5) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // q.L
    public final void i(int i5, int i10) {
        if (this.f43653b == null) {
            return;
        }
        M m10 = this.f43655d;
        C3068e c3068e = new C3068e(m10.getPopupContext());
        CharSequence charSequence = this.f43654c;
        if (charSequence != null) {
            c3068e.setTitle(charSequence);
        }
        H h10 = this.f43653b;
        int selectedItemPosition = m10.getSelectedItemPosition();
        C3065b c3065b = c3068e.f38456a;
        c3065b.k = h10;
        c3065b.f38422l = this;
        c3065b.f38425o = selectedItemPosition;
        c3065b.f38424n = true;
        DialogInterfaceC3069f dialogInterfaceC3069fCreate = c3068e.create();
        this.f43652a = dialogInterfaceC3069fCreate;
        AlertController$RecycleListView alertController$RecycleListView = dialogInterfaceC3069fCreate.f38460f.f38435e;
        AbstractC3799E.d(alertController$RecycleListView, i5);
        AbstractC3799E.c(alertController$RecycleListView, i10);
        this.f43652a.show();
    }

    @Override // q.L
    public final int j() {
        return 0;
    }

    @Override // q.L
    public final void k(ListAdapter listAdapter) {
        this.f43653b = (H) listAdapter;
    }

    @Override // q.L
    public final void l(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i5) {
        M m10 = this.f43655d;
        m10.setSelection(i5);
        if (m10.getOnItemClickListener() != null) {
            m10.performItemClick(null, i5, this.f43653b.getItemId(i5));
        }
        dismiss();
    }
}
