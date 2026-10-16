package j$.time.zone;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements java.security.PrivilegedAction {
    public final /* synthetic */ java.util.ArrayList a;

    public f(java.util.ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // java.security.PrivilegedAction
    public final java.lang.Object run() {
        java.lang.String property = java.lang.System.getProperty("java.time.zone.DefaultZoneRulesProvider");
        if (property == null) {
            j$.time.zone.g.b(new j$.time.zone.g());
            return null;
        }
        try {
            j$.time.zone.g gVar = (j$.time.zone.g) j$.time.zone.g.class.cast(java.lang.Class.forName(property, true, j$.time.zone.g.class.getClassLoader()).newInstance());
            j$.time.zone.g.b(gVar);
            this.a.add(gVar);
            return null;
        } catch (java.lang.Exception e) {
            throw new java.lang.Error(e);
        }
    }
}
