package defpackage;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.car.app.model.SearchTemplate;
import com.google.android.apps.auto.components.externalkeyboard.phone.PhoneKeyboardActivity;
import com.google.android.apps.auto.components.support.CarRestrictedEditText;
import com.google.android.projection.gearhead.sdk.CarAppLayout;

/* loaded from: classes2.dex */
public final class lbf implements TextView.OnEditorActionListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public lbf(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        int i2 = this.b;
        if (i2 == 0) {
            ype ypeVar = (ype) PhoneKeyboardActivity.m.l().ai(3728);
            Integer numValueOf = Integer.valueOf(i);
            ypeVar.R("TextView.OnEditorActionListener.onEditorAction() called with actionId: %d, keyEvent: %s, textView: %s.", numValueOf, keyEvent, textView);
            if (!PhoneKeyboardActivity.n.contains(numValueOf)) {
                return false;
            }
            lbd lbdVar = ((PhoneKeyboardActivity) this.a).u;
            if (lbdVar.c) {
                ((ype) ((ype) lbd.a.h()).ai((char) 3725)).u("performAction called after being told to detach.");
                return true;
            }
            xcv xcvVar = lbdVar.d;
            if (!xcvVar.a(lbdVar.b)) {
                return true;
            }
            xcw xcwVar = xcvVar.a;
            int i3 = xcwVar.h.imeOptions & 255;
            InputConnection inputConnection = xcwVar.c;
            if (inputConnection == null) {
                return true;
            }
            inputConnection.performEditorAction(i3);
            return true;
        }
        if (i2 == 1) {
            Object obj = this.a;
            kbu kbuVar = (kbu) obj;
            String strTrim = kbuVar.b.b().toString().trim();
            if (TextUtils.isEmpty(strTrim)) {
                return false;
            }
            hlf hlfVar = (hlf) obj;
            vi searchCallbackDelegate = ((SearchTemplate) hlfVar.C()).getSearchCallbackDelegate();
            geu geuVar = hlfVar.i;
            geuVar.t().o(searchCallbackDelegate, strTrim);
            ohs ohsVarJ = ebf.j();
            rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.CAR_APP_LIBRARY, yzy.sN);
            rrbVarH.p(((gmh) geuVar.d()).a);
            ohsVarJ.F(rrbVarH.l());
            kbuVar.a.b();
            return true;
        }
        if (i2 == 2) {
            moh mohVar = ((CarRestrictedEditText) this.a).a;
            if (mohVar != null && i == 6) {
                mohVar.a();
            }
            return false;
        }
        Object obj2 = this.a;
        if (i2 != 3) {
            ((CarAppLayout) obj2).d.getText().toString();
            return true;
        }
        qgm qgmVar = (qgm) obj2;
        String strTrim2 = qgmVar.f.getText().toString().trim();
        if (TextUtils.isEmpty(strTrim2)) {
            return false;
        }
        qgmVar.j(strTrim2);
        return true;
    }

    public /* synthetic */ lbf(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
