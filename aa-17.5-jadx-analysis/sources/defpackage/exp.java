package defpackage;

import android.R;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.TextView;
import androidx.preference.DialogPreference;

/* loaded from: classes2.dex */
public abstract class exp extends ao implements DialogInterface.OnClickListener {
    private DialogPreference g;
    private CharSequence h;
    private CharSequence i;
    private CharSequence j;
    public int k;
    private CharSequence l;
    private int m;
    private BitmapDrawable n;

    @Override // defpackage.ao
    public final Dialog gn(Bundle bundle) {
        this.k = -2;
        em emVar = new em(requireContext());
        emVar.o(this.h);
        emVar.f(this.n);
        emVar.l(this.i, this);
        emVar.j(this.j, this);
        requireContext();
        int i = this.m;
        View viewInflate = i != 0 ? getLayoutInflater().inflate(i, (ViewGroup) null) : null;
        if (viewInflate != null) {
            h(viewInflate);
            emVar.p(viewInflate);
        } else {
            emVar.h(this.l);
        }
        eU(emVar);
        en enVarB = emVar.b();
        if (l()) {
            Window window = enVarB.getWindow();
            if (Build.VERSION.SDK_INT >= 30) {
                window.getDecorView().getWindowInsetsController().show(WindowInsets.Type.ime());
                return enVarB;
            }
            j();
        }
        return enVarB;
    }

    protected void h(View view) {
        int i;
        View viewFindViewById = view.findViewById(R.id.message);
        if (viewFindViewById != null) {
            CharSequence charSequence = this.l;
            if (TextUtils.isEmpty(charSequence)) {
                i = 8;
            } else {
                i = 0;
                if (viewFindViewById instanceof TextView) {
                    ((TextView) viewFindViewById).setText(charSequence);
                }
            }
            if (viewFindViewById.getVisibility() != i) {
                viewFindViewById.setVisibility(i);
            }
        }
    }

    public abstract void i(boolean z);

    protected boolean l() {
        return false;
    }

    public final DialogPreference m() {
        DialogPreference dialogPreference = this.g;
        if (dialogPreference != null) {
            return dialogPreference;
        }
        DialogPreference dialogPreference2 = (DialogPreference) ((exd) getTargetFragment()).a(requireArguments().getString("key"));
        this.g = dialogPreference2;
        return dialogPreference2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.k = i;
    }

    @Override // defpackage.ao, android.support.v4.app.Fragment
    /* renamed from: onCreate */
    public void m107lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m107lambda$performCreate$3$androidsupportv4appFragment(bundle);
        eqa targetFragment = getTargetFragment();
        if (!(targetFragment instanceof exd)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        exd exdVar = (exd) targetFragment;
        String string = requireArguments().getString("key");
        if (bundle != null) {
            this.h = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.i = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.j = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.l = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.m = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.n = new BitmapDrawable(getResources(), bitmap);
                return;
            }
            return;
        }
        DialogPreference dialogPreference = (DialogPreference) exdVar.a(string);
        this.g = dialogPreference;
        this.h = dialogPreference.a;
        this.i = dialogPreference.d;
        this.j = dialogPreference.e;
        this.l = dialogPreference.b;
        this.m = dialogPreference.f;
        Drawable drawable = dialogPreference.c;
        if (drawable == null || (drawable instanceof BitmapDrawable)) {
            this.n = (BitmapDrawable) drawable;
            return;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        this.n = new BitmapDrawable(getResources(), bitmapCreateBitmap);
    }

    @Override // defpackage.ao, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        i(this.k == -1);
    }

    @Override // defpackage.ao, android.support.v4.app.Fragment
    /* renamed from: onSaveInstanceState */
    public void m117x22bc4f96(Bundle bundle) {
        super.m117x22bc4f96(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.h);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.i);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.j);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.l);
        bundle.putInt("PreferenceDialogFragment.layout", this.m);
        BitmapDrawable bitmapDrawable = this.n;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    protected void j() {
    }

    protected void eU(em emVar) {
    }
}
