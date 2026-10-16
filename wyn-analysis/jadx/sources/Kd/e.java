package Kd;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class e extends Wd.c {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f6745f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i5, int i10) {
        super(i5);
        this.f6745f = i10;
    }

    @Override // Wd.c
    public Object a(Object obj) {
        switch (this.f6745f) {
            case 0:
                c cVar = (c) obj;
                ArrayList arrayList = cVar.f6740a;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    f.f6746a.S((int[]) it.next());
                }
                arrayList.clear();
                return cVar;
            case 1:
                int[] iArr = (int[]) obj;
                ff.m.p0(-1, iArr);
                return iArr;
            default:
                return obj;
        }
    }

    @Override // Wd.c
    public final Object b() {
        switch (this.f6745f) {
            case 0:
                c cVar = new c();
                cVar.f6740a = new ArrayList();
                return cVar;
            case 1:
                int[] iArr = new int[768];
                for (int i5 = 0; i5 < 768; i5++) {
                    iArr[i5] = -1;
                }
                return iArr;
            case 2:
                return new char[2048];
            default:
                return new byte[4096];
        }
    }
}
