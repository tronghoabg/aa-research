package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;

/* loaded from: classes.dex */
public class kmf extends kmb {
    public final yph a;
    public final bwq b;
    protected cic c;
    public final kwp d;
    private final aezr e;
    private boolean f;

    public kmf(Context context) {
        super(context, null, 0);
        this.a = new yph(yqn.d("CarComposeView"));
        this.b = new ParcelableSnapshotMutableState(null, bxp.c);
        this.e = new aezy(new dba(13));
        this.d = new kwp();
    }

    protected static final boolean n(View view) {
        if (view instanceof kmf) {
            return false;
        }
        Object tag = view.getTag();
        kmm kmmVar = kmm.a;
        if (tag == kmmVar) {
            return true;
        }
        Iterator itA = ebg.b(view).a();
        while (itA.hasNext()) {
            Object obj = (ViewParent) itA.next();
            if (obj instanceof kmf) {
                return false;
            }
            if ((obj instanceof View) && ((View) obj).getTag() == kmmVar) {
                return true;
            }
        }
        return false;
    }

    public final void a(afeg afegVar) {
        this.f = true;
        this.b.b(afegVar);
        if (isAttachedToWindow()) {
            d();
        }
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        int source = motionEvent.getSource();
        if (source != 8194) {
            if (source != 1048584) {
                return super.dispatchGenericMotionEvent(motionEvent);
            }
            aezr aezrVar = gjf.a;
            gjf gjfVarH = fxi.h();
            if (!motionEvent.isFromSource(1048584)) {
                throw new IllegalArgumentException("MotionEventBroadcaster should only be used with touchpad events");
            }
            Iterator it = gjfVarH.b.iterator();
            it.getClass();
            while (it.hasNext()) {
                if (((Boolean) ((afec) it.next()).invoke(motionEvent)).booleanValue()) {
                    return true;
                }
            }
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int pointerCount = motionEvent.getPointerCount();
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i = 0; i < pointerCount; i++) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            motionEvent.getPointerProperties(i, pointerProperties);
            pointerPropertiesArr[i] = pointerProperties;
        }
        int pointerCount2 = motionEvent.getPointerCount();
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount2];
        for (int i2 = 0; i2 < pointerCount2; i2++) {
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            motionEvent.getPointerCoords(i2, pointerCoords);
            pointerCoords.setAxisValue(26, -pointerCoords.getAxisValue(9));
            pointerCoords.setAxisValue(9, BitmapDescriptorFactory.HUE_RED);
            pointerCoordsArr[i2] = pointerCoords;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getPointerCount(), pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource() == 8194 ? 4194304 : motionEvent.getSource(), motionEvent.getFlags());
        try {
            motionEventObtain.getClass();
            return super.dispatchGenericMotionEvent(motionEventObtain);
        } finally {
            motionEventObtain.recycle();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i;
        keyEvent.getClass();
        if (keyEvent.getKeyCode() == 23) {
            aezr aezrVar = gjf.a;
            gjf gjfVarH = fxi.h();
            if (keyEvent.getKeyCode() != 23) {
                throw new IllegalArgumentException("KeyEventBroadcaster should only be used with KEYCODE_DPAD_CENTER events");
            }
            Iterator it = gjfVarH.c.iterator();
            it.getClass();
            while (it.hasNext() && !((Boolean) ((afec) it.next()).invoke(keyEvent)).booleanValue()) {
            }
            return super.dispatchKeyEvent(keyEvent);
        }
        if (k()) {
            switch (keyEvent.getKeyCode()) {
                case 19:
                case 20:
                case 21:
                case 22:
                    switch (keyEvent.getKeyCode()) {
                        case 19:
                            i = 280;
                            break;
                        case 20:
                            i = 281;
                            break;
                        case 21:
                            i = 282;
                            break;
                        case 22:
                            i = 283;
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                    return super.dispatchKeyEvent(new KeyEvent(keyEvent.getDownTime(), keyEvent.getEventTime(), keyEvent.getAction(), i, keyEvent.getRepeatCount(), keyEvent.getMetaState(), keyEvent.getDeviceId(), keyEvent.getScanCode(), keyEvent.getFlags(), keyEvent.getSource()));
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        String name = getClass().getName();
        name.getClass();
        return name;
    }

    @Override // defpackage.czd
    protected final boolean i() {
        return this.f;
    }

    protected final boolean k() {
        return ((Boolean) this.e.a()).booleanValue();
    }

    public final cic l() {
        cic cicVar = this.c;
        if (cicVar != null) {
            return cicVar;
        }
        affa.d("focusManager");
        return null;
    }

    public final void m(cic cicVar) {
        cicVar.getClass();
        this.c = cicVar;
    }

    @Override // defpackage.kmb
    public void q(bux buxVar, int i) {
        buxVar.v(2142293135);
        cic cicVar = (cic) buxVar.f(dbc.e);
        boolean zE = buxVar.E(this) | buxVar.E(cicVar);
        Object objG = buxVar.g();
        if (zE || objG == buw.a) {
            objG = new bws(this, cicVar, 15, null);
            buxVar.x(objG);
        }
        buxVar.r((afdr) objG);
        czz.am(dbc.n.b(new kme(buxVar, ((dlg) buxVar.f(dbc.d)).eA(40.0f))), bxc.i(661249999, true, new cuz(this, 9), buxVar), buxVar, 48);
        buxVar.o();
    }

    @Override // defpackage.kmb, defpackage.rae
    public final boolean r(View view, MotionEvent motionEvent) {
        view.getClass();
        if (motionEvent.getSource() != 8194) {
            return view.dispatchGenericMotionEvent(motionEvent);
        }
        int pointerCount = motionEvent.getPointerCount();
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i = 0; i < pointerCount; i++) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            motionEvent.getPointerProperties(i, pointerProperties);
            pointerPropertiesArr[i] = pointerProperties;
        }
        int pointerCount2 = motionEvent.getPointerCount();
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount2];
        for (int i2 = 0; i2 < pointerCount2; i2++) {
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            motionEvent.getPointerCoords(i2, pointerCoords);
            pointerCoords.setAxisValue(26, -pointerCoords.getAxisValue(9));
            pointerCoords.setAxisValue(9, BitmapDescriptorFactory.HUE_RED);
            pointerCoordsArr[i2] = pointerCoords;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getPointerCount(), pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource() == 8194 ? 4194304 : motionEvent.getSource(), motionEvent.getFlags());
        try {
            motionEventObtain.getClass();
            return view.dispatchGenericMotionEvent(motionEventObtain);
        } finally {
            motionEventObtain.recycle();
        }
    }

    @Override // defpackage.kmb, defpackage.rae
    public final boolean s(View view, int i, Rect rect) {
        if (!hasFocus() || n(view)) {
            return view.requestFocus(i, rect);
        }
        return false;
    }

    @Override // defpackage.kmb, defpackage.rae
    public final boolean t(View view) {
        if (!hasFocus() || n(view)) {
            return view.requestFocusFromTouch();
        }
        return false;
    }

    @Override // defpackage.kmb, defpackage.rae
    public final boolean u(View view) {
        Object next;
        view.getClass();
        if (hasFocus() && !n(view)) {
            return false;
        }
        if (view instanceof ViewGroup) {
            Iterator itA = new afbb((ViewGroup) view, 1).a();
            while (true) {
                if (!itA.hasNext()) {
                    next = null;
                    break;
                }
                next = itA.next();
                if (((View) next) instanceof kmj) {
                    break;
                }
            }
            View view2 = (View) next;
            if (view2 != null) {
                return view2.post(new kea(view2, 11));
            }
        }
        return view.post(new kea(view, 12));
    }

    @Override // defpackage.kmb, defpackage.rae
    public boolean v(View view, int i, boolean z) {
        view.getClass();
        super.v(view, i, z);
        return l().i(jur.e(i), true);
    }

    @Override // defpackage.kmb
    protected final bxe[] w() {
        return new bxe[]{kml.c.b(this.d), gbj.a.b(lfr.a.a())};
    }
}
