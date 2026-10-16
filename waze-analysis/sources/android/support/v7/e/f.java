package android.support.v7.e;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final List f649a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f650b;

    /* renamed from: c, reason: collision with root package name */
    private final int[] f651c;

    /* renamed from: d, reason: collision with root package name */
    private final d f652d;

    /* renamed from: e, reason: collision with root package name */
    private final int f653e;

    /* renamed from: f, reason: collision with root package name */
    private final int f654f;

    f(d dVar, List list, int[] iArr, int[] iArr2) {
        this.f649a = list;
        this.f650b = iArr;
        this.f651c = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.f652d = dVar;
        int oldListSize = dVar.getOldListSize();
        this.f653e = oldListSize;
        int newListSize = dVar.getNewListSize();
        this.f654f = newListSize;
        e eVar = list.isEmpty() ? null : (e) list.get(0);
        if (eVar == null || eVar.f646a != 0 || eVar.f647b != 0) {
            list.add(0, new e(0, 0, 0));
        }
        list.add(new e(oldListSize, newListSize, 0));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e eVar2 = (e) it.next();
            for (int i2 = 0; i2 < eVar2.f648c; i2++) {
                int i3 = eVar2.f646a + i2;
                int i4 = eVar2.f647b + i2;
                int i5 = true != this.f652d.areContentsTheSame(i3, i4) ? 2 : 1;
                this.f650b[i3] = (i4 << 4) | i5;
                this.f651c[i4] = (i3 << 4) | i5;
            }
        }
        int iA = 0;
        for (e eVar3 : this.f649a) {
            while (iA < eVar3.f646a) {
                if (this.f650b[iA] == 0) {
                    int size = this.f649a.size();
                    int i6 = 0;
                    int iB = 0;
                    while (true) {
                        if (i6 < size) {
                            e eVar4 = (e) this.f649a.get(i6);
                            while (iB < eVar4.f647b) {
                                if (this.f651c[iB] == 0 && this.f652d.areItemsTheSame(iA, iB)) {
                                    int i7 = true != this.f652d.areContentsTheSame(iA, iB) ? 4 : 8;
                                    this.f650b[iA] = (iB << 4) | i7;
                                    this.f651c[iB] = i7 | (iA << 4);
                                } else {
                                    iB++;
                                }
                            }
                            iB = eVar4.b();
                            i6++;
                        }
                    }
                }
                iA++;
            }
            iA = eVar3.a();
        }
    }

    private static g b(Collection collection, int i2, boolean z) {
        g gVar;
        Iterator it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                gVar = null;
                break;
            }
            gVar = (g) it.next();
            if (gVar.f655a == i2 && gVar.f657c == z) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            g gVar2 = (g) it.next();
            if (z) {
                gVar2.f656b--;
            } else {
                gVar2.f656b++;
            }
        }
        return gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.support.v7.e.k r18) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.e.f.a(android.support.v7.e.k):void");
    }
}
