package androidx.compose.runtime;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.a.p;
import h.g.a.q;
import h.g.a.r;
import h.g.a.s;
import h.g.a.t;
import h.k;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class MovableContentKt {
    public static final int movableContentKey = 126665345;

    public static final p<Composer, Integer, ab> movableContentOf(final p<? super Composer, ? super Integer, ab> pVar) {
        final MovableContent movableContent = new MovableContent(ComposableLambdaKt.composableLambdaInstance(-703201834, true, new q() { // from class: androidx.compose.runtime.MovableContentKt$movableContentOf$movableContent$1
            public final void invoke(Void r3, Composer composer, int i2) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-703201834, i2, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:39)");
                }
                pVar.invoke(composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // h.g.a.q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((Void) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ab.f48028a;
            }
        }));
        return ComposableLambdaKt.composableLambdaInstance(-328108779, true, new p() { // from class: androidx.compose.runtime.MovableContentKt$$ExternalSyntheticLambda10
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return MovableContentKt.movableContentOf$lambda$0(movableContent, (Composer) obj, ((Integer) obj2).intValue());
            }
        });
    }

    static final ab movableContentOf$lambda$0(MovableContent movableContent, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-328108779, i2, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:40)");
            }
            composer.insertMovableContent(movableContent, null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab movableContentOf$lambda$1(MovableContent movableContent, Object obj, Composer composer, int i2) {
        if ((i2 & 6) == 0) {
            i2 |= true != ((i2 & 8) == 0 ? composer.changed(obj) : composer.changedInstance(obj)) ? 2 : 4;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1032736913, i2, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:63)");
            }
            composer.insertMovableContent(movableContent, obj);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab movableContentOf$lambda$2(r rVar, k kVar, Composer composer, int i2) {
        if ((i2 & 6) == 0) {
            i2 |= true != ((i2 & 8) == 0 ? composer.changed(kVar) : composer.changedInstance(kVar)) ? 2 : 4;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(561467799, i2, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:87)");
            }
            rVar.invoke(kVar.c(), kVar.d(), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab movableContentOf$lambda$3(MovableContent movableContent, Object obj, Object obj2, Composer composer, int i2) {
        int i3;
        if ((i2 & 6) == 0) {
            i3 = (true != ((i2 & 8) == 0 ? composer.changed(obj) : composer.changedInstance(obj)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != ((i2 & 64) == 0 ? composer.changed(obj2) : composer.changedInstance(obj2)) ? 16 : 32;
        }
        if (composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-525773808, i3, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:88)");
            }
            composer.insertMovableContent(movableContent, new k(obj, obj2));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab movableContentOf$lambda$4(s sVar, h.p pVar, Composer composer, int i2) {
        if ((i2 & 6) == 0) {
            i2 |= true != ((i2 & 8) == 0 ? composer.changed(pVar) : composer.changedInstance(pVar)) ? 2 : 4;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-846116651, i2, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:113)");
            }
            sVar.invoke(pVar.d(), pVar.e(), pVar.f(), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab movableContentOf$lambda$5(MovableContent movableContent, Object obj, Object obj2, Object obj3, Composer composer, int i2) {
        int i3;
        if ((i2 & 6) == 0) {
            i3 = (true != ((i2 & 8) == 0 ? composer.changed(obj) : composer.changedInstance(obj)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != ((i2 & 64) == 0 ? composer.changed(obj2) : composer.changedInstance(obj2)) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != ((i2 & 512) == 0 ? composer.changed(obj3) : composer.changedInstance(obj3)) ? 128 : 256;
        }
        if (composer.shouldExecute((i3 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1477386365, i3, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:115)");
            }
            composer.insertMovableContent(movableContent, new h.p(obj, obj2, obj3));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab movableContentOf$lambda$6(t tVar, Object[] objArr, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(743481490, i2, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:142)");
        }
        tVar.invoke(objArr[0], objArr[1], objArr[2], objArr[3], composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return ab.f48028a;
    }

    static final ab movableContentOf$lambda$7(MovableContent movableContent, Object obj, Object obj2, Object obj3, Object obj4, Composer composer, int i2) {
        int i3;
        if ((i2 & 6) == 0) {
            i3 = (true != ((i2 & 8) == 0 ? composer.changed(obj) : composer.changedInstance(obj)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != ((i2 & 64) == 0 ? composer.changed(obj2) : composer.changedInstance(obj2)) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != ((i2 & 512) == 0 ? composer.changed(obj3) : composer.changedInstance(obj3)) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != ((i2 & 4096) == 0 ? composer.changed(obj4) : composer.changedInstance(obj4)) ? 1024 : 2048;
        }
        if (composer.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1304803723, i3, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:146)");
            }
            composer.insertMovableContent(movableContent, new Object[]{obj, obj2, obj3, obj4});
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    public static final <R> q<R, Composer, Integer, ab> movableContentWithReceiverOf(final q<? super R, ? super Composer, ? super Integer, ab> qVar) {
        final MovableContent movableContent = new MovableContent(ComposableLambdaKt.composableLambdaInstance(668517896, true, new q() { // from class: androidx.compose.runtime.MovableContentKt$$ExternalSyntheticLambda4
            @Override // h.g.a.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return MovableContentKt.movableContentWithReceiverOf$lambda$0(qVar, obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }));
        return ComposableLambdaKt.composableLambdaInstance(-1655274392, true, new q() { // from class: androidx.compose.runtime.MovableContentKt$$ExternalSyntheticLambda5
            @Override // h.g.a.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return MovableContentKt.movableContentWithReceiverOf$lambda$1(movableContent, obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        });
    }

    static final ab movableContentWithReceiverOf$lambda$0(q qVar, Object obj, Composer composer, int i2) {
        if ((i2 & 6) == 0) {
            i2 |= true != ((i2 & 8) == 0 ? composer.changed(obj) : composer.changedInstance(obj)) ? 2 : 4;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(668517896, i2, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:171)");
            }
            qVar.invoke(obj, composer, Integer.valueOf(i2 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab movableContentWithReceiverOf$lambda$1(MovableContent movableContent, Object obj, Composer composer, int i2) {
        if ((i2 & 6) == 0) {
            i2 |= true != ((i2 & 8) == 0 ? composer.changed(obj) : composer.changedInstance(obj)) ? 2 : 4;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1655274392, i2, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:172)");
            }
            composer.insertMovableContent(movableContent, obj);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab movableContentWithReceiverOf$lambda$2(r rVar, k kVar, Composer composer, int i2) {
        if ((i2 & 6) == 0) {
            i2 |= true != ((i2 & 8) == 0 ? composer.changed(kVar) : composer.changedInstance(kVar)) ? 2 : 4;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-95003188, i2, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:196)");
            }
            rVar.invoke(kVar.c(), kVar.d(), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab movableContentWithReceiverOf$lambda$3(MovableContent movableContent, Object obj, Object obj2, Composer composer, int i2) {
        int i3;
        if ((i2 & 6) == 0) {
            i3 = (true != ((i2 & 8) == 0 ? composer.changed(obj) : composer.changedInstance(obj)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != ((i2 & 64) == 0 ? composer.changed(obj2) : composer.changedInstance(obj2)) ? 16 : 32;
        }
        if (composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1349529900, i3, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:197)");
            }
            composer.insertMovableContent(movableContent, new k(obj, obj2));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab movableContentWithReceiverOf$lambda$4(s sVar, h.p pVar, Composer composer, int i2) {
        if ((i2 & 6) == 0) {
            i2 |= true != ((i2 & 8) == 0 ? composer.changed(pVar) : composer.changedInstance(pVar)) ? 2 : 4;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-963896566, i2, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:221)");
            }
            sVar.invoke(pVar.d(), pVar.e(), pVar.f(), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab movableContentWithReceiverOf$lambda$5(MovableContent movableContent, Object obj, Object obj2, Object obj3, Composer composer, int i2) {
        int i3;
        if ((i2 & 6) == 0) {
            i3 = (true != ((i2 & 8) == 0 ? composer.changed(obj) : composer.changedInstance(obj)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != ((i2 & 64) == 0 ? composer.changed(obj2) : composer.changedInstance(obj2)) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != ((i2 & 512) == 0 ? composer.changed(obj3) : composer.changedInstance(obj3)) ? 128 : 256;
        }
        if (composer.shouldExecute((i3 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2121535275, i3, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:222)");
            }
            composer.insertMovableContent(movableContent, new h.p(obj, obj2, obj3));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab movableContentWithReceiverOf$lambda$6(t tVar, Object[] objArr, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-346590649, i2, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:248)");
        }
        tVar.invoke(objArr[0], objArr[1], objArr[2], objArr[3], composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return ab.f48028a;
    }

    static final ab movableContentWithReceiverOf$lambda$7(MovableContent movableContent, Object obj, Object obj2, Object obj3, Object obj4, Composer composer, int i2) {
        int i3;
        if ((i2 & 6) == 0) {
            i3 = (true != ((i2 & 8) == 0 ? composer.changed(obj) : composer.changedInstance(obj)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != ((i2 & 64) == 0 ? composer.changed(obj2) : composer.changedInstance(obj2)) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != ((i2 & 512) == 0 ? composer.changed(obj3) : composer.changedInstance(obj3)) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != ((i2 & 4096) == 0 ? composer.changed(obj4) : composer.changedInstance(obj4)) ? 1024 : 2048;
        }
        if (composer.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(572330192, i3, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:252)");
            }
            composer.insertMovableContent(movableContent, new Object[]{obj, obj2, obj3, obj4});
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    public static final <P> q<P, Composer, Integer, ab> movableContentOf(q<? super P, ? super Composer, ? super Integer, ab> qVar) {
        final MovableContent movableContent = new MovableContent(qVar);
        return ComposableLambdaKt.composableLambdaInstance(1032736913, true, new q() { // from class: androidx.compose.runtime.MovableContentKt$$ExternalSyntheticLambda13
            @Override // h.g.a.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return MovableContentKt.movableContentOf$lambda$1(movableContent, obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        });
    }

    public static final <R, P> r<R, P, Composer, Integer, ab> movableContentWithReceiverOf(final r<? super R, ? super P, ? super Composer, ? super Integer, ab> rVar) {
        final MovableContent movableContent = new MovableContent(ComposableLambdaKt.composableLambdaInstance(-95003188, true, new q() { // from class: androidx.compose.runtime.MovableContentKt$$ExternalSyntheticLambda6
            @Override // h.g.a.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return MovableContentKt.movableContentWithReceiverOf$lambda$2(rVar, (k) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }));
        return ComposableLambdaKt.composableLambdaInstance(1349529900, true, new r() { // from class: androidx.compose.runtime.MovableContentKt$$ExternalSyntheticLambda7
            @Override // h.g.a.r
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return MovableContentKt.movableContentWithReceiverOf$lambda$3(movableContent, obj, obj2, (Composer) obj3, ((Integer) obj4).intValue());
            }
        });
    }

    public static final <P1, P2> r<P1, P2, Composer, Integer, ab> movableContentOf(final r<? super P1, ? super P2, ? super Composer, ? super Integer, ab> rVar) {
        final MovableContent movableContent = new MovableContent(ComposableLambdaKt.composableLambdaInstance(561467799, true, new q() { // from class: androidx.compose.runtime.MovableContentKt$$ExternalSyntheticLambda14
            @Override // h.g.a.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return MovableContentKt.movableContentOf$lambda$2(rVar, (k) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }));
        return ComposableLambdaKt.composableLambdaInstance(-525773808, true, new r() { // from class: androidx.compose.runtime.MovableContentKt$$ExternalSyntheticLambda15
            @Override // h.g.a.r
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return MovableContentKt.movableContentOf$lambda$3(movableContent, obj, obj2, (Composer) obj3, ((Integer) obj4).intValue());
            }
        });
    }

    public static final <R, P1, P2> s<R, P1, P2, Composer, Integer, ab> movableContentWithReceiverOf(final s<? super R, ? super P1, ? super P2, ? super Composer, ? super Integer, ab> sVar) {
        final MovableContent movableContent = new MovableContent(ComposableLambdaKt.composableLambdaInstance(-963896566, true, new q() { // from class: androidx.compose.runtime.MovableContentKt$$ExternalSyntheticLambda8
            @Override // h.g.a.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return MovableContentKt.movableContentWithReceiverOf$lambda$4(sVar, (h.p) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }));
        return ComposableLambdaKt.composableLambdaInstance(2121535275, true, new s() { // from class: androidx.compose.runtime.MovableContentKt$$ExternalSyntheticLambda9
            @Override // h.g.a.s
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return MovableContentKt.movableContentWithReceiverOf$lambda$5(movableContent, obj, obj2, obj3, (Composer) obj4, ((Integer) obj5).intValue());
            }
        });
    }

    public static final <P1, P2, P3> s<P1, P2, P3, Composer, Integer, ab> movableContentOf(final s<? super P1, ? super P2, ? super P3, ? super Composer, ? super Integer, ab> sVar) {
        final MovableContent movableContent = new MovableContent(ComposableLambdaKt.composableLambdaInstance(-846116651, true, new q() { // from class: androidx.compose.runtime.MovableContentKt$$ExternalSyntheticLambda0
            @Override // h.g.a.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return MovableContentKt.movableContentOf$lambda$4(sVar, (h.p) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }));
        return ComposableLambdaKt.composableLambdaInstance(1477386365, true, new s() { // from class: androidx.compose.runtime.MovableContentKt$$ExternalSyntheticLambda1
            @Override // h.g.a.s
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return MovableContentKt.movableContentOf$lambda$5(movableContent, obj, obj2, obj3, (Composer) obj4, ((Integer) obj5).intValue());
            }
        });
    }

    public static final <R, P1, P2, P3> t<R, P1, P2, P3, Composer, Integer, ab> movableContentWithReceiverOf(final t<? super R, ? super P1, ? super P2, ? super P3, ? super Composer, ? super Integer, ab> tVar) {
        final MovableContent movableContent = new MovableContent(ComposableLambdaKt.composableLambdaInstance(-346590649, true, new q() { // from class: androidx.compose.runtime.MovableContentKt$$ExternalSyntheticLambda11
            @Override // h.g.a.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return MovableContentKt.movableContentWithReceiverOf$lambda$6(tVar, (Object[]) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }));
        return ComposableLambdaKt.composableLambdaInstance(572330192, true, new t() { // from class: androidx.compose.runtime.MovableContentKt$$ExternalSyntheticLambda12
            @Override // h.g.a.t
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                return MovableContentKt.movableContentWithReceiverOf$lambda$7(movableContent, obj, obj2, obj3, obj4, (Composer) obj5, ((Integer) obj6).intValue());
            }
        });
    }

    public static final <P1, P2, P3, P4> t<P1, P2, P3, P4, Composer, Integer, ab> movableContentOf(final t<? super P1, ? super P2, ? super P3, ? super P4, ? super Composer, ? super Integer, ab> tVar) {
        final MovableContent movableContent = new MovableContent(ComposableLambdaKt.composableLambdaInstance(743481490, true, new q() { // from class: androidx.compose.runtime.MovableContentKt$$ExternalSyntheticLambda2
            @Override // h.g.a.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return MovableContentKt.movableContentOf$lambda$6(tVar, (Object[]) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }));
        return ComposableLambdaKt.composableLambdaInstance(-1304803723, true, new t() { // from class: androidx.compose.runtime.MovableContentKt$$ExternalSyntheticLambda3
            @Override // h.g.a.t
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                return MovableContentKt.movableContentOf$lambda$7(movableContent, obj, obj2, obj3, obj4, (Composer) obj5, ((Integer) obj6).intValue());
            }
        });
    }
}
