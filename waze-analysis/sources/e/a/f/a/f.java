package e.a.f.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final String[] f47569a;

    /* synthetic */ f(e eVar) {
        this.f47569a = (String[]) eVar.f47568a.toArray(new String[eVar.f47568a.size()]);
    }

    public final int a() {
        return this.f47569a.length >> 1;
    }

    public final String b(int i2) {
        int i3 = i2 + i2;
        if (i3 < 0) {
            return null;
        }
        String[] strArr = this.f47569a;
        if (i3 >= strArr.length) {
            return null;
        }
        return strArr[i3];
    }

    public final String c(int i2) {
        int i3 = i2 + i2 + 1;
        if (i3 < 0) {
            return null;
        }
        String[] strArr = this.f47569a;
        if (i3 >= strArr.length) {
            return null;
        }
        return strArr[i3];
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int iA = a();
        for (int i2 = 0; i2 < iA; i2++) {
            sb.append(b(i2));
            sb.append(": ");
            sb.append(c(i2));
            sb.append("\n");
        }
        return sb.toString();
    }
}
