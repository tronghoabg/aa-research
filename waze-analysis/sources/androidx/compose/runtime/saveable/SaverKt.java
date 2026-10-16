package androidx.compose.runtime.saveable;

import h.g.a.l;
import h.g.a.p;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SaverKt {
    private static final Saver<Object, Object> AutoSaver = Saver(new p() { // from class: androidx.compose.runtime.saveable.SaverKt$$ExternalSyntheticLambda0
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            int i2 = SaverKt.f1669a;
            return obj2;
        }
    }, new l() { // from class: androidx.compose.runtime.saveable.SaverKt$$ExternalSyntheticLambda1
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            int i2 = SaverKt.f1669a;
            return obj;
        }
    });

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1669a = 0;

    public static final <Original, Saveable> Saver<Original, Saveable> Saver(final p<? super SaverScope, ? super Original, ? extends Saveable> pVar, final l<? super Saveable, ? extends Original> lVar) {
        return new Saver() { // from class: androidx.compose.runtime.saveable.SaverKt.Saver.1
            @Override // androidx.compose.runtime.saveable.Saver
            public Object restore(Object obj) {
                return lVar.invoke(obj);
            }

            @Override // androidx.compose.runtime.saveable.Saver
            public Object save(SaverScope saverScope, Object obj) {
                return pVar.invoke(saverScope, obj);
            }
        };
    }

    public static final <T> Saver<T, Object> autoSaver() {
        Saver<T, Object> saver = (Saver<T, Object>) AutoSaver;
        x.d(saver, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.SaverKt.autoSaver, kotlin.Any>");
        return saver;
    }

    static final Object AutoSaver$lambda$1(Object obj) {
        return obj;
    }

    static final Object AutoSaver$lambda$0(SaverScope saverScope, Object obj) {
        return obj;
    }
}
