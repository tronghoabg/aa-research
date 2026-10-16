package androidx.compose.runtime;

import h.ab;
import h.g.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class Updater<T> {
    private final Composer composer;

    private /* synthetic */ Updater(Composer composer) {
        this.composer = composer;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Updater m7342boximpl(Composer composer) {
        return new Updater(composer);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7344equalsimpl(Composer composer, Object obj) {
        return (obj instanceof Updater) && x.n(composer, ((Updater) obj).m7355unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7345equalsimpl0(Composer composer, Composer composer2) {
        return x.n(composer, composer2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7346hashCodeimpl(Composer composer) {
        return composer.hashCode();
    }

    /* renamed from: init-impl, reason: not valid java name */
    public static final void m7347initimpl(Composer composer, final l<? super T, ab> lVar) {
        if (composer.getInserting()) {
            composer.apply(ab.f48028a, new p() { // from class: androidx.compose.runtime.Updater$$ExternalSyntheticLambda0
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return Updater.init_impl$lambda$0(lVar, obj, (ab) obj2);
                }
            });
        }
    }

    static final ab init_impl$lambda$0(l lVar, Object obj, ab abVar) {
        lVar.invoke(obj);
        return ab.f48028a;
    }

    /* renamed from: reconcile-impl, reason: not valid java name */
    public static final void m7349reconcileimpl(Composer composer, final l<? super T, ab> lVar) {
        composer.apply(ab.f48028a, new p() { // from class: androidx.compose.runtime.Updater$$ExternalSyntheticLambda1
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return Updater.reconcile_impl$lambda$0(lVar, obj, (ab) obj2);
            }
        });
    }

    static final ab reconcile_impl$lambda$0(l lVar, Object obj, ab abVar) {
        lVar.invoke(obj);
        return ab.f48028a;
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final /* synthetic */ void m7350setimpl(Composer composer, int i2, p<? super T, ? super Integer, ab> pVar) {
        if (composer.getInserting() || !x.n(composer.rememberedValue(), Integer.valueOf(i2))) {
            Integer numValueOf = Integer.valueOf(i2);
            composer.updateRememberedValue(numValueOf);
            composer.apply(numValueOf, pVar);
        }
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7352toStringimpl(Composer composer) {
        return "Updater(composer=" + composer + ')';
    }

    /* renamed from: update-impl, reason: not valid java name */
    public static final /* synthetic */ void m7353updateimpl(Composer composer, int i2, p<? super T, ? super Integer, ab> pVar) {
        boolean inserting = composer.getInserting();
        if (inserting || !x.n(composer.rememberedValue(), Integer.valueOf(i2))) {
            Integer numValueOf = Integer.valueOf(i2);
            composer.updateRememberedValue(numValueOf);
            if (inserting) {
                return;
            }
            composer.apply(numValueOf, pVar);
        }
    }

    public boolean equals(Object obj) {
        return m7344equalsimpl(this.composer, obj);
    }

    public int hashCode() {
        return m7346hashCodeimpl(this.composer);
    }

    public String toString() {
        return m7352toStringimpl(this.composer);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Composer m7355unboximpl() {
        return this.composer;
    }

    public static /* synthetic */ void getComposer$annotations() {
    }

    /* renamed from: init-impl, reason: not valid java name */
    public static final <V> void m7348initimpl(Composer composer, V v, p<? super T, ? super V, ab> pVar) {
        if (composer.getInserting()) {
            composer.apply(v, pVar);
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> Composer m7343constructorimpl(Composer composer) {
        return composer;
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final <V> void m7351setimpl(Composer composer, V v, p<? super T, ? super V, ab> pVar) {
        if (composer.getInserting() || !x.n(composer.rememberedValue(), v)) {
            composer.updateRememberedValue(v);
            composer.apply(v, pVar);
        }
    }

    /* renamed from: update-impl, reason: not valid java name */
    public static final <V> void m7354updateimpl(Composer composer, V v, p<? super T, ? super V, ab> pVar) {
        boolean inserting = composer.getInserting();
        if (inserting || !x.n(composer.rememberedValue(), v)) {
            composer.updateRememberedValue(v);
            if (inserting) {
                return;
            }
            composer.apply(v, pVar);
        }
    }
}
