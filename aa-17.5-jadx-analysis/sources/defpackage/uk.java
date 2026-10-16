package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.projection.gearhead.R;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class uk {
    public int a;

    public uk() {
        this.a = 100;
    }

    public static final void c(ViewGroup viewGroup, hlo hloVar, int i) {
        sx sxVar = new sx(viewGroup, hloVar.e(), (byte[]) null);
        Context context = viewGroup.getContext();
        int i2 = fgd.a;
        fgc fgcVarA = fgd.a(i, context);
        fgcVarA.getClass();
        fgcVarA.N(czd.class);
        Object obj = sxVar.b;
        ArrayList arrayList = fgh.a;
        if (arrayList.contains(obj)) {
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) obj;
        sx.v(viewGroup2);
        arrayList.add(obj);
        fgc fgcVarJ = fgcVarA.clone();
        fgh.d(viewGroup2, fgcVarJ);
        Object obj2 = sxVar.a;
        if (obj2 != null) {
            viewGroup2.removeAllViews();
            viewGroup2.addView((View) obj2);
        }
        viewGroup2.setTag(R.id.transition_current_scene, sxVar);
        fgh.c(viewGroup2, fgcVarJ);
    }

    private static int g(int i, int i2) {
        return (i == 1 || i2 == 1) ? 1 : 2;
    }

    private static int h(int i, int i2) {
        return (i == 3 || i2 == 3) ? 3 : 2;
    }

    public final int a() {
        int i = this.a - 1;
        this.a = i;
        return i;
    }

    public final boolean b(int i) {
        return this.a >= i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.pdo r3) {
        /*
            r2 = this;
            int r3 = r3.ordinal()
            r0 = 3
            r1 = 2
            switch(r3) {
                case 0: goto L3f;
                case 1: goto L38;
                case 2: goto L31;
                case 3: goto L31;
                case 4: goto L2a;
                case 5: goto L10;
                case 6: goto L31;
                case 7: goto L31;
                case 8: goto L38;
                case 9: goto L31;
                default: goto L9;
            }
        L9:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r3 = 0
            r2.<init>(r3, r3)
            throw r2
        L10:
            boolean r3 = defpackage.aczv.ar()
            if (r3 == 0) goto L1c
            boolean r3 = defpackage.hrp.a()
            if (r3 != 0) goto L38
        L1c:
            boolean r3 = defpackage.aczv.aq()
            if (r3 == 0) goto L23
            goto L38
        L23:
            int r3 = r2.a
            int r3 = h(r3, r1)
            goto L46
        L2a:
            int r3 = r2.a
            int r3 = g(r3, r1)
            goto L46
        L31:
            int r3 = r2.a
            int r3 = h(r3, r1)
            goto L46
        L38:
            int r3 = r2.a
            int r3 = h(r3, r0)
            goto L46
        L3f:
            int r3 = r2.a
            r0 = 1
            int r3 = g(r3, r0)
        L46:
            r2.a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uk.d(pdo):void");
    }

    public final boolean e() {
        return this.a > 0;
    }

    public final int f(yfy yfyVar, int i, int i2, abyt abytVar) {
        if ((abytVar.c == 6 ? (abyv) abytVar.d : abyv.a).g.size() != 0) {
            Iterator<E> it = (abytVar.c == 6 ? (abyv) abytVar.d : abyv.a).g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                abyu abyuVar = (abyu) it.next();
                Iterator<E> it2 = abyuVar.b.iterator();
                while (it2.hasNext()) {
                    if (((Integer) it2.next()).intValue() == i2) {
                        abxn abxnVar = abyuVar.c;
                        if (abxnVar == null) {
                            abxnVar = abxn.a;
                        }
                        int iAz = a.az(abxnVar.b);
                        if (iAz == 0) {
                            iAz = 1;
                        }
                        int i3 = iAz - 2;
                        if (i3 == 2) {
                            abxn abxnVar2 = abyuVar.c;
                            if (abxnVar2 == null) {
                                abxnVar2 = abxn.a;
                            }
                            if (yfyVar.containsKey(abxnVar2.c)) {
                                abxn abxnVar3 = abyuVar.c;
                                if (abxnVar3 == null) {
                                    abxnVar3 = abxn.a;
                                }
                                this.a = ((Integer) yfyVar.get(abxnVar3.c)).intValue();
                            }
                        } else if (i3 == 3) {
                            this.a = i + 1;
                        }
                    }
                }
            }
        }
        return this.a;
    }

    public uk(int i) {
        this.a = i;
    }

    public uk(byte[] bArr) {
        this.a = 0;
    }

    public uk(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = -1;
    }

    public uk(char[] cArr) {
        this.a = 2;
    }

    public uk(short[] sArr) {
    }
}
