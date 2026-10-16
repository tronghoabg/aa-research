package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class wuj implements java.lang.Runnable {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ wuj(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    /* JADX WARN: Code duplicated, block: B:34:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b6  */
    @Override // java.lang.Runnable
    public final void run() throws wfo {
        android.content.Context context;
        android.graphics.Rect rect;
        com.google.android.libraries.handwriting.base.StrokeList strokeList;
        com.google.android.projection.gearhead.input.HwrView hwrView;
        xev xevVar;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                wll wllVar = new wll();
                wut wutVar = (wut) this.a;
                wllVar.a(wutVar.f(true));
                java.util.Iterator it = wutVar.i(true).iterator();
                while (it.hasNext()) {
                    wllVar.b((emv) it.next());
                }
                wllVar.c(new wuk(wutVar, wllVar, 1));
                wllVar.e();
                wutVar.m = wllVar;
                return;
            case 1:
                ((android.view.View) this.a).requestFocus();
                return;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                ((com.google.android.material.search.SearchView) this.a).d();
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                wut wutVar2 = (wut) this.a;
                com.google.android.material.internal.ClippableRoundedCornerLayout clippableRoundedCornerLayout = wutVar2.c;
                clippableRoundedCornerLayout.setTranslationY(clippableRoundedCornerLayout.getHeight());
                android.animation.AnimatorSet animatorSetG = wutVar2.g(true);
                animatorSetG.addListener(new wul(wutVar2, animatorSetG));
                animatorSetG.start();
                wutVar2.n = animatorSetG;
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                wwf wwfVar = (wwf) this.a;
                wwfVar.b = false;
                com.google.android.material.sidesheet.SideSheetBehavior sideSheetBehavior = wwfVar.c;
                defpackage.eeu eeuVar = sideSheetBehavior.d;
                if (eeuVar != null && eeuVar.l()) {
                    wwfVar.a(wwfVar.a);
                    return;
                } else {
                    if (sideSheetBehavior.c == 2) {
                        sideSheetBehavior.B(wwfVar.a);
                        return;
                    }
                    return;
                }
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                com.google.android.material.snackbar.BaseTransientBottomBar baseTransientBottomBar = (com.google.android.material.snackbar.BaseTransientBottomBar) this.a;
                wwp wwpVar = baseTransientBottomBar.j;
                if (wwpVar == null || (context = baseTransientBottomBar.i) == null) {
                    return;
                }
                android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService("window");
                if (android.os.Build.VERSION.SDK_INT >= 30) {
                    rect = bgp$.ExternalSyntheticApiModelOutline0.m(bgp$.ExternalSyntheticApiModelOutline0.m(windowManager));
                } else {
                    android.view.Display defaultDisplay = windowManager.getDefaultDisplay();
                    android.graphics.Point point = new android.graphics.Point();
                    defaultDisplay.getRealSize(point);
                    rect = new android.graphics.Rect();
                    rect.right = point.x;
                    rect.bottom = point.y;
                }
                int iHeight = rect.height();
                int[] iArr = new int[2];
                wwpVar.getLocationInWindow(iArr);
                int height = iHeight - (iArr[1] + wwpVar.getHeight());
                int translationY = (int) wwpVar.getTranslationY();
                int i = baseTransientBottomBar.o;
                int i2 = height + translationY;
                if (i2 >= i) {
                    baseTransientBottomBar.p = i;
                    return;
                }
                android.view.ViewGroup.LayoutParams layoutParams = wwpVar.getLayoutParams();
                if (!(layoutParams instanceof android.view.ViewGroup.MarginLayoutParams)) {
                    android.util.Log.w(com.google.android.material.snackbar.BaseTransientBottomBar.b, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                    return;
                }
                baseTransientBottomBar.p = baseTransientBottomBar.o;
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += baseTransientBottomBar.o - i2;
                wwpVar.requestLayout();
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                ((com.google.android.material.snackbar.BaseTransientBottomBar) this.a).j();
                return;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                java.lang.Object obj = this.a;
                com.google.android.material.snackbar.BaseTransientBottomBar baseTransientBottomBar2 = (com.google.android.material.snackbar.BaseTransientBottomBar) obj;
                wwp wwpVar2 = baseTransientBottomBar2.j;
                if (wwpVar2 == null) {
                    return;
                }
                if (wwpVar2.getParent() != null) {
                    wwpVar2.setVisibility(0);
                }
                if (wwpVar2.c == 1) {
                    android.animation.ValueAnimator valueAnimatorC = baseTransientBottomBar2.c(new float[]{0.0f, 1.0f});
                    android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(0.8f, 1.0f);
                    valueAnimatorOfFloat.setInterpolator(baseTransientBottomBar2.g);
                    valueAnimatorOfFloat.addUpdateListener(new wmr(obj, 3));
                    android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
                    animatorSet.playTogether(valueAnimatorC, valueAnimatorOfFloat);
                    animatorSet.setDuration(baseTransientBottomBar2.c);
                    animatorSet.addListener(new wwn(baseTransientBottomBar2));
                    animatorSet.start();
                    return;
                }
                int iB = baseTransientBottomBar2.b();
                wwpVar2.setTranslationY(iB);
                android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
                valueAnimator.setIntValues(iB, 0);
                valueAnimator.setInterpolator(baseTransientBottomBar2.f);
                valueAnimator.setDuration(baseTransientBottomBar2.e);
                valueAnimator.addListener(new wwi(baseTransientBottomBar2));
                valueAnimator.addUpdateListener(new wmr(obj, 4));
                valueAnimator.start();
                return;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                ((wxk) this.a).f(true);
                return;
            case 9:
                wxs wxsVar = (wxs) this.a;
                boolean zIsPopupShowing = wxsVar.a.isPopupShowing();
                wxsVar.k(zIsPopupShowing);
                wxsVar.c = zIsPopupShowing;
                return;
            case 10:
                ((com.google.android.material.textfield.TextInputLayout) this.a).c.requestLayout();
                return;
            case 11:
                com.google.android.material.internal.CheckableImageButton checkableImageButton = ((com.google.android.material.textfield.TextInputLayout) this.a).b.d;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 12:
                ((defpackage.lin) this.a).n();
                return;
            case 13:
                java.lang.Object obj2 = this.a;
                if (((com.google.android.projection.gearhead.companion.DeveloperHeadUnitNetworkService) obj2).c != null) {
                    return;
                }
                try {
                    ((com.google.android.projection.gearhead.companion.DeveloperHeadUnitNetworkService) obj2).c = new java.net.ServerSocket(5277);
                    ((defpackage.yqj) ((defpackage.yqj) com.google.android.projection.gearhead.companion.DeveloperHeadUnitNetworkService.a.f()).ai((char) 9969)).w("Network server running on port %d", 5277);
                    try {
                        java.lang.Object obj3 = this.a;
                        java.net.ServerSocket serverSocket = ((com.google.android.projection.gearhead.companion.DeveloperHeadUnitNetworkService) obj3).c;
                        while (!((com.google.android.projection.gearhead.companion.DeveloperHeadUnitNetworkService) obj3).c.isClosed()) {
                            try {
                                try {
                                    java.net.Socket socketAccept = ((com.google.android.projection.gearhead.companion.DeveloperHeadUnitNetworkService) obj3).c.accept();
                                    try {
                                        if (((com.google.android.projection.gearhead.companion.DeveloperHeadUnitNetworkService) obj3).d.h()) {
                                            ((com.google.android.projection.gearhead.companion.DeveloperHeadUnitNetworkService) obj3).a(socketAccept);
                                        }
                                        if (socketAccept != null) {
                                            try {
                                                socketAccept.close();
                                            } catch (java.io.IOException unused) {
                                            }
                                        }
                                    } catch (java.lang.Throwable th) {
                                        if (socketAccept != null) {
                                            try {
                                                socketAccept.close();
                                            } catch (java.lang.Throwable th2) {
                                                th.addSuppressed(th2);
                                            }
                                            break;
                                        }
                                        throw th;
                                    }
                                    break;
                                } catch (java.io.IOException unused2) {
                                }
                            } catch (java.lang.Throwable th3) {
                                if (serverSocket != null) {
                                    try {
                                        serverSocket.close();
                                    } catch (java.lang.Throwable th4) {
                                        th3.addSuppressed(th4);
                                    }
                                    break;
                                }
                                throw th3;
                            }
                        }
                        if (serverSocket != null) {
                            serverSocket.close();
                        }
                    } catch (java.io.IOException unused3) {
                    } catch (java.lang.Throwable th5) {
                        ((com.google.android.projection.gearhead.companion.DeveloperHeadUnitNetworkService) this.a).c = null;
                        throw th5;
                    }
                    ((com.google.android.projection.gearhead.companion.DeveloperHeadUnitNetworkService) this.a).c = null;
                    return;
                } catch (java.io.IOException e) {
                    ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) com.google.android.projection.gearhead.companion.DeveloperHeadUnitNetworkService.a.g()).p(e)).ai((char) 9970)).u("Unable to bind server");
                    ((com.google.android.projection.gearhead.companion.DeveloperHeadUnitNetworkService) this.a).stopSelf();
                    return;
                }
            case 14:
                defpackage.yqm yqmVar = com.google.android.projection.gearhead.companion.settings.LauncherAppSettingsActivity.m;
                ((defpackage.mr) this.a).a.setPressed(false);
                return;
            case 15:
                xck xckVar = (xck) this.a;
                if (xckVar.t) {
                    ((defpackage.yqj) ((defpackage.yqj) xck.f.f()).ai((char) 10042)).u("Starting pending cancelDialogIfPresent");
                    xckVar.t = false;
                    xckVar.s();
                }
                if (xckVar.u) {
                    ((defpackage.yqj) ((defpackage.yqj) xck.f.f()).ai((char) 10041)).u("Starting pending setUpPreferences");
                    xckVar.u = false;
                    xckVar.x();
                    return;
                }
                return;
            case 16:
                int i3 = xcn.t;
                defpackage.mrn.b().a(((mrp) this.a).h);
                return;
            case 17:
                android.animation.ObjectAnimator objectAnimatorOfInt = android.animation.ObjectAnimator.ofInt(this.a, "backgroundColor", -3355444, 0, -3355444, 0);
                objectAnimatorOfInt.setEvaluator(new android.animation.ArgbEvaluator());
                objectAnimatorOfInt.setDuration(2000L);
                objectAnimatorOfInt.start();
                return;
            case 18:
                java.lang.Object obj4 = this.a;
                com.google.android.projection.gearhead.input.HwrView hwrView2 = (com.google.android.projection.gearhead.input.HwrView) obj4;
                if (hwrView2.h) {
                    hwrView2.i = true;
                    return;
                }
                com.google.android.libraries.handwriting.base.StrokeList strokeList2 = hwrView2.a;
                synchronized (strokeList2) {
                    strokeList = new com.google.android.libraries.handwriting.base.StrokeList(strokeList2, true);
                    java.lang.CharSequence textBeforeCursor = ((xdo) ((com.google.android.projection.gearhead.input.HwrView) obj4).m.a).c.getTextBeforeCursor(20, 0);
                    strokeList.setPreContext(textBeforeCursor == null ? "" : textBeforeCursor.toString());
                    ((com.google.android.projection.gearhead.input.HwrView) obj4).a();
                    break;
                }
                if (strokeList.size() == 1) {
                    com.google.android.projection.gearhead.input.HwrView hwrView3 = (com.google.android.projection.gearhead.input.HwrView) this.a;
                    if (hwrView3.c.recognizeLastStrokeGesture(strokeList).equals(com.google.android.libraries.handwriting.gui.GestureRecognizer.Gesture.GEST_SPACE)) {
                        xdo xdoVar = (xdo) hwrView3.m.a;
                        xdoVar.e(32, 0);
                        xdoVar.f(32, false);
                    } else {
                        hwrView = (com.google.android.projection.gearhead.input.HwrView) this.a;
                        if (hwrView.b != null) {
                            new xdu(hwrView, strokeList).execute(new java.lang.Void[0]);
                        } else {
                            hwrView.g.f(true);
                        }
                    }
                } else {
                    hwrView = (com.google.android.projection.gearhead.input.HwrView) this.a;
                    if (hwrView.b != null) {
                        new xdu(hwrView, strokeList).execute(new java.lang.Void[0]);
                    } else {
                        hwrView.g.f(true);
                    }
                }
                ((com.google.android.projection.gearhead.input.HwrView) this.a).invalidate();
                return;
            case 19:
                com.google.android.projection.gearhead.input.HwrView hwrView4 = (com.google.android.projection.gearhead.input.HwrView) this.a;
                hwrView4.h = false;
                if (hwrView4.i) {
                    hwrView4.d.postDelayed(hwrView4.k, 750L);
                    hwrView4.i = false;
                }
                if (hwrView4.a.isEmpty()) {
                    return;
                }
                hwrView4.invalidate();
                return;
            default:
                com.google.android.projection.gearhead.input.RotaryKeyboardLayout rotaryKeyboardLayout = (com.google.android.projection.gearhead.input.RotaryKeyboardLayout) this.a;
                xeu xeuVarB = rotaryKeyboardLayout.b();
                if (xeuVarB == null || (xevVar = xeuVarB.f) == null) {
                    return;
                }
                rotaryKeyboardLayout.h.j = rotaryKeyboardLayout.i;
                rotaryKeyboardLayout.e(xevVar, true);
                rotaryKeyboardLayout.s = false;
                rotaryKeyboardLayout.r = false;
                return;
        }
    }

    public wuj(java.lang.Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
