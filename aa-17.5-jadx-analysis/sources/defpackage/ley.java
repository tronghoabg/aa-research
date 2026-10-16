package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class ley extends let {
    public lex g;
    Button h;
    Button i;
    private int j = 0;
    private View.OnClickListener k;

    public final void i(View.OnClickListener onClickListener) {
        Button button = this.h;
        if (button != null) {
            button.setOnClickListener(onClickListener);
        }
        this.k = onClickListener;
    }

    public final void j(int i) {
        Button button = this.h;
        if (button != null) {
            button.setText(i);
        }
        this.j = i;
    }

    @Override // android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.g = (lex) requireActivity();
        View viewInflate = layoutInflater.cloneInContext(kfl.j(requireContext())).inflate(R.layout.wireless_permission_dialog, viewGroup);
        this.h = (Button) viewInflate.findViewById(R.id.start_button);
        int i = this.j;
        if (i != 0) {
            j(i);
        }
        View.OnClickListener onClickListener = this.k;
        if (onClickListener != null) {
            i(onClickListener);
        }
        this.i = (Button) viewInflate.findViewById(R.id.dont_show_again_button);
        return viewInflate;
    }

    @Override // defpackage.ao, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        h();
    }

    @Override // defpackage.ao, android.support.v4.app.Fragment
    public final void onStart() {
        super.onStart();
        lex lexVar = this.g;
        yph yphVar = lfc.a;
        if (lexVar.getApplicationContext().getSharedPreferences("PREFLIGHT_DONT_SHOW_AGAIN", 0).getInt("preflight_dismiss", 0) >= acvh.b()) {
            this.i.setVisibility(0);
            this.i.setText(R.string.dont_show_again);
            this.i.setOnClickListener(new kep(this, 10));
        }
    }
}
