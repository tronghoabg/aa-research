package defpackage;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class ntc extends Fragment {
    public static final yph a = yph.c("GH.NavFallback");

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ntc() {
        super(R.layout.navigation_fallback_fragment);
        leh.a();
    }

    @Override // android.support.v4.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        View viewFindViewById = view.findViewById(R.id.retry_button);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new ntb(0));
        }
        leh.a();
        ksa.d().e.fE(getViewLifecycleOwner(), new ntw(view, 1));
    }
}
