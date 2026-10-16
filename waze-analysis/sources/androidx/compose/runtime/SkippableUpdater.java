package androidx.compose.runtime;

import h.ab;
import h.g.a;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class SkippableUpdater<T> {
    private final Composer composer;

    private /* synthetic */ SkippableUpdater(Composer composer) {
        this.composer = composer;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SkippableUpdater m7316boximpl(Composer composer) {
        return new SkippableUpdater(composer);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7318equalsimpl(Composer composer, Object obj) {
        return (obj instanceof SkippableUpdater) && x.n(composer, ((SkippableUpdater) obj).m7323unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7319equalsimpl0(Composer composer, Composer composer2) {
        return x.n(composer, composer2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7320hashCodeimpl(Composer composer) {
        return composer.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7321toStringimpl(Composer composer) {
        return "SkippableUpdater(composer=" + composer + ')';
    }

    /* renamed from: update-impl, reason: not valid java name */
    public static final void m7322updateimpl(Composer composer, l<? super Updater<T>, ab> lVar) {
        composer.startReplaceableGroup(509942095);
        lVar.invoke(Updater.m7342boximpl(composer));
        composer.endReplaceableGroup();
    }

    public boolean equals(Object obj) {
        return m7318equalsimpl(this.composer, obj);
    }

    public int hashCode() {
        return m7320hashCodeimpl(this.composer);
    }

    public String toString() {
        return m7321toStringimpl(this.composer);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Composer m7323unboximpl() {
        return this.composer;
    }

    public static /* synthetic */ void getComposer$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> Composer m7317constructorimpl(Composer composer) {
        return composer;
    }
}
