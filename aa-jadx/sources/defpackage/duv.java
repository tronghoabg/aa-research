package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class duv implements java.lang.Iterable {
    public final android.content.Context a;
    private final java.util.ArrayList b = new java.util.ArrayList();

    public duv(android.content.Context context) {
        this.a = context;
    }

    public final void a(android.content.Intent intent) {
        this.b.add(intent);
    }

    public final void b(android.content.ComponentName componentName) {
        java.util.ArrayList arrayList = this.b;
        int size = arrayList.size();
        try {
            android.content.Context context = this.a;
            for (android.content.Intent intentK = defpackage.dlv.k(context, componentName); intentK != null; intentK = defpackage.dlv.k(context, intentK.getComponent())) {
                arrayList.add(size, intentK);
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            android.util.Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    public final void c() {
        java.util.ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            throw new java.lang.IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        android.content.Intent[] intentArr = (android.content.Intent[]) arrayList.toArray(new android.content.Intent[0]);
        intentArr[0] = new android.content.Intent(intentArr[0]).addFlags(268484608);
        this.a.startActivities(intentArr, null);
    }

    @Override // java.lang.Iterable
    @java.lang.Deprecated
    public final java.util.Iterator<android.content.Intent> iterator() {
        return this.b.iterator();
    }
}
