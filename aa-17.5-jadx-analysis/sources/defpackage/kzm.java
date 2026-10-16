package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class kzm extends Fragment {
    public View a;

    public final void a(yzy yzyVar) {
        ((kzl) tec.b(this, kzl.class)).a(yzyVar);
    }

    @Override // android.support.v4.app.Fragment
    public final void onAttach(Context context) throws AssertionError {
        super.onAttach(context);
        tec.c(this, kzl.class);
    }

    @Override // android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        final View viewInflate = layoutInflater.inflate(R.layout.assistant_scrim, viewGroup, false);
        this.a = viewInflate;
        viewInflate.setOnClickListener(new kep(this, 6));
        viewInflate.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: kzk
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                if (view == viewInflate && z) {
                    this.a.a(yzy.Li);
                }
            }
        });
        return this.a;
    }

    @Override // android.support.v4.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        if (acxa.V()) {
            lej.a();
            if (!acrz.k()) {
                this.a.setBackgroundColor(-16776961);
                this.a.setAlpha(0.15f);
                return;
            }
        }
        if (leh.a().b()) {
            this.a.setBackgroundColor(0);
        } else {
            ksa.d().e.fE(getViewLifecycleOwner(), new kqc(this, 10));
        }
    }
}
