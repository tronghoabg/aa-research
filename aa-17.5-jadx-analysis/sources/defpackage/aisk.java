package defpackage;

/* loaded from: classes3.dex */
public final class aisk extends afar {
    final /* synthetic */ aism a;

    public aisk(aism aismVar) {
        this.a = aismVar;
    }

    @Override // defpackage.afam
    public final int a() {
        return this.a.a.groupCount() + 1;
    }

    @Override // defpackage.afam, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof String) {
            return super.contains((String) obj);
        }
        return false;
    }

    @Override // defpackage.afar, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        String strGroup = this.a.a.group(i);
        return strGroup == null ? "" : strGroup;
    }

    @Override // defpackage.afar, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof String) {
            return super.indexOf((String) obj);
        }
        return -1;
    }

    @Override // defpackage.afar, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof String) {
            return super.lastIndexOf((String) obj);
        }
        return -1;
    }
}
