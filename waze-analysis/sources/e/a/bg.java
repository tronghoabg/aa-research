package e.a;

import j$.util.DesugarCollections;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bg {

    /* renamed from: a, reason: collision with root package name */
    private static final Object[][] f46481a = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);

    /* renamed from: b, reason: collision with root package name */
    private List f46482b;

    /* renamed from: c, reason: collision with root package name */
    private final c f46483c = c.f46513a;

    /* renamed from: d, reason: collision with root package name */
    private Object[][] f46484d = f46481a;

    bg() {
    }

    public final bi a() {
        return new bi(this.f46482b, this.f46483c, this.f46484d);
    }

    public final void b(bh bhVar, Object obj) {
        int length = 0;
        while (true) {
            Object[][] objArr = this.f46484d;
            if (length >= objArr.length) {
                length = -1;
                break;
            } else if (bhVar.equals(objArr[length][0])) {
                break;
            } else {
                length++;
            }
        }
        if (length == -1) {
            Object[][] objArr2 = this.f46484d;
            int length2 = objArr2.length;
            Object[][] objArr3 = (Object[][]) Array.newInstance((Class<?>) Object.class, length2 + 1, 2);
            System.arraycopy(objArr2, 0, objArr3, 0, length2);
            this.f46484d = objArr3;
            length = objArr3.length - 1;
        }
        this.f46484d[length] = new Object[]{bhVar, obj};
    }

    public final void c(List list) {
        com.google.d.b.an.m(!list.isEmpty(), "addrs is empty");
        this.f46482b = DesugarCollections.unmodifiableList(new ArrayList(list));
    }
}
