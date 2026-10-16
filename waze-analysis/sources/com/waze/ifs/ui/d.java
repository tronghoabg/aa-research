package com.waze.ifs.ui;

import android.content.Intent;
import android.view.View;
import com.waze.google_assistant.SpeechRecognizerActivity;
import com.waze.settings.gw;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class d implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f24543a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f24544b;

    d(EditTextDialogActivity editTextDialogActivity, int i2) {
        this.f24544b = i2;
        Objects.requireNonNull(editTextDialogActivity);
        this.f24543a = editTextDialogActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i2 = this.f24544b;
        if (i2 == 0) {
            h.b((h) this.f24543a);
            return;
        }
        if (i2 == 1) {
            EditTextDialogActivity editTextDialogActivity = (EditTextDialogActivity) this.f24543a;
            EditTextDialogActivity.l(editTextDialogActivity);
            editTextDialogActivity.finish();
            return;
        }
        if (i2 == 2) {
            android.support.v4.app.ar arVar = (android.support.v4.app.ar) this.f24543a;
            arVar.startActivityForResult(new Intent(arVar.getActivity(), (Class<?>) SpeechRecognizerActivity.class), 4097);
            return;
        }
        Object obj = this.f24543a;
        if (i2 != 3) {
            ((s) ((android.support.v4.app.ar) obj).getActivity()).bF(-1, null, null, false);
            return;
        }
        w wVar = (w) obj;
        if (!wVar.f24587c && !wVar.f24596l) {
            ((android.support.v4.app.ar) obj).requireActivity().finish();
            return;
        }
        gw gwVarD = wVar.r.d();
        if (gwVarD != null) {
            w.j(wVar, wVar.r.c(), gwVarD, false);
        }
    }

    d(h hVar, int i2) {
        this.f24544b = i2;
        Objects.requireNonNull(hVar);
        this.f24543a = hVar;
    }

    d(h hVar, int i2, byte[] bArr) {
        this.f24544b = i2;
        Objects.requireNonNull(hVar);
        this.f24543a = hVar;
    }

    d(w wVar, int i2) {
        this.f24544b = i2;
        Objects.requireNonNull(wVar);
        this.f24543a = wVar;
    }

    d(w wVar, int i2, byte[] bArr) {
        this.f24544b = i2;
        Objects.requireNonNull(wVar);
        this.f24543a = wVar;
    }
}
