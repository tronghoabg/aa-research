package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;

/* loaded from: classes3.dex */
public interface wja {
    void dismissAllowingStateLoss();

    Activity getActivity();

    Bundle getArguments();

    Dialog getDialog();

    boolean getShowsDialog();
}
