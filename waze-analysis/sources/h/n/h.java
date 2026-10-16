package h.n;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h extends h.a.g {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ j f48242a;

    h(j jVar) {
        this.f48242a = jVar;
    }

    @Override // h.a.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof String) {
            return super.contains((String) obj);
        }
        return false;
    }

    @Override // h.a.g, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        String strGroup = this.f48242a.g().group(i2);
        return strGroup == null ? "" : strGroup;
    }

    @Override // h.a.g, h.a.a
    public final int getSize() {
        return this.f48242a.g().groupCount() + 1;
    }

    @Override // h.a.g, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof String) {
            return super.indexOf((String) obj);
        }
        return -1;
    }

    @Override // h.a.g, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof String) {
            return super.lastIndexOf((String) obj);
        }
        return -1;
    }
}
