package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

/* loaded from: classes2.dex */
final class fgg implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    final fgc a;
    final ViewGroup b;

    public fgg(fgc fgcVar, ViewGroup viewGroup) {
        this.a = fgcVar;
        this.b = viewGroup;
    }

    private final void a() {
        ViewGroup viewGroup = this.b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01d9 A[EDGE_INSN: B:158:0x01d9->B:88:0x01d9 BREAK  A[LOOP:1: B:18:0x0080->B:87:0x01d3], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02a4 A[EDGE_INSN: B:200:0x02a4->B:134:0x02a4 BREAK  A[LOOP:8: B:103:0x0228->B:214:0x0228], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01fe  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onPreDraw() {
        /*
            Method dump skipped, instructions count: 792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgg.onPreDraw():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
        ArrayList arrayList = fgh.a;
        ViewGroup viewGroup = this.b;
        arrayList.remove(viewGroup);
        ArrayList arrayList2 = (ArrayList) fgh.a().get(viewGroup);
        if (arrayList2 != null && arrayList2.size() > 0) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                ((fgc) arrayList2.get(i)).x(viewGroup);
            }
        }
        this.a.r(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
