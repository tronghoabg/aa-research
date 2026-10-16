package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.google.android.projection.gearhead.input.ProjectionKeyboardLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public class xds {
    private static final yph i = yph.c("GH.PrKeyboardManager");
    protected final Context a;
    protected final InputConnection b;
    protected final EditorInfo c;
    protected final ProjectionKeyboardLayout d;
    protected final Locale e;
    public final boolean f;
    public String g;
    final ajmd h;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private xdq m;
    private xdp n;
    private boolean o;
    private String p;
    private Bundle q;
    private final ykd r;

    public xds(Context context, InputConnection inputConnection, EditorInfo editorInfo, ProjectionKeyboardLayout projectionKeyboardLayout, ykd ykdVar, Locale locale, boolean z, boolean z2, boolean z3, boolean z4, int i2, Bundle bundle, String str) throws Resources.NotFoundException {
        ajmd ajmdVar = new ajmd(this, null);
        this.h = ajmdVar;
        this.a = context;
        this.b = inputConnection;
        this.c = editorInfo;
        this.d = projectionKeyboardLayout;
        this.r = ykdVar;
        this.e = locale;
        this.j = z;
        this.k = z2;
        this.f = z3;
        this.l = z4;
        this.g = str;
        projectionKeyboardLayout.k = ajmdVar;
        this.n = j();
        leh.a();
        projectionKeyboardLayout.j = i2;
        projectionKeyboardLayout.d(this.n);
        if (bundle != null) {
            this.g = a(bundle);
            g(bundle.getBoolean("isKeyboardCapsLockOn"));
        }
        ((ype) i.l().ai(10145)).R("Created keyboard for the input methods: %s%s%s", true != z ? "" : " Touchpad ", true != z2 ? "" : " TouchScreen ", true == z3 ? " RotaryController " : "");
    }

    private final xdp j() {
        Context context = this.a;
        Resources resources = context.getResources();
        Configuration configuration = new Configuration(resources.getConfiguration());
        Configuration configuration2 = resources.getConfiguration();
        Locale locale = this.e;
        configuration2.locale = locale;
        resources.updateConfiguration(configuration2, resources.getDisplayMetrics());
        ((ype) i.l().ai(10146)).y("LayoutXML to parse: %s", this.g);
        xdp xdpVar = new xdp(context, context.getResources().getIdentifier(this.g, "xml", context.getPackageName()), locale, this.c);
        if (this.l) {
            this.m = new xdq(context, locale);
        }
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        return xdpVar;
    }

    private final void k() throws Resources.NotFoundException {
        h(this.p);
        Bundle bundle = this.q;
        ProjectionKeyboardLayout projectionKeyboardLayout = this.d;
        if (!projectionKeyboardLayout.isInTouchMode()) {
            projectionKeyboardLayout.e(bundle.getInt("KEY_FOCUS_VIEW_ID"));
        }
        g(this.o);
        this.q = null;
        this.p = null;
    }

    protected String a(Bundle bundle) {
        return this.g;
    }

    public void b(Bundle bundle) {
        bundle.putBoolean("isKeyboardCapsLockOn", this.o);
        bundle.putString("keyboardLocale", this.e.toString());
    }

    protected boolean c(int i2) throws Resources.NotFoundException {
        if (i2 == -43) {
            if (a(null).equals("projection_keyboard_symbols_layout")) {
                k();
                return false;
            }
            i(this.d.a(), "projection_keyboard_symbols_layout", new char[0]);
            return false;
        }
        if (i2 == -42) {
            k();
            return false;
        }
        if (i2 == -31) {
            if (this.m == null) {
                tss.q("GH.PrKeyboardManager", "Action to cycle character without initializing the CharacterCycler.", new Object[0]);
            }
            InputConnection inputConnection = this.b;
            CharSequence textBeforeCursor = inputConnection.getTextBeforeCursor(1, 0);
            if (TextUtils.isEmpty(textBeforeCursor)) {
                return false;
            }
            xdq xdqVar = this.m;
            char cCharAt = textBeforeCursor.charAt(0);
            SparseIntArray sparseIntArray = xdqVar.b;
            int iCharAt = sparseIntArray.indexOfKey(cCharAt) >= 0 ? sparseIntArray.get(cCharAt) : Character.isUpperCase(cCharAt) ? String.valueOf(cCharAt).toLowerCase(xdqVar.a).charAt(0) : String.valueOf(cCharAt).toUpperCase(xdqVar.a).charAt(0);
            inputConnection.deleteSurroundingText(1, 0);
            inputConnection.commitText(String.valueOf((char) iCharAt), 1);
            return true;
        }
        if (i2 == -9) {
            this.r.d();
            return false;
        }
        if (i2 == -8) {
            this.r.c(!this.d.d.isSelected());
            return false;
        }
        if (i2 == -5) {
            this.b.deleteSurroundingText(1, 0);
            return true;
        }
        if (i2 == -4) {
            this.b.performEditorAction(this.c.imeOptions & 255);
            ykd ykdVar = this.r;
            ohs ohsVarJ = ebf.j();
            Object obj = ykdVar.a;
            ohsVarJ.o(yzz.KEYBOARD_PROJECTION, yzy.eB);
            return false;
        }
        if (i2 == -2) {
            ykd ykdVar2 = this.r;
            lgp.a().e();
            xdm xdmVar = (xdm) ykdVar2.a;
            xdmVar.d = xdmVar.f(null);
            return false;
        }
        if (i2 == -1) {
            g(!this.o);
            return false;
        }
        String string = Character.toString((char) i2);
        if (this.o) {
            string = string.toUpperCase(this.e);
        }
        this.b.commitText(string, 1);
        return true;
    }

    public void d(boolean z) {
        this.d.setEnabled(z);
    }

    public final void e(int i2) {
        InputConnection inputConnection = this.b;
        inputConnection.beginBatchEdit();
        if (c(i2)) {
            if (a(null).equals("projection_keyboard_popup_layout")) {
                k();
            } else {
                int cursorCapsMode = inputConnection.getCursorCapsMode(this.c.inputType);
                boolean z = true;
                if (cursorCapsMode != 4096 && cursorCapsMode != 8192 && cursorCapsMode != 16384) {
                    z = false;
                }
                if (z != this.o) {
                    g(z);
                }
                xda xdaVar = (xda) tec.a((Fragment) this.r.a, xda.class);
                xdaVar.getClass();
                xdaVar.e();
            }
            inputConnection.endBatchEdit();
        }
    }

    public final void f() {
        this.r.d();
    }

    protected final void g(boolean z) throws Resources.NotFoundException {
        this.o = z;
        ProjectionKeyboardLayout projectionKeyboardLayout = this.d;
        if (z) {
            xdp xdpVar = this.n;
            Locale locale = xdpVar.b;
            xdp xdpVar2 = new xdp(locale, xdpVar.d, xdpVar.e, xdpVar.f, xdpVar.g, xdpVar.h);
            for (oct octVar : xdpVar.c) {
                oct octVar2 = new oct(null, null, null);
                Iterator it = octVar.C().iterator();
                while (it.hasNext()) {
                    xdo xdoVar = new xdo((xdo) it.next());
                    String str = xdoVar.k;
                    if (str != null) {
                        xdoVar.b = str;
                    } else {
                        String str2 = xdoVar.b;
                        if (str2 != null) {
                            xdoVar.b = str2.toUpperCase(locale);
                        }
                    }
                    octVar2.D(xdoVar);
                }
                xdpVar2.c.add(octVar2);
            }
            projectionKeyboardLayout.d(xdpVar2);
        } else {
            projectionKeyboardLayout.d(this.n);
        }
        View view = this.d.e;
        if (view == null) {
            return;
        }
        view.setSelected(z);
    }

    protected final void h(String str) throws Resources.NotFoundException {
        this.g = str;
        xdp xdpVarJ = j();
        this.n = xdpVarJ;
        this.d.d(xdpVarJ);
    }

    public final void i(Bundle bundle, String str, char[] cArr) {
        View childAt;
        int i2;
        this.p = this.g;
        this.q = bundle;
        h(str);
        xdp xdpVar = this.n;
        ArrayList arrayList = xdpVar.c;
        int length = cArr.length;
        Iterator it = arrayList.iterator();
        int i3 = 0;
        while (true) {
            childAt = null;
            if (!it.hasNext()) {
                break;
            }
            oct octVar = (oct) it.next();
            List listC = octVar.C();
            for (int i4 = 0; i4 < listC.size(); i4++) {
                xdo xdoVar = (xdo) listC.get(i4);
                if (xdoVar.a() == -41) {
                    if (i3 < length) {
                        octVar.E(xdo.b(xdoVar, Character.valueOf(cArr[i3])), i4);
                        i3++;
                    } else {
                        octVar.E(xdo.b(xdoVar, null), i4);
                    }
                }
            }
        }
        ProjectionKeyboardLayout projectionKeyboardLayout = this.d;
        projectionKeyboardLayout.d(xdpVar);
        g(this.o);
        if (projectionKeyboardLayout.isInTouchMode()) {
            return;
        }
        xdp xdpVar2 = projectionKeyboardLayout.c;
        xdpVar2.getClass();
        Iterator it2 = xdpVar2.c.iterator();
        loop2: while (true) {
            if (!it2.hasNext()) {
                tss.q("GH.ProjectionKeyboard", "No popup character key found in popup keyboard for default focus.", new Object[0]);
                i2 = -1;
                break;
            }
            for (xdo xdoVar2 : ((oct) it2.next()).C()) {
                if (!xdoVar2.b.isEmpty()) {
                    i2 = xdoVar2.a;
                    break loop2;
                }
            }
        }
        int childCount = projectionKeyboardLayout.getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount) {
                break;
            }
            if (((xdo) projectionKeyboardLayout.getChildAt(i5).getTag()).a == i2) {
                childAt = projectionKeyboardLayout.getChildAt(i5);
                break;
            }
            i5++;
        }
        if (childAt == null) {
            tss.q("GH.PrKeyboardLayout", "View with requested keyId not found. keyId: %d", Integer.valueOf(i2));
        }
        childAt.requestFocus();
    }
}
