package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class kmm extends defpackage.kmi {
    public final defpackage.yqm a;
    public final defpackage.bwx b;
    protected defpackage.cik c;
    public final defpackage.khb d;
    private final defpackage.afar e;
    private boolean f;

    public kmm(android.content.Context context) {
        super(context, null, 0);
        this.a = new defpackage.yqm(defpackage.yrs.d("CarComposeView"));
        this.b = new androidx.compose.runtime.ParcelableSnapshotMutableState(null, defpackage.bxv.c);
        this.e = new defpackage.afay(new defpackage.con(19));
        this.d = new defpackage.khb();
    }

    protected static final boolean n(android.view.View view) {
        if (view instanceof defpackage.kmm) {
            return false;
        }
        java.lang.Object tag = view.getTag();
        kmt kmtVar = kmt.a;
        if (tag == kmtVar) {
            return true;
        }
        java.util.Iterator itA = defpackage.ebn.b(view).a();
        while (itA.hasNext()) {
            java.lang.Object obj = (android.view.ViewParent) itA.next();
            if (obj instanceof defpackage.kmm) {
                return false;
            }
            if ((obj instanceof android.view.View) && ((android.view.View) obj).getTag() == kmtVar) {
                return true;
            }
        }
        return false;
    }

    public final void a(defpackage.affg affgVar) {
        this.f = true;
        this.b.b(affgVar);
        if (isAttachedToWindow()) {
            d();
        }
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(android.view.MotionEvent motionEvent) {
        motionEvent.getClass();
        int source = motionEvent.getSource();
        if (source != 8194) {
            if (source != 1048584) {
                return super.dispatchGenericMotionEvent(motionEvent);
            }
            defpackage.afar afarVar = gjm.a;
            gjm gjmVarI = fxr.i();
            if (!motionEvent.isFromSource(1048584)) {
                throw new java.lang.IllegalArgumentException("MotionEventBroadcaster should only be used with touchpad events");
            }
            java.util.Iterator it = gjmVarI.b.iterator();
            it.getClass();
            while (it.hasNext()) {
                if (((java.lang.Boolean) ((defpackage.affc) it.next()).invoke(motionEvent)).booleanValue()) {
                    return true;
                }
            }
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int pointerCount = motionEvent.getPointerCount();
        android.view.MotionEvent.PointerProperties[] pointerPropertiesArr = new android.view.MotionEvent.PointerProperties[pointerCount];
        for (int i = 0; i < pointerCount; i++) {
            android.view.MotionEvent.PointerProperties pointerProperties = new android.view.MotionEvent.PointerProperties();
            motionEvent.getPointerProperties(i, pointerProperties);
            pointerPropertiesArr[i] = pointerProperties;
        }
        int pointerCount2 = motionEvent.getPointerCount();
        android.view.MotionEvent.PointerCoords[] pointerCoordsArr = new android.view.MotionEvent.PointerCoords[pointerCount2];
        for (int i2 = 0; i2 < pointerCount2; i2++) {
            android.view.MotionEvent.PointerCoords pointerCoords = new android.view.MotionEvent.PointerCoords();
            motionEvent.getPointerCoords(i2, pointerCoords);
            pointerCoords.setAxisValue(26, -pointerCoords.getAxisValue(9));
            pointerCoords.setAxisValue(9, 0.0f);
            pointerCoordsArr[i2] = pointerCoords;
        }
        android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getPointerCount(), pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource() == 8194 ? 4194304 : motionEvent.getSource(), motionEvent.getFlags());
        try {
            motionEventObtain.getClass();
            return super.dispatchGenericMotionEvent(motionEventObtain);
        } finally {
            motionEventObtain.recycle();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        int i;
        keyEvent.getClass();
        if (keyEvent.getKeyCode() == 23) {
            defpackage.afar afarVar = gjm.a;
            gjm gjmVarI = fxr.i();
            if (keyEvent.getKeyCode() != 23) {
                throw new java.lang.IllegalArgumentException("KeyEventBroadcaster should only be used with KEYCODE_DPAD_CENTER events");
            }
            java.util.Iterator it = gjmVarI.c.iterator();
            it.getClass();
            while (it.hasNext() && !((java.lang.Boolean) ((defpackage.affc) it.next()).invoke(keyEvent)).booleanValue()) {
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
                            throw new java.lang.IllegalArgumentException();
                    }
                    return super.dispatchKeyEvent(new android.view.KeyEvent(keyEvent.getDownTime(), keyEvent.getEventTime(), keyEvent.getAction(), i, keyEvent.getRepeatCount(), keyEvent.getMetaState(), keyEvent.getDeviceId(), keyEvent.getScanCode(), keyEvent.getFlags(), keyEvent.getSource()));
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final java.lang.CharSequence getAccessibilityClassName() {
        java.lang.String name = getClass().getName();
        name.getClass();
        return name;
    }

    @Override // defpackage.czl
    protected final boolean i() {
        return this.f;
    }

    protected final boolean k() {
        return ((java.lang.Boolean) this.e.a()).booleanValue();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afbj */
    public final defpackage.cik l() throws afbj {
        defpackage.cik cikVar = this.c;
        if (cikVar != null) {
            return cikVar;
        }
        defpackage.afga.d("focusManager");
        return null;
    }

    public final void m(defpackage.cik cikVar) {
        cikVar.getClass();
        this.c = cikVar;
    }

    @Override // defpackage.kmi
    public void q(defpackage.bve bveVar, int i) {
        bveVar.v(2142293135);
        defpackage.cik cikVar = (defpackage.cik) bveVar.f(defpackage.dbl.e);
        boolean zE = bveVar.E(this) | bveVar.E(cikVar);
        java.lang.Object objG = bveVar.g();
        if (zE || objG == defpackage.bvd.a) {
            objG = new defpackage.bxn(this, cikVar, 13, null);
            bveVar.x(objG);
        }
        bveVar.r((defpackage.afer) objG);
        defpackage.dai.aA(defpackage.dbl.n.b(new defpackage.kml(bveVar, ((defpackage.dlo) bveVar.f(defpackage.dbl.d)).dI(40.0f))), defpackage.dai.as(661249999, true, new defpackage.cvi(this, 9), bveVar), bveVar, 48);
        bveVar.o();
    }

    @Override // defpackage.kmi, defpackage.rba
    public final boolean r(android.view.View view, android.view.MotionEvent motionEvent) {
        view.getClass();
        if (motionEvent.getSource() != 8194) {
            return view.dispatchGenericMotionEvent(motionEvent);
        }
        int pointerCount = motionEvent.getPointerCount();
        android.view.MotionEvent.PointerProperties[] pointerPropertiesArr = new android.view.MotionEvent.PointerProperties[pointerCount];
        for (int i = 0; i < pointerCount; i++) {
            android.view.MotionEvent.PointerProperties pointerProperties = new android.view.MotionEvent.PointerProperties();
            motionEvent.getPointerProperties(i, pointerProperties);
            pointerPropertiesArr[i] = pointerProperties;
        }
        int pointerCount2 = motionEvent.getPointerCount();
        android.view.MotionEvent.PointerCoords[] pointerCoordsArr = new android.view.MotionEvent.PointerCoords[pointerCount2];
        for (int i2 = 0; i2 < pointerCount2; i2++) {
            android.view.MotionEvent.PointerCoords pointerCoords = new android.view.MotionEvent.PointerCoords();
            motionEvent.getPointerCoords(i2, pointerCoords);
            pointerCoords.setAxisValue(26, -pointerCoords.getAxisValue(9));
            pointerCoords.setAxisValue(9, 0.0f);
            pointerCoordsArr[i2] = pointerCoords;
        }
        android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getPointerCount(), pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource() == 8194 ? 4194304 : motionEvent.getSource(), motionEvent.getFlags());
        try {
            motionEventObtain.getClass();
            return view.dispatchGenericMotionEvent(motionEventObtain);
        } finally {
            motionEventObtain.recycle();
        }
    }

    @Override // defpackage.kmi, defpackage.rba
    public final boolean s(android.view.View view, int i, android.graphics.Rect rect) {
        if (!hasFocus() || n(view)) {
            return view.requestFocus(i, rect);
        }
        return false;
    }

    @Override // defpackage.kmi, defpackage.rba
    public final boolean t(android.view.View view) {
        if (!hasFocus() || n(view)) {
            return view.requestFocusFromTouch();
        }
        return false;
    }

    @Override // defpackage.kmi, defpackage.rba
    public final boolean u(android.view.View view) {
        java.lang.Object next;
        view.getClass();
        if (hasFocus() && !n(view)) {
            return false;
        }
        if (view instanceof android.view.ViewGroup) {
            java.util.Iterator itA = new defpackage.afcb((android.view.ViewGroup) view, 1).a();
            do {
                if (!itA.hasNext()) {
                    next = null;
                    break;
                }
                next = itA.next();
            } while (!(((android.view.View) next) instanceof kmq));
            android.view.View view2 = (android.view.View) next;
            if (view2 != null) {
                return view2.post(new kcw(view2, 20));
            }
        }
        return view.post(new defpackage.kmp(view, 1));
    }

    @Override // defpackage.kmi, defpackage.rba
    public boolean v(android.view.View view, int i, boolean z) {
        view.getClass();
        super.v(view, i, z);
        return l().i(jus.c(i), true);
    }

    @Override // defpackage.kmi
    protected final defpackage.bxk[] w() {
        return new defpackage.bxk[]{defpackage.kms.c.b(this.d), defpackage.gbp.a.b(defpackage.lfx.a.a())};
    }
}
