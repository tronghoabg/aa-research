package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckedTextView;
import com.google.android.libraries.maps.model.CameraPosition;
import com.google.android.libraries.maps.model.LatLng;
import com.google.android.projection.gearhead.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.xml.sax.SAXException;

/* loaded from: classes3.dex */
public final class aaem {
    public boolean a;
    public final Object b;

    public aaem(byte[] bArr) {
        this.b = new Handler(Looper.getMainLooper(), new kej(1));
    }

    public static boolean p(List list, igg iggVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            igg iggVar2 = (igg) it.next();
            if (iggVar2 == igg.a || iggVar2 == iggVar) {
                return true;
            }
        }
        return false;
    }

    public static boolean q(igj igjVar, int i, List list, int i2, ihw ihwVar) {
        igk igkVarB = igjVar.b(i);
        if (!r(igkVarB, list, i2, ihwVar)) {
            return false;
        }
        int i3 = igkVarB.d;
        if (i3 != 1) {
            if (i3 == 2) {
                return y(igjVar, i - 1, list, i2);
            }
            int iX = x(list, i2, ihwVar);
            if (iX <= 0) {
                return false;
            }
            return q(igjVar, i - 1, list, i2, (ihw) ihwVar.u.n().get(iX - 1));
        }
        if (i == 0) {
            return true;
        }
        while (i2 >= 0) {
            if (y(igjVar, i - 1, list, i2)) {
                return true;
            }
            i2--;
        }
        return false;
    }

    public static boolean r(igk igkVar, List list, int i, ihw ihwVar) {
        List list2;
        String str = igkVar.a;
        if (str != null) {
            if (str.equalsIgnoreCase("G")) {
                if (!(ihwVar instanceof igx)) {
                    return false;
                }
            } else if (!str.equals(ihwVar.getClass().getSimpleName().toLowerCase(Locale.US))) {
                return false;
            }
        }
        List<aagd> list3 = igkVar.b;
        if (list3 != null) {
            for (aagd aagdVar : list3) {
                Object obj = aagdVar.b;
                if (obj == "id") {
                    if (!((String) aagdVar.c).equals(ihwVar.o)) {
                        return false;
                    }
                } else if (obj != "class" || (list2 = ihwVar.s) == null || !list2.contains(aagdVar.c)) {
                    return false;
                }
            }
        }
        List list4 = igkVar.c;
        if (list4 == null) {
            return true;
        }
        Iterator it = list4.iterator();
        while (it.hasNext()) {
            if (!((String) it.next()).equals("first-child") || x(list, i, ihwVar) != 0) {
                return false;
            }
        }
        return true;
    }

    public static List w(kqf kqfVar) throws SAXException {
        ArrayList arrayList = new ArrayList();
        while (!kqfVar.r()) {
            try {
                arrayList.add(igg.valueOf(kqfVar.n(',')));
                if (!kqfVar.t()) {
                    break;
                }
            } catch (IllegalArgumentException unused) {
                throw new SAXException("Invalid @media type list");
            }
        }
        return arrayList;
    }

    private static int x(List list, int i, ihw ihwVar) {
        if (i < 0) {
            return -1;
        }
        Object obj = list.get(i);
        ihu ihuVar = ihwVar.u;
        if (obj != ihuVar) {
            return -1;
        }
        Iterator it = ihuVar.n().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (((ihy) it.next()) == ihwVar) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    private static boolean y(igj igjVar, int i, List list, int i2) {
        igk igkVarB = igjVar.b(i);
        ihw ihwVar = (ihw) list.get(i2);
        if (!r(igkVarB, list, i2, ihwVar)) {
            return false;
        }
        int i3 = igkVarB.d;
        if (i3 != 1) {
            if (i3 == 2) {
                return y(igjVar, i - 1, list, i2 - 1);
            }
            int iX = x(list, i2, ihwVar);
            if (iX <= 0) {
                return false;
            }
            return q(igjVar, i - 1, list, i2, (ihw) ihwVar.u.n().get(iX - 1));
        }
        if (i == 0) {
            return true;
        }
        while (i2 > 0) {
            i2--;
            if (y(igjVar, i - 1, list, i2)) {
                return true;
            }
        }
        return false;
    }

    public final synchronized double a() {
        j();
        return ((aaet) this.b).a();
    }

    public final double b() {
        j();
        return ((aaet) this.b).a;
    }

    public final float c() {
        j();
        return ((aaet) this.b).b();
    }

    public final CameraPosition d() {
        j();
        return ((aaet) this.b).d();
    }

    public final LatLng e(float f, float f2, boolean z) {
        j();
        return ((aaet) this.b).i(f, f2, z);
    }

    public final zsb f(zsb zsbVar) {
        j();
        return ((aaet) this.b).j(zsbVar);
    }

    public final zsb g() {
        j();
        return ((aaet) this.b).k();
    }

    public final synchronized aacs h(zsb zsbVar) {
        j();
        return ((aaet) this.b).m(zsbVar);
    }

    public final aadu i() {
        j();
        return ((aaet) this.b).o();
    }

    public final void j() {
        if (this.a) {
            throw new IllegalStateException("called outside of scope");
        }
    }

    public final void k(Float f) {
        j();
        ((aaet) this.b).v(f);
    }

    public final synchronized void l() {
        if (this.a) {
            return;
        }
        Object obj = this.b;
    }

    public final synchronized void m() {
        this.a = true;
    }

    public final synchronized void n() {
        if (this.a) {
            this.a = false;
        }
    }

    public final synchronized boolean o() {
        return this.a;
    }

    public final synchronized void s(hwx hwxVar, boolean z) {
        if (!this.a && !z) {
            this.a = true;
            hwxVar.e();
            this.a = false;
            return;
        }
        ((Handler) this.b).obtainMessage(1, hwxVar).sendToTarget();
    }

    public final void t() {
        ((CheckedTextView) this.b).getCheckMarkDrawable();
    }

    public final void u(AttributeSet attributeSet) {
        int iQ;
        int iQ2;
        Object obj = this.b;
        CheckedTextView checkedTextView = (CheckedTextView) obj;
        Context context = checkedTextView.getContext();
        int[] iArr = fs.l;
        lah lahVarC = lah.C(context, attributeSet, iArr, R.attr.checkedTextViewStyle, 0);
        ebm.n((View) obj, checkedTextView.getContext(), iArr, attributeSet, (TypedArray) lahVarC.a, R.attr.checkedTextViewStyle, 0);
        try {
            if (lahVarC.y(1) && (iQ2 = lahVarC.q(1, 0)) != 0) {
                try {
                    ((CheckedTextView) obj).setCheckMarkDrawable(ca.e(((CheckedTextView) obj).getContext(), iQ2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (lahVarC.y(0) && (iQ = lahVarC.q(0, 0)) != 0) {
                Object obj2 = this.b;
                ((CheckedTextView) obj2).setCheckMarkDrawable(ca.e(((CheckedTextView) obj2).getContext(), iQ));
            }
            if (lahVarC.y(2)) {
                ((CheckedTextView) this.b).setCheckMarkTintList(lahVarC.r(2));
            }
            if (lahVarC.y(3)) {
                Object obj3 = this.b;
                int iN = lahVarC.n(3, -1);
                Rect rect = ko.a;
                ((CheckedTextView) obj3).setCheckMarkTintMode(a.R(iN, null));
            }
        } finally {
            lahVarC.w();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x0253, code lost:
    
        if (r7 == 0) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0257, code lost:
    
        if (r11.a != null) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0259, code lost:
    
        r11.a = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0260, code lost:
    
        r11.a.add(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0269, code lost:
    
        if (r19.t() == false) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x026b, code lost:
    
        r3.add(r11);
        r11 = new defpackage.igj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0273, code lost:
    
        r7 = r16;
        r8 = 0;
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x027b, code lost:
    
        r19.a = r12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x037f A[EDGE_INSN: B:235:0x037f->B:213:0x037f BREAK  A[LOOP:1: B:161:0x029f->B:244:?, LOOP_LABEL: LOOP:0: B:3:0x0009->B:238:0x0009], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0253 A[EDGE_INSN: B:263:0x0253->B:142:0x0253 BREAK  A[LOOP:6: B:71:0x012f->B:268:0x012f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x00a5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0135  */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v15, types: [igk] */
    /* JADX WARN: Type inference failed for: r7v16, types: [igk] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18, types: [igk] */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.igi v(defpackage.kqf r19) throws org.xml.sax.SAXException {
        /*
            Method dump skipped, instructions count: 912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaem.v(kqf):igi");
    }

    public aaem(aaet aaetVar) {
        this.a = false;
        this.b = aaetVar;
    }

    public aaem(igg iggVar) {
        this.a = false;
        this.b = iggVar;
    }

    public aaem(Object obj) {
        this.b = obj;
    }

    public aaem() {
        this.b = new psr(new qbx(0));
    }
}
