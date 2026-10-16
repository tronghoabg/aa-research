package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import java.util.Objects;

/* loaded from: classes.dex */
public final class dir implements dhd {
    private final /* synthetic */ int c;
    public static final dir b = new dir(1);
    public static final dir a = new dir(0);

    private dir(int i) {
        this.c = i;
    }

    @Override // defpackage.dhd
    public final Typeface a(Context context, dhe dheVar) {
        if (this.c == 0) {
            Objects.toString(dheVar);
            throw new IllegalStateException("GoogleFont only support async loading: ".concat(String.valueOf(dheVar)));
        }
        Typeface typefaceH = null;
        dhq dhqVar = dheVar instanceof dhq ? (dhq) dheVar : null;
        if (dhqVar == null) {
            return null;
        }
        String str = dhs.a.f;
        String str2 = dhqVar.c;
        int i = dhqVar.e;
        die dieVar = dhqVar.d;
        if (affa.f(str2, str)) {
            typefaceH = dao.h(str, dieVar, i);
        } else {
            String str3 = dhs.b.f;
            if (affa.f(str2, str3)) {
                typefaceH = dao.h(str3, dieVar, i);
            } else {
                String str4 = dhs.c.f;
                if (affa.f(str2, str4)) {
                    typefaceH = dao.h(str4, dieVar, i);
                } else {
                    String str5 = dhs.d.f;
                    if (affa.f(str2, str5)) {
                        typefaceH = dao.h(str5, dieVar, i);
                    } else if (str2.length() != 0) {
                        boolean z = 1 == i;
                        Typeface typefaceH2 = dao.h(str2, dieVar, i);
                        if (!affa.f(typefaceH2, Typeface.create(Typeface.DEFAULT, dieVar.o, z)) && !affa.f(typefaceH2, dao.h(null, dieVar, i))) {
                            typefaceH = typefaceH2;
                        }
                    }
                }
            }
        }
        dic dicVar = dhqVar.b;
        int i2 = dij.a;
        return dij.a(typefaceH, dicVar, context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    @Override // defpackage.dhd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(android.content.Context r13, defpackage.dhe r14, defpackage.afck r15) {
        /*
            r12 = this;
            int r12 = r12.c
            if (r12 != 0) goto La9
            boolean r12 = r14 instanceof defpackage.dip
            if (r12 == 0) goto L9b
            r12 = r14
            dip r12 = (defpackage.dip) r12
            java.lang.String r0 = r12.c
            die r1 = r12.e
            int r2 = r1.o
            int r3 = r12.f
            r4 = 1
            boolean r5 = defpackage.a.Y(r3, r4)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "name="
            r6.<init>(r7)
            r6.append(r0)
            java.lang.String r0 = "&weight="
            r6.append(r0)
            r6.append(r2)
            java.lang.String r0 = "&italic="
            r6.append(r0)
            r6.append(r5)
            java.lang.String r0 = "&besteffort=true"
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            dio r2 = r12.d
            dic r12 = r12.b
            dwg r2 = new dwg
            java.lang.String r12 = defpackage.dap.u(r12, r13)
            r2.<init>(r0, r12)
            boolean r12 = defpackage.a.Y(r3, r4)
            die r0 = defpackage.die.n
            int r0 = r1.compareTo(r0)
            r1 = 0
            if (r0 < 0) goto L57
            r0 = r4
            goto L58
        L57:
            r0 = r1
        L58:
            if (r12 == 0) goto L5f
            if (r0 == 0) goto L5e
            r12 = 3
            goto L62
        L5e:
            r0 = r1
        L5f:
            if (r12 == 0) goto L64
            r12 = 2
        L62:
            r7 = r12
            goto L69
        L64:
            if (r0 == 0) goto L68
            r7 = r4
            goto L69
        L68:
            r7 = r1
        L69:
            aitg r12 = new aitg
            afck r15 = defpackage.affa.s(r15)
            r12.<init>(r15, r4)
            r12.z()
            diq r11 = new diq
            r11.<init>(r12, r14, r13)
            android.os.Looper r14 = android.os.Looper.myLooper()
            if (r14 != 0) goto L84
            android.os.Looper r14 = android.os.Looper.getMainLooper()
        L84:
            android.os.Handler r10 = defpackage.hg$$ExternalSyntheticApiModelOutline0.m(r14)
            java.lang.Object[] r14 = new java.lang.Object[r4]
            r14[r1] = r2
            java.util.List r6 = defpackage.rz.m(r14)
            r8 = 0
            r9 = 0
            r5 = r13
            defpackage.dun.d(r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r12 = r12.k()
            return r12
        L9b:
            java.lang.String r12 = "Only GoogleFontImpl supported (actual "
            java.lang.String r13 = ")"
            java.lang.String r12 = defpackage.a.bm(r14, r12, r13)
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>(r12)
            throw r13
        La9:
            java.lang.UnsupportedOperationException r12 = new java.lang.UnsupportedOperationException
            java.lang.String r13 = "All preloaded fonts are optional local."
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dir.b(android.content.Context, dhe, afck):java.lang.Object");
    }
}
