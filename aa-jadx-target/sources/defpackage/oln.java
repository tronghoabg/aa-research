package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class oln {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;
    public java.lang.Object e;

    public oln(defpackage.eqp eqpVar, defpackage.zbe zbeVar, com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon, com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon2, com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon3, com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon4, defpackage.eqp eqpVar2) {
        this.a = zbeVar;
        defpackage.yrs.d("GH.ActionHelper");
        defpackage.afdo afdoVar = defpackage.tcu.a;
        defpackage.tcj tcjVar = new defpackage.tcj(defpackage.ebo.g(defpackage.ebo.f(eqpVar, new defpackage.dbj(this, 20)), new defpackage.lto(new defpackage.lsa(3), 1)), eqpVar2, new defpackage.lth(this, ghIcon3, ghIcon4, ghIcon, ghIcon2, 0));
        int i = 14;
        this.b = defpackage.ebo.f(tcjVar, new defpackage.nnp(new defpackage.lsa(4), i));
        this.d = defpackage.ebo.f(tcjVar, new defpackage.nnp(new defpackage.lsa(5), i));
        this.c = defpackage.ebo.f(tcjVar, new defpackage.lsa(6));
    }

    private static final boolean k(lok lokVar, java.lang.String str) {
        return lokVar.a().getBoolean(str, false);
    }

    private final float l(int i, boolean z) {
        android.text.Layout layout = (android.text.Layout) this.c;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i));
        if (i > lineEnd) {
            i = lineEnd;
        }
        return z ? layout.getPrimaryHorizontal(i) : layout.getSecondaryHorizontal(i);
    }

    public final void a(java.io.File file, java.lang.String str) throws java.io.IOException {
        try {
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
            try {
                java.lang.Object obj = this.e;
                obj.getClass();
                ((java.io.FileOutputStream) obj).write(java.lang.String.format(java.util.Locale.US, "---------- %s ----------\n\n", str).getBytes(java.nio.charset.StandardCharsets.UTF_8));
                java.lang.Object obj2 = this.e;
                obj2.getClass();
                defpackage.yux.a(fileInputStream, (java.io.OutputStream) obj2);
                fileInputStream.close();
            } catch (java.lang.Throwable th) {
                try {
                    fileInputStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.io.IOException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yox) this.a).h()).ai((char) 6007)).y("Failure to write info for header: %s", str);
            throw new java.io.IOException("IO error dumping output stream", e);
        }
    }

    public final lkj b(lok lokVar) {
        return lokVar.i.h((defpackage.zbe) this.a);
    }

    public final defpackage.ltm c(lti ltiVar, defpackage.ltm ltmVar, lok lokVar, com.google.android.apps.auto.components.media.compat.AaPlaybackState aaPlaybackState, java.util.List list) {
        if (defpackage.lhc.b(aaPlaybackState, ltiVar.c)) {
            return ltmVar;
        }
        java.lang.String str = ltiVar.d;
        java.lang.String str2 = ltiVar.e;
        boolean zK = k(lokVar, str);
        boolean zK2 = k(lokVar, str2);
        if (zK2) {
            android.content.ComponentName componentName = lokVar.c.a;
        }
        if (zK || zK2) {
            return new defpackage.ltm(ltmVar.a, false, ltmVar.c);
        }
        if (list.isEmpty()) {
            return null;
        }
        com.google.android.apps.auto.components.media.compat.AaPlaybackState.AaCustomAction aaCustomAction = (com.google.android.apps.auto.components.media.compat.AaPlaybackState.AaCustomAction) list.remove(0);
        int iO = aaCustomAction.O();
        java.lang.String str3 = lokVar.c.b;
        str3.getClass();
        return new defpackage.ltm(com.google.android.apps.auto.components.graphics.icon.GhIcon.r(str3, iO), true, new defpackage.kla(this, aaCustomAction, 13));
    }

    public final void d(com.google.android.apps.auto.components.media.compat.AaPlaybackState.AaCustomAction aaCustomAction) {
        java.lang.Object obj = this.e;
        if (obj == null) {
            throw new java.lang.IllegalStateException("Action executed after connection lost");
        }
        b((lok) obj).f(aaCustomAction, aaCustomAction.n());
    }

    public final float e(int i, boolean z, boolean z2) {
        int i2;
        int i3;
        if (!z2) {
            return l(i, z);
        }
        android.text.Layout layout = (android.text.Layout) this.c;
        int iE = defpackage.dax.e(layout, i);
        int lineStart = layout.getLineStart(iE);
        int lineEnd = layout.getLineEnd(iE);
        if (i != lineStart && i != lineEnd) {
            return l(i, z);
        }
        if (i == 0 || i == layout.getText().length()) {
            return l(i, z);
        }
        boolean z3 = true;
        int iF = f(i, true);
        boolean zJ = j(iF);
        int iH = h(lineEnd, lineStart);
        int iG = g(iF);
        int i4 = lineStart - iG;
        int i5 = iH - iG;
        java.text.Bidi bidiI = i(iF);
        java.text.Bidi bidiCreateLineBidi = bidiI != null ? bidiI.createLineBidi(i4, i5) : null;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = layout.isRtlCharAt(lineStart);
            if (!z && zJ != zIsRtlCharAt) {
                z3 = zJ;
            } else if (zJ) {
                z3 = false;
            }
            return (i != lineStart ? z3 : !z3) ? layout.getLineRight(iE) : layout.getLineLeft(iE);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        defpackage.dgj[] dgjVarArr = new defpackage.dgj[runCount];
        for (int i6 = 0; i6 < runCount; i6++) {
            dgjVarArr[i6] = new defpackage.dgj(bidiCreateLineBidi.getRunStart(i6) + lineStart, bidiCreateLineBidi.getRunLimit(i6) + lineStart, bidiCreateLineBidi.getRunLevel(i6) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i7 = 0; i7 < runCount2; i7++) {
            bArr[i7] = (byte) bidiCreateLineBidi.getRunLevel(i7);
        }
        java.text.Bidi.reorderVisually(bArr, 0, dgjVarArr, 0, runCount);
        if (i == lineStart) {
            int i8 = 0;
            while (true) {
                if (i8 >= runCount) {
                    i8 = -1;
                    break;
                }
                if (dgjVarArr[i8].a == i) {
                    break;
                }
                i8++;
            }
            defpackage.dgj dgjVar = dgjVarArr[i8];
            if (z || zJ == dgjVar.c) {
                zJ = !zJ;
            }
            if (i8 != 0) {
                i3 = i8;
            } else {
                if (zJ) {
                    return layout.getLineLeft(iE);
                }
                i3 = 0;
            }
            if (i3 != runCount - 1 || zJ) {
                return zJ ? layout.getPrimaryHorizontal(dgjVarArr[i3 - 1].a) : layout.getPrimaryHorizontal(dgjVarArr[i3 + 1].a);
            }
            return layout.getLineRight(iE);
        }
        int iH2 = i > iH ? h(i, lineStart) : i;
        int i9 = 0;
        while (true) {
            if (i9 >= runCount) {
                i9 = -1;
                break;
            }
            if (dgjVarArr[i9].b == iH2) {
                break;
            }
            i9++;
        }
        defpackage.dgj dgjVar2 = dgjVarArr[i9];
        if (!z && zJ != dgjVar2.c) {
            zJ = !zJ;
        }
        if (i9 != 0) {
            i2 = i9;
        } else {
            if (zJ) {
                return layout.getLineLeft(iE);
            }
            i2 = 0;
        }
        if (i2 != runCount - 1 || zJ) {
            return zJ ? layout.getPrimaryHorizontal(dgjVarArr[i2 - 1].b) : layout.getPrimaryHorizontal(dgjVarArr[i2 + 1].b);
        }
        return layout.getLineRight(iE);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    public final int f(int i, boolean z) {
        ?? r1 = this.d;
        int iBm = defpackage.afga.bm(r1, java.lang.Integer.valueOf(i));
        int i2 = iBm < 0 ? -(iBm + 1) : iBm + 1;
        if (z && i2 > 0) {
            int i3 = i2 - 1;
            if (i == ((java.lang.Number) r1.get(i3)).intValue()) {
                return i3;
            }
        }
        return i2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final int g(int i) {
        if (i == 0) {
            return 0;
        }
        return ((java.lang.Number) this.d.get(i - 1)).intValue();
    }

    public final int h(int i, int i2) {
        while (i > i2) {
            int i3 = i - 1;
            char cCharAt = ((android.text.Layout) this.c).getText().charAt(i3);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != 5760) {
                if (defpackage.afga.b(cCharAt, 8192) < 0 || defpackage.afga.b(cCharAt, 8202) > 0) {
                    if (cCharAt != 8287 && cCharAt != 12288) {
                        break;
                    }
                } else if (cCharAt == 8199) {
                    cCharAt = 8199;
                    if (cCharAt != 8287) {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            i = i3;
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0067  */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    public final java.text.Bidi i(int i) {
        java.text.Bidi bidi;
        boolean[] zArr = (boolean[]) this.a;
        if (zArr[i]) {
            return (java.text.Bidi) this.b.get(i);
        }
        int iIntValue = i == 0 ? 0 : ((java.lang.Number) this.d.get(i - 1)).intValue();
        int iIntValue2 = ((java.lang.Number) this.d.get(i)).intValue();
        int i2 = iIntValue2 - iIntValue;
        java.lang.Object obj = this.e;
        if (obj == null || ((char[]) obj).length < i2) {
            obj = new char[i2];
        }
        java.lang.Object obj2 = obj;
        char[] cArr = (char[]) obj2;
        android.text.TextUtils.getChars(((android.text.Layout) this.c).getText(), iIntValue, iIntValue2, cArr, 0);
        if (java.text.Bidi.requiresBidi(cArr, 0, i2)) {
            bidi = new java.text.Bidi(cArr, 0, null, 0, i2, j(i) ? 1 : 0);
            if (bidi.getRunCount() == 1) {
                bidi = null;
            }
        } else {
            bidi = null;
        }
        this.b.set(i, bidi);
        zArr[i] = true;
        if (bidi != null) {
            java.lang.Object obj3 = this.e;
            obj2 = obj2 == obj3 ? null : obj3;
        }
        this.e = obj2;
        return bidi;
    }

    public final boolean j(int i) {
        int iG = g(i);
        android.text.Layout layout = (android.text.Layout) this.c;
        return layout.getParagraphDirection(layout.getLineForOffset(iG)) == -1;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.List] */
    public oln(android.text.Layout layout) {
        this.c = layout;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = 0;
        do {
            int iD = afzh.D(((android.text.Layout) this.c).getText(), '\n', length);
            length = iD < 0 ? ((android.text.Layout) this.c).getText().length() : iD + 1;
            arrayList.add(java.lang.Integer.valueOf(length));
        } while (length < ((android.text.Layout) this.c).getText().length());
        this.d = arrayList;
        int size = arrayList.size();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(null);
        }
        this.b = arrayList2;
        this.a = new boolean[this.d.size()];
        this.d.size();
    }

    public oln(android.content.Context context, ryh ryhVar) {
        defpackage.xzi xziVarAQ = defpackage.ysr.aQ(new defpackage.joi(12));
        this.a = defpackage.yqm.c("GH.BR.HANDLER");
        this.c = context;
        this.b = ryhVar;
        this.d = xziVarAQ;
    }
}
