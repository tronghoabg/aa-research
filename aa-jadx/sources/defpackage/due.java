package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class due {
    static android.app.Notification.ProgressStyle.Point a(defpackage.dug dugVar) {
        return new android.app.Notification.ProgressStyle.Point(dugVar.a).setColor(dugVar.c).setId(dugVar.b);
    }

    static android.app.Notification.ProgressStyle.Segment b(defpackage.duh duhVar) {
        return new android.app.Notification.ProgressStyle.Segment(duhVar.a).setColor(duhVar.c).setId(duhVar.b);
    }

    static void c(android.app.Notification.ProgressStyle progressStyle, int i) {
        progressStyle.setProgress(i);
    }

    static void d(android.app.Notification.ProgressStyle progressStyle, android.graphics.drawable.Icon icon) {
        progressStyle.setProgressEndIcon(icon);
    }

    static void e(android.app.Notification.ProgressStyle progressStyle, boolean z) {
        progressStyle.setProgressIndeterminate(z);
    }

    static void f(android.app.Notification.ProgressStyle progressStyle, java.util.List<defpackage.dug> list) {
        java.util.Iterator<defpackage.dug> it = list.iterator();
        while (it.hasNext()) {
            progressStyle.addProgressPoint(a(it.next()));
        }
    }

    static void g(android.app.Notification.ProgressStyle progressStyle, java.util.List<defpackage.duh> list) {
        java.util.Iterator<defpackage.duh> it = list.iterator();
        while (it.hasNext()) {
            progressStyle.addProgressSegment(b(it.next()));
        }
    }

    static void h(android.app.Notification.ProgressStyle progressStyle, android.graphics.drawable.Icon icon) {
        progressStyle.setProgressStartIcon(icon);
    }

    static void i(android.app.Notification.ProgressStyle progressStyle, android.graphics.drawable.Icon icon) {
        progressStyle.setProgressTrackerIcon(icon);
    }

    static void j(android.app.Notification.ProgressStyle progressStyle, boolean z) {
        progressStyle.setStyledByProgress(z);
    }

    public static final void k(android.content.ContentProviderClient contentProviderClient) throws java.lang.Exception {
        if (contentProviderClient != null) {
            contentProviderClient.close();
        }
    }

    public static boolean l(byte[] bArr, byte[] bArr2) {
        if (bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr2.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static long[] m(java.lang.Object obj) {
        if (!(obj instanceof int[])) {
            if (obj instanceof long[]) {
                return (long[]) obj;
            }
            return null;
        }
        int[] iArr = (int[]) obj;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003b  */
    public static boolean n(android.text.Editable editable, android.view.KeyEvent keyEvent, boolean z) {
        defpackage.emy[] emyVarArr;
        if (android.view.KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = android.text.Selection.getSelectionStart(editable);
            int selectionEnd = android.text.Selection.getSelectionEnd(editable);
            if (!p(selectionStart, selectionEnd) && (emyVarArr = (defpackage.emy[]) editable.getSpans(selectionStart, selectionEnd, defpackage.emy.class)) != null && (emyVarArr.length) > 0) {
                for (defpackage.emy emyVar : emyVarArr) {
                    int spanStart = editable.getSpanStart(emyVar);
                    int spanEnd = editable.getSpanEnd(emyVar);
                    if (z) {
                        if (spanStart != selectionStart) {
                            if (selectionStart > spanStart || selectionStart >= spanEnd) {
                            }
                        }
                    } else if (spanEnd != selectionStart) {
                        if (selectionStart > spanStart) {
                        }
                    }
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean o(android.view.inputmethod.InputConnection inputConnection, android.text.Editable editable, int i, int i2, boolean z) {
        int iMin;
        if (editable != null && i >= 0 && i2 >= 0) {
            int selectionStart = android.text.Selection.getSelectionStart(editable);
            int selectionEnd = android.text.Selection.getSelectionEnd(editable);
            if (!p(selectionStart, selectionEnd)) {
                if (z) {
                    int iMax = java.lang.Math.max(i, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && iMax >= 0) {
                        loop0: while (true) {
                            boolean z2 = false;
                            while (true) {
                                if (iMax != 0) {
                                    selectionStart--;
                                    if (selectionStart < 0) {
                                        if (!z2) {
                                            selectionStart = 0;
                                            break loop0;
                                        }
                                        break loop0;
                                    }
                                    char cCharAt = editable.charAt(selectionStart);
                                    if (z2) {
                                        if (java.lang.Character.isHighSurrogate(cCharAt)) {
                                            iMax--;
                                        }
                                    } else if (!java.lang.Character.isSurrogate(cCharAt)) {
                                        iMax--;
                                    } else if (!java.lang.Character.isHighSurrogate(cCharAt)) {
                                        z2 = true;
                                    }
                                    selectionStart = -1;
                                    break loop0;
                                }
                                break loop0;
                            }
                        }
                    }
                    selectionStart = -1;
                    break loop0;
                    int iMax2 = java.lang.Math.max(i2, 0);
                    iMin = editable.length();
                    if (selectionEnd >= 0 && iMin >= selectionEnd && iMax2 >= 0) {
                        loop2: while (true) {
                            boolean z3 = false;
                            while (true) {
                                if (iMax2 == 0) {
                                    iMin = selectionEnd;
                                    break loop2;
                                }
                                if (selectionEnd >= iMin) {
                                    if (!z3) {
                                        break loop2;
                                    }
                                    break loop2;
                                }
                                char cCharAt2 = editable.charAt(selectionEnd);
                                if (z3) {
                                    if (java.lang.Character.isLowSurrogate(cCharAt2)) {
                                        selectionEnd++;
                                        iMax2--;
                                    }
                                } else if (!java.lang.Character.isSurrogate(cCharAt2)) {
                                    selectionEnd++;
                                    iMax2--;
                                } else if (!java.lang.Character.isLowSurrogate(cCharAt2)) {
                                    selectionEnd++;
                                    z3 = true;
                                }
                                iMin = -1;
                                break loop2;
                            }
                        }
                    }
                    iMin = -1;
                    break loop2;
                    if (selectionStart != -1 && iMin != -1) {
                    }
                } else {
                    selectionStart = java.lang.Math.max(selectionStart - i, 0);
                    iMin = java.lang.Math.min(selectionEnd + i2, editable.length());
                }
                defpackage.emy[] emyVarArr = (defpackage.emy[]) editable.getSpans(selectionStart, iMin, defpackage.emy.class);
                if (emyVarArr != null && (emyVarArr.length) > 0) {
                    for (defpackage.emy emyVar : emyVarArr) {
                        int spanStart = editable.getSpanStart(emyVar);
                        int spanEnd = editable.getSpanEnd(emyVar);
                        selectionStart = java.lang.Math.min(spanStart, selectionStart);
                        iMin = java.lang.Math.max(spanEnd, iMin);
                    }
                    int iMax3 = java.lang.Math.max(selectionStart, 0);
                    int iMin2 = java.lang.Math.min(iMin, editable.length());
                    inputConnection.beginBatchEdit();
                    editable.delete(iMax3, iMin2);
                    inputConnection.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean p(int i, int i2) {
        return i == -1 || i2 == -1 || i != i2;
    }
}
