package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class eax extends defpackage.ebj {
    private final android.view.View a;

    public eax(android.view.View view) {
        this.a = view;
    }

    @Override // defpackage.ebj
    public void a() {
        android.view.View view = this.a;
        if (view != null) {
            ((android.view.inputmethod.InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    @Override // defpackage.ebj
    public void b() {
        android.view.View viewFindViewById;
        android.view.View view = this.a;
        if (view == null) {
            return;
        }
        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
            view.requestFocus();
            viewFindViewById = view;
        } else {
            viewFindViewById = view.getRootView().findFocus();
        }
        if (viewFindViewById == null) {
            viewFindViewById = view.getRootView().findViewById(android.R.id.content);
        }
        if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
            return;
        }
        viewFindViewById.post(new defpackage.eaw(viewFindViewById, 0));
    }
}
