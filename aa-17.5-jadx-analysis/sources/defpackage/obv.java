package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.handwriting.gui.UIHandler;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class obv extends Fragment {
    public View a;
    private final View.OnLayoutChangeListener b = new obt(this, 0);

    public static obv a(CharSequence charSequence) {
        obv obvVar = new obv();
        Bundle bundle = new Bundle();
        if (charSequence.length() > 120) {
            charSequence = String.valueOf(String.valueOf(charSequence.subSequence(0, 120))).concat(UIHandler.ContinuousWritingQueue.PLACEHOLDER);
        }
        bundle.putCharSequence("toast_text_key", charSequence);
        obvVar.setArguments(bundle);
        return obvVar;
    }

    @Override // android.support.v4.app.Fragment
    public final void onAttach(Context context) throws AssertionError {
        super.onAttach(context);
        tec.c(this, obu.class);
    }

    @Override // android.support.v4.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        ((obu) tec.b(this, obu.class)).d();
        super.onConfigurationChanged(configuration);
    }

    @Override // android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        leh.a();
        return layoutInflater.inflate(R.layout.toast_fragment, viewGroup, false);
    }

    @Override // android.support.v4.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        TextView textView = (TextView) view.findViewById(R.id.toast);
        textView.setText(requireArguments().getCharSequence("toast_text_key"));
        leh.a();
        this.a = view.findViewById(R.id.shadow);
        textView.addOnLayoutChangeListener(this.b);
        ksa.d().e.fE(getViewLifecycleOwner(), new jue(textView, view, 9));
    }
}
