package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cit {
    public static final defpackage.cit a = new defpackage.cit();
    public static final defpackage.cit b = new defpackage.cit();
    public static final defpackage.cit c = new defpackage.cit();
    public final defpackage.bzc d = new defpackage.bzc(new defpackage.ciw[16]);

    public final boolean a(int i) {
        if (this == a) {
            throw new java.lang.IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        if (this == b) {
            throw new java.lang.IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        defpackage.bzc bzcVar = this.d;
        int i2 = bzcVar.b;
        if (i2 == 0) {
            java.lang.System.out.println((java.lang.Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return false;
        }
        java.lang.Object[] objArr = bzcVar.a;
        boolean z = false;
        for (int i3 = 0; i3 < i2; i3++) {
            defpackage.ciw ciwVar = (defpackage.ciw) objArr[i3];
            if (!ciwVar.M().A) {
                defpackage.csc.c("visitChildren called on an unattached node");
            }
            defpackage.bzc bzcVar2 = new defpackage.bzc(new defpackage.cge[16]);
            defpackage.cge cgeVar = ciwVar.M().u;
            if (cgeVar == null) {
                defpackage.cjv.x(bzcVar2, ciwVar.M());
            } else {
                bzcVar2.n(cgeVar);
            }
            while (true) {
                int i4 = bzcVar2.b;
                if (i4 == 0) {
                    break;
                }
                defpackage.cge cgeVarO = (defpackage.cge) bzcVar2.c(i4 - 1);
                if ((cgeVarO.s & 1024) == 0) {
                    defpackage.cjv.x(bzcVar2, cgeVarO);
                } else {
                    while (cgeVarO != null) {
                        if ((cgeVarO.r & 1024) != 0) {
                            defpackage.bzc bzcVar3 = null;
                            while (cgeVarO != null) {
                                if (cgeVarO instanceof defpackage.cjc) {
                                    if (((defpackage.cjc) cgeVarO).k(i)) {
                                        z = true;
                                        break;
                                    }
                                } else if ((cgeVarO.r & 1024) != 0 && (cgeVarO instanceof defpackage.cwo)) {
                                    int i5 = 0;
                                    for (defpackage.cge cgeVar2 = ((defpackage.cwo) cgeVarO).C; cgeVar2 != null; cgeVar2 = cgeVar2.u) {
                                        if ((cgeVar2.r & 1024) != 0) {
                                            i5++;
                                            if (i5 == 1) {
                                                cgeVarO = cgeVar2;
                                            } else {
                                                if (bzcVar3 == null) {
                                                    bzcVar3 = new defpackage.bzc(new defpackage.cge[16]);
                                                }
                                                if (cgeVarO != null) {
                                                    bzcVar3.n(cgeVarO);
                                                }
                                                bzcVar3.n(cgeVar2);
                                                cgeVarO = null;
                                            }
                                        }
                                    }
                                    if (i5 != 1) {
                                    }
                                }
                                cgeVarO = defpackage.cjv.o(bzcVar3);
                            }
                            break;
                        }
                        cgeVarO = cgeVarO.u;
                    }
                }
            }
        }
        return z;
    }
}
