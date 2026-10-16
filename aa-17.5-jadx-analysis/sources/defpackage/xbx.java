package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
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

/* loaded from: classes3.dex */
public final class xbx extends sei {
    @Override // android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String string;
        Parcelable parcelable;
        String string2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getActivity(), R.style.CarFrxTheme_Error_New);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        View viewInflate = layoutInflaterCloneInContext.inflate(R.layout.car_frx_error, viewGroup, false);
        roc.bq(layoutInflaterCloneInContext, (ViewGroup) viewInflate);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.illustration);
        TextView textView = (TextView) viewInflate.findViewById(R.id.title);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.body);
        Button button = (Button) viewInflate.findViewById(R.id.right_button);
        imageView.setImageDrawable(contextThemeWrapper.getDrawable(2131231106));
        FsmController fsmControllerB = b();
        int i = this.b;
        ArrayList arrayList = fsmControllerB.f;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            string = null;
            if (i2 >= size) {
                FsmController.a.h().ai(8829).w("No state for stateId: %d ", i);
                parcelable = null;
                break;
            }
            FsmController.StackEntry stackEntry = (FsmController.StackEntry) arrayList.get(i2);
            i2++;
            if (stackEntry.d == i) {
                parcelable = stackEntry.b;
                break;
            }
        }
        Bundle bundle2 = (Bundle) parcelable;
        if (bundle2 != null) {
            string = bundle2.getString("errorTitle");
            string2 = bundle2.getString("errorMessage");
        } else {
            c(yzy.co);
            string2 = null;
        }
        if (string == null) {
            string = getString(R.string.frx_generic_error_title);
        }
        if (string2 == null) {
            string2 = getString(R.string.frx_generic_error_message);
        }
        textView.setText(string);
        textView2.setText(string2);
        button.setVisibility(0);
        button.setText(getString(R.string.frx_exit));
        button.setOnClickListener(new xao(this, 12));
        return viewInflate;
    }
}
