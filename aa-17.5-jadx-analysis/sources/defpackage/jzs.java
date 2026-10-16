package defpackage;

import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import androidx.preference.SeekBarPreference;
import com.google.android.apps.auto.components.apphost.telecom.dialpad.MaterialStandardDialpadView;
import com.google.android.apps.auto.components.apphost.telecom.dialpad.StandardDialpadView;
import com.google.android.projection.gearhead.input.ProjectionKeyboardLayout;

/* loaded from: classes2.dex */
public final class jzs implements View.OnKeyListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public jzs(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        int i2 = this.b;
        if (i2 == 0) {
            yph yphVar = MaterialStandardDialpadView.a;
            keyEvent.getKeyCode();
            if (keyEvent.getKeyCode() == 23) {
                oeb oebVar = (oeb) MaterialStandardDialpadView.b.get(view.getId());
                oebVar.getClass();
                if (keyEvent.getAction() == 0) {
                    ((MaterialStandardDialpadView) this.a).j(view, oebVar);
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    if (!((MaterialStandardDialpadView) this.a).k(view, oebVar)) {
                        return true;
                    }
                    view.performClick();
                    return true;
                }
            }
            return false;
        }
        if (i2 == 1) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            SeekBarPreference seekBarPreference = (SeekBarPreference) this.a;
            if ((!seekBarPreference.e && (i == 21 || i == 22)) || i == 23 || i == 66) {
                return false;
            }
            SeekBar seekBar = seekBarPreference.d;
            if (seekBar != null) {
                return seekBar.onKeyDown(i, keyEvent);
            }
            Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
            return false;
        }
        if (i2 == 2) {
            yph yphVar2 = StandardDialpadView.a;
            keyEvent.getKeyCode();
            if (keyEvent.getKeyCode() == 23) {
                oeb oebVar2 = (oeb) StandardDialpadView.b.get(view.getId());
                oebVar2.getClass();
                if (keyEvent.getAction() == 0) {
                    ((StandardDialpadView) this.a).i(view, oebVar2);
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    if (!((StandardDialpadView) this.a).j(view, oebVar2)) {
                        return true;
                    }
                    view.performClick();
                    return true;
                }
            }
            return false;
        }
        if (i2 == 3) {
            yph yphVar3 = com.google.android.apps.auto.components.telecom.dialpad.StandardDialpadView.a;
            keyEvent.getKeyCode();
            if (keyEvent.getKeyCode() == 23) {
                oeb oebVar3 = (oeb) com.google.android.apps.auto.components.telecom.dialpad.StandardDialpadView.b.get(view.getId());
                oebVar3.getClass();
                if (keyEvent.getAction() == 0) {
                    ((com.google.android.apps.auto.components.telecom.dialpad.StandardDialpadView) this.a).c(view, oebVar3);
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    if (!((com.google.android.apps.auto.components.telecom.dialpad.StandardDialpadView) this.a).f(view, oebVar3)) {
                        return true;
                    }
                    view.performClick();
                    return true;
                }
            }
            return false;
        }
        if (i2 == 4) {
            if (i == 4) {
                wjb wjbVar = (wjb) this.a;
                wjbVar.j(wjbVar.d, wjbVar.j, wjbVar.h, wid.l(wjbVar.f));
                wjbVar.b.dismissAllowingStateLoss();
                if (wjbVar.i) {
                    return true;
                }
            }
            return false;
        }
        Object obj = this.a;
        if (i2 == 5) {
            return ((xcs) obj).j(i, keyEvent);
        }
        ajmd ajmdVar = ((ProjectionKeyboardLayout) obj).k;
        if (keyEvent.getAction() != 1) {
            return false;
        }
        Object obj2 = ajmdVar.a;
        if (i == 4) {
            ((xds) obj2).f();
            return true;
        }
        xds xdsVar = (xds) obj2;
        if (!xdsVar.f) {
            return false;
        }
        if (i != 20 && i != 19) {
            return false;
        }
        xdsVar.f();
        return false;
    }

    public /* synthetic */ jzs(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
