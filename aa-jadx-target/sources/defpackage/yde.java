package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class yde extends defpackage.ycs implements defpackage.ynk {
    private static final long serialVersionUID = 7431625294878419160L;

    public yde(java.util.Map map) {
        super(map);
    }

    @Override // defpackage.ynk
    public final java.util.Set E(java.lang.Object obj) {
        return (java.util.Set) super.k(obj);
    }

    @Override // defpackage.ycs
    public /* bridge */ /* synthetic */ java.util.Collection a() {
        throw null;
    }

    @Override // defpackage.ycs
    public final /* synthetic */ java.util.Collection b() {
        return java.util.Collections.EMPTY_SET;
    }

    @Override // defpackage.ycs
    public java.util.Collection d(java.util.Collection collection) {
        return j$.util.DesugarCollections.unmodifiableSet((java.util.Set) collection);
    }

    @Override // defpackage.ycs
    public java.util.Collection e(java.lang.Object obj, java.util.Collection collection) {
        return new defpackage.ycq(this, obj, (java.util.Set) collection);
    }

    @Override // defpackage.yda, defpackage.ylx
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final java.util.Set u() {
        return (java.util.Set) super.u();
    }

    @Override // defpackage.ycs, defpackage.ylx
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final java.util.Set c(java.lang.Object obj) {
        return (java.util.Set) super.c(obj);
    }
}
