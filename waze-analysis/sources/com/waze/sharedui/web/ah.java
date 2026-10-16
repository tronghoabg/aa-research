package com.waze.sharedui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;
import com.waze.uid.c.bt;
import com.waze.uid.state_impl.util.InstallParameters;
import com.waze.view.popups.RequestAlwaysLocationDialogActivity;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class ah implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f39312a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f39313b;

    public /* synthetic */ ah(Object obj, int i2) {
        this.f39313b = i2;
        this.f39312a = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        int i3 = this.f39313b;
        if (i3 == 0) {
            int i4 = ai.f39314b;
            ((JsResult) this.f39312a).cancel();
            return;
        }
        if (i3 == 1) {
            int i5 = ai.f39314b;
            ((JsResult) this.f39312a).confirm();
            return;
        }
        if (i3 == 2) {
            ((bt) this.f39312a).D(InstallParameters.Result.NEW_USER, InstallParameters.Community.GOOGLE);
            return;
        }
        if (i3 == 3) {
            ((bt) this.f39312a).D(InstallParameters.Result.NEW_USER, InstallParameters.Community.EMAIL);
            return;
        }
        Object obj = this.f39312a;
        if (i3 != 4) {
            RequestAlwaysLocationDialogActivity.o((RequestAlwaysLocationDialogActivity) obj, i2);
        } else {
            ((bt) obj).D(InstallParameters.Result.GUEST, null);
        }
    }
}
