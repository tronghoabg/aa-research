package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

/* loaded from: classes.dex */
public final class dep implements dff {
    public final dfw a;
    public final dkh b;
    public final CharSequence c;
    public final dgd d;
    public final int e;
    public final wci f;
    public nfh g;
    private final String h;
    private final List i;
    private final List j;
    private final dlg k;
    private int l;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x026e A[PHI: r13
  0x026e: PHI (r13v20 long) = (r13v3 long), (r13v4 long) binds: [B:104:0x026c, B:108:0x0274] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x029a A[PHI: r15
  0x029a: PHI (r15v2 boolean) = (r15v1 boolean), (r15v1 boolean), (r15v9 boolean) binds: [B:120:0x0291, B:121:0x0293, B:124:0x0299] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0741  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0764  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x07c8  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x07d7  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x07f8  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x081f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0048  */
    /* JADX WARN: Type inference failed for: r1v22, types: [android.text.Spannable] */
    /* JADX WARN: Type inference failed for: r1v49, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.CharSequence, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dep(java.lang.String r49, defpackage.dfw r50, java.util.List r51, java.util.List r52, defpackage.wci r53, defpackage.dlg r54) {
        /*
            Method dump skipped, instructions count: 2196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dep.<init>(java.lang.String, dfw, java.util.List, java.util.List, wci, dlg):void");
    }

    @Override // defpackage.dff
    public final float a() {
        return this.d.b();
    }

    @Override // defpackage.dff
    public final float b() {
        float f;
        dgd dgdVar = this.d;
        if (!Float.isNaN(dgdVar.c)) {
            return dgdVar.c;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(dgdVar.b.getTextLocale());
        CharSequence charSequence = dgdVar.a;
        lineInstance.setText(new dga(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, dge.a);
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new afha(i, next));
            } else {
                afha afhaVar = (afha) priorityQueue.peek();
                if (afhaVar != null) {
                    if (afhaVar.b - afhaVar.a < next - i) {
                        priorityQueue.poll();
                        priorityQueue.add(new afha(i, next));
                    }
                }
            }
            i = next;
        }
        if (priorityQueue.isEmpty()) {
            f = BitmapDescriptorFactory.HUE_RED;
        } else {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            afha afhaVar2 = (afha) it.next();
            float fA = dgdVar.a(afhaVar2.a, afhaVar2.b);
            while (it.hasNext()) {
                afha afhaVar3 = (afha) it.next();
                fA = Math.max(fA, dgdVar.a(afhaVar3.a, afhaVar3.b));
            }
            f = fA;
        }
        dgdVar.c = f;
        return f;
    }

    @Override // defpackage.dff
    public final boolean c() {
        nfh nfhVar = this.g;
        if (nfhVar != null && nfhVar.t()) {
            return true;
        }
        dfl dflVar = this.a.d;
        int i = dkk.a;
        emr emrVar = emr.b;
        Boolean bool = false;
        bool.getClass();
        return false;
    }
}
