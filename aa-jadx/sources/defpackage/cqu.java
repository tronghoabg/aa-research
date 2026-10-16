package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cqu {
    public final java.util.List a;
    public final int b;
    public final int c;
    public final int d;
    public int e;
    public final defpackage.xh f;

    /* JADX WARN: Code duplicated, block: B:45:0x007d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ae  */
    public cqu(java.util.List list, defpackage.xh xhVar) {
        android.view.MotionEvent motionEventA;
        this.a = list;
        this.f = xhVar;
        int i = 0;
        this.b = (android.os.Build.VERSION.SDK_INT < 29 || (motionEventA = a()) == null) ? 0 : motionEventA.getClassification();
        android.view.MotionEvent motionEventA2 = a();
        this.c = motionEventA2 != null ? motionEventA2.getButtonState() : 0;
        android.view.MotionEvent motionEventA3 = a();
        this.d = motionEventA3 != null ? motionEventA3.getMetaState() : 0;
        android.view.MotionEvent motionEventA4 = a();
        if (motionEventA4 != null) {
            int iC = xhVar != null ? xhVar.c() : 0;
            boolean z = xhVar != null && xhVar.c() == 4;
            int actionMasked = motionEventA4.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 5:
                                if (iC == 5) {
                                    i = 10;
                                } else if (!z) {
                                    i = 1;
                                } else {
                                    i = 7;
                                }
                                break;
                            case 6:
                                if (iC == 5) {
                                    i = 12;
                                } else if (!z) {
                                    i = 2;
                                } else {
                                    i = 9;
                                }
                                break;
                            case 7:
                                if (iC == 5) {
                                    i = 11;
                                } else if (!z) {
                                    i = 3;
                                } else {
                                    i = 8;
                                }
                                break;
                            case 8:
                                i = 6;
                                break;
                            case 9:
                                i = 4;
                                break;
                            case 10:
                                i = 5;
                                break;
                        }
                    } else if (iC == 5) {
                        i = 11;
                    } else if (!z) {
                        i = 8;
                    } else {
                        i = 3;
                    }
                } else if (iC == 5) {
                    i = 12;
                } else {
                    i = 2;
                }
            } else if (iC == 5) {
                i = 10;
            } else {
                i = 1;
            }
        } else {
            int size = list.size();
            while (true) {
                if (i < size) {
                    defpackage.crd crdVar = (defpackage.crd) list.get(i);
                    if (defpackage.tq.l(crdVar)) {
                        i = 2;
                    } else if (defpackage.tq.j(crdVar)) {
                        i = 1;
                    } else {
                        i++;
                    }
                } else {
                    i = 3;
                }
            }
        }
        this.e = i;
    }

    public final android.view.MotionEvent a() {
        defpackage.xh xhVar = this.f;
        if (xhVar != null) {
            return xhVar.a();
        }
        return null;
    }
}
