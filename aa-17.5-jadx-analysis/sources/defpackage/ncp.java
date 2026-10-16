package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.location.Location;
import android.location.LocationManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.gridlayout.widget.GridLayout;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import j$.time.Duration;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SyncFailedException;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class ncp {
    public static ncp d;
    public final Object a;
    public final Object b;
    public final Object c;

    public ncp(Context context) throws Resources.NotFoundException {
        leh.a();
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_un_ar_icon_size);
        this.b = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize, 17);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.material_dialer_audio_route_button_size);
        this.c = new FrameLayout.LayoutParams(dimensionPixelSize2, dimensionPixelSize2, 8388627);
        int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(R.dimen.material_dialer_incall_activatable_button_size);
        this.a = new FrameLayout.LayoutParams(dimensionPixelSize3, dimensionPixelSize3, 17);
    }

    public static void G(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Objects.toString(file2);
            Log.e("AtomicFile", "Failed to delete file which is a directory ".concat(String.valueOf(file2)));
        }
        if (file.renameTo(file2)) {
            return;
        }
        Log.e("AtomicFile", a.bt(file2, file, "Failed to rename ", " to "));
    }

    public static boolean H(FileOutputStream fileOutputStream) throws SyncFailedException {
        try {
            fileOutputStream.getFD().sync();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    private static final void O(ImageButton imageButton, int i, View.OnClickListener onClickListener) {
        imageButton.setVisibility(0);
        imageButton.setScaleType(ImageView.ScaleType.FIT_XY);
        imageButton.setImageResource(i);
        imageButton.setOnClickListener(onClickListener);
    }

    private static Object[] P(Object[] objArr, int[] iArr) {
        int length = objArr.length;
        Class<?> componentType = objArr.getClass().getComponentType();
        eol eolVar = GridLayout.c;
        int iMax = -1;
        for (int i : iArr) {
            iMax = Math.max(iMax, i);
        }
        Object[] objArr2 = (Object[]) Array.newInstance(componentType, iMax + 1);
        for (int i2 = 0; i2 < length; i2++) {
            objArr2[iArr[i2]] = objArr[i2];
        }
        return objArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ void d(defpackage.eqj r1, defpackage.eqj r2, defpackage.eqj r3, defpackage.ncp r4, android.content.ComponentName r5, defpackage.ncg r6, int r7, int r8) {
        /*
            r0 = r8 & 16
            if (r0 == 0) goto Lb
            java.lang.Object r1 = r1.e()
            r5 = r1
            android.content.ComponentName r5 = (android.content.ComponentName) r5
        Lb:
            r1 = r8 & 32
            if (r1 == 0) goto L16
            java.lang.Object r1 = r2.e()
            r6 = r1
            ncg r6 = (defpackage.ncg) r6
        L16:
            r1 = r8 & 64
            r2 = 0
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r3.e()
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L29
            int r1 = r1.intValue()
            r7 = r1
            goto L2a
        L29:
            r7 = r2
        L2a:
            r1 = 1
            if (r6 == 0) goto L47
            if (r5 == 0) goto L34
            java.lang.String r3 = r5.getPackageName()
            goto L35
        L34:
            r3 = 0
        L35:
            java.lang.String r8 = r6.a
            boolean r3 = defpackage.affa.f(r8, r3)
            if (r3 == 0) goto L47
            java.util.List r3 = r6.b
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L47
            r3 = r1
            goto L48
        L47:
            r3 = r2
        L48:
            if (r7 == 0) goto L4e
            r6 = 2
            if (r7 == r6) goto L4e
            r2 = r1
        L4e:
            ncc r1 = new ncc
            r1.<init>(r5, r3, r2)
            ncx r2 = r4.a()
            android.content.ComponentName r3 = r1.a
            boolean r5 = r1.b
            boolean r6 = r1.c
            yph r7 = defpackage.ncq.a
            if (r6 == 0) goto L67
            nct r5 = new nct
            r5.<init>(r3)
            goto Lae
        L67:
            android.content.ComponentName r6 = r2.a()
            boolean r6 = defpackage.affa.f(r3, r6)
            if (r6 != 0) goto L7f
            if (r5 == 0) goto L79
            ncv r5 = new ncv
            r5.<init>(r3)
            goto Lae
        L79:
            ncw r5 = new ncw
            r5.<init>(r3)
            goto Lae
        L7f:
            boolean r6 = r2 instanceof defpackage.ncv
            if (r6 == 0) goto L8b
            if (r5 != 0) goto Lad
            ncw r5 = new ncw
            r5.<init>(r3)
            goto Lae
        L8b:
            boolean r6 = r2 instanceof defpackage.nct
            if (r6 == 0) goto L9d
            if (r5 == 0) goto L97
            ncv r5 = new ncv
            r5.<init>(r3)
            goto Lae
        L97:
            ncw r5 = new ncw
            r5.<init>(r3)
            goto Lae
        L9d:
            boolean r6 = r2 instanceof defpackage.ncw
            if (r6 == 0) goto La9
            if (r5 == 0) goto Lad
            ncv r5 = new ncv
            r5.<init>(r3)
            goto Lae
        La9:
            boolean r3 = r2 instanceof defpackage.ncs
            if (r3 == 0) goto Lc5
        Lad:
            r5 = r2
        Lae:
            boolean r2 = defpackage.affa.f(r5, r2)
            if (r2 != 0) goto Lc4
            r1.toString()
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "nav app state changed to "
            java.lang.String r1 = r2.concat(r1)
            r4.b(r5, r1)
        Lc4:
            return
        Lc5:
            aezs r1 = new aezs
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ncp.d(eqj, eqj, eqj, ncp, android.content.ComponentName, ncg, int, int):void");
    }

    public static final int k(int i) {
        if (i == 1) {
            return R.drawable.gs_phone_android_vd_theme_24;
        }
        if (i == 2) {
            return R.drawable.gs_bluetooth_searching_vd_theme_24;
        }
        if (i == 4) {
            return R.drawable.gs_headset_mic_vd_theme_24;
        }
        if (i == 8) {
            return R.drawable.gs_speaker_phone_vd_theme_24;
        }
        tss.q("GH.TelecomUiHelper", "Unknown audio route: %d", Integer.valueOf(i));
        return R.drawable.gs_bluetooth_searching_vd_theme_24;
    }

    static final void l(ImageButton imageButton, int i, int i2, int i3, View.OnClickListener onClickListener, FrameLayout.LayoutParams layoutParams) {
        imageButton.clearColorFilter();
        imageButton.setLayoutParams(layoutParams);
        imageButton.setImageTintList(new ColorStateList(new int[][]{new int[]{android.R.attr.state_activated}, new int[0]}, new int[]{i3, i2}));
        imageButton.setBackgroundResource(R.drawable.material_ic_activatable_button_oval_background);
        O(imageButton, i, onClickListener);
    }

    static final void m(ImageButton imageButton, int i, int i2, View.OnClickListener onClickListener, FrameLayout.LayoutParams layoutParams) {
        imageButton.setBackgroundResource(0);
        imageButton.setImageTintList(null);
        imageButton.setLayoutParams(layoutParams);
        imageButton.setColorFilter(i2, PorterDuff.Mode.SRC_IN);
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

    public static ujo r(int i) {
        return i + (-1) != 2 ? ujo.DRAW_OVER_BUILDINGS : ujo.DRAW_OVER_LABELS_AND_CALLOUTS;
    }

    public static abdd t(double[] dArr, int[] iArr, Collection collection, Collection collection2, int i, int i2, int i3, int i4, int i5, float f, double[] dArr2, double[] dArr3) {
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
            woy.aa(z, "A lineBreak of 0 is implied and should not be present in the list.");
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
        abnr abnrVarU = u(dArr4, i, i2, i3, i4, i5);
        for (int i14 : iArr) {
            abnrVarU.t();
            abdd abddVar = (abdd) abnrVarU.b;
            abdd abddVar2 = abdd.a;
            abod abodVar = abddVar.e;
            if (!abodVar.c()) {
                abddVar.e = abnv.G(abodVar);
            }
            abddVar.e.g(i14);
        }
        ptu ptuVar = new ptu(3);
        Iterator it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    abcy abcyVarB = ((tqo) it2.next()).b();
                    if (abcyVarB != null) {
                        abnrVarU.ba(abcz.g, abcyVarB);
                    }
                }
                Iterator it3 = collection2.iterator();
                while (it3.hasNext()) {
                    abcy abcyVarB2 = ((tqo) it3.next()).b();
                    if (abcyVarB2 != null) {
                        abnrVarU.ba(abcz.h, abcyVarB2);
                    }
                }
            } else if (!ptuVar.a(it.next())) {
                Iterator it4 = collection.iterator();
                while (it4.hasNext()) {
                    long jA = ((tqo) it4.next()).a();
                    abnrVarU.t();
                    abdd abddVar3 = (abdd) abnrVarU.b;
                    abdd abddVar4 = abdd.a;
                    abog abogVar = abddVar3.f;
                    if (!abogVar.c()) {
                        abddVar3.f = abnv.H(abogVar);
                    }
                    abddVar3.f.f(jA);
                }
            }
        }
        abnrVarU.bc(abhx.h, Float.valueOf(f));
        abnrVarU.t();
        abdd abddVar5 = (abdd) abnrVarU.b;
        abdd abddVar6 = abdd.a;
        abddVar5.b |= 64;
        abddVar5.j = 4;
        if (dArr2 != null) {
            abnrVarU.bc(ujr.e, tss.g(dArr2));
        }
        if (dArr3 != null) {
            abnrVarU.bc(ujr.f, tss.g(dArr3));
        }
        return (abdd) abnrVarU.q();
    }

    public static abnr u(double[] dArr, int i, int i2, int i3, int i4, int i5) {
        abms abmsVarG = tss.g(dArr);
        abnr abnrVar = (abnr) abdd.a.n();
        abnrVar.t();
        abdd abddVar = (abdd) abnrVar.b;
        abmsVarG.getClass();
        abddVar.b |= 1;
        abddVar.c = abmsVarG;
        int length = dArr.length >> 1;
        abnrVar.t();
        abdd abddVar2 = (abdd) abnrVar.b;
        abddVar2.b |= 2;
        abddVar2.d = length;
        abnrVar.t();
        abdd abddVar3 = (abdd) abnrVar.b;
        abddVar3.g = i3 - 1;
        abddVar3.b |= 8;
        abnrVar.t();
        abdd abddVar4 = (abdd) abnrVar.b;
        abddVar4.h = i4 - 1;
        abddVar4.b |= 16;
        abnrVar.t();
        abdd abddVar5 = (abdd) abnrVar.b;
        abddVar5.i = i5 - 1;
        abddVar5.b |= 32;
        abnrVar.t();
        abdd abddVar6 = (abdd) abnrVar.b;
        abddVar6.b |= 2048;
        abddVar6.o = i;
        abnrVar.t();
        abdd abddVar7 = (abdd) abnrVar.b;
        abddVar7.b |= 4096;
        abddVar7.p = i2;
        return abnrVar;
    }

    public final String A() {
        String string = ((UUID) this.a).toString();
        string.getClass();
        return string;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aezr, java.lang.Object] */
    public final esg B() {
        return (esg) this.a.a();
    }

    public final Object C(int i) {
        return ((Object[]) this.b)[((int[]) this.a)[i]];
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [afco, java.lang.Object] */
    public final zgp D() {
        aitu aituVar = dof.a;
        return dof.a(this.b, new btm(this, (afck) null, 10));
    }

    public final zgp E(dzh dzhVar) {
        jnx jnxVar = new jnx(this, dzhVar, 1);
        zgp zgpVarA = ((zfz) this.c).a(jnxVar, zfq.a);
        zgpVarA.getClass();
        return zgpVarA;
    }

    public final FileInputStream F() throws FileNotFoundException {
        File file = (File) this.c;
        if (file.exists()) {
            G(file, (File) this.a);
        }
        Object obj = this.b;
        File file2 = (File) obj;
        if (file2.exists() && ((File) this.a).exists() && !file2.delete()) {
            Objects.toString(obj);
            Log.e("AtomicFile", "Failed to delete outdated new file ".concat(obj.toString()));
        }
        return new FileInputStream((File) this.a);
    }

    public final float I(Object obj) {
        if (!(obj instanceof dpn)) {
            return obj instanceof dpj ? ((dpj) obj).v() : BitmapDescriptorFactory.HUE_RED;
        }
        String strX = ((dpn) obj).x();
        HashMap map = (HashMap) this.c;
        if (map.containsKey(strX)) {
            return ((dpr) map.get(strX)).a();
        }
        HashMap map2 = (HashMap) this.b;
        return map2.containsKey(strX) ? ((Integer) map2.get(strX)).floatValue() : BitmapDescriptorFactory.HUE_RED;
    }

    public final void J(String str, int i) {
        ((HashMap) this.b).put(str, Integer.valueOf(i));
    }

    public final void K(String str, ArrayList arrayList) {
        ((HashMap) this.a).put(str, arrayList);
    }

    public final Location L(String str) {
        try {
            Object obj = this.c;
            if (((LocationManager) obj).isProviderEnabled(str)) {
                return ((LocationManager) obj).getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0071 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x009d -> B:27:0x00a3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M(defpackage.frs r8, defpackage.ajdr r9, defpackage.fsy r10, java.lang.Object r11, defpackage.ftc r12, defpackage.fpp r13, defpackage.afck r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ncp.M(frs, ajdr, fsy, java.lang.Object, ftc, fpp, afck):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00b7 -> B:29:0x00bf). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N(defpackage.ajdr r10, defpackage.fsy r11, java.lang.Object r12, defpackage.ftc r13, defpackage.fpp r14, defpackage.afck r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ncp.N(ajdr, fsy, java.lang.Object, ftc, fpp, afck):java.lang.Object");
    }

    public final ncx a() {
        ncx ncxVar = (ncx) ((eqj) this.b).e();
        if (ncxVar != null) {
            return ncxVar;
        }
        throw new IllegalStateException("not started");
    }

    public final void b(ncx ncxVar, String str) {
        eqj eqjVar = (eqj) this.b;
        ncx ncxVar2 = (ncx) eqjVar.e();
        woy.ad(!affa.f(ncxVar2, ncxVar), "Can't move from state %s to itself", ncxVar);
        String str2 = ncxVar2 + " -> " + ncxVar + ": " + str;
        Handler handler = (Handler) this.a;
        byte[] bArr = null;
        handler.removeCallbacksAndMessages(null);
        if (ncxVar instanceof ncv) {
            Duration duration = ((ncv) ncxVar).a;
            handler.postDelayed(new mgw(this, ncxVar, 8, bArr), duration.toMillis());
            ncq.a.l().M("%s (will auto-dismiss card after %s)", str2, duration);
        } else {
            ncq.a.l().y("%s", str2);
        }
        eqjVar.m(ncxVar);
    }

    public final void c(afec afecVar, String str) {
        b((ncx) afecVar.invoke(a().a()), str);
    }

    public final void e(ImageButton imageButton, int i, View.OnClickListener onClickListener) {
        m(imageButton, R.drawable.gs_bluetooth_searching_vd_theme_24, i, onClickListener, (FrameLayout.LayoutParams) this.c);
    }

    public final void f(ImageButton imageButton, int i, View.OnClickListener onClickListener) {
        m(imageButton, R.drawable.material_ic_dialpad, i, onClickListener, (FrameLayout.LayoutParams) this.b);
    }

    public final void g(ImageButton imageButton, int i, int i2, View.OnClickListener onClickListener) {
        l(imageButton, R.drawable.material_ic_call_hold, i, i2, onClickListener, (FrameLayout.LayoutParams) this.a);
    }

    public final void h(ImageButton imageButton, int i, View.OnClickListener onClickListener) {
        m(imageButton, R.drawable.material_ic_call_merge, i, onClickListener, (FrameLayout.LayoutParams) this.b);
    }

    public final void i(ImageButton imageButton, int i, int i2, View.OnClickListener onClickListener) {
        l(imageButton, R.drawable.material_ic_call_mute, i, i2, onClickListener, (FrameLayout.LayoutParams) this.a);
    }

    public final void j(ImageButton imageButton, int i, View.OnClickListener onClickListener) {
        m(imageButton, R.drawable.material_ic_swap_calls, i, onClickListener, (FrameLayout.LayoutParams) this.b);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.lang.Runnable] */
    public final void n(moa moaVar) {
        if (moaVar == null) {
            return;
        }
        lyn lynVarA = lyn.a.a();
        Long l = (Long) lynVarA.d.get(this.b);
        if (l == null || l.longValue() != moaVar.A()) {
            return;
        }
        this.a.run();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, mnp] */
    public final void o() {
        mlq.e().f(this.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, mnp] */
    public final void p() {
        mlq.e().k(this.c);
    }

    public final tpu s(double d2, double d3, int i, tqo tqoVar, boolean z, int i2, int i3, int i4) {
        double d4;
        float[] fArr;
        int i5;
        float f;
        int length;
        abnr abnrVar = (abnr) abax.a.n();
        abnp abnpVarN = abdx.a.n();
        float f2 = BitmapDescriptorFactory.HUE_RED;
        char c = 2;
        float f3 = 1.0f;
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
            float fCos = (float) Math.cos(0.0d);
            d4 = 0.0d;
            float fSin = (float) Math.sin(0.0d);
            for (int i6 = 0; i6 < 11; i6 += 2) {
                float f4 = fArr[i6];
                int i7 = i6 + 1;
                float f5 = fArr[i7];
                fArr[i6] = (f4 * fCos) - (f5 * fSin);
                fArr[i7] = (f5 * fCos) + (f4 * fSin);
            }
            f = 1.0f;
        } else {
            d4 = 0.0d;
            int i8 = i + 2;
            fArr = new float[i8 + i8];
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            int i9 = 2;
            int i10 = 0;
            while (true) {
                i5 = i9 + 1;
                if (i10 >= i) {
                    break;
                }
                boolean z3 = z2;
                double d5 = f2;
                fArr[i9] = (float) Math.cos(d5);
                i9 += 2;
                fArr[i5] = (float) Math.sin(d5);
                f2 += (float) (6.283185307179586d / i);
                i10++;
                c = c;
                f3 = f3;
                z2 = z3;
                c2 = c2;
            }
            f = f3;
            fArr[i9] = (float) Math.cos(0.0d);
            fArr[i5] = (float) Math.sin(0.0d);
        }
        int length2 = fArr.length;
        float[] fArr2 = new float[length2];
        float fCos2 = (float) Math.cos(d4);
        float fSin2 = (float) Math.sin(d4);
        for (int i11 = 0; i11 < fArr.length - 1; i11 += 2) {
            float f6 = fArr[i11];
            int i12 = i11 + 1;
            float f7 = fArr[i12];
            fArr2[i11] = (((f6 * fCos2) - (f7 * fSin2)) + f) * 0.5f;
            fArr2[i12] = f - ((((f7 * fCos2) + (f6 * fSin2)) + f) * 0.5f);
        }
        for (int i13 = 0; i13 < length2; i13++) {
            float f8 = fArr2[i13];
            abnpVarN.t();
            abdx abdxVar = (abdx) abnpVarN.b;
            abdxVar.b();
            abdxVar.e.g(f8);
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
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length * 4);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.asFloatBuffer().put(fArr);
        abms abmsVarU = abms.u(byteBufferAllocate);
        abnpVarN.t();
        abdx abdxVar2 = (abdx) abnpVarN.b;
        abdxVar2.b |= 2;
        abdxVar2.f = length >> 1;
        abnpVarN.t();
        abdx abdxVar3 = (abdx) abnpVarN.b;
        abmsVarU.getClass();
        abdxVar3.b |= 1;
        abdxVar3.c = abmsVarU;
        abnpVarN.t();
        abdx abdxVar4 = (abdx) abnpVarN.b;
        abdxVar4.b |= 4;
        abdxVar4.h = 0;
        if (z) {
            abnpVarN.aa(0);
            abnpVarN.aa(i + 1);
        }
        abnrVar.t();
        abax abaxVar = (abax) abnrVar.b;
        abdx abdxVar5 = (abdx) abnpVarN.q();
        abdxVar5.getClass();
        abaxVar.c = abdxVar5;
        abaxVar.b |= 1;
        abnrVar.t();
        abax abaxVar2 = (abax) abnrVar.b;
        abaxVar2.b |= 4;
        abaxVar2.e = z;
        abcy abcyVarB = tqoVar.b();
        if (abcyVarB != null) {
            abnrVar.bc(abcz.b, abcyVarB);
        } else if (tqoVar.a() != -1) {
            int iA = tqoVar.a();
            abnrVar.t();
            abax abaxVar3 = (abax) abnrVar.b;
            abaxVar3.b |= 128;
            abaxVar3.i = iA;
        }
        abnrVar.t();
        abax abaxVar4 = (abax) abnrVar.b;
        abaxVar4.b |= sk.AUDIO_CONTENT_BUFFER_SIZE;
        abaxVar4.k = i3;
        abnrVar.t();
        abax abaxVar5 = (abax) abnrVar.b;
        abaxVar5.b |= 1024;
        abaxVar5.l = i4;
        abnrVar.bc(ujr.c, r(i2));
        Object obj = this.a;
        abax abaxVar6 = (abax) abnrVar.q();
        tza tzaVar = tqoVar.b() != null ? ((tvm) obj).a.h : tqoVar instanceof txk ? ((txk) tqoVar).d : ((tvm) obj).a.g;
        tvm tvmVar = (tvm) obj;
        tof tofVar = (tof) tvmVar.b.get(abfi.SCREEN_SPACE_FLOAT);
        tofVar.getClass();
        ukq ukqVar = tvmVar.c;
        typ typVar = tvmVar.a;
        zyq zyqVar = tvmVar.h;
        uvg uvgVar = tvmVar.f;
        usy usyVar = tvmVar.g;
        gjv gjvVar = tvmVar.j;
        ((Boolean) tvmVar.d.gu()).booleanValue();
        tvs tvsVar = new tvs(abaxVar6, (tod) tofVar, tzaVar, ukqVar, tqoVar, typVar, zyqVar, uvgVar, usyVar, gjvVar, tvmVar, ((Boolean) tvmVar.e.gu()).booleanValue());
        tpt tptVarC = tvsVar.c();
        tptVarC.b(too.l(d2, d3));
        tvsVar.d(tptVarC);
        return tvsVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v2, types: [aiyk, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0067 -> B:17:0x0037). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(defpackage.afck r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.tht
            if (r0 == 0) goto L13
            r0 = r9
            tht r0 = (defpackage.tht) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            tht r0 = new tht
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.b
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L34
            if (r2 == r5) goto L30
            if (r2 != r4) goto L28
            goto L34
        L28:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L30:
            defpackage.woy.dF(r9)
            goto L52
        L34:
            defpackage.woy.dF(r9)
        L37:
            long r6 = java.lang.System.nanoTime()
            java.lang.Object r9 = r8.b
            bul r9 = (defpackage.bul) r9
            r9.b(r6)
            thu r9 = new thu
            r2 = 0
            r9.<init>(r2, r3)
            r0.b = r5
            java.lang.Object r2 = r8.c
            java.lang.Object r9 = defpackage.afpt.q(r2, r9, r0)
            if (r9 == r1) goto L69
        L52:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)
            java.lang.Object r2 = r8.c
            ajab r2 = (defpackage.ajab) r2
            r2.d(r9)
            r0.b = r4
            java.lang.Object r9 = r8.a
            j$.time.Duration r9 = (j$.time.Duration) r9
            java.lang.Object r9 = defpackage.wub.aq(r9, r0)
            if (r9 != r1) goto L37
        L69:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ncp.v(afck):java.lang.Object");
    }

    public final boolean w(Class cls, Class cls2) {
        return ((Class) this.b).isAssignableFrom(cls) && cls2.isAssignableFrom((Class) this.a);
    }

    public final boolean x(Class cls) {
        return ((Class) this.b).isAssignableFrom(cls);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0194, code lost:
    
        if (r0 != r10) goto L60;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v0, types: [fsy] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.Collection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(defpackage.fsy r17, java.lang.Object r18, defpackage.ftc r19, defpackage.fpp r20, defpackage.afck r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ncp.y(fsy, java.lang.Object, ftc, fpp, afck):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076 A[Catch: all -> 0x0367, TryCatch #2 {all -> 0x0367, blocks: (B:19:0x003e, B:21:0x005b, B:25:0x0076, B:26:0x0078, B:28:0x0083, B:30:0x008b, B:32:0x009b, B:35:0x00a7, B:36:0x00ac, B:143:0x0344, B:147:0x0354, B:148:0x0362, B:29:0x0089, B:23:0x0068), top: B:161:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r0v47, types: [ajju] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r18v1, types: [fpp] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19, types: [fsj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [fsg] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [fsg] */
    /* JADX WARN: Type inference failed for: r31v0 */
    /* JADX WARN: Type inference failed for: r31v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r31v2 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [coil.memory.MemoryCache$Key, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(defpackage.wnq r35, defpackage.afck r36) {
        /*
            Method dump skipped, instructions count: 887
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ncp.z(wnq, afck):java.lang.Object");
    }

    public ncp(Class cls, Class cls2, Object obj) {
        this.b = cls;
        this.a = cls2;
        this.c = obj;
    }

    public ncp(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public ncp(String str) {
        this.b = new rz(str, "base");
        this.c = new rz((String) null, "min");
        this.a = new rz((String) null, "max");
    }

    public ncp(lwb lwbVar, Runnable runnable) {
        this.b = lwbVar;
        this.a = runnable;
        this.c = new qkm(this, 1);
    }

    public ncp(twq twqVar) {
        this.a = twqVar.f;
        this.c = twqVar.g;
        this.b = twqVar.b;
    }

    public ncp(byte[] bArr) {
        this.c = new cil();
        this.a = new cil();
        this.b = new cil();
    }

    public ncp() {
        this.a = new Handler(Looper.getMainLooper());
        eql eqlVar = new eql();
        this.b = eqlVar;
        eqj eqjVarV = tby.v(eqlVar, new nch(2));
        eql eqlVar2 = new eql();
        affq affqVar = new affq();
        affqVar.a = true;
        eqlVar2.r(eqjVarV, new med(new mzx(eqlVar2, affqVar, 6), 16));
        this.c = eqlVar2;
    }

    public ncp(hui huiVar, huv huvVar) {
        List list = Collections.EMPTY_LIST;
        a.al(huiVar, "Argument must not be null");
        this.c = huiVar;
        a.al(list, "Argument must not be null");
        this.b = list;
        this.a = huvVar;
    }

    public ncp(Executor executor, qau qauVar) {
        this.c = new AtomicInteger(0);
        this.a = executor;
        this.b = qauVar;
    }

    public ncp(byte[] bArr, byte[] bArr2) {
        this.b = new HashMap();
        this.c = new HashMap();
        this.a = new HashMap();
    }

    public ncp(tnq tnqVar, ucf ucfVar) {
        this.c = DesugarCollections.synchronizedSet(new LinkedHashSet());
        this.b = tnqVar;
        this.a = ucfVar;
    }

    public ncp(File file) {
        this.a = file;
        this.b = new File(String.valueOf(file.getPath()).concat(".new"));
        this.c = new File(String.valueOf(file.getPath()).concat(".bak"));
    }

    public ncp(Context context, LocationManager locationManager) {
        this.b = new fn();
        this.a = context;
        this.c = locationManager;
    }

    public ncp(egd egdVar, afco afcoVar) {
        afcoVar.getClass();
        this.a = egdVar;
        this.b = afcoVar;
        this.c = new zfz();
    }

    public ncp(Object[] objArr, Object[] objArr2) {
        int length = objArr.length;
        int[] iArr = new int[length];
        HashMap map = new HashMap();
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            Integer numValueOf = (Integer) map.get(obj);
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(map.size());
                map.put(obj, numValueOf);
            }
            iArr[i] = numValueOf.intValue();
        }
        this.a = iArr;
        this.c = P(objArr, iArr);
        this.b = P(objArr2, iArr);
    }

    public ncp(Duration duration) {
        this.a = duration;
        this.c = ajac.a(false);
        this.b = new bul(new ooq(this, 19));
    }

    public ncp(ert ertVar, esc escVar) {
        escVar.getClass();
        this.c = ertVar;
        this.a = woy.dG(new epp(this, 2));
        long[] jArr = aao.a;
        this.b = new aan(6);
    }

    public ncp(fjw fjwVar) {
        this(fjwVar.a, fjwVar.b, fjwVar.c);
    }

    public ncp(UUID uuid, fod fodVar, Set set) {
        uuid.getClass();
        fodVar.getClass();
        this.a = uuid;
        this.b = fodVar;
        this.c = set;
    }

    public ncp(Context context, byte[] bArr) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.a = applicationContext;
        this.c = ftu.a;
        this.b = new fvl();
    }

    public ncp(ugn ugnVar, gjv gjvVar) {
        gjvVar.getClass();
        this.a = ugnVar;
        this.b = gjvVar;
        this.c = new gjv(ugnVar, (byte[]) null);
    }
}
