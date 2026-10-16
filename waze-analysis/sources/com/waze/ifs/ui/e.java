package com.waze.ifs.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import com.waze.settings.gw;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class e implements TextView.OnEditorActionListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f24545a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f24546b;

    e(EditTextDialogActivity editTextDialogActivity, int i2) {
        this.f24546b = i2;
        Objects.requireNonNull(editTextDialogActivity);
        this.f24545a = editTextDialogActivity;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
        int i3 = this.f24546b;
        if (i3 == 0) {
            if (keyEvent != null && keyEvent.getAction() == 1) {
                h.b((h) this.f24545a);
            }
            return true;
        }
        if (i3 == 1) {
            if (keyEvent != null && keyEvent.getAction() == 1) {
                EditTextDialogActivity editTextDialogActivity = (EditTextDialogActivity) this.f24545a;
                EditTextDialogActivity.l(editTextDialogActivity);
                editTextDialogActivity.finish();
            }
            return true;
        }
        w wVar = (w) this.f24545a;
        if (!wVar.m) {
            if (!wVar.f24588d || wVar.t.f37349b.length() < 2) {
                return false;
            }
            w.j(wVar, wVar.f24586b.length, wVar.t, true);
            return false;
        }
        if (wVar.s.getCount() > 0) {
            gw gwVar = (gw) wVar.s.getItem(0);
            if (gwVar.f37353f < 2.0f) {
                return true;
            }
            w.j(wVar, wVar.s.a(gwVar), gwVar, false);
        }
        return true;
    }

    e(h hVar, int i2) {
        this.f24546b = i2;
        Objects.requireNonNull(hVar);
        this.f24545a = hVar;
    }

    e(w wVar, int i2) {
        this.f24546b = i2;
        Objects.requireNonNull(wVar);
        this.f24545a = wVar;
    }
}
