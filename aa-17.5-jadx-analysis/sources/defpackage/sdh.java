package defpackage;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.carsetup.fsm.impl.FsmController;
import com.google.android.projection.gearhead.R;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class sdh extends sei {
    @Override // android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String string;
        String string2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), R.style.CarFrxTheme_Error_New);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        View viewInflate = layoutInflaterCloneInContext.inflate(R.layout.car_frx_error, viewGroup, false);
        qrv.s(layoutInflaterCloneInContext, (ViewGroup) viewInflate);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.illustration);
        TextView textView = (TextView) viewInflate.findViewById(R.id.title);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.body);
        imageView.setImageDrawable(contextThemeWrapper.getDrawable(2131231106));
        Button button = (Button) viewInflate.findViewById(R.id.right_button);
        FsmController fsmControllerB = b();
        int i = this.b;
        ArrayList arrayList = fsmControllerB.f;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            FsmController.StackEntry stackEntry = (FsmController.StackEntry) arrayList.get(i2);
            i2++;
            if (stackEntry.d == i) {
                Bundle bundle2 = (Bundle) stackEntry.b;
                if (bundle2 != null) {
                    string2 = bundle2.getString("errorTitle");
                    string = bundle2.getString("errorMessage");
                } else {
                    string = null;
                    string2 = null;
                }
                if (string2 == null) {
                    string2 = getString(R.string.common_something_went_wrong);
                }
                if (string == null) {
                    string = getString(R.string.car_frx_generic_error_message, sev.d(getContext(), ((seb) b().l).z()));
                }
                textView.setText(string2);
                textView2.setText(string);
                button.setVisibility(0);
                button.setText(getString(R.string.car_setup_exit));
                button.setOnClickListener(new onh(this, 20, null));
                return viewInflate;
            }
        }
        throw new RuntimeException(a.bp(i, "No state for stateId "));
    }
}
