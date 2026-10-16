package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qzu extends defpackage.ijw implements defpackage.qzv {
    private final java.lang.ref.WeakReference a;

    public qzu(defpackage.jhe jheVar) {
        super("com.google.android.gms.car.ICarWindow");
        this.a = new java.lang.ref.WeakReference(jheVar);
    }

    private final java.lang.String a() {
        defpackage.jhb jhbVar = (defpackage.jhb) this.a.get();
        return jhbVar != null ? jhbVar.a() : "(null)";
    }

    private final void b(com.google.android.gms.car.KeyEventCompleteData keyEventCompleteData) {
        defpackage.jhe jheVar = (defpackage.jhe) this.a.get();
        if (jheVar != null) {
            defpackage.rbz.h(new defpackage.inq(jheVar, keyEventCompleteData, 14));
        } else {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.jhe.a.h()).ai((char) 2049)).u("onKeyEventCompleteInternal unable to run, window no longer exists");
        }
    }

    private final void c(com.google.android.gms.car.TouchEventCompleteData touchEventCompleteData) {
        defpackage.jhe jheVar = (defpackage.jhe) this.a.get();
        if (jheVar != null) {
            defpackage.rbz.h(new defpackage.inq(jheVar, touchEventCompleteData, 18));
        } else {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.jhe.a.h()).ai((char) 2052)).u("unable to run, window no longer exists");
        }
    }

    @Override // defpackage.qzv
    public final void e(boolean z) {
        defpackage.yqm yqmVar = defpackage.jhe.a;
        ((defpackage.yqj) yqmVar.l().ai(2042)).N("Binder:%s.hideWindow(%b)", a(), z);
        defpackage.jhe jheVar = (defpackage.jhe) this.a.get();
        if (jheVar != null) {
            defpackage.rbz.h(new defpackage.jhc(jheVar, z, 2));
        } else {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 2043)).u("hideWindow unable to run, window no longer exists");
        }
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        boolean z;
        switch (i) {
            case 1:
                j();
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                int i2 = parcel.readInt();
                defpackage.ijx.d(parcel);
                defpackage.yqm yqmVar = defpackage.jhe.a;
                a();
                c(new com.google.android.gms.car.TouchEventCompleteData(i2, null, -1));
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                java.lang.ClassLoader classLoader = defpackage.ijx.a;
                z = parcel.readInt() != 0;
                defpackage.ijx.d(parcel);
                defpackage.yqm yqmVar2 = defpackage.jhe.a;
                a();
                b(new com.google.android.gms.car.KeyEventCompleteData(z, (android.graphics.Rect) null));
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                k();
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                i();
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                com.google.android.gms.car.TouchEventCompleteData touchEventCompleteData = (com.google.android.gms.car.TouchEventCompleteData) defpackage.ijx.a(parcel, com.google.android.gms.car.TouchEventCompleteData.CREATOR);
                defpackage.ijx.d(parcel);
                h(touchEventCompleteData);
                break;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                com.google.android.gms.car.CarWindowLayoutParams carWindowLayoutParams = (com.google.android.gms.car.CarWindowLayoutParams) defpackage.ijx.a(parcel, com.google.android.gms.car.CarWindowLayoutParams.CREATOR);
                defpackage.ijx.d(parcel);
                defpackage.yqm yqmVar3 = defpackage.jhe.a;
                ((defpackage.yqj) yqmVar3.l().ai(2076)).M("Binder:%s.updateLayoutParams(%s)", a(), carWindowLayoutParams);
                defpackage.jhe jheVar = (defpackage.jhe) this.a.get();
                if (jheVar == null) {
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar3.h()).ai((char) 2077)).u("updateLayoutParams unable to run, window no longer exists");
                } else {
                    new defpackage.stq(android.os.Looper.getMainLooper()).post(new defpackage.inq(jheVar, carWindowLayoutParams, 15));
                }
                break;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                n();
                break;
            case 9:
                android.graphics.Rect rect = (android.graphics.Rect) defpackage.ijx.a(parcel, android.graphics.Rect.CREATOR);
                defpackage.ijx.d(parcel);
                u(rect);
                break;
            case 10:
                java.lang.ClassLoader classLoader2 = defpackage.ijx.a;
                z = parcel.readInt() != 0;
                defpackage.ijx.d(parcel);
                e(z);
                break;
            case 11:
                java.lang.ClassLoader classLoader3 = defpackage.ijx.a;
                z = parcel.readInt() != 0;
                defpackage.ijx.d(parcel);
                r(z);
                break;
            case 12:
                com.google.android.gms.car.animation.ProjectionWindowAnimationParams projectionWindowAnimationParams = (com.google.android.gms.car.animation.ProjectionWindowAnimationParams) defpackage.ijx.a(parcel, com.google.android.gms.car.animation.ProjectionWindowAnimationParams.CREATOR);
                defpackage.ijx.d(parcel);
                f(projectionWindowAnimationParams);
                break;
            case 13:
                com.google.android.gms.car.KeyEventCompleteData keyEventCompleteData = (com.google.android.gms.car.KeyEventCompleteData) defpackage.ijx.a(parcel, com.google.android.gms.car.KeyEventCompleteData.CREATOR);
                defpackage.ijx.d(parcel);
                g(keyEventCompleteData);
                break;
            case 14:
                com.google.android.gms.car.animation.ProjectionWindowAnimationParams projectionWindowAnimationParams2 = (com.google.android.gms.car.animation.ProjectionWindowAnimationParams) defpackage.ijx.a(parcel, com.google.android.gms.car.animation.ProjectionWindowAnimationParams.CREATOR);
                defpackage.ijx.d(parcel);
                s(projectionWindowAnimationParams2);
                break;
            case 15:
                java.lang.ClassLoader classLoader4 = defpackage.ijx.a;
                z = parcel.readInt() != 0;
                defpackage.ijx.d(parcel);
                t(z);
                break;
            case 16:
                int i3 = parcel.readInt();
                java.lang.ClassLoader classLoader5 = defpackage.ijx.a;
                z = parcel.readInt() != 0;
                com.google.android.gms.car.animation.ProjectionWindowAnimationParams projectionWindowAnimationParams3 = (com.google.android.gms.car.animation.ProjectionWindowAnimationParams) defpackage.ijx.a(parcel, com.google.android.gms.car.animation.ProjectionWindowAnimationParams.CREATOR);
                defpackage.ijx.d(parcel);
                l(i3, z, projectionWindowAnimationParams3);
                break;
            case 17:
                android.os.Bundle bundle = (android.os.Bundle) defpackage.ijx.a(parcel, android.os.Bundle.CREATOR);
                defpackage.ijx.d(parcel);
                p(bundle);
                break;
            case 18:
                q();
                break;
            case 19:
                java.lang.ClassLoader classLoader6 = defpackage.ijx.a;
                z = parcel.readInt() != 0;
                defpackage.ijx.d(parcel);
                o(z);
                break;
            case 20:
                java.util.ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(android.graphics.Rect.CREATOR);
                defpackage.ijx.d(parcel);
                m(arrayListCreateTypedArrayList);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // defpackage.qzv
    public final void f(com.google.android.gms.car.animation.ProjectionWindowAnimationParams projectionWindowAnimationParams) {
        defpackage.yqm yqmVar = defpackage.jhe.a;
        ((defpackage.yqj) yqmVar.l().ai(2044)).M("Binder:%s.hideWindow(%s)", a(), projectionWindowAnimationParams);
        defpackage.jhe jheVar = (defpackage.jhe) this.a.get();
        if (jheVar != null) {
            defpackage.rbz.h(new defpackage.inq(jheVar, projectionWindowAnimationParams, 17));
        } else {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 2045)).u("hideWindowWithAnimation unable to run, window no longer exists");
        }
    }

    @Override // defpackage.qzv
    public final void g(com.google.android.gms.car.KeyEventCompleteData keyEventCompleteData) throws android.os.RemoteException {
        defpackage.yqm yqmVar = defpackage.jhe.a;
        a();
        b(keyEventCompleteData);
    }

    @Override // defpackage.qzv
    public final void h(com.google.android.gms.car.TouchEventCompleteData touchEventCompleteData) throws android.os.RemoteException {
        defpackage.yqm yqmVar = defpackage.jhe.a;
        a();
        c(touchEventCompleteData);
    }

    @Override // defpackage.qzv
    public final void i() throws android.os.RemoteException {
        defpackage.yqm yqmVar = defpackage.jhe.a;
        ((defpackage.yqj) yqmVar.l().ai((char) 2053)).y("Binder:%s.onSurfaceReleased()", a());
        defpackage.jhe jheVar = (defpackage.jhe) this.a.get();
        if (jheVar != null) {
            jheVar.h.aV();
        } else {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 2054)).u("onSurfaceReleased unable to run, window no longer exists");
        }
    }

    @Override // defpackage.qzv
    public final void j() throws android.os.RemoteException {
        defpackage.yqm yqmVar = defpackage.jhe.a;
        ((defpackage.yqj) yqmVar.l().ai((char) 2055)).y("Binder:%s.onWindowAttachComplete()", a());
        defpackage.jhe jheVar = (defpackage.jhe) this.a.get();
        if (jheVar == null) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 2056)).u("onWindowAttachComplete unable to run, window no longer exists");
        } else {
            new defpackage.stq(android.os.Looper.getMainLooper()).post(new defpackage.ire(jheVar, 16));
        }
    }

    @Override // defpackage.qzv
    public final void k() throws android.os.RemoteException {
        defpackage.yqm yqmVar = defpackage.jhe.a;
        ((defpackage.yqj) yqmVar.l().ai((char) 2057)).y("Binder:%s.removeWindow()", a());
        defpackage.jhe jheVar = (defpackage.jhe) this.a.get();
        if (jheVar != null) {
            defpackage.rbz.h(new defpackage.jeo(jheVar, 11));
        } else {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 2058)).u("removeWindow unable to run, window no longer exists");
        }
    }

    @Override // defpackage.qzv
    public final void l(int i, boolean z, com.google.android.gms.car.animation.ProjectionWindowAnimationParams projectionWindowAnimationParams) {
        defpackage.yqm yqmVar = defpackage.jhe.a;
        ((defpackage.yqj) yqmVar.l().ai(2059)).S("Binder:%s.requestDragChange(%s, %s, %s)", a(), java.lang.Integer.valueOf(i), java.lang.Boolean.valueOf(z), projectionWindowAnimationParams);
        defpackage.jhe jheVar = (defpackage.jhe) this.a.get();
        if (jheVar != null) {
            defpackage.rbz.h(new rbg(jheVar, i, z, projectionWindowAnimationParams, 1));
        } else {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 2060)).u("requestDragChange unable to run, window no longer exists");
        }
    }

    @Override // defpackage.qzv
    public final void m(java.util.List list) {
        defpackage.jhe jheVar = (defpackage.jhe) this.a.get();
        if (jheVar != null) {
            defpackage.rbz.h(new defpackage.inq(jheVar, list, 19));
        } else {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.jhe.a.h()).ai((char) 2061)).u("requestDraggableAreaChange unable to run, window no longer exists");
        }
    }

    @Override // defpackage.qzv
    public final void n() {
        defpackage.yqm yqmVar = defpackage.jhe.a;
        ((defpackage.yqj) yqmVar.l().ai((char) 2062)).y("Binder: %s.requestFocus()", a());
        defpackage.jhe jheVar = (defpackage.jhe) this.a.get();
        if (jheVar != null) {
            defpackage.rbz.h(new defpackage.jeo(jheVar, 9));
        } else {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 2063)).u("requestFocus unable to run, window no longer exists");
        }
    }

    @Override // defpackage.qzv
    public final void o(boolean z) {
        defpackage.yqm yqmVar = defpackage.jhe.a;
        ((defpackage.yqj) yqmVar.l().ai(2064)).N("Binder:%s.setOverlayVisible(%s)", a(), z);
        defpackage.jhe jheVar = (defpackage.jhe) this.a.get();
        if (jheVar != null) {
            defpackage.rbz.h(new defpackage.jhc(jheVar, z, 4));
        } else {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 2065)).u("setOverlayVisible unable to run, window no longer exists");
        }
    }

    @Override // defpackage.qzv
    public final void p(android.os.Bundle bundle) throws android.os.RemoteException {
        defpackage.yqm yqmVar = defpackage.jhe.a;
        ((defpackage.yqj) yqmVar.l().ai((char) 2066)).y("Binder:%s.setSurfacePackage()", a());
        defpackage.jhe jheVar = (defpackage.jhe) this.a.get();
        if (jheVar == null) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 2067)).u("setSurfacePackage unable to run, window no longer exists");
        } else {
            defpackage.rbz.h(new defpackage.inq(jheVar, bundle, 13, null));
        }
    }

    @Override // defpackage.qzv
    public final void q() {
        defpackage.yqm yqmVar = defpackage.jhe.a;
        ((defpackage.yqj) yqmVar.l().ai((char) 2068)).y("Binder:%s.showTransient()", a());
        defpackage.jhe jheVar = (defpackage.jhe) this.a.get();
        if (jheVar != null) {
            defpackage.rbz.h(new defpackage.jeo(jheVar, 10));
        } else {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 2069)).u("showTransient unable to run, window no longer exists");
        }
    }

    @Override // defpackage.qzv
    public final void r(boolean z) {
        defpackage.yqm yqmVar = defpackage.jhe.a;
        ((defpackage.yqj) yqmVar.l().ai(2070)).N("Binder:%s.showWindow(%b)", a(), z);
        defpackage.jhe jheVar = (defpackage.jhe) this.a.get();
        if (jheVar != null) {
            defpackage.rbz.h(new defpackage.jhc(jheVar, z, 0));
        } else {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 2071)).u("showWindow unable to run, window no longer exists");
        }
    }

    @Override // defpackage.qzv
    public final void s(com.google.android.gms.car.animation.ProjectionWindowAnimationParams projectionWindowAnimationParams) {
        defpackage.yqm yqmVar = defpackage.jhe.a;
        ((defpackage.yqj) yqmVar.l().ai(2072)).M("Binder:%s.showWindow(%s)", a(), projectionWindowAnimationParams);
        defpackage.jhe jheVar = (defpackage.jhe) this.a.get();
        if (jheVar != null) {
            defpackage.rbz.h(new defpackage.inq(jheVar, projectionWindowAnimationParams, 20));
        } else {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 2073)).u("showWindowWithAnimation unable to run, window no longer exists");
        }
    }

    @Override // defpackage.qzv
    public final void t(boolean z) {
        defpackage.yqm yqmVar = defpackage.jhe.a;
        ((defpackage.yqj) yqmVar.l().ai(2074)).N("Binder:%s.updateCriticalUiState(%s)", a(), z);
        defpackage.jhe jheVar = (defpackage.jhe) this.a.get();
        if (jheVar != null) {
            defpackage.rbz.h(new defpackage.jhc(jheVar, z, 3));
        } else {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 2075)).u("updateCriticalUiState unable to run, window no longer exists");
        }
    }

    @Override // defpackage.qzv
    public final void u(android.graphics.Rect rect) {
        defpackage.yqm yqmVar = defpackage.jhe.a;
        ((defpackage.yqj) yqmVar.l().ai(2078)).M("Binder:%s.updateWindowInsets(%s)", a(), rect);
        defpackage.jhe jheVar = (defpackage.jhe) this.a.get();
        if (jheVar != null) {
            defpackage.rbz.h(new defpackage.inq(jheVar, rect, 16, null));
        } else {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 2079)).u("updateWindowInsets unable to run, window no longer exists");
        }
    }
}
