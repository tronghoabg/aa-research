package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ndd {
    public static defpackage.ndd d;
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;

    public ndd(android.content.Context context) {
        defpackage.lem.a();
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131167698);
        this.b = new android.widget.FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize, 17);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(2131167623);
        this.c = new android.widget.FrameLayout.LayoutParams(dimensionPixelSize2, dimensionPixelSize2, 8388627);
        int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(2131167631);
        this.a = new android.widget.FrameLayout.LayoutParams(dimensionPixelSize3, dimensionPixelSize3, 17);
    }

    public static void G(java.io.File file, java.io.File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            java.util.Objects.toString(file2);
            android.util.Log.e("AtomicFile", "Failed to delete file which is a directory ".concat(java.lang.String.valueOf(file2)));
        }
        if (file.renameTo(file2)) {
            return;
        }
        android.util.Log.e("AtomicFile", defpackage.a.bs(file2, file, "Failed to rename ", " to "));
    }

    public static boolean H(java.io.FileOutputStream fileOutputStream) {
        try {
            fileOutputStream.getFD().sync();
            return true;
        } catch (java.io.IOException unused) {
            return false;
        }
    }

    private static final void O(android.widget.ImageButton imageButton, int i, android.view.View.OnClickListener onClickListener) {
        imageButton.setVisibility(0);
        imageButton.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
        imageButton.setImageResource(i);
        imageButton.setOnClickListener(onClickListener);
    }

    private static java.lang.Object[] P(java.lang.Object[] objArr, int[] iArr) {
        int length = objArr.length;
        java.lang.Class<?> componentType = objArr.getClass().getComponentType();
        eor eorVar = androidx.gridlayout.widget.GridLayout.c;
        int iMax = -1;
        for (int i : iArr) {
            iMax = java.lang.Math.max(iMax, i);
        }
        java.lang.Object[] objArr2 = (java.lang.Object[]) java.lang.reflect.Array.newInstance(componentType, iMax + 1);
        for (int i2 = 0; i2 < length; i2++) {
            objArr2[iArr[i2]] = objArr[i2];
        }
        return objArr2;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0047  */
    static /* synthetic */ void d(defpackage.eqp eqpVar, defpackage.eqp eqpVar2, defpackage.eqp eqpVar3, defpackage.ndd nddVar, android.content.ComponentName componentName, ncu ncuVar, int i, int i2) {
        boolean z;
        ndh ndjVar;
        if ((i2 & 16) != 0) {
            componentName = (android.content.ComponentName) eqpVar.e();
        }
        if ((i2 & 32) != 0) {
            ncuVar = (ncu) eqpVar2.e();
        }
        boolean z2 = false;
        if ((i2 & 64) != 0) {
            java.lang.Integer num = (java.lang.Integer) eqpVar3.e();
            i = num != null ? num.intValue() : 0;
        }
        if (ncuVar == null) {
            z = false;
        } else {
            if (!defpackage.afga.f(ncuVar.a, componentName != null ? componentName.getPackageName() : null) || ncuVar.b.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
        }
        if (i != 0 && i != 2) {
            z2 = true;
        }
        ncq ncqVar = new ncq(componentName, z, z2);
        ndh ndhVarA = nddVar.a();
        android.content.ComponentName componentName2 = ncqVar.a;
        boolean z3 = ncqVar.b;
        boolean z4 = ncqVar.c;
        defpackage.yqm yqmVar = defpackage.nde.a;
        if (z4) {
            ndjVar = new ndh(componentName2);
        } else if (!defpackage.afga.f(componentName2, ndhVarA.a())) {
            ndjVar = z3 ? new ndj(componentName2) : new defpackage.ndk(componentName2);
        } else if (ndhVarA instanceof ndj) {
            ndjVar = !z3 ? new defpackage.ndk(componentName2) : ndhVarA;
        } else if (ndhVarA instanceof ndh) {
            ndjVar = z3 ? new ndj(componentName2) : new defpackage.ndk(componentName2);
        } else {
            if (ndhVarA instanceof defpackage.ndk) {
                if (z3) {
                    ndjVar = new ndj(componentName2);
                }
            } else if (!(ndhVarA instanceof ndg)) {
                throw new defpackage.afas();
            }
        }
        if (defpackage.afga.f(ndjVar, ndhVarA)) {
            return;
        }
        ncqVar.toString();
        nddVar.b(ndjVar, "nav app state changed to ".concat(ncqVar.toString()));
    }

    public static final int k(int i) {
        if (i == 1) {
            return 2131231745;
        }
        if (i == 2) {
            return 2131231594;
        }
        if (i == 4) {
            return 2131231678;
        }
        if (i == 8) {
            return 2131231803;
        }
        defpackage.rox.o("GH.TelecomUiHelper", "Unknown audio route: %d", java.lang.Integer.valueOf(i));
        return 2131231594;
    }

    static final void l(android.widget.ImageButton imageButton, int i, int i2, int i3, android.view.View.OnClickListener onClickListener, android.widget.FrameLayout.LayoutParams layoutParams) {
        imageButton.clearColorFilter();
        imageButton.setLayoutParams(layoutParams);
        imageButton.setImageTintList(new android.content.res.ColorStateList(new int[][]{new int[]{android.R.attr.state_activated}, new int[0]}, new int[]{i3, i2}));
        imageButton.setBackgroundResource(2131232834);
        O(imageButton, i, onClickListener);
    }

    static final void m(android.widget.ImageButton imageButton, int i, int i2, android.view.View.OnClickListener onClickListener, android.widget.FrameLayout.LayoutParams layoutParams) {
        imageButton.setBackgroundResource(0);
        imageButton.setImageTintList(null);
        imageButton.setLayoutParams(layoutParams);
        imageButton.setColorFilter(i2, android.graphics.PorterDuff.Mode.SRC_IN);
        O(imageButton, i, onClickListener);
    }

    public static int[] q(int[] iArr, int i) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr2[i2] = iArr[i2] + i;
        }
        return iArr2;
    }

    public static ukj r(int i) {
        return i + (-1) != 2 ? ukj.d : ukj.c;
    }

    public static abeg t(double[] dArr, int[] iArr, java.util.Collection collection, java.util.Collection collection2, int i, int i2, int i3, int i4, int i5, float f, double[] dArr2, double[] dArr3) {
        int length;
        double[] dArr4;
        int i6 = 0;
        while (true) {
            length = iArr.length;
            boolean z = true;
            if (i6 >= length) {
                break;
            }
            if (iArr[i6] == 0) {
                z = false;
            }
            defpackage.ysr.bk(z, "A lineBreak of 0 is implied and should not be present in the list.");
            i6++;
        }
        if (length != 0) {
            double[] dArr5 = new double[dArr.length + length + length];
            int i7 = 0;
            int i8 = 0;
            for (int i9 = 0; i9 < dArr.length; i9 += 2) {
                int i10 = i9 + i7;
                dArr5[i10] = dArr[i9];
                int i11 = i9 + 1;
                dArr5[i10 + 1] = dArr[i11];
                if (i8 < iArr.length) {
                    int i12 = i9 / 2;
                    int i13 = iArr[i8];
                    if (i12 == i13) {
                        dArr5[i10 + 2] = dArr[i9];
                        dArr5[i10 + 3] = dArr[i11];
                        iArr[i8] = i13 + (i7 / 2) + 1;
                        i7 += 2;
                        i8++;
                    }
                }
            }
            dArr4 = dArr5;
        } else {
            dArr4 = dArr;
        }
        defpackage.abot abotVarU = u(dArr4, i, i2, i3, i4, i5);
        for (int i14 : iArr) {
            abotVarU.t();
            abeg abegVar = abotVarU.b;
            abeg abegVar2 = abeg.a;
            defpackage.abpf abpfVar = abegVar.e;
            if (!abpfVar.c()) {
                abegVar.e = defpackage.abox.G(abpfVar);
            }
            abegVar.e.g(i14);
        }
        defpackage.pup pupVar = new defpackage.pup(3);
        java.util.Iterator it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                java.util.Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    abeb abebVarB = ((trm) it2.next()).b();
                    if (abebVarB != null) {
                        abotVarU.ba(abec.g, abebVarB);
                    }
                }
                java.util.Iterator it3 = collection2.iterator();
                while (it3.hasNext()) {
                    abeb abebVarB2 = ((trm) it3.next()).b();
                    if (abebVarB2 != null) {
                        abotVarU.ba(abec.h, abebVarB2);
                    }
                }
                break;
            }
            if (!pupVar.a(it.next())) {
                java.util.Iterator it4 = collection.iterator();
                while (it4.hasNext()) {
                    long jA = ((trm) it4.next()).a();
                    abotVarU.t();
                    abeg abegVar3 = abotVarU.b;
                    abeg abegVar4 = abeg.a;
                    defpackage.abpi abpiVar = abegVar3.f;
                    if (!abpiVar.c()) {
                        abegVar3.f = defpackage.abox.H(abpiVar);
                    }
                    abegVar3.f.f(jA);
                }
                break;
            }
        }
        abotVarU.bc(abja.h, java.lang.Float.valueOf(f));
        abotVarU.t();
        abeg abegVar5 = abotVarU.b;
        abeg abegVar6 = abeg.a;
        abegVar5.b |= 64;
        abegVar5.j = 4;
        if (dArr2 != null) {
            abotVarU.bc(ukm.e, defpackage.tan.x(dArr2));
        }
        if (dArr3 != null) {
            abotVarU.bc(ukm.f, defpackage.tan.x(dArr3));
        }
        return abotVarU.q();
    }

    public static defpackage.abot u(double[] dArr, int i, int i2, int i3, int i4, int i5) {
        defpackage.abnv abnvVarX = defpackage.tan.x(dArr);
        defpackage.abot abotVar = (defpackage.abot) abeg.a.n();
        abotVar.t();
        abeg abegVar = abotVar.b;
        abnvVarX.getClass();
        abegVar.b |= 1;
        abegVar.c = abnvVarX;
        int length = dArr.length >> 1;
        abotVar.t();
        abeg abegVar2 = abotVar.b;
        abegVar2.b |= 2;
        abegVar2.d = length;
        abotVar.t();
        abeg abegVar3 = abotVar.b;
        abegVar3.g = i3 - 1;
        abegVar3.b |= 8;
        abotVar.t();
        abeg abegVar4 = abotVar.b;
        abegVar4.h = i4 - 1;
        abegVar4.b |= 16;
        abotVar.t();
        abeg abegVar5 = abotVar.b;
        abegVar5.i = i5 - 1;
        abegVar5.b |= 32;
        abotVar.t();
        abeg abegVar6 = abotVar.b;
        abegVar6.b |= 2048;
        abegVar6.o = i;
        abotVar.t();
        abeg abegVar7 = abotVar.b;
        abegVar7.b |= 4096;
        abegVar7.p = i2;
        return abotVar;
    }

    public final java.lang.String A() {
        java.lang.String string = ((java.util.UUID) this.a).toString();
        string.getClass();
        return string;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [afar, java.lang.Object] */
    public final esm B() {
        return (esm) this.a.a();
    }

    public final java.lang.Object C(int i) {
        return ((java.lang.Object[]) this.b)[((int[]) this.a)[i]];
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [afdo, java.lang.Object] */
    public final defpackage.zhs D() {
        aiut aiutVar = don.a;
        return don.a((defpackage.afdo) this.b, new defpackage.btt(this, (defpackage.afdk) null, 10));
    }

    public final defpackage.zhs E(dzo dzoVar) {
        defpackage.zgm jofVar = new jof(this, dzoVar, 1);
        defpackage.zhs zhsVarA = ((defpackage.zhc) this.c).a(jofVar, defpackage.zgt.INSTANCE);
        zhsVarA.getClass();
        return zhsVarA;
    }

    public final java.io.FileInputStream F() throws java.io.FileNotFoundException {
        java.io.File file = (java.io.File) this.c;
        if (file.exists()) {
            G(file, (java.io.File) this.a);
        }
        java.lang.Object obj = this.b;
        java.io.File file2 = (java.io.File) obj;
        if (file2.exists() && ((java.io.File) this.a).exists() && !file2.delete()) {
            java.util.Objects.toString(obj);
            android.util.Log.e("AtomicFile", "Failed to delete outdated new file ".concat(obj.toString()));
        }
        return new java.io.FileInputStream((java.io.File) this.a);
    }

    public final float I(java.lang.Object obj) {
        if (!(obj instanceof dpv)) {
            if (obj instanceof dpr) {
                return ((dpr) obj).v();
            }
            return 0.0f;
        }
        java.lang.String strX = ((dpv) obj).x();
        java.util.HashMap map = (java.util.HashMap) this.c;
        if (map.containsKey(strX)) {
            return ((dpz) map.get(strX)).a();
        }
        java.util.HashMap map2 = (java.util.HashMap) this.b;
        if (map2.containsKey(strX)) {
            return ((java.lang.Integer) map2.get(strX)).floatValue();
        }
        return 0.0f;
    }

    public final void J(java.lang.String str, int i) {
        ((java.util.HashMap) this.b).put(str, java.lang.Integer.valueOf(i));
    }

    public final void K(java.lang.String str, java.util.ArrayList arrayList) {
        ((java.util.HashMap) this.a).put(str, arrayList);
    }

    public final android.location.Location L(java.lang.String str) {
        try {
            java.lang.Object obj = this.c;
            if (((android.location.LocationManager) obj).isProviderEnabled(str)) {
                return ((android.location.LocationManager) obj).getLastKnownLocation(str);
            }
            return null;
        } catch (java.lang.Exception e) {
            android.util.Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0058  */
    /* JADX WARN: Code duplicated, block: B:20:0x006e A[LOOP:0: B:16:0x0056->B:20:0x006e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:40:0x0071 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x009d -> B:27:0x00a3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object M(fsb r8, ajer r9, fti r10, java.lang.Object r11, ftm r12, fpy r13, defpackage.afdk r14) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ndd.M(fsb, ajer, fti, java.lang.Object, ftm, fpy, afdk):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0056  */
    /* JADX WARN: Code duplicated, block: B:19:0x006e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0087  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:32:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:45:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00b7 -> B:29:0x00bf). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object N(ajer r10, fti r11, java.lang.Object r12, ftm r13, fpy r14, defpackage.afdk r15) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ndd.N(ajer, fti, java.lang.Object, ftm, fpy, afdk):java.lang.Object");
    }

    public final defpackage.ndl a() {
        defpackage.ndl ndlVar = (defpackage.ndl) ((defpackage.eqp) this.b).e();
        if (ndlVar != null) {
            return ndlVar;
        }
        throw new java.lang.IllegalStateException("not started");
    }

    public final void b(defpackage.ndl ndlVar, java.lang.String str) {
        defpackage.eqp eqpVar = (defpackage.eqp) this.b;
        defpackage.ndl ndlVar2 = (defpackage.ndl) eqpVar.e();
        defpackage.ysr.bn(!defpackage.afga.f(ndlVar2, ndlVar), "Can't move from state %s to itself", ndlVar);
        java.lang.String str2 = ndlVar2 + " -> " + ndlVar + ": " + str;
        android.os.Handler handler = (android.os.Handler) this.a;
        byte[] bArr = null;
        handler.removeCallbacksAndMessages(null);
        if (ndlVar instanceof ndj) {
            j$.time.Duration duration = ((ndj) ndlVar).a;
            handler.postDelayed(new defpackage.mbx(this, ndlVar, 10, bArr), duration.toMillis());
            defpackage.nde.a.l().M("%s (will auto-dismiss card after %s)", str2, duration);
        } else {
            defpackage.nde.a.l().y("%s", str2);
        }
        eqpVar.m(ndlVar);
    }

    public final void c(defpackage.affc affcVar, java.lang.String str) {
        b((defpackage.ndl) affcVar.invoke(a().a()), str);
    }

    public final void e(android.widget.ImageButton imageButton, int i, android.view.View.OnClickListener onClickListener) {
        m(imageButton, 2131231594, i, onClickListener, (android.widget.FrameLayout.LayoutParams) this.c);
    }

    public final void f(android.widget.ImageButton imageButton, int i, android.view.View.OnClickListener onClickListener) {
        m(imageButton, 2131232841, i, onClickListener, (android.widget.FrameLayout.LayoutParams) this.b);
    }

    public final void g(android.widget.ImageButton imageButton, int i, int i2, android.view.View.OnClickListener onClickListener) {
        l(imageButton, 2131232837, i, i2, onClickListener, (android.widget.FrameLayout.LayoutParams) this.a);
    }

    public final void h(android.widget.ImageButton imageButton, int i, android.view.View.OnClickListener onClickListener) {
        m(imageButton, 2131232838, i, onClickListener, (android.widget.FrameLayout.LayoutParams) this.b);
    }

    public final void i(android.widget.ImageButton imageButton, int i, int i2, android.view.View.OnClickListener onClickListener) {
        l(imageButton, 2131232839, i, i2, onClickListener, (android.widget.FrameLayout.LayoutParams) this.a);
    }

    public final void j(android.widget.ImageButton imageButton, int i, android.view.View.OnClickListener onClickListener) {
        m(imageButton, 2131232851, i, onClickListener, (android.widget.FrameLayout.LayoutParams) this.b);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.lang.Runnable] */
    public final void n(mog mogVar) {
        if (mogVar == null) {
            return;
        }
        lyt lytVarA = lyt.a.a();
        java.lang.Long l = (java.lang.Long) lytVarA.d.get(this.b);
        if (l == null || l.longValue() != mogVar.A()) {
            return;
        }
        this.a.run();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, mnv] */
    public final void o() {
        defpackage.lxy.o().f(this.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, mnv] */
    public final void p() {
        defpackage.lxy.o().k(this.c);
    }

    public final tqs s(double d2, double d3, int i, trm trmVar, boolean z, int i2, int i3, int i4) {
        float[] fArr;
        int i5;
        float f;
        int length;
        trm trmVar2;
        tzl tzlVar;
        defpackage.abot abotVar = (defpackage.abot) abca.a.n();
        defpackage.abor aborVarN = abfa.a.n();
        char c = 2;
        float f2 = 1.0f;
        boolean z2 = true;
        char c2 = 4;
        if (i == 4) {
            fArr = new float[12];
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = 1.0f;
            fArr[3] = 1.0f;
            fArr[4] = -1.0f;
            fArr[5] = 1.0f;
            fArr[6] = -1.0f;
            fArr[7] = -1.0f;
            fArr[8] = 1.0f;
            fArr[9] = -1.0f;
            fArr[10] = 1.0f;
            fArr[11] = 1.0f;
            for (int i6 = 0; i6 < 11; i6 += 2) {
                float f3 = fArr[i6];
                int i7 = i6 + 1;
                float f4 = fArr[i7];
                fArr[i6] = (f3 * 1.0f) - (f4 * 0.0f);
                fArr[i7] = (f4 * 1.0f) + (f3 * 0.0f);
            }
            f = 1.0f;
        } else {
            int i8 = i + 2;
            fArr = new float[i8 + i8];
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            int i9 = 2;
            float f5 = 0.0f;
            int i10 = 0;
            while (true) {
                i5 = i9 + 1;
                if (i10 >= i) {
                    break;
                }
                char c3 = c2;
                float[] fArr2 = fArr;
                double d4 = f5;
                fArr2[i9] = (float) java.lang.Math.cos(d4);
                i9 += 2;
                fArr2[i5] = (float) java.lang.Math.sin(d4);
                f5 += (float) (6.283185307179586d / ((double) i));
                i10++;
                f2 = f2;
                z2 = z2;
                c2 = c3;
                fArr = fArr2;
                c = c;
            }
            f = f2;
            float[] fArr3 = fArr;
            fArr3[i9] = f;
            fArr3[i5] = 0.0f;
        }
        int length2 = fArr.length;
        float[] fArr4 = new float[length2];
        for (int i11 = 0; i11 < fArr.length - 1; i11 += 2) {
            float f6 = fArr[i11];
            int i12 = i11 + 1;
            float f7 = fArr[i12];
            fArr4[i11] = (((f6 * f) - (f7 * 0.0f)) + f) * 0.5f;
            fArr4[i12] = f - ((((f7 * f) + (f6 * 0.0f)) + f) * 0.5f);
        }
        for (int i13 = 0; i13 < length2; i13++) {
            float f8 = fArr4[i13];
            aborVarN.t();
            abfa abfaVar = aborVarN.b;
            abfaVar.b();
            abfaVar.e.g(f8);
        }
        int i14 = 0;
        while (true) {
            length = fArr.length;
            if (i14 >= length) {
                break;
            }
            fArr[i14] = fArr[i14] * 0.5f;
            i14++;
        }
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(length * 4);
        byteBufferAllocate.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.asFloatBuffer().put(fArr);
        defpackage.abnv abnvVarU = defpackage.abnv.u(byteBufferAllocate);
        aborVarN.t();
        abfa abfaVar2 = aborVarN.b;
        abfaVar2.b |= 2;
        abfaVar2.f = length >> 1;
        aborVarN.t();
        abfa abfaVar3 = aborVarN.b;
        abnvVarU.getClass();
        abfaVar3.b |= 1;
        abfaVar3.c = abnvVarU;
        aborVarN.t();
        abfa abfaVar4 = aborVarN.b;
        abfaVar4.b |= 4;
        abfaVar4.h = 0;
        if (z) {
            aborVarN.aa(0);
            aborVarN.aa(i + 1);
        }
        abotVar.t();
        abca abcaVar = abotVar.b;
        abfa abfaVarQ = aborVarN.q();
        abfaVarQ.getClass();
        abcaVar.c = abfaVarQ;
        abcaVar.b |= 1;
        abotVar.t();
        abca abcaVar2 = abotVar.b;
        abcaVar2.b |= 4;
        abcaVar2.e = z;
        abeb abebVarB = trmVar.b();
        if (abebVarB != null) {
            abotVar.bc(abec.b, abebVarB);
        } else if (trmVar.a() != -1) {
            int iA = trmVar.a();
            abotVar.t();
            abca abcaVar3 = abotVar.b;
            abcaVar3.b |= 128;
            abcaVar3.i = iA;
        }
        abotVar.t();
        abca abcaVar4 = abotVar.b;
        abcaVar4.b |= 512;
        abcaVar4.k = i3;
        abotVar.t();
        abca abcaVar5 = abotVar.b;
        abcaVar5.b |= 1024;
        abcaVar5.l = i4;
        abotVar.bc(ukm.c, r(i2));
        java.lang.Object obj = this.a;
        abca abcaVarQ = abotVar.q();
        if (trmVar.b() != null) {
            tzlVar = ((twj) obj).a.h;
            trmVar2 = trmVar;
        } else {
            trmVar2 = trmVar;
            tzlVar = trmVar2 instanceof tyh ? ((tyh) trmVar2).d : ((twj) obj).a.g;
        }
        tzl tzlVar2 = tzlVar;
        twj twjVar = (twj) obj;
        tpb tpbVar = (tpd) twjVar.b.get(abgl.d);
        tpbVar.getClass();
        ull ullVar = twjVar.c;
        tzm tzmVar = twjVar.a;
        zzu zzuVar = twjVar.h;
        uwd uwdVar = twjVar.f;
        utu utuVar = twjVar.g;
        defpackage.gkc gkcVar = twjVar.j;
        ((java.lang.Boolean) twjVar.d.fF()).booleanValue();
        twp twpVar = new twp(abcaVarQ, tpbVar, tzlVar2, ullVar, trmVar2, tzmVar, zzuVar, uwdVar, utuVar, gkcVar, twjVar, ((java.lang.Boolean) twjVar.e.fF()).booleanValue());
        tqr tqrVarC = twpVar.c();
        tqrVarC.b(tpm.l(d2, d3));
        twpVar.d(tqrVarC);
        return twpVar;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0036  */
    /* JADX WARN: Code duplicated, block: B:19:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v2, types: [aizj, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0065 -> B:17:0x0036). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object v(defpackage.afdk r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof tiq
            if (r0 == 0) goto L13
            r0 = r8
            tiq r0 = (tiq) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            tiq r0 = new tiq
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            afdr r1 = defpackage.afdr.a
            int r2 = r0.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 == r4) goto L2f
            if (r2 != r3) goto L27
            goto L33
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            defpackage.afga.cz(r8)
            goto L52
        L33:
            defpackage.afga.cz(r8)
        L36:
            long r5 = java.lang.System.nanoTime()
            java.lang.Object r8 = r7.b
            bus r8 = (defpackage.bus) r8
            r8.b(r5)
            tir r8 = new tir
            r2 = 0
            r5 = 0
            r8.<init>(r2, r5)
            r0.b = r4
            java.lang.Object r2 = r7.c
            java.lang.Object r8 = afsg.x(r2, r8, r0)
            if (r8 == r1) goto L67
        L52:
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            java.lang.Object r2 = r7.c
            ajba r2 = (ajba) r2
            r2.d(r8)
            r0.b = r3
            java.lang.Object r8 = r7.a
            j$.time.Duration r8 = (j$.time.Duration) r8
            java.lang.Object r8 = defpackage.ysr.cH(r8, r0)
            if (r8 != r1) goto L36
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ndd.v(afdk):java.lang.Object");
    }

    public final boolean w(java.lang.Class cls, java.lang.Class cls2) {
        return ((java.lang.Class) this.b).isAssignableFrom(cls) && cls2.isAssignableFrom((java.lang.Class) this.a);
    }

    public final boolean x(java.lang.Class cls) {
        return ((java.lang.Class) this.b).isAssignableFrom(cls);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0151  */
    /* JADX WARN: Code duplicated, block: B:49:0x0154  */
    /* JADX WARN: Code duplicated, block: B:51:0x0157  */
    /* JADX WARN: Code duplicated, block: B:54:0x017c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0182  */
    /* JADX WARN: Code duplicated, block: B:58:0x0193  */
    /* JADX WARN: Code duplicated, block: B:75:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0194, code lost:
    
        if (r0 != r10) goto L60;
     */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.Collection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(fti r17, java.lang.Object r18, ftm r19, fpy r20, defpackage.afdk r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ndd.y(fti, java.lang.Object, ftm, fpy, afdk):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:132:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:155:0x036d  */
    /* JADX WARN: Code duplicated, block: B:157:0x0376  */
    /* JADX WARN: Code duplicated, block: B:25:0x0076 A[Catch: all -> 0x0367, TryCatch #2 {all -> 0x0367, blocks: (B:19:0x003e, B:21:0x005b, B:25:0x0076, B:26:0x0078, B:28:0x0083, B:30:0x008b, B:32:0x009b, B:35:0x00a7, B:36:0x00ac, B:143:0x0344, B:147:0x0354, B:148:0x0362, B:29:0x0089, B:23:0x0068), top: B:161:0x003e }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v19, types: [fst, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final java.lang.Object z(won wonVar, defpackage.afdk afdkVar) throws java.lang.Throwable {
        fsg fsgVar;
        won wonVar2;
        android.graphics.Bitmap.Config config;
        java.lang.Object obj;
        coil.memory.MemoryCache.Key key;
        java.lang.String strA;
        java.util.Map map;
        coil.memory.MemoryCache.Key key2;
        java.lang.Object obj2;
        coil.memory.MemoryCache.Key key3;
        coil.memory.MemoryCache.Key keyA;
        coil.memory.MemoryCache.Key key4;
        won wonVar3 = wonVar;
        if (afdkVar instanceof fsg) {
            fsgVar = (fsg) afdkVar;
            int i = fsgVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                fsgVar.b = i - Integer.MIN_VALUE;
            } else {
                fsgVar = new fsg(this, afdkVar);
            }
        } else {
            fsgVar = new fsg(this, afdkVar);
        }
        fsg fsgVar2 = fsgVar;
        java.lang.Object obj3 = fsgVar2.a;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = fsgVar2.b;
        if (i2 == 0) {
            defpackage.afga.cz(obj3);
            try {
                java.lang.Object obj4 = wonVar3.f;
                java.lang.Object obj5 = ((fti) obj4).b;
                java.lang.Object obj6 = wonVar3.b;
                android.graphics.Bitmap.Config[] configArr = fug.a;
                wonVar3.getClass();
                java.lang.Object obj7 = wonVar3.d;
                java.lang.Object obj8 = this.b;
                java.util.List list = ((fti) obj4).f;
                if (list.isEmpty() || defpackage.afga.cg(fug.a, ((fti) obj4).d)) {
                    config = ((fti) obj4).d;
                    if (!defpackage.gkc.e((fti) obj4, config)) {
                        config = android.graphics.Bitmap.Config.ARGB_8888;
                    }
                } else {
                    config = android.graphics.Bitmap.Config.ARGB_8888;
                }
                android.graphics.Bitmap.Config config2 = config;
                ftb ftbVar = ((fuj) ((defpackage.gkc) obj8).a).b ? ((fti) obj4).p : ftb.d;
                fts ftsVar = ((ftx) obj6).b;
                ftt fttVar = ftt.a;
                int i3 = 2;
                if (!defpackage.afga.f(ftsVar, fttVar) && !defpackage.afga.f(((ftx) obj6).c, fttVar)) {
                    i3 = ((fti) obj4).A;
                }
                android.content.Context context = ((fti) obj4).a;
                boolean zA = fue.a((fti) obj4);
                ajiu ajiuVar = ((fti) obj4).h;
                ftr ftrVar = ((fti) obj4).i;
                fto ftoVar = ((fti) obj4).w;
                ftb ftbVar2 = ((fti) obj4).n;
                ftm ftmVar = new ftm(context, config2, (ftx) obj6, i3, zA, ajiuVar, ftrVar, ftoVar, ftbVar2, ((fti) obj4).o, ftbVar);
                int i4 = ftmVar.o;
                ?? r12 = ((ajer) ((uhj) this.a).a).c;
                int size = r12.size();
                int i5 = 0;
                while (i5 < size) {
                    try {
                        int i6 = i5;
                        defpackage.afau afauVar = (defpackage.afau) r12.get(i5);
                        java.lang.Object obj9 = obj7;
                        fsn fsnVar = (fsn) afauVar.a;
                        if (((java.lang.Class) afauVar.b).isAssignableFrom(obj5.getClass())) {
                            fsnVar.getClass();
                            java.lang.Object objA = fsnVar.a(obj5, ftmVar);
                            if (objA != null) {
                                obj5 = objA;
                            }
                        }
                        i5 = i6 + 1;
                        obj7 = obj9;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        wonVar3 = wonVar;
                        wonVar2 = wonVar3;
                        if (th instanceof java.util.concurrent.CancellationException) {
                            throw th;
                        }
                        return defpackage.gkc.d((fti) wonVar2.f, th);
                    }
                }
                fpy fpyVar = obj7;
                obj5.getClass();
                java.lang.Object obj10 = this.c;
                obj5.getClass();
                java.lang.Object obj11 = ((defpackage.gkc) obj10).a;
                ?? r5 = ((ajer) ((uhj) obj11).a).b;
                int size2 = r5.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size2) {
                        obj = obj11;
                        key = null;
                        strA = null;
                        break;
                    }
                    key = null;
                    defpackage.afau afauVar2 = (defpackage.afau) r5.get(i7);
                    fsk fskVar = (fsk) afauVar2.a;
                    obj = obj11;
                    if (((java.lang.Class) afauVar2.b).isAssignableFrom(obj5.getClass())) {
                        fskVar.getClass();
                        strA = fskVar.a(obj5, ftmVar);
                        if (strA != null) {
                            break;
                        }
                    }
                    i7++;
                    obj11 = obj;
                }
                if (strA == null) {
                    key2 = key;
                } else {
                    java.util.Map map2 = ftoVar.b;
                    if (map2.isEmpty()) {
                        map = defpackage.afcf.a;
                    } else {
                        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                        java.util.Iterator it = map2.entrySet().iterator();
                        if (it.hasNext()) {
                            throw key;
                        }
                        map = linkedHashMap;
                    }
                    if (list.isEmpty() && map.isEmpty()) {
                        key2 = new coil.memory.MemoryCache.Key(strA, defpackage.afcf.a);
                    } else {
                        java.util.Map mapY = defpackage.afga.Y(map);
                        if (!list.isEmpty()) {
                            int size3 = list.size();
                            for (int i8 = 0; i8 < size3; i8++) {
                                mapY.put(defpackage.a.bo(i8, "coil#transformation_"), ((defpackage.kqe) list.get(i8)).b);
                            }
                            mapY.put("coil#transformation_size", ftmVar.d.toString());
                        }
                        key2 = new coil.memory.MemoryCache.Key(strA, mapY);
                    }
                }
                if (key2 == null || !ftbVar2.e) {
                    obj2 = obj5;
                    key3 = key;
                } else {
                    defpackage.kqe kqeVarG = ((uhj) obj).g();
                    if (kqeVarG != null) {
                        keyA = kqeVarG.a.a(key2);
                        if (keyA == null) {
                            keyA = ((ajku) kqeVarG.b).n(key2);
                        }
                    } else {
                        keyA = key;
                    }
                    if (keyA != null) {
                        android.graphics.Bitmap bitmap = ((fsq) keyA).a;
                        if (defpackage.gkc.e((fti) obj4, defpackage.a.bb(bitmap))) {
                            boolean zF = defpackage.gkc.f(keyA);
                            if (defpackage.ly.z((ftx) obj6)) {
                                if (zF) {
                                }
                                key4 = keyA;
                                obj2 = obj5;
                                key3 = key4;
                            } else {
                                java.lang.String str = (java.lang.String) key2.b.get("coil#transformation_size");
                                if (str != null) {
                                    if (!defpackage.afga.f(str, ((ftx) obj6).toString())) {
                                    }
                                    key4 = keyA;
                                    obj2 = obj5;
                                    key3 = key4;
                                } else {
                                    int width = bitmap.getWidth();
                                    int height = bitmap.getHeight();
                                    int i9 = ftsVar instanceof fts ? ftsVar.a : Integer.MAX_VALUE;
                                    fts ftsVar2 = ((ftx) obj6).c;
                                    int i10 = ftsVar2 instanceof fts ? ftsVar2.a : Integer.MAX_VALUE;
                                    double dBi = defpackage.a.bi(width, height, i9, i10, i4);
                                    boolean zA2 = fue.a((fti) obj4);
                                    if (zA2) {
                                        double dO = defpackage.afqt.o(dBi);
                                        key4 = keyA;
                                        obj2 = obj5;
                                        if (java.lang.Math.abs(((double) i9) - (((double) width) * dO)) > 1.0d && java.lang.Math.abs(((double) i10) - (dO * ((double) height))) > 1.0d) {
                                            if (dBi != 1.0d || zA2) {
                                                if (dBi > 1.0d || !zF) {
                                                }
                                            }
                                            key3 = key;
                                        }
                                    } else {
                                        key4 = keyA;
                                        obj2 = obj5;
                                        if ((!fug.e(i9) && java.lang.Math.abs(i9 - width) > 1) || (!fug.e(i10) && java.lang.Math.abs(i10 - height) > 1)) {
                                            if (dBi != 1.0d) {
                                            }
                                            if (dBi > 1.0d) {
                                            }
                                        }
                                    }
                                    key3 = key4;
                                }
                            }
                        }
                        obj2 = obj5;
                        key3 = key;
                    } else {
                        obj2 = obj5;
                        key3 = key;
                    }
                }
                if (key3 == null) {
                    coil.memory.MemoryCache.Key key5 = key2;
                    aiut aiutVar = ((fti) obj4).r;
                    fsh fshVar = new fsh(this, (fti) obj4, obj2, ftmVar, fpyVar, key5, wonVar, (defpackage.afdk) null, 0);
                    fsgVar2.c = wonVar;
                    fsgVar2.b = 1;
                    java.lang.Object objA2 = ahoc.a(aiutVar, fshVar, fsgVar2);
                    return objA2 == afdrVar ? afdrVar : objA2;
                }
                wonVar.getClass();
                key2.getClass();
                android.graphics.Bitmap bitmap2 = ((fsq) key3).a;
                android.content.res.Resources resources = context.getResources();
                resources.getClass();
                android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(resources, bitmap2);
                java.lang.Object obj12 = ((fsq) key3).b.get("coil#disk_cache_key");
                return new ftq(bitmapDrawable, (fti) obj4, 1, key2, obj12 instanceof java.lang.String ? (java.lang.String) obj12 : key, defpackage.gkc.f(key3), false);
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wonVar2 = fsgVar2.c;
            try {
                defpackage.afga.cz(obj3);
                return obj3;
            } catch (java.lang.Throwable th3) {
                th = th3;
            }
        }
        if (th instanceof java.util.concurrent.CancellationException) {
            return defpackage.gkc.d((fti) wonVar2.f, th);
        }
        throw th;
    }

    public ndd(java.lang.Class cls, java.lang.Class cls2, java.lang.Object obj) {
        this.b = cls;
        this.a = cls2;
        this.c = obj;
    }

    public ndd(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public ndd(java.lang.String str) {
        this.b = new se(str, "base");
        this.c = new se((java.lang.String) null, "min");
        this.a = new se((java.lang.String) null, "max");
    }

    public ndd(lwi lwiVar, java.lang.Runnable runnable) {
        this.b = lwiVar;
        this.a = runnable;
        this.c = new defpackage.qlh(this, 1);
    }

    public ndd(txn txnVar) {
        this.a = txnVar.f;
        this.c = txnVar.g;
        this.b = txnVar.b;
    }

    public ndd(byte[] bArr) {
        this.c = new defpackage.cit();
        this.a = new defpackage.cit();
        this.b = new defpackage.cit();
    }

    public ndd() {
        this.a = new android.os.Handler(android.os.Looper.getMainLooper());
        defpackage.eqr eqrVar = new defpackage.eqr();
        this.b = eqrVar;
        defpackage.eqp eqpVarV = defpackage.tcu.v(eqrVar, new defpackage.nck(6));
        defpackage.eqr eqrVar2 = new defpackage.eqr();
        defpackage.afgq afgqVar = new defpackage.afgq();
        afgqVar.a = true;
        eqrVar2.r(eqpVarV, new defpackage.mel(new defpackage.nam(eqrVar2, afgqVar, 6), 16));
        this.c = eqrVar2;
    }

    public ndd(hus husVar, hvf hvfVar) {
        java.util.List list = java.util.Collections.EMPTY_LIST;
        defpackage.a.ak(husVar, "Argument must not be null");
        this.c = husVar;
        defpackage.a.ak(list, "Argument must not be null");
        this.b = list;
        this.a = hvfVar;
    }

    public ndd(java.util.concurrent.Executor executor, qbs qbsVar) {
        this.c = new java.util.concurrent.atomic.AtomicInteger(0);
        this.a = executor;
        this.b = qbsVar;
    }

    public ndd(byte[] bArr, byte[] bArr2) {
        this.b = new java.util.HashMap();
        this.c = new java.util.HashMap();
        this.a = new java.util.HashMap();
    }

    public ndd(too tooVar, udc udcVar) {
        this.c = j$.util.DesugarCollections.synchronizedSet(new java.util.LinkedHashSet());
        this.b = tooVar;
        this.a = udcVar;
    }

    public ndd(java.io.File file) {
        this.a = file;
        this.b = new java.io.File(java.lang.String.valueOf(file.getPath()).concat(".new"));
        this.c = new java.io.File(java.lang.String.valueOf(file.getPath()).concat(".bak"));
    }

    public ndd(android.content.Context context, android.location.LocationManager locationManager) {
        this.b = new fo();
        this.a = context;
        this.c = locationManager;
    }

    public ndd(defpackage.egk egkVar, defpackage.afdo afdoVar) {
        afdoVar.getClass();
        this.a = egkVar;
        this.b = afdoVar;
        this.c = new defpackage.zhc();
    }

    public ndd(java.lang.Object[] objArr, java.lang.Object[] objArr2) {
        int length = objArr.length;
        int[] iArr = new int[length];
        java.util.HashMap map = new java.util.HashMap();
        for (int i = 0; i < length; i++) {
            java.lang.Object obj = objArr[i];
            java.lang.Integer numValueOf = (java.lang.Integer) map.get(obj);
            if (numValueOf == null) {
                numValueOf = java.lang.Integer.valueOf(map.size());
                map.put(obj, numValueOf);
            }
            iArr[i] = numValueOf.intValue();
        }
        this.a = iArr;
        this.c = P(objArr, iArr);
        this.b = P(objArr2, iArr);
    }

    public ndd(j$.time.Duration duration) {
        this.a = duration;
        this.c = ajbb.a(java.lang.Boolean.FALSE);
        this.b = new defpackage.bus(new defpackage.tip(this, 0));
    }

    public ndd(defpackage.erz erzVar, defpackage.esi esiVar) {
        esiVar.getClass();
        this.c = erzVar;
        this.a = defpackage.afga.cA(new defpackage.eig(this, 3));
        long[] jArr = defpackage.aav.a;
        this.b = new defpackage.aau(6);
    }

    public ndd(fkd fkdVar) {
        this(fkdVar.a, fkdVar.b, fkdVar.c);
    }

    public ndd(java.util.UUID uuid, fok fokVar, java.util.Set set) {
        uuid.getClass();
        fokVar.getClass();
        this.a = uuid;
        this.b = fokVar;
        this.c = set;
    }

    public ndd(android.content.Context context, byte[] bArr) {
        android.content.Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.a = applicationContext;
        this.c = fue.a;
        this.b = new defpackage.ly(null);
    }

    public ndd(uhj uhjVar, defpackage.gkc gkcVar) {
        gkcVar.getClass();
        this.a = uhjVar;
        this.b = gkcVar;
        this.c = new defpackage.gkc(uhjVar, (byte[]) null);
    }
}
